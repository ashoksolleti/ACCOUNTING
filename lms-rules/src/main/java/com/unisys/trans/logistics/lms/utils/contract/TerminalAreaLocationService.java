/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.TerminalAreaFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse;
import com.unisys.trans.logistics.lms.utils.dto.TerminalAreaNameChangeRequest;
import com.unisys.trans.logistics.lms.utils.dto.TerminalAreaPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest;
import com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.TerminalLocationMoveRequest;
import com.unisys.trans.logistics.lms.utils.dto.TerminalLocationNameChangeRequest;
import com.unisys.trans.logistics.lms.utils.dto.TerminalLocationStatusChangeRequest;

/**
 * <code>TerminalAreaLocationService</code> interface exposes the APIs which identifies various processing
 * flows involved in maintaining an terminal, terminal area and its locations.
 * <p>
 * This includes the following operations:
 * <ul>
 * <li>Add terminal location - Adds new locations to the existing terminal area.
 * <li>Change terminal area name - Changes the name of the selected terminal area.
 * <li>Change terminal location name - Changes the name of the selected terminal location.
 * <li>Close terminal area - Closes the terminal area and all its associated locations by setting the
 * closedIndicator status to true.
 * <li>Close terminal location - Closes the terminal location by setting the closedIndicator status to true.
 * <li>Create terminal area - Creates a terminal area and its location and also creates terminal locations for
 * an existing area.
 * <li>Delete terminal area - Deletes a terminal area and its locations.
 * <li>Delete terminal location - Deletes a terminal location.
 * <li>Find terminal area - Retrieves the selected terminal area and its corresponding terminal locations.
 * <li>Find terminal area locations - Retrieves the terminal, terminal areas and its corresponding terminal
 * locations.
 * <li>Find terminal location - Retrieves the desired terminal location.
 * <li>Moves terminal locations - Moves a terminal location from one terminal area into another.
 * <li>Open terminal area - Opens the terminal area and all its associated locations by setting the
 * closedIndicator status to false.
 * <li>Open terminal location - Opens the terminal location by setting the closedIndicator status to false.
 * <li>Restrict terminal area - Restricts the selected terminal area.
 * <li>Restrict terminal location - Restricts the selected terminal location.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest TerminalAreaDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TerminalAreaFindRequest TerminalAreaFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse TerminalAreaLocationResponse
 * @see com.unisys.trans.logistics.lms.utils.dto.TerminalAreaPersistRequest TerminalAreaPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest
 *      TerminalAreaStatusChangeRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDeleteRequest TerminalLocationDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TerminalLocationStatusChangeRequest
 *      TerminalLocationStatusChangeRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TerminalAreaNameChangeRequest TerminalAreaNameChangeRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TerminalLocationNameChangeRequest
 *      TerminalLocationNameChangeRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TerminalLocationMoveRequest TerminalLocationMoveRequest
 */
public interface TerminalAreaLocationService {

