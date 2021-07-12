/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * <code>FlightInformationDto</code> holds all the attributes that are associated with Flight Information.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>segmentNumber
 * <li>departureDate
 * <li>arrivalDate
 * </code>
 * </ul>
 */
public class FlightInformationDto implements Serializable{

    private Date departureDate;

    private Date arrivalDate;

    private String segmentNumber;

    private String origin;

    private String destination;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getSegmentNumber() {
        return segmentNumber;
    }

    public void setSegmentNumber(String segmentNumber) {
        this.segmentNumber = segmentNumber;
    }
}