package com.unisys.trans.logistics.lms.framework.constants;

public enum ParticipantBillingDateType {

	EXECUTION("Execution"), INVOICE("Invoice");

	private final String dateType;

	public String getType() {
        return this.dateType;
    }

	public String value() {
        return this.name();
    }

	ParticipantBillingDateType(final String pFrequencyType)
	{
		this.dateType = pFrequencyType;
	}

	public static ParticipantBillingDateType getDateType(
            final String pFrequencyType) {

		ParticipantBillingDateType aParticipantBillingDateType = null;

    for (final ParticipantBillingDateType aDateType : ParticipantBillingDateType.values()) {

        if (pFrequencyType.equalsIgnoreCase(aDateType.getType())) {
        	aParticipantBillingDateType = aDateType;
            break;
        }
    }

    return aParticipantBillingDateType;

}


}
