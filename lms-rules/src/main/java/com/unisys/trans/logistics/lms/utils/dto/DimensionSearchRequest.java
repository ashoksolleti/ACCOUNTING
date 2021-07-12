package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>DimensionSearchRequest</code> retrieves the
 * <code>Dimension information</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>aircraftSegments
 * <li>packageDimensions
 * <li>rotationIndictor
 * </code>
 * </ul>
 */
public class DimensionSearchRequest extends AbstractRequest {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 1058683031031748328L;
	/**
	 * Attribute to hold <code>aircraftSegments</code> property.
	 */
	private List<AircraftSegmentDto> aircraftSegments;
	/**
	 * Attribute to hold <code>packageDimensions</code> property.
	 */
	private List<PackageDimensionDto> packageDimensions;
	/**
	 * Attribute to hold <code>rotationIndictor</code> property.
	 */
	private boolean rotationIndictor;

	/**
	 * Gets the <code>rotationIndictor</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>rotationIndictor</code> property.
	 */
	public boolean isRotationIndictor() {
		return rotationIndictor;
	}

	/**
	 * Sets the <code>rotationIndictor</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pRotationIndictor
	 *            the current value of the <code>rotationIndictor</code>
	 *            property.
	 */
	public void setRotationIndictor(final boolean pRotationIndictor) {
		this.rotationIndictor = pRotationIndictor;
	}

	/**
	 * Gets the list of <code>PackageDimensions</code> associated with the
	 * PackageDimensionDto.
	 * <p>
	 * 
	 * @return the current list of <code>PackageDimensions</code> associated
	 *         with a PackageDimensionDto.
	 */
	public List<PackageDimensionDto> getPackageDimensions() {
		return this.packageDimensions;
	}

	/**
	 * Gets the list of <code>AircraftSegments</code> associated with the
	 * AircraftSegmentDto.
	 * <p>
	 * 
	 * @return the current list of <code>AircraftSegments</code> associated with
	 *         a AircraftSegmentDto.
	 */
	public List<AircraftSegmentDto> getAircraftSegments() {
		return this.aircraftSegments;
	}

	/**
	 * Sets the list of <code>aircraftSegments</code> associated with
	 * AircraftSegments.
	 * <p>
	 * 
	 * @param pAircraftSegmentDto
	 *            the new list of <code>aircraftSegments</code> associated with
	 *            aircraftSegments.<br>
	 * 
	 */
	public void setAircraftSegments(
			final List<AircraftSegmentDto> pAircraftSegmentDto) {
		this.aircraftSegments = pAircraftSegmentDto;
	}

	/**
	 * Sets the list of <code>packageDimensions</code> associated with Spot
	 * Rate.
	 * <p>
	 * 
	 * @param pPackageDimensionDto
	 *            the new list of <code>packageDimensions</code> associated with
	 *            packageDimensions.<br>
	 * 
	 */
	public void setPackageDimensions(
			final List<PackageDimensionDto> pPackageDimensionDto) {
		this.packageDimensions = pPackageDimensionDto;
	}

}
