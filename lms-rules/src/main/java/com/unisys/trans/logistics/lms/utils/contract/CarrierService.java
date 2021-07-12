/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import java.util.List;

import javax.ejb.Remote;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.CarrierDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.CarrierDto;
import com.unisys.trans.logistics.lms.utils.dto.CarrierFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.CarrierPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.CarrierResponse;
import com.unisys.trans.logistics.lms.utils.dto.CarrierRestoreRequest;

/**
 * <code>CarrierService</code> is used to maintain the carrier information.
 * <p>
 * This performs the following functions:
 * <ul>
 * <li>Creates a new carrier.
 * <li>Deletes an existing carrier.
 * <li>Finds a carrier.
 * <li>Finds multiple carriers.
 * <li>Updates the existing carrier details.
 * <li>Validates carrier codes.
 * <li>Validates carrier numbers.
 * </ul>
 * <p>
 * A carrier information defines an airline in the system and contains specific data applicable to the
 * airline.
 * <p>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.CarrierDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.CarrierFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.CarrierPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.CarrierResponse
 * @see com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
 * @see com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
 */
public interface CarrierService {

    /**
     * Creates a new carrier.
     * <p>
     * In order to create a carrier, the carrier code or carrier number of the input carrier must not exist in
     * the system. <br>
     * Carrier details are as follows:
     * <ul>
     * <li>Carrier Code
     * <li>Carrier Number
     * <li>Carrier Name
     * <li>Address
     * <li>City
     * <li>State
     * <li>Country
     * <li>Phone
     * <li>Fax
     * <li>Print Handled Carrier Transfers
     * <li>Shipment Data Capture is required
     * <li>FBL Interest Carrier
     * <li>Print Freight Bill Address
     * <li>ULD Control Interest Carrier Indicator
     * <li>Host Carrier For Air Waybill Capture Indicator
     * <li>Alliances
     * </ul>
     * The carrier information is returned after creation.
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
     * <b>The following response code may be returned.</b>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_INVALID_CODENOTEXIST}</code>
     * </td>
     * <td align="left">Country code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code> {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERSERVICE_ENTITY_ALREADY_EXIST}</code>
     * </td>
     * <td align="left">Carrier code already exist in the system..</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code> {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTAL_CODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Postal Code does not exist in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pCarrierPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierPersistRequest
     *            CarrierPersistRequest} </code><br>
     *            holds the attributes to create a carrier.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto
     *            CarrierDto} - (M) </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setAddress
     *            address} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setAirlineCodeNumber
     *            airlineCodeNumber} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setCarrierAlliances
     *            carrierAlliances} - (O)(0:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierAllianceDto
     *            CarrierAllianceDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierAllianceDto#setAllianceCode
     *            allianceCode} - (M)</code>
     *            </ul>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setCity
     *            city} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setCode
     *            code} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setCountry
     *            country} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setFax
     *            fax} - (O) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setFblInterestIndicator
     *            fblInterestIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setHostCarrierAWBCaptureInd
     *            hostCarrierAWBCaptureInd} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setName
     *            name} - (M)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setPhone
     *            phone} - (O) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setPostalCode
     *            postalCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setPrintFreightBillAddress
     *            printFreightBillAddress} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setPrintTransferIndicator
     *            printTransferIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setShipmentCaptureIndicator
     *            shipmentCaptureIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setState
     *            state} - (O)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setUldControlInterestInd
     *            uldControlInterestInd} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierResponse
     *         CarrierResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto
     *         CarrierDto} </ul> </code>
     *         <p>
     * @throws LMSException
     *             If validation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    CarrierResponse createCarrier(CarrierPersistRequest pCarrierPersistRequest)
                throws LMSException;

    /**
     * Marks for delete an existing carrier.
     * <p>
     * In order to delete the carrier, a carrier with input oid must exist in the system.
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
     * <b>The following response code may be returned.</b>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERCODE_NOTEXISTS}</code>
     * </td>
     * <td align="left">Carrier code does not exist in the system.</td>
     * </tr>
     * <tr>
     * </table>
     * <p>
     * 
     * @param pCarrierDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDeleteRequest
     *            CarrierDeleteRequest} </code><br>
     *            holds the attributes to delete the carrier information.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDeleteRequest#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDeleteRequest#setOId
     *            oId} - (M) </code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierResponse
     *         CarrierResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response Fields} </ul> </code>
     *         <p>
     * @throws LMSException
     *             If validation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    CarrierResponse deleteCarrier(CarrierDeleteRequest pCarrierDeleteRequest)
                throws LMSException;

    /**
     * Finds the carrier information based on the input carrier code / carrier
     * number.
     * <p>
     * If carrierCode is given, then find the carrier information by carrierCode else find the carrier
     * information by carrierNumber. If both carrierCode and carrierNumber is provided then only carrierCode
     * is used to find the carrier information.
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
     * <b>The following response code may be returned.</b>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERNUMBER_NOTEXISTS}</code>
     * </td>
     * <td align="left">Carrier number does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code> {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERCODE_NOTEXISTS}</code>
     * </td>
     * <td align="left">Carrier code does not exist in the system..</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pCarrierFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierFindRequest
     *            CarrierFindRequest}</code><br>
     *            holds the attribute to retrieve the carrier details.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierFindRequest#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierFindRequest#setAirlineCodeNumber
     *            airlineCodeNumber} - (C)</code><br>
     *            Mandatory if carrier code is not entered; otherwise optional.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierResponse
     *         CarrierResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         ResponseFields} <li> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto
     *         CarrierDto} </ul> </code>
     *         <p>
     * @throws LMSException
     *             If validation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    CarrierResponse findCarrier(CarrierFindRequest pCarrierFindRequest)
                throws LMSException;

    /**
     * Finds the carrier information for all the input carrier codes.
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
     * @param pMultipleFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest
     *            MultipleFindRequest} </code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M)</code> holds the list of carrier codes used to find the carrier
     *            information.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*) </code><br>
     *         holds the carrier code as key and <code>CarrierDto</code> as value.
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If the validation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    MultipleFindResponse findCarriers(
                final MultipleFindRequest pMultipleFindRequest) throws LMSException;

    /**
     * Restores an existing carrier.
     * <p>
     * In order to delete the carrier, a carrier with input oid must exist in the system.
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
     * <b>The following response code may be returned.</b>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERCODE_NOTEXISTS}</code>
     * </td>
     * <td align="left">Carrier code does not exist in the system.</td>
     * </tr>
     * <tr>
     * </table>
     * <p>
     * 
     * @param pCarrierRestoreRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierRestoreRequest
     *            CarrierRestoreRequest} </code><br>
     *            holds the attributes to restore the carrier information.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierRestoreRequest#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierRestoreRequest#setOId
     *            oId} - (M) </code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierResponse
     *         CarrierResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response Fields} </ul> </code>
     *         <p>
     * @throws LMSException
     *             If validation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    CarrierResponse restoreCarrier(CarrierRestoreRequest pCarrierRestoreRequest)
                throws LMSException;

    /**
     * Updates the existing carrier details.
     * <p>
     * In order to update the carrier, the carrier code must exist in the system. <br>
     * Carrier details that exist in the system that can be updated are as follows :
     * <ul>
     * <li>Carrier Code
     * <li>Carrier Number
     * <li>Carrier Name
     * <li>Address
     * <li>City
     * <li>State
     * <li>Country
     * <li>Phone
     * <li>Fax
     * <li>Print Handled Carrier Transfers
     * <li>Shipment Data Capture is required
     * <li>FBL Interest Carrier
     * <li>Print Freight Bill Address
     * <li>ULD Control Interest Carrier Indicator
     * <li>Host Carrier For Air Waybill Capture Indicator
     * <li>Alliances
     * </ul>
     * <br>
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
     * <b>The following response code may be returned.</b>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_INVALID_CODENOTEXIST}</code>
     * </td>
     * <td align="left">Country code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code> {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERSERVICE_OBJECT_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Carrier code does not exist in the system..</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code> {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTAL_CODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">Postal Code does not exist in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pCarrierPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierPersistRequest
     *            CarrierPersistRequest} </code><br>
     *            holds the attributes to create a carrier.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto
     *            CarrierDto} - (M) </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setAddress
     *            address} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setAirlineCodeNumber
     *            airlineCodeNumber} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setCarrierAlliances
     *            carrierAlliances} - (O)(0:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierAllianceDto
     *            CarrierAllianceDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierAllianceDto#setAllianceCode
     *            allianceCode} - (M)</code>
     *            </ul>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setCity
     *            city} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setCode
     *            code} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setCountry
     *            country} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setFax
     *            fax} - (O) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setFblInterestIndicator
     *            fblInterestIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setHostCarrierAWBCaptureInd
     *            hostCarrierAWBCaptureInd} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setName
     *            name} - (M)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setPhone
     *            phone} - (O) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setPostalCode
     *            postalCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setPrintFreightBillAddress
     *            printFreightBillAddress} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setPrintTransferIndicator
     *            printTransferIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setShipmentCaptureIndicator
     *            shipmentCaptureIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setState
     *            state} - (O)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto#setUldControlInterestInd
     *            uldControlInterestInd} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierResponse
     *         CarrierResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         ResponseFields} <li> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto
     *         CarrierDto} </ul> </code>
     *         <p>
     * @throws LMSException
     *             If validation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    CarrierResponse updateCarrier(CarrierPersistRequest pCarrierPersistRequest)
                throws LMSException;

    /**
     * Validates if the input carrier codes are present in the system. The
     * response returned by this method contains two lists. One containing the
     * list of valid carrier codes and the other list contains the input carrier
     * codes. The input carrier codes not present in the list of valid carrier
     * codes are the invalid carrier codes.
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
     * <b>The following response code may be returned.</b>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERCODE_NOTEXISTS}</code>
     * </td>
     * <td align="left">The Carrier Code does not exist in the system..</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pValidationRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
     *            ValidationRequest}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M)(1:*)</code><br>
     *            the list of carrier codes that must be validated.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li> <code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs
     *         validInputs}-(0:*)</code><br>
     *         the list of carrier codes present in the system. <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs
     *         searchInputs} -(1:*)</code><br>
     *         the list of input carrier codes that was validated.
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If validation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    ValidationResponse validateCarrierCode(ValidationRequest pValidationRequest)
                throws LMSException;

    /**
     * Validates if the input carrier numbers are present in the system. The
     * response returned by this method contains two lists. One containing the
     * list of valid carrier numbers and the other list contains the input
     * carrier numbers. The input carrier numbers not present in the list of
     * valid carrier numbers are the invalid carrier numbers.
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
     * <b>The following response code may be returned.</b>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERNUMBER_NOTEXISTS}</code>
     * </td>
     * <td align="left">The Carrier number does not exist in the system..</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pValidationRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
     *            ValidationRequest}</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M)(1:*)</code> holds the list of carrier numbers that must be validated.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li> <code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs
     *         validInputs}-(0:*)</code><br>
     *         the list of carrier numbers present in the system. <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs
     *         searchInputs} -(1:*)</code><br>
     *         the list of input carrier numbers that was validated.
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If validation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    ValidationResponse validateCarrierNumber(
                ValidationRequest pValidationRequest) throws LMSException;

    /**
     * Deletes the <code>Carrier</code>.
     * <p>
     * This method deletes the Carrier.
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
    BatchResponse purgeCarrier(BatchRequest pBatchRequest) throws LMSException;

    /**
     * Writes the discrepancy report for<code>Carrier</code>.
     * <p>
     * This method writes the discrepancy report for Carrier.
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
     * @param pReport
     *            holds the constant carrier is found or not.
     * 
     * @throws LMSException
     *             If delete fails, above mentioned error codes are returned.
     *             Each CodeMessage contains the status code, human readable
     *             message, and message type.
     */
    BatchResponse discrepencyReportCarrier(BatchRequest pBatchRequest, final StringBuffer pReport)
                throws LMSException;
    
