package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AccountingEntryLinePostedDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;
	private Long oId = 0l;
	
	@Override
	public Long getOId() {
		return this.oId;
	}
	
	private String awbNumber;
	private String accountNumber;
	private String accountHeader;
	private String indicator;
	private BigDecimal amount;
	private long companyCode;
	
	public String getAwbNumber() {
		return awbNumber;
	}
	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

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
	public String getIndicator() {
		return indicator;
	}
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public long getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(long companyCode) {
		this.companyCode = companyCode;
	}
	

}
