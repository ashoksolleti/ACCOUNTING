/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>TerminalLocationType</code> enum defines the constants values for terminal location type.
 */

public enum TerminalLocationType {

    /**
     * This is an enumerated terminal location type constant for the location of type EXPORT.<br>
     */
    EXPORT("E"),

    /**
     * This is an enumerated terminal location type constant for the location of type GENERAL.<br>
     */
    GENERAL("G"),

    /**
     * This is an enumerated terminal location type constant for the location of type IMPORT.<br>
     */
    IMPORT("I"),

    /**
     * This is an enumerated terminal location type constant for the location of type ULD.<br>
     */
    ULD("ULD"),
    
    ULD_CONTROL("B");    // LMSC-11111 UIS158 Change

    /**
     * Attribute to hold <code>locationType</code>.
     */
    private String locationType;

    /**
     * Constructor with pTerminalLocationType as an argument sets the <code>locationType</code> attribute.
     * <p>
     * 
     * @param pTerminalLocationType the new value of the <code>locationType</code> attribute.
     */
    private TerminalLocationType(final String pTerminalLocationType) {
        this.locationType = pTerminalLocationType;
    }

    /**
     * Gives the <code>TerminalLocationType</code> for a terminal location type.
     * <p>
     * 
     * @param pValue the new value of the <code>locationType</code> property.<br>
     * @return the new enumerated value of the <code>locationType</code> property.
     */
    public static TerminalLocationType getLocationTypeFromValue(final String pValue) {

        TerminalLocationType aKey = null;
        for (final TerminalLocationType aType : TerminalLocationType.values()) {

            if (pValue.equalsIgnoreCase(aType.getLocationType())) {
                aKey = aType;
                break;
            }
        }
        return aKey;
    }

    /**
     * Gets the <code>locationType</code> property.
     * <p>
     * This is used as a mandatory attribute during create and update.
     * <p>
     * 
     * @param pTerminalLocationType the new value of the <code>locationType</code> property.<br>
     * @return the current value of the <code>locationType</code> property.
     */
    public static TerminalLocationType getTerminalLocationType(final String pTerminalLocationType) {

        TerminalLocationType aTerminalLocationType = null;

        for (final TerminalLocationType aType : TerminalLocationType.values()) {

            if (pTerminalLocationType.equals(aType.value())) {
                aTerminalLocationType = aType;
                break;
            }
        }
        return aTerminalLocationType;
    }

    /**
     * Gives the <code>locationType</code> property.
     * <p>
     * 
     * @return the current enumerated value of the <code>locationType</code> property.
     */
    public String getLocationType() {
        return this.locationType;
    }

    /**
     * Gives the string format of enumerated <code>locationType</code> for a terminal location type.
     * <p>
     * 
     * @return the current enumerated value of the <code>locationType</code>
     */
    public String value() {
        return this.name();
    }
}
