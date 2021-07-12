package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>FSUStatusType</code> holds the constants to indicate FSU Status Type applied.
 * <p>
 * Following are the possible FSUStatusType:<br>
 * <ul>
 * <li>DIM
 * <li>COR
 * <li>OCI
 * <li>ULD
 * <li>OSI
 * <li>SCI
 * <li>ONW
 * </ul>
 */
public enum FFMStatusType {
    /**
     * Constant used for COR.
     */
    COR("COR"),
    /**
     * Constant used for DIM.
     */
    DIM("DIM"),
    /**
     * Constant used for OCI.
     */
    OCI("OCI"),
    /**
     * Constant used for ONW.
     */
    ONW("ONW"),
    /**
     * Constant used for OSI.
     */
    OSI("OSI"),
    /**
     * Constant used for SCI.
     */
    SCI("SCI"),
    /**
     * Constant used for ULD.
     */
    ULD("ULD");

    /**
     * Attribute to hold the <code>value</code> property.
     */
    private String value;

    /**
     * Constructor with <code>MessageLineType</code> as an argument.
     * <p>
     * 
     * @param pValue
     *            the new value of the <code>value</code>.<br>
     */
    private FFMStatusType(final String pValue) {
        this.value = pValue;
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
     * Sets the value.
     * <p>
     * 
     * @param pValue
     *            the current value of <code>value</code> property.<br>
     */
    public void setValue(final String pValue) {
        this.value = pValue;
    }
}
