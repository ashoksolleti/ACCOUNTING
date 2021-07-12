/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>AccountRegionType</code> holds the constants to indicate AccountRegion type applied.
 * <p>
 * Following are the possible AccountRegionType type:<br>
 * <ul>
 * <li>AMERICA
 * <li>EUROPE
 * <li>ASIA
 * </ul>
 */
public enum AccountRegionType {
    /**
     * Constant used for AMERICA.
     */
    AMERICA("1"),
    /**
     * Constant used for EUROPE.
     */
    EUROPE("2"),
    /**
     * Constant used for ASIA.
     */
    ASIA("3");
    /**
     * Attribute to hold the <code>val</code> property.
     */
    private String val;

    /**
     * Parameterize constructor.
     * 
     * @param pValue
     *            the value.
     */
    AccountRegionType(final String pValue) {
        this.val = pValue;
    }

    /**
     * Gets the <code>AccountRegionType</code>.
     * <p>
     * 
     * @param pAccountRegionType
     *            holds the new value of <code>AccountRegionType</code>
     *            <p>
     * @return the value of <code>AccountRegionType</code>
     */
    public static AccountRegionType getAccountRegionType(
                final String pAccountRegionType) {

        AccountRegionType aAccountRegionType = null;

        for (final AccountRegionType aType : AccountRegionType.values()) {

            if (pAccountRegionType.equalsIgnoreCase(aType.getVal())) {
                aAccountRegionType = aType;
                break;
            }
        }

        return aAccountRegionType;

    }

    /**
     * Gets the <code>val</code> property.
     * <p>
     * 
     * @return the current value of the <code>val</code> property.
     */
    public String getVal() {
        return this.val;
    }

    /**
     * Sets the <code>val</code> property.
     * <p>
     * 
     * @param pVal the new value of the <code>val</code> property.
     */
    public void setVal(final String pVal) {
        this.val = pVal;
    }

    /**
     * Gives the string format of enumerated <code>AccountRegionType</code>.
     * <p>
     * 
     * @return the current value of the <code>AccountRegionType</code>
     */
    public String value() {
        return this.name();
    }

}
