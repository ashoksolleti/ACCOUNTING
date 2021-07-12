/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>InvoiceFrequencyType</code> indicates the different Invoice Frequency Type.
 * <p>
 */
public enum InvoiceFrequencyType {
    /**
     * Indicates that the Invoice Frequency Type is BI_MONTHLY.
     */
    BI_MONTHLY("D", "Bi-Monthly"),
    /**
     * Indicates that the Invoice Frequency Type is DAILY.
     */
    DAILY("A", "Daily"),
    /**
     * Indicates that the Invoice Frequency Type is DEMAND.
     */
    DEMAND("F", "Demand"),
    /**
     * Indicates that the Invoice Frequency Type is MONTHLY.
     */
    MONTHLY("E", "Monthly"),
    /**
     * Indicates that the Invoice Frequency Type is TEN_DAYS.
     */
    TEN_DAYS("C", "10 days"),
    
    QUATERLY("G","Quaterly"), 
    HALF_YEARLY("H","Half Yearly"), 
    YEARLY("I","Yearly"),
    /**
     * Indicates that the Invoice Frequency Type is WEEKLY.
     */
    WEEKLY("B", "Weekly");

    /**
     * Attribute to hold <code>code</code>.
     */
    private final String code;

    /**
     * Attribute to hold <code>name</code>.
     */
    private final String name;

    /**
     * Parameterized Constructor.
     * <p>
     * 
     * @param pCode The request object holds the type code.
     * @param pName The request object holds the type name.
     */
    InvoiceFrequencyType(final String pCode, final String pName) {
        this.code = pCode;
        this.name = pName;
    }

    /**
     * Gets the <code>InvoiceFrequencyType</code>.
     * <p>
     * 
     * @param pInvoiceFrequencyType
     *            holds the new value of <code>InvoiceFrequencyType</code>
     *            <p>
     * @return the value of <code>InvoiceFrequencyType</code>
     */
    public static InvoiceFrequencyType getInvoiceFrequencyType(
                final String pInvoiceFrequencyType) {

        InvoiceFrequencyType aInvoiceFrequencyType = null;

        for (final InvoiceFrequencyType aType : InvoiceFrequencyType.values()) {

            if (pInvoiceFrequencyType.equalsIgnoreCase(aType.getName())) {
                aInvoiceFrequencyType = aType;
                break;
            }
        }

        return aInvoiceFrequencyType;

    }


    /**
     * Gets the <code>code</code> property.
     * <p>
     * 
     * @return the current value of the <code>code</code> property.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * 
     * @return the current value of the <code>name</code> property.
     */
    public String getName() {
        return this.name;
    }
    
    //NAS004
    public String toString(){
       return this.name;
   }

}
