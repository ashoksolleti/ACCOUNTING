package com.unisys.trans.logistics.lms.utils.dto;

import org.w3c.dom.Document;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class PostResponse extends AbstractResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7828789710519964696L;
	
	private Document espvalServiceResponse;

	/**
	 * @return the espvalServiceResponse
	 */
	public Document getEspvalServiceResponse() {
		return espvalServiceResponse;
	}

	/**
	 * @param espvalServiceResponse the espvalServiceResponse to set
	 */
	public void setEspvalServiceResponse(Document espvalServiceResponse) {
		this.espvalServiceResponse = espvalServiceResponse;
	}

}
