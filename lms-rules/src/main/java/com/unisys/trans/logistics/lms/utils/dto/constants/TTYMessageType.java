/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>TTYMessageType</code> contains the list of applicable attributes for each message type.
 */
public enum TTYMessageType {
    /**
     * Freight Discrepancy.
     */
    FAD(false, false, false, false, false, true),
    /**
     * Freight Booking List.
     */
    FBL(true, false, false, false, false, false),
    // Message type(Carrier code, Product code, Special handling code, Flight,
    // FWB, Airline Code Number)
    /**
     * Flight Manifest.
     */
    FFM(true, false, false, true, false, false),
    /**
     * Freight Request for Space Allocation.
     */
    FFR(true, false, false, false, false, false),
    /**
     * House/Consolidation List.
     */
    FHL(true, false, false, true, false, true),
    /**
     * Master/House Freight Status Update.
     */
    FSU(false, true, true, false, false, true),
    /**
     * Freight Waybill.
     */
    FWB(true, false, false, true, true, true),

    UCM(true, true, true, true, true, true);    // LMS-11111 UIS158 Change

    /**
     * Attribute to hold <code>airlineCodeNumber</code> property.
     */
    private boolean airlineCodeNumber;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private boolean carrierCode;

    /**
     * Attribute to hold <code>flight</code> property.
     */
    private boolean flight;

    /**
     * Attribute to hold <code>fwbCode</code> property.
     */
    private boolean fwbCode;

    /**
     * Attribute to hold <code>productCode</code> property.
     */
    private boolean productCode;

    /**
     * Attribute to hold <code>splHandlingCode</code> property.
     */
    private boolean splHandlingCode;

    /**
     * Parameterized constructor.
     * <p>
     * 
     * @param pCarrierCodeAllowed - contains the boolean value of the carrier code.<br>
     * @param pProductCodeAllowed - contains the boolean value of the product code.<br>
     * @param pSplHandlingCodeAllowed - contains the boolean value of the special handling code.<br>
     * @param pFlightAllowed - contains the boolean value of flight.<br>
     * @param pFWBCodeAllowed - contains the boolean value of the FWB code.<br>
     * @param pAirlineCodeNumberAllowed - contains the boolean value of the airline code number.<br>
     */
    TTYMessageType(final boolean pCarrierCodeAllowed, final boolean pProductCodeAllowed,
                final boolean pSplHandlingCodeAllowed, final boolean pFlightAllowed,
                final boolean pFWBCodeAllowed, final boolean pAirlineCodeNumberAllowed) {
        this.carrierCode = pCarrierCodeAllowed;
        this.productCode = pProductCodeAllowed;
        this.splHandlingCode = pSplHandlingCodeAllowed;
        this.flight = pFlightAllowed;
        this.fwbCode = pFWBCodeAllowed;
        this.airlineCodeNumber = pAirlineCodeNumberAllowed;
    }

    /**
     * Checks whether the airline code number is applicable for the message type.
     * <p>
     * <b>Possible Values: </b>
     * <ul>
     * <li><code>true</code><br>
     * Airline code number is applicable for the message type.
     * <li><code>false</code><br>
     * Airline code number is not applicable for the message type.
     * </ul>
     * <p>
     * 
     * @return <code>true</code> if the airline code number is applicable for the message type present in the
     *         request.
     */
    public boolean isAirlineCodeNumber() {
        return this.airlineCodeNumber;
    }

    /**
     * Checks whether the carrier code is applicable for the message type.
     * <p>
     * <b>Possible Values: </b>
     * <ul>
     * <li><code>true</code><br>
     * Carrier code is applicable for the message type.
     * <li><code>false</code><br>
     * Carrier code is not applicable for the message type.
     * </ul>
     * <p>
     * 
     * @return <code>true</code> if the carrier code is applicable for the message type present in the
     *         request.
     */
    public boolean isCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Checks whether the flight is applicable for the message type.
     * <p>
     * <b>Possible Values: </b>
     * <ul>
     * <li><code>true</code><br>
     * Flight is applicable for the message type.
     * <li><code>false</code><br>
     * Flight is not applicable for the message type.
     * </ul>
     * <p>
     * 
     * @return <code>true</code> if the flight is applicable for the message type present in the request.
     */
    public boolean isFlight() {
        return this.flight;
    }

    /**
     * Checks whether the FWB code is applicable for the message type.
     * <p>
     * <b>Possible Values: </b>
     * <ul>
     * <li><code>true</code><br>
     * FWB code is applicable for the message type.
     * <li><code>false</code><br>
     * FWB code is not applicable for the message type.
     * </ul>
     * <p>
     * 
     * @return <code>true</code> if the FWB code is applicable for the message type present in the request.
     */
    public boolean isFwbCode() {
        return this.fwbCode;
    }

    /**
     * Checks whether the product code is applicable for the message type.
     * <p>
     * <b>Possible Values: </b>
     * <ul>
     * <li><code>true</code><br>
     * Product code is applicable for the message type.
     * <li><code>false</code><br>
     * Product code is not applicable for the message type.
     * </ul>
     * <p>
     * 
     * @return <code>true</code> if the product code is applicable for the message type present in the
     *         request.
     */
    public boolean isProductCode() {
        return this.productCode;
    }

    /**
     * Checks whether the special handling code is applicable for the message type.
     * <p>
     * <b>Possible Values: </b>
     * <ul>
     * <li><code>true</code><br>
     * Special handling code is applicable for the message type.
     * <li><code>false</code><br>
     * Special handling code is not applicable for the message type.
     * </ul>
     * <p>
     * 
     * @return <code>true</code> if the special handling code is applicable for the message type present in
     *         the request.
     */
    public boolean isSplHandlingCode() {
        return this.splHandlingCode;
    }

    /**
     * Gives the string format of enumerated <code>TTYMessageType</code> for a teletype profile.
     * <p>
     * 
     * @return the current value of the <code>TTYMessageType</code>.
     */
    public String value() {
        return this.name();
    }

}
