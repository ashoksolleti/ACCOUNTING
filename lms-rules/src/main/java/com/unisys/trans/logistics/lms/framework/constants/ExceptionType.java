/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>ExceptionType</code> class maintains a list of exception type constants pertaining to the LMS module.
 */
public enum ExceptionType {

    /**
     * This is an enumerated action type constant to specify acknowledgment.
     */
    ACK("ACK"),

    /**
     * This is an enumerated action type constant to specify error.
     */
    ERR("Error"),

    /**
     * This is an enumerated action type constant to specify warning.
     */
    WARN("WARN"),
    /**
     * This is an enumerated action type constant to specify acknowledgment.
     */

    PRICINGERR("Non Override-able Error"),

    /**
     * This is an enumerated action type constant to specify error.
     */
    PRICINGOVERQERR("Override-able Queue Error "),

    /**
     * This is an enumerated action type constant to specify warning.
     */
    PRICINGOVERERR("Override-able Error"),
    /**
     * This is an enumerated action type constant to specify acknowledgment.
     */
    PRICINGQERR("Auto Queue Error"),

    /**
     * This is an enumerated action type constant to specify error.
     */
    PRICINGQWARN("Auto Queue Warning"),

    /**
     * This is an enumerated action type constant to specify SpotRate warning.
     */
    PRICINGSRAWARN("SpotRate Warning Flag"),
    /**
     * This is an enumerated action type constant to specify warning.
     */
    PRICINGWARN("Warning"),

    FAIL("FAIL");

    /**
     * Attribute to hold <code>exceptionType</code> property.
     */
    private String exceptionType;

    /**
     * <code>Parameterized Constructor.</code>
     * <p>
     * 
     * @param pExceptionType holds the new value of <code>exceptionType</code> property.
     */
    private ExceptionType(final String pExceptionType) {
        this.exceptionType = pExceptionType;
    }

    /**
     * Gets the <code>ExceptionType</code>.
     * <p>
     * 
     * @param pValue holds the new value of <code>ExceptionType</code>
     *            <p>
     * @return the current value of <code>ExceptionType</code>
     */
    public static ExceptionType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the <code>exceptionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>exceptionType</code> property.
     */
    public String getExceptionType() {
        return this.exceptionType;
    }

    /**
     * Gives the string format of enumerated <code>ExceptionType</code>.
     * <p>
     * 
     * @return the current value of the <code>ExceptionType</code>
     */
    public String value() {
        return this.name();
    }

}