/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.dto.ContactDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantAccountType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ContractStatusType;

/**
 * <code>SpotRateFindRequest</code> is used for retrieving <code>SpotRate</code>
 * information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>accountNumber
 * <li>accountNumberType
 * <li>contact
 * <li>date
 * <li>deFerParticipantInput
 * <li>fetchMultipleVersions
 * <li>isDeferParticipantRequest
 * <li>spotRateOId
 * <li>sraNumber
 * <li>sraVersion
 * <li>station
 * <li>statusFilters
 * </ul>
 */
public class SpotRateFindRequest extends AbstractRequest {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -1266751549931037525L;

	/**
	 * Attribute to hold the <code>accountNumber</code> property.
	 */
	private String accountNumber;

	/**
	 * Attribute to hold the <code>accountNumberType</code> property.
	 */
	private ParticipantAccountType accountNumberType;

	/**
	 * Attribute to hold the <code>contact</code> property.
	 */
	private ContactDto contact;

	/**
	 * Attribute to hold the <code>date</code> property.
	 */
	private Date date;

	/**
	 * Attribute to hold the <code>deFerParticipantInput</code> property.
	 */
	private boolean deferParticipantInput;

	/**
	 * Attribute to hold the <code>fetchMultipleVersions</code> property.
	 */
	private boolean fetchMultipleVersions;

	/**
	 * Attribute to hold the <code>isDeferParticipantRequest</code> property.
	 */
	private boolean deferParticipantRequest;

	/**
	 * Attribute to hold the <code>participantGroupInd</code> property.
	 */
	private boolean participantGroupInd;

	/**
	 * Attribute to hold the <code>spotRateOId</code> property.
	 */
	private Long spotRateOId;

	/**
	 * Attribute to hold the <code>sraNumber</code> property.
	 */
	private String sraNumber;

	/**
	 * Attribute to hold the <code>sraVersion</code> property.
	 */
	private long sraVersion;

	/**
	 * Attribute to hold the <code>station</code> property.
	 */
	private String station;
	
	private String iataNumber;

	/**
	 * Attribute to hold the <code>statusFilters</code> property.
	 */
	private List<ContractStatusType> statusFilters;

	private AWBNumberDto airwaybilldto;
	
	/**
	 * Attribute to hold the <code>accountNumbers</code> property.
	 */
	private List<String> accountNumbers;
	
