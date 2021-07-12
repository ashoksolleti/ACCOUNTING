/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>UserPreferenceColumnDto</code> class contain information specific to a
 * UserPreferenceColumn.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>displayOrder
 * <li>groupId
 * <li>identifier
 * <li>oId
 * <li>prefferedColumn
 * <li>prefFunction
 * <li>userType
 * </code>
 * </ul>
 */

public class UserPreferenceColumnDto extends PersistenceObjectDto implements
            Comparable<UserPreferenceColumnDto> {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5225862616631271866L;

    /**
     * Attribute to hold <code>displayOrder</code> property.
     */
    private int displayOrder;

    /**
     * Attribute to hold <code>groupId</code> property.
     */
    private String groupId;

    /**
     * Attribute to hold <code>identifier</code> property.
     */
    private String identifier;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>prefferedColumn</code> property.
     */
    private PreferencesFunctionEntityDto prefferedEntity;

    /**
     * Attribute to hold <code>prefferedColumn</code> property.
     */
    private PreferencesFunctionColumnDto prefferedColumn;

    /**
     * Attribute to hold <code>prefFunction</code> property.
     */
    private PreferencesFunctionDto prefFunction;

    /**
     * Attribute to hold <code>userType</code> property.
     */
    private String userType;

    /**
     * Compares two <code>UserPreferenceColumnDto</code> objects based on its
     * displayOrder.
     * <p>
     * 
     * @param pObject1
     *            holds the UserPreferenceColumn object details.
     * @return Returns 1,0,-1 as result.
     *         <ul>
     *         <li>0 - if <code>displayOrder</code> is same.</li> <li>1 - if <code>displayOrder</code> of this
     *         Object is greater than of <code>pObject</code>. <li>-1 - if <code>displayOrder</code> of this
     *         Object is lesser than of <code>pObject</code>.
     *         </ul>
     */
    @Override
    public int compareTo(final UserPreferenceColumnDto pObject1) {
        int result = 0;
        if (this.getDisplayOrder() > pObject1.getDisplayOrder()) {
            result = 1;
        }
        else if (this.getDisplayOrder() < pObject1.getDisplayOrder()) {
            result = -1;
        }
        else {
            result = 0;
        }
        return result;
    }

    /**
     * compares two <code>UserPreferenceColumnDto</code>.
     * <p>
     * returns true of oId's of both the objects is equal,else returns false.
     * 
     * @param pObject
     *            Object of type <code>UserPreferenceColumnDto</code>
     * @return returns true of oId's of both the objects is equal,else returns
     *         false.
     */
    public boolean equals(final Object pObject) {
        boolean isEqual = false;
        if (pObject instanceof UserPreferenceColumnDto) {
            final UserPreferenceColumnDto aUserPreferenceColumnDto = (UserPreferenceColumnDto) pObject;
            if (this.getOId() != null && aUserPreferenceColumnDto.getOId() != null) {
                if (this.getOId().equals(aUserPreferenceColumnDto.getOId())) {
                    isEqual = true;
                }
                else {
                    isEqual = false;
                }
            }
        }
        return isEqual;
    }

    /**
     * Generates hashcode value based on <code>groupId</code>, <code>identifier</code>,<code>userType</code>
     * and <code>displayOrder</code>.
     * 
     * @return returns the hascode value.
     */
    public int hashCode() {
        // SuppressOn:MagicNumber
        int hascode = 0;
        if (this.groupId != null) {
            hascode = hascode + this.groupId.hashCode() * 31;
        }
        if (this.identifier != null) {
            hascode = hascode + this.identifier.hashCode() * 29;
        }
        if (this.userType != null) {
            hascode = hascode + this.hashCode() * 7;
        }
        hascode = hascode + this.displayOrder;
        return hascode;
        // SuppressOff:MagicNumber
    }

    /**
     * Gets the <code>displayOrder</code> property.
     * <p>
     * 
     * @return the current value of the <code>displayOrder</code> property.
     */
    public int getDisplayOrder() {
        return this.displayOrder;
    }

    /**
     * Gets the <code>groupId</code> property.
     * <p>
     * 
     * @return the current value of the <code>groupId</code> property.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Gets the <code>identifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>identifier</code> property.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>prefferedColumn</code> property.
     * <p>
     * 
     * @return the current value of the <code>prefferedColumn</code> property.
     */
    public PreferencesFunctionColumnDto getPrefferedColumn() {
        return this.prefferedColumn;
    }

    /**
     * Gets the <code>prefFunction</code> property.
     * <p>
     * 
     * @return the current value of the <code>prefFunction</code> property.
     */
    public PreferencesFunctionDto getPrefFunction() {
        return this.prefFunction;
    }

    /**
     * Gets the <code>userType</code> property.
     * <p>
     * 
     * @return the current value of the <code>userType</code> property.
     */
    public String getUserType() {
        return this.userType;
    }

    /**
     * Sets the <code>displayOrder</code> property.
     * <p>
     * 
     * @param pDisplayOrder
     *            holds the new value of <code>displayOrder</code> data transfer
     *            object.<br>
     */
    public void setDisplayOrder(final int pDisplayOrder) {
        this.displayOrder = pDisplayOrder;
    }

    /**
     * Sets the <code>groupId</code> property.
     * <p>
     * 
     * @param pGroupId
     *            holds the new value of <code>groupId</code> data transfer
     *            object.<br>
     */
    public void setGroupId(final String pGroupId) {
        this.groupId = pGroupId;
    }

    /**
     * Sets the <code>identifier</code>property.
     * <p>
     * 
     * @param pIdentifier
     *            holds the new value of <code>identifier</code> data transfer
     *            object.<br>
     */
    public void setIdentifier(final String pIdentifier) {
        this.identifier = pIdentifier;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>oId</code> data transfer object.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>prefferedColumn</code> property.
     * <p>
     * 
     * @param pPrefferedColumn
     *            holds the new value of <code>prefferedColumn</code> data
     *            transfer object.<br>
     */
    public void setPrefferedColumn(
                final PreferencesFunctionColumnDto pPrefferedColumn) {
        this.prefferedColumn = pPrefferedColumn;
    }

    /**
     * Sets the <code>prefFunction</code> property.
     * <p>
     * 
     * @param pPrefFunction
     *            holds the new value of <code>prefFunction</code> data transfer
     *            object.<br>
     */
    public void setPrefFunction(final PreferencesFunctionDto pPrefFunction) {
        this.prefFunction = pPrefFunction;
    }

    /**
     * Sets the <code>userType</code> property.
     * <p>
     * 
     * @param pUserType
     *            holds the new value of <code>userType</code> data transfer
     *            object.<br>
     */
    public void setUserType(final String pUserType) {
        this.userType = pUserType;
    }

	public PreferencesFunctionEntityDto getPrefferedEntity() {
		return prefferedEntity;
	}

	public void setPrefferedEntity(PreferencesFunctionEntityDto prefferedEntity) {
		this.prefferedEntity = prefferedEntity;
	}
}
