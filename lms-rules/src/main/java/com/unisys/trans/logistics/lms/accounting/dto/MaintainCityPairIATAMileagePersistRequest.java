package com.unisys.trans.logistics.lms.accounting.dto;

/**
 * 
 */

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * @author ChoukseA
 * 
 */
public class MaintainCityPairIATAMileagePersistRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProrateFactorDto prorateFactorDto;
	private List<ProrateFactorDto> prorateFactorDtoList = new ArrayList<ProrateFactorDto>();
	private boolean confirmDuplicateProrateEntry = false;
	private List<StationInformationDto> stationList;

	/**
	 * @return the prorateFactorDto
	 */
	public ProrateFactorDto getProrateFactorDto() {
		return prorateFactorDto;
	}

	/**
	 * @param prorateFactorDto the prorateFactorDto to set
	 */
	public void setProrateFactorDto(ProrateFactorDto prorateFactorDto) {
		this.prorateFactorDto = prorateFactorDto;
	}

	/**
	 * @return the prorateFactorDtoList
	 */
	public List<ProrateFactorDto> getProrateFactorDtoList() {
		return prorateFactorDtoList;
	}

	/**
	 * @param prorateFactorDtoList the prorateFactorDtoList to set
	 */
	public void setProrateFactorDtoList(List<ProrateFactorDto> prorateFactorDtoList) {
		this.prorateFactorDtoList = prorateFactorDtoList;
	}

	/**
	 * @return the confirmDuplicateProrateEntry
	 */
	public boolean isConfirmDuplicateProrateEntry() {
		return confirmDuplicateProrateEntry;
	}

	/**
	 * @param confirmDuplicateProrateEntry
	 *            the confirmDuplicateProrateEntry to set
	 */
	public void setConfirmDuplicateProrateEntry(
			boolean confirmDuplicateProrateEntry) {
		this.confirmDuplicateProrateEntry = confirmDuplicateProrateEntry;
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
