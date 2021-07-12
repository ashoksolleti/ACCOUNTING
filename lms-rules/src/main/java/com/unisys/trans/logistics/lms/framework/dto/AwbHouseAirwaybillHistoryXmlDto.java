package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AwbHouseAirwaybillHistoryXmlDto</code> is used for find AwbHouseAirwaybillHistoryXml information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>createdDate
 * <li>historyXml
 * <li>houseAirwaybillIdentifier
 * <li>lastModifiedDate
 * <li>oId
 * <li>userIdentifier
 * 
 * </ul>
 */
public class AwbHouseAirwaybillHistoryXmlDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4487304216473321636L;

    /**
     * Attribute to hold <code>createdDate</code> property.
     */

    private Date createdDate;

    /**
     * Attribute to hold <code>historyXml</code> property.
     */

    private String historyXml;

    /**
     * Attribute to hold <code>houseAirwaybillIdentifier</code> property.
     */

    private String houseAirwaybillIdentifier;

    /**
     * Attribute to hold <code>lastModifiedDate</code> property.
     */

    private Date lastModifiedDate;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>userIdentifier</code> property.
     */

    private String userIdentifier;

    /**
     * Gets the <code>Serialversionuid</code> property.
     * <p>
     * 
     * @return the current value of the <code>Serialversionuid</code> property.
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
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
     * Gets the <code>HistoryXml</code> property.
     * <p>
     * 
     * @return the current value of the <code>HistoryXml</code> property.
     */
    public String getHistoryXml() {
        return this.historyXml;
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
     * Gets the <code>UserIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>UserIdentifier</code> property.
     */
    public String getUserIdentifier() {
        return this.userIdentifier;
    }

    /**
     * Sets the <code>CreatedDate</code> property.
     * <p>
     * 
     * @param pCreatedDate
     *            holds the new value of <code>CreatedDate</code>.<br>
     */
    public void setCreatedDate(final Date pCreatedDate) {
        this.createdDate = ContractUtility.getClonedDate(pCreatedDate);
    }

    /**
     * Sets the <code>HistoryXml</code> property.
     * <p>
     * 
     * @param pHistoryXml
     *            holds the new value of <code>HistoryXml</code>.<br>
     */
    public void setHistoryXml(final String pHistoryXml) {
        this.historyXml = pHistoryXml;
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
