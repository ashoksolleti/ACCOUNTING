/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.dto.ParameterResponse;
import com.unisys.trans.logistics.lms.framework.dto.UIParameterResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.ParameterFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest;
import com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchResponse;
import com.unisys.trans.logistics.lms.utils.dto.ParameterPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.UIParameterRequest;

/**
 * Interface of the services offered by <code>ParameterService</code>.
 * <p>
 * <code>ParameterService</code> handles the maintenance of Parameter. Provides update service for Parameter
 * details.<br>
 * This has the following functions:<br>
 * <ul>
 * <li>Find parameter information by name.
 * <li>Find parameter information by group.
 * <li>Find parameter information by module.
 * <li>Find parameter information by RetainIndicator.
 * <li>Find parameter information by date.
 * <li>Search the parameters and Retrieve.
 * <li>Update Parameter information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.ParameterFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchResponse
 * @see com.unisys.trans.logistics.lms.utils.dto.ParameterPersistRequest
 * @see com.unisys.trans.logistics.lms.framework.dto.ParameterResponse
 */
@Path("parameterService")
public interface ParameterService {

    /**
     * Retrieves the <code>Parameter</code> details.
     * <p>
     * If no parameter name is provided, it retrieves all the parameters. If the parameter name is provided,
     * it retrieves all the parameters which starts with the given name.
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
     * @param pParameterFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterFindRequest ParameterFindRequest}
     *            </code><br>
     *            holds the attribute to find the parameter.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ParameterFindRequest#setName name} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse ParameterResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse#getParameters()
     *         parameter} - (0,*) </ul> </code>
     *         <p>
     * @throws LMSException If the Parameter doesn't exist.
     */
    ParameterResponse findParameter(ParameterFindRequest pParameterFindRequest) throws LMSException;

    /**
     * Retrieves the <code>Parameter</code> details.
     * <p>
     * <b> Related methods include:</b><br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByName
     * findParameterByName}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByModule
     * findParameterByModule}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByGroup
     * findParameterByGroup}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByRetainIndicator
     * findParameterByRetainIndicator}<br>
     * Retrieves the parameter information based on the given Date range
     * <p>
     * <li><b> Date range </b><br>
     * If the date ranges are given, it will compare with lastUpdate date/time. Then it will find parameters
     * between the date range.
     * <p>
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
     *        <b>Errors:</b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#THE_START_DATE_MUST_BE_LESS_THAN_THE_END_DATE}
     *        </code></td><br>
     *        <td align="left"> The start date must be less than the end date </td>
     *        </tr>
     *        </table>
     * @param pRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest
     *            ParameterMultipleSearchRequest}</code><br>
     *            holds the attribute to find the parameter.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#getStartDate()}
     *            - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#getEndDate()}
     *            - (O)</code> The start date and end date are optional. If date is not given it will take the
     *            default date(Today's date) <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterFindRequest#setName name} - (O)
     *            </code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setModule
     *            module} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setGroup
     *            group} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setRetainIndicator
     *            retainIndicator} - (O)</code><br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse ParameterResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse#getParameters()
     *         parameter} - (0,*) </ul> </code>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */

    ParameterMultipleSearchResponse findParameterByDate(ParameterMultipleSearchRequest pRequest)
                throws LMSException;

    /**
     * Retrieves the <code>Parameter</code> details
     * <p>
     * <b> Related methods include:</b><br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByName
     * findParameterByName}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByModule
     * findParameterByModule}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByDate
     * findParameterByDate}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByRetainIndicator
     * findParameterByRetainIndicator}<br>
     * Retrieves the parameter information based on the module
     * <p>
     * <li><b> Group </b><br>
     * System Searches the parameter details using the given group.if any match found the details are
     * displayed.
     * <p>
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
     *        <b>Errors:</b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#GROUP_NAME_DOES_NOT_EXIST_IN_THE_SYSTEM}
     *        </code></td><br>
     *        <td align="left"> The group name does not exist in the system. </td>
     *        </tr>
     *        </table>
     * @param pRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest
     *            ParameterMultipleSearchRequest}</code><br>
     *            holds the attribute to find the parameter.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setGroup
     *            group} - (M)</code><br>
     *            Group name is mandatory <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ParameterFindRequest#setName
     *            name} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setModule
     *            module} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setStartDate
     *            startDate } - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setEndDate
     *            endDate } - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setRetainIndicator
     *            retainIndicator} - (O)</code><br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse ParameterResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse#getParameters()
     *         parameter} - (0,*) </ul> </code>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */

