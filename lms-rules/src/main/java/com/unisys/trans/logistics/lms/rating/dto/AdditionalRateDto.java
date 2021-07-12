/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <code>AdditionalRateDto</code> class contain information about additional charges applicable for an
 * OtherCharge rate type.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>breakPointTableOId
 * <li>additionalRateUnit
 * <li>rate
 * <li>upwardLimit
 * </code>
 * </ul>
 */
public class AdditionalRateDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8741528905450022853L;

    /**
     * Attribute to hold <code>additionalRateUnit</code>.
     * <p>
     * Represents the value of the units depend on which additional charges will be calculated.
     */
    private int additionalRateUnit;

    /**
     * Attribute to hold <code>breakPointTableOId</code>.
     * <p>
     * Unique key identify the <code>BreakPointTableDto</code>.It is of type Long.<br>
     */
    private Long breakPointTableOId;

    /**
     * Attribute to hold <code>oId</code>.
     * <p>
     * Unique key identify the <code>AdditionalRateDto</code>.It is of type Long.<br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>rate</code>.
     * <p>
     * Represents the additional rate applicable for the other charge.
     */
    private BigDecimal rate;

    /**
     * Attribute to hold <code>upwardLimit</code>.
     * <p>
     * Represents the upward limit for which the additional rate applies.
     */
    private Integer upwardLimit;

    /**
     * <code>Default Constructor</code>.
     */
    public AdditionalRateDto() {

    }

    /**
     * Gets the <code>additionalRateUnit</code> property.
     * <p>
     * Represents the value of the units depend on which additional charges will be calculated.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @return the current value of the <code>additionalRateUnit</code> property.<br>
     */
    public int getAdditionalRateUnit() {
        return this.additionalRateUnit;
    }

    /**
     * Gets the <code>breakPointTableOId</code> property.
     * <p>
     * Unique key to identify the <code>BreakPointTableDto</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>breakPointTableOId</code> property.<br>
     */
    public Long getBreakPointTableOId() {
        return this.breakPointTableOId;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>AdditionalRateDto</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>rate</code> property.
     * <p>
     * Represents the additional rate applicable for the other charge.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal<br>
     * <p>
     * <b>Example: </b><br>
     * 100.1
     * <p>
     * 
     * @return the current value of the <code>rate</code> property.<br>
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Gets the <code>upwardLimit</code> property.
     * <p>
     * Represents the upward limit for which the additional rate applies.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @return the current value of the <code>upwardLimit</code> property.<br>
     */
    public Integer getUpwardLimit() {
        return this.upwardLimit;
    }

    /**
     * Sets the <code>additionalRateUnit</code> property.
     * <p>
     * Represents the value of the units depend on which additional charges will be calculated.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @param pAdditionalRateUnit the new value of the <code>additionalRateUnit</code> property.
     */
    public void setAdditionalRateUnit(final int pAdditionalRateUnit) {
        this.additionalRateUnit = pAdditionalRateUnit;
    }

    /**
     * Sets the <code>breakPointTableOId</code> property.
     * <p>
     * Unique key to identify the <code>BreakPointTableDto</code>.It is of type Long.
     * <p>
     * 
     * @param pBreakPointTableOId the new value of the <code>breakPointTableOId</code> property.<br>
     */
    public void setBreakPointTableOId(final Long pBreakPointTableOId) {
        this.breakPointTableOId = pBreakPointTableOId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>AdditionalRateDto</code>.It is of type Long.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>rate</code> property.
     * <p>
     * Represents the additional rate applicable for the other charge.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal<br>
     * <p>
     * <b>Example: </b><br>
     * 100.1
     * <p>
     * 
     * @param pRate the new value of the <code>rate</code> property.<br>
     */
    public void setRate(final BigDecimal pRate) {
        this.rate = pRate;
    }

    /**
     * Sets the <code>upwardLimit</code> property.
     * <p>
     * Represents the upward limit for which the additional rate applies.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <b>Example: </b><br>
     * 100
     * 
     * @param pUpwardLimit the new value of the <code>upwardLimit</code> property.<br>
     */
    public void setUpwardLimit(final Integer pUpwardLimit) {
        this.upwardLimit = pUpwardLimit;
    }

    /**
     * This method overrides toString property.
     * <p>
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the string value.<br>
     *         </p>
     */
    @Override
    public String toString() {
        final StringBuilder aCapacity = new StringBuilder();
        aCapacity.append(this.additionalRateUnit);
        aCapacity.append(this.rate);
        aCapacity.append(this.upwardLimit);
        return aCapacity.toString();
    }

}
