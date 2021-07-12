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
 * <code>GHASpecialHandlingDto</code> contains all the details specific to a <code>SpecialHandling</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>specialHandlingCodes
 * <li>create
 * <li>update
 * <li>delete
 * </code>
 * </ul>
 * 
 */

public class GHASpecialHandlingDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;

	private Long oId;

	/**
     * Attribute to hold <code>specialHandling</code> property.
     * <p>
     * It is the code present in first text box.
     */
	private String specialHandlingTextBoxOne;

	/**
     * Attribute to hold <code>specialHandling</code> property.
     * <p>
     * It is the code present in second text box.
     */
	private String specialHandlingTextBoxTwo;

	/**
     * Attribute to hold <code>specialHandling</code> property.
     * <p>
     * It is the code present in third text box.
     */
	private String specialHandlingTextBoxThree;

	/**
     * Attribute to hold <code>specialHandling</code> property.
     * <p>
     * It is the code present in fourth text box.
     */
	private String specialHandlingTextBoxFour;

	/**
     * Attribute to hold <code>specialHandling</code> property.
     * <p>
     * It is the code present in fifth text box.
     */
	private String specialHandlingTextBoxFive;

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
	 * @param create
	 *            the create to set
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
	 * @param delete
	 *            the delete to set
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
	 * @param update
	 *            the update to set
	 */
	public void setUpdate(boolean update) {
		this.update = update;
	}

	/**
	 * @param specialHandlingTextBoxOne
	 */
	public String getSpecialHandlingTextBoxOne() {
		return specialHandlingTextBoxOne;
	}

	/**
	 * @param specialHandlingTextBoxOne the specialHandlingTextBoxOne to set
	 */
	public void setSpecialHandlingTextBoxOne(String specialHandlingTextBoxOne) {
		this.specialHandlingTextBoxOne = specialHandlingTextBoxOne;
	}

	/**
	 * @param specialHandlingTextBoxTwo
	 */
	public String getSpecialHandlingTextBoxTwo() {
		return specialHandlingTextBoxTwo;
	}

	/**
	 * @param specialHandlingTextBoxTwo the specialHandlingTextBoxTwo to set
	 */
	public void setSpecialHandlingTextBoxTwo(String specialHandlingTextBoxTwo) {
		this.specialHandlingTextBoxTwo = specialHandlingTextBoxTwo;
	}

	/**
	 * @param specialHandlingTextBoxThree
	 */
	public String getSpecialHandlingTextBoxThree() {
		return specialHandlingTextBoxThree;
	}

	/**
	 * @param specialHandlingTextBoxThree the specialHandlingTextBoxThree to set
	 */
	public void setSpecialHandlingTextBoxThree(
			String specialHandlingTextBoxThree) {
		this.specialHandlingTextBoxThree = specialHandlingTextBoxThree;
	}

	/**
	 * @param specialHandlingTextBoxFour
	 */
	public String getSpecialHandlingTextBoxFour() {
		return specialHandlingTextBoxFour;
	}

	/**
	 * @param specialHandlingTextBoxFour the specialHandlingTextBoxFour to set
	 */
	public void setSpecialHandlingTextBoxFour(String specialHandlingTextBoxFour) {
		this.specialHandlingTextBoxFour = specialHandlingTextBoxFour;
	}

	/**
	 * @param specialHandlingTextBoxFive
	 */
	public String getSpecialHandlingTextBoxFive() {
		return specialHandlingTextBoxFive;
	}

	/**
	 * @param specialHandlingTextBoxFive the specialHandlingTextBoxFive to set
	 */
	public void setSpecialHandlingTextBoxFive(String specialHandlingTextBoxFive) {
		this.specialHandlingTextBoxFive = specialHandlingTextBoxFive;
	}

}
