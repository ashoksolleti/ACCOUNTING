package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.CashDrawerTransactionType;
import com.unisys.trans.logistics.lms.framework.constants.CreditCardType;
import com.unisys.trans.logistics.lms.framework.constants.StorageTypes;
import com.unisys.trans.logistics.lms.framework.dto.constants.FinalStatusType;

public class HousePaymentEntryDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6709519359619574388L;

    /**
     * Attribute to hold <code>rowIndex </code> property.
     * <p>
     * Datatable row index value
     */
    private String rowIndex;

    /**
     * @return the rowIndex
     */
    public String getRowIndex() {
        return this.rowIndex;
    }

    /**
     * @param pRowIndex the rowIndex to set
     */
    public void setRowIndex(final String pRowIndex) {
        this.rowIndex = pRowIndex;
    }

    /**
     * Attribute to hold the <code>creditCardNumber</code> property.
     */
    private CashDrawerTransactionType cashDrawerTransactionType;

    /**
     * Attribute to hold the <code>creditCardNumber</code> property.
     */
    private String mcoNumber;

    /**
     * @return the mcoNumber
     */
    public String getMcoNumber() {
        return this.mcoNumber;
    }

    /**
     * @param pMcoNumber the mcoNumber to set
     */
    public void setMcoNumber(final String pMcoNumber) {
        this.mcoNumber = pMcoNumber;
    }

    /**
     * Attribute to hold the <code>holderName</code> property.
     */
    private String holderName;

    /**
     * @return the creditCardNum
     */
    public String getCreditCardNum() {
        return this.creditCardNum;
    }

    /**
     * @param pCreditCardNum the creditCardNum to set
     */
    public void setCreditCardNum(final String pCreditCardNum) {
        this.creditCardNum = pCreditCardNum;
    }

    /**
     * Attribute to hold the <code>creditCardNum</code> property.
     */
    private String creditCardNum;

    /**
     * Attribute to hold the <code>invoiceReceipt</code> property.
     */
    private String invoiceReceipt;

    /**
     * Attribute to hold the <code>finalStatusType</code> property.
     */
    private FinalStatusType finalStatusType;

    /**
     * @return the creditCardType
     */
    public CreditCardType getCreditCardType() {
        return this.creditCardType;
    }

    /**
     * @param pCreditCardType the creditCardType to set
     */
    public void setCreditCardType(final CreditCardType pCreditCardType) {
        this.creditCardType = pCreditCardType;
    }

    /**
     * Attribute to hold the <code>creditCardType</code> property.
     */
    private CreditCardType creditCardType;

    /**
     * @return the finalStatusType
     */
    public FinalStatusType getFinalStatusType() {
        return this.finalStatusType;
    }

    /**
     * @param pFinalStatusType the finalStatusType to set
     */
    public void setFinalStatusType(final FinalStatusType pFinalStatusType) {
        this.finalStatusType = pFinalStatusType;
    }

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>paymentEntryDto</code> property.
     */
    private PaymentEntryDto paymentEntryDto;

    /**
     * Attribute to hold the <code>calculatedAmount</code> property.
     */
    private BigDecimal calculatedAmount;

    /**
     * @return the calculatedDays
     */
    public int getCalculatedDays() {
        return this.calculatedDays;
    }

    /**
     * @return the calculatedAmount
     */
    public BigDecimal getCalculatedAmount() {
        return this.calculatedAmount;
    }

    /**
     * @param pCalculatedAmount the calculatedAmount to set
     */
    public void setCalculatedAmount(final BigDecimal pCalculatedAmount) {
        this.calculatedAmount = pCalculatedAmount;
    }

    /**
     * @param pCalculatedDays the calculatedDays to set
     */
    public void setCalculatedDays(final int pCalculatedDays) {
        this.calculatedDays = pCalculatedDays;
    }

    /**
     * Attribute to hold the <code>calculatedDays</code> property.
     */
    private int calculatedDays;

    /**
     * Attribute to hold the <code>storageAmount</code> property.
     */
    private BigDecimal storageAmount;

    /**
     * Attribute to hold the <code>storageDays</code> property.
     */
    private String storageDays;

    /**
     * Attribute to hold the <code>storageTypes</code> property.
     */
    private StorageTypes storageTypes;

    /**
     * @return the storageDays
     */
    public String getStorageDays() {
        return this.storageDays;
    }

    /**
     * @param pStorageDays the storageDays to set
     */
    public void setStorageDays(final String pStorageDays) {
        this.storageDays = pStorageDays;
    }

    /**
     * Attribute to hold the <code>typeNumber</code> property.
     */
    private String typeNumber;

    /**
     * Gets the <code>cashDrawerTransactionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>cashDrawerTransactionType</code> property.
     */
    public CashDrawerTransactionType getChashDrawerTransactionType() {
        return this.cashDrawerTransactionType;
    }

    /**
     * Gets the <code>holderName</code> property.
     * <p>
     * 
     * @return the current value of the <code>holderName</code> property.
     */
    public String getHolderName() {
        return this.holderName;
    }

    /**
     * Gets the <code>invoiceReceipt</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceReceipt</code> property.
     */
    public String getInvoiceReceipt() {
        return this.invoiceReceipt;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>paymentEntryDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>paymentEntryDto</code> property.
     */
    public PaymentEntryDto getPaymentEntryDto() {
        return this.paymentEntryDto;
    }

    /**
     * Gets the <code>storageAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>storageAmount</code> property.
     */
    public BigDecimal getStorageAmount() {
        return this.storageAmount;
    }

    /**
     * Gets the <code>storageTypes</code> property.
     * <p>
     * 
     * @return the current value of the <code>storageTypes</code> property.
     */
    public StorageTypes getStorageTypes() {
        return this.storageTypes;
    }

    /**
     * Gets the <code>typeNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>typeNumber</code> property.
     */
    public String getTypeNumber() {
        return this.typeNumber;
    }

    /**
     * Sets the <code>cashDrawerTransactionType</code> property.
     * <p>
     * 
     * @param pChashDrawerTransactionType
     *            holds the new value of <code>cashDrawerTransactionType</code>.<br>
     */
    public void setChashDrawerTransactionType(
                final CashDrawerTransactionType pChashDrawerTransactionType) {
        this.cashDrawerTransactionType = pChashDrawerTransactionType;
    }

    /**
     * Sets the <code>pHolderName</code> property.
     * <p>
     * 
     * @param pHolderName
     *            holds the new value of <code>holderName</code>.<br>
     */
    public void setHolderName(final String pHolderName) {
        this.holderName = pHolderName;
    }

    /**
     * Sets the <code>invoiceReceipt</code> property.
     * <p>
     * 
     * @param pInvoiceReceipt
     *            holds the new value of <code>invoiceReceipt</code>.<br>
     */
    public void setInvoiceReceipt(final String pInvoiceReceipt) {
        this.invoiceReceipt = pInvoiceReceipt;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>oId</code>.<br>
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>pPaymentEntryDto</code> property.
     * <p>
     * 
     * @param pPaymentEntryDto
     *            holds the new value of <code>pPaymentEntryDto</code>.<br>
     */
    public void setPaymentEntryDto(final PaymentEntryDto pPaymentEntryDto) {
        this.paymentEntryDto = pPaymentEntryDto;
    }

    /**
     * Sets the <code>pStorageAmount</code> property.
     * <p>
     * 
     * @param pStorageAmount
     *            holds the new value of <code>storageAmount</code>.<br>
     */
    public void setStorageAmount(final BigDecimal pStorageAmount) {
        this.storageAmount = pStorageAmount;
    }

    /**
     * Sets the <code>pStorageTypes</code> property.
     * <p>
     * 
     * @param pStorageTypes
     *            holds the new value of <code>pStorageTypes</code>.<br>
     */
    public void setStorageTypes(final StorageTypes pStorageTypes) {
        this.storageTypes = pStorageTypes;
    }

    /**
     * Sets the <code>typeNumber</code> property.
     * <p>
     * 
     * @param pTypeNumber
     *            holds the new value of <code>typeNumber</code>.<br>
     */
    public void setTypeNumber(final String pTypeNumber) {
        this.typeNumber = pTypeNumber;
    }

    /**
     * @return the statusRemarks
     */
    public String getStatusRemarks() {
        return this.statusRemarks;
    }

    /**
     * @param pStatusRemarks the statusRemarks to set
     */
    public void setStatusRemarks(final String pStatusRemarks) {
        this.statusRemarks = pStatusRemarks;
    }

    /**
     * Attribute to hold <code>statusRemarks</code> property.
     */
    private String statusRemarks;

}
