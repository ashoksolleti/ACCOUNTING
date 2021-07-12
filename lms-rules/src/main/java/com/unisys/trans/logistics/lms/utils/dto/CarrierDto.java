/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.framework.constants.SettlementMethodType;

/**
 * <code>CarrierDto</code> contains specific data applicable to the airline.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>address
 * <li>carrierAlliances
 * <li>city
 * <li>code
 * <li>country
 * <li>deletionDate
 * <li>fax
 * <li>fblInterestIndicator
 * <li>name
 * <li>number
 * <li>oId
 * <li>phone
 * <li>postalCode
 * <li>printFreightBillAddress
 * <li>printTransferIndicator
 * <li>shipmentCaptureIndicator
 * <li>state
 * </code>
 * </ul>
 */
public class CarrierDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1748424523787844770L;

    /**
     * Attribute to hold <code>address</code> property.
     */
    private String address;

    /**
     * Attribute to hold <code>airlineCodeNumber</code> property.
     */

    private String airlineCodeNumber;

    /**
     * Attribute to hold <code>carrierAlliances</code> property.
     */

    private List<CarrierAllianceDto> carrierAlliances;

    /**
     * Attribute to hold <code>city</code> property.
     */
    private String city;

    /**
     * Attribute to hold <code>code</code> property.
     */
    private String code;

    /**
     * Attribute to hold <code>country</code> property.
     */

    private String country;

    /**
     * Attribute to hold <code>deletionDate</code> property.
     */
    private Date deletionDate;

    /**
     * Attribute to hold <code>fax</code> property.
     */

    private String fax;

    /**
     * Attribute to hold <code>fblInterestIndicator</code> property.
     */

    private boolean fblInterestIndicator;

    /**
     * Attribute to hold <code>hostCarrierAWBCaptureInd</code> property.
     */
    private boolean hostCarrierAWBCaptureInd;

    /**
     * Attribute to hold <code>hostCarrierProrationInd</code> property.
     */
    private boolean hostCarrierProrationInd;

    /**
     * Attribute to hold <code>name</code> property.
     */

    private String name;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>phone</code> property.
     */

    private String phone;

    /**
     * Attribute to hold <code>postalCode</code> property.
     */

    private String postalCode;

    /**
     * Attribute to hold <code>printFreightBillAddress</code> property.
     */

    private String printFreightBillAddress;

    /**
     * Attribute to hold <code>printTransferIndicator</code> property.
     */

    private boolean printTransferIndicator;

    /**
     * Attribute to hold <code>shipmentCaptureIndicator</code> property.
     */

    private boolean shipmentCaptureIndicator;

    /**
     * Attribute to hold <code>state</code> property.
     */

    private String state;

    /**
     * Attribute to hold <code>uldControlInterestInd</code> property.
     */
    private boolean uldControlInterestInd;
    
    /**
     * Attribute to hold <code>settlementmethodType</code> property.
     */
    private SettlementMethodType settlementmethodType;
    
    /**
     * Attribute to hold <code>accountNumber</code> property.
     */
    private String accountNumber;
    private boolean  dimsRequired;

   

	public boolean isDimsRequired() {
		return dimsRequired;
	}

	public void setDimsRequired(boolean dimsRequired) {
		this.dimsRequired = dimsRequired;
	}

	/**
     * <code>Default constructor.</code>
     */

    public CarrierDto() {

    }
 
    public CarrierDto(String code,boolean shipmentCaptureIndicator,String name,
    		Date deletionDate, String airlineCodeNumber,boolean hostCarrierAWBCaptureInd,
    		boolean hostCarrierProrationInd,String accountNumber,String address,String city,
    		String country,String postalCode){
    	this.code=code;
    	this.shipmentCaptureIndicator=shipmentCaptureIndicator;
    	this.name=name;
    	this.deletionDate=deletionDate;
    	this.airlineCodeNumber=airlineCodeNumber;
    	this.hostCarrierAWBCaptureInd=hostCarrierAWBCaptureInd;
    	this.hostCarrierProrationInd=hostCarrierProrationInd;
    	this.accountNumber=accountNumber;
    	this.address=address;
    	this.city=city;
    	this.country=country;
    	this.postalCode=postalCode;
    	
    }
    /**
     * Constructor with code as an argument.
     * <p>
     * 
     * @param pCode
     *            holds the carrier code.<br>
     */
    public CarrierDto(final String pCode) {
        this.code = pCode;
    }

    /**
     * Constructor with code as an argument.
     * <p>
     * 
     * @param pCode
     *            holds the carrier code.
     * @param pName
     *            holds the name.
     * @param pDate
     *            holds the date.
     * @param pAirlineCodeNumber
     *            holds the airlinecodenumber.
     *            <p>
     * @param pShipmentCaptureIndicator
     *            holds the shipment capture indicator.
     * @param pHostCarrierProrationInd
     *            holds the Host Carrier for Proration Indicator.
     */
    public CarrierDto(final String pCode,
                final boolean pShipmentCaptureIndicator, final String pName,
                final Date pDate, final String pAirlineCodeNumber, final boolean pHostCarrierProrationInd) {
        this.airlineCodeNumber = pAirlineCodeNumber;
        this.code = pCode;
        this.shipmentCaptureIndicator = pShipmentCaptureIndicator;
        this.name = pName;
        this.deletionDate = ContractUtility.getClonedDate(pDate);
        this.hostCarrierProrationInd = pHostCarrierProrationInd;
    }
	
	 public CarrierDto(final String pCode,
                final boolean pShipmentCaptureIndicator, final String pName,
                final Date pDate, final String pAirlineCodeNumber, final boolean pHostCarrierAWBCaptureInd,
                final boolean pHostCarrierProrationInd,
                final String pAccountNumber) {
        this.airlineCodeNumber = pAirlineCodeNumber;
        this.code = pCode;
        this.shipmentCaptureIndicator = pShipmentCaptureIndicator;
        this.name = pName;
        this.deletionDate = ContractUtility.getClonedDate(pDate);
        this.hostCarrierAWBCaptureInd = pHostCarrierAWBCaptureInd;
        this.hostCarrierProrationInd = pHostCarrierProrationInd;
        this.accountNumber = pAccountNumber;
    }

    /**
     * Constructor with code as an argument.
     * <p>
     * 
     * @param pCode
     *            holds the carrier code.<br>
     * @param pAirlineCodeNumber
     *            holds the airline code number.<br>
     */
    public CarrierDto(final String pCode, final String pAirlineCodeNumber) {
        this.code = pCode;
        this.airlineCodeNumber = pAirlineCodeNumber;
    }

    /**
     * Gets the <code>address</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-36 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * POB 14000, POSTAL STN SAINT LAURENT
     * <p>
     * 
     * @return the current value of the <code>address</code> property.<br>
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Gets the value of the airline code <code>number</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 014
     * <p>
     * 
     * @return the current value of the airline code <code>number</code> property.<br>
     */
    public String getAirlineCodeNumber() {
        return this.airlineCodeNumber;
    }

    /**
     * Holds the list of {@linkplain com.unisys.trans.logistics.lms.utils.dto.CarrierAllianceDto
     * CarrierAllianceDto} containing <code>CarrierAlliance</code> details.
     * <p>
     * 
     * @return the current list of <code>CarrierAllianceDto</code> details.<br>
     */
    public List<CarrierAllianceDto> getCarrierAlliances() {
        return this.carrierAlliances;
    }

    /**
     * Gets the <code>city</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-19 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * MONTREAL
     * <p>
     * 
     * @return the current value of the <code>city</code> property.<br>
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Gets the <code>code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * AC
     * <p>
     * 
     * @return the current value of the carrier <code>code</code> property.<br>
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the <code>country</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet
     * <p>
     * <b>Example: </b><br>
     * CA
     * <p>
     * 
     * @return the current value of the <code>country</code> property.<br>
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Gets the <code>deletionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return the current value of the <code>deletionDate</code> property.
     */
    public Date getDeletionDate() {
        return ContractUtility.getClonedDate(this.deletionDate);
    }

    /**
     * Gets the <code>faxNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-16 Alphanumeric, hyphen (-), ampersand (&), single quotation mark (') and period (.), including
     * spaces.
     * <p>
     * <b>Example: </b><br>
     * 06 217537
     * <p>
     * 
     * @return the current value of the <code>faxNumber</code> property.<br>
     */
    public String getFax() {
        return this.fax;
    }

    /**
     * Gets the <code>fblInterestIndicator</code> property.
     * <p>
     * The FBL Carrier Interest indicator is used to enable Flight Booking List functionality.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The carrier is a handled carrier or alliance partner of the host.<br>
     * <li><code>false</code><br>
     * The carrier is not an FBL interest carrier and will not be enabled to FBL interest functionality.<br>
     * <p>
     * 
     * @return the current value of the <code>fblInterestIndicator</code> property.<br>
     */
    public boolean getFblInterestIndicator() {
        return this.fblInterestIndicator;
    }

    /**
     * Gets the <code>hostCarrierProrationInd</code> property.
     * <p>
     * This field indicates that the carrier is handled globally the same as the host carrier from Proration
     * perspective.
     * <p>
     * <b>Possible Values: </b>
     * <ul>
     * <li><code>true</code><br>
     * This carrier is handled as a host carrier in Proration.
     * <li><code>false</code><br>
     * This carrier is not handled as a host carrier in Proration.
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>hostCarrierProrationInd</code> property is true.<br>
     */
    public boolean getHostCarrierProrationInd() {
        return this.hostCarrierProrationInd;
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-32 Alphanumeric, hyphen (-), ampersand (&), single quotation mark (') and period (.), including
     * spaces.
     * <p>
     * <b>Example: </b><br>
     * AIR CANADA
     * <p>
     * 
     * @return the current value of the carrier <code>name</code> property.<br>
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the <code>oid</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>phone</code> number of the carrier.
     * <p>
     * <b>Format: </b><br>
     * 1-16 Alphanumeric, hyphen (-), ampersand (&), single quotation mark (') and period (.), including
     * spaces.
     * <p>
     * <b>Example: </b><br>
     * 514-522-5000
     * <p>
     * 
     * @return the current value of the <code>phone</code> number property.<br>
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Gets the <code>postalCode</code> of the carrier.
     * <p>
     * <b>Format: </b><br>
     * 5-9 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * H4Y 1H4
     * <p>
     * 
     * @return the current value of the <code>postalCode</code> of the carrier.<br>
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Gets the <code>printFreightBillAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-36 Alphanumeric, hyphen (-), ampersand (&), single quotation mark (') and period (.), including
     * spaces.
     * <p>
     * <b>Example: </b><br>
     * BOX 14000, MONTREAL CA
     * <p>
     * 
     * @return the current value of the <code>printFreightBillAddress</code> property.<br>
     */
    public String getPrintFreightBillAddress() {
        return this.printFreightBillAddress;
    }

    /**
     * Gets the <code>printTransfersIndicator</code> property.
     * <p>
     * <b>Possible values: </b><br>
     * <li><code>true</code><br>
     * indicates handled carrier transfer manifests are printed<br>
     * <li><code>false</code><br>
     * indicates handled carrier transfer manifests are not printed<br>
     * <p>
     * 
     * @return the current value of <code>printTransferIndicator</code> property.<br>
     */
    public boolean getPrintTransferIndicator() {
        return this.printTransferIndicator;
    }

    /**
     * Gets the <code>shipmentCaptureIndicator</code> property .
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * if shipment data capture is required.
     * <li><code>false</code><br>
     * if shipment data capture is not required.<br>
     * <p>
     * 
     * @return the current value of the <code>shipmentCaptureIndicator</code> at flight assignment time for
     *         all the air waybills.<br>
     */
    public boolean getShipmentCaptureIndicator() {
        return this.shipmentCaptureIndicator;
    }

    /**
     * Gets the <code>state</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-5 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * QUEBEC
     * <p>
     * 
     * @return the <code>state</code> of the carrier.<br>
     */
    public String getState() {
        return this.state;
    }

    /**
     * Gets the <code>fblInterestIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The carrier is a handled carrier or alliance partner of the host.<br>
     * <li><code>false</code><br>
     * The carrier is not an FBL interest carrier and will not be enabled to FBL interest functionality.<br>
     * <p>
     * 
     * @return the current value of <code>fblInterestIndicator</code> property.<br>
     */
    public boolean isFblInterestIndicator() {
        return this.fblInterestIndicator;
    }

    /**
     * Gets the <code>hostCarrierAWBCaptureInd</code> property.
     * <p>
     * This field indicates that the carrier is handled globally the same as the host carrier from an air
     * waybill capture perspective.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * This carrier is handled as a host carrier in an air waybill capture.
     * <li><code>false</code><br>
     * This carrier is not handled as a host carrier in an air waybill capture.<br>
     * <p>
     * 
     * @return the current value of the <code>hostCarrierAWBCaptureInd</code> property is true.<br>
     */
    public boolean isHostCarrierAWBCaptureInd() {
        return this.hostCarrierAWBCaptureInd;
    }

    /**
     * Determines the <code>printTransfersIndicator</code> property .
     * <p>
     * <b>Possible values: </b><br>
     * <li><code>true</code><br>
     * Indicates handled carrier transfer manifests are printed<br>
     * <li><code>false</code><br>
     * Indicates handled carrier transfer manifests are not printed<br>
     * <p>
     * 
     * @return the current value of <code>printTransferIndicator</code> property.<br>
     */
    public boolean isPrintTransferIndicator() {
        return this.printTransferIndicator;
    }

    /**
     * Determines the <code>shipmentCaptureIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * if shipment data capture is required.
     * <li><code>false</code><br>
     * if shipment data capture is not required.<br>
     * <p>
     * 
     * @return the current value of <code>shipmentCaptureIndicator</code> property.<br>
     */
    public boolean isShipmentCaptureIndicator() {
        return this.shipmentCaptureIndicator;
    }

    /**
     * Determines the <code>uldControlInterestInd</code> property.
     * <p>
     * This field indicates that the carrier is handled and referenced in ULD control.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * This carrier is referenced in ULD Control.
     * <li><code>false</code><br>
     * This carrier is not referenced in ULD Control.<br>
     * <p>
     * 
     * @return the current value of the <code>uldControlInterestInd</code> property.<br>
     */
    public boolean isUldControlInterestInd() {
        return this.uldControlInterestInd;
    }

    /**
     * Sets the <code>address</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-36 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * POB 14000, POSTAL STN SAINT LAURENT
     * <p>
     * 
     * @param pAddress
     *            the new value of the <code>address</code> property.<br>
     */
    public void setAddress(final String pAddress) {
        this.address = pAddress;
    }

    /**
     * Sets the <code>airlineCodeNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric.
     * <p>
     * <b>Example: </b><br>
     * 014
     * <p>
     * 
     * @param pAirlineCodeNumber
     *            the new value of the <code>airlineCodeNumber</code> of the
     *            carrier.<br>
     */
    public void setAirlineCodeNumber(final String pAirlineCodeNumber) {
        this.airlineCodeNumber = pAirlineCodeNumber;
    }

    /**
     * Sets the list of {@linkplain com.unisys.trans.logistics.lms.utils.dto.CarrierAllianceDto
     * CarrierAllianceDto} containing <code>CarrierAlliance</code> type details.
     * <p>
     * 
     * @param pCarrierAlliance
     *            the new value of the <code>CarrierAllianceDto</code> type
     *            details.<br>
     */
    public void setCarrierAlliances(
                final List<CarrierAllianceDto> pCarrierAlliance) {
        this.carrierAlliances = pCarrierAlliance;
    }

    /**
     * Sets the <code>city</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-19 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * MONTREAL
     * <p>
     * 
     * @param pCity
     *            the new value of the <code>city</code> of the carrier.<br>
     */
    public void setCity(final String pCity) {
        this.city = ContractUtility.convertToUpperCase(pCity);
    }

    /**
     * Sets the <code>code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alpha Numeric.
     * <p>
     * <b>Example: </b><br>
     * AC
     * <p>
     * 
     * @param pCode
     *            the new value of the <code>code</code> of the carrier.<br>
     */
    public void setCode(final String pCode) {
        this.code = ContractUtility.convertToUpperCase(pCode);
    }

    /**
     * Sets the <code>country</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet.
     * <p>
     * <b>Example: </b><br>
     * CA
     * <p>
     * 
     * @param pCountry
     *            the new value of the <code>country</code> of the carrier.<br>
     */
    public void setCountry(final String pCountry) {
        this.country = ContractUtility.convertToUpperCase(pCountry);
    }

    /**
     * Sets the <code>deletionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @param pDeletionDate
     *            the new value of the <code>deletionDate</code> property.
     */
    public void setDeletionDate(final Date pDeletionDate) {
        this.deletionDate = ContractUtility.getClonedDate(pDeletionDate);
    }

    /**
     * Sets the <code>faxNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-16 Alphanumeric, hyphen (-), ampersand (&), single quotation mark (') and period (.), including
     * spaces.
     * <p>
     * <b>Example: </b><br>
     * 06 217537
     * <p>
     * 
     * @param pFaxNumber
     *            the new value of the <code>faxNumber</code> of the carrier.<br>
     */
    public void setFax(final String pFaxNumber) {
        this.fax = pFaxNumber;
    }

    /**
     * Sets the <code>fblInterestIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The carrier is a handled carrier or alliance partner of the host.
     * <li><code>false</code><br>
     * The carrier is not an FBL interest carrier and will not be enabled to FBL interest functionality.<br>
     * <p>
     * 
     * @param pFBLInterestIndicator
     *            the new value of the <code>fblInterestIndicator</code> property.<bR>
     */
    public void setFblInterestIndicator(final boolean pFBLInterestIndicator) {
        this.fblInterestIndicator = pFBLInterestIndicator;
    }

    /**
     * Sets the <code>hostCarrierAWBCaptureInd</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * This carrier is handled as a host carrier in an air waybill capture.<br>
     * <li><code>false</code><br>
     * This carrier is not handled as a host carrier in an air waybill capture.<br>
     * <p>
     * 
     * @param pHostCarrierAWBCaptureInd
     *            the new value of the <code>hostCarrierAWBCaptureInd</code> property.<br>
     */
    public void setHostCarrierAWBCaptureInd(
                final boolean pHostCarrierAWBCaptureInd) {
        this.hostCarrierAWBCaptureInd = pHostCarrierAWBCaptureInd;
    }

    /**
     * Sets the <code>hostCarrierProrationInd</code> property.
     * <p>
     * <b>Possible Values: </b>
     * <ul>
     * <li><code>true</code><br>
     * This carrier is handled as a host carrier in Proration.
     * <li><code>false</code><br>
     * This carrier is not handled as a host carrier in Proration.
     * </ul>
     * <p>
     * 
     * @param pHostCarrierProrationInd the new value of the <code>hostCarrierProrationInd</code> property.
     */
    public void setHostCarrierProrationInd(boolean pHostCarrierProrationInd) {
        this.hostCarrierProrationInd = pHostCarrierProrationInd;
    }

    /**
     * Sets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-32 Alphanumeric, hyphen (-), ampersand (&), single quotation mark (') and period (.), including
     * spaces.
     * <p>
     * <b>Example: </b><br>
     * AIR CANADA
     * <p>
     * 
     * @param pName
     *            the new value of the <code>name</code> property.<br>
     */
    public void setName(final String pName) {
        this.name = pName;
    }

    /**
     * Sets the <code>oid</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>phone</code> number of the carrier.
     * <p>
     * <b>Format: </b><br>
     * 1-16 Alphanumeric, hyphen (-), ampersand (&), single quotation mark (') and period (.), including
     * spaces.
     * <p>
     * <b>Example: </b><br>
     * 514-522-5000
     * <p>
     * 
     * @param pPhoneNumber
     *            the new value of the <code>phone</code> number property.<br>
     */
    public void setPhone(final String pPhoneNumber) {
        this.phone = pPhoneNumber;
    }

    /**
     * Sets the <code>postalCode</code> of the carrier.
     * <p>
     * <b>Format: </b><br>
     * 5-9 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * H4Y 1H4
     * <p>
     * 
     * @param pPostalCode
     *            holds the new value of the <code>postalCode</code> of the
     *            carrier.<br>
     */
    public void setPostalCode(final String pPostalCode) {
        this.postalCode = pPostalCode;
    }

    /**
     * Sets the <code>printFreightBillAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-36 Alphanumeric, hyphen (-), ampersand (&), single quotation mark (') and period (.), including
     * spaces.
     * <p>
     * <b>Example: </b><br>
     * BOX 14000, MONTREAL CA
     * <p>
     * 
     * @param pPrintFreightBillAddress
     *            the new value of the <code>printFreightBillAddress</code> property.<br>
     */
    public void setPrintFreightBillAddress(final String pPrintFreightBillAddress) {
        this.printFreightBillAddress = pPrintFreightBillAddress;
    }

    /**
     * Sets the <code>printTransfersIndicator</code> property.
     * <p>
     * <b>Possible values: </b><br>
     * <li><code>true</code><br>
     * Indicates handled carrier transfer manifests are printed.
     * <li><code>false</code><br>
     * Indicates handled carrier transfer manifests are not printed.<br>
     * <p>
     * 
     * @param pPrintTransferIndicator
     *            the new value of the <code>printTransfersIndicator</code> property.
     */
    public void setPrintTransferIndicator(final boolean pPrintTransferIndicator) {
        this.printTransferIndicator = pPrintTransferIndicator;
    }

    /**
     * Sets the <code>shipmentCaptureIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * if shipment data capture is required.
     * <li><code>false</code><br>
     * if shipment data capture is not required.<br>
     * <p>
     * 
     * @param pShipmentCaptureIndicator
     *            the new value of the <code>shipmentCaptureIndicator</code> at flight assignment time for all
     *            the air waybills.<br>
     */
    public void setShipmentCaptureIndicator(
                final boolean pShipmentCaptureIndicator) {
        this.shipmentCaptureIndicator = pShipmentCaptureIndicator;
    }

    /**
     * Sets the <code>state</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-5 Alphanumeric, hyphen (-), and period (.) including spaces.
     * <p>
     * <b>Example: </b><br>
     * QUEBEC
     * <p>
     * 
     * @param pState
     *            contains the new value of the <code>state</code> property.<br>
     */
    public void setState(final String pState) {
        this.state = pState;
    }

    /**
     * Sets the <code>uldControlInterestInd</code> property.
     * <p>
     * This field indicates that the carrier is handled and referenced in ULD control.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * This carrier is referenced in ULD Control.
     * <li><code>false</code><br>
     * This carrier is not referenced in ULD Control.<br>
     * <p>
     * 
     * @param pUldControlInterestInd
     *            the new value of the <code>uldControlInterestInd</code> property.<br>
     */
    public void setUldControlInterestInd(final boolean pUldControlInterestInd) {
        this.uldControlInterestInd = pUldControlInterestInd;
    }

	public SettlementMethodType getSettlementmethodType() {
		return settlementmethodType;
	}

	public void setSettlementmethodType(SettlementMethodType settlementmethodType) {
		this.settlementmethodType = settlementmethodType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
