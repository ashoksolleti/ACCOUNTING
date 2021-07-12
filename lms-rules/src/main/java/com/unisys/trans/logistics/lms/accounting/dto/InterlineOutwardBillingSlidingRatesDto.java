/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
/**
 * 
 * @author JainP2
 *
 */

package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>InterlineOutwardBillingSlidingRatesDto</code> contains all the details specific to a <code>SlidingScale</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>awbVolRangeFrom
 * <li>awbVolRangeTo
 * <li>ratePerAwb
 * <li>flatCharge
 * <li>create
 * <li>update
 * <li>delete
 * </code>
 * </ul>
 * 
 */

public class InterlineOutwardBillingSlidingRatesDto extends PersistenceObjectDto
{

	private static final long serialVersionUID = 1L;
	
	private Long oId;

	/**
     * Attribute to hold <code>awbVolRangeFrom</code> property.
     */
	private Integer awbVolRangeFrom;

	/**
     * Attribute to hold <code>awbVolRangeTo</code> property.
     */
	private Integer awbVolRangeTo;

	/**
     * Attribute to hold <code>ratePerAwb</code> property.
     * <p>
     * It indicates Rate applied on AWB.
     */
	private Float ratePerAwb;

	/**
     * Attribute to hold <code>flatCharge</code> property.
     * <p>
     * It indicates Flat Charge applied on AWB.
     */
	private Float flatCharge;
	
	/**
     * Attribute to hold flag for create
     */
	private boolean create = false;

	/**
     * Attribute to hold flag for delete
     */
	private boolean delete = false;

	/**
     * Attribute to hold flag for update
     */
	private boolean update = false;

	/**
	 * @return the oId
	 */
	@Override
	public Long getOId() {
		return this.oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
	 * @return the awbVolRangeFrom
	 */
	public Integer getAwbVolRangeFrom() {
		return awbVolRangeFrom;
	}

	/**
	 * @param awbVolRangeFrom the awbVolRangeFrom to set
	 */
	public void setAwbVolRangeFrom(Integer awbVolRangeFrom) {
		this.awbVolRangeFrom = awbVolRangeFrom;
	}

	/**
	 * @return the awbVolRangeTo
	 */
	public Integer getAwbVolRangeTo() {
		return awbVolRangeTo;
	}

	/**
	 * @param awbVolRangeTo the awbVolRangeTo to set
	 */
	public void setAwbVolRangeTo(Integer awbVolRangeTo) {
		this.awbVolRangeTo = awbVolRangeTo;
	}

	

	/**
	 * @return the ratePerAwb
	 */
	public Float getRatePerAwb() {
		return ratePerAwb;
	}

	/**
	 * @param ratePerAwb the ratePerAwb to set
	 */
	public void setRatePerAwb(Float ratePerAwb) {
		this.ratePerAwb = ratePerAwb;
	}

	/**
	 * @return the flatCharge
	 */
	public Float getFlatCharge() {
		return flatCharge;
	}

	/**
	 * @param flatCharge the flatCharge to set
	 */
	public void setFlatCharge(Float flatCharge) {
		this.flatCharge = flatCharge;
	}

	/**
	 * @return the create
	 */
	public boolean isCreate() {
		return create;
	}

	/**
	 * @param create the create to set
	 */
	public void setCreate(boolean create) {
		this.create = create;
	}

	/**
	 * @return the delete
	 */
	public boolean isDelete() {
		return delete;
	}

	/**
	 * @param delete the delete to set
	 */
	public void setDelete(boolean delete) {
		this.delete = delete;
	}

	/**
	 * @return the update
	 */
	public boolean isUpdate() {
		return update;
	}

	/**
	 * @param update the update to set
	 */
	public void setUpdate(boolean update) {
		this.update = update;
	}

}
