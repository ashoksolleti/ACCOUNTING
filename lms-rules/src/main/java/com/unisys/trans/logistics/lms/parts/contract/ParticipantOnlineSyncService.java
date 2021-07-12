/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantSyncResponse;

/**
 * <code>ParticipantOnlineSyncService</code> interface exposes the APIs which
 * identifies various processing flows involved in maintaining participant
 * information.
 * <p>
 * This performs the following functions:
 * <ul>
 * <li>maintain the participant information.
 * </ul>
 */
public interface ParticipantOnlineSyncService {

    /**
     * This method performs the create, update, delete, restore and purge
     * operation for the input message text.
     * 
     * @param pMessage
     *            It holds the input message text.
     * @return 
     * 
     * @throws LMSException
     *             If validation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human
     *             readable message and message type.
     */
    ParticipantSyncResponse maintainParticipant(final String pMessage) throws LMSException;
}
