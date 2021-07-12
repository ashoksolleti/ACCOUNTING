package com.unisys.trans.logistics.lms.framework.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;

public class SPLUNNumberdto {

	private List<UNNumberDto> unNumberDtos= new ArrayList<UNNumberDto>();
	
	private List<AirWaybillSpecialHandlingCodeDto> splCodes=new ArrayList<AirWaybillSpecialHandlingCodeDto>();
	
	private WeightUOMType weightUnit;

	/**
	 * @return the unNumberDtos
	 */
	public List<UNNumberDto> getUnNumberDtos() {
		
		return unNumberDtos;
	}

	/**
	 * @param unNumberDtos the unNumberDtos to set
	 */
	public void setUnNumberDtos(List<UNNumberDto> unNumberDtos) {
		this.unNumberDtos = unNumberDtos;
	}

	/**
	 * @return the splCodes
	 */
	public List<AirWaybillSpecialHandlingCodeDto> getSplCodes() {
		return splCodes;
	}

	/**
	 * @param splCodes the splCodes to set
	 */
	public void setSplCodes(List<AirWaybillSpecialHandlingCodeDto> splCodes) {
		this.splCodes = splCodes;
	}

	/**
	 * @return the weightUnit
	 */
	public WeightUOMType getWeightUnit() {
		return weightUnit;
	}

	/**
	 * @param weightUnit the weightUnit to set
	 */
	public void setWeightUnit(WeightUOMType weightUnit) {
		this.weightUnit = weightUnit;
	}
	
	
	
}
