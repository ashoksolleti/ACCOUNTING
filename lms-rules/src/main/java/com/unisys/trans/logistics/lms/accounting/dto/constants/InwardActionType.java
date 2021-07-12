package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum InwardActionType {

    ACCEPT("Accept"),

    REJECT("Reject"),

    PARTIAL_ACCEPT_REJECT("Partial Accept/Reject");

    /**
     * Attribute to hold the <code>stringValue</code> property.
     */
    private String stringValue;

    InwardActionType(final String pInwardActionType) {
        this.setStringValue(pInwardActionType);
    }

    /**
     * Gets the stringValue.
     * <p>
     * 
     * @return the current value of <code>stringValue</code> property.<br>
     */
    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * Sets the stringValue.
     * <p>
     * 
     * @param pStringValue
     *            the current value of <code>stringValue</code> property.<br>
     */
    public void setStringValue(final String pStringValue) {
        this.stringValue = pStringValue;
    }

    /**
     * Default constructor.
     * 
     * @return the current value of <code>name</code> property.<br>
     * 
     */
    public String value() {
        return this.name();
    }
}
