package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.InvoiceParticipantAccountType;

public class GSAParticipantInvoiceRequest extends ParticipantInvoiceRequest {
	
	private static final long serialVersionUID = 1L;
	private String country;
	private InvoiceParticipantAccountType accountType;
	List<String> accounts;
	
	public List<String> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<String> accounts) {
		this.accounts = accounts;
	}
	public InvoiceParticipantAccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(InvoiceParticipantAccountType accountType) {
		this.accountType = accountType;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	List<AccountingParticipantDto> accountingParticipantDtos;
	
	public List<AccountingParticipantDto> getAccountingParticipantDtos() {
		return accountingParticipantDtos;
	}
	public void setAccountingParticipantDtos(
			List<AccountingParticipantDto> accountingParticipantDtos) {
		this.accountingParticipantDtos = accountingParticipantDtos;
	}

}
