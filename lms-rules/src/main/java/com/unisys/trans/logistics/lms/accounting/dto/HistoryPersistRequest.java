/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.CategoryType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.EventType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.SourceType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.Date;

/**
 * <code>HistoryPersistRequest</code> is used for maintaining a history of static data.
 * <p>
 * It holds station code, category, owner, source, status, userid, data, timestamp, old object and new object.
 * It persists the data as XML string of complete new object or the only the difference between the old and
 * new object along with other attributes.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>category
 * <li>data
 * <li>identifier
 * <li>newObject
 * <li>officeCode
 * <li>oldObject
 * <li>owner
 * <li>stationCode
 * <li>status
 * <li>timeStamp
 * <li>userId
 * </code>
 * </ul>
 */
public class HistoryPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8870389059446576764L;

    private String additionalInfo;

    
    private Date awbCreationDate;
    
    /**
     * Attribute to hold <code>airWayBillCurrencyCodeType</code> property.
     * <p>
     * Specifies the host airWayBillCurrencyCodeType  for currency conversion,
     * AWB, etc.
     */
    
    
    private String airWayBillCurrencyCode;
    

    /**
     * Attribute to hold <code>hostWeightUnit</code> property.
     * <p>
     * Specifies the host weight unit for currency conversion,
     * AWB, etc.
     */
    
    private WeightUOMType hostWeightUnit;
  
  
    public WeightUOMType getHostWeightUnit() {
        return this.hostWeightUnit;
    }

    public void setHostWeightUnit(final WeightUOMType pHostWeightUnit) {
        this.hostWeightUnit = pHostWeightUnit;
    }

    /**
     * Attribute to hold <code>hostCurrencyCodeType</code> property.
     * <p>
     * Specifies the host hostCurrencyCodeType  for currency conversion,
     * AWB, etc.
     */
    
    private String hostCurrencyCode;
    
    public String getAirWayBillCurrencyCode() {
        return this.airWayBillCurrencyCode;
    }

    public void setAirWayBillCurrencyCode(final String pAirWayBillCurrencyCode) {
        this.airWayBillCurrencyCode = pAirWayBillCurrencyCode;
    }


    public String getHostCurrencyCodeType() {
        return this.hostCurrencyCode;
    }

    public void setHostCurrencyCodeType(final String pHostCurrencyCodeType) {
        this.hostCurrencyCode = pHostCurrencyCodeType;
    }

    private Date awbExecutionDate;

    public Date getAwbExecutionDate() {
        return this.awbExecutionDate;
    }

    public void setAwbExecutionDate(final Date pAwbExecutionDate) {
        this.awbExecutionDate = pAwbExecutionDate;
    }

    /**
     * Attribute to hold <code>category</code> property.
     * <p>
     * Specifies the type for which the history information is recorded. The type indicates the Static Data,
     * AWB, etc.
     */
    private CategoryType category;

    /**
     * Attribute to hold <code>data</code> property.
     * <p>
     * Indicates the XML string for complete set of new object or the difference of old and new object.
     */
    private String data;

    private EventType event;

    /**
     * Attribute to hold <code>identifier</code> property.
     * <p>
     * Holds the key information for identifying data.
     */
    private String identifier;

    /**
     * Attribute to hold <code>newObject</code> property.
     * <p>
     * The latest or new domain object of a particular owner. The owner is specialhandling code, product code,
     * etc.
     */
    private Object newObject;

    /**
     * Attribute to hold <code>officeCode</code> property.
     * <p>
     * Holds the office code in the station where the change occurred.
     */
    private String officeCode;

    /**
     * Attribute to hold <code>oldObject</code> property.
     * <p>
     * Holds the old domain object of a particular owner. The owner is specialhandling code, product code,
     * etc.
     */
    private Object oldObject;

    /**
     * Attribute to hold <code>owner</code> property.
     * <p>
     * Holds the information about the static data type.
     */
    private String owner;

    private SourceType source;

    /**
     * Attribute to hold <code>stationCode</code> property.
     * <p>
     * Indicates the station code for which the static data is to be created/updated/deleted.
     */
    private String stationCode;

    /**
     * Attribute to hold <code>status</code> property.
     * <p>
     * <code>status</code> indicates the status of record.
     * <p>
     * The status can be any one of the following:
     * <ul>
     * <li>DEL - Static data deleted
     * <li>ADD - New data added
     * <li>UPD - Static data updated
     * </ul>
     */
    private String status;

    /**
     * Attribute to hold <code>timeStamp</code> property.
     */
    private Date timeStamp;

    /**
     * Attribute to hold <code>userId</code> property.
     * <p>
     * Indicates the user id who made the change.
     */
    private String userId;

    /**
     * <code>Default constructor</code>.
     */
    public HistoryPersistRequest() {

    }

    /**
     * @return the additionalInfo
     */
    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * @return the awbCreationDate
     */
    public Date getAwbCreationDate() {
        return this.awbCreationDate;
    }

    public CategoryType getCategory() {
        return this.category;
    }

    /**
     * Gets the <code>data</code> property. it holds the XML string.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * 
     * @return the current value of <code>data</code> property.
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return the event
     */
    public EventType getEvent() {
        return this.event;
    }

    /**
     * Gets the <code>identifier</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * AVI - the special handling code key when the owner is SpecialHandlingCode.
     * <p>
     * 
     * @return the current value of <code>identifier</code> property.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return the newObject
     */
    public Object getNewObject() {
        return this.newObject;
    }

    /**
     * Gets the <code>officeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * 001
     * <p>
     * 
     * @return the current value of <code>officeCode</code> property.
     */
    public String getOfficeCode() {
        return this.officeCode;
    }

    /**
     * @return the oldObject
     */
    public Object getOldObject() {
        return this.oldObject;
    }

    /**
     * Gets the <code>owner</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * S - the owner is SpecialHandlingCode.
     * <p>
     * 
     * @return the current value of <code>owner</code> property.
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return the source
     */
    public SourceType getSource() {
        return source;
    }

    /**
     * Gets the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 or 5 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of <code>stationCode</code> property.
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Gets the <code>status</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * DEL
     * <p>
     * 
     * @return the current value of <code>status</code> property.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Gets the <code>timeStamp</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATETIMEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 30JUN07 07:12:30
     * <p>
     * 
     * @return the current value of <code>timeStamp</code> property.
     */
    public Date getTimeStamp() {
        return ContractUtility.getClonedDate(this.timeStamp);
    }

    /**
     * Gets the <code>userId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * 5
     * <p>
     * 
     * @return the current value of <code>userId</code> property.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param additionalInfo the additionalInfo to set
     */
    public void setAdditionalInfo(final String pAdditionalInfo) {
        this.additionalInfo = pAdditionalInfo;
    }

    /**
     * @param awbCreationDate the awbCreationDate to set
     */
    public void setAwbCreationDate(final Date pAwbCreationDate) {
        this.awbCreationDate = pAwbCreationDate;
    }

    public void setCategory(final CategoryType pCategory) {
        this.category = pCategory;
    }

    /**
     * Sets the <code>data</code> property. it holds the XML string.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * 
     * @param pData the new value of <code>data</code> property.
     */
    public void setData(final String pData) {
        this.data = pData;
    }

    /**
     * @param event the event to set
     */
    public void setEvent(final EventType pEvent) {
        this.event = pEvent;
    }

    /**
     * Sets the <code>identifier</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * AVI - the special handling code key when the owner is SpecialHandlingCode.
     * <p>
     * 
     * @param pIdentifier the new value of <code>identifier</code> property.
     */
    public void setIdentifier(final String pIdentifier) {
        this.identifier = pIdentifier;
    }

    /**
     * @param newObject the newObject to set
     */
    public void setNewObject(final Object pNewObject) {
        this.newObject = pNewObject;
    }

    /**
     * Sets the <code>officeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * 001
     * <p>
     * 
     * @param pOfficeCode the new value of <code>officeCode</code> property.
     */
    public void setOfficeCode(final String pOfficeCode) {
        this.officeCode = pOfficeCode;
    }

    /**
     * @param oldObject the oldObject to set
     */
    public void setOldObject(final Object pOldObject) {
        this.oldObject = pOldObject;
    }

   
    /**
     * Sets the <code>owner</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * S - the owner is SpecialHandlingCode.
     * <p>
     * 
     * @param pOwner the new value of <code>owner</code> property.
     */
    public void setOwner(final String pOwner) {
        this.owner = pOwner;
    }

    /**
     * @param source the source to set
     */
    public void setSource(final SourceType pSource) {
        this.source = pSource;
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 or 5 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pStationCode the new value of <code>stationCode</code> property.
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = pStationCode;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * DEL
     * <p>
     * 
     * @param pStatus the new value of <code>status</code> property.
     */
    public void setStatus(final String pStatus) {
        this.status = pStatus;
    }

    /**
     * Sets the <code>timeStamp</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATETIMEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 30JUN07 07:12:30
     * <p>
     * 
     * @param pTimeStamp the new value of <code>timeStamp</code> property.
     */
    public void setTimeStamp(final Date pTimeStamp) {
        this.timeStamp = ContractUtility.getClonedDate(pTimeStamp);
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(final String pUserId) {
        this.userId = pUserId;
    }

    /**
     * Sets the <code>userId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * 5
     * <p>
     * 
     * @param pUserId the new value of <code>userId</code> property.
     */

}
