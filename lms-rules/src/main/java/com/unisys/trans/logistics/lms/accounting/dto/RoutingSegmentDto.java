/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;


import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class RoutingSegmentDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4495985929654652811L;

    /**
     * Attribute to hold <code>destinationCarrier</code> property.
     */
    private String destinationCarrier;

    /**
     * Attribute to hold <code>destinationStation</code> property.
     */
    private String destinationStation;

    /**
     * Attribute to hold <code>flightDate</code> property.
     */
    private Date flightDate;

    /**
     * Attribute to hold <code>flightNumber</code> property.
     */
    private String flightNumber;

    /**
     * Attribute to hold <code>originStation</code> property.
     */
    private String originStation;
    
    private String status;
    
    private String updateStation;
    
    private BigDecimal segmentWeight;
    
    private Integer pieces;
    
    private Double segmentDistance;
    
    private BigInteger evnttimestmp; 
    
    public boolean isClubbedSegmentIndicator() {
		return clubbedSegmentIndicator;
	}

	public void setClubbedSegmentIndicator(boolean clubbedSegmentIndicator) {
		this.clubbedSegmentIndicator = clubbedSegmentIndicator;
	}

	private boolean clubbedSegmentIndicator;
    
    
    public BigDecimal getSegmentWeight() {
        return segmentWeight;
    }

    public void setSegmentWeight(BigDecimal segmentWeight) {
        this.segmentWeight = segmentWeight;
    }

    /**
     * Gets the <code>destinationCarrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationCarrier</code> property.
     */
    public String getDestinationCarrier() {
        return this.destinationCarrier;
    }

    /**
     * Gets the <code>destinationStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationStation</code> property.
     */
    public String getDestinationStation() {
        return this.destinationStation;
    }

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
     * Gets the <code>flightNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightNumber</code> property.
     */
    public String getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Gets the <code>originStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>originStation</code> property.
     */
    public String getOriginStation() {
        return this.originStation;
    }

    /**
     * Sets the <code>destinationCarrier</code>.
     * <p>
     * 
     * @param pDestinationCarrier
     *            holds the new value of <code>destinationCarrier</code>
     */
    public void setDestinationCarrier(final String pDestinationCarrier) {
        this.destinationCarrier = ContractUtility.convertToUpperCase(pDestinationCarrier);
    }

    /**
     * Sets the <code>destinationStation</code>.
     * <p>
     * 
     * @param pDestinationStation
     *            holds the new value of <code>destinationStation</code>
     */
    public void setDestinationStation(final String pDestinationStation) {
        this.destinationStation = ContractUtility.convertToUpperCase(pDestinationStation);
    }

    /**
     * Sets the <code>flightDate</code>.
     * <p>
     * 
     * @param pFlightDate
     *            holds the new value of <code>flightDate</code>
     */
    public void setFlightDate(final Date pFlightDate) {
        this.flightDate = ContractUtility.getClonedDate(pFlightDate); 
    }

    /**
     * Sets the <code>flightNumber</code>.
     * <p>
     * 
     * @param pFlightNumber
     *            holds the new value of <code>flightNumber</code>
     */
    public void setFlightNumber(final String pFlightNumber) {
        this.flightNumber =ContractUtility.convertToUpperCase(pFlightNumber); 
    }

    /**
     * Sets the <code>originStation</code>.
     * <p>
     * 
     * @param pOriginStation
     *            holds the new value of <code>originStation</code>
     */
    public void setOriginStation(final String pOriginStation) {
        this.originStation = ContractUtility.convertToUpperCase(pOriginStation);
    }

    public Integer getPieces() {
        return pieces;
    }

    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }
    
    public Double getSegmentDistance() {
        return segmentDistance;
    }

    public void setSegmentDistance(Double segmentDistance) {
        this.segmentDistance = segmentDistance;
    }

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpdateStation() {
		return updateStation;
	}

	public void setUpdateStation(String updateStation) {
		this.updateStation = updateStation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((destinationCarrier == null) ? 0 : destinationCarrier
						.hashCode());
		result = prime
				* result
				+ ((destinationStation == null) ? 0 : destinationStation
						.hashCode());
		result = prime * result
				+ ((flightDate == null) ? 0 : flightDate.hashCode());
		result = prime * result
				+ ((flightNumber == null) ? 0 : flightNumber.hashCode());
		result = prime * result
				+ ((originStation == null) ? 0 : originStation.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) { 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoutingSegmentDto other = (RoutingSegmentDto) obj;
		if (destinationCarrier == null) {
			if (other.destinationCarrier != null)
				return false;
		} else if (!destinationCarrier.equals(other.destinationCarrier))
			return false;
		if (destinationStation == null) {
			if (other.destinationStation != null)
				return false;
		} else if (!destinationStation.equals(other.destinationStation))
			return false;
		if (flightDate == null) {
			if (other.flightDate != null)
				return false;
		} else if (!flightDate.equals(other.flightDate))
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		if (originStation == null) {
			if (other.originStation != null)
				return false;
		} else if (!originStation.equals(other.originStation))
			return false;
		if (pieces == null) {
			if (other.pieces != null)
				return false;
		}
		else if (pieces!=other.pieces)
			return false;
		if (segmentWeight == null) {
			if (other.segmentWeight != null)
				return false;
		}
		else if (segmentWeight.compareTo(other.segmentWeight)!=0)
			return false;
		return true;
	}

	public BigInteger getEvnttimestmp() {
		return evnttimestmp;
	}

	public void setEvnttimestmp(BigInteger evnttimestmp) {
		this.evnttimestmp = evnttimestmp;
	}
 
}
