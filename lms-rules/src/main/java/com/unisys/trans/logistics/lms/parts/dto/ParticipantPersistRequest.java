/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ParticipantPersistRequest</code> is used to create and update participant details information along
 * with. <code>
 * <ul>
 * <li>FreightParticipant
 * <li>ULDParticipant
 * <li>FreightParticipant
 * <li>ULDParticipant
 * </ul>
 * </code>
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>participant</code></li>
 * </ul>
 */
public class ParticipantPersistRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 21818524079636356L;

    /**
     * Attribute to hold <code>participant</code> property.
     */
    private ParticipantDto participant;
    /**
     * Attribute to hold <code>OnlineSyncIndicator</code> property.
     */
    private boolean OnlineSyncIndicator ;

	/**
     * <code>Default constructor</code>.
     * <p>
     */
    public ParticipantPersistRequest() {

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
     * Sets the <code>participant</code> data transfer object.
     * <p>
     * 
     * @param pParticipantDto the new value of participant data transfer object<br>
     */
    public void setParticipant(final ParticipantDto pParticipantDto) {
        this.participant = pParticipantDto;
    }

    public boolean isOnlineSyncIndicator() {
		return OnlineSyncIndicator;
	}

	public void setOnlineSyncIndicator(boolean onlineSyncIndicator) {
		OnlineSyncIndicator = onlineSyncIndicator;
	}


}
