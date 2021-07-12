/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>StationQuestionDto</code> contain details of StationQuestionDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>stationAnswerDtos
 * <li>questionDto
 * </code>
 * </ul>
 */
public class StationQuestionDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2308242528702553856L;

    /**
     * Attribute to hold <code>oId</code> property. Unique identifier for
     * station
     */
    private Long oId;

    /**
     * Attribute to holds the list of <code>questionDto</code> property.
     */
    private StationInfoSectionLabelDto questionDto;

    private StationHandlingDetailDto stationHandlingDetailDto;

    /**
     * Attribute to holds the list of <code>stationAnswerDtos</code> property.
     */
    private List<StationHandlingDetailDto> stationAnswerDtos;

    /**
     * default.
     */
    public StationQuestionDto() {
    }

    /**
     * default StationQuestionDto.
     * 
     * @param pOId
     *            It holds the value of OId.
     * @param pStationAnswerDtos.
     *            It holds the value of stationAnswerDtos.
     * @param pQuestionDto
     *            It holds the value questionDto.
     * 
     */
    public StationQuestionDto(Long pOId,
                List<StationHandlingDetailDto> pStationAnswerDtos,
                StationInfoSectionLabelDto pQuestionDto) {
        super();
        this.oId = pOId;
        this.stationAnswerDtos = pStationAnswerDtos;
        this.questionDto = pQuestionDto;
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
     * Gets the <code>questionDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>questionDto</code> property.
     */
    public StationInfoSectionLabelDto getQuestionDto() {
        return this.questionDto;
    }

    /**
     * Gets the <code>stationAnswerDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationAnswerDtos</code> property.
     */
    public List<StationHandlingDetailDto> getStationAnswerDtos() {
        return this.stationAnswerDtos;
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
     * Sets the <code>questionDto</code> property.
     * <p>
     * 
     * @param pQuestionDto
     *            the current value of the <code>questionDto</code> property.
     */
    public void setQuestionDto(final StationInfoSectionLabelDto pQuestionDto) {
        this.questionDto = pQuestionDto;
    }

    /**
     * Sets the <code>stationAnswerDtos</code> property.
     * <p>
     * 
     * @param pStationAnswerDtos
     *            the current value of the <code>stationAnswerDtos</code> property.
     */
    public void setStationAnswerDtos(final List<StationHandlingDetailDto> pStationAnswerDtos) {
        this.stationAnswerDtos = pStationAnswerDtos;
    }

    public StationHandlingDetailDto getStationHandlingDetailDto() {
        /*if (this.stationHandlingDetailDto == null) {
            stationHandlingDetailDto = new StationHandlingDetailDto();
        }*/
        return this.stationHandlingDetailDto;
    }

    public void setStationHandlingDetailDto(final StationHandlingDetailDto pStationHandlingDetailDto) {
        this.stationHandlingDetailDto = pStationHandlingDetailDto;
    }

    public boolean getAnswerEmpty(){
        return this.stationAnswerDtos == null || this.stationAnswerDtos.isEmpty();
    }
}
