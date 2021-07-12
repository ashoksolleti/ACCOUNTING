/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>RemovalReasonCodeType</code> enum defines the constants values for the type of Removal Reasons.
 * <p>
 * The Removal Reason Code is of following four types:<br>
 * <ul>
 * <li>E (External Reason Code) - Specified during Goods Removal from Flight.</li>
 * <li>I (Internal Reason Code) - Specified for the internal usage of the system.</li>
 * <li>L (Location Change Code) - Specified when goods are moved from an assigned container either to a
 * terminal location or to an inactive or empty unassigned container and if the automatic re-assignment is not
 * enabled at the sign-in station.</li>
 * <li>O (Offload Change Code) - Specified when the offload station of assigned goods is changed to another
 * offload station within the same flight routing.</li>
 * </ul>
 * <p>
 * In addition to the above mentioned types, this class defines one more type "A - All Reason Codes" used for
 * retrieving.
 */

public enum RemovalReasonCodeType {

    /**
     * This is an enumerated Removal Reason type constant for the type ALL.<br>
     */
    ALL("A"),

    /**
     * This is an enumerated Removal Reason type constant for the type EXTERNAL.<br>
     */
    EXTERNAL("E"),

    /**
     * This is an enumerated Removal Reason type constant for the type INTERNAL.<br>
     */
    INTERNAL("I"),

    /**
     * This is an enumerated Removal Reason type constant for the type LOCATION_CHANGE.<br>
     */
    LOCATION_CHANGE("L"),

    /**
     * This is an enumerated Removal Reason type constant for the type OFFLOAD_CHANGE.<br>
     */
    OFFLOAD_CHANGE("O");

    /**
     * Holds the default Removal Reason Type.
     */
    public static final RemovalReasonCodeType DEFAULT_TYPE = RemovalReasonCodeType.EXTERNAL;

    /**
     * Attribute to hold <code>reasonCodeType</code>.
     */
    private String reasonCodeType;

    /**
     * Constructor with pType as an argument sets the <code>reasonCodeType</code> attribute.
     * <p>
     * 
     * @param pType the new value of the <code>reasonCodeType</code> attribute.
     */
    private RemovalReasonCodeType(final String pType) {
        this.reasonCodeType = pType;
    }

    /**
     * Gets the <code>reasonCodeType</code> property.
     * <p>
     * 
     * @param pValue the new value of the <code>reasonCodeType</code> property.<br>
     * @return the current value of the <code>reasonCodeType</code> property.
     */
    public static RemovalReasonCodeType getRemovalReasonCodeTypeFromValue(final String pValue) {
        RemovalReasonCodeType aKey = null;
        for (final RemovalReasonCodeType aType : RemovalReasonCodeType.values()) {

            if (pValue.equalsIgnoreCase(aType.value())) {
                aKey = aType;
                break;
            }
        }
        return aKey;
    }

    /**
     * Returns the value of the <code>RemovalReasonCodeType</code> enum.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value of the Removal Reason type.<br>
     */
    public String value() {
        return this.reasonCodeType;
    }
}
