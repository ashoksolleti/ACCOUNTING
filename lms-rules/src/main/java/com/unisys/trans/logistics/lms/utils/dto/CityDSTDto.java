/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import java.util.Date;

/**
 * The <code>CityDSTDto</code> contains information about the Daylight Savings Time Details (DST) associated
 * with a city.
 * <p>
 * Each city will have two sets of <b>Daylight Saving Time information</b>.<br>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>endDSTDate
 * <li>endDSTTime
 * <li>standardDSTVariation
 * <li>startDSTDate
 * <li>startDSTTime
 * </code>
 * </ul>
 */
public class CityDSTDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     * <p>
     */
    private static final long serialVersionUID = -4542917019729538614L;

    /**
     * Attribute to hold <code>endDSTDate</code> property.
     * <p>
     * Local date of the city on which daylight savings time ends.
     */
    private Date endDSTDate;

    /**
     * Attribute to hold <code>endDSTTime</code> property.
     * <p>
     * Local time of the city at which daylight savings time ends. Mandatory if DST Variation to standard is
     * not None.
     */
    private Integer endDSTTime;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>standardDSTVariation</code> property.
     * <p>
     * Holds the amount of time to add to the local time during the DST period.
     */
    private String standardDSTVariation;

    /**
     * Attribute to hold <code>startDSTDate</code> property.
     * <p>
     * Local date of the city on which daylight savings time begins.
     */
    private Date startDSTDate;

    /**
     * Attribute to hold <code>startDSTTime</code> property.
     * <p>
     * Local time of the city at which daylight savings time starts. Mandatory if DST Variation to Standard is
     * not None.
     */
    private Integer startDSTTime;

    /**
     * Attribute to hold <code>yearNumber</code> property.
     */
    private Integer yearNumber;

    /**
     * <code>Default constructor.</code>
     */
    public CityDSTDto() {

    }

    /**
     * Gets the <code>endDSTDate</code> property.
     * <p>
     * Local date of the city on which daylight savings time ends.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @return the date on which daylight savings time ends.<br>
     */
    public Date getEndDSTDate() {
        return ContractUtility.getClonedDate(this.endDSTDate);
    }

    /**
     * Gets the <code>endDSTTime</code> property.
     * <p>
     * Local time of the city at which daylight savings time ends.
     * <p>
     * <b>Format: </b><br>
     * HHMM
     * <p>
     * <b>Example: </b><br>
     * 2300
     * <p>
     * 
     * @return the new <code>endDSTTime</code> of the city DST.<br>
     */
    public Integer getEndDSTTime() {
        return this.endDSTTime;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>standardDSTVariation</code> property.
     * <p>
     * Contains the amount of time to add to the local time during the DST period.
     * <p>
     * Possible Values: <br>
     * <ul>
     * <li>None
     * <li>15 min
     * <li>30 min
     * <li>1 hr
     * </ul>
     * <p>
     * <b>Format: </b><br>
     * 6 Alphanumeric
     * <p>
     * <b>Example:</b><br>
     * 1 hr
     * <p>
     * 
     * @return the <code>standardDSTVariation</code> of the city DST.<br>
     */
    public String getStandardDSTVariation() {
        return this.standardDSTVariation;
    }

    /**
     * Gets the <code>startDSTDate</code> property.
     * <p>
     * Local date of the city on which daylight savings time begins.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @return the <code>startDSTDate</code> of the city DST.<br>
     */
    public Date getStartDSTDate() {
        return ContractUtility.getClonedDate(this.startDSTDate);
    }

    /**
     * Gets the <code>startDSTTime</code> property.
     * <p>
     * Local time of the city at which daylight savings time starts.
     * <p>
     * <b>Format: </b><br>
     * HHMM
     * <p>
     * <b>Example: </b><br>
     * 2300
     * <p>
     * 
     * @return the current value of <code>startDSTTime</code> of the city DST.<br>
     */
    public Integer getStartDSTTime() {
        return this.startDSTTime;
    }

    /**
     * Gets the <code>yearNumber</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li>1 - Year1
     * <li>2 - Year2
     * <p>
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric
     * <p>
     * <b>Example: </b><br>
     * 1
     * <p>
     * 
     * @return the current value of <code>yearNumber</code> of the daylight saving time.<br>
     */
    public Integer getYearNumber() {
        return this.yearNumber;
    }

    /**
     * Sets the <code>endDSTDate</code> property.
     * <p>
     * Local date of the city on which daylight savings time ends .
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @param pEndDSTDate the new value of <code>endDSTDate</code>.<br>
     */
    public void setEndDSTDate(final Date pEndDSTDate) {
        this.endDSTDate = ContractUtility.getClonedDate(pEndDSTDate);
    }

    /**
     * Sets the <code>endDSTTime</code> property.
     * <p>
     * Local time of the city at which daylight savings time ends.
     * <p>
     * <b>Format: </b><br>
     * HHMM
     * <p>
     * <b>Example: </b><br>
     * 2300
     * <p>
     * 
     * @param pEndDSTTime the new value of <code>endDSTTime</code> property.<br>
     */
    public void setEndDSTTime(final Integer pEndDSTTime) {
        this.endDSTTime = pEndDSTTime;
    }

    /**
     * Sets the <code>oid</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>standardDSTVariation</code> property.
     * <p>
     * Contains the amount of time to add to the local time during the DST period.
     * <p>
     * <b>Format: </b><br>
     * 6 Alphanumeric
     * <p>
     * <b>Example:</b><br>
     * 1 hr
     * <p>
     * 
     * @param pStandardDSTVariation the new value of <code>standardDSTVariation</code> property.<br>
     */
    public void setStandardDSTVariation(final String pStandardDSTVariation) {
        this.standardDSTVariation = pStandardDSTVariation;
    }

    /**
     * Sets the <code>startDSTDate</code> property.
     * <p>
     * Local date of the city on which daylight savings time begins.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 26JUN07
     * <p>
     * 
     * @param pStartDSTDate the new value of <code>startDSTDate</code>.<br>
     */
    public void setStartDSTDate(final Date pStartDSTDate) {
        this.startDSTDate = ContractUtility.getClonedDate(pStartDSTDate);
    }

    /**
     * Sets the <code>startDSTTime</code> property.
     * <p>
     * Local time of the city at which daylight savings time starts.
     * <p>
     * <b>Format: </b><br>
     * HHMM
     * <p>
     * <b>Example: </b><br>
     * 2300
     * <p>
     * 
     * @param pStartDSTTime the new value of <code>startDSTTime</code> property.<br>
     */
    public void setStartDSTTime(final Integer pStartDSTTime) {
        this.startDSTTime = pStartDSTTime;
    }

    /**
     * Sets the <code>yearNumber</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li>1 - Year1
     * <li>2 - Year2
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric
     * <p>
     * <b>Example: </b><br>
     * 1
     * <p>
     * 
     * @param pYearNumber the <code>yearNumber</code> of the daylight saving time.<br>
     */
    public void setYearNumber(final Integer pYearNumber) {
        this.yearNumber = pYearNumber;
    }
}
