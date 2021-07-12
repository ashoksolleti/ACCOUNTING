package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class StationInformationResponse extends AbstractResponse{

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6988937733021658169L;
    
    /**
     * Attribute to hold <code>station</code> property. The station data transfer object which holds the
     * station information that needs to be returned to client.
     */

    private StationInfoDto station;

    /**
     * <code>Default constructor.</code>
     */
    public StationInformationResponse() {

    }

    /**
     * Gets the <code>station</code>.
     * <p>
     * 
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto StationInformationDto}</code><br>
     *         Returns the <code>StationInformationDto</code>.
     *         </p>
     */
    public StationInfoDto getStation() {
        return this.station;
    }

    /**
     * Sets the <code>StationInformationDto</code>.
     * <p>
     * 
     * @param pStationInformationDto <code> {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto StationInformationDto}</code><br>
     *            The station data transfer object
     *            </p>
     */
    public void setStation(final StationInfoDto pStation) {
        this.station = pStation;
    }

}
