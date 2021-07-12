package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>AuthorizationResponse</code> contains the response of the maintenance
 * request </code>.
 */
public class AuthorizationResponse extends AbstractResponse {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Attribute to hold <code>authorized</code> property.
	 */
	private boolean authorized;

	/**
	 * Gets the <code>authorized</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>authorized</code> property.
	 */
	public boolean isAuthorized() {
		return this.authorized;
	}

	/**
	 * Sets the <code>authorized</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pAuthorized
	 *            the current value of the <code>authorized</code> property.
	 */
	public void setAuthorized(final boolean pAuthorized) {
		this.authorized = pAuthorized;
	}

}