    /**
     * Adds new locations to the existing terminal area or adds new terminal areas to the existing terminal.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ULD_SERIAL_NUMBER_INDICATOR}
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
     *            <br>
     *            <b>Error Text: </b><br>
     *            <table border="0" cellspacing="0" cellpadding="5">
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_NAME_MAX_RANGE}</td>
     *            <td>More than 100 locations in the input range.Locations cannot be created.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_NAME_INVALID_SIZE}</td>
     *            <td>The location size exceeds 9 characters.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_INVALID_NAME_OBJECT_INSTANCE}</td>
     *            <td>This location name is prohibited.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_ULDTYPE_CANNOT_BE_ADDED}</td>
     *            <td>The ULD Type Location can be created only in the ULD area.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_OTHERTYPE_CANNOT_BE_ADDED}</td>
     *            <td>The Location Type is not ULD.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_UNIQUE_ULD_TERMINAL_AREA}</td>
     *            <td>Only one ULD Control type area can exist in a station.</td>
     *            </tr>
     * </table>
     * </code> </table>
     * <p>
     * <b>Warnings: </b><br>
     * <b>The following Warning Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <b>Warning Text: </b><br>
     *            <table border="0" cellspacing="0" cellpadding="5">
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#FEW_TERMINAL_LOCATIONS_ALREADY_EXISTS}</td>
     *            <td>Terminal location name already exist for this station and cannot be created for this
     *            station.</td>
     *            </tr>
     * </table>
     * </code> </table>
     * <p>
     * 
     * @param pTerminalAreaPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaPersistRequest
     *            TerminalAreaPersistRequest}</code><br>
     *            holds all the information for adding a new terminal location.<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaPersistRequest
     *            TerminalAreaPersistRequest} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto TerminalDto} - (M)
     *            </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto#setName name} - (M)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto#setOId oId} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto#setStationCode stationCode} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto#setTerminalAreas terminalAreas}
     *            - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto terminalAreaDto}
     *            - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto#setStatus status}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto#setLocationCount
     *            locationCount} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto#setName name} - (M)</code>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto#setOId oId} - (C)
     *            </code><br>
     *            Prohibited for the new area create operation.<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto#setType type}-
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto#setTerminalLocations
     *            terminalLocations} - (M) (1:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDto
     *            terminalLocationDto} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDto#setStatus
     *            status} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDto#setName name} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDto#setOId oId} - (C)</code><br>
     *            Prohibited for the new terminal location create operation.<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDto#setType type}
     *            - (M)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the add terminal location operation fails then corresponding error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    TerminalAreaLocationResponse addTerminalLocation(TerminalAreaPersistRequest pTerminalAreaPersistRequest)
                throws LMSException;

    /**
     * Changes the existing <code>TerminalAreaName</code>.
     * <p>
     * The existing terminal area name is replaced with the new terminal area name input by the user.
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
     *            <br>
     *            <b>Error Text: </b><br>
     *            <table border="0" cellspacing="0" cellpadding="5">
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_AREA_NEW_NAME_ALREADY_EXISTS}</td>
     *            <td>An Area with the input New Terminal Area Name already exists in the station.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_AREA_CANNOT_BE_FOUND}</td>
     *            <td>Terminal area name does not exist in the station.</td>
     *            </tr>
     * </table>
     * </code> </table>
     * <p>
     * 
     * @param pTerminalAreaNameChangeRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaNameChangeRequest
     *            TerminalAreaNameChangeRequest}</code><br>
     *            holds all the information required to change the name of a terminal area.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaNameChangeRequest
     *            TerminalAreaStatusChangeRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaNameChangeRequest#setTerminalAreaName
     *            terminalAreaName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaNameChangeRequest#setTerminalAreaNewName
     *            terminalAreaNewName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaNameChangeRequest#setTerminalAreaOldName
     *            terminalAreaOldName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaNameChangeRequest#setTerminalOId
     *            terminalOId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaNameChangeRequest#setTerminalVersion
     *            terminalVersion} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the change terminal area name operation fails then corresponding error codes
     *             are returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    TerminalAreaLocationResponse changeTerminalAreaName(
                TerminalAreaNameChangeRequest pTerminalAreaNameChangeRequest) throws LMSException;

    /**
     * Changes the existing <code>TerminalLocationName</code>.
     * <p>
     * The existing terminal location name is replaced with the new terminal location name input by the user.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ULD_SERIAL_NUMBER_INDICATOR}
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
     *            <br>
     *            <b>Error Text: </b><br>
     *            <table border="0" cellspacing="0" cellpadding="5">
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_DOES_NOT_EXIST}</td>
     *            <td>Terminal location does not exist.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_NEW_NAME_ALREADY_EXISTS}</td>
     *            <td>A Terminal Location with the input New Terminal Location Name already
     *            exists in the station.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_NEW_NAME_CONTAINS_INVALID_CHARACTERS}</td>
     *            <td>The New Terminal Location Name has invalid alphanumeric characters.</td>
     *            </tr>
     * </table>
     * </code> </table>
     * <p>
     * 
     * @param pTerminalLocationNameChangeRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationNameChangeRequest
     *            TerminalLocationNameChangeRequest}</code><br>
     *            The request object includes the attributes to change the name of the terminal area.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationNameChangeRequest
     *            TerminalLocationNameChangeRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationNameChangeRequest#setTerminalAreaIdentifier
     *            terminalAreaIdentifier} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationNameChangeRequest#setTerminalAreaName
     *            terminalAreaName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationNameChangeRequest#setTerminalLocationNewName
     *            terminalAreaNewName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationNameChangeRequest#setTerminalLocationOldName
     *            terminalAreaOldName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationNameChangeRequest#setTerminalOId
     *            terminalOId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationNameChangeRequest#setTerminalVersion
     *            terminalVersion} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the change terminal location name operation fails then corresponding error
     *             codes are returned. Each CodeMessage contains the status code, human readable message and
     *             message type.
     */
    TerminalAreaLocationResponse changeTerminalLocationName(
                TerminalLocationNameChangeRequest pTerminalLocationNameChangeRequest) throws LMSException;

