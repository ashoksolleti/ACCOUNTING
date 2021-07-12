package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.CreditCardType;
import com.unisys.trans.logistics.lms.framework.constants.PaymentMethodType;
import com.unisys.trans.logistics.lms.framework.constants.PaymentType;
import com.unisys.trans.logistics.lms.framework.dto.constants.FinalStatusType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class PaymentEntryDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7352181783346556957L;

    /**
     * Attribute to hold the <code>agent</code> property.
     */
    private String agent;

    /**
     * Attribute to hold the <code>amount</code> property.
     */
    private BigDecimal amount;

    /**
     * Attribute to hold the <code>authorizationCode</code> property.
     */
    private String authorizationCode;

    /**
     * Attribute to hold the <code>ccCode</code> property.
     */
    private CreditCardType ccCode;

    /**
     * Attribute to hold the <code>currency</code> property.
     */
    private String currency;

    /**
     * Attribute to hold the <code>creditCardCode</code> property.
     */
    private String creditCardCode;

    /**
     * Attribute to hold the <code>finalStatus</code> property.
     */
    private FinalStatusType finalStatus;

    /**
     * @return the drawerName
     */
    public String getDrawerName() {
        return this.drawerName;
    }

    /**
     * @param pDrawerName the drawerName to set
     */
    public void setDrawerName(final String pDrawerName) {
        this.drawerName = pDrawerName;
    }

    /**
     * Attribute to hold the <code>drawer</code> property.
     */
    private String drawerName;

    /**
     * Attribute to hold the <code>expirationDate</code> property.
     */
    private String expirationDate;

    /**
     * Attribute to hold the <code>cardNumber</code> property.
     */
    private String maskedNumber;

    /**
     * Attribute to hold the <code>lastFourDigits</code> property.
     */
    private String lastFourDigits;

    /**
     * Attribute to hold the <code>date</code> property.
     */
    private Date paymentDate;

    /**
     * Attribute to hold the <code>paymentMethod</code> property.
     */
    private PaymentMethodType paymentMethodType;

    /**
     * Attribute to hold the <code>time</code> property.
     */
    private String paymentTime;

    /**
     * Attribute to hold the <code>paymentType</code> property.
     */
    private PaymentType paymentType;

    /**
     * Attribute to hold the <code>remarks</code> property.
     */
    private String remarks;

    /**
     * Attribute to hold the <code>voucher</code> property.
     */
    private String voucher;

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
     * Gets the <code>authorizationCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>authorizationCode</code> property.
     */
    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    /**
     * Gets the <code>ccCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>ccCode</code> property.
     */
    public CreditCardType getCcCode() {
        return this.ccCode;
    }

    /**
     * Gets the <code>currency</code> property.
     * <p>
     * 
     * @return the current value of the <code>currency</code> property.
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Gets the <code>expirationDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>expirationDate</code> property.
     */
    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * Gets the <code>maskedNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>maskedNumber</code> property.
     */

    public String getMaskedNumber() {
        return this.maskedNumber;
    }

    /**
     * Gets the <code>date</code> property.
     * <p>
     * 
     * @return the current value of the <code>date</code> property.
     */
    public Date getPaymentDate() {
        return ContractUtility.getClonedDate(this.paymentDate);
    }

    /**
     * Gets the <code>paymentMethodType</code> property.
     * <p>
     * 
     * @return the current value of the <code>paymentMethodType</code> property.
     */
    public PaymentMethodType getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /**
     * Gets the <code>time</code> property.
     * <p>
     * 
     * @return the current value of the <code>time</code> property.
     */
    public String getPaymentTime() {
        return this.paymentTime;
    }

    /**
     * Gets the <code>paymentType</code> property.
     * <p>
     * 
     * @return the current value of the <code>paymentType</code> property.
     */
    public PaymentType getPaymentType() {
        return this.paymentType;
    }

    /**
     * Gets the <code>currency</code> property.
     * <p>
     * 
     * @return the current value of the <code>currency</code> property.
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Gets the <code>voucher</code> property.
     * <p>
     * 
     * @return the current value of the <code>voucher</code> property.
     */
    public String getVoucher() {
        return this.voucher;
    }

    /**
     * Sets the <code>agent</code> property.
     * <p>
     * 
     * @param pAgent
     *            holds the new value of <code>agent</code>.<br>
     */
    public void setAgent(final String pAgent) {
        this.agent = pAgent;
    }

    /**
     * Sets the <code>amount</code> property.
     * <p>
     * 
     * @param pAmount
     *            holds the new value of <code>amount</code>.<br>
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    /**
     * Sets the <code>authorizationCode</code> property.
     * <p>
     * 
     * @param pAuthorizationCode
     *            holds the new value of <code>authorizationCode</code>.<br>
     */
    public void setAuthorizationCode(final String pAuthorizationCode) {
        this.authorizationCode = pAuthorizationCode;
    }

    /**
     * Sets the <code>ccCode</code> property.
     * <p>
     * 
     * @param pCcCode
     *            holds the new value of <code>ccCode</code>.<br>
     */
    public void setCcCode(final CreditCardType pCcCode) {
        this.ccCode = pCcCode;

    }

    /**
     * Sets the <code>currency</code> property.
     * <p>
     * 
     * @param pCurrency
     *            holds the new value of <code>currency</code>.<br>
     */
    public void setCurrency(final String pCurrency) {
        this.currency = pCurrency;
    }

    /**
     * @param drawer the drawer to set
     */
    public void setExpirationDate(final String pExpirationDate) {
        this.expirationDate = pExpirationDate;
    }

    /**
     * Sets the <code>maskedNumber</code> property.
     * <p>
     * 
     * @param pMaskedNumber
     *            holds the new value of <code>maskedNumber</code>.<br>
     */

    public void setMaskedNumber(final String pMaskedNumber) {
        this.maskedNumber = pMaskedNumber;
    }

    /**
     * Sets the <code>paymentDate</code> property.
     * <p>
     * 
     * @param pPaymentDate
     *            holds the new value of <code>paymentDate</code>.<br>
     */
    public void setPaymentDate(final Date pPaymentDate) {
        this.paymentDate = ContractUtility.getClonedDate(pPaymentDate);
    }

    /**
     * Sets the <code>paymentMethodType</code> property.
     * <p>
     * 
     * @param pPaymentMethodType
     *            holds the new value of <code>paymentMethodType</code>.<br>
     */
    public void setPaymentMethodType(final PaymentMethodType pPaymentMethodType) {
        this.paymentMethodType = pPaymentMethodType;
    }

    /**
     * Sets the <code>paymentTime</code> property.
     * <p>
     * 
     * @param pPaymentTime
     *            holds the new value of <code>paymentTime</code>.<br>
     */
    public void setPaymentTime(final String pPaymentTime) {
        this.paymentTime = pPaymentTime;
    }

    /**
     * Sets the <code>paymentType</code> property.
     * <p>
     * 
     * @param pPaymentType
     *            holds the new value of <code>paymentType</code>.<br>
     */
    public void setPaymentType(final PaymentType pPaymentType) {
        this.paymentType = pPaymentType;
    }

    /**
     * Sets the <code>remarks</code> property.
     * <p>
     * 
     * @param pRemarks
     *            holds the new value of <code>remarks</code>.<br>
     */
    public void setRemarks(final String pRemarks) {
        this.remarks = pRemarks;
    }

    /**
     * Sets the <code>voucher</code> property.
     * <p>
     * 
     * @param pVoucher
     *            holds the new value of <code>voucher</code>.<br>
     */
    public void setVoucher(final String pVoucher) {
        this.voucher = pVoucher;
    }

    /**
     * Gets the <code>lastFourDigits</code> property.
     * 
     * @return the current value of the <code>lastFourDigits</code> property.
     */
    public String getLastFourDigits() {
        return this.lastFourDigits;
    }

    /**
     * Sets the <code>lastFourDigits</code> property.
     * <p>
     * 
     * @param pLastFourDigits
     *            holds the new value of <code>lastFourDigits</code>.<br>
     */
    public void setLastFourDigits(final String pLastFourDigits) {
        this.lastFourDigits = pLastFourDigits;
    }

    /**
     * Gets the <code>creditCardCode</code> property.
     * 
     * @return the current value of the <code>creditCardCode</code> property.
     */
    public String getCreditCardCode() {
        return this.creditCardCode;
    }

    /**
     * Sets the <code>creditCardCode</code> property.
     * <p>
     * 
     * @param pCreditCardCode
     *            holds the new value of <code>creditCardCode</code>.<br>
     */
    public void setCreditCardCode(final String pCreditCardCode) {
        this.creditCardCode = pCreditCardCode;
    }

    /**
     * Gets the <code>finalStatus</code> property.
     * 
     * @return the current value of the <code>finalStatus</code> property.
     */
    public FinalStatusType getFinalStatus() {
        return this.finalStatus;
    }

    /**
     * Sets the <code>finalStatus</code> property.
     * <p>
     * 
     * @param pFinalStatus
     *            holds the new value of <code>finalStatus</code>.<br>
     */
    public void setFinalStatus(final FinalStatusType pFinalStatus) {
        this.finalStatus = pFinalStatus;
    }

}
