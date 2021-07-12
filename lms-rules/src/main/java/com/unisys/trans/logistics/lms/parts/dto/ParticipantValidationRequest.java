/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;

import java.util.List;

/**
 * <code>ParticipantValidationRequest</code> contains validation request for participant details.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>participantDetails</code>
 * </ul>
 */
public class ParticipantValidationRequest extends ValidationRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3106645639120007719L;

    /**
     * Attribute to hold <code>participantDetails</code> property.
     */
    private List<ParticipantDetailDto> participantDetails;

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     * ParticipantDetailDto} containing <code>participantDetails</code> details.
     * <p>
     * 
     * @return holds the current value of <code>ParticipantDetailDto</code> details.<br>
     */
    public List<ParticipantDetailDto> getParticipantDetails() {

        return this.participantDetails;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     * ParticipantDetailDto} containing <code>participantDetails</code> details.
     * <p>
     * 
     * @param pParticipantDetails holds the current value of <code>ParticipantDetailDto</code> type details.<br>
     */
    public void setParticipantDetails(final List<ParticipantDetailDto> pParticipantDetails) {

        this.participantDetails = pParticipantDetails;
    }
}