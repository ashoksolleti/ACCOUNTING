/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * The <code>DigiUserDto</code> contains information about the DigiUser that are provided in the<br>
 * response object to the client.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>name
 * <li>email
 * <li>station
 * <li>role
 * </code>
 * </ul>
 */
public class DigiUserDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7987424720553928611L;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.oId == null) ? 0 : this.oId.hashCode());
        result = prime * result + ((this.role == null) ? 0 : this.role.hashCode());
        result = prime * result + ((this.station == null) ? 0 : this.station.hashCode());
        result = prime * result + ((this.userid == null) ? 0 : this.userid.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object pObject) {
        if (this == pObject)
            return true;
        if (pObject == null)
            return false;
        if (getClass() != pObject.getClass())
            return false;
        DigiUserDto other = (DigiUserDto) pObject;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.oId == null) {
            if (other.oId != null)
                return false;
        }
        else if (!this.oId.equals(other.oId))
            return false;
        if (this.role == null) {
            if (other.role != null)
                return false;
        }
        else if (!this.role.equals(other.role))
            return false;
        if (this.station == null) {
            if (other.station != null)
                return false;
        }
        else if (!this.station.equals(other.station))
            return false;
        if (this.userid == null) {
            if (other.userid != null)
                return false;
        }
        else if (!this.userid.equals(other.userid))
            return false;
        return true;
    }

    /**
     * Attribute to hold <code>email</code> property.
     */
    private String email;

    /**
     * Attribute to hold <code>userid</code> property.
     */
    private String userid;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>role</code> property.
     * <p>
     * The role of the user.
     */
    private String role;

    /**
     * Attribute to hold <code>station</code> property.
     */
    private String station;

    /**
     * Gets the <code>email</code> property.
     * 
     * @return the current value of <code>email</code> property.
     */
    public final String getEmail() {
        return this.email;
    }

    /**
     * Gets the <code>userid</code> property.
     * 
     * @return the current value of <code>userid</code> property.
     */
    public final String getUserid() {
        return this.userid;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public final Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>role</code> property.
     * 
     * @return the current value of <code>role</code> to which the user belongs.<br>
     */
    public String getRole() {
        return this.role;
    }

    /**
     * Gets the <code>station</code> property.
     * 
     * @return the current value of the <code>station</code> property.
     */
    public final String getStation() {
        return this.station;
    }

    /**
     * Sets the <code>email</code> property.
     * 
     * @param pEmail the new value of <code>email</code> property.
     */
    public final void setEmail(final String pEmail) {
        this.email = pEmail;
    }

    /**
     * Sets the <code>userid</code> property.
     * 
     * @param pName the new value of <code>userid</code> property.
     */
    public final void setUserid(final String pUserid) {
        this.userid = ContractUtility.convertToUpperCase(pUserid);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public final void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>role</code> property.
     * 
     * @param pRole the new value of <code>role</code> property.
     */
    public final void setRole(final String pRole) {
        this.role = ContractUtility.convertToUpperCase(pRole);
    }

    /**
     * Sets the value of the <code>station</code> property.
     * 
     * @param pStation the new value of the <code>station</code> property.
     */
    public final void setStation(final String pStation) {
        this.station = pStation;
    }

    @Override
    public String toString() {
        return "DigiUserDto [userid=" + userid + ", email=" + email + ", station=" + station + ", role="
                    + role + ", oId=" + oId + "]";
    }

}