/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>SpecialHandlingCodeDeleteRequest</code> is used for deleting the special handling code.
 * <p>
 * The object ID of the special handling being deleted is required to delete the special handling code.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>sortCode
 * <li>specialHandlingCode
 * <li>searchCode
 * </code>
 * </ul>
 */
public class SpecialHandlingCodeDeleteRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 480154244074004810L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>specialHandlingCode</code> property.
     */
    private String specialHandlingCode;

    /**
     * <code>Default Constructor.</code>
     */
    public SpecialHandlingCodeDeleteRequest() {

    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>specialHandlingCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @return the current value of the <code>specialHandlingCode</code> property.
     */
    public String getSpecialHandlingCode() {
        return this.specialHandlingCode;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>specialHandlingCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @param pSpecialHandlingCode the new value of the <code>specialHandlingCode</code> property.
     */
    public void setSpecialHandlingCode(final String pSpecialHandlingCode) {
        this.specialHandlingCode = pSpecialHandlingCode;
    }

}
