//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.ParticipantCodeType;

/**
 * 
 * Note: This class has a natural ordering that is inconsistent with equals. 
 *
 */
public class ParticipantDto implements Serializable,
            Comparable<ParticipantDto> {

    /**
     * Unique serial version UID.
     */

    /*
     * * <li>1 - Yes</li>
     * </ul>
     */
    private static final long serialVersionUID = -4775429389894402778L;

    /**
     * Account number display indicator (rec1)
     * <ul>
     * <li>Y = display 2nd account number and id</li>
     * <li>N = display 1st account number and id.</li>
     * <li>I = display IATA account number and id.</li>
     * </ul>
     */
    private String accountNbrDisplayIndicator;

    /**
     * Participant Account Information. Includes the primary and the contract
     * accounts.
     */
    private List<ParticipantAccountDto> accounts;

    /**
     * Participant Address
     */
    private String address;

    /**
     * Participant awb priority (1-9)
     * 
     */
    private String awbPriority;

    /**
     * Participant Capture Indicator
     * <ul>
     * <li>A = automatic</li>
     * <li>C = changed/captured</li>
     * <li>R = required</li>
     * </ul>
     */
    private String captureIndicator;

    /**
     * Participant City
     */
    private String city;

    /**
     * Contact identifier
     * <ul>
     * <li>F = fax</li>
     * <li>M = mail</li>
     * <li>T = telephone</li>
     * <li>x = telex</li>
     * </ul>
     */
    private String contactIdentifier;

    /**
     * Participant Country Code
     */
    private String countryCode;

    /**
     * Participant credit total to be invoiced for this FWB.
     * 
     */
    private BigDecimal creditTotal;

    /**
     * Currency in which participant totals (MPCTOT) are stored.
     */
    private String currency;

    /**
     * Email Address
     */
    private String email;

    /**
     * Fax Number
     */
    private String fax;

    /**
     * Frequent Flyer Number
     */
    private String frequentFlyerNumber;

    /**
     * Indicates that at least one type of fsu message is to be sent for the
     * participant
     * <ul>
     * <li>0 = No FSU is to be sent</li>
     * <li>1 = At least one FSU is to be sent</li>
     * </ul>
     * Store these fields in the event we want to make an archive AWB active
     * again.
     */
    private String fsuToBeSentParticipant;

    /**
     * IATA agent responsible for charges indicator
     * <ul>
     * <li>'N' - the IATA agent is not responsible for prepaid air waybill charges and credit limits</li>
     * <li>'Y' or (blank) - the IATA agent is responsible for prepaid air waybill charges and credit limits
     * (default)</li>
     * </ul>
     */
    private String iataAgentResponsible;

    /**
     * Manual Audit Indicator
     * <ul>
     * <li>Y = yes, manually audit this participant</li>
     * <li>n = no, this participant does not require manual audit</li>
     * </ul>
     */
    private String manualAuditIndicator;

    /**
     * Participant Name
     */
    private String name;

    /**
     * Number of misc. Charges in AWB that require this participant
     */
    private Integer nbrChargesRequired;

    /**
     * Participant Code
     * 
     */
    private ParticipantCodeType participantCode;

    /**
     * Participant Id
     * 
     */
    private Long participantId;

    /**
     * Contact Number
     */
    private String phoneNbr;

    /**
     * Participant Postal Code
     */
    private String postalCode;

    /**
     * Participant Remarks
     * 
     */
    private String remarks;

    /**
     * Send any FSUs
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsu;

    /**
     * Send FSU AWD message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuAwd;

    /**
     * Send FSU BKD message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuBkd;

    /**
     * Send FSU CCD message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuCcd;

    /**
     * Send FSU CRC message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuCrc;

    /**
     * Send FSU DDL message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuDdl;

    /**
     * Send FSU DEP message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuDep;

    /**
     * Send FSU DIS message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuDis;

    /**
     * Send FSU DLV message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuDlv;

    /**
     * Send FSU FAR message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuFar;

    /**
     * Send FSU FDA message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuFda;

    /**
     * Send FSU FPS message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuFps;

    /**
     * Send FSU MAN message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuMan;

    /**
     * Send FSU NFD message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuNfd;

    /**
     * Send FSU OFL message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuOfl;

    /**
     * Send FSU PRE message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuPre;

    /**
     * Send FSU RCC message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuRcc;

    /**
     * Send FSU RCD message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuRcd;

    /**
     * Send FSU RCF message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuRcf;

    /**
     * Send FSU RCG message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuRCG;

    /**
     * Send FSU RCS message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuRcs;

    /**
     * Send FSU RCT message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuRct;

    /**
     * Send FSU TFD message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuTfd;

    /**
     * Send FSU TRM message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendFsuTrm;

    /**
     * Send FSU TGC message
     * <ul>
     * <li>0 – No</li>
     * <li>1 - Yes</li>
     * </ul>
     */
    private String sendTgc;

    /**
     * Participant State
     */
    private String stateOrProvince;

    /**
     * Participant Station
     */
    private String station;

    /**
     * Participant VAT Number
     */
    private String vatNbr;

    @Override
    public int compareTo(final ParticipantDto pParticipantDto) {
        if (this.getParticipantCode().getPriority() > pParticipantDto.getParticipantCode()
                    .getPriority()) {
            return 1;
        }
        if (this.getParticipantCode().getPriority() < pParticipantDto.getParticipantCode()
                    .getPriority()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    /**
     * Gets the <code>accountNbrDisplayIndicator</code> property.
     * 
     * @return the current value of the <code>accountNbrDisplayIndicator</code> property.
     */
    public String getAccountNbrDisplayIndicator() {
        return this.accountNbrDisplayIndicator;
    }

    /**
     * Gets the <code>accounts</code> property.
     * 
     * @return the current value of the <code>accounts</code> property.
     */
    public List<ParticipantAccountDto> getAccounts() {
        return this.accounts;
    }

    /**
     * Gets the <code>address</code> property.
     * 
     * @return the current value of the <code>address</code> property.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Gets the <code>awbPriority</code> property.
     * 
     * @return the current value of the <code>awbPriority</code> property.
     */
    public String getAwbPriority() {
        return this.awbPriority;
    }

    /**
     * Gets the <code>captureIndicator</code> property.
     * 
     * @return the current value of the <code>captureIndicator</code> property.
     */
    public String getCaptureIndicator() {
        return this.captureIndicator;
    }

    /**
     * Gets the <code>city</code> property.
     * 
     * @return the current value of the <code>city</code> property.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Gets the <code>contactIdentifier</code> property.
     * 
     * @return the current value of the <code>contactIdentifier</code> property.
     */
    public String getContactIdentifier() {
        return this.contactIdentifier;
    }

    /**
     * Gets the <code>countryCode</code> property.
     * 
     * @return the current value of the <code>countryCode</code> property.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Gets the <code>creditTotal</code> property.
     * 
     * @return the current value of the <code>creditTotal</code> property.
     */
    public BigDecimal getCreditTotal() {
        return this.creditTotal;
    }

    /**
     * Gets the <code>currency</code> property.
     * 
     * @return the current value of the <code>currency</code> property.
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Gets the <code>email</code> property.
     * 
     * @return the current value of the <code>email</code> property.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Gets the <code>fax</code> property.
     * 
     * @return the current value of the <code>fax</code> property.
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * Gets the <code>frequentFlyerNumber</code> property.
     * 
     * @return the current value of the <code>frequentFlyerNumber</code> property.
     */
    public String getFrequentFlyerNumber() {
        return this.frequentFlyerNumber;
    }

    /**
     * Gets the <code>fsuToBeSentParticipant</code> property.
     * 
     * @return the current value of the <code>fsuToBeSentParticipant</code> property.
     */
    public String getFsuToBeSentParticipant() {
        return this.fsuToBeSentParticipant;
    }

    /**
     * Gets the <code>iataAgentResponsible</code> property.
     * 
     * @return the current value of the <code>iataAgentResponsible</code> property.
     */
    public String getIataAgentResponsible() {
        return this.iataAgentResponsible;
    }

    /**
     * Gets the <code>manualAuditIndicator</code> property.
     * 
     * @return the current value of the <code>manualAuditIndicator</code> property.
     */
    public String getManualAuditIndicator() {
        return this.manualAuditIndicator;
    }

    /**
     * Gets the <code>name</code> property.
     * 
     * @return the current value of the <code>name</code> property.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the <code>nbrChargesRequired</code> property.
     * 
     * @return the current value of the <code>nbrChargesRequired</code> property.
     */
    public Integer getNbrChargesRequired() {
        return this.nbrChargesRequired;
    }

    /**
     * Gets the <code>participantCode</code> property.
     * 
     * @return the current value of the <code>participantCode</code> property.
     */
    public ParticipantCodeType getParticipantCode() {
        return this.participantCode;
    }

    /**
     * Gets the <code>participantId</code> property.
     * 
     * @return the current value of the <code>participantId</code> property.
     */
    public Long getParticipantId() {
        return this.participantId;
    }

    /**
     * Gets the <code>phoneNbr</code> property.
     * 
     * @return the current value of the <code>phoneNbr</code> property.
     */
    public String getPhoneNbr() {
        return this.phoneNbr;
    }

    /**
     * Gets the <code>postalCode</code> property.
     * 
     * @return the current value of the <code>postalCode</code> property.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Gets the <code>remarks</code> property.
     * 
     * @return the current value of the <code>remarks</code> property.
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Gets the <code>sendFsu</code> property.
     * 
     * @return the current value of the <code>sendFsu</code> property.
     */
    public String getSendFsu() {
        return this.sendFsu;
    }

    /**
     * Gets the <code>sendFsuAwd</code> property.
     * 
     * @return the current value of the <code>sendFsuAwd</code> property.
     */
    public String getSendFsuAwd() {
        return this.sendFsuAwd;
    }

    /**
     * Gets the <code>sendFsuBkd</code> property.
     * 
     * @return the current value of the <code>sendFsuBkd</code> property.
     */
    public String getSendFsuBkd() {
        return this.sendFsuBkd;
    }

    /**
     * Gets the <code>sendFsuCcd</code> property.
     * 
     * @return the current value of the <code>sendFsuCcd</code> property.
     */
    public String getSendFsuCcd() {
        return this.sendFsuCcd;
    }

    /**
     * Gets the <code>sendFsuCrc</code> property.
     * 
     * @return the current value of the <code>sendFsuCrc</code> property.
     */
    public String getSendFsuCrc() {
        return this.sendFsuCrc;
    }

    /**
     * Gets the <code>sendFsuDdl</code> property.
     * 
     * @return the current value of the <code>sendFsuDdl</code> property.
     */
    public String getSendFsuDdl() {
        return this.sendFsuDdl;
    }

    /**
     * Gets the <code>sendFsuDep</code> property.
     * 
     * @return the current value of the <code>sendFsuDep</code> property.
     */
    public String getSendFsuDep() {
        return this.sendFsuDep;
    }

    /**
     * Gets the <code>sendFsuDis</code> property.
     * 
     * @return the current value of the <code>sendFsuDis</code> property.
     */
    public String getSendFsuDis() {
        return this.sendFsuDis;
    }

    /**
     * Gets the <code>sendFsuDlv</code> property.
     * 
     * @return the current value of the <code>sendFsuDlv</code> property.
     */
    public String getSendFsuDlv() {
        return this.sendFsuDlv;
    }

    /**
     * Gets the <code>sendFsuFar</code> property.
     * 
     * @return the current value of the <code>sendFsuFar</code> property.
     */
    public String getSendFsuFar() {
        return this.sendFsuFar;
    }

    /**
     * Gets the <code>sendFsuFda</code> property.
     * 
     * @return the current value of the <code>sendFsuFda</code> property.
     */
    public String getSendFsuFda() {
        return this.sendFsuFda;
    }

    /**
     * Gets the <code>sendFsuFps</code> property.
     * 
     * @return the current value of the <code>sendFsuFps</code> property.
     */
    public String getSendFsuFps() {
        return this.sendFsuFps;
    }

    /**
     * Gets the <code>sendFsuMan</code> property.
     * 
     * @return the current value of the <code>sendFsuMan</code> property.
     */
    public String getSendFsuMan() {
        return this.sendFsuMan;
    }

    /**
     * Gets the <code>sendFsuNfd</code> property.
     * 
     * @return the current value of the <code>sendFsuNfd</code> property.
     */
    public String getSendFsuNfd() {
        return this.sendFsuNfd;
    }

    /**
     * Gets the <code>sendFsuOfl</code> property.
     * 
     * @return the current value of the <code>sendFsuOfl</code> property.
     */
    public String getSendFsuOfl() {
        return this.sendFsuOfl;
    }

    /**
     * Gets the <code>sendFsuPre</code> property.
     * 
     * @return the current value of the <code>sendFsuPre</code> property.
     */
    public String getSendFsuPre() {
        return this.sendFsuPre;
    }

    /**
     * Gets the <code>sendFsuRcc</code> property.
     * 
     * @return the current value of the <code>sendFsuRcc</code> property.
     */
    public String getSendFsuRcc() {
        return this.sendFsuRcc;
    }

    /**
     * Gets the <code>sendFsuRcd</code> property.
     * 
     * @return the current value of the <code>sendFsuRcd</code> property.
     */
    public String getSendFsuRcd() {
        return this.sendFsuRcd;
    }

    /**
     * Gets the <code>sendFsuRcf</code> property.
     * 
     * @return the current value of the <code>sendFsuRcf</code> property.
     */
    public String getSendFsuRcf() {
        return this.sendFsuRcf;
    }

    /**
     * Gets the <code>sendFsuRCG</code> property.
     * 
     * @return the current value of the <code>sendFsuRCG</code> property.
     */
    public String getSendFsuRCG() {
        return this.sendFsuRCG;
    }

    /**
     * Gets the <code>sendFsuRcs</code> property.
     * 
     * @return the current value of the <code>sendFsuRcs</code> property.
     */
    public String getSendFsuRcs() {
        return this.sendFsuRcs;
    }

    /**
     * Gets the <code>sendFsuRct</code> property.
     * 
     * @return the current value of the <code>sendFsuRct</code> property.
     */
    public String getSendFsuRct() {
        return this.sendFsuRct;
    }

    /**
     * Gets the <code>sendFsuTfd</code> property.
     * 
     * @return the current value of the <code>sendFsuTfd</code> property.
     */
    public String getSendFsuTfd() {
        return this.sendFsuTfd;
    }

    /**
     * Gets the <code>sendFsuTrm</code> property.
     * 
     * @return the current value of the <code>sendFsuTrm</code> property.
     */
    public String getSendFsuTrm() {
        return this.sendFsuTrm;
    }

    /**
     * Gets the <code>sendTgc</code> property.
     * 
     * @return the current value of the <code>sendTgc</code> property.
     */
    public String getSendTgc() {
        return this.sendTgc;
    }

    /**
     * Gets the <code>stateOrProvince</code> property.
     * 
     * @return the current value of the <code>stateOrProvince</code> property.
     */
    public String getStateOrProvince() {
        return this.stateOrProvince;
    }

    /**
     * Gets the <code>station</code> property.
     * 
     * @return the current value of the <code>station</code> property.
     */
    public String getStation() {
        return this.station;
    }

    /**
     * Gets the <code>vatNbr</code> property.
     * 
     * @return the current value of the <code>vatNbr</code> property.
     */
    public String getVatNbr() {
        return this.vatNbr;
    }

    /**
     * Sets the <code>accountNbrDisplayIndicator</code> property.
     * 
     * @param pAccountNbrDisplayIndicator
     *            the current value of the <code>accountNbrDisplayIndicator</code> property.
     */
    public void setAccountNbrDisplayIndicator(final String pAccountNbrDisplayIndicator) {
        this.accountNbrDisplayIndicator = pAccountNbrDisplayIndicator;
    }

    /**
     * Sets the <code>accounts</code> property.
     * 
     * @param pAccounts
     *            the current value of the <code>accounts</code> property.
     */
    public void setAccounts(final List<ParticipantAccountDto> pAccounts) {
        this.accounts = pAccounts;
    }

    /**
     * Sets the <code>address</code> property.
     * 
     * @param pAddress
     *            the current value of the <code>address</code> property.
     */
    public void setAddress(final String pAddress) {
        this.address = pAddress;
    }

    /**
     * Sets the <code>awbPriority</code> property.
     * 
     * @param pAwbPriority
     *            the current value of the <code>awbPriority</code> property.
     */
    public void setAwbPriority(final String pAwbPriority) {
        this.awbPriority = pAwbPriority;
    }

    /**
     * Sets the <code>captureIndicator</code> property.
     * 
     * @param pCaptureIndicator
     *            the current value of the <code>captureIndicator</code> property.
     */
    public void setCaptureIndicator(final String pCaptureIndicator) {
        this.captureIndicator = pCaptureIndicator;
    }

    /**
     * Sets the <code>city</code> property.
     * 
     * @param pCity
     *            the current value of the <code>city</code> property.
     */
    public void setCity(final String pCity) {
        this.city = pCity;
    }

    /**
     * Sets the <code>contactIdentifier</code> property.
     * 
     * @param pContactIdentifier
     *            the current value of the <code>contactIdentifier</code> property.
     */
    public void setContactIdentifier(final String pContactIdentifier) {
        this.contactIdentifier = pContactIdentifier;
    }

    /**
     * Sets the <code>countryCode</code> property.
     * 
     * @param pCountryCode
     *            the current value of the <code>countryCode</code> property.
     */
    public void setCountryCode(final String pCountryCode) {
        this.countryCode = pCountryCode;
    }

    /**
     * Sets the <code>creditTotal</code> property.
     * 
     * @param pCreditTotal
     *            the current value of the <code>creditTotal</code> property.
     */
    public void setCreditTotal(final BigDecimal pCreditTotal) {
        this.creditTotal = pCreditTotal;
    }

    /**
     * Sets the <code>currency</code> property.
     * 
     * @param pCurrency
     *            the current value of the <code>currency</code> property.
     */
    public void setCurrency(final String pCurrency) {
        this.currency = pCurrency;
    }

    /**
     * Sets the <code>email</code> property.
     * 
     * @param pEmail
     *            the current value of the <code>email</code> property.
     */
    public void setEmail(final String pEmail) {
        this.email = pEmail;
    }

    /**
     * Sets the <code>fax</code> property.
     * 
     * @param pFax
     *            the current value of the <code>fax</code> property.
     */
    public void setFax(final String pFax) {
        this.fax = pFax;
    }

    /**
     * Sets the <code>frequentFlyerNumber</code> property.
     * 
     * @param pFrequentFlyerNumber
     *            the current value of the <code>frequentFlyerNumber</code> property.
     */
    public void setFrequentFlyerNumber(final String pFrequentFlyerNumber) {
        this.frequentFlyerNumber = pFrequentFlyerNumber;
    }

    /**
     * Sets the <code>fsuToBeSentParticipant</code> property.
     * 
     * @param pFsuToBeSentParticipant
     *            the current value of the <code>fsuToBeSentParticipant</code> property.
     */
    public void setFsuToBeSentParticipant(final String pFsuToBeSentParticipant) {
        this.fsuToBeSentParticipant = pFsuToBeSentParticipant;
    }

    /**
     * Sets the <code>iataAgentResponsible</code> property.
     * 
     * @param pIataAgentResponsible
     *            the current value of the <code>iataAgentResponsible</code> property.
     */
    public void setIataAgentResponsible(final String pIataAgentResponsible) {
        this.iataAgentResponsible = pIataAgentResponsible;
    }

    /**
     * Sets the <code>manualAuditIndicator</code> property.
     * 
     * @param pManualAuditIndicator
     *            the current value of the <code>manualAuditIndicator</code> property.
     */
    public void setManualAuditIndicator(final String pManualAuditIndicator) {
        this.manualAuditIndicator = pManualAuditIndicator;
    }

    /**
     * Sets the <code>name</code> property.
     * 
     * @param pName
     *            the current value of the <code>name</code> property.
     */
    public void setName(final String pName) {
        this.name = pName;
    }

    /**
     * Sets the <code>nbrChargesRequired</code> property.
     * 
     * @param pNbrChargesRequired
     *            the current value of the <code>nbrChargesRequired</code> property.
     */
    public void setNbrChargesRequired(final Integer pNbrChargesRequired) {
        this.nbrChargesRequired = pNbrChargesRequired;
    }

    /**
     * Sets the <code>participantCode</code> property.
     * 
     * @param pParticipantCode
     *            the current value of the <code>participantCode</code> property.
     */
    public void setParticipantCode(final ParticipantCodeType pParticipantCode) {
        this.participantCode = pParticipantCode;
    }

    /**
     * Sets the <code>participantId</code> property.
     * 
     * @param pParticipantId
     *            the current value of the <code>participantId</code> property.
     */
    public void setParticipantId(final Long pParticipantId) {
        this.participantId = pParticipantId;
    }

    /**
     * Sets the <code>phoneNbr</code> property.
     * 
     * @param pPhoneNbr
     *            the current value of the <code>phoneNbr</code> property.
     */
    public void setPhoneNbr(final String pPhoneNbr) {
        this.phoneNbr = pPhoneNbr;
    }

    /**
     * Sets the <code>postalCode</code> property.
     * 
     * @param pPostalCode
     *            the current value of the <code>postalCode</code> property.
     */
    public void setPostalCode(final String pPostalCode) {
        this.postalCode = pPostalCode;
    }

    /**
     * Sets the <code>remarks</code> property.
     * 
     * @param pRemarks
     *            the current value of the <code>remarks</code> property.
     */
    public void setRemarks(final String pRemarks) {
        this.remarks = pRemarks;
    }

    /**
     * Sets the <code>sendFsu</code> property.
     * 
     * @param pSendFsu
     *            the current value of the <code>sendFsu</code> property.
     */
    public void setSendFsu(final String pSendFsu) {
        this.sendFsu = pSendFsu;
    }

    /**
     * Sets the <code>sendFsuAwd</code> property.
     * 
     * @param pSendFsuAwd
     *            the current value of the <code>sendFsuAwd</code> property.
     */
    public void setSendFsuAwd(final String pSendFsuAwd) {
        this.sendFsuAwd = pSendFsuAwd;
    }

    /**
     * Sets the <code>sendFsuBkd</code> property.
     * 
     * @param pSendFsuBkd
     *            the current value of the <code>sendFsuBkd</code> property.
     */
    public void setSendFsuBkd(final String pSendFsuBkd) {
        this.sendFsuBkd = pSendFsuBkd;
    }

    /**
     * Sets the <code>sendFsuCcd</code> property.
     * 
     * @param pSendFsuCcd
     *            the current value of the <code>sendFsuCcd</code> property.
     */
    public void setSendFsuCcd(final String pSendFsuCcd) {
        this.sendFsuCcd = pSendFsuCcd;
    }

    /**
     * Sets the <code>sendFsuCrc</code> property.
     * 
     * @param pSendFsuCrc
     *            the current value of the <code>sendFsuCrc</code> property.
     */
    public void setSendFsuCrc(final String pSendFsuCrc) {
        this.sendFsuCrc = pSendFsuCrc;
    }

    /**
     * Sets the <code>sendFsuDdl</code> property.
     * 
     * @param pSendFsuDdl
     *            the current value of the <code>sendFsuDdl</code> property.
     */
    public void setSendFsuDdl(final String pSendFsuDdl) {
        this.sendFsuDdl = pSendFsuDdl;
    }

    /**
     * Sets the <code>sendFsuDep</code> property.
     * 
     * @param pSendFsuDep
     *            the current value of the <code>sendFsuDep</code> property.
     */
    public void setSendFsuDep(final String pSendFsuDep) {
        this.sendFsuDep = pSendFsuDep;
    }

    /**
     * Sets the <code>sendFsuDis</code> property.
     * 
     * @param pSendFsuDis
     *            the current value of the <code>sendFsuDis</code> property.
     */
    public void setSendFsuDis(final String pSendFsuDis) {
        this.sendFsuDis = pSendFsuDis;
    }

    /**
     * Sets the <code>sendFsuDlv</code> property.
     * 
     * @param pSendFsuDlv
     *            the current value of the <code>sendFsuDlv</code> property.
     */
    public void setSendFsuDlv(final String pSendFsuDlv) {
        this.sendFsuDlv = pSendFsuDlv;
    }

    /**
     * Sets the <code>sendFsuFar</code> property.
     * 
     * @param pSendFsuFar
     *            the current value of the <code>sendFsuFar</code> property.
     */
    public void setSendFsuFar(final String pSendFsuFar) {
        this.sendFsuFar = pSendFsuFar;
    }

    /**
     * Sets the <code>sendFsuFda</code> property.
     * 
     * @param pSendFsuFda
     *            the current value of the <code>sendFsuFda</code> property.
     */
    public void setSendFsuFda(final String pSendFsuFda) {
        this.sendFsuFda = pSendFsuFda;
    }

    /**
     * Sets the <code>sendFsuFps</code> property.
     * 
     * @param pSendFsuFps
     *            the current value of the <code>sendFsuFps</code> property.
     */
    public void setSendFsuFps(final String pSendFsuFps) {
        this.sendFsuFps = pSendFsuFps;
    }

    /**
     * Sets the <code>sendFsuMan</code> property.
     * 
     * @param pSendFsuMan
     *            the current value of the <code>sendFsuMan</code> property.
     */
    public void setSendFsuMan(final String pSendFsuMan) {
        this.sendFsuMan = pSendFsuMan;
    }

    /**
     * Sets the <code>sendFsuNfd</code> property.
     * 
     * @param pSendFsuNfd
     *            the current value of the <code>sendFsuNfd</code> property.
     */
    public void setSendFsuNfd(final String pSendFsuNfd) {
        this.sendFsuNfd = pSendFsuNfd;
    }

    /**
     * Sets the <code>sendFsuOfl</code> property.
     * 
     * @param pSendFsuOfl
     *            the current value of the <code>sendFsuOfl</code> property.
     */
    public void setSendFsuOfl(final String pSendFsuOfl) {
        this.sendFsuOfl = pSendFsuOfl;
    }

    /**
     * Sets the <code>sendFsuPre</code> property.
     * 
     * @param pSendFsuPre
     *            the current value of the <code>sendFsuPre</code> property.
     */
    public void setSendFsuPre(final String pSendFsuPre) {
        this.sendFsuPre = pSendFsuPre;
    }

    /**
     * Sets the <code>sendFsuRcc</code> property.
     * 
     * @param pSendFsuRcc
     *            the current value of the <code>sendFsuRcc</code> property.
     */
    public void setSendFsuRcc(final String pSendFsuRcc) {
        this.sendFsuRcc = pSendFsuRcc;
    }

    /**
     * Sets the <code>sendFsuRcd</code> property.
     * 
     * @param pSendFsuRcd
     *            the current value of the <code>sendFsuRcd</code> property.
     */
    public void setSendFsuRcd(final String pSendFsuRcd) {
        this.sendFsuRcd = pSendFsuRcd;
    }

    /**
     * Sets the <code>sendFsuRcf</code> property.
     * 
     * @param pSendFsuRcf
     *            the current value of the <code>sendFsuRcf</code> property.
     */
    public void setSendFsuRcf(final String pSendFsuRcf) {
        this.sendFsuRcf = pSendFsuRcf;
    }

    /**
     * Sets the <code>sendFsuRCG</code> property.
     * 
     * @param pSendFsuRCG
     *            the current value of the <code>sendFsuRCG</code> property.
     */
    public void setSendFsuRCG(final String pSendFsuRCG) {
        this.sendFsuRCG = pSendFsuRCG;
    }

    /**
     * Sets the <code>sendFsuRcs</code> property.
     * 
     * @param pSendFsuRcs
     *            the current value of the <code>sendFsuRcs</code> property.
     */
    public void setSendFsuRcs(final String pSendFsuRcs) {
        this.sendFsuRcs = pSendFsuRcs;
    }

    /**
     * Sets the <code>sendFsuRct</code> property.
     * 
     * @param pSendFsuRct
     *            the current value of the <code>sendFsuRct</code> property.
     */
    public void setSendFsuRct(final String pSendFsuRct) {
        this.sendFsuRct = pSendFsuRct;
    }

    /**
     * Sets the <code>sendFsuTfd</code> property.
     * 
     * @param pSendFsuTfd
     *            the current value of the <code>sendFsuTfd</code> property.
     */
    public void setSendFsuTfd(final String pSendFsuTfd) {
        this.sendFsuTfd = pSendFsuTfd;
    }

    /**
     * Sets the <code>sendFsuTrm</code> property.
     * 
     * @param pSendFsuTrm
     *            the current value of the <code>sendFsuTrm</code> property.
     */
    public void setSendFsuTrm(final String pSendFsuTrm) {
        this.sendFsuTrm = pSendFsuTrm;
    }

    /**
     * Sets the <code>sendTgc</code> property.
     * 
     * @param pSendTgc
     *            the current value of the <code>sendTgc</code> property.
     */
    public void setSendTgc(final String pSendTgc) {
        this.sendTgc = pSendTgc;
    }

    /**
     * Sets the <code>stateOrProvince</code> property.
     * 
     * @param pStateOrProvince
     *            the current value of the <code>stateOrProvince</code> property.
     */
    public void setStateOrProvince(final String pStateOrProvince) {
        this.stateOrProvince = pStateOrProvince;
    }

    /**
     * Sets the <code>station</code> property.
     * 
     * @param pStation
     *            the current value of the <code>station</code> property.
     */
    public void setStation(final String pStation) {
        this.station = pStation;
    }

    /**
     * Sets the <code>vatNbr</code> property.
     * 
     * @param pVatNbr
     *            the current value of the <code>vatNbr</code> property.
     */
    public void setVatNbr(final String pVatNbr) {
        this.vatNbr = pVatNbr;
    }

}
