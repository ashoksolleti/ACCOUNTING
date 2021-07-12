//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>InternationalAWBType</code> holds the constants to indicate
 * InternationalAWB type applied.
 * <p>
 * Following are the possible InternationalAWB type:<br>
 * <ul>
 * <li>INTERNATIONAL SHIPMENT
 * <li>DOMESTIC SHIPMENT
 * <li>NORTH AMERICA
 * </ul>
 */
public enum InternationalAWBType {

    /**
     * Constant used for Domestic Shipment.
     */
    D("Domestic"),

    /**
     * Constant used for International Shipment.
     */
    I("International"),

    /**
     * Constant used for North America.
     */
    N("North America");

    /**
     * Attribute to hold the <code>status</code> property.
     */
    private String shipment;

    /**
     * Parameterize constructor.
     * 
     * @param pShipment
     *            the value.
     */
    InternationalAWBType(final String pShipment) {
        this.shipment = pShipment;
    }

    /**
     * Gets the audit.
     * <p>
     * 
     * @return the current value of <code>audit</code> property.<br>
     */
    public String getAudit() {
        return this.shipment;
    }

    /**
     * Gives the string format of enumerated <code>InternationalAWBType</code>.
     * <p>
     * 
     * @return the current string value of the <code>InternationalAWBType</code> .
     */
    public String value() {
        return this.name();
    }
    /*Code Added to run SK234A
    	Begin*/
    /**
     * Gets the <code>InternationalAWBType</code> based on the given string.
     * 
     * @param pValue
     *            the string representation of <code>InternationalAWBType</code>
     * @return
     *         A enum of type <code>InternationalAWBType</code>
     */

    public static InternationalAWBType fromValue(final String pValue) {
        return valueOf(pValue);
    }
    /*Code Added to run SK234A
		End*/
}
