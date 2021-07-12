/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>FreightAttributesDto</code> contains the freight attribute information
 * details.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>govtTaxExemptIndicator
 * <li>stateTaxExemptIndicator
 * <li>restrictedArticlesExemptIndicator
 * <li>valuableCargoExemptIndicator
 * <li>commercialAccountRestrictionIndicator
 * <li>noShipmentIndicator
 * <li>manualHouseAWBFeeRestrictionIndicator
 * <li>ediHouseAWBFeeEntryRestrictionIndicator
 * <li>iataAgentPrepaidChargesIndicator
 * <li>firstSecurityStatusInformation
 * <li>secondSecurityStatusInformation
 * <li>contractAllowedIndicator
 * <li>crossReferenceInformationRequired
 * </ul>
 * </code>
 */
public class FreightAttributesDto implements Serializable {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 7627815713570573230L;

	/**
	 * Attribute to hold <code>commercialAccountRestrictionIndicator</code>
	 * property. It determines whether the participant can be a shipper or a
	 * consignee to any shipment. If set to false, then, the participant cannot
	 * be associated with any shipment as either Shipper or Consignee.
	 */
	private Boolean commercialAccountRestrictionIndicator;

	/**
	 * Attribute to hold <code>contractAllowedIndicator</code> property. Flag to
	 * indicate that contract exist for this participant.
	 */
	private Boolean contractAllowedIndicator;

	/**
	 * Attribute to hold <code>country1</code> property.
	 */
	private String country1;

	/**
	 * Attribute to hold <code>country2</code> property.
	 */
	private String country2;

	/**
	 * Attribute to hold <code>crossReferenceInformationRequired</code>
	 * property. Indicates the type of cross reference information required.
	 */
	private String crossReferenceInformationRequired;

	/**
	 * Attribute to hold <code>customsNominatedAgentStatus</code> property.
	 */
	private Boolean customsNominatedAgentStatus;

	/**
	 * Attribute to hold <code>ediHouseAWBFeeEntryRestrictionIndicator</code>
	 * property. It denotes whether the participant is exempted of the EDI House
	 * entry fee charge.
	 */
	private Boolean ediHouseAWBFeeEntryRestrictionIndicator;
	
	/**
     * Attribute to hold <code>ccsfCargoScreeningFacilityNo</code>
     * property.
     */
    private String ccsfCargoScreeningFacilityNo;
    /**
     * Attribute to hold <code>ccsfCargoScreeningFacilityNo</code>
     * property.
     */
    private String ctpatCustomsSecurityNo;

	/**
	 * Attribute to hold <code>firstDateRangeDto</code> property.
	 */
	private DateRangeDto firstDateRangeDto;

	public String getCcsfCargoScreeningFacilityNo() {
        return ccsfCargoScreeningFacilityNo;
    }

    public void setCcsfCargoScreeningFacilityNo(String ccsfCargoScreeningFacilityNo) {
        this.ccsfCargoScreeningFacilityNo = ccsfCargoScreeningFacilityNo;
    }

    public String getCtpatCustomsSecurityNo() {
        return ctpatCustomsSecurityNo;
    }

    public void setCtpatCustomsSecurityNo(String ctpatCustomsSecurityNo) {
        this.ctpatCustomsSecurityNo = ctpatCustomsSecurityNo;
    }

    /**
	 * Attribute to hold <code>firstSecurityStatusInd</code> property.
	 */
	private String firstSecurityStatusInd;

	/**
	 * Attribute to hold <code>firstSecurityStatusInformation</code> property.
	 * This information is displayed along with air waybill information in case
	 * the participant is associated as the shipper to the waybill.
	 */
	private String firstSecurityStatusInformation;

	/**
	 * Attribute to hold <code>govtTaxExemptIndicator</code> property. Indicator
	 * to indicate that the participant is exempted from the assessment of
	 * government tax.
	 */
	private Boolean govtTaxExemptIndicator;

	/**
	 * Attribute to hold <code>iataAgentPrepaidChargesIndicator</code> property.
	 * It denotes that the IATA agent is responsible for the Waybill prepaid
	 * charges and credit limits.
	 */
	private Boolean iataAgentPrepaidChargesIndicator;

	/**
	 * Attribute to hold <code>manualHouseAWBFeeRestrictionIndicator</code>
	 * property. It denotes whether the participant is exempted of the Manual
	 * House entry fee charge.
	 */
	private Boolean manualHouseAWBFeeRestrictionIndicator;

