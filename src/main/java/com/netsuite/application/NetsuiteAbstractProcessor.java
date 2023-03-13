package com.netsuite.application;

import com.netsuite.webservices.platform.core_2022_1.AttachReference;
import com.netsuite.webservices.platform.core_2022_1.BaseRef;
import com.netsuite.webservices.platform.core_2022_1.DeletionReason;
import com.netsuite.webservices.platform.core_2022_1.DetachReference;
import com.netsuite.webservices.platform.core_2022_1.Record;
import com.netsuite.webservices.platform.messages_2022_1.WriteResponse;
import com.netsuite.webservices.platform.messages_2022_1.WriteResponseList;
import com.netsuite.webservices.platform_2022_1.NetSuitePortType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

public abstract class NetsuiteAbstractProcessor {
    protected NetSuitePortType service;

    protected final Logger logger = LoggerFactory.getLogger("NetSuite Web Service");

    protected NetsuiteAbstractProcessor() throws Exception {
        service = NetsuiteServiceManager.getInstance();
    }

    public WriteResponse create(Record record) throws RemoteException {
        try {
            return service.add(record);

        } catch (RemoteException e) {
            logger.error("Error creating record: ", e);
            throw e;
        }
    }

    public WriteResponseList create(Record[] records) throws RemoteException {
        try {
            return service.addList(records);
        } catch (RemoteException e) {
            logger.error("Error creating records: ", e);
            throw e;
        }
    }

    public WriteResponse update(Record record) throws RemoteException {
        try {
            return service.update(record);
        } catch (RemoteException e) {
            logger.error("Error updating record: ", e);
            throw e;
        }
    }

    public WriteResponseList update(Record[] records) throws RemoteException {
        try {
            return service.updateList(records);
        } catch (RemoteException e) {
            logger.error("Error updating records: ", e);
            throw e;
        }
    }

    public WriteResponse delete(BaseRef baseRef, DeletionReason reason) throws RemoteException {
        try {
            return service.delete(baseRef, reason);
        } catch (RemoteException e) {
            logger.error("Error deleting record: ", e);
            throw e;
        }
    }

    public WriteResponseList delete(BaseRef[] baseRefs, DeletionReason reason) throws RemoteException {
        try {
            return service.deleteList(baseRefs, reason);
        } catch (RemoteException e) {
            logger.error("Error deleting records: ", e);
            throw e;
        }
    }

    public WriteResponse attach(AttachReference attachment) throws RemoteException {
        try {
            return service.attach(attachment);
        } catch (RemoteException e) {
            logger.error("Error updating record: ", e);
            throw e;
        }
    }

    public WriteResponse detach(DetachReference detachReference) throws RemoteException {
        try {
            return service.detach(detachReference);
        } catch (RemoteException e) {
            logger.error("Error updating record: ", e);
            throw e;
        }
    }

    public void search() {

    }

    public void getSavedSearch() {

    }

}
