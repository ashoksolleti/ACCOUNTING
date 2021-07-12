/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;


/**
 * <code>WeightUOMType</code> indicates the different weight units.
 * <p>
 */

public enum OtherMeasureType {
    /**
     * used to represent each BP.
     */
	BP,

    /**
     * Represents TI.
     */
    TI,
    /**
     * used to represent each ADULT.
     */
	ADULT,

    /**
     * used to represent each CHILD..
     */
    CHILDORINFANT,
    /**
     * used to represent each CREMAINS..
     */
    CREMAINS;
	

    public String value() {
        return name();
    }

    public static OtherMeasureType fromValue(String v) {
        return valueOf(v);
    }

}