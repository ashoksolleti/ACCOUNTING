/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>ULDChargeType</code> holds the constants to indicate ULDChargeType applied.
 * <p>
 * Following are the possible ULDChargeType:<br>
 * <ul>
 * <li>A - Pivot rate or charge per kilo
 * <li>B - First minimum charge
 * <li>C - First over pivot rate per kg
 * <li>D - Second minimum charge - minimum weight
 * <li>E - Second over pivot rate per kg
 * <li>F - Third minimum charge - minimum weight
 * <li>G - Third over pivot rate per kg
 * <li>H - Flat charge - minimum weight or no weight
 * <li>I - Flat charge - maximum weight
 * <li>J - Unitization incentive discount
 * </ul>
 */
public enum ULDChargeType {

    /**
     * Pivot rate or charge per kilo.
     */
    A("Pivot rate or charge per kilo ", 1, "U"),
    /**
     * First minimum charge - minimum weight.
     */
    B("First minimum charge - minimum weight", 2, "U"),
    /**
     * First over pivot rate per kg.
     */
    C("First over pivot rate per kg", 3, "E"),
    /**
     * Second minimum charge - minimum weight.
     */
    D("Second minimum charge - minimum weight", 4, "U"),
    /**
     * Second over pivot rate per kg .
     */
    E("Second over pivot rate per kg ", 5, "E"),
    /**
     * Third minimum charge - minimum weight.
     */
    F("Third minimum charge -  minimum weight", 6, "U"),
    /**
     * Third over pivot rate per kg .
     */
    G("Third over pivot rate per kg ", 7, "E"),
    /**
     * Flat charge - minimum weight or no weight.
     */
    H("Flat charge - minimum weight or no weight", 8, "U"),
    /**
     * Flat charge - maximum weight .
     */
    I("Flat charge - maximum weight ", 9, "U"),
    /**
     * Unitization incentive discount.
     */
    J("Unitization incentive discount ", 10, "U");

    /** Rate Class name. */
    private final String allowedRateClass;

    /** Rate Class description. */
    private final String description;

    /** Priority with which rate class is displayed. */
    private final int displayPriority;

    /**
     * Constructor.
     * 
     * @param pDescription
     *            - Rate Class Description
     * @param pDisplayPriority
     *            - Rate Class display priority
     * @param pAllowedRateClass
     *            - Allowed Rate Class
     */

    ULDChargeType(final String pDescription, final int pDisplayPriority,
                final String pAllowedRateClass) {
        this.description = pDescription;
        this.displayPriority = pDisplayPriority;
        this.allowedRateClass = pAllowedRateClass;
    }

    /**
     * Gets the value of allowedRateClass.
     * 
     * @return the allowedRateClass
     */
    public String getAllowedRateClass() {
        return this.allowedRateClass;
    }

    /**
     * Gets the value of description.
     * 
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the value of displayPriority.
     * 
     * @return the displayPriority
     */
    public int getDisplayPriority() {
        return this.displayPriority;
    }

    /**
     * Gives the string format of enumerated <code>ULDChargeCodeType</code>.
     * <p>
     * 
     * @return the current string value of the <code>ULDChargeCodeType</code>.
     */
    public String value() {
        return this.name();
    }
}
