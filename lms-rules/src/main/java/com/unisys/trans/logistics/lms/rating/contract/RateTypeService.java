/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.RateTypeDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.RateTypeFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.RateTypePersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse;
import com.unisys.trans.logistics.lms.rating.dto.RateTypeRestoreRequest;

/**
 * <code>RateTypeService</code> interface exposes the APIs which identifies various processing flows involved
 * in maintaining the rate type information.
 * <p>
 * <code>RateTypeService</code> provides the following services for <code>RateType</code> information.<br>
 * This performs the following functions:
 * <ul>
 * <li>createRateType
 * <li>deleteRateType
 * <li>findAllRateTypes
 * <li>findRateType
 * <li>restoreRateType
 * <li>updateRateType
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.RateTypePersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RateTypeDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RateTypeFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RateTypeRestoreRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse
 */

public interface RateTypeService {

    /**
     * Creates the <code>RateType</code> information after validating the input data.
     * <p>
     * <b>Related Methods:</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.RateTypeService#updateRateType updateRateType}
     * </ul>
     * </code>
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
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_PRODUCTCODE_DUPLICATE}</td>
     *            <td>Same Product Code can not be assigned repeatedly to the Rate Type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_PRODUCTCODE_NOT_DEFINED}</td>
     *            <td>Product code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_RATECLASS_DUPLICATE}</td>
     *            <td>Same Rate Class can not be assigned repeatedly to the Rate Type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_TOR_RATECLASS_NOT_COMPATIBLE}</td>
     *            <td>Bulk Over Pivot not allowed with U, E, X rate classes.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_PRIORITY_INUSE}</td>
     *            <td>Priority Number is already used.</td>
     *            </tr>            
     *            </code>
     * </table>
     * <p>
     * 
     * @param pRateTypePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypePersistRequest
     *            RateTypePersistRequest}</code> holds the request Object for persist AWBRatingType.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypePersistRequest#setRateType
     *            rateTypeDto} - (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setDescription
     *            description} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setDisplayPriority
     *            displayPriority} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setEndDate endDate} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setMaximumGrossWeight
     *            maximumGrossWeight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setOId oId} - (C)</code><br>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Prohibited for create operation.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setWeightUOM
     *            weightUOM} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setTypeOfRating typeOfRating} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setRateTypeCode rateTypeCode} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setMaximumChargeableWeight
     *            maximumChargeableWeight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setUseGrossWeightIndicator
     *            useGrossWeightIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setRateTypeRateClasses
     *            rateTypeRateClasses} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeRateClassDto#setRateClass
     *            rateClass} - (M) (1:50)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeRateClassDto#setRatingConventionType
     *            ratingConventionType} - (M)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setRateTypeProductCodes
     *            rateTypeProductCodes} - (M) (0:*)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeProductCodeDto#setOId
     *            oId} - (C)</code><br>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeProductCodeDto#setRateTypeOId
     *            rateTypeOId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeProductCodeDto#setProductCode
     *            productCode} - (M)</code>
     *            </ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setOId oId} - (O)
     *            </code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse RateTypeResponse}
     *         </code>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse#getRateTypes() rateTypes} -
     *         (1:52)</code><br>
     *         holds the list of <code>RateTypeDto</code> objects.
     *         </ul>
     *         <p>
     * @throws LMSException If the rate type create operation fails the above mentioned error codes are
     *             returned. Each <code>CodeMessage</code> contains the status code, human readable message
     *             and message type.
     */
    RateTypeResponse createRateType(RateTypePersistRequest pRateTypePersistRequest) throws LMSException;

