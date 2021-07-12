/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse;
import com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodePersistRequest;

/**
 * <code>OtherChargeCodeService</code> interface exposes the APIs which identifies various processing flows
 * involved in maintaining the Other Charge Code information.
 * <p>
 * <code>OtherChargeCodeService</code> provides the following services for <code>OtherChargeCode</code>
 * information.<br>
 * This performs the following functions:<br>
 * <ul>
 * <li>createOtherChargeCode
 * <li>updateOtherChargeCode
 * <li>deleteOtherChargeCode
 * <li>findOtherChargeAndSubCode
 * <li>createOtherChargeSubCode
 * <li>updateOtherChargeSubCode
 * <li>deleteOtherChargeSubCode
 * <li>findOtherChargeCode
 * <li>findOtherChargeCodeByPrimaryKey
 * <li>findOtherChargeCodes
 * <li>findOtherChargeSubCodes
 * <li>validateOtherChargeCode
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse
 * @see com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
 * @see com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
 */

public interface OtherChargeCodeService {
    /**
     * Creates the <code>OtherChargeCode</code>.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#updateOtherChargeCode
     * updateOtherChargeCode }
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DESCRIPTION}
     * </pre>
     * 
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
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODE_INVALID_DEFAULTSUBCODEFORA_OBJECT_INSTANCE}</td>
     *            <td>The sub code provided must be a valid airline code if the
     *            sub code required indicator is set to 'A'.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODE_INVALID_AGGREGATE_OBJECT_INSTANCE}</td>
     *            <td>The provided aggregate type must match one of the
     *            country/station aggregate types present in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODE_SUBCODE_DESCRIPTIONMANDATORY_OBJECT_INSTANCE}</td>
     *            <td>The other charge code/sub code description is mandatory
     *            when the C$DESC value equals to 1 or 2.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AUTOMATICADDCHARGECODE_NOTEXISTS}</td>
     *            <td>Auto add charge code object does not exist in the system</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pOtherChargeCodePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodePersistRequest
     *            OtherChargeCodePersistRequest}</code><br>
     *            Holds the attributes to create a other charge code.
     *            <p>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setOtherChargeCode
     *            otherChargeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setOId OId} - (C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setAggregateType
     *            aggregateType} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setAllowableCurrencyCode
     *            allowableCurrencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setAutoAddChargeCode
     *            autoAddChargeCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setCollectRateTableCode
     *            collectRateTableCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setDefaultSubCode
     *            defaultSubCode} - (C)</code>- <br>
     *            <ul>
     *            <li>If the Sub Code Required indicator is set to ‘N', the default sub code is prohibited <br>
     *            <li>If the Sub Code Required indicator is set to ‘S’, the default subcode if provided must
     *            be a single alpha character<br>
     *            <li>The default sub code can be alphanumeric only if the allowable usage field is set to ‘2’
     *            indicating a cash drawer module. In all other cases it must have only alphabets.<br>
     *            <li>If the Sub Code Required is set to ‘D’, the default subcode if provided must be a two
     *            character code.<br>
     *            <li>If the Sub Code Required indicator is set to ‘A’ the default sub code must be a valid
     *            airline code.<br>
     *            <li>If the Sub Code Required indicator is set to ‘O’, the default sub code if provided must
     *            be 1 or 2 alpha characters.<br>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setDescription
     *            description} - (C)</code>- <br>
     *            Depends on the parameter
     *            {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DESCRIPTION}
     * <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setDescriptionRequiredIndicator
     *            descriptionRequiredIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setDueCode dueCode} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setGenerationCode
     *            generationCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setOtherChargeCode
     *            otherChargeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setPrepaidRateTableCode
     *            prepaidRateTableCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setRequiredParticipantCode
     *            requiredParticipantCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setSpecialValidationRule
     *            specialValidationRule} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setSubcodeRequired
     *            subcodeRequired} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse
     *         OtherChargeCodeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse#getOtherChargeCodes
     *         otherChargeCodes - (1:1)} </ul> </code>
     *         <p>
     * @throws LMSException If the othercharge code create operation fails the above mentioned errorcodes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.<br>
     */
    OtherChargeCodeResponse
                createOtherChargeCode(OtherChargeCodePersistRequest pOtherChargeCodePersistRequest)
                            throws LMSException;

