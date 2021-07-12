/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.contract;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.ULDTypeDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.ULDTypeFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.ULDTypePersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse;
import com.unisys.trans.logistics.lms.rating.dto.ULDTypeRestoreRequest;

/**
 * <code>ULDTypeService</code> interface exposes the APIs which identifies various processing flows involved
 * in maintaining uld types.
 * <p>
 * This includes the following operations:
 * <ul>
 * <li>Creates ULD type.
 * <li>Deletes ULD type.
 * <li>Finds ULD type.
 * <li>Finds all the ULD types.
 * <li>Updates ULD type.
 * <li>Restores ULD type.
 * </ul>
 * <p>
 * For ULD (Unit Load Device) shipments, pricing is done based on IATA (International Air Transport
 * Association) and ATPCO (Airline Tariff Publishing Company) rules. For implementing the IATA and ATPCO
 * rules, ULD types are maintained. There are two types of ULDs: aircraft and non-aircraft. A ULD type can
 * contain information, which is used in some cases during air waybill rating, like minimum chargeable weight
 * and ULD discount information.
 * <p>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse
 * @see com.unisys.trans.logistics.lms.rating.dto.ULDTypePersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ULDTypeDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ULDTypeFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ULDTypeRestoreRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto
 * @see com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto
 */
@Path("/uldTypeService")
public interface ULDTypeService {

    /**
     * Creates an <code>ULDType</code> after validating all the input data.
     * <p>
     * <b>Related methods include:</b>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.ULDTypeService#updateULDType updateULDType }
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.ULDTypeService#deleteULDType deleteULDType }
     * <p>
     * The new uldtype can be created only when the <code>uldtype</code> is unique. If this is unique the
     * uldtype gets created in the system. If the uld type rate is given then the system validates the
     * following details when provided:
     * <li>origin
     * <li>destination
     * <li>carrierCode
     * <li>effectiveDate
     * <li>discountCurrencyCode <br>
     * If all the details are appropriate,the uld type gets created in the system.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
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
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULD_TYPE_ALREADY_EXIST}</td>
     *            <td>The uld type already exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_EFFECTIVEDATE_SHOULD_BE_TOMORROW_OR_LATER}</td>
     *            <td>Effective date should be today or later.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_EFFECTIVEDATE_SHOULD_BE_TODAY_OR_LATER}</td>
     *            <td>End date should be tomorrow or later.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_EXPIRATIONDATE_SHOULD_BE_TOMORROW_OR_LATER}</td>
     *            <td>End date should be today or later.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_EXPIRATIONDATE_SHOULD_BE_TODAY_OR_LATER}</td>
     *            <td>Effective date should be tomorrow or later.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ORIGIN_DOES_NOT_EXIST}</td>
     *            <td>Origin does not exist.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#DESTINATION_DOES_NOT_EXIST}</td>
     *            <td>Destination does not exist.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pULDTypePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypePersistRequest
     *            ULDTypePersistRequest}</code><br>
     *            holds all the information required for creating an uldtype.
     *            <p>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto ULDTypeDto} - (M)
     *            </code><br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setAircraftIndicator
     *            aircraftIndicator} - (M)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setDefaultMinChargeableWt
     *            defaultMinChargeableWt} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setDescription
     *            description} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setDimension
     *            dimension} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setGroupCode
     *            groupCode} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setMaximumGrossWeight
     *            maximumGrossWeight} - (C)</code><br>
     *            Mandatory for non aircraft ULDs.Prohibited for aircraft ULDs. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setMaximumTareWeightAllowed
     *            maximumGrossWeight} - (C)</code><br>
     *            Mandatory for non aircraft ULDs.Prohibited for aircraft ULDs. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setOId oId} - (C)</code> <br>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setUldType uldType} - (M)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setWeightUOM
     *            weightUOM} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setUldTypeRates ULDTypeRateDto}
     *            - (O) - (0:*)</code><br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto ULDTypeRateDto} -
     *            (O)</code><br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setCarrierCode
     *            carrierCode} - (C)</code><br>
     *            This field is enabled only when a new rating information line is added or for rating
     *            information not yet in effect. Either carrier code, origin or destination should occur. <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setOrigin origin} -
     *            (C)</code><br>
     *            This field is enabled only when a new rating information line is added or for rating
     *            information not yet in effect. Either carrier code, origin or destination should occur. <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setDestination
     *            destination} - (C)</code><br>
     *            This field is enabled only when a new rating information line is added or for rating
     *            information not yet in effect. Either carrier code, origin or destination should occur. <li>
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setMinimumChargeableWeight
     *            minimumChargeableWeight} - (C)</code><br>
     *            Mandatory if ULD discount rate is not present, otherwise optional. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setDestinationType
     *            destinationType} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setDiscountCurrencyCode
     *            discountCurrencyCode}-(M)</code><br>
     *            Mandatory if ULD discount rate is entered, otherwise optional. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setDiscountRate
     *            discountRate} - (M)</code><br>
     *            Mandatory if minimum chargeable weight is not present. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setDiscountRateCode
     *            discountRateCode} - (M)</code><br>
     *            Mandatory if ULD discount rate is specified, otherwise prohibited. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setOriginType originType} -
     *            (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setOId oId} - (C)
     *            </code><br>
     *            Prohibited for create operation.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setUldTypeOId
     *            uldTypeOId} - (C)</code><br>
     *            Prohibited for create operation.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setEffectiveDate
     *            effectiveDate} - (C)</code> <br>
     *            Default is tomorrow’s date. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setExpirationDate
     *            expirationDate} - (C)</code> <br>
     *            INDEF or blank indicates no end date. The default is INDEF.
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse ULDTypeResponse} <ul>
     *         <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse#getUldTypes() uldTypes} -
     *         (1:1) <ul> <li>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto ULDTypeDto} </ul>
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the uld type create operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.
     */
    ULDTypeResponse createULDType(ULDTypePersistRequest pULDTypePersistRequest) throws LMSException;

