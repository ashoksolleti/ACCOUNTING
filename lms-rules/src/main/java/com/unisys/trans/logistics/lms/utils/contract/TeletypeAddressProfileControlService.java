/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileControlResponse;
import com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfilePersistRequest;

/**
 * <code>TeletypeAddressProfileControlService</code> provides interface for retrieving, creating and updating
 * Teletype Address Profile information.<br>
 * <p>
 * The processing of incoming and outgoing teletype (TTY) messages is governed by the TTY Address Profile for
 * each TTY/TPR address. <br>
 * This service performs the following functions:<br>
 * <ul>
 * <li>Creates the Teletype Address Profile
 * <li>Updates the Teletype Address Profile
 * <li>Finds the Teletype Address Profile
 * </ul>
 * <br>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfilePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileControlResponse
 */
public interface TeletypeAddressProfileControlService {

    /**
     * Creates the <code>TeletypeAddressProfile</code>.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FAD}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FBL}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FBR}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FFA}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FFM}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FFR}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FHL}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FMA}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FNA}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FOA}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FOR}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FSA}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FSR}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FSU}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FVA}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FVR}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FWB}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FWR}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FZC}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FZD}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FZE}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#TOTAL_INCOMING_MESSAGE_LIMIT}
     * </pre>
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
     * <br>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTY_TPR_ADDRESS_DUPLICATE}</td>
     *            <td>The TTY/TPR address already exists and duplicates are not allowed.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pTeletypeAddressProfilePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfilePersistRequest
     *            TeletypeAddressProfilePersistRequest}</code><br>
     *            Holds the attributes to create a Teletype address profile.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfilePersistRequest#setTeletypeAddressProfile teletypeAddressProfile} - (M)</code>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setDeleteIndicator deleteIndicator} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setEmailNotificationIndicator emailNotificationIndicator} - (C)</code>
     *            <br>
     *            Prohibited if Network Indicator is not blank; otherwise optional.
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setEntityMailingAddress entityMailingAddress} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setEntityName entityName} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setFsuMessageFlag fsuMessageFlag} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setLastIncomingMessageDateAndTime lastIncomingMessageDateAndTime} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setNetworkIndicator networkIndicator} - (C)</code>
     *            <br>
     *            Prohibited if Email Notification Indicator is not blank; otherwise optional.
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setReportIndicator reportIndicator} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTotalIncomingMessageCount totalIncomingMessageCount} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTeletypeAddress teletypeAddress} - (M) (1:1)</code>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setThirdPartyRefAddress thirdPartyRefAddress} - (C)</code>
     *            <br>
     *            Mandatory if Email Notification Indicator is blank; otherwise prohibited.
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setTtyAddress ttyAddress} - (C)</code>
     *            <br>
     *            Mandatory if Email Notification Indicator is not blank.
     *            </ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setMessageLinks messageLinks} - (O) (*:*)</code>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.MessageLinkDto#setName name} - (M)</code>
     *            </ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTeletypeFSUCodeDetails teletypeFSUCodeDetails} - (M) (1:*)</code>
     *            <br>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeFSUCodeDetailsDto#setStatusCode statusCode} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeFSUCodeDetailsDto#setStatusOption statusOption} - (M)</code>
     *            </ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTeletypeMessageDetails teletypeMessageDetails} - (O) (1:*)</code>
     *            <br>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setAcceptMessageIndicator acceptMessageIndicator} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setIncomingDoubleSignatureIndicator incomingDoubleSignatureIndicator} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setMessageTypeCode messageTypeCode} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setMessageVersion messageVersion} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setOutgoingDoubleSignatureIndicator outgoingDoubleSignatureIndicator} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setSpecialMessageOption specialMessageOption} - (C)</code>
     *            <br>
     *            Optional for messages types: FFR, FFA, FSA, FSU, FVR, FBL, FHL and FFM. Prohibited for other
     *            message types.
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileControlResponse
     *         TeletypeAddressProfileResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileControlResponse#getParticipants
     *         participants}(0:0) <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileControlResponse#getTeletypeAddressProfiles
     *         teletypeAddressProfiles}(1:1) </ul> </code>
     *         <p>
     * @throws LMSException If the Teletype address profile create operation fails the above mentioned error
     *             codes are returned. Each CodeMessage contains the status code, human readable message and
     *             message type.
     */
    TeletypeAddressProfileControlResponse createTeletypeAddressProfile(
                TeletypeAddressProfilePersistRequest pTeletypeAddressProfilePersistRequest)
                throws LMSException;

