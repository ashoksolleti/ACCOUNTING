/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AirWaybillPersistRequest</code>class represents the request to
 * create/update AccountingParticipantInformation details.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>accountingParticipantDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantDto
 */
public class AccountingAirWaybillResubmitRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 21818524079636356L;

    /**
     * Attribute to hold <code>airWaybillXML</code> property.
     */
    private String airWaybillXML;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Gets the <code>airWaybillXML</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybillXML</code> property.
     */
    public String getAirWaybillXML() {
        return this.airWaybillXML;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>airWaybillXML</code>.
     * <p>
     * 
     * @param pAirWaybillXML
     *            holds the new value of <code>airWaybillXML</code>
     */
    public void setAirWaybillXML(final String pAirWaybillXML) {
        this.airWaybillXML = pAirWaybillXML;
    }

    /**
     * Sets the <code>oId</code>.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>oId</code>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
