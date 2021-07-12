package com.unisys.trans.logistics.lms.framework.dto;


public enum OtherChargeActionType {

    /**
    * This is an enumerated action type constant to specify apply.
    */
    APPLY,

    /**
    * This is an enumerated action type constant to specify update.
    */
    UPDATE,

    /**
    * This is an enumerated action type constant to specify delete.
    */
    DELETE;
    
    /**
     * This method <code>fromValue</code> returns the enumerated value.
     * <p>
     * It is a type of apply,update,delete operation.
     * <p>
     * 
     * @param pValue the value of enumerated type.
     *            <p>
     * @return the enumerated value of the action type.
     */
    public static OtherChargeActionType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * The <code>value</code> method gives the string format of action type.
     * <p>
     * 
     * @return the enumerated value of the action type.
     */
    public String value() {
        return this.name();
    }
}
