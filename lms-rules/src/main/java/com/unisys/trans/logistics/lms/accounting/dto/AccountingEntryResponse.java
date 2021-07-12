package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class AccountingEntryResponse extends AbstractResponse {
	private static final long serialVersionUID = 1L;

	private List<AccountingEntryDto> accountingEntryDtos;

	private List<AccountingEntryErrorDto> accountingEntryErrorDtos;

	private AccountingEntryDto accountingEntryDto;
	
	private AccountingBalanceReportDto accountingBalanceReportDto;
	

	private List<AccountingBatchReportDto> accountingBatchReportDtos;
	
	private List<AccountingBalanceReportDetailsDto> accountingBalReportDtos;

	private List<AccountingBalanceReportDetailsDto> errorReportDtos;

	
	private List<AccountingBalanceReportDetailsDto> successReportDtos;
	
	private double totalAccountingEntryErrorCount;

	private String invoiceNumber; 

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	private String journalId;
	
	private String triggeringPoint ;
	
	private Long partRecOid;
	
	public Long getPartRecOid() {
		return partRecOid;
	}

	public void setPartRecOid(Long partRecOid) {
		this.partRecOid = partRecOid;
	}

	public String getTriggeringPoint() {
		return triggeringPoint;
	}

	public void setTriggeringPoint(String triggeringPoint) {
		this.triggeringPoint = triggeringPoint;
	}

	public Long getAwbOid() {
		return awbOid;
	}

	public void setAwbOid(Long awbOid) {
		this.awbOid = awbOid;
	}

	public List<AccountingEntryDto> getStartAccountingEntryDto() {
		return startAccountingEntryDto;
	}

	public void setStartAccountingEntryDto(List<AccountingEntryDto> startAccountingEntryDto) {
		this.startAccountingEntryDto = startAccountingEntryDto;
	}

	public List<AccountingEntryDto> getLastAccountingEntryDto() {
		return lastAccountingEntryDto;
	}

	public void setLastAccountingEntryDto(List<AccountingEntryDto> lastAccountingEntryDto) {
		this.lastAccountingEntryDto = lastAccountingEntryDto;
	}

	private Long awbOid ;
	
	private List<AccountingEntryDto> startAccountingEntryDto; 
	
	private List<AccountingEntryDto> lastAccountingEntryDto;
	
	private String specificAirline;
	
	private Long deleteOid;
	
	
	
	public Long getDeleteOid() {
		return deleteOid;
	}

	public void setDeleteOid(Long deleteOid) {
		this.deleteOid = deleteOid;
	}

	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

	public String getJournalId() {
		return journalId;
	}

	public void setJournalId(String journalId) {
		this.journalId = journalId;
	}

	public List<AccountingBalanceReportDetailsDto> getAccountingBalReportDtos() {
		return accountingBalReportDtos;
	}

	public void setAccountingBalReportDtos(
			List<AccountingBalanceReportDetailsDto> accountingBalReportDtos) {
		this.accountingBalReportDtos = accountingBalReportDtos;
	}

	public List<AccountingBalanceReportDetailsDto> getErrorReportDtos() {
		return errorReportDtos;
	}

	public void setErrorReportDtos(
			List<AccountingBalanceReportDetailsDto> errorReportDtos) {
		this.errorReportDtos = errorReportDtos;
	}

	public List<AccountingBalanceReportDetailsDto> getSuccessReportDtos() {
		return successReportDtos;
	}

	public void setSuccessReportDtos(
			List<AccountingBalanceReportDetailsDto> successReportDtos) {
		this.successReportDtos = successReportDtos;
	}

	public AccountingBalanceReportDto getAccountingBalanceReportDto() {
		return accountingBalanceReportDto;
	}

	public void setAccountingBalanceReportDto(
			AccountingBalanceReportDto accountingBalanceReportDto) {
		this.accountingBalanceReportDto = accountingBalanceReportDto;
	}

	/**
	 * @return the accountingEntryDto
	 */
	public AccountingEntryDto getAccountingEntryDto() {
		return accountingEntryDto;
	}

	/**
	 * @param accountingEntryDto
	 *            the accountingEntryDto to set
	 */
	public void setAccountingEntryDto(AccountingEntryDto accountingEntryDto) {
		this.accountingEntryDto = accountingEntryDto;
	}

	/**
	 * @return the accountingEntryDtos
	 */
	public List<AccountingEntryDto> getAccountingEntryDtos() {
		return accountingEntryDtos;
	}

	/**
	 * @param accountingEntryDtos
	 *            the accountingEntryDtos to set
	 */
	public void setAccountingEntryDtos(
			List<AccountingEntryDto> accountingEntryDtos) {
		this.accountingEntryDtos = accountingEntryDtos;
	}

	/**
	 * @return the accountingEntryErrorDtos
	 */
	public List<AccountingEntryErrorDto> getAccountingEntryErrorDtos() {
		return accountingEntryErrorDtos;
	}

	/**
	 * @param accountingEntryErrorDtos
	 *            the accountingEntryErrorDtos to set
	 */
	public void setAccountingEntryErrorDtos(
			List<AccountingEntryErrorDto> accountingEntryErrorDtos) {
		this.accountingEntryErrorDtos = accountingEntryErrorDtos;
	}

	/**
	 * @return the accountingBatchReportDto
	 */
	public List<AccountingBatchReportDto> getAccountingBatchReportDto() {
		return accountingBatchReportDtos;
	}

	/**
	 * @param accountingBatchReportDto the accountingBatchReportDto to set
	 */
	public void setAccountingBatchReportDto(List<AccountingBatchReportDto> accountingBatchReportDto) {
		this.accountingBatchReportDtos = accountingBatchReportDto;
	}
	
	public double getTotalAccountingEntryErrorCount() {
		return totalAccountingEntryErrorCount;
	}

	public void setTotalAccountingEntryErrorCount(double totalAccountingEntryErrorCount) {
		this.totalAccountingEntryErrorCount = totalAccountingEntryErrorCount;
	}

}