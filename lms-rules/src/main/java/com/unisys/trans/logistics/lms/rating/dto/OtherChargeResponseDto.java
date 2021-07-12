package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OtherChargeResponseDto implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 934801569200182136L;

    private List<String> destAggregates;

    private String iataRegionCodeOfDestination;

    private String iataRegionCodeOfOrigin;

    private List<String> originAggregates;

    private List<String> participantCode;

    private List<List<String>> participantGroupIdentifier;

    public List<String> getDestAggregates() {
        return destAggregates;
    }

    public String getIataRegionCodeOfDestination() {
        return iataRegionCodeOfDestination;
    }

    public String getIataRegionCodeOfOrigin() {
        return iataRegionCodeOfOrigin;
    }

    public List<String> getOriginAggregates() {
        return originAggregates;
    }

    public List<String> getParticipantCode() {
        if (this.participantCode == null) {
            this.participantCode = new ArrayList<String>();
        }
        return participantCode;
    }

    public List<List<String>> getParticipantGroupIdentifier() {
        if (participantGroupIdentifier == null) {
            participantGroupIdentifier = new ArrayList<List<String>>();
        }
        return participantGroupIdentifier;
    }

    public void setDestAggregates(List<String> destAggregates) {
        this.destAggregates = destAggregates;
    }

    public void setIataRegionCodeOfDestination(String iataRegionCodeOfDestination) {
        this.iataRegionCodeOfDestination = iataRegionCodeOfDestination;
    }

    public void setIataRegionCodeOfOrigin(String iataRegionCodeOfOrigin) {
        this.iataRegionCodeOfOrigin = iataRegionCodeOfOrigin;
    }

    public void setOriginAggregates(List<String> originAggregates) {
        this.originAggregates = originAggregates;
    }

    public void setParticipantCode(List<String> participantCode) {
        this.participantCode = participantCode;
    }

    public void setParticipantGroupIdentifier(List<List<String>> participantGroupIdentifier) {
        this.participantGroupIdentifier = participantGroupIdentifier;
    }

}
