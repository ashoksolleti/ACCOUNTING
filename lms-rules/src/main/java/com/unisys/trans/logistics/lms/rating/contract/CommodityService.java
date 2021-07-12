/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
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
import com.unisys.trans.logistics.lms.framework.dto.SuggestiveSearchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.CommodityDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.CommodityFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.CommodityPersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.CommodityPurgeRequest;
import com.unisys.trans.logistics.lms.rating.dto.CommodityResponse;
import com.unisys.trans.logistics.lms.rating.dto.CommodityRestoreRequest;

import java.util.List;

/**
 * <code>CommodityService</code> interface exposes the APIs which identifies various processing flows involved
 * in maintaining the commodity information that is required to categorize cargo for the purpose of rating.
 * <p>
 * <code>CommodityService</code> provides create, update, find, delete, restore, purge services for
 * <code>Commodity</code> information and CommodityVersion information.<br>
 * This performs the following functions<br>
 * <ul>
 * <li>createCommodity - Creating the Commodity information
 * <li>deleteCommodity - Deleting the Commodity information
 * <li>restoreCommodity - Restoring the Commodity information
 * <li>findCommodity - Retrieving the Commodity information
 * <li>createCommodityVersion - Creating the Commodity Version information
 * <li>updateCommodityVersion - Updating the Commodity Version information
 * <li>purgeCommodityVersion - Purging the Commodity Version information
 * <li>findCommoditiesBySearch - Retrieving all the Commodity information
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.CommodityPersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.CommodityFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.CommodityDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.CommodityRestoreRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.CommodityPurgeRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.CommodityResponse
 */
@Path("commodityService")
public interface CommodityService {

