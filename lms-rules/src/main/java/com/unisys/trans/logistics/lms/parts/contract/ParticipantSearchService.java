/**
 *
 */
package com.unisys.trans.logistics.lms.parts.contract;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.unisys.trans.logistics.lms.framework.dto.SuggestiveSearchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantMultipleFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantSuggestiveSearchRequest;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantRoleType;

/**
 * <code>ParticipantSearchService</code> provides find services for maintaining
 * participant information.
 * <p>
 * This class implements the methods provided by <code>ParticipantService</code>
 * interface.<br>
 * This class performs the following functions:
 * <ul>
 * <li>Finds the grouped participants
 * <li>Finds the participant by account number
 * <li>Finds the participant by alias name
 * <li>Finds the participant by alias name comma-separated value
 * <li>Finds the participant by grouped search
 * <li>Finds the participant by primary key
 * <li>Finds the participant by name and station
 * <li>Finds the participant by name and station for comma-separated value
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
 * @see com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto
 * @see com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse
 */
@Path("participantSearchService")
public interface ParticipantSearchService {

	/**
	 * Finds the AWB <code>Participant</code>.
	 * <p>
	 * <b> Related methods include:</b><br>
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findParticipant
	 * findParticipant}<br>
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findParticipantsByMessageProfileNames
	 * findParticipantsByMessageProfileNames}<br>
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#retrieveParticipantByAccountNumber
	 * retrieveParticipantByAccountNumber}
	 * <p>
	 * Retrieves the participant information based on the following search
	 * criteria:
	 * <p>
	 * <li><b> Account Number Search</b><br>
	 * <p>
	 * <ul>
	 * <li>By Billing Account Number<br>
	 * System Searches the participant details using billing account number.if
	 * any match found the details are displayed.
	 * <li>By IATA Account Number<br>
	 * System Searches the participant details using IATA account number.if any
	 * match found the details are displayed.
	 * </ul>
	 * <p>
	 * <li><b> Name Search</b>
	 * <ul>
	 * <p>
	 * <li><b>Full Name</b><br>
	 * System Searches the participant details using participant full name.if
	 * any match found the details are displayed.otherwise a list of participant
	 * details are displayed. See match types to know the details.
	 * <p>
	 * <li><b>Alias Name</b><br>
	 * System Searches the participant details using participant alias.if any
	 * match found the details are displayed.otherwise a list of participant
	 * details are displayed. See match types to know the details.
	 * <p>
	 * <li><b>One Time Participant</b><br>
	 * System Searches the participant details using one time participant.if any
	 * match found the details are displayed.otherwise a list of participant
	 * details are displayed. See match types to know the details.
	 * <p>
	 * <li><b>Full Name,Alias Name,One Time Participant</b><br>
	 * System Searches the participant details using combination of Full
	 * Name,Alias Name and One Time Participant.if any match found the details
	 * are displayed.otherwise a list of participant details are displayed.See
	 * match types to know the details.
	 * </ul>
	 * <p>
	 * <li><b>Comma Separated Search</b><br>
	 * System searches the participant details using special character comma
	 * ,based on the following search criteria .<br>
	 * <br>
	 * <ul>
	 * <li>If input name ‘Unisys,’ and station ‘JFK’, is given ,system returns
	 * all participants starting with ‘Unisys’ in JFK station (e.g. Unisys,
	 * Unisys Corp, Unisys Airline Operations etc) whereas the same input
	 * without comma do not return selection display list.<br>
	 * <li>If the input name ‘U,A,O’ and station ‘MSP’ is given , the system
	 * returns the participant ‘Unisys Airline Operations’, if there is only one
	 * participant.If more than one participant exists in the system, it returns
	 * the selection display say United Airline Operation, Union Airways Office,
	 * Unix And Oracle, etc.<br>
	 * <li>If system is not able to find matching participant names starting
	 * with U,A and O in MSP station it returns a selection list starting with
	 * participant say Union Air Transport in MSP station followed by all
	 * participant in MSP station in alphabetical order.
	 * </ul>
	 * <p>
	 * <b> Match Type</b>
	 * <ul>
	 * <li><b>Exact Match</b><br>
	 * If the input details matches exactly with the available participants in
	 * the system. the specific participants details returns.
	 * <p>
	 * <li><b>Duplicate Match</b><br>
	 * If the input details matches with the more than one available
	 * participants in the system. the list of participants detail returns.
	 * <p>
	 * <li><b>Decrement Retrieval if no values present in the System</b><br>
	 * If the input details does not matches with any available participants in
	 * the system. then this match is carried out by taking the input string
	 * alone and the search is carried out recursively by reducing the character
	 * present at the end till the length becomes zero.
	 * </ul>
	 * <p>
	 * <li><b>The system performs the following filter processing:</b>
	 * <ul>
	 * The system filters the participant depending upon the type search
	 * criteria.
	 * <li>The system returns one-time participants depending upon the parameter
	 * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ONE_TIME_PARTICIPANT_INDICATOR}</code>
	 * <li>If the participant role provided by the user is Shipper or Consignee
	 * and the participant has the No Shipment attribute of ‘Cannot be a shipper
	 * or consignee , the participant is not returned on selection list. This
	 * rule is enabled/disabled by the parameter
	 * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SECURITY_INFORMATION}</code>.
	 * <li>If the participant attribute has security status information, the
	 * system returns the participant type of ‘C’ on the participant selection
	 * list to denote that participant’s security status information need to be
	 * analyzed before capturing the participant.This rule is enabled/disabled
	 * by the parameter.
	 * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SECURITY_INFORMATION}</code>.
	 * <li>The system returns the deleted participant depending upon the
	 * parameter
	 * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DISPLAY_DELETED_PARTICIPANT_INDICATOR}</code>.
	 * <li>If the participant is an “Alias”, the system returns the participant
	 * type as “A” in the selection list indicating that this participant is an
	 * alias.
	 * <li>The system returns unique key for each participant, which enables the
	 * system to retrieve the participant information using the unique key ,
	 * when a participant is selected from the selection list by the user. For
	 * an alias participant the unique key returned is the unique key of the
	 * participant that this is an alias for. The full name of the participant
	 * that this is an alias for is returned in the address field.
	 * </ul>
	 * <p>
	 * Performs the search in the following sequence. <br>
	 * <p>
	 * <li>If <code>accountNumber</code> is given, then the system finds the
	 * <code>Participant</code> details by <code>accountNumber.</code><br>
	 * <li>If <code>name</code> is given, then it finds the
	 * <code>Participant</code> details by <code>name and station.</code><br>
	 * <li>If both <code>name</code> and <code>accountNumber</code> is given,
	 * then the system finds the <code>Participant</code> details by
	 * <code>accountNumber</code>.
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
	 *        </code></td> <td align="left">The billing account number does not
	 *        exist in the system.</td>
	 *        </tr>
	 *        <tr>
	 *        <td align="left"><code>
	 *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_IATA_ACCOUNT_NUMBER_NOT_EXIST}
	 *        </code></td> <td align="left"> The IATA account number does not
	 *        exist in the system.</td>
	 *        </tr>
	 *        <tr>
	 *        <td align="left"><code>
	 *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTS_STATION_INVALID_CODE}
	 *        </code></td> <td align="left"> The station code of participant in
	 *        the request does not exist in the system.</td>
	 *        </tr>
	 *        </table>
	 * @param pParticipantFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code><br>
	 *            Holds the attributes to find the <code>Participant</code>.<br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAccountNumber
	 *            accountNumber} - (C)</code><br>
	 *            Account number is mandatory if participant name is not given.<br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setName
	 *            name} - (C)</code><br>
	 *            Participant name is mandatory if account number is not given.<br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantAccountType
	 *            participantAccountType} - (C)</code><br>
	 *            Account number type is mandatory when user wants to search the
	 *            participant using participant account number.<br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNameTypeCode
	 *            nameTypeCode} - (C)</code><br>
	 *            Participant type is mandatory when user wants to search the
	 *            participant using participant name. <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStation
	 *            station } - (O)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAddress
	 *            address} - (O)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCity
	 *            city } - (O)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountry
	 *            country} - (O)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDisplayCount
	 *            displayCount} - (C)</code><br>
	 *            System sets display count as zero during the first retrieval
	 *            of participant. In the subsequent retrieval, the value of
	 *            display count will be set from the last response. <li> <code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFetchedCount
	 *            fetchedCount} - (C)</code><br>
	 *            System sets the fetched count as zero during the first
	 *            retrieval of the participant. In the subsequent retrieval, the
	 *            value of the fetched count will be set from the last response.
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNextIndicator
	 *            nextIndicator} - (C)</code><br>
	 *            Next indicator determine whether to move to next page or
	 *            previous page. <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNoShipmentsIndicator
	 *            noShipmentsIndicator} - (O)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setOId
	 *            oId} - (C)</code><br>
	 *            System uses object id attribute to retrieve the participant
	 *            details. <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPageSize
	 *            pageSize} - (C)</code><br>
	 *            Page size specifies the number of participants to be displayed
	 *            in the page. <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPostalCode
	 *            postalCode} - (O)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString
	 *            searchString} - (C)</code><br>
	 *            System uses the search string to search the participant. <li>
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setTotalCount
	 *            totalCount} - (C)</code><br>
	 *            System sets the total count as zero during the first
	 *            retrieval. In the subsequent retrieval, the value of the total
	 *            count will be set from the last response. <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSelectionListDisplayIndicator
	 *            selectionListDisplayIndicator} - (O)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStartIndex
	 *            startIndex} - (C)</code><br>
	 *            System sets the start index as zero during the first
	 *            retrieval. In the subsequent retrieval, the value of the start
	 *            index will be set from the last response. <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setState
	 *            state} - (O) </code><br>
	 *            </ul>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse
	 *         ParticipantResponse} </code><br>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         ResponseFields} <li>
	 *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto
	 *         participant} <li>
	 *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse#getParticipantSearch
	 *         participantSearch} (0:*)</code>
	 *         <ul>
	 *         <li>
	 *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto
	 *         ParticipantSearchDto}
	 *         </ul>
	 *         </ul>
	 *         <p>
	 * @throws LMSException
	 *             If validation fails the above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code,human
	 *             readable message and message type.
	 */
	ParticipantResponse findAWBParticipant(
			final ParticipantFindRequest pParticipantFindRequest)
			throws LMSException;

