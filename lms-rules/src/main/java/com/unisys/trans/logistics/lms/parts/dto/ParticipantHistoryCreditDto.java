/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ParticipantDto</code> contains general participant details.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * 
 * </ul>
 * </code>
 */
public class ParticipantHistoryCreditDto extends PersistenceObjectDto {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1014215197059381389L;
    /**
     * Attribute to hold <code>oId</code> property. Unique key reference for participant entity.
     */
    private Long oId;
    /**
     * Attribute to hold <code>paymentMethod</code> property. It denotes the method of payment of accumulated
     * charges against shipments.
     */
    private String paymentMethod;
    /**
     * Attribute to hold <code>creditRate</code> property. Only users with special privilege can update this
     * field.
     */
    private String creditRate;
    /**
     * Attribute to hold <code>availableCredit</code> property. Mandatory for Carrier Billing or Demand
     * Billing Method of payments. Prohibited for other methods of payments (Cash, Check, Credit Payment).
     * Only users with a special privilege can update this field.
     */
    private BigDecimal availableCredit;
    
    /**
     * Attribute to hold <code>hardOrSoftCreditLimitIndicator</code> property. When a participant has a hard
     * credit limit, an air waybill must be cashed even after the available credit amount has fallen to a
     * level that does not cover the credit amount on an air waybill. When a participant has a soft credit
     * limit, the air waybill is still allowed to be credited but a message is sent to the central authority
     * participants queue to inform Accounting that the soft credit limit has been exceeded.
     */
    private Boolean hardOrSoftCreditLimitIndicator;
    
    /**
     * Attribute to hold <code>cashCreditStatus</code> property of the participant.
     */
    private String cashCreditStatus;
    /**
     * Attribute to hold <code>creditLimit</code> property. Based on system parameter (C$CRED - in LMS), limit
     * is specified as Limit per shipment or for total shipments.
     */
    private Long creditLimit;
    
    /**
     * Attribute to hold <code>currencyCode</code> property. Currency corresponding to the Credit limit.
     * Mandatory if credit limit field is present, else protected. Only users with special privileges can
     * update this field. The currency code is validated against the currency table.
     */
    private String currencyCode;
    
    //MH021 APS Limit changes
    private  String apsDailyLimit;
    
    private String apsLimitCurrency;
    
    private Boolean apsNoDailyLimit;
    
    private String wareHouseCreditLimit;
    
    private String wareHouseCreditStart;
    
    private String wareHouseCreditAvailable;
    /**
     * Gets the <code>currencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of <code>currencyCode</code> property.<br>
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }
    /**
     * Gets the <code>creditLimit</code> property.
     * <p>
     * Limit specified as Limit per shipment or for total shipments. Mandatory if Payment method is Carrier
     * Billing or Demand Billing. Prohibited for other Payment methods.
     * <p>
     * <b>Format: </b><br>
     * 1-10 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @return the current value of <code>creditLimit</code> property.<br>
     */
    public Long getCreditLimit() {
        return this.creditLimit;
    }
    /**
     * Sets the <code>creditLimit</code> property.
     * <p>
     * Limit specified as Limit per shipment or for total shipments. Mandatory if Payment method is Carrier
     * Billing or Demand Billing. Prohibited for other Payment methods.
     * <p>
     * <b>Format: </b><br>
     * 1-10 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @param pCreditLimit the new value of <code>creditLimit</code> property.<br>
     */
    public void setCreditLimit(final Long pCreditLimit) {
        this.creditLimit = pCreditLimit;
    }
    
