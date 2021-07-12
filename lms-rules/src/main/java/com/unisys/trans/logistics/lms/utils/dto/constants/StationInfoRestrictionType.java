package com.unisys.trans.logistics.lms.utils.dto.constants;

public enum StationInfoRestrictionType {
    
	INFORMATION("I","Information"),
	RESTRICTION("R","Restriction"),
    WARNING("W","Warning");
    
    private final String codeType;
    
    private final String label;

    
    StationInfoRestrictionType(final String pCodeType,final String pLabel) {
        this.codeType = pCodeType;
        this.label=pLabel;
    }

    public static StationInfoRestrictionType getStationInfoRestrictionType(final String pStationInfoRestrictionType) {

        StationInfoRestrictionType aStationInfoRestrictionType = null;

        for (final StationInfoRestrictionType aType : StationInfoRestrictionType.values()) {
            if (pStationInfoRestrictionType.equals(aType.getRestrictionType())) {
                aStationInfoRestrictionType = aType;
                break;
            }
        }
        return aStationInfoRestrictionType;
    }

    public String getRestrictionType() {
        return this.codeType;
    }

       public String value() {
        return this.name();
    }

    public String getLabel() {
        return this.label;
    }

}
