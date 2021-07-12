package com.unisys.trans.logistics.lms.parts.dto.constants;

/**
 * <code>ParticipantType</code> class represents the types of participants.
 * <p>
 */
public enum ParticipantType {

    /**
     * This is an enumerated participant type constant is used to specify the one time participant.
     */
    ONETIME("Onetime"),

    /**
     * This is an enumerated participant type constant is used to specify the permanent participant.
     */
    RECURRING("Permanent");

    /**
     * Attribute to hold the <code>participantType</code> property.
     */
    private String participantType;

    /**
     * <code>Parameterized constructor.</code>
     * 
     * @param pParticipantType <code>String</code><br>
     *            Contains the enum value.
     */
    ParticipantType(final String pParticipantType) {
        this.participantType = pParticipantType;
    }

    /**
     * Gets the <code>ParticipantType</code> object.
     * <p>
     * 
     * @param pParticipantType the new value of <code>ParticipantType</code>.
     *            <p>
     * @return the enumerated value of the <code>ParticipantType</code>.
     */
    public static ParticipantType getParticipantType(final String pParticipantType) {

        ParticipantType aParticipantType = null;

        for (final ParticipantType aType : ParticipantType.values()) {

            if (pParticipantType.equals(aType.value())) {
                aParticipantType = aType;
                break;
            }
        }

        return aParticipantType;

    }

    /**
     * Gets the value of the enum constant.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.
     */
    public String getParticipantType() {
        return this.participantType;
    }

    /**
     * Gives the string format of <code>ParticipantType</code>.
     * <p>
     * 
     * @return the current enumerated value of <code>ParticipantType</code>.<br>
     */
    public String value() {
        return this.name();
    }
}
