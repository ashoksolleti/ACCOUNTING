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
import com.unisys.trans.logistics.lms.utils.dto.PostalCodeDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.PostalCodeFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.PostalCodePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.PostalCodeResponse;

/**
 * <code>PostalCodeService</code> interface exposes the APIs which identifies various processing flows
 * involved in maintaining a Postal code.
 * <p>
 * This includes the following operations: <code>
 * <ul>
 * <li>createPostalCode
 * <li>deletePostalCode
 * <li>findPostalCode
 * <li>updatePostalCode
 * </ul>
 * </code> This functionality maintains zone, driving mileage, and pickup/delivery time information for each
 * station within a given Postal code.
 * <p>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.PostalCodePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.PostalCodeDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.PostalCodeFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.PostalCodeResponse
 * @see com.unisys.trans.logistics.lms.framework.dto ValidationRequest
 * @see com.unisys.trans.logistics.lms.framework.dto ValidationResponse
 */
public interface PostalCodeService {

    /**
     * Creates a postal code for the given input and returns the postal code with its details.
     * <p>
     * <b>Related method include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.PostalCodeService#updatePostalCode
     * updatePostalCode }
     * <p>
     * The system creates a postal code with its details after validating the inputs. <br>
     * If all details are appropriate, then the Postal code is created with the postal code details such as:
     * <li>Station
     * <li>Country
     * <li>Zone
     * <li>Driving Mileage
     * <li>Pickup Time
     * <li>Delivery Time
     * <li>Normal Operator Account Number
     * <li>Express Operator Account Number
     * <li>TimeDefinite Day Offset
     * <li>Standard Day Offset
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
     * <b>The following Error Codes are returned:</b>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_DUPLICATE_CODE}</td>
     *            <td>Duplicate Postal code information.</td>
     *            </tr>
     *            <tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_STATION_DOES_NOT_EXIST}</td>
     *            <td>Station not present.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_COUNTRY_DOES_NOT_EXIST}</td>
     *            <td>Country Code not present.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_STATION_DOES_NOT_BELONG_TO_THE_COUNTRY}</td>
     *            <td> The station doesn't belong to the country code.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_STATION_MUST_BE_AIRPORT}</td>
     *            <td>Station must be an airport.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pPostalCodePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodePersistRequest
     *            PostalCodePersistRequest}</code><br>
     *            holds the information required for creating a postal code.
     *            <p>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDto#setPostalCode
     *            postalCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDto#setOId OId} - (C)</code><br>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDto#setPostalCodeDetails
     *            postalCodeDetails} - (M) (1:1)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setCountryCode county -
     *            (M)}</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setDeliveryTime
     *            deliveryTime - (M) }</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setDrivingDistance
     *            drivingDistance - (M)}</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setExpressOperatorAccountNumber
     *            expressOperatorAccountNumber - (O)}</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setNormalOperatorAccountNumber
     *            normalOperatorAccountNumber - (O)}</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setOId oId - (C)}</code>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setPickupTime pickUpTime
     *            - (M)}</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setStandardDayOffset
     *            standardDayOffset - (O)}</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setStationCode
     *            stationCode - (M)}</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setTimeDefiniteDayOffset
     *            timeDayOffset - (O)}</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setZone zone - (M) }
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setPostalCodeOId
     *            postalCodeOId - (C) }</code> Prohibited for create operation.<br>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeResponse PostalCodeResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeResponse#getPostalCode()
     *         postalCode} <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDto
     *         PostalCodeDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the Postal code create operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    PostalCodeResponse createPostalCode(PostalCodePersistRequest pPostalCodePersistRequest)
                throws LMSException;

    /**
     * Deletes the postal code detail of the given <code>PostalCode</code>.
     * <p>
     * The system deletes <code>PostalCodeDetail</code> of the given <code>PostalCode</code> using the
     * <code>PostalCode</code> and <code>Station</code> combination.
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
     * <b>The following Error Codes are returned:</b></br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td><code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_CODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td>Postal code not present.</td> </tr>
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_STATION_DOES_NOT_EXIST}</code>
     * </td>
     * <td>Station not present.</td>
     * </tr>
     * </code>
     * </table>
     * <p>
     * 
     * @param pPostalCodeDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDeleteRequest
     *            PostalCodeDeleteRequest}</code><br>
     *            holds the information required for deleting the PostalCodedetail.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDto#setPostalCode postalCode} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setStationCode stationCode - (M)}</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDto#setOId oId - (M)}</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDeleteRequest#setVersion version - (M)}</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeResponse PostalCodeResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeResponse#getPostalCode()
     *         postalCode} <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDto
     *         PostalCodeDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the Postal code delete operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    PostalCodeResponse deletePostalCode(PostalCodeDeleteRequest pPostalCodeDeleteRequest) throws LMSException;

    /**
     * Finds the <code>PostalCode</code> information based on <code>PostalCode</code> and <code>Station</code>
     * combination.
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
     *            holds the list of search input values.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M) (1:*)</code><br>
     *            holds the set of <code>PostalCodeDto</code>.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse} </code>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*) </code><br>
     *         holds the <code>postalCode</code> as Key and <code>postalCodeDto </code> as Value.
     *         </ul>
     *         <p>
     */
    MultipleFindResponse findByPostalCodeAndStation(MultipleFindRequest pMultipleFindRequest);