	/**
	 * Finds participants having the same name and station values.
	 * <p>
	 * 
	 * @param pParticipantFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code><br>
	 *            Holds the attributes to find the <code>Participant</code>.<br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code></li>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAccountNumber
	 *            accountNumber} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantAccountType
	 *            participantAccountType} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAddress
	 *            address} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCity
	 *            city} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountCompleted
	 *            countCompleted} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountry
	 *            country} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDbCount
	 *            dbCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDisplayCount
	 *            displayCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFetchedCount
	 *            fetchedCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFreightUldIndicator
	 *            freightUldIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setName
	 *            name} - (C) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNameTypeCode
	 *            nameTypeCode} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNextIndicator
	 *            nextIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNoShipmentsIndicator
	 *            noShipmentsIndicator} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setOId
	 *            oId} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPageSize
	 *            pageSize} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantRole
	 *            participantRole} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantType
	 *            participantType} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPostalCode
	 *            postalCode} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString
	 *            searchString} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSelectionListDisplayIndicator
	 *            selectionListDisplayIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStartIndex
	 *            startIndex} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setState
	 *            state} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStation
	 *            station} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setTotalCount
	 *            totalCount} - (O)</code></li>
	 *            </ul>
	 *            </ul>
	 *            </p>
	 * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}</code>
	 * <br>
	 *         holds the <code>Participant</code> details.<br>
	 *         <ul>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto}</code>
	 *         </li>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto ParticipantSearchDto}-(1,*)</code>
	 *         </li>
	 *         </ul>
	 * @throws LMSException
	 *             If the participant details do not exist.
	 */
	ParticipantResponse findGroupedParticipants(
			final ParticipantFindRequest pParticipantFindRequest)
			throws LMSException;

