/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;

public class RateTypePercentagePrice implements Serializable {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = -9130253862479633362L;

    /**
     * Attribute to hold <code>percentage</code> property.
     */
    private Integer percentage;

    /**
     * Attribute to hold <code>rateTypeCode</code> property.
     */
    private String rateTypeCode;

    /**
     * Gets the <code>percentage</code> property.
     * <p>
     * 
     * @return the current value of the <code>percentage</code> property.
     */
    public Integer getPercentage() {
        return this.percentage;
    }

    /**
     * Gets the <code>rateTypeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateTypeCode</code> property.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Sets the <code>percentage</code> property.
     * <p>
     * 
     * @param pPercentage
     *            the current value of the <code>percentage</code> property.<br>
     */
    public void setPercentage(final Integer pPercentage) {
        this.percentage = pPercentage;
    }

    /**
     * Sets the <code>rateTypeCode</code> property.
     * <p>
     * 
     * @param pRateTypeCode
     *            the current value of the <code>rateTypeCode</code> property.<br>
     */
    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = pRateTypeCode;
    }

}
