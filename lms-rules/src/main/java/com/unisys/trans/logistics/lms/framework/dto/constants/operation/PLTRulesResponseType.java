package com.unisys.trans.logistics.lms.framework.dto.constants.operation;


public enum PLTRulesResponseType {
    /**
     * This is an enumerated action type constant to specify acknowledgment.
     */
    ACK("ACK"),

    /**
     * This is an enumerated action type constant to specify error.
     */
    ERR("Error"),

    /**
     * This is an enumerated action type constant to specify warning.
     */
    WARN("WARN"),
    
    /**
     * This is an enumerated action type constant to specify queue.
     */
    QUEUE("QUEUE"),
    
    /**
     * Attribute to hold <code>exceptionType</code> property.
     */
	FAIL("FAIL");
    private String pltRulesResponseType;

    /**
     * <code>Parameterized Constructor.</code>
     * <p>
     * 
     * @param pExceptionType holds the new value of <code>exceptionType</code> property.
     */
    private PLTRulesResponseType(final String pPltRulesResponseType) {
        this.pltRulesResponseType = pPltRulesResponseType;
    }

    /**
     * Gets the <code>ExceptionType</code>.
     * <p>
     * 
     * @param pValue holds the new value of <code>ExceptionType</code>
     *            <p>
     * @return the current value of <code>ExceptionType</code>
     */
    public static PLTRulesResponseType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the <code>exceptionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>exceptionType</code> property.
     */
    public String getPLTRulesResponseType() {
        return this.pltRulesResponseType;
    }

    /**
     * Gives the string format of enumerated <code>ExceptionType</code>.
     * <p>
     * 
     * @return the current value of the <code>ExceptionType</code>
     */
    public String value() {
        return this.name();
    }

}
