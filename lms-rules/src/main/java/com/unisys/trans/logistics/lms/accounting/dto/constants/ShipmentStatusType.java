//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>ShipmentStatusType</code> holds the constants to indicate ShipmentStatus type applied.
 * <p>
 * Following are the possible ShipmentStatus type:<br>
 * <ul>
 * <li>R
 * <li>Q
 * <li>B
 * <li>S
 * <li>X
 * </ul>
 */
public enum ShipmentStatusType {

    /**
     * Constant used for Percent Reduction.
     */
    R("R"),
    
    /**
     * Constant used for Percent Reduction.
     */
    Q("Q"),
    
    /**
     * Constant used for Percent Reduction.
     */
    B("B"),
    
    /**
     * Constant used for Percent Reduction.
     */
    S("S"),
    
    /**
     * Constant used for Percent Reduction.
     */
    X("X");
    

    /**
     * Attribute to hold the <code>status</code> property.
     */
    private String status;
    
    /**
     * Parameterize constructor.
     * 
     * @param pStatus
     *            the value.
     */
    ShipmentStatusType(final String pStatus) {
       this.status=pStatus;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return this.status;
    }
    
    /**
     * Gives the string format of enumerated <code>ShipmentStatusType</code>.
     * <p>
     * 
     * @return the current string value of the <code>ShipmentStatusType</code>.
     */
    public String value() {
        return this.name();
    }
}
