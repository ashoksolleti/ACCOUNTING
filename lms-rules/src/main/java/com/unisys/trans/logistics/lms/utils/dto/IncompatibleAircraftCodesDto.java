package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;
import java.util.List;

/**
 * <code>IncompatibleAircraftCodesDto</code> contains specific data applicable
 * to the IncompatibleAircraftCodes.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>aircraftCodes
 * <li>lineNumber
 * </code>
 * </ul>
 */
public class IncompatibleAircraftCodesDto implements Serializable {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 7974870155359327315L;
	/**
	 * Attribute to hold <code>lineNumber</code> property.
	 */
	private int lineNumber;
	/**
	 * Attribute to hold <code>aircraftCodes</code> property.
	 */
	private List<String> aircraftCodes;

	/**
	 * Gets the <code>lineNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>lineNumber</code> property.
	 */
	public int getLineNumber() {
		return this.lineNumber;
	}

	/**
	 * Sets the <code>lineNumber</code> property.
	 * <p>
	 * 
	 * @param pLineNumber
	 *            the current value of the <code>lineNumber</code> property.
	 */
	public void setLineNumber(final int pLineNumber) {
		this.lineNumber = pLineNumber;
	}

	/**
	 * Gets the list of <code>aircraftCodes</code> associated with the
	 * AircraftCodes.
	 * <p>
	 * 
	 * @return the current list of <code>aircraftCodes</code> associated with a
	 *         aircraftCodes.
	 */
	public List<String> getAircraftCodes() {
		return this.aircraftCodes;
	}

	/**
	 * Sets the list of <code>aircraftCodes</code> associated with
	 * sAircraftCodes.
	 * <p>
	 * 
	 * @param pAircraftCodes
	 *            the new list of <code>aircraftCodes</code> associated with
	 *            AircraftCodes.<br>
	 */
	public void setAircraftCodes(final List<String> pAircraftCodes) {
		this.aircraftCodes = pAircraftCodes;
	}

}
