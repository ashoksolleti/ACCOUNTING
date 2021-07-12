//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <code>AirWayBillCurrentOriginal</code> holds the constants to indicate AirWayBillCurrentOriginal type
 * applied.
 * <p>
 * Following are the possible AirWayBillCurrentOriginal type:<br>
 * <ul>
 * <li>C
 * <li>O
 * <li>N
 * </ul>
 */
public enum AirWayBillCurrentOriginal {

    /**
     * Constant used for Current Airwaybill.
     */
    C("CURRENT AIRWAYBILL"),

    /**
     * Constant used for Airwaybill with no associated Original Airwaybill.
     */
    N("AIRWAYBILL WITH NO ASSOCIATED ORIGINAL AIRWAYBILL"),

    /**
     * Constant used for Original Airwaybill.
     */
    O("ORIGINAL AIRWAYBILL"),

    /**
     * Constant used for Airwaybill with associated Original Airwaybill.
     */
    Y("AIRWAYBILL WITH ASSOCIATED ORIGINAL AIRWAYBILL");

    /**
     * Attribute to hold the <code>payCode</code> property.
     */
    private String currentOriginalInd;

    /**
     * Parameterize constructor.
     * 
     * @param pCurrentOriginalInd
     *            holds the value.
     */
    AirWayBillCurrentOriginal(final String pCurrentOriginalInd) {
        this.currentOriginalInd = pCurrentOriginalInd;
    }

    /**
     * Gets the value of the CurrentOriginalInd property.
     * 
     * @return the current value of <code>currentOriginalInd</code>.
     */
    public String getCurrentOriginalInd() {
        return this.currentOriginalInd;
    }

    /**
     * Gives the string format of enumerated <code>AirWayBillCurrentOriginal</code>.
     * <p>
     * 
     * @return the current string value of the <code>AirWayBillCurrentOriginal</code>.
     */
    public String value() {
        return this.name();
    }

}
