package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum ParticipantCarrierType {

    PARTICIPANT("Participant"),

    CARRIER("Carrier");
    public String value() {
        return this.name();
    }

    private final String type;

    ParticipantCarrierType(final String pType) {
        this.type = pType;
    }

    public String getType() {
        return this.type;
    }
}