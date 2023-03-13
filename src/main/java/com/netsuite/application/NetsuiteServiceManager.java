package com.netsuite.application;

import com.netsuite.webservices.platform.core_2022_1.DataCenterUrls;
import com.netsuite.webservices.platform.core_2022_1.TokenPassport;
import com.netsuite.webservices.platform.core_2022_1.TokenPassportSignature;
import com.netsuite.webservices.platform.core_2022_1.types.SignatureAlgorithm;
import com.netsuite.webservices.platform_2022_1.NetSuiteBindingStub;
import com.netsuite.webservices.platform_2022_1.NetSuitePortType;
import com.netsuite.webservices.platform_2022_1.NetSuiteServiceLocator;
import io.github.cdimascio.dotenv.Dotenv;
import org.apache.commons.lang3.RandomStringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class NetsuiteServiceManager {
    protected static Map<String, Dotenv> environments = new HashMap<>();
    protected static Map<String, NetSuitePortType> port = new HashMap<>();

    protected NetSuiteServiceLocator service;


    /**
     * Initializes the netsuite session, loading default .env
     *
     * @throws Exception
     */
    public NetsuiteServiceManager() throws Exception {
        Dotenv env = Dotenv.load();
        String envName = env.get("NETSUITE_ACCOUNT_ID");
        environments.put(envName, Dotenv.load());
        this.setSession(envName);
    }

    /**
     * Initializes the netsuite session
     * <p>
     * See https://github.com/cdimascio/dotenv-java for documentation
     * on configuring a custom environment file.
     *
     * @throws Exception
     */
    public NetsuiteServiceManager(Dotenv environments) throws Exception {
        String envName = environments.get("NETSUITE_ACCOUNT_ID");
        NetsuiteServiceManager.environments.put(envName, environments);
        this.setSession(envName);
    }

    protected static String getFirstEnv() {
        return environments.keySet().iterator().next();
    }

    public static Map<String, Dotenv> getEnvironments() {
        return environments;
    }

    public final static Dotenv getEnvironment() {
        return getEnvironment(getFirstEnv());
    }

    public final static Dotenv getEnvironment(String key) {
        return environments.get(key);
    }

    public final static NetSuitePortType getInstance() {
        return NetsuiteServiceManager.getInstance(getFirstEnv());
    }

    public static NetSuitePortType getInstance(String envName) throws RuntimeException {
        return getService(envName);
    }

    public static NetSuitePortType getService() {
        return port.get(getFirstEnv());
    }

    public static NetSuitePortType getService(String envName) {
        return port.get(envName);
    }

    protected void setSession(String envName) throws Exception {
        Dotenv env = environments.get(envName);
        service = new NetSuiteServiceLocator();
        service.setMaintainSession(true);
        NetSuitePortType port = createPort(env.get("NETSUITE_ACCOUNT_ID"), new URL(service.getNetSuitePortAddress()));

        // Setting the token on the port
        NetSuiteBindingStub stub = ((NetSuiteBindingStub) port);
        stub.clearHeaders();
        stub.setHeader(
                String.format("urn:messages_%s.platform.webservices.netsuite.com", env.get("NETSUITE_VERSION", "2022_1")),
                "tokenPassport",
                createPassport(env)
        );

        NetsuiteServiceManager.port.put(env.get("NETSUITE_ACCOUNT_ID"), port);
    }

    protected TokenPassport createPassport(Dotenv environment) throws Exception {

        String nonce = RandomStringUtils.randomAlphanumeric(20);
        long timeStamp = System.currentTimeMillis() / 1000L;

        String signature = computeSignature(
                environment.get("NETSUITE_ACCOUNT_ID"),
                environment.get("NETSUITE_CONSUMER_KEY"),
                environment.get("NETSUITE_CONSUMER_SECRET"),
                environment.get("NETSUITE_TOKEN"),
                environment.get("NETSUITE_TOKEN_SECRET"),
                nonce,
                timeStamp);


        TokenPassportSignature sig = new TokenPassportSignature(signature);
        sig.setAlgorithm(SignatureAlgorithm._HMAC_SHA256);

        return new TokenPassport(
                environment.get("NETSUITE_ACCOUNT_ID"),
                environment.get("NETSUITE_CONSUMER_KEY"),
                environment.get("NETSUITE_TOKEN"),
                nonce, // nonce
                timeStamp, // timestamp
                sig
        );
    }

    protected NetSuitePortType createPort(String account, URL defaultWsDomainURL) {
        try {
            NetSuitePortType _port = service.getNetSuitePort(defaultWsDomainURL);
            // Get the webservices domain for your account
            DataCenterUrls urls = _port.getDataCenterUrls(account).getDataCenterUrls();
            String wsDomain = urls.getWebservicesDomain();
            // Return URL appropriate for the specific account
            return service.getNetSuitePort(new URL(wsDomain.concat(defaultWsDomainURL.getPath())));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected String computeShaHash(String baseString, String key, String algorithm) throws Exception {

        byte[] bytes = key.getBytes();
        SecretKeySpec mySigningKey = new SecretKeySpec(bytes, algorithm);

        Mac messageAuthenticationCode = Mac.getInstance(algorithm);

        messageAuthenticationCode.init(mySigningKey);

        byte[] hash = messageAuthenticationCode.doFinal(baseString.getBytes());

        return new String(java.util.Base64.getEncoder().encode(hash));
    }

    public String computeSignature(
            String account,
            String consumerKey,
            String consumerSecret,
            String token,
            String tokenSecret,
            String nonce,
            Long timeStamp
    ) throws Exception {
        String baseString = account + "&" + consumerKey + "&" + token + "&" + nonce + "&" + timeStamp;

        String key = consumerSecret + '&' + tokenSecret;

        return computeShaHash(baseString, key, "HmacSHA256");
    }
}
