package com.unisys.trans.logistics.lms.framework.constants;

public enum FlownRevenueType {

	PROVISIONAL("Provisional"), FINAL("Final");

	private final String revenueType;

	public String getType() {
        return this.revenueType;
    }

	public String value() {
        return this.name();
    }

	FlownRevenueType(final String pFrequencyType)
	{
		this.revenueType = pFrequencyType;
	}
	
	public static FlownRevenueType getRevenueType(
            final String pFrequencyType) {

		FlownRevenueType aFlownRevenueType = null;

    for (final FlownRevenueType aRevenueType : FlownRevenueType.values()) {

        if (pFrequencyType.equalsIgnoreCase(aRevenueType.getType())) {
	        aFlownRevenueType = aRevenueType;
            break;
        }
    }

    return aFlownRevenueType;

}


}
