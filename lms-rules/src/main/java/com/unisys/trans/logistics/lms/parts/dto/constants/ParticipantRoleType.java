/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto.constants;

/**
 * <code>ParticipantRoleType</code> holds the constants to represent the role of a participant.
 * <p>
 */
public enum ParticipantRoleType {
    /**
     * Agent.
     */
    AGENT("A", "Agent"),
    /**
     * Bank.
     */
    BANK("K"),
    /**
     * BilltoConsignee.
     */
    BILL_TO_CONSIGNEE("R"),
    /**
     * BilltoShipper.
     */
    BILL_TO_SHIPPER("P"),
    /**
     * Broker.
     */
    BROKER("B", "Broker"),
    /**
     * Consignee.
     */
    CONSIGNEE("C", "Consignee"),
    /**
     * CustomsLocation.
     */
    CUSTOMS_LOCATION("E"),
    /**
     * DeliveryOperator.
     */
    DELIVERY_OPERATOR("D"),
    /**
     * Forwarder.
     */
    FORWARDER("F", "Forwarder"),
    /**
     * Manufacturer.
     */
    MANUFACTURER("M"),
    /**
     * Notify.
     */
    NOTIFY("N"),
    /**
     * PickupLocation.
     */
    PICK_UP_LOCATION("L"),
    /**
     * PickupOperator.
     */
    PICK_UP_OPERATOR("G"),
    /**
     * Shipper.
     */
    SHIPPER("S", "Shipper"),
    /**
     * Sub-contractor1.
     */
    SUBCONTRACTOR1("W"),
    /**
     * Subcontractor2.
     */
    SUBCONTRACTOR2("Y"),
    /**
     * Subcontractor3.
     */
    SUBCONTRACTOR3("Z"),
    /**
     * SurfaceDestination.
     */
    SURFACE_DESTINATION("T"),
    /**
     * SurfaceOrigin.
     */
    SURFACE_ORIGIN("O");

    /**
     * Attribute to hold <code>participantRole</code>.
     */
    private String participantRole;

    /**
     * Attribute to hold <code>participantRoleName</code>.
     */
    private String participantRoleName;

    /**
     * Constructor with participant role as an argument.
     * <p>
     * 
     * @param pRole <code>String</code> Holds the participant role.
     */
    ParticipantRoleType(final String pRole) {
        this.participantRole = pRole;
    }

    /**
     * Constructor with participant role and participant role name as arguments.
     * <p>
     * 
     * @param pRole <code>String</code> Holds the participant role.
     * @param pRoleName <code>String</code> Holds the participant role name.
     */
    ParticipantRoleType(final String pRole, final String pRoleName) {
        this.participantRole = pRole;
        this.participantRoleName = pRoleName;
    }

    /**
     * This method <code>getParticipantRole</code> returns the participant role.
     * <p>
     * 
     * @param pParticipantRole <code>String</code><br>
     *            The value of participant role.
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantRoleType
     *         ParticipantRoleType}</code><br>
     *         Returns the enumerated value of the participant role.
     */
    public static ParticipantRoleType getParticipantRole(final String pParticipantRole) {

        ParticipantRoleType aParticipantRole = null;

        for (final ParticipantRoleType aType : ParticipantRoleType.values()) {

            if (pParticipantRole.equals(aType.value())) {
                aParticipantRole = aType;
                break;
            }
        }

        return aParticipantRole;

    }

    /**
     * This method <code>getParticipantRole</code> returns the participant role.
     * <p>
     * 
     * @param pParticipantRole <code>String</code><br>
     *            The value of participant role.
     * @param pParticipantRoleName <code>String</code><br>
     *            The value of participant role name.
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantRoleType
     *         ParticipantRoleType}</code><br>
     *         Returns the enumerated value of the participant role.
     */
    public static ParticipantRoleType getParticipantRoleName(final String pParticipantRole,
                final String pParticipantRoleName) {

        ParticipantRoleType aParticipantRole = null;

        for (final ParticipantRoleType aType : ParticipantRoleType.values()) {

            if (pParticipantRole.equals(aType.value()) && pParticipantRoleName.equals(aType.roleName())) {
                aParticipantRole = aType;
                break;
            }
        }

        return aParticipantRole;

    }

    /**
     * The <code>value</code> method gives the string format of participant role.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the participant role.
     */
    public String value() {
        return this.participantRole;
    }

    /**
     * The <code>value</code> method gives the string format of participant role name.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the participant role name.
     */
    public String roleName() {
        return this.participantRoleName;
    }

    /**
     * Gets the <code>participantRole</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantRole</code> property.
     */
    public String getParticipantRole() {
        return this.participantRole;
    }

    /**
     * Sets the <code>participantRole</code> data transfer object.
     * <p>
     * 
     * @param pParticipantRole
     *            holds the new value of <code>participantRole</code> data transfer
     *            object.<br>
     */

    public void setParticipantRole(final String pParticipantRole) {
        this.participantRole = pParticipantRole;
    }

    /**
     * Gets the <code>participantRoleName</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantRoleName</code> property.
     */
    public String getParticipantRoleName() {
        return this.participantRoleName;
    }

    /**
     * Sets the <code>participantRoleName</code> data transfer object.
     * <p>
     * 
     * @param pParticipantRoleName
     *            holds the new value of <code>participantRoleName</code> data transfer
     *            object.<br>
     */

    public void setParticipantRoleName(final String pParticipantRoleName) {
        this.participantRoleName = pParticipantRoleName;
    }

}
