package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>MasterAwbStatusType</code> holds the constants to indicate master Awb
 * Status.
 * <p>
 */
public enum InbondStatusType {

    /**
     * This is an enumerated MasterAwbStatusType constant for AWB is
     * consolidated.
     */
    Y("Yes"),

    /**
     * This is an enumerated MasterAwbStatusType constant for Deconsolidated.
     */
    N("No");

   

    /** Attribute that holds the string definition for the enum . **/
    private String definition;

    /**
     * Parameterized constructor. Accepts the definition of the enum as the
     * parameter
     * 
     * @param pDefinition
     *            String representaion of the enum
     */
    InbondStatusType(final String pDefinition) {
        this.definition = pDefinition;
    }

    /**
     * Gets the <code>MasterAwbStatusType</code>.
     * <p>
     * 
     * @param definition
     *            <code>String</code>
     *            <p>
     * @return <code>definition</code><br>
     *         Returns the definition type.
     */
    public static InbondStatusType getMasterAwbStatusType(
                final String definition) {
        for (final InbondStatusType aStatusType : InbondStatusType
                    .values()) {
            if (aStatusType.getDefinition().equals(definition)) {
                return aStatusType;
            }
        }
        return null;
    }

    /**
     * Gets the definition.
     * <p>
     * 
     * @return the current value of <code>definition</code> property.<br>
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * Sets the definition.
     * <p>
     * 
     * @param pDefinition
     *            the current value of <code>definition</code> property.<br>
     */
    public void setDefinition(final String pDefinition) {
        this.definition = pDefinition;
    }

    /**
     * Gets the value for<code>awbType</code>.
     * <p>
     * 
     * @return the current value of <code>awbType</code> property. 
     */
    public String value() {
        return this.definition;
    }
}
