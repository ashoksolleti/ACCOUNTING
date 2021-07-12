package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum MemoType {

	CN("Credit Note", "CREDIT"),
    DN("Debit Note","DEBIT"),
    PB("Prime Billing", "PB"),
    BM("Billing Memo", "BM"),
    CM("Credit Memo", "CM"),
    RM("Rejection Memo","RM"),
    RN("Rejection Notes","RN");

    private String stringValue;

    /**
     * Attribute to hold the <code>label</code> property.
     */
    private String label;

    MemoType(final String pMemoType) {
        this.setStringValue(pMemoType);
    }

    /**
     * Parameterize constructor.
     * 
     * @param pBillingType
     *            the value.
     * @param pLabel
     *            the value.
     */
    MemoType(final String pMemoType, final String pLabel) {
        this.setStringValue(pMemoType);
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
