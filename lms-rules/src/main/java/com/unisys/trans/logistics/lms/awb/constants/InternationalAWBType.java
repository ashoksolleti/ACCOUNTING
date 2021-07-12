//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.awb.constants;
/**
 * <code>InternationalAWBType</code> holds the constants to indicate InternationalAWB type applied.
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
     * Constant used for International Shipment.
     */
    I("INTERNATIONAL SHIPMENT"),
    
    /**
     * Constant used for Domestic Shipment.
     */
    D("DOMESTIC SHIPMENT"),
    
    /**
     * Constant used for North America.
     */
    N("NORTH AMERICA");
    
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
       this.shipment=pShipment;
    }

    /**
     * @return the shipment
     */
    public String getAudit() {
        return shipment;
    }

    /**
     * Gives the string format of enumerated <code>InternationalAWBType</code>.
     * <p>
     * 
     * @return the current string value of the <code>InternationalAWBType</code>.
     */
    public String value() {
        return this.name();
    }
}
