//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>CreditType</code> holds the constants to indicate Credit type applied.
 * <p>
 * Following are the possible Credit type:<br>
 * <ul>
 * <li>C
 * <li>R
 * <li>B
 * <li>D
 * <li>N
 * <li>W
 * <li>Y
 * <li>Z
 * <li>$
 * </ul>
 */
public enum CreditType {

    /**
     * Constant used for Consigee.
     */
    C("C"),
    
    /**
     * Constant used for Collect Bill.
     */
    R("R"),
    
    /**
     * Constant used for Broker.
     */
    B("B"),
    
    
    /**
     * Constant used for Delivery Agent.
     */
    D("D"),
    
    /**
     * Constant used for Notify Agent.
     */
    N("N"),
    
    /**
     * Constant used for Sub-Contractor.
     */
    W("W"),
    
    /**
     * Constant used for Sub-Contractor.
     */
    Y("Y"),
    
    /**
     * Constant used for Sub-Contractor.
     */
    Z("Z"),
    
    /**
     * Constant used for Cash.
     */
    $("$");
    
    
    /**
     * Attribute to hold the <code>credit</code> property.
     */
    private String credit;
    
    /**
     * Parameterize constructor.
     * 
     * @param pCredit
     *            the value.
     */
    CreditType(final String pCredit) {
       this.credit=pCredit;
    }

    /**
     * @return the credit
     */
    public String getCredit() {
        return credit;
    }
    
    /**
     * Gives the string format of enumerated <code>CreditType</code>.
     * <p>
     * 
     * @return the current string value of the <code>CreditType</code>.
     */
    public String value() {
        return this.name();
    }
    
}
