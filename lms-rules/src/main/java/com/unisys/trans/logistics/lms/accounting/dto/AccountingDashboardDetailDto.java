package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.FrequencyType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class AccountingDashboardDetailDto extends AbstractRequest{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>auditQueuedAwbCount</code> property.
     */
    private Long auditQueuedAwbCount;

    /**
     * Attribute to hold <code>auditQueuedAwbRevenue</code> property.
     */
    private BigDecimal auditQueuedAwbRevenue;

    /**
     * Attribute to hold <code>endDate</code> property.
     */
    private Date endDate;

    /**
     * Attribute to hold <code>errorQueuedAwbCount</code> property.
     */
    private Long errorQueuedAwbCount;

    /**
     * Attribute to hold <code>errorQueuedAwbRevenue</code> property.
     */
    private BigDecimal errorQueuedAwbRevenue;

    /**
     * Attribute to hold <code>exportAuditedAwbCount</code> property.
     */
    private Long exportAuditedAwbCount;

    /**
     * Attribute to hold <code>exportAuditedAwbRevenue</code> property.
     */
    private BigDecimal exportAuditedAwbRevenue;

    /**
     * Attribute to hold <code>frequencyType</code> property.
     */
    private FrequencyType frequencyType;

    /**
     * Attribute to hold <code>importAuditedAwbCount</code> property.
     */
    private Long importAuditedAwbCount;

    /**
     * Attribute to hold <code>importAuditedAwbRevenue</code> property.
     */
    private BigDecimal importAuditedAwbRevenue;

    /**
     * Attribute to hold <code>invoicedAwbCount</code> property.
     */
    private Long invoicedAwbCount;

    /**
     * Attribute to hold <code>invoicedAwbRevenue</code> property.
     */
    private BigDecimal invoicedAwbRevenue;

    /**
     * Attribute to hold <code>issuedAwbCount</code> property.
     */
    private Long issuedAwbCount;

    /**
     * Attribute to hold <code>issuedAwbRevenue</code> property.
     */
    private BigDecimal issuedAwbRevenue;

    /**
     * Attribute to hold <code>paidAwbCount</code> property.
     */
    private Long paidAwbCount;

    /**
     * Attribute to hold <code>paidAwbRevenue</code> property.
     */
    private BigDecimal paidAwbRevenue;

    /**
     * Attribute to hold <code>processedAwbCount</code> property.
     */
    private Long processedAwbCount;

    /**
     * Attribute to hold <code>processedAwbRevenue</code> property.
     */
    private BigDecimal processedAwbRevenue;

    /**
     * Attribute to hold <code>readyForInvoiceAwbCount</code> property.
     */
    private Long readyForInvoiceAwbCount;

    /**
     * Attribute to hold <code>readyForInvoiceAwbRevenue</code> property.
     */
    private BigDecimal readyForInvoiceAwbRevenue;

    /**
     * Attribute to hold <code>startDate</code> property.
     */
    private Date startDate;
    /**
     * Gets the <code>auditQueuedAwbCount</code> property.
     * <p>
     * 
     * @return the current value of the <code>auditQueuedAwbCount</code> property.
     */
    public Long getAuditQueuedAwbCount() {
        return this.auditQueuedAwbCount;
    }/**
     * Gets the <code>auditQueuedAwbRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>auditQueuedAwbRevenue</code> property.
     */

    public BigDecimal getAuditQueuedAwbRevenue() {
        return this.auditQueuedAwbRevenue;
    }
    /**
     * Gets the <code>endDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>endDate</code> property.
     */

    public Date getEndDate() {
        return this.endDate;
    }
    /**
     * Gets the <code>errorQueuedAwbCount</code> property.
     * <p>
     * 
     * @return the current value of the <code>errorQueuedAwbCount</code> property.
     */
    public Long getErrorQueuedAwbCount() {
        return this.errorQueuedAwbCount;
    }
    /**
     * Gets the <code>errorQueuedAwbRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>errorQueuedAwbRevenue</code> property.
     */
    public BigDecimal getErrorQueuedAwbRevenue() {
        return this.errorQueuedAwbRevenue;
    }
    /**
     * Gets the <code>exportAuditedAwbCount</code> property.
     * <p>
     * 
     * @return the current value of the <code>exportAuditedAwbCount</code> property.
     */
    public Long getExportAuditedAwbCount() {
        return this.exportAuditedAwbCount;
    }
    /**
     * Gets the <code>exportAuditedAwbRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>exportAuditedAwbRevenue</code> property.
     */
    public BigDecimal getExportAuditedAwbRevenue() {
        return this.exportAuditedAwbRevenue;
    }
    /**
     * Gets the <code>frequencyType</code> property.
     * <p>
     * 
     * @return the current value of the <code>frequencyType</code> property.
     */
    public FrequencyType getFrequencyType() {
        return this.frequencyType;
    }
    /**
     * Gets the <code>importAuditedAwbCount</code> property.
     * <p>
     * 
     * @return the current value of the <code>importAuditedAwbCount</code> property.
     */
    public Long getImportAuditedAwbCount() {
        return this.importAuditedAwbCount;
    }
    /**
     * Gets the <code>importAuditedAwbRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>importAuditedAwbRevenue</code> property.
     */
    public BigDecimal getImportAuditedAwbRevenue() {
        return this.importAuditedAwbRevenue;
    }
    /**
     * Gets the <code>invoicedAwbCount</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoicedAwbCount</code> property.
     */
    public Long getInvoicedAwbCount() {
        return this.invoicedAwbCount;
    }
    /**
     * Gets the <code>invoicedAwbRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoicedAwbRevenue</code> property.
     */
    public BigDecimal getInvoicedAwbRevenue() {
        return this.invoicedAwbRevenue;
    }
    /**
     * Gets the <code>issuedAwbCount</code> property.
     * <p>
     * 
     * @return the current value of the <code>issuedAwbCount</code> property.
     */
    public Long getIssuedAwbCount() {
        return this.issuedAwbCount;
    }
    /**
     * Gets the <code>issuedAwbRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>issuedAwbRevenue</code> property.
     */
    public BigDecimal getIssuedAwbRevenue() {
        return this.issuedAwbRevenue;
    }
    /**
     * Gets the <code>paidAwbCount</code> property.
     * <p>
     * 
     * @return the current value of the <code>paidAwbCount</code> property.
     */
    public Long getPaidAwbCount() {
        return this.paidAwbCount;
    }
    /**
     * Gets the <code>paidAwbRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>paidAwbRevenue</code> property.
     */
    public BigDecimal getPaidAwbRevenue() {
        return this.paidAwbRevenue;
    }
    /**
     * Gets the <code>processedAwbCount</code> property.
     * <p>
     * 
     * @return the current value of the <code>processedAwbCount</code> property.
     */
    public Long getProcessedAwbCount() {
        return this.processedAwbCount;
    }
    /**
     * Gets the <code>processedAwbRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>processedAwbRevenue</code> property.
     */
    public BigDecimal getProcessedAwbRevenue() {
        return this.processedAwbRevenue;
    }
    /**
     * Gets the <code>agreementIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>agreementIdentifier</code> property.
     */
    public Long getReadyForInvoiceAwbCount() {
        return this.readyForInvoiceAwbCount;
    }
    /**
     * Gets the <code>readyForInvoiceAwbRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>readyForInvoiceAwbRevenue</code> property.
     */
    public BigDecimal getReadyForInvoiceAwbRevenue() {
        return this.readyForInvoiceAwbRevenue;
    }
    /**
     * Gets the <code>startDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>startDate</code> property.
     */
    public Date getStartDate() {
        return this.startDate;
    }
    /**
     * Sets the <code>auditQueuedAwbCount</code> property.
     * <p>
     * 
     * @param auditQueuedAwbCount
     *            the current value of the <code>auditQueuedAwbCount</code> property.
     */
    public void setAuditQueuedAwbCount(final Long pAuditQueuedAwbCount) {
        this.auditQueuedAwbCount = pAuditQueuedAwbCount;
    }
    /**
     * Sets the <code>auditQueuedAwbRevenue</code> property.
     * <p>
     * 
     * @param auditQueuedAwbRevenue
     *            the current value of the <code>auditQueuedAwbRevenue</code> property.
     */
    public void setAuditQueuedAwbRevenue(final BigDecimal pAuditQueuedAwbRevenue) {
        this.auditQueuedAwbRevenue = pAuditQueuedAwbRevenue;
    }
    /**
     * Sets the <code>endDate</code> property.
     * <p>
     * 
     * @param endDate
     *            the current value of the <code>endDate</code> property.
     */
    public void setEndDate(final Date pEndDate) {
        this.endDate = pEndDate;
    }
    /**
     * Sets the <code>errorQueuedAwbCount</code> property.
     * <p>
     * 
     * @param errorQueuedAwbCount
     *            the current value of the <code>errorQueuedAwbCount</code> property.
     */
    public void setErrorQueuedAwbCount(final Long pErrorQueuedAwbCount) {
        this.errorQueuedAwbCount = pErrorQueuedAwbCount;
    }
    /**
     * Sets the <code>errorQueuedAwbRevenue</code> property.
     * <p>
     * 
     * @param errorQueuedAwbRevenue
     *            the current value of the <code>errorQueuedAwbRevenue</code> property.
     */
    public void setErrorQueuedAwbRevenue(final BigDecimal pErrorQueuedAwbRevenue) {
        this.errorQueuedAwbRevenue = pErrorQueuedAwbRevenue;
    }
    /**
     * Sets the <code>exportAuditedAwbCount</code> property.
     * <p>
     * 
     * @param exportAuditedAwbCount
     *            the current value of the <code>exportAuditedAwbCount</code> property.
     */
    public void setExportAuditedAwbCount(final Long pExportAuditedAwbCount) {
        this.exportAuditedAwbCount = pExportAuditedAwbCount;
    }
    /**
     * Sets the <code>exportAuditedAwbRevenue</code> property.
     * <p>
     * 
     * @param exportAuditedAwbRevenue
     *            the current value of the <code>exportAuditedAwbRevenue</code> property.
     */
    public void setExportAuditedAwbRevenue(final BigDecimal pExportAuditedAwbRevenue) {
        this.exportAuditedAwbRevenue = pExportAuditedAwbRevenue;
    }
    /**
     * Sets the <code>frequencyType</code> property.
     * <p>
     * 
     * @param frequencyType
     *            the current value of the <code>frequencyType</code> property.
     */
    public void setFrequencyType(final FrequencyType pFrequencyType) {
        this.frequencyType = pFrequencyType;
    }
    /**
     * Sets the <code>importAuditedAwbCount</code> property.
     * <p>
     * 
     * @param importAuditedAwbCount
     *            the current value of the <code>importAuditedAwbCount</code> property.
     */
    public void setImportAuditedAwbCount(final Long pImportAuditedAwbCount) {
        this.importAuditedAwbCount = pImportAuditedAwbCount;
    }
    /**
     * Sets the <code>importAuditedAwbRevenue</code> property.
     * <p>
     * 
     * @param importAuditedAwbRevenue
     *            the current value of the <code>importAuditedAwbRevenue</code> property.
     */
    public void setImportAuditedAwbRevenue(final BigDecimal pImportAuditedAwbRevenue) {
        this.importAuditedAwbRevenue = pImportAuditedAwbRevenue;
    }
    /**
     * Sets the <code>invoicedAwbCount</code> property.
     * <p>
     * 
     * @param invoicedAwbCount
     *            the current value of the <code>invoicedAwbCount</code> property.
     */
    public void setInvoicedAwbCount(final Long pInvoicedAwbCount) {
        this.invoicedAwbCount = pInvoicedAwbCount;
    }
    /**
     * Sets the <code>invoicedAwbRevenue</code> property.
     * <p>
     * 
     * @param invoicedAwbRevenue
     *            the current value of the <code>invoicedAwbRevenue</code> property.
     */
    public void setInvoicedAwbRevenue(final BigDecimal pInvoicedAwbRevenue) {
        this.invoicedAwbRevenue = pInvoicedAwbRevenue;
    }
    /**
     * Sets the <code>issuedAwbCount</code> property.
     * <p>
     * 
     * @param issuedAwbCount
     *            the current value of the <code>issuedAwbCount</code> property.
     */
    public void setIssuedAwbCount(final Long pIssuedAwbCount) {
        this.issuedAwbCount = pIssuedAwbCount;
    }
    /**
     * Sets the <code>issuedAwbRevenue</code> property.
     * <p>
     * 
     * @param issuedAwbRevenue
     *            the current value of the <code>issuedAwbRevenue</code> property.
     */
    public void setIssuedAwbRevenue(final BigDecimal pIssuedAwbRevenue) {
        this.issuedAwbRevenue = pIssuedAwbRevenue;
    }
    /**
     * Sets the <code>paidAwbCount</code> property.
     * <p>
     * 
     * @param paidAwbCount
     *            the current value of the <code>paidAwbCount</code> property.
     */
    public void setPaidAwbCount(final Long pPaidAwbCount) {
        this.paidAwbCount = pPaidAwbCount;
    }
    /**
     * Sets the <code>paidAwbRevenue</code> property.
     * <p>
     * 
     * @param paidAwbRevenue
     *            the current value of the <code>paidAwbRevenue</code> property.
     */
    public void setPaidAwbRevenue(final BigDecimal pPaidAwbRevenue) {
        this.paidAwbRevenue = pPaidAwbRevenue;
    }
    /**
     * Sets the <code>processedAwbCount</code> property.
     * <p>
     * 
     * @param processedAwbCount
     *            the current value of the <code>processedAwbCount</code> property.
     */
    public void setProcessedAwbCount(final Long pProcessedAwbCount) {
        this.processedAwbCount = pProcessedAwbCount;
    }
    /**
     * Sets the <code>processedAwbRevenue</code> property.
     * <p>
     * 
     * @param processedAwbRevenue
     *            the current value of the <code>processedAwbRevenue</code> property.
     */
    public void setProcessedAwbRevenue(final BigDecimal pProcessedAwbRevenue) {
        this.processedAwbRevenue = pProcessedAwbRevenue;
    }
    /**
     * Sets the <code>readyForInvoiceAwbCount</code> property.
     * <p>
     * 
     * @param readyForInvoiceAwbCount
     *            the current value of the <code>readyForInvoiceAwbCount</code> property.
     */
    public void setReadyForInvoiceAwbCount(final Long pReadyForInvoiceAwbCount) {
        this.readyForInvoiceAwbCount = pReadyForInvoiceAwbCount;
    }
    /**
     * Sets the <code>readyForInvoiceAwbRevenue</code> property.
     * <p>
     * 
     * @param readyForInvoiceAwbRevenue
     *            the current value of the <code>readyForInvoiceAwbRevenue</code> property.
     */
    public void setReadyForInvoiceAwbRevenue(final BigDecimal pReadyForInvoiceAwbRevenue) {
        this.readyForInvoiceAwbRevenue = pReadyForInvoiceAwbRevenue;
    }
    /**
     * Sets the <code>startDate</code> property.
     * <p>
     * 
     * @param startDate
     *            the current value of the <code>startDate</code> property.
     */
    public void setStartDate(final Date pStartDate) {
        this.startDate = pStartDate;
    }

}
