package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum ParticipantRoleType {
	/**
	 * Agent.
	 */
	AGENT("Agent","Agent"),
	/**
	 * Global sales Agent.
	 */
	GLOBAL_SALES_AGENT("GSA","Global Sales Agent (GSA)"),
	/**
	 * Ground handling agent.
	 */
	GROUND_HANDLING_AGENT("GHA","Ground Handler Agent (GHA)"),
	/**
	 * Pick up.
	 */
	PICK_UP("Pick-up","Pick-up Operator"),
	/**
	 * Delivery.
	 */
	DELIVERY("Delivery","Delivery Operator");

	public String getParticipantRoleName() {
        return this.participantRoleName;
    }

    /**
	 * Attribute to hold <code>participantRoleType</code> property.
	 */
	private String participantRoleType;
    private String participantRoleName;

	/**
	 * Constructor with ParticipantRoleType as an argument.
	 * <p>
	 * 
	 * @param pType
	 *            <code>String</code> Holds the ParticipantRoleType.
	 */

	ParticipantRoleType(final String pType,final String pParticipantRoleName) {
		this.participantRoleType = pType;
		this.participantRoleName = pParticipantRoleName;
	}

	/**
	 * This method <code>getParticipantRoleType</code> returns the
	 * ParticipantRoleType.
	 * <p>
	 * 
	 * @param pParticipantRoleType
	 *            <code>String</code><br>
	 *            The value of commission type.
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantRoleType
	 *         CommissionType}</code><br>
	 *         Returns the enumerated value of the ParticipantRoleType.
	 */
	public static ParticipantRoleType getParticipantRoleType(
			final String pParticipantRoleType) {

		ParticipantRoleType aMatchedParticipantRoleType = null;

		for (final ParticipantRoleType aType : ParticipantRoleType.values()) {

			if (pParticipantRoleType.equals(aType.value())) {
				aMatchedParticipantRoleType = aType;
				break;
			}
		}

		return aMatchedParticipantRoleType;

	}

	/**
	 * The <code>value</code> method gives the string format of
	 * ParticipantRoleType.
	 * <p>
	 * 
	 * @return <code>String</code><br>
	 *         Returns the enumerated value of the ParticipantRoleType.
	 */
	public String value() {
		return this.participantRoleType;
	}
}
