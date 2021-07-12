/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.contract;

import com.unisys.trans.logistics.lms.framework.dto.MessageQueueSendRequest;
import com.unisys.trans.logistics.lms.framework.dto.MessageQueueResponse;
import com.unisys.trans.logistics.lms.framework.dto.MessageQueueSendResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>LMSQueueService</code> interface doing message processing in Queue. It involved sending, browsing
 * messages from Queue. This interface performs the following functions :
 * <ul>
 * <li>Sending message to the Queue.
 * <li>Browsing message from the Queue.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.MessageQueueSendRequest.dto.LMSQueueRequestDto
 * @see com.unisys.trans.logistics.lms.MessageQueueResponse.dto.LMSQueueResponseDto
 */

public interface MessageQueueService {

    /**
     * Browses messages from Queue.
     * <p>
     * This method browses messages available in the Queue(requestDto). <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.MessageQueueResponse.dto.LMSQueueResponseDto
     *         LMSQueueResponseDto} </code>
     *         <ul>
     *         <li>
     *         {@link com.unisys.trans.lgistics.lms.MessageQueueResponse.dto.LMSQueueResponseDto.messageList
     *         messageList}
     *         </ul>
     * @param pRequestDto <code> {@link class com.unisys.trans.logistics.lms.arc.dto.LMSQueueRequestDto
     *            requestDto} </code>
     *            <ul>
     *            <li>
     *            {@link com.unisys.trans.logistics.lms.MessageQueueSendRequest.dto.LMSQueueRequestDto.queueName
     *            queueName} <li>
     *            {@link com.unisys.trans.logistics.lms.MessageQueueSendRequest.dto.LMSQueueRequestDto.messageList
     *            messageList}
     *            </ul>
     * @requirement LMSQueueRequestDto
     * @throws LMSException If the city cannot be created.
     **/
    MessageQueueResponse browse(MessageQueueSendRequest pRequestDto) throws LMSException;

    /**
     * Sends message from Queue.
     * <p>
     * This method sends message to the Queue. <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return <code> String</code>
     * @param pRequestDto <code> {@link class com.unisys.trans.logistics.lms.arc.dto.LMSQueueRequestDto
     *            requestDto} </code>
     *            <ul>
     *            <li>
     *            {@link com.unisys.trans.logistics.lms.MessageQueueSendRequest.dto.LMSQueueRequestDto.queueName
     *            queueName} <li>
     *            {@link com.unisys.trans.logistics.lms.MessageQueueSendRequest.dto.LMSQueueRequestDto.messageList
     *            messageList}
     *            </ul>
     * @requirement LMSQueueRequestDto
     * @throws LMSException If the city cannot be created.
     **/
    MessageQueueSendResponse send(MessageQueueSendRequest pRequestDto) throws LMSException;
    
    
    MessageQueueResponse receive(MessageQueueSendRequest pMessageQueueSendRequest) throws LMSException;
    
    MessageQueueSendResponse sendWithoutTransaction(final MessageQueueSendRequest pMessageQueueSendRequest) throws LMSException;
    
    MessageQueueResponse receiveWithoutTransaction(final MessageQueueSendRequest pMessageQueueSendRequest)
                throws LMSException;
}
