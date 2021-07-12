//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>CreditType</code> holds the constants to indicate Credit type applied.
 * <p>
 * Following are the possible Credit type:<br>
 * <ul>
 * <li>C
 * <li>R
 * <li>B
 * <li>D
 * <li>N
 * <li>W
 * <li>Y
 * <li>Z
 * <li>$
 * </ul>
 */
public enum CreditType {

	/**
     * Constant used for Shipper.
     */
	 S("Shipper", "S"),
	 /**
	  * Constant used for IATA Agent.
	 */
	//A("IATA Agent", "A"),
	 A("Agent", "A"),
    /**
     * Constant used for Consignee.
     */
    C("Consignee", "C"),

    /**
     * Constant used for Collect Bill.
     */
    R("Collect Bill", "R"),

    /**
     * Constant used for Broker.
     */
    B("Broker", "B"),

    /**
     * Constant used for Delivery Agent.
     */
    D("Delivery Agent", "D"),

    /**
     * Constant used for Notify Agent.
     */
    N("Notify Agent", "N"),

    /**
     * Constant used for Sub-Contractor.
     */
    W("W-Subcontractor", "W"),

    /**
     * Constant used for Sub-Contractor.
     */
    Y("Y-Subcontractor", "Y"),

    /**
     * Constant used for Sub-Contractor.
     */
    Z("Z-Subcontractor", "Z"),

    /**
     * Constant used for Cash.
     */
    $("Cash", "$");

    /**
     * Attribute to hold the <code>credit</code> property.
     */
    private String credit;

    /**
     * Attribute to hold the <code>value</code> property.
     */
    private String value;

    /**
     * Parameterize constructor.
     * 
     * @param pCredit
     *            the value.
     */
    CreditType(final String pValue, final String pCredit) {
        this.value = pValue;
        this.credit = pCredit;
    }

    /**
     * @return the credit
     */
    public String getCredit() {
        return this.credit;
    }

    /**
     * Gives the string format of enumerated <code>CreditType</code>.
     * <p>
     * 
     * @return the current string value of the <code>CreditType</code>.
     */
    public String value() {
        return this.name();
    }

    /**
     * @return the value
     */
    public String getValue() {
        return this.value;
    }
}
