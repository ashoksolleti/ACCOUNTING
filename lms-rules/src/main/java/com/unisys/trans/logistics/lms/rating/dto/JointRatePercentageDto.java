/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;

/**
 * <code>JointRatePercentageDto</code> contain details of
 * JointRatePercentageDto.
 * <p>
 * This contains all information about JointRatePercentageDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>percentage
 * <li>oId
 * </ul>
 */
public class JointRatePercentageDto implements Serializable {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -3557288352307862548L;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>percentage</code> property.
	 */
	private Integer percentage;

	/**
	 * Attribute to hold <code>percentageOrder</code> property.
	 */
	private Integer percentageOrder;

	/**
	 * <code>Default Constructor.</code>
	 */

	public JointRatePercentageDto() {
	}

	/**
	 * Parameterize constructor.
	 * 
	 * @param pPercentageOrder
	 *            the value.
	 */

	public JointRatePercentageDto(final Integer pPercentageOrder) {
		this.percentageOrder = pPercentageOrder;
	}

	/**
	 * Gets the <code>OId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.
	 */
	public Long getOId() {
		return this.oId;
	}

	/**
	 * Gets the <code>percentage</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>percentage</code> property.
	 */
	public Integer getPercentage() {
		return this.percentage;
	}

	/**
	 * Gets the <code>percentageOrder</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>percentageOrder</code> property.
	 */
	public Integer getPercentageOrder() {
		return this.percentageOrder;
	}

	/**
	 * Sets the <code>OId</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            the new value of the <code>oId</code> property.
	 */
	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Sets the <code>percentage</code> property.
	 * <p>
	 * 
	 * @param pPercentage
	 *            the new value of the <code>percentage</code> property.
	 */
	public void setPercentage(final Integer pPercentage) {
		this.percentage = pPercentage;
	}

	/**
	 * Sets the <code>percentageOrder</code> property.
	 * <p>
	 * 
	 * @param ppercentageOrder
	 *            the current value of the <code>percentageOrder</code>
	 *            property.
	 */
	public void setPercentageOrder(final Integer pPercentageOrder) {
		this.percentageOrder = pPercentageOrder;
	}
}