package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>BaseHistoryDto</code> entity holds history of static data.
 * <p>
 * History is recorded whenever there is creation, modification or deletion of these static data.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>data
 * <li>identifier
 * <li>officeCode
 * <li>stationCode
 * <li>status
 * <li>timeStamp
 * <li>userId
 * </code>
 * </ul>
 */
public abstract class BaseHistoryDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4247603336929142614L;

    /**
     * Attribute to hold <code>data</code> property.
     * <p>
     * Indicates the xml string for complete set of new object or the difference of old and new object.
     */
    private String data;

    /**
     * Attribute to hold <code>identifier</code> property.
     * <p>
     * <code>Identifier</code> holds the key information for identifying data.
     */
    private String identifier;

    /**
     * Attribute to hold <code>officeCode</code> property.
     * <p>
     * <code>OfficeCode</code> holds the office code in the station where the change occurred.
     */
    private String officeCode;

    /**
     * Attribute to hold <code>stationCode</code> property.
     * <p>
     * <code>stationCode</code> indicates the station code for which the static data is to be
     * created/updated/deleted.
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
     * Attribute to hold the <code>timeStamp</code> property.
     */
    private Date timeStamp;

    /**
     * Attribute to hold <code>userId</code> property.
     * <p>
     * <code>userId</code> indicates the user id who made the change.
     */
    private String userId;

    /**
     * default constructor.
     */
    public BaseHistoryDto() {
        super();
    }

    /**
     * Gets the <code>data</code> property. It holds the XML string.
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
     * Sets the <code>data</code> property. It holds the XML string.
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
    public void setUserId(final String pUserId) {
        this.userId = pUserId;
    }

}