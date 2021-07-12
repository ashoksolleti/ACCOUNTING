/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <code>FreightDetailDto</code> contains the freight detail information details.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>accountingRemarks
 * <li>availableCredit
 * <li>billToAccount
 * <li>consigneeRemarks
 * <li>creditLimit
 * <li>creditRate
 * <li>currencyCode
 * <li>frequentFlyerNumber
 * <li>hardOrSoftCreditLimitIndicator
 * <li>iataAccountNumber
 * <li>notificationStatusCode
 * <li>notifyMethod
 * <li>oId
 * <li>participantRemarks
 * <li>paymentMethod
 * <li>brokers
 * <li>creditInformations
 * <li>bondedPremises
 * <li>freightAttributesDto
 * <li>freightAdditionalDto
 * <li>freightStatisticsDto
 * </ul>
 * </code>
 */
public class FreightDetailDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6718926818774641136L;

    /**
     * Attribute to hold <code>accountingRemarks</code> property. The remarks are sent as queue to agents with
     * special privileges. This attribute is used to communicate to the special agent on updating the
     * accounting fields by agents without special privileges.
     */
    private String accountingRemarks;

    /**
     * Attribute to hold <code>availableCredit</code> property. Mandatory for Carrier Billing or Demand
     * Billing Method of payments. Prohibited for other methods of payments (Cash, Check, Credit Payment).
     * Only users with a special privilege can update this field.
     */
    private BigDecimal availableCredit;

    /**
     * Attribute to hold <code>billToAccount</code> property of the participant being billed. Only users with
     * special privilege can update this field.
     */
    private String billToAccount;

    /**
     * Attribute to hold <code>bondedPremises</code> property.
     */
    private List<BondedPremiseDto> bondedPremises = new ArrayList<BondedPremiseDto>();

    /**
     * Attribute to hold <code>brokers</code> property.
     */
    private List<BrokerDto> brokers = new ArrayList<BrokerDto>();
    /**
     * Attribute to hold <code>contractAccountNumber</code> property.
     */
    
    private String contractAccountNumber1;
    
    
    private String contractAccountNumber2;
    
    private String contractAccountNumber3;
    
    private String seguroNumber;
    
    private String smiles;
    
    private String segurocomprehenia;
    
    private String accountName;
    
    private String dailyCreditLimitForCR;
    
    private String CurrentAvailableCreditForCR;
    
    private String TimeOfDayToResetCRAmt;
    
    private Date DateLastCRAvailUpdate;
    
    private String TimeLastCRAvailUpdate;
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
     * @return the accountNumberForCGCP
     */
    public String getAccountNumberForCGCP() {
        return this.accountNumberForCGCP;
    }

    /**
     * @param pAccountNumberForCGCP the accountNumberForCGCP to set
     */
    public void setAccountNumberForCGCP(String pAccountNumberForCGCP) {
        this.accountNumberForCGCP = pAccountNumberForCGCP;
    }

    private String accountNumberForCGCP;
    
    
    private Date transistionEffectiveDate;
    
    
    /**
     * Attribute to hold <code>cashCreditStatus</code> property of the participant.
     */
    private String cashCreditStatus;

    /**
     * Attribute to hold <code>consigneeRemarks</code> to be associated with the Air Waybill if the
     * participant is associated with the Air Waybill as Consignee. These remarks are shown on the Handling
     * information of Hard copy of the Air Waybill when printed.
     */
    private String consigneeRemarks;

    /**
     * Attribute to hold <code>creditInformations</code> property.
     */
    private List<CreditInformationDto> creditInformations = new ArrayList<CreditInformationDto>();

    /**
     * Attribute to hold <code>creditLimit</code> property. Based on system parameter (C$CRED - in LMS), limit
     * is specified as Limit per shipment or for total shipments.
     */
    private Long creditLimit;
    
    //MH021 APS Limit Changes
    private String apsDailyLimit;
    
    private String apsLimitCurrency;
    
    private Boolean apsNoDailyLimit;

    /**
     * Attribute to hold <code>creditRate</code> property. Only users with special privilege can update this
     * field.
     */
    private String creditRate;

    /**
     * Attribute to hold <code>currencyCode</code> property. Currency corresponding to the Credit limit.
     * Mandatory if credit limit field is present, else protected. Only users with special privileges can
     * update this field. The currency code is validated against the currency table.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>freightAdditional</code> property.
     */
    private FreightAdditionalDto freightAdditional;

    /**
     * Attribute to hold <code>freightAttributes</code> property.
     */
    private FreightAttributesDto freightAttributes;

    /**
     * Attribute to hold <code>freightStatistics</code> property.
     */
    private FreightStatisticsDto freightStatistics;

    /**
     * Attribute to hold <code>frequentFlyerNumber</code> property.
     */
    private String frequentFlyerNumber;
    private String loyaltyId;

    /**
     * Attribute to hold <code>hardOrSoftCreditLimitIndicator</code> property. When a participant has a hard
     * credit limit, an air waybill must be cashed even after the available credit amount has fallen to a
     * level that does not cover the credit amount on an air waybill. When a participant has a soft credit
     * limit, the air waybill is still allowed to be credited but a message is sent to the central authority
     * participants queue to inform Accounting that the soft credit limit has been exceeded.
     */
    private Boolean hardOrSoftCreditLimitIndicator;

    /**
     * Attribute to hold <code>iataAccountNumber</code> property. Only users with a special privilege can
     * update this field.
     */
    private String iataAccountNumber;

    /**
     * Attribute to hold <code>notificationStatusCode</code> property. It holds the notification information
     * when the participant is the consignee for a shipment that arrived at its destination. This is used when
     * a participant is associated with Air Waybill in the form of a Consignee or Broker.
     */
    private String notificationStatusCode;

    /**
     * Attribute to hold <code>notifyMethod</code> property. Method of notification. Prohibited if
     * NotificationStatusCode field is blank; mandatory if Notify field is non blank.
     */
    private String notifyMethod;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>participantRemarks</code> property. It indicates the general remark about the
     * participant.
     */
    private String participantRemarks;

    /**
     * Attribute to hold <code>paymentMethod</code> property. It denotes the method of payment of accumulated
     * charges against shipments.
     */
    private String paymentMethod;

    private Boolean addBilltoShipper;

    /**
     * <code>Default constructor</code>.
     * <p>
     */
    public FreightDetailDto() {

    }

    /**
     * Gets the <code>accountingRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 character set for all types<br>
     * <p>
     * <b>Example: </b><br>
     * Change method of payment to demand billing
     * <p>
     * 
     * @return the current value of <code>accountingRemarks</code> property.<br>
     */
    public String getAccountingRemarks() {
        return this.accountingRemarks;
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
     * Gets the Bonded premises data transfer object.
     * <p>
     * 
     * @return the current value of bonded premises data transfer object.<br>
     */

    public List<BondedPremiseDto> getBondedPremises() {
        return this.bondedPremises;
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
     * Gets the <code>consigneeRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 character set for all types<br>
     * <p>
     * <b>Example: </b><br>
     * Consignee handling remarks
     * <p>
     * 
     * @return the current value of <code>consigneeRemarks</code> property.<br>
     */
    public String getConsigneeRemarks() {
        return this.consigneeRemarks;
    }

    /**
     * Gets the credit information data transfer object.
     * <p>
     * 
     * @return the current value of credit information data transfer objects.<br>
     */

    public List<CreditInformationDto> getCreditInformations() {
        return this.creditInformations;
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
     * Gets the <code>FreightAdditional</code> data transfer object.
     * <p>
     * 
     * @return the current value of <code>FreightAdditional</code> data transfer object.<br>
     */
    public FreightAdditionalDto getFreightAdditional() {
    	if(this.freightAdditional == null) {
    		this.freightAdditional = new FreightAdditionalDto();
    	}
        return this.freightAdditional;
    }

    /**
     * Gets the <code>FreightAttributes</code> data transfer object.
     * <p>
     * 
     * @return the current value of freight attributes data transfer object.<br>
     */
    public FreightAttributesDto getFreightAttributes() {
    	if(this.freightAttributes == null) {
    		this.freightAttributes = new FreightAttributesDto();
    	}
        return this.freightAttributes;
    }

    /**
     * Gets the <code>FreightStatistics</code> data transfer object.
     * <p>
     * 
     * @return the current value of freight statistics data transfer object.<br>
     */
    public FreightStatisticsDto getFreightStatistics() {
    	if(this.freightStatistics == null) {
    		this.freightStatistics = new FreightStatisticsDto();
    	}
        return this.freightStatistics;
    }

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
     * Gets the <code>notificationStatusCode</code> property.
     * <p>
     * Notification information when the participant is the consignee for a shipment that arrived at its
     * destination. This is used when Participant is associated with Air Waybill in the form of a Consignee or
     * Broker.
     * <p>
     * <b> Possible values :</b><br>
     * <li>C – consignee.
     * <li>B – Broker.
     * <li>X – Consignee and Broker.
     * <li>Blank – No need to notify, even when Participant is associated with Waybill as Consignee or Broker.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * c – consignee.
     * <p>
     * 
     * @return the current value of <code>notificationStatusCode</code> property.<br>
     */
    public String getNotificationStatusCode() {
        return this.notificationStatusCode;
    }

    /**
     * Gets the <code>notifyMethod</code> property.
     * <p>
     * <b> Possible values :</b><br>
     * <li>F – Fax
     * <li>M – Mail
     * <li>T – Telephone
     * <li>X – Cargo interchange
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * F – Fax
     * <p>
     * 
     * @return the current value of <code>notifyMethod</code> property.
     */
    public String getNotifyMethod() {
        return this.notifyMethod;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>participantRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 character set for all types<br>
     * <p>
     * <b>Example: </b><br>
     * This is a participant
     * <p>
     * 
     * @return the current value of <code>participantRemarks</code> property.<br>
     */
    public String getParticipantRemarks() {
        return this.participantRemarks;
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
     * Sets the <code>accountingRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 character set for all types. <br>
     * <p>
     * <b>Example: </b><br>
     * Change method of payment to demand billing
     * <p>
     * 
     * @param pAccountingRemarks the new value of <code>accountingRemarks</code> property.<br>
     */
    public void setAccountingRemarks(final String pAccountingRemarks) {
        this.accountingRemarks = pAccountingRemarks;
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
     * Sets the bonded premises data transfer object.
     * <p>
     * 
     * @param pBondedPremiseDtos the new value of bonded premises data transfer object<br>
     */

    public void setBondedPremises(final List<BondedPremiseDto> pBondedPremiseDtos) {
        this.bondedPremises = pBondedPremiseDtos;
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
     * Sets the <code>consigneeRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 character set for all types. <br>
     * <p>
     * <b>Example: </b><br>
     * Consignee handling remarks
     * <p>
     * 
     * @param pConsigneeRemarks the new value of <code>consigneeRemarks</code> property.<br>
     */
    public void setConsigneeRemarks(final String pConsigneeRemarks) {
        this.consigneeRemarks = pConsigneeRemarks;
    }

    /**
     * Sets the credit information data transfer object.
     * <p>
     * 
     * @param pCreditInformationDtos the new value of credit information data transfer object<br>
     */

    public void setCreditInformations(final List<CreditInformationDto> pCreditInformationDtos) {
        this.creditInformations = pCreditInformationDtos;
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
     * Sets the <code>FreightAdditional</code> data transfer object.
     * <p>
     * 
     * @param pFreightAdditionalDto the new value of <code>FreightAdditional</code> data transfer object<br>
     */
    public void setFreightAdditional(final FreightAdditionalDto pFreightAdditionalDto) {
        this.freightAdditional = pFreightAdditionalDto;
    }

    /**
     * Sets the <code>FreightAttributes</code> data transfer object.
     * <p>
     * 
     * @param pFreightAttributesDto the new value of freight attributes data transfer object<br>
     */
    public void setFreightAttributes(final FreightAttributesDto pFreightAttributesDto) {
        this.freightAttributes = pFreightAttributesDto;
    }

    /**
     * Sets the <code>FreightStatistics</code> data transfer object.
     * <p>
     * 
     * @param pFreightStatisticsDto the new value of freight statistics data transfer object<br>
     */
    public void setFreightStatistics(final FreightStatisticsDto pFreightStatisticsDto) {
        this.freightStatistics = pFreightStatisticsDto;
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
     * Sets the <code>notificationStatusCode</code> property.
     * <p>
     * Notification information when the participant is the consignee for a shipment that arrived at its
     * destination. This is used when Participant is associated with Air Waybill in the form of a Consignee or
     * Broker.
     * <p>
     * <b> Possible values :</b><br>
     * <li>C – consignee.
     * <li>B – Broker.
     * <li>X – Consignee and Broker.
     * <li>Blank – No need to notify, even when Participant is associated with Waybill as Consignee or Broker.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * C – consignee
     * <p>
     * 
     * @param pNotificationStatusCode the new value of <code>notificationStatusCode</code> property.<br>
     */
    public void setNotificationStatusCode(final String pNotificationStatusCode) {
        this.notificationStatusCode = ContractUtility.convertToUpperCase(pNotificationStatusCode);
    }

    /**
     * Sets the <code>notifyMethod</code> property.
     * <p>
     * <b> Possible values :</b><br>
     * <li>F – Fax
     * <li>M – Mail
     * <li>T – Telephone
     * <li>X – Cargo interchange
     * <p>
     * <b>Format: </b><br>
     * 1 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * F – Fax
     * <p>
     * 
     * @param pNotifyMethod the new value of <code>notifyMethod</code> property.
     */
    public void setNotifyMethod(final String pNotifyMethod) {
        this.notifyMethod = ContractUtility.convertToUpperCase(pNotifyMethod);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>participantRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 character set for all types. <br>
     * <p>
     * <b>Example: </b><br>
     * This is a participant
     * <p>
     * 
     * @param pParticipantRemarks the new value of <code>participantRemarks</code> property.
     */
    public void setParticipantRemarks(final String pParticipantRemarks) {
        this.participantRemarks = pParticipantRemarks;
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
     * @return the contractAccountNumber1
     */
    public String getContractAccountNumber1() {
        return this.contractAccountNumber1;
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
     * @return the transistionEffectiveDate
     */
    public Date getTransistionEffectiveDate() {
        return transistionEffectiveDate;
    }

    /**
     * @param transistionEffectiveDate the transistionEffectiveDate to set
     */
    public void setTransistionEffectiveDate(Date transistionEffectiveDate) {
        this.transistionEffectiveDate = transistionEffectiveDate;
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

	public String getLoyaltyId() {
		return loyaltyId;
	}

	public void setLoyaltyId(String loyaltyId) {
		this.loyaltyId = loyaltyId;
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

	public String getDailyCreditLimitForCR() {
		return dailyCreditLimitForCR;
	}

	public void setDailyCreditLimitForCR(String dailyCreditLimitForCR) {
		this.dailyCreditLimitForCR = dailyCreditLimitForCR;
	}

	public String getCurrentAvailableCreditForCR() {
		return CurrentAvailableCreditForCR;
	}

	public void setCurrentAvailableCreditForCR(
			String currentAvailableCreditForCR) {
		CurrentAvailableCreditForCR = currentAvailableCreditForCR;
	}

	public String getTimeOfDayToResetCRAmt() {
		return TimeOfDayToResetCRAmt;
	}

	public void setTimeOfDayToResetCRAmt(String timeOfDayToResetCRAmt) {
		TimeOfDayToResetCRAmt = timeOfDayToResetCRAmt;
	}

	public Date getDateLastCRAvailUpdate() {
		return DateLastCRAvailUpdate;
	}

	public void setDateLastCRAvailUpdate(Date dateLastCRAvailUpdate) {
		DateLastCRAvailUpdate = dateLastCRAvailUpdate;
	}

	public String getTimeLastCRAvailUpdate() {
		return TimeLastCRAvailUpdate;
	}

	public void setTimeLastCRAvailUpdate(String timeLastCRAvailUpdate) {
		TimeLastCRAvailUpdate = timeLastCRAvailUpdate;
	}

	

}
