/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.utils.dto.constants.QueueBaseType;

/**
 * <code>OfficeQueueFindRequest</code> class represents the request to retrieve all queues associated with
 * given office.
 * <p>
 * All queues are retrieved based on the office identifier.
 * <p>
 * <code>OfficeQueueFindRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>officeIdentifier
 * </code>
 * </ul>
 */
public class OfficeQueueFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7018887663131758098L;

    /**
     * Attribute to hold <code>officeIdentifier</code> property.
     */
    private String officeIdentifier;

    /**
     * <code>Default constructor. </code>
     */
    public OfficeQueueFindRequest() {
    }

    /**
     * Gets the <code>officeIdentifier</code> attribute.
     * <p>
     * It specifies the name of the office.
     * <p>
     * <b>Format: </b><br>
     * 1-20 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * MSP001, FRA001
     * <p>
     * 
     * @return the current value of the <code>officeIdentifier</code> property.
     */
    public String getOfficeIdentifier() {
        return this.officeIdentifier;
    }

    /**
     * @return the queueBaseType
     */
    public QueueBaseType getQueueBaseType() {
        return this.queueBaseType;
    }

    /**
     * @param pQueueBaseType the queueBaseType to set
     */
    public void setQueueBaseType(final QueueBaseType pQueueBaseType) {
        this.queueBaseType = pQueueBaseType;
    }

    private QueueBaseType queueBaseType;
    /**
     * Sets the <code>officeIdentifier</code> property.
     * <p>
     * It specifies the name of the office.
     * <p>
     * <b>Format: </b><br>
     * 1-20 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * MSP001, FRA001
     * 
     * @param pOfficeIdentifier the new value of the <code>officeIdentifier</code> property.
     */
    public void setOfficeIdentifier(final String pOfficeIdentifier) {
        this.officeIdentifier = pOfficeIdentifier;
    }
}