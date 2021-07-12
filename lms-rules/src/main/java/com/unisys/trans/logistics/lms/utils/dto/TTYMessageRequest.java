package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.RequestHeader;

public class TTYMessageRequest extends PersistenceObjectDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3906430323941495157L;
	private String originalMessage;
	private RequestHeader requestHeader;
	private List<String> addresses;
	private String emailSubject;
	private String environment;
	private String wrkMessage;

	/**
	 * @return the originalMessage
	 */
	public String getOriginalMessage() {
		return originalMessage;
	}

	/**
	 * @param originalMessage the originalMessage to set
	 */
	public void setOriginalMessage(String originalMessage) {
		this.originalMessage = originalMessage;
	}

	/**
	 * @return the requestHeader
	 */
	public RequestHeader getRequestHeader() {
		return requestHeader;
	}

	/**
	 * @param requestHeader the requestHeader to set
	 */
	public void setRequestHeader(RequestHeader requestHeader) {
		this.requestHeader = requestHeader;
	}

	/**
	 * @return the addresses
	 */
	public List<String> getAddresses() {
		return addresses;
	}

	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	/**
	 * @return the emailSubject
	 */
	public String getEmailSubject() {
		return emailSubject;
	}

	/**
	 * @param emailSubject the emailSubject to set
	 */
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	/**
	 * @return the environment
	 */
	public String getEnvironment() {
		return environment;
	}

	/**
	 * @param environment the environment to set
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	/**
	 * @return the wrkMessage
	 */
	public String getWrkMessage() {
		return wrkMessage;
	}

	/**
	 * @param wrkMessage the wrkMessage to set
	 */
	public void setWrkMessage(String wrkMessage) {
		this.wrkMessage = wrkMessage;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	} 

}
