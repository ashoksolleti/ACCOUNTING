/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto;
import com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeResponse;
import com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto;

import java.util.List;

/**
 * <code>ULDPrefixSerialRangeService</code> provides services for maintaining ULD prefix serial range
 * information.
 * <p>
 * Every ULD prefix has a set of ULD serial ranges within which the ULD identifiers are created. These serial
 * ranges can be specified for a particular carrier in which case the ULD serial ranges may differ from
 * carrier to carrier. The legitimate values of the ULD identifiers will be in these ranges.
 * <p>
 * This performs the following functions:
 * <ul>
 * <li>Creates the ULD prefix serial range.
 * <li>Deletes the ULD prefix serial range.
 * <li>Finds the ULD prefix serial range.
 * <li>Inserts the ULD prefix serial range.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeResponse
 */
public interface ULDPrefixSerialRangeService {

    /**
     * Creates the ULD prefix / Carrier code Serial Range.
     * <p>
     * <b>Related Methods :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.ULDPrefixSerialRangeService#insertUldSerialRange(ULDPrefixSerialRangePersistRequest) insertUldSerialRange}
     * </ul>
     * </code>
     * <p>
     * <li>The ULD serial range related data are provided to create the ULD prefix / Carrier code. ULD serial
     * range related data's are :
     * <ul>
     * <li>ULD prefix
     * <li>Carrier Code
     * <li>Maximum Gross Weight
     * <li>Maximum Volume
     * <li>Contour
     * <li>Manufacturer’s Code
     * <li>Start Station
     * <li>ULD Group
     * <li>Serial Range Start
     * <li>Serial Range End
     * <li>Tare Weight
     * </ul>
     * <li>The combination of ULD prefix and the Carrier code must be unique.
     * <li>Tare Weight must be less than the Maximum Gross Weight.
     * <li>The Maximum Gross weight, Maximum Volume and Tare Weight are stored in Metrics System of
     * measurement.
     * <li>The weight and volume must be stored in metrics. (Weight – KG, Volume – MC).
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
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ULDSERIALRANGE_INVALID_STARTANDENDRANGE}
     * </td>
     * <td>Serial Range End must be greater than or equal to Serial Range Start.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ULDCONFIGURATION_INVALID_ULDPREFIX_INSTANCE}
     * </td>
     * <td>ULD prefix does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CARRIERCODE_NOTEXISTS}</td>
     * <td>The carrier code does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.framework.constants.MessageConstants#ENTITY_ALREADY_EXIST}</td>
     * <td>The entity already exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ULDPREFIX_CARRIERNAME_EXIST}</td>
     * <td>The combination of ULD prefix/Carrier code already exists in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangePersistRequest
     *            ULDPrefixSerialRangePersistRequest}</code><br>
     *            holds the attributes to create ULD prefix serial range.<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto uldPrefix} - (M)
     *            </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setUldPrefixName
     *            name} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setCarrierCode carrierCode} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setManufacturerCode
     *            manufacturerCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setMaximumGrossWeight
     *            maximumGrossWeight} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setMaximumVolume
     *            maximumGrossVolume} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setOId oId} - (C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setStartStation startStation} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setUldGroup uldGroup} - (O)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto
     *            uldSerialRange} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setEndRange
     *            endRange} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setStartRange startRange}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setTareWeight tareWeight}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setOId oId} - (C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setUldPrefixOId
     *            uldPrefixOId} - (C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setContour contour}
     *            - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setUldSerialRanges
     *            uldSerialRanges} - (M)(1:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto
     *            ULDSerialRangeDto}</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setEndRange
     *            endRange} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setStartRange startRange}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setTareWeight tareWeight}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setOId oId} - (C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setUldPrefixOId
     *            uldPrefixOId} - (C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeResponse
     *         ULDPrefixSerialRangeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto uldPrefix} </ul> </code>
     *         <p>
     * @throws LMSException If the serial range already exists the above mentioned error codes are returned.
     *             Each CodeMessage contains the status code,human readable message and message type.
     */
    ULDPrefixSerialRangeResponse createUldPrefixSerialRange(ULDPrefixSerialRangePersistRequest pRequest)
                throws LMSException;

