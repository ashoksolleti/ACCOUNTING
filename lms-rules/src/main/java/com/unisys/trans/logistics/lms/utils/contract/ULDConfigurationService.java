/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationResponse;

/**
 * <code>ULDConfigurationService</code> interface exposes the APIs which identifies various processing flows
 * involved in maintaining the ULD configuration.
 * <p>
 * The usage of ULD configuration includes:
 * <ul>
 * <li>Validations for ULD category compatibilities for an aircraft.
 * <li>Space availability.
 * <li>Computation of booking remaining space for legs and segments.
 * <li>Change container information.
 * <li>Change of goods location.
 * <li>Validation of ULD associated with an air waybill.
 * </ul>
 * The ULD configuration for an ULD prefix lists all the allowed aircraft type for the specified ULD prefix.
 * When an ULD is assigned to the flight, the system checks the configuration for the ULD to make sure that
 * the aircraft is allowed to carry the ULD. This includes the following operations: <code>
 * <ul>
 * <li>Creates the ULD configuration
 * <li>Updates the ULD configuration
 * <li>Deletes the ULD configuration
 * <li>Finds the ULD configuration
 * </ul>
 * </code>
 * <p>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationResponse
 */
public interface ULDConfigurationService {

    /**
     * Creates an ULD configuration for an ULD prefix, carrier code and aircraft type combination after
     * validating all the input data.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ULDConfigurationService#updateUldConfiguration
     * updateUldConfiguration }
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
     *        <tr>
     *        <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ULDCONFIGURATION_INVALID_CARRIERCODE_INSTANCE}</td>
     *        <td>Carrier Code does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ULDCONFIGURATION_INVALID_ULDPREFIX_INSTANCE}</td>
     *        <td>ULD prefix does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ULDCONFIGURATION_INVALID_AIRCRAFTTYPE_INSTANCE}</td>
     *        <td>Aircraft type does not exist in the system.</td>
     *        </tr>
     *        </code>
     * </table>
     * <p>
     * 
     * @param pULDConfigurationPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationPersistRequest
     *            ULDConfigurationPersistRequest}</code><br>
     *            holds the information required for creating an ULD configuration.
     *            <p>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto
     *            uldConfiguration} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setAircraftType
     *            aircraftType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setMaxVolumeFloor
     *            maxVolumeFloor} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setMaxVolumeLowerDeck
     *            maxVolumeLowerDeck} - (C)</code><br>
     *            Mandatory if the ULD category is Both upper and lower deck position. Otherwise, prohibited.
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setPosition
     *            position} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setUldCategory
     *            uldCategory} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setUldPrefix uldPrefix}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setOId oId} - (C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationResponse
     *         ULDConfigurationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationResponse#getUldConfigurations()
     *         uldConfigurations} - (1:*) <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto ULDConfigurationDto} </ul>
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the creation of an ULDConfiguration fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    ULDConfigurationResponse createUldConfiguration(
                ULDConfigurationPersistRequest pULDConfigurationPersistRequest) throws LMSException;

    /**
     * Deletes the ULD configuration.
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
     * @param pULDConfigurationDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDeleteRequest
     *            ULDConfigurationDeleteRequest}</code><br>
     *            holds the information required for deleting an ULD configuration.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDeleteRequest#setUldPrefix uldPrefix} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDeleteRequest#setOId oId} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationResponse
     *         ULDConfigurationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationResponse#getUldConfigurations()
     *         uldConfigurations} - (1:*) <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto ULDConfigurationDto} </ul>
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the deletion of an ULDConfiguration fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    ULDConfigurationResponse deleteUldConfiguration(
                ULDConfigurationDeleteRequest pULDConfigurationDeleteRequest) throws LMSException;

    /**
     * Finds if the aircraft is compatible with the ULD.
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
     * @param pMultipleFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest MultipleFindRequest}
     *            </code><br>
     *            contains the list of search input values.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M) (1:*)</code><br>
     *            holds the list of <code>ULDAircraftCompatibilityDto</code>.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects()
     *         retrievedObjects} - (0:*) holds the <code>aircraft</code> as Key and
     *         <code>ULDAircraftCompatibilityDto</code> as Value. </ul> </code>
     */
    MultipleFindResponse findULDAircraftCompatibility(final MultipleFindRequest pMultipleFindRequest);

