package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum PaymentMethodType {
    /**
     * Check.
     */
	CHECK("Check"),
	 /**
     * Credit card,
     */
	CREDIT_CARD("Credit card"),
	 /**
     * Credit Billing.
     */
	CREDIT_BILLING("Credit Billing"),
	 /**
     * Demand Billing.
     */
	DEMAND_BILLING("Demand Billing");
	
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
    PaymentMethodType(final String pValue) {
        this.val = pValue;
    }

    /**
     * Gets the <code>PaymentMethodType</code>.
     * <p>
     * 
     * @param pPaymentMethodType
     *            holds the new value of <code>PaymentMethodType</code>
     *            <p>
     * @return the value of <code>PaymentMethodType</code>
     */
    public static PaymentMethodType getPaymentMethodType(
                final String pPaymentMethodType) {

    	PaymentMethodType aPaymentMethodType = null;

        for (final PaymentMethodType aType : PaymentMethodType.values()) {

            if (pPaymentMethodType.equals(aType.getVal())) {
                aPaymentMethodType = aType;
                break;
            }
        }

        return aPaymentMethodType;

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
     * Gives the string format of enumerated <code>AccountRegionType</code>.
     * <p>
     * 
     * @return the current value of the <code>AccountRegionType</code>
     */
    public String value() {
        return this.name();
    }

}
