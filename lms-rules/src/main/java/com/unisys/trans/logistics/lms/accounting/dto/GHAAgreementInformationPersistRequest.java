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

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>GHAAgreementInformationPersistRequest </code> is a container 
 * object for holding the entire content of a <code>GHAAgreement</code>.
 * <p>This is used while persisting the agreement details in the database.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>serialVersionUID 
 * <li>gHAAgreementDto 
 * <li>gHAAgreementSlidingRatesDto
 * <li>gHAAgreementDtoList
 * <li>deleteGhaAgreements
 * </code>
 * </ul>
 * 
 */


public class GHAAgreementInformationPersistRequest extends AbstractRequest
{

	private static final long serialVersionUID = 1L;
	
	private GHAAgreementDto gHAAgreementDto =new GHAAgreementDto();
	
	private GHAAgreementSlidingRatesDto gHAAgreementSlidingRatesDto=new GHAAgreementSlidingRatesDto();
	
	private List<GHAAgreementDto> gHAAgreementDtoList=new CopyOnWriteArrayList<GHAAgreementDto>();
	
	private List<GHAAgreementDto> deleteGhaAgreements = new CopyOnWriteArrayList<GHAAgreementDto>();

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
	 * @return the gHAAgreementSlidingRatesDto
	 */
	public GHAAgreementSlidingRatesDto getgHAAgreementSlidingRatesDto() {
		return gHAAgreementSlidingRatesDto;
	}

	/**
	 * @param gHAAgreementSlidingRatesDto the gHAAgreementSlidingRatesDto to set
	 */
	public void setgHAAgreementSlidingRatesDto(GHAAgreementSlidingRatesDto gHAAgreementSlidingRatesDto) {
		this.gHAAgreementSlidingRatesDto = gHAAgreementSlidingRatesDto;
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
	 * @return the deleteGhaAgreements
	 */
	public List<GHAAgreementDto> getDeleteGhaAgreements() {
		return deleteGhaAgreements;
	}

	/**
	 * @param deleteGhaAgreements the deleteGhaAgreements to set
	 */
	public void setDeleteGhaAgreements(List<GHAAgreementDto> deleteGhaAgreements) {
		this.deleteGhaAgreements = deleteGhaAgreements;
	}

	
}
