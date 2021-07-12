package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class IncomingFTPMessageRequest extends AbstractRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Attribute to hold the <code>originalMessage</code> property.
     */
	private  String originalMessage; 
	    
	/**
	 * Attribute to hold the <code>header</code> property.
     */
	private  String header; 
	    
	/**
	 * Attribute to hold the <code>customMessage</code> property.
     */
	private  String customMessage; 
	
	/**
	 * Attribute to hold the <code>fromAddress</code> property.
     */
	private  String fromAddress; 
	
	/**
	 * Attribute to hold the <code>toAddress</code> property.
     */
	private  List<String> toAddress; 
	
	/**
	 * Attribute to hold the <code>carrierCode</code> property.
     */
	private  String carrierCode; 
	
	/**
	 * Attribute to hold the <code>tokenValue</code> property.
     */
	private  String tokenValue; 
	
	/**
	 * Attribute to hold the <code>euCustomMessageInd</code> property.
     */
	private boolean euCustomMessageInd;
	
	/**
	 * Attribute to hold the <code>fileName</code> property.
     */
	private String fileName;
	
	/**
	 * Attribute to hold the <code>customRetryMessage</code> property.
     */
	private  String customRetryMessage; 
	
	/**
	 * Attribute to hold the <code>customRetryMessage</code> property.
     */
	private  List<String> multipleMessages;
	
	/**
	 * Attribute to hold the <code>multipleMessageInd</code> property.
     */
	private boolean multipleMessageInd;
		
	/**
     * <code>Default constructor.</code>
     */
    public IncomingFTPMessageRequest() {

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
	 * @return the header
	 */
	public String getHeader() {
		return this.header;
	}

	/**
	 * @param pHeader the header to set
	 */
	public void setHeader(final String pHeader) {
		this.header = pHeader;
	}

	/**
	 * @return the customMessage
	 */
	public String getCustomMessage() {
		return customMessage;
	}

	/**
	 * @param customMessage the customMessage to set
	 */
	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}

	/**
	 * @return the fromAddress
	 */
	public String getFromAddress() {
		return fromAddress;
	}

	/**
	 * @param fromAddress the fromAddress to set
	 */
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	/**
	 * @return the toAddress
	 */
	public List<String> getToAddress() {
		if(this.toAddress == null) {
			this.toAddress = new ArrayList<String>();
		}
		return toAddress;
	}

	/**
	 * @param toAddress the toAddress to set
	 */
	public void setToAddress(List<String> toAddress) {
		this.toAddress = toAddress;
	}

	/**
	 * @return the carrierCode
	 */
	public String getCarrierCode() {
		return carrierCode;
	}

	/**
	 * @param carrierCode the carrierCode to set
	 */
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	/**
	 * @return the tokenValue
	 */
	public String getTokenValue() {
		return tokenValue;
	}

	/**
	 * @param tokenValue the tokenValue to set
	 */
	public void setTokenValue(String tokenValue) {
		this.tokenValue = tokenValue;
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

	/**
	 * @return the multipleMessages
	 */
	public List<String> getMultipleMessages() {
		return this.multipleMessages;
	}

	/**
	 * @param pMultipleMessages the multipleMessages to set
	 */
	public void setMultipleMessages(final List<String> pMultipleMessages) {
		this.multipleMessages = pMultipleMessages;
	}

	/**
	 * @return the multipleMessageInd
	 */
	public boolean isMultipleMessageInd() {
		return this.multipleMessageInd;
	}

	/**
	 * @param pMultipleMessageInd the multipleMessageInd to set
	 */
	public void setMultipleMessageInd(final boolean pMultipleMessageInd) {
		this.multipleMessageInd = pMultipleMessageInd;
	}
	
}
