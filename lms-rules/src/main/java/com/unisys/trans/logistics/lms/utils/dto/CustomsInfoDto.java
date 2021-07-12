/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <code>CustomsInfoDto</code> contains specific data applicable to the country customs information.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>area</code></li>
 * <li><code>automatedExportIndicator</code></li>
 * <li><code>automatedImportIndicator</code></li>
 * <li><code>awbActiveDays</code></li>
 * <li><code>awbArchivedRetainedDays</code></li>
 * <li><code>awbDaysBeforeReuse</code></li>
 * <li><code>awbImportIndicator</code></li>
 * <li><code>defaultHoldIndicator</code></li>
 * <li><code>edifactFromNetworkId</code></li>
 * <li><code>edifactToNetworkId</code></li>
 * <li><code>excludeAutomaticFlightIndicator</code></li>
 * <li><code>hawbAssociationFlightFinalCode</code></li>
 * <li><code>hawbAutomaticAssociationCode</code></li>
 * <li><code>queue</code></li>
 * <li><code>queueOffice</code></li>
 * <li><code>queueStation</code>.</li>
 * <li><code>reportingMethodCode</code></li>
 * <li><code>shutoffMessageCode</code></li>
 * <li><code>ttyFromAddress</code></li>
 * <li><code>ttyToAddress</code></li>
 * </ul>
 */
