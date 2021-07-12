package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.AutoAddSourceType;
import com.unisys.trans.logistics.lms.framework.constants.ParticipantCodeType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AirwaybillDto</code> is used for find Airwaybill information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>accountNumber
 * <li>accountNumber1
 * <li>accountNumber2
 * <li>autoAddSourceType
 * <li>ccsfCargoScreeningFacilityNo
 * <li>contactDetails
 * <li>customerSegmentation
 * <li>deleteIndicator
 * <li>establishedDate
 * <li>frequentFlyerNumber
 * <li>governmentAccountNumber
 * <li>iataAccount
 * <li>oId
 * <li>oneTimeParticipantIndicator
 * <li>participantName
 * <li>participantOId
 * <li>participantType
 * <li>prefAccountNumber
 * <li>securityDocumentID
 * <li>securityID
 * <li>station
 * <li>retainIndex
 * </ul>
 */
public class HouseAirWaybillParticipantDto implements Serializable {

	/**
	 * unique serial version UID.
	 */
	private static final long serialVersionUID = -4853212732399235747L;

	/**
	 * Attribute to hold primary account number for the participant.
	 * 
	 */
	private String accountNumber;

	/**
	 * Attribute to holds <code>accountNumber</code> property.
	 */
	private String accountNumber1;

	/**
	 * Attribute to holds <code>accountNumber</code> property.
	 */
	private String accountNumber2;

	/**
	 * Attribute to holds <code>autoAddSourceType</code> property.
	 */
	private AutoAddSourceType autoAddSourceType;

	/**
	 * This method used to check whether the Participant Details provided in
	 * AirwayBill is equal to the Participant Information.
	 * <p>
	 * 
	 * @param pAWBParticipantDto
	 *            holds the Participant Details provided in AirwayBill.
	 */
	/**
	 * Attribute to holds <code>automatic capture of broker indicator</code>
	 * property.
	 */

	private boolean automaticBrkrIndctr;

	/**
	 * Attribute to holds <code>ccsfCargoScreeningFacilityNo</code> property.
	 */
	private String ccsfCargoScreeningFacilityNo;

	/**
	 * Attribute to holds <code>contactDetails</code> property.
	 */
	private ContactDto contactDetails;

	/**
	 * Attribute to holds <code>CREDITTOTALFORAWB</code> property.
	 */

	private String creditTotalforAwb;

	/**
	 * Attribute to holds <code>creditTotal</code> property.
	 */
	private BigDecimal creditTotal;

	/**
	 * Attribute to hold <code>currencyCode</code> property. Currency
	 * corresponding to the Credit limit. Mandatory if credit limit field is
	 * present, else protected. Only users with special privileges can update
	 * this field. The currency code is validated against the currency table.
	 */
	private String currencyCode;

	/**
	 * Attribute to holds <code>customerSegmentation</code> property.
	 */
	private String customerSegmentation;

	/**
	 * Attribute to holds <code>deleteIndicator</code> property.
	 */
	private boolean deleteIndicator;

	/**
	 * Attribute to holds <code>establishedDate</code> property.
	 */
	private Date establishedDate;

	/**
	 * Attribute to holds <code>frequentFlyerNumber</code> property.
	 */
	private String frequentFlyerNumber;

	/**
	 * Attribute to holds <code>governmentAccountNumber</code> property.
	 */
	private String governmentAccountNumber;

	/**
	 * Attribute to holds <code>accountNumber</code> property.
	 */
	private String iataAccount;

	/**
	 * Attribute to holds <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to holds <code> oneTimeParticipantIndicator</code> property.
	 */
	private boolean oneTimeParticipantIndicator;

	/**
	 * Attribute to holds <code>participantName</code> property.
	 */
	private String participantName;

	/**
	 * Attribute to holds <code>participantOId</code> property.
	 */
	private Long participantOId;

	/**
	 * Attribute to holds <code>participantOId</code> property.
	 */
	private Long participantOID;

	/**
	 * Attribute to holds <code>participantType</code> property.
	 */
	private ParticipantCodeType participantType;

	/**
	 * Attribute to holds <code>prefAccountNumber</code> property.
	 */
	private String prefAccountNumber;

	/**
	 * Attribute to holds <code>ratingLineIndicator</code> property.
	 */
	private boolean ratingLineIndicator;

	/**
	 * Attribute to holds <code>retainIndex</code> property.
	 */
	private boolean retainIndex;

	/**
	 * Attribute to holds <code>securityDocumentID</code> property.
	 */
	private String securityDocumentID;

