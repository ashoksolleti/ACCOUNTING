/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * <code>MultipleFindRequest</code> is the request class which contains the list of search input values.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>searchInputs</code>
 * </ul>
 */
public class MultipleFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2696677638214895084L;

    /**
     * Attribute to hold the list of <code>searchInputs</code> values.
     */
    private Set searchInputs = new HashSet();

    /**
     * <code>Default constructor.</code>
     */
    public MultipleFindRequest() {

    }

    /**
     * Gets the set of <code>searchInputs</code> property.
     * <p>
     * That contains a list of search input values.
     * <p>
     * 
     * @return the current value of set of <code>searchInputs</code> property.
     */

    public Set getSearchInputs() {

        return this.searchInputs;
    }

    /**
     * Sets the set of <code>searchInputs</code> property.
     * <p>
     * That contains a list of search input values.
     * <p>
     * 
     * @param pSearchInputs the new value of set of <code>searchInputs</code> property.
     */
    public void setSearchInputs(final Set pSearchInputs) {

        this.searchInputs = pSearchInputs;
    }

    /**
     * Add the <code>searchInput</code> property.
     * <p>
     * That contains a search input value.
     * <p>
     * 
     * @param pSearchInput the new value of <code>searchInput</code> property.
     */
    public void addSearchInputs(final String pSearchInput) {
        this.searchInputs.add(pSearchInput);
    }
}