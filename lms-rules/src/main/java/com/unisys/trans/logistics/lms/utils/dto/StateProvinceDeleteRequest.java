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
 * <code>StateProvinceDeleteRequest</code> is used for deleting the State/Province.
 * <p>
 * The object ID of the State/Province being deleted is required to delete the State/Province.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>iataCode
 * <li>countryCode
 * </code>
 * </ul>
 */
public class StateProvinceDeleteRequest extends AbstractRequest {

    /**
     * TODO default serial version added. add a valid serial version id
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>countryCode</code> property.
     */
    private String countryCode;

    /**
     * Attribute to hold <code>iataCode</code> property.
     */
    private String iataCode;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * <code>Default Constructor.</code>
     */
    public StateProvinceDeleteRequest() {

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
        return this.countryCode;
    }

    /**
     * Gets the <code>iataCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet
     * <p>
     * <b>Example: </b><br>
     * LA
     * <p>
     * 
     * @return the current value of the <code>iataCode</code> property.
     */
    public final String getIataCode() {
        return this.iataCode;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public final Long getOId() {
        return this.oId;
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

    /**
     * Sets the <code>iataCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet
     * <p>
     * <b>Example: </b><br>
     * LA
     * <p>
     * 
     * @param pIataCode the new value of the <code>iataCode</code> property.
     */
    public final void setIataCode(final String pIataCode) {
        this.iataCode = pIataCode;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public final void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
