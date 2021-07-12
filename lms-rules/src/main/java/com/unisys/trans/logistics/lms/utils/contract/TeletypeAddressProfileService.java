/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.MessageLinkDto;
import com.unisys.trans.logistics.lms.utils.dto.TTYAddressProfileQueuedMessagesUpdateRequest;
import com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileIncomingMessageRequest;
import com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileOutgoingMessageRequest;
import com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfilePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse;

import java.util.List;

/**
 * <code>TeletypeAddressProfileService</code> interface exposes the APIs which identifies various processing
 * flows involved in maintaining the Teletype address profile information.
 * <p>
 * <code>TeletypeAddressProfileService</code> provides the following services for
 * <code>TeletypeAddressProfile</code> information.<br>
 * This performs the following functions:<br>
 * <ul>
 * <li>createTeletypeAddressProfile
 * <li>deleteMessageLinkIfOrphan
 * <li>findMessageLinksByTTYAddress
 * <li>findTeletypeAddressProfile
 * <li>processTTYAddressForIncomingMessages
 * <li>processTTYAddressForOutgoingMessages
 * <li>updateTeletypeAddressProfile
 * <li>updateQueuedMessagesCount
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileIncomingMessageRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileOutgoingMessageRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfilePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse
 * @see com.unisys.trans.logistics.lms.utils.dto.TTYAddressProfileQueuedMessagesUpdateRequest
 */
public interface TeletypeAddressProfileService {

    /**
     * Creates the <code>TeletypeAddressProfile</code>.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.TeletypeAddressProfileService#updateTeletypeAddressProfile
     * updateTeletypeAddressProfile }
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
     * </pre>
     * 
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
     *            Holds the attributes to create a Teletype address profile.
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
     *            Prohibited if Network Indicator is not blank; otherwise optional <li><code>
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
     *            Prohibited if Email Notification Indicator is not blank; otherwise optional <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setOId oId} - ()
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setReportIndicator
     *            reportIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTotalIncomingMessageCount
     *            totalIncomingMessageCount} - (M)</code>-<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTeletypeAddress
     *            teletypeAddress} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setThirdPartyRefAddress
     *            thirdPartyRefAddress} - (C)</code><br>
     *            Required if Email Notification Indicator is blank; otherwise prohibited <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setTtyAddress
     *            ttyAddress} - (C)</code><br>
     *            Required if Email Notification Indicator is not blank
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setMessageLinks
     *            messageLinks} - (O) (1:20)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.MessageLinkDto#setName name} -
     *            (M)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTeletypeFSUCodeDetails
     *            teletypeFSUCodeDetails} - (M)</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeFSUCodeDetailsDto#setStatusCode
     *            statusCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeFSUCodeDetailsDto#setStatusOption
     *            statusOption} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeFSUCodeDetailsDto#setOId oId} - (M)
     *            </code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTeletypeMessageDetails
     *            teletypeMessageDetails} - (O)</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setAcceptMessageIndicator
     *            teletypeMessageDetails} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setIncomingDoubleSignatureIndicator
     *            incomingDoubleSignatureIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setMessageInCount
     *            messageInCount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setMessageOutCount
     *            messageOutCount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setMessageTypeCode
     *            messageTypeCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setMessageVersion
     *            messageVersion} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setNumberOfCharactersReceived
     *            numberOfCharactersReceived} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setOId oId} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setOutgoingDoubleSignatureIndicator
     *            outgoingDoubleSignatureIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setQueuedMessagesCount
     *            queuedMessagesCount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setRejectedMessagesCount
     *            rejectedMessagesCount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setSpecialMessageOption
     *            specialMessageOption} - (O)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse
     *         TeletypeAddressProfileResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getDoubleSignatureForOutgoingMessage
     *         doubleSignatureForOutgoingMessage} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getIncomingMessageRejectFlag
     *         incomingMessageRejectFlag} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getTeletypeAddressProfiles
     *         TeletypeAddressProfileDto} (1:*)<br> </ul> </code>
     *         <p>
     * @throws LMSException If the Teletype address profile create operation fails the above mentioned error
     *             codes are returned. Each CodeMessage contains the status code,human readable message and
     *             message type.<br>
     */
    TeletypeAddressProfileResponse createTeletypeAddressProfile(
                TeletypeAddressProfilePersistRequest pTeletypeAddressProfilePersistRequest)
                throws LMSException;

