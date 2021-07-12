/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfilePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileResponse;

/**
 * Interface of the services offered by <code>TeleTypeProfileService</code>.
 * <p>
 * <code>TeleTypeProfileService</code> handles the maintenance of teletype profile required for a cargo
 * application. The Teletype Sending Profile function allows setting up teletype (TTY) addresses that are used
 * for the generation of the following message types:
 * <li>FFM (Flight Manifest)
 * <li>FFR (Freight Request for Space Allocation)
 * <li>FSU (Master/House Freight Status Update)
 * <li>FWB (Freight Waybill)
 * <li>FHL (House/Consolidation List)
 * <li>FBL (Freight Booking List)
 * <li>FAD (Freight Discrepancy)
 * <p>
 * This performs the following functions:
 * <ul>
 * <li>Creates a teletype profile.
 * <li>Updates a teletype profile.
 * <li>Deletes a teletype profile.
 * <li>Finds the teletype profile.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfilePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileResponse
 */
public interface TeleTypeProfileService {
    /**
     * Creates a teletype profile information for the message type.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.TeleTypeProfileService#updateTeleTypeProfile
     * updateTeleTypeProfile}
     * <p>
     * Duplicate teletype sending profile must not exist for the teletype message type. At least one of the
     * following attributes must be unique for teletype sending profile information:
     * <li>Origin Country Code/Area
     * <li>Origin Station Code
     * <li>Destination Country Code/Area
     * <li>Destination Station Code
     * <li>Carrier Code
     * <li>Airline Code Number (ACN)
     * <li>Flight
     * <li>Product Code
     * <li>Special Handling Code (SPL)
     * <li>FWB message sending option
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#CENTRAL_TTY_STATION_CODE}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#CENTRAL_TTY_OFFICE_CODE}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#HOST_CARRIER_CODE}
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
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_ORIGINAREA_NOT_EXIST}</td>
     *            <td>Origin Area does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_DESTNAREA_NOT_EXIST}</td>
     *            <td>Destination Area does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_ORIGINCOUNTRY_NOT_EXIST}</td>
     *            <td>Origin Country does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_DESTNCOUNTRY_NOT_EXIST}</td>
     *            <td>Destination Country does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_ORIGINSTATION_NOT_EXIST}</td>
     *            <td>Origin Station code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_DESTNSTATION_NOT_EXIST}</td>
     *            <td>Destination Station code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_ORGNSTATION_EXISTCOUNTRY}</td>
     *            <td>Origin Station does not belong to the input Origin country/area.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_DESTNSTATION_EXISTCOUNTRY}</td>
     *            <td>Destination Station does not belong to the input Destination country/area.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERCODE_NOTEXISTS}</td>
     *            <td>The Carrier Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERNUMBER_NOTEXISTS}</td>
     *            <td>The Carrier Number does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_PRODUCTCODE_NOT_EXIST}</td>
     *            <td>Product code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_SPLHANDLINGCODE_NOT_EXIST}</td>
     *            <td>Special handling code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_MESSAGETYPE_DOES_NOT_MATCH}</td>
     *            <td>The message type associated with the unique key does not match
     *                the input message type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_STATIONCODE_CANNOTBESAME}</td>
     *            <td>Origin Station cannot be same as Destination station.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pTeleTypeProfilePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfilePersistRequest
     *            TeleTypeProfilePersistRequest}</code><br>
     *            contain all informations required to create a teletype sending profile.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto
     *            teleTypeProfile} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setAirlineCodeNumber
     *            airlineCodeNumber} - (C)</code><br>
     *            Allowed for FSU, FWB, FAD and FHL message types. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setCarrierCode
     *            carrierCode} - (C)</code><br>
     *            Allowed only for FFM, FFR, FWB, FHL and FBL message types. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setDestinationCode
     *            destinationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setDestinationStationCode
     *            destinationStationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setFlight flight} - (C)
     *            </code><br>
     *            Allowed only for FFM, FWB, and FHL message types.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setNumber number} -(M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setSuffix suffix} -(O)
     *            </code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setFwbMsgSendingOption
     *            fwbMsgSendingOption} - (C)</code><br>
     *            Allowed only for FWB message type. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setMessageType
     *            messageType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setOId oId} - (C)</code><br>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Prohibited for create operation.<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setOriginCode
     *            originCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setOriginStationCode
     *            originStationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setProductCode
     *            productCode} - (C)</code><br>
     *            Allowed only for FSU. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setSpecialHandlingCode
     *            specialHandlingCode} - (C)</code><br>
     *            Allowed only for FSU. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setTeleTypeAddress
     *            teleTypeAddress} - (M) (1:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeAddressDto
     *            TeleTypeAddressDto} </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeAddressDto#setOId oId} -
     *            (C)</code><br>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeAddressDto#setTeleTypeAddress
     *            teleTypeAddress} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeAddressDto#setTeleTypeProfileInfoOId
     *            teleTypeProfileInfoOId} - (C)</code><br>
     *            Prohibited for create operation.<br>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileResponse
     *         TeleTypeProfileResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response Fields} </ul>
     *         </code>
     *         <p>
     * @throws LMSException If the create operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code,human readable message and message type.<br>
     */
    TeleTypeProfileResponse
                createTeleTypeProfile(TeleTypeProfilePersistRequest pTeleTypeProfilePersistRequest)
                            throws LMSException;