    /**
     * Marks the <code>ULDtype</code> as ‘Deleted’ by updating the uldtype with an end date value.
     * <p>
     * The uldtype is marked for deletion when the <code>endDate</code> is given for it. The system validates
     * the <code>endDate</code> and marks the uldtype for deletion. <br>
     * The uldtype marked for deletion can be retrieved but cannot be updated when an end date exists.<br>
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
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
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_IS_ALREADY_MARKED_FOR_DELETION}</td>
     *            <td>The uld type already marked for deletion.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULD_TYPE_END_DATE}</td>
     *            <td>The end date is required.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_IS_MARKED_FOR_DELETION}</td>
     *            <td>The uld type marked for deletion.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_EFFECTIVEDATE_SHOULD_BE_TOMORROW_OR_LATER}</td>
     *            <td>Effective date should be today or later.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_EFFECTIVEDATE_SHOULD_BE_TODAY_OR_LATER}</td>
     *            <td>End date should be tomorrow or later.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_EXPIRATIONDATE_SHOULD_BE_TOMORROW_OR_LATER}</td>
     *            <td>End date should be today or later.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_EXPIRATIONDATE_SHOULD_BE_TODAY_OR_LATER}</td>
     *            <td>Effective date should be tomorrow or later.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pULDTypeDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypePersistRequest
     *            ULDTypePersistRequest}</code><br>
     *            holds all the information required for deleting an uldtype.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDeleteRequest ULDTypeDeleteRequest} - (M)</code>
     *            <br>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDeleteRequest#setDeleteDate deleteDate} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDeleteRequest#setOId oId} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDeleteRequest#setUldType ULDType} - (M)</code>
     *            <br>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse ULDTypeResponse} <ul>
     *         <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse#getUldTypes() uldTypes} -
     *         (1:1) <ul> <li>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto ULDTypeDto} </ul>
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the uld type delete operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.
     */
    ULDTypeResponse deleteULDType(ULDTypeDeleteRequest pULDTypeDeleteRequest) throws LMSException;

