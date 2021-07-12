package com.unisys.trans.logistics.lms.framework.constants;

public enum FlownReportType {

	FLIGHT_NUMBER("Flight Number"), SEGMENT("Segment");

	private final String reportType;

	public String getType() {
        return this.reportType;
    }

	public String value() {
        return this.name();
    }

	FlownReportType(final String pFrequencyType)
	{
		this.reportType = pFrequencyType;
	}
	
	public static FlownReportType getReportType(
            final String pFrequencyType) {

		FlownReportType aFlownReportType = null;

    for (final FlownReportType aReportType : FlownReportType.values()) {

        if (pFrequencyType.equalsIgnoreCase(aReportType.getType())) {
	        aFlownReportType = aReportType;
            break;
        }
    }

    return aFlownReportType;

}


}