    /**
     * Sets the <code>currencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @param pCurrencyCode the new value of <code>currencyCode</code> property.<br>
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = ContractUtility.convertToUpperCase(pCurrencyCode);
    }
    
    /**
     * Gets the <code>cashCreditStatus</code> property.
     * <p>
     * System returns the credit status based on the following condition: <br>
     * <li>if participant limit is zero and participant has associated
     * <code>{@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#getBillToAccount billToAccount}</code>:
     * <ul>
     * <li>if the limit of the
     * <code>{@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#getBillToAccount billToAccount}</code>
     * is zero , then system returns
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.ParticipantConstants#CREDIT_STATUS_CASH  CREDIT_STATUS_CASH}</code>
     * .<br>
     * <li>if the limit of the
     * <code>{@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#getBillToAccount billToAccount}</code>
     * is greater than zero then system returns
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.ParticipantConstants#CREDIT_STATUS_CREDIT CREDIT_STATUS_CREDIT}</code>
     * .<br>
     * </ul>
     * <li>if participant limit is zero and participant has not associated 'Bill To' then system returns
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.ParticipantConstants#CREDIT_STATUS_CASH CREDIT_STATUS_CASH}</code>
     * <br>
     * .
     * <li>if participant limit is not zero then system returns the limit of the participant.
     * <p>
     * 
     * @return the current value of <code>cashCreditStatus</code> property.<br>
     */
    public String getCashCreditStatus() {
        return this.cashCreditStatus;
    }
    
    /**
     * Sets the <code>cashCreditStatus</code> property.
     * <p>
     * System returns the credit status based on the following condition: <br>
     * <li>if participant limit is zero and participant has associated
     * <code>{@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#getBillToAccount billToAccount}</code>:
     * <ul>
     * <li>if the limit of the
     * <code>{@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#getBillToAccount billToAccount}</code>
     * is zero , then system returns
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.ParticipantConstants#CREDIT_STATUS_CASH  CREDIT_STATUS_CASH}</code>
     * .<br>
     * <li>if the limit of the
     * <code>{@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#getBillToAccount billToAccount}</code>
     * is greater than zero then system returns
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.ParticipantConstants#CREDIT_STATUS_CREDIT CREDIT_STATUS_CREDIT}</code>
     * .<br>
     * </ul>
     * <li>if participant limit is zero and participant has not associated 'Bill To' then system returns
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.ParticipantConstants#CREDIT_STATUS_CASH CREDIT_STATUS_CASH}</code>
     * <br>
     * .
     * <li>if participant limit is not zero then system returns the limit of the participant.
     * <p>
     * 
     * @param pCashCreditStatus the new value of <code>cashCreditStatus</code> property.
     */
    public void setCashCreditStatus(final String pCashCreditStatus) {
        this.cashCreditStatus = pCashCreditStatus;
    }
    
    /**
     * Gets the <code>hardOrSoftCreditLimitIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code><li>True</code><br>
     * Hard credit limit. <code><li>False</code><br>
     * Soft credit limit<br>
     * <p>
     * 
     * @return the current value of <code>hardOrSoftCreditLimitIndicator</code> property.
     */
    public Boolean getHardOrSoftCreditLimitIndicator() {
        return this.hardOrSoftCreditLimitIndicator;
    }
    