    /**
     * Creates the <code>OtherChargeSubCode</code>.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#updateOtherChargeSubCode
     * updateOtherChargeSubCode }
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DESCRIPTION}
     * </pre>
     * 
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
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODE_SUBCODE_DESCRIPTIONMANDATORY_OBJECT_INSTANCE}</td>
     *            <td>The sub code provided must be a valid airline code if the
     *            sub code required indicator is set to 'A'.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pOtherChargeSubCodePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodePersistRequest
     *            OtherChargeSubCodePersistRequest}</code><br>
     *            Holds the attributes to create other charge sub code.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto
     *            OtherChargeCodeDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setOtherChargeSubCodes
     *            otherChargeSubCodes} - (1,1)</code> <li>Contains list of <code>OtherChargeSubCodeDtos</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDto
     *            OtherChargeSubCodeDto} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDto#setOId OId}
     *            - (C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDto#setDescription
     *            description} - (C)</code>- <br>
     *            Depends on the parameter
     *            {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DESCRIPTION}
     * <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDto#setOtherChargeCode
     *            otherChargeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDto#setOtherChargeSubCode
     *            otherChargeSubCode} - (M)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse
     *         OtherChargeCodeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse#getOtherChargeCodes
     *         otherChargeCodes - (1:1)} <ul> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#getOtherChargeSubCodes
     *         otherChargeSubCodes} - (1,1)</code> <li>Contains list of <code> OtherChargeSubCodeDto</code>
     *         </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the otherchargesubcode create operation fails the above mentioned error codes
     *             are returned. Each CodeMessage contains the status code,human readable message and message
     *             type.<br>
     */
    OtherChargeCodeResponse createOtherChargeSubCode(
                OtherChargeSubCodePersistRequest pOtherChargeSubCodePersistRequest) throws LMSException;

    /**
     * Deletes the <code>OtherChargeCode</code>.
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
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODESERVICE_OBJECT_DOES_NOT_EXIST}</td>
     *            <td></td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODE_CANNOT_BE_DELETED_RATEEXISTFOR_AUTOMATICADDCHARGECODE}</td>
     *            <td></td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODE_CANNOT_BE_DELETED_RATEEXISTFOR_OTHERCHARGECODE}</td>
     *            <td></td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pOtherChargeCodeDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDeleteRequest
     *            OtherChargeCodeDeleteRequest}</code><br>
     *            Holds the attributes to delete other charge code.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDeleteRequest#setOId oId} -
     *            (M)</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse
     *         OtherChargeCodeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse#setOtherChargeCodes
     *         otherChargeCodes - (1:1)} <ul> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#getOtherChargeSubCodes
     *         otherChargeSubCodes} - (1,1)</code> <li>Contains list of <code> OtherChargeSubCodeDto</code>
     *         </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the otherChargeCode delete operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.<br>
     */

    OtherChargeCodeResponse deleteOtherChargeCode(OtherChargeCodeDeleteRequest pOtherChargeCodeDeleteRequest)
                throws LMSException;

    /**
     * Deletes the <code>OtherChargeSubCode</code>.
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
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGESUBCODESERVICE_OBJECT_DOES_NOT_EXIST}</td>
     *            <td></td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pOtherChargeSubCodeDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDeleteRequest
     *            OtherChargeSubCodeDeleteRequest}</code><br>
     *            Holds the attributes to delete other charge sub code.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDeleteRequest#setOId oId}
     *            - (M)</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse
     *         OtherChargeCodeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse#getOtherChargeCodes
     *         otherChargeCodes - (1:1)} <ul> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#getOtherChargeSubCodes
     *         otherChargeSubCodes} - (1,1)</code> <li>Contains list of <code> OtherChargeSubCodeDto</code>
     *         </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the otherChargeSubCode delete operation fails the above mentioned error codes
     *             are returned. Each CodeMessage contains the status code,human readable message and message
     *             type.<br>
     */
    OtherChargeCodeResponse deleteOtherChargeSubCode(
                OtherChargeSubCodeDeleteRequest pOtherChargeSubCodeDeleteRequest) throws LMSException;

