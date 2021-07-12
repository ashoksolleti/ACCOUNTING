/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * Percent applied to the different rates that are charged. Valid values are:
 * ACTUAL_TOT_WGT_CHRG_AND_VALUATION_CHRG - A
 * ACTUAL_TOT_WGT_CHRG_AND_VALUATION_CHRG_AND_OTHR_COLLECT_CHRG_EXCEPT_FC - B
 * FACE_TOT_WGT_CHRG_AND_VALUATION_CHRG - C
 * FACE_TOT_WGT_CHRG_AND_VALUATION_CHRG_AND_OTHR_COLLECT_CHRG_EXCEPT_FC - D ONLY_CONTRACT_RATES - E Default
 * value is RatePercentageType.ACTUAL_TOT_WGT_CHRG_AND_VALUATION_CHRG.
 */
public enum RatePercentageType {

    /**
     * Indicates that the percentage applicable for the other charge is levied/charged on the Actual Total
     * Weight Charges & Valuation Charges.
     */
    ACTUAL_TOT_WGT_CHRG_AND_VALUATION_CHRG(4),
    /**
     * Indicates that the percentage applicable for the other charge is levied/charged on the Actual Total
     * Weight Charges & Valuation Charges & Other Collect Charges Except FC.
     */
    ACTUAL_TOT_WGT_CHRG_AND_VALUATION_CHRG_AND_OTHR_COLLECT_CHRG_EXCEPT_FC(2),
    /**
     * Indicates that the percentage applicable for the other charge is levied/charged on the Face Total
     * Weight Charges & Valuation Charges.
     */
    FACE_TOT_WGT_CHRG_AND_VALUATION_CHRG(5),
    /**
     * Indicates that the percentage applicable for the other charge is levied/charged on the Face Total
     * Weight Charges & Valuation Charges & Other Collect Charges Except FC.
     */
    FACE_TOT_WGT_CHRG_AND_VALUATION_CHRG_AND_OTHR_COLLECT_CHRG_EXCEPT_FC(3),
    /**
     * Indicates that the percentage applicable for the other charge is levied/charged on Contract Rates.
     */
    ONLY_CONTRACT_RATES(1);

    /**
     * Attribute to hold the ratePercentageType property.
     */
    private Integer ratePercentageType;

    /**
     * Constructor.
     * 
     * @param pRatePercentageType The request object holds the rate percentage type.<br>
     */
    RatePercentageType(final Integer pRatePercentageType) {
        this.ratePercentageType = pRatePercentageType;
    }

    /**
     * The <code>fromValue</code> method returns the RatePercentageType value.
     * <p>
     * 
     * @param pRatePercentageType The request object holds the rate percentage type.<br>
     * @return <code>RatePercentageType</code><br>
     *         Returns the enumerated value of the RatePercentageType class.<br>
     */
    public static RatePercentageType fromValue(final Integer pRatePercentageType) {

        RatePercentageType aRatePercentageType = null;
        for (final RatePercentageType bRatePercentageType : RatePercentageType.values()) {
            if (bRatePercentageType.getRatePercentageType().equals(pRatePercentageType)) {
                aRatePercentageType = bRatePercentageType;
                break;
            }
        }
        return aRatePercentageType;
    }

    /**
     * Gets the value of <code>ratePercentageType</code> property.
     * <p>
     * 
     * @return <code>Integer</code><br>
     *         Returns the current value of the <code>ratePercentageType</code> property.<br>
     *         </p>
     */
    public Integer getRatePercentageType() {
        return this.ratePercentageType;
    }

    /**
     * The <code>value</code> method returns the string value of RatePercentageType.
     * <p>
     * 
     * @return <code>Integer</code><br>
     *         Returns the enumerated value of the RatePercentageType class.<br>
     */
    public Integer value() {
        return this.getRatePercentageType();
    }
}