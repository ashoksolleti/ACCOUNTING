/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>TeletypeAddressProfileControlResponse </code> represents the response object of the maintenance
 * request received by <code>TeletypeAddressProfile</code>.
 * <p>
 * <code>TeletypeAddressProfileControlResponse </code> contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>participants
 * <li>teletypeAddressProfiles
 * </code>
 * </ul>
 */
public class TeletypeAddressProfileControlResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3324841315381552721L;

    /**
     * Attribute to hold list of <code>participants</code> property.
     * <p>
     * The <code>TTYAddressProfileParticipantDto</code> includes TTYAddressProfileParticipant information.
     */
    private List<TTYAddressProfileParticipantDto> participants;

    /**
     * Attribute to hold list of <code>teletypeAddressProfiles</code> property.
     * <p>
     * The <code>TeletypeAddressProfileDto</code> includes TeletypeAddressProfile information.
     */
    private List<TeletypeAddressProfileDto> teletypeAddressProfiles;

    /**
     * <code>Default constructor.</code>
     */
    public TeletypeAddressProfileControlResponse() {
    }

    /**
     * Gets the <code>participants</code> property.
     * <p>
     * 
     * @return the current value of <code>participants</code> property.
     */
    public final List<TTYAddressProfileParticipantDto> getParticipants() {
        if (this.participants == null) {
            this.participants = new ArrayList<TTYAddressProfileParticipantDto>();
        }
        return this.participants;
    }

    /**
     * Gets the <code>teletypeAddressProfiles</code> property.
     * <p>
     * 
     * @return the current value of <code>teletypeAddressProfiles</code> property.
     */
    public final List<TeletypeAddressProfileDto> getTeletypeAddressProfiles() {
        if (this.teletypeAddressProfiles == null) {
            this.teletypeAddressProfiles = new ArrayList<TeletypeAddressProfileDto>();
        }
        return this.teletypeAddressProfiles;
    }

    /**
     * Sets the <code>participants</code> property.<br>
     * <p>
     * 
     * @param pParticipants the new value of <code>participants</code> property.<br>
     */
    public final void setParticipants(final List<TTYAddressProfileParticipantDto> pParticipants) {
        this.participants = pParticipants;
    }

    /**
     * Sets the <code>teletypeAddressProfiles</code> property.<br>
     * <p>
     * 
     * @param pTeletypeAddressProfiles the new value of <code>teletypeAddressProfiles</code> property.<br>
     */
    public final void setTeletypeAddressProfiles(
                final List<TeletypeAddressProfileDto> pTeletypeAddressProfiles) {
        this.teletypeAddressProfiles = pTeletypeAddressProfiles;
    }
}