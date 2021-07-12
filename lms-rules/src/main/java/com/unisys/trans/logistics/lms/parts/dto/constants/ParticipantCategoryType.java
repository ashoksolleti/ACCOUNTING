//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.parts.dto.constants;

/**
 * <code>ParticicipantCategoryType</code> holds the constants to indicate Section type
 * applied.
 * <p>
 * Following are the possible category type:<br>
 * <ul>
 * <li>AIRWAYBILL
 * </ul>
 */
public enum ParticipantCategoryType {
    PARTICIPANT_INFORMATION_CREATED("Participant Information Created"),
    PARTICIPANT_INFORMATION_DELETED("Participant Information Deleted"),
    PARTICIPANT_INFORMATION_REACTIVATED("Participant Information ReActivate"),
    PARTICIPANT_DETAILS_CHANGE("Details Change"),
    PARTICIPANT_ACCOUNT_INFO_CHANGE("Account Info Change"),
    PARTICIPANT_CREDIT_CHANGE(" Credit Change"),
    PARTICIPANT_REMARKS_CHANGE("Remarks Change"),
    PARTICIPANT_ADDITIONAL_INFO_CHANGE("Additional Info Change"),
    PARTICIPANT_ATTRIBUTE_FEILD_CHANGE("Individual Attribute Field Change"),
    PARTICIPANT_ATTRIBUTE_GOVERNMENT_FEILD_CHANGE("Individual Attribute  Government Field Change"),
    PARTICIPANT_ATTRIBUTE_STATE_FEILD_CHANGE("Individual Attribute State Field Change"),
    PARTICIPANT_ATTRIBUTE_RESTRICTED_FEILD_CHANGE("Individual Attribute Restricted Field Change"),
    PARTICIPANT_ATTRIBUTE_VALUABLE_CARGO_FEILD_CHANGE("Individual Attribute Valuable Cargo Field Change"),
    PARTICIPANT_ATTRIBUTE_COMMER_ACCOUNT_FEILD_CHANGE("Individual Attribute Commercial Account Field Change"),
    PARTICIPANT_ATTRIBUTE_CUSTOMS_NOMINATED_FEILD_CHANGE(
                "Individual Attribute Customs Nominated Field Change"),
    PARTICIPANT_ATTRIBUTE_NO_SHIPMENT_FEILD_CHANGE("Individual Attribute No Shipment  Field Change"),
    PARTICIPANT_ATTRIBUTE_MANUAL_HAWB_ENTRY_FEILD_CHANGE(
                "Individual Attribute Manual HAWB Entry Field Change"),
    PARTICIPANT_ATTRIBUTE_EDI_HAWB_FEILD_CHANGE("Individual Attribute EDI HAWB Entry  Field Change"),
    PARTICIPANT_ATTRIBUTE_IATA_AGENT_FEILD_CHANGE("Individual Attribute IATA Agent  Field Change"),
    PARTICIPANT_ATTRIBUTE_AUTOMATIC_EQA_FEILD_CHANGE("Automatic EQA Field Change"),
    PARTICIPANT_ATTRIBUTE_BOOKING_CHARGE_FEILD_CHANGE("Booking Charge Field Change"),
    PARTICIPANT_ATTRIBUTE_FSU_EXEMPTION_FEILD_CHANGE("FSU Exemption Field Change"),
    PARTICIPANT_ATTRIBUTE_RESTRICTED_EXPORT_FEILD_CHANGE("Restricted Export Paycode Field Change");

    /**
     * Attribute to hold the <code>event</code> property.
     */
    private String section;

    /**
     * @return the event
     */
    public String getSection() {
        return this.section;
    }

    /**
     * @param event the event to set
     */
    public void setSection(final String pSection) {
        this.section = pSection;
    }

    /**
     * Parameterize constructor.
     * 
     * @param pPad
     *            the value.
     */
    ParticipantCategoryType(final String pSection) {
        this.section = pSection;
    }

    /**
     * Gives the string format of enumerated <code>EventType</code>.
     * <p>
     * 
     * @return the current string value of the <code>EventType</code>.
     */
    public String value() {
        return this.name();
    }

    /**
     * Gets the <code>EventType</code>.
     * <p>
     * 
     * @param pEventType holds the new value of <code>EventType</code>
     *            <p>
     * 
     * @return the current value of <code>EventType</code>
     */
    public static ParticipantCategoryType getEventType(final String pSection) {

        ParticipantCategoryType aMatchedCategoryType = null;

        for (final ParticipantCategoryType aType : ParticipantCategoryType.values()) {

            if (pSection.equals(aType.getSection())) {
                aMatchedCategoryType = aType;
                break;
            }
        }

        return aMatchedCategoryType;

    }
}
