/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <code>ValidationRequest</code> is the request class which contains the list of search input values.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>searchInputs</code>
 * </ul>
 */
public class ValidationRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3305725563240164659L;

    /**
     * Attribute to hold the list of <code>searchInputs</code> property values.
     */
    private List<String> searchInputs = new ArrayList<String>();

    /**
     * <code>Default constructor.</code>
     */
    public ValidationRequest() {

    }

    /**
     * Gets the <code>searchInputs</code> property.
     * <p>
     * 
     * @param pSearchInputs the new value of list of <code>searchInputs</code> property.
     */
    public ValidationRequest(final List<String> pSearchInputs) {

        this.searchInputs = pSearchInputs;

    }

    /**
     * Sets the list of <code>searchInputs</code> property.
     * <p>
     * 
     * @param pSearchInput the new value of list of <code>searchInputs</code> property.
     */
    public void addSearchInputs(final String pSearchInput) {
        if (this.searchInputs == null) {
            this.searchInputs = new ArrayList<String>();
        }
        this.searchInputs.add(pSearchInput);
    }

    /**
     * Gets the list of string of <code>searchInputs</code> property .
     * <p>
     * That contains list of search input values.
     * <p>
     * 
     * @return the current value of list of <code>searchInputs</code> property.
     */

    public List<String> getSearchInputs() {

        return this.searchInputs;
    }

    /**
     * Sets the list of <code>searchInputs</code> property.
     * <p>
     * 
     * @param pSearchInputs the new value of list of <code>searchInputs</code> property.
     */
    public void setSearchInputs(final List<String> pSearchInputs) {

        this.searchInputs = pSearchInputs;
    }
    
    // LMSC-11111 UIS158 Start
    private HashMap<String, String> aOfficeStation = new HashMap<String, String>();
    
    public HashMap<String, String> getaOfficeStation() {
        return this.aOfficeStation;
    }
    
    public void setaOfficeStation(final HashMap<String, String> pAOfficeStation) {
        this.aOfficeStation = pAOfficeStation;
    }
    // LMSC-11111 UIS158 End

}
