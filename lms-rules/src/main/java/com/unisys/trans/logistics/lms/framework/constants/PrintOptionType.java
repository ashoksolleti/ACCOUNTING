package com.unisys.trans.logistics.lms.framework.constants;

/**
 * Print options.
 * <ul>
 * <li>PRINT_ORIGIN = Print Origin</li>
 * <li>PRINT_ORIGIN_ACTUAL = Print Origin Actual</li>
 * <li>PRINT_DEST= Print Dest</li>
 * <li>PRINT_DEST_ACTUAL = Print Dest Actual</li>
 * <li>REPRINT_ORIGIN = Reprint Origin</li>
 * <li>REPRINT_ORIGIN_ACTUAL = Reprint Origin Actual</li>
 * <li>REPRINT_DEST = Reprint Dest</li>
 * <li>REPRINT_DEST_ACTUAL = Reprint Dest Actual</li>
 * </ul>
 * 
 */
public enum PrintOptionType {

    /**
     * Used to represent print destination.
     */
    PRINT_DEST("Print Dest"),

    /**
     * Used to represent print destination actual.
     */
    PRINT_DEST_ACTUAL("Print Dest Actual"),

    /**
     * Used to represent print origin.
     */
    PRINT_ORIGIN("Print Origin"),

    /**
     * Used to represent print origin actual.
     */
    PRINT_ORIGIN_ACTUAL("Print Origin Actual"),

    /**
     * Used to represent reprint destination.
     */
    REPRINT_DEST("Reprint Dest"),

    /**
     * Used to represent reprint destination actual.
     */
    REPRINT_DEST_ACTUAL("Reprint Dest Actual"),

    /**
     * Used to represent reprint origin.
     */
    REPRINT_ORIGIN("Reprint Origin"),

    /**
     * Used to represent print origin actual.
     */
    REPRINT_ORIGIN_ACTUAL("Reprint Origin Actual");

    /**
     * Represents the valueOf the PrintOptionType.
     * 
     * @param pValue
     *            the new value of <code>PrintOptionType</code>.
     *            <p>
     * @return the new enumerated value of the <code>PrintOptionType</code> property.
     */
    public static PrintOptionType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Attribute to hold the <code>value</code> property.
     */
    private String value;

    /**
     * Constructor with <code>PrintOptionType</code> as an argument.
     * <p>
     * 
     * @param pValue
     *            the new value of <code>PrintOptionType</code>.
     */

    private PrintOptionType(final String pValue) {
        this.value = pValue;
    }

    /**
     * Gives the string format of enumerated <code>PrintOptionType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>PrintOptionType</code>.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Gives the string format of enumerated <code>PricingDateIndType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>PricingDateIndType</code>.
     */

    public String value() {
        return this.name();
    }

}
