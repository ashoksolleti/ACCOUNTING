/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.io.Serializable;

/**
 * <code>ParticipantAliasDto</code> contains specific data applicable to participant aliases.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>aliasName
 * <li>oId
 * <li>participantOId
 * </ul>
 * </code>
 */
public class ParticipantAliasDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 9036438089727354253L;

    /**
     * Attribute to hold <code>aliasName</code> property. There can be up to three alias names for a
     * participant.
     */
    private String aliasName;

    /**
     * Attribute to hold <code>oId</code> property. Unique Key reference for <code>ParticipantsAlias</code>.
     */
    private Long oId;

    /**
     * Attribute to hold <code>participantOId</code> property.
     */
    private Long participantOId;

    /**
     * <code>Default constructor.</code>
     */
    public ParticipantAliasDto() {

    }

    /**
     * Gets the <code>aliasName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-34 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * Unisys
     * <p>
     * 
     * @return the current value of <code>aliasName</code> of the participant.<br>
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>participantOId</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantOId</code> property.<br>
     */
    public Long getParticipantOId() {
        return this.participantOId;
    }

    /**
     * Sets the <code>aliasName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-34 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <b>Example: </b><br>
     * Also Unisys
     * <p>
     * 
     * @param pAliasName the new value of <code>aliasName</code> of the participant.<br>
     */
    public void setAliasName(final String pAliasName) {
        this.aliasName = pAliasName;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pId the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pId) {
        this.oId = pId;
    }

    /**
     * Sets the <code>participantOId</code> property.
     * <p>
     * 
     * @param pParticipantOId the new value of <code>participantOId</code> property.<br>
     */
    public void setParticipantOId(final Long pParticipantOId) {
        this.participantOId = pParticipantOId;
    }

}
