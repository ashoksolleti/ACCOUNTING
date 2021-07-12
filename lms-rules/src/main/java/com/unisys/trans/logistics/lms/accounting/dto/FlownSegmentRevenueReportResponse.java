package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.ParticipantBillingReportDto;
import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * The type Flown segment revenue report response.
 */
public class FlownSegmentRevenueReportResponse extends AbstractResponse {

	private static final long serialVersionUID = 1L;
	
	private FlownSegmentRevenueDto flownSegmentRevenueDto= new FlownSegmentRevenueDto();
	
	private List<FlownSegmentRevenueDto> flownSegmentRevenueDtoList=new ArrayList<FlownSegmentRevenueDto>();
	
	private String noRecordFoundMessage;

	private boolean error;

	private int totalNumberofRecords;

	/**
	 * Gets no record found message.
	 *
	 * @return the noRecordFoundMessage
	 */
	public String getNoRecordFoundMessage() {
		return noRecordFoundMessage;
	}

	/**
	 * Sets no record found message.
	 *
	 * @param noRecordFoundMessage the noRecordFoundMessage to set
	 */
	public void setNoRecordFoundMessage(String noRecordFoundMessage) {
		this.noRecordFoundMessage = noRecordFoundMessage;
	}

	/**
	 * Is error boolean.
	 *
	 * @return the error
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * Sets error.
	 *
	 * @param error the error to set
	 */
	public void setError(boolean error) {
		this.error = error;
	}

	/**
	 * Gets flown segment revenue dto.
	 *
	 * @return the flown segment revenue dto
	 */
	public FlownSegmentRevenueDto getFlownSegmentRevenueDto() {
		return flownSegmentRevenueDto;
	}

	/**
	 * Sets flown segment revenue dto.
	 *
	 * @param flownSegmentRevenueDto the flown segment revenue dto
	 */
	public void setFlownSegmentRevenueDto(
			FlownSegmentRevenueDto flownSegmentRevenueDto) {
		this.flownSegmentRevenueDto = flownSegmentRevenueDto;
	}

	/**
	 * Gets flown segment revenue dto list.
	 *
	 * @return the flown segment revenue dto list
	 */
	public List<FlownSegmentRevenueDto> getFlownSegmentRevenueDtoList() {
		return flownSegmentRevenueDtoList;
	}

	/**
	 * Sets flown segment revenue dto list.
	 *
	 * @param flownSegmentRevenueDtoList the flown segment revenue dto list
	 */
	public void setFlownSegmentRevenueDtoList(
			List<FlownSegmentRevenueDto> flownSegmentRevenueDtoList) {
		this.flownSegmentRevenueDtoList = flownSegmentRevenueDtoList;
	}

	/**
	 * Gets total numberof records.
	 *
	 * @return the total numberof records
	 */
	public int getTotalNumberofRecords() {
		return totalNumberofRecords;
	}

	/**
	 * Sets total numberof records.
	 *
	 * @param totalNumberofRecords the total numberof records
	 */
	public void setTotalNumberofRecords(int totalNumberofRecords) {
		this.totalNumberofRecords = totalNumberofRecords;
	}

	/**
	 * @return the participantBillingReportDto
	 */


	
}