    /**
     * Finds the <code>OtherChargeCode</code> and list of associated <code>OtherChargeSubCode</code>.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeCode
     * findOtherChargeCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeCodeByPrimaryKey
     * findOtherChargeCodeByPrimaryKey }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeCodes
     * findOtherChargeCodes }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeSubCodes
     * findOtherChargeSubCodes }
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
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODESERVICE_OBJECT_DOES_NOT_EXIST}</td>
     *            <td>The other charge code does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pOtherChargeCodeFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeFindRequest
     *            OtherChargeCodeFindRequest}</code><br>
     *            Holds the attributes to find the other charge codes <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeFindRequest#setOtherChargeSubCode
     *            otherChargeSubCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeFindRequest#setOtherChargeCode
     *            otherChargeCode} - (M)</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse
     *         OtherChargeCodeResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse#getOtherChargeCodes
     *         otherChargeCodes} - (1,1)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse#getOtherChargeSubCodes
     *         otherChargeSubCodes} - (1,*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto
     *         OtherChargeCodeDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the otherChargeCode find operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.<br>
     */
    OtherChargeCodeResponse findOtherChargeAndSubCode(OtherChargeCodeFindRequest pOtherChargeCodeFindRequest)
                throws LMSException;

    /**
     * Finds the <code>OtherChargeCode</code> by code.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeAndSubCode
     * findOtherChargeAndSubCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeCodeByPrimaryKey
     * findOtherChargeCodeByPrimaryKey }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeCodes
     * findOtherChargeCodes }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeSubCodes
     * findOtherChargeSubCodes }
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
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODESERVICE_OBJECT_DOES_NOT_EXIST}</td>
     *            <td>The other charge code does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pOtherChargeCodeFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeFindRequest
     *            OtherChargeCodeFindRequest}</code><br>
     *            Holds the attributes to find the other charge codes <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeFindRequest#setExactMatchRequiredIndicator
     *            anExactMatchRequiredIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeFindRequest#setOtherChargeCode
     *            otherChargeCode} - (M)</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse
     *         OtherChargeCodeResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse#getOtherChargeCodes
     *         otherChargeCodes} - (1,1)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto
     *         OtherChargeCodeDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the otherChargeCode find operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.<br>
     */
    OtherChargeCodeResponse findOtherChargeCode(OtherChargeCodeFindRequest pOtherChargeCodeFindRequest)
                throws LMSException;

    /**
     * Finds the <code>OtherChargeCode</code> by OId.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeAndSubCode
     * findOtherChargeAndSubCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeCode
     * findOtherChargeCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeCodes
     * findOtherChargeCodes }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeSubCodes
     * findOtherChargeSubCodes }
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
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODESERVICE_OBJECT_DOES_NOT_EXIST}</td>
     *            <td>The other charge code does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pOtherChargeCodeDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDeleteRequest
     *            OtherChargeCodeDeleteRequest}</code><br>
     *            Holds the attributes to find the other charge code for deletion <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDeleteRequest#setOId OId} -
     *            (M)</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse
     *         OtherChargeCodeResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse#getOtherChargeCodes
     *         otherChargeCodes} - (1,1)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto
     *         OtherChargeCodeDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the otherChargeCode find operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.<br>
     */

    OtherChargeCodeResponse findOtherChargeCodeByPrimaryKey(
                OtherChargeCodeDeleteRequest pOtherChargeCodeDeleteRequest) throws LMSException;

    /**
     * Finds list of <code>OtherChargeCode</code> details for the list of otherchargecodes inputted.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeAndSubCode
     * findOtherChargeAndSubCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeCode
     * findOtherChargeCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeCodes
     * findOtherChargeCodeByPrimaryKey }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeSubCodes
     * findOtherChargeSubCodes }
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
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODESERVICE_OBJECT_DOES_NOT_EXIST}</td>
     *            <td>The other charge code does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pOtherChargeCodeFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeFindRequest
     *            OtherChargeCodeFindRequest}</code><br>
     *            Holds the attributes to find the other charge codes <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeFindRequest#setExactMatchRequiredIndicator
     *            anExactMatchRequiredIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeFindRequest#setOtherChargeCode
     *            otherChargeCode} - (C)</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse
     *         OtherChargeCodeResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse#getOtherChargeCodes
     *         otherChargeCodes} - (1,1)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto
     *         OtherChargeCodeDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the otherChargeCodes find operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.<br>
     */
    OtherChargeCodeResponse findOtherChargeCodes(OtherChargeCodeFindRequest pOtherChargeCodeFindRequest)
                throws LMSException;

