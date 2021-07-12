package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum InwardInvoiceStatus {

	NOT_READY_FOR_MATCH_PROCESS("Not Ready For Match Process"),
	 
    READY_FOR_MATCH_PROCESS("Ready For Match Process"),

    MATCH_PROCESS_COMPLETED("Match Process Completed"),

    QUEUE("Queue");

    /**
     * Attribute to hold the <code>stringValue</code> property.
     */
    private String stringValue;

    InwardInvoiceStatus(final String pInwardInvoiceStatus) {
        this.setStringValue(pInwardInvoiceStatus);
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
