package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class SupportDataResponse extends AbstractResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<SupportDataUploadDto> supportDataUploadDtos;

	/**
	 * @return the supportDataUploadDtos
	 */
	public List<SupportDataUploadDto> getSupportDataUploadDtos() {
		return this.supportDataUploadDtos;
	}

	/**
	 * @param pSupportDataUploadDtos the supportDataUploadDtos to set
	 */
	public void setSupportDataUploadDtos(List<SupportDataUploadDto> pSupportDataUploadDtos) {
		this.supportDataUploadDtos = pSupportDataUploadDtos;
	}


	
}
