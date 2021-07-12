/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto;

import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <code>AbstractResponse</code> is the base response class which is extended by all the response classes.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>codeMessages
 * <li>requestContext
 * <li>responseType</code>
 * </ul>
 */
public abstract class AbstractResponse implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6273179309355246894L;

    /**
     * Attribute to hold list of <code>codeMessages</code> property.
     */
    private List<CodeMessage> codeMessages = new ArrayList<CodeMessage>();

    /**
     * Attribute to hold list of <code>requestHeader</code> property.
     */
    private RequestHeader requestHeader;

    /**
     * Attribute to hold the <code>responseType</code> property.
     */
    private String responseType;
    
    /**
     * Attribute to hold the <code>businessKey</code> property.
     */
    private String businessKey;  
    
    /**
     * Attribute to hold the <code>serviceName</code> property.
     */
    private String serviceName;
    
    /**
     * Attribute to hold the <code>event</code> property.
     */
    private String event;

    /**
     * <code>Default Constructor.</code>
     */
    public AbstractResponse() {

    }

    /**
     * Adds a <code>codeMessages</code> property.
     * <p>
     * 
     * @param pCodeMessage the new value of list of <code>codeMessages</code> property.
     */
    public void addCodeMessage(final CodeMessage pCodeMessage) {
        if (this.codeMessages == null) {
            this.codeMessages = new ArrayList<CodeMessage>();
        }
        this.codeMessages.add(pCodeMessage);
    }

    /**
     * Gets the <code>codeMessages</code> property.
     * <p>
     * 
     * @return the current value of list of <code>codeMessages</code> property.
     */

    public List<CodeMessage> getCodeMessages() {
        return this.codeMessages;
    }

    /**
     * Gets the <code>requestHeader</code> property.
     * <p>
     * The request context holds the user credentials.
     * <p>
     * 
     * @return the current value of the <code>requestHeader</code> property.
     */
    public RequestHeader getRequestHeader() {
        return this.requestHeader;
    }

    /**
     * Gets the <code>responseType</code> property.
     * <p>
     * 
     * @return the current value of <code>responseType</code> property.
     */
    public String getResponseType() {
        return this.responseType;
    }

    /**
     * Sets the collection of <code>codeMessages</code> property.
     * <p>
     * 
     * @param pCodeMessages the new value of list of <code>codeMessages</code> property.
     */
    public void setCodeMessages(final List<CodeMessage> pCodeMessages) {
        this.codeMessages = pCodeMessages;
    }

    /**
     * Sets the <code>requestContext</code> property.
     * <p>
     * The requestContext holds the user credentials.
     * <p>
     * 
     * @param pRequestHeader the new value of <code>requestHeader</code> property.
     */
    public void setRequestHeader(final RequestHeader pRequestHeader) {
        this.requestHeader = pRequestHeader;
    }

    /**
     * Sets the <code>responseType</code> property.
     * <p>
     * 
     * @param pResponseType the new value of the <code>responseType</code> property.
     */
    public void setResponseType(final String pResponseType) {
        this.responseType = pResponseType;
    }

    /**
     * Sets the user properties.
     * <p>
     * It copies the host, office, request type, UserGroup, userID, and userLevels attribute values from the
     * request to the response.
     * <p>
     * 
     * @param pBasicRequest the new value of the basic request values property.
     */
    public void setUserProperties(final AbstractRequest pBasicRequest) {

        this.setRequestHeader(pBasicRequest.getRequestHeader());
        this.setResponseType(pBasicRequest.getRequestType());

    }

	/**
	 * @return the businessKey
	 */
	public String getBusinessKey() {
		return businessKey;
	}

	/**
	 * @param businessKey the businessKey to set
	 */
	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}
	// LMSC-11111 UIS158 Start
    /**
     * Adds a <code>codeMessages</code> property.
     * <p>
     * 
     * @param pCodeMessage the new value of list of <code>codeMessages</code> property.
     */
    public void addCodeMessages(final List<CodeMessage> pCodeMessages) {
        if (this.codeMessages == null) {
            this.codeMessages = new ArrayList<CodeMessage>();
        }
        if (pCodeMessages != null && !pCodeMessages.isEmpty()) {
            for (CodeMessage codeMessage : pCodeMessages) {
                this.codeMessages.add(codeMessage);
            }
        }
    }
	// LMSC-11111 UIS158 End
}
