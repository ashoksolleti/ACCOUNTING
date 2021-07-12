/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.rating.dto.constants.ContractStatusType;

/**
 * <code>SpotRatePersistRequest</code> is used to persist <code>SpotRate</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>accountNumber
 * <li>name
 * <li>participantOId
 * <li>station
 * <li>statusFilters
 * <li>spotRateOIds
 * </ul>
 */

public class SpotRateListRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5863034512221652591L;

    /**
     * Attribute to hold the <code>accountNumber</code> property.
     */
    private String accountNumber;

    /**
     * Attribute to hold the <code>name</code> property.
     */
    private String name;

    /**
     * Attribute to hold the <code>participantOId</code> property.
     */
    private Long participantOId;

    /**
     * Attribute to hold the <code>station</code> property.
     */
    private String station;

    /**
     * Attribute to hold the <code>statusFilters</code> property.
     */
    private List<ContractStatusType> statusFilters;

    /**
     * Attribute to hold the <code>spotRateOIds</code> property.
     */
    private List<Long> spotRateOIds;

    /**
     * Gets the <code>accountNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>accountNumber</code> property.
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * 
     * @return the current value of the <code>name</code> property.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the <code>participantOId</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantOId</code> property.
     */
    public Long getParticipantOId() {
        return this.participantOId;
    }

    /**
     * Gets the <code>station</code> property.
     * <p>
     * 
     * @return the current value of the <code>station</code> property.
     */
    public String getStation() {
        return this.station;
    }

    /**
     * Gets the <code>statusFilters</code> property.
     * <p>
     * 
     * @return the current value of the <code>statusFilters</code> property.
     */

    public List<ContractStatusType> getStatusFilters() {
        return this.statusFilters;
    }

    /**
     * Gets the <code>spotRateOIds</code> property.
     * <p>
     * 
     * @return the current value of the <code>spotRateOIds</code> property.
     */

    public List<Long> getSpotRateOIds() {
        return this.spotRateOIds;
    }

    /**
     * Sets the <code>accountNumber</code> data transfer object.
     * <p>
     * 
     * @param pAccountNumber
     *            holds the new value of <code>accountNumber</code>.<br>
     */
    public void setAccountNumber(final String pAccountNumber) {
        this.accountNumber = pAccountNumber;
    }

    /**
     * Sets the <code>name</code> data transfer object.
     * <p>
     * 
     * @param pName
     *            holds the new value of <code>name</code>.<br>
     */
    public void setName(final String pName) {
        this.name = pName;
    }

    /**
     * Sets the <code>participantOId</code> data transfer object.
     * <p>
     * 
     * @param pParticipantOId
     *            holds the new value of <code>participantOId</code>.<br>
     */
    public void setParticipantOId(final Long pParticipantOId) {
        this.participantOId = pParticipantOId;
    }

    /**
     * Sets the <code>station</code> data transfer object.
     * <p>
     * 
     * @param pStation
     *            holds the new value of <code>station</code>.
     */
    public void setStation(final String pStation) {
        this.station = pStation;
    }

    /**
     * Sets the <code>status</code> data transfer object.
     * <p>
     * 
     * @param pStatusFilters
     *            holds the new value of <code>status</code>.
     */
    public void setStatusFilters(final List<ContractStatusType> pStatusFilters) {
        this.statusFilters = pStatusFilters;
    }
    
    /**
     * Sets the <code>spotRateOIds</code> data transfer object.
     * <p>
     * 
     * @param pSpotRateOIds
     *            holds the new value of <code>spotRateOIds</code>.<br>
     */
    public void setSpotRateOIds(final List<Long> pSpotRateOIds) {
        this.spotRateOIds = pSpotRateOIds;
    }

}
