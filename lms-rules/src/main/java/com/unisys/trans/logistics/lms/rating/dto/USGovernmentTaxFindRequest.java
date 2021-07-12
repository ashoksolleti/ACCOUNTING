/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.TaxApplicabilityType;

/**
 * <code>USGovernmentTaxFindRequest</code> holds the attributes that retrieve US tax details.
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
public class USGovernmentTaxFindRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -822020022000098557L;

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
    public USGovernmentTaxFindRequest() {
    }

    /**
     * Gets the value of the <code>destination</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic.
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
     * 3 alphabetic.
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
     * 3 alphabetic.
     * <p>
     * <b>Example: </b><br>
     * ORD
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
     * @param pStateTaxTypeCode the new value of the <code>stateTaxTypeCode</code> property.<br>
     */
    public void setStateTaxTypeCode(final TaxApplicabilityType pStateTaxTypeCode) {
        this.stateTaxTypeCode = pStateTaxTypeCode;
    }
}
