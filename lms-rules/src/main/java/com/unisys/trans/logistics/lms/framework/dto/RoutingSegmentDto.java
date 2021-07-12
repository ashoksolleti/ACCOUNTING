package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>RoutingSegment</code> is used for find RoutingSegment information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>destinationCarrier
 * <li>destinationStation
 * <li>flightDate
 * <li>flightNumber
 * <li>originStation
 * 
 * </ul>
 */
public class RoutingSegmentDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5442519758440268277L;

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
    
	private Date flightOriginDate;
	
	

    /**
	 * @return the flightOriginDate
	 */
	public Date getFlightOriginDate() {
		return flightOriginDate;
	}

	/**
	 * @param flightOriginDate the flightOriginDate to set
	 */
	public void setFlightOriginDate(Date flightOriginDate) {
		this.flightOriginDate = flightOriginDate;
	}


	/**
     * Attribute to holds <code>originStation</code> property.
     */
    private String suffix;

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * Gets the <code>destinationCarrier</code> property.
     * 
     * @return the current value of <code>destinationCarrier</code>.
     * 
     */
    public String getDestinationCarrier() {
        return this.destinationCarrier;
    }

    /**
     * Gets the <code>destinationStation</code> property.
     * 
     * @return the current value of <code>flightRestrictionType</code>.
     * 
     */
    public String getDestinationStation() {
        return this.destinationStation;
    }

    /**
     * Gets the <code>flightDate</code> property.
     * 
     * @return the current value of <code>flightDate</code>.
     * 
     */
    public Date getFlightDate() {
        return ContractUtility.getClonedDate(this.flightDate);
    }

    /**
     * Gets the <code>flightNumber</code> property.
     * 
     * @return the current value of <code>flightNumber</code>.
     * 
     */
    public String getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Gets the <code>originStation</code> property.
     * 
     * @return the current value of <code>originStation</code>.
     * 
     */
    public String getOriginStation() {
        return this.originStation;
    }

    /**
     * Sets the <code>destinationCarrier</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphabets<br>
     * <p>
     * <b>Example: </b><br>
     * SK<br>
     * the new value of the <code>destinationCarrier</code> property.
     */
    public void setDestinationCarrier(final String pDestinationCarrier) {
        this.destinationCarrier = pDestinationCarrier;
    }

    /**
     * Sets the <code>destinationStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets<br>
     * <p>
     * <b>Example: </b><br>
     * ORD<br>
     * the new value of the <code>destinationStation</code> property.
     */
    public void setDestinationStation(final String pDestinationStation) {
        this.destinationStation = ContractUtility
                    .convertToUpperCase(pDestinationStation);
    }

    /**
     * Sets the <code>flightDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY<br>
     * <p>
     * <b>Example: </b><br>
     * 11SEP14<br>
     * <p>
     * the new value of the <code>flightDate</code> property.
     */
    public void setFlightDate(final Date pFlightDate) {
        this.flightDate = ContractUtility.getClonedDate(pFlightDate);
    }

    /**
     * Sets the <code>flightNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3-4 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 1123<br>
     * <p>
     * the new value of the <code>flightNumber</code> property.
     */
    public void setFlightNumber(final String pFlightNumber) {
        this.flightNumber = ContractUtility.convertToUpperCase(pFlightNumber);
    }

    /**
     * Sets the <code>originStation</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets<br>
     * <p>
     * <b>Example: </b><br>
     * MSP<br>
     * <p>
     * the new value of the <code>originStation</code> property.
     */
    public void setOriginStation(final String pOriginStation) {
        this.originStation = ContractUtility.convertToUpperCase(pOriginStation);
    }

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
		result = prime * result + ((suffix == null) ? 0 : suffix.hashCode());
		return result;
	}

    @Override
    public boolean equals(final Object pObj) {
        boolean isEqual = true;

        if (pObj == null) {
            isEqual = false;
        }
        else if (this == pObj) {
            isEqual = true;
        }
        else if (getClass() != pObj.getClass()) {
            isEqual = false;
        }
        else {
            RoutingSegmentDto other = (RoutingSegmentDto) pObj;
            if (this.destinationCarrier == null) {
                if (other.destinationCarrier != null) {
                    isEqual = false;
                }
            }
            else if (!destinationCarrier.equals(other.destinationCarrier)) {
                isEqual = false;
            }

            if (this.destinationStation == null) {
                if (other.destinationStation != null) {
                    isEqual = false;
                }
            }
            else if (!destinationStation.equals(other.destinationStation)) {
                isEqual = false;
            }

            if (this.flightNumber == null) {
                if (other.flightNumber != null) {
                    isEqual = false;
                }
            }
            else if (!flightNumber.equals(other.flightNumber)) {
                isEqual = false;
            }

            if (this.flightDate == null) {
                if (other.flightDate != null) {
                    isEqual = false;
                }
            }
            else if (!flightDate.equals(other.flightDate)) {
                isEqual = false;
            }
        }

        return isEqual;
    }


    public boolean matches(final Object pObj) {

        RoutingSegmentDto other = (RoutingSegmentDto) pObj;

        if (this.originStation == null) {
            if (other.originStation != null) {
                return false;
            }
        }
        else if (!originStation.equals(other.originStation)) {
            return false;
        }

        if (this.destinationCarrier == null) {
            if (other.destinationCarrier != null) {
                return false;
            }
        }
        else if (!destinationCarrier.equals(other.destinationCarrier)) {
            return false;
        }

        if (this.destinationStation == null) {
            if (other.destinationStation != null) {
                return false;
            }
        }
        else if (!destinationStation.equals(other.destinationStation)) {
            return false;
        }

        if (this.flightNumber == null) {
            if (other.flightNumber != null) {
                return false;
            }
        }
        else if (!flightNumber.equals(other.flightNumber)) {
            return false;
        }

        if (this.flightDate == null && other.flightDate != null) {
            return false;
        }
        else if (this.flightDate != null && other.flightDate == null)
        {
            return false;
        }
        else if (this.flightDate != null && other.flightDate != null
                    && flightDate.compareTo(other.flightDate) != 0) {
            return false;
        }

        return true;
    }

}
