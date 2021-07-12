/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;

/**
 * <code>CommodityFindRequest</code> class represents the request to find the commodity information.
 * <p>
 * It is used to find commodity information based on commodity <code>code</code> or <code>searchCode</code> <br>
 * The <code>searchCode</code> may take a full or partial search text to find the commodity. The value
 * provided in the <code>searchCode</code> can be commodity code or commodity description.<br>
 * There can also be a optional filter condition <code>includeHidden</code>, that indicates whether to return
 * the hidden commodity information.
 * <ul>
 * <li><code>code</code></li>
 * <li><code>includeHidden</code></li>
 * <li><code>searchCode</code></li>
 * <li><code>type</code></li>
 * </ul>
 */
public class CommodityFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2397415435250926937L;

    /**
     * Attribute to hold <code>code</code> property.
     * <p>
     * Code to be retrieved.
     */
    private String code;

    /**
     * Attribute to hold <code>commodityType</code> property.
     */
    private RatingConventionType commodityType;

    /**
     * Attribute to hold <code>date</code> property.
     */
    private Date date;

    /**
     * Attribute to hold <code>includeHidden</code> property.
     * <p>
     * <ul>
     * Possible values:
     * <li><code>true</code> - then search all the commodities.<br>
     * <li><code>false</code> - then perform search on non-hidden commodities (i.e. marked as false in
     * hiddenIndicator).
     * </ul>
     */
    // The name of getter method (isHiddenAllowed) is a meaningful condition.
    private boolean includeHidden; // NOPMD

    /**
     * Attribute to hold <code>searchCode</code> property.
     * <p>
     * SearchCode attribute will be set when search is being made through Find Utility, where the value can be
     * Commodity Number (if 4 numerals) or Partial/Full Description.
     */
    private String searchCode;

    private String searchText;

    private String productCode;

    /**
     * Default constructor.
     */
    public CommodityFindRequest() {
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
     * @return the current value of the <code>commodityType</code> property.<br>
     */
    public final RatingConventionType getCommodityType() {
        return this.commodityType;
    }

    /**
     * Gets the <code>date</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return date
     *         the new value of the <code>date</code> property.
     */
    public Date getDate() {
        return ContractUtility.getClonedDate(this.date);
    }

    /**
     * Gets the <code>searchCode</code> property.
     * <p>
     * Full or partial commodity description or Commodity code (four numerals).
     * <p>
     * <b>Format: </b><br>
     * 25 characters of alphabets, numbers or any special characters.
     * <p>
     * <b>Example: </b><br>
     * Perishable
     * <p>
     * 
     * @return the current value of the <code>searchCode</code> property.<br>
     */
    public final String getSearchCode() {
        return this.searchCode;
    }

    /**
     * Gets the <code>includeHidden</code> property.
     * <p>
     * <ul>
     * Possible values are: <br>
     * <li><code>true</code> - The commodity can be displayed on other function's commodity search.
     * <li><code>false</code> - The commodity cannot be displayed on other function's commodity search.
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>includeHidden</code> property.<br>
     */
    public final boolean isHiddenAllowed() {
        return this.includeHidden;
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
     * @param pCommodityCode the new value of the <code>commodityCode</code>property.<br>
     */
    public void setCode(final String pCommodityCode) {
        this.code = ContractUtility.convertToUpperCase(pCommodityCode);
    }

    /**
     * Sets the <code>RatingConventionType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * I or D
     * <p>
     * 
     * @param pCommodityType
     *            the new value of the <code>RatingConventionType</code> property.
     */

    public void setCommodityType(final RatingConventionType pCommodityType) {
        this.commodityType = pCommodityType;
    }

    /**
     * Sets the <code>date</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @param pDate
     *            the new value of the <code>date</code> property.
     */
    public void setDate(final Date pDate) {
        this.date = ContractUtility.getClonedDate(pDate);
    }

    /**
     * Sets the <code>includeHidden</code> property.
     * <p>
     * 
     * @param pIncludeHidden the new value of the <code>includeHidden</code>property.<br>
     */
    public void setIncludeHidden(final boolean pIncludeHidden) {
        this.includeHidden = pIncludeHidden;

    }

    /**
     * Sets the <code>searchCode</code> property.
     * <p>
     * 
     * @param pSearchCode the new value of the <code>searchCode</code>property.<br>
     */
    public void setSearchCode(final String pSearchCode) {
        this.searchCode = pSearchCode;
    }

    public String getSearchText() {
        return this.searchText;
    }

    /**
     * Sets the value of the <code>searchText</code> property.
     * <p>
     *
     * @param pSearchText <code>String</code><br>
     *            The new value of the <code>searchText</code> property.<br>
     *            </p>
     */
    public void setSearchText(final String pSearchText) {
        this.searchText = pSearchText;
    }


    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(final String pProductCode) {
        this.productCode = pProductCode;
    }


}