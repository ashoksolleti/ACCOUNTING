/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import java.util.List;

/**
 * <code>ParameterResponse</code> contains the response of the maintenance request received by
 * <code>ParameterService</code>.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <code>
 * <li>parameterDto
 * </code>
 * </ul>
 */
public class ParameterResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8571524166117416946L;

    /**
     * holds all available group names.
     */
    private List<String> groupNames;

    /**
     * holds the history of updates to a given parameter.
     */
    private List<ParameterHistoryDto> history;

    /**
     * Attribute to hold collection of <code>ParameterDto</code> object.
     */
    private List<ParameterDto> parameters;

    /**
     * <code>Default constructor.</code>
     */
    public ParameterResponse() {

    }

    /**
     * Gets the <code>groupNames</code> property.
     * <p>
     * @return the current value of the <code>groupNames</code> property.
     */
    public List<String> getGroupNames() {
        return this.groupNames;
    }

    /**
     * Gets the <code>history</code> property.
     * <p>
     * @return the current value of the <code>history</code> property.
     */
    public List<ParameterHistoryDto> getHistory() {
        return this.history;
    }

    /**
     * Gets the <code>parameters</code> property.
     * <p>
     * 
     * @return the current value of list of <code>ParameterDto</code> property.
     */
    public List<ParameterDto> getParameters() {
        return this.parameters;
    }

    /**
     * Sets the <code>groupNames</code> property.
     * <p>
     * @param pGroupNames
     *            the current value of the <code>groupNames</code> property.
     */
    public void setGroupNames(final List<String> pGroupNames) {
        this.groupNames = pGroupNames;
    }

    /**
     * Sets the <code>history</code> property.
     * <p>
     * @param pHistory
     *            the current value of the <code>history</code> property.
     */
    public void setHistory(final List<ParameterHistoryDto> pHistory) {
        this.history = pHistory;
    }

    /**
     * Sets the <code>billingAccountNumber2</code> property.
     * <p>
     * @param pBillingAccountNumber2
     *            the current value of the <code>billingAccountNumber2</code> property.
     */
    public void setParameters(final List<ParameterDto> pParameters) {
        this.parameters = pParameters;
    }

}
