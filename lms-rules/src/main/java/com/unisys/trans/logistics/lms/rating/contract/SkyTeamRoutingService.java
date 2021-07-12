package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.SkyTeamRequest;
import com.unisys.trans.logistics.lms.rating.dto.SkyTeamResponse;

public interface SkyTeamRoutingService {
    public SkyTeamResponse getSkyTeamResponse(final SkyTeamRequest pSkyTeamRequest)throws LMSException;
}
