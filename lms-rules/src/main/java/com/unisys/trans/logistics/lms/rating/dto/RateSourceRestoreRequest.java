/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>RateSourceRestoreRequest</code> class represents the request to restore
 * rateSourceinformation details.
 * <p>
 * <code>RateSourceRestoreRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>rateSourceCode
 * <li>oId
 * </code>
 * </ul>
 */
public class RateSourceRestoreRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>rateSourceCode</code> property.
     */
    private String rateSourceCode;

    /**
     * <code>Default Constructor.</code>
     */
    public RateSourceRestoreRequest() {
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
     * Gets the <code>rateSourceCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Characters
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @return the current value of the <code>rateSourceCode</code> property.
     */
    public String getRateSourceCode() {
        return this.rateSourceCode;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>rateSourceCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @param pRateSourceCode
     *            the new value of the <code>rateSourceCode</code> property.
     */
    public void setRateSourceCode(final String pRateSourceCode) {
        this.rateSourceCode = pRateSourceCode;
    }
}
