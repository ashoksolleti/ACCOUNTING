//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>ExclusionReasonType</code> holds the constants to indicate
 * ExclusionReasonType type applied.
 * <p>
 * Following are the possible ExclusionReasonType type:<br>
 * <ul>
 * <li>System Parameter -N
 * <li>Interline shipment -I
 * <li>Non-host air waybill -H
 * <li>Product code -P
 * </ul>
 */
public enum ExclusionReasonType {

    /**
     * Constant used for System Parameter.
     */
    N("System Parameter", "SYSTEM PARAMETER"),

    /**
     * Constant used for Interline shipment .
     */
    I("Interline Shipment", "INTERLINE SHIPMENT"),

    /**
     * Constant used for Non-host air waybill.
     */
    H("Non-Host Air Waybill", "NON-HOST AIR WAYBILL"),

    /**
     * Constant used for Product code.
     */
    P("Product Code", "PRODUCT CODE");

    /**
     * Attribute to hold the <code>reasonType</code> property.
     */
    private String reasonType;

    /**
     * Attribute to hold the <code>exclusionReason</code> property.
     */
    private String exclusionReason;

    /**
     * Parameterize constructor.
     * 
     * @param pReasonType
     *            the value.
     */
    ExclusionReasonType(final String pExclusionReason, final String pReasonType) {
        this.exclusionReason = pExclusionReason;
        this.reasonType = pReasonType;
    }

    public static ExclusionReasonType fromValue(
                final String pExclusionReasonType) {

        ExclusionReasonType aMatchedExclusionReasonType = null;
        for (final ExclusionReasonType bExclusionReasonType : ExclusionReasonType
                    .values()) {
            if (bExclusionReasonType.getReasonType().equals(
                pExclusionReasonType)) {
                aMatchedExclusionReasonType = bExclusionReasonType;
                break;
            }
        }
        return aMatchedExclusionReasonType;
    }

    /**
     * @return the reasonType
     */
    public String getReasonType() {
        return this.reasonType;
    }

    /**
     * @return the exclusionReason
     */
    public String getExclusionReason() {
        return this.exclusionReason;
    }

    /**
     * Gives the string format of enumerated <code>ExclusionReasonType</code>.
     * <p>
     * 
     * @return the current string value of the <code>ExclusionReasonType</code>.
     */
    public String value() {
        return this.name();
    }

}
