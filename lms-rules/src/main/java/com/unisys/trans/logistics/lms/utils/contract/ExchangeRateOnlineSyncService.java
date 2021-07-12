/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>ExchangeRateOnlineSyncService</code> interface exposes the APIs which
 * identifies various processing flows involved in maintaining the exchange rate information.
 * <p>
 * This performs the following functions:
 * <ul>
 * <li>maintain the exchange rate information.
 * </ul>
 */
public interface ExchangeRateOnlineSyncService {

    /**
     * This method performs the create, update, delete, restore and purge
     * operation for the input message text.
     * 
     * @param pMessage
     *            It holds the input message text.
     * 
     * @throws LMSException
     *             If validation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human
     *             readable message and message type.
     */
    void maintainExchangeRates(final String pMessage) throws LMSException;
}
