package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class StationInformationFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2821166060037763124L;

    /**
     * Attribute to hold the <code>stationCode</code> property.
     */
    private String stationCode;

    /**
     * Gets the value of the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets<br>
     * <b>Example: </b><br>
     * MSP
     * 
     * @return <code>String</code><br>
     *         Returns the current value of the <code>stationCode</code> property.<br>
     *         </p>
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Sets the value of the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets<br>
     * <b>Example: </b><br>
     * MSP
     * 
     * @param pStationCode <code>String</code><br>
     *            The new value of the <code>stationCode</code> property.<br>
     *            </p>
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

}
