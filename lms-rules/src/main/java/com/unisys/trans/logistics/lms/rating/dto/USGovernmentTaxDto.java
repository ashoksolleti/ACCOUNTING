/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.TaxApplicabilityType;

/**
 * <code>USGovernmentTaxDto</code> contains US tax details.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>origin
 * <li>destination
 * <li>stateTaxTypeCode
 * </code>
 * </ul>
 */
public class USGovernmentTaxDto extends TaxDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7306867019213425500L;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private String destination;

    /**
     * Attribute to hold <code>origin</code> property.
     */
    private String origin;

    /**
     * Attribute to hold <code>stateTaxTypeCode</code> property.
     */
    private TaxApplicabilityType stateTaxTypeCode;

    /**
     * <code>Default constructor.</code>
     */
    public USGovernmentTaxDto() {

    }

    /**
     * Gets the value of the <code>destination</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 alphabets.
     * <p>
     * <b>Example: </b><br>
     * ORD
     * <p>
     * 
     * @return the current value of the <code>destination</code> property.<br>
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * Gets the value of the <code>origin</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 alphabets.
     * <p>
     * <b>Example: </b><br>
     * FRA
     * <p>
     * 
     * @return the current value of the <code>origin</code> property.<br>
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Gets the value of the <code>stateTaxTypeCode</code> property.
     * <p>
     * <b>Example: </b><br>
     * Values can be ALL or BETWEEN
     * <p>
     * 
     * @return the current value of the <code>stateTaxTypeCode</code> property.<br>
     */
    public TaxApplicabilityType getStateTaxTypeCode() {
        return this.stateTaxTypeCode;
    }

    /**
     * Sets the value of <code>destination</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 alphabets.
     * <p>
     * <b>Example: </b><br>
     * ORD
     * <p>
     * 
     * @param pDestination the new value of the <code>destination</code> property.<br>
     */
    public void setDestination(final String pDestination) {
        this.destination = ContractUtility.convertToUpperCase(pDestination);
    }

    /**
     * Sets the value of <code>origin</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 alphabetic.
     * <p>
     * <b>Example: </b><br>
     * FRA
     * <p>
     * 
     * @param pOrigin the new value of the <code>origin</code> property.<br>
     */
    public void setOrigin(final String pOrigin) {
        this.origin = ContractUtility.convertToUpperCase(pOrigin);
    }

    /**
     * Sets the value of <code>stateTaxTypeCode</code> property.
     * <p>
     * <b>Example: </b><br>
     * Values can be ALL or BETWEEN
     * <p>
     * 
     * @param pTaxApplicabilityType the new value of the <code>stateTaxTypeCode</code> property.<br>
     */
    public void setStateTaxTypeCode(final TaxApplicabilityType pTaxApplicabilityType) {
        this.stateTaxTypeCode = pTaxApplicabilityType;
    }

}
