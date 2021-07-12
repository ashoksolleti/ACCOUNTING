package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>RatingLineType</code> holds the constants to indicate RatingLineType applied.
 * <p>
 * Following are the possible RatingLineType:<br>
 * <ul>
 * <li>ACTUAL_RATE -Actual
 * <li>PUBLISHED_RATE - Published Rate
 * </ul>
 */
public enum RatingLineType {

    /**
     * ACTUAL_RATE represents Actual.
     */
    ACTUAL_RATE("A"),

    /**
     * PUBLISHED_RATE represents Published Rate.
     */
    PUBLISHED_RATE("P");

    /**
     * Attribute to hold the <code>ratingLineType</code> property.
     */
    private String ratingLineType;

    /**
     * <code>Parameterized Constructor.</code>
     * 
     * @param pRatingLineType <code>String</code><br>
     *            Contains the value.<br>
     */
    RatingLineType(final String pRatingLineType) {
        this.setRatingLineType(pRatingLineType);
    }

    /**
     * Gets the value of the ratingLineType.
     * <p>
     * 
     * @return <code>ratingLineType</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public String getRatingLineType() {
        return this.ratingLineType;
    }

    /**
     * Sets the ratingLineType value.
     * <p>
     * 
     * @param pRatingLineType
     *            the current value of <code>ratingLineType</code> property.<br>
     */
    public void setRatingLineType(final String pRatingLineType) {
        this.ratingLineType = pRatingLineType;
    }

    /**
     * The <code>fromValue</code> method returns the <code>RatingLineType</code> value.
     * <p>
     * 
     * @param pRatingLineType the new value of <code>RatingLineType</code>.
     *            <p>
     * @return the current enumerated value of the <code>RatingLineType</code>.
     */
	public static RatingLineType fromValue(final String pRatingLineType) {

		RatingLineType ratingLineType = null;
		for (final RatingLineType bRatingLineType : RatingLineType.values()) {
			if (bRatingLineType.getRatingLineType().equalsIgnoreCase(pRatingLineType)) {
				ratingLineType = bRatingLineType;
				break;
			}
		}
		return ratingLineType;
	}
}
