/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>PostalCodePersistRequest</code> holds the attributes to Persist a Postal code and its details.
 * <p>
 * This includes the following operations:
 * <ul>
 * <li>Creates a Postal code - Creates a Postal code with its details.
 * <li>Updates a Postal code - Updates a Postal code and its details based on the input Postal code.
 * </ul>
 * <ul>
 * <code>
 * <li>PostalCodeDto
 * </code>
 * </ul>
 */
public class PostalCodePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6677066393040759177L;

    /**
     * Attribute to hold <code>postalCode</code> property.
     * <p>
     * This attribute represents <code>PostalCodeDto</code> object that holds all the Postal code details.
     */
    private PostalCodeDto postalCode;

    /**
     * <code>Default constructor</code>.
     */
    public PostalCodePersistRequest() {
    }

    /**
     * Gets the <code>postalCode</code> property.
     * <p>
     * This attribute represents <code>PostalCodeDto</code> object that holds all the Postal code details.
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
     * This attribute represents <code>PostalCodeDto</code> object that holds all the Postal code details.
     * <p>
     * 
     * @param pPostalCode the new value of the <code>postalCode</code> property.
     */
    public void setPostalCode(final PostalCodeDto pPostalCode) {
        this.postalCode = pPostalCode;
    }
}