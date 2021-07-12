/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;

/**
 * <code>SpotRateCSVReportService</code> handles the SpotRate.
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>SpotRateCSVReport - comma separated values for SpotRate information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.SpotRateDto SpotRateDto
 */
public interface SpotRateCSVReportWriter {

    /**
     * This method generates the Comma Separated Values for SpotRate
     * Information. The Comma Separated Values includes general details,
     * participant details and rating details.The rating information occurs
     * multiple times for each SpotRate version.
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
    String writeCSVForSpotRate(BatchRequest pRequest);

}
