/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.BookingFlightStatusType;
import com.unisys.trans.logistics.lms.framework.constants.BookingStatusType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.FlightInfoDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

/**
 * <code>BookingSegmentDto</code> contains the details of BookingSegmentDto.
 * <p>
 * This contains all information about BookingSegmentDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>oId
 * <li>airwaybillRoute
 * </ul>
 */

public class BookingSegmentDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>routingSegment</code> property.
     */
    private RoutingSegmentDto routingSegment;

    private String allotmentCategory;

    private Date allotmentDate;

    private String allotmentIdentifier;

    private FlightInfoDto assignedArrivalFlight;

    private FlightInfoDto bookedArrivalFlight;

    private Integer bookingSegmentNumber;

    private String flightControllingStationOffice;

    private String twStatus;

    BookingFlightStatusType bookingFlightStatus;

    BookingStatusType bookingSegmentStatus;

    private String interChangeTtyAddress;

    private String xbDateTime;

    private GoodsDto bookingsGoods;

    private String iataContourCode;

    private WeightUOMType signedStationWeightUnit;

    private VolumeUOMType signedStationVolUnit;

    private BigDecimal chargeableWeight;

    private BigDecimal grossWeight;
    
    public boolean isClubbedSegmentIndicator() {
		return clubbedSegmentIndicator;
	}

	public void setClubbedSegmentIndicator(boolean clubbedSegmentIndicator) {
		this.clubbedSegmentIndicator = clubbedSegmentIndicator;
	}

	private boolean clubbedSegmentIndicator;

    /*
     * private BigDecimal volumetricWeight;
     * 
     * 
     * public BigDecimal getVolumetricWeight() {
     * return this.volumetricWeight;
     * }
     * 
     * public void setVolumetricWeight(final BigDecimal pVolumetricWeight) {
     * this.volumetricWeight = pVolumetricWeight;
     * }
     */

    /**
     * Gets the <code>routingSegment</code> property.
     * 
     * @return the current value of the <code>routingSegment</code> property.<br>
     */

    public RoutingSegmentDto getRoutingSegment() {
        return this.routingSegment;
    }

    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>routingSegment</code> property.
     * 
     * @param pRoutingSegment
     *            the new value of the <code>routingSegment</code> property.<br>
     */
    public void setRoutingSegment(final RoutingSegmentDto pRoutingSegment) {
        this.routingSegment = pRoutingSegment;
    }

    /**
     * Sets the <code>oId</code> property.
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    public String getXbDateTime() {
        return this.xbDateTime;
    }

    public void setXbDateTime(final String pXbDateTime) {
        this.xbDateTime = pXbDateTime;
    }

    public GoodsDto getBookingsGoods() {
        return this.bookingsGoods;
    }

    public void setBookingsGoods(final GoodsDto pBookingsGoods) {
        this.bookingsGoods = pBookingsGoods;
    }

    public String getIataContourCode() {
        return this.iataContourCode;
    }

    public void setIataContourCode(final String pIataContourCode) {
        this.iataContourCode = ContractUtility.convertToUpperCase(pIataContourCode);
    }

    public WeightUOMType getSignedStationWeightUnit() {
        return this.signedStationWeightUnit;
    }

    public void setSignedStationWeightUnit(final WeightUOMType pSignedStationWeightUnit) {
        this.signedStationWeightUnit = pSignedStationWeightUnit;
    }

    public VolumeUOMType getSignedStationVolUnit() {
        return this.signedStationVolUnit;
    }

    public void setSignedStationVolUnit(final VolumeUOMType pSignedStationVolUnit) {
        this.signedStationVolUnit = pSignedStationVolUnit;
    }

    public String getAdviseMessage() {
        return this.adviseMessage;
    }

    public void setAdviseMessage(final String pAdviseMessage) {
        this.adviseMessage = ContractUtility.convertToUpperCase(pAdviseMessage);
    }

    private String adviseMessage;

    public String getInterChangeTtyAddress() {
        return this.interChangeTtyAddress;
    }

    public void setInterChangeTtyAddress(final String pInterChangeTtyAddress) {
        this.interChangeTtyAddress = pInterChangeTtyAddress;
    }

    public String getAllotmentCategory() {
        return this.allotmentCategory;
    }

    public Date getAllotmentDate() {
        return ContractUtility.getClonedDate(this.allotmentDate);
    }

    public String getAllotmentIdentifier() {
        return this.allotmentIdentifier;
    }

    public FlightInfoDto getAssignedArrivalFlight() {
        return this.assignedArrivalFlight;
    }

    public FlightInfoDto getBookedArrivalFlight() {
        return this.bookedArrivalFlight;
    }

    public BookingFlightStatusType getBookingFlightStatus() {
        return this.bookingFlightStatus;
    }

    public Integer getBookingSegmentNumber() {
        return this.bookingSegmentNumber;
    }

    public BookingStatusType getBookingSegmentStatus() {
        return this.bookingSegmentStatus;
    }

    public String getFlightControllingStationOffice() {
        return this.flightControllingStationOffice;
    }

    public String getTwStatus() {
        return this.twStatus;
    }

    public void setAllotmentCategory(final String pAllotmentCategory) {
        this.allotmentCategory = pAllotmentCategory;
    }

    public void setAllotmentDate(final Date pAllotmentDate) {
        this.allotmentDate = ContractUtility.getClonedDate(pAllotmentDate);
    }

    public void setAllotmentIdentifier(final String pAllotmentIdentifier) {
        this.allotmentIdentifier = ContractUtility.convertToUpperCase(pAllotmentIdentifier);
    }

    public void setAssignedArrivalFlight(final FlightInfoDto pAssignedArrivalFlight) {
        this.assignedArrivalFlight = pAssignedArrivalFlight;
    }

    public void setBookedArrivalFlight(final FlightInfoDto pBookedArrivalFlight) {
        this.bookedArrivalFlight = pBookedArrivalFlight;
    }

    public void setBookingFlightStatus(final BookingFlightStatusType pBookingFlightStatus) {
        this.bookingFlightStatus = pBookingFlightStatus;
    }

    public void setBookingSegmentNumber(final Integer pBookingSegmentNumber) {
        this.bookingSegmentNumber = pBookingSegmentNumber;
    }

    public void setBookingSegmentStatus(final BookingStatusType pBookingSegmentStatus) {
        this.bookingSegmentStatus = pBookingSegmentStatus;
    }

    public void setFlightControllingStationOffice(final String pFlightControllingStationOffice) {
        this.flightControllingStationOffice =
                    ContractUtility.convertToUpperCase(pFlightControllingStationOffice);
    }

    public void setTwStatus(final String pTwStatus) {
        this.twStatus = pTwStatus;
    }

    public BigDecimal getChargeableWeight() {
        return this.chargeableWeight;
    }

    public void setChargeableWeight(final BigDecimal pChargeableWeight) {
        this.chargeableWeight = pChargeableWeight;
    }

    public BigDecimal getGrossWeight() {
        return this.grossWeight;
    }

    public void setGrossWeight(final BigDecimal pGrossWeight) {
        this.grossWeight = pGrossWeight;
    }

    public Long getoId() {
        return this.oId;
    }

    public void setoId(final Long pOId) {
        this.oId = pOId;
    }

    @Override
    public String toString() {
        final StringBuilder aStrBuilder = new StringBuilder();
        if (this.getRoutingSegment() != null) {
            if (this.getRoutingSegment().getOriginStation() != null) {
                aStrBuilder.append(this.getRoutingSegment().getOriginStation());
                aStrBuilder.append(" ");
            }
            if (this.getRoutingSegment().getDestinationStation() != null) {
                aStrBuilder.append(this.getRoutingSegment().getDestinationStation());
                aStrBuilder.append(" ");
            }
            if (this.getRoutingSegment().getFlightNumber() != null) {
                aStrBuilder.append(this.getRoutingSegment().getFlightNumber());
                aStrBuilder.append(" ");
            }
            if (this.getRoutingSegment().getFlightDate() != null) {
                aStrBuilder.append(DateUtility.getFormattedDate(
                    FrameworkConstants.DATEFORMAT,
                    this.getRoutingSegment().getFlightDate()));
                aStrBuilder.append(" ");
            }
            if (this.getRoutingSegment().getSegmentWeight() != null) {
                aStrBuilder.append(this.getRoutingSegment().getSegmentWeight());
                aStrBuilder.append(" ");
            }
            if (this.getRoutingSegment().getPieces() != null) {
                aStrBuilder.append(this.getRoutingSegment().getPieces());
                aStrBuilder.append(" ");
            }
        }
        return aStrBuilder.toString();
    }

}
