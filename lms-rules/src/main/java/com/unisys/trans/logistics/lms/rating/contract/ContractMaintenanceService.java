/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.contract.BatchWriter;
import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>ContractMaintenanceService</code> handles the Contract Task Batch Request.
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>Builds a Contract Report String.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.framework.dto.BatchRequest
 *      BatchRequest
 */

public interface ContractMaintenanceService extends BatchWriter<BatchRequest, BatchResponse> {

    /**
     * This method builds Contract task report String.
     * <p>
     * The report String will be constructed from the validated and executed task. Input parameters will be
     * taken from BatchRequest.
     * 
     * @param pBatchRequest
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code>
     *            </ul>
     * @return aBatchResponse
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code>
     *         </ul>
     */
    BatchResponse buildContractTaskReport(BatchRequest pBatchRequest) throws LMSException;

}