	public AWBNumberDto getAirwaybilldto() {
        return airwaybilldto;
    }
    public void setAirwaybilldto(AWBNumberDto pAirwaybilldto) {
            this.airwaybilldto = pAirwaybilldto;
    }
    private SpotRateDto spotratedto;
    public SpotRateDto getSpotratedto() {
        return spotratedto;
    }
    public void setSpotratedto(SpotRateDto pSpotratedto) {
            this.spotratedto = pSpotratedto;
    }
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
		return this.accountNumber;
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
		return this.accountNumberType;
	}

	/**
	 * Gets the <code>contact</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>contact</code> property.<br>
	 */
	public ContactDto getContact() {
		return this.contact;
	}

	/**
	 * Gets the <code>date</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>date</code> property.<br>
	 */
	public Date getDate() {
		return ContractUtility.getClonedDate(this.date);
	}

    /**
     * Gets the <code>deferParticipantInput</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>deferParticipantInput</code>
     *         property.
     */
	public boolean getDeferParticipantInput() {
		return this.deferParticipantInput;
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
	 * @return the current value of the <code>fetchMultipleVersions</code>
	 *         property.
	 */

	public boolean getFetchMultipleVersions() {
		return this.fetchMultipleVersions;
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
	 * @return the current value of the <code>participantGroupInd</code>
	 *         property.
	 */

	public boolean getParticipantGroupInd() {
		return participantGroupInd;
	}

	/**
	 * Gets the <code>spotRateOId</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>spotRateOId</code> property.<br>
	 */
	public Long getSpotRateOId() {
		return this.spotRateOId;
	}

	/**
	 * Gets the <code>sraNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>sraNumber</code> property.<br>
	 */
	public String getSraNumber() {
		return this.sraNumber;
	}

	/**
	 * Gets the <code>sraVersion</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>sraVersion</code> property.<br>
	 */
	public long getSraVersion() {
		return this.sraVersion;
	}

	/**
	 * Gets the <code>station</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>station</code> property.<br>
	 */
	public String getStation() {
		return this.station;
	}

	/**
	 * Gets the <code>statusFilters</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>statusFilters</code> property.<br>
	 */
	public List<ContractStatusType> getStatusFilters() {
		return this.statusFilters;
	}

	/**
	 * Gets the <code>DeferParticipantRequest</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>DeferParticipantRequest</code>
	 *         property.<br>
	 */
	public boolean getDeferParticipantRequest() {
		return deferParticipantRequest;
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
		this.accountNumber = pAccountNumber;
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
	 *            <code>{@link ParticipantAccountType}</code> holds the new
	 *            value of <code>ParticipantAccountType </code> type details. <br>
	 */
	public void setAccountNumberType(
			final ParticipantAccountType pAccountNumberType) {
		this.accountNumberType = pAccountNumberType;
	}

	/**
	 * Sets the <code>Contact</code> property.
	 * <p>
	 * 
	 * @param pContact
	 *            the current value of the <code>contact</code> property.
	 */
	public void setContact(final ContactDto pContact) {
		this.contact = pContact;
	}

	/**
	 * Sets the <code>Date</code> property.
	 * <p>
	 * 
	 * @param pDate
	 *            the current value of the <code>Date</code> property.
	 */
	public void setDate(final Date pDate) {
		this.date = ContractUtility.getClonedDate(pDate);
	}

	/**
	 * Sets the <code>DeFerParticipantInput</code> property.
	 * <p>
	 * 
	 * @param pDeferParticipantInput
	 *            the current value of the <code>DeFerParticipantInput</code>
	 *            property.
	 */
	public void setDeferParticipantInput(final boolean pDeferParticipantInput) {
		this.deferParticipantInput = pDeferParticipantInput;
	}

	/**
	 * Sets the <code>DeferParticipantRequest</code> property.
	 * <p>
	 * 
	 * @param pDeferParticipantRequest
	 *            the current value of the <code>DeferParticipantRequest</code>
	 *            property.
	 */
	public void setDeferParticipantRequest(
			final boolean pDeferParticipantRequest) {
		deferParticipantRequest = pDeferParticipantRequest;
	}

	/**
	 * Sets the <code>fetchMultipleVersions</code> property.
	 * <p>
	 * 
	 * @param pFetchMultipleVersions
	 *            the current value of the <code>fetchMultipleVersions</code>
	 *            property.
	 */

	public void setFetchMultipleVersions(final boolean pFetchMultipleVersions) {
		this.fetchMultipleVersions = pFetchMultipleVersions;
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
	 *            the current value of the <code>ParticipantGroupInd</code>
	 *            property.
	 */

	public void setParticipantGroupInd(final boolean pParticipantGroupInd) {
		this.participantGroupInd = pParticipantGroupInd;
	}

	/**
	 * Sets the <code>SpotRateOId</code> property.
	 * <p>
	 * 
	 * @param pSpotRateOId
	 *            the current value of the <code>SpotRateOId</code> property.
	 */
	public void setSpotRateOId(final Long pSpotRateOId) {
		this.spotRateOId = pSpotRateOId;
	}

	/**
	 * Sets the <code>SraNumber</code> property.
	 * <p>
	 * 
	 * @param pSraNumber
	 *            the current value of the <code>SraNumber</code> property.
	 */
	public void setSraNumber(final String pSraNumber) {
		this.sraNumber = pSraNumber;
	}

	/**
	 * Sets the <code>SraVersion</code> property.
	 * <p>
	 * 
	 * @param pSraVersion
	 *            the current value of the <code>SraVersion</code> property.
	 */

	public void setSraVersion(final long pSraVersion) {
		this.sraVersion = pSraVersion;
	}

	/**
	 * Sets the <code>Station</code> property.
	 * <p>
	 * 
	 * @param pStation
	 *            the current value of the <code>Station</code> property.
	 */
	public void setStation(final String pStation) {
		this.station = pStation;
	}

	/**
	 * Sets the <code>StatusFilters</code> property.
	 * <p>
	 * 
	 * @param pStatusFilters
	 *            the current value of the <code>StatusFilters</code> property.
	 */
	public void setStatusFilters(final List<ContractStatusType> pStatusFilters) {
		this.statusFilters = pStatusFilters;
	}
	public String getIataNumber() {
		return iataNumber;
	}
	public void setIataNumber(String iataNumber) {
		this.iataNumber = iataNumber;
	}
	/**
	 * @return the accountNumbers
	 */
	public List<String> getAccountNumbers() {
		return this.accountNumbers;
	}
	/**
	 * @param pAccountNumbers the accountNumbers to set
	 */
	public void setAccountNumbers(final List<String> pAccountNumbers) {
		this.accountNumbers = pAccountNumbers;
	}

}
