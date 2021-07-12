/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.util.Date;

public class InvoiceDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    
    /**
     * Attribute to hold the invoiceDate
     */
    private Date invoiceDate;
    
    /**
     * Attribute to hold the invoiceDueDate
     */
    private Date invoiceDueDate;
    
    /**
     * Attribute to hold the invoiceNumber
     */
    private String invoiceNumber;
    
    /**
     * Attribute to hold the invoiceAmount
     */
    private int invoiceAmount;

    /**
     * Gets the <code>invoiceDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceDate</code> property.
     */
    public Date getInvoiceDate() {
        return this.invoiceDate;
    }

    /**
     * Sets the <code>pInvoiceDate</code>.
     * <p>
     * 
     * @param pInvoiceDate
     *            holds the new value of <code>invoiceDate</code>
     */
    public void setInvoiceDate(final Date pInvoiceDate) {
        this.invoiceDate = pInvoiceDate;
    }

    /**
     * Gets the <code>invoiceDueDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceDueDate</code> property.
     */
    public Date getInvoiceDueDate() {
        return this.invoiceDueDate;
    }

    /**
     * Sets the <code>pInvoiceDueDate</code>.
     * <p>
     * 
     * @param pInvoiceDueDate
     *            holds the new value of <code>invoiceDueDate</code>
     */
    public void setInvoiceDueDate(final Date pInvoiceDueDate) {
        this.invoiceDueDate = pInvoiceDueDate;
    }

    /**
     * Gets the <code>invoiceNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceNumber</code> property.
     */
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    /**
     * Sets the <code>pInvoiceNumber</code>.
     * <p>
     * 
     * @param pInvoiceNumber
     *            holds the new value of <code>invoiceNumber</code>
     */
    public void setInvoiceNumber(final String pInvoiceNumber) {
        this.invoiceNumber = pInvoiceNumber;
    }

    /**
     * Gets the <code>invoiceAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceAmount</code> property.
     */
    public int getInvoiceAmount() {
        return this.invoiceAmount;
    }

    /**
     * Sets the <code>pInvoiceAmount</code>.
     * <p>
     * 
     * @param pInvoiceAmount
     *            holds the new value of <code>invoiceAmount</code>
     */
    public void setInvoiceAmount(final int pInvoiceAmount) {
        this.invoiceAmount = pInvoiceAmount;
    }



 
}
