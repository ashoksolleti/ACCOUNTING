/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */

/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto.ucs;

/**
 * <code>CargoClassificationType</code> holds the constants to specify the
 * classification of a cargo.
 * <p>
 */
public enum CargoClassificationType {

    /**
     * Combination.<br>
     */

    PC("Combination"),

    /**
     * Freighter.
     */

    AC("Freighter"),

    /**
     * Passenger.<br>
     */

    BC("Passenger");

    private final String cargoClassificationType;

    /**
     * Constructor with pCargoClassificationType as an argument sets the <code>cargoClassificationType</code>
     * attribute.
     * <p>
     * 
     * @param pCargoClassificationType
     *            holds the <code>cargoClassificationType</code>.
     */
    CargoClassificationType(final String pCargoClassificationType) {
        this.cargoClassificationType = pCargoClassificationType;
    }

    /**
     * The <code>fromValue</code> method returns the <code>CargoClassificationType</code> value.
     * <p>
     * 
     * @param pValue
     *            holds the Cargo Classification Type.
     *            <p>
     * @return the enumerated value of the <code>CargoClassificationType</code>.
     */
    public static CargoClassificationType fromValue(final String pValue) {

        CargoClassificationType aCargoClassificationType = CargoClassificationType.AC;

        if (pValue != null) {
            for (final CargoClassificationType aType : CargoClassificationType
                        .values()) {
                if (pValue.equals(aType.value())) {
                    aCargoClassificationType = aType;
                    break;
                }
            }
        }
        return aCargoClassificationType;
    }

    /**
     * Gets the <code>cargoClassificationType</code> attribute.
     * <p>
     * 
     * @return the current value of <code>cargoClassificationType</code> property.
     */
    public String getCargoClassificationType() {
        return this.cargoClassificationType;
    }

    /**
     * Gives the string value of <code>CargoClassificationType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>cargoClassificationType</code> property.
     */
    public String value() {
        return this.getCargoClassificationType();
    }
    
    /**
     * Gets the key of the enum.
     * <p>
     * 
     * @param pValue
     *            <code>String</code><br>
     *            The value of the enumerated type.<br>
     *            </p>
     *            <p>
     * @return <code>CargoClassificationType</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public static CargoClassificationType getKey(final String pValue) {
    	CargoClassificationType aKey = null;
        for (final CargoClassificationType aCargoClassificationType : CargoClassificationType.values()) {
            if (pValue.equalsIgnoreCase(aCargoClassificationType.name())) {
                aKey = aCargoClassificationType;
            }
        }
        return aKey;
    }

}
