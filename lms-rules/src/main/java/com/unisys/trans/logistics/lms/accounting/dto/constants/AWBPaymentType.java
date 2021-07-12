package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum AWBPaymentType {

    PREPAID("Prepaid", "P"),
    COLLECT("Collect", "C"),
    EXPORT("Export", "E"),
    IMPORT("Import", "I");

    /**
     * Attribute to hold the <code>stringValue</code> property.
     */
    private String stringValue;

    /**
     * Attribute to hold the <code>label</code> property.
     */
    private String label;

    AWBPaymentType(final String pAWBPaymentType) {
        this.setStringValue(pAWBPaymentType);
    }

    /**
     * Parameterize constructor.
     * 
     * @param pAWBPaymentType
     *            the value.
     * @param pLabel
     *            the value.
     */
    AWBPaymentType(final String pAWBPaymentType, final String pLabel) {
        this.setStringValue(pAWBPaymentType);
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
