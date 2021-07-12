package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class AccountingBalanceReportResponse extends AbstractResponse{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private AccountingBalanceReportDto accountingBalanceReportDto;
	
	List<AccountingBalanceReportDetailsDto> accounitngBalanceReport = new ArrayList<AccountingBalanceReportDetailsDto>();

	/**
	 * @return the accountingBalanceReportDto
	 */
	public AccountingBalanceReportDto getAccountingBalanceReportDto() {
		return accountingBalanceReportDto;
	}

	/**
	 * @param accountingBalanceReportDto the accountingBalanceReportDto to set
	 */
	public void setAccountingBalanceReportDto(
			AccountingBalanceReportDto accountingBalanceReportDto) {
		this.accountingBalanceReportDto = accountingBalanceReportDto;
	}

	/**
	 * @return the accounitngBalanceReport
	 */
	public List<AccountingBalanceReportDetailsDto> getAccounitngBalanceReport() {
		return accounitngBalanceReport;
	}

	/**
	 * @param accounitngBalanceReport the accounitngBalanceReport to set
	 */
	public void setAccounitngBalanceReport(
			List<AccountingBalanceReportDetailsDto> accounitngBalanceReport) {
		this.accounitngBalanceReport = accounitngBalanceReport;
	}
}
