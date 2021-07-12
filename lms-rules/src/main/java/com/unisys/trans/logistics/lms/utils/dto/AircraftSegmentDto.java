package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;

/**
 * <code>AircraftSegmentDto</code> retrieves the <code>AircraftSegment information</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>segmentId
 * <li>airCraftType
 * <li>allowedIndicator
 * </ul>
 * </code>
 */
public class AircraftSegmentDto implements Serializable {

	/**
	 * Serial Version.
	 */
	private static final long serialVersionUID = 7005418109596539475L;
	/**
	 * Attribute to hold <code>segmentId</code> property.
	 */
	private int segmentId;
	/**
	 * Attribute to hold <code>aircraftType</code> property.
	 */
	private String aircraftType;
	/**
	 * Attribute to hold <code>allowedIndicator</code> property.
	 */
	private boolean allowedIndicator;

	/**
	 * Gets the segmentId details.
	 * <p>
	 * 
	 * @return segmentId
	 * 
	 */
	public int getSegmentId() {
		return this.segmentId;
	}

	/**
	 * Sets the <code>segmentId</code> property.
	 * <p>
	 * 
	 * @param pSegmentId
	 *            the new value of the <code>segmentId</code> property.
	 */
	public void setSegmentId(final int pSegmentId) {
		this.segmentId = pSegmentId;
	}

	/**
	 * Gets the aircraftType details.
	 * <p>
	 * 
	 * @return aircraftType
	 * 
	 */
	public String getAircraftType() {
		return this.aircraftType;
	}

	/**
	 * Sets the <code>aircraftType</code> property.
	 * <p>
	 * 
	 * @param pAircraftType
	 *            the new value of the <code>aircraftType</code> property.
	 */
	public void setAircraftType(final String pAircraftType) {
		this.aircraftType = pAircraftType;
	}

	/**
	 * Gets the allowedIndicator details.
	 * <p>
	 * 
	 * @return allowedIndicator
	 * 
	 */
	public boolean isAllowedIndicator() {
		return this.allowedIndicator;
	}

	/**
	 * Sets the <code>allowedIndicator</code> property.
	 * <p>
	 * 
	 * @param pAllowedIndicator
	 *            the new value of the <code>allowedIndicator</code> property.
	 */
	public void setAllowedIndicator(final boolean pAllowedIndicator) {
		this.allowedIndicator = pAllowedIndicator;
	}

}
