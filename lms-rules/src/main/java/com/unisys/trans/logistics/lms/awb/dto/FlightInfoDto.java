package com.unisys.trans.logistics.lms.awb.dto;

import java.io.Serializable;
import java.util.Date;


public class FlightInfoDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7104246256383570773L;

    /**
     * Attribute to holds <code>flightDate</code> property.
     */
  
    private Date flightDate;

    /**
     * Attribute to holds <code>flightNumber</code> property.
     */
   
    private String flightNumber;

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
