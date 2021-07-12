/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.contract;

import java.util.List;
import java.util.Set;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest;
import com.unisys.trans.logistics.lms.parts.dto.BillingGroupDeleteRequest;
import com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto;
import com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.BillingGroupPersistRequest;
import com.unisys.trans.logistics.lms.parts.dto.BillingGroupResponse;
import com.unisys.trans.logistics.lms.parts.dto.BillingGroupRestoreRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto;


/**
 * <code>ParticipantGroupService</code> interface exposes the APIs which
 * identifies various processing flows involved in maintaining participant group
 * information.
 * <p>
 * This performs the following functions:
 * <ul>
 * <li>Creates the participant group.
 * <li>Deletes the participant group.
 * <li>Restores the participant group.
 * <li>Updates the participant group.
 * <li>Finds the participant group by group number.
 * <li>Finds the participant group by participant.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.parts.dto.BillingGroupDeleteRequest
 * @see com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest
 * @see com.unisys.trans.logistics.lms.parts.dto.BillingGroupPersistRequest
 * @see com.unisys.trans.logistics.lms.parts.dto.BillingGroupRestoreRequest
 * @see com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse
 */

public interface BillingGroupService {

    /**
     * This method creates a participant group.
     * <p>
     * <b>Related methods:</b>
     * 
     * <pre>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantGroupService#deleteParticipantGroup deleteParticipantGroup}
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantGroupService#updateParticipantGroup updateParticipantGroup}
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantGroupService#restoreParticipantGroup restoreParticipantGroup}
     * </pre>
     * 
     * A participant which is exist in the system can be added to the participant group only by either
     * participant billing account number1 or an IATA agent number.<br>
     * The system returns the participant group details with list of all participant details.
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes may be returned:</b>
     * <table border="0" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_DUPLICATES_NOT_ALLOWED}</code>
     * </td>
     * <td align="left">Duplicate participant account numbers cannot be added to a group.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_ACCOUNT_NUMBER_MUST_BE_EXIST}</code>
     * </td>
     * <td align="left">The participant account number that is added to a participant group must be present in
     * the system.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_MUST_NOT_BE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">The participant account number that is added to a participant group must not be marked
     * for deletion.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_IS_NOT_FOUND}</code>
     * </td>
     * <td align="left">Participant group does not exist in the system.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_IS_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Participant group is marked for deletion.</td> <br>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pBillingGroupPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantPersistRequest
     *            ParticipantPersistRequest}</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto
     *            BillingGroupDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto#setGroupDescription
     *            groupDescription} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto#setGroupNumber
     *            groupNumber} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto#setOId
     *            oId} - (C)</code><br>
     *            Prohibited for create operation,othrwise mandatory. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto#setGroupMembers
     *            groupMembers} - (O)(0:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     *            ParticipantDetailDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setAccountNumber
     *            accountNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setParticipantAccountType
     *            participantAccountType} - (O)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupResponse
     *         BillingGroupResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto
     *         participantGroups}(1:*) </code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto
     *         BillingGroupDto} </code>
     *         </ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     *         participantDetail}</code>
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If validation fails the above mentioned error codes are returned. Each CodeMessage contains
     *             the status code,human readable message and message type.
     */
    BillingGroupResponse createParticipantGroup(
                BillingGroupPersistRequest pBillingGroupPersistRequest)
                throws LMSException;

    
    /**
     * The system marks the participant group information as deleted.
     * <p>
     * <b>Related methods:</b>
     * 
     * <pre>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantGroupService#restoreParticipantGroup restoreParticipantGroup}
     * </pre>
     * 
     * The participant group is marked for deletion by setting the end date.<br>
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes may be returned:</b>
     * <table border="0" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <td align="left">
     * {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_ENDDATE_SHOULD_BE_TODAY_OR_LATER}
     * </td>
     * <td align="left">The End Date must be today or later.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_IS_ALREADY_MARKED_FOR_DELETION}
     * </td>
     * <td align="left">Participant group is already marked for deletion.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_IS_NOT_FOUND}</td>
     * <td align="left">Participant group does not exist in the system.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_IS_MARKED_FOR_DELETION}
     * </td>
     * <td align="left">Participant group is marked for deletion.</td> <br>
     * </tr>
     * </table>
     * 
     * @param pBillingGroupDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest
     *            ParticipantDeleteRequest}</code><br>
     *            holds attributes to deactivate a participant.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDeleteRequest#setEndDate
     *            endDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDeleteRequest#setGroupNumber
     *            groupNumber} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDeleteRequest#setOId
     *            oId} - (M)</code>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupResponse
     *         BillingGroupResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </code> <br>
     *         holds the <code>CodeMessage</code>.
     *         </ul>
     * @throws LMSException
     *             If validation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human
     *             readable message and message type.
     */
    BillingGroupResponse deleteParticipantGroup(
                BillingGroupDeleteRequest pBillingGroupDeleteRequest)
                throws LMSException;