    ParameterMultipleSearchResponse findParameterByGroup(ParameterMultipleSearchRequest pRequest)
                throws LMSException;

    /**
     * Retrieves the <code>Parameter</code> details
     * <p>
     * <b> Related methods include:</b><br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByName
     * findParameterByName}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByGroup
     * findParameterByGroup}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByDate
     * findParameterByDate}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByRetainIndicator
     * findParameterByRetainIndicator}<br>
     * Retrieves the parameter information based on the module
     * <p>
     * <li><b> Module </b><br>
     * System Searches the parameter details using the given module.if any match found the details are
     * displayed. The system allows the following list of modules: AWB,Customs,Flights,Participants, Rating,
     * Reservation, Routing, Space, ULD Control, Utilities, Warehouse.
     * <p>
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
     *        <b>Errors:</b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PARAMETER_MODULE_DOES_NOT_EXISTM}
     *        </code></td><br>
     *        <td align="left"> The parameter module does not exist in the system.</td>
     *        </tr>
     *        </table>
     * @param pRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest
     *            parameterMultipleSearchRequest}</code><br>
     *            holds the attribute to find the parameter.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setModule
     *            module} - (M)</code><br>
     *            Parameter module is mandatory <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ParameterFindRequest#setName
     *            name} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setGroup
     *            group} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setStartDate
     *            startDate } - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setEndDate
     *            endDate } - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setRetainIndicator
     *            retainIndicator} - (O)</code><br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse ParameterResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse#getParameters()
     *         parameter} - (0,*) </ul> </code>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */

    ParameterMultipleSearchResponse findParameterByModule(ParameterMultipleSearchRequest pRequest)
                throws LMSException;

    /**
     * Retrieves the <code>Parameter</code> details by name
     * <p>
     * <b> Related methods include:</b><br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByGroup
     * findParameterByGroup}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByModule
     * findParameterByModule}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByDate
     * findParameterByDate}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByRetainIndicator
     * findParameterByRetainIndicator}<br>
     * Retrieves the parameter information based on the name
     * <p>
     * <li><b> Name </b><br>
     * System Searches the parameter details using the given name.if any match found the details are
     * displayed.
     * <p>
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
     *        <b>Errors:</b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PARAMETER_NAME_DOES_NOT_EXIST_IN_THE_SYSTEM}
     *        </code></td><br>
     *        <td align="left"> The parameter name does not exist in the system. </td>
     *        </tr>
     *        </table>
     * @param pRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.ParameterFindRequest
     *            ParameterFindRequest}</code><br>
     *            holds the attribute to find the parameter.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ParameterFindRequest#setName
     *            name} - (M)</code><br>
     *            Parameter name is mandatory <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setGroup
     *            group} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setModule
     *            module} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setStartDate
     *            startDate } - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setEndDate
     *            endDate } - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setRetainIndicator
     *            retainIndicator} - (O)</code><br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse ParameterResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse#getParameters()
     *         parameter} - (0,*) </ul> </code>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */

    ParameterResponse findParameterByName(ParameterFindRequest pRequest) throws LMSException;

    /**
     * Retrieves the <code>Parameter</code> details by RetainIndicator
     * <p>
     * <b> Related methods include:</b><br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByName
     * findParameterByName}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByModule
     * findParameterByModule}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByDate
     * findParameterByDate}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ParameterService#findParameterByGroup
     * findParameterByGroup}<br>
     * Retrieves the parameter information based on RetainIndicator
     * <p>
     * <li><b>RetainIndicator</b><br>
     * The system retrieves all parameters with the Retain Indicator set to ‘Yes’.
     * <p>
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
     * @param pRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest
     *            parameterMultipleSearchRequest}</code><br>
     *            holds the attribute to find the parameter.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setRetainIndicator
     *            retainIndicator} - (M)</code><br>
     *            RetainIndicator must be 'Yes' or 'No' <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setGroup
     *            group} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setModule
     *            module} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setStartDate
     *            startDate } - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setEndDate
     *            endDate } - (O)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ParameterFindRequest#setName
     *            name} - (O)</code><br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse ParameterResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse#getParameters()
     *         parameter} - (0,*) </ul> </code>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */

