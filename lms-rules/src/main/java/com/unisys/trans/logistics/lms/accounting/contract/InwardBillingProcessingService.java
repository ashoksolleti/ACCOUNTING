/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.InwardBillingProcessingRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InwardBillingProcessingResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>InwardBillingProcessingService</code> is the implementation of the services
 * offered by <code>InwardBillingProcessingService</code>.
 * <p>
 * This has the following functions:
 * <ul>
 * <li>findBillingQueues.
 * <li>retrieveBillingDetails
 * <li>processBillingDetails
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.InwardBillingProcessingRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.InwardBillingProcessingResponse
 */
public interface InwardBillingProcessingService {
    /**
     * Find all type of billing Queues.
     * 
     * @param pInwardBillingProcessingRequest.
     * @return the InwardBillingProcessingResponse
     * @throws LMSException the lMS exception
     */
    public InwardBillingProcessingResponse findAllBillingQueues(
                final InwardBillingProcessingRequest pInwardBillingProcessingRequest) throws LMSException;

    /**
     * processes that is Accept,Reject,Partial Accept/Reject) the interline inward billing
     * information of selected billing queue.
     * 
     * @param pInwardBillingProcessingRequest.
     * @return the InwardBillingProcessingResponse
     * @throws LMSException the lMS exception
     */
    public InwardBillingProcessingResponse processBillingDetails(
                final InwardBillingProcessingRequest pInwardBillingProcessingRequest) throws LMSException;

    /**
     * Retrieves the interline inward billing information of selected billing queue.
     * 
     * @param pInwardBillingProcessingRequest.
     * @return the InwardBillingProcessingResponse
     * @throws LMSException the lMS exception
     */
    public InwardBillingProcessingResponse retrieveBillingDetails(
                final InwardBillingProcessingRequest pInwardBillingProcessingRequest) throws LMSException;
}
