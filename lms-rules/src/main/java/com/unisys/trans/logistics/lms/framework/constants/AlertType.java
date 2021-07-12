package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>PayCodeType</code> holds the constants to indicate AlertType applied.
 * <p>
 * Following are the possible contract status type:<br>
 * <ul>
 * <li>TrackAndTrace - K
 * <li>Never Found - N
 * <li>Code Red - R
 * <li>Found - V
 * <li>No Alert- NA
 * </ul>
 */
public enum AlertType {
    /**
     * Constant used for TrackAndTrace.
     */
    K("TrackAndTrace"),
    /**
     * Constant used for Never Found.
     */
    N("Never Found"),
    /**
     * Constant used for No Alert.
     */
    NA("No Alert"),
    /**
     * Constant used forCode Red.
     */
    R("Code Red"),
    /**
     * Constant used for Found.
     */
    V("Found");
    /**
     * Attribute to hold the <code>index</code> property.
     */
    private int index;

    /**
     * Attribute to hold the <code>Value</code> property.
     */
    private String value;

    /**
     * Parameterized constructor. Accepts the string representation of the enum
     * as the parameter
     * 
     * @param pValue
     *            String representaion of the enum
     */
    AlertType(final String pValue) {
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
     * Gets the value.
     * <p>
     * 
     * @return the current value of <code>value</code> property.<br>
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Sets the index.
     * <p>
     * 
     * @param pIndex
     *            the current value of <code>index</code> property.<br>
     */
    public void setIndex(final int pIndex) {
        this.index = pIndex;
    }

    /**
     * Sets the value.
     * <p>
     * 
     * @param pValue
     *            the current value of <code>value</code> property.<br>
     */
    public void setValue(final String pValue) {
        this.value = pValue;
    }

    /**
     * The <code>value</code> method gives the string format of AlertType.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the AlertType.<br>
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
    AlertType parse(final String pValue) {
        AlertType itemFound = null;
        for (final AlertType item : AlertType.values()) {
            if (pValue.equalsIgnoreCase(item.value)) {
                itemFound = item;
                break;
            }
        }
        return itemFound;
    }
}