	/**
	 * Finds participant based on the account number.
	 * <p>
	 * 
	 * @param pParticipantFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code><br>
	 *            Holds the attributes to find the <code>Participant</code>.<br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code></li>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAccountNumber
	 *            accountNumber} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantAccountType
	 *            participantAccountType} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAddress
	 *            address} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCity
	 *            city} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountCompleted
	 *            countCompleted} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountry
	 *            country} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDbCount
	 *            dbCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDisplayCount
	 *            displayCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFetchedCount
	 *            fetchedCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFreightUldIndicator
	 *            freightUldIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setName
	 *            name} - (C) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNameTypeCode
	 *            nameTypeCode} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNextIndicator
	 *            nextIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNoShipmentsIndicator
	 *            noShipmentsIndicator} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setOId
	 *            oId} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPageSize
	 *            pageSize} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantRole
	 *            participantRole} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantType
	 *            participantType} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPostalCode
	 *            postalCode} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString
	 *            searchString} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSelectionListDisplayIndicator
	 *            selectionListDisplayIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStartIndex
	 *            startIndex} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setState
	 *            state} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStation
	 *            station} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setTotalCount
	 *            totalCount} - (O)</code></li>
	 *            </ul>
	 *            </ul>
	 *            </p>
	 * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}</code>
	 * <br>
	 *         holds the <code>Participant</code> details.<br>
	 *         <ul>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto}</code>
	 *         </li>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto ParticipantSearchDto}-(1,*)</code>
	 *         </li>
	 *         </ul>
	 * @throws LMSException
	 *             If the participant details do not exist.
	 */
	ParticipantResponse findParticipantByAccountNumber(
			final ParticipantFindRequest pParticipantFindRequest)
			throws LMSException;

