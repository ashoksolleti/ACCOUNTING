//@formatter:off
/* ====================================== */
/* Copyright(c) 2012Unisys Corporation.*/
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface BatchWriter<T extends BatchRequest, R extends BatchResponse> {
   
    R writeWorkUnit(T paramT)
                throws LMSException;
}