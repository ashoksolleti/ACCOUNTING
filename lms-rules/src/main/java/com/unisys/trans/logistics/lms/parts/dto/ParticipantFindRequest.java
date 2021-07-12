/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantAccountType;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantNameSearchType;

/**
 * <code>ParticipantFindRequest</code> is used for retrieving <code>Participant</code> information along with
 * FreightParticipant or ULDParticipant or Both FreightParticipant and ULDParticipant.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>accountNumber</code>
 * <li><code>participantAccountType</code>
 * <li><code>address</code>
 * <li><code>city</code>
 * <li><code>country</code>
 * <li><code>freightUldIndicator</code>
 * <li><code>name</code>
 * <li><code>noShipmentsIndicator</code>
 * <li><code>oId</code>
 * <li><code>participantRole</code>
 * <li><code>participantType</code>
 * <li><code>postalCode</code>
 * <li><code>selectionListDisplayIndicator</code>
 * <li><code>state</code>
 * <li><code>station</code>
 * <li><code>pageSize</code>
 * <li><code>participantRemarkIndicator</code>
 * <li><code>startIndex</code>
 * <li><code>countCompleted</code>
 * <li><code>fetchedCount</code>
 * <li><code>totalCount</code>
 * <li><code>dbCount</code>
 * <li><code>countCompleted</code>
 * </ul>
 */