	/**
	 * Finds participants by search string including alias name of participants.
	 * <p>
	 * <p>
	 * On first invocation, this method looks for the exact match of the alias
	 * name which is give as input. If found, the participant is returned else,
	 * a list of participants retrieved and populated in the selection display
	 * screen. On a subsequent invocation list population logic is executed and
	 * the list gets generated.
	 * </p>
	 * <p>
	 * <b>On First Call:</b><br>
	 * The first call on this method is to find out if any exact match exists in
	 * the DB for the given input. If found, the participant is returned else, a
	 * list of participants is populated.
	 * <p>
	 * <b>On Subsequent Call:</b><br>
	 * It always generates a list of participants and returns it to the
	 * selection display screen.<br>
	 * <br>
	 * The participant selection display screen generation is carried out under
	 * any one of the following two cases:
	 * <ul>
	 * CASE 1: If NEXT button is triggered.
	 * </ul>
	 * <ul>
	 * <p>
	 * This retrieves next set of participants from the DB. The next set may
	 * contain the participants list that is equal to the requested page size or
	 * less than the requested page size, if no more values are present in the
	 * DB. This process of batch-by-batch retrieval is achieved by a concept
	 * called as Paging.
	 * <p>
	 * Once a batch of participants is retrieved they are checked for
	 * duplicates. We call a partiicpant as a duplicate participant if both the
	 * participant name and the station are the same.
	 * <p>
	 * Once the duplicate participants are grouped the list of participants
	 * present might be less than the requested page size. In this case a method
	 * is called recursively and the above said procedures are followed until
	 * the requested page size is reached or the end record in the DB is reached
	 * whichever is earlier.<br>
	 * <p>
	 * This button appears disabled if there is no more records in the DB.
	 * </ul>
	 * <ul>
	 * CASE 2: If PREVIOUS button is triggered.
	 * </ul>
	 * <ul>
	 * <p>
	 * This retrieves previous set of participants from the DB.The previous set
	 * may contain the participants list that is equal to the requested page
	 * size. This process of batch-by-batch retrieval is achieved by a concept
	 * called as Paging.
	 * <p>
	 * Once a batch of participants is retrieved they are checked for
	 * duplicates. We call a participant as a 'duplicate' participant if both
	 * the participant name and the station are the same.
	 * <p>
	 * Once the duplicate participants are grouped, the list of participants
	 * present might be less than the requested page size. In this case a method
	 * is called recursively and the above said procedures are followed until
	 * the requested page size is reached.<br>
	 * <p>
	 * This button appears disabled in the first page of the selection display
	 * screen.
	 * </p>
	 * </ul>
	 * <p>
	 * </p>
	 * </p>
	 * 
	 * @param pParticipantFindRequest
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest ParticipantFindRequest}</code>
	 * <br>
	 *            Holds the attributes to find the <code>Participant</code>.<br>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest ParticipantFindRequest}</code>
	 *            </li>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAccountNumber  accountNumber} - (C)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantAccountType  participantAccountType} - (C)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAddress  address} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCity  city} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountCompleted  countCompleted} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountry  country} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDbCount  dbCount} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDisplayCount  displayCount} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFetchedCount fetchedCount} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFreightUldIndicator  freightUldIndicator} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setName  name} - (C)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNameTypeCode  nameTypeCode} - (C)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNextIndicator  nextIndicator} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNoShipmentsIndicator  noShipmentsIndicator} - (C)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setOId  oId} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPageSize  pageSize} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantRole  participantRole} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantType  participantType} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPostalCode  postalCode} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString  searchString} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSelectionListDisplayIndicator  selectionListDisplayIndicator} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStartIndex  startIndex} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setState  state} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStation  station} - (O)</code>
	 *            </li>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setTotalCount  totalCount} - (O)</code>
	 *            </li>
	 *            </ul>
	 *            </ul> </p>
	 * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}</code>
	 * <br>
	 *         holds the <code>Participant</code> details.<br>
	 *         <ul>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto}</code>
	 *         </li>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto ParticipantSearchDto}-(1,*)</code>
	 *         </li>
	 *         </ul>
	 * @throws LMSException
	 *             If the participant details do not exist.
	 */
	ParticipantResponse findParticipantByAliasName(
			final ParticipantFindRequest pParticipantFindRequest)
			throws LMSException;

