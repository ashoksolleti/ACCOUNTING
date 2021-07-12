package com.unisys.trans.logistics.lms.accounting.dto;

/**
 * 
 */

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * @author ChoukseA
 * 
 */
public class MaintainCityPairIATAMileageFindRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProrateFactorDto prorateFactorDto;
	private List<StationInformationDto> stationList;

	/**
	 * @return the prorateFactorDto
	 */
	public ProrateFactorDto getProrateFactorDto() {
		return prorateFactorDto;
	}

	/**
	 * @param prorateFactorDto
	 *            the prorateFactorDto to set
	 */
	public void setProrateFactorDto(ProrateFactorDto prorateFactorDto) {
		this.prorateFactorDto = prorateFactorDto;
	}

	/**
	 * @return the stationList
	 */
	public List<StationInformationDto> getStationList() {
		return stationList;
	}

	/**
	 * @param stationList
	 *            the stationList to set
	 */
	public void setStationList(List<StationInformationDto> stationList) {
		this.stationList = stationList;
	}
}
