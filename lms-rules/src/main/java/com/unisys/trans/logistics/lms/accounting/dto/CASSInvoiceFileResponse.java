package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 *<code>CASSInvoiceFileResponse</code> contains all the details 
 * of response sent from the service .
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li>cassFileUploadDto
 * </ul>
 */

public class CASSInvoiceFileResponse  extends AbstractResponse {
	
	
	 /**
     * Unique serial version UID.
     */
	private static final long serialVersionUID = 1L;
	
	 /**
     * Attribute to hold <code>cassFileUploadDto</code> property.
     */
	CASSInvoiceFileDetailsDto cassFileUploadDto;

	/**
	 * @return the cassFileUploadDto
	 */
	public CASSInvoiceFileDetailsDto getCassFileUploadDto() {
		return cassFileUploadDto;
	}

	/**
	 * @param cassFileUploadDto the cassFileUploadDto to set
	 */
	public void setCassFileUploadDto(CASSInvoiceFileDetailsDto cassFileUploadDto) {
		this.cassFileUploadDto = cassFileUploadDto;
	}

}