	/**
	 * Finds participants by search string that has comma including alias name
	 * of participants.
	 * <p>
	 * 
	 * @param pParticipantFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code><br>
	 *            Holds the attributes to find the <code>Participant</code>.<br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code></li>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAccountNumber
	 *            accountNumber} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantAccountType
	 *            participantAccountType} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAddress
	 *            address} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCity
	 *            city} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountCompleted
	 *            countCompleted} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountry
	 *            country} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDbCount
	 *            dbCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDisplayCount
	 *            displayCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFetchedCount
	 *            fetchedCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFreightUldIndicator
	 *            freightUldIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setName
	 *            name} - (C) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNameTypeCode
	 *            nameTypeCode} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNextIndicator
	 *            nextIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNoShipmentsIndicator
	 *            noShipmentsIndicator} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setOId
	 *            oId} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPageSize
	 *            pageSize} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantRole
	 *            participantRole} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantType
	 *            participantType} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPostalCode
	 *            postalCode} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString
	 *            searchString} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSelectionListDisplayIndicator
	 *            selectionListDisplayIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStartIndex
	 *            startIndex} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setState
	 *            state} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStation
	 *            station} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setTotalCount
	 *            totalCount} - (O)</code></li>
	 *            </ul>
	 *            </ul>
	 *            </p>
	 * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}</code>
	 * <br>
	 *         The <code>Participant</code> details.<br>
	 *         <ul>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto}</code>
	 *         </li>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto ParticipantSearchDto}-(1,*)</code>
	 *         </li>
	 *         </ul>
	 * @throws LMSException
	 *             If the participant details do not exist.
	 */
	ParticipantResponse findParticipantByAliasNameCSV(
			final ParticipantFindRequest pParticipantFindRequest)
			throws LMSException;

	/**
	 * Finds participants by doing all possible searches.
	 * <p>
	 * 
	 * @param pParticipantFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code><br>
	 *            Holds the attributes to find the <code>Participant</code>.<br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code></li>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAccountNumber
	 *            accountNumber} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantAccountType
	 *            participantAccountType} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAddress
	 *            address} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCity
	 *            city} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountCompleted
	 *            countCompleted} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountry
	 *            country} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDbCount
	 *            dbCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDisplayCount
	 *            displayCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFetchedCount
	 *            fetchedCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFreightUldIndicator
	 *            freightUldIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setName
	 *            name} - (C) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNameTypeCode
	 *            nameTypeCode} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNextIndicator
	 *            nextIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNoShipmentsIndicator
	 *            noShipmentsIndicator} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setOId
	 *            oId} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPageSize
	 *            pageSize} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantRole
	 *            participantRole} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantType
	 *            participantType} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPostalCode
	 *            postalCode} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString
	 *            searchString} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSelectionListDisplayIndicator
	 *            selectionListDisplayIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStartIndex
	 *            startIndex} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setState
	 *            state} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStation
	 *            station} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setTotalCount
	 *            totalCount} - (O)</code></li>
	 *            </ul>
	 *            </ul>
	 *            </p>
	 * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}</code>
	 * <br>
	 *         The <code>Participant</code> details.<br>
	 *         <ul>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto}</code>
	 *         </li>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto ParticipantSearchDto}-(1,*)</code>
	 *         </li>
	 *         </ul>
	 * @throws LMSException
	 *             If the participant details do not exist.
	 */
	ParticipantResponse findParticipantByGroupedSearch(
			final ParticipantFindRequest pParticipantFindRequest)
			throws LMSException;

