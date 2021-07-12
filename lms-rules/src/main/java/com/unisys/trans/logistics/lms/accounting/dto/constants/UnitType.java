//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>UnitType</code> holds the constants to indicate UnitType type applied.
 * <p>
 * Following are the possible UnitType type:<br>
 * <ul>
 * <li>CF
 * <li>CI
 * <li>MC
 * <li>CC
 * </ul>
 */
public enum UnitType {

    /**
     * Constant used for CF - unit.
     */
    CF("CF"),
    
    /**
     * Constant used for Shipper.
     */
    CI("CI"),
    
    /**
     * Constant used for Shipper.
     */
    MC("MC"),
    
    /**
     * Constant used for Shipper.
     */
    CC("CC");
    /**
     * Attribute to hold the <code>unit</code> property.
     */
    private String unit;
    
    /**
     * Parameterize constructor.
     * 
     * @param pUnit
     *            the value.
     */
    UnitType(final String pUnit) {
       this.unit=pUnit;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return this.unit;
    }
    
    /**
     * Gives the string format of enumerated <code>UnitType</code>.
     * <p>
     * 
     * @return the current string value of the <code>UnitType</code>.
     */
    public String value() {
        return this.name();
    }
    
}
