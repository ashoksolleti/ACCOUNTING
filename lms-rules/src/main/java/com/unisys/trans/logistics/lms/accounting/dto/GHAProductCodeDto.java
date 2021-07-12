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
 * <code>GHAProductCodeDto</code> contains all the details specific to a <code>ProductCode</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>productCodes
 * <li>create
 * <li>update
 * <li>delete
 * </code>
 * </ul>
 * 
 */

public class GHAProductCodeDto extends PersistenceObjectDto 
{
	
	private static final long serialVersionUID = 1L;
	
	private Long oId;
	
	/**
     * Attribute to hold <code>productCode</code> property.
     * <p>
     * It is the code present in first text box.
     */
	private String productTextBoxOne;

	/**
     * Attribute to hold <code>productCode</code> property.
     * <p>
     * It is the code present in second text box.
     */
	private String productTextBoxTwo;
	
	/**
     * Attribute to hold <code>productCode</code> property.
     * <p>
     * It is the code present in third text box.
     */
	private String productTextBoxThree;
	
	/**
     * Attribute to hold <code>productCode</code> property.
     * <p>
     * It is the code present in fourth text box.
     */
	private String productTextBoxFour;
	
	/**
     * Attribute to hold <code>productCode</code> property.
     * <p>
     * It is the code present in fifth text box.
     */
	private String productTextBoxFive;
	
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
	 * @param productTextBoxOne
	 */
	public String getProductTextBoxOne() {
		return productTextBoxOne;
	}

	/**
	 * @param productTextBoxOne the productTextBoxOne to set
	 */
	public void setProductTextBoxOne(String productTextBoxOne) {
		this.productTextBoxOne = productTextBoxOne;
	}

	/**
	 * @param productTextBoxTwo
	 */
	public String getProductTextBoxTwo() {
		return productTextBoxTwo;
	}

	/**
	 * @param productTextBoxTwo the productTextBoxTwo to set
	 */
	public void setProductTextBoxTwo(String productTextBoxTwo) {
		this.productTextBoxTwo = productTextBoxTwo;
	}

	/**
	 * @param productTextBoxThree
	 */
	public String getProductTextBoxThree() {
		return productTextBoxThree;
	}

	/**
	 * @param productTextBoxThree the productTextBoxThree to set
	 */
	public void setProductTextBoxThree(String productTextBoxThree) {
		this.productTextBoxThree = productTextBoxThree;
	}

	/**
	 * @param productTextBoxFour
	 */
	public String getProductTextBoxFour() {
		return productTextBoxFour;
	}

	/**
	 * @param productTextBoxFour the productTextBoxFour to set
	 */
	public void setProductTextBoxFour(String productTextBoxFour) {
		this.productTextBoxFour = productTextBoxFour;
	}

	/**
	 * @param productTextBoxFive
	 */
	public String getProductTextBoxFive() {
		return productTextBoxFive;
	}

	/**
	 * @param productTextBoxFive the productTextBoxFive to set
	 */
	public void setProductTextBoxFive(String productTextBoxFive) {
		this.productTextBoxFive = productTextBoxFive;
	}
}