    /**
     * Finds the <code>TeletypeAddressProfile</code>.
     * <p>
     * The teletype address profile information can be retrieved in one of the following ways:
     * <ul>
     * <li>by using TTY/TPR address.
     * <li>by using participant information.
     * <li>by using message link.
     * </ul>
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.TeletypeAddressProfileService#findMessageLinksByTTYAddress
     * findMessageLinksByTTYAddress }
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FAD}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FBL}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FBR}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FFA}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FFM}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FFR}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FHL}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FMA}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FNA}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FOA}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FOR}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FSA}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FSR}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FSU}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FVA}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FVR}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FWB}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FWR}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FZC}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FZD}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DEFAULT_MESSAGE_OPTIONS_FOR_FZE}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#TOTAL_INCOMING_MESSAGE_LIMIT}
     * </pre>
     * 
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
     * <br>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTY_TPR_ADDRESS_DOES_NOT_EXISTS}</td>
     *            <td>The TTY/TPR address does not exist.</td>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_PARTICIPANTS_ASSOCIATED_WITH_MSG_LINK}</td>
     *            <td>No participant associated with the given Message Link.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pTeletypeAddressProfileFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileFindRequest
     *            TeletypeAddressProfileFindRequest}</code><br>
     *            Holds the attributes to find the Teletype address profiles.
     *            <p>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileFindRequest#setFindIndicator
     *            findIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileFindRequest#setMessageLink
     *            messageLink} - (C)</code><br>
     *            Mandatory if findIndicator is
     *            {@linkplain com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeAddressFindRequestType#MESSAGE_LINK
     *            MESSAGE_LINK}; otherwise prohibited. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileFindRequest#setParticipantLinksOnlyIndicator
     *            participantLinksOnlyIndicator} - (C)</code><br>
     *            Optional if findIndicator is
     *            {@linkplain com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeAddressFindRequestType#MESSAGE_LINK
     *            MESSAGE_LINK}; otherwise prohibited. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileFindRequest#setTeletypeAddress
     *            teletypeAddress} - (C)</code><br>
     *            Mandatory if findIndicator is
     *            {@linkplain com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeAddressFindRequestType#TELETYPE_ADDRESS
     *            TELETYPE_ADDRESS} and ttyAddressProfileOid is blank; otherwise prohibited.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setThirdPartyRefAddress
     *            thirdPartyRefAddress} - (C)</code><br>
     *            Mandatory if TPR Address is not of type Email address; otherwise prohibited. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setTtyAddress
     *            ttyAddress} - (O)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileFindRequest#setTtyAddressProfileOId
     *            ttyAddressProfileOId} - (C)</code><br>
     *            Optional if findIndicator is
     *            {@linkplain com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeAddressFindRequestType#TELETYPE_ADDRESS}
     *            ; otherwise prohibited.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileControlResponse
     *         TeletypeAddressProfileResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileControlResponse#getParticipants
     *         participants}(1:*) <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileControlResponse#getTeletypeAddressProfiles
     *         teletypeAddressProfiles}(1:*) </ul> </code>
     *         <p>
     * @throws LMSException If the Teletype address profile find operation fails the above mentioned error
     *             codes are returned. Each CodeMessage contains the status code, human readable message and
     *             message type.
     */
    TeletypeAddressProfileControlResponse findTeletypeAddressProfile(
                TeletypeAddressProfileFindRequest pTeletypeAddressProfileFindRequest) throws LMSException;

