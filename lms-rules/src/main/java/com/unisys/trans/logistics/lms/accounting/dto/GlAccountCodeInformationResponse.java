/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

/**
 * 
 * @author UGSI
 *
 */

package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * GlAccountCodeInformationResponse</code> contains all the details 
 * of response sent from the service for a given GlAccountCodeRequest.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li>glAccountCodeDto
 * <li>glAccountCodeDtoList
 * </ul>
 */
public class GlAccountCodeInformationResponse extends AbstractResponse
{

	private static final long serialVersionUID = 1L;
	
	
	private GlAccountCodeDto glAccountCodeDto = new GlAccountCodeDto();
	
	private List<GlAccountCodeDto> glAccountCodeDtoList=new ArrayList<GlAccountCodeDto>();
	
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
	 * @return the glAccountCodeDto
	 */
	public GlAccountCodeDto getGlAccountCodeDto() {
		return glAccountCodeDto;
	}

	/**
	 * @param glAccountCodeDto the glAccountCodeDto to set
	 */
	public void setGlAccountCodeDto(GlAccountCodeDto glAccountCodeDto) {
		this.glAccountCodeDto = glAccountCodeDto;
	}


	/**
	 * @return the glAccountCodeDtoList
	 */
	public List<GlAccountCodeDto> getGlAccountCodeDtoList() {
		return glAccountCodeDtoList;
	}

	/**
	 * @param glAccountCodeDtoList the glAccountCodeDtoList to set
	 */
	public void setGlAccountCodeDtoList(List<GlAccountCodeDto> glAccountCodeDtoList) {
		this.glAccountCodeDtoList = glAccountCodeDtoList;
	}

}
