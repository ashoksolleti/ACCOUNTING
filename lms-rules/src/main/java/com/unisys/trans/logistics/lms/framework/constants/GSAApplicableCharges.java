package com.unisys.trans.logistics.lms.framework.constants;

public enum GSAApplicableCharges {

	NET_FLOWN_REVENUE("Net Flown Revenue"), AWB_CHARGES("AWB Charges");

	private final String applicableCharge;

	public String getType() {
        return this.applicableCharge;
    }

	public String value() {
        return this.name();
    }

	GSAApplicableCharges(final String aApplicableCharge)
	{
		this.applicableCharge = aApplicableCharge;
	}
	
	public static GSAApplicableCharges getApplicableCharge(
            final String aApplicableCharge) {

		GSAApplicableCharges aGSAApplicableCharges = null;

    for (final GSAApplicableCharges aChargeType : GSAApplicableCharges.values()) {

        if (aApplicableCharge.equalsIgnoreCase(aChargeType.getType())) {
	        aGSAApplicableCharges = aChargeType;
            break;
        }
    }

    return aGSAApplicableCharges;

	}


}
