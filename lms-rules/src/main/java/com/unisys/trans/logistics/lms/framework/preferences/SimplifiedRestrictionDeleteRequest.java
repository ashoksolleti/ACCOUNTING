/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.preferences;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>RestrictionDeleteRequest</code> is used for deleting the restriction. The object ID of the
 * restriction being deleted is required to delete the restriction.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>stationCode
 * <li>restrictionDetailOId
 * <li>version
 * </code>
 * </ul>
 */
public class SimplifiedRestrictionDeleteRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7580749324722558192L;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>RestrictionCodeDto</code>.It is of type Long.<br>
     */
    private long oid;
    /**
     * Attribute to hold <code>restrictionDetailOId</code> property.
     * <p>
     * Unique key identify the <code>RestrictionCodeDto</code>.It is of type Long.<br>
     */
    
    private List<Long> listOfids;
    
    private Long restrictionDetailOId;

    /**
     * Attribute to hold <code>stationCode</code> property.
     * <p>
     * Station for which the restriction information is to be deleted.
     */
    private String stationCode;

    /**
     * Attribute to hold <code>version</code> property.
     * <p>
     */
    private long version;

    /**
     * <code>Default constructor.</code>
     */
    public SimplifiedRestrictionDeleteRequest() {

    }

    /**
     * Gets the <code>oId</code>property.
     * <p>
     * Unique key to identify the <code>Restriction</code>.It is of type Long. <br>
     * <p>
     * <b>Format</b><br>
     * <p>
     * This gives the object ID in numeric format.<br>
     * 
     * @return the current value of the <code>oId</code> property.
     */
  

    /**
     * Gets the <code>restrictionDetailOId</code>property.
     * <p>
     * Unique key to identify the <code>RestrictionDetailDto</code>.It is of type Long.<br>
     * <p>
     * <b>Format</b><br>
     * This gives the object ID in numeric format.<br>
     * <p>
     * 
     * @return the current value of the <code>restrictionDetailOId</code> property.
     */
    public Long getRestrictionDetailOId() {
        return this.restrictionDetailOId;
    }

    /**
     * Gets the value of the <code>stationCode</code> property.
     * <p>
     * Station for which the restriction information is to be deleted.
     * <p>
     * <b>Format: </b><br>
     * 3 or 5 Alphabets<br>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>stationCode</code> property.
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Access method for the version property.
     * <p>
     * The version number that identifies an restriction for every update. This version is an auto-generated
     * value at the system level. Hence, this cannot be updated.
     * <p>
     * 
     * @return the current value of the <code>version</code> property.
     */
    public long getVersion() {
        return this.version;
    }

    /**
     * Sets the value of the <code>OId</code> property.
     * <p>
     * Unique key identify the <code>Restriction</code>.It is of type Long.<br>
     * <p>
     * 
     * @param pOId the new value of the <code>OId</code> property.
     */
  
    /**
     * Sets the value of the <code>restrictionDetailOId</code> property.
     * <p>
     * Unique key to identify the <code>RestrictionDetailDto</code>.It is of type Long.<br>
     * <p>
     * 
     * @param pRestrictionDetailOId the new value of the <code>restrictionDetailOId</code> property.
     */
    public void setRestrictionDetailOId(final Long pRestrictionDetailOId) {
        this.restrictionDetailOId = pRestrictionDetailOId;
    }

    /**
     * Sets the value of the <code>stationCode</code> property.
     * <p>
     * Station for which the restriction information is to be deleted.
     * <p>
     * <b>Format: </b><br>
     * 3 or 5 Alphabets<br>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pStationCode the new value of the <code>stationCode</code> property.
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = pStationCode;
    }

    /**
     * Sets the value of the version property.
     * <p>
     * The version number that identifies an restriction for every update. This version is an auto-generated
     * value at the system level. Hence, this cannot be updated.
     * <p>
     * 
     * @param pVersion the new value of the version property.
     */
    public void setVersion(final long pVersion) {
        this.version = pVersion;
    }

	public long getOid() {
		return oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}
	public List<Long> getListOfids() {
		return listOfids;
	}

	public void setListOfids(List<Long> listOfids) {
		this.listOfids = listOfids;
	}
    
}
