/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.dto.ExtractRequest;
import com.unisys.trans.logistics.lms.framework.dto.RequestHeader;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantAccNumValidatorResponse;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.ContractDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.ContractDto;
import com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.ContractPersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.ContractResponse;
import com.unisys.trans.logistics.lms.rating.dto.ContractRestoreRequest;
import com.unisys.trans.logistics.lms.rating.dto.ExtractResponse;

/**
 * <code>ContractService</code> provides for Contract version management,
 * It has methods that can create,delete,update,restore,historicize and purge contracts.<br>
 * Each contract version will have one of the following statuses.
 * <table border="0" cell spacing="0" cell padding="5">
 * <tr>
 * <td align="left">{@link com.unisys.trans.logistics.lms.rating.dto.constants.ContractStatusType#ACTIVE
 * ACTIVE}
 * <td>
 * <td align="left">Indicates the contract is active.
 * <td>
 * </tr>
 * <tr>
 * <td align="left">{@link com.unisys.trans.logistics.lms.rating.dto.constants.ContractStatusType#DELETED
 * DELETED}
 * <td>
 * <td align="left">Indicates the contract is deleted,but not purged
 * <td>
 * </tr>
 * <tr>
 * <td align="left">{@link com.unisys.trans.logistics.lms.rating.dto.constants.ContractStatusType#PENDING
 * PENDING}
 * <td>
 * <td align="left">Indicates the contract is pending,i.e effective and expiration date is in future.
 * <td>
 * </tr>
 * <tr>
 * <td align="left">{@link com.unisys.trans.logistics.lms.rating.dto.constants.ContractStatusType#HISTORY
 * HISTORY}
 * <td>
 * <td align="left">Indicates one of the historical record of the contract.A contract can have one or more
 * history record.
 * <td>
 * </tr>
 * <tr>
 * <td align="left">{@link com.unisys.trans.logistics.lms.rating.dto.constants.ContractStatusType#EXPIRED
 * EXPIRED}
 * <td>
 * <td align="left">Indicates the contract is no longer effective.
 * <td>
 * </tr>
 * </table>
 * <p>
 * If the input contract version does not exist,then a contract version is created with the given contract
 * number.<br>
 * Every time a contract version is updated,the current contract version is marked as history, a new version
 * is created with the updated content,the new version will be marked as active,only active records can be
 * updated.<br>
 * A contract version with a future effective and expiration date is deemed pending.<br>
 * If a pending contract version is deleted, the data is purged(permanent delete).<br>
 * If an active record is deleted,the status of the record is marked deleted,but the version will still exist
 * and can be restored<br>
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>create ContractVersion.
 * <li>delete ContractVersion.
 * <li>find Contract By ContractNumber.
 * <li>find Contract By ParticipantAccount.
 * <li>find contractVersion.
 * <li>update ContractVersion
 * <li>restore ContractVersion
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.ContractPersistRequest ContractPersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ContractDeleteRequest ContractDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest ContractFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ContractRestoreRequest ContractRestoreRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ContractResponse
 *      ContractResponse
 */
public interface ContractService {

