package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>DimensionSearchResponse</code> contains the response of the maintenance request received by
 * <code>DimensionService</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>aircraftSegments</code></li>
 * </ul>
 */
public class DimensionSearchResponse extends AbstractResponse {
	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -669866479556189911L;

	/**
	 * Attribute to hold <code>incompatibleAircraftCodes</code> property.
	 */
	private List<IncompatibleAircraftCodesDto> incompatibleAircraftCodes;
	/**
	 * Attribute to hold <code>aircraftSegments</code> property.
	 */
	private List<AircraftSegmentDto> aircraftSegments;

	/**
	 * Gets the list of <code>AircraftCodes</code> associated with the
	 * AircraftCodes.
	 * <p>
	 * 
	 * @return the current list of <code>AircraftCodes</code> associated with a
	 *         AircraftCodes.
	 */
	public List<IncompatibleAircraftCodesDto> getIncompatibleAircraftCodes() {
		return this.incompatibleAircraftCodes;
	}

	/**
	 * Gets the list of <code>AircraftSegments</code> associated with the
	 * AircraftSegments.
	 * <p>
	 * 
	 * @return the current list of <code>AircraftSegments</code> associated with
	 *         a AircraftSegments.
	 */
	public List<AircraftSegmentDto> getAircraftSegments() {
		return this.aircraftSegments;
	}

	/**
	 * Sets the list of <code>AircraftCodes</code> associated with Aircrafts.
	 * <p>
	 * 
	 * @param pIncompatibleAircraftCodesDto
	 *            the new list of <code>AircraftCodes</code> associated with
	 *            AircraftDimension.<br>
	 * 
	 */
	public void setIncompatibleAircraftCodes(
			final List<IncompatibleAircraftCodesDto> pIncompatibleAircraftCodesDto) {
		this.incompatibleAircraftCodes = pIncompatibleAircraftCodesDto;
	}

	/**
	 * Sets the list of <code>aircraftSegments</code> associated with Aircrafts.
	 * <p>
	 * 
	 * @param pAircraftSegmentDto
	 *            the new list of <code>aircraftSegments</code> associated with
	 *            AircraftDimension.<br>
	 * 
	 */
	public void setAircraftSegments(
			final List<AircraftSegmentDto> pAircraftSegmentDto) {
		this.aircraftSegments = pAircraftSegmentDto;
	}

}
