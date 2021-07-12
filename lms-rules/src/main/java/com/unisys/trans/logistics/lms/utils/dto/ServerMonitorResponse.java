package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;


public class ServerMonitorResponse extends AbstractResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6472204753441027874L;
	private String response;
	private Integer messageCount;

	/**
	 * @return the response
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(String response) {
		this.response = response;
	}

	/**
	 * @return the messageCount
	 */
	public Integer getMessageCount() {
		return messageCount;
	}

	/**
	 * @param messageCount the messageCount to set
	 */
	public void setMessageCount(Integer messageCount) {
		this.messageCount = messageCount;
	}
}
