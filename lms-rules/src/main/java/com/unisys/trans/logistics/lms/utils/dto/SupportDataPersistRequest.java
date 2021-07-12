package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class SupportDataPersistRequest extends AbstractRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    /**
     * Attribute to holds the list of <code>supportDataUploadDto</code> property.
     */
	
	private List<SupportDataUploadDto> supportDataUploadDtos;

	/**
	 * @return the supportDataUploadDtos
	 */
	public List<SupportDataUploadDto> getSupportDataUploadDtos() {
		return this.supportDataUploadDtos;
	}

	/**
	 * @param supportDataUploadDtos the supportDataUploadDtos to set
	 */
	public void setSupportDataUploadDtos(final List<SupportDataUploadDto> pSupportDataUploadDto) {
		this.supportDataUploadDtos = pSupportDataUploadDto;
	}
}
