/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>ClassRatingIdType</code> holds the constants to indicate the class rating id type applied.
 * <p>
 * Following are the possible rating type :<br>
 * <ul>
 * <li>REDUCTION - R
 * <li>SURCHARGE - S
 * </ul>
 */
public enum ClassRatingIdType {
    /**
     * Indicates that the rating type is Reduction.
     */
    REDUCTION("R"),
    /**
     * Indicates that the rating type is Surcharge.
     */
    SURCHARGE("S");

    /**
     * Attribute to hold the <code>RatingType</code> property.
     */
    private String type;

    /**
     * Constructor with <code>ClassRatingIdentifierType</code> as an argument.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code>.<br>
     */
    private ClassRatingIdType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the <code>ClassRatingIdType</code> based on the given string.
     * 
     * @param pValue
     *            the string representation of <code>ClassRatingIdType</code>
     * @return
     *         A enum of type <code>ClassRatingIdType</code>
     */
    public static ClassRatingIdType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * This method <code>getClassRatingIdType</code> returns the classratingId type.
     * <p>
     * 
     * @param pClassRatingIdType <code>String</code><br>
     *            The value of due code.<br>
     *            </p>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.ClassRatingIdType
     *         ClassRatingIdType}</code><br>
     *         Returns the type of ClassRatingId which is Reduction as default.<br>
     *         </p>
     */
    public static ClassRatingIdType getClassRatingIdType(final String pClassRatingIdType) {

        ClassRatingIdType anClassRatingIdType = null;

        for (final ClassRatingIdType aType : ClassRatingIdType.values()) {
            if (pClassRatingIdType.equals(aType.value())) {
                anClassRatingIdType = aType;
                break;
            }
        }
        return anClassRatingIdType;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * Holds the classification type code applicable for a class rating id.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.<br>
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * Holds the classification type code applicable for a class rating id.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code> property.<br>
     */
    public void setType(final String pType) {
        this.type = pType;
    }

    /**
     * The <code>value</code> method gives the string format of classratingId type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the classratingId type.<br>
     */
    public String value() {
        return this.type;
    }
}