    /**
     * Marks the <code>RateType</code> as ‘Deleted’ by updating it with an end date value.
     * <p>
     * <b>Related Methods:</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.RateTypeService#restoreRateType RestoreRateType}
     * </ul>
     * </code>
     * <p>
     * The <code>RateType</code> is marked for deletion when the <code>endDate</code> is given for it. The
     * system validates the <code>endDate</code> and marks the <code>RateType</code> for deletion.<br>
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
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_ENDDATE_BACKDATE_NOT_ALLOWED}</td>
     *            <td>The delete date for the rate criteria item must be today or later.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_ALREADY_DELETED}</td>
     *            <td>Cannot delete a rate type that is marked for deletion.</td>
     *            </tr>            
     *            </code>
     * </table>
     * <p>
     * 
     * @param pRateTypeDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDeleteRequest
     *            RateTypeDeleteRequest}</code> holds the request Object for deleting the
     *            <code>AWBRatingType</code>. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDeleteRequest#setRateTypeCode
     *            rateTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDeleteRequest#setEndDate endDate} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDeleteRequest#setOId oId} - (O)
     *            </code>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse RateTypeResponse}
     *         </code><br>
     *         response object contains <code>RateTypeDto</code> that is marked for deletion in the current
     *         transaction along with applicable advisory messages.
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         </code><br>
     *         will hold applicable advisory <code>CodeMessage</code> objects. <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse#getRateTypes() rateTypes} -
     *         (1:1)</code><br>
     *         holds the list of <code>RateTypeDto</code> objects.
     *         </ul>
     *         <p>
     * @throws LMSException If the <code>RateType</code> delete operation fails the above mentioned error
     *             codes are returned.<br>
     *             Each <code>CodeMessage</code> contains the status code, human readable message and message
     *             type.
     */
    RateTypeResponse deleteRateType(RateTypeDeleteRequest pRateTypeDeleteRequest) throws LMSException;

    /**
     * Retrieves all the <code>RateType</code> information currently defined in the system.<br>
     * Rate types marked for deletion are also returned in the list of all rate types.
     * <p>
     * <b>Related Method :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.RateTypeService#findRateType findRateType}
     * </ul>
     * </code>
     * <p>
     * The system finds the <code>RateType</code> that exactly matches the input <code>RateType</code> code if
     * <code>exactMatchRequiredIndicator</code> is set to true.<br>
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
     * @param pRateTypeFindRequest <code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeFindRequest
     *            RateTypeFindRequest}</code> holds the request Object for retrieving all the RateTypes
     *            defined in the system.
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse RateTypeResponse}
     *         </code>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse#getRateTypes() rateTypes} -
     *         (0:*)</code><br>
     *         holds the list of <code>RateTypeDto</code> objects.
     *         </ul>
     *         <p>
     * @throws LMSException If the <code>RateType</code> information does not exist the above mentioned error
     *             codes are returned. Each <code>CodeMessage</code> contains the status code, human readable
     *             message and message type.
     */
    RateTypeResponse findAllRateTypes(RateTypeFindRequest pRateTypeFindRequest) throws LMSException;

    /**
     * Retrieves the <code>RateType</code> information for the given <code>RateType</code> code.<br>
     * <p>
     * <b>Related Method :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.RateTypeService#findAllRateTypes findAllRateTypes}
     * </ul>
     * </code>
     * <p>
     * The system finds the <code>RateType</code> that exactly matches the input <code>RateType</code> code if
     * <code>exactMatchRequiredIndicator</code> is set to true.<br>
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
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_RATECODE_DOES_NOT_EXIST}</td>
     *            <td>Rate Type does not exist.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pRateTypeFindRequest <code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeFindRequest
     *            RateTypeFindRequest}</code> holds the request Object that contains the <code>RateType</code>
     *            code.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeFindRequest#setExactMatchRequiredIndicator exactMatchRequiredIndicator} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeFindRequest#setRateTypeCode rateTypeCode} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse RateTypeResponse}
     *         </code>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse#getRateTypes() rateTypes} -
     *         (0:1)</code><br>
     *         holds the <code>RateTypeDto</code> object.
     *         </ul>
     *         <p>
     * @throws LMSException If the <code>RateType</code> information does not exist the above mentioned error
     *             codes are returned. Each <code>CodeMessage</code> contains the status code, human readable
     *             message and message type.
     */
    RateTypeResponse findRateType(RateTypeFindRequest pRateTypeFindRequest) throws LMSException;

    /**
     * Finds the RateType.
     * <p>
     * This method returns a RateType. The returned RateTypeDto will contain:
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.RateTypeService#findAllRateType
     * findAllRateType}<br>
     * <p>
     * To find the RateType user must provide following input:<br>
     * <li>RateTypeCode.<br>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_RATECODE_MANDATORY RATETYPE_RATECODE_MANDATORY}</code>
     * </td>
     * <td align="left">RateType is mandatory.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pMultipleFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest
     *            MultipleFindRequest}</code><br>
     *            includes the attributes to find a <code>RateType </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setSearchInputs
     *            searchInputs} Prohibited for create operation.</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse
     *         RateTypeResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         RateTypeDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto
     *         RateTypeDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */

    MultipleFindResponse findRateTypesByRateTypeCodes(MultipleFindRequest pMultipleFindRequest)
                throws LMSException;

