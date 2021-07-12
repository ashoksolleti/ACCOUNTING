/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>TariffActionType</code> class holds the tariff action type constants.
 */
public enum TariffActionType {
    
    /**
     * Constant Update used for TariffActionType.
     */
    UPDATE("Update"),
    
    /**
     * Constant Exclude used for TariffActionType.
     */
    EXCLUDE("Exclude");

    /**
     * Attribute to hold the <code>type</code> property.
     */
    private String type;

    /**
     * Constructor with <code>TariffActionType</code> as an argument.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code>.<br>
     */
    private TariffActionType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * Holds the TariffActionType code.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.<br>
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * Holds the TariffActionType code.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code> property.<br>
     */
    public void setType(final String pType) {
        this.type = pType;
    }
    
    /**
     * Gets the <code>TariffActionType</code> property.
     * <p>
     * Holds the TariffActionType code.
     * @param pTariffActionType
     *            the enum representation of <code>TariffActionType</code>
     *            <p>
     * <p>
     * 
     * @return the current value of the <code>TariffActionType</code> property.<br>
     */
    public static TariffActionType getTariffActionType(final String pTariffActionType) {

        TariffActionType aTariffActionType = null;

        for (final TariffActionType aType : TariffActionType.values()) {
            if (pTariffActionType.equals(aType.value())) {
                aTariffActionType = aType;
                break;
            }
        }
        return aTariffActionType;
    }
    
    /**
     * The <code>value</code> method gives the string format of DirectionType.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the DirectionType.<br>
     */
    public String value() {
        return this.type;
    }
}