    /**
     * Finds the carrier information for all the input carrier numbers.
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
     * @param pMultipleFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest
     *            MultipleFindRequest} </code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M)</code> holds the list of carrier numbers used to find the carrier
     *            information.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*) </code><br>
     *         holds the carrier number as key and <code>CarrierDto</code> as value.
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If the validation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    MultipleFindResponse findCarriersByCarrierNumber(MultipleFindRequest pMultipleFindRequest);
    
    /**
     * Find the Carrier information by the carrier number.
     * <p>
     * 
     * @param pAbstractRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierFindRequest
     *            CarrierFindRequest}</code> The reqeust object holds all the
     *            global attributes of the header and user principles.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierFindRequest#setCarrierNumber
     *            carrierNumber} - (M)</code>
     *            </ul>
     *            <p>
     * @param pCarrierNumber
     *            Contains the airline number.<br>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierResponse
     *         CarrierResponse}</code><br>
     *         the list of the containing carrier information if exact match is
     *         not required, else returns the exact carrier code.<br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto
     *         CarrierDto}</code>
     *         </ul>
     * @throws LMSException
     *             If validation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human
     *             readable message and message type.
     */
    
    CarrierResponse findCarrierByNumber( final AbstractRequest pAbstractRequest, final String pCarrierNumber)
                throws LMSException;
    