    /**
     * Finds all the <code>ULDType</code>.
     * <p>
     * The system finds all the uldtype when no uldtype is provided as input.<br>
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
     * @param pULDTypeFindRequest <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeFindRequest
     *            ULDTypeFindRequest}</code><br>
     *            which includes the attributes to find the uldtype information.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeFindRequest ULDTypeFindRequest} - (M)</code>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeFindRequest#setUldType name} - (M)</code>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeFindRequest#setExactMatchRequiredIndicator ExactMatchRequiredIndicator} - (M)</code>
     *            <br>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse ULDTypeResponse} <ul>
     *         <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse#getUldTypes() uldTypes} -
     *         (0:*) <ul> <li>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto ULDTypeDto} </ul>
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the uld type find operation fails the above mentioned error codes are returned.
     *             Each CodeMessage contains the status code,human readable message and message type.
     */
    @POST
    @Path("/uldtypes")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    ULDTypeResponse findAllULDType(ULDTypeFindRequest pULDTypeFindRequest) throws LMSException;

    /**
     * Finds the <code>ULDType</code> information.
     * <p>
     * The system finds the uldtype information based on the input uldtype:<br>
     * <ul>
     * <li>If the uldtype is provided in the input, the system find the uldtype information and all its
     * associated uldtype rate details.
     * <li>If the uldtype is not provided in the input, the system retrieves all uldtypes.
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
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_IS_MARKED_FOR_DELETION}</td>
     *            <td>The uld type is marked for deletion.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pULDTypeFindRequest <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeFindRequest
     *            ULDTypeFindRequest}</code><br>
     *            which includes the attributes to find the uldtype information.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeFindRequest ULDTypeFindRequest} - (M)</code>
     *            <br>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeFindRequest#setUldType name} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeFindRequest#setExactMatchRequiredIndicator ExactMatchRequiredIndicator} - (M)</code>
     *            <br>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse ULDTypeResponse} <ul>
     *         <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse#getUldTypes() uldTypes} -
     *         (0:1) <ul> <li>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto ULDTypeDto} </ul>
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the uld type find operation fails the above mentioned error codes are returned.
     *             Each CodeMessage contains the status code,human readable message and message type.
     */
    ULDTypeResponse findULDType(ULDTypeFindRequest pULDTypeFindRequest) throws LMSException;

    /**
     * Restores the <code>ULDType</code> which has been marked for deletion.
     * <p>
     * The precondition is the uldtype information should have been retrieved and marked for deletion.<br>
     * The system validates the uldtype information to check whether the uldtype is not marked for deletion.
     * <ul>
     * <li>If the uldtype is not marked for deletion, the error message is thrown.
     * <li>If the uldtype is marked for deletion, it is restored by setting the <code>endDate</code> of the
     * uldtype as null.
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
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULD_TYPE_NOT_MARKED_FOR_DELETION}</td>
     *            <td>ULDType is not marked for deletion.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pULDTypeRestoreRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRestoreRequest
     *            ULDTypeRestoreRequest}</code><br>
     *            which includes the attributes to restore currency information.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRestoreRequest ULDTypeRestoreRequest} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRestoreRequest#setUldType uldType} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRestoreRequest#setOId oId} - (M)</code>
     *            <br>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRestoreRequest#setVersion version} - (M)</code>
     *            <br>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse ULDTypeResponse} <ul>
     *         <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse#getUldTypes() uldTypes} -
     *         (1:1) <ul> <li>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto ULDTypeDto} </ul>
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the uld type restore operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.
     */
    ULDTypeResponse restoreULDType(ULDTypeRestoreRequest pULDTypeRestoreRequest) throws LMSException;

