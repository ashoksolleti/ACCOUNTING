
package com.unisys.trans.logistics.lms.accounting.contract;


import com.unisys.trans.logistics.lms.accounting.dto.AccountingInvoiceAWBDto;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineBillingQueueDto;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface AccountingEntryGenerationService {
	/**
	 * 
	 * @param participantInvoiceSummaryDto
	 * @throws LMSException
	 *              this method processes the billing accounting entries for the different participant types.
	 */
	
	public void processBillingAccountingEntry(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param accountingAirWaybillDto
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */

	public void processFlownRevenueAccountingEntries(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;
	
	public void processPaymentAccountingEntries(ParticipantInvoiceRequest participantInvoiceRequest)throws LMSException;
	
	public void processInterlineAccountingEntries(ParticipantInvoiceRequest invoiceRequest)throws LMSException;
	
	public void processRejectionMemosAccountingEntries(
			InterlineBillingQueueDto interlineBillingQueueDto)
			throws LMSException;

	public void processStationCashieringAccountingEntries(ParticipantInvoiceRequest participantInvoiceRequest) throws LMSException;

	public void processInterlineInwardAccountingEntries(ParticipantInvoiceRequest invoiceRequest,
			AccountingInvoiceAWBDto invoiceAWBDto)throws LMSException;
}