    /**
     * Deletes a <code>MessageLink</code> by message link name.<br>
     * It deletes the message link only if it is not referred by any Teletype Address Profile.
     * <p>
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
     * </p>
     * 
     * @param pMessageLinkName Name of the Message link which is to be deleted.
     * @return <code>boolean</code> true - if the message link is deleted. false - if the message link is not
     *         deleted.
     * @throws LMSException If the find operation fails.
     */
    boolean deleteMessageLinkIfOrphan(final String pMessageLinkName) throws LMSException;

    /**
     * Finds <code>MessageLink</code> by Teletype Address Profile object id.<br>
     * <p>
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
     * </p>
     * 
     * @param pTeletypeAddressProfileOId Teletype Address Profile id for which the MessageLinks has to be
     *            retrieved.
     * @return List of <code>MessageLinkDto</code> objects retrieved.
     * @throws LMSException If the find operation fails.
     */
    List<MessageLinkDto> findMessageLinksByTTYAddress(final Long pTeletypeAddressProfileOId)
                throws LMSException;

    /**
     * Finds the <code>TeletypeAddressProfile</code>.
     * <p>
     * <b>Related methods include:</b>
     * <li>{@link TeletypeAddressProfileService#findMessageLinksByTTYAddress findMessageLinksByTTYAddress }
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
     *            findIndicator} - (M)</code>
     *            <ul>
     *            Teletype Address Profile retrieved based on the find indicator <li> If find indicator is
     *            {@link com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeAddressFindRequestType#TELETYPE_ADDRESS}
     *            then Teletype Address Profile is retrieve by TTY/TPR Address <li> If find indicator is
     *            {@link com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeAddressFindRequestType#MESSAGE_LINK}
     *            then Teletype Address Profile is retrieve by Message Link <li> If find indicator is
     *            {@link com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeAddressFindRequestType#PARTICIPANT}
     *            then Teletype Address Profile is retrieve by Participant's Unique Key
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileFindRequest#setMessageLink
     *            messageLink} - (C)</code><br>
     *            Required if findIndicator type is Message Link. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileFindRequest#setTeletypeAddress
     *            teletypeAddress} - (M)</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setThirdPartyRefAddress
     *            tprAddress} - (C)</code><br>
     *            Required if TPR Address is not of type Email address; otherwise prohibited <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setTtyAddress
     *            ttyAddress} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse
     *         TeletypeAddressProfileResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getDoubleSignatureForOutgoingMessage
     *         doubleSignatureForOutgoingMessage} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getIncomingMessageRejectFlag
     *         incomingMessageRejectFlag} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getTeletypeAddressProfiles
     *         TeletypeAddressProfileDto} (1:*)<br> </ul> </code>
     *         <p>
     * @throws LMSException If the Teletype address profile find operation fails the above mentioned error
     *             codes are returned. Each CodeMessage contains the status code,human readable message and
     *             message type.<br>
     */
    TeletypeAddressProfileResponse findTeletypeAddressProfile(
                TeletypeAddressProfileFindRequest pTeletypeAddressProfileFindRequest) throws LMSException;

