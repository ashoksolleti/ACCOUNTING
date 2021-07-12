/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;

/**
 * <code>ContractReportWriter</code> handles the Contract.
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>createContractResponseLine - CMR format for Contract information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.framework.dto.BatchRequest
 *      BatchRequest
 */
public interface ContractReportWriter {

    /**
     * This method generates the CMR for Contract Information.
     * The CMR includes general details, Contract hurdle rate details, contract rating entry details, contract
     * multi-segment routing details.The rating information occurs multiple times for each Contract.
     * 
     * 
     * @param pBatchRequest
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *         BatchRequest}</code>
     *            </ul>
     * @return String value
     */
    String createContractResponseLine(BatchRequest pBatchRequest);

    /**
     * This method filters contracts based on the input paramters.
     * <p>
     * If the filter criteria is matched then contract will be returned. Input parameters will be taken from
     * BatchRequest.
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
    BatchResponse filterContracts(BatchRequest pBatchRequest);

}
