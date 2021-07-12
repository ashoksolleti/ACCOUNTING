/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeResponse;

/**
 * Interface of the services offered by <code>CustomsStatusCodeService</code>.
 * <p>
 * <code>CustomsStatusCodeService</code> class exposes the CustomsStatusCodeServiceImpl that performs the
 * actions for maintaining CustomsStatus Code information. This performs the following functions.<br>
 * <ul>
 * <li>Creates the customs status code.</li>
 * <li>Updates the customs status code.</li>
 * <li>Finds the customs status code.</li>
 * <li>Deletes the customs status code.</li>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeResponse
 * @see com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
 */
public interface CustomsStatusCodeService {

    /**
     * Creates the <code>CustomsStatusCode</code> information.
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
     * @param pCustomsStatusCodePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodePersistRequest
     *            CustomsStatusCodePersistRequest} </code><br>
     *            The request object includes the attributes to create CustomsStatus code details.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodePersistRequest
     *            CustomsStatusCodePersistRequest} - (M)</code></li>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto
     *            CustomsStatusCodeDto} - (M)</code></li>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto#setCode
     *            customsStatusCode} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto#setCountryCode
     *            countryCode} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto#setDescription
     *            description} - (M)</code></li>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeResponse
     *         CustomsStatusCodeResponse}</code><br>
     *         Returns the customs status code response object.<br>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeResponse#getCustomsStatusCodes
     *         customsStatusCodes} - (1,*)</code></li>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto
     *         customsStatusCodeDto} - (1,*)</code></li>
     *         </ul>
     *         </ul>
     *         </p>
     * @throws LMSException If the creation of customs status code fails.
     */
    CustomsStatusCodeResponse createCustomsStatusCode(
                CustomsStatusCodePersistRequest pCustomsStatusCodePersistRequest) throws LMSException;

    /**
     * Deletes the <code>CustomsStatusCode</code>. Validates the unique identifier and deletes the customs
     * status code information using the unique identifier.
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
     * </p>
     * 
     * @param pCustomsStatusCodeDeleteRequest <code>CustomsStatusCodeDeleteRequest</code> object includes the
     *            oid attribute to delete the customs status code.
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDeleteRequest CustomsStatusCodeDeleteRequest}</code>
     * <br>
     *            Holds attributes to delete a CustomsStatusCode.<br>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDeleteRequest#setOId oId} - (M)</code>
     *            </li>
     *            </ul>
     *            </p>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeResponse
     *         CustomsStatusCodeResponse}</code><br>
     *         Returns the customs status code response object that holds the customs status code dto.<br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto
     *         CustomsStatusCodeDto} </code></li>
     *         </ul>
     *         </p>
     * @throws LMSException If not able to delete the Customs Status Code.
     */
    CustomsStatusCodeResponse deleteCustomsStatusCode(
                CustomsStatusCodeDeleteRequest pCustomsStatusCodeDeleteRequest) throws LMSException;

    /**
     * Finds the list of customs status code.
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
     * @param pCustomsStatusCodeFindRequest <code>pCustomsStatusCodeFindRequest</code><br>
     *            Contains the customs status code find request object.<br>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto
     *         CustomsStatusCodeDto}</code><br>
     *         Returns the customs status code response object.<br>
     *         </p>
     * @throws LMSException If no customs status code is obtained.
     */
    CustomsStatusCodeResponse
                findCustomsStatusCode(CustomsStatusCodeFindRequest pCustomsStatusCodeFindRequest)
                            throws LMSException;

    /**
     * Updates the <code>CustomsStatusCode</code> information.
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
     * @param pCustomsStatusCodePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodePersistRequest
     *            CustomsStatusCodePersistRequest}</code><br>
     *            The request object includes the attributes to update customs status code details.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RestrictionPersistRequest
     *            RestrictionPersistRequest} - (M)</code></li>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto
     *            CustomsStatusCodeDto}- (M)</code></li>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto#setCode
     *            customsStatusCode} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto#setOId oId}- (M)</code>
     *            </li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto#setCountryCode
     *            countryCode} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto#setDescription
     *            description} - (M)</code></li>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeResponse
     *         CustomsStatusCodeResponse}</code><br>
     *         Returns the restriction response object.<br>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeResponse#getCustomsStatusCodes
     *         customsStatusCode} - (1,*)</code></li>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsStatusCodeDto
     *         customsStatusCodeDto} - (1,*)</code></li>
     *         </ul>
     *         </ul>
     *         </p>
     * @throws LMSException If the updation of customs status code fails.
     */
    CustomsStatusCodeResponse updateCustomsStatusCode(
                CustomsStatusCodePersistRequest pCustomsStatusCodePersistRequest) throws LMSException;

    /**
     * Validates if the <code>CustomsStatusCode</code> exists for the provided input.
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
     *            includes the attributes to find customs status code.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M)(1:*)</code><br>
     *            holds the list of customs status codes.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs
     *         validInputs}-(0:*)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs
     *         searchInputs} -(1:*)</code>
     *         </ul>
     *         <p>
     */
    ValidationResponse validateCustomsStatusCode(final ValidationRequest pValidationRequest);

}
