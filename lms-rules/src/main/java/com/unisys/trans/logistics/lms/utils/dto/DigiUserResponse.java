/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>DimensionCalculationResponse</code> holds information related to shipment dimension.
 * <p>
 * It contains the following attribute:<br>
 * <li><code>shipmentDimension</code>
 */
public class DigiUserResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6132508260174191940L;

    /**
     * Attribute to hold <code>digiUserDto</code> property.
     */
    private DigiUserDto digiUserDto;

    /**
     * Attribute to hold <code>digiUserDtos</code> property.
     */
    private List<DigiUserDto> digiUserDtos;

    public DigiUserDto getDigiUserDto() {
        return this.digiUserDto;
    }

    public void setDigiUserDto(DigiUserDto pDigiUserDto) {
        this.digiUserDto = pDigiUserDto;
    }

    public List<DigiUserDto> getDigiUserDtos() {
        return this.digiUserDtos;
    }

    public void setDigiUserDtos(List<DigiUserDto> pDigiUserDtos) {
        this.digiUserDtos = pDigiUserDtos;
    }

    /**
     * <code>Default constructor</code>.
     */
    public DigiUserResponse() {
    }
}
