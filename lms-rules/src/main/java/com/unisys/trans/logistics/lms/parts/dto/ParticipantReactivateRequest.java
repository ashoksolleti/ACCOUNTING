/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ParticipantReactivateRequest</code> is used to reactivate the participant. ie, unmark a participant
 * who was deleted by setting the deleteIndicator value to false.<br>
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>oId
 * <li>version
 * <li>participant
 * </ul>
 * </code>
 */
public class ParticipantReactivateRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3035243731410716235L;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>participant</code> property.
     */
    private ParticipantDto participant;
    private boolean  OnlineSyncIndicator;

    /**
     * Attribute to hold the <code>version</code> property.
     */
    private long version;

    public boolean isOnlineSyncIndicator() {
		return OnlineSyncIndicator;
	}

	public void setOnlineSyncIndicator(boolean onlineSyncIndicator) {
		OnlineSyncIndicator = onlineSyncIndicator;
	}

	/**
     * <code>Default constructor</code>.
     * <p>
     */
    public ParticipantReactivateRequest() {

    }

    /**
     * Gets the value of the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the participant data transfer object.
     * <p>
     * 
     * @return the current value of participant data transfer object.<br>
     */
    public ParticipantDto getParticipant() {
        return this.participant;
    }

    /**
     * Gets the value of the <code>version</code> property.
     * <p>
     * 
     * @return the current value of <code>version</code> property.<br>
     */
    public long getVersion() {
        return this.version;
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the participant data transfer object.
     * <p>
     * 
     * @param pParticipantDto the new value of participant data transfer object<br>
     */
    public void setParticipant(final ParticipantDto pParticipantDto) {
        this.participant = pParticipantDto;
    }

    /**
     * Sets the value of the <code>version</code> property.
     * <p>
     * 
     * @param pVersion the new value of <code>version</code> property.<br>
     */
    public void setVersion(final long pVersion) {
        this.version = pVersion;
    }
}
