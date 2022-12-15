package com.netsuite.application;

import com.netsuite.webservices.platform.core_2022_1.AttachReference;
import com.netsuite.webservices.platform.core_2022_1.BaseRef;
import com.netsuite.webservices.platform.core_2022_1.DeletionReason;
import com.netsuite.webservices.platform.core_2022_1.DetachReference;
import com.netsuite.webservices.platform.core_2022_1.Record;
import com.netsuite.webservices.platform.messages_2022_1.WriteResponse;
import com.netsuite.webservices.platform.messages_2022_1.WriteResponseList;
import com.netsuite.webservices.platform_2022_1.NetSuitePortType;

import java.rmi.RemoteException;

public abstract class NetsuiteAbstractProcessor {
    protected NetSuitePortType service;

    protected NetsuiteAbstractProcessor() throws Exception {
        service = NetsuiteServiceManager.getInstance();
    }

    public WriteResponse create(Record record) throws RemoteException {
        WriteResponse response = service.add(record);

        // todo log error payload

        return response;
    }

    public WriteResponseList create(Record[] records) throws RemoteException {
        WriteResponseList response = service.addList(records);

        // todo log error payload

        return response;
    }

    public WriteResponse update(Record record) throws RemoteException {
        WriteResponse response = service.update(record);

        // todo log error payload

        return response;
    }

    public WriteResponseList update(Record[] records) throws RemoteException {
        WriteResponseList response = service.updateList(records);

        // todo log error payload

        return response;
    }

    public WriteResponse delete(BaseRef baseRef, DeletionReason reason) throws RemoteException {
        WriteResponse response = service.delete(baseRef, reason);

        // todo log error payload

        return response;
    }

    public WriteResponseList delete(BaseRef[] baseRefs, DeletionReason reason) throws RemoteException {
        WriteResponseList response = service.deleteList(baseRefs, reason);

        // todo log error payload

        return response;
    }

    public WriteResponse attach(AttachReference attachment) throws RemoteException {
        WriteResponse response = service.attach(attachment);

        // todo log error payload

        return response;
    }

    public WriteResponse detach(DetachReference detachReference) throws RemoteException {
        WriteResponse response = service.detach(detachReference);

        // todo log error payload

        return response;
    }
}
