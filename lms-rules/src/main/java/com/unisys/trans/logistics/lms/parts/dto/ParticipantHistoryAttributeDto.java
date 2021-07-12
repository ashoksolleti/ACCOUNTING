package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class ParticipantHistoryAttributeDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = -2142059288897066472L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;
    
    
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
     * Attribute to hold <code>crossReferenceInformationRequired</code> property. Indicates the type of cross
     * reference information required.
     */
    private String crossReferenceInformationRequired;

    /**
     * Attribute to hold <code>country1</code> property.
     */
    private String country1;

    /**
     * Attribute to hold <code>country2</code> property.
     */
    private String country2;
    
    
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
     * Attribute to hold <code>firstDateRangeDto</code> property.
     */
    private DateRangeDto firstDateRangeDto;
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
     * Attribute to hold <code>secondDateRangeDto</code> property.
     */
    private DateRangeDto secondDateRangeDto;

	private Boolean govtTaxExemptIndicator;

	public Boolean getStateTaxExemptIndicator() {
		return stateTaxExemptIndicator;
	}

	


	


    private Boolean stateTaxExemptIndicator;

	private Boolean restrictedArticlesExemptIndicator;

	private Boolean valuableCargoExemptIndicator;

	private Boolean commercialAccountRestrictionIndicator;

	private Boolean customsNominatedAgentStatus;

	public Boolean getRestrictedArticlesExemptIndicator() {
		return restrictedArticlesExemptIndicator;
	}

	public Boolean getValuableCargoExemptIndicator() {
		return valuableCargoExemptIndicator;
	}

	public Boolean getCommercialAccountRestrictionIndicator() {
		return commercialAccountRestrictionIndicator;
	}

	public Boolean getCustomsNominatedAgentStatus() {
		return customsNominatedAgentStatus;
	}

	public Boolean getNoShipmentIndicator() {
		return noShipmentIndicator;
	}

	public Boolean getManualHouseAWBFeeRestrictionIndicator() {
		return manualHouseAWBFeeRestrictionIndicator;
	}

	public Boolean getEdiHouseAWBFeeEntryRestrictionIndicator() {
		return ediHouseAWBFeeEntryRestrictionIndicator;
	}

	public Boolean getIataAgentPrepaidChargesIndicator() {
		return iataAgentPrepaidChargesIndicator;
	}





	private Boolean noShipmentIndicator;

	private Boolean manualHouseAWBFeeRestrictionIndicator;

	private Boolean ediHouseAWBFeeEntryRestrictionIndicator;

	private Boolean iataAgentPrepaidChargesIndicator;
    public Boolean getGovtTaxExemptIndicator() {
		return govtTaxExemptIndicator;
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
     * @return the current value of <code>crossReferenceInformationRequired</code> property.<br>
     */
    public String getCrossReferenceInformationRequired() {
        return this.crossReferenceInformationRequired;
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
     *            the new value of <code>crossReferenceInformationRequired</code> property.
     */
    public void setCrossReferenceInformationRequired(
                final String pCrossReferenceInformationRequired) {
        this.crossReferenceInformationRequired = ContractUtility
                    .convertToUpperCase(pCrossReferenceInformationRequired);
    }

   
   

   
   
   
  

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
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

	public void setGovtTaxExemptIndicator(Boolean pGovtTaxExemptIndicator) {
		this.govtTaxExemptIndicator=pGovtTaxExemptIndicator;
		
	}

	public void setStateTaxExemptIndicator(Boolean stateTaxExemptIndicator) {
		this.stateTaxExemptIndicator=stateTaxExemptIndicator;
	}

	public void setRestrictedArticlesExemptIndicator(
			Boolean restrictedArticlesExemptIndicator) {
	this.restrictedArticlesExemptIndicator=restrictedArticlesExemptIndicator;
	}

	public void setValuableCargoExemptIndicator(
			Boolean valuableCargoExemptIndicator) {
	this.valuableCargoExemptIndicator=valuableCargoExemptIndicator;
	}

	public void setCommercialAccountRestrictionIndicator(
			Boolean commercialAccountRestrictionIndicator) {
	this.commercialAccountRestrictionIndicator=commercialAccountRestrictionIndicator;
	}

	public void setCustomsNominatedAgentStatus(
			Boolean customsNominatedAgentStatus) {
		this.customsNominatedAgentStatus=customsNominatedAgentStatus;
	}

	public void setNoShipmentIndicator(Boolean noShipmentIndicator) {
	this.noShipmentIndicator=noShipmentIndicator;
	}

	public void setManualHouseAWBFeeRestrictionIndicator(
			Boolean manualHouseAWBFeeRestrictionIndicator) {
		this.manualHouseAWBFeeRestrictionIndicator=manualHouseAWBFeeRestrictionIndicator;
	}

	public void setEdiHouseAWBFeeEntryRestrictionIndicator(
			Boolean ediHouseAWBFeeEntryRestrictionIndicator) {
		this.ediHouseAWBFeeEntryRestrictionIndicator=ediHouseAWBFeeEntryRestrictionIndicator;
	}

	public void setIataAgentPrepaidChargesIndicator(
			Boolean iataAgentPrepaidChargesIndicator) {
		this.iataAgentPrepaidChargesIndicator=iataAgentPrepaidChargesIndicator;
	}

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

  

}
