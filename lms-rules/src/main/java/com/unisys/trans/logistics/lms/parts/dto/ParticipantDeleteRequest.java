/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.Date;

/**
 * <code>ParticipantDeleteRequest</code> is the request object to mark a participant for deletion by setting
 * the <code>deleteIndicator</code> value to true.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>oId
 * <li>version
 * <li>deleteDate
 * <li>deleteRemarks
 * <li>deletedStation
 * <li>deleteIndicator
 * <li>deletedUser
 * </ul>
 * </code>
 */
public class ParticipantDeleteRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1401904874561046490L;

    /**
     * Attribute to hold <code>deleteContractSra</code> property.
     */
    private boolean deleteContractSra;

    /**
     * Attribute to hold <code>deleteDate</code> property.
     */
    private Date deleteDate;

    /**
     * Attribute to hold <code>deletedStation</code> property.
     */
    private String deletedStation;

    /**
     * Attribute to hold <code>deletedUser</code> property.
     */
    private String deletedUser;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to hold <code>deleteRemarks</code> property.
     */
    private String deleteRemarks;

    /**
     * Attribute to hold <code>oId</code> property. Unique id for the participant which has to be marked as
     * deleted.
     */
    private Long oId;

    /**
     * Attribute to hold <code>version</code> property.
     */
    private long version;
    
    /**
     * Attribute to hold <code>onlineSyncIndicator</code> property. It indicates whether the participant request is coming
     * from onlineSync or not (true/false).
     */
    
    private boolean onlineSyncIndicator;
    /**
     * Gets the <code>onlineSyncIndicator</code> property.
     * <p>
     * 
     * <p>
     * 
     * @return the current boolean  value of <code>onlineSyncIndicator</code>.<br>
     */
    public boolean isOnlineSyncIndicator() {
        return onlineSyncIndicator;
    }
    /**
     * Sets the <code>onlineSyncIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pOnlineSyncIndicator
     *            the current value of the <code>onlineSyncIndicator</code> property.
     */
    public void setOnlineSyncIndicator(final boolean pOnlineSyncIndicator) {
        this.onlineSyncIndicator = pOnlineSyncIndicator;
    }
    /**
     * <code>Default constructor.</code>
     */
    public ParticipantDeleteRequest() {

    }

    /**
     * Gets the <code>deleteDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <br>
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @return the current value of <code>deleteDate</code> property.<br>
     */
    public Date getDeleteDate() {
        return ContractUtility.getClonedDate(this.deleteDate);
    }

    /**
     * Gets the <code>deletedStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of <code>deletedStation</code> property.<br>
     */
    public String getDeletedStation() {
        return this.deletedStation;
    }

    /**
     * Gets the <code>deletedUser</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * TESTER
     * <p>
     * 
     * @return the current value of <code>deletedUser</code> property.<br>
     */
    public String getDeletedUser() {
        return this.deletedUser;
    }

    /**
     * Gets the <code>deleteRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 8-30 Alphanumeric, , hyphen, dot, space, comma, question, left/right parenthesis and plus.<br>
     * <p>
     * <b>Example: </b><br>
     * Reason – not active.
     * <p>
     * 
     * @return the current value of <code>deleteRemarks</code> property.<br>
     */
    public String getDeleteRemarks() {
        return this.deleteRemarks;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>version</code> property.
     * <p>
     * 
     * @return the current value of <code>version</code> property.<br>
     */
    public long getVersion() {
        return this.version;
    }

    /**
     * Gets the <code>deleteContractSra</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>deleteContractSra</code> property.
     */
    public boolean isDeleteContractSra() {
        return this.deleteContractSra;
    }

    /**
     * Gets the <code>deleteIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - The participant has been marked for deletion.<br>
     * <code>false</code> - The participant has not been marked for deletion.<br>
     * <p>
     * 
     * @return the current value of <code>deleteIndicator</code> property.<br>
     */
    public boolean isDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Sets the <code>deleteContractSra</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pDeleteContractSra
     *            the current value of the <code>deleteContractSra</code> property.
     */

    public void setDeleteContractSra(final boolean pDeleteContractSra) {
        this.deleteContractSra = pDeleteContractSra;
    }

    /**
     * Sets the <code>deleteDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 Date <br>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @param pDeleteDate the new value of <code>deleteDate</code> property.<br>
     */
    public void setDeleteDate(final Date pDeleteDate) {
        this.deleteDate = ContractUtility.getClonedDate(pDeleteDate);
    }

    /**
     * Sets the <code>deletedStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 alphabet <br>
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pDeletedStation the new value of <code>deletedStation</code> property.<br>
     */
    public void setDeletedStation(final String pDeletedStation) {
        this.deletedStation = ContractUtility.convertToUpperCase(pDeletedStation);
    }

    /**
     * Sets the <code>deletedUser</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric <br>
     * <p>
     * <b>Example: </b><br>
     * TESTER
     * <p>
     * 
     * @param pDeletedUser the new value of <code>deletedUser</code> property.<br>
     */
    public void setDeletedUser(final String pDeletedUser) {
        this.deletedUser = pDeletedUser;
    }

    /**
     * Sets the <code>deleteIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - The participant has been marked for deletion.<br>
     * <code>false</code> - The participant has not been marked for deletion.<br>
     * <p>
     * 
     * @param pDeleteIndicator the new value of <code>deleteIndicator</code> property.<bR>
     */
    public void setDeleteIndicator(final boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>deleteRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 8-30 Alphanumeric, , hyphen, dot, space, comma, question, left/right parenthesis and plus.
     * <p>
     * <b>Example: </b><br>
     * Reason – not active.
     * <p>
     * 
     * @param pDeleteRemarks the new value of <code>deleteRemarks</code> property.
     */
    public void setDeleteRemarks(final String pDeleteRemarks) {
        this.deleteRemarks = pDeleteRemarks;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the value of the <code>version</code> property.
     * <p>
     * 
     * @param pVersion the new value of <code>version</code> property.
     */
    public void setVersion(final long pVersion) {
        this.version = pVersion;
    }
}
