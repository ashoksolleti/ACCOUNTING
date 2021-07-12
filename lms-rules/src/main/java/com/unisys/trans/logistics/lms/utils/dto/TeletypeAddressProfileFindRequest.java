/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeAddressFindRequestType;

/**
 * <code>TeletypeAddressProfileFindRequest</code> class represents the request to find TeletypeAddressProfile.
 * <p>
 * <code>TeletypeAddressProfileFindRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>findIndicator
 * <li>messageLink
 * <li>participantLinksOnlyIndicator
 * <li>teletypeAddress
 * <li>ttyAddressProfileOId
 * </code>
 * </ul>
 */
public class TeletypeAddressProfileFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8524299252576983327L;

    /**
     * Attribute to hold <code>findIndicator</code> property.
     */
    private TeletypeAddressFindRequestType findIndicator;

    /**
     * Attribute to hold <code>messageLink</code> property.
     */
    private String messageLink;

    /**
     * Attribute to hold <code>participantLinksOnlyIndicator</code> property.
     */
    private boolean participantLinksOnlyIndicator;

    /**
     * Attribute to hold <code>teletypeAddress</code> property.
     */
    private TeletypeAddressTypeDto teletypeAddress;

    /**
     * Attribute to hold <code>ttyAddressProfileOId</code> property.
     */
    private Long ttyAddressProfileOId;

    /**
     * Default constructor.
     */
    public TeletypeAddressProfileFindRequest() {
    }

    /**
     * Gets the <code>findIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeAddressFindRequestType}
     * <p>
     * <b>Example: </b><br>
     * MESSAGE_LINK
     * <p>
     * 
     * @return the current value of the <code>findIndicator</code> property.
     */
    public final TeletypeAddressFindRequestType getFindIndicator() {
        return this.findIndicator;
    }

    /**
     * Gets the <code>messageLink</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * 123456
     * <p>
     * 
     * @return the current value of the <code>messageLink</code> property.
     */
    public final String getMessageLink() {
        return this.messageLink;
    }

    /**
     * Gets the <code>teletypeAddress</code> property.
     * <p>
     * 
     * @return the current value of the <code>teletypeAddress</code> property.
     */
    public final TeletypeAddressTypeDto getTeletypeAddress() {
        return this.teletypeAddress;
    }

    /**
     * Gets the <code>ttyAddressProfileOId</code> property.
     * <p>
     * 
     * @return the current value of the <code>ttyAddressProfileOId</code> property.
     */
    public final Long getTtyAddressProfileOId() {
        return this.ttyAddressProfileOId;
    }

    /**
     * Gets the <code>participantLinksOnlyIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of the <code>participantLinksOnlyIndicator</code> property.
     */
    public final boolean isParticipantLinksOnlyIndicator() {
        return this.participantLinksOnlyIndicator;
    }

    /**
     * Sets the <code>findIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeAddressFindRequestType}
     * <p>
     * <b>Example: </b><br>
     * MESSAGE_LINK
     * <p>
     * 
     * @param pFindIndicator the new value of the <code>findIndicator</code> property.
     */
    public final void setFindIndicator(final TeletypeAddressFindRequestType pFindIndicator) {
        this.findIndicator = pFindIndicator;
    }

    /**
     * Sets the <code>messageLink</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * 123456
     * <p>
     * 
     * @param pMessageLink the new value of the <code>messageLink</code> property.
     */
    public final void setMessageLink(final String pMessageLink) {
        this.messageLink = pMessageLink;
    }

    /**
     * Sets the <code>participantLinksOnlyIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pParticipantLinksOnlyIndicator the new value of the <code>participantLinksOnlyIndicator</code>
     *            property.
     */
    public final void setParticipantLinksOnlyIndicator(final boolean pParticipantLinksOnlyIndicator) {
        this.participantLinksOnlyIndicator = pParticipantLinksOnlyIndicator;
    }

    /**
     * Sets the <code>teletypeAddress</code> property.
     * <p>
     * 
     * @param pTeletypeAddress the new value of the <code>teletypeAddress</code> property.
     */
    public final void setTeletypeAddress(final TeletypeAddressTypeDto pTeletypeAddress) {
        this.teletypeAddress = pTeletypeAddress;
    }

    /**
     * Sets the <code>ttyAddressProfileOId</code> property.
     * <p>
     * 
     * @param pTtyAddressProfileOId the new value of the <code>ttyAddressProfileOId</code> property.
     */
    public final void setTtyAddressProfileOId(final Long pTtyAddressProfileOId) {
        this.ttyAddressProfileOId = pTtyAddressProfileOId;
    }
}