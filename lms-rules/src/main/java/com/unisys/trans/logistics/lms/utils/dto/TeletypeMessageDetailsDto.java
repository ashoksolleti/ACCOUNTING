/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.TTYAddressProfileMessageType;
import com.unisys.trans.logistics.lms.utils.dto.constants.TTYOutgoingDoubleSignatureType;

import java.io.Serializable;

/**
 * <code>TeletypeMessageDetailsDto</code> holds all the attributes related to a Teletype Address Profile.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>acceptMessageIndicator
 * <li>incomingDoubleSignatureIndicator
 * <li>messageInCount
 * <li>messageOutCount
 * <li>messageTypeCode
 * <li>messageVersion
 * <li>numberOfCharactersReceived
 * <li>oId
 * <li>outgoingDoubleSignatureIndicator
 * <li>queuedMessagesCount
 * <li>rejectedMessagesCount
 * <li>specialMessageOption
 * <li>ttyAddressProfileOId
 * </code>
 * </ul>
 */
public class TeletypeMessageDetailsDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3441832763292281538L;

    /**
     * Attribute to hold <code>acceptMessageIndicator</code> property.
     */
    private Boolean acceptMessageIndicator;

    /**
     * Attribute to hold <code>incomingDoubleSignatureIndicator</code> property.
     */
    private Boolean incomingDoubleSignatureIndicator;

    /**
     * Attribute to hold <code>messageInCount</code> property.
     */
    private int messageInCount;

    /**
     * Attribute to hold <code>messageOutCount</code> property.
     */
    private int messageOutCount;

    /**
     * Attribute to hold <code>messageTypeCode</code> property.
     */
    private TTYAddressProfileMessageType messageTypeCode;

    /**
     * Attribute to hold <code>messageVersion</code> property.
     */
    private Integer messageVersion;

    /**
     * Attribute to hold <code>numberOfCharactersReceived</code> property.
     */
    private long numberOfCharactersReceived;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>TeletypeMessageDetailsDto</code>.It is of type Long.<br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>outgoingDoubleSignatureIndicator</code> property.
     */
    private TTYOutgoingDoubleSignatureType outgoingDoubleSignatureIndicator;

    /**
     * Attribute to hold <code>queuedMessagesCount</code> property.
     */
    private int queuedMessagesCount;

    /**
     * Attribute to hold <code>rejectedMessagesCount</code> property.
     */
    private int rejectedMessagesCount;

    /**
     * Attribute to hold <code>specialMessageOption</code> property.
     */
    private String specialMessageOption;

    /**
     * Attribute to hold <code>ttyAddressProfileOId</code> property.
     */
    private Long ttyAddressProfileOId;

    /**
     * <code>Default constructor. </code>
     */
    public TeletypeMessageDetailsDto() {
    }

    /**
     * Gets the <code>acceptMessageIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false<br>
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of <code>acceptMessageIndicator</code> property.<br>
     */
    public final Boolean getAcceptMessageIndicator() {
        return this.acceptMessageIndicator;
    }

    /**
     * Gets the <code>incomingDoubleSignatureIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false<br>
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of <code>incomingDoubleSignatureIndicator</code> property.<br>
     */
    public final Boolean getIncomingDoubleSignatureIndicator() {
        return this.incomingDoubleSignatureIndicator;
    }

    /**
     * Gets the <code>messageInCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @return the current value of <code>messageInCount</code> property.<br>
     */
    public final int getMessageInCount() {
        return this.messageInCount;
    }

    /**
     * Gets the <code>messageOutCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @return the current value of <code>messageOutCount</code> property.<br>
     */
    public final int getMessageOutCount() {
        return this.messageOutCount;
    }

    /**
     * Gets the <code>messageTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * FFR
     * <p>
     * 
     * @return the current value of <code>messageTypeCode</code> property.<br>
     */
    public final TTYAddressProfileMessageType getMessageTypeCode() {
        return this.messageTypeCode;
    }

    /**
     * Gets the <code>messageVersion</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 1
     * <p>
     * 
     * @return the current value of <code>messageVersion</code> property.<br>
     */
    public final Integer getMessageVersion() {
        return this.messageVersion;
    }

    /**
     * Gets the <code>numberOfCharactersReceived</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-10 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 786
     * <p>
     * 
     * @return the current value of <code>numberOfCharactersReceived</code> property.<br>
     */
    public final long getNumberOfCharactersReceived() {
        return this.numberOfCharactersReceived;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public final Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>outgoingDoubleSignatureIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of <code>outgoingDoubleSignatureIndicator</code> property.<br>
     */
    public final TTYOutgoingDoubleSignatureType getOutgoingDoubleSignatureIndicator() {
        return this.outgoingDoubleSignatureIndicator;
    }

    /**
     * Gets the <code>queuedMessagesCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @return the current value of <code>queuedMessagesCount</code> property.<br>
     */
    public final int getQueuedMessagesCount() {
        return this.queuedMessagesCount;
    }

    /**
     * Gets the <code>rejectedMessagesCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @return the current value of <code>rejectedMessagesCount</code> property.<br>
     */
    public final int getRejectedMessagesCount() {
        return this.rejectedMessagesCount;
    }

    /**
     * Gets the <code>specialMessageOption</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of <code>specialMessageOption</code> property.<br>
     */
    public final String getSpecialMessageOption() {
        return this.specialMessageOption;
    }

    /**
     * Gets the <code>ttyAddressProfileOId</code> property.
     * <p>
     * 
     * @return the current value of <code>ttyAddressProfileOId</code> property.
     */
    public final Long getTtyAddressProfileOId() {
        return this.ttyAddressProfileOId;
    }

    /**
     * Sets the <code>acceptMessageIndicator</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * true or false
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pAcceptMessageIndicator the new value of <code>acceptMessageIndicator</code> property.<br>
     */
    public final void setAcceptMessageIndicator(final Boolean pAcceptMessageIndicator) {
        this.acceptMessageIndicator = pAcceptMessageIndicator;
    }

    /**
     * Sets the <code>incomingDoubleSignatureIndicator</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * true or false
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pIncomingDoubleSignatureIndicator the new value of <code>incomingDoubleSignatureIndicator</code>
     *            property.<br>
     */
    public final void setIncomingDoubleSignatureIndicator(final Boolean pIncomingDoubleSignatureIndicator) {
        this.incomingDoubleSignatureIndicator = pIncomingDoubleSignatureIndicator;
    }

    /**
     * Sets the <code>messageInCount</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @param pMessageInCount the new value of <code>messageInCount</code> property.<br>
     */
    public final void setMessageInCount(final int pMessageInCount) {
        this.messageInCount = pMessageInCount;
    }

    /**
     * Sets the <code>messageOutCount</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @param pMessageOutCount the new value of <code>messageOutCount</code> property.<br>
     */
    public final void setMessageOutCount(final int pMessageOutCount) {
        this.messageOutCount = pMessageOutCount;
    }

    /**
     * Sets the <code>messageTypeCode</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
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
     * Sets the <code>messageVersion</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 1
     * <p>
     * 
     * @param pMessageVersion the new value of <code>messageVersion</code> property.<br>
     */
    public final void setMessageVersion(final Integer pMessageVersion) {
        this.messageVersion = pMessageVersion;
    }

    /**
     * Sets the <code>numberOfCharactersReceived</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * 1-10 Numeric
     * <p>
     * <b>Example: </b><br>
     * 786
     * <p>
     * 
     * @param pNumberOfCharactersReceived the new value of <code>numberOfCharactersReceived</code> property.<br>
     */
    public final void setNumberOfCharactersReceived(final long pNumberOfCharactersReceived) {
        this.numberOfCharactersReceived = pNumberOfCharactersReceived;
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
     * Sets the <code>outgoingDoubleSignatureIndicator</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pOutgoingDoubleSignatureIndicator the new value of <code>outgoingDoubleSignatureIndicator</code>
     *            property.<br>
     */
    public final void setOutgoingDoubleSignatureIndicator(
                final TTYOutgoingDoubleSignatureType pOutgoingDoubleSignatureIndicator) {
        this.outgoingDoubleSignatureIndicator = pOutgoingDoubleSignatureIndicator;
    }

    /**
     * Sets the <code>queuedMessagesCount</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @param pQueuedMessagesCount the new value of <code>queuedMessagesCount</code> property.<br>
     */
    public final void setQueuedMessagesCount(final int pQueuedMessagesCount) {
        this.queuedMessagesCount = pQueuedMessagesCount;
    }

    /**
     * Sets the <code>rejectedMessagesCount</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @param pRejectedMessagesCount the new value of <code>rejectedMessagesCount</code> property.<br>
     */
    public final void setRejectedMessagesCount(final int pRejectedMessagesCount) {
        this.rejectedMessagesCount = pRejectedMessagesCount;
    }

    /**
     * Sets the <code>specialMessageOption</code> property.<br>
     * <p>
     * The <code>currency code</code> is unique and it is a predefined ISO code.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pSpecialMessageOption the new value of <code>specialMessageOption</code> property.<br>
     */
    public final void setSpecialMessageOption(final String pSpecialMessageOption) {
        this.specialMessageOption = ContractUtility.convertToUpperCase(pSpecialMessageOption);
    }

    /**
     * Sets the <code>ttyAddressProfileOId</code> property.
     * <p>
     * 
     * @param pTtyAddressProfileOId the new value of <code>ttyAddressProfileOId</code> property.<br>
     */
    public final void setTtyAddressProfileOId(final Long pTtyAddressProfileOId) {
        this.ttyAddressProfileOId = pTtyAddressProfileOId;
    }
}