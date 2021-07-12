/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;

/**
 * <code>ContractCSVReportService</code> handles the Contract.
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>contractCSVReport - comma separated values for contract information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.ContractDto ContractDto
 */
public interface ContractCSVReportService {

    /**
     * This method generates the Comma Separated Values for Contract
     * Information. The Comma Separated Values includes general details,
     * multi-segment details, flight details, participant details and rating
     * details. The general details repeats for each contract information.The
     * multi-segment details repeat for n times for each contract version, if
     * exists. Participant details occurs for one to three times.The rating
     * information occurs multiple times for each contract version.
     * 
     * 
     * @param pBatchRequest
     *            <ul>
     *            <li>
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *         BatchRequest}</code>
     *            </ul>
     * @return String value
     */
    String contractCSVReport(BatchRequest pBatchRequest);
    /**
     * This method generates the Comma Separated Values for Contract
     * Information. The Comma Separated Values includes general details,
     * multi-segment details, flight details, participant details and rating
     * details. The general details repeats for each contract information.The
     * multi-segment details repeat for n times for each contract version, if
     * exists. Participant details occurs for one to three times.The rating
     * information occurs multiple times for each contract version.
     * 
     * 
     * @param pBatchRequest
     *            <ul>
     *            <li>
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *         BatchRequest}</code>
     *            </ul>
     * @return String value
     */
    String contractCSVSupportReport(BatchRequest pBatchRequest);
    

}