    ParameterMultipleSearchResponse findParameterByRetainIndicator(ParameterMultipleSearchRequest pRequest)
                throws LMSException;

    /**
     * Retrieves the <code>Parameter</code> details.
     * <p>
     * Retrieves the list of distinct group names
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
     * @param pRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest
     *            ParameterMultipleSearchRequest}</code><br>
     *            holds the parameter groups.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setSearchParameter searchParameter} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse ParameterResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse#getGroupNames()
     *         parameter} - (0,*) </ul> </code>
     *         <p>
     * @throws LMSException If there are no group names doesn't exist.
     */

    ParameterResponse findParameterGroups(ParameterMultipleSearchRequest pRequest) throws LMSException;

    /**
     * Retrieves the <code>Parameter</code> details.
     * <p>
     * If the search text is provided, it retrieves all the parameters.
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
     * @param pRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest
     *            ParameterMultipleSearchRequest}</code><br>
     *            holds the attribute to find the parameter.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ParameterMultipleSearchRequest#setSearchParameter searchParameter} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse ParameterResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse#getParameters()
     *         parameter} - (0,*) </ul> </code>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */

    ParameterMultipleSearchResponse searchParameterInformation(ParameterMultipleSearchRequest pRequest)
                throws LMSException;

    /**
     * Updates the <code>Parameter</code> value.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * </table>
     * <b>Errors:</b><br>
     * The following response code may be returned.
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PARAMETER_INVALID}</code></td>
     * <td align="left">The parameter name does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.ParameterPersistRequest
     *            ParameterPersistRequest}</code><br>
     *            holds the attributes required for updating the parameter.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ParameterDto ParameterDto} - (M)</code>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ParameterDto#setModule module} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ParameterDto#setGroup group} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ParameterDto#setName name} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ParameterDto#setType type} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ParameterDto#setRuntimeIndicator runtimeIndicator} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ParameterDto#setValue value} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ParameterDto#setValidationExpression validationExpression} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ParameterDto#setDescription description} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse ParameterResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse#getParameters()
     *         parameter} - (1,1) </ul> </code>
     *         <p>
     * @throws LMSException If the Parameter doesn't exist. If validation fails the above mentioned error
     *             codes are returned. Each CodeMessage contains the status code,human readable message and
     *             message type.
     * @since 1.0
     */
    ParameterResponse updateParameter(ParameterPersistRequest pRequest) throws LMSException;

    /**
     * Retrieves parameters needed for <code>UI operation</code>.
     * <p>
     * This method retrieves parameters needed for UI operation. <br>
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
     * @param pUIParameterRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.UIParameterRequest
     *            UIParameterRequest}</code><br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.UIParameterResponse
     *         UIParameterResponse}</code>
     * 
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */

    UIParameterResponse retrieveUIParameters(UIParameterRequest pUIParameterRequest)
                throws LMSException;

    /**
     * Find parameters by <code>LMS name</code>.
     * <p>
     * This method retrieves parameters by LMS Name. <br>
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
     * @param pRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.ParameterFindRequest
     *            ParameterFindRequest}</code><br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ParameterResponse
     *         ParameterResponse}</code>
     * 
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    ParameterResponse findParameterByLMSName(ParameterFindRequest pRequest) throws LMSException;
    MultipleFindResponse findParameters(MultipleFindRequest pMultipleFindRequest) throws LMSException;

    ParameterResponse updateMultipleParameter(ParameterPersistRequest pRequest) throws LMSException;
    
    
    ParameterResponse findMultipleParameters(ParameterFindRequest pRequest) throws LMSException;
	
	ParameterMultipleSearchResponse findMultipleRunTimeParameter(ParameterMultipleSearchRequest pRequest)
                throws LMSException;
	
	public ParameterResponse findParameterUsingParameterName(ParameterFindRequest pRequest) throws LMSException;
	
	@POST
    @Path("/parameters")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    ParameterResponse findParametersByFunction(ParameterFindRequest pParameterFindRequest) throws LMSException;
	
}
