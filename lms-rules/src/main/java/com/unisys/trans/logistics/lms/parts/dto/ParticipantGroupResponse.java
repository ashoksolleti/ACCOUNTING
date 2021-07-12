/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.List;

/**
 * <code>ParticipantGroupResponse</code> contains details of participant group response.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>participantDetail
 * <li>participantGroups
 * </ul>
 * </code>
 */
public class ParticipantGroupResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2319850661329515338L;

    /**
     * Attribute to hold <code>participantDetail</code> property.
     */
    private ParticipantDetailDto participantDetail;

    /**
     * Attribute to hold <code>participantGroups</code> property.
     */
    private List<ParticipantGroupDto> participantGroups;

    /**
     * <code>Default constructor.</code>
     */
    public ParticipantGroupResponse() {

    }

    /**
     * Gets the <code>ParticipantDetailDto</code> property.
     * <p>
     * 
     * @return the current value of <code>participantDetail</code> property.
     */
    public ParticipantDetailDto getParticipantDetail() {

        return this.participantDetail;
    }

    /**
     * Gets the value of the <code>participantGroups</code> property.
     * <p>
     * Holds a list of <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantGroupDto}</code>
     * objects.
     * <p>
     * 
     * @return the current value of <code>participantGroups</code> property.
     */
    public List<ParticipantGroupDto> getParticipantGroups() {

        return this.participantGroups;
    }

    /**
     * Sets the value of <code>participantDetail</code> property.
     * <p>
     * 
     * @param pParticipantDetail the new value of <code>participantDetail</code> property.
     */
    public void setParticipantDetail(final ParticipantDetailDto pParticipantDetail) {

        this.participantDetail = pParticipantDetail;
    }

    /**
     * Sets the value of <code>participantGroups</code> property.
     * <p>
     * Holds a list of <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantGroupDto}</code>
     * objects.
     * <p>
     * 
     * @param pParticipantGroups the new value of <code>participantGroups</code> property.
     */
    public void setParticipantGroups(final List<ParticipantGroupDto> pParticipantGroups) {

        this.participantGroups = pParticipantGroups;
    }
}
