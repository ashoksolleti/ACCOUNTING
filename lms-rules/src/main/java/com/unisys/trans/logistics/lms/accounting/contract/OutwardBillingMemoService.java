/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.OutwardBillingDeleteRequest;
import com.unisys.trans.logistics.lms.accounting.dto.OutwardBillingMemoFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.OutwardBillingMemoPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.OutwardBillingMemoResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>InterlineInwardBillingService</code> handles the maintenance of Interline inward payables
 * <p>
 * InterlineInwardBilling is created for an invoice number. <br>
 * This has the following functions:
 * <ul>
 * <li>Creates an InterlineInwardBilling.
 * <li>Updates an InterlineInwardBilling.
 * <li>Deletes an InterlineInwardBilling.
 * <li>Retrieves the InterlineInwardBilling.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardBillingDeleteRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardBillingFindRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardBillingPersistRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardBillingResponse
 */
public interface OutwardBillingMemoService {

   
    public OutwardBillingMemoResponse createOutwardBillingMemo(
                final OutwardBillingMemoPersistRequest pPersistRequest) throws LMSException;
    
    /*public InterlineInwardReasonCodeResponse populateReasonCodes(
            final InterlineInwardReasonCodeFindRequest pReasonCodeFindRequest) throws LMSException;

    public InterlineInwardBillingResponse updateInterlineInwardBilling(
                final InterlineInwardBillingPersistRequest pPersistRequest) throws LMSException;*/

    public OutwardBillingMemoResponse findOutwardBillingMemo(
                final OutwardBillingMemoFindRequest pFindRequest) throws LMSException;

   /* public InterlineInwardBillingCarrierResponse findCarrierCodes(
                InterlineInwardBillingCarrierRequest pBillingsCarrierRequest) throws LMSException;

    public InterlineInwardBillingResponse deleteInterlineInwardBilling(
                final InterlineInwardBillingDeleteRequest pDeleteRequest) throws LMSException;

    public InterlineInwardReasonCodeResponse findReasonCodes(
                final InterlineInwardReasonCodeFindRequest pInterlineInwardReasonCodeFindRequest)
                throws LMSException;*/
    
	public OutwardBillingMemoResponse approveOutwardMemo(
			final OutwardBillingMemoPersistRequest pPersistRequest)
			throws LMSException;
	
	public OutwardBillingMemoResponse deleteOutwardBilling(
			final OutwardBillingDeleteRequest pDeleteRequest) throws LMSException;
	
	public OutwardBillingMemoResponse updateOutwardBilling(
            final OutwardBillingMemoPersistRequest pPersistRequest) throws LMSException; 
	
}