    /**
     * Retrieves participant group information as well as participant
     * information that are associated with the group.
     * <p>
     * <b>Related methods include:</b>
     * 
     * <pre>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantGroupService#findParticipantGroupsForParticipant findParticipantGroupsForParticipant}
     * </pre>
     * 
     * Finds all the participants associated with the participant group number.For each participant, the
     * system retrieves the participant information.Returns the details of all the participants associated
     * with the participant group number.
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes may be returned:</b>
     * <table border="0" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_IS_NOT_FOUND}</code>
     * </td>
     * <td align="left">Participant group does not exist in the system.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_IS_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Participant group is marked for deletion.</td> <br>
     * </tr>
     * </table>
     * 
     * @param pBillingGroupFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest
     *            BillingGroupFindRequest}</code><br>
     *            holds the attributes to find the <code>ParticipantGroup</code> .<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest#setGroupNumber
     *            groupNumber} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest#setRetrieveType
     *            retrieveType} - (C)</code><br>
     *            Retrieve type is "G" when Participant group is retrieved by group number. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest#setExactMatchIndicator
     *            exactMatchIndicator} - (C)</code><br>
     *            True - if user wants to retrieve a particular group.<br>
     *            False - Retrieve all groups. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest#setParticipantAccountNumber
     *            participantAccountNumber} - (P)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest#setParticipantAccountType
     *            participantAccountType} - (P)</code>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupResponse
     *         BillingGroupResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupResponse#getParticipantGroups()
     *         participantGroups}(1:*) </code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto
     *         BillingGroupDto} </code>
     *         </ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     *         participantDetail}</code>
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If validation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human
     *             readable message and message type.
     */
    BillingGroupResponse findParticipantGroupByGroupNumber(
                BillingGroupFindRequest pBillingGroupFindRequest)
                throws LMSException;

    /**
     * Retrieves participant groups information as well as participant
     * information that are associated with the groups.
     * <p>
     * <b>Related methods include:</b>
     * 
     * <pre>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantGroupService#findParticipantGroupsForParticipant findParticipantGroupsForParticipant}
     * </pre>
     * 
     * Finds all the participants associated with the participant group number.For each participant, the
     * system retrieves the participant information.Returns the details of all the participants associated
     * with the participant group number.
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes may be returned:</b>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_IS_NOT_FOUND}</code>
     * </td>
     * <td align="left">Participant group does not exist in the system.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_IS_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Participant group is marked for deletion.</td> <br>
     * </tr>
     * </table>
     * 
     * @param pParticipantGroupNumber holds the participant group number.
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto
     *         BillingGroupDto}</code>
     * @throws LMSException
     *             If validation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human
     *             readable message and message type.
     */
    List<BillingGroupDto> findParticipantGroupsByGroupNumbers(
                Set<String> pParticipantGroupNumber) throws LMSException;

    /**
     * Retrieves all participant group information that are associated with a
     * participant.
     * <p>
     * <b>Related methods include:</b>
     * 
     * <pre>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantGroupService#findParticipantGroupByGroupNumber findParticipantGroupByGroupNumber}
     * </pre>
     * 
     * Retrieves all participant group information that are associated with a participant.The actor provides
     * either participant account number and account type or participant name and station as input.When both
     * input are provided,participant account number will taken as input.System validates existance of aacount
     * number and returns all the groups associated with the account number. <br>
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
     * 
     * @param pBillingGroupFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest
     *            BillingGroupFindRequest}</code><br>
     *            holds the attributes to find the <code>Participant</code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest#setParticipantAccountNumber
     *            participantAccountNumber} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest#setParticipantAccountType
     *            participantAccountType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest#setRetrieveType
     *            retrieveType} - (C)</code><br>
     *            Retrieve type is "P" when Participant group is retrieved by participant account number. <li>
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest#setGroupNumber
     *            groupNumber} - (P)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupFindRequest#setExactMatchIndicator
     *            exactMatchIndicator} - (P)</code><br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupResponse
     *         BillingGroupResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupResponse#getParticipantGroups()
     *         participantGroups}(1:*) </code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto
     *         BillingGroupDto} </code>
     *         </ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     *         participantDetail}</code>
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If validation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human
     *             readable message and message type.
     */
    BillingGroupResponse findParticipantGroupsForParticipant(
                BillingGroupFindRequest pBillingGroupFindRequest)
                throws LMSException;

