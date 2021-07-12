/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>PostalCodeResponse</code> contains the response of all the request received by
 * <code>PostalCodeService</code> for maintaining Postal code.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <li><code>postalCode</code>
 * </ul>
 */
public class PostalCodeResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8411805914373224469L;

    /**
     * Attribute to hold <code>postalCode</code> property.
     * <p>
     * This attribute holds the Postal code details.
     */
    private PostalCodeDto postalCode;

    /**
     * <code>Default constructor</code>.
     */
    public PostalCodeResponse() {

    }

    /**
     * Gets the <code>postalCode</code> property.
     * <p>
     * This attribute holds the Postal code details.
     * <p>
     * 
     * @return the current value of the <code>postalCode</code> property.
     */
    public PostalCodeDto getPostalCode() {
        return this.postalCode;
    }

    /**
     * Sets the <code>postalCode</code> property.
     * <p>
     * This attribute holds the Postal code details.
     * <p>
     * 
     * @param pPostalCode the new value of the <code>postalCode</code> property.
     */
    public void setPostalCode(final PostalCodeDto pPostalCode) {
        this.postalCode = pPostalCode;
    }
}