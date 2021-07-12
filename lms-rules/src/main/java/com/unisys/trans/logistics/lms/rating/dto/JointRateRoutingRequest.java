/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>JointRateRoutingRequest</code> is used for retrieving <code> JointRate</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>originCode</code>
 * <li>destinationCode
 * </ul>
 */
public class JointRateRoutingRequest extends AbstractRequest {
    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>destinationCode</code> property.
     */

    private String destinationCode;

    /**
     * Attribute to hold <code>originCode</code> property.
     */
    private String originCode;

    /**
     * Gets the <code>destinationCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationCode</code> property.
     */
    public String getDestinationCode() {
        return this.destinationCode;
    }

    /**
     * Gets the <code>originCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>originCode</code> property.
     */
    public String getOriginCode() {
        return this.originCode;
    }

    /**
     * Sets the <code>destinationCode</code> property.
     * <p>
     * 
     * @param pDestinationCode
     *            the current value of the <code>destinationCode</code> property.
     */
    public void setDestinationCode(final String pDestinationCode) {
        this.destinationCode = pDestinationCode;
    }

    /**
     * Sets the <code>originCode</code> property.
     * <p>
     * 
     * @param pOriginCode
     *            the current value of the <code>originCode</code> property.
     */
    public void setOriginCode(final String pOriginCode) {
        this.originCode = pOriginCode;
    }

}