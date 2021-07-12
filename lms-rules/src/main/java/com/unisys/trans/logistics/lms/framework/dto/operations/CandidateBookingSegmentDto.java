/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.BaseFlightSegmentDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>CandidateBookingSegmentDto</code> class represents the Goods Arrival/Assignment booking segment
 * details.
 * <p>
 * <code>CandidateBookingSegmentDto</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>BaseFlightDto
 * <li>FlightDate
 * <li>BaseFlightSegmentDto
 *  <br>
 * </code>
 * </ul>
 **/
public class CandidateBookingSegmentDto extends PersistenceObjectDto {

    /**
     * Default serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>flight</code> information.
     */
    private BaseFlightDto flight;


    /**
     * Attribute to hold <code>flightDate</code>.
     */
    private Date flightDate;
    private boolean flightFinalIndforcandidateseg;

    /**
     * Attribute to hold <code>flightSegment</code>
     */
    private BaseFlightSegmentDto flightSegment;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Gets the <code>BaseFlightDto</code> property.
     * <p>
     * 
     * @return the current value of <code>BaseFlightDto</code> property.
     */
    public BaseFlightDto getFlight() {
        return this.flight;
    }

    /**
     * Gets the <code>FlightDate</code> property.
     * <p>
     * 
     * @return the current value of <code>FlightDate</code> property.
     */
    public Date getFlightDate() {
        if(this.flightDate!=null){
        	return (Date)this.flightDate.clone();
            }
            else{
            	return null;
            }
    }

    /**
     * Gets the <code>BaseFlightSegmentDto</code> property.
     * <p>
     * 
     * @return the current value of <code>BaseFlightSegmentDto</code> property.
     */
    public BaseFlightSegmentDto getFlightSegment() {
        return this.flightSegment;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#getOId()
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    

    public void setOId(Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>Flight</code> property.
     * <p>
     * 
     * @param pFlight
     *            the new value of the <code>Flight</code> property.
     */
    public void setFlight(final BaseFlightDto pFlight) {
        this.flight = pFlight;
    }

    /**
     * Sets the <code>FlightDate</code> property.
     * <p>
     * 
     * @param pFlightDate
     *            the new value of the <code>FlightDate</code> property.
     */
    public void setFlightDate(final Date pFlightDate) {
        if(pFlightDate!=null){
        	this.flightDate =(Date) pFlightDate.clone();
          }
        else
        {
        	this.flightDate=null;
        }
    }

    /**
     * Sets the <code>BaseFlightSegmentDto</code> property.
     * <p>
     * 
     * @param pFlightSegment
     *            the new value of the <code>BaseFlightSegmentDto</code> property.
     */
    public void setFlightSegment(final BaseFlightSegmentDto pFlightSegment) {
        this.flightSegment = pFlightSegment;
    }

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

    /**
     * @return the flightFinalIndforcandidateseg
     */
    public boolean isFlightFinalIndforcandidateseg() {
        return flightFinalIndforcandidateseg;
    }

    /**
     * @param flightFinalIndforcandidateseg the flightFinalIndforcandidateseg to set
     */
    public void setFlightFinalIndforcandidateseg(boolean flightFinalIndforcandidateseg) {
        this.flightFinalIndforcandidateseg = flightFinalIndforcandidateseg;
    }

}
