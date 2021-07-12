package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.framework.preferences.TargetsUploadDto;

public class StationRestrictionUploadResponse extends AbstractResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String runOid;
	
	TargetsUploadDto targetsUploadDto;

	/**
	 * @return the targetsUploadDto
	 */
	public TargetsUploadDto getTargetsUploadDto() {
		return targetsUploadDto;
	}

	/**
	 * @param targetsUploadDto the targetsUploadDto to set
	 */
	public void setTargetsUploadDto(TargetsUploadDto targetsUploadDto) {
		this.targetsUploadDto = targetsUploadDto;
	}


	/**
	 * @return the runOid
	 */
	public String getRunOid() {
		return runOid;
	}

	/**
	 * @param runOid the runOid to set
	 */
	public void setRunOid(String runOid) {
		this.runOid = runOid;
	}

}
