/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CityRestoreRequest</code> is the request object for restoring a city that had been earlier marked for
 * deletion.
 * <p>
 * It holds the cityCode that needs to be restored.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>cityCode</code>
 * </ul>
 */
public class CityRestoreRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3333237414182049800L;

    /**
     * Attribute to hold <code>cityCode</code> property.
     * <p>
     * The IATA city code that uniquely represents a city.
     */
    private String cityCode;

    /**
     * <code>Default constructor</code>.
     */
    public CityRestoreRequest() {

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
     * @return the current value of the <code>cityCode</code> of the city.<br>
     */
    public String getCityCode() {
        return this.cityCode;
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
     * @param pCityCode the current value of <code>cityCode</code>.<br>
     */
    public void setCityCode(final String pCityCode) {
        this.cityCode = ContractUtility.convertToUpperCase(pCityCode);
    }
}
