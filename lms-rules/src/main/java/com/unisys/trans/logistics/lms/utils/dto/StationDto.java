/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>Station</code> entity contains specific data applicable to the station.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>address
 * <li>airportIndicator
 * <li>carrierDefaults
 * <li>city
 * <li>customsTeletypeIndicator
 * <li>entityType
 * <li>exportFacsimileNumber
 * <li>exportPhoneNumber
 * <li>exportTeletype1
 * <li>exportTeletype2
 * <li>exportTeletype3
 * <li>expressOrSmallPackageDefaultLocation
 * <li>hostHandledBy
 * <li>hostStationIndicator
 * <li>iataDistrict
 * <li>iataSubDistrict
 * <li>importFacsimileNumber
 * <li>importPhoneNumber
 * <li>importTeletype1
 * <li>importTeletype2
 * <li>importTeletype3
 * <li>mechanizedStationIndicator
 * <li>nextTimeChange
 * <li>oId
 * <li>phone
 * <li>postalCode
 * <li>quickRampTransfer
 * <li>stationAutoCheckProductCodes
 * <li>stationCashIndicator
 * <li>stationCode
 * <li>stationControlParameter
 * <li>stationHandledCarriers
 * <li>stationName
 * <li>stationNonQueueReasonCodes
 * <li>stationServiceDetail
 * <li>teletypeAddress
 * <li>terminalOperator
 * <li>truckFacsimileNumber
 * <li>truckPhoneNumber
 * <li>truckTeletype1
 * <li>truckTeletype2
 * <li>weightUnit
 * </code>
 * </ul>
 */
