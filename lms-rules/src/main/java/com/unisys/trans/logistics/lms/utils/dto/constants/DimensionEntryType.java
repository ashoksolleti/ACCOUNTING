package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>DimensionEntryType</code> holds the constants to indicate
 * DimensionEntryType applied.
 * <p>
 * Following are the possible DimensionEntryType:<br>
 * <ul>
 * <li>STANDARDENTRY-0
 * <li>MANUALENTRY-1
 * </ul>
 */
public enum DimensionEntryType {
	/**
	 * 0 represents Standard Entry of the dimension.
	 */
	STANDARDENTRY(0),
	/**
	 * 1 represents Manual Entry of the dimension.
	 */
	MANUALENTRY(1);
	/**
	 * Attribute to hold the <code>type</code> property.
	 */
	private Integer type;

	/**
	 * Constructor.
	 * 
	 * @param pType
	 *            - Holiday Type
	 */
	DimensionEntryType(final Integer pType) {
		this.type = pType;
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
	 * Gets the <code>DimensionEntryType</code>.
	 * <p>
	 * 
	 * @param pType
	 *            <code>Integer</code><br>
	 *            Contains the enum type.<br>
	 *            </p>
	 * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.constants.DimensionEntryType DimensionEntryType}</code>
	 * <br>
	 *         Returns the <code>DimensionEntryType</code>
	 */
	public static DimensionEntryType getDimensionEntryType(final Integer pType) {
		DimensionEntryType aDimensionEntryType = null;
		for (DimensionEntryType aType : DimensionEntryType.values()) {
			if (aType.getType().equals(pType)) {
				aDimensionEntryType = aType;
				break;
			}
		}
		return aDimensionEntryType;
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
