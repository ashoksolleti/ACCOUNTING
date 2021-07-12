package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;

public class StationInformationDumpRequest extends BatchRequest {   
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private boolean hostOnly;
    
    private boolean mechanizedStationOnly;

    public boolean getHostOnly() {
        return hostOnly;
    }

    public void setHostOnly(boolean hostOnly) {
        this.hostOnly = hostOnly;
    }

    public boolean getMechanizedStationOnly() {
        return mechanizedStationOnly;
    }

    public void setMechanizedStationOnly(boolean mechanizedStationOnly) {
        this.mechanizedStationOnly = mechanizedStationOnly;
    }           

}
