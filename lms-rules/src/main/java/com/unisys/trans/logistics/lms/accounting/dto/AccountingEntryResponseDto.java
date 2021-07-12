package com.unisys.trans.logistics.lms.accounting.dto;


import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingTriggeringPoints;

public class AccountingEntryResponseDto {

	private String triggerPoint;
	private List<AccountingEntryDto> accountingEntry;
	private BigDecimal total_credit_host;
	private BigDecimal total_debit_host;
	private BigDecimal total_credit_source;
	private BigDecimal total_debit_source;
	
	
	/**
	 * @return the triggerPoint
	 */
	public String getTriggerPoint() {
		return triggerPoint;
	}
	/**
	 * @param triggerPoint the triggerPoint to set
	 */
	public void setTriggerPoint(String triggerPoint) {
		this.triggerPoint = triggerPoint;
	}
	/**
	 * @return the accountingEntry
	 */
	public List<AccountingEntryDto> getAccountingEntry() {
		return accountingEntry;
	}
	/**
	 * @param accountingEntry the accountingEntry to set
	 */
	public void setAccountingEntry(List<AccountingEntryDto> accountingEntry) {
		this.accountingEntry = accountingEntry;
	}
	/**
	 * @return the total_credit_host
	 */
	public BigDecimal getTotal_credit_host() {
		return total_credit_host;
	}
	/**
	 * @param total_credit_host the total_credit_host to set
	 */
	public void setTotal_credit_host(BigDecimal total_credit_host) {
		this.total_credit_host = total_credit_host;
	}
	/**
	 * @return the total_debit_host
	 */
	public BigDecimal getTotal_debit_host() {
		return total_debit_host;
	}
	/**
	 * @param total_debit_host the total_debit_host to set
	 */
	public void setTotal_debit_host(BigDecimal total_debit_host) {
		this.total_debit_host = total_debit_host;
	}
	/**
	 * @return the total_credit_source
	 */
	public BigDecimal getTotal_credit_source() {
		return total_credit_source;
	}
	/**
	 * @param total_credit_source the total_credit_source to set
	 */
	public void setTotal_credit_source(BigDecimal total_credit_source) {
		this.total_credit_source = total_credit_source;
	}
	/**
	 * @return the total_debit_source
	 */
	public BigDecimal getTotal_debit_source() {
		return total_debit_source;
	}
	/**
	 * @param total_debit_source the total_debit_source to set
	 */
	public void setTotal_debit_source(BigDecimal total_debit_source) {
		this.total_debit_source = total_debit_source;
	}
	
}
