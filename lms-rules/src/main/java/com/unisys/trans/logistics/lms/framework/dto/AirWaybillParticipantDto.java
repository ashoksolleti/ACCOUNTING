package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
 * <li>airwaybillRetainIndex
 * <li>localParticipantName
 * </ul>
 */
public class AirWaybillParticipantDto implements Serializable {

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
	 * Attribute to hold <code>adhocNotificationStatus</code> property.
	 */
	private List<String> adhocNotificationStatus;

	/**
	 * Attribute to holds <code>airwaybillRetainIndex</code> property.
	 */
	private boolean airwaybillRetainIndex;

	/**
	 * Attribute to holds <code>autoAddSourceType</code> property.
	 */
	private AutoAddSourceType autoAddSourceType;

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
	 * Attribute to holds <code>creditTotal</code> property.
	 */
	private BigDecimal creditTotal;

	/**
	 * Attribute to holds <code>creditTotalCurrency</code> property.
	 */
	private String creditTotalCurrency;

	/**
	 * Attribute to holds <code>creditTotalforAwb</code> property.
	 */
	private String creditTotalforAwb;

	/**
	 * Attribute to holds <code>customerSegmentation</code> property.
	 */
	private String customerSegmentation;

	/**
	 * Attribute to holds <code>deleteIndicator</code> property.
	 */
	private boolean deleteIndicator;

	/**
	 * Attribute to hold <code>eMailAddress</code> property.
	 */
	private String eMailAddress;

	/**
	 * Attribute to holds <code>participantName</code> property.
	 */
	private Date establishedDate;

	/**
	 * Attribute to holds <code>participantName</code> property.
	 */
	private Date expiredDate;

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
	 * Attribute to hold <code>localAddress</code> property.
	 */
	private String localAddress;

	/**
	 * Attribute to hold <code>localCity</code> property.
	 */
	private String localCity;

	/**
	 * Attribute to hold <code>localCountry</code> property.
	 */
	private String localCountry;

	/**
	 * Attribute to holds <code>localParticipantName</code> property.
	 */
	private String localParticipantName;

	/**
	 * Attribute to hold <code>localPostalCode</code> property.
	 */
	private String localPostalCode;

	/**
	 * Attribute to hold <code>localState</code> property.
	 */
	private String localState;

	/**
	 * Attribute to holds <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to holds <code>one TimeAirWaybillParticipantDtoindicator</code>
	 * property.
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
	 * Attribute to holds <code>participantRemarks</code> property.
	 */
	private String participantRemarks;

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

	private String securityCountry;

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
	
	
	private String participantShortName;
	
	/**
	 * Attribute to holds <code>participantTypeCode</code> property.
	 */
	private String participantTypeCode;
	
	/**
	 * Attribute to holds <code>dbkey</code> property.
	 */
	private String dbkey;
	
	
	/**
	 * Attribute to holds <code>accountID</code> property.
	 */
	private String accountID;
	
