/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * <code>AbstractRequest</code> contains the basic request that is extended by all other request classes.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>requestHeader</code> - holds the user credential's.
 * <li><code>requestType</code> - holds the Request Type .
 * </ul>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractRequest implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5547047493684537257L;

    /**
     * Attribute to hold the <code>RequestHeader</code> property.
     * <p>
     * This holds the user credential's.
     */
    private RequestHeader requestHeader;

    /**
     * Attribute to hold the <code>requestType</code> property.
     */
    private String requestType;

    /**
     * Attribute to hold the <code>serviceName</code> property.
     */
    private String serviceName;
    
    /**
     * Attribute to hold the <code>serviceName</code> property.
     */
    private String businessKey; 
    /**
     * Attribute to hold the <code>overrideIndicator</code>
     */
    private boolean overrideIndicator;

    /**
     * <code>Default Constructor.</code>
     */
    public AbstractRequest() {

    }

    /**
     * Gets the host property.
     * <p>
     * 
     * @return the current value of the host property.
     */
    public String getHost() {
        return this.getRequestHeader().getHost().value();

    }

    /**
     * Gets the <code>requestHeader</code> that holds the user credential's.
     * <p>
     * 
     * @return the current value of the <code>requestHeader</code> property.
     */
    public RequestHeader getRequestHeader() {
        return this.requestHeader;
    }

    /**
     * Gets the <code>requestType</code> that holds the user credential's property.
     * <p>
     * <b>Possible values :</b><br>
     * <ul>
     * <li>Retrieve
     * <li>Update
     * <li>Create
     * <li>Delete
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>requestType</code> property.
     */
    public String getRequestType() {
        return this.requestType;
    }

    /**
     * Gets the <code>serviceName</code> property.
     * <p>
     * 
     * @return the current value of the <code>serviceName</code> property.
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Sets the <code>requestHeader</code> property.
     * <p>
     * 
     * @param pRequestHeader the new value of the <code>requestHeader</code> property.
     */
    public void setRequestHeader(final RequestHeader pRequestHeader) {
        this.requestHeader = pRequestHeader;
    }

    /**
     * Sets the <code>requestType</code> property.
     * <p>
     * <b>Possible values :</b><br>
     * <ul>
     * <li>Retrieve
     * <li>Update
     * <li>Create
     * <li>Delete
     * </ul>
     * <p>
     * 
     * @param pRequestType the new value of the <code>requestType</code> property.
     */
    public void setRequestType(final String pRequestType) {
        this.requestType = pRequestType;
    }

    /**
     * Sets the <code>serviceName</code> property.
     * <p>
     * 
     * @param pServiceName the new value of <code>serviceName</code> property.
     */
    public void setServiceName(final String pServiceName) {
        this.serviceName = pServiceName;
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

	public boolean isOverrideIndicator() {
		return overrideIndicator;
	}

	public void setOverrideIndicator(boolean overrideIndicator) {
		this.overrideIndicator = overrideIndicator;
	}

}
