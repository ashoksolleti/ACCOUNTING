/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>StationHandlingDetailDto</code> contain details of StationHandlingDetailDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>comments
 * <li>exportInd
 * <li>importInd
 * <li>oId
 * <li>orderAsChars
 * <li>stationInfoSectionLabelDto
 * </code>
 * </ul>
 */

public class StationHandlingDetailDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>comments</code> property.
     */
    private String comments;

    /**
     * Attribute to hold <code>exportInd</code> property.
     */
    private boolean exportInd;

    /**
     * Attribute to hold <code>importInd</code> property.
     */
    private boolean importInd;

    /**
     * Attribute to hold <code>oId</code> property. Unique identifier for
     * station
     */
    private Long oId;

    /**
     * Attribute to hold <code>orderAsChars</code> property.
     */
    private char orderAsChars;

    /**
     * Attribute to hold <code>stationInfoSectionLabelDto</code> property.
     */
    private StationInfoSectionLabelDto stationInfoSectionLabelDto;

    /**
     * default Constructor.
     */
    public StationHandlingDetailDto() {

    }

    /**
     * StationHandlingDetailDto Constructor.
     * 
     * @param pComments
     *            It holds the value of comments.
     * @param pExportId
     *            It holds the value of export id.
     * @param pImportId
     *            It holds the value of import id.
     * @param pStationInfoSectionLabelDto
     *            It holds the value StationInfoSectionLabelDto.
     * 
     */
    public StationHandlingDetailDto(String pComments, boolean pExportInd,
                boolean pImportInd, StationInfoSectionLabelDto pStationInfoSectionLabelDto) {
        super();
        this.comments = pComments;
        this.exportInd = pExportInd;
        this.importInd = pImportInd;
        this.stationInfoSectionLabelDto = pStationInfoSectionLabelDto;
    }

    /**
     * Gets the <code>comments</code> property.
     * <p>
     * 
     * @return the current value of the <code>comments</code> property.
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * Gets the <code>exportInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>exportInd</code> property.
     */
    public boolean getExportInd() {
        return this.exportInd;
    }

    /**
     * Gets the <code>importInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>importInd</code> property.
     */
    public boolean getImportInd() {
        return this.importInd;
    }

    /**
     * Gets the value of <code>OID</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>orderAsChars</code> property.
     * <p>
     * 
     * @return the current value of the <code>orderAsChars</code> property.
     */
    public char getOrderAsChars() {
        return this.orderAsChars;
    }

    /**
     * Gets the <code>stationInfoSectionLabelDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationInfoSectionLabelDto</code> property.
     */
    public StationInfoSectionLabelDto getStationInfoSectionLabelDto() {
        return this.stationInfoSectionLabelDto;
    }

    /**
     * Sets the <code>comments</code> property.
     * <p>
     * 
     * @param pComments
     *            the current value of the <code>comments</code> property.
     */
    public void setComments(final String pComments) {
        this.comments = pComments;
    }

    /**
     * Sets the <code>exportInd</code> property.
     * <p>
     * 
     * @param pExportInd
     *            the current value of the <code>exportInd</code> property.
     */
    public void setExportInd(final boolean pExportInd) {
        this.exportInd = pExportInd;
    }

    /**
     * Sets the <code>importInd</code> property.
     * <p>
     * 
     * @param pImportInd
     *            the current value of the <code>importInd</code> property.
     */
    public void setImportInd(final boolean pImportInd) {
        this.importInd = pImportInd;
    }

    /**
     * Sets the value of the <code>OID</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>OID</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>orderAsChars</code> property.
     * <p>
     * 
     * @param pOrderAsChars
     *            the current value of the <code>orderAsChars</code> property.
     */
    public void setOrderAsChars(final char pOrderAsChars) {
        this.orderAsChars = pOrderAsChars;
    }

    /**
     * Sets the <code>stationInfoSectionLabelDto</code> property.
     * <p>
     * 
     * @param pStationInfoSectionLabelDto
     *            the current value of the <code>stationInfoSectionLabelDto</code> property.
     */
    public void setStationInfoSectionLabelDto(final StationInfoSectionLabelDto pStationInfoSectionLabelDto) {
        this.stationInfoSectionLabelDto = pStationInfoSectionLabelDto;
    }

}
