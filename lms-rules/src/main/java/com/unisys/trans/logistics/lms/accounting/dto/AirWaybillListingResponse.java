package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * 
 * Response class for the AirWaybill Information
 * 
 * @author AhirwaUK
 *
 */
public class AirWaybillListingResponse extends AbstractResponse{

	private static final long serialVersionUID = 1L;
	
	private AirWaybillListingDto airWaybillListingDto = new AirWaybillListingDto();
	private List<AirWaybillListingDto> airWaybillDtoList=new ArrayList<AirWaybillListingDto>();
	
	private Set<AirWaybillListingDto> airWaybillDtoSet = new HashSet<AirWaybillListingDto>();
	
	private String noRecordFoundMessage;

	private boolean error;
	
	private int numberOfPages;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/**
	 * @return the noRecordFoundMessage
	 */
	public String getNoRecordFoundMessage() {
		return noRecordFoundMessage;
	}

	/**
	 * @param noRecordFoundMessage the noRecordFoundMessage to set
	 */
	public void setNoRecordFoundMessage(String noRecordFoundMessage) {
		this.noRecordFoundMessage = noRecordFoundMessage;
	}

	/**
	 * @return the error
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(boolean error) {
		this.error = error;
	}
	
	public AirWaybillListingDto getAirWaybillListingDto() {
		return airWaybillListingDto;
	}

	public void setAirWaybillListingDto(AirWaybillListingDto airWaybillListingDto) {
		this.airWaybillListingDto = airWaybillListingDto;
	}

	public List<AirWaybillListingDto> getAirWaybillDtoList() {
		return airWaybillDtoList;
	}

	public void setAirWaybillDtoList(List<AirWaybillListingDto> airWaybillDtoList) {
		this.airWaybillDtoList = airWaybillDtoList;
	}

	public Set<AirWaybillListingDto> getAirWaybillDtoSet() {
		return airWaybillDtoSet;
	}

	public void setAirWaybillDtoSet(Set<AirWaybillListingDto> airWaybillDtoSet) {
		this.airWaybillDtoSet = airWaybillDtoSet;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	
}