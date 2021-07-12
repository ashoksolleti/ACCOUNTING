/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>StationContactDto</code> contain details of StationContactDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>cellNumber
 * <li>emailAddress
 * <li>faxNumber
 * <li>location
 * <li>name
 * <li>officeNumber
 * <li>oId
 * <li>scheduledDaysOff
 * <li>scheduledHours
 * <li>title
 * <li>contactType
 * </code>
 * </ul>
 */
public class StationContactDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8187555798538903863L;

    /**
     * Attribute to hold <code>cellNumber</code> property.
     */
    private String cellNumber;

    /**
     * Attribute to hold <code>contactType</code> property.
     */
    private String contactType;

    /**
     * Attribute to hold <code>emailAddress</code> property.
     */
    private String emailAddress;

    /**
     * Attribute to hold <code>faxNumber</code> property.
     */
    private String faxNumber;

    /**
     * Attribute to hold <code>location</code> property.
     */
    private String location;

    /**
     * Attribute to hold <code>name</code> property.
     */
    private String name;

    /**
     * Attribute to hold <code>officeNumber</code> property.
     */
    private String officeNumber;

    /**
     * Attribute to hold <code>oId</code> property. Unique identifier for station
     */
    private Long oId;

    /**
     * Attribute to hold <code>scheduledDaysOff</code> property.
     */
    private String scheduledDaysOff;

    /**
     * Attribute to hold <code>scheduledHours</code> property.
     */
    private String scheduledHours;

    /**
     * Attribute to hold <code>title</code> property.
     */
    private String title;

    /**
     * Gets the <code>cellNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>cellNumber</code> property.
     */
    public String getCellNumber() {
        return this.cellNumber;
    }

    /**
     * Gets the <code>contactType</code> property.
     * <p>
     * 
     * @return the current value of the <code>contactType</code> property.
     */
    public String getContactType() {
        return this.contactType;
    }

    /**
     * Gets the <code>emailAddress</code> property.
     * <p>
     * 
     * @return the current value of the <code>emailAddress</code> property.
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Gets the <code>faxNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>faxNumber</code> property.
     */
    public String getFaxNumber() {
        return this.faxNumber;
    }

    /**
     * Gets the <code>location</code> property.
     * <p>
     * 
     * @return the current value of the <code>location</code> property.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * 
     * @return the current value of the <code>name</code> property.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the <code>officeNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>officeNumber</code> property.
     */
    public String getOfficeNumber() {
        return this.officeNumber;
    }

    /**
     * Gets the value of <code>OID</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>scheduledDaysOff</code> property.
     * <p>
     * 
     * @return the current value of the <code>scheduledDaysOff</code> property.
     */
    public String getScheduledDaysOff() {
        return this.scheduledDaysOff;
    }

    /**
     * Gets the <code>scheduledHours</code> property.
     * <p>
     * 
     * @return the current value of the <code>scheduledHours</code> property.
     */
    public String getScheduledHours() {
        return this.scheduledHours;
    }
    
    /**
     * Gets the <code>scheduledHoursToDisplay</code> property.
     * <p>
     * 
     * @return the current value of the <code>scheduledHoursToDisplay</code> property.
     */
    public String getScheduledHoursToDisplay() {
        String scheduledHoursToDisplay=null;
        if (this.scheduledHours != null && this.scheduledHours.length() > 0) {
            scheduledHoursToDisplay = this.scheduledHours.replaceAll(" ", "<BR>");
        }
        return scheduledHoursToDisplay;
    }

    /**
     * Gets the <code>title</code> property.
     * <p>
     * 
     * @return the current value of the <code>title</code> property.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets the <code>cellNumber</code> property.
     * <p>
     * 
     * @param pCellNumber
     *            the current value of the <code>cellNumber</code> property.
     */
    public void setCellNumber(final String pCellNumber) {
        this.cellNumber = pCellNumber;
    }

    /**
     * Sets the <code>contactType</code> property.
     * <p>
     * 
     * @param pContactType
     *            the current value of the <code>contactType</code> property.
     */
    public void setContactType(final String pContactType) {
        this.contactType = pContactType;
    }

    /**
     * Sets the <code>emailAddress</code> property.
     * <p>
     * 
     * @param pEmailAddress
     *            the current value of the <code>emailAddress</code> property.
     */
    public void setEmailAddress(final String pEmailAddress) {
        this.emailAddress = pEmailAddress;
    }

    /**
     * Sets the <code>faxNumber</code> property.
     * <p>
     * 
     * @param pFaxNumber
     *            the current value of the <code>faxNumber</code> property.
     */
    public void setFaxNumber(final String pFaxNumber) {
        this.faxNumber = pFaxNumber;
    }

    /**
     * Sets the <code>location</code> property.
     * <p>
     * 
     * @param pLocation
     *            the current value of the <code>location</code> property.
     */
    public void setLocation(final String pLocation) {
        this.location = pLocation;
    }

    /**
     * Sets the <code>name</code> property.
     * <p>
     * 
     * @param pName
     *            the current value of the <code>name</code> property.
     */
    public void setName(final String pName) {
        this.name = pName;
    }

    /**
     * Sets the <code>officeNumber</code> property.
     * <p>
     * 
     * @param pOfficeNumber
     *            the current value of the <code>officeNumber</code> property.
     */
    public void setOfficeNumber(final String pOfficeNumber) {
        this.officeNumber = pOfficeNumber;
    }

    /**
     * Sets the value of the <code>OID</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @param pOId the new value of the <code>OID</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>scheduledDaysOff</code> property.
     * <p>
     * 
     * @param pScheduledDaysOff
     *            the current value of the <code>scheduledDaysOff</code> property.
     */
    public void setScheduledDaysOff(final String pScheduledDaysOff) {
        this.scheduledDaysOff = pScheduledDaysOff;
    }

    /**
     * Sets the <code>scheduledHours</code> property.
     * <p>
     * 
     * @param pScheduledHours
     *            the current value of the <code>scheduledHours</code> property.
     */
    public void setScheduledHours(final String pScheduledHours) {
        this.scheduledHours = pScheduledHours;
    }

    /**
     * Sets the <code>title</code> property.
     * <p>
     * 
     * @param pTitle
     *            the current value of the <code>title</code> property.
     */
    public void setTitle(final String pTitle) {
        this.title = pTitle;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cellNumber == null) ? 0 : cellNumber.hashCode());
		result = prime * result
				+ ((contactType == null) ? 0 : contactType.hashCode());
		result = prime * result
				+ ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result
				+ ((faxNumber == null) ? 0 : faxNumber.hashCode());
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((oId == null) ? 0 : oId.hashCode());
		result = prime * result
				+ ((officeNumber == null) ? 0 : officeNumber.hashCode());
		result = prime
				* result
				+ ((scheduledDaysOff == null) ? 0 : scheduledDaysOff.hashCode());
		result = prime * result
				+ ((scheduledHours == null) ? 0 : scheduledHours.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StationContactDto other = (StationContactDto) obj;
		if (cellNumber == null) {
			if (other.cellNumber != null)
				return false;
		} else if (!cellNumber.equals(other.cellNumber))
			return false;
		if (contactType == null) {
			if (other.contactType != null)
				return false;
		} else if (!contactType.equals(other.contactType))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (faxNumber == null) {
			if (other.faxNumber != null)
				return false;
		} else if (!faxNumber.equals(other.faxNumber))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (oId == null) {
			if (other.oId != null)
				return false;
		} else if (!oId.equals(other.oId))
			return false;
		if (officeNumber == null) {
			if (other.officeNumber != null)
				return false;
		} else if (!officeNumber.equals(other.officeNumber))
			return false;
		if (scheduledDaysOff == null) {
			if (other.scheduledDaysOff != null)
				return false;
		} else if (!scheduledDaysOff.equals(other.scheduledDaysOff))
			return false;
		if (scheduledHours == null) {
			if (other.scheduledHours != null)
				return false;
		} else if (!scheduledHours.equals(other.scheduledHours))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

}
