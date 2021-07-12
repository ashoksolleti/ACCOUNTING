/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ParticipantCreditFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8723150272007765898L;

    
    private String loyaltyId;
    private String carrierCode;
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(final String pCarrierCode) {
		this.carrierCode = pCarrierCode;
	}

	public String getLoyaltyId() {
		return this.loyaltyId;
	}

	public void setLoyaltyId(final String pLoyaltyId) {
		this.loyaltyId = pLoyaltyId;
	}

    

}
