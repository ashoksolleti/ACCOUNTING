/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.contract;

import java.io.Serializable;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingInvoiceBillingScheduleDto;
import com.unisys.trans.logistics.lms.accounting.dto.BillingScheduleFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.BillingSchedulesResponse;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceResponse;
import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.framework.exception.DaoException;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;




public interface ParticipantGenerationInvoiceService extends Serializable {



	public BillingSchedulesResponse retrieveBillingSchedulesByParticipantTypes(
			BillingScheduleFindRequest billingScheduleFindRequest) throws LMSException;

	ParticipantInvoiceResponse generateScheduledInvoice(
			ParticipantInvoiceRequest generateInvoiceRequest) throws LMSException;

	
	 ParticipantInvoiceResponse generateManualInvoice(
			ParticipantInvoiceRequest generateInvoiceRequest) throws LMSException;;

	
			ParticipantInvoiceResponse generateOnDemandInvoice(
			ParticipantInvoiceRequest generateInvoiceRequest) throws LMSException;;

	
			BillingSchedulesResponse retrieveBillingSchedules(BillingScheduleFindRequest arg0)throws LMSException;
			
			AbstractResponse generateParticipantInvoiceFile(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;
			BillingSchedulesResponse retrieveParticipantBillingSchedules(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;
			
			void persistInvoiceAirwayBIlls(ParticipantInvoiceRequest participantInvoiceRequest)throws LMSException;
			
			ParticipantInvoiceResponse getAccountingParticipants(
					ParticipantInvoiceRequest generateInvoiceRequest) throws LMSException;


			void processParticipantInvoiceFile(AccountingInvoiceBillingScheduleDto accountingInvoiceBillingScheduleDto)
					throws LMSException;


			BillingSchedulesResponse downloadFile(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;
}