	/**
	 * Attribute to hold <code>noShipmentIndicator</code> property. It denotes
	 * whether the participant can be a Shipper for any shipment.
	 */
	private Boolean noShipmentIndicator;

	/**
	 * Attribute to hold <code>restrictedArticlesExemptIndicator</code>
	 * property. It denotes that the participant is exempted of restricted
	 * Articles charge (RA) in case of dangerous goods being shipped.
	 */
	private Boolean restrictedArticlesExemptIndicator;

	/**
	 * Attribute to hold <code>secondDateRangeDto</code> property.
	 */
	private DateRangeDto secondDateRangeDto;

	/**
	 * Attribute to hold <code>secondSecurityStatusInd</code> property.
	 */
	private String secondSecurityStatusInd;

	/**
	 * Attribute to hold <code>secondSecurityStatusInformation</code> property.
	 * This is used to verify the security identifier.
	 */
	private String secondSecurityStatusInformation;

	/**
	 * Attribute to hold <code>stateTaxExemptIndicator</code> property. It is
	 * used to denote that the participant is exempted from assessment of State
	 * tax.
	 */
	private Boolean stateTaxExemptIndicator;

	/**
	 * Attribute to hold <code>valuableCargoExemptIndicator</code> property. The
	 * participant is exempted of the Valuable Cargo charge, (VL) in case the
	 * shipment involves valuable goods.
	 */
	private Boolean valuableCargoExemptIndicator;
	
	public Boolean getBookingChargeExemption() {
        return bookingChargeExemption;
    }

    public void setBookingChargeExemption(Boolean bookingChargeExemption) {
        this.bookingChargeExemption = bookingChargeExemption;
    }

    public Boolean getFsuChargeExemtion() {
        return fsuChargeExemtion;
    }

    public void setFsuChargeExemtion(Boolean fsuChargeExemtion) {
        this.fsuChargeExemtion = fsuChargeExemtion;
    }

    public Boolean getRestrictedChargeExemption() {
        return restrictedChargeExemption;
    }

