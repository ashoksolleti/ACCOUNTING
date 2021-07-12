package com.unisys.trans.logistics.lms.awb.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.BookingFlightStatusType;
import com.unisys.trans.logistics.lms.framework.constants.BookingStatusType;
import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class BookingSegmentDto extends PersistenceObjectDto {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private String adviseMessage;

	private String aircraftType;
    
	private String allotmentCategory;
	
	private Date allotmentDate;
	
	private String allotmentName;
	
	private String allotmentIdentifier;
	
	private FlightInfoDto assignedArrivalFlight;

	private String awbOriginIataArea;

	/**
     * Attribute to holds <code>airwaybillRoute</code> property.
     */
    private RoutingSegmentDto awbRoute;

	private FlightInfoDto bookedArrivalFlight;

    private BookingFlightStatusType bookingFlightStatus;

    private Integer bookingSegmentNumber;
    
    private Long bookingOid;

    private RoutingSegmentDto bookingSegmentRoute;
    
    private BookingStatusType bookingSegmentStatus;
    
    private String flightControllingStationOffice;
    
    private String iataContourCode;
    
	private String interChangeTtyAddress;

    /**
     * Attribute to holds <code>oId</code> property.
     */
    private Long oId;

	private String queueReasonType;

	private VolumeUOMType signedStationVolUnit;
	
	 private WeightUOMType signedStationWeightUnit;
	 
	 private String twStatus;
	 
	 private Date xbDateTime;
	 
	  private String aircraftVersion;
	    private String wideBodyIndicator;
	 private GoodsDto goods;
	 private Long timeToDeadline;

    public GoodsDto getGoods() {
        return goods;
    }

    public void setGoods(GoodsDto goods) {
        this.goods = goods;
    }

    public String getAdviseMessage() {
        return adviseMessage;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public String getAllotmentCategory() {
        return allotmentCategory;
    }

    public Date getAllotmentDate() {
        return allotmentDate;
    }

    public String getAllotmentIdentifier() {
        return allotmentIdentifier;
    }

    public FlightInfoDto getAssignedArrivalFlight() {
        return assignedArrivalFlight;
    }

    public String getAwbOriginIataArea() {
        return awbOriginIataArea;
    }

    /**
     * Gets the <code>airwaybillRoute</code> property.
     * <p>
     * 
     */
    public RoutingSegmentDto getAwbRoute() {
        return this.awbRoute;
    }

    public FlightInfoDto getBookedArrivalFlight() {
        return bookedArrivalFlight;
    }

    public BookingFlightStatusType getBookingFlightStatus() {
        return bookingFlightStatus;
    }

    public Integer getBookingSegmentNumber() {
        return bookingSegmentNumber;
    }

    public RoutingSegmentDto getBookingSegmentRoute() {
        return bookingSegmentRoute;
    }

    public BookingStatusType getBookingSegmentStatus() {
        return bookingSegmentStatus;
    }

    public String getFlightControllingStationOffice() {
        return flightControllingStationOffice;
    }

    public String getIataContourCode() {
        return iataContourCode;
    }

    public String getInterChangeTtyAddress() {
        return interChangeTtyAddress;
    }
    
    public Long getOId() {

        return this.oId;
    }
    
    public String getQueueReasonType() {
        return queueReasonType;
    }
    
    
    public VolumeUOMType getSignedStationVolUnit() {
        return signedStationVolUnit;
    }

    public WeightUOMType getSignedStationWeightUnit() {
        return signedStationWeightUnit;
    }

    public String getTwStatus() {
        return twStatus;
    }

    public Date getXbDateTime() {
        return xbDateTime;
    }

    public void setAdviseMessage(String adviseMessage) {
        this.adviseMessage = adviseMessage;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public void setAllotmentCategory(String allotmentCategory) {
        this.allotmentCategory = allotmentCategory;
    }

    public void setAllotmentDate(Date allotmentDate) {
        this.allotmentDate = allotmentDate;
    }

    public void setAllotmentIdentifier(String allotmentIdentifier) {
        this.allotmentIdentifier = allotmentIdentifier;
    }

    public void setAssignedArrivalFlight(FlightInfoDto assignedArrivalFlight) {
        this.assignedArrivalFlight = assignedArrivalFlight;
    }

    public void setAwbOriginIataArea(String awbOriginIataArea) {
        this.awbOriginIataArea = awbOriginIataArea;
    }

    /**
     * Sets the <code>airwaybillRoute</code> property.
     * <p>
     * 
     *            the new value of the <code>airwaybillRoute</code> property.
     */
    public void setAwbRoute(final RoutingSegmentDto pRoute) {
        this.awbRoute = pRoute;
    }

    public void setBookedArrivalFlight(FlightInfoDto bookedArrivalFlight) {
        this.bookedArrivalFlight = bookedArrivalFlight;
    }


    public void setBookingFlightStatus(BookingFlightStatusType bookingFlightStatus) {
        this.bookingFlightStatus = bookingFlightStatus;
    }
	
	public void setBookingSegmentNumber(Integer bookingSegmentNumber) {
        this.bookingSegmentNumber = bookingSegmentNumber;
    }

    public void setBookingSegmentRoute(RoutingSegmentDto bookingSegmentRoute) {
        this.bookingSegmentRoute = bookingSegmentRoute;
    }

    public void setBookingSegmentStatus(BookingStatusType bookingSegmentStatus) {
        this.bookingSegmentStatus = bookingSegmentStatus;
    }
	
	public void setFlightControllingStationOffice(String flightControllingStationOffice) {
        this.flightControllingStationOffice = flightControllingStationOffice;
    }
	
	public void setIataContourCode(String iataContourCode) {
        this.iataContourCode = iataContourCode;
    }
	

	public void setInterChangeTtyAddress(String interChangeTtyAddress) {
        this.interChangeTtyAddress = interChangeTtyAddress;
    }
	
	/**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     *            the new value of the <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }
	
	public void setQueueReasonType(String queueReasonType) {
        this.queueReasonType = queueReasonType;
    }

    public void setSignedStationVolUnit(VolumeUOMType signedStationVolUnit) {
        this.signedStationVolUnit = signedStationVolUnit;
    }

    public void setSignedStationWeightUnit(WeightUOMType signedStationWeightUnit) {
        this.signedStationWeightUnit = signedStationWeightUnit;
    }

    public void setTwStatus(String twStatus) {
        this.twStatus = twStatus;
    }

    public void setXbDateTime(Date xbDateTime) {
        this.xbDateTime = xbDateTime;
    }

	public Long getBookingOid() {
		return bookingOid;
	}

	public void setBookingOid(Long bookingOid) {
		this.bookingOid = bookingOid;
	}
	 public Long getTimeToDeadline() {
	        return timeToDeadline;
	 }

	 public void setTimeToDeadline(Long timeToDeadline) {
	     this.timeToDeadline = timeToDeadline;
	 }

	/**
	 * @return the allotmentName
	 */
	public String getAllotmentName() {
		return allotmentName;
	}

	/**
	 * @param allotmentName the allotmentName to set
	 */
	public void setAllotmentName(String allotmentName) {
		this.allotmentName = allotmentName;
	}
    /**
     * @return the aircraftVersion
     */
    public String getAircraftVersion() {
        return aircraftVersion;
    }
    /**
     * @param aircraftVersion the aircraftVersion to set
     */
    public void setAircraftVersion(String aircraftVersion) {
        this.aircraftVersion = aircraftVersion;
    }
    /**
     * @return the wideBodyIndicator
     */
    public String getWideBodyIndicator() {
        return this.wideBodyIndicator;
    }
    /**
     * @param wideBodyIndicator the wideBodyIndicator to set
     */
    public void setWideBodyIndicator(final String wideBodyIndicator) {
        this.wideBodyIndicator = wideBodyIndicator;
    }
}
