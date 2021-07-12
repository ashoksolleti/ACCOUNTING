package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ReportConsolidationTypes;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReportTypes;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class AccountingBalanceReportRequest extends AbstractRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String aWBNumber;
	private ReportConsolidationTypes consolidationLevel = ReportConsolidationTypes.GLACC;
	private ReportTypes reportType = ReportTypes.TRIAL;
	private Date accountingStartDate;
	private Date accountingEndDate;
	private String accountingMonth;
	private Integer accountingYear;
	private boolean batch;
	private AccountingBalanceReportDetailsDto accountingBalanceReportDetailsDto;
	
	public AccountingBalanceReportDetailsDto getAccountingBalanceReportDto() {
		return accountingBalanceReportDetailsDto;
	}

	public void setAccountingBalanceReportDto(
			AccountingBalanceReportDetailsDto accountingBalanceReportDto) {
		this.accountingBalanceReportDetailsDto = accountingBalanceReportDetailsDto;
	}
	private String specificAirline;
	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
	
	public boolean isBatch() {
		return batch;
		
	}
	public void setBatch(boolean batch) {
		this.batch = batch;
	}
	/**
	 * @return the aWBNumber
	 */
	public String getaWBNumber() {
		return aWBNumber;
	}
	/**
	 * @param aWBNumber the aWBNumber to set
	 */
	public void setaWBNumber(String aWBNumber) {
		this.aWBNumber = aWBNumber;
	}
	/**
	 * @return the consolidationLevel
	 */
	public ReportConsolidationTypes getConsolidationLevel() {
		return consolidationLevel;
	}
	/**
	 * @param consolidationLevel the consolidationLevel to set
	 */
	public void setConsolidationLevel(ReportConsolidationTypes consolidationLevel) {
		this.consolidationLevel = consolidationLevel;
	}
	/**
	 * @return the reportType
	 */
	public ReportTypes getReportType() {
		return reportType;
	}
	/**
	 * @param reportType the reportType to set
	 */
	public void setReportType(ReportTypes reportType) {
		this.reportType = reportType;
	}
	/**
	 * @return the accountingStartDate
	 */
	public Date getAccountingStartDate() {
		return accountingStartDate;
	}
	/**
	 * @param accountingStartDate the accountingStartDate to set
	 */
	public void setAccountingStartDate(Date accountingStartDate) {
		this.accountingStartDate = accountingStartDate;
	}
	/**
	 * @return the accountingEndDate
	 */
	public Date getAccountingEndDate() {
		return accountingEndDate;
	}
	/**
	 * @param accountingEndDate the accountingEndDate to set
	 */
	public void setAccountingEndDate(Date accountingEndDate) {
		this.accountingEndDate = accountingEndDate;
	}
	/**
	 * @return the accountingMonth
	 */
	public String getAccountingMonth() {
		return accountingMonth;
	}
	/**
	 * @param accountingMonth the accountingMonth to set
	 */
	public void setAccountingMonth(String accountingMonth) {
		this.accountingMonth = accountingMonth;
	}
	/**
	 * @return the accountingYear
	 */
	public Integer getAccountingYear() {
		return accountingYear;
	}
	/**
	 * @param accountingYear the accountingYear to set
	 */
	public void setAccountingYear(Integer accountingYear) {
		this.accountingYear = accountingYear;
	}
	
}
