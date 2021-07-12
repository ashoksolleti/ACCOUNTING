/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>RatingCarrierRateSource</code> domain contains details of RatingCarrierRateSource.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>Ratesource
 * <li>RateSourceHierarchyDto
 * </ul>
 */
public class RateSourceHierarchyDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>pricingIndicator</code> property.
     */
    private boolean pricingIndicator;

    /**
     * Attribute to hold <code>rateSource</code> property.
     */
    private String rateSource;

    /**
     * Attribute to hold <code>rateSourceHierarchy</code> property.
     */
    private Integer rateSourceHierarchy;

    /**
     * <code>Default constructor.</code>
     */
    public RateSourceHierarchyDto() {
    }

    /**
     * Gets the value of <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>OId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return null;
    }

    /**
     * Gets the value of <code>pricingIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>pricingIndicator</code> property.<br>
     */
    public boolean getPricingIndicator() {
        return this.pricingIndicator;
    }

    /**
     * Gets the value of <code>rateSource</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateSource</code> property.<br>
     */
    public String getRateSource() {
        return this.rateSource;
    }

    /**
     * Gets the value of <code>rateSourceHierarchy</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateSourceHierarchy</code> property.<br>
     */
    public Integer getRateSourceHierarchy() {
        return this.rateSourceHierarchy;
    }

    /**
     * Sets the value of the <code>pricingIndicator</code> property.
     * <p>
     * 
     * @param pPricingIndicator the new value of the <code>pricingIndicator</code> property.<br>
     */
    public void setPricingIndicator(final boolean pPricingIndicator) {
        this.pricingIndicator = pPricingIndicator;
    }

    /**
     * Sets the value of the <code>rateSource</code> property.
     * <p>
     * 
     * @param pRateSource the new value of the <code>rateSource</code> property.<br>
     */
    public void setRateSource(final String pRateSource) {
        this.rateSource = pRateSource;
    }

    /**
     * Sets the value of the <code>rateSourceHierarchy</code> property.
     * <p>
     * 
     * @param pRateSourceHierarchy the new value of the <code>rateSourceHierarchy</code> property.<br>
     */
    public void setRateSourceHierarchy(final Integer pRateSourceHierarchy) {
        this.rateSourceHierarchy = pRateSourceHierarchy;
    }

}
