/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>WeightUOMType</code> indicates the different weight units.
 * <p>
 */

public enum WeightUOMType {
    /**
     * used to represent each ULD.
     */
    EACH("E"),

    /**
     * Represents weight in Kilogram.
     */
    KG("K"),

    /**
     * Represents weight in pound.
     */
    LB("P");

    /**
     * Gets the <code>WeightUOMType</code>.
     * <p>
     * 
     * @param pWeightUOMType
     *            holds the new value of <code>WeightUOMType</code>
     *            <p>
     * @return the current value of <code>WeightUOMType</code>
     */
    public static WeightUOMType getWeightUOMType(final String pWeightUOMType) {

        WeightUOMType aWeightUOMType = null;

        for (final WeightUOMType aType : WeightUOMType.values()) {

            if (pWeightUOMType.equals(aType.value())) {
                aWeightUOMType = aType;
                break;
            }
        }

        return aWeightUOMType;

    }
    
    public static WeightUOMType getWeightUOMTypeFromCode(final String pWeightUOMType) {

        WeightUOMType aWeightUOMType = null;

        for (final WeightUOMType aType : WeightUOMType.values()) {

            if (pWeightUOMType.equals(aType.getWeightUnit())) {
                aWeightUOMType = aType;
                break;
            }
        }

        return aWeightUOMType;

    }


    private String weightUnit;

    private String type;

    /**
     * <code>Default constructor.</code>
     */

    WeightUOMType() {
    }

    /**
     * <code>Argumented constructor.</code>
     *
     * @param pWeightType
     *            - weight unit in short, i.e E for Each,K for KG, P for LB.
     */
    WeightUOMType(final String pWeightType) {
        this.weightUnit = pWeightType;
    }

    /**
     * Gives the string format of enumerated <code>WeightUOMType</code>.
     * <p>
     * 
     * @return the current value of the <code>WeightUOMType</code>
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Sets the string format of enumerated <code>WeightUOMType</code>.
     * <p>
     * 
     * @param pWeightUnit sets the weight unit.
     */
    public void setWeightUnit(final String pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }

    /**
     * Gives the string format of enumerated <code>WeightUOMType</code>.
     * <p>
     * 
     * @return the current value of the <code>WeightUOMType</code>
     */
    public String value() {
        return this.name();
    }

    public String getType() {
        return type;
    }
}