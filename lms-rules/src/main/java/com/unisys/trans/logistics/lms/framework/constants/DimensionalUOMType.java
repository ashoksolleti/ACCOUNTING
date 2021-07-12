/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

import java.math.BigDecimal;

/**
 * <code>DimensionalUOMType</code> contains dimensional units and conversion constants for the calculation of
 * volume in cubic inches and cubic centimeter.
 */
public enum DimensionalUOMType {

    /**
     * Represents unit of measurement in centimeter.
     */
    CM(new BigDecimal(0.061023779), new BigDecimal(1)),
    /**
     * Represents unit of measurement in feet.
     */
    FT(new BigDecimal(1728), new BigDecimal(28317)),
    /**
     * Represents unit of measurement in inch.
     */
    IN(new BigDecimal(1), new BigDecimal(16.387)),
    /**
     * Represents unit of measurement in meter.
     */
    ME(new BigDecimal(61023.3779), new BigDecimal(1000000)),
    /**
     * Represents unit of measurement in yard.
     */
    YD(new BigDecimal(46656), new BigDecimal(764600));
    /**
     * Attribute to hold <code>cubicCentimeterConversionConstant</code> property.
     */
    private BigDecimal cubicCentimeterConversionConstant;

    /**
     * Attribute to hold <code>cubicInchesConversionConstant</code> property.
     */
    private BigDecimal cubicInchesConversionConstant;

    /**
     * <code>Parameterize constructor.</code>
     * <p>
     * 
     * @param pCubicInches holds the new value of <code>cubicInchesConversionConstant</code> property.
     * @param pCubicCentimeter holds the new value of <code>cubicCentimeterConversionConstant</code> property.
     */
    DimensionalUOMType(final BigDecimal pCubicInches, final BigDecimal pCubicCentimeter) {
        this.cubicInchesConversionConstant = pCubicInches;
        this.cubicCentimeterConversionConstant = pCubicCentimeter;
    }

    /**
     * Gets the <code>cubicCentimeterConversionConstant</code> property.
     * <p>
     * 
     * @return the current value of <code>cubicCentimeterConversionConstant</code> property.
     */
    public BigDecimal getCubicCentimeterConversionConstant() {
        return this.cubicCentimeterConversionConstant;
    }

    /**
     * Gets the <code>cubicInchesConversionConstant</code> property.
     * <p>
     * 
     * @return the current value of <code>cubicInchesConversionConstant</code> property.
     */
    public BigDecimal getCubicInchesConversionConstant() {
        return this.cubicInchesConversionConstant;
    }

    /**
     * Gives the string format of enumerated <code>DimensionalUOMType</code>.
     * <p>
     * 
     * @return the current value of the <code>DimensionalUOMType</code>
     */
    public String value() {
        return this.name();
    }

}