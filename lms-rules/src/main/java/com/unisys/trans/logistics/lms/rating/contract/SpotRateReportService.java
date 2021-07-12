/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;

/**
 * <code>SpotRateWriter</code> handles the SpotRate.
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>writeCMRForSpotRate - CMR format for SpotRate information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.SpotRateDto SpotRateDto
 */
public interface SpotRateReportService {

    /**
     * This method filters SpotRate based on the input parameters.
     * <p>
     * If the filter criteria is matched then spot rate will be returned. Input parameters will be taken from
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
    BatchResponse filterSpotRates(BatchRequest pBatchRequest);

}