/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.ucs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import org.codehaus.jackson.annotate.JsonWriteNullProperties;

import com.unisys.trans.logistics.lms.framework.dto.ucs.ServiceType;
import com.unisys.trans.logistics.lms.framework.constants.FlightStatusType;
import com.unisys.trans.logistics.lms.framework.dto.BaseFlightLegDto;
import com.unisys.trans.logistics.lms.framework.dto.ucs.CargoClassificationType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>FlightInformationDto</code> contains specific data applicable to the Flight information.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>actualIntoGateDateTime</code></li>
 * <li><code>actualLandingDateTime</code></li>
 * <li><code>actualOutOfGateDateTime</code></li>
 * <li><code>actualTakeOffDateTime</code></li>
 * <li><code>aircraftVersion</code></li>
 * <li><code>aircraftEquipment </code></li>
 * <li><code>marketingFlightIndicator</code></li>
 * <li><code>origin</code></li>
 * <li><code>scheduleArrivalDateTime </code></li>
 * <li><code>scheduleDepartureDateTime </code></li>
 * <li><code>aircraftRegistration</code></li>
 * <li><code>destination</code></li>
 * <li><code>estimatedArrivalDateTime</code></li>
 * <li><code>estimatedDepartureDateTime</code></li>
 * <li><code>departureStatus</code></li>
 * <li><code>arrivalStatus</code></li>
 * <li><code>supplementaryComment</code></li>
 * <li><code>serviceType</code></li>
 * </ul>
 */
