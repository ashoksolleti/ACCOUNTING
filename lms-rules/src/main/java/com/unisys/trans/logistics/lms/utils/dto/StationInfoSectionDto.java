package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.utils.constants.SectionType;

public class StationInfoSectionDto extends PersistenceObjectDto {

	private SectionType sectionName;
	/**
	 * 
	 */
	private static final long serialVersionUID = -1431621531075361725L;

	private List<StationInfoSectionLabelDto> stationInfoSectionLabels;
	

	public SectionType getSectionName() {
		return sectionName;
	}

	public void setSectionName(SectionType sectionName) {
		this.sectionName = sectionName;
	}

	public List<StationInfoSectionLabelDto> getStationInfoSectionLabels() {
		return stationInfoSectionLabels;
	}

	public void setStationInfoSectionLabels(
			List<StationInfoSectionLabelDto> stationInfoSectionLabels) {
		this.stationInfoSectionLabels = stationInfoSectionLabels;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

}