    /**
     * Restores the retrieved <code>RateType</code> information that was previously marked as 'Deleted'.
     * <p>
     * <b>Related Methods:</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.RateTypeService#deleteRateType DeleteRateType}
     * </ul>
     * </code>
     * <p>
     * The <code>RateType</code> is restored for the given <code>RateType</code> code, provided it was
     * previously marked for deletion.
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
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_NOT_MARKED_FOR_DELETION}</td>
     *            <td>Only rate type marked for deletion can be restored.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pRateTypeRestoreRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeRestoreRequest
     *            RateTypeRestoreRequest}</code> holds the request Object for deleting the
     *            <code>AWBRatingType</code>. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDeleteRequest#setRateTypeCode
     *            rateTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDeleteRequest#setOId oId} - (O)
     *            </code>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse RateTypeResponse}
     *         </code><br>
     *         response object contains <code>RateTypeDto</code> that was restored in the current transaction
     *         along with applicable advisory messages.
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         </code><br>
     *         will hold applicable advisory <code>CodeMessage</code> objects. <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse#getRateTypes() rateTypes} -
     *         (1:1)</code><br>
     *         holds the <code>RateTypeDto</code> object that was restored.
     *         </ul>
     *         <p>
     * @throws LMSException If the <code>RateType</code> restore operation fails the above mentioned error
     *             codes are returned.<br>
     *             Each <code>CodeMessage</code> contains the status code, human readable message and message
     *             type.
     */

    RateTypeResponse restoreRateType(RateTypeRestoreRequest pRateTypeRestoreRequest) throws LMSException;

    /**
     * Updates the retrieved <code>RateType</code> information after validating the input data.
     * <p>
     * <b>Related Methods:</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.RateTypeService#createRateType createRateType}
     * </ul>
     * </code>
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
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_CODE_CANNOT_BE_UPDATED}</td>
     *            <td>Rate Type Code can not be updated.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_DELETED}</td>
     *            <td>Cannot update a rate type that is marked for deletion.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_RATECLASS_DUPLICATE}</td>
     *            <td>Same Rate Class can not be assigned repeatedly to the Rate Type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_PRODUCTCODE_DUPLICATE}</td>
     *            <td>Same Product Code can not be assigned repeatedly to the Rate Type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_PRODUCTCODE_NOT_DEFINED}</td>
     *            <td>Product code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_TOR_RATECLASS_NOT_COMPATIBLE}</td>
     *            <td>Bulk Over Pivot not allowed with U, E, X rate classes.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#RATETYPE_PRIORITY_INUSE}</td>
     *            <td>Priority Number is already used.</td>
     *            </tr>            
     *            </code>
     * </table>
     * <p>
     * 
     * @param pRateTypePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypePersistRequest
     *            RateTypePersistRequest}</code> holds the request Object for persist AWBRatingType. <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypePersistRequest
     *            rateTypePersistRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypePersistRequest#setRateType
     *            rateType} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setMaximumGrossWeight
     *            maximumGrossWeight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setWeightUOM weightUOM} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setTypeOfRating typeOfRating} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setRateTypeCode rateTypeCode} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setDescription description} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setMaximumChargeableWeight
     *            maximumChargeableWeight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setUseGrossWeightIndicator
     *            useGrossWeightIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setRateTypeRateClasses
     *            rateTypeRateClasses} - (M) (1:50)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeRateClassDto#setRateClass
     *            rateClass} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeRateClassDto#setRatingConventionType
     *            ratingConventionType} - (M)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setRateTypeProductCodes
     *            rateTypeProductCodes} - (M) (1:52)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeProductCodeDto#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeProductCodeDto#setRateTypeOId
     *            rateTypeOId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeProductCodeDto#setProductCode
     *            productCode} - (M)</code>
     *            </ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setEndDate endDate} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setDisplayPriority
     *            displayPriority} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeDto#setOId oId} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse RateTypeResponse}
     *         </code>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.RateTypeResponse#getRateTypes() rateTypes} -
     *         (1:1)</code><br>
     *         holds the list of <code>RateTypeDto</code> objects.
     *         </ul>
     *         <p>
     * @throws LMSException If the rate type create operation fails the above mentioned error codes are
     *             returned. Each <code>CodeMessage</code> contains the status code, human readable message
     *             and message type.
     */
    RateTypeResponse updateRateType(RateTypePersistRequest pRateTypePersistRequest) throws LMSException;
    
   
}