    /**
     * Creates the <code>Commodity</code> information after validating the input (Commodity Number either IATA
     * or ATPCO) data.
     * <p>
     * <ul>
     * This method creates the commodity information for the given RatingConventionType(IATA or ATPCO).
     * </ul>
     * <p>
     * <p>
     * <b>Related Methods:</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.CommodityService#updateCommodityVersion UpdateCommodityVersion}
     * </ul>
     * </code>
     * <p>
     * <ul>
     * To create the Commodity information user must provide following input:<br>
     * <li>Commodity Type(IATA or ATPCO).<br>
     * <li>Commodity Code.<br>
     * <li>Description. <br>
     * <li>Effective Date. <br>
     * </ul>
     * <p>
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * <p>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_EFFECTIVE_DATE_GT_OR_E
     *            _CURRENT_DATE COMMODITY_EFFECTIVE_DATE_GT_OR_E_CURRENT_DATE}
     *            </code></td>
     * <td align="left">Effective date must be greater than or equal
     *  to current date when allowable date value
     * = 1.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_EFFECTIVE_DATE_GT_
     *            CURRENT_DATE COMMODITY_EFFECTIVE_DATE_GT_CURRENT_DATE}</code>
     * </td>
     * <td align="left">Effective date must be greater than current date when
     *  allowable date value = 0.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_CODE_DOES_NOT_EXIST COMMODITY_CODE_DOES_NOT_EXIST}
     *            </code></td>
     * <td align="left">The input Commodity Number does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_ALREADY_EXISTS COMMODITY_ALREADY_EXISTS}</code></td>
     * <td align="left">The input Commodity Number already exists in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_DESCRIPTION_MANDATORY COMMODITY_DESCRIPTION_MANDATORY}
     *            </code></td>
     * <td align="left">The Description is mandatory.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_EFFECTIVE_DATE_MANDATORY COMMODITY_EFFECTIVE
     *            _DATE_MANDATORY}</code>
     * </td>
     * <td align="left">The Effective Date is mandatory.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * <p>
     * <b>Acknowledgment:</b> <br>
     * <b>The following Acknowledgment Codes may be returned if the commodity version is 
     * updated successfully
     * :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_ACK_CREATED COMMODITY_ACK_CREATED}</code></td>
     * <td align="left">The commodity is created.</td>
     * </tr>
     * </table>
     * 
     * @param pCommodityPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityPersistRequest
     *            CommodityPersistRequest}</code> holds all the required information for 
     *            creating a commodity
     *            and its related commodity version details as input by the actor.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityPersistRequest#
     *            setCommodity
     *            commodity} </code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityDto#setCode code} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityDto#setDeletionDate
     *            deletionDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityDto#setHiddenIndicator
     *            hiddenIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityDto#setOId oId} - (C)</code><br>
     *            Prohibited for create operation.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.
     *            rating.dto.CommodityDto#setType type} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityDto#setCommodityVersions
     *            commodityVersions} (1:*)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setDescription
     *            description} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setExpirationDate
     *            expirationDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setOId oId} - (C)
     *            </code><br>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setRateComparisonIndicator
     *            rateComparisonIndicator} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse CommodityResponse}<br>
     *         <ul> <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse#getCommodities
     *         commodities} - (1:*) </ul> </code>
     *         <p>
     * @throws LMSException If the commodity create operation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    CommodityResponse createCommodity(CommodityPersistRequest pCommodityPersistRequest) throws LMSException;

    /**
     * Creates the <code>CommodityVersion</code> information after validating the input data.
     * <p>
     * This method creates a new CommodityVersion with end date as INDEF. It also sets the previous version's
     * end date to one day previous to this version's Start Date.
     * <p>
     * <b>Related Methods:</b> <code>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.
     * CommodityService#updateCommodityVersion
     *  UpdateCommodityVersion}
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.
     * CommodityService#createCommodity CreateCommodity}
     * </code>
     * <p>
     * <br>
     * To create the Commodity user must provide following input:<br>
     * <li>Commodity Code.<br>
     * <li>Description. <br>
     * <li>Effective Date. <br>
     * <p>
     * <br>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
     * ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * 
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
     * </br>
     * <p>
     * <p>
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * COMMODITY_EFFECTIVE_DATE_GT_OR_E_CURRENT_DATE COMMODITY_EFFECTIVE_DATE_GT_OR_E_CURRENT_DATE}
     * </code></td>
     * <td align="left">Effective date must be greater than or equal to current date when 
     * allowable date value
     * = 1.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#
     *            COMMODITY_EFFECTIVE_DATE_GT_CURRENT_DATE COMMODITY_EFFECTIVE_DATE_GT_CURRENT_DATE}
     *            </code></td>
     * <td align="left">Effective date must be greater than current date when allowable date value = 0.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_ALREADY_EXISTS COMMODITY_ALREADY_EXISTS}</code></td>
     * <td align="left">The input Commodity Number already exists in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_DESCRIPTION_MANDATORY COMMODITY_DESCRIPTION_MANDATORY}
     *            </code></td>
     * <td align="left">The Description is mandatory.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_EFFECTIVE_DATE_MANDATORY COMMODITY_EFFECTIVE_DATE_MANDATORY}
     *            </code></td>
     * <td align="left">The Effective Date is mandatory.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_MARKED_FOR_DELETION COMMODITY_MARKED_FOR_DELETION}</code></td>
     * <td align="left">The commodity is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_CODE_DOES_NOT_EXIST COMMODITY_CODE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The input Commodity Number does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_VERSION_DOES_NOT_EXIST COMMODITY_VERSION_DOES_NOT_EXIST}
     *            </code></td>
     * <td align="left">The input commodity's version does not exist in the system</td>
     * </tr>
     * </table>
     * </br>
     * <p>
     * <p>
     * <b>Acknowledgment:</b> <br>
     * <b>The following Acknowledgment Codes may be returned if the commodity version is created successfully
     * :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_NEW_VERSION_CREATED COMMODITY_NEW_VERSION_CREATED}</code></td>
     * <td align="left">New version for the commodity is created.</td>
     * </tr>
     * </table>
     * <br>
     * 
     * @param pCommodityPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityPersistRequest
     *            CommodityPersistRequest}</code> holds all the required information for creating a 
     *            commodity
     *            and its related commodity version details as input by the actor.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityPersistRequest#setCommodity
     *            commodity}</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setCode code}
     *             - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setDeletionDate
     *            deletionDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setHiddenIndicator
     *            hiddenIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setOId oId} - (C)</code><br>
     *            Prohibited for create operation.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setType 
     *            type} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setCommodityVersions
     *            commodityVersions} (1:*)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setDescription
     *            description} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setExpirationDate
     *            expirationDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setOId oId} - (C)
     *            </code><br>
     *            Prohibited for create operation.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#
     *            setRateComparisonIndicator
     *            rateComparisonIndicator} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse CommodityResponse}<br>
     *         <ul> <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse#getCommodities
     *         commodities} - (1:*) </ul> </code>
     *         <p>
     * @throws LMSException If the Creation of Commodity version operation fails, the above mentioned error
     *             codes are returned. Each CodeMessage contains the status code, human readable message and
     *             message type.
     */

