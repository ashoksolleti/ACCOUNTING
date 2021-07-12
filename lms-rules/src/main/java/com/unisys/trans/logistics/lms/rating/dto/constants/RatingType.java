/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>RatingType</code> holds the constants to indicate the rate type applied.
 * <p>
 * Following are the possible rating type :<br>
 * <ul>
 * <li>BULK_OVER_PIVOT - B
 * <li>PERCENTAGE - P
 * <li>RATE_PER_PIECE - R
 * <li>STANDARD - S
 * </ul>
 */
public enum RatingType {

    /**
     * B represents Bulk Over Pivot. Bulk Over Pivot rates are considered for general commodity and/or
     * specific commodity goods (rate class Q or C) where the rate is a flat rate with an optional per unit
     * over pivot portion. Without an over pivot portion, the rate is valid for shipments that weigh at most
     * the rate’s chargeable weight.
     */
    BULK_OVER_PIVOT("B"),
    /**
     * P represents Percentage.
     */
    PERCENTAGE("P"),
    /**
     * R represents Rate Per Piece. Rate Per Piece rates are considered for flat rates with no over pivot
     * portion. The charge is considered for a single piece. Shipments of more than one piece are charged at
     * the single rate multiplied by the number of piece.
     */
    RATE_PER_PIECE("R"),
    /**
     * S represents Standard. Standard type must consider per unit rate except for rates with a rate class of
     * U or rates with a minimum weight of zero.
     */
    STANDARD("S");

    /**
     * Attribute to hold the <code>RatingType</code> property.
     */
    private String ratingType;

    /**
     * Constructor with <code>RatingType</code> as an argument.
     * <p>
     * 
     * @param pRatingType the new value of the <code>ratingType</code>.<br>
     */
    RatingType(final String pRatingType) {
        this.ratingType = pRatingType;
    }

    /**
     * The <code>fromValue</code> method returns the <code>RatingType</code> value.
     * <p>
     * 
     * @param pRatingType the new value of <code>RatingType</code>.
     *            <p>
     * @return the current enumerated value of the <code>RatingType</code>.
     */
    public static RatingType fromValue(final String pRatingType) {

        RatingType aRatingType = null;
        for (final RatingType baRatingType : RatingType.values()) {
            if (baRatingType.getRatingType().equalsIgnoreCase(pRatingType)) {
                aRatingType = baRatingType;
                break;
            }
        }
        return aRatingType;
    }

    /**
     * Gets the <code>RatingType</code> property.
     * <p>
     * Holds the rate type code applicable for an other charge rate.
     * <p>
     * 
     * @return the current value of the <code>otherChargeRateType</code> property.<br>
     */
    public String getRatingType() {
        return this.ratingType;
    }

    /**
     * The <code>value</code> method returns the string value of <code>RatingType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>RatingType</code>.<br>
     */
    public String value() {
        return this.getRatingType();
    }

}