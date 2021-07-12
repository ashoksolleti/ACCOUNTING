package com.unisys.trans.logistics.lms.accounting.contract;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingEntryRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingPostingRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AirWaybillRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InwardBillingProcessingRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantInvoiceRequest;
import com.unisys.trans.logistics.lms.accounting.dto.PaymentInformationPersistRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface GLAsynchronousService extends Serializable {
	
	public void finalizingInvoices(ParticipantInvoiceRequest finalizeInvoiceRequest)throws LMSException; 
	public void FlownRevenueAccountingEntries(AirWaybillRequest airWaybillRequest)throws LMSException;
	public void postAccountingEntry(AccountingPostingRequest request) throws LMSException;
	public void paymentAccountingEntries(PaymentInformationPersistRequest request) throws LMSException;
	public void rejectionMemoAccountingEntries(InwardBillingProcessingRequest request) throws LMSException;
	public void stationCashieringAccountingEntries(AirWaybillRequest airWaybillRequest) throws LMSException;
	public void triggerReversalsForStationCashieringAccountingEntries(AccountingEntryRequest accountingEntryRequest) throws LMSException;
	public void triggerAccountingEntriesForStationCashiering(AccountingEntryRequest accountingEntryRequest) throws LMSException;
	public void triggerAccountingEntriesForAgentCommission(AccountingEntryRequest accountingEntryRequest) throws LMSException;
	public void triggerIscAccountingEntries(AccountingEntryRequest accountingEntryRequest) throws LMSException;
}
