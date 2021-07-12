/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;
import java.util.Date;

/**
 * <code>RestrictionGenerateSegmentDto</code> holds the segment informations such as segment origin, segment
 * destination, arrivalDate, departureDate, aircraftEquipmentCode and aircraftRegistrationNumber to find the
 * restrictions.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>aircraftEquipmentCode
 * <li>aircraftRegistrationNumber
 * <li>arrivalDate
 * <li>departureDate
 * <li>destinationStation
 * <li>flight
 * <li>originStation
 * </code>
 * </ul>
 */
public class RestrictionGenerateSegmentDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4112243456758518706L;

    /**
     * Attribute to hold <code>aircraftEquipmentCode</code> property.
     * <p>
     * Aircraft Equipment Code that the restriction affects. If the restriction is not for a specific
     * aircraft, this field is blank
     */
    private String aircraftEquipmentCode;

    /**
     * Attribute to hold <code>aircraftRegistrationNumber</code> property.
     * <p>
     * Aircraft Registration Number that the restriction affects. If the restriction is not for a specific
     * Aircraft Registration number, this field is blank.
     */
    private String aircraftRegistrationNumber;

    /**
     * Attribute to hold <code>arrivalDate</code> property.
     * <p>
     * Local date on which the flight arrives for a given segment.
     */
    private Date arrivalDate;

    /**
     * Attribute to hold <code>departureDate</code> property.
     * <p>
     * Local date on which the flight departs from a given segment.
     */
    private Date departureDate;

    /**
     * Attribute to hold <code>destinationStation</code> property.<br>
     * <p>
     * Station code to represent the arrival station for a given segment.
     */
    private String destinationStation;

    /**
     * Attribute to hold <code>flight</code> property.
     * <p>
     * Reference of base flight data transfer object.
     */
    private BaseFlightDto flight;

    /**
     * Attribute to hold <code>originStation</code> property.<br>
     * <p>
     * Station code to represent the departure station for a given segment.
     */
    private String originStation;

    /**
     * Default constructor.
     */
    public RestrictionGenerateSegmentDto() {

    }

    /**
     * Gets the value of the <code>aircraftEquipmentCode</code> property.
     * <p>
     * Aircraft Registration Indicator.
     * <li>'A' - ALL EXCEPT Which means all Aircraft registration numbers except the entered aircraft
     * registration number are restricted. Anything else in this field indicates that only the entered
     * aircraft number is restricted.
     * <li>'O' – ONLY the entered Aircraft Registration number is restricted.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha Numeric<br>
     * <b>Example: </b><br>
     * 747
     * 
     * @return the current value of the <code>aircraftEquipmentCode</code> property.<br>
     */

    public String getAircraftEquipmentCode() {

        return this.aircraftEquipmentCode;

    }

    /**
     * Gets the value of the <code>aircraftRegistrationNumber</code> property.
     * <p>
     * Aircraft Registration Number that the restriction affects. If the restriction is not for a specific
     * Aircraft Registration number, this field is blank.
     * <p>
     * <b>Format: </b><br>
     * 2-9 Alphanumeric<br>
     * <b>Example: </b><br>
     * 123
     * 
     * @return the current value of the <code>aircraftRegistrationNumber</code> property.
     */

    public String getAircraftRegistrationNumber() {

        return this.aircraftRegistrationNumber;

    }

    /**
     * Gets the value of <code>arrivalDate</code> attribute.
     * <p>
     * Local date on which the flight arrives for a given segment.
     * <p>
     * <b>Format: </b><br>
     * 7 DTE
     * <p>
     * 
     * @return the current value of the <code>arrivalDate</code>.
     */

    public Date getArrivalDate() {

        return ContractUtility.getClonedDate(this.arrivalDate);

    }

    /**
     * Gets the value of <code>departureDate</code> attribute.
     * <p>
     * Local date on which the flight departs from a given segment.
     * <p>
     * <b>Format: </b><br>
     * 7 DTE
     * <p>
     * 
     * @return the current value of the <code>departureDate</code>.
     */

    public Date getDepartureDate() {

        return ContractUtility.getClonedDate(this.departureDate);

    }

    /**
     * Gets the value of <code>destinationStation</code> attribute.
     * <p>
     * station code to represent the arrival station for a given segment.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * ORD
     * <p>
     * 
     * @return the current value of the <code>destinationStation</code>.
     */

    public String getDestinationStation() {

        return this.destinationStation;

    }

    /**
     * Gets the value of <code>flight</code> property.
     * <p>
     * 
     * @return the current value of the <code>flight</code>.
     */

    public BaseFlightDto getFlight() {

        return this.flight;
    }

    /**
     * Gets the value of <code>originStation</code> attribute.
     * <p>
     * Station code to represent the departure station for a given segment.
     * <p>
     * station code to represent the arrival station for a given segment.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * ORD
     * <p>
     * 
     * @return the current value of the <code>originStation</code>.
     */

    public String getOriginStation() {
        return this.originStation;
    }

    /**
     * Sets the value of the <code>aircraftEquipmentCode</code> property.
     * <p>
     * Aircraft Registration Indicator.
     * <li>'A' - ALL EXCEPT Which means all Aircraft registration numbers except the entered aircraft
     * registration number are restricted. Anything else in this field indicates that only the entered
     * aircraft number is restricted.
     * <li>'O' – ONLY the entered Aircraft Registration number is restricted.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha Numeric<br>
     * <b>Example: </b><br>
     * 747
     * 
     * @param pAircraftEquipmentCode the new value of the <code>aircraftEquipmentCode</code> property.<br>
     */
    public void setAircraftEquipmentCode(final String pAircraftEquipmentCode) {
        this.aircraftEquipmentCode = pAircraftEquipmentCode;

    }

    /**
     * Sets the value of the <code>aircraftRegisterNumber</code> property.
     * <p>
     * Aircraft Registration Number that the restriction affects. If the restriction is not for a specific
     * Aircraft Registration number, this field is blank.
     * <p>
     * <b>Format: </b><br>
     * 2-9 Alphanumeric<br>
     * <b>Example: </b><br>
     * 123
     * 
     * @param pAircraftRegistrationNumber the new value of the <code>aircraftRegistrationNumber</code>
     *            property.<br>
     */
    public void setAircraftRegistrationNumber(final String pAircraftRegistrationNumber) {
        this.aircraftRegistrationNumber = pAircraftRegistrationNumber;
    }

    /**
     * Sets the value of <code>arrivalDate</code> attribute.
     * <p>
     * Local date on which the flight arrives for a given segment.
     * <p>
     * <b>Format: </b><br>
     * 7 DTE
     * <p>
     * 
     * @param pArrivalDate the new value of the <code>arrivalDate</code> property.<br>
     */

    public void setArrivalDate(final Date pArrivalDate) {
        this.arrivalDate = ContractUtility.getClonedDate(pArrivalDate);
    }

    /**
     * Sets the value of <code>departureDate</code> attribute.
     * <p>
     * Local date on which the flight departs for a given segment
     * <p>
     * <b>Format: </b><br>
     * 7 DTE
     * <p>
     * 
     * @param pDepartureDate the new value of the <code>departureDate</code> property.<br>
     */

    public void setDepartureDate(final Date pDepartureDate) {
        this.departureDate = ContractUtility.getClonedDate(pDepartureDate);

    }

    /**
     * Sets the value of <code>destinationStation</code> attribute.
     * <p>
     * station code to represent the arrival station for a given segment.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * ORD
     * <p>
     * 
     * @param pDestinationStation the new value of the <code>destinationStation</code> property.<br>
     */

    public void setDestinationStation(final String pDestinationStation) {
        this.destinationStation = ContractUtility.convertToUpperCase(pDestinationStation);
    }

    /**
     * Sets the value of <code>flight</code> property.
     * <p>
     * It holds flight number, carrier code and suffix.
     * <p>
     * 
     * @param pSegmentFlight the new value of the <code>flight</code> property.<br>
     */

    public void setFlight(final BaseFlightDto pSegmentFlight) {
        this.flight = pSegmentFlight;
    }

    /**
     * Sets the value of <code>pOriginStation</code> attribute.
     * <p>
     * Station code to represent the departure station for a given segment.
     * <p>
     * station code to represent the arrival station for a given segment.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * ORD
     * <p>
     * 
     * @param pOriginStation the new value of the <code>pOriginStation</code> property.<br>
     */

    public void setOriginStation(final String pOriginStation) {
        this.originStation = ContractUtility.convertToUpperCase(pOriginStation);
    }
}