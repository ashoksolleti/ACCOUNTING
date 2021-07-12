/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;
import java.util.Set;

/** 
 * 
 * @author KV5
 * 
 */
public class InterlineParticipantInvoiceRequest extends
		ParticipantInvoiceRequest {
	
	private static final long serialVersionUID = -4496390016903607120L;
	private String cassCountry;
	List<AccountingParticipantDto> accountingParticipantDtos;
	
	private boolean specificAirlineParameter = false;

	public boolean isSpecificAirlineParameter() {
		return specificAirlineParameter;
	}

	public void setSpecificAirlineParameter(boolean specificAirlineParameter) {
		this.specificAirlineParameter = specificAirlineParameter;
	}

	private Set<InterlineParticipantInvoiceSummaryDto> interlineParticipantInvoiceSummaryDto;


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