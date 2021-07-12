package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class AccountingInvoiceDCMRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private AccountingCCADCMInfoDto accountingCCADCMInfoDto = new AccountingCCADCMInfoDto();

	/**
	 * @return the accountingCCADCMInfoDto
	 */
	public AccountingCCADCMInfoDto getAccountingCCADCMInfoDto() {
		return accountingCCADCMInfoDto;
	}

	/**
	 * @param accountingCCADCMInfoDto the accountingCCADCMInfoDto to set
	 */
	public void setAccountingCCADCMInfoDto(
			AccountingCCADCMInfoDto accountingCCADCMInfoDto) {
		this.accountingCCADCMInfoDto = accountingCCADCMInfoDto;
	}
	
}