    /**
     * Find the Carrier information by the carrier number.
     * <p>
     * 
     * @param pAbstractRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierFindRequest
     *            CarrierFindRequest}</code> The reqeust object holds all the
     *            global attributes of the header and user principles.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierFindRequest#setCarrierNumber
     *            carrierNumber} - (M)</code>
     *            </ul>
     *            <p>
     * @param pCarrierNumber
     *            Contains the airline number.<br>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierResponse
     *         CarrierResponse}</code><br>
     *         the list of the containing carrier information if exact match is
     *         not required, else returns the exact carrier code.<br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDto
     *         CarrierDto}</code>
     *         </ul>
     * @throws LMSException
     *             If validation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human
     *             readable message and message type.
     */
    
    CarrierResponse findCarrierByAccountNumber( final AbstractRequest pAbstractRequest, final String pCarrierNumber)
                throws LMSException;
    
    
    
    List<CarrierDto> findCarrierByHostIndicator()
           throws LMSException;
	/**
	 * 
	 * Finds the affliate information for the host carrier.
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
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
	 *         MultipleFindResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
	 *         retrievedObjects} - (0:*) </code><br>
	 *         holds the carrier number as key and <code>CarrierDto</code> as
	 *         value.
	 *         </ul>
	 *         <p>
	 * @throws LMSException
	 *             If the validation fails, the above mentioned error codes are
	 *             returned. Each CodeMessage contains the status code, human
	 *             readable message, and message type.
	 */
	MultipleFindResponse findHostAffliates() throws LMSException;

    CarrierResponse findCarrierByName(
            final CarrierFindRequest pCarrierFindRequest) throws LMSException;    // LMSC-11132 Change


}