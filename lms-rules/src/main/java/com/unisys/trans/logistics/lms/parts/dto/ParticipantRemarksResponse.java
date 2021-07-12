//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.parts.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>ParticipantRemarksResponse</code> contains the response of the maintenance request received by
 * <code>ParticipantRemarksService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>ParticipantRemarksDtos
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.arc.dto.ParticipantRemarksDto
 */

public class ParticipantRemarksResponse extends AbstractResponse {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold list of <code>ParticipantRemarksDto</code> object.
     */

    private List<ParticipantRemarksDto> participantRemarks;

    /**
     * <code>Default Constructor.</code>
     */

    public ParticipantRemarksResponse() {

    }

    /**
     * Adds the <code>ParticipantRemarksDto</code> to the list of <code>ParticipantRemarksDto</code>.
     * <p>
     * 
     * @param pParticipantRemarks the new value of <code>pParticipantRemarksDtos</code> property.
     */

    public void addParticipantRemarks(final ParticipantRemarksDto pParticipantRemarks) {
        this.getParticipantRemarks().add(pParticipantRemarks);
    }

    /**
     * Gets the list of <code>ParticipantRemarksDto</code> property.
     * <p>
     * 
     * @return the current value of list of <code>ParticipantRemarksDto</code> property.
     */

    public List<ParticipantRemarksDto> getParticipantRemarks() {
        if (null == this.participantRemarks) {
            this.participantRemarks = new ArrayList<ParticipantRemarksDto>();
        }
        return this.participantRemarks;
    }

    /**
     * Sets the <code>ParticipantRemarksDto</code> property.
     * <p>
     * 
     * @param pParticipantRemarksDto the new value of list of <code>ParticipantRemarksDto</code> property.
     */

    public void setParticipantRemarks(final List<ParticipantRemarksDto> pParticipantRemarksDto) {
        this.participantRemarks = pParticipantRemarksDto;
    }

}