/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * Gets the <code>HolidayType</code> property.
 * <p>
 * <code>HolidayType</code> class holds the holiday type constants. The holiday
 * type can be of: <br>
 * <code>
 * <ul>
 * <li>0
 * <li>1
 * </ul>
 * </code>
 * <p>
 * <b>Format: </b><br>
 * 1
 * <p>
 * <b>Example: </b><br>
 * 0
 * 
 * @return the current value of the <code>aHolidayType;</code> property.
 */
public enum HolidayType {

	/**
	 * Standard Holiday.
	 */
	STANDARD(0),

	/**
	 * Station Holiday.
	 */
	STATION_SPECIFIC(1);

	/** Holiday type. */
	private Integer type;

	/**
	 * Constructor.
	 * 
	 * @param pType
	 *            - Holiday Type
	 */
	HolidayType(final Integer pType) {
		this.type = pType;
	}

	/**
	 * Gets the <code>HolidayType</code>.
	 * <p>
	 * 
	 * @param pType
	 *            <code>Integer</code><br>
	 *            Contains the enum type.<br>
	 *            </p>
	 * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.constants.HolidayType HolidayType}</code>
	 * <br>
	 *         Returns the <code>HolidayType</code>
	 */
	public static HolidayType getHolidayType(final Integer pType) {
		HolidayType aHolidayType = null;
		for (HolidayType aType : HolidayType.values()) {
			if (aType.getType().equals(pType)) {
				aHolidayType = aType;
				break;
			}
		}
		return aHolidayType;
	}

	/**
	 * Gets the type of holiday.
	 * 
	 * @return the type
	 */
	public Integer getType() {
		return this.type;
	}

	/**
	 * Sets the type of holiday.
	 * 
	 * @param pType
	 *            the new value of the <code>pType</code> property.
	 */
	public void setType(final Integer pType) {
		this.type = pType;
	}
}
