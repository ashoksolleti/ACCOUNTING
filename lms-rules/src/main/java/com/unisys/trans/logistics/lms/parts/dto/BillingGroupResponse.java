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
 * <li>billingGroups
 * </ul>
 * </code>
 */
public class BillingGroupResponse extends AbstractResponse {
	/**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2319850661329515338L;

    /**
     * Attribute to hold <code>participantDetail</code> property.
     */
    private ParticipantDetailDto participantDetail;

    /**
     * Attribute to hold <code>billingGroups</code> property.
     */
    private List<BillingGroupDto> billingGroups;

    /**
     * <code>Default constructor.</code>
     */
    public BillingGroupResponse() {

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
     * Gets the value of the <code>billingGroups</code> property.
     * <p>
     * Holds a list of <code>{@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto}</code>
     * objects.
     * <p>
     * 
     * @return the current value of <code>billingGroups</code> property.
     */
    public List<BillingGroupDto> getParticipantGroups() {

        return this.billingGroups;
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
     * Sets the value of <code>billingGroups</code> property.
     * <p>
     * Holds a list of <code>{@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto}</code>
     * objects.
     * <p>
     * 
     * @param pParticipantGroups the new value of <code>billingGroups</code> property.
     */
    public void setParticipantGroups(final List<BillingGroupDto> pParticipantGroups) {

        this.billingGroups = pParticipantGroups;
    }
}
