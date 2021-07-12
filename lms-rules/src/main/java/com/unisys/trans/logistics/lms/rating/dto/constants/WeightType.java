/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>WeightType</code> holds the constants to indicates how the other charge should be generated based on
 * the type of weight charges.
 * <p>
 * Valid values for <code>WeightType</code> are:
 * <ul>
 * <li>CHARGEABLE - C
 * <li>DIMENSIONAL - D
 * <li>GROSS - G
 * </ul>
 * Default value is : GROSS
 */
public enum WeightType {
    /**
     * The other charge is generated based on the chargeable weight.
     */
    CHARGEABLE_ON_ACTUAL("A"),

    /**
     * The other charge is generated based on the chargeable weight.
     */
    CHARGEABLE_ON_FACE_VALUE("F"),

    /**
     * The other charge is generated based on the dimensional weight.
     */
    DIMENSIONAL("D"),

    /**
     * The other charge is generated based on the gross weight.
     */
    GROSS("G");

    private String weightType;

    /**
     * Constructor with <code>weightType</code> as an argument.
     * <p>
     * 
     * @param pWeightType the new value of the <code>weightType</code>.<br>
     */
    WeightType(final String pWeightType) {
        this.weightType = pWeightType;
    }

    /**
     * The <code>fromValue</code> method returns the <code>WeightType</code> value.
     * <p>
     * 
     * @param pWeightType the new value of <code>WeightType</code>.
     *            <p>
     * @return the current enumerated value of the <code>WeightType</code>.
     */
    public static WeightType fromValue(final String pWeightType) {

        WeightType aWeightType = null;
        for (final WeightType bWeightType : WeightType.values()) {
            if (bWeightType.getWeightType().equals(pWeightType)) {
                aWeightType = bWeightType;
                break;
            }
        }
        return aWeightType;
    }

    /**
     * Gets the <code>weightType</code> property.
     * <p>
     * Holds the value of weight type.
     * <p>
     * 
     * @return the current value of the <code>weightType</code> property.<br>
     */
    public String getWeightType() {
        return this.weightType;
    }

    /**
     * The <code>value</code> method returns the string value of <code>WeightType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>WeightType</code>.<br>
     */
    public String value() {
        return this.getWeightType();
    }
}