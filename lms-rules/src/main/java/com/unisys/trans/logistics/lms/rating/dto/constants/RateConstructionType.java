package com.unisys.trans.logistics.lms.rating.dto.constants;

public enum RateConstructionType {

    ORIGIN_ADDON(1),
    DESTINATION_ADDON(2),
    DOUBLE_CONSTRUCTION(3);

    private int value;

    RateConstructionType(final int pValue) {
        this.value = pValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