	/**
	 * Finds a participant by OID.
	 * <p>
	 * 
	 * @param pParticipantFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code><br>
	 *            Holds the attributes to find the <code>Participant</code>.<br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code></li>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAccountNumber
	 *            accountNumber} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantAccountType
	 *            participantAccountType} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAddress
	 *            address} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCity
	 *            city} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountCompleted
	 *            countCompleted} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountry
	 *            country} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDbCount
	 *            dbCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDisplayCount
	 *            displayCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFetchedCount
	 *            fetchedCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFreightUldIndicator
	 *            freightUldIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setName
	 *            name} - (C) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNameTypeCode
	 *            nameTypeCode} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNextIndicator
	 *            nextIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNoShipmentsIndicator
	 *            noShipmentsIndicator} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setOId
	 *            oId} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPageSize
	 *            pageSize} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantRole
	 *            participantRole} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantType
	 *            participantType} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPostalCode
	 *            postalCode} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString
	 *            searchString} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSelectionListDisplayIndicator
	 *            selectionListDisplayIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStartIndex
	 *            startIndex} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setState
	 *            state} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStation
	 *            station} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setTotalCount
	 *            totalCount} - (O)</code></li>
	 *            </ul>
	 *            </ul>
	 *            </p>
	 * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}</code>
	 * <br>
	 *         The <code>Participant</code> details.<br>
	 *         <ul>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto}</code>
	 *         </li>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto ParticipantSearchDto}-(1,*)</code>
	 *         </li>
	 *         </ul>
	 * @throws LMSException
	 *             If the participant details do not exist.
	 */
	ParticipantResponse findParticipantByPrimaryKey(
			final ParticipantFindRequest pParticipantFindRequest)
			throws LMSException;

	/**
	 * Finds participants by doing all possible searches for specified
	 * participant role.
	 * <p>
	 * 
	 * @param pParticipantMultipleFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantMultipleFindRequest
	 *            ParticipantMultipleFindRequest}</code><br>
	 *            Holds the attributes to find the <code>Participant</code>.<br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantMultipleFindRequest
	 *            ParticipantMultipleFindRequest}</code></li>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantMultipleFindRequest#setParticipantSearchDtos
	 *            pParticipantSearchDtos} - (M)</code></li>
	 *            </ul>
	 *            </ul>
	 *            </p>
	 * @return <code>Map</code><br>
	 *         <p>
	 *         Returns the map of participant details in which the
	 *         <code>ParticipantRoleType</code> is the key and the
	 *         <code>ParticipantResponse</code> is the value.<br>
	 * @throws LMSException
	 *             If the participant details do not exist.
	 */
	Map<ParticipantRoleType, ParticipantResponse> findParticipantByRole(
			ParticipantMultipleFindRequest pParticipantMultipleFindRequest)
			throws LMSException;

	/**
	 * Find participants by doing all possible searches.
	 * <p>
	 * 
	 * @param pParticipantFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code><br>
	 *            Holds the attributes to find the <code>Participant</code>.<br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code></li>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAccountNumber
	 *            accountNumber} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantAccountType
	 *            participantAccountType} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAddress
	 *            address} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCity
	 *            city} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountCompleted
	 *            countCompleted} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountry
	 *            country} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDbCount  }
	 *            - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDisplayCount
	 *            displayCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFetchedCount
	 *            fetchedCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFreightUldIndicator
	 *            freightUldIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setName
	 *            name} - (C) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNameTypeCode
	 *            nameTypeCode} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNextIndicator
	 *            nextIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNoShipmentsIndicator
	 *            noShipmentsIndicator} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setOId
	 *            oId} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPageSize
	 *            pageSize} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantRole
	 *            participantRole} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantType
	 *            participantType} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPostalCode
	 *            postalCode} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString
	 *            searchString} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSelectionListDisplayIndicator
	 *            selectionListDisplayIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStartIndex
	 *            startIndex} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setState
	 *            state} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStation
	 *            station} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setTotalCount
	 *            totalCount} - (O)</code></li>
	 *            </ul>
	 *            </ul>
	 *            </p>
	 * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}</code>
	 * <br>
	 *         Returns the <code>Participant</code> details.<br>
	 *         <ul>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto}</code>
	 *         </li>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto ParticipantSearchDto}-(1,*)</code>
	 *         </li>
	 *         </ul>
	 * @throws LMSException
	 *             If the participant details does not exist.
	 */
	ParticipantResponse findParticipantsByNameAndStation(
			final ParticipantFindRequest pParticipantFindRequest)
			throws LMSException;

