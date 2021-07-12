package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class UPSIataMessageRequest extends AbstractResponse {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2521974466754191553L;
	private String responseMessage;

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
}
