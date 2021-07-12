/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.utils.constants.SectionType;

/**
 * <code>StationInfoSectionLabelDto</code> contain details of StationInfoSectionLabelDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>label
 * <li>oId
 * <li>order
 * <li>sectionName
 * <li>stationInfoSectionLabelDtos
 * </code>
 * </ul>
 */

public class StationInfoSectionLabelDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3182072338953169205L;

    /**
     * Attribute to hold <code>label</code> property.
     */
    private String label;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>order</code> property.
     */
    private Integer order;

    /**
     * Attribute to hold <code>sectionName</code> property.
     */
    private SectionType sectionName;

    /**
     * Attribute to hold the list of <code>stationInfoSectionLabelDtos</code> property.
     */
    private List<StationInfoSectionLabelDto> stationInfoSectionLabelDtos;

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
     * Gets the value of <code>OID</code> property.
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
     * Gets the <code>order</code> property.
     * <p>
     * 
     * @return the current value of the <code>order</code> property.
     */
    public Integer getOrder() {
        return this.order;
    }

    /**
     * Gets the <code>sectionName</code> property.
     * <p>
     * 
     * @return the current value of the <code>sectionName</code> property.
     */
    public SectionType getSectionName() {
        return this.sectionName;
    }

    /**
     * Gets the <code>stationInfoSectionLabelDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationInfoSectionLabelDtos</code> property.
     */
    public List<StationInfoSectionLabelDto> getStationInfoSectionLabelDtos() {
        return this.stationInfoSectionLabelDtos;
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
     * Sets the value of the <code>OID</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @param pOId the new value of the <code>OID</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>order</code> property.
     * <p>
     * 
     * @param pOrder
     *            the current value of the <code>order</code> property.
     */
    public void setOrder(final Integer pOrder) {
        this.order = pOrder;
    }

    /**
     * Sets the <code>sectionName</code> property.
     * <p>
     * 
     * @param pSectionName
     *            the current value of the <code>sectionName</code> property.
     */
    public void setSectionName(final SectionType pSectionName) {
        this.sectionName = pSectionName;
    }

    /**
     * Sets the <code>stationInfoSectionLabelDtos</code> property.
     * <p>
     * 
     * @param pStationInfoSectionLabelDtos
     *            the current value of the <code>stationInfoSectionLabelDtos</code> property.
     */
    public void setStationInfoSectionLabelDtos(
                final List<StationInfoSectionLabelDto> pStationInfoSectionLabelDtos) {
        this.stationInfoSectionLabelDtos = pStationInfoSectionLabelDtos;
    }

    @Override
    public String toString() {
        return "StationInfoSectionLabelDto [oId=" + oId + ", order=" + order
                    + ", label=" + label + ", stationInfoSectionLabelDtos="
                    + stationInfoSectionLabelDtos + ", sectionName=" + sectionName
                    + "]";
    }

}
