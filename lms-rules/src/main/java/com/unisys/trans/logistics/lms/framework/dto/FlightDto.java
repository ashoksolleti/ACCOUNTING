/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.constants.DayOfFlightStatusType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>Flight</code> entity contains specific data applicable to the flight.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>flightDate</code>
 * </ul>
 */
public class FlightDto extends BaseFlightDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2664599054869297764L;

    /**
     * Attribute to hold <code>flightDate</code> property.
     */
    private Date flightDate;

	/**
     * Gets the <code>flightDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightDate</code> property.
     */
    public Date getFlightDate() {
        return ContractUtility.getClonedDate(this.flightDate);
    }

    /**
     * Sets the <code>flightDate</code> property.
     * <p>
     * 
     * @param pFlightDate the new value of the <code>flightDate</code> property.
     */
    public void setFlightDate(final Date pFlightDate) {
        this.flightDate = ContractUtility.getClonedDate(pFlightDate);
    }
    
    // LMSC-11111 UIS158 Start
    private DayOfFlightStatusType flightStatus;

    public DayOfFlightStatusType getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(DayOfFlightStatusType flightStatus) {
		this.flightStatus = flightStatus;
	}
    // LMSC-11111 UIS158 End

}