/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.parts.dto.PartcipantHistoryFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantHistoryPersistRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantHistoryResponse;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse;

/**
 * <code>ParticipantHistoryService</code> interface exposes the APIs which identifies various processing flows
 * involved
 * in maintaining Participant History information.
 * <p>
 * This includes the following operations:
 * <ul>
 * <li>createHistory
 * <li>findHistory
 * </ul>
 * <p>
 * The system maintains the history of static data that are frequently used. History is recorded whenever
 * there is creation, modification or deletion of these static data. <br>
 * <p>
 * 
 * 
 */

public interface ParticipantHistoryService {
    /**
     * Finds the <code>Participant</code>.<br>
     * <p>
     * <b> Related methods include:</b><br>
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findAWBParticipant
     * findAWBParticipant}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findParticipantsByMessageProfileNames
     * findParticipantsByMessageProfileNames}
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#reactivateParticipant
     * reactivateParticipant}
     * <p>
     * Retrieves the participant information based on the following search criteria:
     * <p>
     * <li><b> Account Number Search</b><br>
     * <p>
     * <ul>
     * <li>By Billing Account Number<br>
     * System Searches the participant details using billing account number.if any match found the details are
     * displayed.
     * <li>By IATA Account Number<br>
     * System Searches the participant details using IATA account number.if any match found the details are
     * displayed.
     * </ul>
     * <p>
     * <li><b> Name Search</b>
     * <ul>
     * <p>
     * <li><b>Full Name</b><br>
     * System Searches the participant details using participant full name.if any match found the details are
     * displayed.otherwise a list of participant details are displayed. See match types to know the details.
     * <p>
     * <li><b>Alias Name</b><br>
     * System Searches the participant details using participant alias.if any match found the details are
     * displayed.otherwise a list of participant details are displayed. See match types to know the details.
     * <p>
     * <li><b>One Time Participant</b><br>
     * System Searches the participant details using one time participant.if any match found the details are
     * displayed.otherwise a list of participant details are displayed. See match types to know the details.
     * <p>
     * <li><b>Full Name,Alias Name,One Time Participant</b><br>
     * System Searches the participant details using combination of Full Name,Alias Name and One Time
     * Participant.if any match found the details are displayed.otherwise a list of participant details are
     * displayed.See match types to know the details.
     * </ul>
     * <p>
     * <li><b>Comma Separated Search</b><br>
     * System searches the participant details using special character comma ,based on the following search
     * criteria .<br>
     * <br>
     * <ul>
     * <li>If input name ‘Unisys,’ and station ‘JFK’, is given ,system returns all participants starting with
     * ‘Unisys’ in JFK station (e.g. Unisys, Unisys Corp, Unisys Airline Operations etc) whereas the same
     * input without comma do not return selection display list.<br>
     * <li>If the input name ‘U,A,O’ and station ‘MSP’ is given , the system returns the participant ‘Unisys
     * Airline Operations’, if there is only one participant.If more than one participant exists in the
     * system, it returns the selection display say United Airline Operation, Union Airways Office, Unix And
     * Oracle, etc.<br>
     * <li>If system is not able to find matching participant names starting with U,A and O in MSP station it
     * returns a selection list starting with participant say Union Air Transport in MSP station followed by
     * all participant in MSP station in alphabetical order.
     * </ul>
     * <p>
     * <b> Match Type</b>
     * <ul>
     * <li><b>Exact Match</b><br>
     * If the input details matches exactly with the available participants in the system. the specific
     * participants details returns.
     * <p>
     * <li><b>Duplicate Match</b><br>
     * If the input details matches with the more than one available participants in the system. the list of
     * participants detail returns.
     * <p>
     * <li><b>Decrement Retrieval if no values present in the System</b><br>
     * If the input details does not matches with any available participants in the system. then this match is
     * carried out by taking the input string alone and the search is carried out recursively by reducing the
     * character present at the end till the length becomes zero.
     * </ul>
     * <p>
     * <li><b>The system performs the following filter processing:</b>
     * <ul>
     * The system filters the participant depending upon the type search criteria.
     * <li>The system returns one-time participants depending upon the parameter
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ONE_TIME_PARTICIPANT_INDICATOR}</code>
     * <li>If the participant role provided by the user is ‘Shipper’ or ‘Consignee’ and the participant has
     * the No Shipment attribute of ‘Cannot be a shipper or consignee’, the participant is not returned on
     * selection list. This rule is enabled/disabled by the parameter
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SECURITY_INFORMATION}</code>.
     * <li>If the participant attribute has security status information, the system returns the participant
     * type of ‘C’ on the participant selection list to denote that participant’s security status information
     * need to be analyzed before capturing the participant.This rule is enabled/disabled by the parameter.
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SECURITY_INFORMATION}</code>.
     * <li>The system returns the deleted participant depending upon the parameter
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DISPLAY_DELETED_PARTICIPANT_INDICATOR}</code>.
     * <li>If the participant is an “Alias”, the system returns the participant type as “A” in the selection
     * list indicating that this participant is an alias.
     * <li>The system returns unique key for each participant, which enables the system to retrieve the
     * participant information using the unique key , when a participant is selected from the selection list
     * by the user. For an alias participant the unique key returned is the unique key of the participant that
     * this is an alias for. The full name of the participant that this is an alias for is returned in the
     * address field.
     * </ul>
     * <p>
     * Performs the search in the following sequence. <br>
     * <p>
     * <li>If <code>accountNumber</code> is given, then the system finds the <code>Participant</code> details
     * by <code>accountNumber.</code><br>
     * <li>If <code>name</code> is given, then it finds the <code>Participant</code> details by
     * <code>name and station.</code><br>
     * <li>If both <code>name</code> and <code>accountNumber</code> is given, then the system finds the
     * <code>Participant</code> details by <code>accountNumber</code>.<br>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     *        <b>Errors: </b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_BILLING_ACCOUNT_NUMBER_NOT_EXIST}
     *        </code></td> <td align="left">The billing account number does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_IATA_ACCOUNT_NUMBER_NOT_EXIST}
     *        </code></td> <td align="left"> The IATA account number does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTS_STATION_INVALID_CODE}
     *        </code></td> <td align="left"> The station code of participant in the request does not exist in
     *        the system.</td>
     *        </tr>
     *        </table>
     * @param pParticipantFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
     *            ParticipantFindRequest}</code><br>
     *            Holds the attributes to find the <code>Participant</code>.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAccountNumber
     *            accountNumber} - (C)</code><br>
     *            Account number is mandatory if participant name is not given.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setName
     *            name} - (C)</code><br>
     *            Participant name is mandatory if account number is not given.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantAccountType
     *            participantAccountType} - (C)</code><br>
     *            Account number type is mandatory when user wants to search the participant using participant
     *            account number.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNameTypeCode
     *            nameTypeCode} - (C)</code><br>
     *            Participant type is mandatory when user wants to search the participant using participant
     *            name. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStation station }
     *            - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAddress
     *            address} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCity
     *            city } - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountry
     *            country} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDisplayCount
     *            displayCount} - (C)</code><br>
     *            System sets display count as zero during the first retrieval of participant. In the
     *            subsequent retrieval, the value of display count will be set from the last response. <li>
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFetchedCount
     *            fetchedCount} - (C)</code><br>
     *            System sets the fetched count as zero during the first retrieval of the participant. In the
     *            subsequent retrieval, the value of the fetched count will be set from the last response. 
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNextIndicator
     *            nextIndicator} - (C)</code><br>
     *            Next indicator determine whether to move to next page or previous page. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNoShipmentsIndicator
     *            noShipmentsIndicator} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setOId oId}
     *            - (C)</code><br>
     *            System uses object id attribute to retrieve the participant details. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPageSize pageSize}
     *            - (C)</code><br>
     *            Page size specifies the number of participants to be displayed in the page. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPostalCode
     *            postalCode} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString
     *            searchString} - (C)</code><br>
     *            System uses the search string to search the participant. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setTotalCount
     *            totalCount} - (C)</code><br>
     *            System sets the total count as zero during the first retrieval. In the subsequent retrieval,
     *            the value of the total count will be set from the last response. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSelectionListDisplayIndicator
     *            selectionListDisplayIndicator} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStartIndex
     *            startIndex} - (C)</code><br>
     *            System sets the start index as zero during the first retrieval. In the subsequent retrieval,
     *            the value of the start index will be set from the last response. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setState state} - (O)
     *            </code><br>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}
     *         </code><br>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse ResponseFields}
     *         </code><br>
     *         <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto
     *         ParticipantSearchDto} - (0:*)</code><br>
     *         <ul>
     *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto
     *         ParticipantSearchDto}</code>
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    ParticipantResponse processParticipant(ParticipantFindRequest pParticipantFindRequest) throws LMSException;

    void createParticipantInformationHistory(
                final ParticipantHistoryPersistRequest pParticipantHistoryPersistRequest) throws LMSException;
    
    void persistsParticipantInformationHistory(
                final ParticipantHistoryPersistRequest pParticipantHistoryPersistRequest) throws LMSException;

    ParticipantHistoryResponse findParticipantByLmsDatabaseKey(
                final ParticipantFindRequest pParticipantFindRequest) throws LMSException;

    ParticipantHistoryResponse processHistoryParticipant(PartcipantHistoryFindRequest aRequest) throws LMSException;
    
    long findTotalRecordsCount(String pLmsDbKey);

}