    /**
     * Closes the <code>TerminalArea</code>.
     * <p>
     * The terminal area status indicator is set to true to indicate the area is closed. When a terminal area
     * is closed all the associated terminal locations are also closed.
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
     *            <br>
     *            <b>Error Text: </b><br>
     *            <table border="0" cellspacing="0" cellpadding="5">
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_AREA_IS_ALREADY_CLOSED}</td>
     *            <td>Terminal area is closed.</td>
     *            </tr>
     * </table>
     * </code> </table>
     * <p>
     * 
     * @param pTerminalAreaStatusChangeRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest
     *            TerminalAreaStatusChangeRequest}</code><br>
     *            holds the required information to change the status of the terminal area.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest
     *            TerminalAreaStatusChangeRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setStatus
     *            status} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalAreaName
     *            terminalAreaName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalName
     *            terminalName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalOId
     *            terminalOId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalVersion
     *            terminalVersion} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalAreaIdentifier
     *            terminalAreaIdentifier} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the close terminal area operation fails then corresponding error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    TerminalAreaLocationResponse closeTerminalArea(
                TerminalAreaStatusChangeRequest pTerminalAreaStatusChangeRequest) throws LMSException;

    /**
     * Closes the <code>TerminalLocation</code>.
     * <p>
     * The terminal location status indicator is set to true to indicate the location is closed.
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
     *            <br>
     *            <b>Error Text: </b><br>
     *            <table border="0" cellspacing="0" cellpadding="5">
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_IS_ALREADY_CLOSED}</td>
     *            <td>Terminal area is closed.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_AREA_IS_ALREADY_CLOSED}</td>
     *            <td>Terminal area is closed.</td>
     *            </tr>
     * </table>
     * </code> </table>
     * <p>
     * 
     * @param pTerminalLocationStatusChangeRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationStatusChangeRequest
     *            TerminalLocationStatusChangeRequest}</code><br>
     *            holds the required information to change the status of the terminal location.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationStatusChangeRequest
     *            TerminalLocationStatusChangeRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationStatusChangeRequest#setStatus
     *            status} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationStatusChangeRequest#setTerminalLocationName
     *            terminalLocationName} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the close terminal location operation fails then corresponding error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    TerminalAreaLocationResponse closeTerminalLocation(
                TerminalLocationStatusChangeRequest pTerminalLocationStatusChangeRequest) throws LMSException;

    /**
     * Creates the <code>Terminal</code>,<code>TerminalArea</code> and <code>TerminalLocation</code>.
     * <p>
     * This method is triggered only for the first time when a terminal has to be created to insert area and
     * locations under it.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ULD_SERIAL_NUMBER_INDICATOR}
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
     *            <br>
     *            <b>Error Text: </b><br>
     *            <table border="0" cellspacing="0" cellpadding="5">
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_NAME_MAX_RANGE}</td>
     *            <td>More than 100 locations in the input range.Locations cannot be created.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_NAME_INVALID_SIZE}</td>
     *            <td>The location size exceeds 9 characters.</td>
     *            </tr>
     * </table>
     * </code> </table>
     * <p>
     * 
     * @param pTerminalAreaPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaPersistRequest
     *            TerminalAreaPersistRequest}</code><br>
     *            holds the required information to add a terminal location.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaPersistRequest
     *            TerminalAreaPersistRequest} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto TerminalDto} - (M)
     *            </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto#setName name} - (M)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto#setOId oId} -
     *            (C)</code><br>
     *            Prohibited for the create operation.<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto#setStationCode
     *            stationCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto#setTerminalAreas terminalAreas}
     *            - (M) (1:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto terminalAreaDto}
     *            - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto#setStatus status}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto#setLocationCount
     *            locationCount} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto#setName name} - (M)</code>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto#setOId oId} - (C)
     *            </code><br>
     *            Prohibited for the create operation.<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto#setType type}-
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDto#setTerminalLocations
     *            terminalLocations} - (M) (1:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDto
     *            terminalLocationDto} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDto#setStatus
     *            status} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDto#setName name} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDto#setOId oId} - (C)</code><br>
     *            Prohibited for the create operation.<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDto#setType type}
     *            - (M)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the create terminal area operation fails then corresponding error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    TerminalAreaLocationResponse createTerminalArea(TerminalAreaPersistRequest pTerminalAreaPersistRequest)
                throws LMSException;

    /**
     * Deletes the <code>TerminalArea</code>.
     * <p>
     * All the terminal locations associated with the terminal area are deleted when the area is being
     * deleted. The terminal is deleted when the area being deleted is the only available area under the
     * terminal.
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
     * 
     * @param pTerminalAreaDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest
     *            TerminalAreaDeleteRequest}</code><br>
     *            holds the required information to delete a terminal area.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest
     *            TerminalAreaDeleteRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest#setTerminalAreaName
     *            terminalAreaName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest#setTerminalName
     *            terminalName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest#setTerminalAreaIdentifier
     *            TerminalAreaIdentifier} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest#setTerminalOId
     *            terminalOId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest#setTerminalVerison
     *            terminalVerison} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the delete terminal area operation fails then corresponding error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    TerminalAreaLocationResponse deleteTerminalArea(TerminalAreaDeleteRequest pTerminalAreaDeleteRequest)
                throws LMSException;

    /**
     * Deletes the <code>TerminalLocation</code>.
     * <p>
     * The terminal location within a particular terminal area is deleted.
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
     * 
     * @param pTerminalLocationDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDeleteRequest
     *            TerminalLocationDeleteRequest}</code><br>
     *            holds the required information to delete a terminal location.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationDeleteRequest
     *            TerminalLocationDeleteRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest#setTerminalAreaIdentifier
     *            terminalAreaIdentifier} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest#setTerminalAreaName
     *            terminalAreaName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest#setTerminalName
     *            terminalName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest#setTerminalOId
     *            terminalOId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaDeleteRequest#setTerminalVerison
     *            terminalVerison} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the delete terminal location operation fails then corresponding error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    TerminalAreaLocationResponse deleteTerminalLocation(
                TerminalLocationDeleteRequest pTerminalLocationDeleteRequest) throws LMSException;

    /**
     * Finds a particular terminal area if the area name is inputed; else finds all terminal areas in the
     * terminal.
     * <p>
     * This method does any one of the following:<br>
     * <ul>
     * <li>Finds the terminal area and locations.
     * <li>Finds all the terminal areas and its locations.
     * <li>Finds the terminal location.
     * </ul>
     * <p>
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
     * <b>Warnings: </b><br>
     * <b>The following Warning Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <br>
     *            <b>Warning Text: </b><br>
     *            <table border="0" cellspacing="0" cellpadding="5">
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_AREA_CANNOT_BE_FOUND}</td>
     *            <td>Terminal area name does not exist in the station.</td>
     *            </tr>
     * </table>
     * </code> </table>
     * <p>
     * 
     * @param pTerminalAreaFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaFindRequest
     *            TerminalAreaFindRequest}</code><br>
     *            holds the required information to find a terminal area.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaFindRequest
     *            TerminalAreaFindRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaFindRequest#setTerminalAreaName
     *            terminalAreaName} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaFindRequest#setTerminalName
     *            terminalName} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaFindRequest#setAreaNameIdentifier
     *            areaNameIdentifier} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the find terminal area operation fails then corresponding error codes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.
     */
    TerminalAreaLocationResponse findTerminalArea(TerminalAreaFindRequest pTerminalAreaFindRequest)
                throws LMSException;

