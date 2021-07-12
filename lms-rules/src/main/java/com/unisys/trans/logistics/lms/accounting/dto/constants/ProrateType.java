package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum ProrateType {
    PV("Proviso", "PV"),
    RQ("Requirement", "RQ"),
    SPA("Special Prorate Agreement", "SPA"),
    SRP("Straight Rate Proration", "SRP");
    
    private String stringValue;

    /**
     * Attribute to hold the <code>label</code> property.
     */
    private String label;


    ProrateType(final String pProrateType) {
        this.setStringValue(pProrateType);
    }

    /**
     * Parameterize constructor.
     * 
     * @param pProrateType
     *            the value.
     * @param pLabel
     *            the value.
     */
    ProrateType(final String pProrateType, final String pLabel) {
        this.setStringValue(pProrateType);
        this.setLabel(pLabel);
    }

    /**
     * Gets the label.
     * <p>
     * 
     * @return the current value of <code>label</code> property.<br>
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Sets the label.
     * <p>
     * 
     * @param pLabel
     *            the current value of <code>label</code> property.<br>
     */
    public void setLabel(final String pLabel) {
        this.label = pLabel;
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
