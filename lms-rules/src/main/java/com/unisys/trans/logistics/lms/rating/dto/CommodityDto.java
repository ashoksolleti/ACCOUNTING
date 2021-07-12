/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;

import java.util.Date;
import java.util.List;

/**
 * <code>CommodityDto</code> holds all the attributes that are associated with
 * general commodity information.<br>
 * Commodity has at least one version and can hold multiple versions each with
 * an effective and end date.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>code
 * <li>deletionDate
 * <li>commodityVersions
 * <li>hiddenIndicator
 * <li>oId
 * <li>type
 * <li>retainIndicator
 * </code>
 * </ul>
 */
public class CommodityDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6933990500630969691L;

    /**
     * Attribute to hold <code>code</code> property.
     * <p>
     * Commodity Code for the consignment. Commodity code must be unique. Valid format is four numerals (4N)
     * or four numerals with one character (4N1A). Mandatory.
     */
    private String code;

    /**
     * Attribute to hold <code>commodityType</code> property.
     * <p>
     * Commodity Type: Commodity types are a one character notation that denotes the type of commodity.
     * <ul>
     * Possible values are:<br>
     * <li>I - IATA (International Air Transport Association.)
     * <li>D - ATPCO (Airline Tariff Publishing Company.)
     * </ul>
     */
    private RatingConventionType commodityType;

    /**
     * Attribute to hold <code>commodityVersions</code> property.
     * <p>
     * List of CommodityVersions associated with the Commodity. It must be used in conjunction with
     * commodityDto.
     */
    private List<CommodityVersionDto> commodityVersions;

    /**
     * Attribute to hold <code>deletionDate</code> property.
     * <p>
     * Indicator to denote that fields cannot be updated. Record is marked for deletion. Based upon this
     * information, the LMS BUI protects all the fields. If set to true, fields cannot be updated.
     */
    private Date deletionDate;

    /**
     * Attribute to hold <code>hiddenIndicator</code> property.
     * <p>
     * Indicator to denote that the commodity can be displayed on other function�s commodity search.
     * <ul>
     * Possible values are:<br>
     * <li><code>true</code> - The commodity cannot be displayed on other function's commodity search.
     * <li><code>false</code> - The commodity can be displayed on other function's commodity search.
     * </ul>
     * <p>
     * Note: Other functions like Air Waybill, Booking Information uses the commodity for rating purpose and
     * this indicator is set to True ('Y)�, commodity will be part of the search from other functions.
     */
    // The name of getter method (isHidden) is a meaningful condition.
    private boolean hiddenIndicator; // NOPMD

    /**
     * Attribute to hold <code>hiddenIndicator</code> property.
     * 
     */
    private boolean retainIndicator;

    /**
     * Attribute to hold <code>commodityTypeString</code> property.
     *
     */
    private String commodityTypeString;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key for Commodity.
     */
    private Long oId;

    /**
     * Default constructor.
     */
    public CommodityDto() {

    }
    
    /**
     * Constructor with code as an argument.
     * <p>
     * 
     * @param pCode
     *            holds the carrier code.
     * @param pDate
     *            holds the date.
     */
    public CommodityDto(final String pCode,
            final Date pDate) {
        this.code = pCode;
        this.deletionDate = ContractUtility.getClonedDate(pDate);
    }

    /**
     * Constructor with code as an argument.
     * <p>
     *
     * @param pCommoditycode the new value of the <code>Commoditycode</code> property.
     * @param pCommodityTypeString the new value of the <code>CommodityTypeString</code> property.
     */
    public CommodityDto(final String pCommoditycode, final String pCommodityTypeString) {
        this.code = pCommoditycode;
        this.commodityTypeString = pCommodityTypeString;
    }

    /**
     * Gets the <code>code</code> property.
     * <p>
     * Commodity Code is a unique <code>code</code> to identify the commodity information.
     * <p>
     * <b>Format: </b><br>
     * 4-5 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 999A
     * <p>
     * 
     * @return the current value of the <code>commodityCode</code> property.<br>
     */
    public final String getCode() {
        return this.code;
    }

    /**
     * Gets the <code>commodityType</code> property.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.<br>
     */
    public final RatingConventionType getCommodityType() {
        return this.commodityType;
    }

    /**
     * Gets the <code>commodityVersions</code> property.
     * <p>
     * List of commodity versions.
     * <p>
     * 
     * @return the current value of the <code>commodityVersions</code> property.<br>
     */
    public final List<CommodityVersionDto> getCommodityVersions() {
        return this.commodityVersions;
    }

    /**
     * Gets the <code>deletionDate</code> property.
     * <p>
     * Represents the value of the <code>deletionDate</code> that marks the commodity as 'Deleted'.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT
     * DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @return the current value of the <code>deletionDate</code> property.<br>
     */
    public final Date getDeletionDate() {
        return ContractUtility.getClonedDate(this.deletionDate);
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
    @Override
    public final Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>hiddenIndicator</code> property.
     * <p>
     * <ul>
     * Possible values are: <br>
     * <li><code>true</code> - The commodity cannot be displayed on other function's commodity search.
     * <li><code>false</code> - The commodity can be displayed on other function's commodity search.
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>hiddenIndicator</code> property.<br>
     */
    public final boolean getHiddenIndicator() {
        return this.hiddenIndicator;
    }

    /**
     * <li>Gets the RetainIndicator.</li>
     * <p>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     * @return <code>boolean</code><br>
     *         Returns the RetainIndicator.<br>
     */

    public boolean getRetainIndicator() {
        return this.retainIndicator;
    }

    /**
     * Sets the <code>code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 4-5 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 999A
     * <p>
     * 
     * @param pCode
     *            the new value of the <code>commodityCode</code>property.<br>
     */
    public final void setCode(final String pCode) {
        this.code = ContractUtility.convertToUpperCase(pCode);
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code>property.<br>
     */
    public final void setCommodityType(final RatingConventionType pType) {
        this.commodityType = pType;
    }

    /**
     * Sets the <code>commodityVersions</code> property.
     * <p>
     * List of commodity versions.
     * <p>
     * 
     * @param pCommodityVersions
     *            the new value of the <code>commodityVersions</code> property.<br>
     */
    public final void setCommodityVersions(
                final List<CommodityVersionDto> pCommodityVersions) {
        this.commodityVersions = pCommodityVersions;

    }

    /**
     * Sets the <code>deletionDate</code> property.
     * <p>
     * Represents the value of the <code>deletionDate</code> to check whether the commodity is marked for
     * deletion.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT
     * DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @param pDeletionDate
     *            the new value of the <code>deletionDate</code>property.<br>
     */
    public final void setDeletionDate(final Date pDeletionDate) {
        this.deletionDate = ContractUtility.getClonedDate(pDeletionDate);
    }

    /**
     * Sets the <code>hiddenIndicator</code> property.
     * <p>
     * 
     * @param pHiddenIndicator
     *            the new value of the <code>hiddenIndicator</code>property.<br>
     */
    public final void setHiddenIndicator(final boolean pHiddenIndicator) {
        this.hiddenIndicator = pHiddenIndicator;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of <code>oId</code> property.<br>
     */
    public final void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>retainIndicator</code> property.
     * 
     * @param pRetainIndicator
     *            the new value of the <code>retainIndicator</code> property.
     */
    public void setRetainIndicator(final boolean pRetainIndicator) {
        this.retainIndicator = pRetainIndicator;
    }

    /**
     * gets the <code>commodityTypeString</code> property.
     *
     * @return commodityTypeString
     *
     */
    public String getCommodityTypeString() {
        return this.commodityTypeString;
    }

    /**
     * Sets the <code>commodityTypeString</code> property.
     *
     * @param commodityTypeString
     *            the new value of the <code>commodityTypeString</code> property.
     */
    public void setCommodityTypeString(final String commodityTypeString) {
        this.commodityTypeString = commodityTypeString;
    }
}