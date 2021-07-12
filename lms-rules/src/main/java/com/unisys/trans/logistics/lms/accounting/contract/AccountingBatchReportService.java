package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingBalanceReportRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingBalanceReportResponse;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingEntryRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingEntryResponse;
import com.unisys.trans.logistics.lms.accounting.dto.BatchControlReportFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.BatchControlReportResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface AccountingBatchReportService {
	
	public AccountingBalanceReportResponse generateAccountingTrialBalanceReport(
			AccountingBalanceReportRequest accountingBalanceReportRequest) throws LMSException;
	
	public AccountingEntryResponse generateAccountingMonthlyRevenueReport(
           AccountingEntryRequest accountingEntryRequest) throws LMSException;
	
	public AccountingEntryResponse generateAccountingEntriesReport
    (AccountingEntryRequest accountingEntryRequest) throws LMSException;
	
	public BatchControlReportResponse retrieveBatchReport(
			BatchControlReportFindRequest batchControlReportFindRequest) throws LMSException;
	
	public BatchControlReportResponse updateBatchReport(
			BatchControlReportFindRequest batchControlReportFindRequest)
			throws LMSException;
	
	public AccountingEntryResponse generateAccrualEntries(AccountingEntryRequest accEntryRequest) throws LMSException;

  }