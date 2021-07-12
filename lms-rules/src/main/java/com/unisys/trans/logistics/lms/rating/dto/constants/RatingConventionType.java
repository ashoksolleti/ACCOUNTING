/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>RatingConventionType</code> holds the constants to indicate ratingConventionType applied.
 * <p>
 * Following are the possible ratingConventionType:<br>
 * <ul>
 * <li>D - ATPCO
 * <li>I - IATA
 * </ul>
 */
public enum RatingConventionType {

    /**
     * D represents Airline Tariff Publishing Company (ATPCO).
     */
    D("ATPCO"),

    /**
     * I represents IATA Rate Information Service.
     */
    I("IATA");

    /**
     * Attribute to hold the <code>type</code> property.
     */
    private String type;

    /**
     * Parameterize constructor.
     * 
     * @param pType
     *            the current value of the <code>RatingConventionType</code> property.
     */
    RatingConventionType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the <code>RatingConventionType</code> based on the given string.
     * 
     * @param pValue
     *            the string representation of <code>RatingConventionType</code>
     * @return
     *         A enum of type <code>RatingConventionType</code>
     */
    public static RatingConventionType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the enum Constant value.
     * <p>
     * 
     * @param pType
     *            the current value of the <code>RatingConventionType</code> property.
     * @return the current value of <code>RatingConventionType</code> property.<br>
     */
    public static RatingConventionType getType(final String pType) {
        RatingConventionType aRatingConventionType = null;
        for (final RatingConventionType aType : RatingConventionType.values()) {
            if (pType.equalsIgnoreCase(aType.name())) {
                aRatingConventionType = aType;
                break;
            }
        }
        return aRatingConventionType;
    }

    /**
     * Gets the enum Constant value.
     * <p>
     * 
     * @return the current value of <code>type</code> property.<br>
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets the enum Constant value.
     * <p>
     * 
     * @param pType
     *            the current value of <code>type</code> property.<br>
     */
    public void setType(final String pType) {
        this.type = pType;
    }

    /**
     * The <code>value</code> method gives the string format of RatingConventionType type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the RatingConventionType type.<br>
     */
    public String value() {
        return this.type;
    }

}