/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>InvoiceMediaType</code> indicates the different Invoice Media Type.
 * <p>
 */
public enum InvoiceMediaType {
    /**
     * Indicates that the Invoice Media Type is CASS_TAPE.
     */
    CASS_TAPE("E", "CASS Tape"),
    /**
     * Indicates that the Invoice Media Type is DESCRIPTIVE.
     */
    DESCRIPTIVE("C", "Descriptive"),
    /**
     * Indicates that the Invoice Media Type is GOVERNMENT_FORM.
     */
    GOVERNMENT_FORM("D", "Government Form"),
    /**
     * Indicates that the Invoice Media Type is LITERAL.
     */
    LITERAL("B", "Literal"),
    /**
     * Indicates that the Invoice Media Type is TAPE.
     */
    TAPE("A", "Tape"),
    /**
     * Indicates that the Invoice Media Type is LITERAL.
     */
    EMAIL("M", "Email"),
    /**
     * Indicates that the Invoice Media Type is TAPE.
     */
    FTP("F", "FTP");
    /**
     * Attribute to hold <code>invoiceMedia</code>.
     */
    private String invoiceMedia;

    /**
     * Attribute to hold <code>label</code>.
     */
    private String label;

    /**
     * Parameterized Constructor.
     * <p>
     * 
     * @param pInvoiceMediaType -The request object holds the Invoice media type.
     */
    InvoiceMediaType(final String pInvoiceMediaType) {
        this.invoiceMedia = pInvoiceMediaType;
    }

    /**
     * Parameterized Constructor.
     * <p>
     * 
     * @param pInvoiceMediaType -The request object holds the Invoice media type.
     * @param pLabel -The request object holds the type label.
     */
    InvoiceMediaType(final String pInvoiceMediaType, final String pLabel) {
        this.invoiceMedia = pInvoiceMediaType;
        this.setLabel(pLabel);
    }

    /**
     * Gets the <code>InvoiceMediaType</code>.
     * <p>
     * 
     * @param pInvoiceMediaType
     *            holds the new value of <code>InvoiceMediaType</code>
     *            <p>
     * @return the value of <code>InvoiceMediaType</code>
     */
    public static InvoiceMediaType getInvoiceMediaType(
                final String pInvoiceMediaType) {

        InvoiceMediaType aInvoiceMediaType = null;

        for (final InvoiceMediaType aType : InvoiceMediaType.values()) {

            if (pInvoiceMediaType.equalsIgnoreCase(aType.getLabel())) {
                aInvoiceMediaType = aType;
                break;
            }
        }

        return aInvoiceMediaType;

    }

    /**
     * Gets the <code>invoiceMedia</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceMedia</code> property.
     */
    public String getInvoiceMedia() {
        return this.invoiceMedia;
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
     * Sets the <code>invoiceMedia</code> property.
     * <p>
     * 
     * @param pInvoiceMedia the new value of the <code>invoiceMedia</code> property.
     */
    public void setInvoiceMedia(final String pInvoiceMedia) {
        this.invoiceMedia = pInvoiceMedia;
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
     * Gives the string format of enumerated <code>InvoiceMediaType</code>.
     * <p>
     * 
     * @return the current value of the <code>InvoiceMediaType</code>
     */
    public String value() {
        return this.name();
    }
    
    //NAS004
    public String toString(){
    	return this.label;
    }

}
