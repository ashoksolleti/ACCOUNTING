package com.unisys.trans.logistics.lms.framework.constants;

//GSAFrequencyType defines the Invoice frequency for GSA

public enum GSAFrequencyType {

    MONTHLY("Monthly"), QUATERLY("Quaterly"), HALF_YEARLY("Half Yearly"), YEARLY("Yearly");

    private final String type;

    public String getType() {
        return this.type;
    }

    GSAFrequencyType(final String pType) {
        this.type = pType;
    }

    public String value() {
        return this.name();
    }

    public static GSAFrequencyType getFrequencyType(
            final String pFrequencyType) {
        GSAFrequencyType aGSAFrequencyType = null;
        for (final GSAFrequencyType aType : GSAFrequencyType.values()) {
            if (pFrequencyType.equalsIgnoreCase(aType.getType())) {
                aGSAFrequencyType = aType;
                break;
            }
        }
        return aGSAFrequencyType;
    }
}
