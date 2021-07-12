/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>RestrictionType</code> class holds the type code that differentiates between product code, station,
 * country and special handling code.
 * <p>
 */
public enum RestrictionType {

    /**
     * Holds the Country type code.
     */
    COUNTRYCODE("C"),

    /**
     * Holds the Product type code.
     */
    PRODUCTCODE("P"),

    /**
     * Holds the SpecialHandlingCode type code.
     */
    SPECIALHANDLINGCODE("H"),

    /**
     * Holds the Station type code.
     */
    STATIONCODE("S");

    /**
     * Attribute to hold <code>type</code>.
     */
    private final String type;

    /**
     * Constructor with type code as an argument.
     * <p>
     * 
     * @param pType The request object holds the type code.
     */
    RestrictionType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the <code>type</code> of a restriction.
     * <p>
     * Restriction can contain multiple type codes.
     * 
     * @return the current value of the <code>type</code>.
     */
    public String getRestrictionType() {
        return this.type;
    }

    /**
     * Gives the string format of enumerated <code>type</code> for an air waybil.
     * <p>
     * 
     * @return the enumerated value of the <code>type</code>.<br>
     */
    public String value() {
        return this.name();
    }
}
