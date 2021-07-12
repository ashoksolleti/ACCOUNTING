/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ParticipantGroupPersistRequest</code> holds attributes to persist participant group information.
 * <p>
 * This request is used for creating a participant group information as well as updating the participant group
 * information.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>participantGroup</code>
 * </ul>
 */
public class BillingSchedulesPersistRequest extends AbstractRequest {
	/**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1153605016888086827L;

    /**
     * Attribute to hold <code>participantGroup</code> property.
     */
    private BillingSchedulesDto billingGroup;

    /**
     * <code>Default constructor.</code>
     */
    public BillingSchedulesPersistRequest() {

    }

    /**
     * Gets the value of the <code>participantGroup</code> property.
     * <p>
     * 
     * @return the current value of <code>participantGroup</code> property.
     */
    public BillingSchedulesDto getBillingSchedulesDto() {

        return this.billingGroup;
    }

    /**
     * Sets the value of <code>participantGroup</code> property.
     * <p>
     * 
     * @param pParticipantGroup the new value of <code>participantGroup</code> property.
     */
    public void setBillingSchedulesDto(final BillingSchedulesDto pBillingGroup) {

        this.billingGroup = pBillingGroup;
    }
}
