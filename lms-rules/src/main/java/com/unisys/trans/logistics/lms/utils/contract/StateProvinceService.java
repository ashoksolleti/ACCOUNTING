//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.StateProvinceDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.StateProvinceFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.StateProvincePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.StateProvinceResponse;

/**
 * <code>StateProvinceService</code> handles the maintenance of State and
 * Province
 * <p>
 * State and Province is created for a Country. <br>
 * This has the following functions:
 * <ul>
 * <li>Creates a State and Province.
 * <li>Updates a State and Province.
 * <li>Deletes a State and Province.
 * <li>Retrieves the State and Provinces.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.StateProvinceDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.StateProvinceFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.StateProvincePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.StateProvinceResponse
 */
public interface StateProvinceService {
    /**
     * Creates the State and Province.
     * <p>
     * State/Province is created to a Country. State/Province should be unique to a country. The system
     * records history for the creation of the State and Province.
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="0" cellspacing="0" * cellpadding="5">
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATE_PROVINCE_ALREADY_EXIST}</code>
     * </td><br>
     * <td>The state and province already exists for the country and duplicates are not allowed.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pStateProvincePersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvincePersistRequest
     *            StateProvincePersistRequest}</code><br>
     *            includes the attributes to create a State/Province.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto
     *            stateProvince} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto#setAbbreviation
     *            abbreviation} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto#setCountryCode
     *            countryCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto#setIataCode
     *            iataCode} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto#setName
     *            name} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto#setOId
     *            oId} - (C)</code> <br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceResponse
     *         StateProvinceResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATE_PROVINCE_CREATED}
     *         </code> for successful create. <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceResponse#getStateProvinceDtos()
     *         stateProvinceDtos} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto
     *         StateProvinceDto} </code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    StateProvinceResponse createStateProvince(
                StateProvincePersistRequest pStateProvincePersistRequest)
                throws LMSException;

    /**
     * Deletes the State and Province.
     * <p>
     * In order to delete a State and Province, the given IataCode must exist in the system. The system
     * records history for the delete of the State and Province.
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="0" cellspacing="0" * cellpadding="5">
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATE_PROVINCE_COUNTRY_COMBINATION_NOT_EXIST}</code>
     * </td><br>
     * <td>The country, State and Province combination does not exist in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pStateProvinceDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDeleteRequest
     *            StateProvinceDeleteRequest}</code><br>
     *            includes the attributes to delete a State and Province.
     *            <ul>
     *            <code> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDeleteRequest#setOId
     *            oId} - (M) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDeleteRequest#setCountryCode
     *            countryCode} - (M) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDeleteRequest#setIataCode
     *            iataCode} - (M) </code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceResponse
     *         StateProvinceResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATE_PROVINCE_DELETED}
     *         </code> for successful delete.
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If the validation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    StateProvinceResponse deleteStateProvince(
                StateProvinceDeleteRequest pStateProvinceDeleteRequest)
                throws LMSException;

    /**
     * Finds the State and Province.
     * <p>
     * <li>The system returns all the State and Province for the given Country
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="0" cellspacing="0" * cellpadding="5">
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATE_PROVINCE_COUNTRY_NOT_EXIST}</code>
     * </td><br>
     * <td>No countries found for the given CountryCode.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pStateProvinceFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceFindRequest
     *            StateProvinceFindRequest}</code><br>
     *            includes the attributes to find State and Province.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceFindRequest#setCountryCode
     *            countryCode} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceResponse
     *         StateProvinceResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceResponse#getStateProvinceDtos()
     *         StateProvinceDtos} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto
     *         StateProvinceDto} </code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validations fail, the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    StateProvinceResponse findStateProvince(
                StateProvinceFindRequest pStateProvinceFindRequest)
                throws LMSException;

    /**
     * Updates the State and Province details.
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="0" cellspacing="0" * cellpadding="5">
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATE_PROVINCE_ALREADY_EXIST}</td>
     * <br>
     * <td>The state and province already exists for the country and duplicates are not allowed.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pStateProvincePersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvincePersistRequest
     *            StateProvincePersistRequest}</code><br>
     *            includes the attributes to create a State/Province.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto
     *            stateProvince} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto#setAbbreviation
     *            abbreviation} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto#setCountryCode
     *            countryCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto#setIataCode
     *            iataCode} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto#setName
     *            name} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto#setOId
     *            oId} - (C)</code> <br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceResponse
     *         StateProvinceResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATE_PROVINCE_CREATED}
     *         </code> for successful create. <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceResponse#getStateProvinceDtos()
     *         stateProvinceDtos} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StateProvinceDto
     *         StateProvinceDto} </code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validations fail, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message and message type.
     */
    StateProvinceResponse updateStateProvince(
                StateProvincePersistRequest pStateProvincePersistRequest)
                throws LMSException;

}
