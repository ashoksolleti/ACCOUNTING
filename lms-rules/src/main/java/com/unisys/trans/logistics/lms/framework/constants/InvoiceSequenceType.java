/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>InvoiceSequenceType</code> indicates the different Invoice Sequence Type.
 * <p>
 */
public enum InvoiceSequenceType {
    /**
     * Indicates that the Invoice Sequence Type is ASCENDING_ORDER.
     */
    ASCENDING_ORDER("A", "Ascending Order"),
    /**
     * Indicates that the Invoice Sequence Type is DOUBLE_SPACE.
     */
    DOUBLE_SPACE("B", "Double Space");
    /**
     * Attribute to hold <code>label</code>.
     */
    private String label;

    /**
     * Attribute to hold <code>stringValue</code>.
     */
    private String stringValue;

    /**
     * Parameterized Constructor.
     * <p>
     * 
     * @param pInvoiceSequenceType The request object holds the Invoice Sequence Type.
     * @param pLabel The request object holds the type of label.
     */
    InvoiceSequenceType(final String pInvoiceSequenceType, final String pLabel) {
        this.stringValue = pInvoiceSequenceType;
        this.setLabel(pLabel);
    }

    /**
     * Parameterized Constructor.
     * <p>
     * 
     * @param pInvoiceMediaSequence The request object holds the Invoice Media Sequence.
     */
    private InvoiceSequenceType(final String pInvoiceMediaSequence) {
        this.stringValue = pInvoiceMediaSequence;
    }

    /**
     * Gets the <code>InvoiceSequenceType</code>.
     * <p>
     * 
     * @param pInvoiceSequenceType
     *            holds the new value of <code>InvoiceSequenceType</code>
     *            <p>
     * @return the value of <code>InvoiceSequenceType</code>
     */
    public static InvoiceSequenceType getInvoiceSequenceType(
                final String pInvoiceSequenceType) {

        InvoiceSequenceType aInvoiceSequenceType = null;

        for (final InvoiceSequenceType aType : InvoiceSequenceType.values()) {

            if (pInvoiceSequenceType.equalsIgnoreCase(aType.getLabel())) {
                aInvoiceSequenceType = aType;
                break;
            }
        }

        return aInvoiceSequenceType;

    }

    /**
     * Gets the <code>label</code> property.
     * <p>
     * 
     * @return the current value of the <code>label</code> property.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Gets the <code>stringValue</code> property.
     * <p>
     * 
     * @return the current value of the <code>stringValue</code> property.
     */
    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * Sets the <code>label</code> property.
     * <p>
     * 
     * @param pLabel the new value of the <code>label</code> property.
     */
    public void setLabel(final String pLabel) {
        this.label = pLabel;
    }

    /**
     * Sets the <code>stringValue</code> property.
     * <p>
     * 
     * @param pStringValue the new value of the <code>stringValue</code> property.
     */
    public void setStringValue(final String pStringValue) {
        this.stringValue = pStringValue;
    }

    //NAS004
    public String toString(){
    	return this.label;
    }
}
