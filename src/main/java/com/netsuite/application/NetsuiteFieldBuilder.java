package com.netsuite.application;

import com.netsuite.webservices.platform.core_2022_1.Record;
import com.netsuite.webservices.documents.filecabinet_2022_1.File;
import com.netsuite.webservices.documents.filecabinet_2022_1.types.FileAttachFrom;
import com.netsuite.webservices.documents.filecabinet_2022_1.types.MediaType;
import com.netsuite.webservices.platform.common_2022_1.types.Country;
import com.netsuite.webservices.platform.core_2022_1.*;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NetsuiteFieldBuilder {
    public static Map<String, String> countryMap;

    public final static Record[] createRecordList(Record... records) {
        return records;
    }

    public final static StringCustomFieldRef createField(String scriptId, String value) {
        StringCustomFieldRef obj = new StringCustomFieldRef();
        obj.setScriptId(scriptId);
        obj.setValue(value);
        return obj;
    }

    public final static LongCustomFieldRef createField(String scriptId, long value) {
        LongCustomFieldRef obj = new LongCustomFieldRef();
        obj.setScriptId(scriptId);
        obj.setValue(value);
        return obj;
    }

    public final static DoubleCustomFieldRef createField(String scriptId, double value) {
        DoubleCustomFieldRef obj = new DoubleCustomFieldRef();
        obj.setScriptId(scriptId);
        obj.setValue(value);
        return obj;
    }

    public final static BooleanCustomFieldRef createField(String scriptId, boolean value) {
        BooleanCustomFieldRef obj = new BooleanCustomFieldRef();
        obj.setScriptId(scriptId);
        obj.setValue(value);
        return obj;
    }

    public final static DateCustomFieldRef createField(String scriptId, Calendar calendar) {
        DateCustomFieldRef obj = new DateCustomFieldRef();
        obj.setScriptId(scriptId);
        obj.setValue(calendar);
        return obj;
    }

    public final static SelectCustomFieldRef createField(String id, ListOrRecordRef value) {
        SelectCustomFieldRef obj = new SelectCustomFieldRef();
        obj.setScriptId(id);
        obj.setValue(value);
        return obj;
    }

    public final static ListOrRecordRef createListOrRecord(String internalId, String typeId) {
        ListOrRecordRef obj = new ListOrRecordRef();
        obj.setInternalId(internalId);
        obj.setTypeId(typeId);
        return obj;
    }

    public final static RecordRef createRecordRef(String internalId, String name) {
        RecordRef obj = new RecordRef();
        obj.setInternalId(internalId);
        obj.setName(name);
        return obj;
    }

    public final static File createImage(RecordRef folder, String name, byte[] content, boolean isImage) throws IOException {
        File file = new File();

        file.setFolder(folder);
        file.setContent(content);
        file.setAttachFrom(FileAttachFrom._computer);
        file.setName(name);

        if (isImage) {
            InputStream is = new BufferedInputStream(new ByteArrayInputStream(content));
            String mimeType = URLConnection.guessContentTypeFromStream(is);

            switch (mimeType) {
                case "image/jpeg":
                case "image/jpg":
                    file.setFileType(MediaType._JPGIMAGE);
                    file.setMediaTypeName("JPEG Image");
                    break;
                case "image/png":
                    file.setFileType(MediaType._PNGIMAGE);
                    file.setMediaTypeName("PNG Image");
                    break;
                case "image/gif":
                    file.setFileType(MediaType._GIFIMAGE);
                    file.setMediaTypeName("GIF Image");
                    break;
                case "image/bmp":
                    file.setFileType(MediaType._BMPIMAGE);
                    file.setMediaTypeName("BMP Image");
                    break;
            }

            if (file.getFileType() == null) {
                throw new IOException("Unable set file type, unsupported format.");
            }
        }

        return file;
    }

    public final static Country createCountryFromIso(String isoCode) {
        if (countryMap == null) {
            countryMap = mapCountries();
        }

        return Country.fromString(countryMap.get(isoCode));
    }

    protected final static Map<String, String> mapCountries() {
        return Stream.of(new String[][]{
                {"AF", "_afghanistan"},
                {"AX", "_alandIslands"},
                {"AL", "_albania"},
                {"DZ", "_algeria"},
                {"AS", "_americanSamoa"},
                {"AD", "_andorra"},
                {"AO", "_angola"},
                {"AI", "_anguilla"},
                {"AQ", "_antarctica"},
                {"AG", "_antiguaAndBarbuda"},
                {"AR", "_argentina"},
                {"AM", "_armenia"},
                {"AW", "_aruba"},
                {"AU", "_australia"},
                {"AT", "_austria"},
                {"AZ", "_azerbaijan"},
                {"BS", "_bahamas"},
                {"BH", "_bahrain"},
                {"BD", "_bangladesh"},
                {"BB", "_barbados"},
                {"BY", "_belarus"},
                {"BE", "_belgium"},
                {"BZ", "_belize"},
                {"BJ", "_benin"},
                {"BM", "_bermuda"},
                {"BT", "_bhutan"},
                {"BO", "_bolivia"},
                {"BA", "_bonaireSaintEustatiusAndSaba"},
                {"BW", "_bosniaAndHerzegovina"},
                {"BV", "_botswana"},
                {"BR", "_bouvetIsland"},
                {"VG", "_brazil"},
                {"IO", "_britishIndianOceanTerritory"},
                {"BN", "_bruneiDarussalam"},
                {"BG", "_bulgaria"},
                {"BF", "_burkinaFaso"},
                {"BI", "_burundi"},
                {"KH", "_cambodia"},
                {"CM", "_cameroon"},
                {"CA", "_canada"},
                {"CV", "_capeVerde"},
                {"KY", "_caymanIslands"},
                {"CF", "_centralAfricanRepublic"},
                {"TD", "_ceutaAndMelilla"},
                {"CL", "_chad"},
                {"CN", "_chile"},
                {"HK", "_china"},
                {"CX", "_christmasIsland"},
                {"CC", "_cocosKeelingIslands"},
                {"CO", "_colombia"},
                {"KM", "_comoros"},
                {"CG", "_congoDemocraticPeoplesRepublic"},
                {"CD", "_congoRepublicOf"},
                {"CK", "_cookIslands"},
                {"CR", "_costaRica"},
                {"CI", "_coteDIvoire"},
                {"HR", "_croatiaHrvatska"},
                {"CU", "_cuba"},
                {"CY", "_cyprus"},
                {"CZ", "_czechRepublic"},
                {"DK", "_denmark"},
                {"DJ", "_djibouti"},
                {"DM", "_dominica"},
                {"DO", "_dominicanRepublic"},
                {"EC", "_ecuador"},
                {"EG", "_egypt"},
                {"SV", "_elSalvador"},
                {"GQ", "_equatorialGuinea"},
                {"ER", "_eritrea"},
                {"EE", "_estonia"},
                {"ET", "_ethiopia"},
                {"FK", "_falklandIslands"},
                {"FO", "_faroeIslands"},
                {"FJ", "_fiji"},
                {"FI", "_finland"},
                {"FR", "_france"},
                {"GF", "_frenchGuiana"},
                {"PF", "_frenchPolynesia"},
                {"TF", "_frenchSouthernTerritories"},
                {"GA", "_gabon"},
                {"GM", "_gambia"},
                {"GE", "_georgia"},
                {"DE", "_germany"},
                {"GH", "_ghana"},
                {"GI", "_gibraltar"},
                {"GR", "_greece"},
                {"GL", "_greenland"},
                {"GD", "_grenada"},
                {"GP", "_guadeloupe"},
                {"GU", "_guam"},
                {"GT", "_guatemala"},
                {"GG", "_guernsey"},
                {"GN", "_guinea"},
                {"GW", "_guineaBissau"},
                {"GY", "_guyana"},
                {"HT", "_haiti"},
                {"HM", "_heardAndMcDonaldIslands"},
                {"VA", "_holySeeCityVaticanState"},
                {"HN", "_honduras"},
                {"HU", "_hungary"},
                {"IS", "_iceland"},
                {"IN", "_india"},
                {"ID", "_indonesia"},
                {"IR", "_iranIslamicRepublicOf"},
                {"IQ", "_iraq"},
                {"IE", "_ireland"},
                {"IM", "_isleOfMan"},
                {"IL", "_israel"},
                {"IT", "_italy"},
                {"JM", "_jamaica"},
                {"JP", "_japan"},
                {"JE", "_jersey"},
                {"JO", "_jordan"},
                {"KZ", "_kazakhstan"},
                {"KE", "_kenya"},
                {"KI", "_kiribati"},
                {"KP", "_koreaDemocraticPeoplesRepublic"},
                {"KR", "_koreaRepublicOf"},
                {"KW", "_kuwait"},
                {"KG", "_kyrgyzstan"},
                {"LA", "_laoPeoplesDemocraticRepublic"},
                {"LV", "_latvia"},
                {"LB", "_lebanon"},
                {"LS", "_lesotho"},
                {"LR", "_liberia"},
                {"LY", "_libya"},
                {"LI", "_liechtenstein"},
                {"LT", "_lithuania"},
                {"LU", "_luxembourg"},
                {"MK", "_macedonia"},
                {"MG", "_madagascar"},
                {"MW", "_malawi"},
                {"MY", "_malaysia"},
                {"MV", "_maldives"},
                {"ML", "_mali"},
                {"MT", "_malta"},
                {"MH", "_marshallIslands"},
                {"MQ", "_martinique"},
                {"MR", "_mauritania"},
                {"MU", "_mauritius"},
                {"YT", "_mayotte"},
                {"MX", "_mexico"},
                {"FM", "_micronesiaFederalStateOf"},
                {"MD", "_moldovaRepublicOf"},
                {"MC", "_monaco"},
                {"MN", "_mongolia"},
                {"ME", "_montenegro"},
                {"MS", "_montserrat"},
                {"MA", "_morocco"},
                {"MZ", "_mozambique"},
                {"MM", "_myanmar"},
                {"NA", "_namibia"},
                {"NR", "_nauru"},
                {"NP", "_nepal"},
                {"NL", "_netherlands"},
                {"NC", "_newCaledonia"},
                {"NZ", "_newZealand"},
                {"NI", "_nicaragua"},
                {"NE", "_niger"},
                {"NG", "_nigeria"},
                {"NU", "_niue"},
                {"NF", "_norfolkIsland"},
                {"MP", "_northernMarianaIslands"},
                {"NO", "_norway"},
                {"OM", "_oman"},
                {"PK", "_pakistan"},
                {"PW", "_palau"},
                {"PS", "_palestinianTerritories"},
                {"PA", "_panama"},
                {"PG", "_papuaNewGuinea"},
                {"PY", "_paraguay"},
                {"PE", "_peru"},
                {"PH", "_philippines"},
                {"PN", "_pitcairnIsland"},
                {"PL", "_poland"},
                {"PT", "_portugal"},
                {"PR", "_puertoRico"},
                {"QA", "_qatar"},
                {"RE", "_reunionIsland"},
                {"RO", "_romania"},
                {"RU", "_russianFederation"},
                {"RW", "_rwanda"},
                {"BL", "_saintBarthelemy"},
                {"SH", "_saintHelena"},
                {"KN", "_saintKittsAndNevis"},
                {"LC", "_saintLucia"},
                {"MF", "_saintMartin"},
                {"VC", "_saintVincentAndTheGrenadines"},
                {"WS", "_samoa"},
                {"SM", "_sanMarino"},
                {"ST", "_saoTomeAndPrincipe"},
                {"SA", "_saudiArabia"},
                {"SN", "_senegal"},
                {"RS", "_serbia"},
                {"SC", "_seychelles"},
                {"SL", "_sierraLeone"},
                {"SG", "_singapore"},
                {"SK", "_slovakRepublic"},
                {"SI", "_slovenia"},
                {"SB", "_solomonIslands"},
                {"SO", "_somalia"},
                {"ZA", "_southAfrica"},
                {"GS", "_southGeorgia"},
                {"SS", "_southSudan"},
                {"ES", "_spain"},
                {"LK", "_sriLanka"},
                {"SD", "_sudan"},
                {"SR", "_suriname"},
                {"SJ", "_svalbardAndJanMayenIslands"},
                {"SZ", "_swaziland"},
                {"SE", "_sweden"},
                {"CH", "_switzerland"},
                {"SY", "_syrianArabRepublic"},
                {"TW", "_taiwan"},
                {"TJ", "_tajikistan"},
                {"TZ", "_tanzania"},
                {"TH", "_thailand"},
                {"TG", "_togo"},
                {"TK", "_tokelau"},
                {"TO", "_tonga"},
                {"TT", "_trinidadAndTobago"},
                {"TN", "_tunisia"},
                {"TR", "_turkey"},
                {"TM", "_turkmenistan"},
                {"TC", "_turksAndCaicosIslands"},
                {"TV", "_tuvalu"},
                {"UG", "_uganda"},
                {"UA", "_ukraine"},
                {"AE", "_unitedArabEmirates"},
                {"GB", "_unitedKingdomGB"},
                {"US", "_unitedStates"},
                {"UY", "_uruguay"},
                {"UZ", "_uzbekistan"},
                {"VU", "_vanuatu"},
                {"VE", "_venezuela"},
                {"VN", "_vietnam"},
                {"VI", "_virginIslandsBritish"},
                {"WF", "_virginIslandsUSA"},
                {"EH", "_westernSahara"},
                {"YE", "_yemen"},
                {"ZM", "_zambia"},
                {"ZW", "_zimbabwe"},
        }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
    }
}