    /**
     * Deletes the ULD prefix serial range.
     * <p>
     * <li>An existing ULD prefix / carrier code serial range data is retrieved.
     * <li>A specific serial range of the retrieved ULD prefix / carrier is chosen for deletion.
     * <li>The specific serial range information is deleted.
     * <ul>
     * <li>If the selected serial range is the only range available for the ULD prefix and carrier, then all
     * the ULD prefix/Carrier code information are deleted.
     * </ul>
     * <li>Remaining serial ranges for the ULD prefix / carrier code (if any).
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
     * @param pRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeDeleteRequest
     *            ULDPrefixSerialRangeDeleteRequest}</code><br>
     *            holds attributes to delete a ULD prefix serial range.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeDeleteRequest#setVersion
     *            version} - (M)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeDeleteRequest#setUldPrefixOId
     *            uldPrefixOId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeDeleteRequest#setStartRange
     *            startRange} - (M)</code>
     *            </ul>
     *            <p>
     * @param pUldPrefixDbDto <code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto
     *            ULDPrefixDto}</code><br>
     *            holds the ULD prefix data transfer object.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setUldPrefixName
     *            name} - (C)</code><br>
     *            Prohibited for delete operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setCarrierCode carrierCode} -
     *            (C)</code><br>
     *            Prohibited for delete operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setManufacturerCode
     *            manufacturerCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setMaximumGrossWeight
     *            maximumGrossWeight} - (C)</code><br>
     *            Prohibited for delete operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setMaximumVolume
     *            maximumGrossVolume} - (C)</code><br>
     *            Prohibited for delete operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setOId oId} - (M)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            -(M)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setStartStation
     *            startStation} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setUldGroup uldGroup} - (O)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto
     *            uldSerialRange} - (C)</code><br>
     *            Prohibited for delete operation.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setEndRange
     *            endRange} - (C)</code><br>
     *            Prohibited for delete operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setStartRange startRange}
     *            -(C)</code><br>
     *            Prohibited for delete operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setTareWeight tareWeight}
     *            - (C)</code><br>
     *            Prohibited for delete operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setOId oId} - (M)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setUldPrefixOId
     *            uldPrefixOId} - (M)</code><br>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setContour contour}
     *            - (C)</code><br>
     *            Prohibited for delete operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setUldSerialRanges
     *            uldSerialRanges} - (C)</code><br>
     *            Prohibited for delete operation.
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeResponse
     *         ULDPrefixSerialRangeResponse}</code>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}<br>
     *         holds the <code>CodeMessage</code>.
     *         </ul>
     *         <p>
     * @throws LMSException If the ULD prefix serial range details do not exist the above mentioned error
     *             codes are returned.Each CodeMessage contains the status code,human readable message and
     *             message type.
     */
    ULDPrefixSerialRangeResponse deleteUldPrefixSerialRange(ULDPrefixSerialRangeDeleteRequest pRequest,
                ULDPrefixDto pUldPrefixDbDto) throws LMSException;

    /**
     * Finds the ULD prefix serial range.
     * <p>
     * Provides the service for fetching the ULD Serial Ranges for the given ULD prefix.
     * <ul>
     * <li>If uldPrefix Name is given, then it finds the range information details by uldPrefixName.
     * <li>If both the uldPrefixName and the carrier code are given, find details by the combination of both.
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_ULD_MATCH}</td>
     * <td>The ULD prefix does not exist.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_ULDCARRIER_MATCH}</td>
     * <td>The Combination of UldPrefix and Carrier Code does not exist.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ULDCONFIGURATION_INVALID_ULDPREFIX_INSTANCE}
     * </td>
     * <td>ULD prefix does not exist in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeFindRequest
     *            ULDPrefixSerialRangeFindRequest}</code><br>
     *            holds the attributes to find the ULD prefix serial range.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeFindRequest#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeFindRequest#setUldPrefixName
     *            UldPrefixName} - (M)</code>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeResponse
     *         ULDPrefixSerialRangeResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto uldPrefix} </ul></code>
     *         <p>
     * @throws LMSException If no Uld Serial Range could be found based on the search criteria the above
     *             mentioned error codes are returned.Each CodeMessage contains the status code,human readable
     *             message and message type.
     */
    ULDPrefixSerialRangeResponse findUldPrefixSerialRange(ULDPrefixSerialRangeFindRequest pRequest)
                throws LMSException;

    /**
     * Gets the <code>ULDPrefix</code> detail.
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
     * @param pRequest holds attributes to delete a ULD prefix serial range.
     *            <p>
     * @return the current value of the <code>UldPrefixDto</code> object.
     *         <p>
     * @throws LMSException If the ULD prefix serial range details do not exist.
     */
    ULDPrefixDto getUldPrefixDetail(ULDPrefixSerialRangeDeleteRequest pRequest) throws LMSException;