    /**
     * Restores a participant group which is marked for deletion.
     * <p>
     * <b>Related methods include:</b>
     * 
     * <pre>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantGroupService#deleteParticipantGroup deleteParticipantGroup}
     * </pre>
     * 
     * Restores participant group information which is marked for deletion.
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes may be returned:</b>
     * <table border="0" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Only participant groups that are marked for deletion can be restored.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_IS_NOT_FOUND}</code>
     * </td>
     * <td align="left">Participant group does not exist in the system.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_IS_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Participant group is marked for deletion.</td> <br>
     * </tr>
     * </table>
     * 
     * @param pBillingGroupRestoreRequest
     *            <code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupRestoreRequest
     *            BillingGroupRestoreRequest}</code><br>
     *            holds attributes to reactivate a participant.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupRestoreRequest#setGroupNumber
     *            groupNumber} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupRestoreRequest#setOId
     *            oId} - (M)</code>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupResponse
     *         BillingGroupResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupResponse#getParticipantGroups()
     *         participantGroups}(1:*) </code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto
     *         BillingGroupDto} </code>
     *         </ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     *         participantDetail}</code>
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If validation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human
     *             readable message and message type.
     */
    BillingGroupResponse restoreParticipantGroup(
                BillingGroupRestoreRequest pBillingGroupRestoreRequest)
                throws LMSException;

    /**
     * This method updates a participant group information.
     * <p>
     * <b>Related methods:</b>
     * 
     * <pre>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantGroupService#deleteParticipantGroup createParticipantGroup}
     * </pre>
     * 
     * During update function, the system does the following based upon the input provided by the actor:
     * <ul>
     * <li>Updates the participant group details.
     * <li>Adds the participants to the participant group, if the optional participant account numbers are
     * provided by the user. The participant account numbers must present in the system.
     * <li>Returns the list of all participants associated with the participant group.
     * </ul>
     * <br>
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes may be returned:</b>
     * <table border="0" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_NUMBER_CANNOT_BE_UPDATED}</code>
     * </td>
     * <td align="left">Participant group number cannot be updated.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_CANNOT_BE_UPDATED}</code>
     * </td>
     * <td align="left">Participant Group information that has been 
     * marked for deletion must not be updated.</td>
     * <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_DUPLICATES_NOT_ALLOWED}</code>
     * </td>
     * <td align="left">Duplicate participant account numbers cannot be added to a group.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_ACCOUNT_NUMBER_MUST_BE_EXIST}</code>
     * </td>
     * <td align="left">The participant account number that is added to a participant group must be present in
     * the system.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_MUST_NOT_BE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">The participant account number that is added to a participant group must not be marked
     * for deletion.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_IS_NOT_FOUND}</code>
     * </td>
     * <td align="left">Participant group does not exist in the system.</td> <br>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_GROUP_IS_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">Participant group is marked for deletion.</td> <br>
     * </tr>
     * </table>
     * 
     * @param pBillingGroupPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantPersistRequest
     *            ParticipantPersistRequest}</code><br>
     *            holds the attributes to create a participant.<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto
     *            BillingGroupDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto#setGroupDescription
     *            groupDescription} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto#setGroupNumber
     *            groupNumber} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto#setOId
     *            oId} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto#setDeleteIndicator
     *            deleteIndicator} - (P)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto#setEndDate
     *            endDate} - (P)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto#setGroupMembers
     *            groupMembers} - (O)(1:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     *            ParticipantDetailDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setAccountNumber
     *            accountNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setParticipantAccountType
     *            participantAccountType} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setAddress
     *            address} - (P)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setCity
     *            city} - (P) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setCountryCode
     *            countryCode} - (P)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setDeleteIndicator
     *            deleteIndicator} - (P)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setOId
     *            oId} - (P) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setName
     *            name} - (P) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setPostalCode
     *            postalCode} - (P)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setState
     *            state} - (P) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setStationCode
     *            stationCode} - (P)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupResponse
     *         BillingGroupResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupResponse#getParticipantGroups()
     *         participantGroups}(1:*) </code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDto
     *         BillingGroupDto} </code>
     *         </ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     *         participantDetail}</code>
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If validation fails the above mentioned error codes are returned. Each CodeMessage contains
     *             the status code,human readable message and message type.
     */
    BillingGroupResponse updateParticipantGroup(
                BillingGroupPersistRequest pBillingGroupPersistRequest)
                throws LMSException;

