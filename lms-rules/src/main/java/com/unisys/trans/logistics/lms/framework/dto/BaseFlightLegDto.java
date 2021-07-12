/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>BaseFlightLegDto</code> contains the top level leg information that is common for implementation
 * classes of other modules like SPACE, WAREHOUSE, etc.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>destination
 * <li>legNumber
 * <li>origin
 * </code>
 * </ul>
 */
public class BaseFlightLegDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4671316041584595087L;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private String destination;

    /**
     * Attribute to hold <code>legNumber</code> property.
     */
    private int legNumber;

    /**
     * Attribute to hold <code>origin</code> property.
     */
    private String origin;

    /**
     * Gets the <code>destination</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * MAA
     * <p>
     * 
     * @return the current value of the <code>destination</code> property.
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * Gets the <code>legNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @return the current value of the <code>legNumber</code> property.
     */
    public int getLegNumber() {
        return this.legNumber;
    }

    /**
     * Gets the <code>origin</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * MAA
     * <p>
     * 
     * @return the current value of the <code>origin</code> property.
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Sets the <code>destination</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * MAA
     * <p>
     * 
     * @param pDestination the new value of the <code>destination</code> property.
     */
    public void setDestination(final String pDestination) {
        this.destination = ContractUtility.convertToUpperCase(pDestination);
    }

    /**
     * Sets the <code>legNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @param pLegNumber the new value of the <code>legNumber</code> property.
     */
    public void setLegNumber(final int pLegNumber) {
        this.legNumber = pLegNumber;
    }

    /**
     * Sets the <code>origin</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * MAA
     * <p>
     * 
     * @param pOrigin the new value of the <code>origin</code> property.
     */
    public void setOrigin(final String pOrigin) {
        this.origin = ContractUtility.convertToUpperCase(pOrigin);
    }
}