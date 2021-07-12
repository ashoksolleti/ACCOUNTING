package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.constants.MessageType;
import com.unisys.trans.logistics.lms.framework.constants.RuleFeatureType;

public class RuleMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4306836809094736030L;
	
	private MessageType messageType;
	
	private String messageText;
	
	private String messageCode;
	
	private Object dynamicContent;
	
	private Integer segmentId;
	
	private String officeCode;
	
	private String queueStation;

	private String hierarchy;
    private RuleFeatureType ruleFeatureType;
	/**
	 * @return the messageType
	 */
	public MessageType getMessageType() {
		return messageType;
	}

	/**
	 * @param messageType the messageType to set
	 */
	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}

	/**
	 * @return the messageText
	 */
	public String getMessageText() {
		return messageText;
	}

	/**
	 * @param messageText the messageText to set
	 */
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	/**
	 * @return the messageCode
	 */
	public String getMessageCode() {
		return messageCode;
	}

	/**
	 * @param messageCode the messageCode to set
	 */
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public Object getDynamicContent() {
		return dynamicContent;
	}

	public void setDynamicContent(Object dynamicContent) {
		this.dynamicContent = dynamicContent;
	}

	public Integer getSegmentId() {
		return segmentId;
	}

	public void setSegmentId(Integer segmentId) {
		this.segmentId = segmentId;
	}

	/**
	 * @return the officeCode
	 */
	public String getOfficeCode() {
		return officeCode;
	}

	/**
	 * @param officeCode the officeCode to set
	 */
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	
	public String getQueueStation() {
	        return this.queueStation;
	    }

	    /**
	     * @param queueStation the queueStation to set
	     */
	    public void setQueueStation(final String pQueueStation) {
	        this.queueStation = pQueueStation;
	    }
	public String getHierarchy() {
		return this.hierarchy;
	}
	public void setHierarchy(final String pHierarchy) {
		this.hierarchy = pHierarchy;
	}
	public RuleFeatureType getRuleFeatureType() {
		return ruleFeatureType;
	}
	public void setRuleFeatureType(RuleFeatureType ruleFeatureType) {
		this.ruleFeatureType = ruleFeatureType;
	}
}
