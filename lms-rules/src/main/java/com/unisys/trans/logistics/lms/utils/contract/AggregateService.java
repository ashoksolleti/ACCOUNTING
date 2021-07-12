/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
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
import com.unisys.trans.logistics.lms.utils.dto.AggregateDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.AggregateDto;
import com.unisys.trans.logistics.lms.utils.dto.AggregateFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.AggregatePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.AggregateResponse;
import com.unisys.trans.logistics.lms.utils.dto.AggregateRestoreRequest;

/**
 * <code>AggregateService</code> interface exposes the APIs which identifies various processing flows involved
 * in maintaining aggregate. These APIs are also used for maintaining RateConstructionArea(RCA).
 * <p>
 * An Aggregate is a group of sub areas, regions, countries, or cities that are treated as a single unit.
 * Aggregates are used to divide the world into geographical groups for marketing purposes. Aggregates are
 * also used to configure Other Charge data and terminal offload groups.The aggregates comprises of an
 * aggregate code and an optional aggregate type. The aggregate type is used to further qualify an aggregate
 * to be considered during a specific processing.
 * <p>
 * The rate construction areas are either IATA or user-defined areas. A rate construction area is an area,
 * subarea, region, country, or city used to create/update add-on rates (UC196 Maintain Add -on Rates).
 * <p>
 * This performs the following functions.<br>
 * <ul>
 * <li>Creates the Aggregate/RCA.
 * <li>Deletes the Aggregate/RCA.
 * <li>Finds the Aggregate/RCA.
 * <li>Updates the Aggregate/RCA.
 * <li>Restores the Aggregate/RCA.
 * </ul>
 * <P>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.AggregateDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.AggregateFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.AggregatePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.AggregateDto
 */
