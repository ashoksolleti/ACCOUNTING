/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ParticipantGroupRestoreRequest</code> contains participant group restore request details.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>groupNumber
 * <li>oId
 * <li>version
 * </ul>
 * </code>
 */
public class BillingGroupRestoreRequest extends AbstractRequest {
	 /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6825052412872619914L;

    /**
     * Attribute to hold <code>groupNumber</code> property.
     */
    private String groupNumber;

    /**
     * Attribute to hold <code>participantGroup</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>version</code> property.
     */
    private long version;

    /**
     * <code>Default constructor.</code>
     */
    public BillingGroupRestoreRequest() {

    }

    /**
     * Gets the value of the <code>groupNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alpha numeric characters
     * <p>
     * <b>Example: </b><br>
     * GR0000BE
     * <p>
     * 
     * @return the current value of <code>groupNumber</code> of participant.
     */
    public String getGroupNumber() {

        return this.groupNumber;
    }

    /**
     * Gets the value of the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {

        return this.oId;
    }

    /**
     * Gets the value of the <code>version</code> property.
     * <p>
     * 
     * @return the current value of the <code>version</code> property.
     */
    public long getVersion() {
        return this.version;
    }

    /**
     * Sets the value of <code>groupNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alpha numeric characters
     * <p>
     * <b>Example: </b><br>
     * GR0000BE
     * <p>
     * 
     * @param pGroupNumber the current value of <code>groupNumber</code> property.
     */
    public void setGroupNumber(final String pGroupNumber) {

        this.groupNumber = ContractUtility.convertToUpperCase(pGroupNumber);
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {

        this.oId = pOId;
    }

    /**
     * Sets the value of the <code>version</code> property.
     * <p>
     * 
     * @param pVersion the new value of the <code>version</code> property.
     */
    public void setVersion(final long pVersion) {
        this.version = pVersion;
    }

    
}
