/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>SecurityUserType</code> holds the constants to indicate SecurityUserType
 * applied.
 * <p>
 * Following are the possible Security type:<br>
 * <ul>
 * <li>G - Rate Source
 * <li>U - Contract / Spot Rate
 * </ul>
 */

public enum SecurityUserType {
    /**
     * Constant used for User Group.
     */
    G("User Group"),
    /**
     * Constant used for User.
     */
    U("User");
    /**
     * Attribute to hold the <code>type</code> property.
     */
    private String type;
    /**
     * Parameterize constructor.
     * 
     * @param pType
     *            the value.
     */
    SecurityUserType(final String pType) {
        this.setType(pType);

    }
    /**
     * Gets the type.
     * <p>
     * 
     * @return the current value of <code>type</code> property.<br>
     */
    public String getType() {
        return this.type;
    }
    /**
     * Sets the type.
     * <p>
     * 
     * @param pType
     *            the current value of <code>type</code> property.<br>
     */
    public void setType(final String pType) {
        this.type = pType;
    }

}
