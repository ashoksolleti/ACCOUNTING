/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.utils.constants.UserType;

/**
 * <code>PreferencesFindRequest</code> is used for retrieving <code>Preferences</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>findByGroup
 * <li>functionName
 * <li>entityName
 * <li>entityId
 * <li>groupName
 * <li>userIdentifier
 * <li>userType
 * </ul>
 */
public class PreferencesFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -42480786469138905L;

    /**
     * Attribute to hold the <code>findByGroup</code> property.
     */
    private boolean findByGroup;

    /**
     * Attribute to hold the <code>functionName</code> property.
     */
    private String functionName;

    /**
     * Attribute to hold the <code>entityName</code> property.
     */
    private String entityName;

    /**
     * Attribute to hold the <code>entityId</code> property.
     */
    private String entityId;
    /**
     * Attribute to hold the <code>groupName</code> property.
     */
    private String groupName;

    /**
     * Attribute to hold the <code>userIdentifier</code> property.
     */
    private String userIdentifier;

    /**
     * Attribute to hold the <code>userType</code> property.
     */
    private UserType userType;

    /**
     * Attribute to hold the <code>isProfileAdmin</code> property.
     */

    private boolean isProfileAdmin;
    
   
    /**
     * Gets the <code>functionName</code> property.
     * <p>
     * 
     * @return the current value of <code>functionName</code> property.<br>
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * Gets the <code>groupName</code> property.
     * <p>
     * 
     * @return the current value of <code>groupName</code> property.<br>
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * Gets the <code>userIdentifier</code> property.
     * <p>
     * 
     * @return the current value of <code>userIdentifier</code> property.<br>
     */
    public String getUserIdentifier() {
        return this.userIdentifier;
    }

    /**
     * Gets the <code>userType</code> property.
     * <p>
     * 
     * @return the current value of <code>userType</code> property.<br>
     */
    public UserType getUserType() {
        return this.userType;
    }

    /**
     * Gets the <code>findByGroup</code> property.
     * <p>
     * 
     * @return the current value of <code>findByGroup</code> property.<br>
     */
    public boolean isFindByGroup() {
        return this.findByGroup;
    }

    /**
     * Sets the <code>findByGroup</code> property.
     * <p>
     * 
     * @param pFindByGroup
     *            the current value of the <code>findByGroup</code> property.
     */
    public void setFindByGroup(final boolean pFindByGroup) {
        this.findByGroup = pFindByGroup;
    }

    /**
     * Sets the <code>functionName</code> property.
     * <p>
     * 
     * @param pFunctionName
     *            the current value of the <code>functionName</code> property.
     */
    public void setFunctionName(final String pFunctionName) {
        this.functionName = pFunctionName;
    }

    /**
     * Sets the <code>groupName</code> property.
     * <p>
     * 
     * @param pGroupName
     *            the current value of the <code>groupName</code> property.
     */
    public void setGroupName(final String pGroupName) {
        this.groupName = pGroupName;
    }

    /**
     * Sets the <code>userIdentifier</code> property.
     * <p>
     * 
     * @param pUserIdentifier
     *            the current value of the <code>userIdentifier</code> property.
     */
    public void setUserIdentifier(final String pUserIdentifier) {
        this.userIdentifier = pUserIdentifier;
    }

    /**
     * Sets the <code>userType</code> property.
     * <p>
     * 
     * @param pUserType
     *            the current value of the <code>userType</code> property.
     */
    public void setUserType(final UserType pUserType) {
        this.userType = pUserType;
    }

	public boolean isProfileAdmin() {
		return isProfileAdmin;
	}

	public void setProfileAdmin(boolean isProfileAdmin) {
		this.isProfileAdmin = isProfileAdmin;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

}
