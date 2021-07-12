package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class GLQueueErrorResponse extends AbstractResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9111578311584318796L;
	
	private List<AccountingEntryErrorDto> accountingEntryErrorDto;

	public List<AccountingEntryErrorDto> getAccountingEntryErrorDto() {
		return accountingEntryErrorDto;
	}

	public void setAccountingEntryErrorDto(List<AccountingEntryErrorDto> accountingEntryErrorDto) {
		this.accountingEntryErrorDto = accountingEntryErrorDto;
	}
	
	

}
