//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * Participant Account Type. Possible values could be,
 * <ul>
 * <li>P1 = Primary Account 1
 * <li>C1 = Contract Account 1
 * <li>C2 = Associated Contract Account 2
 * <li>C3 = Associated Contract Account 3
 * <li>I1 = IATA Account
 * </ul>
 * 
 * @author Unisys
 * 
 */
public enum ParticipantAccountType {
    /**
     * This is an enumerated ParticipantAccountType constant to specify participant's contract account 1
     * <p>
     * value = {@value}
     */
    C1("Contract Account 1"),
    /**
     * This is an enumerated ParticipantAccountType constant to specify participant's associated contract
     * account 2
     * <p>
     * value = {@value}
     */
    C2("Contract Account 2"),
    /**
     * This is an enumerated ParticipantAccountType constant to specify participant's associated Contract
     * account 3
     * <p>
     * value = {@value}
     */
    C3("Contract Account 3"),
    /**
     * This is an enumerated ParticipantAccountType constant to specify participant's IATA account
     * <p>
     * value = {@value}
     */
    I1("I1"),
    /**
     * This is an enumerated ParticipantAccountType constant to specify participant's primary account 1
     * storage.
     * <p>
     * value = {@value}
     */
    P1("Primary Account 1"),
    /**
     * This is an enumerated PurposeType constant to specify participant's Account 2.
     * <p>
     * value = {@value}
     */
    P2("Participant Account 2");

    /**
     * Attribute to hold <code>participantAccountType</code>.
     */
    private String definition;

    ParticipantAccountType(final String pDef) {
        this.definition = pDef;
    }

    public String getDefinition() {
        return this.definition;
    }
}
