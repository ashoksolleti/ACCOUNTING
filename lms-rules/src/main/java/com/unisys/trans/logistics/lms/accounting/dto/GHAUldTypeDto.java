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
 * <code>GHAULDTypeDto</code> contains all the details specific to a <code>UldType</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>uldType
 * <li>create
 * <li>update
 * <li>delete
 * </code>
 * </ul>
 * 
 */

public class GHAUldTypeDto extends PersistenceObjectDto {
	
	private static final long serialVersionUID = 1L;

	private Long oId;
	
	/**
     * Attribute to hold <code>uldType</code> property.
     * <p>
     * It is the code present in first text box.
     */
	private String uldTypeTextBoxOne;

	/**
     * Attribute to hold <code>uldType</code> property.
     * <p>
     * It is the code present in second text box.
     */
	private String uldTypeTextBoxTwo;
	
	/**
     * Attribute to hold <code>uldType</code> property.
     * <p>
     * It is the code present in third text box.
     */
	private String uldTypeTextBoxThree;
	
	/**
     * Attribute to hold <code>uldType</code> property.
     * <p>
     * It is the code present in four text box.
     */
	private String uldTypeTextBoxFour;
	
	/**
     * Attribute to hold <code>uldType</code> property.
     * <p>
     * It is the code present in five text box.
     */
	private String uldTypeTextBoxFive;
	
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
	 * @param uldTypeTextBoxOne
	 */
	public String getUldTypeTextBoxOne() {
		return uldTypeTextBoxOne;
	}

	/**
	 * @param uldTypeTextBoxOne the uldTypeTextBoxOne to set
	 */
	public void setUldTypeTextBoxOne(String uldTypeTextBoxOne) {
		this.uldTypeTextBoxOne = uldTypeTextBoxOne;
	}

	/**
	 * @param uldTypeTextBoxTwo
	 */
	public String getUldTypeTextBoxTwo() {
		return uldTypeTextBoxTwo;
	}

	/**
	 * @param uldTypeTextBoxTwo the uldTypeTextBoxTwo to set
	 */
	public void setUldTypeTextBoxTwo(String uldTypeTextBoxTwo) {
		this.uldTypeTextBoxTwo = uldTypeTextBoxTwo;
	}

	/**
	 * @param uldTypeTextBoxThree
	 */
	public String getUldTypeTextBoxThree() {
		return uldTypeTextBoxThree;
	}

	/**
	 * @param uldTypeTextBoxThree the uldTypeTextBoxThree to set
	 */
	public void setUldTypeTextBoxThree(String uldTypeTextBoxThree) {
		this.uldTypeTextBoxThree = uldTypeTextBoxThree;
	}

	/**
	 * @param uldTypeTextBoxFour
	 */
	public String getUldTypeTextBoxFour() {
		return uldTypeTextBoxFour;
	}

	/**
	 * @param uldTypeTextBoxFour the uldTypeTextBoxFour to set
	 */
	public void setUldTypeTextBoxFour(String uldTypeTextBoxFour) {
		this.uldTypeTextBoxFour = uldTypeTextBoxFour;
	}

	/**
	 * @param uldTypeTextBoxFive
	 */
	public String getUldTypeTextBoxFive() {
		return uldTypeTextBoxFive;
	}

	/**
	 * @param uldTypeTextBoxFive the uldTypeTextBoxFive to set
	 */
	public void setUldTypeTextBoxFive(String uldTypeTextBoxFive) {
		this.uldTypeTextBoxFive = uldTypeTextBoxFive;
	}

}
