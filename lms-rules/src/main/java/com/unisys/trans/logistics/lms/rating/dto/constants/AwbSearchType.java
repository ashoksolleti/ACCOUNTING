package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>AwbSearchType</code> holds the constants to indicate AwbSearchType applied.
 * <p>
 * Following are the possible ratingConventionType:<br>
 * <ul>
 * <li>0 - Search AWB number
 * <li>1 - Search Reference number
 * <li>2 - Search Null AWB
 * </ul>
 */
public enum AwbSearchType {
    /**
     * 0 represents search awb number.
     */
    SEARCH_AWB_NUMBER(0),
    /**
     * 1 represents search reference number.
     */
    SEARCH_REFERENCE_NUMBER(1),
    /**
     * 2 represents search awb number.
     */
    SEARCH_NULL_AWB(2);
    /**
     * Attribute to hold the <code>value</code> property.
     */
    private int value;

    /**
     * Parameterize constructor.
     * 
     * @param pType
     *            the current value of the <code>AwbSearchType</code> property.
     */
    AwbSearchType(final int pValue) {
        this.value = pValue;
    }

    /**
     * The <code>value</code> method gives the int value of AwbSearchType type.
     * <p>
     * 
     * @return <code>int</code><br>
     *         Returns the int value of the RatingConventionType type.<br>
     */
    public int value() {
        return this.value;
    }
}
