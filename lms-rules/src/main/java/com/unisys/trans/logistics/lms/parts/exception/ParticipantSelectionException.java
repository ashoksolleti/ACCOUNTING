package com.unisys.trans.logistics.lms.parts.exception;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest;

/**
 * Rating-Forward throws this exception when an unique participant is not found
 * for the {@link ParticipantFindRequest}. This class extends
 * {@link LMSException}
 * 
 */
public class ParticipantSelectionException extends LMSException {

	private static final long serialVersionUID = 1L;

	public ParticipantSelectionException() {
		super();
	}

	public ParticipantSelectionException(LMSException e) {
		super(e);
	}
}
