package com.unisys.trans.logistics.lms.accounting.contract;

import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingInvoiceBillingScheduleDto;
import com.unisys.trans.logistics.lms.accounting.dto.BillingSchedulesResponse;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceResponse;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceSummaryDto;
import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.framework.exception.DaoException;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;


/**
 * The Interface ParticipantInvoiceService.
 */
public interface ParticipantInvoiceService {
	
	/**
	 * Generate participant invoice.
	 *
	 * @param generateInvoiceRequest the generate invoice request
	 * @return the participant invoice response
	 * @throws LMSException the lMS exception
	 */
	public ParticipantInvoiceResponse generateParticipantInvoice(
			ParticipantInvoiceRequest generateInvoiceRequest)throws LMSException;

	/**
	 * Finalize participant invoice.
	 *
	 * @param generateInvoiceRequest the generate invoice request
	 * @throws LMSException the lMS exception
	 */
	public void finalizeParticipantInvoice(
			ParticipantInvoiceRequest generateInvoiceRequest)throws LMSException;

	/**
	 * Retrieve participant invoice.
	 *
	 * @param generateInvoiceRequest the generate invoice request
	 * @return the participant invoice response
	 * @throws LMSException the lMS exception
	 */
	public ParticipantInvoiceResponse retrieveParticipantInvoice(
			ParticipantInvoiceRequest generateInvoiceRequest)throws LMSException;
	
	
	/**
	 * Persist invoiced awb.
	 *
	 * @param InvoiceSummaryDto the invoice summary dto
	 * @throws LMSException the lMS exception
	 */
	public void persistInvoicedAWB(
			ParticipantInvoiceSummaryDto InvoiceSummaryDto)
			throws LMSException;
	
	/**
	 * Generate Participant Invoice File
	 * @param participantInvoiceRequest
	 * @return
	 * @throws LMSException
	 */
	public AbstractResponse generateParticipantInvoiceFile(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;
	
	/**
	 * Retrieve Participant Billing Schedules
	 * @param participantInvoiceRequest
	 * @return
	 * @throws LMSException
	 */
	
	public BillingSchedulesResponse retrieveParticipantBillingSchedules(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;

	public void processParticipantInvoiceFile(AccountingInvoiceBillingScheduleDto accountingInvoiceBillingScheduleDto)throws LMSException, DaoException;

	public BillingSchedulesResponse downloadFile(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;
	
	
}
