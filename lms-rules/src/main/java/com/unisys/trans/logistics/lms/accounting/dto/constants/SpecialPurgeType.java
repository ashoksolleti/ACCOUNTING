//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>SpecialPurgeType</code> holds the constants to indicate
 * SpecialPurgeType type applied.
 * <p>
 * Following are the possible SpecialPurgeType type:<br>
 * <ul>
 * <li>FORCED
 * <li>MARKED
 * <li>PURGE SET
 * </ul>
 */
public enum SpecialPurgeType {

    /**
     * Constant used for Consignee.
     */
    MARKED("MARKED"),

    /**
     * Constant used for Consignee.
     */
    FORCED("FORCED"),

    /**
     * Constant used for Consignee.
     */
    PURGE_SET("PURGE SET");

    /**
     * Attribute to hold the <code>purge</code> property.
     */
    private String purge;

    /**
     * Parameterize constructor.
     * 
     * @param pPurge
     *            the value.
     */
    SpecialPurgeType(final String pPurge) {
        this.purge = pPurge;
    }

    public static SpecialPurgeType fromValue(final String pSpecialPurgeType) {

        SpecialPurgeType aMatchedSpecialPurgeType = null;
        for (final SpecialPurgeType bSpecialPurgeType : SpecialPurgeType
                    .values()) {
            if (bSpecialPurgeType.getPurge().equals(pSpecialPurgeType)) {
                aMatchedSpecialPurgeType = bSpecialPurgeType;
                break;
            }
        }
        return aMatchedSpecialPurgeType;
    }

    /**
     * @return the purge
     */
    public String getPurge() {
        return this.purge;
    }

    /**
     * Gives the string format of enumerated <code>SpecialPurgeType</code>.
     * <p>
     * 
     * @return the current string value of the <code>SpecialPurgeType</code>.
     */
    public String value() {
        return this.name();
    }
}
