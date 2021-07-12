package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <code>Price</code> holds the rate information for the requested rating line.
 * 
 * Price information contains two sets of attributes <br/>
 * 1. Attributes derived rating tables (ex: minimum weight, pivot weight, rate source, tariff rate) <br/>
 * 2. Attributes that contain calculated rates for the shipment (ex: amount in awb currency). Refer
 * {@link PriceCalculator} for details <br/>
 * 
 */
public class RateSegmentMinRateDto implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1600359211661536960L;

    /**
     * Attribute to hold <code>cheapestMinRate</code> property.
     */
    private BigDecimal cheapestMinRate;

    /**
     * Attribute to hold <code>highestMinRate</code> property.
     */
    private BigDecimal highestMinRate;

    public BigDecimal getCheapestMinRate() {
        return this.cheapestMinRate;
    }

    public BigDecimal getHighestMinRate() {
        return this.highestMinRate;
    }

    public void setCheapestMinRate(BigDecimal pCheapestMinRate) {
        this.cheapestMinRate = pCheapestMinRate;
    }

    public void setHighestMinRate(BigDecimal pHighestMinRate) {
        this.highestMinRate = pHighestMinRate;
    }

}
