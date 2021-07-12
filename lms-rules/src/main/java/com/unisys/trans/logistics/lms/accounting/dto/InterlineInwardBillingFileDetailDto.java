package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class InterlineInwardBillingFileDetailDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1752969083235975289L;
    
    /**
     * Attribute to hold <code>netBillingTotal</code> property.
     */
    private BigDecimal netBillingTotal;

    /**
     * Attribute to hold <code>netInvoiceTotal</code> property.
     */
    private BigDecimal netInvoiceTotal;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>totalAirwayBills</code> property.
     */
    private BigDecimal totalAirwayBills;

    /**
     * Attribute to hold <code>totalIscAmount</code> property.
     */
    private BigDecimal totalIscAmount;

    /**
     * Attribute to hold <code>totalOtherCharges</code> property.
     */
    private BigDecimal totalOtherCharges;

    /**
     * Attribute to hold <code>totalValuationCharges</code> property.
     */
    private BigDecimal totalValuationCharges;

    /**
     * Attribute to hold <code>totalVatAmount</code> property.
     */
    private BigDecimal totalVatAmount;

    /**
     * Attribute to hold <code>totalWeightCharges</code> property.
     */
    private BigDecimal totalWeightCharges;
    
    public BigDecimal getNetBillingTotal() {
        return this.netBillingTotal;
    }

    public BigDecimal getNetInvoiceTotal() {
        return this.netInvoiceTotal;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    public BigDecimal getTotalAirwayBills() {
        return this.totalAirwayBills;
    }

    public BigDecimal getTotalIscAmount() {
        return this.totalIscAmount;
    }

    public BigDecimal getTotalOtherCharges() {
        return this.totalOtherCharges;
    }

    public BigDecimal getTotalValuationCharges() {
        return this.totalValuationCharges;
    }

    public BigDecimal getTotalVatAmount() {
        return this.totalVatAmount;
    }

    public BigDecimal getTotalWeightCharges() {
        return this.totalWeightCharges;
    }

    public void setNetBillingTotal(final BigDecimal pNetBillingTotal) {
        this.netBillingTotal = pNetBillingTotal;
    }

    public void setNetInvoiceTotal(final BigDecimal pNetInvoiceTotal) {
        this.netInvoiceTotal = pNetInvoiceTotal;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the current value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    public void setTotalAirwayBills(final BigDecimal pTotalAirwayBills) {
        this.totalAirwayBills = pTotalAirwayBills;
    }

    public void setTotalIscAmount(final BigDecimal pTotalIscAmount) {
        this.totalIscAmount = pTotalIscAmount;
    }

    public void setTotalOtherCharges(final BigDecimal pTotalOtherCharges) {
        this.totalOtherCharges = pTotalOtherCharges;
    }

    public void setTotalValuationCharges(final BigDecimal pTotalValuationCharges) {
        this.totalValuationCharges = pTotalValuationCharges;
    }

    public void setTotalVatAmount(final BigDecimal pTotalVatAmount) {
        this.totalVatAmount = pTotalVatAmount;
    }

    public void setTotalWeightCharges(final BigDecimal pTotalWeightCharges) {
        this.totalWeightCharges = pTotalWeightCharges;
    }

}
