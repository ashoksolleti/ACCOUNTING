package com.unisys.trans.logistics.lms.framework.constants;

public enum FlownDateType {

	EXECUTION("Execution"), FLOWN("Flown");

	private final String dateType;

	public String getType() {
        return this.dateType;
    }

	public String value() {
        return this.name();
    }

	FlownDateType(final String pFrequencyType)
	{
		this.dateType = pFrequencyType;
	}

	public static FlownDateType getDateType(
            final String pFrequencyType) {

		FlownDateType aFlownDateType = null;

    for (final FlownDateType aDateType : FlownDateType.values()) {

        if (pFrequencyType.equalsIgnoreCase(aDateType.getType())) {
	        aFlownDateType = aDateType;
            break;
        }
    }

    return aFlownDateType;

}


}
