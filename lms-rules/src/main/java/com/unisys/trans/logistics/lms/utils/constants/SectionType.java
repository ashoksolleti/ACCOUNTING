package com.unisys.trans.logistics.lms.utils.constants;

public enum SectionType {
    FACILITY_CONTACTS("Facility Contacts"),
    SUPPEMENTAL_STATION("Supplemental Stations"),
    AGENCY_HOURS("Agency Hours"),
    FACILITY_ATTRIBUTES("Facility Attributes"),
    HANDLING_DETAILS("Handling Details"),
    HANLING_DETAILS_DOCUMENT("Handling Details Document");
    
    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    SectionType(final String pDescription) {
        this.description = pDescription;
    }

}