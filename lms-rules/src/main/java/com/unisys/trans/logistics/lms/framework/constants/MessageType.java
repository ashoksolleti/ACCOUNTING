package com.unisys.trans.logistics.lms.framework.constants;

public enum MessageType {
	
	 /**
     * This is an enumerated action type constant to specify acknowledgment.
     */
    ACK("A"),

    /**
     * This is an enumerated action type constant to specify error.
     */
    ERR("E"),

    /**
     * This is an enumerated action type constant to specify warning.
     */
    WRN("W"),
    
    /**
     * This is an enumerated action type constant to specify queueing.
     */
    QUE("Q"),
   
    /**
     * This is an enumerated action type constant to specify failure.
     */
    FAI("F"),
    /**
     * This is an enumerated action type constant to specify failure.
     */
    HLD("H"),
    
    /**
     * Attribute to hold <code>type</code> property.
     */
    CHECKLIST("C");
    private String type;
    /**
     * <code>Parameterized Constructor.</code>
     * <p>
     * 
     * @param ptype holds the new value of <code>ptype</code> property.
     */
    private MessageType(final String ptype) {
        this.type = ptype;
    }

    /**
     * Gets the <code>MessageType</code>.
     * <p>
     * 
     * @param pValue holds the new value of <code>MessageType</code>
     *            <p>
     * @return the current value of <code>MessageType</code>
     */
    public static MessageType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gives the string format of enumerated <code>MessageType</code>.
     * <p>
     * 
     * @return the current value of the <code>MessageType</code>
     */
    public String value() {
        return this.name();
    }
	

}