    /**
     * Retrieves the Postal code and its details.
     * <p>
     * Finds the Postal code detail for the Postal code after validating the given inputs.
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
     * <b>The following Error Codes are returned:</b></br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_CODE_DOES_NOT_EXIST}</code>
     * </td>
     * <td>Postal code not present.</td>
     * </tr>
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_STATION_DOES_NOT_EXIST}</code>
     * </td>
     * <td>Station not present.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pPostalCodeFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeFindRequest PostalCodeFindRequest}
     *            </code><br>
     *            holds the information required for retrieving the postalCode.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeFindRequest#setPostalCode postalCode} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeResponse PostalCodeResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeResponse#getPostalCode()
     *         postalCode} <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDto
     *         PostalCodeDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the Postal code find operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    PostalCodeResponse findPostalCode(PostalCodeFindRequest pPostalCodeFindRequest) throws LMSException;

    /**
     * Updates the Postal code detail and returns the updated information.
     * <p>
     * Modifies the <code>PostalCodeDetail</code> information for the given <code>PostalCode</code> after
     * validating the input details.
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
     * <b>The following Error Codes are returned:</b>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_CODE_DOES_NOT_EXIST}</td>
     *            <td>Postal code not present.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODEDETAIL_NOT_SELECTED_BY_THE_USER}</td>
     *            <td>The station is not selected by the user.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_DUPLICATE_STATION}</td>
     *            <td>Duplicate Station entry.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_STATION_DOES_NOT_EXIST}</td>
     *            <td>Station not present.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_COUNTRY_DOES_NOT_EXIST}</td>
     *            <td>Country Code not present.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_STATION_DOES_NOT_BELONG_TO_THE_COUNTRY}</td>
     *            <td> The station doesn't belong to the country code.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#POSTALCODE_STATION_MUST_BE_AIRPORT}</td>
     *            <td>Station must be an airport.</td>
     *            </tr>
     *        </code>
     * </table>
     * <p>
     * 
     * @param pPostalCodePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodePersistRequest
     *            PostalCodePersistRequest}</code><br>
     *            holds the information required for updating the Postal code detail.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDto#setPostalCode postalCode} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDto#setOId OId} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDto#setPostalCodeDetails postalCodeDetails} - (M) (1:1)</code>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setCountryCode county - (M)}</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setDeliveryTime deliveryTime - (M) }</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setDrivingDistance drivingDistance - (M)}</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setExpressOperatorAccountNumber expressOperatorAccountNumber - (O)}</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setNormalOperatorAccountNumber normalOperatorAccountNumber - (O)}</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setOId oId - (M)}</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setPickupTime pickUpTime - (M)}</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setStandardDayOffset standardDayOffset - (O)}</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setStationCode stationCode - (M)}</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setTimeDefiniteDayOffset timeDayOffset - (O)}</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setZone zone - (M) }</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDetailDto#setPostalCodeOId postalCodeOId - (M) }</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeResponse PostalCodeResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeResponse#getPostalCode()
     *         postalCode} <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.PostalCodeDto
     *         PostalCodeDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the Postal code update operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    PostalCodeResponse updatePostalCode(PostalCodePersistRequest pPostalCodePersistRequest)
                throws LMSException;

    /**
     * Validates the <code>PostalCode</code> based on whether the postal code exists or not.
     * <p>
     * Retrieves and validates the postal code that exactly matches the input postal code.
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
     *            holds the list of search input values.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (O)</code>
     *            </ul>
     *            <p>
     * @return <code>
     *           <li> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs
     *         validInputs}-(1:*) <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs
     *         searchInputs} -(1:*) </ul> </code>
     */
    ValidationResponse validatePostalCode(ValidationRequest pValidationRequest);
}
