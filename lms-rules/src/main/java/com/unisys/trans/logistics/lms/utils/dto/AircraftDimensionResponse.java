package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>AircraftDimensionResponse</code> contains the response of the
 * maintenance request received by <code>AircraftDimensionService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>aircraftDimensionDtos
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDto
 */

public class AircraftDimensionResponse extends AbstractResponse {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 1159531536967306701L;

	/**
	 * Attribute to hold <code>AircraftDimensionDto</code> property.
	 */
	private List<AircraftDimensionDto> aircraftDimensionDtos;

	/**
	 * <code>Default constructor.</code>
	 */
	public AircraftDimensionResponse() {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "AircraftDimensionResponse [aircraftDimensionDtos="
				+ aircraftDimensionDtos + "]";
	}

	/**
	 * Gets the list of <code>aircraftDimensionDtos</code> associated with the
	 * DimensionEntryDto.
	 * <p>
	 * 
	 * @return the current list of <code>aircraftDimensionDtos</code> associated
	 *         with a aircraftDimensions.
	 */

	public List<AircraftDimensionDto> getAircraftDimensionDtos() {
		return this.aircraftDimensionDtos;
	}

	/**
	 * Sets the value of <code>aircraftDimensionDtos</code> property.
	 * <p>
	 * 
	 * @param pAircraftDimensionDtos
	 *            the new value of <code>aircraftDimensionDtos</code> property.
	 */

	public void setAircraftDimensionDtos(
			final List<AircraftDimensionDto> pAircraftDimensionDtos) {
		this.aircraftDimensionDtos = pAircraftDimensionDtos;
	}

}