    /**
     * Retrieves the ULD configuration for the given uldPrefix.
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
     *        <tr>
     *        <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ULDCONFIGURATION_INVALID_ULDPREFIX_INSTANCE}</td>
     *        <td>ULD prefix does not exist in the system.</td>
     *        </tr>
     *        </code>
     * </table>
     * <p>
     * 
     * @param pULDConfigurationFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationFindRequest
     *            ULDConfigurationFindRequest}</code><br>
     *            holds the attributes to find the ULD configuration.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationFindRequest#setUldPrefix uldPrefix} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationResponse
     *         ULDConfigurationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationResponse#getUldConfigurations()
     *         uldConfigurations} - (1:*) <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto ULDConfigurationDto} </ul>
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the ULDConfiguration find operation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    ULDConfigurationResponse findUldConfiguration(ULDConfigurationFindRequest pULDConfigurationFindRequest)
                throws LMSException;

    /**
     * Updates the ULD configuration and returns the updated information.
     * <p>
     * All the values except ULD prefix can be updated.
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
     *        <tr>
     *        <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ULDCONFIGURATION_INVALID_AIRCRAFTTYPE_INSTANCE}</td>
     *        <td>Aircraft type does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ULDCONFIGURATION_INVALID_CARRIERCODE_INSTANCE}</td>
     *        <td>Carrier Code does not exist in the system.</td>
     *        </tr>
     *        </code>
     * </table>
     * <p>
     * 
     * @param pULDConfigurationPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationPersistRequest
     *            ULDConfigurationPersistRequest}</code><br>
     *            holds the attributes to create ULD configuration.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto uldConfiguration} - (M)</code>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setAircraftType aircraftType} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setCarrierCode carrierCode} - (O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setMaxVolumeFloor maxVolumeFloor} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setMaxVolumeLowerDeck maxVolumeLowerDeck} - (C)</code>
     *            <br>
     *            Mandatory if the ULD category is Both upper and lower deck position. Otherwise, prohibited.
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setPosition position} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setUldCategory uldCategory} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setUldPrefix uldPrefix} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setOId oId} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationResponse
     *         ULDConfigurationResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationResponse#getUldConfigurations()
     *         uldConfigurations} - (1:*) <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto ULDConfigurationDto} </ul>
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the updation of ULDConfiguration fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */

    ULDConfigurationResponse updateUldConfiguration(
                ULDConfigurationPersistRequest pULDConfigurationPersistRequest) throws LMSException;

    /**
     * Creates an ULD configuration for an ULD prefix, carrier code and aircraft type combination after
     * validating all the input data.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ULDConfigurationService#updateUldConfiguration
     * updateUldConfiguration }
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
     *        <tr>
     *        <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ULDCONFIGURATION_INVALID_ULDPREFIX_INSTANCE}</td>
     *        <td>ULD prefix does not exist in the system.</td>
     *        </tr>
     *        </code>
     * </table>
     * <p>
     * 
     * @param pULDConfigurationPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationPersistRequest
     *            ULDConfigurationPersistRequest}</code><br>
     *            holds the information required for creating an ULD configuration.
     *            <p>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto
     *            uldConfiguration} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setAircraftType
     *            aircraftType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setMaxVolumeFloor
     *            maxVolumeFloor} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setMaxVolumeLowerDeck
     *            maxVolumeLowerDeck} - (C)</code><br>
     *            Mandatory if the ULD category is Both upper and lower deck position. Otherwise, prohibited.
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setPosition
     *            position} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setUldCategory
     *            uldCategory} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setUldPrefix uldPrefix}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto#setOId oId} - (C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @throws LMSException If the validation of an ULDConfigurationDetail fails, the above mentioned error
     *             codes are returned. Each CodeMessage contains the status code, human readable message and
     *             message type.
     */
    void validateUldConfigurationDetails(ULDConfigurationPersistRequest pULDConfigurationPersistRequest)
                throws LMSException;
}
