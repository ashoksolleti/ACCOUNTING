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
 * <code>InterlineOutwardBillingDeleteRequest</code> contains all attributes
 * which are required for processing the delete request from user.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>serialVersionUID 
 * <li>interlineOutwardBillingDto
 * <li>interlineOutwardBillingSlidingRatesDto
 * </code>
 * </ul>
 * 
 */

public class InterlineOutwardBillingDeleteRequest extends AbstractRequest 
{

	private static final long serialVersionUID = 1L;
	
	private InterlineOutwardBillingDto interlineOutwardBillingDto =new InterlineOutwardBillingDto();
	
	private InterlineOutwardBillingSlidingRatesDto interlineOutwardBillingSlidingRatesDto=new InterlineOutwardBillingSlidingRatesDto();

	/**
	 * @param interlineOutwardBillingDto
	 */
	public InterlineOutwardBillingDto getInterlineOutwardBillingDto() {
		return interlineOutwardBillingDto;
	}

	/**
	 * @param interlineOutwardBillingDto the interlineOutwardBillingDto to set
	 */
	public void setInterlineOutwardBillingDto(InterlineOutwardBillingDto interlineOutwardBillingDto) {
		this.interlineOutwardBillingDto = interlineOutwardBillingDto;
	}

	/**
	 * @param interlineOutwardBillingDtoSlidingRatesDto
	 */
	public InterlineOutwardBillingSlidingRatesDto getInterlineOutwardBillingDtoSlidingRatesDto() {
		return interlineOutwardBillingSlidingRatesDto;
	}

	/**
	 * @param interlineOutwardBillingDtoSlidingRatesDto the interlineOutwardBillingDtoSlidingRatesDto to set
	 */
	public void setInterlineOutwardBillingSlidingRatesDto(InterlineOutwardBillingSlidingRatesDto interlineOutwardBillingDtoSlidingRatesDto) {
		this.interlineOutwardBillingSlidingRatesDto = interlineOutwardBillingSlidingRatesDto;
	}	
}