    public void setRestrictedChargeExemption(Boolean restrictedChargeExemption) {
        this.restrictedChargeExemption = restrictedChargeExemption;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    private Boolean automaticEQA;
	
	private Boolean bookingChargeExemption;
	
	private Boolean fsuChargeExemtion;
	
	private Boolean restrictedChargeExemption;
	
	

	/**
	 * <code>Default constructor.</code>
	 */
	public FreightAttributesDto() {
	}

	/**
	 * Gets the <code>commercialAccountRestrictionIndicator</code> property.
	 * <p>
	 * Indicator that determines whether the participant can be a shipper or
	 * Consignee to any shipment.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant can be a shipper or consignee to any shipment.
	 * <li><code>false</code><br>
	 * The participant cannot be a shipper or consignee to any shipment.
	 * <p>
	 * 
	 * @return the current value of <code>commercialAccountRestrictionIndicator
	 *         </code> property.<br>
	 */
	public Boolean getCommercialAccountRestrictionIndicator() {
		return this.commercialAccountRestrictionIndicator;
	}

	/**
	 * Gets the <code>contractAllowedIndicator</code> property.
	 * <p>
	 * Flag to indicate contract exist for this participant.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * Contract exists for this participant.
	 * <li><code>false</code><br>
	 * Contract does not exist for this participant.<br>
	 * <p>
	 * 
	 * @return the current value of <code>contractAllowedIndicator</code>
	 *         property.<br>
	 */
	public Boolean getContractAllowedIndicator() {
		return this.contractAllowedIndicator;
	}

	/**
	 * Gets the <code>country2</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>country2</code> property.<br>
	 */
	public String getCountry1() {
		return this.country1;
	}

	/**
	 * Gets the <code>country1</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>country1</code> property.<br>
	 */
	public String getCountry2() {
		return this.country2;
	}

	/**
	 * Gets the <code>crossReferenceInformationRequired</code> property.
	 * <p>
	 * Indicates the type of Cross reference information required.
	 * <p>
	 * <b>Format: </b><br>
	 * 1 alphabet<br>
	 * <p>
	 * <b>Example: </b><br>
	 * A - Air Waybill Number<br>
	 * B - Government Bill of Lading<br>
	 * C - Truck Manifest<br>
	 * E - Export Declaration.<br>
	 * G - Government Transportation Request<br>
	 * M - Air Cargo Transfer Manifest<br>
	 * R - Bank Release<br>
	 * S - Ocean Bill of Lading.
	 * <p>
	 * 
	 * @return the current value of
	 *         <code>crossReferenceInformationRequired</code> property.<br>
	 */
	public String getCrossReferenceInformationRequired() {
		return this.crossReferenceInformationRequired;
	}

	/**
	 * Gets the <code>customsNominatedAgentStatus</code> property.
	 * <p>
	 * Indicates the customs nominated Agent status.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * Customs nominated agent status is automated.
	 * <li><code>false</code><br>
	 * Customs nominated agent status is not automated.<br>
	 * <p>
	 * 
	 * @return the current value of <code>customsNominatedAgentStatus</code>
	 *         property.<br>
	 */
	public Boolean getCustomsNominatedAgentStatus() {
		return this.customsNominatedAgentStatus;
	}

	/**
	 * Gets the <code>ediHouseAWBFeeEntryRestrictionIndicator</code> property.
	 * <p>
	 * Indicator that denotes whether the participant is exempt of the EDI House
	 * entry fee charge.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant is exempted from the EDI House entry fee charge.
	 * <li><code>false</code><br>
	 * The participant is not exempted from the EDI House entry fee charge.<br>
	 * <p>
	 * 
	 * @return the current value of <code>
	 *         ediHouseAWBFeeEntryRestrictionIndicator</code> property.<br>
	 */
	public Boolean getEdiHouseAWBFeeEntryRestrictionIndicator() {
		return this.ediHouseAWBFeeEntryRestrictionIndicator;
	}

	/**
	 * Gets the list of
	 * {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto
	 * DateRangeDto} containing <code>DateRangeDto</code> details.
	 * <p>
	 * 
	 * @return the current value of <code>firstDateRangeDto</code> details.
	 */
	public DateRangeDto getFirstDateRangeDto() {
		if (this.firstDateRangeDto == null) {
			this.firstDateRangeDto = new DateRangeDto();
		}

		return this.firstDateRangeDto;
	}

	/**
	 * Gets the <code>firstSecurityStatusInd</code> details.
	 * <p>
	 * 
	 * @return the current value of <code>firstSecurityStatusInd</code> details.
	 */
	public String getFirstSecurityStatusInd() {
		return this.firstSecurityStatusInd;
	}

	/**
	 * Gets the <code>firstSecurityStatusInformation</code> property.
	 * <p>
	 * This information is displayed along with air Waybill information in case
	 * the Participant is associated as the Shipper to the waybill.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-4 alphabet<br>
	 * <p>
	 * <b>Example: </b><br>
	 * POBC
	 * <p>
	 * 
	 * @return the current value of <code>firstSecurityStatusInformation</code>
	 *         property.<br>
	 */
	public String getFirstSecurityStatusInformation() {
		return this.firstSecurityStatusInformation;
	}

	/**
	 * Gets the <code>govtTaxExemptIndicator</code> property.
	 * <p>
	 * Indicator that participant is exempt from the assessment of government
	 * tax.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant is exempted from the assessment of government tax.
	 * <li><code>false</code><br>
	 * The participant is not exempted from the assessment of government tax.<br>
	 * <p>
	 * 
	 * @return the current value of <code>govtTaxExemptIndicator</code>
	 *         property.<br>
	 */
	public Boolean getGovtTaxExemptIndicator() {
		return this.govtTaxExemptIndicator;
	}

	/**
	 * Gets the <code>iataAgentPrepaidChargesIndicator</code> property.
	 * <p>
	 * Indicator that denotes that the IATA agent is responsible for the Waybill
	 * prepaid charges and credit limits.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The IATA agent is explicitly responsible for Waybill Prepaid charges and
	 * Credit limits.
	 * <li><code>false</code><br>
	 * The IATA agent is not responsible for Waybill Prepaid charges and Credit
	 * limits.<br>
	 * <p>
	 * 
	 * @return the current value of <code>iataAgentPrepaidChargesIndicator
	 *         </code> property.<br>
	 */
	public Boolean getIataAgentPrepaidChargesIndicator() {
		return this.iataAgentPrepaidChargesIndicator;
	}

	/**
	 * Gets the <code>manualHouseAWBFeeRestrictionIndicator</code> property.
	 * <p>
	 * Indicator that denotes whether the participant is exempt of the Manual
	 * House entry fee charge
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant is exempted from the Manual House entry fee charge.
	 * <li><code>false</code><br>
	 * The participant is not exempted from the Manual House entry fee charge.<br>
	 * <p>
	 * 
	 * @return the current value of <code>manualHouseAWBFeeRestrictionIndicator
	 *         </code> property.<br>
	 */
	public Boolean getManualHouseAWBFeeRestrictionIndicator() {
		return this.manualHouseAWBFeeRestrictionIndicator;
	}

	/**
	 * Gets the <code>noShipmentIndicator</code> property.
	 * <p>
	 * Indicator that denotes whether the participant can be a Shipper for any
	 * shipment or not.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant can be a shipper.
	 * <li><code>false</code><br>
	 * The participant cannot be a shipper.<br>
	 * <p>
	 * 
	 * @return the current value of <code>noShipmentIndicator</code> property.<br>
	 */
	public Boolean getNoShipmentIndicator() {
		return this.noShipmentIndicator;
	}

	/**
	 * Gets the <code>restrictedArticlesExemptIndicator</code> property.
	 * <p>
	 * Indicator that the participant is exempt of restricted Articles charge
	 * (RA) in case of dangerous goods being shipped.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant is exempted from restricted articles charge.
	 * <li><code>false</code><br>
	 * The participant is not exempted from restricted articles charge.<br>
	 * <p>
	 * 
	 * @return the current value of <code>restrictedArticlesExemptIndicator
	 *         </code> property.<br>
	 */
	public Boolean getRestrictedArticlesExemptIndicator() {
		return this.restrictedArticlesExemptIndicator;
	}

	/**
	 * Gets the list of
	 * {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto
	 * DateRangeDto} containing <code>DateRangeDto</code> details.
	 * <p>
	 * 
	 * @return the current value of <code>secondDateRangeDto</code> details.
	 */
	public DateRangeDto getSecondDateRangeDto() {
		if (this.secondDateRangeDto == null) {
			this.secondDateRangeDto = new DateRangeDto();
		}
		return this.secondDateRangeDto;
	}

	/**
	 * Gets the <code>secondSecurityStatusInd</code> details.
	 * <p>
	 * 
	 * @return the current value of <code>secondSecurityStatusInd</code>
	 *         details.
	 */
	public String getSecondSecurityStatusInd() {
		return this.secondSecurityStatusInd;
	}

	/**
	 * Gets the <code>secondSecurityStatusInformation</code> property.
	 * <p>
	 * Security document identification. This is used to verify the security
	 * Identifier.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-16 Any character<br>
	 * <p>
	 * <b>Example: </b><br>
	 * POB123
	 * <p>
	 * 
	 * @return the current value of <code>secondSecurityStatusInformation</code>
	 *         property.<br>
	 */
	public String getSecondSecurityStatusInformation() {
		return this.secondSecurityStatusInformation;
	}

	/**
	 * Gets the <code>stateTaxExemptIndicator</code> property.
	 * <p>
	 * Indicator that the participant is exempt from assessment of State tax.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant is exempted from assessment of State tax.
	 * <li><code>false</code><br>
	 * The participant is not exempted from assessment of State tax.<br>
	 * <p>
	 * 
	 * @return the current value of <code>stateTaxExemptIndicator</code>
	 *         property.<br>
	 */
	public Boolean getStateTaxExemptIndicator() {
		return this.stateTaxExemptIndicator;
	}

	/**
	 * Gets the <code>valuableCargoExemptIndicator</code> property.
	 * <p>
	 * Indicator that the participant is exempt of the Valuable Cargo charge,
	 * (VL) in case the shipment involves valuable goods.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant is exempted from the Valuable Cargo charge.
	 * <li><code>false</code><br>
	 * The participant is not exempted from the Valuable Cargo charge.<br>
	 * <p>
	 * 
	 * @return the current value of <code>valuableCargoExemptIndicator</code>
	 *         property.<br>
	 */
	public Boolean getValuableCargoExemptIndicator() {
		return this.valuableCargoExemptIndicator;
	}

	/**
	 * Sets the <code>commercialAccountRestrictionIndicator</code> property.
	 * <p>
	 * Indicator that determines whether the participant can be a shipper or
	 * Consignee to any shipment.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant can be a shipper or consignee to any shipment.
	 * <li><code>false</code><br>
	 * The participant cannot be a shipper or consignee to any shipment.<br>
	 * <p>
	 * 
	 * @param pCommercialAccountRestrictionIndicator
	 *            the new value of <code> commercialAccountRestrictionIndicator
	 *            </code> property.<bR>
	 */
	public void setCommercialAccountRestrictionIndicator(
			final Boolean pCommercialAccountRestrictionIndicator) {
		this.commercialAccountRestrictionIndicator = pCommercialAccountRestrictionIndicator;
	}

	/**
	 * Sets the <code>contractAllowedIndicator</code> property.
	 * <p>
	 * Flag to indicate contract exist for this participant.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * Contract exists for this participant.
	 * <li><code>false</code><br>
	 * Contract does not exist for this participant.<br>
	 * <p>
	 * 
	 * @param pContractAllowedIndicator
	 *            the new value of <code>contractAllowedIndicator</code>
	 *            property.<bR>
	 */
	public void setContractAllowedIndicator(
			final Boolean pContractAllowedIndicator) {
		this.contractAllowedIndicator = pContractAllowedIndicator;
	}

	/**
	 * Sets the <code>country1</code> property.
	 * <p>
	 * 
	 * @param pCountry1
	 *            the new value of <code>country1</code> property.<bR>
	 */
	public void setCountry1(final String pCountry1) {
		this.country1 = ContractUtility.convertToUpperCase(pCountry1);
	}

	/**
	 * Sets the <code>country2</code> property.
	 * <p>
	 * 
	 * @param pCountry2
	 *            the new value of <code>country2</code> property.<bR>
	 */
	public void setCountry2(final String pCountry2) {
		this.country2 = ContractUtility.convertToUpperCase(pCountry2);
	}

	/**
	 * Sets the <code>crossReferenceInformationRequired</code> property.
	 * <p>
	 * Indicates the type of Cross reference information required.
	 * <p>
	 * <b>Format: </b><br>
	 * 1 alphabet<br>
	 * <p>
	 * <b>Example: </b><br>
	 * A - Air Waybill Number<br>
	 * B - Government Bill of Lading<br>
	 * C - Truck Manifest<br>
	 * E - Export Declaration.<br>
	 * G - Government Transportation Request<br>
	 * M - Air Cargo Transfer Manifest<br>
	 * R - Bank Release<br>
	 * S - Ocean Bill of Lading.
	 * <p>
	 * 
	 * @param pCrossReferenceInformationRequired
	 *            the new value of
	 *            <code>crossReferenceInformationRequired</code> property.
	 */
	public void setCrossReferenceInformationRequired(
			final String pCrossReferenceInformationRequired) {
		this.crossReferenceInformationRequired = ContractUtility
				.convertToUpperCase(pCrossReferenceInformationRequired);
	}

	/**
	 * Sets the <code>customsNominatedAgentStatus</code> property.
	 * <p>
	 * Indicates the customs nominated Agent status.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * Customs nominated agent status is automated.
	 * <li><code>false</code><br>
	 * Customs nominated agent status is not automated.<br>
	 * <p>
	 * 
	 * @param pCustomsNominatedAgentStatus
	 *            the new value of <code>customsNominatedAgentStatus</code>
	 *            property.<bR>
	 */
	public void setCustomsNominatedAgentStatus(
			final Boolean pCustomsNominatedAgentStatus) {
		this.customsNominatedAgentStatus = pCustomsNominatedAgentStatus;
	}

	/**
	 * Sets the <code>ediHouseAWBFeeEntryRestrictionIndicator</code> property.
	 * <p>
	 * Indicator that denotes whether the participant is exempt of the EDI House
	 * entry fee charge.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant is exempted from the EDI House entry fee charge.
	 * <li><code>false</code><br>
	 * The participant is not exempted from the EDI House entry fee charge.<br>
	 * <p>
	 * 
	 * @param pEdiHouseAWBFeeEntryRestrictionIndicator
	 *            the new value of <code>
	 *            ediHouseAWBFeeEntryRestrictionIndicator</code> property.<bR>
	 */
	public void setEdiHouseAWBFeeEntryRestrictionIndicator(
			final Boolean pEdiHouseAWBFeeEntryRestrictionIndicator) {
		this.ediHouseAWBFeeEntryRestrictionIndicator = pEdiHouseAWBFeeEntryRestrictionIndicator;
	}

	/**
	 * Sets the list of
	 * {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto
	 * DateRangeDto} containing <code>firstDateRangeDto</code> details.
	 * <p>
	 * 
	 * @param pFirstDateRangeDto
	 *            holds the new value of <code>firstDateRangeDto</code> type
	 *            details.<br>
	 */
	public void setFirstDateRangeDto(final DateRangeDto pFirstDateRangeDto) {
		this.firstDateRangeDto = pFirstDateRangeDto;
	}

	/**
	 * Sets the <code>firstSecurityStatusInd</code> details.
	 * <p>
	 * 
	 * @param pFirstSecurityStatusInd
	 *            holds the new value of <code>firstSecurityStatusInd</code>
	 *            type details.<br>
	 */
	public void setFirstSecurityStatusInd(final String pFirstSecurityStatusInd) {
		this.firstSecurityStatusInd = pFirstSecurityStatusInd;
	}

	/**
	 * Sets the <code>firstSecurityStatusInformation</code> property.
	 * <p>
	 * This information is displayed along with air Waybill information in case
	 * the Participant is associated as the Shipper to the waybill.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-4 alphabet<br>
	 * <p>
	 * <b>Example: </b><br>
	 * POBS
	 * <p>
	 * 
	 * @param pFirstSecurityStatusInformation
	 *            the new value of <code>firstSecurityStatusInformation</code>
	 *            property.<br>
	 */
	public void setFirstSecurityStatusInformation(
			final String pFirstSecurityStatusInformation) {
		this.firstSecurityStatusInformation = pFirstSecurityStatusInformation;
	}

	/**
	 * Sets the <code>govtTaxExemptIndicator</code> property.
	 * <p>
	 * Indicator that participant is exempt from the assessment of government
	 * tax.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant is exempted from the assessment of government tax.
	 * <li><code>false</code><br>
	 * The participant is not exempted from the assessment of government tax.<br>
	 * <p>
	 * 
	 * @param pGovtTaxExemptIndicator
	 *            the new value of <code>govtTaxExemptIndicator</code> property.<bR>
	 */
	public void setGovtTaxExemptIndicator(final Boolean pGovtTaxExemptIndicator) {
		this.govtTaxExemptIndicator = pGovtTaxExemptIndicator;
	}

	/**
	 * Sets the <code>iataAgentPrepaidChargesIndicator</code> property.
	 * <p>
	 * Indicator that denotes that the IATA agent is responsible for the Waybill
	 * prepaid charges and credit limits.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The IATA agent is explicitly responsible for Waybill Prepaid charges and
	 * Credit limits.
	 * <li><code>false</code><br>
	 * The IATA agent is not responsible for Waybill Prepaid charges and Credit
	 * limits.<br>
	 * <p>
	 * 
	 * @param pIataAgentPrepaidChargesIndicator
	 *            the new value of <code>iataAgentPrepaidChargesIndicator</code>
	 *            property.<bR>
	 */
	public void setIataAgentPrepaidChargesIndicator(
			final Boolean pIataAgentPrepaidChargesIndicator) {
		this.iataAgentPrepaidChargesIndicator = pIataAgentPrepaidChargesIndicator;
	}

	/**
	 * Sets the <code>manualHouseAWBFeeRestrictionIndicator</code> property.
	 * <p>
	 * Indicator that denotes whether the participant is exempt of the Manual
	 * House entry fee charge.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant is exempted from the Manual House entry fee charge.
	 * <li><code>false</code><br>
	 * The participant is not exempted from the Manual House entry fee charge.<br>
	 * <p>
	 * 
	 * @param pManualHouseAWBFeeRestrictionIndicator
	 *            the new value of <code> manualHouseAWBFeeRestrictionIndicator
	 *            </code> property.<bR>
	 */
	public void setManualHouseAWBFeeRestrictionIndicator(
			final Boolean pManualHouseAWBFeeRestrictionIndicator) {
		this.manualHouseAWBFeeRestrictionIndicator = pManualHouseAWBFeeRestrictionIndicator;
	}

	/**
	 * Sets the <code>noShipmentIndicator</code> property.
	 * <p>
	 * Indicator that denotes whether the participant can be a Shipper for any
	 * shipment or not.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant can be a shipper.
	 * <li><code>false</code><br>
	 * The participant cannot be a shipper.<br>
	 * <p>
	 * 
	 * @param pNoShipmentIndicator
	 *            the new value of <code>noShipmentIndicator</code> property.<bR>
	 */
	public void setNoShipmentIndicator(final Boolean pNoShipmentIndicator) {
		this.noShipmentIndicator = pNoShipmentIndicator;
	}

	/**
	 * Sets the <code>restrictedArticlesExemptIndicator</code> property.
	 * <p>
	 * Indicator that the participant is exempt of restricted Articles charge
	 * (RA) in case of dangerous goods being shipped.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant is exempted from restricted articles charge.
	 * <li><code>false</code><br>
	 * The participant is not exempted from restricted articles charge.<br>
	 * <p>
	 * 
	 * @param pRestrictedArticlesExemptIndicator
	 *            the new value of <code>restrictedArticlesExemptIndicator
	 *            </code> property.<bR>
	 */
	public void setRestrictedArticlesExemptIndicator(
			final Boolean pRestrictedArticlesExemptIndicator) {
		this.restrictedArticlesExemptIndicator = pRestrictedArticlesExemptIndicator;
	}

	/**
	 * Sets the <code>secondDateRangeDto</code> details.
	 * <p>
	 * 
	 * @param pSecondDateRangeDto
	 *            holds the new value of <code>secondDateRangeDto</code> type
	 *            details.<br>
	 */
	public void setSecondDateRangeDto(final DateRangeDto pSecondDateRangeDto) {
		this.secondDateRangeDto = pSecondDateRangeDto;
	}

	/**
	 * Sets the <code>secondSecurityStatusInd</code> details.
	 * <p>
	 * 
	 * @param pSecondSecurityStatusInd
	 *            holds the new value of <code>secondSecurityStatusInd</code>
	 *            type details.<br>
	 */
	public void setSecondSecurityStatusInd(final String pSecondSecurityStatusInd) {
		this.secondSecurityStatusInd = pSecondSecurityStatusInd;
	}

	/**
	 * Sets the <code>secondSecurityStatusInformation</code> property.
	 * <p>
	 * Security document identification. This is used to verify the security
	 * Identifier.
	 * <p>
	 * <b>Format: </b><br>
	 * 1-16 Any character <br>
	 * <p>
	 * <b>Example: </b><br>
	 * POB123
	 * <p>
	 * 
	 * @param pSecondSecurityStatusInformation
	 *            the new value of <code>secondSecurityStatusInformation</code>
	 *            property.<br>
	 */
	public void setSecondSecurityStatusInformation(
			final String pSecondSecurityStatusInformation) {
		this.secondSecurityStatusInformation = pSecondSecurityStatusInformation;
	}

	/**
	 * Sets the <code>stateTaxExemptIndicator</code> property.
	 * <p>
	 * Indicator that the participant is exempt from assessment of State tax.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant is exempted from assessment of State tax.
	 * <li><code>false</code><br>
	 * The participant is not exempted from assessment of State tax.<br>
	 * <p>
	 * 
	 * @param pStateTaxExemptIndicator
	 *            the new value of <code>stateTaxExemptIndicator</code>
	 *            property.<bR>
	 */
	public void setStateTaxExemptIndicator(
			final Boolean pStateTaxExemptIndicator) {
		this.stateTaxExemptIndicator = pStateTaxExemptIndicator;
	}

	/**
	 * Sets the <code>valuableCargoExemptIndicator</code> property.
	 * <p>
	 * Indicator that the participant is exempt of the Valuable Cargo charge,
	 * (VL) in case the shipment involves valuable goods.
	 * <p>
	 * <b>Possible Values: </b><br>
	 * <li><code>true</code><br>
	 * The participant is exempted from the Valuable Cargo charge.
	 * <li><code>false</code><br>
	 * The participant is not exempted from the Valuable Cargo charge.<br>
	 * <p>
	 * 
	 * @param pValuableCargoExemptIndicator
	 *            the new value of <code>valuableCargoExemptIndicator</code>
	 *            property.<bR>
	 */
	public void setValuableCargoExemptIndicator(
			final Boolean pValuableCargoExemptIndicator) {
		this.valuableCargoExemptIndicator = pValuableCargoExemptIndicator;
	}

    public Boolean getAutomaticEQA() {
        return automaticEQA;
    }

    public void setAutomaticEQA(Boolean automaticEQA) {
        this.automaticEQA = automaticEQA;
    }

}
