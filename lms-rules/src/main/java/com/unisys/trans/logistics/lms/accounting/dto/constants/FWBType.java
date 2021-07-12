//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>FWBType</code> holds the constants to indicate FWBType type applied.
 * <p>
 * Following are the possible FWBType type:<br>
 * <ul>
 * <li>Y - Yes
 * </ul>
 */
public enum FWBType {

    /**
     * Constant used for Yes.
     */
    YES("Y"),
    /**
     * Constant used for NO.
     */
    NO("N"),
    /**
     * Constant used for XML.
     */
    XML("X");

    /**
     * Attribute to hold the <code>valueFWB</code> property.
     */
    private String valueFWB;

    /**
     * Parameterize constructor.
     * 
     * @param pValueFWB
     *            the value.
     */
    FWBType(final String pValueFWB) {
        this.valueFWB = pValueFWB;
    }

    /**
     * @return the valueFWB
     */
    public String getValueFWB() {
        return this.valueFWB;
    }

    /**
     * Gives the string format of enumerated <code>FWBType</code>.
     * <p>
     * 
     * @return the current string value of the <code>FWBType</code>.
     */
    public String value() {
        return this.name();
    }

    /**
     * This method <code>getFWBType</code> returns the FWBType.
     * 
     * @param pFWBType<code>String</code><br>
     *            The value of due code.<br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.constants.FWBType
     *         pFWBType}</code><br>
     *         Returns the type of fwb <br>
     *         </p>
     */
    public static FWBType getFWBType(final String pFWBType) {

        FWBType aMatchedFWBType = null;

        for (final FWBType aFWBType : FWBType.values()) {
            if (aFWBType.getValueFWB().equalsIgnoreCase(pFWBType)) {
                aMatchedFWBType = aFWBType;
                break;
            }
        }
        return aMatchedFWBType;
    }

}
