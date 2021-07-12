/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <code>BreakPointRateDto</code> class contain information about break point charges applicable for an
 * OtherCharge rate type.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>breakPointTableOId
 * <li>rate
 * <li>upwardLimit
 * </code>
 * </ul>
 */
public class BreakPointRateDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2756083993184396130L;

    /**
     * Attribute to hold <code>breakPointTableOId</code>.
     * <p>
     * Represents the unique key value for <code>BreakPointTableDto</code>.
     */
    private Long breakPointTableOId;

    /**
     * Attribute to hold <code>oId</code>.
     * <p>
     * Represents the unique key value for <code>BreakPointRateDto</code>.
     */
    private Long oId;

    /**
     * Attribute to hold <code>rate</code>.
     * <p>
     * Represents the value for the rate applicable to the other charge.
     */
    private BigDecimal rate;

    /**
     * Attribute to hold <code>upwardLimit</code>.
     * <p>
     * Represents the value for break point upward limit.
     */
    private Integer upwardLimit;

    /**
     * <code>Default constructor</code>.
     */
    public BreakPointRateDto() {

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
     * Unique key to identify the <code>BreakPointRateDto</code>.It is of type Long.
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
     * Represents the break point rate applicable for the other charge.
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
     * Represents the upward limit for which the break point rate applies.
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
     * Unique key to identify the <code>BreakPointRateDto</code>.It is of type Long.
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
     * Represents the break point rate applicable for the other charge.
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
     * Represents the upward limit for which the break point rate applies.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
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
        aCapacity.append(this.rate);
        aCapacity.append(this.upwardLimit);
        return aCapacity.toString();
    }

}
