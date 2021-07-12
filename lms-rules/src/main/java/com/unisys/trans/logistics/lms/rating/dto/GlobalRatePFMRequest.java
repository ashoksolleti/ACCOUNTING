/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;

/**
 * <code>TariffRateAdminResponse</code> contains the response of the maintenance
 * request received by <code>GlobalRatesAdminService</code>.
 * <p>
 * <ul>
 * <li><code>tariffAdminRateDtos</code></li>
 * </ul>
 */
public class GlobalRatePFMRequest extends BatchRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6480916955187977237L;

    /**
     * Attribute to hold <code>skipValidation</code> property.
     */
    private boolean skipValidation;

    /**
     * <code>Default constructor.</code>
     */
    public GlobalRatePFMRequest() {

    }

    /**
     * Gets the <code>skipValidation</code>.
     * <p>
     * 
     * @return <code>skipValidation</code>.
     *         </p>
     */
    public boolean isSkipValidation() {
        return this.skipValidation;
    }

    /**
     * Sets the <code>skipValidation</code>.
     * <p>
     * 
     * @param pSkipValidation
     *            <code>skipValidation</code><br>
     *            </p>
     */
    public void setSkipValidation(final boolean pSkipValidation) {
        this.skipValidation = pSkipValidation;
    }
}
