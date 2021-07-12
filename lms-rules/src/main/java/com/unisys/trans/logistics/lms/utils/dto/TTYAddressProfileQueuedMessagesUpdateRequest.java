/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.utils.dto.constants.TTYAddressProfileMessageType;

/**
 * <code>TeletypeAddressProfileIncomingMessageRequest</code> request for processing the teletype address
 * information for incoming messages.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>messageTypeCode</code></li>
 * <li><code>teletypeAddress</code></li>
 * <li><code>queueIndicator</code></li>
 * </ul>
 */

public class TTYAddressProfileQueuedMessagesUpdateRequest extends AbstractRequest {

    /**
     * Unique serial version UID.<br>
     */
    private static final long serialVersionUID = 8030330455402821487L;

    /**
     * Attribute to hold the <code>messageTypeCode</code> property.
     */
    private TTYAddressProfileMessageType messageTypeCode;

    /**
     * Attribute to hold the <code>queueIndicator</code> property.
     */
    private Boolean queueIndicator;

    /**
     * Attribute to hold the <code>teletypeAddress</code> property.
     */
    private TeletypeAddressTypeDto teletypeAddress;

    /**
     * Default constructor.
     */
    public TTYAddressProfileQueuedMessagesUpdateRequest() {
    }

    /**
     * Gets the value of the <code>messageTypeCode</code> property.
     * <p>
     * 
     * @return <code>TTYAddressProfileMessageType</code><br>
     *         Returns the current value of the <code>messageTypeCode</code> property.<br>
     *         </p>
     */
    public final TTYAddressProfileMessageType getMessageTypeCode() {
        return this.messageTypeCode;
    }

    /**
     * Gets the value of the <code>queueIndicator</code> property.
     * <p>
     * 
     * @return <code>Boolean</code><br>
     *         Returns the current value of the <code>queueIndicator</code> property.<br>
     *         </p>
     */
    public final Boolean getQueueIndicator() {
        return this.queueIndicator;
    }

    /**
     * Gets the value of the <code>teletypeAddress</code> property.
     * <p>
     * 
     * @return <code>TeletypeAddressTypeDto</code><br>
     *         Returns the current value of the <code>teletypeAddress</code> property.<br>
     *         </p>
     */
    public final TeletypeAddressTypeDto getTeletypeAddress() {
        return this.teletypeAddress;
    }

    /**
     * Sets the value of <code>messageTypeCode</code> property.
     * <p>
     * 
     * @param pMessageTypeCode <code>TTYAddressProfileMessageType</code><br>
     *            The new value of the <code>messageTypeCode</code> property.<bR>
     *            </p>
     */
    public final void setMessageTypeCode(final TTYAddressProfileMessageType pMessageTypeCode) {
        this.messageTypeCode = pMessageTypeCode;
    }

    /**
     * Sets the value of <code>queueIndicator</code> property.
     * <p>
     * 
     * @param pQueueIndicator <code>Boolean</code><br>
     *            The new value of the <code>queueIndicator</code> property.<bR>
     *            </p>
     */
    public final void setQueueIndicator(final Boolean pQueueIndicator) {
        this.queueIndicator = pQueueIndicator;
    }

    /**
     * Sets the value of <code>teletypeAddress</code> property.
     * <p>
     * 
     * @param pTeletypeAddress <code>TeletypeAddressTypeDto</code><br>
     *            The new value of the <code>teletypeAddress</code> property.<bR>
     *            </p>
     */
    public final void setTeletypeAddress(final TeletypeAddressTypeDto pTeletypeAddress) {
        this.teletypeAddress = pTeletypeAddress;
    }
}