package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ServerMonitorRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6190563573139818682L;
	
	private String queueName;
	
	private String officeIdentifier;

	/**
	 * @return the officeIdentifier
	 */
	public String getOfficeIdentifier() {
		return officeIdentifier;
	}

	/**
	 * @param officeIdentifier the officeIdentifier to set
	 */
	public void setOfficeIdentifier(String officeIdentifier) {
		this.officeIdentifier = officeIdentifier;
	}

	/**
	 * @return the queueName
	 */
	public String getQueueName() {
		return queueName;
	}

	/**
	 * @param queueName the queueName to set
	 */
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

}