public class CustomsInfoDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7497850350081585221L;

    /**
     * Attribute to hold <code>area</code> property.
     */
    private String area;

    /**
     * Attribute to hold <code>automatedExportIndicator</code> property.
     */
    private boolean automatedExportIndicator;

    /**
     * Attribute to hold <code>automatedImportIndicator</code> property.
     */
    private boolean automatedImportIndicator;

    /**
     * Attribute to hold <code>awbActiveDays</code> property.
     */
    private int awbActiveDays;

    /**
     * Attribute to hold <code>awbArchivedRetainedDays</code> property.
     */
    private int awbArchivedRetainedDays;

    /**
     * Attribute to hold <code>awbDaysBeforeReuse</code> property.
     */
    private int awbDaysBeforeReuse;

    /**
     * Attribute to hold <code>awbImportIndicator</code> property.
     */
    private boolean awbImportIndicator;

    /**
     * Attribute to hold <code>defaultHoldIndicator</code> property.
     */
    private boolean defaultHoldIndicator;

    /**
     * Attribute to hold <code>edifactFromNetworkId</code> property.
     */
    private String edifactFromNetworkId;

    /**
     * Attribute to hold <code>edifactToNetworkId</code> property.
     */
    private String edifactToNetworkId;

    /**
     * Attribute to hold <code>excludeAutomaticFlightIndicator</code> property.
     */
    private boolean excludeAutomaticFlightIndicator;

    /**
     * Attribute to hold <code>hawbAssociationFlightFinalCode</code> property.
     */
    private String hawbAssociationFlightFinalCode;

    /**
     * Attribute to hold <code>hawbAutomaticAssociationCode</code> property.
     */
    private String hawbAutomaticAssociationCode;

    /**
     * Attribute to hold <code>hoursBeforeArrivalReport</code> property.
     */
    private BigDecimal hoursBeforeArrivalReport;

    /**
     * Attribute to hold <code>queue</code> property.
     */
    private String queue;

    /**
     * Attribute to hold <code>queueOffice</code> property.
     */
    private int queueOffice;

    /**
     * Attribute to hold <code>queueStation</code> property.
     */
    private String queueStation;

    /**
     * Attribute to hold <code>reportingMethodCode</code> property.
     */
    private String reportingMethodCode;

    /**
     * Attribute to hold <code>shutoffMessageCode</code> property.
     */
    private String shutoffMessageCode;

    /**
     * Attribute to hold <code>ttyFromAddress</code> property.
     */
    private String ttyFromAddress;

    /**
     * Attribute to hold <code>ttyToAddress</code> property.
     */
    private String ttyToAddress;

    /**
     * <code>Default constructor.</code>
     */

    public CustomsInfoDto() {

    }

    /**
     * Gets the value of the <code>customsArea</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alpha<br>
     * <b>Example: </b><br>
     * NA
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the <code>customsArea</code> of the country.<br>
     */
    public String getArea() {
        return this.area;
    }

    /**
     * Gets the value of the <code>awbActiveDays</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <b>Example: </b><br>
     * 365
     * <p>
     * 
     * @return <code>int</code>.<br>
     *         Returns the <code>awbActiveDays</code> of the product.<br>
     */
    public int getAwbActiveDays() {
        return this.awbActiveDays;
    }

    /**
     * Gets the value of the <code>awbArchivedRetainedDays</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <b>Example: </b><br>
     * 180
     * <p>
     * 
     * @return <code>int</code>.<br>
     *         Returns the <code>awbArchivedRetainedDays</code> of the product.<br>
     */
    public int getAwbArchivedRetainedDays() {
        return this.awbArchivedRetainedDays;
    }

    /**
     * Gets the value of the <code>awbDaysBeforeReuse</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <b>Example: </b><br>
     * 180
     * <p>
     * 
     * @return <code>int</code>.<br>
     *         Returns the <code>awbDaysBeforeReuse</code> of the product.<br>
     */
    public int getAwbDaysBeforeReuse() {
        return this.awbDaysBeforeReuse;
    }

    /**
     * Gets the value of the <code>edifactFromNetworkId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 35 Alpha<br>
     * <b>Example: </b><br>
     * Blank
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the <code>edifactFromNetworkId</code> of the country.<br>
     */
    public String getEdifactFromNetworkId() {
        return this.edifactFromNetworkId;
    }

    /**
     * Gets the value of the <code>edifactToNetworkId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 35 Alpha<br>
     * <b>Example: </b><br>
     * Blank
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the <code>edifactToNetworkId</code> of the country.<br>
     */
    public String getEdifactToNetworkId() {
        return this.edifactToNetworkId;
    }

    /**
     * Gets the value of the <code>hawbAssoFlightFinalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alpha<br>
     * <b>Example: </b><br>
     * W
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the <code>hawbAssoFlightFinalCode</code> of the country.<br>
     */
    public String getHawbAssociationFlightFinalCode() {
        return this.hawbAssociationFlightFinalCode;
    }

    /**
     * Gets the value of the <code>hawbAutoAssoCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alpha<br>
     * <b>Example: </b><br>
     * N
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the <code>hawbAutoAssoCode</code> of the country.<br>
     */
    public String getHawbAutomaticAssociationCode() {
        return this.hawbAutomaticAssociationCode;
    }

    /**
     * Gets the value of the <code>hoursBeforeArrivalReport</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Floatint point<br>
     * <b>Example: </b><br>
     * 484.2
     * <p>
     * 
     * @return <code>BigDecimal</code><br>
     *         Returns the <code>hoursBeforeArrivalReport</code> of the country.<br>
     */
    public BigDecimal getHoursBeforeArrivalReport() {
        return this.hoursBeforeArrivalReport;
    }

    /**
     * Gets the value of the <code>customsQueue</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alpha<br>
     * <b>Example: </b><br>
     * AE
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the <code>customsQueue</code> of the country.<br>
     */
    public String getQueue() {
        return this.queue;
    }

    /**
     * Gets the value of the <code>customsQueueOffice</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric<br>
     * <b>Example: </b><br>
     * 112
     * <p>
     * 
     * @return <code>int</code>.<br>
     *         Returns the <code>customsQueueOffice</code> of the country.<br>
     */
    public int getQueueOffice() {
        return this.queueOffice;
    }

    /**
     * Gets the value of the <code>customsQueueStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the <code>customsQueueStation</code> of the country.<br>
     */
    public String getQueueStation() {
        return this.queueStation;
    }

    /**
     * Gets the value of the <code>reportingMethodCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alpha<br>
     * <b>Example: </b><br>
     * T
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the <code>reportingMethodCode</code> of the country.<br>
     */
    public String getReportingMethodCode() {
        return this.reportingMethodCode;
    }

    /**
     * Gets the value of the <code>shutoffMsgCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alpha<br>
     * <b>Example: </b><br>
     * T
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the <code>shutoffMsgCode</code> of the country.<br>
     */
    public String getShutoffMessageCode() {
        return this.shutoffMessageCode;
    }

    /**
     * Gets the value of the <code>ttyFromAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 Alpha<br>
     * <b>Example: </b><br>
     * MSPFWUV
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the <code>ttyFromAddress</code> of the country.<br>
     */
    public String getTtyFromAddress() {
        return this.ttyFromAddress;
    }

    /**
     * Gets the value of the <code>ttyToAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 Alpha <br>
     * <b>Example: </b><br>
     * MSPFMUW
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the <code>ttyToAddress</code> of the country.<br>
     */
    public String getTtyToAddress() {
        return this.ttyToAddress;
    }

    /**
     * Determines if the <code>automatedExpIndicator</code> property is true.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Export Customs is automated.<br>
     * <code>false</code> - Eexport Customs is not automated.
     * <p>
     * 
     * @return The current value of <code>automatedExpIndicator</code> property.<br>
     */
    public boolean isAutomatedExportIndicator() {
        return this.automatedExportIndicator;
    }

    /**
     * Determines if the <code>automatedImpIndicator</code> property is true.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Import Customs is automated.<br>
     * <code>false</code> - Import Customs is not automated.
     * <p>
     * 
     * @return The current value of <code>automatedImpIndicator</code> property.<br>
     */
    public boolean isAutomatedImportIndicator() {
        return this.automatedImportIndicator;
    }

    /**
     * Determines if the <code>awbImpCustomsIndicator</code> property is true.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Air Waybill import customs enforcement should be done for this country.<br>
     * <code>false</code> - Air Waybill import customs processing should not be enforced.<br>
     * 
     * @return The current value of <code>awbImpCustomsIndicator</code> property.<br>
     */
    public boolean isAwbImportIndicator() {
        return this.awbImportIndicator;
    }

    /**
     * Determines if the <code>defaultHoldIndicator</code> property is true.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - a default customs hold will not prevent delivery.<br>
     * <code>false</code> - a default customs hold will not prevent delivery. <br>
     * 
     * @return The current value of <code>defaultHoldIndicator</code> property.<br>
     */
    public boolean isDefaultHoldIndicator() {
        return this.defaultHoldIndicator;
    }

    /**
     * Determines if the <code>excludeAutoFlightIndicator</code> property is true.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - The House AirWaybill Association is only validated during manual flight
     * finalization.<br>
     * <code>false</code> - The House AirWaybill Association is not validated during manual flight
     * finalization.<br>
     * 
     * @return The current value of <code>excludeAutoFlightIndicator</code> property.<br>
     */
    public boolean isExcludeAutomaticFlightIndicator() {
        return this.excludeAutomaticFlightIndicator;
    }

    /**
     * Sets the value of the <code>customsArea</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alpha<br>
     * <b>Example: </b><br>
     * NA
     * 
     * @param pArea <code>String</code><br>
     *            The new value of the <code>customsArea</code> property.<br>
     */
    public void setArea(final String pArea) {

        this.area = ContractUtility.convertToUpperCase(pArea);
    }

    /**
     * Sets the value of the <code>automatedExpIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Export Customs is automated.<br>
     * <code>false</code> - Eexport Customs is not automated.<br>
     * 
     * @param pAutomatedExportIndicator <code>boolean</code><br>
     *            The new value of the <code>automatedExpIndicator</code> property.<br>
     */
    public void setAutomatedExportIndicator(final boolean pAutomatedExportIndicator) {
        this.automatedExportIndicator = pAutomatedExportIndicator;
    }

    /**
     * Sets the value of the <code>copyGoodsIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Import Customs is automated.<br>
     * <code>false</code> - Import Customs is not automated.<br>
     * 
     * @param pAutomatedImportIndicator <code>boolean</code><br>
     *            The new value of the <code>automatedImpIndicator</code> property.<br>
     */
    public void setAutomatedImportIndicator(final boolean pAutomatedImportIndicator) {
        this.automatedImportIndicator = pAutomatedImportIndicator;
    }

    /**
     * Sets the value of the <code>awbActiveDays</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <b>Example: </b><br>
     * 365
     * <p>
     * 
     * @param pAwbActiveDays <code>int</code><br>
     *            The new value of the <code>awbActiveDays</code> property.<br>
     */
    public void setAwbActiveDays(final int pAwbActiveDays) {
        this.awbActiveDays = pAwbActiveDays;
    }

    /**
     * Sets the value of the <code>awbArchivedRetainedDays</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <b>Example: </b><br>
     * 180
     * <p>
     * 
     * @param pAwbArchivedRetainedDays <code>int</code><br>
     *            The new value of the <code>awbArchivedRetainedDays</code> property.<br>
     */
    public void setAwbArchivedRetainedDays(final int pAwbArchivedRetainedDays) {
        this.awbArchivedRetainedDays = pAwbArchivedRetainedDays;
    }

    /**
     * Sets the value of the <code>awbDaysBeforeReuse</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <b>Example: </b><br>
     * 180
     * 
     * @param pAwbDaysBeforeReuse <code>int</code><br>
     *            The new value of the <code>awbDaysBeforeReuse</code> property.<br>
     */
    public void setAwbDaysBeforeReuse(final int pAwbDaysBeforeReuse) {
        this.awbDaysBeforeReuse = pAwbDaysBeforeReuse;
    }

    /**
     * Sets the value of the <code>awbImpCustomsIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Air Waybill import customs enforcement should be done for this country.<br>
     * <code>false</code> - Air Waybill import customs processing should not be enforced.<br>
     * 
     * @param pAwbImportIndicator <code>boolean</code><br>
     *            The new value of the <code>awbImpCustomsIndicator</code> property.<br>
     */
    public void setAwbImportIndicator(final boolean pAwbImportIndicator) {
        this.awbImportIndicator = pAwbImportIndicator;
    }

    /**
     * Sets the value of the <code>defaultHoldIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - a default customs hold will not prevent delivery.<br>
     * <code>false</code> - a default customs hold will not prevent delivery. <br>
     * 
     * @param pDefaultHoldIndicator <code>boolean</code><br>
     *            The new value of the <code>defaultHoldIndicator</code> property.<br>
     */
    public void setDefaultHoldIndicator(final boolean pDefaultHoldIndicator) {
        this.defaultHoldIndicator = pDefaultHoldIndicator;
    }

    /**
     * Sets the value of the <code>edifactFromNetworkId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 35 Alpha<br>
     * <b>Example: </b><br>
     * Blank
     * 
     * @param pEdifactFromNetworkId <code>String</code><br>
     *            The new value of the <code>edifactFromNetworkId</code> property.<br>
     */
    public void setEdifactFromNetworkId(final String pEdifactFromNetworkId) {
        this.edifactFromNetworkId = pEdifactFromNetworkId;
    }

    /**
     * Sets the value of the <code>edifactToNetworkId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 35 Alpha<br>
     * <b>Example: </b><br>
     * Blank
     * 
     * @param pEdifactToNetworkId <code>String</code><br>
     *            The new value of the <code>edifactToNetworkId</code> property.<br>
     */
    public void setEdifactToNetworkId(final String pEdifactToNetworkId) {
        this.edifactToNetworkId = pEdifactToNetworkId;
    }

    /**
     * Sets the value of the <code>excludeAutoFlightIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - The House AirWaybill Association is only validated during manual flight
     * finalization.<br>
     * <code>false</code> - The House AirWaybill Association is not validated during manual flight
     * finalization.<br>
     * 
     * @param pExcludeAutomaticFlightIndicator <code>boolean</code><br>
     *            The new value of the <code>excludeAutoFlightIndicator</code> property.<br>
     */
    public void setExcludeAutomaticFlightIndicator(final boolean pExcludeAutomaticFlightIndicator) {
        this.excludeAutomaticFlightIndicator = pExcludeAutomaticFlightIndicator;
    }

    /**
     * Sets the value of the <code>hawbAssoFlightFinalCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alpha<br>
     * <b>Example: </b><br>
     * W
     * 
     * @param pHawbAssociationFlightFinalCode <code>String</code><br>
     *            The new value of the <code>hawbAssoFlightFinalCode</code> property.<br>
     */
    public void setHawbAssociationFlightFinalCode(final String pHawbAssociationFlightFinalCode) {

        this.hawbAssociationFlightFinalCode =
                    ContractUtility.convertToUpperCase(pHawbAssociationFlightFinalCode);
    }

    /**
     * Sets the value of the <code>hawbAutoAssoCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alpha<br>
     * <b>Example: </b><br>
     * N
     * 
     * @param pHawbAutomaticAssociationCode <code>String</code><br>
     *            The new value of the <code>hawbAutoAssoCode</code> property.<br>
     */
    public void setHawbAutomaticAssociationCode(final String pHawbAutomaticAssociationCode) {

        this.hawbAutomaticAssociationCode = ContractUtility.convertToUpperCase(pHawbAutomaticAssociationCode);
    }

    /**
     * Sets the value of the <code>hoursBeforeArrivalReport</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Floatint point<br>
     * <b>Example: </b><br>
     * 482.4
     * 
     * @param pHoursBeforeArrivalReport <code>BigDecimal</code><br>
     *            The new value of the <code>hoursBeforeArrivalReport</code> property.<br>
     */
    public void setHoursBeforeArrivalReport(final BigDecimal pHoursBeforeArrivalReport) {
        this.hoursBeforeArrivalReport = pHoursBeforeArrivalReport;
    }

    /**
     * Sets the value of the <code>customsQueue</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alpha<br>
     * <b>Example: </b><br>
     * AE
     * 
     * @param pQueue <code>String</code><br>
     *            The new value of the <code>customsQueue</code> property.<br>
     */
    public void setQueue(final String pQueue) {
        this.queue = ContractUtility.convertToUpperCase(pQueue);
    }

    /**
     * Sets the value of the <code>customsQueueOffice</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric<br>
     * <b>Example: </b><br>
     * 112
     * 
     * @param pQueueOffice <code>int</code><br>
     *            The new value of the <code>customsQueueOffice</code> property.<br>
     */
    public void setQueueOffice(final int pQueueOffice) {
        this.queueOffice = pQueueOffice;
    }

    /**
     * Sets the value of the <code>customsQueueStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * MSP
     * 
     * @param pQueueStation <code>String</code><br>
     *            The new value of the <code>customsQueueStation</code> property.<br>
     */
    public void setQueueStation(final String pQueueStation) {
        this.queueStation = ContractUtility.convertToUpperCase(pQueueStation);
    }

    /**
     * Sets the value of the <code>reportingMethodCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alpha<br>
     * <b>Example: </b><br>
     * T
     * 
     * @param pReportingMethodCode <code>String</code><br>
     *            The new value of the <code>reportingMethodCode</code> property.<br>
     */
    public void setReportingMethodCode(final String pReportingMethodCode) {

        this.reportingMethodCode = ContractUtility.convertToUpperCase(pReportingMethodCode);
    }

    /**
     * Sets the value of the <code>shutoffMsgCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alpha<br>
     * <b>Example: </b><br>
     * T
     * 
     * @param pShutoffMessageCode <code>String</code><br>
     *            The new value of the <code>shutoffMsgCode</code> property.<br>
     */
    public void setShutoffMessageCode(final String pShutoffMessageCode) {

        this.shutoffMessageCode = ContractUtility.convertToUpperCase(pShutoffMessageCode);
    }

    /**
     * Sets the value of the <code>ttyFromAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 Alpha<br>
     * <b>Example: </b><br>
     * MSPFWUV
     * 
     * @param pTtyFromAddress <code>String</code><br>
     *            The new value of the <code>ttyFromAddress</code> property.<br>
     */
    public void setTtyFromAddress(final String pTtyFromAddress) {
        this.ttyFromAddress = ContractUtility.convertToUpperCase(pTtyFromAddress);
    }

    /**
     * Sets the value of the <code>ttyToAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 Alpha <br>
     * <b>Example: </b><br>
     * MSPFMUW
     * 
     * @param pTtyToAddress <code>String</code><br>
     *            The new value of the <code>ttyToAddress</code> property.<br>
     */
    public void setTtyToAddress(final String pTtyToAddress) {
        this.ttyToAddress = ContractUtility.convertToUpperCase(pTtyToAddress);
    }
}
