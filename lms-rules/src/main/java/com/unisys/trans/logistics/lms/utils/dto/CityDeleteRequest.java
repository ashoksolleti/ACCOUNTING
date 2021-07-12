/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.Date;

/**
 * <code>CityDeleteRequest</code> is used for marking a city for deletion if the city is in use.
 * <p>
 * In case of the marking the city for deletion, the end date must be provided and the city code is mandatory.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>cityCode
 * <li>endDate
 * </code>
 * </ul>
 */
public class CityDeleteRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5108952644956221444L;

    /**
     * Attribute to hold <code>cityCode</code> property.
     * <p>
     * The IATA city code that uniquely represents a city.
     */
    private String cityCode;

    /**
     * Attribute to hold <code>endDate</code> property.
     * <p>
     * The end date for the city. The city in use cannot be deleted permanently from the database. In that
     * case the city is marked for deletion and an end date is provided.
     */
    private Date endDate;

    /**
     * <code>Default constructor.</code>
     */
    public CityDeleteRequest() {

    }

    /**
     * Gets the <code>cityCode</code> property.
     * <p>
     * The IATA city code that uniquely represents a city.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @return the new value of <code>cityCode</code>.
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * Gets the <code>endDate</code> property.
     * <p>
     * Indicates the end date for the city. The city in use cannot be deleted permanently from the database.
     * In that case the city is marked for deletion and an end date is provided.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @return the current value of <code>endDate</code> of the city.<br>
     */
    public Date getEndDate() {
        return ContractUtility.getClonedDate(this.endDate);
    }

    /**
     * Sets the <code>cityCode</code> property.
     * <p>
     * The IATA city code that uniquely represents a city.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @param pCityCode the new value of <code>cityCode</code> that uniquely represents a city.
     */
    public void setCityCode(final String pCityCode) {
        this.cityCode = ContractUtility.convertToUpperCase(pCityCode);
    }

    /**
     * Sets the <code>endDate</code> property.
     * <p>
     * The end date for the city. The city in use cannot be deleted permanently from the database. In that
     * case the city is marked for deletion and an end date is provided.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @param pEndDate the new value of <code>endDate</code> for the city.
     */
    public void setEndDate(final Date pEndDate) {
        this.endDate = ContractUtility.getClonedDate(pEndDate);
    }
}
