/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class InvoicePaymentDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3368549895784251877L;

    /**
     * Attribute to hold <code>invoiceNumber</code> property.
     */
    private String invoiceNumber;

    /**
     * Attribute to hold <code>date</code> property.
     */
    private Date date;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>accountNumber</code> property.
     */
    private String accountNumber;

    /**
     * Attribute to hold <code>remarks</code> property.
     */
    private String remarks;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Gets the <code>accountNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>accountNumber</code> property.
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Gets the <code>amount</code> property.
     * <p>
     * 
     * @return the current value of the <code>amount</code> property.
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Gets the <code>currencyCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>currencyCode</code> property.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Gets the <code>date</code> property.
     * <p>
     * 
     * @return the current value of the <code>date</code> property.
     */
    public Date getDate() {
        return this.date;
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
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>remarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>remarks</code> property.
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Sets the <code>accountNumber</code>.
     * <p>
     * 
     * @param pAccountNumber
     *            holds the new value of <code>accountNumber</code>
     */
    public void setAccountNumber(final String pAccountNumber) {
        this.accountNumber = pAccountNumber;
    }

    /**
     * Sets the <code>amount</code>.
     * <p>
     * 
     * @param pAmount
     *            holds the new value of <code>amount</code>
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    /**
     * Sets the <code>currencyCode</code>.
     * <p>
     * 
     * @param pCurrencyCode
     *            holds the new value of <code>currencyCode</code>
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = pCurrencyCode;
    }

    /**
     * Sets the <code>date</code>.
     * <p>
     * 
     * @param pDate
     *            holds the new value of <code>date</code>
     */
    public void setDate(final Date pDate) {
        this.date = pDate;
    }

    /**
     * Sets the <code>invoiceNumber</code>.
     * <p>
     * 
     * @param pInvoiceNumber
     *            holds the new value of <code>invoiceNumber</code>
     */
    public void setInvoiceNumber(final String pInvoiceNumber) {
        this.invoiceNumber = pInvoiceNumber;
    }

    /**
     * Sets the <code>oId</code> property.
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>remarks</code>.
     * <p>
     * 
     * @param pRemarks
     *            holds the new value of <code>remarks</code>
     */
    public void setRemarks(final String pRemarks) {
        this.remarks = pRemarks;
    }

}
