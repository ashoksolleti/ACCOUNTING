/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>StateTaxDto</code> contains state code.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <code>
 * <li>stateCode
 * </code>
 * </ul>
 */
public class StateTaxDto extends CountryTaxDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3807506962650052497L;

    /**
     * Attribute to hold <code>stateCode</code> property.
     * <p>
     * This represents the state code where the tax is applicable.
     */
    private String stateCode;

    /**
     * <code>Default constructor.</code>
     */
    public StateTaxDto() {

    }

    /**
     * Gets the value of the <code>stateCode</code> property.
     * <p>
     * This represents the state code where the tax is applicable.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets.
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
     * Sets the value of <code>stateCode</code> property.
     * <p>
     * This represents the state code where the tax is applicable.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets.
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
}
