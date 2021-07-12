/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
/**
 * 
 * @author SaifAhmad
 *
 */

package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * GHAAgreementInformationResponse</code> contains all the details 
 * of response sent from the service for a given GHAAgreementRequest.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li>gHAAgreementDto
 * <li>GHAAgreementSlidingRatesDto
 * <li>GHAAgreementSlidingRatesDtoList
 * <li>gHAAgreementDtoList
 * <li>duplicateProrateFactorConfirmationMessage
 * <li>noRecordFoundMessage
 * </ul>
 */
public class GHAAgreementInformationResponse extends AbstractResponse
{

	private static final long serialVersionUID = 1L;
	
	
	private GHAAgreementDto gHAAgreementDto = new GHAAgreementDto();
	
	private GHAAgreementSlidingRatesDto GHAAgreementSlidingRatesDto = new GHAAgreementSlidingRatesDto();
	
	private List<GHAAgreementSlidingRatesDto> GHAAgreementSlidingRatesDtoList=new CopyOnWriteArrayList<GHAAgreementSlidingRatesDto>();
	
	private List<GHAAgreementDto> gHAAgreementDtoList=new CopyOnWriteArrayList<GHAAgreementDto>();
	
	private String duplicateProrateFactorConfirmationMessage;
	
	private String noRecordFoundMessage;
	
	private boolean error;

	
	
	/**
	 * @return boolean
	 * Returns the error state of the object
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * @param boolean
	 *  error sets the error state of the object
	 */
	public void setError(boolean error) {
		this.error = error;
	}

	/**
	 * @return the gHAAgreementDto
	 */
	public GHAAgreementDto getgHAAgreementDto() {
		return gHAAgreementDto;
	}

	/**
	 * @param gHAAgreementDto the gHAAgreementDto to set
	 */
	public void setgHAAgreementDto(GHAAgreementDto gHAAgreementDto) {
		this.gHAAgreementDto = gHAAgreementDto;
	}

	/**
	 * @return the GHAAgreementSlidingRatesDto
	 */
	public GHAAgreementSlidingRatesDto getGHAAgreementSlidingRatesDto() {
		return GHAAgreementSlidingRatesDto;
	}

	/**
	 * @param GHAAgreementSlidingRatesDto the 
	 * GHAAgreementSlidingRatesDto to set
	 */
	public void setGHAAgreementSlidingRatesDto(GHAAgreementSlidingRatesDto GHAAgreementSlidingRatesDto) {
		this.GHAAgreementSlidingRatesDto = GHAAgreementSlidingRatesDto;
	}

	/**
	 * @return the GHAAgreementSlidingRatesDtoList
	 */
	public List<GHAAgreementSlidingRatesDto> getGHAAgreementSlidingRatesDtoList() {
		return GHAAgreementSlidingRatesDtoList;
	}

	/**
	 * @param GHAAgreementSlidingRatesDtoList 
	 * the GHAAgreementSlidingRatesDtoList to set
	 */
	public void setGHAAgreementSlidingRatesDtoList(
			List<GHAAgreementSlidingRatesDto> GHAAgreementSlidingRatesDtoList) {
		this.GHAAgreementSlidingRatesDtoList = GHAAgreementSlidingRatesDtoList;
	}

	/**
	 * @return the gHAAgreementDtoList
	 */
	public List<GHAAgreementDto> getgHAAgreementDtoList() {
		return gHAAgreementDtoList;
	}

	/**
	 * @param gHAAgreementDtoList the gHAAgreementDtoList to set
	 */
	public void setgHAAgreementDtoList(List<GHAAgreementDto> gHAAgreementDtoList) {
		this.gHAAgreementDtoList = gHAAgreementDtoList;
	}

	/**
	 * @return the duplicateProrateFactorConfirmationMessage
	 */
	public String getDuplicateProrateFactorConfirmationMessage() {
		return duplicateProrateFactorConfirmationMessage;
	}

	/**
	 * @param duplicateProrateFactorConfirmationMessage 
	 * the duplicateProrateFactorConfirmationMessage to set
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
	
}
