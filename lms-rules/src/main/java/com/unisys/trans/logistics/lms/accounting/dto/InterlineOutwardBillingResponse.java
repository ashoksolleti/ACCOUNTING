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


import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * InterlineOutwardBillingResponse</code> contains all the details 
 * of response sent from the service for a given InterlineOutwardBillingRequest.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li>interlineOutwardBillingDto
 * <li>InterlineOutwardBillingSlidingRatesDto
 * <li>InterlineOutwardBillingSlidingRatesDtoList
 * <li>interlineOutwardBillingDtoList
 * <li>duplicateProrateFactorConfirmationMessage
 * <li>noRecordFoundMessage
 * </ul>
 */
public class InterlineOutwardBillingResponse extends AbstractResponse
{

	private static final long serialVersionUID = 1L;
	
	
	private InterlineOutwardBillingDto interlineOutwardBillingDto = new InterlineOutwardBillingDto();
	
	
	private List<InterlineOutwardBillingDto> interlineOutwardBillingDtoList=new ArrayList<InterlineOutwardBillingDto>();
	
	private List<AccountingSisFileGenerationDto> accountingSisFileGenerationDtoList=new ArrayList<AccountingSisFileGenerationDto>();
	
	private String noRecordFoundMessage;
	
	private boolean error;
	
	private byte[] bytes;
	
	private String filePath;

	
	
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

	public List<AccountingSisFileGenerationDto> getAccountingSisFileGenerationDtoList() {
		return accountingSisFileGenerationDtoList;
	}

	public void setAccountingSisFileGenerationDtoList(
			List<AccountingSisFileGenerationDto> accountingSisFileGenerationDtoList) {
		this.accountingSisFileGenerationDtoList = accountingSisFileGenerationDtoList;
	}

	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
}
