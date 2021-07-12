/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.MessageRequest;


/**
 * Handler Interface is used to make the WebService call.
 * 
 * @author Unisys
 * @version 1.0
 */
public abstract interface HandlerInterface{
	
	public abstract String invokeWebService(MessageRequest pRequest) throws LMSException;
}
