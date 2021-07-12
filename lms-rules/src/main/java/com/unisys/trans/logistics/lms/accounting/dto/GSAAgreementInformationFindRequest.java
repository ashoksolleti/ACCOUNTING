package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;



public class GSAAgreementInformationFindRequest extends AbstractRequest
{
	private static final long serialVersionUID = 1L;
	private GSAAgreementFindDto gSAAgreementFindDto =new GSAAgreementFindDto();
	/**
	 * @return the gSAAgreementFindDto
	 */
	public GSAAgreementFindDto getgSAAgreementFindDto() {
		return gSAAgreementFindDto;
	}
	/**
	 * @param gSAAgreementFindDto the gSAAgreementFindDto to set
	 */
	public void setgSAAgreementFindDto(GSAAgreementFindDto gSAAgreementFindDto) {
		this.gSAAgreementFindDto = gSAAgreementFindDto;
	}
}
