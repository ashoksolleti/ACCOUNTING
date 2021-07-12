/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AddOnRateCarrierRequest</code> class represents the request to update
 * AddOnRateCarrierinformation details.
 * <p>
 * <code>AddOnRateCarrierRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>cityCode
 * <li>rateSourceCode
 * </code>
 * </ul>
 */
public class AddOnRateCarrierRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>cityCode</code> property.
     */

    private String cityCode;

    /**
     * Attribute to hold <code>rateSourceCode</code> property.
     */
    private String rateSourceCode;

    /**
     * Gets the <code>cityCode</code> property.
     * <p>
     * Indicates the IATA city code.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @return the current value of <code>cityCode</code> of the city.<br>
     */
    public String getCityCode() {
        return this.cityCode;
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
     * Sets the <code>cityCode</code> property.
     * <p>
     * Indicates the IATA city code.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @param pCityCode
     *            the new value of the <code>cityCode</code>.
     */

    public void setCityCode(final String pCityCode) {
        this.cityCode = pCityCode;
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
