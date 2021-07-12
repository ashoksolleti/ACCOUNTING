package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>PayCodeType</code> holds the constants to indicate AlertEventType
 * applied.
 * <p>
 * Following are the possible contract status type:<br>
 * <ul>
 * <li>Code Red Activated - CA
 * <li>Never Found Activated - NFA
 * <li>Track & Trace Activated - TA
 * <li>Found Activated - FA
 * <li>Code Red Activated - CI
 * <li>Never Found Inactivated - NFI
 * <li>Track & Trace Inactivated - TI
 * <li>Found Inactivated - FI
 * </ul>
 */
public enum AlertEventType {
    /**
     * Constant used for Code Red Activated.
     */
    CA("Code Red Activated"),
    /**
     * Constant used for Code Red Inactivated.
     */
    CI("Code Red Inactivated"),
    /**
     * Constant used for Activated.
     */
    FA("Found Activated"),
    /**
     * Constant used for Found Inactivated.
     */
    FI("Found Inactivated"),
    /**
     * Constant used for Never Found Activated.
     */
    NFA("Never Found Activated"),
    /**
     * Constant used for Never Found Inactivated.
     */
    NFI("Never Found Inactivated"),
    /**
     * Constant used for Track & Trace Activated.
     */
    TA("Track & Trace Activated"),
    /**
     * Constant used for Track & Trace Inactivated.
     */
    TI("Track & Trace Inactivated");

    private int index;

    /**
     * Attribute to hold the <code>value</code> property.
     * <p>
     * value = {@value}
     */
    private String value;

    /**
     * Parameterized constructor. Accepts the string representation of the enum
     * as the parameter
     * 
     * @param pValue
     *            String representaion of the enum
     */
    AlertEventType(final String pValue) {
        this.value = pValue;
    }

    

    /**
     * Gets the index.
     * <p>
     * 
     * @return the current value of <code>index</code> property.<br>
     */
    public int getIndex() {
        return this.index;
    }

    /**
     * Gets the stringValue.
     * <p>
     * 
     * @return the current value of <code>stringValue</code> property.<br>
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Sets the Index.
     * <p>
     * 
     * @param pIndex
     *            the current value of <code>index</code> property.<br>
     */
    public void setIndex(final int pIndex) {
        this.index = pIndex;
    }

    /**
     * Sets the Value.
     * <p>
     * 
     * @param pValue
     *            the current value of <code>Value</code> property.<br>
     */
    public void setValue(final String pValue) {
        this.value = pValue;
    }

    /**
     * The <code>value</code> method gives the string format of AlertEventType.
     * <p>
     * 
     * @return <code>value</code><br>
     *         Returns the enumerated value of the AlertEventType.<br>
     */
    public String value() {
        return this.value;
    }

    /**
     * Parse the given string and find the matching enumeration constant. If no
     * match is found returns a null value.
     * 
     * @param pValue
     *            String value defined for the enum constant to be found.
     * @return Returns RemarksType Enumerated value , or <code>null</code> if no
     *         matching enum is found.
     */
    AlertEventType parse(final String pValue) {
        AlertEventType itemFound = null;
        for (final AlertEventType item : AlertEventType.values()) {
            if (pValue.equalsIgnoreCase(item.value)) {
                itemFound = item;
                break;
            }
        }
        return itemFound;
    }

}
