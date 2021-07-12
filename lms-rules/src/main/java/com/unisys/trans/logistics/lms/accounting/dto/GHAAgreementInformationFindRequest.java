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
 * <code>GHAAgreementInformationFindRequest</code> contains all the attributes
 * which are required for processing the retrieve request from user.
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

public class GHAAgreementInformationFindRequest extends AbstractRequest
{

	private static final long serialVersionUID = 1L;
	
	private GHAAgreementDto gHAAgreementDto =new GHAAgreementDto();
	
	private GHAAgreementSlidingRatesDto gHAAgreementSlidingRatesDto=new GHAAgreementSlidingRatesDto();

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
	public GHAAgreementSlidingRatesDto getgHAAgreementSlidingRatesDto() {
		return gHAAgreementSlidingRatesDto;
	}

	/**
	 * @param gHAAgreementSlidingRatesDto the gHAAgreementSlidingRatesDto to set
	 */
	public void setgHAAgreementSlidingRatesDto(GHAAgreementSlidingRatesDto gHAAgreementSlidingRatesDto) {
		this.gHAAgreementSlidingRatesDto = gHAAgreementSlidingRatesDto;
	}
	
}
