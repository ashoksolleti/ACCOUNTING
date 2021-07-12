package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class AccountingInvoiceDCMResponse extends AbstractResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<AccountingCCADCMInfoDto> accountingCCADCMInfoDtos; 
	
	private AccountingCCADCMInfoDto revisedCcaDcmInfoDto;
	
	private AccountingCCADCMInfoDto previousCcaDcmInfoDto;
	
	private AccountingCCADCMInfoDto ccaDcmDetails;


	/**
	 * @return the revisedCcaDcmInfoDto
	 */
	public AccountingCCADCMInfoDto getRevisedCcaDcmInfoDto() {
		return revisedCcaDcmInfoDto;
	}

	/**
	 * @param revisedCcaDcmInfoDto the revisedCcaDcmInfoDto to set
	 */
	public void setRevisedCcaDcmInfoDto(AccountingCCADCMInfoDto revisedCcaDcmInfoDto) {
		this.revisedCcaDcmInfoDto = revisedCcaDcmInfoDto;
	}

	/**
	 * @return the previousCcaDcmInfoDto
	 */
	public AccountingCCADCMInfoDto getPreviousCcaDcmInfoDto() {
		return previousCcaDcmInfoDto;
	}

	/**
	 * @param previousCcaDcmInfoDto the previousCcaDcmInfoDto to set
	 */
	public void setPreviousCcaDcmInfoDto(
			AccountingCCADCMInfoDto previousCcaDcmInfoDto) {
		this.previousCcaDcmInfoDto = previousCcaDcmInfoDto;
	}

	/**
	 * @return the accountingCCADCMInfoDtos
	 */
	public List<AccountingCCADCMInfoDto> getAccountingCCADCMInfoDtos() {
		return accountingCCADCMInfoDtos;
	}

	/**
	 * @param accountingCCADCMInfoDtos the accountingCCADCMInfoDtos to set
	 */
	public void setAccountingCCADCMInfoDtos(
			List<AccountingCCADCMInfoDto> accountingCCADCMInfoDtos) {
		this.accountingCCADCMInfoDtos = accountingCCADCMInfoDtos;
	}

	/**
	 * @return the ccaDcmDetails
	 */
	public AccountingCCADCMInfoDto getCcaDcmDetails() {
		return ccaDcmDetails;
	}

	/**
	 * @param ccaDcmDetails the ccaDcmDetails to set
	 */
	public void setCcaDcmDetails(AccountingCCADCMInfoDto ccaDcmDetails) {
		this.ccaDcmDetails = ccaDcmDetails;
	}
	
}
