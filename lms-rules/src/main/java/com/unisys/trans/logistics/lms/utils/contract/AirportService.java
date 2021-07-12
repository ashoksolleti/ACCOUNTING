/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.AirportDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.AirportFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.AirportPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.AirportResponse;
import com.unisys.trans.logistics.lms.utils.dto.AirportRestoreRequest;

/**
 * <code>AirportService</code> handles the maintenance of Airport
 * <p>
 * Airport is created for a City. <br>
 * This has the following functions:
 * <ul>
 * <li>Creates an Airport.
 * <li>Updates an Airport.
 * <li>Deletes an Airport.
 * <li>Retrieves the Airport.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.AirportDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.AirportFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.AirportPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.AirportResponse
 */
public interface AirportService {

    /**
     * Creates the airport.
     * <p>
     * The airport information are provided and the create operation is invoked. The provided airport
     * information are stored and on successful creation ,the airport information are returned.
     * <p>
     * There must be only one default airport. The system automatically sets the first airport for a city as
     * the default airport. The user can set a subsequent airport as the default and the system will
     * automatically clear the default indicator of the other airport. But the user cannot manually clear the
     * default indicator.
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
     * @param pAirportPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportPersistRequest AirportPersistRequest}
     *            </code><br>
     *            the required information for creating an airport as input by the actor.
     *            <p>
     *            <code>
     *            <ul>
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto airport} - (M)
     *            <ul>
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setCityCode cityCode} - (M)
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setAirportName airportName} - (M)
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setAirportCode airportCode} - (M)
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setLatitude latitude} - (O)
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setLongitude longitude} - (O)
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setAirportServiceIndicator  serviceAirport} - (O)
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setDefaultAirportIndicator defaultAirport} - (O)
     *            </ul>
     *            </ul>
     *            </code>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AirportResponse AirportResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code>
     *         </ul>
     * @throws LMSException If the airport code already exists,the above mentioned error codes are
     *             returned.Each CodeMessage contains the status code,human readable message and message type.
     */
    AirportResponse createAirport(AirportPersistRequest pAirportPersistRequest) throws LMSException;

    /**
     * Marks for Delete the airport.
     * <p>
     * The airport information is marked for deletion based on the given airport code, city code and deletion
     * date.
     * <p>
     * A default airport cannot be deleted if there are more airports for the same city. The user must set one
     * of the other airports are the default first.
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
     * @param pAirportDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportDeleteRequest AirportDeleteRequest}
     *            </code><br>
     *            The request object contains the information for deleting an-airport information.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDeleteRequest#setCityCode cityCode} - (M)</code>
     *            </li>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDeleteRequest#setAirportCode airportCode} - (M)</code>
     *            </li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AirportResponse AirportResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code>
     *         </ul>
     *         <p>
     * @throws LMSException If the airport code does not exist,the above mentioned error codes are
     *             returned.Each CodeMessage contains the status code,human readable message and message type.
     */
    AirportResponse deleteAirport(AirportDeleteRequest pAirportDeleteRequest) throws LMSException;

    /**
     * Finds the airport.
     * <p>
     * The airport information are retrieved for the given airport code.
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
     * @param pAirportFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.AirportFindRequest
     *            AirportFindRequest}</code><br>
     *            which includes the attributes to retrieve airport information.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.AirportFindRequest#setAirportCode  airportCode} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AirportResponse AirportResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code>
     *         </ul>
     * @throws LMSException If the airport details does not exist,the above mentioned error codes are
     *             returned.Each CodeMessage contains the status code,human readable message and message type.
     */
    AirportResponse findAirport(AirportFindRequest pAirportFindRequest) throws LMSException;

    /**
     * Finds the airport.
     * <p>
     * The airport information are retrieved for the given airport codes.
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
     * @param pMultipleFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.MultipleFindRequest
     *            MultipleFindRequest}</code><br>
     *            which includes the attributes to retrieve airport information.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.MultipleFindRequest}</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code>
     *         </ul>
     * @throws LMSException If the airport details does not exist,the above mentioned error codes are
     *             returned.Each CodeMessage contains the status code,human readable message and message type.
     */
    MultipleFindResponse findAirportDetails(MultipleFindRequest pMultipleFindRequest) throws LMSException;

    /**
     * Restores the airport.
     * <p>
     * The airport information is restored based on the given airport code and city code.
     * <p>
     * An airport cannot be restored only if that Airport is already marked for deletion.
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
     * @param pAirportRestoreRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportRestoreRequest AirportRestoreRequest}
     *            </code><br>
     *            The request object contains the information for restoring an-airport information.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.AirportRestoreRequest#setCityCode cityCode} - (M)</code>
     *            </li>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.AirportRestoreRequest#setAirportCode airportCode} - (M)</code>
     *            </li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AirportResponse AirportResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code>
     *         </ul>
     *         <p>
     * @throws LMSException If the airport code does not marked for deletion,the above mentioned error codes
     *             are returned. Each CodeMessage contains the status code,human readable message and message
     *             type.
     */
    AirportResponse restoreAirport(AirportRestoreRequest pAirportRestoreRequest) throws LMSException;

    /**
     * Updates the airport.
     * <p>
     * The airport information are provided and the update operation is invoked. The provided airport
     * information are stored and on successful update,the airport information are returned.
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
     * @param pAirportPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportPersistRequest AirportPersistRequest}
     *            </code><br>
     *            The request object contains all the required information for creating an airport.
     *            <p>
     *            <code>
     *            <ul> 
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto airport} - (M)
     *            <ul>
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setCityCode cityCode} - (M)
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setAirportName airportName} - (M)
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setAirportCode airportCode} - (M)
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setLatitude latitude} - (O)
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setLongitude longitude} - (O)
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setAirportServiceIndicator  serviceAirport} - (O)
     *            <li>{@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setDefaultAirportIndicator  defaultAirport} - (O)
     *            </ul>
     *            </ul>
     *            </code>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AirportResponse AirportResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code>
     *         </ul>
     * @throws LMSException If the airport details does not exist ,the above mentioned error codes are
     *             returned.Each CodeMessage contains the status code,human readable message and message type.
     */
    AirportResponse updateAirport(AirportPersistRequest pAirportPersistRequest) throws LMSException;

    /**
     * Deletes the <code>Airport</code>.
     * <p>
     * This method deletes the Airport.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
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
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     *            <p>
     * @throws LMSException
     *             If delete fails, above mentioned error codes are returned.
     *             Each CodeMessage contains the status code, human readable
     *             message, and message type.
     */
    BatchResponse purgeAirport(BatchRequest pBatchRequest) throws LMSException;

    /**
     * Writes the discrepancy report for<code>Airport</code>.
     * <p>
     * This method writes the discrepancy report for Airport.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
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
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     * @param pReport
     *            holds the constant airport is found.
     *            <p>
     * @throws LMSException
     *             If delete fails, above mentioned error codes are returned.
     *             Each CodeMessage contains the status code, human readable
     *             message, and message type.
     */
    BatchResponse discrepencyReport(BatchRequest pBatchRequest, StringBuffer pReport) throws LMSException;
}
