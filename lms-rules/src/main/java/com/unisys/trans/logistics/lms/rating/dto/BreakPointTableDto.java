/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.rating.dto.constants.BreakPointType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <code>BreakPointTableDto</code> class contain information about break point type and break point units
 * applicable for an OtherCharge rate type.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>oId</code></li>
 * <li><code>breakPointUnits</code></li>
 * <li><code>breakPointType</code></li>
 * <li><code>upwardLimit</code></li>
 * </ul>
 */
public class BreakPointTableDto implements Serializable {

    /**
     * Holds the value for the maximum possible occurrences of additional rates.
     * <p>
     * Value = {@value}
     */
    private static final int ALLOWABLE_ADDITIONAL_RATES = 4;

    /**
     * Holds the value for the maximum possible occurrences of break point rates.
     * <p>
     * Value = {@value}
     */
    private static final int ALLOWABLE_BREAK_POINT_RATES = 10;

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5523759930681870165L;

    /**
     * Attribute to hold <code>additionalRates</code>.
     * <p>
     * Represents the reference of AdditionalRateDto object.
     */
    private List<AdditionalRateDto> additionalRates = new ArrayList<AdditionalRateDto>(
                ALLOWABLE_ADDITIONAL_RATES);

    /**
     * Attribute to hold <code>breakPointRates</code>.
     * <p>
     * Represents the reference of BreakPointRateDto object.
     */
    private List<BreakPointRateDto> breakPointRates = new ArrayList<BreakPointRateDto>(
                ALLOWABLE_BREAK_POINT_RATES);

    /**
     * Attribute to hold <code>breakPointType</code>.
     * <p>
     * Represents the unit(s) for reading the breakpoint table type which help to calculate other charges.
     */
    private BreakPointType breakPointType;

    /**
     * Attribute to hold <code>breakPointUnits</code>.
     * <p>
     * Represents the unit(s) for reading the breakpoint table.
     */
    private int breakPointUnits;

    /**
     * Attribute to hold <code>oId</code>.
     * <p>
     * Represents the Unique key value for <code>BreakPointTableDto</code>.
     */
    private Long oId;

    /**
     * <code>Default constructor</code>.
     */
    public BreakPointTableDto() {

    }

    /**
     * Gets the <code>additionalRates</code> property.
     * <p>
     * Represents the list of additional rate which is applicable for an other charge type.
     * <p>
     * 
     * @return the current list of the <code>AdditionalRateDto</code> property.<br>
     */
    public List<AdditionalRateDto> getAdditionalRates() {
        return this.additionalRates;
    }

    /**
     * Gets the <code>breakPointRates</code> property.
     * <p>
     * Represents the list of break point rate which is applicable for an other charge rate type.
     * <p>
     * 
     * @return the current list of the <code>BreakPointRateDto</code> property.<br>
     */
    public List<BreakPointRateDto> getBreakPointRates() {
        return this.breakPointRates;
    }

    /**
     * Gets the <code>breakPointType</code> property.
     * <p>
     * Represents the break point type for an other charge rate type.
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric<br>
     * Range : 1-3
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @return the current value of the <code>breakPointType</code> property.<br>
     */
    public BreakPointType getBreakPointType() {
        return this.breakPointType;
    }

    /**
     * Gets the <code>breakPointUnits</code> property.
     * <p>
     * Represents the unit(s) for reading the breakpoint table.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @return the current value of the <code>breakPointUnits</code> property.<br>
     */
    public int getBreakPointUnits() {
        return this.breakPointUnits;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>BreakPointTableDto</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>additionalRates</code> property.
     * <p>
     * Represents the additional rate applicable for an other charge rate type.
     * <p>
     * 
     * @param pAdditionalRates the new list of the <code>additionalRates</code> property.<br>
     */
    public void setAdditionalRates(final List<AdditionalRateDto> pAdditionalRates) {
        this.additionalRates = pAdditionalRates;
    }

    /**
     * Sets the <code>breakPointRates</code> property.
     * <p>
     * Represents the break point rate applicable for an other charge rate type.
     * <p>
     * 
     * @param pBreakPointRates the new list of the <code>breakPointRates</code> property.<br>
     */
    public void setBreakPointRates(final List<BreakPointRateDto> pBreakPointRates) {
        this.breakPointRates = pBreakPointRates;
    }

    /**
     * Sets the <code>breakPointType</code> property.
     * <p>
     * Represents the break point type for an other charge rate type.
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric<br>
     * Range : 1-3
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @param pBreakPointType the new list of the <code>breakPointType</code> property.<br>
     */
    public void setBreakPointType(final BreakPointType pBreakPointType) {
        this.breakPointType = pBreakPointType;
    }

    /**
     * Sets the <code>breakPointUnits</code> property.
     * <p>
     * Represents the unit(s) for reading the breakpoint table.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pBreakPointUnits the new list of the <code>breakPointUnits</code> property.<br>
     */
    public void setBreakPointUnits(final int pBreakPointUnits) {
        this.breakPointUnits = pBreakPointUnits;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>BreakPointTableDto</code>.It is of type Long.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
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
        aCapacity.append(this.breakPointUnits);
        aCapacity.append(this.breakPointType);
        return aCapacity.toString();
    }
}
