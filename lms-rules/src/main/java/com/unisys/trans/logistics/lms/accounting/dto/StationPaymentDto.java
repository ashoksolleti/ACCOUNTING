/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentMethodType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class StationPaymentDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2278426192783660959L;

    /**
     * Attribute to hold <code>agent</code> property.
     */
    private String agent;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;

    /**
     * Attribute to hold <code>cashDrawer</code> property.
     */
    private String cashDrawer;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>date</code> property.
     */
    private Date date;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>paymentMethod</code> property.
     */
    private PaymentMethodType paymentMethod;

    /**
     * Attribute to hold <code>time</code> property.
     */
    private Integer time;

    /**
     * Gets the <code>agent</code> property.
     * <p>
     * 
     * @return the current value of the <code>agent</code> property.
     */
    public String getAgent() {
        return this.agent;
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
     * Gets the <code>cashDrawer</code> property.
     * <p>
     * 
     * @return the current value of the <code>cashDrawer</code> property.
     */
    public String getCashDrawer() {
        return this.cashDrawer;
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
        return ContractUtility.getClonedDate(this.date);
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
     * Gets the <code>paymentMethod</code> property.
     * <p>
     * 
     * @return the current value of the <code>paymentMethod</code> property.
     */
    public PaymentMethodType getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     * Gets the <code>time</code> property.
     * <p>
     * 
     * @return the current value of the <code>time</code> property.
     */
    public Integer getTime() {
        return this.time;
    }

    /**
     * Sets the <code>agent</code>.
     * <p>
     * 
     * @param pAgent
     *            holds the new value of <code>agent</code>
     */
    public void setAgent(final String pAgent) {
        this.agent = ContractUtility.convertToUpperCase(pAgent);
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
     * Sets the <code>cashDrawer</code>.
     * <p>
     * 
     * @param pCashDrawer
     *            holds the new value of <code>cashDrawer</code>
     */
    public void setCashDrawer(final String pCashDrawer) {
        this.cashDrawer = ContractUtility.convertToUpperCase(pCashDrawer);
    }

    /**
     * Sets the <code>currencyCode</code>.
     * <p>
     * 
     * @param pCurrencyCode
     *            holds the new value of <code>currencyCode</code>
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode =  ContractUtility.convertToUpperCase(pCurrencyCode);
    }

    /**
     * Sets the <code>date</code>.
     * <p>
     * 
     * @param pDate
     *            holds the new value of <code>date</code>
     */
    public void setDate(final Date pDate) {
        this.date = ContractUtility.getClonedDate(pDate);
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
     * Sets the <code>paymentMethod</code>.
     * <p>
     * 
     * @param pPaymentMethod
     *            holds the new value of <code>paymentMethod</code>
     */
    public void setPaymentMethod(final PaymentMethodType pPaymentMethod) {
        this.paymentMethod = pPaymentMethod;
    }

    /**
     * Sets the <code>time</code>.
     * <p>
     * 
     * @param pTime
     *            holds the new value of <code>time</code>
     */
    public void setTime(final Integer pTime) {
        this.time = pTime;
    }
}
