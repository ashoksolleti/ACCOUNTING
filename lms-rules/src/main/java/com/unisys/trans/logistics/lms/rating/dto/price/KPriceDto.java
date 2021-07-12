/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.rating.dto.constants.RateIndicatorType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

/**
 * <code>Price</code> holds the rate information for the requested rating line.
 * 
 * Price information contains two sets of attributes <br/>
 * 1. Attributes derived rating tables (ex: minimum weight, pivot weight, rate source, tariff rate) <br/>
 * 2. Attributes that contain calculated rates for the shipment (ex: amount in awb currency). Refer
 * {@link PriceCalculator} for details <br/>
 * 
 */
public class KPriceDto implements Serializable {
    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = 1600359211661536960L;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;

    /**
     * Attribute to hold <code>rateClassCode</code> property.
     */
    private RateClassType rateClassCode;

    /**
     * Attribute to hold <code>rateIndicator</code> property.
     * Indicator for rate (Flat/Per Unit/Per Piece).Allowed Values are:
     * F - Flat Rate
     * U - Per Unit of weight rate
     * P - Flat Rate, Per Piece
     */
    private RateIndicatorType rateIndicator;

    private BigDecimal rateTotalCharges;

    /**
     * Gets the <code>amount</code> property.
     * <p>
     * 
     * @return the current value of the <code>amount</code> property.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Gets the <code>rateClassCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateClassCode</code> property.
     */
    public RateClassType getRateClassCode() {
        return rateClassCode;
    }

    /**
     * Gets the <code>rateIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateIndicator</code> property.
     */
    public RateIndicatorType getRateIndicator() {
        return rateIndicator;
    }

    /**
     * Gets the <code>rateTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateTotalCharges</code> property.
     */
    public BigDecimal getRateTotalCharges() {
        return rateTotalCharges;
    }

    /**
     * Sets the <code>amount</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>amount</code> property.<br>
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    /**
     * Sets the <code>rateClassCode</code> property.
     * <p>
     * 
     * @param pRateClassCode
     *            the current value of the <code>rateClassCode</code> property.<br>
     */
    public void setRateClassCode(final RateClassType pRateClassCode) {
        this.rateClassCode = pRateClassCode;
    }

    /**
     * Sets the <code>rateIndicator</code> property.
     * <p>
     * 
     * @param pRateIndicator
     *            the current value of the <code>rateIndicator</code> property.<br>
     */
    public void setRateIndicator(final RateIndicatorType pRateIndicator) {
        this.rateIndicator = pRateIndicator;
    }

    /**
     * Sets the <code>rateTotalCharges</code> property.
     * <p>
     * 
     * @param pRateTotalCharges
     *            the current value of the <code>rateTotalCharges</code> property.<br>
     */
    public void setRateTotalCharges(final BigDecimal pRateTotalCharges) {
        this.rateTotalCharges = pRateTotalCharges;
    }
}
