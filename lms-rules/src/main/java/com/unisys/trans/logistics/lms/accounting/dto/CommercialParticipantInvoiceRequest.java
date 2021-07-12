/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;


import com.unisys.trans.logistics.lms.framework.constants.InvoiceParticipantAccountType;

/** 
 * 
 * @author KV5
 * 
 */
public class CommercialParticipantInvoiceRequest extends
		ParticipantInvoiceRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4496390016903607120L;
	private String cassCountry;
	List<AccountingParticipantDto> accountingParticipantDtos;
	private InvoiceParticipantAccountType accountType;
	public String getCassCountry() {
		return cassCountry;
	}
	public void setCassCountry(String cassCountry) {
		this.cassCountry = cassCountry;
	}
	public List<AccountingParticipantDto> getAccountingParticipantDtos() {
		return accountingParticipantDtos;
	}
	public void setAccountingParticipantDtos(
			List<AccountingParticipantDto> accountingParticipantDtos) {
		this.accountingParticipantDtos = accountingParticipantDtos;
	}
	public InvoiceParticipantAccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(InvoiceParticipantAccountType accountType) {
		this.accountType = accountType;
	}
	
}