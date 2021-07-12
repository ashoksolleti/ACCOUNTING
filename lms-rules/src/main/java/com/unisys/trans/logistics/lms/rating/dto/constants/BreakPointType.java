/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>BreakPointType</code> holds the constants to specify the break point type.
 * <p>
 * The Breakpoint Type Table is used to determine the rate while calculating the additional charges.<br>
 * Breakpoint types are of three types, they are:
 * <li>RATES_FIXED,
 * <li>RATES_PER_UNIT
 * <li>RATES_PRO-RATED <br>
 * The default value for break point type is:RATES_PER_UNIT
 */
public enum BreakPointType {

    /**
     * Rates charged are a fixed value up to the breakpoint with an optional additional rate per unit or part
     * thereof.
     */
    RATES_FIXED(1),
    /**
     * Rates are charged per unit or part thereof up to the breakpoint.
     */
    RATES_PER_UNIT(2),
    /**
     * Rates are pro-rated up to the breakpoint.
     */
    RATES_PRORATED(3);

    /**
     * Attribute to hold the breakPointType property.
     */
    private Integer breakPointType;

    /**
     * Constructor with <code>breakPointType</code> as an argument.
     * <p>
     * 
     * @param pBreakPointType the new value of the <code>breakPointType</code>.<br>
     */
    BreakPointType(final Integer pBreakPointType) {
        this.breakPointType = pBreakPointType;
    }

    /**
     * The <code>fromValue</code> method returns the BreakPointType value.
     * <p>
     * 
     * @param pBreakPointType the new value of <code>BreakPointType</code>.
     *            <p>
     * @return the current enumerated value of the <code>BreakPointType</code>.
     */
    public static BreakPointType fromValue(final Integer pBreakPointType) {

        BreakPointType aBreakPointTypeValue = null;
        for (final BreakPointType aBreakPointType : BreakPointType.values()) {
            if (aBreakPointType.getBreakPointType().equals(pBreakPointType)) {
                aBreakPointTypeValue = aBreakPointType;
                break;
            }
        }
        return aBreakPointTypeValue;
    }

    /**
     * Gets the <code>breakPointType</code> property.
     * <p>
     * Represents the break point type for an other charge rate.
     * <p>
     * 
     * @return current value of the <code>breakPointType</code> property.<br>
     */
    public Integer getBreakPointType() {
        return this.breakPointType;
    }

    /**
     * The <code>value</code> method returns the Integer value of BreakPointType.
     * <p>
     * 
     * @return the current value of <code>BreakPointType</code>.
     */
    public Integer value() {
        return this.getBreakPointType();
    }
}