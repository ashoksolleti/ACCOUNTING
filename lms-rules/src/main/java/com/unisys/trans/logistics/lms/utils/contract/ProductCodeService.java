/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.dto.SuggestiveSearchResponse;
import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.ProductCodeDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.ProductCodeFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.ProductCodePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.ProductCodeResponse;

/**
 * <code>ProductCodeService</code> handles the maintenance of product codes required for a cargo application.
 * <p>
 * Product codes define the special processing that applies to a shipment. All shipments must be assigned a
 * product code. <br>
 * This provides the following functions:
 * <ul>
 * <li>Creates a product code.
 * <li>Deletes a product code.
 * <li>Finds the product code.
 * <li>Updates a product code.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ProductCodeDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ProductCodeFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ProductCodePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ProductCodeResponse
 */
@Path("productCodeService")
public interface ProductCodeService {

    /**
     * Creates the <code>ProductCode</code>.
     * <p>
     * <b>Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ProductCodeService#updateProductCode
     * updateProductCode}
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
     * <b>The following Error Codes are returned: </b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PRODUCT_INCORRECT_SPLCODES}</td>
     * <td>Special Handling Code does not exist.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PRODUCT_INVALID_SMALLEXPRESSCODE}
     * </td>
     * <td>Small Package Express Indicator code must be unique.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PRODUCT_INVALID_INCOMING_SERVICECODE}
     * </td>
     * <td>The Service code for the Product code should be unique.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PRODUCT_INCORRECT_OTHERCHARGECODES}
     * </td>
     * <td>The Other Charge Codes present in the request does not exist in the system.</td>
     * </tr>
     * </table>
     * 
     * @param pProductCodePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodePersistRequest
     *            ProductCodePersistRequest}</code><br>
     *            holds all the attributes to create a <code>ProductCode</code>.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto productCode}- (M)
     *            </code><br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setAllianceCode
     *            allianceCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setBookedIndicator
     *            bookedIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setConnectionTimeDifference
     *            connectionTimeDifference} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setDescription description} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setDropOffTimeDifference
     *            dropOffTimeDifference} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setDueText dueText} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setDueHours dueHours} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setFzdFzeMsgIndicator
     *            fzdFzeMsgIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setIncomingServiceCode
     *            incomingServiceCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setLastMinuteIndicator
     *            lastMinuteIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setLatestAcceptanceTimeCode
     *            latestAcceptanceTimeCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setOId oId} - (C)</code>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code> Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setOutgoingServiceCode
     *            outgoingServiceCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setOtherChargeCode
     *            otherChargeCode} - (O)(0:3)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductOtherChargesCodeDto
     *            ProductOtherChargesCodeDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductOtherChargesCodeDto#setOId oId} -
     *            (C))</code> <br>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductOtherChargesCodeDto#setOtherChargesCode
     *            otherChargesCode} - (O))</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductOtherChargesCodeDto#setProductCodeOId
     *            productCodeOId} - (C))</code> <br>
     *            Prohibited for create operation.<br>
     *            </ul>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setPrintIndicator
     *            printIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setProductCode productCode} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setQueueReasonCode
     *            queueReasonCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setRateTypeCode rateTypeCode}
     *            - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setRecoveryTimeDifference
     *            recoveryTimeDifference} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setServiceLevelCode
     *            serviceLevelCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setSmallPackageExpressCode
     *            smallPackageExpressCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setSpecialHandlingCodes
     *            specialHandlingCodes} - (O)(0:5)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductSpecialHandlingCodeDto
     *            ProductSpecialHandlingCodeDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductSpecialHandlingCodeDto#setOId oId} -
     *            (C)</code> <br>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductSpecialHandlingCodeDto#setProductOId
     *            productCodeOId} - (C) </code> <br>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductSpecialHandlingCodeDto#setSpecialHandlingCode
     *            specialHandlingCode} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setTimeDefiniteCode
     *            timeDefiniteCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setTimeDefiniteTypeCode
     *            timeDefiniteTypeCode} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeResponse ProductCodeResponse}
     *         <br> <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeResponse#getProductCodes()
     *         productCodes} - (1:1) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto
     *         ProductCodeDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the create operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message and message type.<br>
     */
    ProductCodeResponse createProductCode(ProductCodePersistRequest pProductCodePersistRequest)
                throws LMSException;

