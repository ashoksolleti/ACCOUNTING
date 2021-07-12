//
// Oracle JDeveloper Stub Generated Source
//
package com.unisys.trans.logistics.lms.accounting.contract;

import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingPeriodRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingPeriodResponse;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineInwardBillingResponse;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineOutwardBillingDto;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineOutwardBillingFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineOutwardBillingPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineOutwardBillingResponse;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceResponse;
import com.unisys.trans.logistics.lms.framework.exception.DaoException;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
public interface InterlineOutwardBillingService
{
    //
    // Methods
    //
   
    com.unisys.trans.logistics.lms.accounting.dto.InterlineOutwardBillingResponse retrieveInterlineOutwardBillingsInformation(com.unisys.trans.logistics.lms.accounting.dto.InterlineOutwardBillingFindRequest p1)  throws LMSException;

   // com.unisys.trans.logistics.lms.accounting.dto.InterlineOutwardBillingResponse retrieveAll(com.unisys.trans.logistics.lms.accounting.dto.InterlineOutwardBillingFindRequest p1)  throws LMSException;

    public InterlineOutwardBillingResponse generateInterlineOutwardBillingsInformation(
    		List<InterlineOutwardBillingDto> ainterlineOutwardBillingDtoList,InterlineOutwardBillingFindRequest aInterlineOutwardBillingFindRequest) throws LMSException;
    
    public InterlineOutwardBillingResponse retrieveIDECBatchDatesByRunDate(InterlineOutwardBillingFindRequest aInterlineOutwardBillingFindRequest)throws LMSException;

    public void retrieveOutwardMemoAttachments(InterlineOutwardBillingFindRequest aInterlineOutwardBillingFindRequest)throws LMSException;



    public InterlineOutwardBillingResponse processFileGeneration(
			InterlineOutwardBillingPersistRequest interlineOutwardBillingPersistRequest) throws DaoException, LMSException;

	public InterlineOutwardBillingResponse retrieveZipFileFromFTP(InterlineOutwardBillingFindRequest aInterlineOutwardBillingFindRequest) throws LMSException;

	public InterlineOutwardBillingResponse reProcessFile(
			InterlineOutwardBillingPersistRequest interlineOutwardBillingPersistRequest) throws LMSException;


}
