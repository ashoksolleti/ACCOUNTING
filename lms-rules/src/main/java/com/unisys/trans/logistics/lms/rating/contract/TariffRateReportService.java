/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.TariffRateReportRequest;

/**
 * <code>TariffRateReportService</code> handles the TariffRate.
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>filterTariffRates - filters the tariff rate information.
 * <li>findTariffOandD - find the tariff rate information for origin and destination.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.TariffRateReportRequest TariffRateReportRequest
 */
public interface TariffRateReportService {

    /**
     * This method filters TariffRateOandD based on the input parameters.
     * <p>
     * If the filter criteria is matched then TariffRateOandD will be returned. Input parameters will be taken
     * from BatchRequest.
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
    BatchResponse filterTariffRates(TariffRateReportRequest pRequest) throws LMSException;

    /**
     * This method finds TariffRateOandD based on the input parameters.
     * <p>
     * If the TariffRateOandD is found based on the input parameter, then it will be returned.
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
    BatchResponse findTariffOandD(TariffRateReportRequest aBatchRequest) throws LMSException;
    
    BatchResponse findRateSource(BatchRequest pRequest) throws LMSException;
    

}