    /**
     * Finds the <code>Terminal</code>, <code>TerminalArea</code> or <code>TerminalLocation</code> based on
     * the type.
     * <p>
     * The system finds the terminal location that exactly matches the location name.<br>
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
     * 
     * @param pMultipleFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest MultipleFindRequest}
     *            </code><br>
     *            contains the list of search input values.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M) (1:*)</code> holds the list of terminal location names.
     *            </ul>
     *            <p>
     * @param pType holds the type string indicating that the location is being searched.
     * @param pStationCode holds the station code string.
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         the terminal location if match found.<br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*)</code> holds the <code> terminalLocationName</code> as Key and <code>
     *         TerminalLocationDto </code> as Value.
     *         </ul>
     *         <p>
     * @throws LMSException If the terminal location being searched for does not exist, then corresponding
     *             error codes are returned. Each CodeMessage contains the status code, human readable message
     *             and message type.
     */
    MultipleFindResponse findTerminalAreaLocations(final MultipleFindRequest pMultipleFindRequest,
                final String pType, final String pStationCode) throws LMSException;

    /**
     * Moves the <code>TerminalLocation</code> from one area to another.
     * <p>
     * When the terminal location is being moved from one terminal area into another the status of the
     * terminal location is set as the status of the terminal area.<br>
     * <ul>
     * <li>If a terminal location, whose status is OPEN is being moved into CLOSED area, the status of the
     * terminal area would be changed to OPEN.
     * <li>A terminal location of type ULD can only be moved into a area whose type is ULD. Similarly, a
     * terminal location of any other type can only be moved into a area whose type is not ULD.
     * </ul>
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
     * 
     * @param pTerminalLocationMoveRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationMoveRequest
     *            TerminalLocationMoveRequest}</code><br>
     *            holds the required information to move a terminal location from terminal
     *            area into another.<br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the move terminal location operation fails then corresponding error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    TerminalAreaLocationResponse
                moveTerminalLocation(TerminalLocationMoveRequest pTerminalLocationMoveRequest)
                            throws LMSException;

    /**
     * Opens the <code>TerminalArea</code>.
     * <p>
     * The status of the closed indicator is set to FALSE to open a closed area. All the associated locations
     * status are also set to FALSE.
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
     *            <br>
     *            <b>Error Text: </b><br>
     *            <table border="0" cellspacing="0" cellpadding="5">
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_AREA_IS_ALREADY_CLOSED}</td>
     *            <td>Terminal area is closed.</td>
     *            </tr>
     * </table>
     * </code> </table>
     * <p>
     * 
     * @param pTerminalAreaStatusChangeRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest
     *            TerminalAreaStatusChangeRequest}</code><br>
     *            holds the required information to change the status of the terminal area.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest
     *            TerminalAreaStatusChangeRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setStatus
     *            status} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalAreaName
     *            terminalAreaName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalName
     *            terminalName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalOId
     *            terminalOId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalVersion
     *            terminalVersion} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalAreaIdentifier
     *            terminalAreaIdentifier} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the open terminal area operation fails then corresponding error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    TerminalAreaLocationResponse openTerminalArea(
                TerminalAreaStatusChangeRequest pTerminalAreaStatusChangeRequest) throws LMSException;

    /**
     * Opens the <code>TerminalLocation</code>.
     * <p>
     * The closed indicator of a the terminal location is set to FALSE to indicate the location is open.
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
     *            <br>
     *            <b>Error Text: </b><br>
     *            <table border="0" cellspacing="0" cellpadding="5">
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_IS_ALREADY_CLOSED}</td>
     *            <td>Terminal location cannot be closed.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_AREA_IS_ALREADY_CLOSED}</td>
     *            <td>Terminal area is closed.</td>
     *            </tr>
     * </table>
     * </code> </table>
     * <p>
     * 
     * @param pTerminalLocationStatusChangeRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationStatusChangeRequest
     *            TerminalLocationStatusChangeRequest}</code><br>
     *            holds the required information to change the status of the terminal location.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationStatusChangeRequest#setStatus
     *            status} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationStatusChangeRequest#setTerminalLocationName
     *            terminalLocationName} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the open terminal location operation fails then corresponding error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    TerminalAreaLocationResponse openTerminalLocation(
                TerminalLocationStatusChangeRequest pTerminalLocationStatusChangeRequest) throws LMSException;

    /**
     * Restricts all the terminal locations inside the <code>TerminalArea</code> .
     * <p>
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
     * 
     * @param pTerminalAreaStatusChangeRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest
     *            TerminalAreaStatusChangeRequest}</code><br>
     *            holds the required information to restrict all the terminal locations under a particular
     *            terminal area.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest
     *            TerminalAreaStatusChangeRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setStatus
     *            status} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalAreaName
     *            terminalAreaName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalName
     *            terminalName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalOId
     *            terminalOId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalVersion
     *            terminalVersion} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaStatusChangeRequest#setTerminalAreaIdentifier
     *            terminalAreaIdentifier} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the restrict terminal area operation fails then corresponding error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    TerminalAreaLocationResponse restrictTerminalArea(
                TerminalAreaStatusChangeRequest pTerminalAreaStatusChangeRequest) throws LMSException;

    /**
     * Restrict the <code>TerminalLocation</code>.
     * <p>
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
     *            <br>
     *            <b>Error Text: </b><br>
     *            <table border="0" cellspacing="0" cellpadding="5">
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_CANNOT_BE_RESTRICTED}</td>
     *            <td>The location cannot be restricted as the Terminal Area is closed.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TERMINAL_LOCATION_CANNOT_BE_FOUND}</td>
     *            <td>Terminal location cannot be found.</td>
     *            </tr>
     * </table>
     * </code> </table>
     * <p>
     * 
     * @param pTerminalLocationStatusChangeRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationStatusChangeRequest
     *            TerminalLocationStatusChangeRequest}</code><br>
     *            holds the required information to restrict a particular terminal location.<br>
     *            <ul>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationStatusChangeRequest#setStatus
     *            status} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TerminalLocationStatusChangeRequest#setTerminalLocationName
     *            terminalLocationName} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse
     *         TerminalAreaLocationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TerminalAreaLocationResponse#getTerminal
     *         terminal} - (1:*) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.TerminalDto
     *         terminalDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the restrict terminal location operation fails then corresponding error codes
     *             are returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    TerminalAreaLocationResponse restrictTerminalLocation(
                TerminalLocationStatusChangeRequest pTerminalLocationStatusChangeRequest) throws LMSException;

    /**
     * Validates the presence of a particular <code>TerminalLocation</code> in a terminal.
     * <p>
     * The system finds the terminal location that exactly matches the location name.<br>
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
     * 
     * @param pValidationRequest <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
     *            ValidationRequest}</code><br>
     *            holds the list of search input values.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M)</code>
     *            </ul>
     * @param pStationCode holds the station code string.
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs
     *         validInputs} - (0:*) <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs
     *         searchInputs} - (1:*) </ul> </code>
     *         <p>
     * @throws LMSException If the terminal location doesn't exist then corresponding error codes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.
     */
    ValidationResponse
                validateTerminalLocationName(ValidationRequest pValidationRequest, String pStationCode)
                            throws LMSException;
    
    // LMSC-11111 UIS158 Start
    List<String> findTerminalLocationsByStation(final String pStationCode)
                            throws LMSException;
    // LMSC-11111 UIS158 End
}
