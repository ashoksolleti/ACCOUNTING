/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>TaxDeleteRequest</code> contains tax details to be deleted.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>taxType
 * </code>
 * </ul>
 */
public class TaxDeleteRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3986385622169156757L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>taxType</code> property.
     */
    private String taxType;

    /**
     * <code>Default constructor.</code>
     */
    public TaxDeleteRequest() {

    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of the <code>taxType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Upper case alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * U,V,C,S
     * <p>
     * 
     * @return the current value of the <code>taxType</code> property.<br>
     */
    public String getTaxType() {
        return this.taxType;
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the value of <code>taxType</code> property.
     * <p>
     * The following three types of tax are maintained: U.S. Transportation Tax. Value Added Tax (VAT) for
     * European Union origins and destinations. Country or State level Tax.
     * <p>
     * <b>Format: </b><br>
     * Alphabets of size 2.
     * <p>
     * <b>Example: </b><br>
     * U,V,C,S
     * <p>
     * 
     * @param pTaxType the new value of the <code>taxType</code> property.<br>
     */
    public void setTaxType(final String pTaxType) {
        this.taxType = pTaxType;
    }

}
