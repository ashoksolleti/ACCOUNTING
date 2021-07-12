/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

/** 
 
 * @author SeramRaK
 
 */
public class CASSParticipantInvoiceRequest extends ParticipantInvoiceRequest {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cassCountry;
	List<AccountingParticipantDto> accountingParticipantDtos;
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
	
}