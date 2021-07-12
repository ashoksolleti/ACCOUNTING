/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * Gets the <code>RatingNoteFormat</code> property.
 * <p>
 * Identifies the RatingNoteFormat.The ratingNote can be of type <br>
 * <code>
 * <ul>
 * <li>I
 * <li>D
 * </ul>
 * </code>
 * <p>
 * <p>
 * <b>Example: </b><br>
 * I or D
 * 
 * @return the current value of the <code>aRatingNoteFormat;</code> property.
 */
public enum RateSourceType {

    /**
     * ATPCO RatingNote.
     */
    ATPCO("D"),

    /**
     * IATA RatingNote.
     */
    IATA("I");

    /**
     * RatingNote type.
     */
    private String type;

    /**
     * Constructor.
     * 
     * @param pType
     *            - RatingNoteFormatType
     */
    RateSourceType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the <code>RatingNoteFormatType</code>.
     * <p>
     * 
     * @param pRatingNoteFormatType
     *            <code>String</code><br>
     *            Contains the Enum type string.<br>
     *            </p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.constants.RateSourceType
     *  RatingNoteFormatType}</code><br>
     *         Returns the <code>RatingNoteFormatType</code>
     */
    public static RateSourceType getRatingNoteFormatType(final String pRatingNoteFormatType) {

        RateSourceType anRatingNoteFormatType = null;

        for (final RateSourceType aType : RateSourceType.values()) {
            if (pRatingNoteFormatType.equals(aType.getType())) {
                anRatingNoteFormatType = aType;
                break;
            }
        }
        return anRatingNoteFormatType;
    }

    /**
     * Gets the type of RatingNote.
     * 
     * @return the type
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets the type of RatingNote.
     * 
     * @param pType
     *            the new value of the <code>type</code> property.
     */
    public void setType(final String pType) {
        this.type = pType;
    }

}
