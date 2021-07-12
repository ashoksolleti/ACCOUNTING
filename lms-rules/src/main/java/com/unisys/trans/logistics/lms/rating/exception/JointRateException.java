/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.exception;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 *
 */
public class JointRateException extends LMSException {

	public JointRateException(LMSException pLMSException) {
		super.setCodeMessages(pLMSException.getCodeMessages());
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4110166281319255556L;

}
