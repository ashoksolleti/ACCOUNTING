package com.unisys.trans.logistics.lms.framework.constants;

public enum RequestRulesType {
	
    R("Retrieve"),
    O("Other Process");

    /**
     * Attribute to hold <code>bookingCreationSourceType</code> .
     */
    private String requestRulesType;

    /**
     * Constructor with <code>BookingCreationSourceType</code> as an argument.
     * <p>
     * 
     * @param pBookingCreationSourceType
     *            the new value of the <code>bookingCreationSourceType</code> .
     */
    private RequestRulesType(final String pRequestRulesType) {
        this.requestRulesType = pRequestRulesType;
    }

    /**
     * Gets the <code>BookingCreationSource</code>.
     * <p>
     * 
     * @param pExportPaymentType
     *            the pBookingCreationSourceType value of <code>ExportPaymentType</code>.
     *            <p>
     * @return the current value of <code>ExportPaymentType</code>.
     */
    public static String getRequestRulesType(final String pRequestRulesType) {

        String aRequestRulesType = null;

        for (final RequestRulesType aType : RequestRulesType.values()) {

            if (pRequestRulesType.equals(aType.name())) {
                aRequestRulesType = aType.value();
                break;
            }
        }

        return aRequestRulesType;

    }

    public String getRequestRulesType() {
        return requestRulesType;
    }
    
    /**
     * Gives the string format of <code>BookingCreationSourceType</code>.
     * <p>
     * 
     * @return the enumerated value of the <code>BookingCreationSourceType</code>.<br>
     */
    public String value() {
        return this.requestRulesType;
    }

}
