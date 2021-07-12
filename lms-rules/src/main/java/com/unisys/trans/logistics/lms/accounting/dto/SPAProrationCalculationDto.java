package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class SPAProrationCalculationDto {
	
	private String acn;
	private Date inputDate;
	private List<BookingSegmentDto> bookingSegmentDtos;
	private List<RatingLineEntryDto> ratinglineDtos;
	
	public List<BookingSegmentDto> getBookingSegmentDtos() {
		return bookingSegmentDtos;
	}
	public void setBookingSegmentDtos(List<BookingSegmentDto> bookingSegmentDtos) {
		this.bookingSegmentDtos = bookingSegmentDtos;
	}
	public List<RatingLineEntryDto> getRatinglineDtos() {
		return ratinglineDtos;
	}
	public void setRatinglineDtos(List<RatingLineEntryDto> ratinglineDtos) {
		this.ratinglineDtos = ratinglineDtos;
	}
	public Date getInputDate() {
		return ContractUtility.getClonedDate(inputDate); 
	}
	public void setInputDate(Date inputDate) {
		this.inputDate =ContractUtility.getClonedDate(inputDate); 
	}
	public String getAcn() {
		return acn;
	}
	public void setAcn(String acn) {
		this.acn = acn;
	}

}