	/**
	 * Attribute to holds <code>accountID</code> property.
	 */
	private String loyalityInd;
	
	
	/**
	 * Attribute to holds <code>accountID</code> property.
	 */
	private String specAirlineCode;;
	/**
	 * Gets the <code>serialVersionUID</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>serialVersionUID</code> property.
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * equals two <code>AirWaybillParticipantDto</code> propertis.
	 * <p>
	 * 
	 * @param pAWBParticipantDto
	 *            the new value of the <code>AirWaybillParticipantDto</code>
	 *            property.
	 * 
	 * @return the compare result of the <code>AirWaybillParticipantDto</code>
	 *         properties.
	 */
	@Override
	public boolean equals(final Object pAWBParticipantDto) {

		boolean isParticipantEqual = false;

		if (pAWBParticipantDto instanceof AirWaybillParticipantDto) {

			final AirWaybillParticipantDto aAirWaybillParticipantDto = (AirWaybillParticipantDto) pAWBParticipantDto;
			if (this.getParticipantType().equals(
					aAirWaybillParticipantDto.getParticipantType())) {
				if (this.getOId() != null
						&& aAirWaybillParticipantDto.getOId() != null) {
					if (this.getOId()
							.equals(aAirWaybillParticipantDto.getOId())) {
						isParticipantEqual = true;
					}
				} else if (this.getAccountNumber1() != null
						&& aAirWaybillParticipantDto.getAccountNumber1() != null) {
					if (this.getAccountNumber1().equals(
							aAirWaybillParticipantDto.getAccountNumber1())) {
						isParticipantEqual = true;
					}

				} else if (this.getAccountNumber2() != null
						&& aAirWaybillParticipantDto.getAccountNumber2() != null) {
					if (this.getAccountNumber2().equals(
							aAirWaybillParticipantDto.getAccountNumber2())) {
						isParticipantEqual = true;
					}
				} else if (this.getIataAccount() != null
						&& aAirWaybillParticipantDto.getIataAccount() != null) {
					if (this.getIataAccount().equals(
							aAirWaybillParticipantDto.getIataAccount())) {
						isParticipantEqual = true;
					}
				} else if (this.getGovernmentAccountNumber() != null
						&& aAirWaybillParticipantDto
								.getGovernmentAccountNumber() != null) {
					if (this.getGovernmentAccountNumber().equals(
							aAirWaybillParticipantDto
									.getGovernmentAccountNumber())) {
						isParticipantEqual = true;
					}
				} else if (this.getStation() != null
						&& aAirWaybillParticipantDto.getStation() != null
						&& this.getParticipantName() != null
						&& aAirWaybillParticipantDto.getParticipantName() != null
						&& this.getStation().equals(
								aAirWaybillParticipantDto.getStation())
						&& this.getParticipantName().equals(
								aAirWaybillParticipantDto.getParticipantName())) {
					if (aAirWaybillParticipantDto.getContactDetails() != null
							&& aAirWaybillParticipantDto.getContactDetails()
									.getAddress() != null
							&& this.getContactDetails() != null
							&& this.getContactDetails().getAddress() != null) {
						if (aAirWaybillParticipantDto
								.getContactDetails()
								.getAddress()
								.equalsIgnoreCase(
										this.getContactDetails().getAddress())) {
							isParticipantEqual = true;
						}
					} else {
						isParticipantEqual = true;
					}
				}
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
	 * @return the adhocNotificationStatus
	 */
	public List<String> getAdhocNotificationStatus() {
		if (this.adhocNotificationStatus == null) {
			this.adhocNotificationStatus = new ArrayList<String>();
		}
		return this.adhocNotificationStatus;
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
	 * Gets the <code>creditTotal</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>creditTotal</code> property.
	 */
	public BigDecimal getCreditTotal() {
		return this.creditTotal;
	}

	/**
	 * Gets the <code>creditTotalforAwb</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>creditTotalforAwb</code> property.
	 */
	public String getCreditTotalforAwb() {
		return this.creditTotalforAwb;
	}

	/**
	 * Gets the <code>creditTotalCurrency</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>creditTotalCurrency</code>
	 *         property.
	 */
	public String getCreditTotalsCurrency() {
		return this.creditTotalCurrency;
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
	 * @return the eMailAddress
	 */
	public String geteMailAddress() {
		return this.eMailAddress;
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
	 * @return the expiredDate
	 */
	public Date getExpiredDate() {
		if (expiredDate != null) {
			return (Date) expiredDate.clone();
		} else {
			return null;
		}
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
	 * Gets the <code>localAddress</code> property.
	 * 
	 * @return the current value of the <code>localAddress</code> property.
	 */
	public String getLocalAddress() {
		return this.localAddress;
	}

	/**
	 * Gets the <code>localCity</code> property.
	 * 
	 * @return the current value of the <code>localCity</code> property.
	 */
	public String getLocalCity() {
		return this.localCity;
	}

	/**
	 * Gets the <code>localCountry</code> property.
	 * 
	 * @return the current value of the <code>localCountry</code> property.
	 */
	public String getLocalCountry() {
		return this.localCountry;
	}

	/**
	 * Gets the <code>localParticipantName</code> property.
	 * 
	 * @return the current value of the <code>localParticipantName</code>
	 *         property.
	 */
	public String getLocalParticipantName() {
		return localParticipantName;
	}

	/**
	 * Gets the <code>localPostalCode</code> property.
	 * 
	 * @return the current value of the <code>localPostalCode</code> property.
	 */
	public String getLocalPostalCode() {
		return this.localPostalCode;
	}

	/**
	 * Gets the <code>localState</code> property.
	 * 
	 * @return the current value of the <code>localState</code> property.
	 */
	public String getLocalState() {
		return this.localState;
	}

	/**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>oId</code> property.
	 */
	public Long getoId() {
		return this.oId;
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
	 * Gets the <code>participantRemarks</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantRemarks</code>
	 *         property.
	 */
	public String getParticipantRemarks() {
		return this.participantRemarks;
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
	 * Gets the <code>securityCountry</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>securityCountry</code> property.
	 */
	public String getSecurityCountry() {
		return this.securityCountry;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((oId == null) ? 0 : oId.hashCode());
		return result;
	}

	/**
	 * Gets the <code>airwaybillRetainIndex</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>airwaybillRetainIndex</code>
	 *         property.
	 */

	public boolean isAirwaybillRetainIndex() {
		return this.airwaybillRetainIndex;
	}

	/**
	 * Gets the <code>automaticBrkrIndctr</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>automaticBrkrIndctr</code>
	 *         property.
	 */
	public boolean isAutomaticBrkrIndctr() {
		return this.automaticBrkrIndctr;
	}

	/**
	 * Gets the <code>ratingLineIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>ratingLineIndicator</code>
	 *         property.
	 */
	public boolean isRatingLineIndicator() {
		return this.ratingLineIndicator;
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

		this.accountNumber1 = ContractUtility.convertToUpperCase(pAccountNumber1);
	}

	/**
	 * Sets the <code>accountNumber2</code> property.
	 * <p>
	 * 
	 * @param pAccountNumber2
	 *            the new value of <code>accountNumber2</code> property.<br>
	 */
	public void setAccountNumber2(final String pAccountNumber2) {
		this.accountNumber2 = ContractUtility.convertToUpperCase(pAccountNumber2);
	}

	/**
	 * @param adhocNotificationStatus
	 *            the adhocNotificationStatus to set
	 */
	public void setAdhocNotificationStatus(
			final List<String> pAdhocNotificationStatus) {
		this.adhocNotificationStatus = pAdhocNotificationStatus;
	}

	/**
	 * Sets the <code>airwaybillRetainIndex</code> property.
	 * <p>
	 * 
	 * @param pStation
	 *            the new value of the <code>airwaybillRetainIndex</code>
	 *            property.
	 */

	public void setAirwaybillRetainIndex(final boolean pAirwaybillRetainIndex) {
		this.airwaybillRetainIndex = pAirwaybillRetainIndex;
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
	 * Sets the <code>automaticBrkrIndctr</code>.
	 * <p>
	 * 
	 * @param pAutomaticBrkrIndctr
	 *            holds the new value of <code>automaticBrkrIndctr</code>
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
	 * Sets the <code>creditTotalForAwb</code> property.
	 * <p>
	 * 
	 * @param pCreditTotal
	 *            the new value of the <code>creditTotal</code> property.
	 */
	public void setCreditTotal(final BigDecimal pCreditTotal) {
		this.creditTotal = pCreditTotal;
	}

	/**
	 * Sets the <code>creditTotalforAwb</code> property.
	 * <p>
	 * 
	 * @param pCreditTotalforAwb
	 *            the new value of <code>creditTotalforAwb</code> property.
	 */
	public void setCreditTotalforAwb(final String pCreditTotalforAwb) {
		this.creditTotalforAwb = pCreditTotalforAwb;
	}

	/**
	 * Sets the <code>creditTotalCurrency</code> property.
	 * <p>
	 * 
	 * @param pCreditTotalCurrency
	 *            the new value of the <code>creditTotalCurrency</code>
	 *            property.
	 */
	public void setCreditTotalsCurrency(final String pCreditTotalCurrency) {
		this.creditTotalCurrency = pCreditTotalCurrency;
	}

	/**
	 * Sets the <code>customerSegmentation</code> property.
	 * <p>
	 * 
	 * @param pCustomerSegmentation
	 *            the new value of <code>customerSegmentation</code> property.<br>
	 */
	public void setCustomerSegmentation(final String pCustomerSegmentation) {
		this.customerSegmentation = pCustomerSegmentation;
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
	 * @param eMailAddress
	 *            the eMailAddress to set
	 */
	public void seteMailAddress(final String pEMailAddress) {
		this.eMailAddress = pEMailAddress;
	}

	/**
	 * Sets the <code>establishedDate</code> property.
	 * <p>
	 * 
	 * @param pEstablishedDate
	 *            the new value of the <code>establishedDate</code> property.
	 */
	public void setEstablishedDate(final Date pEstablishedDate) {
		if(pEstablishedDate!=null){
		this.establishedDate = (Date) pEstablishedDate.clone();}
		else{
			this.establishedDate=null;
	}
	}

	/**
	 * @param pExpiredDate
	 *            the expiredDate to set
	 */
	public void setExpiredDate(Date pExpiredDate) {
		if (pExpiredDate != null) {
			this.expiredDate = (Date) pExpiredDate.clone();
		} else {
			this.expiredDate = null;
		}
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
		this.frequentFlyerNumber = pFrequentFlyerNumber;
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
		this.governmentAccountNumber = pGovernmentAccountNumber;
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
	 * Sets the <code>localAddress</code> property.
	 * 
	 * @param pLocalAddress
	 *            the current value of the <code>localAddress</code> property.
	 */
	public void setLocalAddress(final String pLocalAddress) {
		this.localAddress = pLocalAddress;
	}

	/**
	 * Sets the <code>localCity</code> property.
	 * 
	 * @param pLocalCity
	 *            the current value of the <code>localCity</code> property.
	 */
	public void setLocalCity(final String pLocalCity) {
		this.localCity = pLocalCity;
	}

	/**
	 * Sets the <code>localCountry</code> property.
	 * 
	 * @param pLocalCountry
	 *            the current value of the <code>localCountry</code> property.
	 */
	public void setLocalCountry(final String pLocalCountry) {
		this.localCountry = pLocalCountry;
	}

	/**
	 * Sets the <code>localParticipantName</code> property.
	 * 
	 * @param pLocalParticipantName
	 *            the current value of the <code>localParticipantName</code>
	 *            property.
	 */
	public void setLocalParticipantName(final String pLocalParticipantName) {
		this.localParticipantName = pLocalParticipantName;
	}

	/**
	 * Sets the <code>localPostalCode</code> property.
	 * 
	 * @param pLocalPostalCode
	 *            the current value of the <code>localPostalCode</code>
	 *            property.
	 */
	public void setLocalPostalCode(final String pLocalPostalCode) {
		this.localPostalCode = pLocalPostalCode;
	}

	/**
	 * Sets the <code>localState</code> property.
	 * 
	 * @param pLocalState
	 *            the current value of the <code>localState</code> property.
	 */
	public void setLocalState(final String pLocalState) {
		this.localState = pLocalState;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * @param p0Id
	 *            the new value of the <code>oId</code> property.
	 */

	public void setoId(final Long pOId) {
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
	 * Sets the <code>participantRemarks</code> property.
	 * <p>
	 * 
	 * @param pParticipantRemarks
	 *            the new value of <code>participantRemarks</code> property.<br>
	 */
	public void setParticipantRemarks(final String pParticipantRemarks) {
		this.participantRemarks = pParticipantRemarks;
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
		this.prefAccountNumber = pPrefAccountNumber;
	}

	/**
	 * Sets the <code>ratingLineIndicator</code>.
	 * <p>
	 * 
	 * @param pRatingLineIndicator
	 *            holds the new value of <code>ratingLineIndicator</code>
	 */
	public void setRatingLineIndicator(final boolean pRatingLineIndicator) {
		this.ratingLineIndicator = pRatingLineIndicator;
	}

	/**
	 * Sets the <code>securityCountry</code> property.
	 * <p>
	 * 
	 * @param pSecurityCountry
	 *            holds the new value of <code>securityCountry</code>.<br>
	 */
	public void setSecurityCountry(final String pSecurityCountry) {
		this.securityCountry = pSecurityCountry;
	}

	/**
	 * Sets the <code>securityDocumentID</code> property.
	 * <p>
	 * 
	 * @param pSecurityDocumentID
	 *            the new value of <code>securityDocumentID</code> property.<br>
	 */

	public void setSecurityDocumentID(final String pSecurityDocumentID) {
		this.securityDocumentID = pSecurityDocumentID;
	}

	/**
	 * Sets the <code>securityID</code> property.
	 * <p>
	 * 
	 * @param pSecurityID
	 *            the new value of <code>securityID</code> property.<br>
	 */
	public void setSecurityID(final String pSecurityID) {
		this.securityID = pSecurityID;
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
	 * This method compares the old and new values of other charges
	 * <p>
	 * 
	 * @param pObj
	 *            holds the object of new other charges dto.
	 * @returns true if it does not matches and false if it matches
	 * 
	 **/

	public boolean matches(final Object pObj) {
		boolean isEqual = true;
		if (this == pObj) {
			isEqual = true;
		}
		if (pObj == null) {
			isEqual = false;
		}
		if (pObj != null && getClass() != pObj.getClass()) {
			isEqual = false;
		}
		final AirWaybillParticipantDto other = (AirWaybillParticipantDto) pObj;
		if (other != null) {
			if (participantName == null) {
				if (other.participantName != null) {
					isEqual = false;
				}
			} else if (!participantName.equals(other.participantName)) {
				isEqual = false;
			}

			if (station == null) {
				if (other.station != null) {
					isEqual = false;
				}
			} else if (!station.equals(other.station)) {
				isEqual = false;
			}

			if (governmentAccountNumber == null) {
				if (other.governmentAccountNumber != null) {
					isEqual = false;
				}
			} else if (!governmentAccountNumber
					.equals(other.governmentAccountNumber)) {
				isEqual = false;
			}

			if (accountNumber == null) {
				if (other.accountNumber != null) {
					isEqual = false;
				}
			} else if (!accountNumber.equals(other.accountNumber)) {
				isEqual = false;
			}

			if (eMailAddress == null) {
				if (other.eMailAddress != null) {
					isEqual = false;
				}
			} else if (!eMailAddress.equals(other.eMailAddress)) {
				isEqual = false;
			}

			if (frequentFlyerNumber == null) {
				if (other.frequentFlyerNumber != null) {
					isEqual = false;
				}
			} else if (!frequentFlyerNumber.equals(other.frequentFlyerNumber)) {
				isEqual = false;
			}

			if (establishedDate == null) {
				if (other.establishedDate != null) {
					isEqual = false;
				}
			} else if (!establishedDate.equals(other.establishedDate)) {
				isEqual = false;
			}

			if (ccsfCargoScreeningFacilityNo == null) {
				if (other.ccsfCargoScreeningFacilityNo != null) {
					isEqual = false;
				}
			} else if (!ccsfCargoScreeningFacilityNo
					.equals(other.ccsfCargoScreeningFacilityNo)) {
				isEqual = false;
			}

			if (securityID == null) {
				if (other.securityID != null) {
					isEqual = false;
				}
			} else if (!securityID.equals(other.securityID)) {
				isEqual = false;
			}
		}
		return isEqual;
	}

	/**
	 * @return the creditTotalCurrency
	 */
	public String getCreditTotalCurrency() {
		return creditTotalCurrency;
	}

	/**
	 * @param creditTotalCurrency the creditTotalCurrency to set
	 */
	public void setCreditTotalCurrency(String creditTotalCurrency) {
		this.creditTotalCurrency = creditTotalCurrency;
	}

	/**
	 * @return the participantTypeCode
	 */
	public String getParticipantTypeCode() {
		return participantTypeCode;
	}

	/**
	 * @param participantTypeCode the participantTypeCode to set
	 */
	public void setParticipantTypeCode(String participantTypeCode) {
		this.participantTypeCode = participantTypeCode;
	}

	/**
	 * @return the dbkey
	 */
	public String getDbkey() {
		return dbkey;
	}

	/**
	 * @param dbkey the dbkey to set
	 */
	public void setDbkey(String dbkey) {
		this.dbkey = dbkey;
	}

	/**
	 * @return the accountID
	 */
	public String getAccountID() {
		return accountID;
	}

	/**
	 * @param accountID the accountID to set
	 */
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	/**
	 * @return the loyalityInd
	 */
	public String getLoyalityInd() {
		return loyalityInd;
	}

	/**
	 * @param loyalityInd the loyalityInd to set
	 */
	public void setLoyalityInd(String loyalityInd) {
		this.loyalityInd = loyalityInd;
	}

	/**
	 * @return the specAirlineCode
	 */
	public String getSpecAirlineCode() {
		return specAirlineCode;
	}

	/**
	 * @param specAirlineCode the specAirlineCode to set
	 */
	public void setSpecAirlineCode(String specAirlineCode) {
		this.specAirlineCode = specAirlineCode;
	}
	
		public String getParticipantShortName() {
		return participantShortName;
	}

	public void setParticipantShortName(String participantShortName) {
		this.participantShortName = participantShortName;
	}
}
