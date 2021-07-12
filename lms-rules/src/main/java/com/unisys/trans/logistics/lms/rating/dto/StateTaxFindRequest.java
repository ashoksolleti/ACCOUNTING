/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>StateTaxFindRequest</code> holds attributes based on which state tax information is retrieved.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>countryCode
 * <li>taxCode
 * <li>stateCode
 * </code>
 * </ul>
 */
public class StateTaxFindRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1414737642406993367L;

    /**
     * Attribute to hold <code>countryCode</code> property.
     * <p>
     * This represents the country code where the tax is applicable.
     */

    private String countryCode;

    /**
     * Attribute to hold <code>stateCode</code> property.
     * <p>
     * This represents the state code where the tax is applicable.
     */
    private String stateCode;

    /**
     * Attribute to hold <code>taxCode</code> property.
     * <p>
     * The tax code is the other charge code that tax is associated with.
     */
    private String taxCode;

    /**
     * <code>Default constructor.</code>
     */
    public StateTaxFindRequest() {
    }

    /**
     * Gets the value of the <code>countryCode</code> property.
     * <p>
     * This represents the country code where the tax is applicable.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @return the current value of the <code>countryCode</code> property.<br>
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Gets the value of the <code>stateCode</code> property.
     * <p>
     * This represents the state code where the tax is applicable.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * MI
     * <p>
     * 
     * @return the current value of the <code>stateCode</code> property.<br>
     */
    public String getStateCode() {
        return this.stateCode;
    }

    /**
     * Gets the value of the <code>taxCode</code> property.
     * <p>
     * Tax code is the valid other charge code that the tax is associated with.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @return the current value of the <code>taxCode</code> property.<br>
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Sets the value of <code>countryCode</code> property.
     * <p>
     * This represents the country code where the tax is applicable.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabetic.
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @param pCountryCode the new value of the <code>countryCode</code> property.<br>
     */
    public void setCountryCode(final String pCountryCode) {
        this.countryCode = ContractUtility.convertToUpperCase(pCountryCode);
    }

    /**
     * Sets the value of <code>stateCode</code> property.
     * <p>
     * This represents the state code where the tax is applicable.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabetic.
     * <p>
     * <b>Example: </b><br>
     * MI
     * <p>
     * 
     * @param pStateCode the new value of the <code>stateCode</code> property.<br>
     */
    public void setStateCode(final String pStateCode) {
        this.stateCode = ContractUtility.convertToUpperCase(pStateCode);
    }

    /**
     * Sets the value of <code>taxCode</code> property.
     * <p>
     * The tax code is the other charge code that tax is associated with.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @param pTaxCode the new value of the <code>taxCode</code> property.<br>
     */
    public void setTaxCode(final String pTaxCode) {
        this.taxCode = ContractUtility.convertToUpperCase(pTaxCode);
    }
}