	/**
	 * Attribute to holds <code>securityID</code> property.
	 */
	private String securityID;

	/**
	 * Attribute to holds <code>station</code> property.
	 */
	private String station;

	/**
	 * Gets the <code>Serialversionuid</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>Serialversionuid</code> property.
	 */

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result
				+ ((accountNumber1 == null) ? 0 : accountNumber1.hashCode());
		result = prime * result
				+ ((accountNumber2 == null) ? 0 : accountNumber2.hashCode());
		result = prime * result
				+ ((participantName == null) ? 0 : participantName.hashCode());
		result = prime * result + ((station == null) ? 0 : station.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object pAWBParticipantDto) {

		boolean isParticipantEqual = false;

		if (pAWBParticipantDto instanceof HouseAirWaybillParticipantDto) {

			final HouseAirWaybillParticipantDto aAirWaybillParticipantDto = (HouseAirWaybillParticipantDto) pAWBParticipantDto;

			if (this.getOId() != null
					&& aAirWaybillParticipantDto.getOId() != null
					&&

					this.getOId().equals(aAirWaybillParticipantDto.getOId())
					&&

					this.getParticipantType().equals(
							aAirWaybillParticipantDto.getParticipantType())

			) {

				isParticipantEqual = true;
			} else if (this.getAccountNumber1() != null
					&& aAirWaybillParticipantDto.getAccountNumber1() != null
					&& this.getAccountNumber1().equals(
							aAirWaybillParticipantDto.getAccountNumber1())
					&& this.getParticipantType().equals(
							aAirWaybillParticipantDto.getParticipantType())) {

				isParticipantEqual = true;

			} else if (this.getAccountNumber2() != null
					&& aAirWaybillParticipantDto.getAccountNumber2() != null
					&& this.getAccountNumber2().equals(
							aAirWaybillParticipantDto.getAccountNumber2())
					&&

					this.getParticipantType().equals(
							aAirWaybillParticipantDto.getParticipantType())) {
				isParticipantEqual = true;
			} else if (this.getIataAccount() != null
					&& aAirWaybillParticipantDto.getIataAccount() != null
					&& this.getIataAccount().equals(
							aAirWaybillParticipantDto.getIataAccount())
					&&

					this.getParticipantType().equals(
							aAirWaybillParticipantDto.getParticipantType())) {
				isParticipantEqual = true;
			} else if (this.getGovernmentAccountNumber() != null
					&& aAirWaybillParticipantDto.getGovernmentAccountNumber() != null
					&& this.getGovernmentAccountNumber().equals(
							aAirWaybillParticipantDto
									.getGovernmentAccountNumber())
					&&

					this.getParticipantType().equals(
							aAirWaybillParticipantDto.getParticipantType())) {
				isParticipantEqual = true;
			} else if (this.getStation() != null
					&& aAirWaybillParticipantDto.getStation() != null
					&& this.getParticipantName() != null
					&& aAirWaybillParticipantDto.getParticipantName() != null
					&& this.getStation().equals(
							aAirWaybillParticipantDto.getStation())
					&& this.getParticipantName().equals(
							aAirWaybillParticipantDto.getParticipantName())
					&& this.getParticipantType().equals(
							aAirWaybillParticipantDto.getParticipantType())) {
				isParticipantEqual = true;
			}

		}

		return isParticipantEqual;
	}

	/**
	 * Gets the <code>accountNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>accountNumber</code> property.
	 */
	public String getAccountNumber() {
		return this.accountNumber;
	}

	/**
	 * Gets the <code>accountNumber1</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>accountNumber1</code> property.
	 */
	public String getAccountNumber1() {
		return this.accountNumber1;
	}

	/**
	 * Gets the <code>accountNumber2</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>accountNumber2</code> property.
	 */
	public String getAccountNumber2() {
		return this.accountNumber2;
	}

	/**
	 * Gets the <code>autoAddSourceType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>autoAddSourceType</code> property.
	 */
	public AutoAddSourceType getAutoAddSourceType() {
		return this.autoAddSourceType;
	}

	/**
	 * Gets the <code>ccsfCargoScreeningFacilityNo</code> property.
	 * <p>
	 * 
	 * @return the current value of the
	 *         <code>ccsfCargoScreeningFacilityNo</code> property.
	 */
	public String getCcsfCargoScreeningFacilityNo() {
		return this.ccsfCargoScreeningFacilityNo;
	}

	/**
	 * Gets the <code>contactDetails</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>contactDetails</code> property.
	 */

	public ContactDto getContactDetails() {
		if (this.contactDetails == null) {
			this.contactDetails = new ContactDto();
		}
		return this.contactDetails;
	}

