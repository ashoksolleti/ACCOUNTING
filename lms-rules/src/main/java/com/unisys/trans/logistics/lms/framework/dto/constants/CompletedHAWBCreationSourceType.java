package com.unisys.trans.logistics.lms.framework.dto.constants;

public enum CompletedHAWBCreationSourceType {
	/**
	 * Constant used for Cargo Portal Service.
	 */
	C("C", "Cargo Portal Service"),

	/**
	 * Constant used for FHL message.
	 */
	F("F", "FHL message"),

	/**
	 * Constant used for FHL message via third party.
	 */

	V("V", "FHL message via third party");
	/**
	 * Attribute to hold the <code>ceateSourceType</code> property.
	 */
	private String createSourceType;

	/**
	 * Attribute to hold the <code>ceateSourceValue</code> property.
	 */
	private String createSourceValue;

	/**
	 * Parameterize constructor.
	 * 
	 * @param pPad
	 *            the value.
	 */
	CompletedHAWBCreationSourceType(final String pCreateSourceType,
			final String pCreateSourceValue) {
		this.createSourceType = pCreateSourceType;
		this.createSourceValue = pCreateSourceValue;
	}

	/**
	 * Gets the <code>HouseAirWaybillCreateSourceType</code>.
	 * <p>
	 * 
	 * @param pHouseAirWaybillCreateSourceType
	 *            holds the new value of
	 *            <code>HouseAirWaybillCreateSourceType</code>
	 *            <p>
	 * 
	 * @return the current value of <code>HouseAirWaybillCreateSourceType</code>
	 */
	public static CompletedHAWBCreationSourceType getHouseAirWaybillCreateSourceType(
			final String pCeateSourceType) {

		CompletedHAWBCreationSourceType aHouseAirWaybillCreateSourceType = null;

		for (final CompletedHAWBCreationSourceType aType : CompletedHAWBCreationSourceType
				.values()) {

			if (aType.getCreateSourceType().equals(pCeateSourceType)) {
				aHouseAirWaybillCreateSourceType = aType;
				break;
			}
		}

		return aHouseAirWaybillCreateSourceType;

	}

	/**
	 * Gets the <code>HouseAirWaybillCreateSourceValue</code>.
	 * <p>
	 * 
	 * @param pHouseAirWaybillCreateSourceValue
	 *            holds the new value of
	 *            <code>HouseAirWaybillCreateSourceValue</code>
	 *            <p>
	 * 
	 * @return the current value of
	 *         <code>HouseAirWaybillCreateSourceValue</code>
	 */
	public static HouseAirWaybillCreateSourceType getHouseAirWaybillCreateSourceValue(
			final String pCeateSourceValue) {

		HouseAirWaybillCreateSourceType aHouseAirWaybillCreateSourceValue = null;

		for (final HouseAirWaybillCreateSourceType aValue : HouseAirWaybillCreateSourceType
				.values()) {

			if (aValue.getCreateSourceValue().equals(pCeateSourceValue)) {
				aHouseAirWaybillCreateSourceValue = aValue;
				break;
			}
		}

		return aHouseAirWaybillCreateSourceValue;

	}

	/**
	 * Gets the value of the Category property.
	 * 
	 * @return the category
	 */
	public String getCreateSourceType() {
		return this.createSourceType;
	}

	/**
	 * * Sets the value of the Category property.
	 * 
	 * @param category
	 *            the category to set.
	 */
	public void setCreateSourceType(final String pCreateSourceType) {
		this.createSourceType = pCreateSourceType;
	}

	/**
	 * Gets the value of the createSourceValue property.
	 * 
	 * @return the createSourceValue
	 */
	public String getCreateSourceValue() {
		return this.createSourceValue;
	}

	/**
	 * * Sets the value of the createSourceValue property.
	 * 
	 * @param pCreateSourceValue
	 *            the createSourceValue to set.
	 */
	public void setCreateSourceValue(final String pCreateSourceValue) {
		this.createSourceValue = pCreateSourceValue;
	}

	/**
	 * Gives the string format of enumerated <code>CategoryTypr</code>.
	 * <p>
	 * 
	 * @return the current string value of the <code>CategoryTypr</code>.
	 */
	public String value() {
		return this.name();
	}
}
