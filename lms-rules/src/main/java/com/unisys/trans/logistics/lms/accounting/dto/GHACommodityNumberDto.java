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
 * <code>GHACommodityNumberDto</code> contains all the details specific to a <code>CommodityNumber</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>commodityNumber
 * <li>create
 * <li>update
 * <li>delete
 * </code>
 * </ul>
 * 
 */

public class GHACommodityNumberDto extends PersistenceObjectDto{
	
	private static final long serialVersionUID = 1L;
	
	private Long oId;
	
	/**
     * Attribute to hold <code>commodityNumber</code> property.
     * <p>
     * It is the code present in first text box.
     */
	private String commodityTextBoxOne;

	/**
     * Attribute to hold <code>commodityNumber</code> property.
     * <p>
     * It is the code present in second text box.
     */
	private String commodityTextBoxTwo;
	
	/**
     * Attribute to hold <code>commodityNumber</code> property.
     * <p>
     * It is the code present in third text box.
     */
	private String commodityTextBoxThree;
	
	/**
     * Attribute to hold <code>commodityNumber</code> property.
     * <p>
     * It is the code present in fourth text box.
     */
	private String commodityTextBoxFour;
	
	/**
     * Attribute to hold <code>commodityNumber</code> property.
     * <p>
     * It is the code present in fifth text box.
     */
	private String commodityTextBoxFive;
	
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
	
	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
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

	/**
	 * @param commodityTextBoxOne
	 */
	public String getCommodityTextBoxOne() {
		return commodityTextBoxOne;
	}

	/**
	 * @param commodityTextBoxOne the commodityTextBoxOne to set
	 */
	public void setCommodityTextBoxOne(String commodityTextBoxOne) {
		this.commodityTextBoxOne = commodityTextBoxOne;
	}

	/**
	 * @param commodityTextBoxTwo
	 */
	public String getCommodityTextBoxTwo() {
		return commodityTextBoxTwo;
	}

	/**
	 * @param commodityTextBoxTwo the commodityTextBoxTwo to set
	 */
	public void setCommodityTextBoxTwo(String commodityTextBoxTwo) {
		this.commodityTextBoxTwo = commodityTextBoxTwo;
	}

	/**
	 * @param commodityTextBoxThree
	 */
	public String getCommodityTextBoxThree() {
		return commodityTextBoxThree;
	}

	/**
	 * @param commodityTextBoxThree the commodityTextBoxThree to set
	 */
	public void setCommodityTextBoxThree(String commodityTextBoxThree) {
		this.commodityTextBoxThree = commodityTextBoxThree;
	}

	/**
	 * @param commodityTextBoxFour
	 */
	public String getCommodityTextBoxFour() {
		return commodityTextBoxFour;
	}

	/**
	 * @param commodityTextBoxFour the commodityTextBoxFour to set
	 */
	public void setCommodityTextBoxFour(String commodityTextBoxFour) {
		this.commodityTextBoxFour = commodityTextBoxFour;
	}

	/**
	 * @param commodityTextBoxFive
	 */
	public String getCommodityTextBoxFive() {
		return commodityTextBoxFive;
	}

	/**
	 * @param commodityTextBoxFive the commodityTextBoxFive to set
	 */
	public void setCommodityTextBoxFive(String commodityTextBoxFive) {
		this.commodityTextBoxFive = commodityTextBoxFive;
	}

}