public class StationDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6899741088876545957L;

    /**
     * Attribute to hold <code>address</code> property.
     * <p>
     * Specifies the street address of the station.
     */

    private String address;

    /**
     * Attribute to hold <code>airportIndicator</code> property.
     * <p>
     * Indicates if the station is a city or an airport
     * <li><code>true</code><br>
     * Indicates if the station is an airport This is the default value.
     * <li><code>false</code><br>
     * Indicates if the station is city and not an airport It also means that the station could be a city,
     * country, or an aggregate.<br>
     */

    private boolean airportIndicator;

    /**
     * Attribute to hold <code>carrierDefaultDtos</code> property.
     */
    private List<CarrierDefaultDto> carrierDefaults;

    /**
     * Attribute to hold <code>city</code> property.
     * <p>
     * The City data transfer object which holds the freight station's city information.
     */
    private CityDto city;

    /**
     * Attribute to hold <code>cityCode</code> property.
     */
    private String cityCode;

    /**
     * Attribute to hold <code>countryCode</code> property.
     */
    private String countryCode;

    /**
     * Attribute to hold <code>customsTeletypeIndicator</code> property.
     * <p>
     * Indicates if the community system teletype address is included for customs or not.
     * <li><code>true</code><br>
     * The community system is included for customs.
     * <li><code>false</code><br>
     * The community system is not included for customs The default value is false.<br>
     */
    private boolean customsTeletypeIndicator;

    /**
     * Attribute to hold <code>entityType</code> property.
     * <p>
     * Indicates the type of entity of the hostHandledBy field. If hostHandledBy is not null then entry of
     * this field is mandatory. If hostHandledBy is null then entry of this field is prohibited.
     */

    private int entityType;

    /**
     * Attribute to hold <code>exportFacsimileNumber</code> property.
     * <p>
     * Specifies the facsimile telephone number for the export operation of this station.
     */

    private String exportFacsimileNumber;

    /**
     * Attribute to hold <code>exportPhoneNumber</code> property.
     * <p>
     * Specifies the telephone number for the export operation of this station.
     */

    private String exportPhoneNumber;

    /**
     * Attribute to hold <code>exportTeletype1</code> property.
     * <p>
     * Specifies the teletype address for the export operation of this station.
     */

    private String exportTeletype1;

    /**
     * Attribute to hold <code>exportTeletype2</code> property.
     * <p>
     * Specifies the teletype address for the export operation of this station.
     */

    private String exportTeletype2;

    /**
     * Attribute to hold <code>exportTeletype3</code> property.
     * <p>
     * Specifies the teletype address for the export operation of this station.
     */

    private String exportTeletype3;

    /**
     * Attribute to hold <code>expressOrSmallPackageDefaultLocation</code> property.
     * <p>
     * The default location for the acceptance of goods; for the Express AWB function at this station. If this
     * field is blank, then the system wide default system location parameter is used by the Accept Goods
     * function.
     */

    private String expressOrSmallPackageDefaultLocation;

    /**
     * Attribute to hold <code>hostHandledBy</code> property.
     * <p>
     * This is the identifier of the entity that handles the carrier at this station. If this field is left
     * blank, then the carrier handles itself at this station. If the field is entered, it can be a carrier
     * code, a USCS firm's code, or a cargo terminal operator ID. Changing the value of this field can affect
     * the operation of the Customs module.If the Type field is set to Carrier, this field is checked against
     * the carrier code table to determine if the carrier code entered is valid.
     */

    private String hostHandledBy;

    /**
     * Attribute to hold <code>hostStationIndicator</code> property.
     * <p>
     * A host station is any station the host of the system flies to or departs from on a regular basis. It
     * does not matter if the host has ground personnel there, or is handled by another carrier. If a host
     * station is changed to non-host, but the station is the owner of any air waybills or ULDs with
     * associated discrepancies,then a warning is displayed. If a host station is changed to non-host, but the
     * station is the owner of any data sets indicating unfinished host business, then a warning is displayed.
     * Indicates if the station is host or not.
     * <li><code>true</code><br>
     * Indicates this is a host station.
     * <li><code>false</code><br>
     * Indicates this is not a host station This is the default value.<br>
     */
    private boolean hostStationIndicator;

    /**
     * Attribute to hold <code>iataDistrict</code> property.
     * <p>
     * Specifies the district code. If REGION is entered, then the entry of this field is mandatory. If Region
     * is blank, then entry of this field is prohibited. Changing the value of this field can affect the
     * operation of the Cargo Management Reporting Interface (CMI).
     */

    private String iataDistrict;

    /**
     * Attribute to hold <code>iataSubDistrict</code> property.
     * <p>
     * Specifies the sub-district code. If Region is entered, then entry of this field is mandatory. If Region
     * is not entered, then entry of this field is prohibited. Changing the value of this field can affect the
     * operation of the Cargo Management Reporting Interface (CMI).
     */

    private String iataSubDistrict;

    /**
     * Attribute to hold <code>importFacsimileNumber</code> property.
     * <p>
     * Specifies the facsimile telephone number for the import operation of this station.
     */

    private String importFacsimileNumber;

    /**
     * Attribute to hold <code>importPhoneNumber</code> property.
     * <p>
     * Specifies the telephone number for the import operation of this station.
     */

    private String importPhoneNumber;

    /**
     * Attribute to hold <code>importTeletype1</code> property.
     * <p>
     * Specifies the teletype address for the import operation of this station.
     */

    private String importTeletype1;

    /**
     * Attribute to hold <code>importTeletype2</code> property.
     * <p>
     * Specifies the teletype address for the import operation of this station.
     */

    private String importTeletype2;

    /**
     * Attribute to hold <code>importTeletype3</code> property.
     * <p>
     * Specifies the teletype address for the import operation of this station.
     */

    private String importTeletype3;

    /**
     * Attribute to hold <code>mechanizedStationIndicator</code> property.
     * <p>
     * Indicates whether or not the station has VDTs. Determines if the station is mechanized or not and
     * applies to both import and export.
     * <li><code>true</code><br>
     * Indicates the station is mechanized.
     * <li><code>false</code><br>
     * Indicates the station is not mechanized.
     */
    private boolean mechanizedStationIndicator;

    /**
     * Attribute to hold <code>nextTimeChange</code> property.
     */

    private Date nextTimeChange;

    /**
     * Attribute to hold <code>oId</code> property. Unique identifier for station
     */

    private Long oId;

    /**
     * Attribute to hold <code>phone</code> property.
     * <p>
     * Indicates the teletype telephone of the community system at this station.
     */

    private String phone;

    /**
     * Attribute to hold <code>postalCode</code> property.
     * <p>
     * Specifies the postal code where the station is located.
     */

    private String postalCode;

    /**
     * Attribute to hold <code>quickRampTransfer</code> property.
     * <p>
     * Special handling code to be automatically generated when a quick ramp transfer product code is
     * associated with the air waybill. If the field is blank, LMS does not automatically generate a special
     * handling code for quick ramp transfer services at this transit station.
     */

    private String quickRampTransfer;

    /**
     * Attribute to hold <code>stationAutoCheckProductCodes</code> property.
     * <p>
     * Represents the List of<code>StationAutoCheckProductCodeDto</code> object which contain the product code
     * that can be auto-checked in to the Station.<br>
     */
    private List<StationAutoCheckProductCodeDto> stationAutoCheckProductCodes;

    /**
     * Attribute to hold <code>stationCashIndicator</code> property.
     * <p>
     * Station level indicator requiring station cash is used in conjunction with a system dynamic parameter.
     * The LMS parameter is C$STCA. This field indicates the determination of the open to audit flag.
     * <li><code>true</code><br>
     * Station Cash is required for the air waybill to clear audit.
     * <li><code>false</code><br>
     * Station Cash is not required for the air waybill to clear audit This is the default value.<br>
     */

    private boolean stationCashIndicator;

    /**
     * Attribute to hold <code>stationCode</code> property.
     */

    private String stationCode;

    /**
     * Attribute to hold <code>stationControlParameterDto</code> property.
     * <p>
     * Represents the <code>StationControlParameterDto</code> object contains the automatic and manual control
     * parameter of the station.<br>
     */
    private StationControlParameterDto stationControlParameter;

    /**
     * Attribute to hold <code>stationHandledCarrierDtos</code> property.
     * <p>
     * Represents the List of<code>StationControlParameterDto</code> object contain the carrier information
     * which is handled by the station.<br>
     */
    private List<StationHandledCarrierDto> stationHandledCarriers;

    /**
     * Attribute to hold <code>stationName</code> property.
     * <p>
     * Specifies the station name, usually the name of the airport that the station is loaded in.
     */

    private String stationName;

    /**
     * Attribute to hold <code>stationNonQueueReasonCodeDtos</code> property.
     * <p>
     * Represents the List of<code>StationNonQueueReasonCodeDto</code> objects contain reason code that should
     * not be queued into the station.<br>
     */
    private List<StationNonQueueReasonCodeDto> stationNonQueueReasonCodes;

    /**
     * Attribute to hold <code>stationServiceDetailDto</code> property.
     */
    private StationServiceDetailDto stationServiceDetail;

    /**
     * Attribute to hold <code>teletypeAddress</code> property.
     * <p>
     * Indicates the teletype address of the community system at this station.
     */

    private String teleTypeAddress;

    /**
     * Attribute to hold <code>terminalOperator</code> property.
     * <p>
     * It is a Cargo terminal operator ID.
     */

    private String terminalOperator;

    /**
     * Attribute to hold <code>truckFacsimileNumber</code> property.
     * <p>
     * Specifies the facsimile telephone number for the truck operation of this station.
     */

    private String truckFacsimileNumber;

    /**
     * Attribute to hold <code>truckPhoneNumber</code> property.
     * <p>
     * Specifies the telephone number for the truck operation of this station.
     */

    private String truckPhoneNumber;

    /**
     * Attribute to hold <code>truckTeletype1</code> property.
     * <p>
     * Specifies the TTY address for the truck operation of this station.
     */

    private String truckTeletype1;

    /**
     * Attribute to hold <code>truckTeletype2</code> property.
     * <p>
     * Specifies the TTY address for the truck operation of this station.
     */

    private String truckTeletype2;

    /**
     * Attribute to hold <code>weightUOM</code> property.
     */
    private WeightUOMType weightUOM;
    
    private Boolean eAwbMultilateral;
    
    //UIS110 start
    /**
     * Attribute to hold <code>latitude</code> property.
     */
    private String latitude;

    /**
     * Attribute to hold <code>longitude</code> property.
     */
    private String longitude;
    
    private boolean stationValidationInd;
    

	//UIS110 end
    /**
     * <code>Default constructor.</code>
     */
    public StationDto() {

    }

    /**
     * Constructor with code as an argument.
     * <p>
     * 
     * @param pCode the new value of the <code>stationCode</code> property.
     * @param pAirportIndicator the new value of the <code>airportIndicator</code> property.
     * @param pCityCode the new value of the <code>cityCode</code> property.
     * @param pStationRestrictionsControlStation the new value of the
     *            <code>stationRestrictionsControlStation</code> property.
     */
    public StationDto(final String pCode, final boolean pAirportIndicator, final String pCityCode,
                final String pStationRestrictionsControlStation) {
        this.stationCode = pCode;
        this.airportIndicator = pAirportIndicator;
        this.cityCode = pCityCode;
        this.stationControlParameter = new StationControlParameterDto();
        this.stationControlParameter.setStationRestrictionsControlStation(pStationRestrictionsControlStation);
    }

    

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}



	/**
     * Constructor with code as an argument.
     * <p>
     * 
     * @param pStationCode the new value of the <code>stationCode</code> property.
     * @param pOId the new value of the <code>oId</code> property.
     * @param pStationName the new value of the <code>stationName</code> property.
     */
    public StationDto(final String pStationCode, final long pOId, final String pStationName) {
        this.stationCode = pStationCode;
        this.oId = pOId;
        this.stationName = pStationName;
    }

    /**
     * Gets the value for the <code>address</code> property.
     * <p>
     * Specifies the street address of the station.
     * <p>
     * <b>Format: </b><br>
     * 1-36 Alphanumeric, hyphen (-), and period (.) including spaces
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
     * Gets the value for the <code>carrierDefaults</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrierDefaults</code> property.<br>
     */
    public List<CarrierDefaultDto> getCarrierDefaults() {
        return this.carrierDefaults;
    }

    /**
     * Gets the value for the <code>city</code> property.
     * <p>
     * The City data transfer object which holds the freight station's city information.
     * <p>
     * 
     * @return the current value of the <code>city</code> property.<br>
     */
    public CityDto getCity() {
        return this.city;
    }

    /**
     * Gets the value for the <code>cityCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MAS
     * <p>
     * 
     * @return the current value of the <code>cityCode</code> property.<br>
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * Gets the value for the <code>countryCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @return the current value of the <code>countryCode</code> property.<br>
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Gets the value of the <code>entityType</code> property.
     * <p>
     * Indicates the type of entity of the hostHandledBy field. If hostHandledBy is not null then entry of
     * this field is mandatory. If hostHandledBy is null then entry of this field is prohibited.
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric.
     * <p>
     * <b>Example: </b><br>
     * 1
     * <p>
     * 
     * @return the current value of the <code>entityType</code> property.<br>
     */
    public int getEntityType() {
        return this.entityType;
    }

    /**
     * Gets the value of the <code>exportFacsimileNumber</code> property.
     * <p>
     * Specifies the facsimile telephone number for the export operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @return the current value of the <code>exportFacsimileNumber</code> property.<br>
     */
    public String getExportFacsimileNumber() {
        return this.exportFacsimileNumber;
    }

    /**
     * Gets the value of the <code>exportPhoneNumber</code> property.
     * <p>
     * Specifies the telephone number for the export operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @return the current value of the <code>exportFacsimileNumber</code> property.<br>
     */
    public String getExportPhoneNumber() {
        return this.exportPhoneNumber;
    }

    /**
     * Gets the value of the <code>exportTeletype1</code> property.
     * <p>
     * Specifies the teletype address for the export operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @return the current value of the <code>exportTeletype1</code> property.<br>
     */
    public String getExportTeletype1() {
        return this.exportTeletype1;
    }

    /**
     * Gets the value of the <code>exportTeletype2</code> property.
     * <p>
     * Specifies the teletype address for the export operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @return the current value of the <code>exportTeletype2</code> property.<br>
     */
    public String getExportTeletype2() {
        return this.exportTeletype2;
    }

    /**
     * Gets the value of the <code>exportTeletype3</code> property.
     * <p>
     * Specifies the teletype address for the export operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @return the current value of the <code>exportTeletype3</code> property.<br>
     */
    public String getExportTeletype3() {
        return this.exportTeletype3;
    }

    /**
     * Gets the value of the <code>expressOrSmallPackageDefaultLocation</code> property.
     * <p>
     * The default location for the acceptance of goods; for the Express AWB function at this station. If this
     * field is blank, then the system wide default system location parameter is used by the Accept Goods
     * function.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * 1EXPORT
     * <p>
     * 
     * @return the current value of the <code>expressOrSmallPackageDefaultLocation</code> property.<br>
     */
    public String getExpressOrSmallPackageDefaultLocation() {
        return this.expressOrSmallPackageDefaultLocation;
    }

    /**
     * Gets the value of the <code>hostHandledBy</code> property.
     * <p>
     * This is the identifier of the entity that handles the carrier at this station. If this field is left
     * blank, then the carrier handles itself at this station. If the field is entered, it can be a carrier
     * code, a USCS firm's code, or a cargo terminal operator ID. Changing the value of this field can affect
     * the operation of the Customs module.If the Type field is set to Carrier, this field is checked against
     * the carrier code table to determine if the carrier code entered is valid.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @return the current value of the <code>hostHandledBy</code> property.<br>
     */
    public String getHostHandledBy() {
        return this.hostHandledBy;
    }

    /**
     * Gets the value of the <code>iataDistrict</code> property.
     * <p>
     * Specifies the district code. If REGION is entered, then the entry of this field is mandatory. If Region
     * is blank, then entry of this field is prohibited. Changing the value of this field can affect the
     * operation of the Cargo Management Reporting Interface (CMI).
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * AA
     * <p>
     * 
     * @return the current value of the <code>iataDistrict</code> property.<br>
     */
    public String getIataDistrict() {
        return this.iataDistrict;
    }

    /**
     * Gets the value of the <code>iataSubDistrict</code> property.
     * <p>
     * Specifies the sub-district code. If Region is entered, then entry of this field is mandatory. If Region
     * is not entered, then entry of this field is prohibited. Changing the value of this field can affect the
     * operation of the Cargo Management Reporting Interface (CMI).
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * AA
     * <p>
     * 
     * @return the current value of the <code>iataSubDistrict</code> property.<br>
     */
    public String getIataSubDistrict() {
        return this.iataSubDistrict;
    }

    /**
     * Gets the value of the <code>importFacsimileNumber</code> property.
     * <p>
     * Specifies the facsimile telephone number for the import operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @return the current value of the <code>importFacsimileNumber</code> property.<br>
     */
    public String getImportFacsimileNumber() {
        return this.importFacsimileNumber;
    }

    /**
     * Gets the value of the <code>importPhoneNumber</code> property.
     * <p>
     * Specifies the telephone number for the import operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @return the current value of the <code>importPhoneNumber</code> property.<br>
     */
    public String getImportPhoneNumber() {
        return this.importPhoneNumber;
    }

    /**
     * Gets the value of the <code>importTeletype1</code> property.
     * <p>
     * Specifies the teletype address for the import operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @return the current value of the <code>importTeletype1</code> property.<br>
     */
    public String getImportTeletype1() {
        return this.importTeletype1;
    }

    /**
     * Gets the value of the <code>importTeletype2</code> property.
     * <p>
     * Specifies the teletype address for the import operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @return the current value of the <code>importTeletype2</code> property.<br>
     */
    public String getImportTeletype2() {
        return this.importTeletype2;
    }

    /**
     * Gets the value of the <code>importTeletype3</code> property.
     * <p>
     * Specifies the teletype address for the import operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @return the current value of the <code>importTeletype2</code> property.<br>
     */
    public String getImportTeletype3() {
        return this.importTeletype3;
    }

    /**
     * Gets the value of the <code>nextTimeChange</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 09OCT07
     * <p>
     * 
     * @return the current value of the <code>nextTimeChange</code> property.<br>
     */
    public Date getNextTimeChange() {
        return ContractUtility.getClonedDate(this.nextTimeChange);
    }

    /**
     * Gets the value of <code>OID</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of the <code>phone</code> property.
     * <p>
     * Indicates the teletype telephone of the community system at this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @return the current value of the <code>phone</code> property.<br>
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Gets the value of the <code>postalCode</code> property.
     * <p>
     * Specifies the postal code where the station is located.
     * <p>
     * <b>Format: </b><br>
     * 1-8 Alphanumeric, hypen(-) and period(.) including space.
     * <p>
     * <b>Example: </b><br>
     * 55121
     * <p>
     * 
     * @return the current value of the <code>postalCode</code> property.<br>
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Gets the value of the <code>quickRampTransfer</code> property.
     * <p>
     * Special handling code to be automatically generated when a quick ramp transfer product code is
     * associated with the air waybill. If the field is blank, LMS does not automatically generate a special
     * handling code for quick ramp transfer services at this transit station.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @return the current value of the <code>quickRampTransfer</code> property.<br>
     */
    public String getQuickRampTransfer() {
        return this.quickRampTransfer;
    }

    /**
     * Gets the value of the <code>stationAutoCheckProductCodes</code> property.
     * <p>
     * Represents the List of<code>StationAutoCheckProductCodeDto</code> object which contain the product code
     * that can be auto-checked in to the Station.<br>
     * <p>
     * 
     * @return the current value of the <code>stationAutoCheckProductCodes</code> property.<br>
     */
    public List<StationAutoCheckProductCodeDto> getStationAutoCheckProductCodes() {
        return this.stationAutoCheckProductCodes;
    }

    /**
     * Gets the value of the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 or 5 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>stationCode</code> property.<br>
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Gets the value of the <code>stationControlParameter</code> property.
     * <p>
     * Represents the <code>StationControlParameterDto</code> object contains the automatic and manual control
     * parameter of the station.<br>
     * <p>
     * 
     * @return the current value of the <code>stationControlParameter</code> property.<br>
     */
    public StationControlParameterDto getStationControlParameter() {
        return this.stationControlParameter;
    }

    /**
     * Gets the value of the <code>stationControlParameter</code> property.
     * <p>
     * Represents the List of<code>StationControlParameterDto</code> object contain the carrier information
     * which is handled by the station.<br>
     * <p>
     * 
     * @return the current value of the <code>stationHandledCarriers</code> property.<br>
     */
    public List<StationHandledCarrierDto> getStationHandledCarriers() {
        return this.stationHandledCarriers;
    }

    /**
     * Gets the value of the <code>stationName</code> property.
     * <p>
     * Specifies the station name, usually the name of the airport that the station is loaded in.
     * <p>
     * <b>Format: </b><br>
     * 1-34 any character
     * <p>
     * <b>Example: </b><br>
     * MINNEAPOLIS-ST.PAUL INTERNATIONAL
     * <p>
     * 
     * @return the current value of the <code>stationName</code> property.<br>
     */
    public String getStationName() {
        return this.stationName;
    }

    /**
     * Gets the value of the <code>stationNonQueueReasonCodes</code> property.
     * <p>
     * Represents the List of<code>StationNonQueueReasonCodeDto</code> objects contain reason code that should
     * not be queued into the station.<br>
     * <p>
     * 
     * @return the current value of the <code>stationNonQueueReasonCodes</code> property.<br>
     */
    public List<StationNonQueueReasonCodeDto> getStationNonQueueReasonCodes() {
        return this.stationNonQueueReasonCodes;
    }

    /**
     * Gets the value of the <code>stationNonQueueReasonCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationServiceDetail</code> property.<br>
     */
    public StationServiceDetailDto getStationServiceDetail() {
        return this.stationServiceDetail;
    }

    /**
     * Gets the value of the <code>teletypeAddress</code> property.
     * <p>
     * Indicates the teletype address of the community system at this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @return the current value of the <code>teleTypeAddress</code> property.<br>
     */
    public String getTeleTypeAddress() {
        return this.teleTypeAddress;
    }

    /**
     * Gets the value of the <code>terminalOperator</code> property.
     * <p>
     * It is a Cargo terminal operator ID.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * 612
     * <p>
     * 
     * @return the current value of the <code>terminalOperator</code> property.<br>
     */
    public String getTerminalOperator() {
        return this.terminalOperator;
    }

    /**
     * Gets the value of the <code>truckFacsimileNumber</code> property.
     * <p>
     * Specifies the facsimile telephone number for the truck operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @return the current value of the <code>truckFacsimileNumber</code> property.<br>
     */
    public String getTruckFacsimileNumber() {
        return this.truckFacsimileNumber;
    }

    /**
     * Gets the value of the <code>truckPhoneNumber</code> property.
     * <p>
     * Specifies the telephone number for the truck operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @return the current value of the <code>truckPhoneNumber</code> property.<br>
     */
    public String getTruckPhoneNumber() {
        return this.truckPhoneNumber;
    }

    /**
     * Gets the value of the <code>truckTeletype1</code> property.
     * <p>
     * Specifies the TTY address for the truck operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @return the current value of the <code>truckTeletype1</code> property.<br>
     */
    public String getTruckTeletype1() {
        return this.truckTeletype1;
    }

    /**
     * Gets the value of the <code>truckTeletype2</code> property.
     * <p>
     * Specifies the TTY address for the truck operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @return the current value of the <code>truckTeletype2</code> property.<br>
     */
    public String getTruckTeletype2() {
        return this.truckTeletype2;
    }

    /**
     * Gets the value of the <code>weightUOM</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * KG,LB
     * <p>
     * 
     * @return the current value of the <code>weightUOM</code> property.<br>
     */
    public WeightUOMType getWeightUOM() {
        return this.weightUOM;
    }

    /**
     * Gets the value of <code>airportIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>airportIndicator</code> property.<br>
     */
    public boolean isAirportIndicator() {
        return this.airportIndicator;
    }

    /**
     * Gets the value of <code>customsTeletypeIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>customsTeletypeIndicator</code> property.<br>
     */
    public boolean isCustomsTeletypeIndicator() {
        return this.customsTeletypeIndicator;
    }

    /**
     * Gets the value of <code>hostStationIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>hostStationIndicator</code> property.<br>
     */
    public boolean isHostStationIndicator() {
        return this.hostStationIndicator;
    }

    /**
     * Gets the value of <code>mechanizedStationIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>mechanizedStationIndicator</code> property.<br>
     */
    public boolean isMechanizedStationIndicator() {
        return this.mechanizedStationIndicator;
    }

    /**
     * Gets the value of <code>stationCashIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationCashIndicator</code> property.<br>
     */
    public boolean isStationCashIndicator() {
        return this.stationCashIndicator;
    }

    /**
     * Sets the value of the <code>address</code> property.
     * <p>
     * Specifies the street address of the station.
     * <p>
     * <b>Format: </b><br>
     * 1-36 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * POB 14000, POSTAL STN SAINT LAURENT
     * <p>
     * 
     * @param pAddress the new value of the <code>address</code> property.<br>
     */
    public void setAddress(final String pAddress) {
        this.address = pAddress;
    }

    /**
     * Sets the value of <code>airportIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * Indicates if the station is an airport This is the default value.
     * <li><code>false</code><br>
     * Indicates if the station is city and not an airport
     * <p>
     * 
     * @param pAirportIndicator the new value of the <code>airportIndicator</code> property.<br>
     */
    public void setAirportIndicator(final boolean pAirportIndicator) {
        this.airportIndicator = pAirportIndicator;
    }

    /**
     * Sets the value of <code>carrierDefaults</code> property.
     * <p>
     * 
     * @param pCarrierDefaultDtos the new value of the <code>carrierDefaults</code> property.<br>
     */
    public void setCarrierDefaults(final List<CarrierDefaultDto> pCarrierDefaultDtos) {
        this.carrierDefaults = pCarrierDefaultDtos;
    }

    /**
     * Sets the value of <code>city</code> property.
     * <p>
     * The City data transfer object which holds the freight station's city information.
     * <p>
     * 
     * @param pCityDto the new value of the <code>city</code> property.<br>
     */
    public void setCity(final CityDto pCityDto) {
        this.city = pCityDto;
    }

    /**
     * Sets the value of the <code>cityCode</code> property.
     * <p>
     * 
     * @param pCityCode the new value of the <code>cityCode</code> property.
     */
    public void setCityCode(final String pCityCode) {
        this.cityCode = ContractUtility.convertToUpperCase(pCityCode);
    }

    /**
     * Sets the value of the <code>countryCode</code> property.
     * <p>
     * 
     * @param pCountryCode the new value of the <code>countryCode</code> property.<br>
     */
    public void setCountryCode(final String pCountryCode) {
        this.countryCode = ContractUtility.convertToUpperCase(pCountryCode);
    }

    /**
     * Sets the value of <code>customsTeletypeIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The community system is included for customs.
     * <li><code>false</code><br>
     * The community system is not included for customs.
     * <p>
     * 
     * @param pCustomsTeletypeIndicator the new value of the <code>customsTeletypeIndicator</code> property.<br>
     */
    public void setCustomsTeletypeIndicator(final boolean pCustomsTeletypeIndicator) {
        this.customsTeletypeIndicator = pCustomsTeletypeIndicator;
    }

    /**
     * Sets the value of the <code>entityType</code> property.
     * <p>
     * Indicates the type of entity of the hostHandledBy field. If hostHandledBy is not null then entry of
     * this field is mandatory. If hostHandledBy is null then entry of this field is prohibited.
     * <p>
     * 
     * @param pEntityType the new value of the <code>entityType</code> property.<br>
     */
    public void setEntityType(final int pEntityType) {
        this.entityType = pEntityType;
    }

    /**
     * Sets the value of the <code>exportFacsimileNumber</code> property.
     * <p>
     * Specifies the facsimile telephone number for the export operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @param pExportFacsimileNumber the new value of the <code>exportFacsimileNumber</code> property.<br>
     */
    public void setExportFacsimileNumber(final String pExportFacsimileNumber) {
        this.exportFacsimileNumber = pExportFacsimileNumber;
    }

    /**
     * Sets the value of the <code>exportPhoneNumber</code> property.
     * <p>
     * Specifies the telephone number for the export operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @param pExportPhoneNumber the new value of the <code>exportPhoneNumber</code> property.<br>
     */
    public void setExportPhoneNumber(final String pExportPhoneNumber) {
        this.exportPhoneNumber = pExportPhoneNumber;
    }

    /**
     * Sets the value of the <code>exportTeletype1</code> property.
     * <p>
     * Specifies the teletype address for the export operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @param pExportTeletype1 the new value of the <code>exportTeletype1</code> property.<br>
     */
    public void setExportTeletype1(final String pExportTeletype1) {
        this.exportTeletype1 = pExportTeletype1;
    }

    /**
     * Sets the value of the <code>exportTeletype2</code> property.
     * <p>
     * Specifies the teletype address for the export operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @param pExportTeletype2 the new value of the <code>exportTeletype2</code> property.<br>
     */
    public void setExportTeletype2(final String pExportTeletype2) {
        this.exportTeletype2 = pExportTeletype2;
    }

    /**
     * Sets the value of the <code>exportTeletype3</code> property.
     * <p>
     * Specifies the teletype address for the export operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @param pExportTeletype3 the new value of the <code>exportTeletype3</code> property.<br>
     */
    public void setExportTeletype3(final String pExportTeletype3) {
        this.exportTeletype3 = pExportTeletype3;
    }

    /**
     * Sets the value of the <code>expressOrSmallPackageDefaultLocation</code> property.
     * <p>
     * The default location for the acceptance of goods; for the Express AWB function at this station. If this
     * field is blank, then the system wide default system location parameter is used by the Accept Goods
     * function.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * 1EXPORT
     * <p>
     * 
     * @param pExpressOrSmallPackageDefaultLocation the new value of the
     *            <code>expressOrSmallPackageDefaultLocation</code> property.<br>
     */
    public void setExpressOrSmallPackageDefaultLocation(final String pExpressOrSmallPackageDefaultLocation) {
        this.expressOrSmallPackageDefaultLocation =
                    ContractUtility.convertToUpperCase(pExpressOrSmallPackageDefaultLocation);
    }

    /**
     * Sets the value of the <code>hostHandledBy</code> property.
     * <p>
     * This is the identifier of the entity that handles the carrier at this station. If this field is left
     * blank, then the carrier handles itself at this station. If the field is entered, it can be a carrier
     * code, a USCS firm's code, or a cargo terminal operator ID. Changing the value of this field can affect
     * the operation of the Customs module.If the Type field is set to Carrier, this field is checked against
     * the carrier code table to determine if the carrier code entered is valid.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @param pHostHandledBy the new value of the <code>hostHandledBy</code> property.<br>
     */
    public void setHostHandledBy(final String pHostHandledBy) {
        this.hostHandledBy = ContractUtility.convertToUpperCase(pHostHandledBy);
    }

    /**
     * Sets the value of <code>hostStationIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * Indicates this is a host station.
     * <li><code>false</code><br>
     * Indicates this is not a host station This is the default value.
     * <p>
     * 
     * @param pHostStationIndicator the new value of the <code>hostStationIndicator</code> property.<br>
     */
    public void setHostStationIndicator(final boolean pHostStationIndicator) {
        this.hostStationIndicator = pHostStationIndicator;
    }

    /**
     * Sets the value of the <code>iataDistrict</code> property.
     * <p>
     * Specifies the district code. If REGION is entered, then the entry of this field is mandatory. If Region
     * is blank, then entry of this field is prohibited. Changing the value of this field can affect the
     * operation of the Cargo Management Reporting Interface (CMI).
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * AA
     * <p>
     * 
     * @param pIataDistrict the new value of the <code>iataDistrict</code> property.<br>
     */
    public void setIataDistrict(final String pIataDistrict) {
        this.iataDistrict = ContractUtility.convertToUpperCase(pIataDistrict);
    }

    /**
     * Sets the value of the <code>iataSubDistrict</code> property.
     * <p>
     * Specifies the sub-district code. If Region is entered, then entry of this field is mandatory. If Region
     * is not entered, then entry of this field is prohibited. Changing the value of this field can affect the
     * operation of the Cargo Management Reporting Interface (CMI).
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * AA
     * <p>
     * 
     * @param pIataSubDistrict the new value of the <code>iataSubDistrict</code> property.<br>
     */
    public void setIataSubDistrict(final String pIataSubDistrict) {
        this.iataSubDistrict = ContractUtility.convertToUpperCase(pIataSubDistrict);
    }

    /**
     * Sets the value of the <code>importFacsimileNumber</code> property.
     * <p>
     * Specifies the facsimile telephone number for the import operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @param pImportFacsimileNumber the new value of the <code>importFacsimileNumber</code> property.<br>
     */
    public void setImportFacsimileNumber(final String pImportFacsimileNumber) {
        this.importFacsimileNumber = pImportFacsimileNumber;
    }

    /**
     * Sets the value of the <code>importPhoneNumber</code> property.
     * <p>
     * Specifies the telephone number for the import operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @param pImportPhoneNumber the new value of the <code>importPhoneNumber</code> property.<br>
     */
    public void setImportPhoneNumber(final String pImportPhoneNumber) {
        this.importPhoneNumber = pImportPhoneNumber;
    }

    /**
     * Sets the value of the <code>importTeletype1</code> property.
     * <p>
     * Specifies the teletype address for the import operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @param pImportTeletype1 the new value of the <code>importTeletype1</code> property.<br>
     */
    public void setImportTeletype1(final String pImportTeletype1) {
        this.importTeletype1 = pImportTeletype1;
    }

    /**
     * Sets the value of the <code>importTeletype2</code> property.
     * <p>
     * Specifies the teletype address for the import operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @param pImportTeletype2 the new value of the <code>importTeletype2</code> property.<br>
     */
    public void setImportTeletype2(final String pImportTeletype2) {
        this.importTeletype2 = pImportTeletype2;
    }

    /**
     * Sets the value of the <code>importTeletype3</code> property.
     * <p>
     * Specifies the teletype address for the import operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @param pImportTeletype3 the new value of the <code>importTeletype3</code> property.<br>
     */
    public void setImportTeletype3(final String pImportTeletype3) {
        this.importTeletype3 = pImportTeletype3;
    }

    /**
     * Sets the value of <code>mechanizedStationIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * Indicates the station is mechanized.
     * <li><code>false</code><br>
     * Indicates the station is not mechanized.
     * <p>
     * 
     * @param pMechanizedStationIndicator the new value of the <code>mechanizedStationIndicator</code>
     *            property.<br>
     */
    public void setMechanizedStationIndicator(final boolean pMechanizedStationIndicator) {
        this.mechanizedStationIndicator = pMechanizedStationIndicator;
    }

    /**
     * Sets the value of the <code>nextTimeChange</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 09OCT07
     * <p>
     * 
     * @param pNextTimeChange the new value of the <code>nextTimeChange</code> property.<br>
     */
    public void setNextTimeChange(final Date pNextTimeChange) {
        this.nextTimeChange = ContractUtility.getClonedDate(pNextTimeChange);
    }

    /**
     * Sets the value of the <code>OID</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @param pOId the new value of the <code>OID</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the value of the <code>phone</code> property.
     * <p>
     * Indicates the teletype telephone of the community system at this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @param pPhone the new value of the <code>phone</code> property.<br>
     */
    public void setPhone(final String pPhone) {
        this.phone = pPhone;
    }

    /**
     * Sets the value of the <code>postalCode</code> property.
     * <p>
     * Specifies the postal code where the station is located.
     * <p>
     * <b>Format: </b><br>
     * 1-8 Alphanumeric, hypen(-) and period(.) including space.
     * <p>
     * <b>Example: </b><br>
     * 55121
     * <p>
     * 
     * @param pPostalCode the new value of the <code>postalCode</code> property.<br>
     */
    public void setPostalCode(final String pPostalCode) {
        this.postalCode = pPostalCode;
    }

    /**
     * Sets the value of the <code>quickRampTransfer</code> property.
     * <p>
     * Special handling code to be automatically generated when a quick ramp transfer product code is
     * associated with the air waybill. If the field is blank, LMS does not automatically generate a special
     * handling code for quick ramp transfer services at this transit station.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @param pQuickRampTransfer the new value of the <code>quickRampTransfer</code> property.<br>
     */
    public void setQuickRampTransfer(final String pQuickRampTransfer) {
        this.quickRampTransfer = ContractUtility.convertToUpperCase(pQuickRampTransfer);
    }

    /**
     * Sets the value of the <code>stationAutoCheckProductCodes</code> property.
     * <p>
     * Represents the List of<code>StationAutoCheckProductCodeDto</code> object which contain the product code
     * that can be auto-checked in to the Station.<br>
     * <p>
     * 
     * @param pStationAutoCheckProductCodeDtos the new value of the <code>stationAutoCheckProductCodes</code>
     *            property.<br>
     */
    public void setStationAutoCheckProductCodes(
                final List<StationAutoCheckProductCodeDto> pStationAutoCheckProductCodeDtos) {
        this.stationAutoCheckProductCodes = pStationAutoCheckProductCodeDtos;
    }

    /**
     * Sets the value of <code>stationCashIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * Station Cash is required for the air waybill to clear audit.
     * <li><code>false</code><br>
     * Station Cash is not required for the air waybill to clear audit.
     * <p>
     * 
     * @param pStationCashIndicator the new value of the <code>stationCashIndicator</code> property.<br>
     */
    public void setStationCashIndicator(final boolean pStationCashIndicator) {
        this.stationCashIndicator = pStationCashIndicator;
    }

    /**
     * Sets the value of the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 or 5 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pStationCode the new value of the <code>stationCode</code> property.<br>
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

    /**
     * Sets the value of the <code>stationControlParameter</code> property.
     * <p>
     * Represents the <code>StationControlParameterDto</code> object contains the automatic and manual control
     * parameter of the station.<br>
     * <p>
     * 
     * @param pStationControlParametersDto the new value of the <code>stationControlParameter</code> property.<br>
     */
    public void setStationControlParameter(final StationControlParameterDto pStationControlParametersDto) {
        this.stationControlParameter = pStationControlParametersDto;
    }

    /**
     * Sets the value of the <code>stationHandledCarriers</code> property. handled carrier details.
     * <p>
     * Represents the List of<code>StationControlParameterDto</code> object contain the carrier information
     * which is handled by the station.<br>
     * <p>
     * 
     * @param pStationHandledCarrierDtos the new value of the <code>stationHandledCarriers</code> property.<br>
     */
    public void setStationHandledCarriers(final List<StationHandledCarrierDto> pStationHandledCarrierDtos) {
        this.stationHandledCarriers = pStationHandledCarrierDtos;
    }

    /**
     * Sets the value of the <code>stationName</code> property.
     * <p>
     * Specifies the station name, usually the name of the airport that the station is loaded in.
     * <p>
     * <b>Format: </b><br>
     * 1-34 any character
     * <p>
     * <b>Example: </b><br>
     * MINNEAPOLIS-ST.PAUL INTERNATIONAL
     * <p>
     * 
     * @param pStationName the new value of the <code>stationName</code> property.<br>
     */
    public void setStationName(final String pStationName) {
        this.stationName = pStationName;
    }

    /**
     * Sets the value of the <code>stationNonQueueReasonCodes</code> property.
     * <p>
     * Represents the List of<code>StationNonQueueReasonCodeDto</code> objects contain reason code that should
     * not be queued into the station.<br>
     * <p>
     * 
     * @param pStationNonQueueReasonCodeDtos the new value of the <code>stationNonQueueReasonCodes</code>
     *            property.<br>
     */
    public void setStationNonQueueReasonCodes(
                final List<StationNonQueueReasonCodeDto> pStationNonQueueReasonCodeDtos) {
        this.stationNonQueueReasonCodes = pStationNonQueueReasonCodeDtos;
    }

    /**
     * Sets the value of the <code>stationServiceDetail</code> property.
     * <p>
     * 
     * @param pStationServiceDetailsDto the new value of the <code>stationServiceDetail</code> property.<br>
     */
    public void setStationServiceDetail(final StationServiceDetailDto pStationServiceDetailsDto) {
        this.stationServiceDetail = pStationServiceDetailsDto;
    }

    /**
     * Sets the value of the <code>teletypeAddress</code> property.
     * <p>
     * Indicates the teletype address of the community system at this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @param pTeleTypeAddress the new value of the <code>teletypeAddress</code> property.<br>
     */
    public void setTeleTypeAddress(final String pTeleTypeAddress) {
        this.teleTypeAddress = pTeleTypeAddress;
    }

    /**
     * Sets the value of the <code>terminalOperator</code> property.
     * <p>
     * It is a Cargo terminal operator ID.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * 612
     * <p>
     * 
     * @param pTerminalOperator the new value of the <code>terminalOperator</code> property.<br>
     */
    public void setTerminalOperator(final String pTerminalOperator) {
        this.terminalOperator = pTerminalOperator;
    }

    /**
     * Sets the value of the <code>truckFacsimileNumber</code> property.
     * <p>
     * Specifies the facsimile telephone number for the truck operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @param pTruckFacsimileNumber the new value of the <code>truckFacsimileNumber</code> property.<br>
     */
    public void setTruckFacsimileNumber(final String pTruckFacsimileNumber) {
        this.truckFacsimileNumber = pTruckFacsimileNumber;
    }

    /**
     * Sets the value of the <code>truckPhoneNumber</code> property.
     * <p>
     * Specifies the telephone number for the truck operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphanumeric,hyphen(-), period(.) and slash(/) including spaces.
     * <p>
     * <b>Example: </b><br>
     * 612-687-2272
     * <p>
     * 
     * @param pTruckPhoneNumber the new value of the <code>truckPhoneNumber</code> property.<br>
     */
    public void setTruckPhoneNumber(final String pTruckPhoneNumber) {
        this.truckPhoneNumber = pTruckPhoneNumber;
    }

    /**
     * Sets the value of the <code>truckTeletype1</code> property.
     * <p>
     * Specifies the TTY address for the truck operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @param pTruckTeletype1 the new value of the <code>truckTeletype1</code> property.<br>
     */
    public void setTruckTeletype1(final String pTruckTeletype1) {
        this.truckTeletype1 = pTruckTeletype1;
    }

    /**
     * Sets the value of the <code>truckTeletype2</code> property.
     * <p>
     * Specifies the TTY address for the truck operation of this station.
     * <p>
     * <b>Format: </b><br>
     * 7-8 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @param pTruckTeletype2 the new value of the <code>truckTeletype2</code> property.<br>
     */
    public void setTruckTeletype2(final String pTruckTeletype2) {
        this.truckTeletype2 = pTruckTeletype2;
    }

    /**
     * Sets the value of the <code>weightUOM</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * KG,LB
     * <p>
     * 
     * @param pWeightUOM the new value of the <code>weightUOM</code> property.<br>
     */
    public void setWeightUOM(final WeightUOMType pWeightUOM) {
        this.weightUOM = pWeightUOM;
    }

	public Boolean geteAwbMultilateral() {
		return eAwbMultilateral;
	}

	public void seteAwbMultilateral(Boolean eAwbMultilateral) {
		this.eAwbMultilateral = eAwbMultilateral;
	}

	/**
	 * @return the stationValidationInd
	 */
	public boolean getStationValidationInd() {
		return stationValidationInd;
	}

	/**
	 * @param stationValidationInd the stationValidationInd to set
	 */
	public void setStationValidationInd(boolean stationValidationInd) {
		this.stationValidationInd = stationValidationInd;
	}

	// LMSC-11111 UIS158 Start
    public List<String> getHandledCarrierCodes() {
        final List<String> handledCarrier = new ArrayList<String>();
        if (null != this.getStationHandledCarriers()
        		&& !this.getStationHandledCarriers().isEmpty()) {
        	for (final StationHandledCarrierDto StationHandledCarrierDto : this.getStationHandledCarriers()) {
        		if (null != StationHandledCarrierDto
        				&& null != StationHandledCarrierDto.getCarrierCode()
        				&& !StationHandledCarrierDto.getCarrierCode().isEmpty()) {
        			handledCarrier.add(StationHandledCarrierDto.getCarrierCode());
        		}
        	}
        }
        return handledCarrier;
    }
    // LMSC-11111 UIS158 End	

}
