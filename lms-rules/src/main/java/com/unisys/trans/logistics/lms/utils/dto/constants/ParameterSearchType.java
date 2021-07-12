/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>ParameterSearchType</code> holds enumerated types that indicates the various types of parameter
 * search.
 */
public enum ParameterSearchType {
    /**
     * This literal indicates search by start and end dates.
     */
    BYDATE("BYDATE"),

    /**
     * This literal indicates search by group name.
     */
    GROUP("GROUP"),

    /**
     * This literal indicates search by Module Name.
     */

    MODULE("MODULE"),

    /**
     * This literal indicates search by parameter name.
     */
    PARAMETERNAME("PARAMETERNAME"),

    /**
     * This literal indicates search by retain indicator.
     */
    RETAININDICATOR("RETAININDICATOR"),

    /**
     * This literal indicates the application should search in grouping,module name, parameter name and
     * description fields and return all possible matches.
     */

    SEARCHTEXT("searchText");

    private String searchType;

    /**
     * Constructor.
     * 
     * @param pSearchType - Parameter Search Type
     */

    ParameterSearchType(final String pSearchType) {
        this.setSearchType(pSearchType);
    }

    /**
     * Gets the <code>SearchType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Enum
     * <p>
     * <b>Example: </b><br>
     * paramName
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>PARAMETERNAME</code><br>
     * <li><code>GROUPING</code> <br>
     * <li><code>BYDATE</code> <br>
     * <li><code>RETAININDICATOR</code> <br>
     * <li><code>MODULE</code> <br>
     * <p>
     * 
     * @return the current value of the <code>searchType</code> property.
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * Sets the <code>SearchType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Enum
     * <p>
     * <b>Example: </b><br>
     * paramName
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>PARAMETERNAME</code><br>
     * <li><code>GROUPING</code> <br>
     * <li><code>BYDATE</code> <br>
     * <li><code>RETAININDICATOR</code> <br>
     * <li><code>MODULE</code> <br>
     * <p>
     * 
     * @param pSearchType Sets the current value of the <code>searchType</code> property.
     */
    public void setSearchType(final String pSearchType) {
        this.searchType = pSearchType;
    }

}