    /**
     * Inserts the ULD prefix serial range for the given ULD prefix and carrier code combination.
     * <p>
     * <ul>
     * <li>The ULD serial range related data is provided and insert option is chosen to insert a new ULD
     * serial range for an existing ULD prefix / carrier code. ULD serial range related data's are :
     * <ul>
     * <li>ULD prefix
     * <li>Carrier Code
     * <li>Maximum Gross Weight
     * <li>Maximum Volume
     * <li>Contour
     * <li>Manufacturer’s Code
     * <li>Start Station
     * <li>ULD Group
     * <li>Serial Range Start
     * <li>Serial Range End
     * <li>Tare Weight
     * </ul>
     * <li>The ULD Serial ranges are stored in ascending order of the Serial Starting Range.
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
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#ULDSERIALRANGE_INVALID_TAREWEIGHT}
     * </td>
     * <td>Tare Weight must be less than Maximum Gross Weight.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangePersistRequest
     *            ULDPrefixSerialRangePersistRequest}</code><br>
     *            holds the attributes to insert ULD prefix serial range.<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto uldPrefix} - (M)
     *            </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setUldPrefixName
     *            name} - (C)</code><br>
     *            Prohibited for insert operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setCarrierCode carrierCode} -
     *            (C)</code><br>
     *            Prohibited for insert operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setManufacturerCode
     *            manufacturerCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setMaximumGrossWeight
     *            maximumGrossWeight} - (C)</code><br>
     *            Prohibited for insert operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setMaximumVolume
     *            maximumGrossVolume} - (C)</code><br>
     *            Prohibited for insert operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setOId oId} - (M)</code> <li>
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setStartStation startStation} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setUldGroup uldGroup} - (O)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto
     *            uldSerialRange} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setEndRange
     *            endRange} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setStartRange startRange}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setTareWeight tareWeight}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setOId oId} - (M)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setUldPrefixOId
     *            uldPrefixOId} - (M)</code><br>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setContour contour}
     *            - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto#setUldSerialRanges
     *            uldSerialRanges} - (M)(1:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto
     *            ULDSerialRangeDto} </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setEndRange
     *            endRange} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setStartRange startRange}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setTareWeight tareWeight}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setOId oId} - (M)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#setUldPrefixOId
     *            uldPrefixOId} - (M)</code><br>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixSerialRangeResponse
     *         ULDPrefixSerialRangeResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto uldPrefix} </ul> </code>
     *         <p>
     * @throws LMSException If the serial range already exists the above mentioned error codes are returned.
     *             Each CodeMessage contains the status code,human readable message and message type.
     */
    ULDPrefixSerialRangeResponse insertUldSerialRange(ULDPrefixSerialRangePersistRequest pRequest)
                throws LMSException;

    /**
     * Performs validation for the obtained request.
     * <p>
     * The format validations are performed for the attributes obtained from the request and exceptions are
     * thrown if any of the validation fails.
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
     * @param pRequest the abstract request for which the validation has to be performed.
     *            <p>
     * @throws LMSException If any validation fails for the obtained request.
     */
    void processValidation(final AbstractRequest pRequest) throws LMSException;

    /**
     * Finds the ULD by ULD prefix name.
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
     *            pValidationRequest}</code><br>
     *            includes the attributes to find special handling code.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M)</code> holds the list of ULD prefix name.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getRequestHeader()
     *         requestHeader} <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getResponseType()
     *         responseType} <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs
     *         searchInputs} - (1:*) <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs
     *         validInputs} - (1:*) </ul> </code>
     *         <p>
     * @throws LMSException If no ULD prefix name could be found based on the search criteria.
     */
    ValidationResponse validateULDPrefixName(ValidationRequest pValidationRequest) throws LMSException;

    /**
     * Validates the ULD serial number.
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
     * @param pUldSerialRanges holds the list of <code>ULDSerialRangeDto</code>.
     * @param pUldSerialRangeDto holds the start and end range of the serial number.
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto ULDSerialRangeDto}<br>
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#getEndRange()
     *         endRange} <li> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#getOId() oId}
     *         <li> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#getStartRange()
     *         startRange} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#getTareWeight() tareWeight}
     *         <li> {@link com.unisys.trans.logistics.lms.utils.dto.ULDSerialRangeDto#getUldPrefixOId()
     *         uldPrefixOId} </ul> </code>
     *         <p>
     * @throws LMSException If no ULD Serial number could be found based on the search criteria.
     */
    ULDSerialRangeDto validateUldSerialNumber(final List<ULDSerialRangeDto> pUldSerialRanges,
                final ULDSerialRangeDto pUldSerialRangeDto) throws LMSException;
}