//@JsonWriteNullProperties(false)
public class LegInformationDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8261465297441546272L;

    /**
     * Attribute to hold <code>actualIntoGateDateTime</code> property.
     */
    private Date actualIntoGateDateTime;

    /**
     * Attribute to hold <code>actualIntoGateTime</code> property.
     */
    private String actualIntoGateTime;

    /**
     * Attribute to hold <code>actualLandingDateTime</code> property.
     */
    private Date actualLandingDateTime;

    /**
     * Attribute to hold <code>actualLandingTime</code> property.
     */

    private String actualLandingTime;

    /**
     * Attribute to hold <code>actualOutOfGateDateTime</code> property.
     */
    private Date actualOutOfGateDateTime;

    /**
     * Attribute to hold <code>actualOutOfGateTime</code> property.
     */

    private String actualOutOfGateTime;

    /**
     * Attribute to hold <code>actualTakeOffDateTime</code> property.
     */
    private Date actualTakeOffDateTime;

    /**
     * Attribute to hold <code>actualTakeOffTime</code> property.
     */

    private String actualTakeOffTime;

    /**
     * Attribute to hold <code>aircraftConfiguration</code> property.
     */
    private int aircraftConfiguration;

    /**
     * Attribute to hold <code>aircraftEquipment</code> property.
     */
    private String aircraftEquipment;

    /**
     * Attribute to hold <code>aircraftRegistration</code> property.
     */
    private String aircraftRegistration;

    /**
     * Attribute to hold <code>aircraftVersion</code> property.
     */
    private String aircraftVersion;

    /**
     * Attribute to hold <code>arrivalStatus</code> property.
     */
    private FlightStatusType arrivalStatus;
    
    /**
     * Attribute to hold <code>arrivalGate</code> property.
     */
    private String arrivalGate;

    /**
     * Attribute to hold <code>BaseflightLeg</code> property.
     */
    private BaseFlightLegDto baseFlightLeg = new BaseFlightLegDto();
    
    /**
     * Attribute to hold <code>cargoClassificationType</code> property.
     */
    private CargoClassificationType cargoClassificationType;

    /**
     * Attribute to hold <code>delayDetailsDto</code> property.
     */
    private List<DelayDetailsDto> delayDetailsDtos;

    /**
     * Attribute to hold <code>departureStatus</code> property.
     */
    private FlightStatusType departureStatus;
    
    /**
     * Attribute to hold <code>departureGate</code> property.
     */
    private String departureGate;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private String destination;

    /**
     * Attribute to hold <code>estimatedArrivalDateTime</code> property.
     */
    private Date estimatedArrivalDateTime;

    /**
     * Attribute to hold <code>estimatedArrivalTime</code> property.
     */

    private String estimatedArrivalTime;

    /**
     * Attribute to hold <code>estimatedDepartureDateTime</code> property.
     */
    private Date estimatedDepartureDateTime;

    /**
     * Attribute to hold <code>estimatedDepartureTime</code> property.
     */

    private String estimatedDepartureTime;

    /**
     * Attribute to hold <code>actualOutOfGateTime</code> property.
     */

    private String flightNumber;

    /**
     * Attribute to hold <code>marketingFlightIndicator</code> property.
     */
    private boolean marketingFlightIndicator;

    /**
     * Attribute to hold <code>origin</code> property.
     */
    private String origin;

    /**
     * Attribute to hold <code>scheduledArrivalDateTime</code> property.
     */
    private Date scheduledArrivalDateTime;

    /**
     * Attribute to hold <code>scheduledArrivalTime</code> property.
     */

    private String scheduledArrivalTime;

    /**
     * Attribute to hold <code>scheduledDepartureDateTime</code> property.
     */
    private Date scheduledDepartureDateTime;

    /**
     * Attribute to hold <code>scheduledDepartureTime</code> property.
     */

    private String scheduledDepartureTime;

    /**
     * Attribute to hold <code>serviceType</code> property.
     */
    private ServiceType serviceType;

    /**
     * Attribute to hold <code>supplementaryComment</code> property.
     */
    private String supplementaryComment;

    /**
     * <code>constructor.</code>
     */
    
    //NZ046-start
    
    private boolean wideBodyIndicator;
    
    public boolean isWideBodyIndicator() {
		return wideBodyIndicator;
	}

	public void setWideBodyIndicator(boolean wideBodyIndicator) {
		this.wideBodyIndicator = wideBodyIndicator;
	}

    //NZ046-end
    
    
	public LegInformationDto() {

    }

    /**
     * Gets the value of the <code>actualIntoGateDateTime</code> property.
     * <p>
     * 
     * @return <code>actualIntoGateDateTime</code><br>
     *         Returns the <code>actualIntoGateDateTime</code> of the flight.<br>
     *         </p>
     */
    public Date getActualIntoGateDateTime() {

        return ContractUtility.getClonedDate(this.actualIntoGateDateTime);

    }

    /**
     * Gets the <code>actualIntoGateTime</code> property.
     * 
     * 
     * @return the current value of the <code>actualIntoGateTime</code> property.
     */
    public String getActualIntoGateTime() {
        return this.actualIntoGateTime;
    }

    /**
     * Gets the value of the <code>actualLandingDateTime</code> property.
     * <p>
     * 
     * @return <code>actualLandingDateTime</code><br>
     *         Returns the <code>actualLandingDateTime</code> of the flight.<br>
     *         </p>
     */
    public Date getActualLandingDateTime() {

        return ContractUtility.getClonedDate(this.actualLandingDateTime);

    }

    /**
     * Gets the <code>actualLandingTime</code> property.
     * 
     * 
     * @return the current value of the <code>actualLandingTime</code> property.
     */

    public String getActualLandingTime() {
        return this.actualLandingTime;
    }

    /**
     * Gets the value of the <code>actualOutOfGateDateTime</code> property.
     * <p>
     * 
     * @return <code>actualOutOfGateDateTime</code><br>
     *         Returns the <code>actualOutOfGateDateTime</code> of the flight.<br>
     *         </p>
     */
    public Date getActualOutOfGateDateTime() {

        return ContractUtility.getClonedDate(this.actualOutOfGateDateTime);

    }

    /**
     * Gets the <code>actualLandingTime</code> property.
     * 
     * 
     * @return the current value of the <code>actualLandingTime</code> property.
     */

    public String getActualOutOfGateTime() {
        return this.actualOutOfGateTime;
    }

    /**
     * Gets the value of the <code>actualTakeOffDateTime</code> property.
     * <p>
     * 
     * @return <code>actualTakeOffDateTime</code><br>
     *         Returns the <code>actualTakeOffDateTime</code> of the flight.<br>
     *         </p>
     */
    public Date getActualTakeOffDateTime() {

        return ContractUtility.getClonedDate(this.actualTakeOffDateTime);

    }

    /**
     * Gets the <code>actualTakeOffTime</code> property.
     * 
     * 
     * @return the current value of the <code>actualTakeOffTime</code> property.
     */

    public String getActualTakeOffTime() {
        return this.actualTakeOffTime;
    }

    /**
     * Gets the value of the <code>aircraftConfiguration</code> property.
     * <p>
     * <b>Format: </b><br>
     * 30 X <br>
     * <b>Example: </b><br>
     * A330-200
     * 
     * @return <code>int</code><br>
     *         Returns the <code>aircraftConfiguration</code> of the flight schedule leg.<br>
     *         </p>
     */
    public int getAircraftConfiguration() {
        return this.aircraftConfiguration;

    }

    /**
     * Gets the value of the <code>aircraftEquipment</code> property.
     * <p>
     * 
     * @return <code>aircraftEquipment</code><br>
     *         Returns the <code>aircraftEquipment</code> of the flight.<br>
     *         </p>
     */
    public String getAircraftEquipment() {

        return this.aircraftEquipment;

    }

    /**
     * Gets the value of the <code>aircraftRegistration</code> property.
     * <p>
     * 
     * @return <code>aircraftRegistration</code><br>
     *         Returns the <code>aircraftRegistration</code> of the flight.<br>
     *         </p>
     */
    public String getAircraftRegistration() {

        return this.aircraftRegistration;

    }

    /**
     * Gets the value of the <code>aircraftVersion</code> property.
     * <p>
     * 
     * @return <code>aircraftVersion</code><br>
     *         Returns the <code>aircraftVersion</code> of the flight.<br>
     *         </p>
     */
    public String getAircraftVersion() {

        return this.aircraftVersion;

    }

    /**
     * Gets the value of the <code>arrivalStatus</code> property.
     * <p>
     * 
     * @return <code>arrivalStatus</code><br>
     *         Returns the <code>arrivalStatus</code> of the flight.<br>
     *         </p>
     */
    public FlightStatusType getArrivalStatus() {

        return this.arrivalStatus;

    }

    /**
     * @return the baseFlightLeg
     */
    public BaseFlightLegDto getBaseFlightLeg() {
        return this.baseFlightLeg;
    }
    
    /**
     * Gets the value of the <code>cargoClassificationType</code> property.
     * <p>
     *
     * @return Returns the current value of <code>cargoClassificationType</code> property.
     */
    public CargoClassificationType getCargoClassificationType() {
		return this.cargoClassificationType;
	}

    /**
     * Gets the value of the <code>delayDetailsDto</code> property.
     * <p>
     * 
     * @return List of <code>{@link com.unisys.trans.logistics.lms.flights.dto.DelayDetailsDto
     *         DelayDetailsDto}</code><br>
     *         Returns the List of <code>delayDetailsDto</code>objects.<br>
     *         </p>
     */
    public List<DelayDetailsDto> getDelayDetailsDtos() {

        if (this.delayDetailsDtos == null) {

            this.delayDetailsDtos = new ArrayList<DelayDetailsDto>();

        }
        return this.delayDetailsDtos;
    }

    /**
     * Gets the value of the <code>departureStatus</code> property.
     * <p>
     * 
     * @return <code>departureStatus</code><br>
     *         Returns the <code>departureStatus</code> of the flight.<br>
     *         </p>
     */
    public FlightStatusType getDepartureStatus() {

        return this.departureStatus;

    }

    /**
     * Gets the value of the <code>destination</code> property.
     * <p>
     * 
     * @return <code>destination</code><br>
     *         Returns the <code>destination</code> of the flight.<br>
     *         </p>
     */
    public String getDestination() {

        return this.destination;

    }

    /**
     * Gets the value of the <code>estimatedArrivalDateTime</code> property.
     * <p>
     * 
     * @return <code>estimatedArrivalDateTime</code><br>
     *         Returns the <code>estimatedArrivalDateTime</code> of the flight.<br>
     *         </p>
     */
    public Date getEstimatedArrivalDateTime() {

        return ContractUtility.getClonedDate(this.estimatedArrivalDateTime);

    }

    /**
     * Gets the value of the <code>estimatedArrivalTime</code> property.
     * <p>
     * 
     * @return <code>estimatedArrivalTime</code><br>
     *         Returns the <code>estimatedArrivalTime</code> of the flight.<br>
     *         </p>
     */

    public String getEstimatedArrivalTime() {
        return this.estimatedArrivalTime;
    }

    /**
     * Gets the value of the <code>estimatedDepartureDateTime</code> property.
     * <p>
     * 
     * @return <code>estimatedDepartureDateTime</code><br>
     *         Returns the <code>estimatedDepartureDateTime</code> of the flight.<br>
     *         </p>
     */
    public Date getEstimatedDepartureDateTime() {

        return ContractUtility.getClonedDate(this.estimatedDepartureDateTime);

    }

    /**
     * Gets the value of the <code>estimatedDepartureTime</code> property.
     * <p>
     * 
     * @return <code>estimatedDepartureTime</code><br>
     *         Returns the <code>estimatedDepartureTime</code> of the flight.<br>
     *         </p>
     */
    public String getEstimatedDepartureTime() {
        return this.estimatedDepartureTime;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Gets the value of the <code>marketingFlightIndicator</code> property.
     * <p>
     * 
     * @return <code>marketingFlightIndicator</code><br>
     *         Returns the boolean value of <code>marketingFlightIndicator</code>.<br>
     *         return true for marketing leg otherwise false.
     *         </p>
     */
    public boolean getMarketingFlightIndicator() {
        return this.marketingFlightIndicator;
    }

    /**
     * Gets the value of the <code>origin</code> property.
     * <p>
     * 
     * @return <code>origin</code><br>
     *         Returns the <code>origin</code> of the flight.<br>
     *         </p>
     */
    public String getOrigin() {

        return this.origin;

    }

    /**
     * Gets the value of the <code>scheduledArrivalDateTime</code> property.
     * <p>
     * 
     * @return <code>scheduledArrivalDateTime</code><br>
     *         Returns the <code>scheduledArrivalDateTime</code> of the flight.<br>
     *         </p>
     */
    public Date getScheduledArrivalDateTime() {

        return ContractUtility.getClonedDate(this.scheduledArrivalDateTime);

    }

    /**
     * Gets the value of the <code>scheduledArrivalTime</code> property.
     * <p>
     * 
     * @return <code>scheduledArrivalTime</code><br>
     *         Returns the <code>scheduledArrivalTime</code> of the flight.<br>
     *         </p>
     */

    public String getScheduledArrivalTime() {
        return this.scheduledArrivalTime;
    }

    /**
     * Gets the value of the <code>scheduledDepartureDateTime</code> property.
     * <p>
     * 
     * @return <code>scheduledDepartureDateTime</code><br>
     *         Returns the <code>scheduledDepartureDateTime</code> of the flight.<br>
     *         </p>
     */
    public Date getScheduledDepartureDateTime() {

        return ContractUtility.getClonedDate(this.scheduledDepartureDateTime);

    }

    /**
     * Gets the value of the <code>scheduledDepartureTime</code> property.
     * <p>
     * 
     * @return <code>scheduledDepartureTime</code><br>
     *         Returns the <code>scheduledDepartureTime</code> of the flight.<br>
     *         </p>
     */

    public String getScheduledDepartureTime() {
        return this.scheduledDepartureTime;
    }

    /**
     * Gets the value of the <code>serviceType</code> property.
     * <p>
     * 
     * @return <code>serviceType</code><br>
     *         Returns the <code>serviceType</code> of the flight.<br>
     *         </p>
     */
    public ServiceType getServiceType() {

        return this.serviceType;

    }

    /**
     * Gets the value of the <code>supplementaryComment</code> property.
     * <p>
     * 
     * @return <code>supplementaryComment</code><br>
     *         Returns the <code>supplementaryComment</code> of the flight.<br>
     *         </p>
     */
    public String getSupplementaryComment() {

        return this.supplementaryComment;

    }

    /**
     * Sets the value of the <code>actualIntoGateDateTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphanumeric<br>
     * <b>Example: </b><br>
     * 23JUL08
     * 
     * @param pActualIntoGateDateTime
     *            <code>actualIntoGateDateTime</code><br>
     *            Holds the <code>actualIntoGateDateTime</code> of the flight.<br>
     *            </p>
     */
    public void setActualIntoGateDateTime(final Date pActualIntoGateDateTime) {

        this.actualIntoGateDateTime = ContractUtility.getClonedDate(pActualIntoGateDateTime);

    }

    /**
     * Sets the <code>actualIntoGateTime</code> property.
     * 
     * 
     * @param pActualIntoGateTime
     *            the new value of the <code>actualIntoGateTime</code> property.
     */

    public void setActualIntoGateTime(final String pActualIntoGateTime) {
        this.actualIntoGateTime = pActualIntoGateTime;
    }

    /**
     * Sets the <code>actualLandingDateTime</code> property.
     * 
     * 
     * @param pActualLandingDateTime
     *            the new value of the <code>actualLandingDateTime</code> property.
     */
    public void setActualLandingDateTime(final Date pActualLandingDateTime) {

        this.actualLandingDateTime = ContractUtility.getClonedDate(pActualLandingDateTime);

    }

    /**
     * Sets the <code>actualLandingTime</code> property.
     * 
     * 
     * @param pActualLandingTime
     *            the new value of the <code>actualLandingTime</code> property.
     */

    public void setActualLandingTime(final String pActualLandingTime) {
        this.actualLandingTime = pActualLandingTime;
    }

    /**
     * Sets the value of the <code>actualOutOfGateDateTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphanumeric<br>
     * <b>Example: </b><br>
     * 23JUL08
     * 
     * @param pActualOutOfGateDateTime
     *            <code>actualOutOfGateDateTime</code><br>
     *            Holds the <code>actualOutOfGateDateTime</code> of the flight.<br>
     *            </p>
     */
    public void setActualOutOfGateDateTime(final Date pActualOutOfGateDateTime) {

        this.actualOutOfGateDateTime = ContractUtility.getClonedDate(pActualOutOfGateDateTime);

    }

    /**
     * Sets the <code>actualOutOfGateTime</code> property.
     * 
     * 
     * @param pActualOutOfGateTime
     *            the new value of the <code>actualOutOfGateTime</code> property.
     */

    public void setActualOutOfGateTime(final String pActualOutOfGateTime) {
        this.actualOutOfGateTime = pActualOutOfGateTime;
    }

    /**
     * Sets the value of the <code>actualTakeOffDateTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphanumeric<br>
     * <b>Example: </b><br>
     * 23JUL08
     * 
     * @param pActualTakeOffDateTime
     *            <code>actualTakeOffDateTime</code><br>
     *            Holds the <code>actualTakeOffDateTime</code> of the flight.<br>
     *            </p>
     */
    public void setActualTakeOffDateTime(final Date pActualTakeOffDateTime) {

        this.actualTakeOffDateTime = ContractUtility.getClonedDate(pActualTakeOffDateTime);

    }

    /**
     * Sets the <code>actualTakeOffTime</code> property.
     * 
     * 
     * @param pActualTakeOffTime
     *            the new value of the <code>actualTakeOffTime</code> property.
     */

    public void setActualTakeOffTime(final String pActualTakeOffTime) {
        this.actualTakeOffTime = pActualTakeOffTime;
    }

    /**
     * Sets the value of the <code>aircraftConfiguration</code> property.
     * <p>
     * <b>Format: </b><br>
     * 30 X <br>
     * <b>Example: </b><br>
     * A330-200
     * 
     * @param pAircraftConfiguration
     *            <code>int</code><br>
     *            The new value of the <code>aircraftConfiguration</code> property.<br>
     *            </p>
     */

    public void setAircraftConfiguration(final int pAircraftConfiguration) {
        this.aircraftConfiguration = pAircraftConfiguration;
    }

    /**
     * Sets the value of the <code>aircraftEquipment</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha Numeric<br>
     * <b>Example: </b><br>
     * D10
     * 
     * @param pAircraftEquipment
     *            <code>aircraftEquipment</code><br>
     *            Holds the <code>aircraftEquipment</code> of the flight.<br>
     *            </p>
     */
    public void setAircraftEquipment(final String pAircraftEquipment) {

        this.aircraftEquipment = pAircraftEquipment;

    }

    /**
     * Sets the value of the <code>aircraftRegistration</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-9 Alpha numeric<br>
     * <b>Example: </b><br>
     * R342344
     * 
     * @param pAircraftRegistration
     *            <code>aircraftRegistration</code><br>
     *            Holds the <code>aircraftRegistration</code> of the flight.<br>
     *            </p>
     */
    public void setAircraftRegistration(final String pAircraftRegistration) {

        this.aircraftRegistration = pAircraftRegistration;

    }

    /**
     * Sets the value of the <code>aircraftVersion</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 Alpha Numeric<br>
     * <b>Example: </b><br>
     * FCM
     * 
     * @param pAircraftVersion
     *            <code>aircraftVersion</code><br>
     *            Holds the <code>aircraftVersion</code> of the flight.<br>
     *            </p>
     */
    public void setAircraftVersion(final String pAircraftVersion) {

        this.aircraftVersion = pAircraftVersion;

    }

    /**
     * Sets the value of the <code>arrivalStatus</code> property.
     * <p>
     * <b>Format: </b><br>
     * 10 Alpha<br>
     * <b>Example: </b><br>
     * OnTime
     * 
     * @param pArrivalStatus
     *            <code>arrivalStatus</code><br>
     *            Holds the <code>arrivalStatus</code> of the flight.<br>
     *            </p>
     */
    public void setArrivalStatus(final FlightStatusType pArrivalStatus) {

        this.arrivalStatus = pArrivalStatus;

    }

    /**
     * @param baseFlightLeg the baseFlightLeg to set
     */
    public void setBaseFlightLeg(final BaseFlightLegDto baseFlightLeg) {
        this.baseFlightLeg = baseFlightLeg;
    }
    
    /**
     * Sets the value of the <code>cargoClassificationType</code> property.
     * <p>
     *
     * @param <code>pCargoClassificationType</code>
     *            Holds the new value of the <code>cargoClassificationType</code> property.
     */
    public void setCargoClassificationType(
			final CargoClassificationType pCargoClassificationType) {
		this.cargoClassificationType = pCargoClassificationType;
	}

    /**
     * sets the value of the <code>delayDetailsDto</code> property.
     * <p>
     * 
     * @param pDelayDetailsDto
     *            List of <code>{@link com.unisys.trans.logistics.lms.flights.dto.DelayDetailsDto
     *            DelayDetailsDto }</code> objects.<br>
     *            </p>
     */
    public void setDelayDetailsDtos(final List<DelayDetailsDto> pDelayDetailsDto) {

        this.delayDetailsDtos = pDelayDetailsDto;

    }

    /**
     * Sets the value of the <code>departureStatus</code> property.
     * <p>
     * <b>Format: </b><br>
     * 10 Alpha<br>
     * <b>Example: </b><br>
     * ARRIVED
     * 
     * @param pDepartureStatus
     *            <code>departureStatus</code><br>
     *            Holds the <code>departureStatus</code> of the flight.<br>
     *            </p>
     */
    public void setDepartureStatus(final FlightStatusType pDepartureStatus) {

        this.departureStatus = pDepartureStatus;

    }

    /**
     * Sets the value of the <code>destination</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * MSP
     * 
     * @param pDestination
     *            <code>destination</code><br>
     *            Holds the <code>destination</code> of the flight.<br>
     *            </p>
     */
    public void setDestination(final String pDestination) {

        this.destination = pDestination;

    }

    /**
     * Sets the value of the <code>estimatedArrivalDateTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphanumeric<br>
     * <b>Example: </b><br>
     * 23JUL08
     * 
     * @param pEstimatedArrivalDateTime
     *            <code>estimatedArrivalDateTime</code><br>
     *            Holds the <code>estimatedArrivalDateTime</code> of the flight.<br>
     *            </p>
     */
    public void setEstimatedArrivalDateTime(final Date pEstimatedArrivalDateTime) {

        this.estimatedArrivalDateTime = ContractUtility.getClonedDate(pEstimatedArrivalDateTime);

    }

    /**
     * Sets the <code>estimatedArrivalTime</code> property.
     * 
     * 
     * @param pEstimatedArrivalTime
     *            the new value of the <code>estimatedArrivalTime</code> property.
     */
    public void setEstimatedArrivalTime(final String pEstimatedArrivalTime) {
        this.estimatedArrivalTime = pEstimatedArrivalTime;
    }

    /**
     * Sets the value of the <code>estimatedDepartureDateTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphanumeric<br>
     * <b>Example: </b><br>
     * 23JUL08
     * 
     * @param pEstimatedDepartureDateTime
     *            <code>estimatedDepartureDateTime</code><br>
     *            Holds the <code>estimatedDepartureDateTime</code> of the flight.<br>
     *            </p>
     */
    public void setEstimatedDepartureDateTime(final Date pEstimatedDepartureDateTime) {

        this.estimatedDepartureDateTime = ContractUtility.getClonedDate(pEstimatedDepartureDateTime);

    }

    /**
     * Sets the <code>estimatedDepartureTime</code> property.
     * 
     * 
     * @param pEstimatedDepartureTime
     *            the new value of the <code>estimatedDepartureTime</code> property.
     */

    public void setEstimatedDepartureTime(final String pEstimatedDepartureTime) {
        this.estimatedDepartureTime = pEstimatedDepartureTime;
    }

    public void setFlightNumber(final String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * Sets the value of the <code>marketingFlightIndicator</code> property.
     * <p>
     * 
     * @param pMarketingFlightIndicator
     *            <code>marketingFlightIndicator</code><br>
     *            Holds the boolean value of <code>marketingFlightIndicator</code> of the flight.<br>
     *            set true for marketing leg otherwise false.
     *            </p>
     */
    public void setMarketingFlightIndicator(final boolean pMarketingFlightIndicator) {

        this.marketingFlightIndicator = pMarketingFlightIndicator;
    }

    /**
     * Sets the value of the <code>origin</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <b>Example: </b><br>
     * BOS
     * 
     * @param pOrigin
     *            <code>origin</code><br>
     *            Holds the <code>origin</code> of the flight.<br>
     *            </p>
     */
    public void setOrigin(final String pOrigin) {
        this.origin = pOrigin;
    }

    /**
     * Sets the value of the <code>scheduledArrivalDateTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphanumeric<br>
     * <b>Example: </b><br>
     * 23JUL08
     * 
     * @param pScheduledArrivalDateTime
     *            <code>scheduledArrivalDateTime</code><br>
     *            Holds the <code>scheduledArrivalDateTime</code> of the flight.<br>
     *            </p>
     */
    public void setScheduledArrivalDateTime(final Date pScheduledArrivalDateTime) {

        this.scheduledArrivalDateTime = ContractUtility.getClonedDate(pScheduledArrivalDateTime);

    }

    /**
     * Sets the <code>scheduledArrivalTime</code> property.
     * 
     * 
     * @param pScheduledArrivalTime
     *            the new value of the <code>scheduledArrivalTime</code> property.
     */
    public void setScheduledArrivalTime(final String pScheduledArrivalTime) {
        this.scheduledArrivalTime = pScheduledArrivalTime;
    }

    /**
     * Sets the value of the <code>scheduledDepartureDateTime</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphanumeric<br>
     * <b>Example: </b><br>
     * 23JUL08
     * 
     * @param pScheduledDepartureDateTime
     *            <code>scheduledDepartureDateTime</code><br>
     *            Holds the <code>scheduledDepartureDateTime</code> of the flight.<br>
     *            </p>
     */
    public void setScheduledDepartureDateTime(final Date pScheduledDepartureDateTime) {

        this.scheduledDepartureDateTime = ContractUtility.getClonedDate(pScheduledDepartureDateTime);

    }

    /**
     * Sets the <code>scheduledDepartureTime</code> property.
     * 
     * 
     * @param pScheduledDepartureTime
     *            the new value of the <code>scheduledDepartureTime</code> property.
     */

    public void setScheduledDepartureTime(final String pScheduledDepartureTime) {
        this.scheduledDepartureTime = pScheduledDepartureTime;
    }

    /**
     * Sets the value of the <code>serviceType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alpha<br>
     * <b>Example: </b><br>
     * Q
     * 
     * @param pServiceType
     *            <code>serviceType</code><br>
     *            Holds the <code>serviceType</code> of the flight.<br>
     *            </p>
     */
    public void setServiceType(final ServiceType pServiceType) {

        this.serviceType = pServiceType;

    }

    /**
     * Sets the value of the <code>supplementaryComment</code> property.
     * <p>
     * <b>Format: </b><br>
     * 100 Alpha Numeric<br>
     * <b>Example: </b><br>
     * Aircraft Delay
     * 
     * @param pSupplementaryComment
     *            <code>supplementaryComment</code><br>
     *            Holds the <code>supplementaryComment</code> of the flight.<br>
     *            </p>
     */
    public void setSupplementaryComment(final String pSupplementaryComment) {

        this.supplementaryComment = pSupplementaryComment;

    }

	/**
	 * @return the arrivalGate
	 */
	public String getArrivalGate() {
		return arrivalGate;
	}

	/**
	 * @param arrivalGate the arrivalGate to set
	 */
	public void setArrivalGate(String arrivalGate) {
		this.arrivalGate = arrivalGate;
	}

	/**
	 * @return the departureGate
	 */
	public String getDepartureGate() {
		return departureGate;
	}

	/**
	 * @param departureGate the departureGate to set
	 */
	public void setDepartureGate(String departureGate) {
		this.departureGate = departureGate;
	}

}