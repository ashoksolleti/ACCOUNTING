/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto;

import java.util.List;

/**
 * The <code>MessageQueueResponse</code> contains list of messages associated with a unique queue.
 * <p>
 * This contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>messageList
 * </code>
 * </ul>
 */

public class MessageQueueResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>messageList</code> property.
     * <p>
     * The list of <code>message</code>'s associated with a queue.
     * <p>
     */
    private List<MessageQueueItemDto> messageList;

    /**
     * Gets the value of <code>messageList</code>.
     * <p>
     * 
     * @return the list of <code>messages</code>'s associated with queue.
     *         <p>
     */
    public List<MessageQueueItemDto> getMessageList() {
        return this.messageList;
    }

    /**
     * Sets the value of <code>messageList</code>property.
     * <p>
     * 
     * @param pMessageList the new list of <code>Message</code>'s associated with a queue.<br>
     */
    public void setMessageList(final List<MessageQueueItemDto> pMessageList) {
        this.messageList = pMessageList;
    }
}
