/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>StationFacilityContactDto</code> contain details of StationFacilityContactDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>cargoTTY
 * <li>customsInfo
 * <li>innerCityFax
 * <li>innerCityPhone
 * <li>label
 * <li>labelOId
 * <li>labelOrder
 * <li>oId
 * <li>outsideFax
 * <li>outsidePhone
 * </code>
 * </ul>
 */
public class StationFacilityContactDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5002253213456907024L;

    /**
     * Attribute to hold <code>cargoTTY</code> property.
     */
    private String cargoTTY;

    /**
     * Attribute to hold <code>customsInfo</code> property.
     */
    private String customsInfo;

    /**
     * Attribute to hold <code>innerCityFax</code> property.
     */
    private String innerCityFax;

    /**
     * Attribute to hold <code>innerCityPhone</code> property.
     */
    private String innerCityPhone;

    /**
     * Attribute to hold <code>label</code> property.
     */
    private String label;

    /**
     * Attribute to hold <code>labelOId</code> property.
     */
    private Long labelOId;

    /**
     * Attribute to hold <code>labelOrder</code> property.
     */
    private int labelOrder;

    /**
     * Attribute to hold <code>oId</code> property. Unique identifier for station
     */
    private Long oId;

    /**
     * Attribute to hold <code>outsideFax</code> property.
     */
    private String outsideFax;

    /**
     * Attribute to hold <code>outsidePhone</code> property.
     */
    private String outsidePhone;

    /**
     * Gets the <code>cargoTTY</code> property.
     * <p>
     * 
     * @return the current value of the <code>cargoTTY</code> property.
     */
    public String getCargoTTY() {
        return this.cargoTTY;
    }

    /**
     * Gets the <code>customsInfo</code> property.
     * <p>
     * 
     * @return the current value of the <code>customsInfo</code> property.
     */
    public String getCustomsInfo() {
        return this.customsInfo;
    }

    /**
     * Gets the <code>innerCityFax</code> property.
     * <p>
     * 
     * @return the current value of the <code>innerCityFax</code> property.
     */
    public String getInnerCityFax() {
        return this.innerCityFax;
    }

    /**
     * Gets the <code>innerCityPhone</code> property.
     * <p>
     * 
     * @return the current value of the <code>innerCityPhone</code> property.
     */
    public String getInnerCityPhone() {
        return this.innerCityPhone;
    }

    /**
     * Gets the <code>label</code> property.
     * <p>
     * 
     * @return the current value of the <code>label</code> property.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Gets the <code>stationOId</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationOId</code> property.
     */
    public Long getLabelOId() {
        return this.labelOId;
    }

    /**
     * Gets the <code>labelOrder</code> property.
     * <p>
     * 
     * @return the current value of the <code>labelOrder</code> property.
     */
    public int getLabelOrder() {
        return this.labelOrder;
    }

    /**
     * Gets the value of <code>oId</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>outsideFax</code> property.
     * <p>
     * 
     * @return the current value of the <code>outsideFax</code> property.
     */
    public String getOutsideFax() {
        return this.outsideFax;
    }

    /**
     * Gets the <code>outsidePhone</code> property.
     * <p>
     * 
     * @return the current value of the <code>outsidePhone</code> property.
     */
    public String getOutsidePhone() {
        return this.outsidePhone;
    }

    /**
     * Sets the <code>cargoTTY</code> property.
     * <p>
     * 
     * @param pCargoTTY
     *            the current value of the <code>cargoTTY</code> property.
     */
    public void setCargoTTY(final String pCargoTTY) {
        this.cargoTTY = pCargoTTY;
    }

    /**
     * Sets the <code>customsInfo</code> property.
     * <p>
     * 
     * @param pCustomsInfo
     *            the current value of the <code>customsInfo</code> property.
     */
    public void setCustomsInfo(final String pCustomsInfo) {
        this.customsInfo = pCustomsInfo;
    }

    /**
     * Sets the <code>innerCityFax</code> property.
     * <p>
     * 
     * @param pInnerCityFax
     *            the current value of the <code>innerCityFax</code> property.
     */
    public void setInnerCityFax(final String pInnerCityFax) {
        this.innerCityFax = pInnerCityFax;
    }

    /**
     * Sets the <code>innerCityPhone</code> property.
     * <p>
     * 
     * @param pInnerCityPhone
     *            the current value of the <code>innerCityPhone</code> property.
     */
    public void setInnerCityPhone(final String pInnerCityPhone) {
        this.innerCityPhone = pInnerCityPhone;
    }

    /**
     * Sets the <code>label</code> property.
     * <p>
     * 
     * @param pLabel
     *            the current value of the <code>label</code> property.
     */
    public void setLabel(final String pLabel) {
        this.label = pLabel;
    }

    /**
     * Sets the <code>stationOId</code> property.
     * <p>
     * 
     * @param pStationOId
     *            the current value of the <code>stationOId</code> property.
     */
    public void setLabelOId(final Long pLabelOId) {
        this.labelOId = pLabelOId;
    }

    /**
     * Sets the <code>labelOrder</code> property.
     * <p>
     * 
     * @param pLabelOrder
     *            the current value of the <code>labelOrder</code> property.
     */
    public void setLabelOrder(final int pLabelOrder) {
        this.labelOrder = pLabelOrder;
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
     * Sets the <code>outsideFax</code> property.
     * <p>
     * 
     * @param pOutsideFax
     *            the current value of the <code>outsideFax</code> property.
     */
    public void setOutsideFax(final String pOutsideFax) {
        this.outsideFax = pOutsideFax;
    }

    /**
     * Sets the <code>outsidePhone</code> property.
     * <p>
     * 
     * @param pOutsidePhone
     *            the current value of the <code>outsidePhone</code> property.
     */
    public void setOutsidePhone(final String pOutsidePhone) {
        this.outsidePhone = pOutsidePhone;
    }

}
