package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AmountType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.DueType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PayCodeType;

public class OtherChargeSplitDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -6487128835165235916L;

    private Long oId;

    private String otherChargeCode;

    private String otherChargeSubCode;

    private BigDecimal otherChargeAmount;

    private DueType otherChargeDue;
    
    private BigDecimal otherChargeBillingAmount;
    
    private BigDecimal otherChargeHostAmount;

    private PayCodeType otherChargePayCode;
    
    private BigDecimal otherChargeProrationAmount;
    
    public BigDecimal getOtherChargeBillingAmount() {
        return this.otherChargeBillingAmount;
    }

    public void setOtherChargeBillingAmount(final BigDecimal pOtherChargeBillingAmount) {
        this.otherChargeBillingAmount = pOtherChargeBillingAmount;
    }

    public BigDecimal getOtherChargeHostAmount() {
        return this.otherChargeHostAmount;
    }

    public void setOtherChargeHostAmount(final BigDecimal pOtherChargeHostAmount) {
        this.otherChargeHostAmount = pOtherChargeHostAmount;
    }

    public String getOtherChargeCode() {
        return this.otherChargeCode;
    }

    public void setOtherChargeCode(final String pOtherChargeCode) {
        this.otherChargeCode = pOtherChargeCode;
    }

    public String getOtherChargeSubCode() {
        return this.otherChargeSubCode;
    }

    public void setOtherChargeSubCode(final String pOtherChargeSubCode) {
        this.otherChargeSubCode = pOtherChargeSubCode;
    }

    public BigDecimal getOtherChargeAmount() {
        return this.otherChargeAmount;
    }

    public void setOtherChargeAmount(final BigDecimal pOtherChargeAmount) {
        this.otherChargeAmount = pOtherChargeAmount;
    }

    public DueType getOtherChargeDue() {
        return this.otherChargeDue;
    }

    public void setOtherChargeDue(final DueType pOtherChargeDue) {
        this.otherChargeDue = pOtherChargeDue;
    }

    public PayCodeType getOtherChargePayCode() {
        return this.otherChargePayCode;
    }

    public void setOtherChargePayCode(final PayCodeType pOtherChargePayCode) {
        this.otherChargePayCode = pOtherChargePayCode;
    }
    
    /**
     * Attribute to hold <code>amountType</code> property.
     */

    private AmountType amountType;
    
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

    public BigDecimal getOtherChargeProrationAmount() {
        return otherChargeProrationAmount;
    }

    public void setOtherChargeProrationAmount(BigDecimal otherChargeProrationAmount) {
        this.otherChargeProrationAmount = otherChargeProrationAmount;
    }

	public Long getoId() {
		return oId;
	}

	public void setoId(Long oId) {
		this.oId = oId;
	}


}
