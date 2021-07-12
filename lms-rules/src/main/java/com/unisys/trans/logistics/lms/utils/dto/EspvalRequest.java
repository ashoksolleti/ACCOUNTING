package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class EspvalRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1110319792986249711L;
	
	/**
	 * Attribute to hold the <code>customXML</code> property.
     */
	private  String customXML; 
	
	/**
	 * Attribute to hold the <code>originalXML</code> property.
     */
	private  String originalXML;
	
	/**
	 * Attribute to hold the <code>originalMessage</code> property.
     */
	private  String originalMessage; 
	
	/**
	 * @return the customXML
	 */
	public String getCustomXML() {
		return customXML;
	}

	/**
	 * @param customXML the customXML to set
	 */
	public void setCustomXML(String customXML) {
		this.customXML = customXML;
	}

	/**
	 * @return the originalXML
	 */
	public String getOriginalXML() {
		return originalXML;
	}

	/**
	 * @param originalXML the originalXML to set
	 */
	public void setOriginalXML(String originalXML) {
		this.originalXML = originalXML;
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

}
