package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingInvoiceDCMRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingInvoiceDCMResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface AccountingInvoiceDCMService {
	
	public AccountingInvoiceDCMResponse retrieveDCM(final AccountingInvoiceDCMRequest accountingInvoiceDCMRequest) throws LMSException;
	
	public AccountingInvoiceDCMResponse retrieveDCMforListing(final AccountingInvoiceDCMRequest accountingInvoiceDCMRequest) throws LMSException;
}
