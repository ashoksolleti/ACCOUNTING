package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.BaseFlightLegDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.FlightServiceType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.FlightStatusType;

/**
 * <code>LegDto</code> class represents the Leg information.
 * 
 */
public class OperationFlightLegDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>actualIntoGateDateTime</code> property.
     */
    private Date actualIntoGateDateTime;

    /**
     * Attribute to hold <code>actualLandingDateTime</code> property.
     */
    private Date actualLandingDateTime;

    /**
     * Attribute to hold <code>actualOutOfGateDateTime</code> property.
     */
    private Date actualOutOfGateDateTime;

    /**
     * Attribute to hold <code>actualTakeOffDateTime</code> property.
     */
    private Date actualTakeOffDateTime;

    /**
     * Attribute to hold <code>aircraftRegistration</code> property.
     */
    private String aircraftRegistration;

    /**
     * Attribute to hold <code>BaseFlightLeg</code> property.
     */
    private BaseFlightLegDto baseFlightLeg;

    /**
     * Attribute to hold <code>Equipment</code> property.
     */
    private BaseEquipmentDto equipment;

    /**
     * Attribute to hold <code>estimatedArrivalDateTime</code> property.
     */
    private Date estimatedArrivalDateTime;

    /**
     * Attribute to hold <code>estimatedDepartureDateTime</code> property.
     */
    private Date estimatedDepartureDateTime;

    /**
     * Attribute to hold <code>flightArrivalStatus</code> property.
     */
    private String flightArrivalStatus;

    /**
     * Attribute to hold <code>flightDepartureStatus</code> property.
     */
    private String flightDepartureStatus;

    /**
     * Attribute to hold <code>flightFinalizedIndicator</code> property.
     */
    private boolean flightFinalizedIndicator;

    /**
     * Attribute to hold <code>flightServiceType</code> property.
     */
    private FlightServiceType flightServiceType;

    /**
     * Attribute to hold <code>flightStatus</code> property.
     */
    private FlightStatusType flightStatusType;

    /**
     * Attribute to hold <code>fsuDEPSentIndicator</code> property.
     */
    private boolean fsuDEPSentIndicator;

    /**
     * Attribute to hold <code>localArrivalDate</code> property.
     */
    private Date localArrivalDate;

    /**
     * Attribute to hold <code>localDepartureDate</code> property.
     */
    private Date localDepartureDate;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long OId;

    /**
     * Attribute to hold <code>scheduledArrivalDateTime</code> property.
     */
    private Date scheduledArrivalDateTime;

    /**
     * Attribute to hold <code>scheduledDepartureDateTime</code> property.
     */
    private Date scheduledDepartureDateTime;

    /**
     * Gets the <code>ActualIntoGateDateTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>ActualIntoGateDateTime</code> property.<br>
     */
    public Date getActualIntoGateDateTime() {
        if (this.actualIntoGateDateTime != null) {
            return (Date) this.actualIntoGateDateTime.clone();
        }
        else {
            return null;
        }
    }

    /**
     * Gets the <code>ActualLandingDateTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>ActualLandingDateTime</code> property.<br>
     */
    public Date getActualLandingDateTime() {
        if (this.actualLandingDateTime != null) {
            return (Date) this.actualLandingDateTime.clone();
        }
        else {
            return null;
        }
    }

    /**
     * Gets the <code>ActualOutOfGateDateTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>ActualOutOfGateDateTime</code> property.<br>
     */
    public Date getActualOutOfGateDateTime() {
        if (this.actualOutOfGateDateTime != null) {
            return (Date) this.actualOutOfGateDateTime.clone();
        }
        else {
            return null;
        }
    }

    /**
     * Gets the <code>ActualTakeOffDateTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>ActualTakeOffDateTime</code> property.<br>
     */
    public Date getActualTakeOffDateTime() {
        if (this.actualTakeOffDateTime != null) {
            return (Date) this.actualTakeOffDateTime.clone();
        }
        else {
            return null;
        }
    }

    /**
     * Gets the value of the <code>aircraftRegistration</code> property.
     * <p>
     *
     * @return Returns the current value of <code>aircraftRegistration</code> property.
     */
    public String getAircraftRegistration() {
        return aircraftRegistration;
    }

    /**
     * Gets the <code>BaseFlightLeg</code> property.
     * <p>
     * 
     * @return the current value of the <code>BaseFlightLeg</code> property.<br>
     */
    public BaseFlightLegDto getBaseFlightLeg() {
        if (this.baseFlightLeg == null) {
            this.baseFlightLeg = new BaseFlightLegDto();
        }
        return this.baseFlightLeg;
    }

    /**
     * Gets the <code>Equipment</code> property.
     * <p>
     * 
     * @return the current value of the <code>Equipment</code> property.<br>
     */
    public BaseEquipmentDto getEquipment() {
        if (this.equipment == null) {
            this.equipment = new BaseEquipmentDto();
        }
        return this.equipment;
    }

    /**
     * Gets the value of the <code>estimatedArrivalDateTime</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>estimatedArrivalDateTime</code> property.
     */
    public Date getEstimatedArrivalDateTime() {
        if (estimatedArrivalDateTime != null) {
            return (Date) estimatedArrivalDateTime.clone();
        }
        else {
            return null;
        }
    }

    /**
     * Gets the value of the <code>estimatedDepartureDateTime</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>estimatedDepartureDateTime</code> property.
     */
    public Date getEstimatedDepartureDateTime() {
        if (estimatedDepartureDateTime != null) {
            return (Date) estimatedDepartureDateTime.clone();
        }
        else {
            return null;
        }
    }

    public String getFlightArrivalStatus() {
        return flightArrivalStatus;
    }

    public String getFlightDepartureStatus() {
        return flightDepartureStatus;
    }

    /**
     * Gets the <code>FlightFinalizedIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>FlightFinalizedIndicator</code> property.<br>
     */
    public boolean getFlightFinalizedIndicator() {
        return this.flightFinalizedIndicator;
    }

    /**
     * Gets the <code>FlightServiceType</code> property.
     * <p>
     * 
     * @return the current value of the <code>FlightServiceType</code> property.<br>
     */
    public FlightServiceType getFlightServiceType() {
        return this.flightServiceType;
    }

    /**
     * Gets the <code>FlightStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>FlightStatus</code> property.<br>
     */
    public FlightStatusType getFlightStatusType() {
        return this.flightStatusType;
    }

    /**
     * Gets the <code>FsuDEPSentIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>FsuDEPSentIndicator</code> property.<br>
     */
    public boolean getFsuDEPSentIndicator() {
        return this.fsuDEPSentIndicator;
    }

    /**
     * Gets the value of the <code>localArrivalDate</code> property.
     * <p>
     *
     * @return Returns the current value of <code>localArrivalDate</code> property.
     */
    public Date getLocalArrivalDate() {
        if (localArrivalDate != null) {
            return (Date) localArrivalDate.clone();
        }
        else {
            return null;
        }
    }

    /**
     * Gets the <code>LocalDepartureDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>LocalDepartureDate</code> property.<br>
     */
    public Date getLocalDepartureDate() {
        if (this.localDepartureDate != null) {
            return (Date) this.localDepartureDate.clone();
        }
        else {
            return null;
        }
    }

    /**
     * Gets the value of the <code>oId</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return OId;
    }

    /**
     * Gets the value of the <code>scheduledArrivalDateTime</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>scheduledArrivalDateTime</code> property.
     */
    public Date getScheduledArrivalDateTime() {
        if (scheduledArrivalDateTime != null) {
            return (Date) scheduledArrivalDateTime.clone();
        }
        else {
            return null;
        }
    }

    /**
     * Gets the value of the <code>scheduledDepartureDateTime</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>scheduledDepartureDateTime</code> property.
     */
    public Date getScheduledDepartureDateTime() {
        if (scheduledDepartureDateTime != null) {
            return (Date) scheduledDepartureDateTime.clone();
        }
        else {
            return null;
        }
    }

    /**
     * Sets the <code>ActualIntoGateDateTime</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ActualIntoGateDateTime</code> property.<br>
     */
    public void setActualIntoGateDateTime(final Date pActualIntoGateDateTime) {
        if (pActualIntoGateDateTime != null) {
            this.actualIntoGateDateTime = (Date) pActualIntoGateDateTime.clone();
        }
        else {
            this.actualIntoGateDateTime = null;
        }
    }

    /**
     * Sets the <code>ActualLandingDateTime</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ActualLandingDateTime</code> property.<br>
     */
    public void setActualLandingDateTime(final Date pActualLandingDateTime) {
        if (pActualLandingDateTime != null) {
            this.actualLandingDateTime = (Date) pActualLandingDateTime.clone();
        }
        else {
            this.actualLandingDateTime = null;
        }
    }

    /**
     * Sets the <code>ActualOutOfGateDateTime</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ActualOutOfGateDateTime</code> property.<br>
     */
    public void setActualOutOfGateDateTime(final Date pActualOutOfGateDateTime) {
        if (pActualOutOfGateDateTime != null) {
            this.actualOutOfGateDateTime = (Date) pActualOutOfGateDateTime.clone();
        }
        else {
            this.actualOutOfGateDateTime = null;
        }
    }

    /**
     * Sets the <code>ActualTakeOffDateTime</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ActualTakeOffDateTime</code> property.<br>
     */
    public void setActualTakeOffDateTime(final Date pActualTakeOffDateTime) {
        if (pActualTakeOffDateTime != null) {
            this.actualTakeOffDateTime = (Date) pActualTakeOffDateTime.clone();
        }
        else {
            this.actualTakeOffDateTime = null;
        }
    }

    /**
     * Sets the value of the <code>aircraftRegistration</code> property.
     * <p>
     *
     * @param <code>aircraftRegistration</code>
     *            Holds the new value of the <code>aircraftRegistration</code> property.
     */
    public void setAircraftRegistration(String aircraftRegistration) {
        this.aircraftRegistration = aircraftRegistration;
    }

    /**
     * Sets the <code>BaseFlightLeg</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>BaseFlightLeg</code> property.<br>
     */
    public void setBaseFlightLeg(final BaseFlightLegDto pBaseFlightLeg) {
        this.baseFlightLeg = pBaseFlightLeg;
    }

    /**
     * Sets the <code>Equipment</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>Equipment</code> property.<br>
     */
    public void setEquipment(final BaseEquipmentDto pEquipment) {
        this.equipment = pEquipment;
    }

    /**
     * Sets the value of the <code>estimatedArrivalDateTime</code> property.
     * <p>
     * 
     * @param <code>estimatedArrivalDateTime</code> Holds the new value of the
     *            <code>estimatedArrivalDateTime</code> property.
     */
    public void setEstimatedArrivalDateTime(Date estimatedArrivalDateTime) {
        if (estimatedArrivalDateTime != null) {
            this.estimatedArrivalDateTime = (Date) estimatedArrivalDateTime.clone();
        }
        else {
            this.estimatedArrivalDateTime = null;
        }
    }

    /**
     * Sets the value of the <code>estimatedDepartureDateTime</code> property.
     * <p>
     * 
     * @param <code>estimatedDepartureDateTime</code> Holds the new value of the
     *            <code>estimatedDepartureDateTime</code> property.
     */
    public void setEstimatedDepartureDateTime(Date estimatedDepartureDateTime) {
        if (estimatedDepartureDateTime != null) {
            this.estimatedDepartureDateTime = (Date) estimatedDepartureDateTime.clone();
        }
        else {
            this.estimatedDepartureDateTime = null;
        }
    }

    public void setFlightArrivalStatus(String flightArrivalStatus) {
        this.flightArrivalStatus = flightArrivalStatus;
    }

    public void setFlightDepartureStatus(String flightDepartureStatus) {
        this.flightDepartureStatus = flightDepartureStatus;
    }

    /**
     * Sets the <code>FlightFinalizedIndicator</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>FlightFinalizedIndicator</code> property.<br>
     */
    public void setFlightFinalizedIndicator(final boolean pFlightFinalizedIndicator) {
        this.flightFinalizedIndicator = pFlightFinalizedIndicator;
    }

    /**
     * Sets the <code>FlightServiceType</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>FlightServiceType</code> property.<br>
     */
    public void setFlightServiceType(final FlightServiceType pFlightServiceType) {
        this.flightServiceType = pFlightServiceType;
    }

    /**
     * Sets the <code>FlightStatus</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>FlightStatus</code> property.<br>
     */
    public void setFlightStatusType(final FlightStatusType pFlightStatusType) {
        this.flightStatusType = pFlightStatusType;
    }

    /**
     * Sets the <code>FsuDEPSentIndicator</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>FsuDEPSentIndicator</code> property.<br>
     */
    public void setFsuDEPSentIndicator(final boolean pFsuDEPSentIndicator) {
        this.fsuDEPSentIndicator = pFsuDEPSentIndicator;
    }

    /**
     * Sets the value of the <code>localArrivalDate</code> property.
     * <p>
     *
     * @param <code>localArrivalDate</code> Holds the new value of the <code>localArrivalDate</code> property.
     */
    public void setLocalArrivalDate(Date localArrivalDate) {
        if (localArrivalDate != null) {
            this.localArrivalDate = (Date) localArrivalDate.clone();
        }
        else {
            this.localArrivalDate = null;
        }
    }

    /**
     * Sets the <code>LocalDepartureDate</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>LocalDepartureDate</code> property.<br>
     */
    public void setLocalDepartureDate(final Date pLocalDepartureDate) {
        if (pLocalDepartureDate != null) {
            this.localDepartureDate = (Date) pLocalDepartureDate.clone();
        }
        else {
            this.localDepartureDate = null;
        }
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param <code>oId</code> Holds the new value of the <code>oId</code> property.
     */
    public void setOId(Long oId) {
        this.OId = oId;
    }

    /**
     * Sets the value of the <code>scheduledArrivalDateTime</code> property.
     * <p>
     * 
     * @param <code>scheduledArrivalDateTime</code> Holds the new value of the
     *            <code>scheduledArrivalDateTime</code> property.
     */
    public void setScheduledArrivalDateTime(Date scheduledArrivalDateTime) {
        if (scheduledArrivalDateTime != null) {
            this.scheduledArrivalDateTime = (Date) scheduledArrivalDateTime.clone();
        }
        else {
            this.scheduledArrivalDateTime = null;
        }
    }

    /**
     * Sets the value of the <code>scheduledDepartureDateTime</code> property.
     * <p>
     * 
     * @param <code>scheduledDepartureDateTime</code> Holds the new value of the
     *            <code>scheduledDepartureDateTime</code> property.
     */
    public void setScheduledDepartureDateTime(Date scheduledDepartureDateTime) {
        if (scheduledDepartureDateTime != null) {
            this.scheduledDepartureDateTime = (Date) scheduledDepartureDateTime.clone();
        }
        else {
            this.scheduledDepartureDateTime = null;
        }
    }

}
