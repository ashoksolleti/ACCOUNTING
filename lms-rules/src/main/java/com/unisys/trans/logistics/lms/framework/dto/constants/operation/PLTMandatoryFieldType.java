package com.unisys.trans.logistics.lms.framework.dto.constants.operation;


public enum PLTMandatoryFieldType {
    /**
     * This is an enumerated action type constant to specify weight.
     */
    WEIGHT("WEIGHT"),

    /**
     * This is an enumerated action type constant to specify volume.
     */
    VOLUME("VOLUME"),

    /**
     * This is an enumerated action type constant to specify height.
     */
    HEIGHT("HEIGHT"),
    
    /**
     * This is an enumerated action type constant to specify length.
     */
    LENGHT("LENGHT"),
    
    /**
     * This is an enumerated action type constant to specify width.
     */
    WIDTH("WIDTH");
    
    /**
     * Attribute to hold <code>exceptionType</code> property.
     */
    private String pltMandatoryFieldType;

    /**
     * <code>Parameterized Constructor.</code>
     * <p>
     * 
     * @param pExceptionType holds the new value of <code>exceptionType</code> property.
     */
    private PLTMandatoryFieldType(final String pPLTMandatoryFieldType) {
        this.pltMandatoryFieldType = pPLTMandatoryFieldType;
    }

    /**
     * Gets the <code>PLTMandatoryFieldType</code>.
     * <p>
     * 
     * @param pValue holds the new value of <code>PLTMandatoryFieldType</code>
     *            <p>
     * @return the current value of <code>ExceptionType</code>
     */
    public static PLTMandatoryFieldType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the <code>PLTMandatoryFieldType</code> property.
     * <p>
     * 
     * @return the current value of the <code>PLTMandatoryFieldType</code> property.
     */
    public String getPLTMandatoryFieldType() {
        return this.pltMandatoryFieldType;
    }

    /**
     * Gives the string format of enumerated <code>PLTMandatoryFieldType</code>.
     * <p>
     * 
     * @return the current value of the <code>PLTMandatoryFieldType</code>
     */
    public String value() {
        return this.name();
    }

}
