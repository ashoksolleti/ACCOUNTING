package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class IncomingFTPMessageResponse extends AbstractResponse{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<IncomingFTPMessageDto> incomingFTPMessageDtos;
	/**
	 * Attribute to hold the <code>responseMessage</code> property.
     */
	
	private String responseMessage;
	
	/**
	 * Attribute to hold the <code>euCustomMessageInd</code> property.
     */
	private boolean euCustomMessageInd;
	
	/**
	 * Attribute to hold the <code>fileName</code> property.
     */
	private String fileName;
	
	/**
	 * Attribute to hold the <code>customMessage</code> property.
     */
	private  String customMessage;
	
	/**
	 * Attribute to hold the <code>originalMessage</code> property.
     */
	private  String originalMessage; 
	
	/**
	 * Attribute to hold the <code>customRetryMessage</code> property.
     */
	private  String customRetryMessage; 

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
	 * @return the incomingFTPMessageDtos
	 */
	public List<IncomingFTPMessageDto> getIncomingFTPMessageDtos() {
		return this.incomingFTPMessageDtos;
	}

	/**
	 * @param pIncomingFTPMessageDtos the incomingFTPMessageDtos to set
	 */
	public void setIncomingFTPMessageDtos(final List<IncomingFTPMessageDto> pIncomingFTPMessageDtos) {
		this.incomingFTPMessageDtos = pIncomingFTPMessageDtos;
	}
	
	/**
	 * @return the euCustomMessageInd
	 */
	public boolean isEuCustomMessageInd() {
		return euCustomMessageInd;
	}

	/**
	 * @param euCustomMessageInd the euCustomMessageInd to set
	 */
	public void setEuCustomMessageInd(boolean euCustomMessageInd) {
		this.euCustomMessageInd = euCustomMessageInd;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return this.fileName;
	}

	/**
	 * @param pFileName the fileName to set
	 */
	public void setFileName(final String pFileName) {
		this.fileName = pFileName;
	}
	
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
	 * @return the customMessage
	 */
	public String getCustomMessage() {
		return this.customMessage;
	}

	/**
	 * @param pCustomMessage the customMessage to set
	 */
	public void setCustomMessage(final String pCustomMessage) {
		this.customMessage = pCustomMessage;
	}
	
	/**
	 * @return the customRetryMessage
	 */
	public String getCustomRetryMessage() {
		return this.customRetryMessage;
	}

	/**
	 * @param pCustomRetryMessage the customRetryMessage to set
	 */
	public void setCustomRetryMessage(final String pCustomRetryMessage) {
		this.customRetryMessage = pCustomRetryMessage;
	}

}