    /**
     * Deletes the <code>ProductCode</code>.
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes are returned:</b></br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PRODUCT_DELETE_SUCCESSFUL}</td>
     * <td>Product Code delete acknowledgment message.</td>
     * </tr>
     * </table>
     * 
     * @param pProductCodeDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDeleteRequest
     *            ProductCodeDeleteRequest}</code><br>
     *            holds all the attributes to delete a product code.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDeleteRequest#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDeleteRequest#setProductCode
     *            productCode} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeResponse ProductCodeResponse}
     *         </code>
     *         <ul>
     *         <code><li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         will hold the <code>CodeMessage</code>.
     *         </ul>
     *         <p>
     * @throws LMSException If the delete operation fails the error codes are returned. Each CodeMessage
     *             contains the status code, human readable message and message type.<br>
     */
    ProductCodeResponse deleteProductCode(ProductCodeDeleteRequest pProductCodeDeleteRequest)
                throws LMSException;

    /**
     * Finds the <code>productCode</code>(s) based on the criteria.
     * <p>
     * <li>If no filter option is input by the actor the system returns all the product codes sorted in
     * alphanumeric order.
     * <li>If the <code>exactMatchIndicator</code> is true and there is no exact match to the product code is
     * found, no <code>ProductCode</code> is returned.<br>
     * <li>If the <code>exactMatchIndicator</code> is true and there is a match to the product code, only that
     * <code>ProductCode</code> is returned.
     * <li>If the <code>exactMatchIndicator</code> is false or not provided, then all product codes greater
     * than or equal to <code>ProductCodeFilter</code> are returned.
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes are returned :</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_PRODUCTCODE_EXACT_MATCH}</td>
     * <td>Product Code entered in the request does not exist in the system..</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pProductCodeFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeFindRequest
     *            ProductCodeFindRequest}</code><br>
     *            the request object includes the attributes to find product code(s).<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeFindRequest#setProductCode
     *            productCode} - (C)</code><br>
     *            Mandatory if the value of exact match required indicator is “Y”; otherwise optional. <li>
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeFindRequest#setExactMatchRequired
     *            exactMatchRequiredIndicator} - (O)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeResponse ProductCodeResponse}
     *         <br> <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields} <li> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto productCodes} -
     *         (0:*) </ul> </code>
     *         <p>
     * @throws LMSException If the find operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message and message type.
     */
    ProductCodeResponse findProductCode(ProductCodeFindRequest pProductCodeFindRequest) throws LMSException;
    
    
    /**
     * Finds the <code>productCode</code>(s) based on the criteria.
     * <p>
     * <li>If no filter option is input by the actor the system returns all the product codes sorted in
     * alphanumeric order.
     * <li>If the <code>exactMatchIndicator</code> is true and there is no exact match to the product code is
     * found, no <code>ProductCode</code> is returned.<br>
     * <li>If the <code>exactMatchIndicator</code> is true and there is a match to the product code, only that
     * <code>ProductCode</code> is returned.
     * <li>If the <code>exactMatchIndicator</code> is false or not provided, then all product codes greater
     * than or equal to <code>ProductCodeFilter</code> are returned.
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes are returned :</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#NO_PRODUCTCODE_EXACT_MATCH}</td>
     * <td>Product Code entered in the request does not exist in the system..</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pProductCodeFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeFindRequest
     *            ProductCodeFindRequest}</code><br>
     *            the request object includes the attributes to find product code(s).<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeFindRequest#setProductCode
     *            productCode} - (C)</code><br>
     *            Mandatory if the value of exact match required indicator is “Y”; otherwise optional. <li>
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeFindRequest#setExactMatchRequired
     *            exactMatchRequiredIndicator} - (O)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.SuggestiveSearchResponse SuggestiveSearchResponse}
     *         <br> <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields} <li> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto productCodes} -
     *         (0:*) </ul> </code>
     *         <p>
     * @throws LMSException If the find operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message and message type.
     */
    @POST
    @Path("/productCodes")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    SuggestiveSearchResponse findProductCodeSuggestiveSearch(ProductCodeFindRequest pProductCodeFindRequest) throws LMSException;

