//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>GenIdType</code> holds the constants to indicate GenId type applied.
 * <p>
 * Following are the possible GenId type:<br>
 * <ul>
 * <li>C
 * <li>D
 * <li>E
 * <li>F
 * <li>G
 * <li>M
 * </ul>
 */
public enum GenIdType {

    /**
     * Constant used for Miscellaneous charge amount manually entered expressed
     * in the local currency of the station.
     */
    C("C"),

    /**
     * Constant used for Valid only when the DCGO delete miscellaneous charge
     * code dynamic parameter (C$DMSC) is set to Y.
     */
    D("D"),

    /**
     * Constant used for Other charge is not available, and the air waybill is
     * put on the Miscellaneous Charge queue by queue by force accepting the
     * updates to the air waybill.
     */
    E("E"),

    /**
     * Constant used for The charge, charge code, and indicator are generated by
     * the FWB message.
     */
    F("F"),

    /**
     * Constant used for - Other charge and indicator generated by automatic
     * other charges.
     */
    G("G"),

    /**
     * Constant used for - Other charge and indicator generated by automatic
     * other charges.
     */
    R("R"),

    /**
     * Constant used for Other charge manually entered (indicator generated by
     * system).
     */
    M("M");

    /**
     * Attribute to hold the <code>genId</code> property.
     */
    private String genId;

    /**
     * Parameterize constructor.
     * 
     * @param pGenId
     *            the value.
     */
    GenIdType(final String pGenId) {
        this.genId = pGenId;
    }

    /**
     * @return the genId
     */
    public String getStatus() {
        return this.genId;
    }

    /**
     * Gives the string format of enumerated <code>ShipmentStatusType</code>.
     * <p>
     * 
     * @return the current string value of the <code>ShipmentStatusType</code>.
     */
    public String value() {
        return this.name();
    }
}
