//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>AuthorizationCodeType</code> holds the constants to indicate AuthorizationCode Type applied.
 * <p>
 * Following are the possible AuthorizationCode type:<br>
 * <ul>
 * <li>ACCEPTED_WITH_UPDATES - Accepted With Updates
 * <li>ACCEPTED_AS_IS - Accepted As Is
 * <li>REJECTED - ejected
 * </ul>
 */

public enum AuthorizationCodeType {

    /**
     * Authorization Code for Accept with updates.
     */
    ACCEPTED_WITH_UPDATES("U"),

    /**
     * Authorization Code for Accept as is.
     */
    ACCEPTED_AS_IS("A"),

    /**
     * Authorization Code for rejected.
     */
    REJECTED("R");
    
    /**
     * Attribute to hold the <code>stringValue</code> property.
     */
    private String stringValue;

    /**
     * Parameterize constructor.
     * 
     * @param pAuthorizationCodeType
     *            the value.
     */
    AuthorizationCodeType(final String pAuthorizationCodeType) {
        this.setStringValue(pAuthorizationCodeType);
    }

    /**
     * Gets the stringValue.
     * <p>
     * 
     * @return the current value of <code>stringValue</code> property.<br>
     */
    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * Sets the stringValue.
     * <p>
     * 
     * @param pStringValue
     *            the current value of <code>stringValue</code> property.<br>
     */
    public void setStringValue(final String pStringValue) {
        this.stringValue = pStringValue;
    }

    /**
     * Default constructor.
     * 
     * @return the current value of <code>name</code> property.<br>
     * 
     */
    public String value() {
        return this.name();
    }

}
