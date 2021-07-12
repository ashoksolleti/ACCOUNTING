/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.OfficeDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.OfficeFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.OfficePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.OfficeQueueResponse;
import com.unisys.trans.logistics.lms.utils.dto.OfficeResponse;

/**
 * <code>OfficeService</code> interface exposes the following APIs to function and maintain office
 * information:
 * <ul>
 * <li>Create office - Persists the office information.<br>
 * <li>Update office - Updates the office information which includes Activate and In-activate options as well.
 * <br>
 * <li>Find office - Retrieves the office information based on the office identifier.<br>
 * <li>Find office By station code - Retrieves all the offices for a particular station.<br>
 * <li>Delete office - Deletes the office which has been marked for deletion. <br>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.OfficeDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.OfficeFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.OfficePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.OfficeResponse
 * @see com.unisys.trans.logistics.lms.framework.dto.AbstractRequest
 */
public interface OfficeService {

    /**
     * Activate an <code>Office</code> after validating all the input data based on the business rules.
     * <p>
     * In order to update an office, the office information must already exist in the system.
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
     * @param pOfficePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficePersistRequest OfficePersistRequest}
     *            </code><br>
     *            holds the request object containing all the required information for activating an office.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto office } - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setAlternateOffice
     *            alternateOffice} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setOfficeDesignator
     *            officeDesignator} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setOfficeIdentifier
     *            officeIdentifier} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setOfficeType officeType} -(M)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setStationCode
     *            stationCode} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto address} -(M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setAddress
     *            address} - (O)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCountry
     *            country} - (M)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCity city} -
     *            (M)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setEmail email} -
     *            (O)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setFax fax} - (O)
     *            </code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPhone phone} -
     *            (O)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPostalCode
     *            postalcode} - (O)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setState state} -
     *            (O)</code><br>
     *            </ul>
     *            </ul>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeResponse OfficeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto office} - (M) (1:*) </ul> </code>
     *         <p>
     * @throws LMSException If the office cannot be activated.
     */
    OfficeResponse activateOffice(OfficePersistRequest pOfficePersistRequest) throws LMSException;

    /**
     * Creates an <code>Office</code> after validating all the input data based on the business rules.
     * <p>
     * In order to create an office, the office information must not already exist in the system.
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
     * @param pOfficePersistRequest
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficePersistRequest OfficePersistRequest}</code>
     * <br>
     *            holds the request object containing all the required information for updating an office.
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto office } - (M)</code>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setAlternateOffice alternateOffice} -(O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setOfficeDesignator officeDesignator} -(O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setOfficeIdentifier officeIdentifier} -(M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setOfficeType officeType} -(M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setStationCode stationCode} -(M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto address} -(M)</code>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setAddress address} - (O)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCountry country} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCity city} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setEmail email} - (O)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setFax fax} - (O)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPhone phone} - (O)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPostalCode postalcode} - (O)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setState state} - (O)</code>
     *            <br>
     *            </ul>
     *            </ul>
     *            </ul>
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeResponse OfficeResponse}
     *           <ul>
     *           <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *           <li>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto office} - (M) (1:*)
     *           </ul>
     *         </code>
     *         <p>
     * @throws LMSException If the office cannot be created.
     */
    OfficeResponse createOffice(OfficePersistRequest pOfficePersistRequest) throws LMSException;

    /**
     * Deletes an <code>Office</code> after validating all the input data based on the business rules.
     * <p>
     * In order to delete an office, the office information must already exist in the system.Active offices
     * cannot be deleted.
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
     * @param pOfficeDeleteRequest
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDeleteRequest OfficeDeleteRequest}</code>
     * <br>
     *            holds the request object contains all the required information for deleting an office.
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDeleteRequest#setOfficeIdentifier} - (M)</code>
     *            <br>
     *            </ul>
     *            <p>
     * @return the <code>OfficeResponse</code> object assembled after deleting an office.<br>
     *         <p>
     * @throws LMSException If the office cannot be deleted.
     */
    OfficeResponse deleteOffice(OfficeDeleteRequest pOfficeDeleteRequest) throws LMSException;

