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
 * <code>InterlineOutwardBillingPersistRequest </code> is a container 
 * object for holding the entire content of a <code>InterlineOutwardBillingAgreement</code>.
 * <p>This is used while persisting the agreement details in the database.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>serialVersionUID 
 * <li>interlineOutwardBillingDto 
 * <li>interlineOutwardBillingSlidingRatesDto
 * <li>interlineOutwardBillingDtoList
 * <li>deleteInterlineOutwardBilling
 * </code>
 * </ul>
 * 
 */


public class InterlineOutwardBillingPersistRequest extends AbstractRequest
{

	private static final long serialVersionUID = 1L;
	
	private InterlineOutwardBillingDto interlineOutwardBillingDto =new InterlineOutwardBillingDto();
	
	private InterlineOutwardBillingSlidingRatesDto interlineOutwardBillingSlidingRatesDto=new InterlineOutwardBillingSlidingRatesDto();
	
	private List<InterlineOutwardBillingDto> interlineOutwardBillingDtoList=new CopyOnWriteArrayList<InterlineOutwardBillingDto>();
	
	private List<InterlineOutwardBillingDto> deleteInterlineOutwardBillings = new CopyOnWriteArrayList<InterlineOutwardBillingDto>();
	
	private String specificAirline;
	


	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

	/**
	 * @return the interlineOutwardBillingDto
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
	 * @return the interlineOutwardBillingSlidingRatesDto
	 */
	public InterlineOutwardBillingSlidingRatesDto getInterlineOutwardBillingSlidingRatesDto() {
		return interlineOutwardBillingSlidingRatesDto;
	}

	/**
	 * @param interlineOutwardBillingSlidingRatesDto the interlineOutwardBillingSlidingRatesDto to set
	 */
	public void setInterlineOutwardBillingSlidingRatesDto(InterlineOutwardBillingSlidingRatesDto interlineOutwardBillingSlidingRatesDto) {
		this.interlineOutwardBillingSlidingRatesDto = interlineOutwardBillingSlidingRatesDto;
	}

	/**
	 * @return the interlineOutwardBillingDtoList
	 */
	public List<InterlineOutwardBillingDto> getInterlineOutwardBillingDtoList() {
		return interlineOutwardBillingDtoList;
	}

	/**
	 * @param interlineOutwardBillingDtoList the interlineOutwardBillingDtoList to set
	 */
	public void setInterlineOutwardBillingDtoList(List<InterlineOutwardBillingDto> interlineOutwardBillingDtoList) {
		this.interlineOutwardBillingDtoList = interlineOutwardBillingDtoList;
	}

	/**
	 * @return the deleteInterlineOutwardBillings
	 */
	public List<InterlineOutwardBillingDto> getDeleteInterlineOutwardBillings() {
		return deleteInterlineOutwardBillings;
	}

	/**
	 * @param deleteInterlineOutwardBillings the deleteInterlineOutwardBillingsAgreements to set
	 */
	public void setDeleteInterlineOutwardBillings(List<InterlineOutwardBillingDto> deleteInterlineOutwardBillings) {
		this.deleteInterlineOutwardBillings = deleteInterlineOutwardBillings;
	}

	
}
