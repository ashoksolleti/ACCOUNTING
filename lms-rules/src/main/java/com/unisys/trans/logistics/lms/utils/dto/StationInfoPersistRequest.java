package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class StationInfoPersistRequest extends AbstractRequest {
    /**
     * 
     */
    private static final long serialVersionUID = -3540604357855053147L;

    /**
     * Attribute to hold the <code>oId</code> object.
     */
    private Long oId;

    private StationInfoDto stationInfoDto;

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */

    public Long getOId() {
        return this.oId;
    }

    public StationInfoDto getStationInfoDto() {
        return stationInfoDto;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>OId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    public void setStationInfoDto(StationInfoDto pStationInfoDto) {
        this.stationInfoDto = pStationInfoDto;
    }

}
