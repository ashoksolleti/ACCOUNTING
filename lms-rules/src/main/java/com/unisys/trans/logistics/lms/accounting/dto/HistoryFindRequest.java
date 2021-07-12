/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>HistoryFindRequest</code> is used for finding history of static data.
 * <p>
 * It fetches the history of static data based on the category, identifier and owner.
 * <ul>
 * <li>If the identifier is empty or null then it returns the list of history of static data for a particular
 * owner.
 * <li>If the identifier is found then it returns the history static data for a particular identifier.
 * </ul>
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>owner
 * <li>identifier
 * <li>category
 * </code>
 * </ul>
 */
public class HistoryFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2518131738287604068L;

    /**
     * Attribute to hold <code>awbnumber</code> property.
     * <p>
     * Specifies the airwaybill number AWB, etc.
     */
    private AirWaybillNumberDto airWaybillNumberDto;

    private Date awbCreationDate;

    private String awbnumber;
    
    /**
     * Attribute to hold the <code>awbOid</code> object.
     */
    private Long awbOid;

    private Date localtimeStamp;
    

    public Date getLocaltimeStamp() {
		return localtimeStamp;
	}

	public void setLocaltimeStamp(Date localtimeStamp) {
		this.localtimeStamp = localtimeStamp;
	}

    public HistoryFindRequest() {

    }

    /**
     * Gets the <code>airWaybillNumberDto</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>airWaybillNumberDto</code> property.
     */
    public AirWaybillNumberDto getAirWaybillNumberDto() {
        return this.airWaybillNumberDto;
    }

    /**
     * @return the awbcreationdate
     */
    public Date getAwbCreationDate() {
        return this.awbCreationDate;
    }

    /**
     * @return the awbnumber
     */
    public String getAwbnumber() {
        return this.awbnumber;
    }

    /**
     * Sets the <code>airWaybillNumberDto</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pAirWaybillNumberDto
     *            the new value of the <code>airWaybillNumberDto</code> property.
     */
    public void setAirWaybillNumberDto
                (final AirWaybillNumberDto pAirWaybillNumberDto) {
        this.airWaybillNumberDto = pAirWaybillNumberDto;
    }

    /**
     * @param awbcreationdate the awbcreationdate to set
     */
    public void setAwbCreationDate(final Date pAwbcreationdate) {
        this.awbCreationDate = pAwbcreationdate;
    }

    /**
     * @param awbnumber the awbnumber to set
     */
    public void setAwbnumber(final String pAwbnumber) {
        this.awbnumber = pAwbnumber;
    }

    /**
     * @return the awbOid
     */
    public Long getAwbOid() {
        return this.awbOid;
    }

    /**
     * @param awbOid the awbOid to set
     */
    public void setAwbOid(final Long pAwbOid) {
        this.awbOid = pAwbOid;
    }

}
