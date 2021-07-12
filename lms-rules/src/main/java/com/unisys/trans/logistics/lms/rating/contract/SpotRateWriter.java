/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;

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
public interface SpotRateWriter {

    /**
     * This method generates the CMR for SpotRate Information. The CMR includes
     * general details, authorized user details, remarks and spot rate in-use
     * details, spot rate routing details and rating entry details. The general
     * details repeats for each spot rate information.The rating information
     * occurs multiple times for each spot rate.
     * 
     * 
     * @param pRequest
     *            <ul>
     *            <li>
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *         BatchRequest}</code>
     *            </ul>
     * @return String value
     */
    String writeCMRForSpotRate(BatchRequest pRequest);

}