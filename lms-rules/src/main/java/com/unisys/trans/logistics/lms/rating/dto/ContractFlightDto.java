/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.ValidityTimeDto;

/**
 * <code>ContractFlightDto</code> contains contract flight details.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>flightSpecific
 * <li>allDays
 * <li>validityTimes
 * <li>flight
 * <li>allFlights
 * <li>pasengerFlight
 * <li>frieghterFlight
 * <li>combinationFlight
 * <li>oId
 * </ul>
 * </code>
 */
public class ContractFlightDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1089682636821867508L;

    /**
     * Attribute to hold <code>allDays</code> property.
     */
    private boolean allDays;

    /**
     * Attribute to hold <code>allFlights</code> property.
     */
    private boolean allFlights;

    /**
     * Attribute to hold <code>combinationFlight</code> property.
     */
    private boolean combinationFlight;

    /**
     * Attribute to hold <code>flight</code> property.
     */
    private BaseFlightDto flight;

    /**
     * Attribute to hold <code>flightSpecific</code> property.
     */
    private boolean flightSpecific;

    /**
     * Attribute to hold <code>frieghterFlight</code> property.
     */
    private boolean frieghterFlight;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>pasengerFlight</code> property.
     */
    private boolean passengerFlight;

    /**
     * Attribute to hold <code>validityTimes</code> property.
     */
    private List<ValidityTimeDto> validityTimes;

    /**
     * Gets the <code>AllDays</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllDays</code> property.
     */

    public boolean getAllDays() {
        return this.allDays;
    }

    /**
     * Gets the <code>AllFlights</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllFlights</code> property.
     */

    public boolean getAllFlights() {
        return this.allFlights;
    }

    /**
     * Gets the <code>CombinationFlight</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>CombinationFlight</code> property.
     */
    public boolean getCombinationFlight() {
        return this.combinationFlight;
    }

    /**
     * Gets the <code>BaseFlightDto </code> data transfer object.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto
     *         BaseFlightDto}</code><br>
     *         the current value of <code>Flight</code> data transfer object.<br>
     */
    public BaseFlightDto getFlight() {
        if (this.flight == null) {
            this.flight = new BaseFlightDto();
        }
        return this.flight;
    }

    /**
     * Gets the <code>FlightSpecific</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>FlightSpecific</code> property.
     */
    public boolean getFlightSpecific() {
        return this.flightSpecific;
    }

    /**
     * Gets the <code>FrieghterFlight</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>FrieghterFlight</code> property.
     */
    public boolean getFrieghterFlight() {
        return this.frieghterFlight;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>passengerFlight</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>passengerFlight</code> property.
     */
    public boolean getPassengerFlight() {
        return this.passengerFlight;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.rating.dto.ValidityTimeDto
     * ValidityTimeDto} containing <code>ValidityTimes</code> details.
     * <p>
     * 
     * @return the current value of <code>ValidityTimes</code> details.
     */

    public List<ValidityTimeDto> getValidityTimes() {
        return this.validityTimes;
    }

    /**
     * Sets the <code>AllDays</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllDays
     *            the current value of the <code>AllDays</code> property.
     */
    public void setAllDays(final boolean pAllDays) {
        this.allDays = pAllDays;
    }

    /**
     * Sets the <code>AllFlights</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllFlights
     *            the current value of the <code>AllFlights</code> property.
     */
    public void setAllFlights(final boolean pAllFlights) {
        this.allFlights = pAllFlights;
    }

    /**
     * Sets the <code>CombinationFlight</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pCombinationFlight
     *            the current value of the <code>CombinationFlight</code> property.
     */
    public void setCombinationFlight(final boolean pCombinationFlight) {
        this.combinationFlight = pCombinationFlight;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto
     * BaseFlightDto} containing <code>Flight</code> details.
     * <p>
     * 
     * @param pFlight
     *            holds the new value of <code>BaseFlightDto</code> type
     *            details.<br>
     */
    public void setFlight(final BaseFlightDto pFlight) {
        this.flight = pFlight;
    }

    /**
     * Sets the <code>FlightSpecific</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pFlightSpecific
     *            the current value of the <code>FlightSpecific</code> property.
     */

    public void setFlightSpecific(final boolean pFlightSpecific) {
        this.flightSpecific = pFlightSpecific;
    }

    /**
     * Sets the <code>FrieghterFlight</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pFrieghterFlight
     *            the current value of the <code>FrieghterFlight</code> property.
     */
    public void setFrieghterFlight(final boolean pFrieghterFlight) {
        this.frieghterFlight = pFrieghterFlight;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>PasengerFlight</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pPassengerFlight
     *            the current value of the <code>PasengerFlight</code> property.
     */
    public void setPassengerFlight(final boolean pPassengerFlight) {
        this.passengerFlight = pPassengerFlight;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.ValidityTimeDto
     * ValidityTimeDto} containing <code>ValidityTimes</code> details.
     * <p>
     * 
     * @param pValidityTimes
     *            holds the new value of <code>ValidityTimes</code> type
     *            details.<br>
     */
    public void setValidityTimes(final List<ValidityTimeDto> pValidityTimes) {
        this.validityTimes = pValidityTimes;
    }
}
