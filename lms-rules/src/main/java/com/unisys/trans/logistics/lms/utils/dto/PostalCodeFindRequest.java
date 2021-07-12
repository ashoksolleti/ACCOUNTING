/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>PostalCodeFindRequest</code> holds the attributes to find a Postal code and its details.
 * <p>
 * This includes the following operations:
 * <ul>
 * <li>Finds a Postal code - Retrieves a Postal code and its details based on the input Postal code.
 * </ul>
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>postalCode
 * </code>
 * </ul>
 */
public class PostalCodeFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4319320519260902266L;

    /**
     * Attribute to hold <code>postalCode</code> property.
     */
    private String postalCode;

    /**
     * <code>Default constructor</code>.
     */
    public PostalCodeFindRequest() {
    }

    /**
     * Gets the <code>postalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 5-9 AlphaNumeric.
     * <p>
     * <b>Example :</b><br>
     * 55122
     * <p>
     * 
     * @return the current value of the <code>postalCode</code> property.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Sets the <code>postalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 5-9 AlphaNumeric.
     * <p>
     * <b>Example :</b><br>
     * 55122
     * <p>
     * 
     * @param pPostalCode the new value of <code>postalCode</code> property.
     */
    public void setPostalCode(final String pPostalCode) {
        this.postalCode = pPostalCode;
    }
}