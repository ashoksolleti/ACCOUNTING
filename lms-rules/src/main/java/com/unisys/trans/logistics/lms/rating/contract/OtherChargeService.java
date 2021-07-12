/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.OtherChargeResponse;
import com.unisys.trans.logistics.lms.rating.dto.OtherChargeValidatorRequest;
import com.unisys.trans.logistics.lms.rating.dto.OtherChargeValidatorResponse;
import com.unisys.trans.logistics.lms.rating.dto.price.ParticipantDto;

/**
 * <code>OtherChargeServiceImpl</code> provides the functional methods to maintain
 * other charge information.
 * <p>
 * It offers the following services for maintaining other charge information:<br>
 * <ul>
 * <li>generateOtherChargeInformation - Generates other charge information.
 * <li>validateOtherChargeInformation - Validates other charge information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.OtherChargeValidatorRequest
 *      OtherChargeValidatorRequest
 */
public interface OtherChargeService {

    /**
     * Generates the other charges for the given input origin, destination and participant.<br>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * <p>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CODE_DOES_NOT_EXIST}</td>
     *            <td>Code is invalid.</td>
     *            </tr>
     *            </code><br>
     * 
     * @param pParticipantDtos
     *            <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto
     *            ParticipantDto}</code><br>
     *            includes the list of <code>ParticipantDto</code> information.
     * @param pOrigin
     *            Includes the value of origin.
     * @param pDestination
     *            Includes the value of destination.
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeResponse
     *         OtherChargeResponse} </code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeResponse OtherChargeResponse}
     *         </code><br>
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If the <code>Other charge Information</code> does not exist the above mentioned error codes
     *             are returned. Each <code>CodeMessage</code> contains the status code, human readable
     *             message and message type.
     */
    OtherChargeResponse generateOtherChargeInformation(final String pOrigin,
                final String pDestination,
                final List<ParticipantDto> pParticipantDtos) throws LMSException;

    /**
     * Validates the other charges for the input OtherChargeValidatorRequest.<br>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * <p>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CODE_DOES_NOT_EXIST}</td>
     *            <td>Code is invalid.</td>
     *            </tr>
     *            </code><br>
     * 
     * @param pOtherChargeValidatorRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto. OtherChargeValidatorRequest
     *            OtherChargeValidatorRequest}</code><br>
     *            includes the attributes to retrieve a <code>Other charge Information</code>.
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeValidatorResponse
     *         OtherChargeValidatorResponse} </code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.OtherChargeValidatorResponse
     *         OtherChargeValidatorResponse} </code><br>
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If the <code>Other charge Information</code> does not exist the above mentioned error codes
     *             are returned. Each <code>CodeMessage</code> contains the status code, human readable
     *             message and message type.
     */
    OtherChargeValidatorResponse validateOtherChargeInformation(
                final OtherChargeValidatorRequest pOtherChargeValidatorRequest)
                throws LMSException;
}