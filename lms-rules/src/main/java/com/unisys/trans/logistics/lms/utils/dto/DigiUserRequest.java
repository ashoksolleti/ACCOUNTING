/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>DigiUserRequest</code> holds information for Digi Users.
 * 
 * This contains the following attribute:<br>
 * <ul>
 * <li><code>shipmentDimension</code>
 * </ul>
 */
public class DigiUserRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4227661806309904140L;

    /**
     * Attribute to hold <code>digiUserDto</code> property.
     */
    private DigiUserDto digiUserDto;

    /**
     * <code>Default constructor</code>.
     */
    public DigiUserRequest() {

    }

    public DigiUserDto getDigiUserDto() {
        return this.digiUserDto;
    }

    public void setDigiUserDto(DigiUserDto pDigiUserDto) {
        this.digiUserDto = pDigiUserDto;
    }
}