    /**
     * Finds list of <code>OtherChargeSubCode</code> .
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeAndSubCode
     * findOtherChargeAndSubCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeCode
     * findOtherChargeCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeCodes
     * findOtherChargeCodeByPrimaryKey }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OtherChargeCodeService#findOtherChargeSubCodes
     * findOtherChargeCodes }
     * <p>
     * The system returns all the other charge sub codes by following conditions <br>
     * <ul>
     * <li>Other charge sub code provided by the actor exists in the system – The system returns the details
     * of other charge code provided by the actor followed by any subsequent other charge codes. This list is
     * provided in alphabetic order.
     * <li>other charge sub code provided by the actor does not exist in the system - The system returns any
     * subsequent other charge codes and their details that follow in the alphabetic order from the other
     * charge code provided by the actor.
     * <li>other charge sub code is not provided by actor – the system returns the details of all the Other
     * Charge codes and their details in alphabetic order.
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
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODESERVICE_OBJECT_DOES_NOT_EXIST}</td>
     *            <td>The other charge code does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pOtherChargeSubCodeFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeFindRequest
     *            OtherChargeSubCodeFindRequest}</code><br>
     *            Holds the attributes to find the other charge sub codes <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeFindRequest#setOtherChargeCode
     *            aOtherChargeCode} - (M)</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse
     *         OtherChargeCodeResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse#getOtherChargeCodes
     *         otherChargeCodes} - (1,*)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#getOtherChargeSubCodes
     *         otherChargeSubCodes} - (1,*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDto
     *         OtherChargeSubCodeDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the otherChargeSubCodes find operation fails the above mentioned error codes
     *             are returned. Each CodeMessage contains the status code,human readable message and message
     *             type.<br>
     */

    OtherChargeCodeResponse findOtherChargeSubCodes(
                OtherChargeSubCodeFindRequest pOtherChargeSubCodeFindRequest) throws LMSException;

    /**
     * Updates the <code>OtherChargeCode</code>.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DESCRIPTION}
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
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODE_IS_NOT_UPDATABLE}</td>
     *            <td>The other charge code chosen for update cannot be changed.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODESERVICE_OBJECT_DOES_NOT_EXIST}</td>
     *            <td>The other charge code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AUTOMATICADDCHARGECODE_NOTEXISTS}</td>
     *            <td>Auto add charge code object does not exist in the system</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODE_INVALID_DEFAULTSUBCODEFORA_OBJECT_INSTANCE}</td>
     *            <td>The sub code provided must be a valid airline code if the sub code required
     *            indicator is set to 'A'.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODE_INVALID_AGGREGATE_OBJECT_INSTANCE}</td>
     *            <td>The provided aggregate type must match one of the country/station aggregate types
     *            present in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODE_SUBCODE_DESCRIPTIONMANDATORY_OBJECT_INSTANCE}</td>
     *            <td>The other charge code/sub code description is mandatory when the C$DESC value
     *            equals to 1 or 2</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pOtherChargeCodePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodePersistRequest
     *            OtherChargeCodePersistRequest}</code><br>
     *            Holds the attributes to create a other charge code.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setOtherChargeCode otherChargeCode} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setOId OId} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setAggregateType aggregateType} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setAllowableCurrencyCode allowableCurrencyCode} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setAutoAddChargeCode autoAddChargeCode} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setCollectRateTableCode collectRateTableCode} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setDefaultSubCode defaultSubCode} - (C)</code>
     *            - <br>
     *            <ul>
     *            <li>If the Sub Code Required indicator is set to ‘N', the default sub code is prohibited
     *            <br>
     *            <li>If the Sub Code Required indicator is set to ‘S’, the default subcode if provided must
     *            be a single alpha character <br>
     *            <li>The default sub code can be alphanumeric only if the allowable usage field is set to ‘2’
     *            indicating a cash drawer module. In all other cases it must have only alphabets.<br>
     *            <li>If the Sub Code Required is set to ‘D’, the default subcode if provided must be a two
     *            character code.<br>
     *            <li>If the Sub Code Required indicator is set to ‘A’ the default sub code must be a valid
     *            airline code.<br>
     *            <li>If the Sub Code Required indicator is set to ‘O’, the default sub code if provided must
     *            be 1 or 2 alpha characters. <br>
     *            </ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setDescription description} - (C)</code>
     *            - <br>
     *            Depends on the parameter
     *            {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DESCRIPTION}
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setDescriptionRequiredIndicator descriptionRequiredIndicator} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setDueCode dueCode} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setGenerationCode generationCode} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setOtherChargeCode otherChargeCode} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setPrepaidRateTableCode prepaidRateTableCode} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setRequiredParticipantCode requiredParticipantCode} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setSpecialValidationRule specialValidationRule} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setSubcodeRequired subcodeRequired} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse
     *         OtherChargeCodeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse#getOtherChargeCodes
     *         otherChargeCodes - (1:1)} <ul> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto OtherChargeCodeDto}</code>
     *         </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the othercharge code update operation fails the above mentioned errorcodes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.<br>
     */

