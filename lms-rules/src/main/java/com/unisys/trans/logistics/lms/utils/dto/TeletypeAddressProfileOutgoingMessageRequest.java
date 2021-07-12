/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.utils.dto.constants.TTYAddressProfileMessageType;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>TeletypeAddressProfileIncomingMessageRequest</code> is used request to process incoming message.
 * <p>
 * <code>TeletypeAddressProfileIncomingMessageRequest</code> holds the following attribute:
 * <ul>
 * <code>
 * <li>doubleSignature
 * <li>doubleSignatureCarrierCode
 * <li>messageTypeCode
 * <li>rejectedMessageTypeCode
 * <li>teletypeAddresses
 * </code>
 * </ul>
 */
public class TeletypeAddressProfileOutgoingMessageRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3119039168248919368L;

    /**
     * Attribute to hold the <code>doubleSignature</code> property.
     */
    private String doubleSignature;

    /**
     * Attribute to hold the <code>doubleSignatureCarrierCode</code> property.
     */
    private String doubleSignatureCarrierCode;

    /**
     * Attribute to hold the <code>messageTypeCode</code> property.
     */
    private TTYAddressProfileMessageType messageTypeCode;

    /**
     * Attribute to hold the <code>rejectedMessageTypeCode</code> property.
     */
    private TTYAddressProfileMessageType rejectedMessageTypeCode;

    /**
     * Attribute to hold the <code>teletypeAddresses</code> property.
     */
    private List<TeletypeAddressTypeDto> teletypeAddresses = new ArrayList<TeletypeAddressTypeDto>();

    /**
     * <code>Default constructor.</code>
     */
    public TeletypeAddressProfileOutgoingMessageRequest() {
    }

    /**
     * Gets the <code>doubleSignature</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of <code>doubleSignature</code> property.
     */
    public final String getDoubleSignature() {
        return this.doubleSignature;
    }

    /**
     * Gets the <code>doubleSignatureCarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * NH
     * <p>
     * 
     * @return the current value of <code>doubleSignatureCarrierCode</code> property.
     */
    public final String getDoubleSignatureCarrierCode() {
        return this.doubleSignatureCarrierCode;
    }

    /**
     * Gets the <code>messageTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.utils.dto.constants.TTYAddressProfileMessageType}
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
     * Gets the <code>rejectedMessageTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.utils.dto.constants.TTYAddressProfileMessageType}
     * <p>
     * <b>Example: </b><br>
     * FFR
     * <p>
     * 
     * @return the current value of <code>rejectedMessageTypeCode</code> property.
     */
    public final TTYAddressProfileMessageType getRejectedMessageTypeCode() {
        return this.rejectedMessageTypeCode;
    }

    /**
     * Gets the <code>teletypeAddresses</code> property.
     * <p>
     * 
     * @return the current value of <code>teletypeAddresses</code> property.
     */
    public final List<TeletypeAddressTypeDto> getTeletypeAddresses() {
        if (this.teletypeAddresses == null) {
            this.teletypeAddresses = new ArrayList<TeletypeAddressTypeDto>();
        }
        return this.teletypeAddresses;
    }

    /**
     * Sets the <code>doubleSignature</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pDoubleSignature the new value of <code>doubleSignature</code> property.<br>
     */
    public final void setDoubleSignature(final String pDoubleSignature) {
        this.doubleSignature = pDoubleSignature;
    }

    /**
     * Sets the <code>doubleSignatureCarrierCode</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * NH
     * <p>
     * 
     * @param pDoubleSignatureCarrierCode the new value of <code>doubleSignatureCarrierCode</code> property.<br>
     */
    public final void setDoubleSignatureCarrierCode(final String pDoubleSignatureCarrierCode) {
        this.doubleSignatureCarrierCode = pDoubleSignatureCarrierCode;
    }

    /**
     * Sets the <code>messageTypeCode</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.utils.dto.constants.TTYAddressProfileMessageType}
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
     * Sets the <code>rejectedMessageTypeCode</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.utils.dto.constants.TTYAddressProfileMessageType}
     * <p>
     * <b>Example: </b><br>
     * FFR
     * <p>
     * 
     * @param pRejectedMessageTypeCode the new value of <code>rejectedMessageTypeCode</code> property.<br>
     */
    public final void setRejectedMessageTypeCode(
                final TTYAddressProfileMessageType pRejectedMessageTypeCode) {
        this.rejectedMessageTypeCode = pRejectedMessageTypeCode;
    }

    /**
     * Sets the <code>teletypeAddress</code> property.<br>
     * <p>
     * 
     * @param pTeletypeAddresses the new value of <code>teletypeAddress</code> property.<br>
     */
    public final void setTeletypeAddresses(final List<TeletypeAddressTypeDto> pTeletypeAddresses) {
        this.teletypeAddresses = pTeletypeAddresses;
    }
}