    CommodityResponse createCommodityVersion(CommodityPersistRequest pCommodityPersistRequest)
                throws LMSException;

    /**
     * Deletes the <code>Commodity</code> information after validating the input (Commodity Number either IATA
     * or ATPCO) data.
     * <p>
     * <b>Related Methods :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.CommodityService#restoreCommodity 
     * RestoreCommodity}
     * </ul>
     * </code>
     * <p>
     * Commodity is marked for deletion on the specified <code>deletionDate</code>.
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_CODE_DOES_NOT_EXIST COMMODITY_CODE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The input Commodity Number does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#
     *            COMMODITY_ALREADY_MARKED_FOR_DELETION COMMODITY_ALREADY_MARKED_FOR_DELETION}</code></td>
     * <td align="left">The commodity is marked for deletion.</td>
     * </tr>
     * <tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_DELETE_DATE_MANDATORY COMMODITY_DELETE_DATE_MANDATORY}
     *            </code></td>
     * <td align="left">The Deletion Date is mandatory for Delete action.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_ACK_MARKED_FOR_DELETION COMMODITY_ACK_MARKED_FOR_DELETION}
     *            </code></td>
     * <td align="left">The commodity is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * COMMODITY_DELETION_DATE_MUSTNOT_PROCEED_CURRENTDATE COMMODITY_DELETION_DATE_MUSTNOT_PROCEED_CURRENTDATE}
     * </code></td>
     * <td align="left">The Deletion Date must not precede current date.</td>
     * </tr>
     * </table>
     * <p>
     * <p>
     * <b>Acknowledgment:</b> <br>
     * <b>The following Acknowledgment Codes may be returned if the commodity is marked for deletion</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_ACK_MARKED_FOR_DELETION COMMODITY_ACK_MARKED_FOR_DELETION}</code>
     * </td>
     * <td align="left">The commodity is marked for deletion.</td>
     * </tr>
     * </table>
     * 
     * @param pCommodityDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDeleteRequest
     *            CommodityDeleteRequest}</code> holds the information to find and mark a commodity as
     *            'Deleted'.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDeleteRequest#setCommodityCode
     *            commodityCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDeleteRequest#setDeletionDate
     *            deletionDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDeleteRequest#setOId oId} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDeleteRequest#setCommodityType
     *            commodityType} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse CommodityResponse}<br>
     *         <ul> <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse#getCommodities
     *         commodities} - (0:1) </ul> </code>
     *         <p>
     * @throws LMSException If the commodity delete operation fails,the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    CommodityResponse deleteCommodity(CommodityDeleteRequest pCommodityDeleteRequest) throws LMSException;

    /**
     * Retrieves all commodity informations.
     * <p>
     * <ul>
     * This operation is used to:<br>
     * <li>Retrieve all the Commodity informations.
     * </ul>
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_NO_DATA_FOUND COMMODITY_NO_DATA_FOUND}</code></td>
     * <td align="left">The input Commodity Number does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_SEARCH_TEXT_MANDATORY COMMODITY_SEARCH_TEXT_MANDATORY}</code></td>
     * <td align="left">The Search Text is mandatory.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pCommodityFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityFindRequest CommodityFindRequest}
     *            </code> request Object for retrieving the Commodity <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityFindRequest#setCode
     *            code} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityFindRequest#setType type} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityFindRequest#setIncludeHidden
     *            includeHidden} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityFindRequest#setSearchCode
     *            searchCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityFindRequest#setDate
     *            date(java.util.Date)} - (O)</code>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse CommodityResponse}
     *         <br> <ul> <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields} <li>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse#getCommodities
     *         commodities} - (0:*) </ul> </code>
     *         <p>
     * @throws LMSException If the commodity retrieve operation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    @POST
    @Path("/commodities")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    CommodityResponse findCommoditiesBySearch(final CommodityFindRequest pCommodityFindRequest)
                throws LMSException;

    /**
     * Retrieves the <code>Commodity</code> information after validating the input data.
     * <p>
     * <ul>
     * This operation is used to:<br>
     * <li>Retrieve the Commodity information for the Commodity Code and Type provided by the actor.
     * <li>Find the Commodity information based on the given date.
     * </ul>
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
     * <p>
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#COMMODITY_CODE_DOES_NOT_EXIST
     * COMMODITY_CODE_DOES_NOT_EXIST}</td>
     * <td>The input Commodity Number does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.rating.constants.
     * MessageConstants#COMMODITY_ACK_MARKED_FOR_DELETION
     * COMMODITY_ACK_MARKED_FOR_DELETION}</td>
     * <td>The commodity is marked for deletion.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pCommodityFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityFindRequest CommodityFindRequest}
     *            </code> request Object for retrieving the Commodity
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityFindRequest#setCode
     *            code} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityFindRequest#setType type} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityFindRequest#setIncludeHidden
     *            includeHidden} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityFindRequest#setSearchCode
     *            searchCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityFindRequest#setDate
     *            date(java.util.Date)} - (O)</code>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse 
     * CommodityResponse}<br>
     *         <ul> <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse 
     *         Response fields}
     *         <li>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse#getCommodities
     *         commodities} - (0:*) </ul> </code>
     *         <p>
     * @throws LMSException If the commodity retrieve operation fails, the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    CommodityResponse findCommodity(CommodityFindRequest pCommodityFindRequest) throws LMSException;

    /**
     * Purge the CommodityVersion information.
     * <p>
     * This method purges a CommodityVersion. Based on the CommodityOId and CommodityOId CommodityVersion is
     * deleted from the DB.<br>
     * <b>Related Method :</b>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.CommodityService#deleteCommodity
     * deleteCommodity}
     * </ul>
     * <p>
     * To purge Commodity user must provide following input:<br>
     * <li>OId. <br>
     * <p>
     * <b>Release Notes:</b><br>
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * COMMODITY_CODE_DOES_NOT_EXIST COMMODITY_CODE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The input Commodity Number does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * COMMODITY_MARKED_FOR_DELETION COMMODITY_MARKED_FOR_DELETION}</code></td>
     * <td align="left">The commodity is marked for deletion.</td>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * COMMODITY_VERSION_DOES_NOT_EXIST COMMODITY_VERSION_DOES_NOT_EXIST}</code></td>
     * <td align= "left">The input commodity's version does not exist in the system</td>
     * </tr>
     * </table>
     * <br>
     * <p>
     * <b>Acknowledgment:</b><br>
     * <b>The following Acknowledgment Codes may be returned if the commodity is purged successfully :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * COMMODITY_VERSION_PURGED COMMODITY_VERSION_PURGED}</code></td>
     * <td align= "left">The commodity version is purged.</td>
     * </tr>
     * </table>
     * 
     * @param pCommodityPurgeRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityPurgeRequest
     *            CommodityPurgeRequest}</code><br>
     *            includes the attributes to purge a <code>Commodity </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto
     *            Commodity} </code>
     *            <ul>
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setOId
     *            oId} - (M)</code> <br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.
     *            PersistenceObjectDto#setVersion version}
     *            -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse
     *         CommodityResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.rating.constants.
     *         MessageConstants#COMMODITY_VERSION_PURGED
     *         COMMODITY_VERSION_PURGED} </code> <br>
     *         <code>for successful purge.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse#getCommodities()
     *         CommodityDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto
     *         commodities}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the purge operation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */

