package com.unisys.trans.logistics.lms.accounting.contract;

import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillDto;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingEntryDto;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingEntryRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingEntryResponse;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingInvoiceAWBDto;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingPeriodRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineParticipantInvoiceSummaryDto;
import com.unisys.trans.logistics.lms.accounting.dto.ManualAccountingEntryPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ManualAccountingEntryRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantReceivableDto;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingRuleIndicators;
import com.unisys.trans.logistics.lms.framework.dto.RequestHeader;
import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;
import com.unisys.trans.logistics.lms.framework.exception.DaoException;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface AccountingEntryService {

	public AccountingEntryResponse processFlownRevenueAccountingEntries(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;

	public AccountingEntryResponse processInvoiceDcmAccountingEntries(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;
	
	public AccountingEntryResponse processPaymentAccountingEntries(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;

	public AccountingEntryResponse processWriteOffAccountingEntries(
			AccountingEntryRequest accountingEntryRequest, RequestHeader reqHeader) throws LMSException;
	
	public AccountingEntryResponse processRejectionMemoAccountingEntries(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;

	public AccountingEntryResponse processInvoiceAwbAccountingEntries(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;
	
	public AccountingEntryResponse processInvoiceBmCmAccountingEntries(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;

	public AccountingEntryResponse resolveAccountingEntryErrors(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;

	public AccountingEntryResponse retrieveAccountingEntries(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;
	
	public AccountingEntryResponse retrieveManualAccountingEntries(
			ManualAccountingEntryRequest manualAccountingEntryRequest) throws LMSException;
	
	public AccountingEntryResponse processManualAccountingEntries(
			ManualAccountingEntryPersistRequest manualAccountingEntryPersistRequest) throws LMSException;
	
	public AccountingEntryResponse getManualAccountingEntryDetails(
			ManualAccountingEntryRequest manualAccountingEntryRequest) throws LMSException;
	
	public AccountingEntryResponse retrieveAccountingEntrieErrors(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;
	
	public AccountingEntryResponse retrieveAllAccountingEntries(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;
			
	public AccountingEntryResponse saveManualAccountingEntries(
			ManualAccountingEntryPersistRequest manualAccountingEntryPersistRequest) throws LMSException;
	
	public AccountingEntryResponse reverseManualAccountingEntry(
			ManualAccountingEntryPersistRequest manualAccountingEntryPersistRequest) throws LMSException;
	
	public AccountingEntryResponse retrieveAccountingPeriod(
			AccountingPeriodRequest accountingPeriodRequest) throws LMSException;
	
	public AccountingEntryResponse generateMonthlyRevenueReport
              (AccountingEntryRequest accountingEntryRequest) throws LMSException;

	public AccountingEntryResponse retrieveAccountingEntriesForArchival(AccountingEntryRequest accountingEntryRequest) throws LMSException;

	public void purgeAccountingEntriesForArchival(AccountingEntryDto accountingEntryDto) throws LMSException;		
	
	public AccountingEntryResponse generateAccountingEntriesReport(AccountingEntryRequest accountingEntryRequest) throws LMSException;
	
	public List<AccountingEntryDto> retrieveAccountingEntryBasedOnJournalId(AccountingEntryRequest accountingEntryRequest) throws LMSException;

	public AccountingEntryResponse processAccrualEntries(AccountingEntryRequest accountingEntryRequest) throws LMSException;
	
	public AccountingEntryResponse processStationCashieringAccountingEntries(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;

	public AccountingEntryResponse processRejectionMemosAccountingEntries(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;
	
	public AccountingEntryResponse processInwardMemoAccountingEntries(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;
	
	public AccountingEntryResponse processAccEntriesForCOMAWB(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;

	public void processReversalsForStationCashieringAccountingEntries(AccountingEntryRequest accountingEntryRequest) throws LMSException;
	
	public void processAccountingEntriesForStationCashiering(AccountingEntryRequest accountingEntryRequest) throws LMSException;

	public void checkForStationCashieringEntries(AccountingEntryRequest aRequest,
			List<ParticipantReceivableDto> participantReceivables,
			AccountingAirWaybillDto aAccountingAirWaybill) throws LMSException;
	
	public CodeMessage deleteAccountingErrors(Long oid) throws DaoException;

	public void processInterlineAWBAccountingEntries(
			InterlineParticipantInvoiceSummaryDto interlineParticipantInvoiceSummaryDto,
			AccountingEntryRequest accountingEntryRequest, AccountingInvoiceAWBDto invoiceAWBDto) throws LMSException;
	
	public AccountingEntryResponse processAccountingEntriesForAgentCommission(AccountingEntryRequest accountingEntryRequest) throws LMSException;
	
	public AccountingEntryResponse processIscAccountingEntries(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;
	
	/*public AccountingEntryResponse processAccEntriesForPOSTALMAILAWB(
			AccountingEntryRequest accountingEntryRequest) throws LMSException;*/
	
}