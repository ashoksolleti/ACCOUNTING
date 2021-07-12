package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum BillingScheduleIndicatorType {

    /**
     * Constant used for Inward.
     */
    INWARD("Inward"),
    /**
     * Constant used for Outward.
     */
    OUTWARD("Outward"),
    /**
     * Constant used for Either.
     */
    EITHER("Either");
    
    /**
     * Attribute to hold the <code>stringValue</code> property.
     */
    private String stringValue;
    
    /**
     * Parameterize constructor.
     * 
     * @param pValueFWB
     *            the value.
     */
    BillingScheduleIndicatorType(final String pStringValue) {
        this.stringValue = pStringValue;
    }
    
    /**
     * @return the valueFWB
     */
    public String getStringValue() {
        return stringValue;
    }
    
    /**
     * Gives the string format of enumerated <code>BillingScheduleIndicatorType</code>.
     * <p>
     * 
     * @return the current string value of the <code>BillingScheduleIndicatorType</code>.
     */
    public String value() {
        return this.name();
    }

}
