package com.unisys.trans.logistics.lms.utils.dto.ucs;

import java.io.Serializable;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>StationHolidayHoursDto</code> contain details of Station Holiday Hours.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>holidayDate
 * <li>stationHoursDto
 * </code>
 * </ul>
 */
public class StationHolidayHoursDto implements Serializable {

    /**
     * Generated serial version added. add a valid serial version id.
     */
    private static final long serialVersionUID = 8921122412528392330L;

    /**
     * Attribute to hold the <code>holidayDate</code> property.
     */
    private Date holidayDate;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;
  //LMS-25183 - start
    public Long getoId() {
		return oId;
	}

	public void setoId(Long oId) {
		this.oId = oId;
	}
	//LMS-25183 - end
	/**
     * Attribute to hold the <code>stationHoursDto</code> property.
     */
    private StationHoursDto stationHoursDto;

    /**
     * Gets the <code>holidayDate</code> property.
     * <p>
     * 
     * @return the current value of <code>holidayDate</code> property.
     */
    public Date getHolidayDate() {
        return ContractUtility.getClonedDate(this.holidayDate);
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>stationHoursDto</code> property.
     * <p>
     * 
     * @return the current value of <code>stationHoursDto</code> property.
     */
    public StationHoursDto getStationHoursDto() {
        return this.stationHoursDto;
    }

    /**
     * Sets the <code>holidayDate</code> property.
     * <p>
     * 
     * @param pHolidayDate
     *            the new value of <code>holidayDate</code> property.
     */
    public void setHolidayDate(final Date pHolidayDate) {
        this.holidayDate = ContractUtility.getClonedDate(pHolidayDate);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>stationHoursDto</code> property.
     * <p>
     * 
     * @param pStationHoursDto
     *            the new value of <code>stationHoursDto</code> property.
     */
    public void setStationHoursDto(final StationHoursDto pStationHoursDto) {
        this.stationHoursDto = pStationHoursDto;
    }

}
