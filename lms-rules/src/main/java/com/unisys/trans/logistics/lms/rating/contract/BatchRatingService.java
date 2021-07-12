/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.CommodityDto;
import com.unisys.trans.logistics.lms.rating.dto.RatingNoteDto;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;

/**
 * Interface Definition that defines API to access {@code Rate Criteria} data for processing in Batch Related
 * Services. Data returned
 * will be only as readonly data and interface does not expose
 * API to update/create the rate criteria. Use the respective Rate criteria
 * elements API to access the data.
 * 
 * @author Unisys
 * 
 */
public interface BatchRatingService {

    List<String> getUldTypes();

    List<String> getCommodityCodes();

    CommodityDto findCommodityByCodeAndType(
                final String pCommodityCode, RatingConventionType pConventionType);

    CommodityDto findIATACommodityIndefVersion(final String pCommodityCode) throws LMSException;

    RatingNoteDto findIATARatingNote(final String pRatingNote) throws LMSException;

    List<String> findAllIATARatingNoteCodes();

    RatingNoteDto findIATARatingNoteIndefVersion(final String pRatingNoteCode) throws LMSException;
}
