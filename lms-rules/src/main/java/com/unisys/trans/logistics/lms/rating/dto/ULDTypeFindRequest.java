/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ULDTypeFindRequest</code> class represents the request to find uld type information.
 * <p>
 * ULDType information is retrieved based on the following attribute: <code>
 * <ul>
 * <li>exactMatchRequiredIndicator
 * <li>uldType
 * </ul>
 * </code>
 */
public class ULDTypeFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4160696865693181289L;

    /**
     * Attribute to hold <code>exactMatchRequiredIndicator</code> property.
     */
    private boolean exactMatchRequiredIndicator;

    /**
     * Attribute to hold <code>uldType</code> property.
     */
    private String uldType;

    /**
     * <code>Default constructor.</code>
     */
    public ULDTypeFindRequest() {

    }

    /**
     * Gets the <code>uldType</code> property.
     * <p>
     * Unique Identifier.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets.<br>
     * <p>
     * <b>Example :</b><br>
     * 1S
     * <p>
     * 
     * @return the current value of the <code>uldType</code> property.<br>
     */
    public String getUldType() {
        return this.uldType;
    }

    /**
     * Gets the <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * To find a particular ULD type<br>
     * <li><code>false:</code> <br>
     * To find all the ULD types<br>
     * <p>
     * 
     * @return the current value of the <code>exactMatchRequiredIndicator</code> property.<br>
     */
    public boolean isExactMatchRequiredIndicator() {
        return this.exactMatchRequiredIndicator;
    }

    /**
     * Sets the <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * Holds the active profle indicator regarding the flight profile.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * To find a particular ULD type<br>
     * <li><code>false:</code> <br>
     * To find all the ULD types<br>
     * <p>
     * 
     * @param pExactMatchRequiredIndicator the new value of the <code>exactMatchRequiredIndicator</code>
     *            property.<br>
     */
    public void setExactMatchRequiredIndicator(final boolean pExactMatchRequiredIndicator) {
        this.exactMatchRequiredIndicator = pExactMatchRequiredIndicator;
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * Unique Identifier.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets.<br>
     * <p>
     * <b>Example :</b><br>
     * 1S
     * <p>
     * 
     * @param pULDType the new value of the <code>uldType</code> property.<br>
     */
    public void setUldType(final String pULDType) {
        this.uldType = ContractUtility.convertToUpperCase(pULDType);
    }
}
