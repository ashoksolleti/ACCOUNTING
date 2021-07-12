package com.unisys.trans.logistics.lms.accounting.contract;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillDto;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingInvoiceDetailDto;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillProcessRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AirWaybillListingResponse;
import com.unisys.trans.logistics.lms.accounting.dto.CarrierReceivableDto;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceResponse;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceSummaryDto;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantReceivableDto;
import com.unisys.trans.logistics.lms.framework.exception.DaoException;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * 
 * @author AhirwaUK
 *
 */
public interface AccountingAWBListingService {
	
	public AirWaybillListingResponse findAccountingAWBs(
					AccountingAirWaybillProcessRequest airWaybillListingRequest) throws LMSException;
	
	public ParticipantInvoiceResponse retrieveOnHoldDetails(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;
	
	public AirWaybillListingResponse updateParticipantReceivableOnHoldAWB(AccountingAirWaybillProcessRequest accountingAirWaybillProcessRequest) throws LMSException;
	
	public AirWaybillListingResponse showErrorNotification(boolean remarksCheck, boolean mapEntry);

}
