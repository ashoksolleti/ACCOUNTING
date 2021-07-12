/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.utils.dto.constants.TTYAddressProfileMessageType;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>TeletypeAddressProfileResponse </code> represents the response object of the maintenance request
 * received by <code>TeletypeAddressProfile</code>.
 * <p>
 * <code>TeletypeAddressProfileResponse </code> contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>doubleSignatureForOutgoingMessage
 * <li>incomingMessageRejectFlag
 * <li>messageTypeCode
 * <li>queuedMessageCount
 * <li>rejectedMessageCount
 * <li>teletypeAddressProfiles
 * </code>
 * </ul>
 */
public class TeletypeAddressProfileResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7839085249849798512L;

    /**
     * Attribute to hold the <code>doubleSignatureForOutgoingMessage</code> property.
     */
    private String doubleSignatureForOutgoingMessage;

    /**
     * Attribute to hold the <code>incomingMessageRejectFlag</code> property.
     */
    private boolean incomingMessageRejectFlag;

    /**
     * Attribute to hold the <code>messageTypeCode</code> property.
     */
    private TTYAddressProfileMessageType messageTypeCode;

    /**
     * Attribute to hold the <code>queuedMessageCount</code> property.
     */
    private int queuedMessageCount;

    /**
     * Attribute to hold the <code>rejectedMessageCount</code> property.
     */
    private int rejectedMessageCount;

    /**
     * Attribute to hold the list of <code>teletypeAddressProfiles</code> property.
     * <p>
     * The <code>TeletypeAddressProfileDto</code> includes TeletypeAddressProfile information.
     */
    private List<TeletypeAddressProfileDto> teletypeAddressProfiles;

    /**
     * <code>Default constructor.</code>
     */
    public TeletypeAddressProfileResponse() {
    }

    /**
     * Adds the Teletype Address Profile information to the <code>teletypeAddressProfiles</code> property.
     * <p>
     * The Teletype Address Profile information associated with the Teletype Address.
     * <p>
     * 
     * @param pTeletypeAddressProfileDto the new Teletype Address Profile information to be added to the
     *            <code>teletypeAddressProfiles</code> property.
     */
    public void addTeletypeAddressProfile(final TeletypeAddressProfileDto pTeletypeAddressProfileDto) {
        this.getTeletypeAddressProfiles().add(pTeletypeAddressProfileDto);
    }

    /**
     * Gets the <code>doubleSignatureForOutgoingMessage</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of <code>doubleSignatureForOutgoingMessage</code> property.
     */
    public final String getDoubleSignatureForOutgoingMessage() {
        return this.doubleSignatureForOutgoingMessage;
    }

    /**
     * Gets the <code>incomingMessageRejectFlag</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of <code>incomingMessageRejectFlag</code> property.
     */
    public final boolean getIncomingMessageRejectFlag() {
        return this.incomingMessageRejectFlag;
    }

    /**
     * Gets the <code>messageTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * FFR
     * <p>
     * 
     * @return the current value of <code>messageTypeCode</code> property.
     */
    public final TTYAddressProfileMessageType getMessageTypeCode() {
        return this.messageTypeCode;
    }

    /**
     * Gets the <code>queuedMessageCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @return the current value of <code>queuedMessageCount</code> property.
     */
    public final int getQueuedMessageCount() {
        return this.queuedMessageCount;
    }

    /**
     * Gets the <code>rejectedMessageCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @return the current value of <code>rejectedMessageCount</code> property.
     */
    public final int getRejectedMessageCount() {
        return this.rejectedMessageCount;
    }

    /**
     * Gets the <code>teletypeAddressProfiles</code> property.
     * <p>
     * 
     * @return the current value of <code>teletypeAddressProfiles</code> property.
     */
    public final List<TeletypeAddressProfileDto> getTeletypeAddressProfiles() {
        if (this.teletypeAddressProfiles == null) {
            this.teletypeAddressProfiles = new ArrayList<TeletypeAddressProfileDto>();
        }
        return this.teletypeAddressProfiles;
    }

    /**
     * Sets the <code>doubleSignatureForOutgoingMessage</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pDoubleSignatureForOutgoingMessage the new value of
     *            <code>doubleSignatureForOutgoingMessage</code> property.<br>
     */
    public final void setDoubleSignatureForOutgoingMessage(final String pDoubleSignatureForOutgoingMessage) {
        this.doubleSignatureForOutgoingMessage = pDoubleSignatureForOutgoingMessage;
    }

    /**
     * Sets the <code>incomingMessageRejectFlag</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * true or false
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pIncomingMessageRejectFlag the new value of <code>incomingMessageRejectFlag</code> property.<br>
     */
    public final void setIncomingMessageRejectFlag(final boolean pIncomingMessageRejectFlag) {
        this.incomingMessageRejectFlag = pIncomingMessageRejectFlag;
    }

    /**
     * Sets the <code>messageTypeCode</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * FFR
     * <p>
     * 
     * @param pMessageTypeCode the new value of <code>messageTypeCode</code> property.<br>
     */
    public final void setMessageTypeCode(final TTYAddressProfileMessageType pMessageTypeCode) {
        this.messageTypeCode = pMessageTypeCode;
    }

    /**
     * Sets the <code>queuedMessageCount</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @param pQueuedMessageCount the new value of <code>queuedMessageCount</code> property.<br>
     */
    public final void setQueuedMessageCount(final int pQueuedMessageCount) {
        this.queuedMessageCount = pQueuedMessageCount;
    }

    /**
     * Sets the <code>rejectedMessageCount</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @param pRejectedMessageCount the new value of <code>rejectedMessageCount</code> property.<br>
     */
    public final void setRejectedMessageCount(final int pRejectedMessageCount) {
        this.rejectedMessageCount = pRejectedMessageCount;
    }

    /**
     * Sets the <code>teletypeAddressProfiles</code> property.<br>
     * <p>
     * 
     * @param pTeletypeAddressProfileDtos the new value of <code>teletypeAddressProfiles</code> property.<br>
     */
    public final void setTeletypeAddressProfiles(
                final List<TeletypeAddressProfileDto> pTeletypeAddressProfileDtos) {
        this.teletypeAddressProfiles = pTeletypeAddressProfileDtos;
    }
}