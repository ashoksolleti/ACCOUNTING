/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>ValidationResponse</code> contains the response that contains invalid inputs, valid inputs and search
 * inputs.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>invalidInputs
 * <li>validInputs
 * <li>searchInputs
 * </ul>
 */
public class ValidationResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 26341777361256071L;

    /**
     * Attribute to hold <code>searchInputs</code> property.
     */
    private List<String> searchInputs = new ArrayList<String>();

    /**
     * Attribute to hold <code>validInputs</code> property.
     */
    private List<String> validInputs = new ArrayList<String>();
     /**
     * Attribute to hold <code>validInputs</code> property.
     */

    /**
     * <code>Default constructor.</code>
     */
    public ValidationResponse() {

    }

    /**
     * Gets the <code>searchInputs</code> property.
     * <p>
     * The object that contains list of search input values.
     * <p>
     * 
     * @return the current value of list of <code>searchInputs</code> property.
     */
    public List<String> getSearchInputs() {
        return this.searchInputs;
    }

    /**
     * Gets the <code>validInputs</code> property.
     * <p>
     * The object which contains list of valid input values.
     * <p>
     * 
     * @return the current value of list of <code>validInputs</code> property.
     */

    public List<String> getValidInputs() {
        return this.validInputs;
    }

    /**
     * Sets the <code>searchInputs</code> property.
     * <p>
     * 
     * @param pSearchInputs the new value of list of <code>searchInputs</code> property.
     */
    public void setSearchInputs(final List<String> pSearchInputs) {
        this.searchInputs = pSearchInputs;
    }

    /**
     * Sets the <code>validInputs</code> property.
     * <p>
     * 
     * @param pValidInputs the new value of list of <code>validInputs</code> property.
     */
    public void setValidInputs(final List<String> pValidInputs) {
        this.validInputs = pValidInputs;
    }


}
