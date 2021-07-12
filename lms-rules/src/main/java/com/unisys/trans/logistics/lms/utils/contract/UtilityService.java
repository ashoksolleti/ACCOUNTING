package com.unisys.trans.logistics.lms.utils.contract;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.ExemptionReasonFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.ExemptionReasonResponse;
import com.unisys.trans.logistics.lms.utils.dto.ScreeningMethodFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.ScreeningMethodResponse;
import com.unisys.trans.logistics.lms.utils.dto.ShedAgentFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.ShedAgentResponse;

@Path("utilityService")
public interface UtilityService {

	/**
	 * @param aScreeningMethodFindRequest
	 * @return
	 * @throws LMSException
	 */
	@POST
    @Path("/screeningMethods")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	ScreeningMethodResponse findScreeningMethods(ScreeningMethodFindRequest aScreeningMethodFindRequest) throws LMSException;
	
	/**
	 * @param aExemptionReasonRequest
	 * @return
	 * @throws LMSException
	 */
	@POST
    @Path("/exemptionReasons")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	ExemptionReasonResponse findExemptionReasons(ExemptionReasonFindRequest aExemptionReasonRequest) throws LMSException;
	
	/**
	 * @param aShedAgentFindRequest
	 * @return
	 * @throws LMSException
	 */
	@POST
    @Path("/shedsAgents")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	ShedAgentResponse findShedsAgents(ShedAgentFindRequest aShedAgentFindRequest) throws LMSException;
}
