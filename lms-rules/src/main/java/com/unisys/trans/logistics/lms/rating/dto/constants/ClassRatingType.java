package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>ClassRatingType</code> holds the constants to indicate ClassRating type
 * applied.
 * <p>
 * Following are the possible ClassRating type:<br>
 * <ul>
 * <li>CLASS_RATING - Class Rating
 * <li>CLASS_MINIMUM_RATING - Class Minimum Rating
 * <li>JOIN_CLASS_RATING - Join Class Rating
 * </ul>
 */

public enum ClassRatingType {

    /**
     * Constant used for Class Rating.
     */

    CLASS_RATING("Class Rating", "R",
                new RatingRuleType[]{RatingRuleType.A,
                    RatingRuleType.E, RatingRuleType.N,
                    RatingRuleType.O, RatingRuleType.P,
                    RatingRuleType.U, RatingRuleType.X}),

    /**
     * Constant used for Join Class Rating.
     */

    JOIN_CLASS_RATING("Joint Class Rating", "J",
                new RatingRuleType[]{RatingRuleType.A,
                    RatingRuleType.X}),

    /**
     * Constant used for Class Minimum Rating.
     */

    CLASS_MINIMUM_RATING("Class Minimum Rating", "M",
                new RatingRuleType[]{RatingRuleType.A,
                    RatingRuleType.M});

    /**
     * Attribute to hold the <code>classRatingType</code> property.
     */

    private String classRatingType;

    /**
     * Attribute to hold the <code>classRatingTypeCode</code> property.
     */

    private String classRatingTypeCode;

    /**
     * Attribute to hold the <code>classRatingRuleTypes</code> property.
     */

    private RatingRuleType[] ratingRuleTypes;

    /**
     * Parameterize constructor.
     * 
     * @param pClassRatingType
     *            the value.
     * 
     * @param pClassRatingTypeCode
     *            the value.
     * @param pRatingRuleTypes
     *            the value.
     */

    ClassRatingType(final String pClassRatingType, final String pClassRatingTypeCode,
                final RatingRuleType[] pRatingRuleTypes) {
        this.classRatingTypeCode = pClassRatingTypeCode;
        this.classRatingType = pClassRatingType;
        this.ratingRuleTypes = pRatingRuleTypes;
    }

    /**
     * This method <code>getClassRatingType</code> returns the ClassRatingType.
     * 
     * @param pClassRatingTypeCode <code>String</code><br>
     *            The value of due code.<br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.ClassRatingType
     *         pClassRatingType}</code><br>
     *         Returns the type of Contract <br>
     *         </p>
     */
    public static ClassRatingType getClassRatingType(final String pClassRatingTypeCode) {

        ClassRatingType anClassRatingType = null;

        for (final ClassRatingType aType : ClassRatingType.values()) {
            if (pClassRatingTypeCode.equals(aType.getClassRatingTypeCode())) {
                anClassRatingType = aType;
                break;
            }
        }
        return anClassRatingType;
    }

    /**
     * Gets the classRatingType.
     * <p>
     * 
     * @return the current value of <code>classRatingType</code> property.<br>
     */

    public String getClassRatingType() {
        return this.classRatingType;
    }

    /**
     * Gets the classRatingRuleTypes.
     * <p>
     * 
     * @return the current value of <code>classRatingRuleTypes</code> property.<br>
     */

    public String getClassRatingTypeCode() {
        return this.classRatingTypeCode;
    }

    /**
     * Gets the classRatingRuleTypes.
     * <p>
     * 
     * @return the current value of <code>classRatingRuleTypes</code> property.<br>
     */

    public RatingRuleType[] getRatingRuleTypes() {
        return this.ratingRuleTypes;
    }

    /**
     * Sets the classRatingRuleTypes.
     * <p>
     * 
     * @param pRatingRuleTypes
     *            the current value of <code>classRatingRuleTypes</code> property.<br>
     */

    public void setClassRatingRuleTypes(final RatingRuleType[] pRatingRuleTypes) {
        this.ratingRuleTypes = pRatingRuleTypes;
    }

    /**
     * Sets the classRatingType.
     * <p>
     * 
     * @param pClassRatingType
     *            the current value of <code>classRatingType</code> property.<br>
     */

    public void setClassRatingType(final String pClassRatingType) {
        this.classRatingType = pClassRatingType;
    }

}