    CommodityResponse purgeCommodityVersion(
                CommodityPurgeRequest pCommodityPurgeRequest) throws LMSException;

    /**
     * Restores the <code>Commodity</code> which has been marked for deletion.<br>
     * <p>
     * The precondition is that the commodity information should have been retrieved
     *  and marked for deletion.
     * <br>
     * The system validates the commodity information to check whether the commodity is not marked for
     * deletion. If the commodity is not marked for deletion, the error message is thrown.
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
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_CODE_DOES_NOT_EXIST COMMODITY_
     *            CODE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The input Commodity Number does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * COMMODITY_ALREADY_MARKED_FOR_DELETION COMMODITY_ALREADY_MARKED_
     * FOR_DELETION}</code></td>
     * <td align="left">The commodity is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * COMMODITY_ACK_RESTORE_SUCCESSFUL COMMODITY_ACK_RESTORE_SUCCESSFUL}</code></td>
     * <td align="left">The commodity is restored.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pCommodityRestoreRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityRestoreRequest
     *            CommodityRestoreRequest}</code> request Object to restore Commodity.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityPersistRequest#setCommodity
     *            commodity}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityRestoreRequest#setCommodityCode
     *            commodityCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityRestoreRequest#setCommodityType
     *            commodityType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.
     *            CommodityRestoreRequest#setOId oId} - (M)
     *            </code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.
     * CommodityResponse CommodityResponse}<br>
     *         <ul> <li>{@link com.unisys.trans.logistics.lms.framework.dto.
     *         AbstractResponse Response fields}
     *         <li>{@link com.unisys.trans.logistics.lms.rating.dto.
     *         CommodityResponse#getCommodities
     *         commodities} - (0:1) </ul> </code>
     *         <p>
     * @throws LMSException If the commodity restore operation fails,the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */
    CommodityResponse restoreCommodity(CommodityRestoreRequest pCommodityRestoreRequest) throws LMSException;

