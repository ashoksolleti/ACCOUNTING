package com.unisys.trans.logistics.lms.utils.constants;

import java.math.BigDecimal;

/**
 * <code>DimensionalVolumeConversionType</code>holds constants used for converting dimensional volume into
 * dimensional weight i.e weight=volume/constant.
 * <p>
 * Constants are defined in:KG-Kilogram,LB-Pound for north American and non-north American routings.<br>
 */
public enum DimensionalVolumeConversionType {
    /**
     * Constant for Non-North American routing when unit of weight is KG.
     */
    NON_NORTH_AMERICAN_KG_WEIGHT(new BigDecimal(6000)),
    /**
     * Constant for Non-North American routing when unit of weight is LB.
     */
    NON_NORTH_AMERICAN_LB_WEIGHT(new BigDecimal(166)),
    /**
     * Constant for North American routing when unit of weight is KG.
     */
    NORTH_AMERICAN_KG_WEIGHT(new BigDecimal(7000)),
    /**
     * Constant for North American routing when unit of weight is LB.
     */
    NORTH_AMERICAN_LB_WEIGHT(new BigDecimal(194));
    /**
     * Attribute to hold the <code>weightConstant</code> property.
     */
    private BigDecimal weightConstant;

    /**
     * <code>Parameterized constructor.</code>
     * <p>
     * 
     * @param pWeightConstant <code>BigDecimal</code>
     */

    DimensionalVolumeConversionType(final BigDecimal pWeightConstant) {
        this.weightConstant = pWeightConstant;
    }

    /**
     * Gets <code>weightConstant</code> property.
     * <p>
     * 
     * @return the current value of <code>weightConstant</code> property.
     */
    public BigDecimal getWeightConstant() {
        return this.weightConstant;
    }

}
