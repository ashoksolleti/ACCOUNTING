package com.unisys.trans.logistics.lms.awb.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class LocationDetailsDto implements Serializable {

	private static final long serialVersionUID = -2888821369282403442L;

	private String currStation;

	private String locationIdentifier;

	private String locationType;

	private Integer maxPcs;

	private BigDecimal maxWgt;

	private BigDecimal maxVol;

    private String aircraftType;
    
	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public Integer getMaxPcs() {
		return maxPcs;
	}

	public void setMaxPcs(Integer maxPcs) {
		this.maxPcs = maxPcs;
	}

	public BigDecimal getMaxWgt() {
		return maxWgt;
	}

	public void setMaxWgt(BigDecimal maxWgt) {
		this.maxWgt = maxWgt;
	}

	public BigDecimal getMaxVol() {
		return maxVol;
	}

	public void setMaxVol(BigDecimal maxvol) {
		this.maxVol = maxvol;
	}

	public String getCurrStation() {
		return currStation;
	}

	public void setCurrStation(String currStation) {
		this.currStation = currStation;
	}

	public String getLocationIdentifier() {
		return locationIdentifier;
	}

	public void setLocationIdentifier(String locationIdentifier) {
		this.locationIdentifier = locationIdentifier;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

}
