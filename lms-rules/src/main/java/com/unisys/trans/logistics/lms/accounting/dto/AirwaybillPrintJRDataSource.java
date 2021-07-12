package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

public class AirwaybillPrintJRDataSource {

	private List<RatingLineEntryDto> ratingLineEntryList;
	
	public List<RatingLineEntryDto> getRatingLineEntryList() {
		return ratingLineEntryList;
	}
	public void setRatingLineEntryList(List<RatingLineEntryDto> ratingLineEntryList) {
		this.ratingLineEntryList = ratingLineEntryList;
	}

}
