/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;


/**
 * <code>GoodsLocationType</code> indicates the different weight units.
 * <p>
 */

public enum GoodsLocationType {
    /**
     * used to represent each All goods.
     */
	ALL,

    /**
     * Represents ULD.
     */
    ULD,
    /**
     * used to represent TCON.
     */
	TCON,

    /**
     * used to represent Loose goods
     */
    TERMINAL_LOCATION;
	

    public String value() {
        return name();
    }

    public static GoodsLocationType fromValue(String v) {
        return valueOf(v);
    }

}