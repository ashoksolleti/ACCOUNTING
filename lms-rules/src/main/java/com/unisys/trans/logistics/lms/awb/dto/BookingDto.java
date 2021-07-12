/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.awb.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class BookingDto extends PersistenceObjectDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -715882489513638716L;

	private String bookingControlStation;

	private String bookingControlStatus;

	private String bookingCreationSource;

	private Date bookingDateTime;

	private String bookingReferenceNumber;

	private String deleteRemarks;

	private String emailAddress;

	private String flightControlOfficeQueue;

	private Long oId;

	private String rebookReasonCode;

	private String remarks1;

	private String remarks2;

	private String remarks3;

	private long revision;

	private FlightInfoDto arrivalFlight1;
	
	private WorkOrderDto workOrder;
	
	

    

    public long getRevision() {
		return revision;
	}

	public void setRevision(long revision) {
		this.revision = revision;
	}

	/**
     * 
     */
	private String remarks4;

	private Integer requestSegmentNumber;

	private List<BookingSegmentDto> segments;

	private String splitBookingIndicator;

	private Integer suggestedPieces;

	private BigDecimal suggestedVolume;

	private BigDecimal suggestedWeight;

	private WeightUOMType suggestedWeightUnit;

	/**
	 * 
	 */
	private String vcbIndicator;

	private String reasonCode;
	
	private boolean deleteInd;
	
    public boolean isDeleteInd() {
		return deleteInd;
	}

	public void setDeleteInd(boolean deleteInd) {
		this.deleteInd = deleteInd;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getBookingControlStation() {
		return bookingControlStation;
	}

	public String getBookingControlStatus() {
		return bookingControlStatus;
	}

	public String getBookingCreationSource() {
		return bookingCreationSource;
	}

	public Date getBookingDateTime() {
		return bookingDateTime;
	}

	public String getBookingReferenceNumber() {
		return bookingReferenceNumber;
	}

	public String getDeleteRemarks() {
		return deleteRemarks;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getFlightControlOfficeQueue() {
		return flightControlOfficeQueue;
	}

	public Long getOId() {

		return oId;
	}

	public String getRebookReasonCode() {
		return rebookReasonCode;
	}

	public String getRemarks1() {
		return remarks1;
	}

	public String getRemarks2() {
		return remarks2;
	}

	public String getRemarks3() {
		return remarks3;
	}

	public String getRemarks4() {
		return remarks4;
	}

	public Integer getRequestSegmentNumber() {
		return requestSegmentNumber;
	}

	public List<BookingSegmentDto> getSegments() {
		return segments;
	}

	public String getSplitBookingIndicator() {
		return splitBookingIndicator;
	}

	public Integer getSuggestedPieces() {
		return suggestedPieces;
	}

	public BigDecimal getSuggestedVolume() {

		if (suggestedVolume != null) {
			suggestedVolume = suggestedVolume.setScale(2,
					BigDecimal.ROUND_HALF_EVEN);
		}
		return suggestedVolume;
	}

	public BigDecimal getSuggestedWeight() {
		if (suggestedWeight != null) {
			suggestedWeight = suggestedWeight.setScale(1,
					BigDecimal.ROUND_HALF_EVEN);
		}
		return suggestedWeight;
	}

	public WeightUOMType getSuggestedWeightUnit() {
		return suggestedWeightUnit;
	}

	public String getVcbIndicator() {
		return vcbIndicator;
	}

	public void setBookingControlStation(String bookingControlStation) {
		this.bookingControlStation = bookingControlStation;
	}

	public void setBookingControlStatus(String bookingControlStatus) {
		this.bookingControlStatus = bookingControlStatus;
	}

	public void setBookingCreationSource(String bookingCreationSource) {
		this.bookingCreationSource = bookingCreationSource;
	}

	public void setBookingDateTime(Date bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}

	public void setBookingReferenceNumber(String bookingReferenceNumber) {
		this.bookingReferenceNumber = bookingReferenceNumber;
	}

	public void setDeleteRemarks(String deleteRemarks) {
		this.deleteRemarks = deleteRemarks;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setFlightControlOfficeQueue(String flightControlOfficeQueue) {
		this.flightControlOfficeQueue = flightControlOfficeQueue;
	}

	public void setOId(Long oId) {
		this.oId = oId;
	}

	public void setRebookReasonCode(String rebookReasonCode) {
		this.rebookReasonCode = rebookReasonCode;
	}

	public void setRemarks1(String remarks1) {
		this.remarks1 = remarks1;
	}

	public void setRemarks2(String remarks2) {
		this.remarks2 = remarks2;
	}

	public void setRemarks3(String remarks3) {
		this.remarks3 = remarks3;
	}

	public void setRemarks4(String remarks4) {
		this.remarks4 = remarks4;
	}

	public void setRequestSegmentNumber(Integer requestSegmentNumber) {
		this.requestSegmentNumber = requestSegmentNumber;
	}

	public void setSegments(List<BookingSegmentDto> segments) {
		this.segments = segments;
	}

	public void setSplitBookingIndicator(String splitBookingIndicator) {
		this.splitBookingIndicator = splitBookingIndicator;
	}

	public void setSuggestedPieces(Integer suggestedPieces) {
		this.suggestedPieces = suggestedPieces;
	}

	public void setSuggestedVolume(BigDecimal suggestedVolume) {
		this.suggestedVolume = suggestedVolume;
	}

	public void setSuggestedWeight(BigDecimal suggestedWeight) {
		this.suggestedWeight = suggestedWeight;
	}

	public void setSuggestedWeightUnit(WeightUOMType suggestedWeightUnit) {
		this.suggestedWeightUnit = suggestedWeightUnit;
	}

	public void setVcbIndicator(String vcbIndicator) {
		this.vcbIndicator = vcbIndicator;
	}
	
	public FlightInfoDto getArrivalFlight1() {
        return arrivalFlight1;
    }

    public void setArrivalFlight1(FlightInfoDto arrivalFlight1) {
        this.arrivalFlight1 = arrivalFlight1;
    }
    
    public WorkOrderDto getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(WorkOrderDto workOrder) {
        this.workOrder = workOrder;
    }

}
