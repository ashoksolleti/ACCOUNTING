package com.unisys.trans.logistics.lms.accounting.contract;

import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.InvoiceTypeFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InvoiceTypePersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InvoiceTypeResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface InvoiceTypeService {
	
	/**
	 * 
	 * @param invoicesTypeRetrieveRequest
	 * @return
	 * @throws LMSException
	 */
	
	
	public InvoiceTypeResponse retrieveAll(
			InvoiceTypeFindRequest invoicesTypeRetrieveRequest)
			throws LMSException;
	
	/**
	 * 
	 * @param invoicesTypeRetrieveRequest
	 * @return
	 * @throws LMSException
	 */

	public InvoiceTypeResponse retrieveInvoiceType(
			InvoiceTypeFindRequest invoicesTypeRetrieveRequest)
			throws LMSException;
	
	
	/**
	 * 
	 * @param invoicesTypePersistRequest
	 * @return
	 * @throws LMSException
	 */

	public InvoiceTypeResponse processInvoiceType(
			InvoiceTypePersistRequest invoicesTypePersistRequest)
			throws LMSException;
	
	/**
	 * 
	 * @param invoicesTypePersistRequest
	 * @return
	 * @throws LMSException
	 */

	public InvoiceTypeResponse saveInvoiceType(
			InvoiceTypePersistRequest invoicesTypePersistRequest)
			throws LMSException;

	

}
