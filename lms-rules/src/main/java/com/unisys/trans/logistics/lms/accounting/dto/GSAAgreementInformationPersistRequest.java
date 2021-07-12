package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;


public class GSAAgreementInformationPersistRequest extends AbstractRequest
{

	private static final long serialVersionUID = 1L;
	
	private GSAAgreementDto gSAAgreementDto =new GSAAgreementDto();
	
	private GSAAgreementRatesDto gSAAgreementRatesDto=new GSAAgreementRatesDto();
	
	private List<GSAAgreementDto> gSAAgreementDtoList=new ArrayList<GSAAgreementDto>();
	
	private List<GSAAgreementDto> deleteGsaAgreements = new ArrayList<GSAAgreementDto>();

	/**
	 * @return the gSAAgreementDto
	 */
	public GSAAgreementDto getgSAAgreementDto() {
		return gSAAgreementDto;
	}

	/**
	 * @param gSAAgreementDto the gSAAgreementDto to set
	 */
	public void setgSAAgreementDto(GSAAgreementDto gSAAgreementDto) {
		this.gSAAgreementDto = gSAAgreementDto;
	}

	/**
	 * @return the gSAAgreementRatesDto
	 */
	public GSAAgreementRatesDto getgSAAgreementRatesDto() {
		return gSAAgreementRatesDto;
	}

	/**
	 * @param gSAAgreementRatesDto the gSAAgreementRatesDto to set
	 */
	public void setgSAAgreementRatesDto(GSAAgreementRatesDto gSAAgreementRatesDto) {
		this.gSAAgreementRatesDto = gSAAgreementRatesDto;
	}

	/**
	 * @return the gSAAgreementDtoList
	 */
	public List<GSAAgreementDto> getgSAAgreementDtoList() {
		return gSAAgreementDtoList;
	}

	/**
	 * @param gSAAgreementDtoList the gSAAgreementDtoList to set
	 */
	public void setgSAAgreementDtoList(List<GSAAgreementDto> gSAAgreementDtoList) {
		this.gSAAgreementDtoList = gSAAgreementDtoList;
	}

	/**
	 * @return the deleteGsaAgreements
	 */
	public List<GSAAgreementDto> getDeleteGsaAgreements() {
		return deleteGsaAgreements;
	}

	/**
	 * @param deleteGsaAgreements the deleteGsaAgreements to set
	 */
	public void setDeleteGsaAgreements(List<GSAAgreementDto> deleteGsaAgreements) {
		this.deleteGsaAgreements = deleteGsaAgreements;
	}

	
	
	
	
}
