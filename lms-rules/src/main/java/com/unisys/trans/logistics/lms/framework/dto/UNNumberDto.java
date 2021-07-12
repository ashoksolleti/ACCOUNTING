package com.unisys.trans.logistics.lms.framework.dto;


/**
 * <code>UNNumberDto</code>
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>unNumber</li>
 * <li>packagingGroup</li>
 * </ul>
 */
public class UNNumberDto extends PersistenceObjectDto {

	/**
	 * Unique Serial version UID.
	 */
	private static final long serialVersionUID = -6322587698221488060L;

	/**
	 * Attribute to holds <code>packagingGroup</code> property.
	 */
	private String packagingGroup;

	/**
	 * Attribute to holds <code>unNumber</code> property.
	 */
	private String unNumber;

	/**
	 * Attribute to holds <code>classNumber</code> property.
	 */
	private String classNumber;

	/**
	 * Attribute to hold the <code>oId</code> property.
	 */
	private Long oId;

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
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * @param pOId
	 *            holds the new value of <code>oId</code>.<br>
	 */

	public void setOId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Gets the <code>packagingGroup</code> property.
	 * 
	 * @return the packagingGroup
	 */
	public String getPackagingGroup() {
		return this.packagingGroup;
	}

	/**
	 * Gets the <code>unNumber</code> property.
	 * 
	 * @return the unNumber
	 */
	public String getUnNumber() {
		return this.unNumber;
	}

	/**
	 * Sets the <code>packagingGroup</code> property.
	 * 
	 * @param packagingGroup
	 *            the packagingGroup to set
	 */
	public void setPackagingGroup(final String pPackagingGroup) {
		this.packagingGroup = pPackagingGroup;
	}

	/**
	 * Sets the <code>unNumber</code> property.
	 * 
	 * @param unNumber
	 *            the unNumber to set
	 */
	public void setUnNumber(final String pUnNumber) {
		this.unNumber = pUnNumber;
	}

	/**
	 * @return the classNumber
	 */
	public String getClassNumber() {
		return this.classNumber;
	}

	/**
	 * @param classNumber
	 *            the classNumber to set
	 */
	public void setClassNumber(String pClassNumber) {
		this.classNumber = pClassNumber;
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
}