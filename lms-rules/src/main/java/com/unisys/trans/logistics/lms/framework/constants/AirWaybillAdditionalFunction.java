package com.unisys.trans.logistics.lms.framework.constants;

public enum AirWaybillAdditionalFunction {

    LOCK("Lock"),
    
    UNLOCK("Unlock"),
    
    DELETE("Delete"),
    
    REACTIVATE("Reactivate"),
    
    DISPLAY_CCA("Display CCA"),
    
    DISPLAY_ACTUAL_CCA("Display Actual CCA"),
    
    ASSIGN("Assign"),
    
    CREATE_DUPLICATE("Create Duplicate"),
    
    EXPORT_QA("Export QA"),
    
    IMPORT_QA("Import QA"),
    
    FORCED_TO_AUDIT("Forced To Audit"),
    
    REVERSE_AUDIT("Reverse Audit"),
    
    EMAIL("Email"),
    
    CLEAR_MANUAL_AUDIT("Clear Manual Audit"),
    
    FWB_REJECT("FWB Reject");

    private String airWaybillAdditionalFunction;

    AirWaybillAdditionalFunction(final String pAirWaybillAdditionalFunction) {

        this.airWaybillAdditionalFunction = pAirWaybillAdditionalFunction;
    }

    /**
     * Gets the <code>ExportPaymentType</code>.
     * <p>
     * 
     * @param pExportPaymentType
     *            the new value of <code>ExportPaymentType</code>.
     *            <p>
     * @return the current value of <code>ExportPaymentType</code>.
     */
    public static AirWaybillAdditionalFunction getAirWaybillAdditionalFunction(
                final String pAirWaybillAdditionalFunction) {

        AirWaybillAdditionalFunction aFunction = null;
        if (pAirWaybillAdditionalFunction != null) {
            for (final AirWaybillAdditionalFunction aType : AirWaybillAdditionalFunction.values()) {

                if (pAirWaybillAdditionalFunction.equals(aType.value())) {
                    aFunction = aType;
                    break;
                }
            }
        }

        return aFunction;

    }

    public String getAirWaybillAdditionalFunction() {
        return this.airWaybillAdditionalFunction;
    }

    public void setAirWaybillAdditionalFunction(final String pAirWaybillAdditionalFunction) {
        this.airWaybillAdditionalFunction = pAirWaybillAdditionalFunction;
    }

    /**
     * Gives the string format of <code>ExportPaymentType</code>.
     * <p>
     * 
     * @return the enumerated value of the <code>ExportPaymentType</code>.<br>
     */
    public String value() {
        return this.airWaybillAdditionalFunction;
    }

}
