/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;


public class ParticipantCreditFindResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8723150272007765898L;

    private String loyaltyId;
    private String memberName; 
    private String message;
    private String indicator;
	public String getIndicator() {
		return indicator;
	}
	public void setIndicator(final String pIndicator) {
		this.indicator = pIndicator;
	}

	public String getLoyaltyId() {
		return this.loyaltyId;
	}

	public void setLoyaltyId(final String pLoyaltyId) {
		this.loyaltyId = pLoyaltyId;
	}

	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    

}
