/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import java.text.ParseException;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.ParticipantContactsUploadRequest;
import com.unisys.trans.logistics.lms.utils.dto.ParticipantContactsUploadResponse;
import com.unisys.trans.logistics.lms.utils.dto.StationRestrictionUploadRequest;
import com.unisys.trans.logistics.lms.utils.dto.StationRestrictionUploadResponse;
import com.unisys.trans.logistics.lms.utils.dto.TargetsUploadRequest;
import com.unisys.trans.logistics.lms.utils.dto.TargetsUploadResponse;

/**
 * RFC UIS157 <code>TargetsUploadService</code> interface exposes the APIs which
 * identifies various processing flows involved in allotment upload.
 * <p>
 * This includes the following operations:
 * <ul>
 * <li>Retrieve Targets
 * <li>Upload Targets
 * </ul>
 *
 * @see com.unisys.trans.logistics.lms.utils.dto.TargetsUploadRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TargetsUploadRequest
 */
public interface TargetsUploadService {

    /**
     * This method is used to retrieve targets as one csv file.
     *
     * @param targetsUploadRequest
     *            the targets upload request gives the fields which is required
     *            to retrieve.
     *
     * @throws LMSException
     * @return targetsUploadResponse the response returns List of targets upload
     *         dtos
     */
    TargetsUploadResponse retrieveTargets(
            TargetsUploadRequest targetsUploadRequest) throws LMSException;

    /**
     * This method is used to upload allotments by calling UC 73.
     *
     * @param targetsUploadRequest
     *            the targets upload request gives the fields which is required
     *            to upload.
     *
     * @throws LMSException
     * @throws ParseException
     *             Signals that an error has been reached unexpectedly while
     *             parsing.
     * @throws NumberFormatException
     *             Thrown to indicate that the application has attempted to
     *             convert a string to one of the numeric types, but that the
     *             string does not have the appropriate format.
     *
     */
    TargetsUploadResponse uploadTargets(
            TargetsUploadRequest targetsUploadRequest) throws LMSException,
            NumberFormatException, ParseException;

    /**
     * This method is used to upload allotments by calling UC 73.
     *
     * @param targetsUploadRequest
     *            the allotment upload request gives the fields which is
     *            required to upload.
     *
     * @throws LMSException
     * @throws ParseException
     *             Signals that an error has been reached unexpectedly while
     *             parsing.
     * @throws NumberFormatException
     *             Thrown to indicate that the application has attempted to
     *             convert a string to one of the numeric types, but that the
     *             string does not have the appropriate format.
     *
     */
    Long uploadTargetsAfterValidation(TargetsUploadRequest targetsUploadRequest)
            throws LMSException, NumberFormatException, ParseException;

    void uploadSupportData(TargetsUploadRequest targetsUploadRequest, Long oid)
            throws LMSException;

    StationRestrictionUploadResponse uploadStationRestriction(
            StationRestrictionUploadRequest pExtractRequest)
            throws LMSException;

    StationRestrictionUploadResponse findTargetUploadByOid(
            StationRestrictionUploadRequest pExtractRequest)
            throws LMSException;

    void uploadTargetFileByOid(StationRestrictionUploadRequest pExtractRequest)
            throws LMSException;

    byte[] retrieveFile(Long oId, String fileType) throws LMSException;

    TargetsUploadResponse deleteTargetsUploads(TargetsUploadRequest targetsUploadRequest)
            throws LMSException;

    ParticipantContactsUploadResponse findPartsContactTargetUploadsByOid(
            ParticipantContactsUploadRequest pExtractRequest)
            throws LMSException;

    void uploadPartsContactsTargetFileByOid(
            ParticipantContactsUploadRequest pExtractRequest)
            throws LMSException;
}