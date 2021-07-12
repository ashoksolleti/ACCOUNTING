/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantAccountType;

/**
 * <code>ParticipantGroupFindRequest</code> holds information to retrieve participant group information.
 * <p>
 * This requests is for three different types of retrieve options based upon the values. If groupNumber is not
 * null, system retrieves participant group information for the participant group number. If
 * participantAccountNumber is not null and participantAccountType is not null, system retrieves all
 * participant group information for the participant. If groupNumber is null, participantAccountNumber is also
 * null and participantAccountType is null, system retrieves all the participant group numbers.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>groupNumber
 * <li>participantAccountNumber
 * <li>participantAccountType
 * <li>retrieveType
 * </ul>
 * </code>
 */
public class BillingGroupFindRequest extends ParticipantGroupFindRequest {
    
    public BillingGroupFindRequest() {

    }
    String specificAirline;
    
    public String getSpecificAirline() {
		return specificAirline;
	}
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

    }
