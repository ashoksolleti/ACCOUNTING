package com.unisys.trans.logistics.lms.accounting.dto.constants;


public enum ClearingHouseType {



    //SIS("SIS","Simplified Interline Settlement" ),
   
    ICH("ICH","IATA Clearing House"),

    ACH("ACH","Airline Clearing House"),
    
    DIRECT("DIRECT","Direct Billing" );

    /**
     * Attribute to hold the <code>stringValue</code> property.
     */
    private String stringValue;

    /**
     * Attribute to hold the <code>label</code> property.
     */
    private String label;


    ClearingHouseType(final String pClearingHouseType) {
        this.setStringValue(pClearingHouseType);
    }

    /**
     * Parameterize constructor.
     * 
     * @param pContractDefinitionType
     *            the value.
     * @param pLabel
     *            the value.
     */
    ClearingHouseType(final String pClearingHouseType, final String pLabel) {
        this.setStringValue(pClearingHouseType);
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



