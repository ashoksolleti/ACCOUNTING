/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindResponse;

/**
 * This interface provides API for other utils modules service to access the
 * AggregateFinderService.
 * 
 */
public interface AggregateFinderService {

    /**
     * Finds <code>Aggregates</code> for the input location.
     * <p>
     * This method searches Aggregates that contain the input location as member and returns their aggregate
     * codes.
     * <p>
     * To find the Aggregate codes user must provide following input:
     * <li>sourceCode</li>
     * <li>sourceType</li><br>
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
     * @param pAggregateLocationFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest
     *            AggregateLocationFindRequest}</code><br>
     *            includes the below attributes to find <code>Aggregate</code>s
     *            for the given location.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest#setSourceCode
     *            sourceCode} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest#setSourceType
     *            sourceType} - (M)</code></li>
     *            </ul>
     *            <p>
     * @return <code> {@link java.util.List List} of Aggregate Codes</code>.
     * @throws LMSException
     *             If any error occurs. Returned CodeMessage contains the status
     *             code, human readable message, and message type.
     */
    List<String> findAggregatesForLocation(
                AggregateLocationFindRequest pAggregateLocationFindRequest)
                throws LMSException;

    /**
     * Finds the locations included in the input location.
     * <p>
     * This method searches all the included locations for the input location. Eg: if the input location is
     * Country, it finds all the City and Airports for the country.
     * <p>
     * To find the included locations codes user must provide following input:
     * <li>sourceCode</li>
     * <li>sourceType</li><br>
     * <li>sourceMemberType</li><br>
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
     * @param pAggregateLocationFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest
     *            AggregateLocationFindRequest}</code><br>
     *            <code> includes the below attributes to find <included locations for the given location.</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest#setSourceCode
     *            sourceCode} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest#setSourceType
     *            sourceType} - (M)</code></li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest#setSourceMemberType
     *            sourceMemberType} - (C)
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindResponse
     *         AggregateLocationFindResponse}</code>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindResponse#setFoundLocations
     *         foundLocations}</code> list of included location codes</li>
     *         </ul>
     * @throws LMSException
     *             If any error occurs. Returned CodeMessage contains the status
     *             code, human readable message, and message type.
     */
    AggregateLocationFindResponse getIncludedLocationsForTariff(
                AggregateLocationFindRequest pAggregateLocationFindRequest)
                throws LMSException;

    /**
     * Finds <code>Country Aggregates</code> for the input City and Country.
     * <p>
     * This method searches Country Aggregates that contain the input City in their list of included members
     * and input Country as their base and returns their aggregate codes.
     * <p>
     * To find the Country Aggregate codes user must provide following input:
     * <li>sourceCode</li>
     * <li>countryCode</li><br>
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
     * @param pAggregateLocationFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest
     *            AggregateLocationFindRequest}</code><br>
     *            includes the below attributes to find <code>Aggregate</code>s
     *            for the given location.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest#setSourceCode
     *            sourceCode} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest#setCountryCode
     *            countryCode} - (M)</code></li>
     *            </ul>
     *            <p>
     * @return <code> {@link java.util.List List} of Country Aggregate Codes </code>.
     * @throws LMSException
     *             If any error occurs. Returned CodeMessage contains the status
     *             code, human readable message, and message type.
     */
    List<String> findCountryAggregatesForTariffLocation(
                AggregateLocationFindRequest pAggregateLocationFindRequest)
                throws LMSException;

    /**
     * Validates whether input source location is within target location.
     * <p>
     * This method validates whether the input source location is same or within the target location. It
     * returns true when any of the below conditions are true
     * <ul>
     * <li>sourceType is having same hierarchy as targetType and sourceCode is same as targetCode</li><br/>
     * Eg: both source and target are of type Country and having code US.<br/>
     * <br/>
     * <li>sourceType is lesser in hierarchy than targetType and source location is a child of target location
     * </li><br/>
     * Eg: source is MSP(City) and target is US(Country).
     * </ul>
     * <p>
     * To validate the locations user must provide following input:
     * <li>sourceCode</li>
     * <li>sourceType</li>
     * <li>sourceMemberType</li>
     * <li>targetCode</li>
     * <li>targetType</li>
     * <li>targetMemberType</li><br>
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
     * @param pAggregateLocationFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest
     *            AggregateLocationFindRequest}</code><br>
     *            includes the below attributes to find <code>Aggregate</code>s
     *            for the given location.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest#setSourceCode
     *            sourceCode} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest#setSourceType
     *            sourceType} - (M)</code></li><li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest#setSourceMemberType
     *            sourceMemberType} - (C)</code></li><li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest#setTargetCode
     *            targetCode} - (M)</code></li><li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest#setTargetType
     *            targetType} - (M)</code></li><li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest#setTargetMemberType
     *            targetMemberType} - (C)</code></li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindResponse
     *         AggregateLocationFindResponse}</code>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindResponse#getSourceInTarget()
     *         sourceInTarget}</code> </li>
     *         </ul>
     * @throws LMSException
     *             If any error occurs. Returned CodeMessage contains the status
     *             code, human readable message, and message type.
     */
    AggregateLocationFindResponse isSourceLocationWithinTargetLocation(
                AggregateLocationFindRequest pAggregateLocationFindRequest)
                throws LMSException;

    /**
     * This method finds the Aggregate.
     * <p>
     * This method finds the Aggregate Details for a given Aggregate code The AggregateDto will have the
     * information of BaseAggregateCode, BaseAggregateType, AggregateCode, AggregateMember'sType
     * AggregateExclusion Indicator and Aggregate Member's.
     * 
     * @param pBatchRequest
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code>
     *            </ul>
     * @return aBatchResponse
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code>
     *         </ul>
     * @throws LMSException
     *             If any error occurs. Returned CodeMessage contains the status
     *             code, human readable message, and message type.
     */
    BatchResponse findAggregateByAggregateCode(BatchRequest pBatchRequest) throws LMSException;

    /**
     * This method finds the Aggregate and RCA for PFM.
     * <p>
     * This method finds the Aggregate Details for a given Aggregate code The AggregateDto will have the
     * information of BaseAggregateCode, BaseAggregateType, AggregateCode, AggregateMember'sType
     * AggregateExclusion Indicator and Aggregate Member's.
     * 
     * @param pAggregateLocationFindRequest
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateLocationFindRequest
     *            AggregateLocationFindRequest}</code>
     *            </ul>
     * @return List of String.
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code>
     *         </ul>
     * @throws LMSException
     *             If any error occurs. Returned CodeMessage contains the status
     *             code, human readable message, and message type.
     */
    List<String> findAggregatesAndRca(AggregateLocationFindRequest pAggregateLocationFindRequest)
                throws LMSException;
}
