package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class StationInformationDto extends PersistenceObjectDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5042678123498467878L;

	/**
	 * Registered Station ID Number in the database.
	 */
	private String fldStationID;

	/**
	 * Registered Airport Name in the database.
	 */
	private String fldAirportName;

	/**
	 * Airport Service City Name in the database.
	 */
	private String fldServiceCityName;

	/**
	 * @return the fldAirportName
	 */
	public final String getFldAirportName() {
		return fldAirportName;
	}

	/**
	 * @param fldAirportName
	 *            to set.
	 */
	public final void setFldAirportName(final String fldAirportName) {
		this.fldAirportName = fldAirportName;
	}

	public String getFldStationID() {
		return fldStationID;
	}

	public void setFldStationID(String fldStationID) {
		this.fldStationID = fldStationID;
	}

	/**
	 * @return the fldServiceCityName
	 */
	public final String getFldServiceCityName() {
		return fldServiceCityName;
	}

	/**
	 * @param fldServiceCityName
	 *            to set
	 */
	public final void setFldServiceCityName(final String fldServiceCityName) {
		this.fldServiceCityName = fldServiceCityName;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}
}