/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.rating.dto.constants.ClassRatingIdType;

/**
 * <code>ClassRatingIdVersionDto</code> class contain information specific to an
 * ClassRatingId's Version.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>classRatingIdOId
 * <li>effectiveDate
 * <li>expirationDate
 * <li>description
 * <li>classification
 * </code>
 * </ul>
 */
public class ClassRatingIdVersionDto implements Serializable {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -1929225012831427986L;

	/**
	 * Attribute to hold <code>classification</code>.
	 * <p>
	 * This is the type of rate with which the class rating ID is typically
	 * associated. This value is only used during certain situations in contract
	 * and SRA pricing of class rating IDs.
	 */
	private ClassRatingIdType classification;

	/**
	 * Attribute to hold <code>oId</code>.
	 * <p>
	 * This hold the Unique key value for <code>ClassRatingId</code>.
	 */
	private Long classRatingIdOId;

	/**
	 * Attribute to hold <code>dateRangeDto</code>'s property.
	 * <p>
	 * This holds the <code>DateRangeDto</code> associated with a ClassRatingId.
	 */

	private DateRangeDto dateRangeDto;

	/**
	 * Attribute to hold <code>description</code>.
	 * <p>
	 * Represents the description where the details of the ClassRatingIdVersion
	 * are described.
	 */
	private String description;

	/**
	 * Attribute to hold <code>formattedDescription</code>.
	 * <p>
	 * Represents the description that is transformed to html content.
	 */
	private String formattedDescription;

	/**
	 * Attribute to hold <code>oId</code>.
	 * <p>
	 * This hold the Unique key value for <code>ClassRatingIdVersion</code>.
	 */
	private Long oId;

	@Override
	// equals to be checked only in case of update scenario, which will
	// definitely have oId
	public boolean equals(final Object pObject) {
		boolean isEqual = false;
		final ClassRatingIdVersionDto anotherClassRatingVersionDto;
		if (pObject == null) {
			isEqual = false;
		} else if (pObject.getClass() == null
				|| this.getClass() != pObject.getClass()) {
			isEqual = false;
		} else {
			anotherClassRatingVersionDto = (ClassRatingIdVersionDto) pObject;
			if (anotherClassRatingVersionDto.getOId() == null) {
				isEqual = (this.getOId() == null);
			} else {
				isEqual = anotherClassRatingVersionDto.getOId().equals(
						this.getOId());
			}
		}
		return isEqual;

	}

	/**
	 * Gets the <code>classification</code> property.
	 * <p>
	 * This is the type of rate with which the ClassRatingIdVersion is typically
	 * associated.
	 * <p>
	 * <b>Format: </b><br>
	 * 1 Alphabet(Upper Case)
	 * <p>
	 * <b>Example: </b><br>
	 * R or S
	 * <p>
	 * 
	 * @return the current value of the <code>classification</code> property.<br>
	 */
	public ClassRatingIdType getClassification() {
		return this.classification;
	}

	/**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * Unique key to identify the <code>ClassRatingId</code>.It is of type Long.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.<br>
	 */
	public Long getClassRatingIdOId() {
		return this.classRatingIdOId;
	}

	/**
	 * Gets the <code>dateRangeDto</code> property.
	 * <p>
	 * DateRangeDto contains the effectiveDate and expirationDate information
	 * <p>
	 * 
	 * @return the current value of the <code>dateRangeDto</code> property.<br>
	 */
	public DateRangeDto getDateRangeDto() {
		if (this.dateRangeDto == null) {
			dateRangeDto = new DateRangeDto();
		}
		return dateRangeDto;
	}

