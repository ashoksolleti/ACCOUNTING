package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

public class AccountingEntriesReportForJasper{

	List<AccountingBatchReportDto> accountingEntriesReport = new ArrayList<AccountingBatchReportDto>();

	/**
	 * @return the accountingEntriesReport
	 */
	public List<AccountingBatchReportDto> getAccountingEntriesReport() {
		return accountingEntriesReport;
	}

	/**
	 * @param accountingEntriesReport the accountingEntriesReport to set
	 */
	public void setAccountingEntriesReport(
			List<AccountingBatchReportDto> accountingEntriesReport) {
		this.accountingEntriesReport = accountingEntriesReport;
	}
	

}