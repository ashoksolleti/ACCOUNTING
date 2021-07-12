/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AWBParticipantType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.dto.ContactDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AccountingAirWaybillParticipant</code> contains the details of AccountingAirWaybillParticipantDto.
 * <p>
 * This contains all information about AccountingAirWaybillParticipantDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>billToAccountNumber
 * <li>iataAccountNumber
 * <li>contactDetails
 * <li>deleteIndicator
 * <li>frequentFlyerNumber
 * <li>oId
 * <li>participantName
 * <li>participantType
 * <li>station
 * <li>apsUsrIndicator
 * </ul>
 */

public class AccountingAirWaybillParticipantDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7635974577825296012L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>participantType</code> property.
     */
    private AWBParticipantType participantType;

    private ParticipantAccountType participantAccountType;

    /**
     * Attribute to hold <code>contactDto</code> property.
     */
    private ContactDto contactDto;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to hold <code>frequentFlyerNumber</code> property.
     */
    private String frequentFlyerNumber;

    /**
     * Attribute to hold <code>participantName</code> property.
     */
    private String participantName;

    /**
     * Attribute to hold <code>station</code> property.
     */
    private String station;

    /**
     * Attribute to hold <code>billToAccountNumber</code> property.
     */
    private String billToAccountNumber;

    /**
     * Attribute to hold <code>iataAccountNumber</code> property.
     */
    private String iataAccountNumber;
    
    /**
	 * Attribute to hold <code>customerGstin</code> property.
	 */
    private String customerGstin;

    //AI026 changes
    /**
     * Attribute to hold <code>apsUsrIndicator</code> property.
     */
    private String apsUsrIndicator;


    public String getAccountNumberToDisplay() {

        String accountNumberToDisplay = null;

        if (AWBParticipantType.A.equals(this.participantType)) {
            if (this.iataAccountNumber != null && !this.iataAccountNumber.isEmpty()) {
                accountNumberToDisplay = this.iataAccountNumber;
            }
            else {
                accountNumberToDisplay = this.billToAccountNumber;
            }
        }
        else {
            if (this.billToAccountNumber != null && !this.billToAccountNumber.isEmpty()) {
                accountNumberToDisplay = this.billToAccountNumber;
            }
            else {
                accountNumberToDisplay = this.iataAccountNumber;
            }
        }
        return accountNumberToDisplay;
    }

    public void setAccountNumberToDisplay(final String pAccountNumberToDisplay) {
        if (AWBParticipantType.A.equals(this.participantType)) {
            this.iataAccountNumber = ContractUtility.convertToUpperCase(pAccountNumberToDisplay);
            this.billToAccountNumber = null;
        }
        else {
            this.billToAccountNumber = ContractUtility.convertToUpperCase(pAccountNumberToDisplay);
            this.iataAccountNumber = null;
        }

    }

    /**
     * Gets the <code>billToAccountNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>billToAccountNumber</code> property.
     */

    public String getBillToAccountNumber() {
        return this.billToAccountNumber;
    }

    /**
     * Gets the <code>iataAccountNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>iataAccountNumber</code> property.
     */
    public String getIataAccountNumber() {
        return this.iataAccountNumber;
    }

    /**
     * Gets the <code>contactDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>contactDto</code> property.
     */
    public ContactDto getContactDto() {
        if (this.contactDto == null) {
            this.contactDto = new ContactDto();
        }
        return this.contactDto;
    }

    /**
     * Gets the <code>frequentFlyerNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>frequentFlyerNumber</code> property.
     */
    public String getFrequentFlyerNumber() {
        return this.frequentFlyerNumber;
    }

    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    public Long getOId() {
        return this.oId;
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
     * Gets the <code>participantType</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantType</code> property.
     */
    public AWBParticipantType getParticipantType() {
        return this.participantType;
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
     * Gets the <code>deleteIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>deleteIndicator</code> property.
     */
    public boolean getDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Sets the <code>contactDto</code>.
     * <p>
     * 
     * @param pContactDto
     *            holds the new value of <code>contactDto</code>
     */
    public void setContactDto(final ContactDto pContactDto) {
        this.contactDto = pContactDto;
    }

    /**
     * Sets the <code>deleteIndicator</code>.
     * <p>
     * 
     * @param pDeleteIndicator
     *            holds the new value of <code>deleteIndicator</code>
     */
    public void setDeleteIndicator(final boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>frequentFlyerNumber</code>.
     * <p>
     * 
     * @param pFrequentFlyerNumber
     *            holds the new value of <code>frequentFlyerNumber</code>
     */
    public void setFrequentFlyerNumber(final String pFrequentFlyerNumber) {
        this.frequentFlyerNumber = ContractUtility.convertToUpperCase(pFrequentFlyerNumber);
    }

    /**
     * Sets the <code>oId</code> property.
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>participantName</code>.
     * <p>
     * 
     * @param pParticipantName
     *            holds the new value of <code>participantName</code>
     */
    public void setParticipantName(final String pParticipantName) {
        this.participantName = ContractUtility.convertToUpperCase(pParticipantName);
    }

    /**
     * Sets the <code>participantType</code>.
     * <p>
     * 
     * @param pParticipantType
     *            holds the new value of <code>participantType</code>
     */
    public void setParticipantType(final AWBParticipantType pParticipantType) {
        this.participantType = pParticipantType;
    }

    /**
     * Sets the <code>station</code>.
     * <p>
     * 
     * @param pStation
     *            holds the new value of <code>station</code>
     */
    public void setStation(final String pStation) {
        this.station = ContractUtility.convertToUpperCase(pStation);
    }

    /**
     * Sets the <code>billToAccountNumber</code>.
     * <p>
     * 
     * @param pBillToAccountNumber
     *            holds the new value of <code>billToAccountNumber</code>
     */
    public void setBillToAccountNumber(final String pBillToAccountNumber) {
        this.billToAccountNumber = ContractUtility.convertToUpperCase(pBillToAccountNumber);
    }

    /**
     * Sets the <code>iataAccountNumber</code>.
     * <p>
     * 
     * @param pIataAccountNumber
     *            holds the new value of <code>iataAccountNumber</code>
     */
    public void setIataAccountNumber(final String pIataAccountNumber) {
        this.iataAccountNumber = ContractUtility.convertToUpperCase(pIataAccountNumber);
    }

    @Override
    public String toString() {
        final StringBuilder strBuilder = new StringBuilder();

        if (this.getParticipantType() != null && this.getParticipantType().getParticipant() != null) {
            strBuilder.append(this.getParticipantType().getParticipant());
            strBuilder.append(" ");
        }
        if (this.getAccountNumberToDisplay() != null) {
            strBuilder.append(this.getAccountNumberToDisplay());
            strBuilder.append(" ");
        }
        if (this.getParticipantName() != null) {
            strBuilder.append(this.getParticipantName());
            strBuilder.append(" ");
        }
        if (this.getStation() != null) {
            strBuilder.append(this.getStation());
            strBuilder.append(" ");
        }
        if (this.getContactDto() != null) {
            if (this.getContactDto().getAddress() != null) {
                strBuilder.append(this.getContactDto().getAddress());
                strBuilder.append(" ");
            }
            if (this.getContactDto().getCity() != null) {
                strBuilder.append(this.getContactDto().getCity());
                strBuilder.append(" ");
            }
            if (this.getContactDto().getCountry() != null) {
                strBuilder.append(this.getContactDto().getCountry());
                strBuilder.append(" ");
            }
            if (this.getContactDto().getState() != null) {
                strBuilder.append(this.getContactDto().getState());
                strBuilder.append(" ");
            }
            if (this.getContactDto().getPostalCode() != null) {
                strBuilder.append(this.getContactDto().getPostalCode());
                strBuilder.append(" ");
            }
            if (this.getContactDto().getPhone() != null) {
                strBuilder.append(this.getContactDto().getPhone());
                strBuilder.append(" ");
            }
            if (this.getContactDto().getFax() != null) {
                strBuilder.append(this.getContactDto().getFax());
                strBuilder.append(" ");
            }
            if (this.getContactDto().getEmail() != null) {
                strBuilder.append(this.getContactDto().getEmail());
                strBuilder.append(" ");
            }
            if (this.getFrequentFlyerNumber() != null) {
                strBuilder.append(this.getFrequentFlyerNumber());
                strBuilder.append(" ");
            }

        }
        return strBuilder.toString();
    }

    public ParticipantAccountType getParticipantAccountType() {
        return this.participantAccountType;
    }

    public void setParticipantAccountType(final ParticipantAccountType pParticipantAccountType) {
        this.participantAccountType = pParticipantAccountType;
    }

	public String getCustomerGstin() {
		return customerGstin;
	}

	public void setCustomerGstin(String customerGstin) {
		this.customerGstin = customerGstin;
	}

    public String getApsUsrIndicator() {
        return apsUsrIndicator;
    }

    public void setApsUsrIndicator(String apsUsrIndicator) {
        this.apsUsrIndicator = apsUsrIndicator;
    }
}