    /**
     * Finds the product codes by using product code.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.ProductCodeService#findProductCode findProductCode
     * * }
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
     *            holds the request object which includes the attributes to find the product code.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M) (1:*)</code><br>
     *            holds the product codes.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         holds the list of the product code data transfer objects.<br>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*)</code><br>
     *         holds a map of product code details with product code as key and <code>ProductCodeDto</code> as
     *         value.
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto ProductCodeDto}
     *         </code>
     *         </ul>
     *         </ul>
     */
    MultipleFindResponse findProductCodes(final MultipleFindRequest pMultipleFindRequest);

    /**
     * Updates the <code>ProductCode</code>.
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
     * <tr>
     * <td
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PRODUCT_CANNOT_BE_UPDATED}</td>
     * <td>Product code cannot be updated.</td>
     * </tr>
     * </table>
     * 
     * @param pProductCodePersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodePersistRequest
     *            ProductCodePersistRequest}</code><br>
     *            the request object includes attributes to update the <code>ProductCode</code>.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto ProductCodeDto}
     *            </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setAllianceCode
     *            allianceCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setBookedIndicator
     *            bookedIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setConnectionTimeDifference
     *            connectionTimeDifference} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setDescription description} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setDropOffTimeDifference
     *            dropOffTimeDifference} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setDueText dueText} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setDueHours dueHours} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setFzdFzeMsgIndicator
     *            fzdFzeMsgIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setIncomingServiceCode
     *            incomingServiceCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setLastMinuteIndicator
     *            lastMinuteIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setLatestAcceptanceTimeCode
     *            latestAcceptanceTimeCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setOId oId} - (M)</code> <li>
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setOutgoingServiceCode
     *            outgoingServiceCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setOtherChargeCode
     *            otherChargeCode} - (O)(0:3)</code>
     *            <ul>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductOtherChargesCodeDto
     *            ProductOtherChargesCodeDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductOtherChargesCodeDto#setOId oId} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductOtherChargesCodeDto#setOtherChargesCode
     *            otherChargesCode} - (O))</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductOtherChargesCodeDto#setProductCodeOId
     *            productCodeOId} - (M))</code>
     *            </ul>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setPrintIndicator
     *            printIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setProductCode productCode} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setQueueReasonCode
     *            queueReasonCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setRateTypeCode rateTypeCode}
     *            - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setRecoveryTimeDifference
     *            recoveryTimeDifference} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setServiceLevelCode
     *            serviceLevelCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setSmallPackageExpressCode
     *            smallPackageExpressCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setSpecialHandlingCodes
     *            specialHandlingCodes} - (O)(0:5)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductSpecialHandlingCodeDto
     *            ProductSpecialHandlingCodeDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductSpecialHandlingCodeDto#setOId oId} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductSpecialHandlingCodeDto#setProductOId
     *            productCodeOId} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductSpecialHandlingCodeDto#setSpecialHandlingCode
     *            specialHandlingCode} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setTimeDefiniteCode
     *            timeDefiniteCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto#setTimeDefiniteTypeCode
     *            timeDefiniteTypeCode} - (O)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeResponse ProductCodeResponse}
     *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeResponse#getProductCodes()
     *         productCodes} - (1:1) <ul> <li> {@link com.unisys.trans.logistics.lms.utils.dto.ProductCodeDto
     *         ProductCodeDto} </ul> </ul> </code>
     *         <p>
     * @throws LMSException If the update operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message and message type.
     */
    ProductCodeResponse updateProductCode(ProductCodePersistRequest pProductCodePersistRequest)
                throws LMSException;

    /**
     * Validates that <code>ProductCode</code> exists.
     * <p>
     * The system finds the product code that exactly matches the input product code.
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
     * @param pValidationRequest <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest ValidationRequest}
     *            </code><br>
     *            holds the list of search input values.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M)(1:*)</code><br>
     *            holds the list of <code>productCode</code>.
     *            </ul>
     *            <p>
     * @return <code> <li> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs
     *         validInputs} - (0:*)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs
     *         searchInputs} - (1:*)</code> </ul> </code>
     *         <p>
     * @throws LMSException If the method fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message and message type.
     */
    ValidationResponse validateProductCode(ValidationRequest pValidationRequest) throws LMSException;

    List<String> findProductCode(String pPrefix)throws LMSException;
	ValidationResponse validateProductCodeForSpecAirline(ValidationRequest aValidationRequest, List<String> specAirline)throws LMSException;
    
    
    
}
