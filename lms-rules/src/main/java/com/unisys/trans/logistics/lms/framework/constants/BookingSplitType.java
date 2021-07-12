package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>BookingSplitType</code> holds the constants to indicate BookingSplitType
 * applied.
 * <p>
 * Following are the possible BookingSplitType:<br>
 * <ul>
 * <li>A
 * <li>M
 * <li>N
 * 
 * 
 * </ul>
 * **/

public enum BookingSplitType {

    /**
     * This is an enumerated SplitBookingType constant to specify auto split.
     */
    A("Auto Split"),

    /**
     * This is an enumerated SplitBookingType constant to specify manual split.
     */
    M("Manual Split"),

    /**
     * This is an enumerated SplitBookingType constant to specify no split.
     */
    N("No Split");
    /**
     * Attribute to hold the <code>type</code> property.
     */
    private String type;

    /**
     * Parameterize constructor.
     * 
     * @param pType
     *            the value.
     */
    BookingSplitType(final String pType) {
        this.type = pType;

    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * Holds the BookingSplitType code applicable for a contract.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.<br>
     */
    public String getType() {
        return this.type;
    }

}
