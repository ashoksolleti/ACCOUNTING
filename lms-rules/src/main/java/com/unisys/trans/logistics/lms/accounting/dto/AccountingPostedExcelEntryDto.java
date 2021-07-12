package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AccountingPostedExcelEntryDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;
	private Long oId = 0l;
	
	@Override
	public Long getOId() {
		return this.oId;
	}
	
	private String accountNumber;
	private String accountHeader;
	private BigDecimal craDebit;
	private BigDecimal craCredit;
	private BigDecimal sapDebit;
	private BigDecimal sapCredit;

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHeader() {
		return accountHeader;
	}
	public void setAccountHeader(String accountHeader) {
		this.accountHeader = accountHeader;
	}
	public BigDecimal getCraDebit() {
		return craDebit;
	}
	public void setCraDebit(BigDecimal craDebit) {
		this.craDebit = craDebit;
	}
	public BigDecimal getCraCredit() {
		return craCredit;
	}
	public void setCraCredit(BigDecimal craCredit) {
		this.craCredit = craCredit;
	}
	public BigDecimal getSapDebit() {
		return sapDebit;
	}
	public void setSapDebit(BigDecimal sapDebit) {
		this.sapDebit = sapDebit;
	}
	public BigDecimal getSapCredit() {
		return sapCredit;
	}
	public void setSapCredit(BigDecimal sapCredit) {
		this.sapCredit = sapCredit;
	}
	public BigDecimal getDiffCredit() {
		return ((this.sapCredit.subtract(this.craCredit)).compareTo(BigDecimal.ZERO) > 0)
					?(this.sapCredit.subtract(this.craCredit))
						:(this.craCredit.subtract(this.sapCredit));
	}
	public BigDecimal getDiffDebit() {
		return ((this.sapDebit.subtract(this.craDebit)).compareTo(BigDecimal.ZERO) > 0)
				?(this.sapDebit.subtract(this.craDebit))
					:(this.craDebit.subtract(this.sapDebit));
	}
}
