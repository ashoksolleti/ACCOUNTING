package com.unisys.trans.logistics.lms.accounting.dto;


import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;


public class GSAAgreementInformationDeleteRequest extends AbstractRequest 
{

	private static final long serialVersionUID = 1L;
	
	private GSAAgreementDto gSAAgreementDto =new GSAAgreementDto();
	
	private GSAAgreementRatesDto gSAAgreementRatesDto=new GSAAgreementRatesDto();

	public GSAAgreementDto getgSAAgreementDto() {
		return gSAAgreementDto;
	}

	public void setgSAAgreementDto(GSAAgreementDto gSAAgreementDto) {
		this.gSAAgreementDto = gSAAgreementDto;
	}

	public GSAAgreementRatesDto getgSAAgreementRatesDto() {
		return gSAAgreementRatesDto;
	}

	public void setgSAAgreementRatesDto(GSAAgreementRatesDto gSAAgreementRatesDto) {
		this.gSAAgreementRatesDto = gSAAgreementRatesDto;
	}	
}
