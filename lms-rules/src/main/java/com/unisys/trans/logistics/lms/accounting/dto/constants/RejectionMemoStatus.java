package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>RejectionMemoStatus</code> holds the constants for maintaining different rejection memo status.
 * <p>
 * Following are the possible rejection status:<br>
 * <ul>
 * <li>READY_FOR_INVOICING
 * </ul>
 */

public enum RejectionMemoStatus {

    
    READY_FOR_INVOICING("Ready For Invoicing"),
    ON_HOLD("On hold"),
    INVOICED_AND_PAYMENT_PENDING("Invoiced and Payment Pending");

    /**
     * Attribute to hold the <code>stringValue</code> property.
     */
    private String stringValue;

    /**
     * Parameterize constructor.
     * 
     * @param pRejectionMemoStatus
     *            the value.
     */
    RejectionMemoStatus(final String pRejectionMemoStatus) {
        this.setStringValue(pRejectionMemoStatus);
    }

    /**
     * Gets the stringValue.
     * <p>
     * 
     * @return the current value of <code>stringValue</code> property.<br>
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the stringValue.
     * <p>
     * 
     * @param pStringValue
     *            the current value of <code>stringValue</code> property.<br>
     */
    public void setStringValue(String pStringValue) {
        this.stringValue = pStringValue;
    }

    /**
     * Gives the string format of enumerated <code>RejectionMemoStatus</code>.
     * <p>
     * 
     * @return the current string value of the <code>RejectionMemoStatus</code>.
     */
    public String value() {
        return this.name();
    }



}
