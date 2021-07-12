/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.framework.preferences.SimplifiedRestrictionDeleteRequest;
import com.unisys.trans.logistics.lms.framework.preferences.SimplifiedRestrictionPersistentRequest;
import com.unisys.trans.logistics.lms.framework.preferences.SimplifiedRestrictionResponse;
import com.unisys.trans.logistics.lms.framework.preferences.SimplifiedRestrictionTypeDto;
import com.unisys.trans.logistics.lms.utils.dto.RestrictTypeDto;
import com.unisys.trans.logistics.lms.utils.dto.RestrictionCheckerRequest;
import com.unisys.trans.logistics.lms.utils.dto.RestrictionCheckerResponse;
import com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.SimplifiedRestrictionFindRequest;

/**
 * <code>RestrictionService</code> interface exposes the APIs which identifies
 * various processing flows involved in maintaining restrictions.
 * <p>
 * A restriction is a general station restriction, carrier restriction, or an
 * industry restriction or collect charge restriction.An restriction can be
 * classified as export,transit,import or system wide import restriction.
 * <p>
 * This performs the following functions.<br>
 * <ul>
 * <li>Creates the restriction.
 * <li>Deletes the restriction.
 * <li>Finds the restriction.
 * <li>Updates the restriction.
 * </ul>
 *
 * @see com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionResponse
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionDto
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionDetailDto
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionCodeDto
 * @see com.unisys.trans.logistics.lms.utils.dto.RestrictionSearchDto
 */

public interface SimplifiedStationRestrictionService {

	@POST
	@Path("/createRestriction")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	SimplifiedRestrictionResponse createRestriction(
			SimplifiedRestrictionPersistentRequest pRestrictionPersistRequest) throws LMSException;

	@POST
	@Path("/findRestrictionByStationCarrier")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RestrictTypeDto findRestrictionByStationCarrier(
			final SimplifiedRestrictionPersistentRequest pRestrictionFindRequest)
			throws LMSException;

	@POST
	@Path("/validatePersistentRequest")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	SimplifiedRestrictionResponse validatePersistentRequest(
			SimplifiedRestrictionPersistentRequest pRestrictionPersistRequest) throws LMSException;


	@POST
	@Path("/findSimplifiedRestriction")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	SimplifiedRestrictionResponse findSimplifiedRestriction(
			SimplifiedRestrictionFindRequest pRequest)
			throws LMSException;

	@POST
	@Path("/findAllSimplifiedRestrictions")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	SimplifiedRestrictionResponse findAllSimplifiedRestrictions(SimplifiedRestrictionFindRequest pRequest)
			throws LMSException;


	@POST
	@Path("/updateRestriction")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	SimplifiedRestrictionResponse updateRestriction(
			SimplifiedRestrictionPersistentRequest pRequest) throws LMSException;

	@POST
	@Path("/deleteRestriction")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	SimplifiedRestrictionResponse deleteRestriction(
			SimplifiedRestrictionDeleteRequest pRequest)throws LMSException;

	RestrictionCheckerResponse findRestrictionsForAWBRouting(
            final RestrictionCheckerRequest pRestrictonGenerateRequest) throws LMSException;
	
	RestrictionCheckerResponse findRestrictionsForSegment(
            final RestrictionCheckerRequest pRestrictonGenerateRequest) throws LMSException;
	
	RestrictionCheckerResponse findCollectChargeRestriction(
            final RestrictionCheckerRequest pRestrictonGenerateRequest) throws LMSException;
	
	SimplifiedRestrictionResponse findErrorConditionGenerate(
			RestrictionFindRequest aRestrictionFindRequest)throws LMSException;

	List<SimplifiedRestrictionTypeDto> removeDuplicateRestrictions(
			List<SimplifiedRestrictionTypeDto> restrictionTypesDB)throws LMSException;

	SimplifiedRestrictionResponse deleteRestrictionForBatch(
			SimplifiedRestrictionPersistentRequest pRestrictionPersistRequest)
			throws LMSException;
}
