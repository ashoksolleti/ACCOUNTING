/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;

/**
 * <code>StationInformationConnectionTimeDto</code> contain details of StationInformationConnectionTimeDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>airportCode
 * <li>bulkExpress
 * <li>bulkMaximum
 * <li>bulkNormal
 * <li>bulkTimeFrame
 * <li>connectionType
 * <li>hostIndicator
 * <li>palletMaximum
 * <li>palletNormal
 * <li>palletExpress
 * <li>palletTimeFrame
 * </code>
 * </ul>
 */
public class StationInformationConnectionTimeDto implements Serializable {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 8388733165960731267L;

    /**
     * Attribute to hold <code>airportCode</code> property.
     */
    private String airportCode;

    /**
     * Attribute to hold <code>bulkExpress</code> property.
     */
    private Integer bulkExpress;

    /**
     * Attribute to hold <code>bulkMaximum</code> property.
     */
    private Integer bulkMaximum;

    /**
     * Attribute to hold <code>bulkNormal</code> property.
     */
    private Integer bulkNormal;

    /**
     * Attribute to hold <code>bulkTimeFrame</code> property.
     */
    private Integer bulkTimeFrame;

    /**
     * Attribute to hold <code>connectionType</code> property.
     */
    private String connectionType;

    /**
     * Attribute to hold <code>hostIndicator</code> property.
     */
    private String hostIndicator;

    /**
     * Attribute to hold <code>palletMaximum</code> property.
     */
    private Integer palletMaximum;

    /**
     * Attribute to hold <code>palletNormal</code> property.
     */
    private Integer palletNormal;

    /**
     * Attribute to hold <code>palletExpress</code> property.
     */
    private Integer palletExpress;

    /**
     * Attribute to hold <code>palletTimeFrame</code> property.
     */
    private Integer palletTimeFrame;

    /**
     * Gets the <code>airportCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>airportCode</code> property.
     */
    public String getAirportCode() {
        return this.airportCode;
    }

    /**
     * Gets the <code>bulkExpress</code> property.
     * <p>
     * 
     * @return the current value of the <code>bulkExpress</code> property.
     */
    public Integer getBulkExpress() {
        return this.bulkExpress;
    }

    /**
     * Gets the <code>bulkMaximum</code> property.
     * <p>
     * 
     * @return the current value of the <code>bulkMaximum</code> property.
     */
    public Integer getBulkMaximum() {
        return this.bulkMaximum;
    }

    /**
     * Gets the <code>bulkNormal</code> property.
     * <p>
     * 
     * @return the current value of the <code>bulkNormal</code> property.
     */
    public Integer getBulkNormal() {
        return this.bulkNormal;
    }

    /**
     * Gets the <code>bulkTimeFrame</code> property.
     * <p>
     * 
     * @return the current value of the <code>bulkTimeFrame</code> property.
     */
    public Integer getBulkTimeFrame() {
        return this.bulkTimeFrame;
    }

    /**
     * Gets the <code>connectionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>connectionType</code> property.
     */
    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * Gets the <code>hostIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>hostIndicator</code> property.
     */
    public String getHostIndicator() {
        return hostIndicator;
    }

    /**
     * Gets the <code>palletMaximum</code> property.
     * <p>
     * 
     * @return the current value of the <code>palletMaximum</code> property.
     */
    public Integer getPalletMaximum() {
        return this.palletMaximum;
    }

    /**
     * Gets the <code>palletNormal</code> property.
     * <p>
     * 
     * @return the current value of the <code>palletNormal</code> property.
     */
    public Integer getPalletNormal() {
        return this.palletNormal;
    }

    /**
     * Gets the <code>palletExpress</code> property.
     * <p>
     * 
     * @return the current value of the <code>palletExpress</code> property.
     */
    public Integer getPalletExpress() {
        return this.palletExpress;
    }

    /**
     * Gets the <code>palletTimeFrame</code> property.
     * <p>
     * 
     * @return the current value of the <code>palletTimeFrame</code> property.
     */
    public Integer getPalletTimeFrame() {
        return this.palletTimeFrame;
    }

    /**
     * Sets the <code>airportCode</code> property.
     * <p>
     * 
     * @param pAirportCode
     *            the current value of the <code>airportCode</code> property.
     */
    public void setAirportCode(final String pAirportCode) {
        this.airportCode = pAirportCode;
    }

    /**
     * Sets the <code>bulkExpress</code> property.
     * <p>
     * 
     * @param pBulkExpress
     *            the current value of the <code>bulkExpress</code> property.
     */
    public void setBulkExpress(final Integer pBulkExpress) {
        this.bulkExpress = pBulkExpress;
    }

    /**
     * Sets the <code>bulkMaximum</code> property.
     * <p>
     * 
     * @param pBulkMaximum
     *            the current value of the <code>bulkMaximum</code> property.
     */
    public void setBulkMaximum(final Integer pBulkMaximum) {
        this.bulkMaximum = pBulkMaximum;
    }

    /**
     * Sets the <code>bulkNormal</code> property.
     * <p>
     * 
     * @param pBulkNormal
     *            the current value of the <code>bulkNormal</code> property.
     */
    public void setBulkNormal(final Integer pBulkNormal) {
        this.bulkNormal = pBulkNormal;
    }

    /**
     * Sets the <code>bulkTimeFrame</code> property.
     * <p>
     * 
     * @param pBulkTimeFrame
     *            the current value of the <code>bulkTimeFrame</code> property.
     */
    public void setBulkTimeFrame(final Integer pBulkTimeFrame) {
        this.bulkTimeFrame = pBulkTimeFrame;
    }

    /**
     * Sets the <code>connectionType</code> property.
     * <p>
     * 
     * @param pConnectionType
     *            the current value of the <code>connectionType</code> property.
     */
    public void setConnectionType(final String pConnectionType) {
        this.connectionType = pConnectionType;
    }

    /**
     * Sets the <code>hostIndicator</code> property.
     * <p>
     * 
     * @param pHostIndicator
     *            the current value of the <code>hostIndicator</code> property.
     */
    public void setHostIndicator(final String pHostIndicator) {
        this.hostIndicator = pHostIndicator;
    }

    /**
     * Sets the <code>palletMaximum</code> property.
     * <p>
     * 
     * @param pPalletMaximum
     *            the current value of the <code>palletMaximum</code> property.
     */
    public void setPalletMaximum(final Integer pPalletMaximum) {
        this.palletMaximum = pPalletMaximum;
    }

    /**
     * Sets the <code>palletNormal</code> property.
     * <p>
     * 
     * @param pPalletNormal
     *            the current value of the <code>palletNormal</code> property.
     */
    public void setPalletNormal(final Integer pPalletNormal) {
        this.palletNormal = pPalletNormal;
    }

    /**
     * Sets the <code>palletExpress</code> property.
     * <p>
     * 
     * @param pPalletExpress
     *            the current value of the <code>palletExpress</code> property.
     */
    public void setPalletExpress(final Integer pPalletExpress) {
        this.palletExpress = pPalletExpress;
    }

    /**
     * Sets the <code>palletTimeFrame</code> property.
     * <p>
     * 
     * @param pPalletTimeFrame
     *            the current value of the <code>palletTimeFrame</code> property.
     */
    public void setPalletTimeFrame(final Integer pPalletTimeFrame) {
        this.palletTimeFrame = pPalletTimeFrame;
    }

}
