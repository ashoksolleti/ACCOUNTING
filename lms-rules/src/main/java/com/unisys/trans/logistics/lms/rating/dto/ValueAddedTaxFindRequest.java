/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ValueAddedTaxFindRequest</code> holds attribute to retrieve VAT details.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>origin
 * </code>
 * </ul>
 */
public class ValueAddedTaxFindRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3482967917347049526L;

    /**
     * Attribute to hold <code>origin</code> property.
     */
    private String origin;

    /**
     * <code>Default constructor.</code>
     */
    public ValueAddedTaxFindRequest() {
    }

    /**
     * Gets the value of the <code>origin</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic.
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
     * Sets the value of <code>origin</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic.
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
}
