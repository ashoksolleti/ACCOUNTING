/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

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
public class GlobalRatePFMResponse extends BatchResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6480916955187977237L;

    /**
     * Attribute to hold the <code>theRreportString</code>.
     */
    private String reportString;

    /**
     * Attribute to hold the <code>theRreportString</code>.
     */
    private String taskReportString;

    /**
     * Attribute to hold the list of<code>task</code>'s.
     */
    private Object theTasks;

    /**
     * <code>Default constructor.</code>
     */
    public GlobalRatePFMResponse() {

    }

    /**
     * Gets the <code>reportString</code>.
     * <p>
     * 
     * @return <code>reportString</code><br>
     *         Returns the value of<code>reportString</code>.
     *         </p>
     */
    public String getReportString() {
        return this.reportString;
    }

    /**
     * Gets the <code>taskReportString</code>.
     * <p>
     * 
     * @return <code>taskReportString</code><br>
     *         Returns the value of<code>taskReportString</code>.
     *         </p>
     */
    public String getTaskReportString() {
        return this.taskReportString;
    }

    /**
     * Gets the <code>theTasks</code>.
     * <p>
     * 
     * @return <code>theTasks</code><br>
     *         Returns the list of<code>task</code>'s.
     *         </p>
     */
    public Object getTheTasks() {
        return this.theTasks;
    }

    /**
     * Sets the <code>reportString</code>.
     * <p>
     * 
     * @param pReportString
     *            the value of<code>reportString</code>.
     *            </p>
     */
    public void setReportString(final String pReportString) {
        this.reportString = pReportString;
    }

    /**
     * Sets the <code>taskReportString</code>.
     * <p>
     * 
     * @param pTaskReportString
     *            the value of<code>taskReportString</code>.
     *            </p>
     */
    public void setTaskReportString(final String pTaskReportString) {
        this.taskReportString = pTaskReportString;
    }

    /**
     * Sets the <code>theTasks</code>.
     * <p>
     * 
     * @param pTheTasks
     *            the list of<code>task</code>'s.
     *            </p>
     */
    public void setTheTasks(final Object pTheTasks) {
        this.theTasks = pTheTasks;
    }

}