    /**
     * Sets the <code>hardOrSoftCreditLimitIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * Hard credit limit
     * <li><code>false</code><br>
     * Soft credit limit
     * <p>
     * 
     * @param pHardOrSoftCreditLimitIndicator the new value of <code>hardOrSoftCreditLimitIndicator</code>
     *            property.<bR>
     */
    public void setHardOrSoftCreditLimitIndicator(final Boolean pHardOrSoftCreditLimitIndicator) {
        this.hardOrSoftCreditLimitIndicator = pHardOrSoftCreditLimitIndicator;
    }
    /**
     * Gets the <code>availableCredit</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12p Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 100.01
     * <p>
     * 
     * @return the current value of <code>availableCredit</code> property.<br>
     */
    public BigDecimal getAvailableCredit() {
        return this.availableCredit;
    }
    /**
     * Sets the <code>availableCredit</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12p Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 100.01
     * <p>
     * 
     * @param pAvailableCredit the new value of <code>availableCredit</code> property.<br>
     */
    public void setAvailableCredit(final BigDecimal pAvailableCredit) {
        this.availableCredit = pAvailableCredit;
    }
    /**
     * Gets the <code>creditRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * B
     * <p>
     * 
     * @return the current value of <code>creditRate</code> property.<br>
     */
    public String getCreditRate() {
        return this.creditRate;
    }
    /**
     * Sets the <code>creditRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * B
     * <p>
     * 
     * @param pCreditRate the new value of <code>creditRate</code> property.<br>
     */
    public void setCreditRate(final String pCreditRate) {
        this.creditRate = ContractUtility.convertToUpperCase(pCreditRate);
    }
    /**
     * Gets the <code>paymentMethod</code> property.
     * <p>
     * The indicators that denote the method of payment of accumulated charges against shipments.
     * <p>
     * <b> Possible values :</b><br>
     * <li>G – Check
     * <li>C – Credit Card
     * <li>B – Carrier Billing
     * <li>D – Demand Billing
     * <li>Blank – Cash.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * G – Check
     * <p>
     * 
     * @return the current value of <code>paymentMethod</code> property.<br>
     */
    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    /**
     * Sets the <code>paymentMethod</code> property.
     * <p>
     * The indicators that denote the method of payment of accumulated charges against shipments.
     * <p>
     * <b> Possible values :</b><br>
     * <li>G – Check
     * <li>C – Credit Card
     * <li>B – Carrier Billing
     * <li>D – Demand Billing
     * <li>Blank – Cash.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * G – Check.<br>
     * <p>
     * 
     * @param pPaymentMethod the new value of <code>paymentMethod</code> property.<br>
     */
    public void setPaymentMethod(final String pPaymentMethod) {
        this.paymentMethod = ContractUtility.convertToUpperCase(pPaymentMethod);
    }

    

    /**
     * @param pOId the oId to set
     */
    public void setoId(Long pOId) {
        this.oId = pOId;
    }
    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return this.oId;
    }
	/**
	 * @return the apsDailyLimit
	 */
	public String getApsDailyLimit() {
		return apsDailyLimit;
	}
	/**
	 * @param apsDailyLimit the apsDailyLimit to set
	 */
	public void setApsDailyLimit(String apsDailyLimit) {
		this.apsDailyLimit = apsDailyLimit;
	}
	/**
	 * @return the apsLimitCurrency
	 */
	public String getApsLimitCurrency() {
		return apsLimitCurrency;
	}
	/**
	 * @param apsLimitCurrency the apsLimitCurrency to set
	 */
	public void setApsLimitCurrency(String apsLimitCurrency) {
		this.apsLimitCurrency = apsLimitCurrency;
	}
	/**
	 * @return the apsNoDailyLimit
	 */
	public Boolean getApsNoDailyLimit() {
		return apsNoDailyLimit;
	}
	/**
	 * @param apsNoDailyLimit the apsNoDailyLimit to set
	 */
	public void setApsNoDailyLimit(final Boolean apsNoDailyLimit) {
		this.apsNoDailyLimit = apsNoDailyLimit;
	}
	public String getWareHouseCreditLimit() {
		return wareHouseCreditLimit;
	}
	public void setWareHouseCreditLimit(String wareHouseCreditLimit) {
		this.wareHouseCreditLimit = wareHouseCreditLimit;
	}
	public String getWareHouseCreditStart() {
		return wareHouseCreditStart;
	}
	public void setWareHouseCreditStart(String wareHouseCreditStart) {
		this.wareHouseCreditStart = wareHouseCreditStart;
	}
	public String getWareHouseCreditAvailable() {
		return wareHouseCreditAvailable;
	}
	public void setWareHouseCreditAvailable(String wareHouseCreditAvailable) {
		this.wareHouseCreditAvailable = wareHouseCreditAvailable;
	}
	


   
   
   
}
