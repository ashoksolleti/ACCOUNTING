/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingAwbInformationFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardBillingCarrierRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardBillingCarrierResponse;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardBillingDeleteRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardBillingFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardBillingPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardBillingResponse;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardReasonCodeFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardReasonCodeResponse;
import com.unisys.trans.logistics.lms.accounting.dto.POIExcelReaderResponse;
import com.unisys.trans.logistics.lms.accounting.dto.PaymentInformationPersistRequest;
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
public interface InterlineInwardBillingService {

    public InterlineInwardReasonCodeResponse populateReasonCodes(
                final InterlineInwardReasonCodeFindRequest pReasonCodeFindRequest) throws LMSException;

    public InterlineInwardBillingResponse createInterlineInwardBilling(
                final InterlineInwardBillingPersistRequest pPersistRequest) throws LMSException;

    public InterlineInwardBillingResponse updateInterlineInwardBilling(
                final InterlineInwardBillingPersistRequest pPersistRequest) throws LMSException;

    public InterlineInwardBillingResponse findInterlineInwardBilling(
                final InterlineInwardBillingFindRequest pFindRequest) throws LMSException;

    public InterlineInwardBillingCarrierResponse findCarrierCodes(
                InterlineInwardBillingCarrierRequest pBillingsCarrierRequest) throws LMSException;

    public InterlineInwardBillingResponse deleteInterlineInwardBilling(
                final InterlineInwardBillingDeleteRequest pDeleteRequest) throws LMSException;

    public InterlineInwardReasonCodeResponse findReasonCodes(
                final InterlineInwardReasonCodeFindRequest pInterlineInwardReasonCodeFindRequest)
                throws LMSException;
    
    public InterlineInwardBillingResponse findAirWaybill(
            final InterlineInwardBillingFindRequest pFindRequest) throws LMSException;
    
    public InterlineInwardBillingResponse findAirWaybillByOid(
            final AccountingAwbInformationFindRequest awbInformationFindRequest) throws LMSException;
    
	public POIExcelReaderResponse uploadAWBInformation(
			InterlineInwardBillingPersistRequest interlineInwardBillingPersistRequest) throws LMSException; 

}
