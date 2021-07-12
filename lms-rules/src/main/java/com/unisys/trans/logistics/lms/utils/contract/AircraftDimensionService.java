/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.DimensionSearchResponse;
import com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionResponse;
import com.unisys.trans.logistics.lms.utils.dto.DimensionSearchRequest;

/**
 * <code>AircraftDimensionService</code> handles the AircraftDimension.
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>findAircraftDimension - Retrieves Spot Rate Information.
 * <li>updateAircraftDimension - Updates the Spot Rate Version information.
 * <li>deleteAircraftDimension - Deletes the AircraftDimension information.
 * <li>createAircraftDimension -Creates the Aircraft Dimension information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionFindRequest
 *      pAircraftDimensionFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionPersistRequest
 *      pAircraftDimensionPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDeleteRequest
 *      pAircraftDimensionDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionPersistRequest
 *      pAircraftDimensionPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.DimensionSearchRequest
 *      pDimensionSearchRequest
 */
public interface AircraftDimensionService {
    /**
     * Creates the <code>AircraftDimension</code> / <code><code/>.
     * <p>
     * This method Creates a new Aircraft Package Dimensions Table from the dimensions entered..<p>
     * <li>Validates the input members and creates an AircraftDimension with the members.</li></ul>
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AircraftDimensionService#findAircraftDimension
     * findAircraftDimension}<br>
     * <p>
     * To create the AircraftDimension user must provide following input:<br>
     * <li>Aircraftcode
     * <li>dimensionEntryDto
     * <li>dimensionUnit
     * <li>maximumPackageHeight
     * <li>maximumPackageWidth
     * <li>standardEntryIndicator
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
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AIRCRAFT_CODE_UNIQUE AIRCRAFT_CODE_UNIQUE}</code>
     * </td> <td align="left">Invalid aircraft code.</td> </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AIRCRAFT_INVALID_INSTANCE AIRCRAFT_INVALID_INSTANCE}</code>
     * </td>
     * <td align="left">Invalid aircraft code.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AIRCRAFT_DOES_NOT_EXIST AIRCRAFT_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Aircraft Code does not exist.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AIRCRAFT_CODE_MANDATORY AIRCRAFT_CODE_MANDATORY}</code>
     * </td>
     * <td align="left">Aircraft Code Mandatory.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#MAXIMUM_PACKAGE_HEIGHT_MANDATORY MAXIMUM_PACKAGE_HEIGHT_MANDATORY}</code>
     * </td>
     * <td align="left">Maximum Package Height mandatory.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#MAXIMUM_PACKAGE_WIDTH_MANDATORY MAXIMUM_PACKAGE_WIDTH_MANDATORY}</code>
     * </td>
     * <td align="left">Maximum Package Width mandatory.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#DIMENSION_UNIT_MANDATORY DIMENSION_UNIT_MANDATORY}</code>
     * *</td>
     * <td align="left">Dimension Unit Mandatory.</td>
     * </tr>
     * </table>
     * 
     * 
     * <p>
     * 
     * @param pAircraftDimensionPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionPersistRequest
     *            AircraftDimensionPersistRequest}</code><br>
     *            includes the attributes to update an <code>AircraftDimension</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDto
     *            AircraftDimensionDto} - (M)</code></li>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.DimensionEntryDto# DimensionEntryDto } - (M)
     *            <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.DimensionEntryDto#setHeight
     *            Height} -(M) </li> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.DimensionEntryDto#setWidth
     *            Width} -(M) </li> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.DimensionEntryDto#setLength
     *            Length} -(M) </li>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDto#setAircraftCode
     *            AircraftCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDto#setDimensionUnit
     *            DimensionUnit} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDto#setMaximumPackageHeight
     *            MaximumPackageHeight} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDto#setMaximumPackageWidth
     *            MaximumPackageWidth } - (M)</code></li> </ul> </code></li>
     *            </ul> </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionResponse
     *         AircraftDimensionResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code></li> holds the CodeMessage
     *         <ul>
     *         <li>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AIRCRAFT_PACKAGE_CREATED_SUCCESSFULLY
     *         AIRCRAFT_PACKAGE_CREATED_SUCCESSFULLY} </code> <br>
     *         <code>for successful creation of AircraftDimension.</code></li>
     *         </ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionResponse#getAircraftDimensionDto()
     *         AircraftDimensionDto} - (1:*)</code></li> </ul>
     * @throws LMSException
     *             If creation fails, above mentioned error codes are returned.
     *             Each CodeMessage contains the status code, human readable
     *             message, and message type.
     */
    AircraftDimensionResponse createAircraftDimension(
                AircraftDimensionPersistRequest pAircraftDimensionPersistRequest)
                throws LMSException;

/**
     * Deletes the <code>AircraftDimension</code> / <code>RCA<code/>.
     * <p>
     * This method deletes an AircraftDimension based on rcaIndicator.<p>
     * <li>Deletes AircraftDimension.</li></ul>
     * <ul><li>Deletes AircraftDimension.</li></ul> 
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AircraftDimensionService#DeleteAircraftDimension
     * DeleteAircraftDimension}<br>
     * <p>
     * To delete the AircraftDimension user must provide following input:<br>
     * <li>oId
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
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AIRCRAFT_DOES_NOT_EXIST AIRCRAFT_DOES_NOT_EXIST}</code>
     * </td> <td align="left">The AircraftDimension code is marked for deletion.</td> </tr>
     * 
     * </table>
     * <p> 
     * @param pAircraftDimensionDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDeleteRequest
     *            AircraftDimensionDeleteRequest}</code><br>
     *            includes the below attributes to delete an <code>AircraftDimension </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDeleteRequest#setOId
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionResponse
     *         AircraftDimensionResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code></li> holds the CodeMessage
     *         <ul>
     *         <li>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AIRCRAFT_PACKAGE_DELETED_SUCCESSFULLY
     *         AIRCRAFT_PACKAGE_DELETED_SUCCESSFULLY} </code> <br>
     *         <code>for successful delete of AircraftDimension.</code></li>
     *         </ul>
     *         </ul>
     * @throws LMSException If delete fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    AircraftDimensionResponse deleteAircraftDimension(
                AircraftDimensionDeleteRequest pAircraftDimensionDeleteRequest)
                throws LMSException;

    /**
     * Finds the <code>AircraftDimension</code> / <code><code/>.
     * <p>
     * This method finds an AircraftDimension based on input Aircraft code.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AircraftDimensionService#findAircraftDimension
     * findAircraftDimension}<br>
     * <p>
     * To find the AircraftDimension user must provide following input:
     * <li>code</li><br>
     * If code is not input, this method returns all the AircraftDimensions.
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
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AIRCRAFT_DOES_NOT_EXIST AIRCRAFT_DOES_NOT_EXIST}</code>
     * 
     * 
     * </table>
     * <p>
     * 
     * @param pAircraftDimensionFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionFindRequest
     *            AircraftDimensionFindRequest}</code><br>
     *            includes the below attributes to find an <code>AircraftDimension </code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionFindRequest#setAircraftCode
     *            AircraftCode} - (M)</code></li> <li><code>
     *           </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionResponse
     *         AircraftDimensionResponse}</code>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionResponse#getAircraftDimensionDto()
     *         AircraftDimensionDto} - (1:*)</code></li>
     *         </ul>
     * @throws LMSException
     *             If find fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message,
     *             and message type.
     */
    AircraftDimensionResponse findAircraftDimension(
                AircraftDimensionFindRequest pAircraftDimensionFindRequest)
                throws LMSException;

