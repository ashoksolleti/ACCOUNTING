package com.unisys.trans.logistics.lms.awb.dto;

import java.io.Serializable;
import java.util.Date;

public class FlightMaximumInputDto  implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 9108265946092172986L;
	
	/**
     *  Special Handling code
     */
    private String code;
    
	/**
     * Attribute to holds <code>destinationCarrier</code> property.
     */
    private String destinationCarrier;

    /**
     * Attribute to holds <code>destinationStation</code> property.
     */
    private String destinationStation;

    /**
     * Attribute to holds <code>flightDate</code> property.
     */
    private Date flightDate;

    /**
     * Attribute to holds <code>flightNumber</code> property.
     */
    private String flightNumber;

    /**
     * Attribute to holds <code>originStation</code> property.
     */
    private String originStation;
    
    
    /**
     * Attribute to holds <code>departureDate</code> property.
     */
    private Date departureDate;
    
    /**
     * Attribute to holds <code>departureTime</code> property.
     */
    private Integer departureTime;
    
    /**
     * Gets the <code>destinationCarrier</code> property.
     * <p>
     * 
     */
    public String getDestinationCarrier() {
        return destinationCarrier;
    }

    /**
     * Gets the <code>destinationStation</code> property.
     * <p>
     * 
     */
    public String getDestinationStation() {
        return destinationStation;
    }

    /**
     * Gets the <code>flightDate</code> property.
     * <p>
     * 
     */

    public Date getFlightDate() {
        return flightDate;
    }

    /**
     * Gets the <code>flightNumber</code> property.
     * <p>
     * 
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Gets the <code>originStation</code> property.
     * <p>
     * 
     */
    public String getOriginStation() {
        return originStation;
    }

    /**
     * Sets the <code>destinationCarrier</code> property.
     * <p>
     * 
     *            the new value of the <code>destinationCarrier</code> property.
     */
    public void setDestinationCarrier(final String pDestinationCarrier) {
        this.destinationCarrier = pDestinationCarrier;
    }

    /**
     * Sets the <code>destinationStation</code> property.
     * <p>
     * 
     *            the new value of the <code>destinationStation</code> property.
     */
    public void setDestinationStation(final String pDestinationStation) {
        this.destinationStation = pDestinationStation;
    }

    /**
     * Sets the <code>flightDate</code> property.
     * <p>
     * 
     *            the new value of the <code>flightDate</code> property.
     */
    public void setFlightDate(final Date pFlightDate) {
        this.flightDate = pFlightDate;
    }

    /**
     * Sets the <code>flightNumber</code> property.
     * <p>
     * 
     *            the new value of the <code>flightNumber</code> property.
     */

    public void setFlightNumber(final String pFlightNumber) {
        this.flightNumber = pFlightNumber;
    }

    /**
     * Sets the <code>originStation</code> property.
     * <p>
     * 
     *            the new value of the <code>originStation</code> property.
     */

    public void setOriginStation(final String pOriginStation) {
        this.originStation = pOriginStation;
    }

	/**
	 * @return the departureDate
	 */
	public Date getDepartureDate() {
		return departureDate;
	}

	/**
	 * @param departureDate the departureDate to set
	 */
	public void setDepartureDate(final Date departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 * @return the departureTime
	 */
	public Integer getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(final Integer departureTime) {
		this.departureTime = departureTime;
	}


    /**
     * @return the code
     */
    public String getCode() {
        return this.code;
    }



    /**
     * @param code the code to set
     */
    public void setCode(String pCode) {
        this.code = pCode;
    }



}
