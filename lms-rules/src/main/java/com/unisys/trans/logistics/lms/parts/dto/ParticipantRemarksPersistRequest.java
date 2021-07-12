//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ParticipantRemarksPersistRequest</code> is used to create and update ParticipantRemarks.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <li><code>participantRemarksDto</code>
 * </ul>
 */

public class ParticipantRemarksPersistRequest extends AbstractRequest {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>ParticipantRemarksDto</code> object.
     */

    private ParticipantRemarksDto participantRemarks;

    /**
     * <code>Default Constructor.</code>
     */

    public ParticipantRemarksPersistRequest() {
    }

    /**
     * Gets the <code>participantRemarks</code> property.
     * <p>
     * 
     * @return the current value of <code>participantRemarks</code> property.
     */

    public ParticipantRemarksDto getParticipantRemarks() {
        return this.participantRemarks;
    }

    /**
     * Sets the <code>participantRemarks</code> property.
     * <p>
     * 
     * @param pParticipantRemarks the new value of the <code>participantRemarks</code> property.
     */

    public void setParticipantRemarks(final ParticipantRemarksDto pParticipantRemarks) {
        this.participantRemarks = pParticipantRemarks;
    }

}
