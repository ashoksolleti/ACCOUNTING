package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;

public class PricingFlightDetailDto implements Serializable{
	@Override
	public String toString() {
		String pricingFlightDetailDto = new String();
		pricingFlightDetailDto = "pricingFlightDetailDto ::: " + "flightOrigin :" + flightOrigin + "flightDestination :"
				+ flightDestination + "flightNumber :" + flightNumber + "flightDate :" + flightDate
				+ "flightDateWeekday :" + flightDateWeekday;
		return pricingFlightDetailDto;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Attribute to hold <code>flightOrigin</code> property.
     */
	private String flightOrigin;
	 /**
     * Attribute to hold <code>flightDestination</code> property.
     */
	private String flightDestination;
	 /**
     * Attribute to hold <code>flightNumber</code> property.
     */
	private String flightNumber;
	 /**
     * Attribute to hold <code>flightDate</code> property.
     */
	private int flightDate;
	/**
     * Attribute to hold <code>flightDateWeekday</code> property.
     */
	private int flightDateWeekday;
	/**
     * Gets the <code>flightOrigin</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightOrigin</code> property.<br>
     */
	public String getFlightOrigin() {
		return this.flightOrigin;
	}
	/**
     * Gets the <code>flightDestination</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightDestination</code> property.<br>
     */
	public String getFlightDestination() {
		return this.flightDestination;
	}
	/**
     * Gets the <code>flightNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightNumber</code> property.<br>
     */
	public String getFlightNumber() {
		return this.flightNumber;
	}
	/**
     * Gets the <code>flightDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightDate</code> property.<br>
     */
	public int getFlightDate() {
		return this.flightDate;
	}
	
	 /**
     * Sets the <code>flightOrigin</code> property.
     * <p>
     * 
     * @param pFlightOrigin
     *            the current value of the <code>flightOrigin</code> property.
     */
	public void setFlightOrigin(final String pFlightOrigin) {
		this.flightOrigin = pFlightOrigin;
	}
	 /**
     * Sets the <code>flightDestination</code> property.
     * <p>
     * 
     * @param pFlightDestination
     *            the current value of the <code>flightDestination</code> property.
     */
	public void setFlightDestination(final String pFlightDestination) {
		this.flightDestination = pFlightDestination;
	}
	 /**
     * Sets the <code>flightNumber</code> property.
     * <p>
     * 
     * @param pFlightNumber
     *            the current value of the <code>flightNumber</code> property.
     */
	public void setFlightNumber(final String pFlightNumber) {
		this.flightNumber = pFlightNumber;
	}
	 /**
     * Sets the <code>flightDate</code> property.
     * <p>
     * 
     * @param pFlightDate
     *            the current value of the <code>flightDate</code> property.
     */
	public void setFlightDate(final int pFlightDate) {
		this.flightDate = pFlightDate;
	}
	
	/**
     * Gets the <code>flightDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightDate</code> property.<br>
     */
	public int getFlightDateWeekday() {
		return this.flightDateWeekday;
	}
	
	 /**
     * Sets the <code>flightDate</code> property.
     * <p>
     * 
     * @param pFlightDate
     *            the current value of the <code>flightDate</code> property.
     */
	public void setFlightDateWeakday(final int pFlightDateWeekday) {
		this.flightDateWeekday = pFlightDateWeekday;
	}


}
