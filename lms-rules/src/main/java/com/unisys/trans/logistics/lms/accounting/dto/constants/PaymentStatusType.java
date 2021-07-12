package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum PaymentStatusType {
	/**
	 * Ready for payment.
	 */
    READY_FOR_PAYMENTS("Ready for Payments"),
    
    MATCH_PROCESS_COMPLETED("Match Process Completed"),
    /**
     * Payment completed.
     */
    PAYMENT_COMPLETED("Payment Completed"),
    /**
     * Payment Generated.
     */
    PAYMENT_GENERATED("Payment Generated"),
    /**
     * GL Payable Entries Posted.
     */
    GL_PAYABLE_ENTRIES_POSTED("GL Payable Entries Posted"),
    
    APPLIED("Applied"),
    NOT_APPLIED("Not Applied"),
    PARTIALLY_APPLIED("Partially Applied"),
    FULLY_PAID("Fully Paid"),
    PARTIALLY_PAID("Partially Paid"),
    OVER_PAID("Over Paid"),
    NOT_PAID("Not Paid"),
    NOT_SETTLED("Not Settled"),
    NOT_BILLED("Not Billed"),
    READY_FOR_APPROVAL("Ready for Approval");
    
    //MATCH_PROCESS_COMPLETED("Match Process Completed");

    /**
     * Attribute to hold the <code>val</code> property.
     */
    private String val;

    /**
     * Parameterize constructor.
     * 
     * @param pValue
     *            the value.
     */
    PaymentStatusType(final String pValue) {
        this.val = pValue;
    }

    /**
     * Gets the <code>PaymentStatusType</code>.
     * <p>
     * 
     * @param pPaymentStatusType
     *            holds the new value of <code>PaymentStatusType</code>
     *            <p>
     * @return the value of <code>PaymentStatusType</code>
     */
    public static PaymentStatusType getPaymentStatusType(
                final String pPaymentStatusType) {

        PaymentStatusType aPaymentStatusType = null;

        for (final PaymentStatusType aType : PaymentStatusType.values()) {

            if (pPaymentStatusType.equals(aType.getVal())) {
                aPaymentStatusType = aType;
                break;
            }
        }

        return aPaymentStatusType;

    }

    /**
     * Gets the <code>val</code> property.
     * <p>
     * 
     * @return the current value of the <code>val</code> property.
     */
    public String getVal() {
        return this.val;
    }

    /**
     * Sets the <code>val</code> property.
     * <p>
     * 
     * @param pVal the new value of the <code>val</code> property.
     */
    public void setVal(final String pVal) {
        this.val = pVal;
    }

    /**
     * Gives the string format of enumerated <code>PaymentStatusType</code>.
     * <p>
     * 
     * @return the current value of the <code>PaymentStatusType</code>
     */
    public String value() {
        return this.name();
    }

}
