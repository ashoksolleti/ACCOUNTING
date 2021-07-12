package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.CargoClassType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class BookingSegmentDto implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = -8624225757151679782L;

    /**
     * Booking Segment Flight
     */
    // Temp changed the flight type to String from BaseFlightDto
    // private BaseFlightDto flight;
    private String flightNumber;

    /**
     * <p>
     * Booked Cargo Class.<br />
     * Cargo classification's value has got the value by accessing of input flight details<br />
     * Determined by CNCGCL<br />
     * AC(All cargo) = 'F'<br />
     * BC(Belly cargo) = 'P'<br />
     * PC(Partial Cargo (Combi)) = 'C'<br />
     * </p>
     */
    private CargoClassType cargoClass;

    /**
     * Allotment identifier associated to booking segment
     * */
    private String allotmentId;

    /**
     * @return the allotmentId
     * 
     */
    public String getAllotmentId() {
        return this.allotmentId;
    }

    /**
     * @param pAllotmentId the allotmentId to set
     * 
     */
    public void setAllotmentId(final String pAllotmentId) {
        this.allotmentId = pAllotmentId;
    }

    /**
     * Booked Flight departure time
     * 
     */
    private Integer departureTime;

    /**
     * Booked Flight date
     * 
     */
    private Date flightDate;
    
    /**
     * Attribute to hold <code>flightOrigin</code> property.
     */
    private String flightOrigin;
    /**
     * Attribute to hold <code>flightDestination</code> property.
     */
    private String flightDestination;

    /**
     * @return the cargoClass
     */
    public CargoClassType getCargoClass() {
        return this.cargoClass;
    }

    /**
     * @return the departureTime
     * 
     */
    public Integer getDepartureTime() {
        return this.departureTime;
    }

    public String getFlight() {
        return this.flightNumber;
    }

    /**
     * @return the flightDate
     */
    public Date getFlightDate() {
        return ContractUtility.getClonedDate(this.flightDate);
    }

    /**
     * @param cargoClass the cargoClass to set
     */
    public void setCargoClass(final CargoClassType pCargoClass) {
        this.cargoClass = pCargoClass;
    }

    /**
     * @param departureTime the departureTime to set
     * 
     */
    public void setDepartureTime(final Integer pDepartureTime) {
        this.departureTime = pDepartureTime;
    }

    public void setFlight(final String pFlight) {
        this.flightNumber = pFlight;
    }

    /**
     * @param flightDate the flightDate to set
     * 
     */
    public void setFlightDate(final Date pFlightDate) {
        this.flightDate = ContractUtility.getClonedDate(pFlightDate);
    }

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
     * Gets the <code>flightDestination</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightDestination</code> property.<br>
     */
	public String getFlightDestination() {
		return this.flightDestination;
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
}
