package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

public class AccountBalanceReportForJasper {
	
	List<AccountingBalanceReportDetailsDto> accountingBalanceReport = new ArrayList<AccountingBalanceReportDetailsDto>();

	/**
	 * @return the accountingBalanceReport
	 */
	public List<AccountingBalanceReportDetailsDto> getAccountingBalanceReport() {
		return accountingBalanceReport;
	}

	/**
	 * @param accountingBalanceReport the accountingBalanceReport to set
	 */
	public void setAccountingBalanceReport(
			List<AccountingBalanceReportDetailsDto> accountingBalanceReport) {
		this.accountingBalanceReport = accountingBalanceReport;
	}

}
