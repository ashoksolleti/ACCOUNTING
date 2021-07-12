package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>InwardQueueType</code> holds the constants to indicate Queue types.
 * <p>
 * Following are the possible Queue type:<br>
 * <ul>
 * <li>DUPLICATE_QUEUE
 * <li>OVERBILLED_QUEUE
 * <li>REJECTION_QUEUE
 * <li>UNDERBILLED_QUEUE
 * <li>UNMATCHED_QUEUE
 * </ul>
 */
public enum InwardQueueType {
    DUPLICATE_QUEUE("Duplicate Queue"),
    OVERBILLED_QUEUE("Overbilled Queue"),
    REJECTION_QUEUE("Rejection Queue"),
    UNDERBILLED_QUEUE("Underbilled Queue"),
    UNMATCHED_QUEUE("Un-Matched Queue"),
    ERROR_QUEUE("Error Queue"),
    DUPLICATE_AWB_VALIDATION("Duplicate AWBs - Validation Error Queue");

    /**
     * Attribute to hold the <code>stringValue</code> property.
     */
    private String stringValue;

    /**
     * Parameterize constructor.
     * 
     * @param pInwardQueueType
     *            the value.
     */
    InwardQueueType(final String pInwardQueueType) {
        this.setStringValue(pInwardQueueType);
    }

    /**
     * Gets the stringValue.
     * <p>
     * 
     * @return the current value of <code>stringValue</code> property.<br>
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the stringValue.
     * <p>
     * 
     * @param pStringValue
     *            the current value of <code>stringValue</code> property.<br>
     */
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * Gives the string format of enumerated <code>InwardQueueType</code>.
     * <p>
     * 
     * @return the current string value of the <code>InwardQueueType</code>.
     */
    public String value() {
        return this.name();
    }

}
