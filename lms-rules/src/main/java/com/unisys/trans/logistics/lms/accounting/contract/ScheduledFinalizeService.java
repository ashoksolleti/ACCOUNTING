package com.unisys.trans.logistics.lms.accounting.contract;


import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import java.util.List;


public interface ScheduledFinalizeService {
    public List<String> retrieveInvoicesToBeFinalized() throws LMSException;
    public void sendConsolidatedEmail(List<String> invoiceOIDs, boolean failure) throws LMSException;
}


