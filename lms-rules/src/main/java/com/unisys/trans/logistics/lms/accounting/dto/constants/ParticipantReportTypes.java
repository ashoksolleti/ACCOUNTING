package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum ParticipantReportTypes {

    PAYABLE("Payable"), MINIMUM_GURANTEED_REVENUE("Minimum Guranteed Revenue");

    private final String reportType;

    public String getType() {
        return this.reportType;
    }

    public String value() {
        return this.name();
    }

    ParticipantReportTypes(final String pFrequencyType) {
        this.reportType = pFrequencyType;
    }

    public static ParticipantReportTypes getReportType(
            final String pFrequencyType) {

        ParticipantReportTypes participantReportTypes = null;

        for (final ParticipantReportTypes aReportType : ParticipantReportTypes.values()) {

            if (pFrequencyType.equalsIgnoreCase(aReportType.getType())) {
                participantReportTypes = aReportType;
                break;
            }
        }

        return participantReportTypes;

    }

}
