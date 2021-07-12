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
 * <code>ParticipantRemarksDeleteRequest</code> is used to delete ParticipantRemarks.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <li><code>participantRemarksDto</code>
 * </ul>
 */

public class ParticipantRemarksDeleteRequest extends AbstractRequest {

    /**
     * Default serial version id.
     */

    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return oId the current value of the <code>oId</code> property.
     */

    public Long getOId() {
        return oId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
