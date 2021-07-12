package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.CashDrawerTransactionType;
import com.unisys.trans.logistics.lms.framework.constants.StorageTypes;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class AWBPaymentEntryDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6709519359619574388L;

    /**
     * Attribute to hold the <code>calcualtedAmount</code> property.
     */
    private BigDecimal calcualtedAmount;

    /**
     * Attribute to hold the <code>calculatedDays</code> property.
     */
    private Integer calculatedDays;

    /**
     * Attribute to hold the <code>cashCollectedForOtherCharges</code> property.
     */
    private BigDecimal cashCollectedForOtherCharges;

    /**
     * Attribute to hold the <code>cashCollectedForWeightCharges</code> property.
     */
    private BigDecimal cashCollectedForWeightCharges;

    /**
     * Attribute to hold the <code>creditCardNumber</code> property.
     */
    private CashDrawerTransactionType cashDrawerTransactionType;

    /**
     * Attribute to hold the <code>creditCardNumber</code> property.
     */
    private String checkNumber;

    /**
     * Attribute to hold the <code>creditCardNumber</code> property.
     */
    private String creditCardNumber;

    /**
     * Attribute to hold the <code>cycleCount</code> property.
     */
    private int cycleCount;

    /**
     * Attribute to hold the <code>freightPaymentDto</code> property.
     */
    private FreightPaymentDto freightPaymentDto;

    /**
     * Attribute to hold the <code>holderName</code> property.
     */
    private String holderName;

    /**
     * Attribute to hold the <code>invoiceNumber</code> property.
     */
    private String invoiceNumber;

    /**
     * Attribute to hold the <code>invoiceReceipt</code> property.
     */
    private String invoiceReceipt;

    /**
     * Attribute to hold the <code>mcoNumber</code> property.
     */
    private String mcoNumber;

    /**
     * Attribute to hold the <code>creditCardNumber</code> property.
     */
    private String number;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>calcualtedAmount</code> property.
     */
    private BigDecimal otherChargeAmount;

    /**
     * Attribute to hold the <code>otherChargeDue</code> property.
     */
    private BigDecimal otherChargeDue;

    /**
     * Attribute to hold the <code>paymentEntryDto</code> property.
     */
    private PaymentEntryDto paymentEntryDto;

    /**
     * Attribute to hold the <code>receiptNumber</code> property.
     */
    private String receiptNumber;

    /**
     * Attribute to hold the <code>signInStation</code> property.
     */
    private String signInStation;

    /**
     * Attribute to hold the <code>storageAmount</code> property.
     */
    private BigDecimal storageAmount;

    /**
     * Attribute to hold the <code>storageDays</code> property.
     */
    private Integer storageDays;

    /**
     * Attribute to hold the <code>storageTypes</code> property.
     */
    private StorageTypes storageTypes;

    /**
     * Attribute to hold the <code>typeNumber</code> property.
     */
    private String typeNumber;

    /**
     * Attribute to hold the <code>userName</code> property.
     */
    private String userName;

    /**
     * Attribute to hold the <code>weightChargeDue</code> property.
     */
    private BigDecimal weightChargeDue;

    /**
     * Gets the <code>calcualtedAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>calcualtedAmount</code> property.
     */
    public BigDecimal getCalcualtedAmount() {
        return this.calcualtedAmount;
    }

    /**
     * Gets the <code>calculatedDays</code> property.
     * <p>
     * 
     * @return the current value of the <code>calculatedDays</code> property.
     */
    public Integer getCalculatedDays() {
        return this.calculatedDays;
    }

    /**
     * @return the cashCollectedForOtherCharges
     */
    public BigDecimal getCashCollectedForOtherCharges() {
        return this.cashCollectedForOtherCharges;
    }

    /**
     * @return the cashCollectedForWeightCharges
     */
    public BigDecimal getCashCollectedForWeightCharges() {
        return this.cashCollectedForWeightCharges;
    }

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
     * Gets the <code>checkNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>checkNumber</code> property.
     */
    public String getCheckNumber() {
        return this.checkNumber;
    }

    /**
     * Gets the <code>creditCardNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>creditCardNumber</code> property.
     */
    public String getCreditCardNumber() {
        return this.creditCardNumber;
    }

    /**
     * Gets the <code>cycleCount</code> property.
     * <p>
     * 
     * @return the current value of the <code>cycleCount</code> property.
     */
    public int getCycleCount() {
        return this.cycleCount;
    }

    /**
     * Gets the <code>freightPaymentDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>freightPaymentDto</code> property.
     */
    public FreightPaymentDto getFreightPaymentDto() {
        if (this.freightPaymentDto == null) {
            this.freightPaymentDto = new FreightPaymentDto();
        }
        return this.freightPaymentDto;
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
     * Gets the <code>invoiceNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>invoiceNumber</code> property.
     */
    public String getInvoiceNumber() {
        return this.invoiceNumber;
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
     * Gets the <code>mcoNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>mcoNumber</code> property.
     */
    public String getMcoNumber() {
        return this.mcoNumber;
    }

    /**
     * Gets the <code>number</code> property.
     * <p>
     * 
     * @return the current value of the <code>number</code> property.
     */
    public String getNumber() {
        return this.number;
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
     * @return the otherChargeAmount
     */
    public BigDecimal getOtherChargeAmount() {
        return this.otherChargeAmount;
    }

    /**
     * @return the otherChargeDue
     */
    public BigDecimal getOtherChargeDue() {
        return this.otherChargeDue;
    }

    /**
     * Gets the <code>paymentEntryDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>paymentEntryDto</code> property.
     */
    public PaymentEntryDto getPaymentEntryDto() {
        if (this.paymentEntryDto == null) {
            this.paymentEntryDto = new PaymentEntryDto();
        }
        return this.paymentEntryDto;
    }

    /**
     * Gets the <code>receiptNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>receiptNumber</code> property.
     */
    public String getReceiptNumber() {
        return this.receiptNumber;
    }

    /**
     * Gets the <code>signInStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>signInStation</code> property.
     */
    public String getSignInStation() {
        return this.signInStation;
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
     * Gets the <code>storageDays</code> property.
     * <p>
     * 
     * @return the current value of the <code>storageDays</code> property.
     */
    public Integer getStorageDays() {
        return this.storageDays;
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
     * Gets the <code>userName</code> property.
     * <p>
     * 
     * @return the current value of the <code>userName</code> property.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return the weightChargeDue
     */
    public BigDecimal getWeightChargeDue() {
        return this.weightChargeDue;
    }

    /**
     * Sets the <code>pStorageAmount</code> property.
     * <p>
     * 
     * @param pStorageAmount
     *            holds the new value of <code>storageAmount</code>.<br>
     */
    public void setCalcualtedAmount(final BigDecimal pCalcualtedAmount) {
        this.calcualtedAmount = pCalcualtedAmount;
    }

    /**
     * Sets the <code>pStorageAmount</code> property.
     * <p>
     * 
     * @param pStorageAmount
     *            holds the new value of <code>storageAmount</code>.<br>
     */
    public void setCalculatedDays(final Integer pCalculatedDays) {
        this.calculatedDays = pCalculatedDays;
    }

    /**
     * @param pCashCollectedForOtherCharges the cashCollectedForOtherCharges to set
     */
    public void setCashCollectedForOtherCharges(final BigDecimal pCashCollectedForOtherCharges) {
        this.cashCollectedForOtherCharges = pCashCollectedForOtherCharges;
    }

    /**
     * @param pCashCollectedForWeightCharges the cashCollectedForWeightCharges to set
     */
    public void setCashCollectedForWeightCharges(final BigDecimal pCashCollectedForWeightCharges) {
        this.cashCollectedForWeightCharges = pCashCollectedForWeightCharges;
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
     * Sets the <code>checkNumber</code> property.
     * <p>
     * 
     * @param pCheckNumber
     *            holds the new value of <code>checkNumber</code>.<br>
     */
    public void setCheckNumber(final String pCheckNumber) {
        this.checkNumber = pCheckNumber;
    }

    /**
     * Sets the <code>creditCardNumber</code> property.
     * <p>
     * 
     * @param pCreditCardNumber
     *            holds the new value of <code>creditCardNumber</code>.<br>
     */
    public void setCreditCardNumber(final String pCreditCardNumber) {
        this.creditCardNumber = pCreditCardNumber;
    }

    /**
     * Sets the <code>cycleCount</code> property.
     * <p>
     * 
     * @param pCycleCount
     *            holds the new value of <code>cycleCount</code>.<br>
     */
    public void setCycleCount(final int pCycleCount) {
        this.cycleCount = pCycleCount;
    }

    /**
     * Sets the <code>freightPaymentDto</code> property.
     * <p>
     * 
     * @param pFreightPaymentDto
     *            holds the new value of <code>freightPaymentDto</code>.<br>
     */
    public void setFreightPaymentDto(final FreightPaymentDto pFreightPaymentDto) {
        this.freightPaymentDto = pFreightPaymentDto;
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
     * Sets the <code>invoiceNumber</code> property.
     * <p>
     * 
     * @param pInvoiceNumber
     *            holds the new value of <code>invoiceNumber</code>.<br>
     */
    public void setInvoiceNumber(final String pInvoiceNumber) {
        this.invoiceNumber = pInvoiceNumber;
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
     * Sets the <code>mcoNumber</code> property.
     * <p>
     * 
     * @param pMcoNumber
     *            holds the new value of <code>mcoNumber</code>.<br>
     */
    public void setMcoNumber(final String pMcoNumber) {
        this.mcoNumber = pMcoNumber;
    }

    /**
     * Sets the <code>number</code> property.
     * <p>
     * 
     * @param pNumber
     *            holds the new value of <code>number</code>.<br>
     */
    public void setNumber(final String pNumber) {
        this.number = ContractUtility.convertToUpperCase(pNumber);
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
     * @param otherChargeAmount the otherChargeAmount to set
     */
    public void setOtherChargeAmount(final BigDecimal pOtherChargeAmount) {
        this.otherChargeAmount = pOtherChargeAmount;
    }

    /**
     * @param pOtherChargeDue the otherChargeDue to set
     */
    public void setOtherChargeDue(final BigDecimal pOtherChargeDue) {
        this.otherChargeDue = pOtherChargeDue;
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
     * Sets the <code>receiptNumber</code> property.
     * <p>
     * 
     * @param pReceiptNumber
     *            holds the new value of <code>receiptNumber</code>.<br>
     */
    public void setReceiptNumber(final String pReceiptNumber) {
        this.receiptNumber = pReceiptNumber;
    }

    /**
     * Sets the <code>signInStation</code> property.
     * <p>
     * 
     * @param pSignInStation
     *            holds the new value of <code>signInStation</code>.<br>
     */
    public void setSignInStation(final String pSignInStation) {
        this.signInStation = pSignInStation;
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
     * Sets the <code>pStorageAmount</code> property.
     * <p>
     * 
     * @param pStorageAmount
     *            holds the new value of <code>storageAmount</code>.<br>
     */
    public void setStorageDays(final Integer pStorageDays) {
        this.storageDays = pStorageDays;
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
     * Sets the <code>userName</code> property.
     * <p>
     * 
     * @param pUserName
     *            holds the new value of <code>userName</code>.<br>
     */
    public void setUserName(final String pUserName) {
        this.userName = pUserName;
    }

    /**
     * @param weightChargeDue the weightChargeDue to set
     */
    public void setWeightChargeDue(final BigDecimal pWeightChargeDue) {
        this.weightChargeDue = pWeightChargeDue;
    }

	/**
	 * @return the cashDrawerTransactionType
	 */
	public CashDrawerTransactionType getCashDrawerTransactionType() {
		return cashDrawerTransactionType;
	}

	/**
	 * @param cashDrawerTransactionType the cashDrawerTransactionType to set
	 */
	public void setCashDrawerTransactionType(CashDrawerTransactionType cashDrawerTransactionType) {
		this.cashDrawerTransactionType = cashDrawerTransactionType;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

}
