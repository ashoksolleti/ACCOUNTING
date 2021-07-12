package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>RemarksType</code> holds the constants to indicate RemarksType applied.
 * <p>
 * Following are the possible contract status type:<br>
 * <ul>
 * <li>Accounting Remarks- A
 * <li>Booking Remarks -B
 * <li>Consignee Remarks - C
 * </ul>
 */
public enum RemarksType {
    /**
     * Constant used for Accounting Remarks.
     */
    A("Accounting Remarks"),
    /**
     * Constant used for Booking Remarks.
     */
    B("Booking Remarks"),
    /**
     * Constant used for Consignee Remarks.
     */
    C("Consignee Remarks1"),
    /**
     * Constant used for Discrepancy Remarks.
     */
    D("Discrepancy Remarks"),
    /**
     * Constant used for Freight waybill (FWB) Remarks.
     */
    F("Freight waybill (FWB) Remarks"),
    /**
     * Constant used for General Remarks.
     */
    G("General Remarks"),
    /**
     * Constant used for Handling Remarks.
     */
    H("Handling Remarks"),
    /**
     * Constant used for TrackAndTrace.
     */
    K("TrackAndTrace"),
    /**
     * Constant used for Central Rating Unit (CRU) Remarks.
     */
    M("Central Rating Unit (CRU) Remarks"),
    /**
     * Constant used for Never Found.
     */
    N("Never Found"),
    /**
     * Constant used for Dangerous goods Remarks
     */
    P("Dangerous Goods Remarks"),//AC 415 changes
    /**
     * Constant used for Code Red.
     */
    R("Code Red"),
    /**
     * Constant used for Shipper Remarks.
     */
    S("Shipper Remarks"),
    /**
     * Constant used for Tracing Remarks.
     */
    T("Tracing Remarks"),
    /**
     * Constant used for ULD Booking Remarks.
     */
    U("ULD Booking Remarks"),
    /**
     * Constant used for Found.
     */
    V("Found"),
    /**
     * Constant used for Consignee Remarks.
     */
    Z("Consignee Remarks2");
    /**
     * Attribute to hold the <code>index</code> property.
     */
    private int index;

    /**
     * Attribute to hold the <code>value</code> property.
     */
    private String value;

    /**
     * Parameterized constructor. Accepts the string representation of the enum
     * as the parameter.
     * 
     * @param pValue
     *            String representaion of the enum
     */
    RemarksType(final String pValue) {
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
     * Sets the Index.
     * <p>
     * 
     * @param pIndex
     *            the current value of <code>Index</code> property.<br>
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
     * The <code>value</code> method gives the string format of RemarksType.
     * <p>
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the RemarksType.<br>
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
    RemarksType parse(final String pValue) {
        RemarksType itemFound = null;
        for (final RemarksType item : RemarksType.values()) {
            if (pValue.equalsIgnoreCase(item.value)) {
                itemFound = item;
                break;
            }
        }
        return itemFound;
    }

}
