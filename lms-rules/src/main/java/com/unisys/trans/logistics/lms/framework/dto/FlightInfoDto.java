package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.util.Date;

public class FlightInfoDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -1347242209818644447L;

    /**
     * Attribute to hold the <code>utilsGateway</code> object.
     */
    private String carrier;

    /**
     * Attribute to hold the <code>utilsGateway</code> object.
     */
    private String flightNumber;
    
    
    private Date flightDate;

    /**
     * Gets the <code>carrier</code> property.
     * <p>
     * 
     * @return holds the <code>carrier</code> property.
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * Sets the <code>carrier</code> property.
     * <p>
     * 
     * @param pCarrier
     *            holds the <code>carrier</code> property.
     */
    public void setCarrier(String pCarrier) {
        this.carrier = pCarrier;
    }

    /**
     * Gets the <code>flightNumber</code> property.
     * <p>
     * 
     * @return holds the <code>flightNumber</code> property.
     */
    public String getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Sets the <code>flightNumber</code> property.
     * <p>
     * 
     * @param pFlightNumber
     *            holds the <code>flightNumber</code> property.
     */
    public void setFlightNumber(String pFlightNumber) {
        this.flightNumber = pFlightNumber;
    }

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

}
