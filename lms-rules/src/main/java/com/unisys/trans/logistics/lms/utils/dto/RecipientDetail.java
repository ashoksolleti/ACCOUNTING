/**
 * 
 */
package com.unisys.trans.logistics.lms.utils.dto;

/**
 * @author muthusab1
 * 
 */
public class RecipientDetail {

	private String recipientId;
	
	private String recipientKey;

	private String TTYAddress;

	/**
	 * @return the recipientId
	 */
	public String getRecipientId() {
		return recipientId;
	}

	/**
	 * @return the recipientKey
	 */
	public String getRecipientKey() {
		return recipientKey;
	}

	/**
	 * @return the tTYAddress
	 */
	public String getTTYAddress() {
		return TTYAddress;
	}

	/**
	 * @param recipientId
	 *            the recipientId to set
	 */
	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	/**
	 * @param recipientKey
	 *            the recipientKey to set
	 */
	public void setRecipientKey(String recipientKey) {
		this.recipientKey = recipientKey;
	}

	/**
	 * @param tTYAddress
	 *            the tTYAddress to set
	 */
	public void setTTYAddress(String tTYAddress) {
		TTYAddress = tTYAddress;
	}

}