	/**
	 * Finds participants by name and station for comma separated value as
	 * search string.
	 * <p>
	 * 
	 * @param pParticipantFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code><br>
	 *            Holds the attributes to find the <code>Participant</code>.<br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code></li>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAccountNumber
	 *            accountNumber} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantAccountType
	 *            participantAccountType} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAddress
	 *            address} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCity
	 *            city} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountCompleted
	 *            countCompleted} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountry
	 *            country} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDisplayCount
	 *            displayCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFetchedCount
	 *            fetchedCount} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFreightUldIndicator
	 *            freightUldIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setName
	 *            name} - (C) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNameTypeCode
	 *            nameTypeCode} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNextIndicator
	 *            nextIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNoShipmentsIndicator
	 *            noShipmentsIndicator} - (C)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setOId
	 *            oId} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPageSize
	 *            pageSize} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantRole
	 *            participantRole} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantType
	 *            participantType} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPostalCode
	 *            postalCode} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString
	 *            searchString} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSelectionListDisplayIndicator
	 *            selectionListDisplayIndicator} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStartIndex
	 *            startIndex} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setState
	 *            state} - (O) </code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStation
	 *            station} - (O)</code></li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setTotalCount
	 *            totalCount} - (O)</code></li>
	 *            </ul>
	 *            </ul>
	 *            </p>
	 * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}</code>
	 * <br>
	 *         Returns the <code>Participant</code> details.<br>
	 *         <ul>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto}</code>
	 *         </li>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto ParticipantSearchDto}-(1,*)</code>
	 *         </li>
	 *         </ul>
	 * @throws LMSException
	 *             If the participant details do not exist.
	 */
	ParticipantResponse findParticipantsByNameAndStationForCSV(
			final ParticipantFindRequest pParticipantFindRequest)
			throws LMSException;

	/**
	 * This method finds participant by database unique key.
	 * <p>
	 * 
	 * @param pParticipantFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code><br>
	 *            Holds the attributes to find the <code>Participant</code>.<br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
	 *            ParticipantFindRequest}</code></li>
	 *            <ul>
	 *            </ul>
	 *            </ul>
	 *            </p>
	 * @return <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}</code>
	 * <br>
	 *         Returns the <code>Participant</code> details.<br>
	 *         <ul>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto}</code>
	 *         </li>
	 *         <li>
	 *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto ParticipantSearchDto}-(1,*)</code>
	 *         </li>
	 *         </ul>
	 * @throws LMSException
	 *             If the participant details do not exist.
	 */
	ParticipantResponse findParticipantByLmsDatabaseKey(
			final ParticipantFindRequest pParticipantFindRequest)
			throws LMSException;

	/**
	 * This method validates the participant account number.
	 * <p>
	 * 
	 * @param pAccountNumber
	 *            <code>
	 *              holds the attributes to validate the <code>accountNumber</code>
	 *            .
	 * 
	 * @throws LMSException
	 *             If the participant details do not exist.
	 */
	void validateParticipantAccountNumber(final String pAccountNumber)
			throws LMSException;

	ParticipantResponse findParticipantByCgcNumber(
			final ParticipantFindRequest pParticipantFindRequest,
			final String pAccountNumber) throws LMSException;

	ParticipantResponse findParticpantByCpfAccount(
			ParticipantFindRequest pParticipantFindRequest, String pAccountNumber) throws LMSException;

	 /**
     * This method validates the participant account number.
     * <p>
     * 
     * @param pAccountNumber <code>
     *              holds the attributes to validate the <code>accountNumber</code>.
     * 
     * @throws LMSException If the participant details do not exist.
     */
    
    ParticipantResponse findParticipantByCriteria(final ParticipantFindRequest pParticipantFindRequest)
            throws LMSException;
    
    
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
     * @return SuggestiveSearchResponse
     * 
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    @POST
    @Path("/participants")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    SuggestiveSearchResponse
    findParticipantSuggestiveSearch(
                final ParticipantSuggestiveSearchRequest pParticipantSuggestiveSearchRequest)
                throws LMSException;

	ParticipantResponse findParticipantWithAccountNo(
			ParticipantFindRequest pParticipantFindRequest);

	// LMSC-11111 UIS158 Start
    ParticipantResponse findParticipant(ParticipantFindRequest pParticipantFindRequest) throws LMSException;
    
    ParticipantResponse findParticipantdetail(
            ParticipantFindRequest pParticipantFindRequest) throws LMSException;
	// LMSC-11111 UIS158 End	

}