    /**
     * Retrieves the <code>Office</code> for the specified office identifier.
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
     * 
     * @param pOfficeFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeFindRequest
     *            OfficeFindRequest} </code><br>
     *            holds the request object contains all the required information for retrieving an office.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeFindRequest#setOfficeIdentifier} - (M)
     *            </code><br>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeResponse OfficeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto office} - (O) (0:*) </ul> </code>
     *         <p>
     * @throws LMSException If the office does not exist.
     */
    OfficeResponse findOffice(OfficeFindRequest pOfficeFindRequest) throws LMSException;

    /**
     * Retrieves the <code>Offices</code> for the specified Station code.
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
     * 
     * @param pOfficeFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeFindRequest
     *            OfficeFindRequest} </code><br>
     *            holds the request object contains all the required information for retrieving an office.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeFindRequest#setStationCode}
     *            - (M)</code><br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeResponse OfficeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto office} - (O) (0:*) </ul> </code>
     *         <p>
     * @throws LMSException If the office for the station code entered does not exist in the system
     */
    OfficeResponse findOfficeByStationCode(OfficeFindRequest pOfficeFindRequest) throws LMSException;

    /**
     * In-activate an <code>Office</code> after validating all the input data based on the business rules.
     * <p>
     * In order to update an office, the office information must already exist in the system.
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
     * @param pOfficePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficePersistRequest OfficePersistRequest}
     *            </code><br>
     *            holds the request object containing all the required information for in-activating an
     *            office.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto office } - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setAlternateOffice
     *            alternateOffice} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setOfficeDesignator
     *            officeDesignator} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setOfficeIdentifier
     *            officeIdentifier} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setOfficeType officeType} -(M)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setStationCode
     *            stationCode} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto address} -(M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setAddress
     *            address} - (O)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCountry
     *            country} - (M)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCity city} -
     *            (M)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setEmail email} -
     *            (O)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setFax fax} - (O)
     *            </code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPhone phone} -
     *            (O)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPostalCode
     *            postalcode} - (O)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setState state} -
     *            (O)</code><br>
     *            </ul>
     *            </ul>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeResponse OfficeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto office} - (M) (1:*) </ul> </code>
     *         <p>
     * @throws LMSException If the office cannot be inactivated.
     */
    OfficeResponse inactivateOffice(OfficePersistRequest pOfficePersistRequest) throws LMSException;

    /**
     * Updates an <code>Office</code> after validating all the input data based on the business rules.
     * <p>
     * In order to update an office, the office information must already exist in the system.
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
     * @param pOfficePersistRequest
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficePersistRequest OfficePersistRequest}</code>
     * <br>
     *            holds the request object containing all the required information for updating an office.
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto office } - (M)</code>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setAlternateOffice alternateOffice} -(O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setOfficeDesignator officeDesignator} -(O)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setOfficeIdentifier officeIdentifier} -(M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setOfficeType officeType} -(M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto#setStationCode stationCode} -(M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto address} -(M)</code>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setAddress address} - (O)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCountry country} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCity city} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setEmail email} - (O)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setFax fax} - (O)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPhone phone} - (O)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPostalCode postalcode} - (O)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setState state} - (O)</code>
     *            <br>
     *            </ul>
     *            </ul>
     *            </ul>
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeResponse OfficeResponse}
     *           <ul>
     *           <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *           <li>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeDto office} - (M) (1:*)
     *           </ul>
     *           </code>
     *         <p>
     * @throws LMSException If the office cannot be updated.
     */
    OfficeResponse updateOffice(OfficePersistRequest pOfficePersistRequest) throws LMSException;

    /**
     * Validates the existence of office code.
     * <p>
     * If the office exist in the system, it sets the office information, else it sets the appropriate error
     * code in the ValidationResponse object.
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
     * @param pValidationRequest <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
     *            ValidationRequest}</code><br>
     *            the request object which contains the list of search input values.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M)(1:*)</code><br>
     *            holds the list of <code>OfficeIdentifier</code>.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs
     *         validInputs} - (1:*)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs
     *         searchInputs} - (1:*)</code>
     *         </ul>
     *         <p>
     * @throws LMSException If the office cannot be validated.
     */
    ValidationResponse validateOffice(final ValidationRequest pValidationRequest) throws LMSException;

     OfficeQueueResponse findBillingQueue()throws LMSException;

}
