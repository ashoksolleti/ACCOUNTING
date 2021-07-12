package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum RejectionMemoStageType {

    ONE("1"),

    TWO("2"),

    THREE("3");

    /**
     * Attribute to hold the <code>stringValue</code> property.
     */
    private String stringValue;

    /**
     * Attribute to hold the <code>label</code> property.
     */
    private String label;

    RejectionMemoStageType(final String pRejectionMemoStageType) {
        this.setStringValue(pRejectionMemoStageType);
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
    
    /**
     * Gets the <code>AccountRegionType</code>.
     * <p>
     * 
     * @param pAccountRegionType
     *            holds the new value of <code>AccountRegionType</code>
     *            <p>
     * @return the value of <code>AccountRegionType</code>
     */
    public static RejectionMemoStageType getRejectionMemoStageType(
                final String pRejectionMemoStageType) {

        RejectionMemoStageType aRejectionMemoStageType = null;

        for (final RejectionMemoStageType aType : RejectionMemoStageType.values()) {

            if (pRejectionMemoStageType.equals(aType.getStringValue())) {
                aRejectionMemoStageType = aType;
                break;
            }
        }

        return aRejectionMemoStageType;

    }
}