	/**
	 * Gets the <code>description</code> property.
	 * <p>
	 * Description of the ClassRatingId.
	 * <p>
	 * <b>Format: </b><br>
	 * AlphaNumeric(1- 5000)
	 * <p>
	 * <b>Example: </b><br>
	 * AUTOMOTIVE VEHICLES THIS CLASS ID DOES NOT APPLY FOR SHIPMENTS BETWEEN
	 * JAPAN AND AREA 1 IF: A) THE AUTOMOTIVE VEHICLES ARE ELECTRICAL B) THE
	 * AUTOMOBILES DIMENSIONS EXCEED 224 * 318 * 162.6 CM OR 88 * 125 * 64 CI
	 * <p>
	 * 
	 * @return the current value of the <code>description</code> property.<br>
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Gets the <code>formattedDescription</code> property.
	 * <p>
	 * contains the description which is converted from plain text to html data.
	 * 
	 * @return the formattedDescription
	 */
	public String getFormattedDescription() {
		return formattedDescription;
	}

	/**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * Unique key to identify the <code>ClassRatingIdVersion</code>.It is of
	 * type Long.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.<br>
	 */
	public Long getOId() {
		return this.oId;
	}

	/**
	 * The<code>hashCode </code> object.
	 * <p>
	 * 
	 * @return <code>int</code> hashcode of super class.
	 */
	@Override
	public int hashCode() {
		final int result;
		if (this.oId == null) {
			result = 0;
		} else {
			result = this.oId.hashCode();
		}
		return result;
	}

	/**
	 * Sets the <code>classification</code> property.
	 * <p>
	 * This is the type of rate with which the ClassRatingIdVersion is typically
	 * associated.
	 * <p>
	 * <b>Format: </b><br>
	 * 1 Alphabet(Upper Case)
	 * <p>
	 * <b>Example: </b><br>
	 * R or S
	 * <p>
	 * 
	 * @param pClassification
	 *            the new value of the <code>classification</code> property.
	 */
	public void setClassification(final ClassRatingIdType pClassification) {
		this.classification = pClassification;
	}

	/**
	 * Sets the <code>classRatingIdOId</code> property.
	 * <p>
	 * Unique key to identify the <code>ClassRatingId</code>.It is of type Long.
	 * <p>
	 * 
	 * @param pClassRatingIdOId
	 *            the new value of the <code>classRatingIdOId</code> property.<br>
	 */
	public void setClassRatingIdOId(final Long pClassRatingIdOId) {
		this.classRatingIdOId = pClassRatingIdOId;
	}

	/**
	 * Sets the <code>dateRangeDto</code> property.
	 * <p>
	 * DateRangeDto contains the effectiveDate and expirationDate information
	 * <p>
	 * 
	 * @param pDateRangeDto
	 *            the new value of the <code>dateRangeDto</code> property.<br>
	 */
	public void setDateRangeDto(final DateRangeDto pDateRangeDto) {
		this.dateRangeDto = pDateRangeDto;
	}

	/**
	 * Sets the <code>description</code> property.
	 * <p>
	 * Description of the class rating ID
	 * <p>
	 * <b>Format: </b><br>
	 * AlphaNumeric(1- 5000)
	 * <p>
	 * <b>Example: </b><br>
	 * AUTOMOTIVE VEHICLES THIS CLASS ID DOES NOT APPLY FOR SHIPMENTS BETWEEN
	 * JAPAN AND AREA 1 IF: A) THE AUTOMOTIVE VEHICLES ARE ELECTRICAL B) THE
	 * AUTOMOBILES DIMENSIONS EXCEED 224 * 318 * 162.6 CM OR 88 * 125 * 64 CI
	 * <p>
	 * 
	 * @param pDescription
	 *            the new value of the <code>description</code> property.
	 */
	public void setDescription(final String pDescription) {
		this.description = pDescription;
	}

	/**
	 * Sets the <code>formattedDescription</code> property.
	 * <p>
	 * contains the description which is converted from plain text to html data.
	 * 
	 * @param pFormattedDescription
	 *            the formattedDescription to set
	 */
	public void setFormattedDescription(final String pFormattedDescription) {
		this.formattedDescription = pFormattedDescription;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * Unique key to identify the <code>ClassRatingVersion</code>.It is of type
	 * Long.
	 * <p>
	 * 
	 * @param pOId
	 *            the new value of the <code>oId</code> property.<br>
	 */
	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

}