    /**
     * Processes incoming <code>TeletypeAddressProfile</code> message details and updates the statistics.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link TeletypeAddressProfileService#processTTYAddressForOutgoingMessages
     * processTTYAddressForOutgoingMessages }
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
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#INCOMING_MESSAGE_ACCEPT_CONTROL}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#EMAIL_NOTIFICATION_CONTROL}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#TOTAL_INCOMING_MESSAGE_LIMIT}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#HOST_CARRIER_CODE}
     * </pre>
     * 
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
     *            <td>The TTY/TPR address already exists and duplicates are not allowed</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pIncomingMessageRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileIncomingMessageRequest
     *            TeletypeAddressProfileIncomingMessageRequest}</code><br>
     *            Holds the attributes processes the incoming teletype message.
     *            <p>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileIncomingMessageRequest#setDoubleSignature
     *            doubleSignature} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileIncomingMessageRequest#setMessageTypeCode
     *            messageTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileIncomingMessageRequest#setTeletypeAddress
     *            teletypeAddress} - (M)</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setThirdPartyRefAddress
     *            tprAddress} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setTtyAddress
     *            ttyAddress} - (M)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileIncomingMessageRequest#setTotalNumberOfCharacters
     *            totalNumberOfCharacters} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse
     *         TeletypeAddressProfileResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getDoubleSignatureForOutgoingMessage
     *         doubleSignatureForOutgoingMessage} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getIncomingMessageRejectFlag
     *         incomingMessageRejectFlag} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getTeletypeAddressProfiles
     *         TeletypeAddressProfileDto} (1:*)<br> </ul> </code>
     *         <p>
     * @throws LMSException If the Teletype address profile create operation fails the above mentioned error
     *             codes are returned. Each CodeMessage contains the status code,human readable message and
     *             message type.<br>
     */
    TeletypeAddressProfileResponse processTTYAddressForIncomingMessages(
                final TeletypeAddressProfileIncomingMessageRequest pIncomingMessageRequest)
                throws LMSException;

    /**
     * Processes outgoing <code>TeletypeAddressProfile</code> message details and updates the statistics.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link TeletypeAddressProfileService#processTTYAddressForIncomingMessages(TeletypeAddressProfileIncomingMessageRequest)
     * processTTYAddressForOutgoingMessages }
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#CENTRAL_TTY_ADDRESS_EXTERNAL_SYSTEM}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#CENTRAL_TTY_ADDRESS_ISM_SYSTEM}
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
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#HOST_CARRIER_CODE}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#INCOMING_MESSAGE_ACCEPT_CONTROL}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#EMAIL_NOTIFICATION_CONTROL}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#TOTAL_INCOMING_MESSAGE_LIMIT}
     * </pre>
     * 
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
     *            <td>The TTY/TPR address already exists and duplicates are not allowed</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pOutgoingMessageRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileOutgoingMessageRequest
     *            TeletypeAddressProfileOutgoingMessageRequest}</code><br>
     *            Holds the attributes processes the incoming teletype message.
     *            <p>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileOutgoingMessageRequest#setDoubleSignatureCarrierCode
     *            doubleSignatureCarrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileOutgoingMessageRequest#setMessageTypeCode
     *            messageTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileOutgoingMessageRequest#setTeletypeAddresses
     *            teletypeAddresses}- (M)(1:*)</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setThirdPartyRefAddress
     *            tprAddress} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setTtyAddress
     *            ttyAddress} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse
     *         TeletypeAddressProfileResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getDoubleSignatureForOutgoingMessage
     *         doubleSignatureForOutgoingMessage} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getIncomingMessageRejectFlag
     *         incomingMessageRejectFlag} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getTeletypeAddressProfiles
     *         TeletypeAddressProfileDto} (1:*)<br> </ul> </code>
     *         <p>
     * @throws LMSException If the Teletype address profile create operation fails the above mentioned error
     *             codes are returned. Each CodeMessage contains the status code,human readable message and
     *             message type.<br>
     */
    TeletypeAddressProfileResponse processTTYAddressForOutgoingMessages(
                final TeletypeAddressProfileOutgoingMessageRequest pOutgoingMessageRequest)
                throws LMSException;

