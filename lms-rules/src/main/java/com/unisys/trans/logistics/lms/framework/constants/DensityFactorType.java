package com.unisys.trans.logistics.lms.framework.constants;

import java.math.BigDecimal;

/**
 * <code>DensityFactorType</code> defines the constant values that is associated with the default density
 * volume.
 * <p>
 * This default density volume is used to calculate the accepted volume using the accepted weight.
 */
public enum DensityFactorType {

    /**
     * Represents density factor value 8.
     */
    EIGHT(8, new BigDecimal(0.0025)),
    /**
     * Represents density factor value 5.
     */
    FIVE(5, new BigDecimal(0.0166)),
    /**
     * Represents density factor value 4.
     */
    FOUR(4, new BigDecimal(0.0045)),
    /**
     * Represents density factor value 9.
     */
    NINE(9, new BigDecimal(0.0016)),
    /**
     * Represents density factor value 1.
     */
    ONE(1, new BigDecimal(0.0033)),
    /**
     * Represents density factor value 7.
     */
    SEVEN(7, new BigDecimal(0.0028)),
    /**
     * Represents density factor value 6.
     */
    SIX(6, new BigDecimal(0.0040)),
    /**
     * Represents density factor value 10.
     */
    TEN(10, new BigDecimal(0.0010)),
    /**
     * Represents density factor value 3.
     */
    THREE(3, new BigDecimal(0.0083)),
    /**
     * Represents density factor value 2.
     */
    TWO(2, new BigDecimal(0.0111)),
    /**
     * Represents density factor value 0.
     */
    ZERO(0, new BigDecimal(0.0062));

    /**
     * Attribute to hold <code>densityFactor</code> property.
     */
    private BigDecimal densityFactor;

    /**
     * Attribute to hold <code>key</code> property.
     */
    private int key;

    /**
     * <code>Parameterized Constructor</code>.
     * <p>
     * 
     * @param pKey holds the new value of <code>key</code> property.
     * @param pDensityFactor holds the new value of the <code>densityFactor</code> property.
     */
    private DensityFactorType(final int pKey, final BigDecimal pDensityFactor) {
        this.densityFactor = pDensityFactor;
        this.key = pKey;
    }

    /**
     * Gets the <code>DensityFactorType</code>.
     * <p>
     * 
     * @param pDensityFactorType holds the new value of <code>DensityFactorType</code>
     *            <p>
     * @return the current value of <code>DensityFactorType</code>
     */
    public static DensityFactorType getDensityFactorType(final String pDensityFactorType) {

        DensityFactorType aDensityFactorType = null;

        for (final DensityFactorType aType : DensityFactorType.values()) {

            if (pDensityFactorType.equals(String.valueOf(aType.key))) {
                aDensityFactorType = aType;
                break;
            }
        }

        return aDensityFactorType;
    }

    /**
     * Gets the <code>densityFactor</code> property.
     * <p>
     * 
     * @return the current value of the <code>densityFactor</code> property.
     */
    public BigDecimal getDensityFactor() {
        return this.densityFactor;
    }

    /**
     * Gets the <code>key</code> property.
     * <p>
     * 
     * @return the current value of the <code>key</code> property.
     */
    public int getKey() {
        return this.key;
    }

    /**
     * Gives the string format of enumerated <code>DensityFactorType</code>.
     * <p>
     * 
     * @return the current value of the <code>DensityFactorType</code>
     */
    public String value() {
        return this.name();
    }
}
