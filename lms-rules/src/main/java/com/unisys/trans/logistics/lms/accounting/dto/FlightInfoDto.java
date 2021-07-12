package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;


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
        return ContractUtility.getClonedDate(this.flightDate);
    }

    public void setFlightDate(final Date pFlightDate) {
        this.flightDate = ContractUtility.getClonedDate(pFlightDate);
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public void setFlightNumber(final String pFlightNumber) {
        this.flightNumber = pFlightNumber;
    }
}
