/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
/**
 * @author SaifAhmad
 */

package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>GHAAgreementInformationDeleteRequest</code> contains all attributes
 * which are required for processing the delete request from user.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>serialVersionUID 
 * <li>gHAAgreementDto 
 * <li>gHAAgreementSlidingRatesDto
 * </code>
 * </ul>
 * 
 */

public class GHAAgreementInformationDeleteRequest extends AbstractRequest 
{

	private static final long serialVersionUID = 1L;
	
	private GHAAgreementDto gHAAgreementDto =new GHAAgreementDto();
	
	private GHAAgreementSlidingRatesDto GHAAgreementSlidingRatesDto=new GHAAgreementSlidingRatesDto();

	/**
	 * @param gHAAgreementDto
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
	 * @param gHAAgreementSlidingRatesDto
	 */
	public GHAAgreementSlidingRatesDto getGHAAgreementSlidingRatesDto() {
		return GHAAgreementSlidingRatesDto;
	}

	/**
	 * @param gHAAgreementSlidingRatesDto the gHAAgreementSlidingRatesDto to set
	 */
	public void setGHAAgreementSlidingRatesDto(GHAAgreementSlidingRatesDto GHAAgreementSlidingRatesDto) {
		this.GHAAgreementSlidingRatesDto = GHAAgreementSlidingRatesDto;
	}	
}
