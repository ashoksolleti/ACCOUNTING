//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;
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
    I("International Shipment"),
    
    /**
     * Constant used for Domestic Shipment.
     */
    D("Domestic Shipment"),
    
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
       this.shipment=pShipment;
    }

    /**
     * @return the shipment
     */
    public String getShipment() {
        return this.shipment;
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
    public static InternationalAWBType getInternationalAWBType(final String pInternationalAWBType) {

        InternationalAWBType aMatchedInternationalAWBType = null;

        for (final InternationalAWBType aType : InternationalAWBType.values()) {

            if (pInternationalAWBType.equals(aType.value())) {
                aMatchedInternationalAWBType = aType;
                break;
            }
        }

        return aMatchedInternationalAWBType;

    }
}
