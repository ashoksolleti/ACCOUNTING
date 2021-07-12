/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>VolumeUOMType</code> indicates the different volume units.
 * <p>
 * The following are some of the commonly defined volume units: MC CF
 */

public enum VolumeUOMType {

    /**
     * Represents Volume unit in Cubic CentiMeter.
     */
    CC,
    /**
     * Represents Volume unit in Cubic Feet.
     */
    CF,
    /**
     * Represents Volume unit in Cubic Inch.
     */
    CI,
    /**
     * Represents Volume unit in Cubic Meter.
     */
    MC;

    private String type;

    /**
     * <code>Default constructor.</code>
     */
    VolumeUOMType() {
    }

    /**
     * Gets the <code>VolumeUOMType</code>.
     * <p>
     * 
     * @param pVolumeUOMType holds the new value of <code>VolumeUOMType</code>
     *            <p>
     * @return the current value of <code>VolumeUOMType</code>
     */
    public static VolumeUOMType getVolumeUOMType(final String pVolumeUOMType) {

        VolumeUOMType aVolumeUOMType = null;

        for (final VolumeUOMType aType : VolumeUOMType.values()) {

            if (pVolumeUOMType.equals(aType.value())) {
                aVolumeUOMType = aType;
                break;
            }
        }

        return aVolumeUOMType;
    }

    /**
     * This method returns the <code>VolumeUOMType</code> corresponding to the weight unit input.
     * <p>
     * <b>Possible Values:</b>
     * <ul>
     * <li>If KG is the weight unit input, then MC is returned.
     * <li>If LB is the weight unit input, then CF is returned.
     * </ul>
     * <p>
     * 
     * @param pWeightUOMType holds the weight unit.
     *            <p>
     * @return the current value of the <code>VolumeUOMType</code> property.
     */
    public static VolumeUOMType getVolumeUOMType(final WeightUOMType pWeightUOMType) {
        VolumeUOMType aUnitOfVolume = VolumeUOMType.MC;
        if (pWeightUOMType.equals(WeightUOMType.KG)) {
            aUnitOfVolume = VolumeUOMType.MC;
        }
        else if (pWeightUOMType.equals(WeightUOMType.LB)) {
            aUnitOfVolume = VolumeUOMType.CF;
        }
        return aUnitOfVolume;
    }

    /**
     * Gives the string format of enumerated <code>VolumeUOMType</code>.
     * <p>
     * 
     * @return the current value of the <code>VolumeUOMType</code>
     */
    public String value() {
        return this.name();
    }

    public String getType() {
        return type;
    }
}