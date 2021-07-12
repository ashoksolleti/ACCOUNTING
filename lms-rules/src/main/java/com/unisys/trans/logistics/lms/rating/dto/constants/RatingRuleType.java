/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>RatingRuleType</code> holds the constants to indicate ClassRatingRule type applied.
 * <p>
 * Following are the possible RatingRule type:<br>
 * <ul>
 * <li>A - Applicable
 * <li>E - European rating structure
 * <li>N - Normal
 * <li>O - Over 100
 * <li>P - Pertinent
 * <li>U - Under 100
 * <li>M - Minimum
 * <li>X - Except Minimum
 * </ul>
 */

public enum RatingRuleType {

    /**
     * Constant used for Applicable.
     */

    A("Applicable"),

    /**
     * Constant used for European rating structure.
     */

    E("European rating structure"),

    /**
     * Constant used for Minimum.
     */

    M("Minimum"),

    /**
     * Constant used for Normal.
     */

    N("Normal"),

    /**
     * Constant used for Over 100.
     */

    O("Over 100"),

    /**
     * Constant used for Pertinent.
     */

    P("Pertinent"),

    /**
     * Constant used for Under 100.
     */

    U("Under 100"),

    /**
     * Constant used for Except Minimum.
     */

    X("Except Minimum");

    /**
     * Attribute to hold the <code>classRatingRuleType</code> property.
     */

    private String ratingRuleType;

    /**
     * Parameterize constructor.
     * 
     * @param pRatingRuleType
     *            the value.
     */

    RatingRuleType(final String pRatingRuleType) {
        this.setRatingRuleType(pRatingRuleType);
    }

    /**
     * Gets the RatingRuleType.
     * <p>
     * 
     * @return the current value of <code>ratingRuleType</code> property.<br>
     */

    public String getRatingRuleType() {
        return this.ratingRuleType;
    }

    /**
     * Sets the RatingRuleType.
     * <p>
     * 
     * @param pRatingRuleType
     *            the current value of <code>ratingRuleType</code> property.<br>
     */

    public void setRatingRuleType(final String pRatingRuleType) {
        this.ratingRuleType = pRatingRuleType;
    }

}
