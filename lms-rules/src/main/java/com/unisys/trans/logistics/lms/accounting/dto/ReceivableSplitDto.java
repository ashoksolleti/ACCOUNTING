/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AmountType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.DueType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RevenueIndicatorType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class ReceivableSplitDto implements Serializable {

    /**
     * Unique serial version UID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>amountType</code> property.
     */

    private AmountType amountType;

    /**
     * Attribute to hold <code>amount</code> property.
     */

    private BigDecimal amount;

    /**
     * Attribute to hold <code>chargeCode</code> property.
     */

    private String chargeCode;

    private String subCode;
    public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String psubCode) {
		this.subCode =ContractUtility.convertToUpperCase(psubCode);
	}

	/**
     * Attribute to hold <code>dueType</code> property.
     */

    private DueType dueType;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;
    
   
    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */

    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>amountType</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountType</code> property.
     */
    public AmountType getAmountType() {
        return this.amountType;
    }

    /**
     * Sets the <code>amountType</code> property.
     * <p>
     * 
     * @param pAmountType
     *            the new value of the <code>amountType</code> property.
     */
    public void setAmountType(final AmountType pAmountType) {
        this.amountType = pAmountType;
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
     * Sets the <code>amount</code> property.
     * <p>
     * 
     * @param pAmount
     *            the new value of the <code>amount</code> property.
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    /**
     * Gets the <code>chargeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>chargeCode</code> property.
     */
    public String getChargeCode() {
        return this.chargeCode;
    }

    /**
     * Sets the <code>chargeCode</code> property.
     * <p>
     * 
     * @param pChargeCode
     *            the new value of the <code>chargeCode</code> property.
     */
    public void setChargeCode(final String pChargeCode) {
        this.chargeCode = ContractUtility.convertToUpperCase(pChargeCode);
    }

    /**
     * Gets the <code>dueType</code> property.
     * <p>
     * 
     * @return the current value of the <code>dueType</code> property.
     */
    public DueType getDueType() {
        return this.dueType;
    }

    /**
     * Sets the <code>dueType</code> property.
     * <p>
     * 
     * @param pDueType
     *            the new value of the <code>dueType</code> property.
     */
    public void setDueType(final DueType pDueType) {
        this.dueType = pDueType;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Attribute to hold <code>netAmount</code> property.
     */
    private BigDecimal netAmount;

    private RevenueIndicatorType revenueIndicatorType;
    
    /**
     * Attribute to hold <code>taxIndicator</code> property.
     */
    private Boolean taxIndicator;

    public Boolean getTaxIndicator() {
		return taxIndicator;
	}

	public void setTaxIndicator(Boolean taxIndicator) {
		this.taxIndicator = taxIndicator;
	}

	public RevenueIndicatorType getRevenueIndicatorType() {
        return this.revenueIndicatorType;
    }

    public void setRevenueIndicatorType(
                final RevenueIndicatorType pRevenueIndicatorType) {
        this.revenueIndicatorType = pRevenueIndicatorType;
    }

    public BigDecimal getNetAmount() {
        return this.netAmount;
    }

    public void setNetAmount(final BigDecimal pNetAmount) {
        this.netAmount = pNetAmount;
    }

}