    /**
     * Updates the <code>TeletypeAddressProfile</code>.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.TeletypeAddressProfileService#updateTeletypeAddressProfile
     * updateTeletypeAddressProfile }
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
     * <br>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTY_TPR_ADDRESS_DUPLICATE}</td>
     *            <td>The TTY/TPR Address must be unique.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pTeletypeAddressProfilePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfilePersistRequest
     *            TeletypeAddressProfilePersistRequest}</code><br>
     *            Holds the attributes to update a Teletype address profile.
     *            <p>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfilePersistRequest#setTeletypeAddressProfile
     *            teletypeAddressProfile} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setDeleteIndicator
     *            deleteIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setEmailNotificationIndicator
     *            emailNotificationIndicator} - (C)</code><br>
     *            Prohibited if Network Indicator is not blank; otherwise optional. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setEntityMailingAddress
     *            entityMailingAddress} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setEntityName
     *            entityName} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setFsuMessageFlag
     *            fsuMessageFlag} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setLastIncomingMessageDateAndTime
     *            lastIncomingMessageDateAndTime} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setNetworkIndicator
     *            networkIndicator} - (C)</code> <br>
     *            Prohibited if Email Notification Indicator is not blank; otherwise optional. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setOId oId} - (C)
     *            </code><br>
     *            Mandatory if an existing Teletype Address Profile is updated; otherwise optional. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setReportIndicator
     *            reportIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTotalIncomingMessageCount
     *            totalIncomingMessageCount} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTeletypeAddress
     *            teletypeAddress} - (M) (1:1)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setThirdPartyRefAddress
     *            thirdPartyRefAddress} - (C)</code><br>
     *            Mandatory if Email Notification Indicator is blank; otherwise prohibited. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setTtyAddress
     *            ttyAddress} - (C)</code><br>
     *            Mandatory if Email Notification Indicator is not blank. <li> <code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Mandatory if an existing Teletype Address Profile is updated; otherwise optional.
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setMessageLinks
     *            messageLinks} - (O) (*:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.MessageLinkDto#setName name} -
     *            (M)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTeletypeFSUCodeDetails
     *            teletypeFSUCodeDetails} - (M) (1:*)</code><br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeFSUCodeDetailsDto#setOId
     *            oId} - (M)</code><br>
     *            Mandatory if an existing Teletype Address Profile is updated; otherwise optional. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeFSUCodeDetailsDto#setStatusCode
     *            statusCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeFSUCodeDetailsDto#setStatusOption
     *            statusOption} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Mandatory if an existing Teletype Address Profile is updated; otherwise optional.
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTeletypeMessageDetails
     *            teletypeMessageDetails} - (O) (1:*)</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setAcceptMessageIndicator
     *            acceptMessageIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setIncomingDoubleSignatureIndicator
     *            incomingDoubleSignatureIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setMessageTypeCode
     *            messageTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setMessageVersion
     *            messageVersion} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setOId oId} - (C)
     *            </code><br>
     *            Mandatory if an existing Teletype Address Profile is updated; otherwise optional. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setOutgoingDoubleSignatureIndicator
     *            outgoingDoubleSignatureIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setSpecialMessageOption
     *            specialMessageOption} - (C)</code><br>
     *            Optional for messages types: FFR, FFA, FSA, FSU, FVR, FBL, FHL and FFM. Prohibited for other
     *            message types. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Mandatory if an existing Teletype Address Profile is updated; otherwise optional.
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Mandatory if an existing Teletype Address Profile is updated; otherwise optional.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileControlResponse
     *         TeletypeAddressProfileResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileControlResponse#getParticipants
     *         participants} (0:0) <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileControlResponse#getTeletypeAddressProfiles
     *         teletypeAddressProfiles}(1:*) </ul> </code>
     *         <p>
     * @throws LMSException If the Teletype address profile update operation fails the above mentioned error
     *             codes are returned. Each CodeMessage contains the status code, human readable message and
     *             message type.
     */
    TeletypeAddressProfileControlResponse updateTeletypeAddressProfile(
                TeletypeAddressProfilePersistRequest pTeletypeAddressProfilePersistRequest)
                throws LMSException;
}
