/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
public class ParticipantHistoryAccountDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 1014215197059381389L;

    /**
     * Attribute to hold <code>oId</code> property. Unique key reference for participant entity.
     */
    private Long oId;

    /**
     * Attribute to hold <code>billingAccountNumber1</code> property. Only users with special privileges can
     * update this field.
     */
    private String billingAccountNumber1;

    /**
     * Attribute to hold <code>billingAccountNumber2</code> property. Only users with special privileges can
     * update this field.
     */
    private String billingAccountNumber2;

    private String accountNumberForCGCP;

    /**
     * Attribute to hold <code>iataAccountNumber</code> property. Only users with a special privilege can
     * update this field.
     */
    private String iataAccountNumber;

    /**
     * Attribute to hold <code>billToAccount</code> property of the participant being billed. Only users with
     * special privilege can update this field.
     */
    private String billToAccount;

    /**
     * Attribute to hold <code>frequentFlyerNumber</code> property.
     */
    private String frequentFlyerNumber;

    /*
     * Attribute to hold <code>contractAllowedIndicator</code> property. Flag to
     * indicate that contract exist for this participant.
     */
    private Boolean contractAllowedIndicator;

    private String contractAccountNumber1;

    private String contractAccountNumber2;

    private String contractAccountNumber3;

    private String seguroNumber;

    private String smiles;

    private String segurocomprehenia;

    private String accountName;

    private Date transistionEffectiveDate;
    
    private String loyaltyId;
    
    private Boolean addBilltoShipper;

    /**
     * @return the contractAccountNumber1
     */
    public String getContractAccountNumber1() {
        return this.contractAccountNumber1;
    }

    public String getLoyaltyId() {
		return loyaltyId;
	}
	public void setLoyaltyId(final String loyaltyId) {
		this.loyaltyId = loyaltyId;
	}
    /**
     * @param pContractAccountNumber1 the contractAccountNumber1 to set
     */
    public void setContractAccountNumber1(String pContractAccountNumber1) {
        this.contractAccountNumber1 = pContractAccountNumber1;
    }

    /**
     * @return the contractAccountNumber2
     */
    public String getContractAccountNumber2() {
        return this.contractAccountNumber2;
    }

    /**
     * @param pContractAccountNumber2 the contractAccountNumber2 to set
     */
    public void setContractAccountNumber2(String pContractAccountNumber2) {
        this.contractAccountNumber2 = pContractAccountNumber2;
    }

    /**
     * @return the contractAccountNumber3
     */
    public String getContractAccountNumber3() {
        return this.contractAccountNumber3;
    }

    /**
     * @param pContractAccountNumber3 the contractAccountNumber3 to set
     */
    public void setContractAccountNumber3(String pContractAccountNumber3) {
        this.contractAccountNumber3 = pContractAccountNumber3;
    }

    /**
     * @return the seguroNumber
     */
    public String getSeguroNumber() {
        return this.seguroNumber;
    }

    /**
     * @param pSeguroNumber the seguroNumber to set
     */
    public void setSeguroNumber(String pSeguroNumber) {
        this.seguroNumber = pSeguroNumber;
    }

    /**
     * @return the smiles
     */
    public String getSmiles() {
        return this.smiles;
    }

    /**
     * @param pSmiles the smiles to set
     */
    public void setSmiles(String pSmiles) {
        this.smiles = pSmiles;
    }

    /**
     * @return the segurocomprehenia
     */
    public String getSegurocomprehenia() {
        return this.segurocomprehenia;
    }

    /**
     * @param pSegurocomprehenia the segurocomprehenia to set
     */
    public void setSegurocomprehenia(String pSegurocomprehenia) {
        this.segurocomprehenia = pSegurocomprehenia;
    }

    /**
     * @return the accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @param pAccountName the accountName to set
     */
    public void setAccountName(String pAccountName) {
        this.accountName = pAccountName;
    }

    /**
     * @return the transistionEffectiveDate
     */
    public Date getTransistionEffectiveDate() {
        return this.transistionEffectiveDate;
    }

    /**
     * @param pTransistionEffectiveDate the transistionEffectiveDate to set
     */
    public void setTransistionEffectiveDate(Date pTransistionEffectiveDate) {
        this.transistionEffectiveDate = pTransistionEffectiveDate;
    }

    private String billingAccountType1;

    private String billingAccountType2;

    private List<BrokerDto> brokers = new ArrayList<BrokerDto>();

    /**
     * Gets the value of the <code>frequentFlyerNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 11 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * AA123456782
     * <p>
     * 
     * @return <code>String</code><br>
     *         the current value of <code>frequentFlyerNumber</code> property.<br>
     */
    public String getFrequentFlyerNumber() {
        return this.frequentFlyerNumber;
    }

    /**
     * Sets the <code>frequentFlyerNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 11 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * AA123456782
     * <p>
     * 
     * @param pFrequentFlyerNumber the new value of <code>frequentFlyerNumber</code> property.<br>
     */
    public void setFrequentFlyerNumber(final String pFrequentFlyerNumber) {
        this.frequentFlyerNumber = pFrequentFlyerNumber;
    }

    /**
     * Attribute to hold <code>vatNumber</code> property.
     */
    private String vatNumber;

    /**
     * Gets the <code>vatNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * VATIDENT123
     * <p>
     * 
     * @return the current value of <code>vatNumber</code> property.<br>
     */
    public String getVatNumber() {
        return this.vatNumber;
    }

    /**
     * Sets the <code>vatNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * VATIDENT123
     * <p>
     * 
     * @param pVatNumber the new value of <code>vatNumber</code> property.
     */
    public void setVatNumber(final String pVatNumber) {
        this.vatNumber = pVatNumber;
    }

    /**
     * Gets the <code>billToAccount</code> property.
     * <p>
     * The account number of the participant being Billed.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Character set for alphabet, number, hyphen, dot and space.<br>
     * <p>
     * <b>Example: </b><br>
     * 123456
     * 
     * @return the current value of <code>billToAccount</code> property.<br>
     */
    public String getBillToAccount() {
        return this.billToAccount;
    }

    /**
     * Sets the <code>billToAccount</code> property.
     * <p>
     * The account number of the participant being Billed.
     * <p>
     * <b>Format: </b><br>
     * 1-14, Character set for alphabet, number, hyphen, dot and space.<br>
     * <p>
     * <b>Example: </b><br>
     * 123456 ,p>
     * <p>
     * 
     * @param pBillToAccount the new value of <code>billToAccount</code> property.<br>
     */
    public void setBillToAccount(final String pBillToAccount) {
        this.billToAccount = pBillToAccount;
    }

    /**
     * Gets the <code>iataAccountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2n-1n 4n/4n ,Character set for alphabet, number, hyphen, dot, slash and space<br>
     * <p>
     * <b>Example: </b><br>
     * 33-5 1595/1232
     * 
     * @return the current value of <code>iataAccountNumber</code> property.<br>
     */
    public String getIataAccountNumber() {
        return this.iataAccountNumber;
    }

    /**
     * Sets the <code>iataAccountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2n-1n 4n/4n ,Character set for alphabet, number, hyphen, dot, slash and space<br>
     * <p>
     * <b>Example: </b><br>
     * 33-5 1595/1232
     * <p>
     * 
     * @param pIataAccountNumber the new value of <code>iataAccountNumber</code> property.<br>
     */
    public void setIataAccountNumber(final String pIataAccountNumber) {
        this.iataAccountNumber = pIataAccountNumber;
    }

    /**
     * Gets the <code>billingAccountNumber2</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * 1111234
     * <p>
     * 
     * @return the current value of <code>billingAccountNumber2</code> property.<br>
     */
    public String getBillingAccountNumber2() {
        return this.billingAccountNumber2;
    }

    /**
     * Sets the <code>billingAccountNumber2</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * 1111234
     * <p>
     * 
     * @param pBillingAccountNumber2 the new value of <code>billingAccountNumber2</code> property.<br>
     */
    public void setBillingAccountNumber2(final String pBillingAccountNumber2) {
        this.billingAccountNumber2 = ContractUtility.convertToUpperCase(pBillingAccountNumber2);
    }

    /**
     * Gets the <code>billingAccountNumber1</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * 123456
     * <p>
     * 
     * @return the current value of <code>billingAccountNumber1</code> property.<br>
     */
    public String getBillingAccountNumber1() {
        return this.billingAccountNumber1;
    }

    /**
     * Sets the <code>billingAccountNumber2</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * 1111234
     * <p>
     * 
     * @param pBillingAccountNumber2 the new value of <code>billingAccountNumber2</code> property.<br>
     */
    public void setBillingAccountNumber1(final String pBillingAccountNumber1) {
        this.billingAccountNumber1 = ContractUtility.convertToUpperCase(pBillingAccountNumber1);
    }

    /**
     * Gets the <code>oid</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * @return the oId
     */
    public Long getoId() {
        return this.oId;
    }

    /**
     * @param pOId the oId to set
     */
    public void setoId(Long pOId) {
        this.oId = pOId;
    }

    /**
     * Gets the broker data transfer object.
     * <p>
     * 
     * @return the current value of broker data transfer object.<br>
     */

    public List<BrokerDto> getBrokers() {
        return this.brokers;
    }

    /**
     * Sets the broker data transfer object.
     * <p>
     * 
     * @param pBrokerDtos the new value of broker data transfer object<br>
     */

    public void setBrokers(final List<BrokerDto> pBrokerDtos) {
        this.brokers = pBrokerDtos;
    }

    /**
     * @return the contractAllowedIndicator
     */
    public Boolean getContractAllowedIndicator() {
        return contractAllowedIndicator;
    }

    /**
     * @param contractAllowedIndicator the contractAllowedIndicator to set
     */
    public void setContractAllowedIndicator(Boolean contractAllowedIndicator) {
        this.contractAllowedIndicator = contractAllowedIndicator;
    }

    /**
     * @return the billingAccountType1
     */
    public String getBillingAccountType1() {
        return billingAccountType1;
    }

    /**
     * @param billingAccountType1 the billingAccountType1 to set
     */
    public void setBillingAccountType1(String billingAccountType1) {
        this.billingAccountType1 = billingAccountType1;
    }

    /**
     * @return the billingAccountType2
     */
    public String getBillingAccountType2() {
        return billingAccountType2;
    }

    /**
     * @param billingAccountType2 the billingAccountType2 to set
     */
    public void setBillingAccountType2(String billingAccountType2) {
        this.billingAccountType2 = billingAccountType2;
    }

    /**
     * @return the accountNumberForCGCP
     */
    public String getAccountNumberForCGCP() {
        return accountNumberForCGCP;
    }

    /**
     * @param accountNumberForCGCP the accountNumberForCGCP to set
     */
    public void setAccountNumberForCGCP(String accountNumberForCGCP) {
        this.accountNumberForCGCP = accountNumberForCGCP;
    }

    /**
     * @return the addBilltoShipper
     */
    public Boolean getAddBilltoShipper() {
        return addBilltoShipper;
    }

    /**
     * @param addBilltoShipper the addBilltoShipper to set
     */
    public void setAddBilltoShipper(Boolean addBilltoShipper) {
        this.addBilltoShipper = addBilltoShipper;
    }

}
