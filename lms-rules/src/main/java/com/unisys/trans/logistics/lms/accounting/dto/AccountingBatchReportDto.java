package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AccountingBatchReportDto extends PersistenceObjectDto{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String accountHeader;
	
	private Date accountingDate;
	
	private String airWaybillNumber;
	
	private String flightNumber;
	
	private String invoiceNumber;
	
	private Date flightDate;
	
	private String glAccountNumber;
	
	private String arAccountNumber;
	
	private String costCenter;
	
	private BigDecimal creditAmountHostCurrency;
	
	private BigDecimal debitAmountHostCurrency;
	
	private String creditAmount;
	
	private String debitAmount;
	
	
	
	public String getCreditAmount() {
		return creditAmount;
	}



	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}



	public String getDebitAmount() {
		return debitAmount;
	}



	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}



	/**
	 * @return the accountHeader
	 */
	public String getAccountHeader() {
		return accountHeader;
	}



	/**
	 * @param accountHeader the accountHeader to set
	 */
	public void setAccountHeader(String accountHeader) {
		this.accountHeader = accountHeader;
	}



	/**
	 * @return the accountingDate
	 */
	public Date getAccountingDate() {
		return accountingDate;
	}



	/**
	 * @param accountingDate the accountingDate to set
	 */
	public void setAccountingDate(Date accountingDate) {
		this.accountingDate = accountingDate;
	}



	/**
	 * @return the airWaybillNumber
	 */
	public String getAirWaybillNumber() {
		return airWaybillNumber;
	}



	/**
	 * @param airWaybillNumber the airWaybillNumber to set
	 */
	public void setAirWaybillNumber(String airWaybillNumber) {
		this.airWaybillNumber = airWaybillNumber;
	}



	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}



	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}



	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}



	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}



	/**
	 * @return the flightDate
	 */
	public Date getFlightDate() {
		return flightDate;
	}



	/**
	 * @param flightDate the flightDate to set
	 */
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}



	/**
	 * @return the glAccountNumber
	 */
	public String getGlAccountNumber() {
		return glAccountNumber;
	}



	/**
	 * @param glAccountNumber the glAccountNumber to set
	 */
	public void setGlAccountNumber(String glAccountNumber) {
		this.glAccountNumber = glAccountNumber;
	}



	/**
	 * @return the arAccountNumber
	 */
	public String getArAccountNumber() {
		return arAccountNumber;
	}



	/**
	 * @param arAccountNumber the arAccountNumber to set
	 */
	public void setArAccountNumber(String arAccountNumber) {
		this.arAccountNumber = arAccountNumber;
	}



	/**
	 * @return the costCenter
	 */
	public String getCostCenter() {
		return costCenter;
	}



	/**
	 * @param costCenter the costCenter to set
	 */
	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}



	/**
	 * @return the creditAmountHostCurrency
	 */



	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}



	/**
	 * @return the creditAmountHostCurrency
	 */
	public BigDecimal getCreditAmountHostCurrency() {
		return creditAmountHostCurrency;
	}



	/**
	 * @param creditAmountHostCurrency the creditAmountHostCurrency to set
	 */
	public void setCreditAmountHostCurrency(BigDecimal creditAmountHostCurrency) {
		this.creditAmountHostCurrency = creditAmountHostCurrency;
	}



	/**
	 * @return the debitAmountHostCurrency
	 */
	public BigDecimal getDebitAmountHostCurrency() {
		return debitAmountHostCurrency;
	}



	/**
	 * @param debitAmountHostCurrency the debitAmountHostCurrency to set
	 */
	public void setDebitAmountHostCurrency(BigDecimal debitAmountHostCurrency) {
		this.debitAmountHostCurrency = debitAmountHostCurrency;
	}
	
}


