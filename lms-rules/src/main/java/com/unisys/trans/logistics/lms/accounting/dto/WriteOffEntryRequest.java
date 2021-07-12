package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ReportConsolidationTypes;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReportTypes;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.dto.RequestHeader;

public class WriteOffEntryRequest extends AbstractRequest {
	
	private AccountingEntryDto accountingEntryDto;
	
	private ReportConsolidationTypes consolidationType;
	
	private ReportTypes reportType;
	
	private Date accountingStartDate;
	
	private Date accountingEndDate;
	
	private String accountingMonth;
	
	private Integer financialYear;
	
	private String glAccountNumber;
	
	private String glAccountName;
	
	private String awbNumber;
	
	private RequestHeader reqHeader;
	
	private AccountingBalanceReportDetailsDto reportDetailsDto;

	

	public AccountingBalanceReportDetailsDto getReportDetailsDto() {
		return reportDetailsDto;
	}

	public void setReportDetailsDto(
			AccountingBalanceReportDetailsDto reportDetailsDto) {
		this.reportDetailsDto = reportDetailsDto;
	}

	public RequestHeader getReqHeader() {
		return reqHeader;
	}

	public void setReqHeader(RequestHeader reqHeader) {
		this.reqHeader = reqHeader;
	}

	public String getGlAccountNumber() {
		return glAccountNumber;
	}

	public void setGlAccountNumber(String glAccountNumber) {
		this.glAccountNumber = glAccountNumber;
	}

	public String getGlAccountName() {
		return glAccountName;
	}

	public void setGlAccountName(String glAccountName) {
		this.glAccountName = glAccountName;
	}

	public String getAwbNumber() {
		return awbNumber;
	}

	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

	public AccountingEntryDto getAccountingEntryDto() {
		return accountingEntryDto;
	}

	public void setAccountingEntryDto(AccountingEntryDto accountingEntryDto) {
		this.accountingEntryDto = accountingEntryDto;
	}

	public ReportConsolidationTypes getConsolidationType() {
		return consolidationType;
	}

	public void setConsolidationType(ReportConsolidationTypes consolidationType) {
		this.consolidationType = consolidationType;
	}

	public ReportTypes getReportType() {
		return reportType;
	}

	public void setReportType(ReportTypes reportType) {
		this.reportType = reportType;
	}

	public Date getAccountingStartDate() {
		return accountingStartDate;
	}

	public void setAccountingStartDate(Date accountingStartDate) {
		this.accountingStartDate = accountingStartDate;
	}

	public Date getAccountingEndDate() {
		return accountingEndDate;
	}

	public void setAccountingEndDate(Date accountingEndDate) {
		this.accountingEndDate = accountingEndDate;
	}

	public String getAccountingMonth() {
		return accountingMonth;
	}

	public void setAccountingMonth(String accountingMonth) {
		this.accountingMonth = accountingMonth;
	}

	public Integer getFinancialYear() {
		return financialYear;
	}

	public void setFinancialYear(Integer financialYear) {
		this.financialYear = financialYear;
	}
	
}
