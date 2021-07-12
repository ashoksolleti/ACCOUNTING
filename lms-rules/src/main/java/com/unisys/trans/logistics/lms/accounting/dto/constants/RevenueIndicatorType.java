//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>revenueIndicatorType</code> holds the constants to indicate the type of
 * Revenue.
 * <p>
 * Following are the possible revenue Indicator Type:<br>
 * <ul>
 * <li>ORIGINAL
 * <li>DEBIT
 * <li>CREDIT
 * </ul>
 */
public enum RevenueIndicatorType {

    /**
     * Constant used for Load Air Waybill.
     */
    ORIGINAL("Original", "Original"),

    /**
     * Constant used for Update Air Waybill.
     */
    DEBIT("Debit Note", "Debit"),
    
    /**
     * Constant used for Reject Air Waybill.
     */
    REJECT("Reject Note", "Reject"),

    /**
     * Constant used for Update Air Waybill.
     */
    CREDIT("Credit Note", "Credit");

    /**
     * Attribute to hold the <code>revenueIndicatorType</code> property.
     */
    private String revenueIndicatorType;

    /**
     * Attribute to hold <code>revenueIndicatorTypeName</code>.
     */
    private String revenueIndicatorTypeName;

    /**
     * Parameterize constructor.
     * 
     * @param pRevenueIndicatorType
     *            the value.
     */
    RevenueIndicatorType(final String pRevenueIndicatorType, final String pTypeName) {
        this.revenueIndicatorType = pRevenueIndicatorType;
        this.revenueIndicatorTypeName = pTypeName;
    }

    /**
     * @return the revenueIndicatorType
     */
    public String getRevenueIndicatorType() {
        return this.revenueIndicatorType;
    }
   
    public String getRevenueIndicatorTypeName() {
        return this.revenueIndicatorTypeName;
    }


    /**
     * Gives the string format of enumerated <code>revenueIndicatorType</code>.
     * <p>
     * 
     * @return the current string value of the <code>revenueIndicatorType</code> .
     */
    public String value() {
        return this.name();
    }
}
