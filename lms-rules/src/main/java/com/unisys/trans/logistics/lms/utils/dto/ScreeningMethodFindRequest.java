package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ScreeningMethodFindRequest extends AbstractRequest{

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	private String station;
	
	private String office;

	/**
	 * @return the station
	 */
	public String getStation() {
		return station;
	}

	/**
	 * @param station the station to set
	 */
	public void setStation(String station) {
		this.station = station;
	}

	/**
	 * @return the office
	 */
	public String getOffice() {
		return office;
	}

	/**
	 * @param office the office to set
	 */
	public void setOffice(String office) {
		this.office = office;
	}
	
}