    /**
     * Updates the <code>CommodityVersion</code> information after validating (Commodity Number either IATA
     * or ATPCO) the input data.
     * <p>
     * <b>Related Methods :</b> <code>
     * <ul>
     * <li>
     * {@link com.unisys.trans.logistics.lms.rating.contract.CommodityService#purgeCommodity PurgeCommodity}
     * </ul>
     * </code>
     * <p>
     * This method is used to update the <code>Commodity</code> information which is retrieved and not marked
     * for deletion. Commodity information can be updated only if it is not marked for deletion. <br>
     * Update CommodityVersion information for changes made by the actor. Return updated CommodityVersion
     * information.
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * COMMODITY_VERSION_DOES_NOT_EXIST COMMODITY_VERSION_DOES_NOT_EXIST}</code></td>
     * <td align="left">The input commodity's version does not exist in the system</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_CODE_DOES_NOT_EXIST COMMODITY_CODE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The input Commodity Number does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * COMMODITY_MARKED_FOR_DEL_CANNOT_UPDATE COMMODITY_MARKED_FOR_DEL_CANNOT_UPDATE}</code></td>
     * <td align="left">Commodity is marked for deletion. Cannot update commodity details.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * COMMODITY_DESCRIPTION_MANDATORY COMMODITY_DESCRIPTION_MANDATORY}</code></td>
     * <td align="left">The Description is mandatory.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * COMMODITY_EFFECTIVE_DATE_MANDATORY COMMODITY_EFFECTIVE_DATE_MANDATORY}</code></td>
     * <td align="left">The Effective Date is mandatory.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     * COMMODITY_EFFECTIVE_DATE_GT_PREV_VERSION COMMODITY_EFFECTIVE_DATE_GT_PREV_VERSION}</code></td>
     * <td align="left">Effective date must be greater than previous versions effective date.</td>
     * </tr>
     * </table>
     * <p>
     * <p>
     * <b>Acknowledgment:</b> <br>
     * <b>The following Acknowledgment Codes may be returned if the commodity version is updated successfully
     * </b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#
     *            COMMODITY_ACK_UPDATE_SUCCESSFUL COMMODITY_ACK_UPDATE_SUCCESSFUL}</code></td>
     * <td align="left">The commodity version is updated.</td>
     * </tr>
     * </table>
     * 
     * @param pCommodityPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityPersistRequest
     *            CommodityPersistRequest}</code> request Object for updating CommodityVersion information.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityPersistRequest#setCommodity
     *            commodity}</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setCode code} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setDeletionDate
     *            deletionDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setHiddenIndicator
     *            hiddenIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setType type} - (M)</code> 
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setCommodityVersions
     *            commodityVersions} - (1:*)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setDescription
     *            description} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setExpirationDate
     *            expirationDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setOId oId} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#
     *            setRateComparisonIndicator
     *            rateComparisonIndicator} - (M)</code>
     *            </ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setOId oId} - (M)
     *            </code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse CommodityResponse}<br>
     *         <ul> <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse#getCommodities
     *         commodities} - (1:*) </ul> </code>
     *         <p>
     * @throws LMSException If the commodity update operation fails,the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */

