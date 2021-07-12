/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.TapeRateEntry;

/**
 * <code>TariffRateOriginAndDestinationDto</code> contain details of TariffRateOriginAndDestination.
 * <p>
 * This contains all information about TariffRateOriginAndDestination.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>carrierCode
 * <li>oId
 * <li>destination
 * <li>distance
 * <li>tariffRateDtos
 * </ul>
 */

public class TariffRateOriginAndDestinationDto extends TapeRateEntry {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>EMPTY_STRING</code> property.
     */
    private static final String EMPTY_STRING = "";

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;
    
    /**
     * Attribute to hold <code>hardDeleteIndicator</code> property.
     */
    private boolean hardDeleteIndicator;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private GeographicDataDto destination;

    /**
     * Attribute to hold <code>distance</code> property.
     */
    private Double distance;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>origin</code> property.
     */
    private GeographicDataDto origin;

    /**
     * Attribute to hold <code>tariffRateDtos</code> property.
     */
    private List<TariffRateDto> tariffRateDtos;
    
    /**
     * String that holds the input line from which the Add On rate
     * information is populated. This is purely used in TACT load
     * and shouldn't be used for any other purpose. 
     * 
     */
    private String iriRateLine;
    
    private String inputText;
    
    
    /**
     * Gets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @return the current value of the <code>CarrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     * GeographicDataDto} containing <code>GeographicDataDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>Destination</code> property.
     */
    public GeographicDataDto getDestination() {
        if (this.destination == null) {
            this.destination = new GeographicDataDto();
        }
        return this.destination;
    }

    /**
     * Gets the <code>Distance</code> property.
     * <p>
     * 
     * @return the current value of the <code>Distance</code> property.
     */
    public Double getDistance() {
        return this.distance;
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
     * Gets the list of {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     * GeographicDataDto} containing <code>GeographicDataDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>Origin</code> property.
     */
    public GeographicDataDto getOrigin() {
        if (this.origin == null) {
            this.origin = new GeographicDataDto();
        }
        return this.origin;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto
     * TariffRateDto} containing <code>TariffRateDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>TariffRateDtos</code> property.
     */
    public List<TariffRateDto> getTariffRateDtos() {
        if (this.tariffRateDtos == null) {
            this.tariffRateDtos = new ArrayList<TariffRateDto>();
        }
        return this.tariffRateDtos;
    }

    /**
     * Sets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @param pCarrierCode
     *            the current value of the <code>CarrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = pCarrierCode;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     * GeographicDataDto} containing <code>GeographicDataDto</code> details.
     * <p>
     * 
     * @param pDestination
     *            the current value of the <code>Destination</code> property.
     */
    public void setDestination(final GeographicDataDto pDestination) {
        this.destination = pDestination;
    }

    /**
     * Sets the <code>Distance</code> property.
     * <p>
     * 
     * @param pDistance
     *            the current value of the <code>Distance</code> property.
     */
    public void setDistance(final Double pDistance) {
        this.distance = pDistance;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     * GeographicDataDto} containing <code>GeographicDataDto</code> details.
     * <p>
     * 
     * @param pOrigin
     *            the current value of the <code>Origin</code> property.
     */
    public void setOrigin(final GeographicDataDto pOrigin) {
        this.origin = pOrigin;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateDto
     * TariffRateDto} containing <code>TariffRateDto</code> details.
     * <p>
     * 
     * @param pTariffRateDtos
     *            the current value of the <code>TariffRateDtos</code> property.
     */
    public void setTariffRateDtos(final List<TariffRateDto> pTariffRateDtos) {
        this.tariffRateDtos = pTariffRateDtos;
    }

    /**
     * Creates the String representation of <code>ContractListEntryDto</code>.
     * <p>
     * This will return the String representation based on Contract List.
     * <p>
     * 
     * @return the String representation of <code>ContractListEntryDto</code>.
     */
    public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();
        // SuppressOff:MagicNumber

        csvString.append(this.prefixSuffixByQuotes(this.getOrigin().getCode()));

        csvString.append(this.prefixSuffixByQuotes(this.getDestination().getCode()));

        csvString.append(this.prefixSuffixByQuotes(this.getCarrierCode()));

        if (this.getOrigin().getType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getOrigin().getType().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getOrigin().getCityName() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getOrigin().getCityName()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getOrigin().getStateCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getOrigin().getStateCode()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getOrigin().getCountryCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getOrigin().getCountryCode()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getDestination().getType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getDestination().getType().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getDestination().getCityName() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getDestination().getCityName()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getDestination().getStateCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getDestination().getStateCode()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getDestination().getCountryCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getDestination().getCountryCode()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getDistance() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getDistance().toString()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        return csvString.toString();
    }

    /**
     * prefixes and suffixes a given string with open quotes.
     * 
     * @param pString the new value of the <code>value</code>.
     * 
     * @return aModifiedString the new value of the <code>aModifiedString</code>.
     * 
     * 
     */
    private String prefixSuffixByQuotes(final String pString) {
        final String aQUOTATION = "\"";
        final String aCOMMA = ",";

        final StringBuffer aModifiedString = new StringBuffer();
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(pString);
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(aCOMMA);

        return aModifiedString.toString();
    }

    public boolean isHardDeleteIndicator() {
        return hardDeleteIndicator;
    }

    public void setHardDeleteIndicator(boolean hardDeleteIndicator) {
        this.hardDeleteIndicator = hardDeleteIndicator;
    }

	public String getInputText() {
		return inputText;
	}

	public void setInputText(String inputText) {
		this.inputText = inputText;
	}
	
	//FIS150a
	
	private List<String> tariffLines;


	public List<String> getTariffLines() {
		return tariffLines;
	}

	public void setTariffLines(List<String> tariffLines) {
		this.tariffLines = tariffLines;
	}
	
}
