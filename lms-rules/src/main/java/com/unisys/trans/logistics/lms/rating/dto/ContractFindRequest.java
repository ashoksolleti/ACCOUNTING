/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantAccountType;
import com.unisys.trans.logistics.lms.rating.dto.constants.AllParticipantContractType;

/**
 * <code>ContractFindRequest</code> is used for retrieving <code>Contract</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>accountNumber
 * <li>accountNumberType
 * <li>contractNumber
 * <li>contractOId
 * <li>fetchActive
 * <li>fetchDeleted
 * <li>fetchExpired
 * <li>fetchHistory
 * <li>fetchMultipleVersions
 * <li>fetchPending
 * <li>participantGroupInd
 * <li>searchDate
 * <li>stationCode
 * </ul>
 */

public class ContractFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8308611244534127986L;

    /**
     * Attribute to hold the <code>accountNumber</code> property.
     */
    private String accountNumber;

    /**
     * Attribute to hold the <code>accountNumberType</code> property.
     */
    private ParticipantAccountType accountNumberType;

    /**
     * Attribute to hold the <code>contractNumber</code> property.
     */
    private String contractNumber;

    /**
     * Attribute to hold the <code>contractOId</code> property.
     */
    private Long contractOId;

    /**
     * Attribute to hold the <code>fetchActive</code> property.
     */
    private boolean fetchActive;

    /**
     * Attribute to hold the <code>fetchDeleted</code> property.
     */
    private boolean fetchDeleted;

    /**
     * Attribute to hold the <code>fetchExpired</code> property.
     */
    private boolean fetchExpired;

    /**
     * Attribute to hold the <code>fetchHistory</code> property.
     */
    private boolean fetchHistory;

    /**
     * Attribute to hold the <code>fetchExpired</code> property.
     */
    private boolean fetchMultipleVersions;

    /**
     * Attribute to hold the <code>fetchPending</code> property.
     */
    private boolean fetchPending;

    /**
     * Attribute to hold the <code>participantGroupInd</code> property.
     */
    private boolean participantGroupInd;
    
    /**
     * Attribute to hold the <code>allotmentValidation</code> property.
     */
    private boolean allotmentValidation;

    /**
     * Attribute to hold the <code>searchDate</code> property.
     */
    private Date searchDate;

    /**
     * Attribute to hold the <code>stationCode</code> property.
     */
    private String stationCode;
    
    /**
     * Attribute to hold <code>allParticipantContract</code> property.
     */
    private AllParticipantContractType allParticipantContract;    
    
    /**
     * Attribute to hold <code>allotmentId</code> property.
     */
    private String allotmentId;
    
    /**
     * Attribute to hold <code>contractDate</code> property.
     */
    private Date contractDate;

    /**
     * Gets the <code>AccountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric Characters
     * <p>
     * <b>Example: </b><br>
     * FGRT31
     * <p>
     * 
     * @return the current value of the <code>AccountNumber</code> property.
     */

    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Gets the <code>AccountNumberType</code> property.
     * <p>
     * Indicator that denotes the AccountNumberType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>I- International
     * <li>D- Domestic
     * <li>B- Both
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * I- International<br>
     * <p>
     * 
     * @return the current value of <code>AccountNumberType</code> property.<br>
     */
    public ParticipantAccountType getAccountNumberType() {
        return accountNumberType;
    }

    /**
     * Gets the <code>ContractNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 Alphanumeric Characters
     * <p>
     * <b>Example: </b><br>
     * FGRT31
     * <p>
     * 
     * @return the current value of the <code>ContractNumber</code> property.
     */
    public String getContractNumber() {
        return this.contractNumber;
    }

    /**
     * Gets the <code>ContractOId</code> property.
     * 
     * 
     * @return the current value of the <code>ContractOId</code> property.
     */
    public Long getContractOId() {
        return this.contractOId;
    }

    /**
     * Gets the <code>FetchActive</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>fetchActive</code> property.
     */

    public boolean getFetchActive() {
        return this.fetchActive;
    }

    /**
     * Gets the <code>FetchDeleted</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>fetchDeleted</code> property.
     */

    public boolean getFetchDeleted() {
        return this.fetchDeleted;
    }

    /**
     * Gets the <code>FetchExpired</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>fetchExpired</code> property.
     */

    public boolean getFetchExpired() {
        return this.fetchExpired;
    }

    /**
     * Gets the <code>FetchHistory</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>fetchHistory</code> property.
     */

    public boolean getFetchHistory() {
        return this.fetchHistory;
    }

    /**
     * Gets the <code>fetchMultipleVersions</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>fetchMultipleVersions</code> property.
     */

    public boolean getFetchMultipleVersions() {
        return this.fetchMultipleVersions;
    }

    /**
     * Gets the <code>FetchPending</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>fetchPending</code> property.
     */

    public boolean getFetchPending() {
        return this.fetchPending;
    }

    /**
     * Gets the <code>ParticipantGroupInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>participantGroupInd</code> property.
     */

    public boolean getParticipantGroupInd() {
        return participantGroupInd;
    }

    /**
     * Gets the <code>SearchDate</code> property.
     * 
     * @return the current value of the <code>SearchDate</code> property.
     */

    public Date getSearchDate() {
        return ContractUtility.getClonedDate(this.searchDate);
    }

    /**
     * Gets the <code>StationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-17 Alphanumeric Characters
     * <p>
     * <b>Example: </b><br>
     * FGRT31
     * <p>
     * 
     * @return the current value of the <code>AccountNumber</code> property.
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Sets the <code>AccountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric Characters
     * <p>
     * <b>Example: </b><br>
     * FGRT31
     * <p>
     * 
     * @param pAccountNumber
     *            the current value of the <code>AccountNumber</code> property.
     */

    public void setAccountNumber(final String pAccountNumber) {
        this.accountNumber = ContractUtility.convertToUpperCase(pAccountNumber);
    }

    /**
     * Sets the <code>AccountNumberType</code> property.
     * <p>
     * Indicator that denotes the AccountNumberType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>I- International
     * <li>D- Domestic
     * <li>B- Both
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * I- International<br>
     * <p>
     * 
     * @param pAccountNumberType
     *            <code>{@link ParticipantAccountType}</code> holds the new value of <code>AccountNumberType
     *            </code> type details. <br>
     */

    public void setAccountNumberType(final ParticipantAccountType pAccountNumberType) {
        this.accountNumberType = pAccountNumberType;
    }

    /**
     * Sets the <code>ContractNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 Alphanumeric Characters
     * <p>
     * <b>Example: </b><br>
     * FGRT31
     * <p>
     * 
     * @param pContractNumber
     *            the current value of the <code>ContractNumber</code> property.
     */
    public void setContractNumber(final String pContractNumber) {
        this.contractNumber = ContractUtility.convertToUpperCase(pContractNumber);
    }

    /**
     * Sets the <code>ContractOId</code> property.
     * 
     * @param pContractOId
     *            the current value of the <code>ContractOId</code> property.
     */
    public void setContractOId(final Long pContractOId) {
        this.contractOId = pContractOId;
    }

    /**
     * Sets the <code>FetchActive</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pFetchActive
     *            the current value of the <code>FetchActive</code> property.
     */

    public void setFetchActive(final boolean pFetchActive) {
        this.fetchActive = pFetchActive;
    }

    /**
     * Sets the <code>FetchDeleted</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pFetchDeleted
     *            the current value of the <code>fetchDeleted</code> property.
     */

    public void setFetchDeleted(final boolean pFetchDeleted) {
        this.fetchDeleted = pFetchDeleted;
    }

    /**
     * Sets the <code>FetchExpired</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pFetchExpired
     *            the current value of the <code>fetchExpired</code> property.
     */

    public void setFetchExpired(final boolean pFetchExpired) {
        this.fetchExpired = pFetchExpired;
    }

    /**
     * Sets the <code>FetchHistory</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pFetchHistory
     *            the current value of the <code>fetchHistory</code> property.
     */

    public void setFetchHistory(final boolean pFetchHistory) {
        this.fetchHistory = pFetchHistory;
    }

    /**
     * Sets the <code>fetchMultipleVersions</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pFetchMultipleVersions
     *            the current value of the <code>fetchMultipleVersions</code> property.
     */

    public void setFetchMultipleVersions(final boolean pFetchMultipleVersions) {
        this.fetchMultipleVersions = pFetchMultipleVersions;
    }

    /**
     * Sets the <code>FetchPending</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pFetchPending
     *            the current value of the <code>fetchPending</code> property.
     */

    public void setFetchPending(final boolean pFetchPending) {
        this.fetchPending = pFetchPending;
    }

    /**
     * Sets the <code>ParticipantGroupInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pParticipantGroupInd
     *            the current value of the <code>ParticipantGroupInd</code> property.
     */

    public void setParticipantGroupInd(final boolean pParticipantGroupInd) {
        this.participantGroupInd = pParticipantGroupInd;
    }

    /**
     * Sets the <code>SearchDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pSearchDate
     *            the current value of the <code>searchDate</code> property.
     */
    public void setSearchDate(final Date pSearchDate) {
        this.searchDate = ContractUtility.getClonedDate(pSearchDate);
    }

    /**
     * Sets the <code>StationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-17 Alphanumeric Characters
     * <p>
     * <b>Example: </b><br>
     * FGRT31
     * <p>
     * 
     * @param pStationCode
     *            the current value of the <code>StationCode</code> property.
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

    /**
     * Gets the <code>allParticipantContract</code> property.
     * <p>
     * 
     * @return the current value of the <code>allParticipantContract</code> property.
     */
    
    public AllParticipantContractType getAllParticipantContract() {
        return this.allParticipantContract;
    }

    /**
     * Sets the <code>allParticipantContract</code> property.
     * 
     * @param pAllParticipantContract
     *            the new value of the <code>allParticipantContract</code> property.
     */
    
    public void setAllParticipantContract(final AllParticipantContractType pAllParticipantContract) {
        this.allParticipantContract = pAllParticipantContract;
    }
    /**
     * Gets the <code>allotmentId</code> property.
     * <p>
     * 
     * @return the current value of the <code>allotmentId</code> property.
     */
    
    public String getAllotmentId() {
        return this.allotmentId;
    }

    /**
     * Sets the <code>allotmentId</code> property.
     * 
     * @param pAllotmentId
     *            the new value of the <code>allotmentId</code> property.
     */
    
    public void setAllotmentId(final String pAllotmentId) {
        this.allotmentId = pAllotmentId;
    }

    /**
     * Gets the <code>contractDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>contractDate</code> property.
     */
    
    public Date getContractDate() {
        return this.contractDate;
    }

    /**
     * Sets the <code>contractDate</code> property.
     * 
     * @param pContractDate
     *            the new value of the <code>contractDate</code> property.
     */
    
    public void setContractDate(final Date pContractDate) {
        this.contractDate = pContractDate;
    }

    public boolean isAllotmentValidation() {
        return allotmentValidation;
    }

    public void setAllotmentValidation(boolean allotmentValidation) {
        this.allotmentValidation = allotmentValidation;
    }
    
    
}
