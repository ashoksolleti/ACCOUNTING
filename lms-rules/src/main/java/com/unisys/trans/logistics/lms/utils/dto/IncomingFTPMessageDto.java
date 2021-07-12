package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;


public class IncomingFTPMessageDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Attribute to hold the <code>responseMessage</code> property.
     */
	
	private String responseMessage;
	
	/**
	 * Attribute to hold the <code>queueName</code> property.
     */
	
	private String queueName;
	
	/**
	 * Attribute to hold the <code>xmlRequest</code> property.
     */
	
	private boolean xmlRequest;
	
	/**
	 * Attribute to hold the <code>xmlRequest</code> property.
     */
	private String subFolder;

	/**
	 * @return the responseMessage
	 */
	public String getResponseMessage() {
		return this.responseMessage;
	}

	/**
	 * @param pResponseMessage the responseMessage to set
	 */
	public void setResponseMessage(final String pResponseMessage) {
		this.responseMessage = pResponseMessage;
	}

	/**
	 * @return the queueName
	 */
	public String getQueueName() {
		return this.queueName;
	}

	/**
	 * @param pQueueName the queueName to set
	 */
	public void setQueueName(final String pQueueName) {
		this.queueName = pQueueName;
	}

	/**
	 * @return the xmlRequest
	 */
	public boolean isXmlRequest() {
		return this.xmlRequest;
	}

	/**
	 * @param pXmlRequest the xmlRequest to set
	 */
	public void setXmlRequest(final boolean pXmlRequest) {
		this.xmlRequest = pXmlRequest;
	}

	/**
	 * @return the subFolder
	 */
	public String getSubFolder() {
		return this.subFolder;
	}

	/**
	 * @param pSubFolder the subFolder to set
	 */
	public void setSubFolder(final String pSubFolder) {
		this.subFolder = pSubFolder;
	}

}