    OtherChargeCodeResponse
                updateOtherChargeCode(OtherChargeCodePersistRequest pOtherChargeCodePersistRequest)
                            throws LMSException;

    /**
     * Updates the <code>OtherChargeSubCode</code>.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DESCRIPTION}
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
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODE_SUBCODE_DESCRIPTIONMANDATORY_OBJECT_INSTANCE}</td>
     *            <td> The other charge code/sub code description is mandatory when the C$DESC value equals
     *            to 1 or 2.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODE_IS_NOT_UPDATABLE}</td>
     *            <td>The other charge code chosen for update cannot be changed.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGESUBCODESERVICE_OBJECT_DOES_NOT_EXIST}</td>
     *            <td>The other charge sub code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OTHERCHARGECODESERVICE_ENTITY_ALREADY_EXIST}</td>
     *            <td>The other charge code already exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pOtherChargeSubCodePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodePersistRequest
     *            OtherChargeSubCodePersistRequest}</code><br>
     *            Holds the attributes to create other charge sub code.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto
     *            OtherChargeCodeDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#setOtherChargeSubCodes
     *            otherChargeSubCodes} - (1,1)</code> <li>Contains list of <code>OtherChargeSubCodeDtos</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDto
     *            OtherChargeSubCodeDto} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDto#setOId OId}
     *            - (M)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (M)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDto#setDescription
     *            description} - (C)</code>- <br>
     *            Depends on the parameter
     *            {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DESCRIPTION}
     * <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDto#setOtherChargeCode
     *            otherChargeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeSubCodeDto#setOtherChargeSubCode
     *            otherChargeSubCode} - (M)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse
     *         OtherChargeCodeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeResponse#getOtherChargeCodes
     *         otherChargeCodes - (1:1)} <ul> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto#getOtherChargeSubCodes
     *         otherChargeSubCodes} - (1,1)</code> <li>Contains list of <code> OtherChargeSubCodeDto</code>
     *         </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the otherchargesubcode update operation fails the above mentioned error codes
     *             are returned. Each CodeMessage contains the status code,human readable message and message
     *             type.<br>
     */

    OtherChargeCodeResponse updateOtherChargeSubCode(
                OtherChargeSubCodePersistRequest pOtherChargeSubCodePersistRequest) throws LMSException;

    /**
     * Finds the <code>Currency</code>.
     * <p>
     * <p>
     * If <code>currencycode</code> is given, find the Currency information details by
     * <code>currencycode.</code><br>
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
     *            Holds the list of search input values
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OtherChargeCodeDto
     *         OtherChargeCodeDto}</code>
     *         </ul>
     *         <p>
     * @throws LMSException If the validate othercharge code operation fails the appropriate error codes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.<br>
     */
    ValidationResponse validateOtherChargeCode(ValidationRequest pValidationRequest) throws LMSException;
    
    MultipleFindResponse findOtherChargeCodes(MultipleFindRequest pMultipleFindRequest) throws LMSException;

}
