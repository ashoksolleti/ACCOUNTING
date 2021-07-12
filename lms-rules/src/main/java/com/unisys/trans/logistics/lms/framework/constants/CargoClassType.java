package com.unisys.trans.logistics.lms.framework.constants;

/**
 * Enum to describe the cargo flight classification category. One of the following Cargo classification is
 * applied to the flight:
 * P = Passenger F = Freight C = Combination
 */
public enum CargoClassType {

    /**
     * Both upper and lower deck position in the flight.
     */
    PASSENGER("P"),

    /**
     * Lower deck container in the flight.
     */
    FREIGHT("F"),

    /**
     * Lower deck position in the flight.
     */
    COMBINATION("C");

    /**
     * /** Attribute to hold the <code>val</code> property.
     */
    private String val;

    /**
     * <code>Parameterized Constructor.</code>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     */
    CargoClassType(final String pValue) {
        this.val = pValue;
    }

    /**
     * Gets the enum constant for the given value.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     * @return <code>CargoClassType</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public static CargoClassType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the value of the enum constant.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public String getValue() {
        return this.val;
    }

    /**
     * Gets the string value of the enum.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public String value() {
        return this.name();
    }
}