	/**
	 * Gets the <code>creditTotalforAwb</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>creditTotalforAwb</code> property.
	 */
	public String getCreditTotalforAwb() {
		return this.creditTotalforAwb;
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
	 * Gets the <code>customerSegmentation</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>customerSegmentation</code>
	 *         property.
	 */
	public String getCustomerSegmentation() {
		return this.customerSegmentation;
	}

	/**
	 * Gets the <code>deleteIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>deleteIndicator</code> property.
	 */

	public boolean getDeleteIndicator() {
		return this.deleteIndicator;
	}

	/**
	 * Gets the <code>establishedDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>establishedDate</code> property.
	 */
	public Date getEstablishedDate() {
		return ContractUtility.getClonedDate(this.establishedDate);
	}

	/**
	 * Gets the <code>frequentFlyerNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>frequentFlyerNumber</code>
	 *         property.
	 */
	public String getFrequentFlyerNumber() {
		return this.frequentFlyerNumber;
	}

	/**
	 * Gets the <code>governmentAccountNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>governmentAccountNumber</code>
	 *         property.
	 */
	public String getGovernmentAccountNumber() {
		return this.governmentAccountNumber;
	}

	/**
	 * Gets the <code>iataAccount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>iataAccount</code> property.
	 */
	public String getIataAccount() {
		return this.iataAccount;
	}

	/**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.
	 */
	public Long getOId() {
		return this.oId;
	}

	/**
	 * Gets the <code>oneTimeParticipantIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>oneTimeParticipantIndicator</code>
	 *         property.
	 */
	public boolean getOneTimeParticipantIndicator() {
		return this.oneTimeParticipantIndicator;
	}

	/**
	 * Gets the <code>participantName</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantName</code> property.
	 */
	public String getParticipantName() {
		return this.participantName;
	}

	/**
	 * Gets the <code>participantOId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantOId</code> property.
	 */
	public Long getParticipantOId() {
		return this.participantOId;
	}

	/**
	 * Gets the <code>participantOID</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantOID</code> property.
	 */
	public Long getParticipantOID() {
		return this.participantOID;
	}

	/**
	 * Gets the <code>houseAirwaybills</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>houseAirwaybills</code> property.
	 */
	public ParticipantCodeType getParticipantType() {
		return this.participantType;
	}

	/**
	 * Gets the <code>prefAccountNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>prefAccountNumber</code> property.
	 */
	public String getPrefAccountNumber() {
		return this.prefAccountNumber;
	}

	/**
	 * Gets the <code>securityDocumentID</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>securityDocumentID</code>
	 *         property.
	 */
	public String getSecurityDocumentID() {
		return this.securityDocumentID;
	}

	/**
	 * Gets the <code>securityID</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>securityID</code> property.
	 */
	public String getSecurityID() {
		return this.securityID;
	}

	/**
	 * Gets the <code>station</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>station</code> property.
	 */

	public String getStation() {
		return this.station;
	}

	/**
	 * Gets the <code>AutomaticBrkrIndctr</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>AutomaticBrkrIndctr</code>
	 *         property.
	 */

	public boolean isAutomaticBrkrIndctr() {
		return this.automaticBrkrIndctr;
	}

	/**
	 * Gets the <code>RatingLineIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>RatingLineIndicator</code>
	 *         property.
	 */

	public boolean isRatingLineIndicator() {
		return this.ratingLineIndicator;
	}

	/**
	 * Gets the <code>retainIndex</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>retainIndex</code> property.
	 */

	public boolean isRetainIndex() {
		return this.retainIndex;
	}

	/**
	 * Sets the <code>accountNumber</code> property.
	 * <p>
	 * 
	 * @param pAccountNumber
	 *            holds the new value of <code>accountNumber</code>.<br>
	 */
	public void setAccountNumber(final String pAccountNumber) {
		this.accountNumber = ContractUtility.convertToUpperCase(pAccountNumber);
	}

	/**
	 * Sets the <code>accountNumber1</code> property.
	 * <p>
	 * 
	 * @param pAccountNumber1
	 *            holds the new value of <code>accountNumber1</code>.<br>
	 */
	public void setAccountNumber1(final String pAccountNumber1) {

		this.accountNumber1 = ContractUtility
				.convertToUpperCase(pAccountNumber1);
	}

	/**
	 * Sets the <code>accountNumber2</code> property.
	 * <p>
	 * 
	 * @param pAccountNumber2
	 *            the new value of <code>accountNumber2</code> property.<br>
	 */
	public void setAccountNumber2(final String pAccountNumber2) {
		this.accountNumber2 = ContractUtility
				.convertToUpperCase(pAccountNumber2);
	}

	/**
	 * Sets the <code>autoAddSourceType</code> property.
	 * <p>
	 * 
	 * @param pAutoAddSourceType
	 *            the new value of <code>autoAddSourceType</code> property.<br>
	 */
	public void setAutoAddSourceType(final AutoAddSourceType pAutoAddSourceType) {
		this.autoAddSourceType = pAutoAddSourceType;
	}

	/**
	 * Sets the <code>AutomaticBrkrIndctr</code> property.
	 * <p>
	 * 
	 * @param pAutomaticBrkrIndctr
	 *            the new value of <code>AutomaticBrkrIndctr</code> property.<br>
	 */
	public void setAutomaticBrkrIndctr(final boolean pAutomaticBrkrIndctr) {
		this.automaticBrkrIndctr = pAutomaticBrkrIndctr;
	}

	/**
	 * Sets the <code>ccsfCargoScreeningFacilityNo</code> property.
	 * <p>
	 * 
	 * @param pCcsfCargoScreeningFacilityNo
	 *            the new value of <code>ccsfCargoScreeningFacilityNo</code>
	 *            property.<br>
	 */
	public void setCcsfCargoScreeningFacilityNo(
			final String pCcsfCargoScreeningFacilityNo) {
		this.ccsfCargoScreeningFacilityNo = pCcsfCargoScreeningFacilityNo;
	}

	/**
	 * Sets the <code>contactDetails</code> property.
	 * <p>
	 * 
	 * @param pContactDetails
	 *            the new value of <code>contactDetails</code> property.<br>
	 */
	public void setContactDetails(final ContactDto pContactDetails) {
		this.contactDetails = pContactDetails;
	}

	/**
	 * Sets the <code>creditTotalforAwb</code> property.
	 * <p>
	 * 
	 * @param pCreditTotalforAwb
	 *            the new value of <code>creditTotalforAwb</code> property.<br>
	 */
	public void setCreditTotalforAwb(final String pCreditTotalforAwb) {
		this.creditTotalforAwb = ContractUtility
				.convertToUpperCase(pCreditTotalforAwb);
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
	 * @param pCurrencyCode
	 *            the new value of <code>currencyCode</code> property.<br>
	 */
	public void setCurrencyCode(final String pCurrencyCode) {
		this.currencyCode = ContractUtility.convertToUpperCase(pCurrencyCode);
	}

	/**
	 * Sets the <code>customerSegmentation</code> property.
	 * <p>
	 * 
	 * @param pCustomerSegmentation
	 *            the new value of <code>customerSegmentation</code> property.<br>
	 */
	public void setCustomerSegmentation(final String pCustomerSegmentation) {
		this.customerSegmentation = ContractUtility
				.convertToUpperCase(pCustomerSegmentation);
	}

	/**
	 * Sets the <code>deleteIndicator</code> property.
	 * <p>
	 * 
	 * @param pDeleteIndicator
	 *            the new value of the <code>deleteIndicator</code> property.
	 */
	public void setDeleteIndicator(final boolean pDeleteIndicator) {
		this.deleteIndicator = pDeleteIndicator;
	}

	/**
	 * Sets the <code>establishedDate</code> property.
	 * <p>
	 * 
	 * @param pEstablishedDate
	 *            the new value of the <code>establishedDate</code> property.
	 */
	public void setEstablishedDate(final Date pEstablishedDate) {
		this.establishedDate = ContractUtility.getClonedDate(pEstablishedDate);
	}

	/**
	 * Sets the <code>frequentFlyerNumber</code> property.
	 * <p>
	 * 
	 * @param pFrequentFlyerNumber
	 *            the new value of the <code>frequentFlyerNumber</code>
	 *            property.
	 */
	public void setFrequentFlyerNumber(final String pFrequentFlyerNumber) {
		this.frequentFlyerNumber = ContractUtility
				.convertToUpperCase(pFrequentFlyerNumber);
	}

	/**
	 * Sets the <code>governmentAccountNumber</code> property.
	 * <p>
	 * 
	 * @param pGovernmentAccountNumber
	 *            the new value of the <code>governmentAccountNumber</code>
	 *            property.
	 */
	public void setGovernmentAccountNumber(final String pGovernmentAccountNumber) {
		this.governmentAccountNumber = ContractUtility
				.convertToUpperCase(pGovernmentAccountNumber);
	}

	/**
	 * Sets the <code>iataAccount</code> property.
	 * <p>
	 * 
	 * @param pIataAccount
	 *            the new value of <code>iataAccount</code> property.<br>
	 */
	public void setIataAccount(final String pIataAccount) {
		this.iataAccount = ContractUtility.convertToUpperCase(pIataAccount);
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * the new value of the <code>oId</code> property.
	 */

	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Sets the <code>oneTimeParticipantIndicator</code> property.
	 * <p>
	 * 
	 * @param pOneTimeParticipantIndicator
	 *            the new value of <code>oneTimeParticipantIndicator</code>
	 *            property.<br>
	 */
	public void setOneTimeParticipantIndicator(
			final boolean pOneTimeParticipantIndicator) {
		this.oneTimeParticipantIndicator = pOneTimeParticipantIndicator;
	}

	/**
	 * Sets the <code>participantName</code> property.
	 * <p>
	 * 
	 * @param pParticipantName
	 *            the new value of the <code>participantName</code> property.
	 */

	public void setParticipantName(final String pParticipantName) {
		this.participantName = pParticipantName;
	}

	/**
	 * Sets the <code>participantOId</code> property.
	 * <p>
	 * 
	 * @param pParticipantOId
	 *            the new value of <code>participantOId</code> property.<br>
	 */
	public void setParticipantOId(final Long pParticipantOId) {
		this.participantOId = pParticipantOId;
	}

	/**
	 * Sets the <code>participantOID</code> property.
	 * <p>
	 * 
	 * @param pParticipantOID
	 *            the new value of <code>participantOID</code> property.<br>
	 */
	public void setParticipantOID(final Long pParticipantOID) {
		this.participantOID = pParticipantOID;
	}

	/**
	 * Sets the <code>participantType</code> property.
	 * <p>
	 * 
	 * @param pParticipantType
	 *            the new value of the <code>participantType</code> property.
	 */

	public void setParticipantType(final ParticipantCodeType pParticipantType) {
		this.participantType = pParticipantType;
	}

	/**
	 * Sets the <code>prefAccountNumber</code> property.
	 * <p>
	 * 
	 * @param pPrefAccountNumber
	 *            the new value of <code>prefAccountNumber</code> property.<br>
	 */

	public void setPrefAccountNumber(final String pPrefAccountNumber) {
		this.prefAccountNumber = ContractUtility
				.convertToUpperCase(pPrefAccountNumber);
	}

	/**
	 * Sets the <code>ratingLineIndicator</code> property.
	 * <p>
	 * 
	 * @param pRatingLineIndicator
	 *            the new value of <code>ratingLineIndicator</code> property.<br>
	 */
	public void setRatingLineIndicator(final boolean pRatingLineIndicator) {
		this.ratingLineIndicator = pRatingLineIndicator;
	}

	/**
	 * Sets the <code>securityDocumentID</code> property.
	 * <p>
	 * 
	 * @param pSecurityDocumentID
	 *            the new value of <code>securityDocumentID</code> property.<br>
	 */

	public void setSecurityDocumentID(final String pSecurityDocumentID) {
		this.securityDocumentID = ContractUtility
				.convertToUpperCase(pSecurityDocumentID);
	}

	/**
	 * Sets the <code>securityID</code> property.
	 * <p>
	 * 
	 * @param pSecurityID
	 *            the new value of <code>securityID</code> property.<br>
	 */
	public void setSecurityID(final String pSecurityID) {
		this.securityID = ContractUtility.convertToUpperCase(pSecurityID);
	}

	/**
	 * Sets the <code>station</code> property.
	 * <p>
	 * 
	 * @param pStation
	 *            the new value of the <code>station</code> property.
	 */

	public void setStation(final String pStation) {
		this.station = ContractUtility.convertToUpperCase(pStation);
	}

	/**
	 * Sets the <code>retainIndex</code> property.
	 * <p>
	 * 
	 * @param pStation
	 *            the new value of the <code>retainIndex</code> property.
	 */

	public void setRetainIndex(final boolean pRetainIndex) {
		this.retainIndex = pRetainIndex;
	}

	/**
	 * Gets the <code>creditTotal</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>creditTotal</code> property.
	 */
	public BigDecimal getCreditTotal() {
		return this.creditTotal;
	}

	/**
	 * Sets the <code>creditTotalForAwb</code> property.
	 * <p>
	 * 
	 * @param pCreditTotal
	 *            the new value of the <code>creditTotal</code> property.
	 */
	public void setCreditTotal(final BigDecimal pCreditTotal) {
		this.creditTotal = pCreditTotal;
	}

}
