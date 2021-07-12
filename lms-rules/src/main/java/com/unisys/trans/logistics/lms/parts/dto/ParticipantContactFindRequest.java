package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ParticipantContactFindRequest extends AbstractRequest {
	
	 /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>lmsdatabaseKey</code> property.
     */
    private String lmsdatabaseKey;

    /**
     * Attribute to hold <code>accountNumber</code> property.
     */
    private String accountNumber;

    /**
     * Attribute to hold <code>accountType</code> property.
     */
    private String accountType;

	/**
	 * @return the lmsdatabaseKey
	 */
	public String getLmsdatabaseKey() {
		return lmsdatabaseKey;
	}

	/**
	 * @param lmsdatabaseKey the lmsdatabaseKey to set
	 */
	public void setLmsdatabaseKey(String lmsdatabaseKey) {
		this.lmsdatabaseKey = lmsdatabaseKey;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