    /**
     * Creates a new <code>ContractVersion</code>.
     * <p>
     * This method creates a new ContractVersion. <br>
     * If no contract number is provided ,a contract number is automatically generated using system date and
     * time in the format ddmmyyhhmmss.<br>
     * If the system finds a contract version with the input contract number it will throw a contract number
     * already exists error message.<br>
     * If the input contract number is not found, a new contract is created.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.ContractService#findContract
     * findContract}<br>
     * <p>
     * To create the ContractVersion user must provide following input:<br>
     * <li>agentCommissionInd<br>
     * <li>allDestinationInd<br>
     * <li>allOriginInd<br>
     * <li>biDirectionalInd<br>
     * <li>carriers<br>
     * <li>contractFlightDto<br>
     * <li>contractPriorityType<br>
     * <li>contractRateEntryDtos<br>
     * <li>contractVersion<br>
     * <li>currencyCode<br>
     * <li>defaultWtUnit<br>
     * <li>destination<br>
     * <li>destOriginPaycode<br>
     * <li>DateRangeDto<br>
     * <li>origin<br>
     * <li>rateConstructionInd<br>
     * <li>routeCompressionInd<br>
     * <li>specialNotes<br>
     * <li>status<br>
     * <li>originDestinationPayCode<br>
     * <li>destOriginPayCode<br>
     * <li>rateConstructionInd<br>
     * <li>userAudit<br>
     * <li>splcodes<br>
     * <li>splCodeRule<br>
     * <li>enforcedHurdleInd<br>
     * <li>contractId<br>
     * <li>oId<br>
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
     * <table border="1" cell spacing="0" cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE 
     * EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE}</code></td>
     * <td align="left">Expiration date must be equal or greater than effective date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_NUMBER_ALREADY_EXIST 
     * CONTRACT_NUMBER_ALREADY_EXIST}</code></td>
     * <td align="left">Contract Number already exist.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_NUMBER_MUST_ALPHANUMERIC CONTRACT_NUMBER_MUST_ALPHANUMERIC}</code>
     * </td>
     * <td align="left">The Contract Number must be 1-12 alphanumeric characters.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_EXPIRATION_DATE_NOT_PRECEDE_SYSDATE CONTRACT_EXPIRATION_DATE_NOT_PRECEDE_SYSDATE}</code>
     * </td>
     * <td align="left">Expiration date must not precede current date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_ENFORCE_HURLDERATE_NOT_ALLOWED_IF_REVENUE_MANAGEMENT CONTRACT_ENFORCE_HURLDERATE_NOT_ALLOWED_IF_REVENUE_MANAGEMENT}</code>
     * </td>
     * <td align="left">The Enforce Hurdle Rates is not allowed if Revenue Management Interface dynamic
     * parameter value is N.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#AIRPORT_CODE_DOES_NOT_EXIST AIRPORT_CODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The given Airport Code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#AIRPORT_MARKED_FOR_DELETION AIRPORT_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">The given Airport Code is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CITY_CODE_DOES_NOT_EXIST CITY_CODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The given City Code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CITY_CODE_MARKED_FOR_DELETION CITY_CODE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">The City Code is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#AGGREGATE_DOES_NOT_EXIST AGGREGATE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The Aggregate does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#AGGREGATE_MARKED_FOR_DELETION AGGREGATE_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">The Aggregate is marked for deletion.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pContractPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractPersistRequest
     *            ContractPersistRequest}</code><br>
     *            includes the attributes to create a <code>Contract</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *            ContractDto} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setUserAudit
     *            UserAudit} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setStatus
     *            Status} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setSplCodes
     *            SplCodes} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setSplCodeRule
     *            SplCodeRule} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setSpecialNotes
     *            SpecialNotes} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setRouteCompressionInd
     *            RouteCompressionInd} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setRateConstructionInd
     *            RateConstructionInd} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setOriginDestPayCode
     *            OriginDestPayCode} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setOrigin
     *            Origin} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setOId
     *            OId} - (C)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setMultiSegmentRouteDtos
     *            MultiSegmentRouteDtos} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setEnforceHurdleInd
     *            EnforceHurdleInd} - (C)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setDestOriginPayCode
     *            DestOriginPaycode} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setDestination
     *            Destination} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setDefaultWtUnit
     *            DefaultWtUnit} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setDateRangeDto
     *            DateRangeDto} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setCurrencyCode
     *            CurrencyCode} - (C)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractRateEntryDtos
     *            ContractRateEntryDtos} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractPriorityType
     *            ContractPriorityType} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractParticipantDtos
     *            ContractparticipantDtos} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractId
     *            ContractId} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractFlightDto
     *            ContractFlightDto} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractAllotmentDto
     *            ContractAllotmentDto} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setCarriers
     *            Carriers} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setBiDirectionalInd
     *            BiDirectionalInd} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setAllOriginInd
     *            AllOriginInd} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setAllDestinationInd
     *            AllDestinationInd} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setAgentCommissionInd
     *            AgentCommissionInd} - (O)</code> <br>
     *            * {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)<br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse
     *         ContractResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_CREATED_SUCCESSFULLY
     *         CONTRACT_CREATED_SUCCESSFULLY} </code> <br>
     *         <code>for successful create.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse#getContractDto()
     *         ContractDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *         ContractDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the context validation or any business rules fails or if the given contract
     *             number already exists then,any of the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    ContractResponse createContractVersion(ContractPersistRequest pContractPersistRequest)
                throws LMSException;

    /**
     * Deletes the Contract.
     * <p>
     * This functions deletes the Contract.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.ContractService#restoreContractVersion
     * restoreContractVersion}<br>
     * <p>
     * To delete the Contract user must provide following input:<br>
     * <li>contractOId.<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_NUMBER_DOES_NOT_EXIST CONTRACT_NUMBER_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Contract number does not exists.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pContractDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDeleteRequest
     *            ContractDeleteRequest}</code><br>
     *            includes the attributes to find a <code>Contract </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *            Contract} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDeleteRequest#setContractOId
     *            ContractOId} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse
     *         ContractResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_DELETED_SUCCESSFULLY
     *         CONTRACT_DELETED_SUCCESSFULLY} </code> <br>
     *         <code>for successful delete.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse#getContractDto()
     *         ContractDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *         ContractDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails , above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    ContractResponse deleteContractVersion(ContractDeleteRequest pContractDeleteRequest) throws LMSException;

    /**
     * Finds the contract .
     * <p>
     * This method returns a Contract. The returned ContractDto will contain:
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.ContractService#createContractVersion
     * createContractVersion}<br>
     * <p>
     * To find the Contract user must provide following input:<br>
     * <li>fetchActive.<br>
     * <li>fetchDeleted.<br>
     * <li>fetchExpired.<br>
     * <li>fetchHistory.<br>
     * <li>fetchPending.<br>
     * <li>ContractNumber.<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_DOES_NOT_EXIST CONTRACT_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Contract does not exists.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_NOT_FOUND CONTRACT_NOT_FOUND}</code>
     * </td>
     * <td align="left">No contracts found for the Input Contract Number and Active, Pending, Expired,
     * History, Deleted filters combination.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pContractFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest
     *            ContractFindRequest}</code><br>
     *            includes the attributes to find a <code>Contract </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *            Contract} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setFetchPending
     *            FetchPending} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setFetchHistory
     *            FetchHistory} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setFetchExpired
     *            FetchExpired} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setFetchDeleted
     *            FetchDeleted} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setFetchActive
     *            FetchActive} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setContractNumber
     *            ContractNumber} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse
     *         ContractResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse#getContractDto()
     *         ContractDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *         ContractDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    ContractResponse findContract(ContractFindRequest pContractFindRequest)
                throws LMSException;

    /**
     * Finds the contract based on the participant Account Number.
     * <p>
     * This method returns a Contract. The returned ContractDto will contain:
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.ContractService#createContractVersion
     * createContractVersion}<br>
     * <p>
     * To find the Contract user must provide following input:<br>
     * <li>accountNumber.<br>
     * <li>fetchActive.<br>
     * <li>fetchDeleted.<br>
     * <li>fetchExpired.<br>
     * <li>fetchHistory.<br>
     * <li>fetchPending.<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_PARTICIPANT_ACCOUNTNO_DOES_NOT_EXIST CONTRACT_PARTICIPANT_ACCOUNTNO_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Participant account number does not exist.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pContractFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest
     *            ContractFindRequest}</code><br>
     *            includes the attributes to find a <code>Contract </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *            Contract} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setFetchPending
     *            FetchPending} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setFetchHistory
     *            FetchHistory} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setFetchExpired
     *            FetchExpired} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setFetchDeleted
     *            FetchDeleted} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setFetchActive
     *            FetchActive} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setAccountNumber
     *            AccountNumber} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse
     *         ContractResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse#getContractDto()
     *         ContractDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *         ContractDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    ContractResponse findContractByParticipantAccountNumber(ContractFindRequest pContractFindRequest)
                throws LMSException;

    /**
     * Restores the ContractVersion.
     * <p>
     * <code>This function restores a ContractVersion which is marked for deletion. </code>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.ContractService#deleteContractVersion
     * deleteContractVersion}
     * <p>
     * To restore Contract user must provide following input:<br>
     * <li>agentCommissionInd<br>
     * <li>allDestinationInd<br>
     * <li>allOriginInd<br>
     * <li>biDirectionalInd<br>
     * <li>carriers<br>
     * <li>contractFlightDto<br>
     * <li>contractPriorityType<br>
     * <li>contractRateEntryDtos<br>
     * <li>contractVersion<br>
     * <li>currencyCode<br>
     * <li>defaultWtUnit<br>
     * <li>destination<br>
     * <li>destOriginPaycode<br>
     * <li>DateRangeDto<br>
     * <li>origin<br>
     * <li>rateConstructionInd<br>
     * <li>routeCompressionInd<br>
     * <li>specialNotes<br>
     * <li>status<br>
     * <li>originDestinationPayCode<br>
     * <li>destOriginPayCode<br>
     * <li>rateConstructionInd<br>
     * <li>userAudit<br>
     * <li>splcodes<br>
     * <li>splCodeRule<br>
     * <li>enforcedHurdleInd<br>
     * <li>contractId<br>
     * <li>oId<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_DOES_NOT_EXIST CONTRACT_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Contract does not exists.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pContractRestoreRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractRestoreRequest
     *            ContractRestoreRequest}</code><br>
     *            includes the attributes to restore a <code>Contract </code>. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *            Contract} - (M)</code> <li><code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setUserAudit
     *            UserAudit} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setStatus
     *            Status} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setSplCodes
     *            SplCodes} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContractDto#setSplCodeRule
     *            SplCodeRule} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setSpecialNotes
     *            SpecialNotes} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setRouteCompressionInd
     *            RouteCompressionInd} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setRateConstructionInd
     *            RateConstructionInd} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setOriginDestPayCode
     *            OriginDestPayCode} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setOrigin
     *            Origin} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setOId
     *            OId} - (C)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setMultiSegmentRouteDtos
     *            MultiSegmentRouteDtos} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setEnforceHurdleInd
     *            EnforceHurdleInd} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setDestOriginPaycode
     *            DestOriginPaycode} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setDestination
     *            Destination} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setDefaultWtUnit
     *            DefaultWtUnit} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setDateRangeDto
     *            DateRangeDto} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setCurrencyCode
     *            CurrencyCode} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractRateEntryDtos
     *            ContractRateEntryDtos} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractPriorityType
     *            ContractPriorityType} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractparticipantDtos
     *            ContractparticipantDtos} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractId
     *            ContractId} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractFlightDto
     *            ContractFlightDto} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractAllotmentDto
     *            ContractAllotmentDto} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setCarriers
     *            Carriers} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setBiDirectionalInd
     *            BiDirectionalInd} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setAllOriginInd
     *            AllOriginInd} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setAllDestinationInd
     *            AllDestinationInd} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setAgentCommissionInd
     *            AgentCommissionInd} - (O)</code> <br>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(C)</code><br>
     *            Prohibited for create operation.
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse
     *         ContractResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_RESTORED_SUCCESSFULLY
     *         CONTRACT_RESTORED_SUCCESSFULLY} </code> <br>
     *         <code>for successful restore.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse#getContractDto()
     *         ContractDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *         ContractDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    ContractResponse restoreContractVersion(ContractRestoreRequest pContractRestoreRequest)
                throws LMSException;

    /**
     * Updates the Contract Version Information.
     * <p>
     * This method updates the Contract Version Information.
     * <p>
     * <b>Related Method :</b>
     * {@link com.unisys.trans.logistics.lms.rating.contract.ContractService#findContract
     * findContract}
     * <p>
     * To update Contract user must provide following input:<br>
     * <ul>
     * <li>agentCommissionInd
     * <li>allDestinationInd
     * <li>allOriginInd
     * <li>biDirectionalInd
     * <li>carriers
     * <li>contractFlightDto
     * <li>contractPriorityType
     * <li>contractRateEntryDtos
     * <li>currencyCode
     * <li>defaultWtUnit
     * <li>destination
     * <li>destOriginPaycode
     * <li>DateRangeDto
     * <li>origin
     * <li>rateConstructionInd
     * <li>routeCompressionInd
     * <li>specialNotes
     * <li>status
     * <li>originDestinationPayCode
     * <li>destOriginPayCode
     * <li>rateConstructionInd
     * <li>userAudit
     * <li>splcodes
     * <li>splCodeRule
     * <li>enforcedHurdleInd
     * <li>contractId
     * <li>oId
     * </ul>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_NUMBER_DOES_NOT_EXIST CONTRACT_NUMBER_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Contract number does not exist.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE}</code>
     * </td>
     * <td align="left">Expiration date must be equal or greater than effective date.</td>
     * </table>
     * <p>
     * 
     * @param pContractPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractPersistRequest
     *            ContractPersistRequest}</code><br>
     *            includes the attributes to update a <code>Contract </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *            ContractDto} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setUserAudit
     *            UserAudit} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setStatus
     *            Status} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setSplCodes
     *            SplCodes} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setSplCodeRule
     *            SplCodeRule} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setSpecialNotes
     *            SpecialNotes} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setRouteCompressionInd
     *            RouteCompressionInd} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setRateConstructionInd
     *            RateConstructionInd} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setOriginDestPayCode
     *            OriginDestPayCode} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setOrigin
     *            Origin} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setOId
     *            OId} - (C)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setMultiSegmentRouteDtos
     *            MultiSegmentRouteDtos} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setEnforceHurdleInd
     *            EnforceHurdleInd} - (C)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setDestOriginPaycode
     *            DestOriginPayCode} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setDestination
     *            Destination} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setDefaultWtUnit
     *            DefaultWtUnit} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setDateRangeDto
     *            DateRangeDto} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setCurrencyCode
     *            CurrencyCode} - (C)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractListEntryDto#setContractRateEntryDtos
     *            ContractRateEntryDtos} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractPriorityType
     *            ContractPriorityType} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractparticipantDtos
     *            ContractparticipantDtos} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractId
     *            ContractId} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractFlightDto
     *            ContractFlightDto} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setContractAllotmentDto
     *            ContractAllotmentDto} - (M)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setCarriers
     *            Carriers} - (C)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setBiDirectionalInd
     *            BiDirectionalInd} - (O)</code> <br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setAllOriginInd
     *            AllOriginInd} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setAllDestinationInd
     *            AllDestinationInd} - (O)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto#setAgentCommissionInd
     *            AgentCommissionInd} - (O)</code> <br>
     *            * {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)<br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse
     *         ContractResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_UPDATED_SUCCESSFULLY
     *         CONTRACT_UPDATED_SUCCESSFULLY} </code> <br>
     *         <code>for successful update.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse#getContractDto()
     *         ContractDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *         ContractDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    ContractResponse updateContractVersion(ContractPersistRequest pContractPersistRequest)
                throws LMSException;

    /**
     * Finds the contract based on the participant Account Number list.
     * <p>
     * To find the Contract user must provide following input:<br>
     * <li>participant accountNumber.<br>
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
     * @param pParticipantAccNumbers
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest
     *            ContractFindRequest}</code><br>
     *            includes the attributes to find a <code>Contract </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *            Contract} - (M).</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setAccountNumber
     *            AccountNumber} - (M).</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    void findContractExistForParticipant(List<String> pParticipantAccNumbers) throws LMSException;

    /**
     * Deletes the contract based on the participant Account Number list.
     * <p>
     * To delete the Contract user must provide following input:<br>
     * <li>participant accountNumber.<br>
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
     * @param pParticipantAccNumbers
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDeleteRequest
     *            ContractDeleteRequest}</code><br>
     *            includes the attributes to find a <code>Contract </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *            Contract} - (M).</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractFindRequest#setAccountNumber
     *            AccountNumber} - (M).</code>
     *            </ul>
     *            </ul>
     * 
     * @param pParticipantDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.ParticipantDeleteRequest
     *            ParticipantDeleteRequest}</code><br>
     *            <p>
     * @param ContractResponse
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse
     *            ContractResponse}</code><br>
     *            <p>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    ContractResponse deleteContractForParticipant(List<String> pParticipantAccNumbers,
                ParticipantDeleteRequest pParticipantDeleteRequest) throws LMSException;

    /**
     * Finds the Contract's by Status filtes.
     * <p>
     * This method retrieves list of Contracts with the input of Status filter(s).
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.ContractService#findContractByParticipantAccountNumber
     * findContractByParticipantAccountNumber}<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#CONTRACT_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The Contracts Number does not exist in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pExtractRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.ExtractRequest
     *            ExtractRequest}</code><br>
     *            includes the attributes to find a <code>SpotRate </code>.
     *            <ul>
     *            <li><code> IncludedStatuses - (M)</code> </li> <li><code>UpdatedDate - (O)</code> </li>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ExtractResponse
     *         ExtractResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage </li> <li> <code>list of SpotRateDto's </code></li>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    ExtractResponse findContractsByStatusFilters(
                ExtractRequest pExtractRequest) throws LMSException;

    /**
     * Updates the Contract Date Range if any contracts exist for given Participant Information.
     * <p>
     * This method updates the Contract Date Range.
     * <p>
     * To update Contract user must provide following input:<br>
     * <ul>
     * <li>BillingAccountNumber1
     * <li>BillingAccountNumber2
     * <li>oId
     * </ul>
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
     * 
     * @param pBatchRequest <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     *            includes the attributes to update a <code>Contract </code>.
     *            <ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse
     *         ContractResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *         ContractDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    BatchResponse maintainContracts(BatchRequest pBatchRequest) throws LMSException;

    /**
     * Updates the Contract Date Range if any contracts exist for given Participant Group Information.
     * <p>
     * This method updates the Contract Date Range.
     * <p>
     * To update Contract user must provide following input:<br>
     * <ul>
     * <li>ParticipantGroupNumber
     * <li>ParticipantGroupIndicator
     * <li>oId
     * </ul>
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
     * 
     * @param pBatchRequest <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     *            includes the attributes to update a <code>Contract </code>.
     *            <ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractResponse
     *         ContractResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *         ContractDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    BatchResponse maintainContractsForPartsGroup(BatchRequest pBatchRequest) throws LMSException;

    /**
     * This will populate contract participants for ContractDto.
     * <p>
     * 
     * @param pContractDto
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractDto
     *            ContractDto} </code><br>
     *            <p>
     * @param pIsFindRequest
     *            holds the <code>boolean</code> property.
     *            <p>
     * @throws LMSException
     *             If the request fails.
     */
    void populateContractParticipants(final ContractDto pContractDto,
                final boolean pIsFindRequest) throws LMSException;

    /**
     * This method deletes all the contracts exists in the system.
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
     * 
     * @param pAbstractRequest - <code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractRequest
     *            AbstractRequest}</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code> </ul>
     * @throws LMSException If the operation fails.
     */
    BatchResponse deleteAllContracts(AbstractRequest pAbstractRequest) throws LMSException;
	ContractResponse findContractListByParticipantAccountNumber(
			ContractFindRequest pContractFindRequest) throws LMSException;
	ContractResponse findContractInfo(ContractFindRequest pContractFindRequest)
			throws LMSException;
    /**
     * This method finds the count of all the contracts exists in the system,for particular participant
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
     * 
     * @param ParticipantAccNumValidatorResponse - <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAccNumValidatorResponse
     *               ParticipantAccNumValidatorResponse}</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAccNumValidatorResponse
     *  ParticipantAccNumValidatorResponse}</code> </ul>
     * @throws LMSException If the operation fails.
     */
    ParticipantAccNumValidatorResponse validateContractExistForParticipant(
                final ParticipantAccNumValidatorResponse pAccNumResponse) throws LMSException;
    
    List<ContractDto> updateExistingContractRates(ContractPersistRequest aContractPersistRequest) throws LMSException;
}
