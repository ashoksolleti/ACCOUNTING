package com.unisys.trans.logistics.lms.parts.dto.constants;

/**
 * <code>ParticipantUsageType</code> class represents the types of participants.
 * <p>
 */
public enum ParticipantUsageType {

    /**
     * This is an enumerated participant type constant for house air waybill recurring.
     */
    HOUSE_AIR_WAYBILL_RECURRING("H"),

    /**
     * This is an enumerated participant type constant for house air waybill recurring one time.
     */
    HOUSE_AIR_WAYBILL_RECURRING_ONE_TIME("U"),

    /**
     * This is an enumerated participant type constant for master air waybill recurring.
     */
    MASTER_AIR_WAYBILL_RECURRING("M"),

    /**
     * This is an enumerated participant type constant for master air waybill recurring one time.
     */
    MASTER_AIR_WAYBILL_RECURRING_ONE_TIME("O"),

    /**
     * This is an enumerated participant type constant for master and house air waybill recurring one time.
     */
    MASTER_AND_HOUSE_AIR_WAYBILL_RECURRING_ONE_TIME("B");
    /**
     * Attribute to hold the <code>usageType</code> property.
     */
    private String usageType;

    /**
     * <code>Parameterized constructor.</code>
     * 
     * @param pUsageType <code>String</code><br>
     *            Contains the enum value.
     */
    ParticipantUsageType(final String pUsageType) {
        this.usageType = pUsageType;
    }

    /**
     * Gets the Enum Constant value for the given value.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.
     *            <p>
     * @return <code>ParticipantNameSearchType</code><br>
     *         Returns the value.
     */

    public static ParticipantUsageType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the key of the enum.
     * <p>
     * 
     * @param pVal <code>String</code><br>
     *            Contains the enum value.
     *            <p>
     * @return <code>ParticipantType</code><br>
     *         Returns the value.
     */
    public static ParticipantUsageType getKey(final String pVal) {
        ParticipantUsageType aKey = null;
        for (final ParticipantUsageType bParticipantUsageType : ParticipantUsageType.values()) {
            if (pVal.equalsIgnoreCase(bParticipantUsageType.getUsageType())) {
                aKey = bParticipantUsageType;
            }
        }
        return aKey;
    }

    /**
     * Gets the <code>ParticipantType</code>.
     * <p>
     * 
     * @param pParticipantUsageType <code>String</code>
     *            <p>
     * @return <code>ParticipantUsageType</code><br>
     *         Returns the name type the participant holds.
     */
    public static ParticipantUsageType getParticipantUsageType(final String pParticipantUsageType) {

        ParticipantUsageType aParticipantUsageType = null;

        for (final ParticipantUsageType aType : ParticipantUsageType.values()) {

            if (pParticipantUsageType.equals(aType.value())) {
                aParticipantUsageType = aType;
                break;
            }
        }

        return aParticipantUsageType;

    }

    /**
     * Gets the value of the enum constant.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.
     */
    public String getUsageType() {
        return this.usageType;
    }

    /**
     * Gets the string value of the object.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.
     */
    public String value() {
        return this.name();
    }
}
