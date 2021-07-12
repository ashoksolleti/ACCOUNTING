package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class QueueRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 560745537542946314L;

	
	private OfficeDto officeDto;

	/**
	 * @return the officeDto
	 */
	public OfficeDto getOfficeDto() {
		return officeDto;
	}

	/**
	 * @param officeDto the officeDto to set
	 */
	public void setOfficeDto(OfficeDto officeDto) {
		this.officeDto = officeDto;
	}

}
