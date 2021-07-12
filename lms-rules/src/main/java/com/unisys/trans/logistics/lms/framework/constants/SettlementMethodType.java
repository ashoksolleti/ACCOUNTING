package com.unisys.trans.logistics.lms.framework.constants;

public enum SettlementMethodType {

    /**
     * Indicates that the Settlement Method Type is IATA_CLEARING_HOUSE.
     */
    IATA_CLEARING_HOUSE("IATA Clearing House"),
    /**
     * Indicates that the Settlement Method Type is AIRLINE_CLEARING_HOUSE.
     */
    AIRLINE_CLEARING_HOUSE("Airline Clearing House"),
    /**
     * Indicates that the Settlement Method Type is INTERLINE_DATA_EXCHANGE_CENTER.
     */
    INTERLINE_DATA_EXCHANGE_CENTER("Interline Data Exchange Center"),
    /**
     * Indicates that the Settlement Method Type is DIRECT_BILLING.
     */
    DIRECT_BILLING("Direct Billing");

    
    private String stringValue;
   

    SettlementMethodType(String pSettlementMethodType) {
        this.setStringValue(pSettlementMethodType);
    }
    

    public static SettlementMethodType getSettlementMethodType(
                final String pSettlementMethodType) {

        SettlementMethodType aSettlementMethodType = null;

        for (final SettlementMethodType aType : SettlementMethodType.values()) {

            if (pSettlementMethodType.equals(aType.getStringValue())) {
                aSettlementMethodType = aType;
                break;
            }
        }
        return aSettlementMethodType;
    }

    
    /**
     * Gets the <code>stringValue</code> property.
     * <p>
     * 
     * @return the current value of the <code>stringValue</code> property.
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the <code>stringValue</code> property.
     * <p>
     * 
     * @param pStringValue the new value of the <code>stringValue</code> property.
     */
    public void setStringValue(String pStringValue) {
        this.stringValue = pStringValue;
    }
    
    
}
