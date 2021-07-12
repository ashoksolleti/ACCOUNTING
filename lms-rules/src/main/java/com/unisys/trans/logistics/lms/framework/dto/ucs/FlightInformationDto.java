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

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.dto.ucs.FlightDateType;
import com.unisys.trans.logistics.lms.framework.dto.ucs.ScheduleType;
import com.unisys.trans.logistics.lms.framework.dto.ucs.TimeZoneType;
import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>FlightInformationDto</code> holds all the attributes that are associated with Flight Information.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>flightDate
 * <li>flightDateType
 * <li>daysOfOperation
 * <li>effectiveDate
 * <li>endDate
 * <li>flight
 * <li>flightCancellationStatus
 * <li>serviceType
 * <li>marketingFlightIndicator
 * <li>timeZoneType
 * <li>legs
 * </code>
 * </ul>
 */
//@JsonWriteNullProperties(false)
public class FlightInformationDto extends AbstractRequest implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2335982612771455448L;

    /**
     * Attribute to hold <code>isCargoOnlyFlight</code> property.
     */
    private boolean cargoOnlyFlight;

    /**
     * Attribute to hold <code>daysOfOperation</code> property.
     */
    private String daysOfOperation;

    /**
     * Attribute to hold <code>effectiveDate</code> property.
     */
    private Date effectiveDate;

    /**
     * Attribute to hold <code>endDate</code> property.
     */
    private Date endDate;

    /**
     * Attribute to hold <code>flight</code> object.
     */
    private BaseFlightDto flight;

    /**
     * Attribute to hold <code>flightCancellationIndicator</code> property.
     */

    private boolean flightCancellationIndicator;

    /**
     * Attribute to hold <code>flightDate</code> property.
     */
    private Date flightDate;

    /**
     * Attribute to hold <code>flightDateType</code> property.
     */
    private FlightDateType flightDateType;

    private String flightEndDate;

    private String flightStartDate;

    /**
     * Variable to hold collection of <code>LegInformationDto</code> objects.<br>
     */
    private List<LegInformationDto> legs;

    /**
     * Attribute to hold <code>scheduleType</code> property.
     */
    private ScheduleType scheduleType;

    /**
     * Variable to hold station objects.<br>
     */

    private String station;

    /**
     * Attribute to hold <code>timeZoneType</code> property.
     */
    private TimeZoneType timeZoneType;
    /**
     * Attribute to hold <code>hostcontrolledCapacityFlight</code> property.
     */
    private boolean hostcontrolledCapacityFlight;
	/**
     * <code>constructor.</code>
     */
    public FlightInformationDto() {

    }

    /**
     * Gets the <code>daysOfOperation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alpha or 1-7 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * D,123,14
     * <p>
     * 
     * @return the current value of <code>daysOfOperation</code> property.<br>
     */

    public String getDaysOfOperation() {

        return this.daysOfOperation;

    }

    /**
     * Gets the <code>effectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DTE<br>
     * <p>
     * <b>Example: </b><br>
     * 26JUL2008
     * <p>
     * 
     * @return the current value of <code>effectiveDate</code> property.<br>
     */

    public Date getEffectiveDate() {

        return ContractUtility.getClonedDate(this.effectiveDate);

    }

    /**
     * Gets the <code>endDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DTE<br>
     * <p>
     * <b>Example: </b><br>
     * 26JUL2008
     * <p>
     * 
     * @return the current value of <code>endDate</code> property.<br>
     */

    public Date getEndDate() {

        return ContractUtility.getClonedDate(this.endDate);

    }

    /**
     * Gets the <code>flight</code> property.
     * <p>
     * 
     * @return the current value of <code>flight</code> property.<br>
     */
    public BaseFlightDto getFlight() {

        return this.flight;
    }

    /**
     * Gets the <code>flightDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DTE<br>
     * <p>
     * <b>Example: </b><br>
     * 26JUL2008
     * <p>
     * 
     * @return the current value of <code>flightDate</code> property.<br>
     */

    public Date getFlightDate() {

        return ContractUtility.getClonedDate(this.flightDate);

    }

    /**
     * Gets the <code>flightDateType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <p>
     * <b>Example: </b><br>
     * FOD
     * <p>
     * 
     * @return the current value of <code>flightDateType</code> property.<br>
     */

    public FlightDateType getFlightDateType() {

        return this.flightDateType;

    }

    public String getFlightEndDate() {
        return this.flightEndDate;
    }

    public String getFlightStartDate() {
        return this.flightStartDate;
    }

    /**
     * Gets the <code>legs</code> property.
     * <p>
     * 
     * @return the current value of <code>legs</code> property.<br>
     */

    public List<LegInformationDto> getLegs() {

        if (this.legs == null) {

            this.legs = new ArrayList<LegInformationDto>();
        }
        return this.legs;

    }

    public ScheduleType getScheduleType() {
        return this.scheduleType;
    }

    /**
     * Gets the <code>station</code> property.
     * <p>
     * 
     * @return the current value of <code>station</code> property.<br>
     */

    public String getStation() {
        return this.station;
    }

    /**
     * Gets the <code>timeZoneType</code> property.
     * <p>
     * <b>Example: </b><br>
     * U
     * <p>
     * 
     * @return the current value of <code>timeZoneType</code> property.<br>
     */

    public TimeZoneType getTimeZoneType() {

        return this.timeZoneType;

    }

    public boolean isCargoOnlyFlight() {
        return this.cargoOnlyFlight;
    }

    /**
     * Gets the <code>flightCancellationIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false<br>
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of <code>flightCancellationIndicator</code> property.<br>
     */

    public boolean isFlightCancelled() {

        return this.flightCancellationIndicator;

    }

    public void setCargoOnlyFlight(final boolean cargoOnlyFlight) {
        this.cargoOnlyFlight = cargoOnlyFlight;
    }

    /**
     * Sets the <code>daysOfOperation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alpha or 1-7 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * D,123,14
     * <p>
     * 
     * @param pDaysOfOperation
     *            the new value of <code>daysOfOperation</code> property.<br>
     */

    public void setDaysOfOperation(final String pDaysOfOperation) {

        this.daysOfOperation = pDaysOfOperation;

    }

    /**
     * Sets the <code>effectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DTE <br>
     * <p>
     * <b>Example: </b><br>
     * 26JUL2008
     * <p>
     * 
     * @param pEffectiveDate
     *            the new value of <code>effectiveDate</code> property.<br>
     */

    public void setEffectiveDate(final Date pEffectiveDate) {

        this.effectiveDate = ContractUtility.getClonedDate(pEffectiveDate);

    }

    /**
     * Sets the <code>endDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DTE<br>
     * <p>
     * <b>Example: </b><br>
     * 26JUL2006
     * <p>
     * 
     * @param pEndDate
     *            the new value of <code>endDate</code> property.<br>
     */

    public void setEndDate(final Date pEndDate) {

        this.endDate = ContractUtility.getClonedDate(pEndDate);

    }

    /**
     * Sets the <code>flight</code> property.
     * <p>
     * 
     * @param pFlightDto
     *            the new value of <code>flight</code> property.<br>
     */

    public void setFlight(final BaseFlightDto pFlightDto) {

        this.flight = pFlightDto;

    }

    /**
     * Sets the <code>flightCancellationIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false <br>
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pFlightCancellationIndicator
     *            the new value of <code>flightCancellationIndicator</code> property.<br>
     */

    public void setFlightCancellationIndicator(final boolean pFlightCancellationIndicator) {

        this.flightCancellationIndicator = pFlightCancellationIndicator;

    }

    /**
     * Sets the <code>flightDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DTE<br>
     * <p>
     * <b>Example: </b><br>
     * 26JUL2008
     * <p>
     * 
     * @param pFlightDate
     *            the new value of <code>flightDate</code> property.<br>
     */

    public void setFlightDate(final Date pFlightDate) {

        this.flightDate = ContractUtility.getClonedDate(pFlightDate);

    }

    /**
     * Sets the <code>flightDateType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha<br>
     * <p>
     * <b>Example: </b><br>
     * FOD
     * <p>
     * 
     * @param pFlightDateType
     *            the new value of <code>flightDateType</code> property.<br>
     */

    public void setFlightDateType(final FlightDateType pFlightDateType) {

        this.flightDateType = pFlightDateType;

    }

    public void setFlightEndDate(final String flightEndDate) {
        this.flightEndDate = flightEndDate;
    }

    public void setFlightStartDate(final String flightStartDate) {
        this.flightStartDate = flightStartDate;
    }

    /**
     * Sets the <code>LegInformationDto</code> property.
     * <p>
     * 
     * @param pLegs
     *            the new value of <code>legs</code> property.<br>
     */

    public void setLegs(final List<LegInformationDto> pLegs) {

        this.legs = pLegs;
    }

    public void setScheduleType(final ScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }

    /**
     * Sets the <code>Station</code> property.
     * <p>
     * <p>
     * 
     * @param pStation
     *            the new value of <code>station</code> property.<br>
     */

    public void setStation(final String pStation) {
        this.station = pStation;
    }

    /**
     * Sets the <code>timeZoneType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alpha<br>
     * <p>
     * <b>Example: </b><br>
     * U
     * <p>
     * 
     * @param pTimeZoneType
     *            the new value of <code>timeZoneType</code> property.<br>
     */

    public void setTimeZoneType(final TimeZoneType pTimeZoneType) {

        this.timeZoneType = pTimeZoneType;

    }
    /**
     * Gets the <code>hostcontrolledCapacityFlight</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false<br>
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of <code>hostcontrolledCapacityFlight</code> property.<br>
     */


    public boolean isHostcontrolledCapacity() {
		return hostcontrolledCapacityFlight;
	}
    /**
     * Sets the <code>hostcontrolledCapacityFlight</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false <br>
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param phostcontrolledCapacity
     *            the new value of <code>hostcontrolledCapacityFlight</code> property.<br>
     */

	public void setHostControlledCapacity(boolean hostcontrolledCapacityFlight) {
		this.hostcontrolledCapacityFlight = hostcontrolledCapacityFlight;
	}



}