/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.TTYAddressProfileMessageType;

/**
 * <code>TeletypeAddressProfileIncomingMessageRequest</code> is used request to process incoming message.
 * <p>
 * <code>TeletypeAddressProfileIncomingMessageRequest</code> holds the following attribute:
 * <ul>
 * <code>
 * <li>doubleSignature
 * <li>messageTypeCode
 * <li>teletypeAddress
 * <li>totalNumberOfCharacters
 * </code>
 * </ul>
 */
public class TeletypeAddressProfileIncomingMessageRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3364948012848089060L;

    /**
     * Attribute to hold the <code>doubleSignature</code> property.
     */
    private String doubleSignature;

    /**
     * Attribute to hold the <code>messageTypeCode</code> property.
     */
    private TTYAddressProfileMessageType messageTypeCode;

    /**
     * Attribute to hold the <code>teletypeAddress</code> property.
     */
    private TeletypeAddressTypeDto teletypeAddress;

    /**
     * Attribute to hold the <code>totalNumberOfCharacters</code> property.
     */
    private long totalNumberOfCharacters;

    /**
     * <code>Default constructor.</code>
     */
    public TeletypeAddressProfileIncomingMessageRequest() {
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
     * Gets the <code>teletypeAddress</code> property.
     * <p>
     * 
     * @return the current value of <code>teletypeAddress</code> property.
     */
    public final TeletypeAddressTypeDto getTeletypeAddress() {
        return this.teletypeAddress;
    }

    /**
     * Gets the <code>totalNumberOfCharacters</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-10 Numeric
     * <p>
     * <b>Example: </b><br>
     * 786
     * <p>
     * 
     * @return the current value of <code>totalNumberOfCharacters</code> property.
     */
    public final long getTotalNumberOfCharacters() {
        return this.totalNumberOfCharacters;
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
        this.doubleSignature = ContractUtility.convertToUpperCase(pDoubleSignature);
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
     * Sets the <code>teletypeAddress</code> property.<br>
     * <p>
     * 
     * @param pTeletypeAddress the new value of <code>teletypeAddress</code> property.<br>
     */
    public final void setTeletypeAddress(final TeletypeAddressTypeDto pTeletypeAddress) {
        this.teletypeAddress = pTeletypeAddress;
    }

    /**
     * Sets the <code>totalNumberOfCharacters</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * 1-10 Numeric
     * <p>
     * <b>Example: </b><br>
     * 786
     * <p>
     * 
     * @param pTotalNumberOfCharacters the new value of <code>totalNumberOfCharacters</code> property.<br>
     */
    public final void setTotalNumberOfCharacters(final long pTotalNumberOfCharacters) {
        this.totalNumberOfCharacters = pTotalNumberOfCharacters;
    }
}