    /**
     * Deletes the teletype profile for the message type.
     * <p>
     * For a teletype message type, there may be more than one teletype sending profiles. Hence, the teletype
     * sending profile that has to be deleted is identified by the unique key - object ID (oId).<br>
     * If additional teletype sending profile information exists for the message type, they are sorted on the
     * following sort criteria:
     * <li>Origin Country Code/Area
     * <li>Origin Station Code
     * <li>Destination Country Code/Area
     * <li>Destination Station Code
     * <li>Carrier Code
     * <li>Airline Code Number (ACN)
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
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_TTYPROFILE_EXISTS}</td>
     *            <td>No teletype sending profile exists for the provided search criteria.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pTeleTypeProfileDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDeleteRequest
     *            TeleTypeProfileDeleteRequest}</code><br>
     *            contains the unique key to identify the teletype sending profile that has to be deleted. 
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDeleteRequest#setOId oId} -
     *            (M)</code><br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileResponse
     *         TeleTypeProfileResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response Fields} </ul>
     *         </code>
     *         <p>
     * @throws LMSException If the delete operation fails the above mentioned error code is returned. Each
     *             CodeMessage contains the status code,human readable message and message type.
     */
    TeleTypeProfileResponse deleteTeleTypeProfile(TeleTypeProfileDeleteRequest pTeleTypeProfileDeleteRequest)
                throws LMSException;

    /**
     * Finds the teletype profile for the message type.
     * <p>
     * The teletype sending profile for teletype message types are sorted based on the following sort
     * criteria:
     * <li>Origin Country Code/Area
     * <li>Origin Station Code
     * <li>Destination Country Code/Area
     * <li>Destination Station Code
     * <li>Carrier Code
     * <li>Airline Code Number (ACN)
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
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_ORIGINAREA_NOT_EXIST}</td>
     *            <td>Origin Area does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_DESTNAREA_NOT_EXIST}</td>
     *            <td>Destination Area does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_ORIGINCOUNTRY_NOT_EXIST}</td>
     *            <td>Origin Country does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_DESTNCOUNTRY_NOT_EXIST}</td>
     *            <td>Destination Country does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_ORIGINSTATION_NOT_EXIST}</td>
     *            <td>Origin Station code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_DESTNSTATION_NOT_EXIST}</td>
     *            <td>Destination Station code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_ORGNSTATION_EXISTCOUNTRY}</td>
     *            <td>Origin Station does not belong to the input Origin country/area.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_DESTNSTATION_EXISTCOUNTRY}</td>
     *            <td>Destination Station does not belong to the input Destination country/area.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERCODE_NOTEXISTS}</td>
     *            <td>The Carrier Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERNUMBER_NOTEXISTS}</td>
     *            <td>The Carrier Number does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_PRODUCTCODE_NOT_EXIST}</td>
     *            <td>Product code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_SPLHANDLINGCODE_NOT_EXIST}</td>
     *            <td>Special handling code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_TTYPROFILE_EXISTS}</td>
     *            <td>No teletype sending profile exists for the provided search criteria.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pTeleTypeProfileFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileFindRequest
     *            TeleTypeProfileFindRequest}</code><br>
     *            contains the attributes to retrieve the teletype profile information.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto
     *            teleTypeProfile} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setAirlineCodeNumber
     *            airlineCodeNumber} - (C)</code><br>
     *            Allowed for FSU, FWB, FAD and FHL message types. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setCarrierCode
     *            carrierCode} - (C)</code><br>
     *            Allowed only for FFM, FFR, FWB, FHL and FBL message types. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setDestinationCode
     *            destinationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setDestinationStationCode
     *            destinationStationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setFlight flight} - (C)
     *            </code><br>
     *            Allowed only for FFM, FWB, and FHL message types.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setNumber number} -(M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setSuffix suffix} -(O)
     *            </code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setFwbMsgSendingOption
     *            fwbMsgSendingOption} - (C)</code><br>
     *            Allowed only for FWB message type. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setMessageType
     *            messageType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setOriginCode originCode}
     *            - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setOriginStationCode
     *            originStationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setProductCode
     *            productCode} - (C)</code><br>
     *            Allowed only for FSU. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setSpecialHandlingCode
     *            specialHandlingCode} - (C)</code><br>
     *            Allowed only for FSU. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setTeleTypeAddress
     *            teleTypeAddress} - (M) (1:1)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeAddressDto
     *            TeleTypeAddressDto} </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeAddressDto#setOId oId} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeAddressDto#setTeleTypeAddress
     *            teleTypeAddress} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeAddressDto#setTeleTypeProfileInfoOId
     *            teleTypeProfileInfoOId} - (M)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileResponse
     *         TeleTypeProfileResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response Fields} </ul>
     *         </code>
     *         <p>
     * @throws LMSException If the find operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code,human readable message and message type.
     */
    TeleTypeProfileResponse findTeleTypeProfiles(TeleTypeProfileFindRequest pTeleTypeProfileFindRequest)
                throws LMSException;

