package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AwbHouseAirwaybillHistoryDto</code> contain details of AwbHouseAirwaybillHistory.
 * <p>
 * This contains all information about AwbHouseAirwaybillHistory.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>action
 * <li>airWaybillNumberDto
 * <li>house
 * <li>awbCreationDate
 * <li>gmtDateTime
 * <li>localDateTime
 * <li>oId
 * <li>station
 * <li>userId
 * </ul>
 */

public class AwbHouseAirwaybillHistoryDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6963753581983277708L;

    /**
     * Attribute to hold <code>action</code> property.
     */
    private String action;

    /**
     * Attribute to hold <code>createdDate</code> property.
     */
    private Date createdDate;

    /**
     * Attribute to hold <code>gmtDateTimegmtDateTime</code> property.
     */
    private Date gmtDateTime;

    /**
     * Attribute to hold <code>itemStatus</code> property.
     */
    private Date historyCreationDateTime;

    /**
     * Attribute to hold <code>houseAirwaybillIdentifier</code> property.
     */
    private String houseAirwaybillIdentifier;

    /**
     * Attribute to hold <code>lastModifiedDate</code> property.
     */
    private Date lastModifiedDate;

    /**
     * Attribute to hold <code>localDateTime</code> property.
     */

    private Date localDateTime;

    /**
     * Attribute to hold <code>newValue</code> property.
     */
    private String newValue;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>oldValue</code> property.
     */
    private String oldValue;

    /**
     * Attribute to hold <code>station</code> property.
     */
    private String station;

    /**
     * Attribute to hold <code>userIdentifier</code> property.
     */
    private String userIdentifier;

    /**
     * Gets the <code>Action</code> property.
     * <p>
     * 
     * @return the current value of the <code>Action</code> property.
     */
    public String getAction() {
        return this.action;
    }

    /**
     * Gets the <code>CreatedDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>CreatedDate</code> property.
     */
    public Date getCreatedDate() {
        return ContractUtility.getClonedDate(this.createdDate);
    }

    /**
     * Gets the <code>GmtDateTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>GmtDateTime</code> property.
     */
    public Date getGmtDateTime() {
        return ContractUtility.getClonedDate(this.gmtDateTime);
    }

    /**
     * Gets the <code>HistoryCreationDateTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>HistoryCreationDateTime</code> property.
     */
    public Date getHistoryCreationDateTime() {
        return ContractUtility.getClonedDate(this.historyCreationDateTime);
    }

    /**
     * Gets the <code>HouseAirwaybillIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>HouseAirwaybillIdentifier</code> property.
     */
    public String getHouseAirwaybillIdentifier() {
        return this.houseAirwaybillIdentifier;
    }

    /**
     * Gets the <code>LastModifiedDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>LastModifiedDate</code> property.
     */
    public Date getLastModifiedDate() {
        return ContractUtility.getClonedDate(this.lastModifiedDate);
    }

    /**
     * Gets the <code>ItemType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ItemType</code> property.
     */
    public Date getLocalDateTime() {
        return ContractUtility.getClonedDate(this.localDateTime);
    }

    /**
     * Gets the <code>NewValue</code> property.
     * <p>
     * 
     * @return the current value of the <code>NewValue</code> property.
     */
    public String getNewValue() {
        return this.newValue;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>OId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>OldValue</code> property.
     * <p>
     * 
     * @return the current value of the <code>OldValue</code> property.
     */
    public String getOldValue() {
        return this.oldValue;
    }

    /**
     * Gets the <code>Station</code> property.
     * <p>
     * 
     * @return the current value of the <code>Station</code> property.
     */
    public String getStation() {
        return this.station;
    }

    /**
     * Gets the <code>UserIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>UserIdentifier</code> property.
     */
    public String getUserIdentifier() {
        return this.userIdentifier;
    }

    /**
     * Sets the <code>Action</code> property.
     * <p>
     * 
     * @param pAction
     *            holds the new value of <code>Action</code>.<br>
     */
    public void setAction(final String pAction) {
        this.action = pAction;
    }

    /**
     * Sets the <code>IteCreatedDatemType</code> property.
     * <p>
     * 
     * @param pCreatedDate
     *            holds the new value of <code>CreatedDate</code>.<br>
     */
    public void setCreatedDate(final Date pCreatedDate) {
        this.createdDate = ContractUtility.getClonedDate(pCreatedDate);
    }

    /**
     * Sets the <code>GmtDateTime</code> property.
     * <p>
     * 
     * @param pGmtDateTime
     *            holds the new value of <code>GmtDateTime</code>.<br>
     */
    public void setGmtDateTime(final Date pGmtDateTime) {
        this.gmtDateTime = ContractUtility.getClonedDate(pGmtDateTime);
    }

    /**
     * Sets the <code>HistoryCreationDateTime</code> property.
     * <p>
     * 
     * @param pHistoryCreationDateTime
     *            holds the new value of <code>HistoryCreationDateTime</code>.<br>
     */
    public void setHistoryCreationDateTime(final Date pHistoryCreationDateTime) {
        this.historyCreationDateTime = ContractUtility.getClonedDate(pHistoryCreationDateTime);
    }

    /**
     * Sets the <code>HouseAirwaybillIdentifier</code> property.
     * <p>
     * 
     * @param pHouseAirwaybillIdentifier
     *            holds the new value of <code>HouseAirwaybillIdentifier</code>.<br>
     */
    public void setHouseAirwaybillIdentifier(final String pHouseAirwaybillIdentifier) {
        this.houseAirwaybillIdentifier = pHouseAirwaybillIdentifier;
    }

    /**
     * Sets the <code>LastModifiedDate</code> property.
     * <p>
     * 
     * @param pLastModifiedDate
     *            holds the new value of <code>LastModifiedDate</code>.<br>
     */
    public void setLastModifiedDate(final Date pLastModifiedDate) {
        this.lastModifiedDate = ContractUtility.getClonedDate(pLastModifiedDate);
    }

    /**
     * Sets the <code>LocalDateTime</code> property.
     * <p>
     * 
     * @param pLocalDateTime
     *            holds the new value of <code>LocalDateTime</code>.<br>
     */
    public void setLocalDateTime(final Date pLocalDateTime) {
        this.localDateTime = ContractUtility.getClonedDate(pLocalDateTime);
    }

    /**
     * Sets the <code>NewValue</code> property.
     * <p>
     * 
     * @param pNewValue
     *            holds the new value of <code>NewValue</code>.<br>
     */
    public void setNewValue(final String pNewValue) {
        this.newValue = pNewValue;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>OId</code>.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>OldValue</code> property.
     * <p>
     * 
     * @param pOldValue
     *            holds the new value of <code>OldValue</code>.<br>
     */
    public void setOldValue(final String pOldValue) {
        this.oldValue = pOldValue;
    }

    /**
     * Sets the <code>Station</code> property.
     * <p>
     * 
     * @param pStation
     *            holds the new value of <code>Station</code>.<br>
     */
    public void setStation(final String pStation) {
        this.station = pStation;
    }

    /**
     * Sets the <code>UserIdentifier</code> property.
     * <p>
     * 
     * @param pUserIdentifier
     *            holds the new value of <code>UserIdentifier</code>.<br>
     */
    public void setUserIdentifier(final String pUserIdentifier) {
        this.userIdentifier = pUserIdentifier;
    }

}
