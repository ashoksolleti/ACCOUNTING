package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum AccountingModes {

    ONLINE("Online"),

    BATCH("Batch");
    public String value() {
        return this.name();
    }

    private final String type;

    AccountingModes(final String pType) {
        this.type = pType;
    }

    public String getType() {
        return this.type;
    }
}