public interface AggregateService {
    /**
     * Creates the <code>Aggregate</code> / <code>RCA<code/>.
     * <p>
     * This method creates an Aggregate / RCA based on rcaIndicator.<p>
     * If rcaIndicator is false (Aggregate):<ul>
     * <li>Validates the input Included / Excluded members and creates an Aggregate with the members.</li></ul>
     * If rcaIndicator is true (RCA):
     * <ul><li>Validates the input Included and Excluded members and creates a RCA with the members.</li></ul> 
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findAggregate
     * findAggregate}<br>
     * <p>
     * To create the Aggregate/RCA user must provide following input:<br>
     * <li>code
     * <li>baseAggregateCode
     * <li>baseAggregateType
     * <li>aggregateMembers
     * <li>description
     * <li>tariffRateIndicator
     * <li>rcaIndicator
     * <li>usageType
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AGGREGATESERVICE_ENTITY_ALREADY_EXIST AGGREGATESERVICE_ENTITY_ALREADY_EXIST}</code>
     * </td> <td align="left">Aggregate already exist.</td> </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#SUBAREA_WITHIN_AGGREGATE_MEMBERSHIP_AREA SUBAREA_WITHIN_AGGREGATE_MEMBERSHIP_AREA}</code>
     * </td>
     * <td align="left">The Sub areas must be within the Aggregate Membership Area.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#REGION_WITHIN_AGGREGATE_MEMBERSHIP REGION_WITHIN_AGGREGATE_MEMBERSHIP}</code>
     * </td>
     * <td align="left">The Region must be within Aggregate Membership Area/Sub area.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_WITHIN_AGGREGATE_MEMBERSHIP COUNTRY_WITHIN_AGGREGATE_MEMBERSHIP}</code>
     * </td>
     * <td align="left">The Country must be within Aggregate Membership Area/Sub area/Region.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CITY_WITHIN_AGGREGATE_MEMBERSHIP CITY_WITHIN_AGGREGATE_MEMBERSHIP}</code>
     * </td>
     * <td align="left">The City must be within Aggregate Membership Area/Sub area/Region/Country.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ALL_AGGREGATE_ALREADY_EXISTS ALL_AGGREGATE_ALREADY_EXISTS}</code>
     * </td>
     * <td align="left">This Aggregate information already exists.</td>
     * </tr>
     * 
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_ALREADY_EXISTS RCA_ALREADY_EXISTS}</code>
     * </td>
     * <td align="left">RCA already exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_INCL_EXCL_NOT_WITHIN_IATA RCA_INCL_EXCL_NOT_WITHIN_IATA}</code>
     * </td>
     * <td align="left">Inclusion/Exclusion is not within IATA Area.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_EXCLUSION_WITHIN_EXCLUSION RCA_EXCLUSION_WITHIN_EXCLUSION}</code>
     * </td>
     * <td align="left">Exclusion within a previously specified Exclusion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_INCLUSION_WITHIN_INCLUSION RCA_INCLUSION_WITHIN_INCLUSION}</code>
     * </td>
     * <td align="left">Inclusion within a previously specified Inclusion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_EXCLUSION_LOWER_TO_INCLUSION RCA_EXCLUSION_LOWER_TO_INCLUSION}</code>
     * </td>
     * <td align="left">Exclusions must be within Inclusions.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_SAME_AS_ANOTHER_RCA RCA_SAME_AS_ANOTHER_RCA}</code>
     * </td>
     * <td align="left">This Rate Construction Area information already exists with Rate Construction Area
     * Code.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pAggregatePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregatePersistRequest
     *            AggregatePersistRequest}</code><br>
     *            includes the attributes to update an <code>Aggregate </code>. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto
     *            AggregateDto} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setOId
     *            oId} - (P)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setTariffRateIndicator
     *            tariffRateIndicator} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setCode
     *            code} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setDescription
     *            description} - (O)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setRcaIndicator
     *            rcaIndicator} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setDeleteDate
     *            deleteDate} - (P)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setUsageType
     *            usageType} - (O)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setBaseAggregateCode
     *            baseAggregateCode} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setBaseAggregateType
     *            baseAggregateType} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(P)</code></li> </li><li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setAggregateMembers
     *            aggregateMembers} -(M)
     *            <ul>
     *            <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateMemberDto#setExclusionIndicator
     *            exclusionIndicator} -(M) </li> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateMemberDto#setMemberCodes
     *            memberCodes} -(M) </li> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateMemberDto#setMemberType
     *            memberType} -(M) </li>
     *            </ul>
     *            </code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateResponse
     *         AggregateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code></li> holds the CodeMessage
     *         <ul>
     *         <li>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AGGREGATE_CREATE_SUCCESSFUL
     *         AGGREGATE_CREATE_SUCCESSFUL} <code>for successful creation of Aggregate.</code></li> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_CREATED
     *         RCA_CREATED} <code>for successful creation of RCA.</code></li>
     *         </ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateResponse#getAggregateDto()
     *         AggregateDto} - (1:*)</code></li> </ul>
     * @throws LMSException If creation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    AggregateResponse createAggregate(AggregatePersistRequest pAggregatePersistRequest)
                throws LMSException;

    /**
     * Deletes the <code>Aggregate</code> / <code>RCA<code/>.
     * <p>
     * This method deletes an Aggregate / RCA based on rcaIndicator.<p>
     * If rcaIndicator is false (Aggregate):<ul>
     * <li>Deletes Aggregate.</li></ul>
     * If rcaIndicator is true (RCA):
     * <ul><li>Deletes RCA.</li></ul> 
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#restoreAggregate
     * restoreAggregate}<br>
     * <p>
     * To delete the Aggregate/RCA user must provide following input:<br>
     * <li>oId
     * <li>rcaIndicator
     * <li>endDate
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_AGGREGATE_CODE_MATCH NO_AGGREGATE_CODE_MATCH}</code>
     * </td> <td align="left">The input Aggregate code does not exist in the system.</td> </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AGGREGATE_CODE_MARKED_FOR_DELETION AGGREGATE_CODE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">The Aggregate code is marked for deletion.</td>
     * </tr>
     * 
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_DOES_NOT_EXIST RCA_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The Rate Construction Area Code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_ALREADY_DELETED RCA_ALREADY_DELETED}</code>
     * </td>
     * <td align="left">The Rate Construction Area is already marked for deletion.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pAggregateDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDeleteRequest
     *            AggregateDeleteRequest}</code><br>
     *            includes the below attributes to delete an <code>Aggregate </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDeleteRequest#setOId
     *            oId} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDeleteRequest#setRcaIndicator
     *            rcaIndicator} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDeleteRequest#setEndDate
     *            endDate} - (M)</code></li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateResponse
     *         AggregateResponse}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}</code>
     *         </li> holds the CodeMessage <li>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AGGREGATE_MARKED_DELETE_SUCCESSFUL
     *         AGGREGATE_MARKED_DELETE_SUCCESSFUL} </code> <br>
     *         <code>for successful delete of Aggregate.</code> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_MARKED_FOR_DELETE
     *         RCA_MARKED_FOR_DELETE} <code>for successful delete of RCA.</code></li>
     * @throws LMSException If delete fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    AggregateResponse deleteAggregate(AggregateDeleteRequest pAggregateDeleteRequest) throws LMSException;

    /**
     * Finds the <code>Aggregate</code><code>RCA</code>.
     * <p>
     * This method finds an Aggregate / RCA based on rcaIndicator.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findCustomAggregate
     * findCustomAggregate}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findIATAAggregate
     * findIATAAggregate}<br>
     * <p>
     * To find the Aggregate/RCA user must provide following input:
     * <li>code</li><br>
     * If code is not input, this method returns all the Aggregates.
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_AGGREGATE_CODE_MATCH NO_AGGREGATE_CODE_MATCH}</code>
     * </td>
     * <td align="left">The input Aggregate code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AGGREGATE_CODE_MARKED_FOR_DELETION AGGREGATE_CODE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">The Aggregate code is marked for deletion.</td>
     * </tr>
     * 
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_DOES_NOT_EXIST RCA_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The Rate Construction Area Code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_MARKED_FOR_DELETE RCA_MARKED_FOR_DELETE}</code>
     * </td>
     * <td align="left">The Rate Construction Area is marked for deletion.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pAggregateFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateFindRequest
     *            AggregateFindRequest}</code><br>
     *            includes the below attributes to find an <code>Aggregate </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateFindRequest#setCode
     *            code} - (O)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateFindRequest#setRcaIndicator
     *            rcaIndicator} - (M)</code></li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateResponse
     *         AggregateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateResponse#getAggregateDto()
     *         AggregateDto} - (1:*)</code></li>
     *         </ul>
     * @throws LMSException If find fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    AggregateResponse findAggregate(AggregateFindRequest pAggregateFindRequest) throws LMSException;

    /**
     * Finds all <code>Aggregate / RCA</code>.
     * <p>
     * This method finds all Aggregate / RCAs defined in the system.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findCustomAggregate
     * findCustomAggregate}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findAggregate
     * findAggregate}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findIATAAggregate
     * findIATAAggregate}<br>
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
     * @param pAggregateFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateFindRequest
     *            AggregateFindRequest}</code><br>
     *            <ul>
     *            <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateFindRequest#getRcaIndicator()
     *            rcaIndicator}</code> to denote whether Aggregate / RCA</li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateResponse
     *         AggregateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateResponse#getAggregateDto()
     *         AggregateDto} - (1:*)</code></li>
     *         </ul>
     * @throws LMSException If find fails. Returned
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    AggregateResponse findAllAggregates(AggregateFindRequest pAggregateFindRequest) throws LMSException;

    /**
     * Finds multiple <code>Aggregates</code>.
     * <p>
     * This method finds multiple Aggregates based on the search inputs given in the request.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findAggregate
     * findAggregate}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findCustomAggregate
     * findCustomAggregate}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findIATAAggregate
     * findIATAAggregate}<br>
     * <p>
     * To find the Aggregate user must provide following input:
     * <li>searchInputs</li><br>
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
     * @param pMultipleFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.MultipleFindRequest
     *            MultipleFindRequest}</code><br>
     *            includes the below attributes to find <code>Aggregates</code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M)</code></li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects()
     *         retrievedObjects}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto
     *         AggregateDto}</code></li>
     *         </ul>
     *         </li>
     *         </ul>
     * @throws LMSException If find fails. Returned
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    MultipleFindResponse findAggregateInformation(MultipleFindRequest pMultipleFindRequest)
                throws LMSException;

    /**
     * Finds multiple user defined <code>Aggregates</code>.
     * <p>
     * This method finds multiple user defined Aggregates based on the search inputs given in the request.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findAggregate
     * findAggregate}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findAggregateInformation
     * findAggregateInformation}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findIATAAggregate
     * findIATAAggregate}<br>
     * <p>
     * To find the custom Aggregate user must provide following input:
     * <li>searchInputs</li><br>
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
     * @param pMultipleFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest
     *            MultipleFindRequest}</code><br>
     *            includes the below attributes to find user defined <code>Aggregates</code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M)</code></li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects()
     *         retrievedObjects}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto
     *         AggregateDto}</code></li>
     *         </ul>
     *         </li>
     *         </ul>
     * @throws LMSException If find fails. Returned
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    MultipleFindResponse findCustomAggregate(MultipleFindRequest pMultipleFindRequest) throws LMSException;

    /**
     * Finds multiple IATA defined <code>Aggregates</code>.
     * <p>
     * This method finds multiple IATA defined Aggregates based on the search inputs given in the request.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findAggregate
     * findAggregate}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findAggregateInformation
     * findAggregateInformation}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findCustomAggregate
     * findCustomAggregate}<br>
     * <p>
     * To find the IATA Aggregate user must provide following input:
     * <li>searchInputs</li><br>
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
     * @param pMultipleFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.MultipleFindRequest
     *            MultipleFindRequest}</code><br>
     *            includes the below attributes to find user defined <code>Aggregates</code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M)</code></li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects()
     *         retrievedObjects}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto
     *         AggregateDto}</code></li>
     *         </ul>
     *         </li>
     *         </ul>
     * @throws LMSException If find fails. Returned
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    MultipleFindResponse findIATAAggregate(MultipleFindRequest pMultipleFindRequest) throws LMSException;

    /**
     * Finds <code>IATA Region Aggregate</code>.
     * <p>
     * This method finds the IATA Region for the input region code.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findAggregate
     * findAggregate}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findAggregateInformation
     * findAggregateInformation}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findIATAAggregate
     * findIATAAggregate}<br>
     * <p>
     * To find the IATA Aggregate user must provide following input:
     * <li>regionCode</li><br>
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
     * @param pIataRegionCode <code>  region code to be searched for</code><br>
     * @return <code>{@link java.util.List List} of</code>
     *         <ul>
     *         <li> <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto
     *         AggregateDto} </code></li>
     *         </ul>
     * @throws LMSException If find fails. Returned CodeMessage contains the status code, human readable
     *             message, and message type.
     */
    List<AggregateDto> findIATARegionInformation(String pIataRegionCode) throws LMSException;