    /**
     * Updates the teletype profile information for a message type.
     * <p>
     * Duplicate teletype sending profile must not exist for the teletype message type. At least one of the
     * following attributes must be unique for teletype sending profile information:
     * <li>Origin Country Code/Area
     * <li>Origin Station Code
     * <li>Destination Country Code/Area
     * <li>Destination Station Code
     * <li>Carrier Code
     * <li>Airline Code Number (ACN)
     * <li>Flight
     * <li>Product Code
     * <li>Special Handling Code (SPL)
     * <li>FWB message sending option
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#CENTRAL_TTY_STATION_CODE}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#CENTRAL_TTY_OFFICE_CODE}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#HOST_CARRIER_CODE}
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
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_ORIGINAREA_NOT_EXIST}</td>
     *            <td>Origin Area does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_DESTNAREA_NOT_EXIST}</td>
     *            <td>Destination Area does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_ORIGINCOUNTRY_NOT_EXIST}</td>
     *            <td>Origin Country does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_DESTNCOUNTRY_NOT_EXIST}</td>
     *            <td>Destination Country does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_ORIGINSTATION_NOT_EXIST}</td>
     *            <td>Origin Station code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_DESTNSTATION_NOT_EXIST}</td>
     *            <td>Destination Station code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_ORGNSTATION_EXISTCOUNTRY}</td>
     *            <td>Origin Station does not belong to the input Origin country/area.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_DESTNSTATION_EXISTCOUNTRY}</td>
     *            <td>Destination Station does not belong to the input Destination country/area.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERCODE_NOTEXISTS}</td>
     *            <td>The Carrier Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERNUMBER_NOTEXISTS}</td>
     *            <td>The Carrier Number does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_PRODUCTCODE_NOT_EXIST}</td>
     *            <td>Product code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_SPLHANDLINGCODE_NOT_EXIST}</td>
     *            <td>Special handling code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_MESSAGETYPE_DOES_NOT_MATCH}</td>
     *            <td>The message type associated with the unique key does not match
     *                the input message type.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_STATIONCODE_CANNOTBESAME}</td>
     *            <td>Origin Station cannot be same as Destination station.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#TTYPROFILE_MSGTYPE_UNIQUE}</td>
     *            <td>Teletype sending profile must be unique for a message type.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pTeleTypeProfilePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfilePersistRequest
     *            TeleTypeProfilePersistRequest}</code><br>
     *            contain all informations required to update a teletype sending profile.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto
     *            teleTypeProfile} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setAirlineCodeNumber
     *            airlineCodeNumber} - (C)</code><br>
     *            Allowed for FSU, FWB, FAD and FHL message types. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setCarrierCode
     *            carrierCode} - (C)</code><br>
     *            Allowed only for FFM, FFR, FWB, FHL and FBL message types. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setDestinationCode
     *            destinationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setDestinationStationCode
     *            destinationStationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setFlight flight} - (C)
     *            </code><br>
     *            Allowed only for FFM, FWB, and FHL message types.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setNumber number} -(M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto#setSuffix suffix} -(O)
     *            </code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setFwbMsgSendingOption
     *            fwbMsgSendingOption} - (C)</code><br>
     *            Allowed only for FWB message type. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setMessageType
     *            messageType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setOId oId} - (M)</code>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Mandatory for update operation.<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setOriginCode
     *            originCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setOriginStationCode
     *            originStationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setProductCode
     *            productCode} - (C)</code><br>
     *            Allowed only for FSU. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setSpecialHandlingCode
     *            specialHandlingCode} - (C)</code><br>
     *            Allowed only for FSU. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileDto#setTeleTypeAddress
     *            teleTypeAddress} - (M) (1:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeAddressDto
     *            TeleTypeAddressDto} </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeAddressDto#setOId oId} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeAddressDto#setTeleTypeAddress
     *            teleTypeAddress} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeAddressDto#setTeleTypeProfileInfoOId
     *            teleTypeProfileInfoOId} - (M)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.TeleTypeProfileResponse
     *         TeleTypeProfileResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response Fields} </ul>
     *         </code>
     *         <p>
     * @throws LMSException If the update operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code,human readable message and message type.
     */
    TeleTypeProfileResponse
                updateTeleTypeProfile(TeleTypeProfilePersistRequest pTeleTypeProfilePersistRequest)
                            throws LMSException;
}
