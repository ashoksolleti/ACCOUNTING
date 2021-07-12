/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.TTYMessageType;

import java.util.List;

/**
 * <code>TeleTypeProfileDto</code> contains specific data related to teletype profile.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>airlineCodeNumber
 * <li>carrierCode
 * <li>destinationCode
 * <li>destinationStationCode
 * <li>flight
 * <li>fwbMsgSendingOption
 * <li>messageType
 * <li>oId
 * <li>originCode
 * <li>originStationCode
 * <li>productCode
 * <li>specialHandlingCode
 * <li>teleTypeAddress
 * </code>
 * </ul>
 */
public class TeleTypeProfileDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5764850877090275070L;

    /**
     * Attribute to hold <code>airlineCodeNumber</code> property.
     * <p>
     * The airline code number of the carrier.
     */
    private String airlineCodeNumber;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     * <p>
     * The carrier code of the teletype profile.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>destinationCode</code> property.
     * <p>
     * The destination code is either country code or IATA area code.
     */
    private String destinationCode;

    /**
     * Attribute to hold <code>destinationStationCode</code> property.
     * <p>
     * The destination station code.
     */
    private String destinationStationCode;

    /**
     * Attribute to hold <code>flight</code> property.
     * <p>
     * BaseFlight data typically consists of Carrier Code, Flight Number and Flight Suffix.
     */
    private BaseFlightDto flight;

    /**
     * Attribute to hold <code>fwbMsgSendingOption</code> property.
     */
    private String fwbMsgSendingOption;

    /**
     * Attribute to hold <code>messageType</code> property.
     * <p>
     * Contains types of teletype messages.
     */
    private TTYMessageType messageType;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>originCode</code> property.
     * <p>
     * The origin code is either country code or IATA area code.
     */
    private String originCode;

    /**
     * Attribute to hold <code>originStationCode</code> property.
     * <p>
     * The origin station code.
     */
    private String originStationCode;

    /**
     * Attribute to hold <code>productCode</code> property.
     */
    private String productCode;

    /**
     * Attribute to hold <code>specialHandlingCode</code> property.
     */
    private String specialHandlingCode;

    /**
     * Attribute to hold <code>teleTypeAddress</code> property.
     * <p>
     * Represents the teletype addresses for a teletype profile. For each profile, there is a teletype
     * address. It is of type <code>TeleTypeAddressDto</code>.
     * <p>
     */
    private List<TeleTypeAddressDto> teleTypeAddress;

    /**
     * <code>Default constructor.</code>
     */
    public TeleTypeProfileDto() {

    }

    /**
     * Gets the <code>airlineCodeNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 012
     * <p>
     * 
     * @return the current value of <code>airlineCodeNumber</code> property.
     */
    public String getAirlineCodeNumber() {
        return this.airlineCodeNumber;
    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * LH
     * <p>
     * 
     * @return the current value of <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>destinationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * US,1
     * <p>
     * 
     * @return the current value of <code>destinationCode</code> property.
     */
    public String getDestinationCode() {
        return this.destinationCode;
    }

    /**
     * Gets the <code>destinationStationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of <code>destinationStationCode</code> property.
     */
    public String getDestinationStationCode() {
        return this.destinationStationCode;
    }

    /**
     * Gets the <code>flight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3-7 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * UW7500T
     * <p>
     * 
     * @return the current value of <code>flight</code> property.
     */
    public BaseFlightDto getFlight() {
        return this.flight;
    }

    /**
     * Gets the <code>fwbMsgSendingOption</code> property.
     * <p>
     * <b>Possible Values:</b>
     * <li>A - Send FWB all the time
     * <li>Blank - Send FWB only once
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of <code>fwbMsgSendingOption</code> property.
     */

    public String getFwbMsgSendingOption() {
        return this.fwbMsgSendingOption;
    }

    /**
     * Gets the <code>messageType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * FFM
     * <p>
     * 
     * @return the current value of <code>messageType</code> property.
     */
    public TTYMessageType getMessageType() {
        return this.messageType;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the teletype profile.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>originCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * US,1
     * <p>
     * 
     * @return the current value of <code>originCode</code> property.
     */
    public String getOriginCode() {
        return this.originCode;
    }

    /**
     * Gets the <code>originStationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of <code>originStationCode</code> property.
     */
    public String getOriginStationCode() {
        return this.originStationCode;
    }

    /**
     * Gets the <code>productCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * XPS
     * <p>
     * 
     * @return the current value of <code>productCode</code> property.
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the <code>specialHandlingCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @return the current value of <code>specialHandlingCode</code> property.
     */
    public String getSpecialHandlingCode() {
        return this.specialHandlingCode;
    }

    /**
     * Gets the <code>teleTypeAddress</code> property.
     * <p>
     * Represents the teletype addresses for a teletype profile. For each profile, there is a teletype
     * address.
     * <p>
     * 
     * @return the current value of list of <code>teleTypeAddress</code> property.
     */
    public List<TeleTypeAddressDto> getTeleTypeAddress() {
        return this.teleTypeAddress;
    }

    /**
     * Sets the <code>airlineCodeNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 012
     * <p>
     * 
     * @param pAirlineCodeNumber the new value of <code>airlineCodeNumber</code> property.
     */
    public void setAirlineCodeNumber(final String pAirlineCodeNumber) {
        this.airlineCodeNumber = pAirlineCodeNumber;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * LH
     * <p>
     * 
     * @param pCarrierCode the new value of <code>carrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>destinationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * US,1
     * <p>
     * 
     * @param pDestinationCode the new value of <code>destinationCode</code> property.
     */
    public void setDestinationCode(final String pDestinationCode) {
        this.destinationCode = ContractUtility.convertToUpperCase(pDestinationCode);
    }

    /**
     * Sets the <code>destinationStationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pDestinationStationCode the new value of <code>destinationStationCode</code> property.
     */
    public void setDestinationStationCode(final String pDestinationStationCode) {
        this.destinationStationCode = ContractUtility.convertToUpperCase(pDestinationStationCode);
    }

    /**
     * Sets the <code>flight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3-7 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * UW7500T
     * <p>
     * 
     * @param pFlight the new value of <code>flight</code> property.
     */
    public void setFlight(final BaseFlightDto pFlight) {
        this.flight = pFlight;
    }

    /**
     * Sets the <code>fwbMsgSendingOption</code> property.
     * <p>
     * <b>Possible Values:</b>
     * <li>A - Send FWB all the time
     * <li>Blank - Send FWB only once
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pFWBMsgSendingOption the new value of <code>fwbMsgSendingOption</code> property.
     */
    public void setFwbMsgSendingOption(final String pFWBMsgSendingOption) {
        this.fwbMsgSendingOption = ContractUtility.convertToUpperCase(pFWBMsgSendingOption);
    }

    /**
     * Sets the <code>messageType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * FFM
     * <p>
     * 
     * @param pMessageType the new value of <code>messageType</code> property.
     */
    public void setMessageType(final TTYMessageType pMessageType) {
        this.messageType = pMessageType;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the teletype profile.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>originCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * US,1
     * <p>
     * 
     * @param pOriginCode the new value of <code>originCode</code> property.
     */
    public void setOriginCode(final String pOriginCode) {
        this.originCode = ContractUtility.convertToUpperCase(pOriginCode);
    }

    /**
     * Sets the <code>originStationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pOriginStationCode the new value of <code>originStationCode</code> property.
     */
    public void setOriginStationCode(final String pOriginStationCode) {
        this.originStationCode = ContractUtility.convertToUpperCase(pOriginStationCode);
    }

    /**
     * Sets the <code>productCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * XPS
     * <p>
     * 
     * @param pProductCode the new value of <code>productCode</code> property.
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = ContractUtility.convertToUpperCase(pProductCode);
    }

    /**
     * Sets the <code>specialHandlingCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @param pSpecialHandlingCode the new value of <code>specialHandlingCode</code> property.
     */
    public void setSpecialHandlingCode(final String pSpecialHandlingCode) {
        this.specialHandlingCode = ContractUtility.convertToUpperCase(pSpecialHandlingCode);
    }

    /**
     * Sets the <code>teleTypeAddress</code> property.
     * <p>
     * Represents the teletype addresses for a teletype profile. For each profile, there is a teletype
     * address.
     * <p>
     * 
     * @param pTeleTypeAddress the new value of list of <code>teleTypeAddress</code> property.
     */
    public void setTeleTypeAddress(final List<TeleTypeAddressDto> pTeleTypeAddress) {
        this.teleTypeAddress = pTeleTypeAddress;
    }

}
