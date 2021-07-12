package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.RoutingProrationRequest;
import com.unisys.trans.logistics.lms.accounting.dto.RoutingProrationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface RoutingProrationService {
    public RoutingProrationResponse findRoutingProration(RoutingProrationRequest pRoutingProrationRequest) throws LMSException;
}
