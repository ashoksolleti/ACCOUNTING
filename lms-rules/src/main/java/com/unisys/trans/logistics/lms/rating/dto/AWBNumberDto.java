//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AWBNumberDto</code> class contain information specific to a AWBNumber.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>airlineCodeNumber
 * <li>referenceNumber
 * </code>
 * </ul>
 */

public class AWBNumberDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5026759081010894600L;

    /**
     * Attribute to hold <code>airlineCodeNumber</code> property.
     */
    private String airlineCodeNumber;

    /**
     * Attribute to hold <code>referenceNumber</code> property.
     */
    private String referenceNumber;

    /**
     * Gets the <code>airlineCodeNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>airlineCodeNumber</code> property.
     */
    public String getAirlineCodeNumber() {
        return this.airlineCodeNumber;
    }

    /**
     * Gets the <code>referenceNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>referenceNumber</code> property.
     */
    public String getReferenceNumber() {
        return this.referenceNumber = ContractUtility
                    .convertToUpperCase(referenceNumber);
    }

    /**
     * Sets the <code>airlineCodeNumber</code> property.
     * <p>
     * 
     * @param pAirlineCodeNumber
     *            holds the new value of <code>airlineCodeNumber</code><br>
     *            .
     */
    public void setAirlineCodeNumber(final String pAirlineCodeNumber) {
        this.airlineCodeNumber = pAirlineCodeNumber;
    }

    /**
     * Sets the <code>referenceNumber</code> property.
     * <p>
     * 
     * @param pReferenceNumber
     *            holds the new value of <code>referenceNumber</code><br>
     *            .
     */
    public void setReferenceNumber(final String pReferenceNumber) {
        this.referenceNumber = ContractUtility.convertToUpperCase(pReferenceNumber);
    }

}