    /**
     * Updates queued Teletype messages count.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link TeletypeAddressProfileService#processTTYAddressForOutgoingMessages
     * processTTYAddressForOutgoingMessages}
     * <li>
     * {@link TeletypeAddressProfileService#processTTYAddressForIncomingMessages
     * processTTYAddressForIncomingMessages}
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
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTY_TPR_ADDRESS_DOES_NOT_EXISTS}</td>
     *            <td>The TTY/TPR address does not exist.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pTTYAddressProfileQueuedMessagesUpdateRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TTYAddressProfileQueuedMessagesUpdateRequest
     *            TTYAddressProfileQueuedMessagesUpdateRequest}</code><br>
     *            Holds the attributes to update the queue messages count.
     *            <p>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TTYAddressProfileQueuedMessagesUpdateRequest#setMessageTypeCode
     *            messageTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TTYAddressProfileQueuedMessagesUpdateRequest#setQueueIndicator
     *            queueIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TTYAddressProfileQueuedMessagesUpdateRequest#setTeletypeAddress
     *            teletypeAddress} - (M)</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setThirdPartyRefAddress
     *            tprAddress} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setTtyAddress
     *            ttyAddress} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse
     *         TeletypeAddressProfileResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getDoubleSignatureForOutgoingMessage
     *         doubleSignatureForOutgoingMessage} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getIncomingMessageRejectFlag
     *         incomingMessageRejectFlag} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getTeletypeAddressProfiles
     *         TeletypeAddressProfileDto} (1:*)<br> </ul> </code>
     *         <p>
     * @throws LMSException If the Teletype address profile create operation fails the above mentioned error
     *             codes are returned. Each CodeMessage contains the status code,human readable message and
     *             message type.<br>
     */
    TeletypeAddressProfileResponse updateQueuedMessagesCount(
                TTYAddressProfileQueuedMessagesUpdateRequest pTTYAddressProfileQueuedMessagesUpdateRequest)
                throws LMSException;

    /**
     * Updates the <code>TeletypeAddressProfile</code>.
     * <p>
     * <b>Related methods include:</b>
     * <li>{@link TeletypeAddressProfileService#updateTeletypeAddressProfile updateTeletypeAddressProfile }
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
     * </pre>
     * 
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
     *            Prohibited if Network Indicator is not blank; otherwise optional <li><code>
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
     *            Prohibited if Email Notification Indicator is not blank; otherwise optional <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setOId oId} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setReportIndicator
     *            reportIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTotalIncomingMessageCount
     *            totalIncomingMessageCount} - (M)</code>-<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTeletypeAddress
     *            teletypeAddress} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setThirdPartyRefAddress
     *            tprAddress} - (C)</code><br>
     *            Required if Email Notification Indicator is blank; otherwise prohibited <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressTypeDto#setTtyAddress
     *            ttyAddress} - (C)</code><br>
     *            Required if Email Notification Indicator is not blank
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setMessageLinks
     *            messageLinks} - (O) (1:20)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.MessageLinkDto#setName name} -
     *            (M)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTeletypeFSUCodeDetails
     *            teletypeFSUCodeDetails} - (M)</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeFSUCodeDetailsDto#setStatusCode
     *            statusCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeFSUCodeDetailsDto#setStatusOption
     *            statusOption} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeFSUCodeDetailsDto#setOId oId} - (M)
     *            </code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileDto#setTeletypeMessageDetails
     *            teletypeMessageDetails} - (O)</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setAcceptMessageIndicator
     *            teletypeMessageDetails} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setIncomingDoubleSignatureIndicator
     *            incomingDoubleSignatureIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setMessageInCount
     *            messageInCount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setMessageOutCount
     *            messageOutCount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setMessageTypeCode
     *            messageTypeCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setMessageVersion
     *            messageVersion} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setNumberOfCharactersReceived
     *            numberOfCharactersReceived} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setOId oId} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setOutgoingDoubleSignatureIndicator
     *            outgoingDoubleSignatureIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setQueuedMessagesCount
     *            queuedMessagesCount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setRejectedMessagesCount
     *            rejectedMessagesCount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeMessageDetailsDto#setSpecialMessageOption
     *            specialMessageOption} - (O)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse
     *         TeletypeAddressProfileResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getDoubleSignatureForOutgoingMessage
     *         doubleSignatureForOutgoingMessage} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getIncomingMessageRejectFlag
     *         incomingMessageRejectFlag} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TeletypeAddressProfileResponse#getTeletypeAddressProfiles
     *         TeletypeAddressProfileDto} (1:*)<br> </ul> </code>
     *         <p>
     * @throws LMSException If the Teletype address profile update operation fails the above mentioned error
     *             codes are returned. Each CodeMessage contains the status code,human readable message and
     *             message type.<br>
     */
    TeletypeAddressProfileResponse updateTeletypeAddressProfile(
                TeletypeAddressProfilePersistRequest pTeletypeAddressProfilePersistRequest)
                throws LMSException;
}
