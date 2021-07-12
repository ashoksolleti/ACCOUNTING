package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This represents the Booking Information of the air waybill 
 */
public class BookingDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8039145923287693325L;
	/**
	 * This list identifies the list of booking segments present in the booking.
	 */
	private List<BookingSegmentDto> bookingSegment;

	public List<BookingSegmentDto> getBookingSegment() {
		return bookingSegment;
	}

	public void setBookingSegment(List<BookingSegmentDto> bookingSegment) {
		this.bookingSegment = bookingSegment;
	}
	
	public void addBookingSegment(BookingSegmentDto bookingSegment) {
		if (this.bookingSegment == null) {
			this.bookingSegment = new ArrayList<BookingSegmentDto>();
		}
		this.bookingSegment.add(bookingSegment);
	}
	
}