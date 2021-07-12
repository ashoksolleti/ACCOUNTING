package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SegmentDto implements Serializable {

    private static final long serialVersionUID = -2216635547924661928L;

    /**
     * Attribute to hold <code>destinationCarrier</code> property.
     */
    private String destinationCarrier;

    /**
     * Attribute to hold <code>segmentDestination</code> property.
     */
    private String segmentDestination;

    /**
     * Attribute to hold <code>segmentOrigin</code> property.
     */
    private String segmentOrigin;
    
    
    private BigDecimal grossWeight;

    /**
     * Attribute to hold <code>routeOrder</code> property.
     */
    private Integer routeOrder;
    
    /**
     * Attribute to hold <code>routeOrder</code> property.
     */
    private Integer pieces;

    // This needs to be a list of DTO. Ranga doing it now for testing purposes.
    private List<FlightInfoDto> flightInfo;
    
    
    public boolean isClubbedSegmentIndicator() {
		return clubbedSegmentIndicator;
	}

	public void setClubbedSegmentIndicator(boolean clubbedSegmentIndicator) {
		this.clubbedSegmentIndicator = clubbedSegmentIndicator;
	}

	private boolean clubbedSegmentIndicator;

    /**
     * Gets the <code>flightInfo</code> property.
     * <p>
     * 
     * @return holds the <code>flightInfo</code> property.
     */
    public List<FlightInfoDto> getFlightInfo() {

        if (this.flightInfo == null) {

            this.flightInfo = new ArrayList<FlightInfoDto>();
        }

        return flightInfo;
    }

    /**
     * Sets the <code>exceptionManager</code> property.
     * <p>
     * 
     * @param pExceptionManager
     *            holds the <code>exceptionManager</code> property.
     */
    public void setFlightInfo(List<FlightInfoDto> flightInfo) {

        this.flightInfo = flightInfo;
    }

    /**
     * Gets the <code>destinationCarrier</code> property.
     * <p>
     * 
     * @return holds the <code>destinationCarrier</code> property.
     */
    public String getDestinationCarrier() {
        return this.destinationCarrier;
    }

    /**
     * Sets the <code>destinationCarrier</code> property.
     * <p>
     * 
     * @param pDestinationCarrier
     *            holds the <code>destinationCarrier</code> property.
     */
    public void setDestinationCarrier(String pDestinationCarrier) {
        this.destinationCarrier = pDestinationCarrier;
    }

    /**
     * Gets the <code>segmentDestination</code> property.
     * <p>
     * 
     * @return holds the <code>segmentDestination</code> property.
     */
    public String getSegmentDestination() {
        return this.segmentDestination;
    }

    /**
     * Sets the <code>segmentDestination</code> property.
     * <p>
     * 
     * @param pSegmentDestination
     *            holds the <code>segmentDestination</code> property.
     */
    public void setSegmentDestination(String pSegmentDestination) {
        this.segmentDestination = pSegmentDestination;
    }

    /**
     * Gets the <code>segmentOrigin</code> property.
     * <p>
     * 
     * @return holds the <code>segmentOrigin</code> property.
     */
    public String getSegmentOrigin() {
        return this.segmentOrigin;
    }

    /**
     * Sets the <code>segmentOrigin</code> property.
     * <p>
     * 
     * @param pSegmentOrigin
     *            holds the <code>segmentOrigin</code> property.
     */
    public void setSegmentOrigin(String pSegmentOrigin) {
        this.segmentOrigin = pSegmentOrigin;
    }

    /**
     * Gets the <code>routeOrder</code> property.
     * <p>
     * 
     * @return holds the <code>routeOrder</code> property.
     */
    public Integer getRouteOrder() {
        return this.routeOrder;
    }

    /**
     * Sets the <code>routeOrder</code> property.
     * <p>
     * 
     * @param pRouteOrder
     *            holds the <code>routeOrder</code> property.
     */
    public void setRouteOrder(Integer pRouteOrder) {
        this.routeOrder = pRouteOrder;
    }
    /**
     * Gets the <code>serialVersionUID</code> property.
     * <p>
     * 
     * @return holds the <code>serialVersionUID</code> property.
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    /**
     * Gets the <code>grossWeight</code> property.
     * <p>
     * 
     * @return holds the <code>grossWeight</code> property.
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }
    /**
     * Sets the <code>grossWeight</code> property.
     * <p>
     * 
     * @param pGrossWeight
     *            holds the <code>grossWeight</code> property.
     */
    public void setGrossWeight(BigDecimal pGrossWeight) {
        this.grossWeight = pGrossWeight;
    }

    /**
     * Gets the <code>pieces</code> property.
     * <p>
     * 
     * @return holds the <code>pieces</code> property.
     */
    public Integer getPieces() {
        return this.pieces;
    }

    /**
     * Sets the <code>pieces</code> property.
     * <p>
     * 
     * @param pPieces
     *            holds the <code>pieces</code> property.
     */
    public void setPieces(final Integer pPieces) {
        this.pieces = pPieces;
    }

}
