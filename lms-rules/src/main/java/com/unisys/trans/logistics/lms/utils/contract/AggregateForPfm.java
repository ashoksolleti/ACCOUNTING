/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>AggregateForPfm</code> handles the Aggregate details for pfm.
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>deleteAggregate - deletes the existing aggregate.
 * <li>writeDiscrepencyReport - writes the discrepancy report.
 * <li>deleteRateConstructionArea - deletes the RateConstructionArea.
 * <li>writeRcaDiscrepencyReport - writes the discrepancy report for RateConstructionArea.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.AggregateDto AggregateDto
 */

public interface AggregateForPfm {
    /**
     * Deletes the <code>Aggregate</code>.
     * <p>
     * This method deletes an Aggregate.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
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
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code>
     * @throws LMSException
     *             If delete fails, above mentioned error codes are returned.
     *             Each CodeMessage contains the status code, human readable
     *             message, and message type.
     */
    BatchResponse deleteAggregate(BatchRequest pBatchRequest)
                throws LMSException;

    /**
     * Deletes the <code>RateConstructionArea</code>.
     * <p>
     * This method deletes an RateConstructionArea.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
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
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code>
     * @throws LMSException
     *             If delete fails, above mentioned error codes are returned.
     *             Each CodeMessage contains the status code, human readable
     *             message, and message type.
     */
    BatchResponse deleteRca(BatchRequest pBatchRequest)
                throws LMSException;

    /**
     * writes the discrepancy report for aggregate.
     * <p>
     * This method writes the discrepancy report for aggregate.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
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
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     * @param pReport
     *            holds the discrepancy report.
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code>
     * @throws LMSException
     *             If delete fails, above mentioned error codes are returned.
     *             Each CodeMessage contains the status code, human readable
     *             message, and message type.
     */
    BatchResponse
                writeAggregateDiscrepencyReport(BatchRequest pBatchRequest, StringBuffer pReport)
                            throws LMSException;

    /**
     * writes the discrepancy report for RCA.
     * <p>
     * This method writes the discrepancy report for RCA.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
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
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     * @param pReport
     *            holds the discrepancy report.
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code>
     * @throws LMSException
     *             If delete fails, above mentioned error codes are returned.
     *             Each CodeMessage contains the status code, human readable
     *             message, and message type.
     */
    BatchResponse writeRcaDiscrepencyReport(BatchRequest pBatchRequest, StringBuffer pReport)
                throws LMSException;

}