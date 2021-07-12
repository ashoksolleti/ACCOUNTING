/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>SpotRateDeleteRequest</code> is used for deleting <code>SpotRate</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>spotRateId
 * <li>oId
 * </ul>
 */

public class SpotRateDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5476329876234908927L;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>spotRateId</code> property.
     */
    private String spotRateId;

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>spotRateId</code> property.
     * <p>
     * 
     * @return the current value of <code>spotRateId</code> property.<br>
     */
    public String getSpotRateId() {
        return this.spotRateId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the current value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>spotRateId</code> property.
     * <p>
     * 
     * @param pSpotRateId
     *            the current value of the <code>spotRateId</code> property.
     */
    public void setSpotRateId(final String pSpotRateId) {
        this.spotRateId = pSpotRateId;
    }

}
