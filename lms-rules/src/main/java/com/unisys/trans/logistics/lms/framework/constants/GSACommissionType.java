package com.unisys.trans.logistics.lms.framework.constants;

public enum GSACommissionType {

    PERCENTAGE_ON_AWB_CHARGES("Percentage On AWB Charges"), SLIDING_SCALE("Sliding Scale"), RATE("Rate"), FLAT_CHARGE("Flat Charge");

    private final String commissionType;

    public String getType() {
        return this.commissionType;
    }

    public String value() {
        return this.name();
    }

    GSACommissionType(final String pFrequencyType) {
        this.commissionType = pFrequencyType;
    }

    public static GSACommissionType getCommissionType(
            final String pFrequencyType) {

        GSACommissionType aGSACommissionType = null;

        for (final GSACommissionType aCommissionType : GSACommissionType.values()) {

            if (pFrequencyType.equalsIgnoreCase(aCommissionType.getType())) {
                aGSACommissionType = aCommissionType;
                break;
            }
        }
        return aGSACommissionType;
    }

}
