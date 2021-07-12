/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.HashMap;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;

/**
 * <code>GlobalRatePFMResponse</code> contains the response of the maintenance request received by
 * <code>Batch services</code>.
 * <p>
 * <ul>
 * <li><code>reportString</code></li>
 * <li><code>taskReportString</code></li>
 * <li><code>theTasks</code></li>
 * </ul>
 */
public class TariffRateATPReportResponse extends BatchResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6480916955187977237L;

    /**
     * Attribute to hold the <code>theRreportString</code>.
     */
    private String tariffRateReport;

    /**
     * Attribute to hold the <code>theRreportString</code>.
     */
    private String tariffRateErrorReport;

    /**
     * Attribute to hold the <code>errorCount</code>.
     */
    private Map<String,Long> errorCount = new HashMap<String,Long>();
    
    public Map<String, Long> getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(Map<String, Long> errorCount) {
        this.errorCount = errorCount;
    }

    /**
     * <code>Default constructor.</code>
     */
    public TariffRateATPReportResponse() {

    }

    /**
     * Gets the <code>tariffRateReport</code>.
     * <p>
     * 
     * @return <code>tariffRateReport</code><br>
     *         Returns the value of<code>tariffRateReport</code>.
     *         </p>
     */
    public String getTariffRateReport() {
        return this.tariffRateReport;
    }

    /**
     * Gets the <code>tariffRateErrorReport</code>.
     * <p>
     * 
     * @return <code>tariffRateErrorReport</code><br>
     *         Returns the value of<code>tariffRateErrorReport</code>.
     *         </p>
     */
    public String getTariffRateErrorReport() {
        return this.tariffRateErrorReport;
    }


    /**
     * Sets the <code>tariffRateReport</code>.
     * <p>
     * 
     * @param pTariffRateReport
     *            the value of<code>tariffRateReport</code>.
     *            </p>
     */
    public void setTariffRateReport(final String pTariffRateReport) {
        this.tariffRateReport = pTariffRateReport;
    }

    /**
     * Sets the <code>tariffRateErrorReport</code>.
     * <p>
     * 
     * @param pTariffRateErrorReport
     *            the value of<code>tariffRateErrorReport</code>.
     *            </p>
     */
    public void setTariffRateErrorReport(final String pTariffRateErrorReport) {
        this.tariffRateErrorReport = pTariffRateErrorReport;
    }

}
