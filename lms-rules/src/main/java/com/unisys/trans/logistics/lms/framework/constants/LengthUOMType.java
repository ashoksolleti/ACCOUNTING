package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>LengthUOMType</code> holds the constants to indicate length type applied.
 * <p>
 * Following are the possible geographic type:<br>
 * <ul>
 * <li>CENTIMETER - CM
 * <li>INCHES - IN
 * <li>YARD - YD
 * <li>FOOT - FT
 * <li>METER - ME
 * </ul>
 */
public enum LengthUOMType {

    /**
     * Represents unit in CentiMeter.
     */
    CM,

    /**
     * Represents unit in Inch.
     */
    IN,
    /**
     * Represents unit in Yard.
     */
    YD,
    /**
     * Represents unit in Metres.
     */
    ME,
    /**
     * Represents unit in Foot.
     */
    FT;
    /**
     * Default Constructor.
     */
    LengthUOMType() {
    }

    /**
     * Gets the <code>LengthUOMType</code>.
     * <p>
     * 
     * @param pLengthUOMType holds the new value of <code>LengthUOMType</code>
     *            <p>
     * @return the current value of <code>LengthUOMType</code>
     */
    public static LengthUOMType getLengthUOMType(final String pLengthUOMType) {

        LengthUOMType aLengthUOMType = null;

        for (final LengthUOMType aType : LengthUOMType.values()) {

            if (pLengthUOMType.equals(aType.value())) {
                aLengthUOMType = aType;
                break;
            }
        }

        return aLengthUOMType;
    }

    /**
     * Gives the string format of enumerated <code>LengthUOMType</code>.
     * <p>
     * 
     * @return the current value of the <code>LengthUOMType</code>
     */
    public String value() {
        return this.name();
    }

}
