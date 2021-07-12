/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.NetworkType;
import com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeEmailNotificationType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <code>TeletypeAddressProfileDto</code> holds all the attributes associated to a Teletype Address Profile.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>deleteIndicator
 * <li>emailNotificationIndicator
 * <li>entityMailingAddress
 * <li>entityName
 * <li>fsuMessageFlag
 * <li>lastIncomingMessageDateAndTime
 * <li>messageLinks
 * <li>oId
 * <li>reportIndicator
 * <li>teletypeAddress
 * <li>teletypeFSUCodeDetails
 * <li>teletypeMessageDetails
 * <li>totalNumberOfCharacterReceived
 * <li>totalIncomingMessageCount
 * <li>totalIncomingMessageLimit
 * </code>
 * </ul>
 */

public class TeletypeAddressProfileDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3832681080252015612L;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     * <p>
     * Defines if the deletion of the Teletype Address Profile is controlled. Possible values are:
     * <ul>
     * <li>True - Given address is controlled and therefore not deleted during file maintenance.
     * <li>False - Given address is not controlled and is deleted during file maintenance.
     * </ul>
     */
    private Boolean deleteIndicator;

    /**
     * Attribute to hold <code>emailNotificationIndicator</code> property.
     * <p>
     * Valid values are:
     * <ul>
     * <li>Null – No Email Notification.
     * <li>S - Standard Email Notification.
     * <li>E - Enhanced Email Notification (Prohibited if networkIndicator is not blank; otherwise optional.).
     * </ul>
     */
    private TeletypeEmailNotificationType emailNotificationIndicator;

    /**
     * Attribute to hold <code>entityMailingAddress</code> property.
     * <p>
     * Mailing address of the entity using this TTY/TPR address (informational only).
     */
    private String entityMailingAddress;

    /**
     * Attribute to hold <code>entityName</code> property.
     */
    private String entityName;

    /**
     * Attribute to hold <code>fsuMessageFlag</code> property.
     * <p>
     * Indicates if any outgoing FSU/FZE messages have to be sent to this TTY/TPR address. True – Send FSU
     * and/or FZE messages False – Do not send FSU or FZE messages
     */
    private Boolean fsuMessageFlag;

    /**
     * Attribute to hold <code>lastIncomingMessageDateAndTime</code> property.
     */
    private Date lastIncomingMessageDateAndTime;

    /**
     * Attribute to hold <code>messageLinks</code> property.
     */
    private List<MessageLinkDto> messageLinks;

    /**
     * Attribute to hold <code>networkIndicator</code> property.
     * <p>
     * Valid values are: T - TDNI A - AVEX G - GEIS X - TRAXON D - DIRECT & B - BRITISH TELECOM. Prohibited if
     * emailNotificationIndicator is not blank.
     */
    private NetworkType networkIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>TeletypeAddressProfileDto</code>.It is of type Long.<br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>reportIndicator</code> property.<br>
     * <p>
     * Defines if message statistics are maintained for this Teletype Address Profile. True - Message
     * statistics for this entry are recorded. False - Message statistics for this entry are not recorded.
     */
    private Boolean reportIndicator;

    /**
     * Attribute to hold <code>teletypeAddress</code> property.<br>
     * <p>
     * This contains two attributes ttyAddress and tprAddress.
     */
    private TeletypeAddressTypeDto teletypeAddress;

    /**
     * Attribute to hold <code>teletypeFSUCodeDetails</code> property.
     */
    private List<TeletypeFSUCodeDetailsDto> teletypeFSUCodeDetails;

    /**
     * Attribute to hold <code>teletypeMessageDetails</code> property.
     */
    private List<TeletypeMessageDetailsDto> teletypeMessageDetails;

    /**
     * Attribute to hold <code>totalIncomingMessageCount</code> property.<br>
     * <p>
     * Total number of incoming messages that have been received for this address.
     */
    private int totalIncomingMessageCount;

    /**
     * Attribute to hold <code>totalIncomingMessageLimit</code> property.<br>
     * <p>
     * Total number of messages that can be received for this address.
     */
    private int totalIncomingMessageLimit;

    /**
     * Attribute to hold <code>totalNumberOfCharactersReceived</code> property.<br>
     * <p>
     * Total number of characters that have been received for this message address. It is the sum of the
     * number of characters received for each message type.
     */
    private long totalNumberOfCharactersReceived;

    /**
     * <code>Default constructor. </code>
     */
    public TeletypeAddressProfileDto() {
    }

    /**
     * Gets the <code>deleteIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false.
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of <code>deleteIndicator</code> property.
     */
    public final Boolean getDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Gets the <code>emailNotificationIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeEmailNotificationType
     * TeletypeEmailNotificationType}
     * <p>
     * <b>Example: </b><br>
     * S
     * <p>
     * 
     * @return the current value of <code>emailNotificationIndicator</code> property.
     */
    public final TeletypeEmailNotificationType getEmailNotificationIndicator() {
        return this.emailNotificationIndicator;
    }

    /**
     * Gets the <code>entityMailingAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * 3517, Federal Dr
     * <p>
     * 
     * @return the current value of <code>entityMailingAddress</code> property.
     */
    public final String getEntityMailingAddress() {
        return this.entityMailingAddress;
    }

    /**
     * Gets the <code>entityName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * UNISYS
     * <p>
     * 
     * @return the current value of <code>entityName</code> property.
     */
    public final String getEntityName() {
        return this.entityName;
    }

    /**
     * Gets the <code>fsuMessageFlag</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false.
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of <code>fsuMessageFlag</code> property.
     */
    public final Boolean getFsuMessageFlag() {
        return this.fsuMessageFlag;
    }

    /**
     * Gets the <code>lastIncomingMessageDateAndTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @return the current value of <code>lastIncomingMessageDateAndTime</code> property.
     */
    public final Date getLastIncomingMessageDateAndTime() {
        return ContractUtility.getClonedDate(this.lastIncomingMessageDateAndTime);
    }

    /**
     * Gets the <code>messageLinks</code> property.
     * <p>
     * 
     * @return the current value of <code>messageLinks</code> property.
     */
    public final List<MessageLinkDto> getMessageLinks() {
        if (this.messageLinks == null) {
            this.messageLinks = new ArrayList<MessageLinkDto>();
        }
        return this.messageLinks;
    }

    /**
     * Gets the <code>networkIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.utils.dto.constants.NetworkType NetworkType}
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of <code>networkIndicator</code> property.
     */
    public final NetworkType getNetworkIndicator() {
        return this.networkIndicator;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    @Override
    public final Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>reportIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false.
     * <p>
     * <b>Example: </b><br>
     * false
     * <p>
     * 
     * @return the current value of <code>reportIndicator</code> property.
     */
    public final Boolean getReportIndicator() {
        return this.reportIndicator;
    }

    /**
     * Gets the <code>teletypeAddress</code> property.
     * <p>
     * 
     * @return the current value of <code>teletypeAddress</code> property.
     */
    public final TeletypeAddressTypeDto getTeletypeAddress() {
        return this.teletypeAddress;
    }

    /**
     * Gets the <code>teletypeFSUCodeDetails</code> property.
     * <p>
     * 
     * @return the current value of <code>teletypeFSUCodeDetails</code> property.
     */
    public final List<TeletypeFSUCodeDetailsDto> getTeletypeFSUCodeDetails() {
        if (this.teletypeFSUCodeDetails == null) {
            this.teletypeFSUCodeDetails = new ArrayList<TeletypeFSUCodeDetailsDto>();
        }
        return this.teletypeFSUCodeDetails;
    }

    /**
     * Gets the <code>teletypeMessageDetails</code> property.
     * <p>
     * 
     * @return the current value of <code>teletypeMessageDetails</code> property.
     */
    public final List<TeletypeMessageDetailsDto> getTeletypeMessageDetails() {
        if (this.teletypeMessageDetails == null) {
            this.teletypeMessageDetails = new ArrayList<TeletypeMessageDetailsDto>();
        }
        return this.teletypeMessageDetails;
    }

    /**
     * Gets the <code>totalIncomingMessageCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Numeric.
     * <p>
     * <b>Example: </b><br>
     * 1000
     * <p>
     * 
     * @return the current value of <code>totalIncomingMessageCount</code> property.
     */
    public final int getTotalIncomingMessageCount() {
        return this.totalIncomingMessageCount;
    }

    /**
     * Gets the <code>totalIncomingMessageLimit</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Numeric.
     * <p>
     * <b>Example: </b><br>
     * 1000
     * <p>
     * 
     * @return the current value of <code>totalIncomingMessageLimit</code> property.
     */
    public final int getTotalIncomingMessageLimit() {
        return this.totalIncomingMessageLimit;
    }

    /**
     * Gets the <code>totalNumberOfCharactersReceived</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-10 Numeric.
     * <p>
     * <b>Example: </b><br>
     * 50000
     * <p>
     * 
     * @return the current value of <code>totalNumberOfCharactersReceived</code> property.
     */
    public final long getTotalNumberOfCharactersReceived() {
        return this.totalNumberOfCharactersReceived;
    }

    /**
     * Sets the <code>deleteIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false <br>
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pDeleteIndicator the new value of <code>deleteIndicator</code> property.<br>
     */
    public final void setDeleteIndicator(final Boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>emailNotificationIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeEmailNotificationType
     * TeletypeEmailNotificationType} <br>
     * <p>
     * <b>Example: </b><br>
     * S
     * <p>
     * 
     * @param pEmailNotificationIndicator the new value of <code>emailNotificationIndicator</code> property.<br>
     */
    public final void setEmailNotificationIndicator(
                final TeletypeEmailNotificationType pEmailNotificationIndicator) {
        this.emailNotificationIndicator = pEmailNotificationIndicator;
    }

    /**
     * Sets the <code>entityMailingAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * 3517, Federal Dr
     * <p>
     * 
     * @param pEntityMailingAddress the new value of <code>entityMailingAddress</code> property.<br>
     */
    public final void setEntityMailingAddress(final String pEntityMailingAddress) {
        this.entityMailingAddress = pEntityMailingAddress;
    }

    /**
     * Sets the <code>entityName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-35 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * UNISYS
     * <p>
     * 
     * @param pEntityName the new value of <code>entityName</code> property.<br>
     */
    public final void setEntityName(final String pEntityName) {
        this.entityName = pEntityName;
    }

    /**
     * Sets the <code>fsuMessageFlag</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false<br>
     * <p>
     * <b>Example: </b><br>
     * false
     * <p>
     * 
     * @param pFsuMessageFlag the new value of <code>fsuMessageFlag</code> property.<br>
     */
    public final void setFsuMessageFlag(final Boolean pFsuMessageFlag) {
        this.fsuMessageFlag = pFsuMessageFlag;
    }

    /**
     * Sets the <code>lastIncomingMessageDateAndTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <br>
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @param pLastIncomingMessageDateAndTime the new value of <code>lastIncomingMessageDateAndTime</code>
     *            property.<br>
     */
    public final void setLastIncomingMessageDateAndTime(final Date pLastIncomingMessageDateAndTime) {
        this.lastIncomingMessageDateAndTime = ContractUtility.getClonedDate(pLastIncomingMessageDateAndTime);
    }

    /**
     * Sets the <code>messageLinks</code> property.
     * <p>
     * 
     * @param pMessageLinks the new value of <code>messageLinks</code> property.<br>
     */
    public final void setMessageLinks(final List<MessageLinkDto> pMessageLinks) {
        this.messageLinks = pMessageLinks;
    }

    /**
     * Sets the <code>networkIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.utils.dto.constants.NetworkType NetworkType} <br>
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pNetworkIndicator the new value of <code>networkIndicator</code> property.<br>
     */
    public final void setNetworkIndicator(final NetworkType pNetworkIndicator) {
        this.networkIndicator = pNetworkIndicator;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public final void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>reportIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false <br>
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pReportIndicator the new value of <code>deletedUser</code> property.<br>
     */
    public final void setReportIndicator(final Boolean pReportIndicator) {
        this.reportIndicator = pReportIndicator;
    }

    /**
     * Sets the <code>teletypeAddress</code> property.
     * <p>
     * 
     * @param pTeletypeAddress the new value of <code>teletypeAddress</code> property.<br>
     */
    public final void setTeletypeAddress(final TeletypeAddressTypeDto pTeletypeAddress) {
        this.teletypeAddress = pTeletypeAddress;
    }

    /**
     * Sets the <code>teletypeFSUCodeDetails</code> property.
     * <p>
     * 
     * @param pTeletypeFSUCodeDetails the new value of <code>teletypeFSUCodeDetails</code> property.<br>
     */
    public final void
                setTeletypeFSUCodeDetails(final List<TeletypeFSUCodeDetailsDto> pTeletypeFSUCodeDetails) {
        this.teletypeFSUCodeDetails = pTeletypeFSUCodeDetails;
    }

    /**
     * Sets the <code>teletypeMessageDetails</code> property.
     * <p>
     * 
     * @param pTeletypeMessageDetails the new value of <code>teletypeMessageDetails</code> property.<br>
     */
    public final void
                setTeletypeMessageDetails(final List<TeletypeMessageDetailsDto> pTeletypeMessageDetails) {
        this.teletypeMessageDetails = pTeletypeMessageDetails;
    }

    /**
     * Sets the <code>totalIncomingMessageCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Numeric. <br>
     * <p>
     * <b>Example: </b><br>
     * 1000
     * <p>
     * 
     * @param pTotalIncomingMessageCount the new value of <code>totalIncomingMessageCount</code> property.<br>
     */
    public final void setTotalIncomingMessageCount(final int pTotalIncomingMessageCount) {
        this.totalIncomingMessageCount = pTotalIncomingMessageCount;
    }

    /**
     * Sets the <code>totalIncomingMessageLimit</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Numeric. <br>
     * <p>
     * <b>Example: </b><br>
     * 1000
     * <p>
     * 
     * @param pTotalIncomingMessageLimit the new value of <code>totalIncomingMessageLimit</code> property.<br>
     */
    public final void setTotalIncomingMessageLimit(final int pTotalIncomingMessageLimit) {
        this.totalIncomingMessageLimit = pTotalIncomingMessageLimit;
    }

    /**
     * Sets the <code>totalNumberOfCharactersReceived</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-10 Numeric. <br>
     * <p>
     * <b>Example: </b><br>
     * 50000
     * <p>
     * 
     * @param pTotalNumberOfCharactersReceived the new value of <code>totalNumberOfCharactersReceived</code>
     *            property.<br>
     */
    public final void setTotalNumberOfCharactersReceived(final long pTotalNumberOfCharactersReceived) {
        this.totalNumberOfCharactersReceived = pTotalNumberOfCharactersReceived;
    }
}