    /**
     * Retrieves all participant group information that are associated with a
     * participant account number.
     * <p>
     * Retrieves all participant group information that are associated with a participant account number.The
     * actor provides either participant account number as input.When input are provided,participant account
     * number will taken as input.System validates existence of account number and returns all the groups
     * associated with the account number. <br>
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
     * 
     * 
     * @param pParticipantDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest
     *            ParticipantDeleteRequest}</code><br>
     *            holds the attributes to find the <code>Participant</code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setDeleteDate
     *            DeleteDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setDeletedStation
     *            deletedStation} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setDeletedUser
     *            deletedUser} - (C)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setDeleteIndicator
     *            deleteIndicator} - (P)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setDeleteContractSra
     *            deleteContractSra} - (P)</code><br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse#getCreateCount()
     *         createCount} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse#getUpdateCount()
     *         updateCount} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse#getDeleteCount()
     *         deleteCount} </code>
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If validation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human
     *             readable message and message type.
     */
    BatchResponse findParticipantGroupsByAccNumbers(
                ParticipantDeleteRequest pParticipantDeleteRequest) throws LMSException;

    /**
     * verifies if the participant group information exist for the given participant.
     * <p>
     * 
     * verifies if the participant group information exist for the given participant. <br>
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
     * 
     * @param pOId
     *            <code>holds the OId of the participant for which the participant 
     *            group is to be verified </code>
     *            .
     *            <p>
     * @throws LMSException
     *             If validation fails the above mentioned error codes are returned. 
     *             Each CodeMessage contains
     *             the status code,human readable message and message type.
     */

    void verifyParticipantGroupForParticipant(Long pOId) throws LMSException;

    /**
     * Retrieves participant information that are associated with a
     * participant group numbers.
     * <p>
     * Retrieves all participant information that are associated with a participant group numbers.The actor
     * provides participant group number as input.When input are provided,participant account group will be
     * taken as input.System validates existence of account number and returns the participant associated with
     * the account number. <br>
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
     * 
     * 
     * @param pBillingGroupDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.parts.dto.BillingGroupDeleteRequest
     *            BillingGroupDeleteRequest}</code><br>
     *            holds the attributes to find the <code>Participant</code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.pBillingGroupDeleteRequest#setEndDate
     *            endDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.pBillingGroupDeleteRequest#setGroupNumber
     *            groupNumber} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.pBillingGroupDeleteRequest#setGroupNumber
     *            version} - (C)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse#getCreateCount()
     *         createCount} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse#getUpdateCount()
     *         updateCount} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse#getDeleteCount()
     *         deleteCount} </code>
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If validation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human
     *             readable message and message type.
     */
    BatchResponse findParticipantByGroupNumbers(
                BillingGroupDeleteRequest pBillingGroupDeleteRequest) throws LMSException;

    /**
     * permanently deletes the participant group information if there are no Contract,SpotRates,Participant
     * associated with a
     * participant group numbers.
     * <p>
     * permanently deletes the participant group information if there are no Contract,SpotRates,Participant
     * associated with a participant group number. <br>
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
     * 
     * @param pRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     *            holds the attributes to purge the <code>Participant group</code>.
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse#getCreateCount()
     *         createCount} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse#getUpdateCount()
     *         updateCount} </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse#getDeleteCount()
     *         deleteCount} </code>
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If validation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human
     *             readable message and message type.
     */
    BatchResponse purgeParticipantGroup(final BatchRequest pRequest) throws LMSException;
   
    /**
     * This method checks whether the given group number is present in database or not.
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
     * 
     * @param pGroupNumber
     * @throws LMSException
     *             If validation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human
     *             readable message and message type.
     */
    void validateParticipantGroupNumber (final String pGroupNumber)throws LMSException;
    
    
    BillingGroupResponse findParticipantBillingGroupByGroupNumber(
            BillingGroupFindRequest pBillingGroupFindRequest)
            throws LMSException;
    
    public List<BillingGroupDto> findParticipantGroupsForParticipant(ParticipantDetailDto pParticipantDetailDto)throws LMSException;
    
    public String findParticipantWithBillingAccountNumber(String partBillingAccountNumber) throws LMSException; 
    
    public String findParticipantAccountNumber(String iataAccountNumber) throws LMSException; 

}
