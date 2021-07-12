package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class StationAdminFindRequest extends AbstractRequest{
  /**
     * 
     */
    private static final long serialVersionUID = -40384554686282941L;
private String stationCode;

public String getStationCode() {
    return stationCode;
}

public void setStationCode(String stationCode) {
    this.stationCode = stationCode;
}
  
}
