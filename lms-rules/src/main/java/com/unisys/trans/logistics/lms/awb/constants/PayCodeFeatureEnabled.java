package com.unisys.trans.logistics.lms.awb.constants;

public enum PayCodeFeatureEnabled {

	YES,
	
    NO;
	
    /**
     * This method <code>fromValue</code> returns the enumerated value.
     * <p>
     * It is a type of create,find,update,delete operation.<br>
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            The value of enumerated type.<br>
     *            </p>
     *            <p>
     * @return the enumerated value of the action type.<br>
     *         </p>
     */
    public static PayCodeFeatureEnabled fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * The <code>value</code> method gives the string format of action type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the action type.<br>
     */
    public String value() {
        return this.name();
    }

}
