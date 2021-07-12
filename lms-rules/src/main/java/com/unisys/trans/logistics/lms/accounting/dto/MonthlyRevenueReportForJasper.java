package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

public class MonthlyRevenueReportForJasper{

	List<AccountingBatchReportDto> monthlyRevenueReport = new ArrayList<AccountingBatchReportDto>();

	public List<AccountingBatchReportDto> getMonthlyRevenueReport() {
		return monthlyRevenueReport;
	}

	public void setMonthlyRevenueReport(
			List<AccountingBatchReportDto> monthlyRevenueReport) {
		this.monthlyRevenueReport = monthlyRevenueReport;
	}

	/**
	 * @return the accountingEntriesReport
	 */



}