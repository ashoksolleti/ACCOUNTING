/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>FSUType</code> defines the valid values of FSU/FZE Status Code for Teletype Address Profile
 * Information.<br>
 * <p>
 * Following are the list of 23 valid values: RCT, RCF, BKD, RCS, OFL, MAN, TRM, TFD, DDL, RCC, RCD, FOH, AWD,
 * NFD, DLV, DIS, CRC, CCD, PRE, DEP, ARR, AWR and FPS.
 */
public enum FSUType {
    /**
     * ARR - Flight arrival (non-IATA defined FSU status).
     */
    ARR,
    /**
     * AWD - FSU Status Code. Arrival documents delivered.
     */
    AWD,
    /**
     * AWR - Documents received from aircraft (non-IATA defined FSU status).
     */
    AWR,
    /**
     * BKD - FSU Status Code. Shipment booked on flight.
     */
    BKD,
    /**
     * CCD - FSU Status Code. Consignment cleared by customs.
     */
    CCD,
    /**
     * CRC - FSU Status Code. Consignment information has been reported to customs.
     */
    CRC,
    /**
     * DDL - FSU Status Code. Door delivery.
     */
    DDL,
    /**
     * DEP - FSU Status Code. Shipment departed on a flight.
     */
    DEP,
    /**
     * DIS - FSU Status Code. Shipment with a discrepancy.
     */
    DIS,
    /**
     * DLV - FSU Status Code. Shipment delivered to a consignee.
     */
    DLV,
    /**
     * FOH - Preliminary goods acceptance (non-IATA defined FSU status).
     */
    FOH,
    /**
     * FPS - FSU Status Code. Shipment stored in warehouse (non-IATA).
     */
    FPS,
    /**
     * MAN - FSU Status Code. Shipment manifested on a flight.
     */
    MAN,
    /**
     * NFD - FSU Status Code. Consignee informed of shipment arrival.
     */
    NFD,
    /**
     * OFL - Shipment removed from a flight (FSU/FZE DIS/OFLD).
     */
    OFL,
    /**
     * PRE - Shipment prepared for loading to a flight.
     */
    PRE,
    /**
     * RCC - Conditional goods acceptance (non-IATA defined FSU status).
     */
    RCC,
    /**
     * RCD - Documents received (non-IATA defined FSU status).
     */
    RCD,
    /**
     * RCF - Shipment arrived on a specified flight.
     */
    RCF,
    /**
     * RCS - Shipment received from shipper.
     */
    RCS,
    /**
     * RCT - Shipment received from another carrier.
     */
    RCT,
    /**
     * TFD - FSU Status Code. Shipment transferred to another carrier.
     */
    TFD,
    /**
     * TGC - FSU Status Code.
     */
    TGC,
    /**
     * TRM - Shipment to be transferred to another carrier.
     */
    TRM;

    /**
     * Default constructor.
     */
    private FSUType() {
    }

    /**
     * Gets <code>FSUStatusCode</code> enum from the enum value.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     *            </p>
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.constants.FSUType FSUType}</code><br>
     *         Returns the <code>FSUStatusCode</code> if a match found else returns null.<br>
     */
    public static FSUType getFSUStatusCodeFromValue(final String pValue) {
        FSUType aKey = null;
        for (final FSUType aFSUStatusCode : FSUType.values()) {
            if (aFSUStatusCode.name().equals(pValue)) {
                aKey = aFSUStatusCode;
                break;
            }
        }
        return aKey;
    }
}