    /**
     * finds the invalid aircraftcodes for the given package dimension.
     */
    DimensionSearchResponse invalidAircraftCodesForDimension(
                DimensionSearchRequest pDimensionSearchRequest) throws LMSException;

    /**
     * Updates the <code>AircraftDimension</code> / <code><code/>.
     * <p>
     * This method updates a new Aircraft Package Dimensions Table from the dimensions entered..<p>
     * <li>Validates the input members and creates an AircraftDimension with the members.</li></ul>
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.AircraftDimensionService#findAircraftDimension
     * findAircraftDimension}<br>
     * <p>
     * To create the AircraftDimension user must provide following input:<br>
     * <li>Aircraftcode
     * <li>dimensionEntryDto
     * <li>dimensionUnit
     * <li>maximumPackageHeight
     * <li>maximumPackageWidth
     * <li>standardEntryIndicator
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
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AIRCRAFT_CODE_UNIQUE AIRCRAFT_CODE_UNIQUE}</code>
     * </td> <td align="left">Invalid aircraft code.</td> </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AIRCRAFT_INVALID_INSTANCE AIRCRAFT_INVALID_INSTANCE}</code>
     * </td>
     * <td align="left">Invalid aircraft code.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AIRCRAFT_DOES_NOT_EXIST AIRCRAFT_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Aircraft Code does not exist.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AIRCRAFT_CODE_MANDATORY AIRCRAFT_CODE_MANDATORY}</code>
     * </td>
     * <td align="left">Aircraft Code Mandatory.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#MAXIMUM_PACKAGE_HEIGHT_MANDATORY MAXIMUM_PACKAGE_HEIGHT_MANDATORY}</code>
     * </td>
     * <td align="left">Maximum Package Height mandatory.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#MAXIMUM_PACKAGE_WIDTH_MANDATORY MAXIMUM_PACKAGE_WIDTH_MANDATORY}</code>
     * </td>
     * <td align="left">Maximum Package Width mandatory.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#DIMENSION_UNIT_MANDATORY DIMENSION_UNIT_MANDATORY}</code>
     * </td>
     * <td align="left">Exclusion within a previously specified Exclusion.</td>
     * </tr>
     * <td align="left">Dimension Unit Mandatory.</td> </tr> </table>
     * <p>
     * 
     * @param pAircraftDimensionPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionPersistRequest
     *            AircraftDimensionPersistRequest}</code><br>
     *            includes the attributes to update an <code>AircraftDimension</code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDto
     *            AircraftDimensionDto} - (M)</code></li>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.DimensionEntryDto# DimensionEntryDto } - (M)
     *            </code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDto#setAircraftCode
     *            AircraftCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDto#setDimensionUnit
     *            DimensionUnit} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDto#setMaximumPackageHeight
     *            MaximumPackageHeight} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionDto#setMaximumPackageWidth
     *            MaximumPackageWidth} - (M)</code></li> <li><code> </li> </li> <li> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.DimensionEntryDto#setHeight
     *            Height} -(M) </li> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.DimensionEntryDto#setWidth
     *            Width} -(M) </li> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.DimensionEntryDto#setLength
     *            Length} -(M) </li>
     *            </ul>
     *            </code></li> </ul> </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionResponse
     *         AircraftDimensionResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code></li> holds the CodeMessage
     *         <ul>
     *         <li>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#AIRCRAFT_PACKAGE_UPDATED_SUCCESSFULLY
     *         AIRCRAFT_PACKAGE_UPDATED_SUCCESSFULLY} </code> <br>
     *         <code>for successful update of AircraftDimension.</code></li> <li>
     *         </ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.AircraftDimensionResponse#getAircraftDimensionDto()
     *         AircraftDimensionDto} - (1:*)</code></li> </ul>
     * @throws LMSException
     *             If creation fails, above mentioned error codes are returned.
     *             Each CodeMessage contains the status code, human readable
     *             message, and message type.
     */

    AircraftDimensionResponse updateAircraftDimension(
                AircraftDimensionPersistRequest pAircraftDimensionPersistRequest)
                throws LMSException;

    DimensionSearchResponse validatePackageDimensionForAircraft(
                DimensionSearchRequest pDimensionSearchRequest) throws LMSException;

    AircraftDimensionResponse findExactAircraftDimension(
                AircraftDimensionFindRequest pAircraftDimensionFindRequest) throws LMSException;
}