public class ParticipantFindRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7066694816464715024L;

    /**
     * Attribute to hold the <code>Participant</code> <code>accountNumber</code> property. This field is
     * mandatory when participant name is not input. Billing or IATA account number is input.
     */
    private String accountNumber;

    /**
     * Attribute to hold the <code>Participant</code> <code>address</code> property.
     */
    private String address;

    /**
     * Attribute to hold the <code>Participant</code> <code>city</code> property.
     */
    private String city;

    /**
     * Attribute to hold the <code>countCompleted</code> property.
     */
    private Integer countCompleted;

    /**
     * Attribute to hold the <code>Participant</code> <code>country</code> property. If input, this is
     * validated against the country table. If not input, the Country corresponding to the station is
     * extracted from the station table.
     */
    private String country;

    /**
     * Attribute to hold the <code>dbCount</code> property.
     */
    private Integer dbCount;

    /**
     * Attribute to hold the <code>displayCount</code> property.
     */
    private int displayCount;

    /**
     * Attribute to hold the <code>fetchedCount</code> property.
     */
    private Integer fetchedCount;

    /**
     * Attribute to hold the <code>freightUldIndicator</code> property. Indicates whether the user had
     * requested for freight details, ULD details or both.
     * <p>
     */
    private Integer freightUldIndicator;

    /**
     * Attribute to hold the <code>Participant</code> <code>name</code> property. This field is mandatory if
     * participant account number is not input.
     */
    private String name;

    /**
     * Attribute to hold the <code>Participant</code> <code>nameTypeCode</code> property.
     */
    private ParticipantNameSearchType nameTypeCode;

    /**
     * Attribute to hold the <code>nextIndicator</code> property.
     */
    private boolean nextIndicator;

    /**
     * Attribute to hold the <code>noShipmentsIndicator</code> property.
     */
    private Boolean noShipmentsIndicator;

    /**
     * Attribute to hold the <code>Participant</code> <code>oId</code> property. Unique ID for the
     * participant. This field is used for retrieving the details of the participant from selection list.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>pageSize</code> property.
     */
    private Integer pageSize;

    /**
     * Attribute to hold the <code>Participant</code> <code>accountNumberType</code> property. Available types
     * are <br>
     * 1. Billing account number. <br>
     * 2. IATA account number. <br>
     * The default value is #1 (Billing account).<br>
     */
    private ParticipantAccountType participantAccountType;

    /**
     * Attribute to hold the <code>Participant</code> <code>participantRemarkIndicator</code> property.
     * <p>
     * This field indicates whether FindRequest is for Participant or ParticipantRemarks.
     */
    private boolean participantRemarkIndicator;

    /**
     * Attribute to hold the <code>participantRole</code> property. It denotes the participant role like
     * shipper, consignee etc.
     */
    private String participantRole;

    /**
     * Attribute to hold the <code>participantType</code> property.
     */
    private String participantType;

    /**
     * Attribute to hold the <code>Participant</code> <code>postalCode</code> property.
     */
    private String postalCode;

    /**
     * Attribute to hold the <code>searchString</code> property.
     */
    private String searchString;

    /**
     * Attribute to indicate the <code>selectionListDisplayIndicator</code> property.
     */
    private Boolean selectionListDisplayIndicator;

    /**
     * Attribute to hold the <code>startIndex</code> property.
     */
    private Integer startIndex;

    /**
     * Attribute to hold the <code>Participant</code> <code>state</code> property.
     */
    private String state;

    /**
     * Attribute to hold the <code>Participant</code> <code>station</code> property.
     */
    private String station;

    /**
     * Attribute to hold the <code>totalCount</code> property.
     */
    private Integer totalCount;

    /**
     * Attribute to hold the <code>totalCount</code> property.
     */
    private String lmsDataBaseKey;
    /**
     * Attribute that controls if participant selection data should be part of the Response or not. 
     */
    private boolean disableSelection;
    
    private boolean ctcsraListCall;
    
    private boolean history;

    private Long contactOid;

    public boolean isHistory() {
		return history;
	}

	public void setHistory(boolean history) {
		this.history = history;
	}

	/**
     * Default constructor.
     */
    public ParticipantFindRequest() {

    }

    public boolean isDisableSelection() {
		return disableSelection;
	}

	public void setDisableSelection(boolean disableSelection) {
		this.disableSelection = disableSelection;
	}

	/**
     * Gets the <code>accountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * 123456
     * <p>
     * 
     * @return the current value of the <code>accountNumber</code>.
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Gets the <code>address</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * POB 14000,POSTAL STN SAINT LAURENT
     * <p>
     * 
     * @return the current value of the <code>address</code>.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Gets the <code>city</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-17 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * Minneapolis
     * <p>
     * 
     * @return the current value of the <code>city</code> property.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Gets the <code>countCompleted</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @return the current value of the <code>countCompleted</code> property.
     */
    public Integer getCountCompleted() {
        return this.countCompleted;
    }

    /**
     * Gets the <code>country</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alpha <br>
     * <p>
     * <b>Example: </b><br>
     * IN
     * <p>
     * 
     * @return the current value of the <code>country</code>.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Gets the <code>dbCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @return the current value of the <code>dbCount</code>.
     */
    public Integer getDbCount() {
        return this.dbCount;
    }

    /**
     * Gets the <code>displayCount</code> property.
     * <p>
     * Display count specifies the number of participant displayed in the page.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>displayCount</code>.
     */
    public int getDisplayCount() {
        return this.displayCount;
    }

    /**
     * Gets the <code>fetchedCount</code> property.
     * <p>
     * Fetched count specifies the total number of participants fetched from the database.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the current value of the <code>fetchedCount</code>.
     */
    public Integer getFetchedCount() {
        return this.fetchedCount;
    }

    /**
     * Gets the <code>freightUldIndicator</code> property.
     * <p>
     * <b> Possible Values: </b><br>
     * <li>Freight Details only,
     * <li>ULD details only,
     * <li>Both Freight and ULD Details.
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 1 - Freight Details only
     * <p>
     * 
     * @return the current value of the <code>freightUldIndicator</code>.
     */
    public Integer getFreightUldIndicator() {
        return this.freightUldIndicator;
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * UNISYS
     * <p>
     * 
     * @return the new value of the <code>name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the <code>nameTypeCode</code> property.
     * <p>
     * <b> Possible Values: </b>
     * <li>1 - Full Name
     * <li>2 - One-time participant
     * <li>3 - Alias
     * <li>4 - Full, One-time, Alias
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 1 - Full Name;
     * <p>
     * 
     * @return the new value of the <code>nameTypeCode</code>.
     */
    public ParticipantNameSearchType getNameTypeCode() {
        return this.nameTypeCode;
    }

    /**
     * Gets the <code>noShipmentsIndicator</code> property.
     * <p>
     * <b>Possible values: </b><br>
     * <li><code>True</code><br>
     * Participant can be a shipper for any shipment.
     * <li><code>False</code><br>
     * Participant cannot be a shipper for any shipment.
     * <p>
     * 
     * @return the new value of the <code>noShipmentsIndicator</code>.
     */
    public Boolean getNoShipmentsIndicator() {
        return this.noShipmentsIndicator;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the new value of the <code>oId</code>.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>pageSize</code> property.
     * <p>
     * page size specifies number of participant to be displayed in the page.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @return the new value of the <code>pageSize</code>.
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * Gets the <code>participantAccountType</code> property.
     * <p>
     * <b> Possible Values :</b>
     * <li>B- Billing Account Number
     * <li>I- IATA Account Number<br>
     * default is billing account number.
     * <p>
     * <b>Format: </b><br>
     * 1 Alpha<br>
     * <p>
     * <b>Example: </b><br>
     * I
     * <p>
     * 
     * @return the current value of the <code>participantAccountType</code>.
     */
    public ParticipantAccountType getParticipantAccountType() {
        return this.participantAccountType;
    }

    /**
     * Gets the <code>participantRole</code> property.
     * <p>
     * <b> Possible values :</b><br>
     * <li>S-Shipper
     * <li>C-Consignee
     * <li>B-Broker
     * <li>A-IATA Agent
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * S-Shipper
     * <p>
     * 
     * @return the new value of the <code>participantRole</code>.
     */
    public String getParticipantRole() {
        return this.participantRole;
    }

    /**
     * Gets the <code>participantType</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li>M-Master air waybill recurring
     * <li>O-Master air waybill one-time
     * <li>H-House air waybill recurring
     * <li>U-House air waybill one-time
     * <li>B-Master and House air waybill recurring
     * <li>A-Alias
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * M-Master air waybill recurring
     * <p>
     * 
     * @return the new value of the <code>participantType</code>.
     */
    public String getParticipantType() {
        return this.participantType;
    }

    /**
     * Gets the <code>postalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * 112012
     * <p>
     * 
     * @return the new value of the <code>postalCode</code>.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Gets the <code>searchString</code> property.
     * <p>
     * search string use to search the participant based on <code>searchString</code>
     * <p>
     * <b>Format: </b><br>
     * Alphanumeric <br>
     * <p>
     * <b>Example: </b><br>
     * UN
     * <p>
     * 
     * @return the new value of the <code>searchString</code>.
     */
    public String getSearchString() {
        return this.searchString;
    }

    /**
     * Gets the <code>selectionListDisplayIndicator</code> property.
     * <p>
     * <b>Possible values: </b><br>
     * <code><li>True</code><br>
     * Selection list is returned.<br>
     * <code><li>False</code><br>
     * Selection list is not returned.<br>
     * <p>
     * 
     * @return the new value of the <code>selectionListDisplayIndicator</code>.
     */
    public Boolean getSelectionListDisplayIndicator() {
        return this.selectionListDisplayIndicator;
    }

    /**
     * Gets the <code>startIndex</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 0
     * <p>
     * 
     * @return the new value of the <code>startIndex</code>.
     */
    public Integer getStartIndex() {
        return this.startIndex;
    }

    /**
     * Gets the <code>state</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * TEXAS
     * <p>
     * 
     * @return the new value of the <code>state</code>.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Gets the <code>station</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the new value of the <code>station</code>.
     */
    public String getStation() {
        return this.station;
    }

    /**
     * Gets the <code>totalCount</code> property.
     * <p>
     * Total count specifies the total number of participant retrieved from the database. based on the
     * <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString searchString}</code>.
     * <p>
     * 
     * @return the new value of the <code>totalCount</code>.
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * Determines the <code>countCompleted</code> property.
     * <p>
     * <b>Possible values: </b><br>
     * <li><code>True</code><br>
     * To move from current page to next page.
     * <li><code>False</code><br>
     * To move from current page to previous page.<br>
     * <p>
     * 
     * @return the new value of the <code>nextIndicator</code>.
     */
    public boolean isNextIndicator() {
        return this.nextIndicator;
    }

    /**
     * Indicates whether the participant can be a shipper for any shipment or not.
     * <p>
     * <b>Possible values: </b><br>
     * <li><code>True</code><br>
     * Participant can be a shipper for any shipment.
     * <li><code>False</code><br>
     * Participant cannot be a shipper for any shipment.<br>
     * <p>
     * 
     * @return true-Participant can be a shipper for any shipment. false-Participant cannot be a shipper for
     *         any shipment.
     */

    public Boolean isNoShipmentsIndicator() {
        return this.noShipmentsIndicator;
    }

    /**
     * Gets the <code>participantRemarkIndicator</code> property. <b>Possible values: </b><br>
     * <li><code>True</code><br>
     * Request is to find ParticipantRemarks. <li><code>False</code><br>
     * Request is to find Participant.<br>
     * <p>
     * 
     * @return the current value of the <code>participantRemarkIndicator</code>.
     */
    public boolean isParticipantRemarkIndicator() {
        return this.participantRemarkIndicator;
    }

    /**
     * Sets the <code>accountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * 123456
     * <p>
     * 
     * @param pAccountNumber the new value of the <code>accountNumber</code>.
     */

    public void setAccountNumber(final String pAccountNumber) {
        this.accountNumber = pAccountNumber;
    }

    /**
     * Sets the <code>address</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * POB 14000,POSTAL STN SAINT LAURENT
     * <p>
     * 
     * @param pAddress The new value of the <code>address</code>.
     */
    public void setAddress(final String pAddress) {
        this.address = pAddress;
    }

    /**
     * Sets the <code>city</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-17 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * Minneapolis
     * <p>
     * 
     * @param pCity the new value of the <code>city</code>.
     */
    public void setCity(final String pCity) {
        this.city = pCity;
    }

    /**
     * Sets the <code>countCompleted</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @param pCountCompleted Holds the new value of the <code>countCompleted</code>.
     */
    public void setCountCompleted(final Integer pCountCompleted) {
        this.countCompleted = pCountCompleted;
    }

    /**
     * Sets the <code>country</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alpha <br>
     * <p>
     * <b>Example: </b><br>
     * IN
     * <p>
     * 
     * @param pCountry the new value of the <code>country</code>.
     */
    public void setCountry(final String pCountry) {
        this.country = pCountry;
    }

    /**
     * Sets the <code>dbCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @param pDbCount holds the new value of the <code>dbCount</code>.
     */
    public void setDbCount(final Integer pDbCount) {
        this.dbCount = pDbCount;
    }

    /**
     * Sets the <code>displayCount</code> property.
     * <p>
     * Display count specifies the number of participant displayed in the page.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pDisplayCount the new value of the <code>displayCount</code>.
     */
    public void setDisplayCount(final int pDisplayCount) {
        this.displayCount = pDisplayCount;
    }

    /**
     * Sets the <code>fetchedCount</code> property.
     * <p>
     * Fetched count specifies the total number of participants fetched from the database.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @param pFetchedCount the new value of the <code>fetchedCount</code>.
     */
    public void setFetchedCount(final Integer pFetchedCount) {
        this.fetchedCount = pFetchedCount;
    }

    /**
     * Sets the <code>freightUldIndicator</code> property.
     * <p>
     * Indicates whether the user requested for freight details, ULD details or both.<br>
     * <b> Possible Values </b><br>
     * <li>Freight Details only,
     * <li>ULD details only,
     * <li>Both Freight and ULD Details.
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * Freight Details only
     * <p>
     * 
     * @param pFreightUldIndicator the new value of the <code>freightUldIndicator</code>.
     */

    public void setFreightUldIndicator(final Integer pFreightUldIndicator) {
        this.freightUldIndicator = pFreightUldIndicator;
    }

    /**
     * Sets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * UNISYS
     * <p>
     * 
     * @param pName the new value of the <code>name</code>.
     */
    public void setName(final String pName) {
        this.name = pName;
    }

    /**
     * Gets the <code>nameTypeCode</code> property.
     * <p>
     * <b> Possible Values: </b>
     * <li>1 - Full Name
     * <li>2 - One-time participant
     * <li>3 - Alias
     * <li>4 - Full, One-time, Alias
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 1 - Full Name
     * <p>
     * 
     * @param pNameTypeCode holds the new value of the <code>nameTypeCode</code>.
     */
    public void setNameTypeCode(final ParticipantNameSearchType pNameTypeCode) {
        this.nameTypeCode = pNameTypeCode;
    }

    /**
     * Sets the <code>nextIndicator</code> property.
     * <p>
     * <b>Possible values: </b><br>
     * <li><code>True</code><br>
     * To move from current page to next page.
     * <li><code>False</code><br>
     * To move from current page to previous page.<br>
     * <p>
     * 
     * @param pNextIndicator holds the new value of the <code>nextIndicator</code>.
     */
    public void setNextIndicator(final boolean pNextIndicator) {
        this.nextIndicator = pNextIndicator;
    }

    /**
     * Sets the <code>noShipmentsIndicator</code> property.
     * <p>
     * <b>Possible values: </b><br>
     * <li><code>True</code><br>
     * Participant can be a shipper for any shipment.
     * <li><code>False</code><br>
     * Participant cannot be a shipper for any shipment.<br>
     * <p>
     * 
     * @param pNoShipmentsIndicator the new value of the <code>noShipmentsIndicator</code>.
     */
    public void setNoShipmentsIndicator(final Boolean pNoShipmentsIndicator) {
        this.noShipmentsIndicator = pNoShipmentsIndicator;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code>.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>pageSize</code> property.
     * <p>
     * Page size specifies number of participant to be displayed in the page.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 20
     * <p>
     * 
     * @param pPageSize holds the new value of the <code>pageSize</code>.
     */
    public void setPageSize(final Integer pPageSize) {
        this.pageSize = pPageSize;
    }

    /**
     * Sets the <code>participantAccountType</code> property.
     * <p>
     * Participant Account Type is used to distinguish the participant account.There are two types of account
     * number.<br>
     * <b> Possible Values :</b>
     * <li>B- Billing Account Number
     * <li>I- IATA Account Number<br>
     * default is billing account number.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * B- Billing Account Number
     * <p>
     * 
     * @param pParticipantAccountType the new value of the <code>participantAccountType</code>.
     */
    public void setParticipantAccountType(final ParticipantAccountType pParticipantAccountType) {
        this.participantAccountType = pParticipantAccountType;
    }

    /**
     * Sets the <code>participantRemarkIndicator</code> property.
     * <p>
     * Indicates whether FindRequest is for Participant or ParticipantRemarks.
     * <p>
     * 
     * @param pParticipantRemarkIndicator the new value of the <code>totalCount</code>.
     */
    public void setParticipantRemarkIndicator(final boolean pParticipantRemarkIndicator) {
        this.participantRemarkIndicator = pParticipantRemarkIndicator;
    }

    /**
     * Sets the <code>participantRole</code> property.
     * <p>
     * Indicator to denote the participant role like shipper, consignee etc. <b> Possible values :</b><br>
     * <li>S-Shipper
     * <li>C-Consignee
     * <li>B-Broker
     * <li>A-IATA Agent
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * S
     * <p>
     * 
     * @param pParticipantRole the new value of the <code>participantRole</code>.
     */
    public void setParticipantRole(final String pParticipantRole) {
        this.participantRole = pParticipantRole;
    }

    /**
     * Sets the <code>participantType</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li>M-Master air waybill recurring
     * <li>O-Master air waybill one-time
     * <li>H-House air waybill recurring
     * <li>U-House air waybill one-time
     * <li>B-Master and House air waybill recurring
     * <li>A-Alias
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @param pParticipantType the new value of the <code>participantType</code>.
     */
    public void setParticipantType(final String pParticipantType) {
        this.participantType = pParticipantType;
    }

    /**
     * Sets the <code>postalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * 112012
     * <p>
     * 
     * @param pPostalCode the new value of the <code>postalCode</code>.
     */
    public void setPostalCode(final String pPostalCode) {
        this.postalCode = pPostalCode;
    }

    /**
     * Sets the <code>searchString</code> property.
     * <p>
     * Search string use to search the participant based on <code>searchString</code> <b>Format: </b><br>
     * Alphanumeric <br>
     * <p>
     * <b>Example: </b><br>
     * Unisys
     * <p>
     * 
     * @param pSearchString the new value of the <code>searchString</code>.
     */
    public void setSearchString(final String pSearchString) {
        this.searchString = pSearchString;
    }

    /**
     * Sets the <code>selectionListDisplayIndicator</code> property.
     * <p>
     * <b>Possible values: </b><br>
     * <li><code>True</code><br>
     * Selection list is returned.
     * <li><code>False</code><br>
     * Selection list is not returned.
     * <p>
     * 
     * @param pSelectionListDisplayIndicator the new value of the <code>selectionListDisplayIndicator</code>.
     */
    public void setSelectionListDisplayIndicator(final Boolean pSelectionListDisplayIndicator) {
        this.selectionListDisplayIndicator = pSelectionListDisplayIndicator;
    }

    /**
     * Sets the <code>startIndex</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 0
     * <p>
     * 
     * @param pStartIndex holds the new value of the <code>startIndex</code>.
     */
    public void setStartIndex(final Integer pStartIndex) {
        this.startIndex = pStartIndex;
    }

    /**
     * Sets the <code>state</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * TEXAS
     * <p>
     * 
     * @param pState the new value of the <code>state</code>.
     */
    public void setState(final String pState) {
        this.state = pState;
    }

    /**
     * Sets the <code>station</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pStation the new value of the <code>station</code>.
     */
    public void setStation(final String pStation) {
        this.station = ContractUtility.convertToUpperCase(pStation);
    }

    /**
     * Sets the <code>totalCount</code> property.
     * <p>
     * Total count specifies the total number of participant retrieved from the database. based on the
     * <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString searchString}</code>.
     * <p>
     * 
     * @param pTotalCount the new value of the <code>totalCount</code>.
     */
    public void setTotalCount(final Integer pTotalCount) {
        this.totalCount = pTotalCount;
    }

    /**
     * Gets the <code>lmsDataBaseKey</code> property.
     * <p>
     * 
     * @return the current value of the <code>lmsDataBaseKey</code> property.
     */
    public String getLmsDataBaseKey() {
        return lmsDataBaseKey;
    }

    /**
     * Sets the <code>lmsDataBaseKey</code> data transfer object.
     * <p>
     * 
     * @param pLmsDataBaseKey
     *            holds the new value of <code>lmsDataBaseKey</code> data transfer
     *            object.<br>
     */
    public void setLmsDataBaseKey(final String pLmsDataBaseKey) {
        this.lmsDataBaseKey = pLmsDataBaseKey;
    }
	public boolean isCtcsraListCall() {
		return ctcsraListCall;
	}
	public void setCtcsraListCall(boolean ctcsraListCall) {
		this.ctcsraListCall = ctcsraListCall;
	}

    public Long getContactOid() {
        return contactOid;
    }

    public void setContactOid(Long contactOid) {
        this.contactOid = contactOid;
    }
	
	// LMSC-11111 UIS158 Start
    
    private String specificAirline;
	
    private boolean checkforSpecificAirline;
    
    private boolean purgeIndicator;
    
    private boolean matchAnyTypeIndicator;
    
	private String participantAccType;
	
	private String govtAccountNumber;
	
    private Long sugSearchOid;
    
    public boolean isPurgeIndicator() {
		return purgeIndicator;
	}

	public void setPurgeIndicator(boolean purgeIndicator) {
		this.purgeIndicator = purgeIndicator;
	}

    public boolean isCheckforSpecificAirline() {
		return checkforSpecificAirline;
	}

	public void setCheckforSpecificAirline(boolean checkforSpecificAirline) {
		this.checkforSpecificAirline = checkforSpecificAirline;
	}

	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
	
	public String getParticipantAccType() {
		return participantAccType;
	}
	
	public void setParticipantAccType(String participantAccType) {
		this.participantAccType = participantAccType;
	}
	
    public boolean isMatchAnyTypeIndicator() {
        return this.matchAnyTypeIndicator;
    }
    
    public void setMatchAnyTypeIndicator(final boolean pMatchAnyTypeIndicator) {
        this.matchAnyTypeIndicator = pMatchAnyTypeIndicator;
    }
    
	public String getGovtAccountNumber() {
		return govtAccountNumber;
	}

	public void setGovtAccountNumber(String govtAccountNumber) {
		this.govtAccountNumber = govtAccountNumber;
	}
	
	public Long getSugSearchOid() {
		return sugSearchOid;
	}

	public void setSugSearchOid(Long sugSearchOid) {
		this.sugSearchOid = sugSearchOid;
	}
	
	public void setDefaults() {
		this.setFetchedCount(0);
		this.setNextIndicator(Boolean.TRUE);
		this.setStartIndex(0);
		this.setSelectionListDisplayIndicator(false);
		this.setPageSize(20);
	}
	// LMSC-11111 UIS158 End
}