    CommodityResponse updateCommodityVersion(CommodityPersistRequest pCommodityPersistRequest)
                throws LMSException;

    /**
     * Updates the <code>Commodity</code> information after validating (Commodity Number either IATA
     * or ATPCO) the input data.
     * It mainly updates the Retain Indicator and allow on commodity search indicator.
     * <p>
     * <b>Related Methods :</b> <code>
     * <ul>
     * <li>
     * {@link com.unisys.trans.logistics.lms.rating.contract.CommodityService#updateCommodityVersion 
     * updateCommodityVersion}
     * </ul>
     * </code>
     * <p>
     * This method is used to update the <code>Commodity</code> information which is retrieved and not marked
     * for deletion. Commodity information can be updated only if it is not marked for deletion. <br>
     * Update Commodity information for changes made by the actor. Return updated Commodity information.
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_CODE_DOES_NOT_EXIST COMMODITY_CODE_DOES_NOT_EXIST}</code></td>
     * <td align="left">The input Commodity Number does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_MARKED_FOR_DEL_CANNOT_UPDATE 
     *            COMMODITY_MARKED_FOR_DEL_CANNOT_UPDATE}</code>
     * </td>
     * <td align="left">Commodity is marked for deletion. Cannot update commodity details.</td>
     * </tr>
     * </table>
     * <p>
     * <p>
     * <b>Acknowledgment:</b> <br>
     * <b>The following Acknowledgment Codes may be returned if the commodity is updated successfully </b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_IS_UPDATED COMMODITY_IS_UPDATED}</code></td>
     * <td align="left">The commodity is updated.</td>
     * </tr>
     * </table>
     * 
     * @param pCommodityPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityPersistRequest
     *            CommodityPersistRequest}</code> request Object for updating CommodityVersion information.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityPersistRequest#setCommodity
     *            commodity}</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setCode 
     *            code} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setDeletionDate
     *            deletionDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setHiddenIndicator
     *            hiddenIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setRetainIndicator
     *            retainIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setType type}
     *             - (M)</code> 
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setCommodityVersions
     *            commodityVersions} - (1:*)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setDescription
     *            description} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setExpirationDate
     *            expirationDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#setOId oId} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CommodityVersionDto#
     *            setRateComparisonIndicator
     *            rateComparisonIndicator} - (M)</code>
     *            </ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityDto#setOId oId} - (M)
     *            </code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse CommodityResponse}
     * <br>
     *         <ul> <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li>{@link com.unisys.trans.logistics.lms.rating.dto.CommodityResponse#getCommodities
     *         commodities} - (1:*) </ul> </code>
     *         <p>
     * @throws LMSException If the commodity update operation fails,the above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human readable message and message
     *             type.
     */

    CommodityResponse updateCommodity(CommodityPersistRequest pCommodityPersistRequest) throws LMSException;
    
    MultipleFindResponse findCommodityDetails(MultipleFindRequest pMultipleFindRequest)  throws LMSException;
    CommodityResponse findCommodityInfo(CommodityFindRequest pCommodityFindRequest) throws LMSException;

    List<String> findAllCommodityCode()throws LMSException ;

    SuggestiveSearchResponse findAllCommoditiesBySuggestiveSearch(CommodityFindRequest aCommodityFindRequest) throws LMSException;
    CommodityResponse findCommodityByCode(final String pCommodityCode)throws LMSException;
}