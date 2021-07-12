//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>StateProvinceFindRequest</code> is used for finding State/Province.
 * <p>
 * It allows to find State/Province for a Country.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <li><code>countryCode</code>
 * </ul>
 */
public class StateProvinceFindRequest extends AbstractRequest {

    /**
     * TODO default serial version added. add a valid serial version id
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>countryCode</code> property.
     */
    private String countryCode;

    /**
     * <code>Default Constructor.</code>
     */
    public StateProvinceFindRequest() {

    }

    /**
     * Gets the <code>countryCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @return the current value of the <code>countryCode</code> property.
     */
    public final String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the <code>countryCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @param pCountryCode the new value of the <code>countryCode</code> property.
     */
    public final void setCountryCode(final String pCountryCode) {
        this.countryCode = pCountryCode;
    }

}