    /**
     * Updates an <code>ULDType</code> after validating all the input data.
     * <p>
     * <b>Related methods include:</b>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.ULDTypeService#deleteULDType deleteULDType }
     * <p>
     * The system checks whether the uld type information to updated is not marked for deletion.<br>
     * If it is not marked for deletion, the system validates the uldtype details information.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
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
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULD_TYPE_CANNOT_BE_UPDATED}</td>
     *            <td>The ULDType cannot be updated.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULD_TYPE_MARKED_FOR_DELETION}</td>
     *            <td>ULD Type marked for deletion must not be updated.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_EFFECTIVEDATE_SHOULD_BE_TOMORROW_OR_LATER}</td>
     *            <td>Effective date should be today or later.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_EFFECTIVEDATE_SHOULD_BE_TODAY_OR_LATER}</td>
     *            <td>End date should be tomorrow or later.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_EXPIRATIONDATE_SHOULD_BE_TOMORROW_OR_LATER}</td>
     *            <td>End date should be today or later.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#ULDTYPE_EXPIRATIONDATE_SHOULD_BE_TODAY_OR_LATER}</td>
     *            <td>Effective date should be tomorrow or later.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pULDTypePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypePersistRequest
     *            ULDTypePersistRequest}</code><br>
     *            holds all the information required for creating an uldtype.
     *            <p>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto ULDTypeDto} - (M)
     *            </code><br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setAircraftIndicator
     *            aircraftIndicator} - (M)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setDefaultMinChargeableWt
     *            defaultMinChargeableWt} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setDescription
     *            description} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setDimension
     *            dimension} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setGroupCode
     *            groupCode} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setMaximumGrossWeight
     *            maximumGrossWeight} - (C)</code><br>
     *            Mandatory for non aircraft ULDs.Prohibited for aircraft ULDs. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setMaximumTareWeightAllowed
     *            maximumGrossWeight} - (C)</code><br>
     *            Mandatory for non aircraft ULDs.Prohibited for aircraft ULDs. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setOId oId} - (C)</code><br>
     * <br>
     *            Mandatory for update operation, otherwise optional.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Mandatory for update operation, otherwise optional.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setUldType uldType} -
     *            (M)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setWeightUOM
     *            weightUOM} - (M)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto#setUldTypeRates
     *            ULDTypeRateDto} - (O) - (0:*)</code><br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto ULDTypeRateDto} -
     *            (O)</code><br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setCarrierCode
     *            carrierCode} - (C)</code><br>
     *            This field is enabled only when a new rating information line is added or for rating
     *            information not yet in effect. Either carrier code, origin or destination should occur. <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setOrigin origin} -
     *            (C)</code><br>
     *            This field is enabled only when a new rating information line is added or for rating
     *            information not yet in effect. Either carrier code, origin or destination should occur. <li>
     *            <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setDestination
     *            destination} - (C)</code><br>
     *            This field is enabled only when a new rating information line is added or for rating
     *            information not yet in effect. Either carrier code, origin or destination should occur. <li>
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setMinimumChargeableWeight
     *            minimumChargeableWeight} - (C)</code><br>
     *            Mandatory if ULD discount rate is not present, otherwise optional. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setDestinationType
     *            destinationType} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setDiscountCurrencyCode
     *            discountCurrencyCode} - (M)</code><br>
     *            Mandatory if ULD discount rate is entered, otherwise optional. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setDiscountRate
     *            discountRate} - (M)</code><br>
     *            Mandatory if minimum chargeable weight is not present. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setDiscountRateCode
     *            discountRateCode} - (M)</code><br>
     *            Mandatory if ULD discount rate is specified, otherwise prohibited. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setOriginType originType} -
     *            (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setOId oId} - (C)
     *            </code><br>
     *            Mandatory for update operation, otherwise optional.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setUldTypeOId
     *            uldTypeOId} - (C)</code><br>
     *            Mandatory for update operation, otherwise optional.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setEffectiveDate
     *            effectiveDate} - (C)</code><br>
     *            Default is tomorrow’s date. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeRateDto#setExpirationDate
     *            expirationDate} - (C)</code><br>
     *            INDEF or blank indicates no end date. The default is INDEF.
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse ULDTypeResponse} <ul>
     *         <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <<li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeResponse#getUldTypes() uldTypes} -
     *         (1:1) <ul> <li>{@link com.unisys.trans.logistics.lms.rating.dto.ULDTypeDto ULDTypeDto} </ul>
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the uld type update operation fails the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code,human readable message and message
     *             type.
     */
    ULDTypeResponse updateULDType(ULDTypePersistRequest pULDTypePersistRequest) throws LMSException;
    
    MultipleFindResponse findUldTypeDetails(MultipleFindRequest pMultipleFindRequest)  throws LMSException;

}
