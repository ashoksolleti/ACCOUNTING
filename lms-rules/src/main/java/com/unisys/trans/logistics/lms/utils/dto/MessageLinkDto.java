/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;
import java.util.Set;

/**
 * <code>MessageLinkDto</code> holds all the attributes that are associated to a MessageLink.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>name
 * <li>teletypeAddressProfiles
 * <li>oId
 * </code>
 * </ul>
 */
public class MessageLinkDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8931825532384724735L;

    /**
     * Attribute to hold <code>name</code> property.
     */
    private String name;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>MessageLinkDto</code>.It is of type Long. <br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>teletypeAddressProfiles</code> property.
     */
    private Set<TeletypeAddressProfileDto> teletypeAddressProfiles;

    /**
     * <code>Default constructor. </code>
     */
    public MessageLinkDto() {
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 characters of type alphabet, number, hyphen, dot and space.
     * <p>
     * <b>Example: </b><br>
     * 123456
     * <p>
     * 
     * @return the current value of <code>name</code> property.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>teletypeAddressProfiles</code> property.
     * <p>
     * 
     * @return the current value of the <code>teletypeAddressProfiles</code>.
     */
    public Set<TeletypeAddressProfileDto> getTeletypeAddressProfiles() {
        return this.teletypeAddressProfiles;
    }

    /**
     * Sets the <code>name</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * 1-20 characters of type alphabet, number, hyphen, dot and space.
     * <p>
     * <b>Example: </b><br>
     * 123456
     * <p>
     * 
     * @param pName the new value of <code>name</code> property.<br>
     */
    public void setName(final String pName) {
        this.name = pName;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>teletypeAddressProfiles</code> property.
     * <p>
     * 
     * @param pTeletypeAddressProfiles the new value of <code>teletypeAddressProfiles</code> property.
     */
    public void setTeletypeAddressProfiles(final Set<TeletypeAddressProfileDto> pTeletypeAddressProfiles) {
        this.teletypeAddressProfiles = pTeletypeAddressProfiles;
    }
}