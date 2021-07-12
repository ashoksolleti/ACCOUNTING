package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;
import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;


public class GSAAgreementInformationResponse extends AbstractResponse
{

	private static final long serialVersionUID = 1L;
	
	private GSAAgreementDto gSAAgreementDto =new GSAAgreementDto();
	
	private GSAAgreementRatesDto gSAAgreementRatesDto=new GSAAgreementRatesDto();
	
	private List<GSAAgreementRatesDto> gSAAgreementRatesDtoList=new ArrayList<GSAAgreementRatesDto>();
	
	private List<GSAAgreementDto> gSAAgreementDtoList=new ArrayList<GSAAgreementDto>();
	
	private String duplicateProrateFactorConfirmationMessage;
	
	private String noRecordFoundMessage;

	private boolean error;
	
	
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
	 * @return the gSAAgreementRatesDtoList
	 */
	public List<GSAAgreementRatesDto> getgSAAgreementRatesDtoList() {
		return gSAAgreementRatesDtoList;
	}

	/**
	 * @param gSAAgreementRatesDtoList the gSAAgreementRatesDtoList to set
	 */
	public void setgSAAgreementRatesDtoList(
			List<GSAAgreementRatesDto> gSAAgreementRatesDtoList) {
		this.gSAAgreementRatesDtoList = gSAAgreementRatesDtoList;
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
	 * @return the duplicateProrateFactorConfirmationMessage
	 */
	public String getDuplicateProrateFactorConfirmationMessage() {
		return duplicateProrateFactorConfirmationMessage;
	}

	/**
	 * @param duplicateProrateFactorConfirmationMessage the duplicateProrateFactorConfirmationMessage to set
	 */
	public void setDuplicateProrateFactorConfirmationMessage(
			String duplicateProrateFactorConfirmationMessage) {
		this.duplicateProrateFactorConfirmationMessage = duplicateProrateFactorConfirmationMessage;
	}

	/**
	 * @return the noRecordFoundMessage
	 */
	public String getNoRecordFoundMessage() {
		return noRecordFoundMessage;
	}

	/**
	 * @param noRecordFoundMessage the noRecordFoundMessage to set
	 */
	public void setNoRecordFoundMessage(String noRecordFoundMessage) {
		this.noRecordFoundMessage = noRecordFoundMessage;
	}

	/**
	 * @return the error
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(boolean error) {
		this.error = error;
	}
}
