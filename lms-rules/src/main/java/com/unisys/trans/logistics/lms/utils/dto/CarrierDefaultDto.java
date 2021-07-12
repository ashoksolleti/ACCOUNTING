/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>CarrierDefaultDto</code> contains specific data applicable to the carrier defaults for a station.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>automaticAssignmentToBookedFlightCode
 * <li>carrierCode
 * <li>maintainFlightAssignmentChangeGoodsIndicator
 * <li>oId
 * <li>stationOId
 * <li>statusForNonMechanizedCheckIn
 * </code>
 * </ul>
 */
public class CarrierDefaultDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5032645681317590595L;

    /**
     * Attribute to hold <code>automaticAssignmentToBookedFlightCode</code> property.
     * <p>
     * The automatic assignment to booked flight indicator indicates if automatic flight assignment to the
     * booked flight for booked goods or ULDs is attempted.
     */
    private String automaticAssignmentToBookedFlightCode;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>maintainFlightAssignmentChangeGoodsIndicator</code> property.
     * <p>
     * The indicator controls whether or not goods moved from an assigned container should be re-assigned to
     * flight if they are moved to one of the following locations:
     * <ul>
     * <li>A terminal location.
     * <li>An inactive container.
     * </ul>
     */
    private boolean maintainFlightAssignmentChangeGoodsIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Object ID of the carrier default.
     */
    private Long oId;

    /**
     * Attribute to hold <code>stationOId</code> property.
     * <p>
     * The stationOId represents the station to which this carrier default information belongs.
     */
    private Long stationOId;

    /**
     * Attribute to hold <code>statusForNonMechanizedCheckIn</code> property.
     * <p>
     * Indicator to determine the impact of goods check-in at a non-mechanized station.
     */
    private String statusForNonMechanizedCheckIn;

    //SK253A begins
    
    private String fblTriggerDep1;
    
    private String fblTriggerDep2;
    
    
    private String fblTriggerDep3;
    
    private String fblTriggerDep4;
    //SK253A ends

    /**
     * <code>Default constructor.</code>
     */
    public CarrierDefaultDto() {

    }

    /**
     * Gets the <code>automaticAssignmentToBookedFlightCode</code> property.
     * <p>
     * The automatic assignment to booked flight indicator indicates if automatic flight assignment to the
     * booked flight for booked goods or ULDs is attempted. <b>Possible values:</b>
     * <ul>
     * <li><code>Y</code> <br>
     * Automatic flight assignment to the booked flight is attempted.
     * <li><code>N</code> <br>
     * Automatic flight assignment to the booked flight is not attempted.
     * <li><code>S</code> <br>
     * Based on system level parameter C$ASGN. This is the default value.
     * </ul>
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * S
     * <p>
     * 
     * @return the current value of the <code>automaticAssignmentToBookedFlightCode</code> property.
     */
    public String getAutomaticAssignmentToBookedFlightCode() {
        return this.automaticAssignmentToBookedFlightCode;
    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>OID</code> property.
     * <p>
     * 
     * @return the current value of the <code>OID</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>stationOId</code> property.
     * <p>
     * 
     * @return the current value of the <code>stationOId</code> property.
     */
    public Long getStationOId() {
        return this.stationOId;
    }

    /**
     * Gets the <code>statusForNonMechanizedCheckIn</code> property.
     * <p>
     * Indicator to determine the impact of goods check-in at a non-mechanized station . <b>Possible
     * values:</b>
     * <ul>
     * <li><code>V</code> <br>
     * Verified by FSU RCF.
     * <ul>
     * <li>The application assumes that the check-in at a non-mechanized station is confirmed by an incoming
     * FSU RCF message from a handling agent.
     * <li>The Shipment History function displays the text UNVERIFIED ARRV for the goods check-in at a
     * non-mechanized station.
     * <li>The check-in at a non-mechanized station does not generate an outgoing FSU RCF message.
     * <li>An incoming FSR message results in an FSA DEP status message until the check-in is verified *by an
     * incoming FSU RCF message from the handling agent.
     * </ul>
     * <li><code>N</code> <br>
     * Non-Verified
     * <ul>
     * <li>The application does not expect an incoming FSU RCF message from a handling agent.
     * <li>If an incoming FSU RCF is received, it is recorded in history as CHECK-IN -FSU entry.
     * <li>The Shipment History function displays the text ARRVD NONEQ STN for the goods check-in at *a
     * non-mechanized station.
     * <li>The check-in at a non-mechanized station does generate an outgoing FSU RCF message.
     * <li>An incoming FSR message results in an FSA RCF status message.
     * <li>On the initial display, the system defaults to the Non-Verified option.
     * </ul>
     * </ul>
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * V
     * <p>
     * 
     * @return the current value of the <code>statusForNonMechanizedCheckIn</code> property.
     */
    public String getStatusForNonMechanizedCheckIn() {
        return this.statusForNonMechanizedCheckIn;
    }

    /**
     * Gets the <code>maintainFlightAssignmentChangeGoodsIndicator</code> property.
     * <p>
     * The indicator controls whether or not goods moved from an assigned container should be re-assigned to
     * flight if they are moved to one of the following locations:
     * <ul>
     * <li>A terminal location.
     * <li>An inactive container.
     * <li>An empty unassigned container with the same offload.
     * <li>A container assigned to the same flight and offload.
     * </ul>
     * <b>Possible Values: </b><br>
     * <ul>
     * <code>true</code> <br>
     * If the automatic flight re-assignment of the loose goods is attempted. <code>false</code> <br>
     * If no automatic flight re-assignment is done.
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>maintainFlightAssignmentChangeGoodsIndicator</code> property.
     */
    public boolean isMaintainFlightAssignmentChangeGoodsIndicator() {
        return this.maintainFlightAssignmentChangeGoodsIndicator;
    }

    /**
     * Sets the <code>automaticAssignmentToBookedFlightCode</code> property.
     * <p>
     * The automatic assignment to booked flight indicator indicates if automatic flight assignment to the
     * booked flight for booked goods or ULDs is attempted. <br>
     * <b>Possible values:</b>
     * <ul>
     * <li><code>Y</code> <br>
     * Automatic flight assignment to the booked flight is attempted.
     * <li><code>N</code> <br>
     * Automatic flight assignment to the booked flight is not attempted.
     * <li><code>S</code> <br>
     * Based on system level parameter C$ASGN.
     * </ul>
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * S
     * 
     * @param pAutomaticAssignmentToBookedFlightCode the new value of the
     *            <code>automaticAssignmentToBookedFlightCode</code> property.
     */
    public void setAutomaticAssignmentToBookedFlightCode(
                final String pAutomaticAssignmentToBookedFlightCode) {
        this.automaticAssignmentToBookedFlightCode =
                    ContractUtility.convertToUpperCase(pAutomaticAssignmentToBookedFlightCode);
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @param pCarrierCode the new value of the <code>carrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = pCarrierCode;
    }

    /**
     * Sets the <code>maintainFlightAssignmentChangeGoodsIndicator</code> property.
     * <p>
     * <b>Possible Values: </b>
     * <ul>
     * <li><code>true</code> <br>
     * If the automatic flight re-assignment of the loose goods is attempted.
     * <li><code>false</code> <br>
     * If no automatic flight re-assignment is done.
     * </ul>
     * <p>
     * 
     * @param pMaintainFlightAssignmentChangeGoodsIndicator the new value of the
     *            <code>maintainFlightAssignmentChangeGoodsIndicator</code> property.
     */
    public void setMaintainFlightAssignmentChangeGoodsIndicator(
                final boolean pMaintainFlightAssignmentChangeGoodsIndicator) {
        this.maintainFlightAssignmentChangeGoodsIndicator = pMaintainFlightAssignmentChangeGoodsIndicator;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>stationOId</code> property.
     * <p>
     * 
     * @param pStationOId the new value of the <code>stationOId</code> property.
     */
    public void setStationOId(final Long pStationOId) {
        this.stationOId = pStationOId;
    }

    /**
     * Sets the <code>statusForNonMechanizedCheckIn</code> property.
     * <p>
     * Indicator to determine the impact of goods check-in at a non-mechanized station . <b>Possible
     * values:</b>
     * <ul>
     * <li><code>V</code> <br>
     * Verified by FSU RCF.
     * <ul>
     * <li>The application assumes that the check-in at a non-mechanized station is confirmed by an incoming
     * FSU RCF message from a handling agent.
     * <li>The Shipment History function displays the text UNVERIFIED ARRV for the goods check-in at a
     * non-mechanized station.
     * <li>The check-in at a non-mechanized station does not generate an outgoing FSU RCF message.
     * <li>An incoming FSR message results in an FSA DEP status message until the check-in is verified *by an
     * incoming FSU RCF message from the handling agent.
     * </ul>
     * <li><code>N</code> <br>
     * Non-Verified
     * <ul>
     * <li>The application does not expect an incoming FSU RCF message from a handling agent.
     * <li>If an incoming FSU RCF is received, it is recorded in history as CHECK-IN -FSU entry.
     * <li>The Shipment History function displays the text ARRVD NONEQ STN for the goods check-in at *a
     * non-mechanized station.
     * <li>The check-in at a non-mechanized station does generate an outgoing FSU RCF message.
     * <li>An incoming FSR message results in an FSA RCF status message.
     * <li>On the initial display, the system defaults to the Non-Verified option.
     * </ul>
     * </ul>
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * V
     * <p>
     * 
     * @param pStatusForNonMechanizedCheckIn the new value of the <code>statusForNonMechanizedCheckIn</code>
     *            property.
     */
    public void setStatusForNonMechanizedCheckIn(final String pStatusForNonMechanizedCheckIn) {
        this.statusForNonMechanizedCheckIn =
                    ContractUtility.convertToUpperCase(pStatusForNonMechanizedCheckIn);
    }
    //SK253A ends

	public String getFblTriggerDep1() {
		return fblTriggerDep1;
	}

	public void setFblTriggerDep1(String fblTriggerDep1) {
		this.fblTriggerDep1 = fblTriggerDep1;
	}

	public String getFblTriggerDep2() {
		return fblTriggerDep2;
	}

	public void setFblTriggerDep2(String fblTriggerDep2) {
		this.fblTriggerDep2 = fblTriggerDep2;
	}

	public String getFblTriggerDep3() {
		return fblTriggerDep3;
	}

	public void setFblTriggerDep3(String fblTriggerDep3) {
		this.fblTriggerDep3 = fblTriggerDep3;
	}

	public String getFblTriggerDep4() {
		return fblTriggerDep4;
	}

	public void setFblTriggerDep4(String fblTriggerDep4) {
		this.fblTriggerDep4 = fblTriggerDep4;
	}
    
    //SK253A ends

}
