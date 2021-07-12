/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.preferences;

/**
 * @author RamannaV
 *
 */
public enum ParticipantType {

	/**
	 * Constant used for FRIDAY.
	 */
	ALL(0),
	/**
	 * Constant used for MONDAY.
	 */
	AGENT(1),
	/**
	 * Constant used for SATURDAY.
	 */
	SHIPPER(2),
	/**
	 * Constant used for SUNDAY.
	 */
	FORWARDER(3),
	/**
	 * Constant used for THURSDAY.
	 */
	BILLTOSHIPPER(4),
	/**
	 * Constant used for TUESDAY.
	 */
	CONSIGNEE(5),
	/**
	 * Constant used for WEDNESDAY.
	 */
	BILLTOCONSIGNEE(6);

	/**
	 * Attribute to hold the <code>value</code> property.
	 */
	private Integer value;

	/**
	 * Parameterize constructor.
	 * 
	 * @param pVal
	 *            the value.
	 */
	ParticipantType(final Integer pVal) {
		this.value = pVal;
	}

	/**
	 * Gets the <code>WeekDaysType</code>.
	 * <p>
	 * 
	 * @param pType
	 *            <code>Integer</code><br>
	 *            Contains the enum type.<br>
	 *            </p>
	 * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.constants.WeekDaysType WeekDaysType}</code>
	 * <br>
	 *         Returns the <code>WeekDaysType</code>
	 */
	public static ParticipantType getParticipantType(final Integer pType) {
		ParticipantType participantType = null;
		for (ParticipantType aType : ParticipantType.values()) {
			if (aType.getValue().equals(pType)) {
				participantType = aType;
				break;
			}
		}
		return participantType;
	}

	/**
	 * Gets the enum Constant value.
	 * <p>
	 * 
	 * @return the current value of <code>value</code> property.<br>
	 */
	public Integer getValue() {
		return this.value;
	}

}
