/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>ParticipantGroupResponse</code> contains details of participant group response.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>theParticipantList
 * </ul>
 * </code>
 */
public class ParticipantReportResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1158301986258839947L;

    /**
     * Attribute to hold <code>theParticipantList</code> property.
     */
    private List<ParticipantDto> theParticipantList;

    /**
     * Attribute to hold <code>totalParticipants</code> property.
     */
    private long totalParticipants;

    /**
     * <code>Default constructor.</code>
     */
    public ParticipantReportResponse() {

    }

    /**
     * Gets the <code>theParticipantList</code> property.
     * <p>
     * 
     * @return the current value of <code>theParticipantList</code> property.
     */
    public List<ParticipantDto> getTheParticipantList() {
        if (this.theParticipantList == null) {
            this.theParticipantList = new ArrayList<ParticipantDto>();
        }
        return this.theParticipantList;
    }

    /**
     * Gets the <code>totalParticipants</code> property.
     * 
     * @return the totalParticipants
     */
    public long getTotalParticipants() {
        return this.totalParticipants;
    }

    /**
     * Sets the <code>theParticipantList</code> property.
     * <p>
     * 
     * @param pTheParticipantList
     *            the new value of <code>theParticipantList</code> property.
     */
    public void setTheParticipantList(final List<ParticipantDto> pTheParticipantList) {
        this.theParticipantList = pTheParticipantList;
    }

    /**
     * Sets the <code>totalParticipants</code> property.
     * 
     * @param pTotalParticipants
     *            holds the totalParticipants to set.
     */
    public void setTotalParticipants(final long pTotalParticipants) {
        this.totalParticipants = pTotalParticipants;
    }

}
