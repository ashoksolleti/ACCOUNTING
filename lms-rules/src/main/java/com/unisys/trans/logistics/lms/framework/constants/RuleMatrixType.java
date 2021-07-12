/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>RuleMatrixType</code> holds various sources which indicates the type of rule matrix to be applied to
 * the input.
 */
public enum RuleMatrixType {
    /**
     * Literal to identify the creation of master allotment.
     */
    CREATE_MASTER_ALLOTMENT(ComponentType.RESERVATION, "CreateMasterAllotmentRule"),
    /**
     * Literal to identify the update of master allotment.
     */
    UPDATE_MASTER_ALLOTMENT(ComponentType.RESERVATION, "UpdateMasterAllotmentRule"),

    /**
     * This is an enumerated flight close constant which indicates the validation of the input flight close
     * status against the existing flight close status of a flight segment.
     */
    VALIDATE_FLIGHT_CLOSE_STATUS(ComponentType.WAREHOUSE, "FlightCloseStatusRule");

    /**
     * Attribute to hold the <code>component</code> property.
     */
    private ComponentType component;

    /**
     * Attribute to hold the <code>ruleName</code> property.
     */
    private String ruleName;

    /**
     * <code>Parameterized Constructor.</code>
     * <p>
     * 
     * @param pComponent holds the new value of <code>component</code> property.
     * @param pRuleName holds the new value of <code>ruleName</code> property.
     */
    RuleMatrixType(final ComponentType pComponent, final String pRuleName) {
        this.component = pComponent;
        this.ruleName = pRuleName;
    }

    /**
     * Gets the string format of enumerated <code>RuleMatrixType</code>.
     * <p>
     * 
     * @param pValue the new value of <code>RuleMatrixType</code>.
     *            <p>
     * @return the current value of <code>RuleMatrixType</code>.
     */
    public static RuleMatrixType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the <code>component</code> property.
     * <p>
     * 
     * @return the current value of the <code>component</code> property.
     */
    public ComponentType getComponent() {
        return this.component;
    }

    /**
     * Gets the <code>ruleName</code> property.
     * <p>
     * 
     * @return the current value of the <code>ruleName</code> property.
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * Gives the string format of enumerated <code>RuleMatrixType</code> for a flight.
     * <p>
     * 
     * @return the current value of the <code>RuleMatrixType</code>.
     */
    public String value() {
        return this.name();
    }
}