    /**
     * Restores the <code>Aggregate</code> / <code>RCA<code/>.
     * <p>
     * This method restores an Aggregate / RCA based on rcaIndicator.<p>
     * If rcaIndicator is false (Aggregate):<ul>
     * <li>Restores Aggregate.</li></ul>
     * If rcaIndicator is true (RCA):
     * <ul><li>Restores RCA.</li></ul> 
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#deleteAggregate
     * deleteAggregate}<br>
     * <p>
     * To restore the Aggregate/RCA user must provide following input:<br>
     * <li>oId
     * <li>code
     * <li>rcaIndicator
     * <li>usageType
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_AGGREGATE_CODE_MATCH NO_AGGREGATE_CODE_MATCH}</code>
     * </td> <td align="left">The input Aggregate code does not exist in the system.</td> </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AGGREGATE_CODE_NOT_MARKED_FOR_DELETION AGGREGATE_CODE_NOT_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">The Aggregate code is not marked for deletion.</td>
     * </tr>
     * 
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_DOES_NOT_EXIST RCA_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The Rate Construction Area Code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_NOT_DELETED_CANT_RESTORE RCA_NOT_DELETED_CANT_RESTORE}</code>
     * </td>
     * <td align="left">The restoration must not be done if the rate construction area is not marked for
     * deletion.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pAggregateRestoreRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateRestoreRequest
     *            AggregateRestoreRequest}</code><br>
     *            includes the below attributes to restore an <code>Aggregate </code> / <code>RCA</Code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateRestoreRequest#setOId
     *            oId} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateRestoreRequest#setCode
     *            code} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateRestoreRequest#setRcaIndicator
     *            rcaIndicator} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateRestoreRequest#setUsageType
     *            usageType} - (O)</code></li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateResponse
     *         AggregateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code></li> holds the CodeMessage <li>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AGGREGATE_RESTORE_SUCCESSFUL
     *         AGGREGATE_RESTORE_SUCCESSFUL} </code> <br>
     *         <code>for successful restore of Aggregate.</code> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_RESTORED
     *         RCA_RESTORED} <code>for successful restore of RCA.</code></li>
     *         </ul>
     * @throws LMSException If restore fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    AggregateResponse restoreAggregate(AggregateRestoreRequest pAggregateRestoreRequest)
                throws LMSException;

    /**
     * Updates the <code>Aggregate</code> / <code>RCA<code/>.
     * <p>
     * This method updates an Aggregate / RCA based on rcaIndicator.<p>
     * If rcaIndicator is false (Aggregate):<ul>
     * <li>Validates the input Included / Excluded members and updates an Aggregate with the members.</li></ul>
     * If rcaIndicator is true (RCA):
     * <ul><li>Validates the input Included and Excluded members and updates a RCA with the members.</li></ul> 
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#createAggregate
     * createAggregate}<br>
     * <p>
     * To update the Aggregate/RCA user must provide following input:<br>
     * <li>oId
     * <li>code
     * <li>baseAggregateCode
     * <li>baseAggregateType
     * <li>aggregateMembers
     * <li>description
     * <li>tariffRateIndicator
     * <li>rcaIndicator
     * <li>usageType
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_AGGREGATE_CODE_MATCH NO_AGGREGATE_CODE_MATCH}</code>
     * </td> <td align="left">The input Aggregate code does not exist in the system.</td> </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AGGREGATE_UPDATE_SUCCESSFUL AGGREGATE_UPDATE_SUCCESSFUL}</code>
     * </td>
     * <td align="left">Aggregate updated.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#SUBAREA_WITHIN_AGGREGATE_MEMBERSHIP_AREA SUBAREA_WITHIN_AGGREGATE_MEMBERSHIP_AREA}</code>
     * </td>
     * <td align="left">The Sub areas must be within the Aggregate Membership Area.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#REGION_WITHIN_AGGREGATE_MEMBERSHIP REGION_WITHIN_AGGREGATE_MEMBERSHIP}</code>
     * </td>
     * <td align="left">The Region must be within Aggregate Membership Area/Sub area.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_WITHIN_AGGREGATE_MEMBERSHIP COUNTRY_WITHIN_AGGREGATE_MEMBERSHIP}</code>
     * </td>
     * <td align="left">The Country must be within Aggregate Membership Area/Sub area/Region.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CITY_WITHIN_AGGREGATE_MEMBERSHIP CITY_WITHIN_AGGREGATE_MEMBERSHIP}</code>
     * </td>
     * <td align="left">The City must be within Aggregate Membership Area/Sub area/Region/Country.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ALL_AGGREGATE_ALREADY_EXISTS ALL_AGGREGATE_ALREADY_EXISTS}</code>
     * </td>
     * <td align="left">This Aggregate information already exists.</td>
     * </tr>
     * 
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_DOES_NOT_EXIST RCA_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The Rate Construction Area Code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_UPDATED RCA_UPDATED}</code>
     * </td>
     * <td align="left">The Rate Construction Area is updated.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_INCL_EXCL_NOT_WITHIN_IATA RCA_INCL_EXCL_NOT_WITHIN_IATA}</code>
     * </td>
     * <td align="left">Inclusion/Exclusion is not within IATA Area.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_EXCLUSION_WITHIN_EXCLUSION RCA_EXCLUSION_WITHIN_EXCLUSION}</code>
     * </td>
     * <td align="left">Exclusion within a previously specified Exclusion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_INCLUSION_WITHIN_INCLUSION RCA_INCLUSION_WITHIN_INCLUSION}</code>
     * </td>
     * <td align="left">Inclusion within a previously specified Inclusion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_EXCLUSION_LOWER_TO_INCLUSION RCA_EXCLUSION_LOWER_TO_INCLUSION}</code>
     * </td>
     * <td align="left">Exclusions must be within Inclusions.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_SAME_AS_ANOTHER_RCA RCA_SAME_AS_ANOTHER_RCA}</code>
     * </td>
     * <td align="left">This Rate Construction Area information already exists with Rate Construction Area
     * Code.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pAggregatePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregatePersistRequest
     *            AggregatePersistRequest}</code><br>
     *            includes the attributes to update an <code>Aggregate </code>. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto
     *            AggregateDto} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setOId
     *            oId} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setTariffRateIndicator
     *            tariffRateIndicator} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setCode
     *            code} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setDescription
     *            description} - (O)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setRcaIndicator
     *            rcaIndicator} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setDeleteDate
     *            deleteDate} - (P)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setUsageType
     *            usageType} - (O)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setBaseAggregateCode
     *            baseAggregateCode} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setBaseAggregateType
     *            baseAggregateType} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(P)</code></li> </li><li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateDto#setAggregateMembers
     *            aggregateMembers} -(M)
     *            <ul>
     *            <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateMemberDto#setExclusionIndicator
     *            exclusionIndicator} -(M) </li> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateMemberDto#setMemberCodes
     *            memberCodes} -(M) </li> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateMemberDto#setMemberType
     *            memberType} -(M) </li>
     *            </ul>
     *            </code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateResponse
     *         AggregateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code></li> holds the CodeMessage
     *         <ul>
     *         <li>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AGGREGATE_UPDATE_SUCCESSFUL
     *         AGGREGATE_UPDATE_SUCCESSFUL} <code>for successful update of Aggregate.</code></li> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_UPDATED
     *         RCA_UPDATED} <code>for successful update of RCA.</code></li>
     *         </ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateResponse#getAggregateDto()
     *         AggregateDto} - (1:*)</code></li> </ul>
     * @throws LMSException If update fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    AggregateResponse updateAggregate(AggregatePersistRequest pAggregatePersistRequest)
                throws LMSException;

    /**
     * Validates <code>IATA Aggregates</code>.
     * <p>
     * This method searches IATA Aggregates for the input aggregate codes and returns the codes that are
     * valid.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findAggregate
     * findAggregate}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findIATAAggregate
     * findIATAAggregate}<br>
     * <p>
     * To validate the IATA Aggregate codes user must provide following input:
     * <li>searchInputs</li><br>
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
     * @param pValidationRequest <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
     *            ValidationRequest}</code><br>
     *            includes the below attributes to find <code>IATA Aggregates</code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M)</code></li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse}</code>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs()
     *         validInputs}</code> </li>
     *         </ul>
     * @throws LMSException If any error occurs. Returned
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    ValidationResponse validateAggregates(ValidationRequest pValidationRequest) throws LMSException;

    /**
     * Validates Country and City <code>Aggregates</code>.
     * <p>
     * This method searches Country and City Aggregates for the input aggregate codes and returns the codes
     * that are valid.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findAggregate
     * findAggregate}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findIATAAggregate
     * findIATAAggregate}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#validateAggregates
     * validateAggregates}<br>
     * <p>
     * To validate the Country and City Aggregate codes user must provide following input:
     * <li>searchInputs</li><br>
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
     * @param pUsageTypeRequest <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
     *            ValidationRequest}</code><br>
     *            includes the below attributes to find <code>IATA Aggregates</code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M)</code></li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse}</code>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs()
     *         validInputs}</code> </li>
     *         </ul>
     * @throws LMSException If any error occurs. Returned
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    ValidationResponse validateCountryCityAggregatesByUsageTypes(ValidationRequest pUsageTypeRequest)
                throws LMSException;

    /**
     * This method deletes an aggegate/RCA.
     * 
     * @param pAggregatePersistRequest
     *            holds the persist request.
     * @throws LMSException If any error occurs. Returned
     *             CodeMessage contains the status code, human readable message, and message type.
     * 
     */
    void removeAggregate(AggregatePersistRequest pAggregatePersistRequest) throws LMSException;
    /**
     * Finds the <code>Aggregate</code><code>RCA</code>.
     * <p>
     * This method finds an Aggregate / RCA based on rcaIndicator.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findCustomAggregate
     * findCustomAggregate}<br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AggregateService#findIATAAggregate
     * findIATAAggregate}<br>
     * <p>
     * To find the Aggregate/RCA user must provide following input:
     * <li>code</li><br>
     * If code is not input, this method returns all the Aggregates.
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_AGGREGATE_CODE_MATCH NO_AGGREGATE_CODE_MATCH}</code>
     * </td>
     * <td align="left">The input Aggregate code does not exist in the system.</td>
     * </tr>
     * 
     * 
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#RCA_DOES_NOT_EXIST RCA_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The Rate Construction Area Code does not exist in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pAggregateFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateFindRequest
     *            AggregateFindRequest}</code><br>
     *            includes the below attributes to find an <code>Aggregate </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateFindRequest#setCode
     *            code} - (O)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AggregateFindRequest#setRcaIndicator
     *            rcaIndicator} - (M)</code></li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateResponse
     *         AggregateResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AggregateResponse#getAggregateDto()
     *         AggregateDto} - (1:*)</code></li>
     *         </ul>
     * @throws LMSException If find fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    
    AggregateResponse findAggregateByCode(AggregateFindRequest pAggregateFindRequest)
                throws LMSException;
    
    AggregateResponse findAggregateBylastUpdatedDate(AggregateFindRequest pAggregateFindRequest)
    			throws LMSException;

	AggregateResponse findAggregates(AggregateFindRequest pAggregateFindRequest) throws LMSException;
	
	AggregateResponse findCitiesByAggregateCode(AggregateFindRequest pAggregateFindRequest)
            throws LMSException;
}
