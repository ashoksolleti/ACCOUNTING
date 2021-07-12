package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>RateIndicatorType</code> holds the constants to indicate RateIndicatorType applied.
 * <p>
 * Following are the possible RateIndicatorType:<br>
 * <ul>
 * <li>FLAT_RATE - F
 * <li>PER_UNIT_OF_WEIGHT_RATE - U
 * <li>FLAT_RATE_PER_PIECE - P
 * </ul>
 */
public enum RateIndicatorType {

    /**
     * Flat Rate.
     */
    FLAT_RATE("F"),

    /**
     * Per Unit of Weight Rate.
     */
    PER_UNIT_OF_WEIGHT_RATE("U"),

    /**
     * Flat Rate Per Piece.
     */
    FLAT_RATE_PER_PIECE("P");

    /**
     *  Attribute to hold the <code>val</code> property.
     */
    private String val;

    /**
     * <code>Parameterized Constructor.</code>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     */
    RateIndicatorType(final String pValue) {
        this.val = pValue;
    }

    /**
     * Gets the enum constant for the given value.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     * @return <code>RateIndicatorType</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public static RateIndicatorType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the value of the enum constant.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public String getValue() {
        return this.val;
    }

    /**
     * Gets the string value of the enum.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public String value() {
        return this.name();
    }
}
