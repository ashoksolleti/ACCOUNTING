package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * @author Kumarv9
 * 
 */
public class ProrateFactorErrorsDto extends PersistenceObjectDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6943603289426606721L;
	private long oId;
	private String errorLineOrigin;
	private String errorLineDestination;
	private String errorLineProrateFactor;
	private String errorMessage;

	/**
	 * @return the errorLineOrigin
	 */
	public String getErrorLineOrigin() {
		return errorLineOrigin;
	}

	/**
	 * @param errorLineOrigin
	 *            the errorLineOrigin to set
	 */
	public void setErrorLineOrigin(String errorLineOrigin) {
		this.errorLineOrigin = errorLineOrigin;
	}

	/**
	 * @return the errorLineDestination
	 */
	public String getErrorLineDestination() {
		return errorLineDestination;
	}

	/**
	 * @param errorLineDestination
	 *            the errorLineDestination to set
	 */
	public void setErrorLineDestination(String errorLineDestination) {
		this.errorLineDestination = errorLineDestination;
	}

	/**
	 * @return the errorLineProrateFactor
	 */
	public String getErrorLineProrateFactor() {
		return errorLineProrateFactor;
	}

	/**
	 * @param errorLineProrateFactor
	 *            the errorLineProrateFactor to set
	 */
	public void setErrorLineProrateFactor(String errorLineProrateFactor) {
		this.errorLineProrateFactor = errorLineProrateFactor;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage
	 *            the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public long getoId() {
		return oId;
	}

	public void setoId(long oId) {
		this.oId = oId;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

}
