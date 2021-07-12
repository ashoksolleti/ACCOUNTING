package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>IgnoreTaskReasonType</code> holds the constants to indicate IgnoreTaskReasonType applied.
 * <p>
 * Following are the possible contract status type:<br>
 * <ul>
 * <li>DELETED - Deleted
 * <li>MISSING - Missing
 * </ul>
 */
public enum IgnoreTaskReasonType {

    /**
     * Constant used for DELETED.
     */
    DELETED("Deleted"),
    
    /**
     * Constant used for MISSING.
     */
    MISSING("Missing");
    
    /**
     * Attribute to hold the <code>PayCodeType</code> property.
     */
    private String type;

    /**
     * Constructor with <code>PayCodeType</code> as an argument.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code>.<br>
     */

    private IgnoreTaskReasonType(final String pType) {
        this.type = pType;
    }

    /**
     * Gets the <code>PayCodeType</code> based on the given string.
     * 
     * @param pValue
     *            the string representation of <code>PayCodeType</code>
     * @return
     *         A enum of type <code>PayCodeType</code>
     */

    public static IgnoreTaskReasonType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * This method <code>getPayCodeType</code> returns the ContractStatusType.
     * 
     * @param pIgnoreTaskReasonType <code>String</code><br>
     *            The value of due code.<br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.IgnoreTaskReasonType
     *         pIgnoreTaskReasonType}</code><br>
     *         Returns the type of Contract <br>
     *         </p>
     */
    public static IgnoreTaskReasonType getIgnoreTaskReasonType(final String pIgnoreTaskReasonType) {

        IgnoreTaskReasonType anIgnoreTaskReasonType = null;

        for (final IgnoreTaskReasonType aType : IgnoreTaskReasonType.values()) {
            if (pIgnoreTaskReasonType.equals(aType.value())) {
                anIgnoreTaskReasonType = aType;
                break;
            }
        }
        return anIgnoreTaskReasonType;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * Holds the PayCodeType code applicable for a contract .
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
     * Holds the PayCodeType code applicable for a contract .
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code> property.<br>
     */
    public void setType(final String pType) {
        this.type = pType;
    }

    /**
     * The <code>value</code> method gives the string format of PayCodeType.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the PayCodeType.<br>
     */
    public String value() {
        return this.type;
    }
}
