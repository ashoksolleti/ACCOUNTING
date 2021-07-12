package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * The persistent class for the ACC_ORIGINAL_INVOICE_DETAILS database table.
 * 
 */
public class AccountingOriginalInvoiceDetailDto implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>actualDataLine</code> property.
     */
    private String actualDataLine;

    /**
     * Attribute to hold <code>invoiceAwbId</code> property.
     */
    private BigDecimal invoiceAwbId;

    /**
     * Attribute to hold <code>memoType</code> property.
     */
    private MemoType memoIndicatiorType;

    private Long oId;

    /**
     * Attribute to hold <code>originalInvoiceBillingMonth</code> property.
     */
    private String originalInvoiceBillingMonth;

    /**
     * Attribute to hold <code>originalInvoiceBillingPeriod</code> property.
     */
    private Integer originalInvoiceBillingPeriod;

    /**
     * Attribute to hold <code>originalInvoiceDate</code> property.
     */
    private Date originalInvoiceDate;

    /**
     * Attribute to hold <code>originalInvoiceNumber</code> property.
     */
    private String originalInvoiceNumber;

    /**
     * Attribute to hold <code>originalRejectionNumber</code> property.
     */
    private String originalMemoNumber;

    /**
     * Attribute to hold <code>originalRejectionNumber</code> property.
     */
    private String originalRejectionNumber;

    public AccountingOriginalInvoiceDetailDto() {
    }

    public String getActualDataLine() {
        return this.actualDataLine;
    }

    /**
     * @return the invoiceAwbId
     */
    public BigDecimal getInvoiceAwbId() {
        return this.invoiceAwbId;
    }

    /**
     * @return the memoIndicatiorType
     */
    public MemoType getMemoIndicatiorType() {
        return this.memoIndicatiorType;
    }

    public Long getOId() {
        return this.oId;
    }

    /**
     * @return the originalInvoiceBillingMonth
     */
    public String getOriginalInvoiceBillingMonth() {
        return this.originalInvoiceBillingMonth;
    }

    /**
     * @return the originalInvoiceBillingPeriod
     */
    public Integer getOriginalInvoiceBillingPeriod() {
        return this.originalInvoiceBillingPeriod;
    }

    /**
     * @return the originalInvoiceDate
     */
    public Date getOriginalInvoiceDate() {
        return ContractUtility.getClonedDate(this.originalInvoiceDate);
    }

    public String getOriginalInvoiceNumber() {
        return this.originalInvoiceNumber;
    }

    /**
     * @return the originalMemoNumber
     */
    public String getOriginalMemoNumber() {
        return this.originalMemoNumber;
    }

    /**
     * @return the originalRejectionNumber
     */
    public String getOriginalRejectionNumber() {
        return this.originalRejectionNumber;
    }

    public void setActualDataLine(final String pActualDataLine) {
        this.actualDataLine = pActualDataLine;
    }

    /**
     * @param pInvoiceAwbId the invoiceAwbId to set
     */
    public void setInvoiceAwbId(final BigDecimal pInvoiceAwbId) {
        this.invoiceAwbId = pInvoiceAwbId;
    }

    /**
     * @param pMemoIndicatiorType the memoIndicatiorType to set
     */
    public void setMemoIndicatiorType(final MemoType pMemoIndicatiorType) {
        this.memoIndicatiorType = pMemoIndicatiorType;
    }

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * @param pOriginalInvoiceBillingMonth the originalInvoiceBillingMonth to set
     */
    public void setOriginalInvoiceBillingMonth(final String pOriginalInvoiceBillingMonth) {
        this.originalInvoiceBillingMonth = pOriginalInvoiceBillingMonth;
    }

    /**
     * @param pOriginalInvoiceBillingPeriod the originalInvoiceBillingPeriod to set
     */
    public void setOriginalInvoiceBillingPeriod(final Integer pOriginalInvoiceBillingPeriod) {
        this.originalInvoiceBillingPeriod = pOriginalInvoiceBillingPeriod;
    }

    /**
     * @param pOriginalInvoiceDate the originalInvoiceDate to set
     */
    public void setOriginalInvoiceDate(final Date pOriginalInvoiceDate) {
        this.originalInvoiceDate = ContractUtility.getClonedDate(pOriginalInvoiceDate);
    }

    public void setOriginalInvoiceNumber(final String pOriginalInvoiceNumber) {
        this.originalInvoiceNumber = ContractUtility.convertToUpperCase(pOriginalInvoiceNumber);
    }

    /**
     * @param pOriginalMemoNumber the originalMemoNumber to set
     */
    public void setOriginalMemoNumber(final String pOriginalMemoNumber) {
        this.originalMemoNumber = ContractUtility.convertToUpperCase(pOriginalMemoNumber);
    }

    /**
     * @param pOriginalRejectionNumber the originalRejectionNumber to set
     */
    public void setOriginalRejectionNumber(final String pOriginalRejectionNumber) {
        this.originalRejectionNumber = ContractUtility.convertToUpperCase(pOriginalRejectionNumber);
    }

}