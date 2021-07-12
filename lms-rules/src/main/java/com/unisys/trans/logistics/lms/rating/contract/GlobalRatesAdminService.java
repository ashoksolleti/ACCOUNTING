/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.ContractAdminDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.ContractAdminFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.ContractAdminPersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.ContractAdminResponse;
import com.unisys.trans.logistics.lms.rating.dto.GlobalRatePFMRequest;
import com.unisys.trans.logistics.lms.rating.dto.GlobalRatePFMResponse;
import com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminPersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminRequest;
import com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminResponse;

/**
 * <code>Global Rates Admin Service</code> maintains Global Tariff and Contract Rate 
 * Administration tasks that 
 * are used to update multiple tariff rates and contracts via a batch process. 
 * The rate administration tasks are created, updated, deleted, and retrieved. 
 * <p>
 * It offers the following services for maintaining global rates information:<br>
 * <ul>
 * <li>createTariffRateTasks - Creates tariff rate tasks information.
 * <li>retrieveAllTariffRateTasks - Retrieves all the tariff rate tasks that exist in the system.
 * <li>updateTariffRateTasks - Updates tariff rate tasks information.
 * <li>deleteAllTariffRateTasks - Deletes all the tariff rate tasks that exist in the system.
 * <li>Create a ContractTask.
 * <li>Delete a ContractTask.
 * <li>Find a ContractTask.
 * <li>Update a ContractTask.
 * <li>Finds all the ContractTasks.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminPersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminResponse
 * @see com.unisys.trans.logistics.lms.rating.dto.ContractAdminDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ContractAdminFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ContractAdminPersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ContractAdminResponse
 */
public interface GlobalRatesAdminService {

    /**
         * Creates the <code>Contract Task</code>.
         * <p>
         * Creates the Contract Task for given Participant and contract number after validating all datas.
         * <p>
         * <b> Related methods include:</b><br>
         * {@link com.unisys.trans.logistics.lms.rating.contract.GlobalRatesAdminService#
         * retrieveAllContractTasks(ContractAdminFindRequest)
         * retrieveAllContractTasks}<br>
         * <p>
         * To create the RatingSecurity user must provide following input:<br>
         * <li>agent<br>
         * <li>allCommodity<br>
         * <li>allContractDestination<br>
         * <li>allContractOrigin<br>
         * <li>allMinimumWeight<br>
         * <li>allUldType<br>
         * <li>anyMinimumWeight<br>
         * <li>anyPivotWeight<br>
         * <li>biDirectional<br>
         * <li>carrierCode1<br>
         * <li>carrierCode2<br>
         * <li>carrierCode3<br>
         * <li>carrierCode4<br>
         * <li>classRatingId<br>
         * <li>commodityNumber<br>
         * <li>consignee<br>
         * <li>consigneeBillTo<br>
         * <li>contractDefinition<br>
         * <li>contractDestination<br>
         * <li>contractOrigin<br>
         * <li>currency<br>
         * <li>forwarder<br>
         * <li>minimumWeight<br>
         * <li>oId<br>
         * <li>oritoDesPayCode<br>
         * <li>overPivotRateAdjustment<br>
         * <li>overPivotRateAdjustmentType<br>
         * <li>participantRoleType<br>
         * <li>pivotWeight<br>
         * <li>rateAdjustment<br>
         * <li>rateAdjustmentType<br>
         * <li>rateClass<br>
         * <li>rateSource<br>
         * <li>rateType<br>
         * <li>roundingFactor<br>
         * <li>shipper<br>
         * <li>shipperBillTo<br>
         * <li>uldCharge<br>
         * <li>uldType<br>
         * <li>weightUnit<br>
         * <li>responsibleParty<br>
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
         * MessageConstants#GLOBAL_CONTRACT_ALREADY_EXIST
                  GLOBAL_CONTRACT_ALREADY_EXIST}</code></td>
         * <td align="left">Global Contract Task Already Exist</td>
         * <tr>
         * <td align="left">
         * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
         * MessageConstants#GLOBAL_CONTRACT_INVALID_PARTICIPANT
                  GLOBAL_CONTRACT_INVALID_PARTICIPANT}</code></td>
         * <td align="left">Contract does not exist for the given participant account no</td>
         * <tr>
         * <td align="left">
         * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
         * MessageConstants#GLOBAL_CONTRACT_THE_PARTICIPANT_ACCOUNT_NO_DOES_NOT_BELONG_TO_CONTRACT_NUMBER
                  GLOBAL_CONTRACT_THE_PARTICIPANT_ACCOUNT_NO_DOES_NOT_BELONG_TO_CONTRACT_NUMBER}</code></td>
         * <td align="left">The given Participant Number does not belong to the contract Number</td>
         * <tr>
         * <td align="left">
         * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
         * MessageConstants#CONTRACT_DOES_NOT_EXIST
                  CONTRACT_DOES_NOT_EXIST}</code></td>
         * <td align="left">The given contract Number does not exist in the system</td>
         * <tr>
         * <td align="left">
         * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
         * MessageConstants#CONTRACT_NOT_FOUND
                  CONTRACT_NOT_FOUND}</code></td>
         * <td align="left">The given contract Number not found</td>
         * <tr>
         * <td align="left">
         * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
         * MessageConstants#CONTRACT_USER_NOT_AUTHORIZED
                  CONTRACT_USER_NOT_AUTHORIZED}</code></td>
         * <td align="left">The user not authorised for the contract routing</td>
         * <tr>
         * <td align="left">
         * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
         *MessageConstants#CONTRACT_IS_DELETED
                  CONTRACT_IS_DELETED}</code></td>
         * <td align="left">The given contract number is deleted</td>
         * </table>
         * <p>
         * 
         * @param pContractAdminPersistRequest
         *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractAdminPersistRequest
         *            ContractAdminPersistRequest}</code><br>
         *            includes the attributes to create a <code>ContractAdmin </code>.
         *            <ul>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractAdminDto#getContractNumber()
         *            ContractNumber} - (C)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractAdminDto#getParticipantAccountNumber()
         *            ParticipantAccountNumber} - (C)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.framework.dto.
         *            DateRangeDto#getEffectiveDate()
         *            Effective Date} -(M)</code><li><code>
         *            {@link com.unisys.trans.logistics.lms.framework.dto.
         *            DateRangeDto#getExpirationDate()
         *            Expiration Date} -(O)</code><li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractAdminDto#getSelectionDate()
         *            Selection Date} - (O)</code><li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractAdminDto#getContactDto()
         *            Participant Contact Details} - (C)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractAdminDto#getContractRateAdminDto()
         *            ContractRateAdminDto} - (C)</code>
         *            <ul>
         *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getAgent()
         *            Agent} - (O)</code><li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getAllCommodity()
         *            All Commodity} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getAllContractDestination()
         *            AA Destination} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getAllContractOrigin()
         *            All Origin} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getAllMinimumWeight()
         *            All Minimum weight} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getAllUldType()
         *            Uld Type} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getAnyMinimumWeight()
         *            Any Minimum weight} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getAnyPivotWeight()
         *            Any Pivot Minimum weight} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getBiDirectional()
         *            Bi- Directional Indicator} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getCarrierCode1()
         *            Carrier code1} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getCarrierCode2()
         *            Carrier code2} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getCarrierCode3()
         *            Carrier code3} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getCarrierCode4()
         *            Carrier code4} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getClassRatingId()
         *            Class Rating Id} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getCommodityNumber()
         *            Commodity Number} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getConsignee()
         *            Consignee Indicator} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getConsigneeBillTo()
         *            Consignee Bill to Indicator} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getContractDefinition()
         *            Contract Definition} - (M)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getContractDestination()
         *            Destination} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getContractOrigin()
         *            Origin} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getCurrency()
         *            Currency code} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getDestoOriPayCode()
         *            Destination to Origin Pay Code Type} - (O)</code>
         *            <ul>
         *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.
         *            constants.PayCodeType
         *            PayCodeType}-{O} </code>
         *            <ul>
         *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.
         *            constants.PayCodeType#COLLECT
         *            Collect}-{O} </code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.constants.
         *            PayCodeType#PREPAID PREPAID}-{O}
         *            </code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.constants.
         *            PayCodeType#EITHER EITHER}-{O}
         *            </code>
         *            </ul>
         *            </ul>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto
         *            .ContractRateAdminDto#getForwarder()
         *            Forwarder} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getMinimumWeight()
         *            Minimum Weight} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getOritoDesPayCode()
         *            Origint to Destination Pay Code Type} - (O)</code>
         *            <ul>
         *            <li><code>{@link com.unisys.trans.logistics.lms.
         *            rating.dto.constants.PayCodeType
         *            PayCodeType}-{O} </code>
         *            <ul>
         *            <li><code>{@link com.unisys.trans.logistics.lms.
         *            rating.dto.constants.PayCodeType#COLLECT
         *            Collect}-{O} </code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            constants.PayCodeType#PREPAID PREPAID}-{O}
         *            </code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            constants.PayCodeType#EITHER EITHER}-{O}
         *            </code>
         *            </ul>
         *            </ul>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getOverPivotRateAdjustment()
         *            Over Pivot Rate Adjustment} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getOverPivotRateAdjustmentType()
         *            Over Pivot Rate Adjustment Type} - (O)</code>
         *            <ul>
         *            <li><code>{@link com.unisys.trans.logistics.lms.
         *            rating.dto.constants.RateAdjustmentType
         *            Rate Adjustment Type}-{O} </code>
         *            <ul>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            constants.RateAdjustmentType#AMOUNT_DECREASE
         *            Amount Decrease}</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            constants.RateAdjustmentType#AMOUNT_INCREASE
         *            Amount Icrease}</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            constants.RateAdjustmentType#PERCENT_DECREASE
         *            Percent Decrease}</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            constants.RateAdjustmentType#PERCENT_INCREASE
         *            Percent increase}</code>
         *            </ul>
         *            </ul>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getParticipantRoleType()
         *            Participant Role Type} - (O)</code>
         *            <ul>
         *            <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.
         *            constants.ParticipantRoleType
         *            ParticipantRoleType</code>
         *            <ul>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#AGENT 
         *            Agent}
         *            
         *            </code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#BANK Bank}
         *            </code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#BILL_TO_CONSIGNEE
         *            Bill to consignee}</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#BILL_TO_SHIPPER
         *            Bill to shipper}</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#BROKER Broker}
         *            </code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#CUSTOMS_LOCATION Customs Location}
         *            </code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#CONSIGNEE Consignee}
         *            </code>
         *             <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#DELIVERY_OPERATOR Delivery Operator}
         *            </code>
         *             <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#FORWARDER Consignee}
         *            </code>
         *             <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#MANUFACTURER Manufacturer}
         *            </code>
         *             <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#NOTIFY Notify}
         *            </code>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#PICK_UP_LOCATION Pick Up Location}
         *            </code>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#PICK_UP_OPERATOR Pick Up Operator}
         *            </code>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#SHIPPER Shipper}
         *            </code>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#SUBCONTRACTOR1 Sub Contractor1}
         *            </code>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#SUBCONTRACTOR2 Sub Contractor2}
         *            </code>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#SUBCONTRACTOR3 Sub Contractor3}
         *            </code>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#SURFACE_DESTINATION Surface Destination}
         *            </code>
         *             <li><code>
         *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
         *            ParticipantRoleType#SURFACE_ORIGIN Surface Origin}
         *            </code>
         *            </ul>
         *            </ul>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getPivotWeight()
         *            Pivot Weight} - (O)</code>
         *             <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getRateAdjustment()
         *            Rate Adjustment} - (O)</code>
         *             <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getRateAdjustmentType()
         *            Rate Adjustment Type} - (O)</code>
         *             <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getRateClass()
         *            Rate Class} - (O)</code>
         *             <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getRateSource()
         *            Rate Source} - (O)</code>
         *             <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getRateType()
         *            Rate Type} - (O)</code>
         *             <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getResponsibleParty()
         *            Responsible Party} - (O)</code>
         *             <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getRoundingFactor()
         *            Rounding Factor} - (O)</code>
         *              <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getShipper()
         *            Shipper} - (O)</code>
         *              <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getShipperBillTo()
         *            Shipper bill to} - (O)</code>
         *              <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getUldCharge()
         *            UldCharge Code} - (O)</code>
         *            <ul>
         *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.
         *            constants.ULDChargeType
         *            Uld Charge Code</code>
         *            </ul><code> <li>{@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractRateAdminDto#getUldType()
         *            Uld Type} - (O)</code>
         *               <li><code>
         *            {@link com.unisys.trans.logistics.lms.framework.constants.
         *            WeightUOMType#getWeightUnit() Weight Unit</code>
         *            </ul>
         * <br>
         *            </ul>
         *                  <p>
         * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractAdminResponse
         *         ContractAdminResponse}</code>
         *         <ul>
         *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
         *         Response fields}</code><br>
         *         holds the CodeMessage <code>
         *         {@link com.unisys.trans.logistics.lms.rating.constants.
         *         MessageConstants#GLOBAL_TARIFF_RATES_ADMIN_CREATED
         *         GLOBAL_TARIFF_RATES_ADMIN_CREATED} </code> <br>
         *         <code>for successful create.</code> <li><code>
         *         {@link com.unisys.trans.logistics.lms.rating.dto.
         *         ContractAdminResponse#getContractAdminDtos()
         *         ContractAdminDtos}</code>
         *         </ul>
         * @throws LMSException
         *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
         *             contains the status code, human readable message, and message type.
         */
        ContractAdminResponse createContractTasks(
                    final ContractAdminPersistRequest pContractAdminPersistRequest)
                    throws LMSException;

        /**
         * Creates <code>tariff rate administration task </code> from the given inputs,after
         * validating all the input data.
         * <p>
         * <b>Related methods include:</b>
         * <li>
         * {@link com.unisys.trans.logistics.lms.rating.contract.GlobalRatesAdminService#
         * updateTariffRateTasks updateTariffRateTasks}
         * <p>
         * <b>Run Time Parameters:</b><br>
         * 
         * <pre>
         * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
         * ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
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
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#GLOBAL_TASKS_EXIST_CREATION_DENIED}</td>
         *            <td>The Global Tariff Rates Administration tasks exist, Create action 
         *            is not allowed.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#GLOBAL_DUPLICATE_TARIFF_TASKS_NOT_ALLOWED}</td>
         *            <td>Duplicate Global Tariff Rates Administration tasks are not allowed. </td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#GLOBAL_RATE_ADJUSTMENT_SHOULD_NOT_MORE_THAN_100}</td>
         *            <td>The Rate Adjustment must not be more than 100, if the Type of Rate 
         *            Adjustment is Percent Decrease.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#GLOBAL_OVER_PIVOT_RATE_ADJUSTMENT_SHOULD_NOT_MORE_THAN_100}</td>
         *            <td>The Over Pivot Rate Adjustment must not be more than 100, if the Type of 
         *            Over Pivot Rate Adjustment is Percent Decrease.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#CARRIER_CODE_DOES_NOT_EXIST}</td>
         *            <td>The Carrier Code does not exist in the system.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants
         *            .MessageConstants#CARRIER_CODE_MARKED_FOR_DELETION}</td>
         *            <td>The Carrier Code is marked for deletion.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#CURRENCY_CODE_DOES_NOT_EXIST}</td>
         *            <td>The Currency Code does not exist in the system.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#GLOBAL_CURRENCY_DOES_NOT_HAVE_ROUNDING_AND_DECIMAL}</td>
         *            <td>The Currency Code does not have Rounding Factor and/or Decimal Position.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#GLOBAL_CURRENCY_CODE_MARKED_FOR_DELETION}</td>
         *            <td>The Currency Code is marked for deletion.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS}</td>
         *            <td>TThe Rate Source does not exist in the system.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#RATE_TYPE_DOES_NOT_EXIST}</td>
         *            <td>The Rate Type does not exist in the system.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#RATE_TYPE_MARKED_FOE_DELETION}</td>
         *            <td>The Rate Type is marked for deletion.</tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#RATE_TYPE_NOT_ALLOWED_FOR_RATE_SOURCE}</td>
         *            <td>The Rate Type is not compatible with the Rate Source.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#RATE_CLASS_DOES_NOT_EXIST}</td>
         *            <td>The Rate Class does not exist in the system.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_IATA_RATE_TYPE}</td>
         *            <td>The Rate Class is not compatible with the IATA Rate Source.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATE_TYPE}</td>
         *            <td>The Rate Class is not compatible with the ATPCO Rate Source.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#COMMODITY_TYPE_I_OR_D}</td>
         *            <td>The Commodity Type must be I or D.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATE_TYPE}</td>
         *            <td>The Rate Class is not allowed for ATPCO rate type.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#COMMODITY_NOT_COMPATIBLE_WITH_RATE_SORCE}</td>
         *            <td>The Commodity Number is not compatible with the Rate Source.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#COMMODITY_CODE_DOES_NOT_EXIST}</td>
         *            <td>The Commodity Number does not exist in the system.</tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#COMMODITY_MARKED_FOR_DELETION}</td>
         *            <td>The Commodity Number is marked for deletion.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#ULD_TYPE_DOES_NOT_EXIST}</td>
         *            <td>The ULD Type does not exist in the system.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#ULD_TYPE_MARKED_DELETION}</td>
         *            <td>The ULD Type is marked for deletion.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#ULD_CHARGE_CODE_DOES_NOT_EXIST}</td>
         *            <td>The ULD Charge Code does not exist in the system.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#ULD_CHARGE_CODE_NOT_ALLOWED_FOR_ATPCO}</td>
         *            <td>The ULD Charge Code is not allowed for ATPCO rate source.</td>
         *            </tr>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#GLOBAL_MINIMUM_WEIGHT_DECIMAL_NOT_ALLOWED}</td>
         *            <td>Decimal position in the Minimum Weight is allowed only if the Rate Class 
         *            is N and the value is greater than 0 and less than 
         *             or equal to 1, or when the Rate Type value allows Bulk Over Pivot.</td></tr>
         *            </code>
         * </table>
         * <p>
         * 
         * @param pTariffRateAdminPersistRequest <code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminPersistRequest
         *            TariffRateAdminPersistRequest} </code><br>
         *            holds the request object that includes attributes to create a tariff rate admin task.<br>
         *            <ul>
         *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.
         *            TariffRateAdminDto TariffRateAdminDto}
         *            </code>
         *            <ul>
         *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.
         *            TariffRateAdminDto#setAction
         *            action} - (M)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto#setAllCarrier
         *            allCarrier} - (C)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto#setCarrier
         *            carrier} - (C)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto#setCommodityNumber
         *            commodityNumber}-(C)</code></li>
         *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#setCurrency
         *            currency} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setDestination
         *            destination} -(M)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setEffectiveDate
         *            effectiveDate} - (O)</code> <li> <code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setError
         *            error} - (M)</code> 
         *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#setExpirationDate
         *            expirationDate}-(O)</code>
         *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.
         *            DirectionType#setMinimumWeight
         *            minimumWeight} - (O)</code> </li>
         *            <li> <code> {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setOId
         *            oId} - (C)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto#setOrigin
         *            origin} - (M)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#
         *            setOverPivotRateAdjustment
         *            overPivotRateAdjustment} -(O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#setOverPivotRateAdjustmentType
         *            overPivotRateAdjustmentType} - (O)</code> <li> <code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#setRateAdjustment
         *            rateAdjustment} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#setRateAdjustmentType
         *            rateAdjustmentType}- (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#setRateClass
         *            rateClass} - (O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#setRateSource
         *            rateSource} - (M)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#setRateType
         *            rateType} -(O)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#setRateTypePriority
         *            rateTypePriority} - (C)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto
         *            .AddOnRateEntryDto#setRetainEffectiveDate
         *            retainEffectiveDate} - (C)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#setRetainExpirationDate
         *            retainExpirationDate}- (C)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#setSelectFutureDate
         *            selectFutureDate} - (C)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#setSelectionDate
         *            selectionDate} - (C)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.rating.dto.
         *            AddOnRateEntryDto#setTariffActionType
         *            tariffActionType}-(M)</code>
         *            <li><code>
         *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setUldCharge
         *            uldCharge} - (C)</code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setUldType
         *            uldType} - (C) </code> <li><code>
         *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setWeightUnit
         *            weightUnit} - (O)</code> 
         *            </ul>
         *            </ul>
         *            <p>
         * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.
         * TariffRateAdminResponse TariffRateAdminResponse}
         *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.
         *         AbstractResponse Response fields}
         *         <li> {@link com.unisys.trans.logistics.lms.rating.dto.
         *         TariffRateAdminResponse#getTariffRateAdminDtos
         *         tariffRateAdminDtos} </ul> </code>
         *         <p>
         * @throws LMSException If the tariff rate task create operation fails,
         * the above mentioned error codes are
         *             returned. Each Code Message contains the status code,human readable message and
         *              message
         *             type.
         */
        TariffRateAdminResponse createTariffRateTasks(
                final TariffRateAdminPersistRequest pTariffRateAdminPersistRequest)
                throws LMSException;

        /**
         * Deletes all <code>Tariff Rate Administration Tasks</code> that exist in the system.
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
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants #NO_GLOBAL_TARIFF_TASKS_DELETION_NOT_ALLOWED}</td>
         *            <td>The Global Tariff Rates Administration tasks do not exist, 
         *            Delete action is not allowed.</td>
         *            </tr>
         *            </code>
         * </table>
         * <p>
         * 
         * @param pTariffRateAdminRequest
         *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminRequest
         *            TariffRateAdminRequest}</code><br>
         *            includes the attributes to delete all <code>Tariff Rate Administration Tasks</code>.
         *            <p>
         * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminResponse
         *         TariffRateAdminResponse}</code>
         *         <ul>
         *         TariffRateAdminResponse <li><code>
         *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
         *         Response fields}</code><br>
         *         holds the CodeMessage <code>
         *         {@link com.unisys.trans.logistics.lms.rating.constants.
         *         MessageConstants #GLOBAL_TARIFF_TASKS_DELETED
         *         GLOBAL_TARIFF_TASKS_DELETED} </code> for successful delete. <li><code>
         *         {@link com.unisys.trans.logistics.lms.rating.dto.
         *         TariffRateAdminResponse #getTariffRateAdminDtos()
         *         TariffRateAdminDto} - (1:*)</code>
         *         <ul>
         *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminDto
         *         TariffRateAdminDto}</code>
         *         </ul>
         *         </ul>
         * @throws LMSException
         *             If the tariff rate administration tasks delete operation 
         *             fails, the above mentioned error code is returned.
         *             Each CodeMessage
         *             contains the status code, human readable message, and message type.
         */
        TariffRateAdminResponse deleteAllTariffRateTasks(
                final TariffRateAdminRequest pTariffRateAdminRequest)
                throws LMSException;

        /**
         * Deletes the Contrcat Task.
         * <p>
         * This functions deletes the Contract Admin Task for an contract and participant number.
         * <p>
         * <b> Related methods include:</b><br>
         * {@link com.unisys.trans.logistics.lms.rating.contract.GlobalRatesAdminService#
         * retrieveContractTasks(ContractAdminFindRequest)
         * findRatingSecurity}<br>
         * <p>
         * To delete the ContractAdmin user must provide following input:<br>
         * <li>OId.<br>
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
         * @param pContractAdminDeleteRequest
         *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractAdminDeleteRequest
         *            ContractAdminDeleteRequest}</code><br>
         *            includes the attributes to find a <code>ContractAdminTask</code>.
         *            <ul>
         *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractAdminDto#getOId
         *            OId}-(M)</code>
         *            </ul>
         *            <p>
         * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractAdminResponse
         *         ContractAdminResponse}</code>
         *         <ul>
         *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
         *         Response fields}</code><br>
         *         holds the CodeMessage <code>
         *         {@link com.unisys.trans.logistics.lms.rating.constants.
         *         MessageConstants#GLOBAL_CONTRACT_ADMIN_DELETED_SUCCESSFULLY
         *         GLOBAL_CONTRACT_ADMIN_DELETED_SUCCESSFULLY} </code> <br>
         *         <code>for successful delete.</code> <li><code>
         *         {@link com.unisys.trans.logistics.lms.rating.dto.ContractAdminResponse#getContractAdminDtos()
         *         ContractAdminDtos}</code>
         *         <ul>
         *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractRateAdminDto
         *         ContractRateAdminDto}- (1:*)</code>
         *         </ul>
         *         </ul>
         * @throws LMSException
         *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
         *             contains the status code, human readable message, and message type.
         */
        ContractAdminResponse deleteContractTasks(
                    final ContractAdminDeleteRequest pContractAdminDeleteRequest)
                    throws LMSException;
    
        /**
         * Retrieves all Contract Tasks currently
         * defined in the system.<br>
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
         * <p>
         * 
         * @param pContractAdminFindRequest
         *            <code>pContractAdminFindRequest</code> is a dummy
         *            parameter ,given to satisfy the LMSNG convention.
         * 
         * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractAdminResponse
         *         ContractAdminResponse} </code>
         *         <ul>
         *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
         *         Response fields} </code> <li><code>
         *         {@link com.unisys.trans.logistics.lms.rating.dto.ContractAdminDto ContractAdminDto}- (0:*)
         *         </code><br>
         *         </ul>
         *         <p>
         * @throws LMSException
         *             If the <code>Contract Task</code> does not exist
         *             the above mentioned error codes are returned. Each <code>CodeMessage</code> contains the
         *             status code, human
         *             readable message and message type.
         */
        ContractAdminResponse retrieveAllContractTasks(final ContractAdminFindRequest
        		pContractAdminFindRequest)
                    throws LMSException;
        
        /**
         * Retrieves all contract administration tasks that exist in the system and
         *  validates retrieved contract tasks.
         * <p>
         * 
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
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#NO_GLOBAL_CONTRACT_TASK_EXISTS}</td>
         *            <td>No Global Tariff Rates Administration tasks exist in the system.</td>
         *            </tr>
         *            
         *            </code>
         * </table>
         * <p>
         * 
         * @param pGlobalRatePFMRequest
         *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.GlobalRatePFMRequest
         *            GlobalRatePFMRequest}</code><br>
         *            includes the attributes to find all the <code>contract administration tasks</code>.
         *            <p>
         * 
         * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.GlobalRatePFMResponse
         *         GlobalRatePFMResponse} <ul> <li>
         *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
         *         {@link com.unisys.trans.logistics.lms.framework.dto.GlobalRatePFMResponse#getReportString
         *         Report String} <li>
         *         {@link com.unisys.trans.logistics.lms.rating.dto.GlobalRatePFMResponse#getTheTasks
         *         theTasks} - (1:*) </ul> </code>
         *         <p>
         * 
         * @throws LMSException
         *             If the find operation fails, the above mentioned error codes are returned. 
         *             Each CodeMessage
         *             contains the status code, human readable message, and message type.
         */
    GlobalRatePFMResponse retrieveAllValidatedContractTasks(
                    GlobalRatePFMRequest pGlobalRatePFMRequest)
                    throws LMSException;
    
    /**
     * Deletes all contract administration tasks that exist in the system .
     * <p>
     * 
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
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#NO_GLOBAL_CONTRACT_TASK_EXISTS}</td>
     *            <td>No Global Tariff Rates Administration tasks exist in the system.</td>
     *            </tr>
     *            
     *            </code>
     * </table>
     * <p>
     * 
     * @param pGlobalRatePFMRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.GlobalRatePFMRequest
     *            GlobalRatePFMRequest}</code><br>
     *            includes the attributes to delete all the <code>contract administration tasks</code>.
     *            <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.GlobalRatePFMResponse
     *         GlobalRatePFMResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <p>
     * 
     * @throws LMSException
     *             If the find operation fails, the above mentioned error codes are returned. 
     *             Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
GlobalRatePFMResponse deleteAllContractTasks(
                GlobalRatePFMRequest pGlobalRatePFMRequest)
                throws LMSException;

        /**
         * Retrieves all the tariff rates administration tasks that exist in the system.
         * <p>
         * 
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
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants
         *            #NO_GLOBAL_TARIFF_TASKS_EXIST}</td>
         *            <td>No Global Tariff Rates Administration tasks exist in the system.</td>
         *            </tr>
         *            
         *            </code>
         * </table>
         * <p>
         * 
         * @param pTariffRateAdminRequest
         *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminRequest
         *            TariffRateAdminRequest}</code><br>
         *            includes the attributes to find all the <code>tariff rate administration tasks</code>.
         *            <p>
         * 
         * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminResponse
         *         TariffRateAdminResponse} <ul> <li>
         *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
         *         {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminResponse#
         *         getTariffRateAdminDtos
         *         tariffRateAdminDtos} - (1:*) </ul> </code>
         *         <p>
         * 
         * @throws LMSException
         *             If the find operation fails, the above mentioned error codes are returned.
         *              Each CodeMessage
         *             contains the status code, human readable message, and message type.
         */
        TariffRateAdminResponse retrieveAllTariffRateTasks(
                final TariffRateAdminRequest pTariffRateAdminRequest)
                throws LMSException;
        
        /**
         * Retrieves all the tariff rates administration tasks that exist in the system and 
         * validates retrieved tariff rate tasks.
         * <p>
         * 
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
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#NO_GLOBAL_TARIFF_TASKS_EXIST}</td>
         *            <td>No Global Tariff Rates Administration tasks exist in the system.</td>
         *            </tr>
         *            
         *            </code>
         * </table>
         * <p>
         * 
         * @param pGlobalRatePFMRequest
         *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.GlobalRatePFMRequest
         *            GlobalRatePFMRequest}</code><br>
         *            includes the attributes to find all the <code>tariff rate administration tasks</code>.
         *            <p>
         * 
         * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.GlobalRatePFMResponse
         *         GlobalRatePFMResponse} <ul> <li>
         *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
         *         {@link com.unisys.trans.logistics.lms.framework.dto.GlobalRatePFMResponse#getReportString
         *         Report String} <li>
         *         {@link com.unisys.trans.logistics.lms.rating.dto.GlobalRatePFMResponse#getTheTasks
         *         theTasks} - (1:*) </ul> </code>
         *         <p>
         * 
         * @throws LMSException
         *             If the find operation fails, the above mentioned error codes are returned. 
         *             Each CodeMessage
         *             contains the status code, human readable message, and message type.
         */
        GlobalRatePFMResponse retrieveAllValidatedTariffRateTasks(
                final GlobalRatePFMRequest pGlobalRatePFMRequest)
                throws LMSException;
    
        /**
         * Retrieves Contract Tasks defined in the system.<br>
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
         * <p>
         * <b>Errors: </b><br>
         * <b>The following Error Codes are returned:</b><br>
         * <table border="0" cellspacing="0" cellpadding="5">
         * <br>
         * <code>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#GLOBAL_CONTRACT_INVALID_PARTICIPANT}</td>
         *            <td>No Contracts exist for the input Participant Account Number.</td>
         *            </tr>
         *            </code><br>
         *            <code>
         *            <tr>
         *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
         *            MessageConstants#GLOBAL_CONTRACT_THE_PARTICIPANT_ACCOUNT_NO_DOES_NOT_BELONG_TO_CONTRACT_NUMBER}</td>
         *            <td>The Participant Account Number Does not belong to the input Contract Number.</td>
         *            </tr>
         *            </code>
         * @param pContractAdminFindRequest
         *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.
         *            ContractAdminFindRequest
         *            ContractAdminFindRequest}</code><br>
         *            includes the attributes to retrieve a <code>ContractAdminTask</code>.
         * 
         * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractAdminResponse
         *         ContractAdminResponse} </code>
         *         <ul>
         *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
         *         Response fields} </code> <li><code>
         *         {@link com.unisys.trans.logistics.lms.rating.dto.ContractAdminDto ContractAdminDto}- (0:*)
         *         </code><br>
         *         </ul>
         *         <p>
         * @throws LMSException
         *             If the <code>Contract Task</code> does not exist
         *             the above mentioned error codes are returned. Each <code>CodeMessage</code> contains the
         *             status code, human
         *             readable message and message type.
         */
        
        ContractAdminResponse retrieveContractTasks(
                final ContractAdminFindRequest pContractAdminFindRequest)
                throws LMSException;
        /**
             * Updates the <code>Contract Task</code>.
             * <p>
             * Updates the Contract Task for given Participant and contract number after
             *  validating all datas which was already retrieved and modified.
             * <p>
             * <b> Related methods include:</b><br>
             * {@link com.unisys.trans.logistics.lms.rating.contract.
             * GlobalRatesAdminService#retrieveContractTasks(ContractAdminFindRequest)
             * retrieveContractTasks}<br>
             * <p>
             * To update the Contract Task user can provide following input:<br>
             * <li>agent<br>
             * <li>allCommodity<br>
             * <li>allContractDestination<br>
             * <li>allContractOrigin<br>
             * <li>allMinimumWeight<br>
             * <li>allUldType<br>
             * <li>anyMinimumWeight<br>
             * <li>anyPivotWeight<br>
             * <li>biDirectional<br>
             * <li>carrierCode1<br>
             * <li>carrierCode2<br>
             * <li>carrierCode3<br>
             * <li>carrierCode4<br>
             * <li>classRatingId<br>
             * <li>commodityNumber<br>
             * <li>consignee<br>
             * <li>consigneeBillTo<br>
             * <li>contractDefinition<br>
             * <li>contractDestination<br>
             * <li>contractOrigin<br>
             * <li>currency<br>
             * <li>forwarder<br>
             * <li>minimumWeight<br>
             * <li>oId<br>
             * <li>oritoDesPayCode<br>
             * <li>overPivotRateAdjustment<br>
             * <li>overPivotRateAdjustmentType<br>
             * <li>participantRoleType<br>
             * <li>pivotWeight<br>
             * <li>rateAdjustment<br>
             * <li>rateAdjustmentType<br>
             * <li>rateClass<br>
             * <li>rateSource<br>
             * <li>rateType<br>
             * <li>roundingFactor<br>
             * <li>shipper<br>
             * <li>shipperBillTo<br>
             * <li>oid<br>
             * <li>uldCharge<br>
             * <li>uldType<br>
             * <li>weightUnit<br>
             * <li>responsibleParty<br>
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
             * MessageConstants#GLOBAL_CONTRACT_ALREADY_EXIST
                      GLOBAL_CONTRACT_ALREADY_EXIST}</code></td>
             * <td align="left">Global Contract Task Already Exist</td>
             * <tr>
             * <td align="left">
             * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
             * MessageConstants#GLOBAL_CONTRACT_INVALID_PARTICIPANT
                      GLOBAL_CONTRACT_INVALID_PARTICIPANT}</code></td>
             * <td align="left">Contract does not exist for the given participant account no</td>
             * <tr>
             * <td align="left">
             * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
             * MessageConstants#GLOBAL_CONTRACT_THE_PARTICIPANT_ACCOUNT_NO_DOES_NOT_BELONG_TO_CONTRACT_NUMBER
                      GLOBAL_CONTRACT_THE_PARTICIPANT_ACCOUNT_NO_DOES_NOT_BELONG_TO_CONTRACT_NUMBER}</code></td>
             * <td align="left">The given Participant Number does not belong to the contract Number</td>
             * <tr>
             * <td align="left">
             * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
             * MessageConstants#CONTRACT_DOES_NOT_EXIST
                      CONTRACT_DOES_NOT_EXIST}</code></td>
             * <td align="left">The given contract Number does not exist in the system</td>
             * <tr>
             * <td align="left">
             * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
             * MessageConstants#CONTRACT_NOT_FOUND
                      CONTRACT_NOT_FOUND}</code></td>
             * <td align="left">The given contract Number not found</td>
             * <tr>
             * <td align="left">
             * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
             * MessageConstants#CONTRACT_USER_NOT_AUTHORIZED
                      CONTRACT_USER_NOT_AUTHORIZED}</code></td>
             * <td align="left">The user not authorised for the contract routing</td>
             * <tr>
             * <td align="left">
             * <code>{@link com.unisys.trans.logistics.lms.rating.constants.
             * MessageConstants#CONTRACT_IS_DELETED
                      CONTRACT_IS_DELETED}</code></td>
             * <td align="left">The given contract number is deleted</td>
             * </table>
             * <p>
             * 
             * @param pContractAdminPersistRequest
             *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractAdminPersistRequest
             *            ContractAdminPersistRequest}</code><br>
             *            includes the attributes to create a <code>ContractAdmin </code>.
             *            <ul>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractAdminDto#getContractNumber()
             *            ContractNumber} - (C)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractAdminDto#getParticipantAccountNumber()
             *            ParticipantAccountNumber} - (C)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.framework.dto.
             *            DateRangeDto#getEffectiveDate()
             *            Effective Date} -(M)</code><li><code>
             *            {@link com.unisys.trans.logistics.lms.framework.dto.
             *            DateRangeDto#getExpirationDate()
             *            Expiration Date} -(O)</code><li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractAdminDto#getSelectionDate()
             *            Selection Date} - (O)</code><li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.C
             *            ontractAdminDto#getContactDto()
             *            Participant Contact Details} - (C)</code>  <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractAdminDto#getOId()
             *            Oid} - (C)</code>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractAdminDto#getContractRateAdminDto()
             *            ContractRateAdminDto} - (C)</code>
             *            <ul>
             *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getAgent()
             *            Agent} - (O)</code><li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getAllCommodity()
             *            All Commodity} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getAllContractDestination()
             *            AA Destination} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getAllContractOrigin()
             *            All Origin} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getAllMinimumWeight()
             *            All Minimum weight} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getAllUldType()
             *            Uld Type} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getAnyMinimumWeight()
             *            Any Minimum weight} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getAnyPivotWeight()
             *            Any Pivot Minimum weight} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.C
             *            ontractRateAdminDto#getBiDirectional()
             *            Bi- Directional Indicator} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getCarrierCode1()
             *            Carrier code1} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getCarrierCode2()
             *            Carrier code2} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getCarrierCode3()
             *            Carrier code3} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getCarrierCode4()
             *            Carrier code4} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getClassRatingId()
             *            Class Rating Id} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getCommodityNumber()
             *            Commodity Number} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getConsignee()
             *            Consignee Indicator} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getConsigneeBillTo()
             *            Consignee Bill to Indicator} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getContractDefinition()
             *            Contract Definition} - (M)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getContractDestination()
             *            Destination} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getContractOrigin()
             *            Origin} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getCurrency()
             *            Currency code} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getDestoOriPayCode()
             *            Destination to Origin Pay Code Type} - (O)</code>
             *            <ul>
             *            <li><code>{@link com.unisys.trans.logistics.lms.rating.
             *            dto.constants.PayCodeType
             *            PayCodeType}-{O} </code>
             *            <ul>
             *            <li><code>{@link com.unisys.trans.logistics.lms.rating.
             *            dto.constants.PayCodeType#COLLECT
             *            Collect}-{O} </code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            constants.PayCodeType#PREPAID PREPAID}-{O}
             *            </code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            constants.PayCodeType#EITHER EITHER}-{O}
             *            </code>
             *            </ul>
             *            </ul>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getForwarder()
             *            Forwarder} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getMinimumWeight()
             *            Minimum Weight} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getOritoDesPayCode()
             *            Origint to Destination Pay Code Type} - (O)</code>
             *            <ul>
             *            <li><code>{@link com.unisys.trans.logistics.lms.
             *            rating.dto.constants.PayCodeType
             *            PayCodeType}-{O} </code>
             *            <ul>
             *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.
             *            constants.PayCodeType#COLLECT
             *            Collect}-{O} </code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            constants.PayCodeType#PREPAID PREPAID}-{O}
             *            </code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            constants.PayCodeType#EITHER EITHER}-{O}
             *            </code>
             *            </ul>
             *            </ul>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getOverPivotRateAdjustment()
             *            Over Pivot Rate Adjustment} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getOverPivotRateAdjustmentType()
             *            Over Pivot Rate Adjustment Type} - (O)</code>
             *            <ul>
             *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.
             *            constants.RateAdjustmentType
             *            Rate Adjustment Type}-{O} </code>
             *            <ul>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.constants.
             *            RateAdjustmentType#AMOUNT_DECREASE
             *            Amount Decrease}</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.constants.
             *            RateAdjustmentType#AMOUNT_INCREASE
             *            Amount Increase}</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.constants.
             *            RateAdjustmentType#PERCENT_DECREASE
             *            Percent Decrease}</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.constants.
             *            RateAdjustmentType#PERCENT_INCREASE
             *            Percent increase}</code>
             *            </ul>
             *            </ul>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getParticipantRoleType()
             *            Participant Role Type} - (O)</code>
             *            <ul>
             *            <li><code> {@link com.unisys.trans.logistics.lms.parts.dto.
             *            constants.ParticipantRoleType
             *            ParticipantRoleType</code>
             *            <ul>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#AGENT 
             *            Agent}
             *            </code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#BANK Bank}
             *            </code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#BILL_TO_CONSIGNEE
             *            Bill to consignee}</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#BILL_TO_SHIPPER
             *            Bill to shipper}</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#BROKER Broker}
             *            </code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#CUSTOMS_LOCATION Customs Location}
             *            </code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#CONSIGNEE Consignee}
             *            </code>
             *             <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants
             *            .ParticipantRoleType#DELIVERY_OPERATOR Delivery Operator}
             *            </code>
             *             <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#FORWARDER Consignee}
             *            </code>
             *             <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#MANUFACTURER Manufacturer}
             *            </code>
             *             <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#NOTIFY Notify}
             *            </code>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#PICK_UP_LOCATION Pick Up Location}
             *            </code>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#PICK_UP_OPERATOR Pick Up Operator}
             *            </code>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#SHIPPER Shipper}
             *            </code>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#SUBCONTRACTOR1 Sub Contractor1}
             *            </code>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#SUBCONTRACTOR2 Sub Contractor2}
             *            </code>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#SUBCONTRACTOR3 Sub Contractor3}
             *            </code>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#SURFACE_DESTINATION Surface Destination}
             *            </code>
             *             <li><code>
             *            {@link com.unisys.trans.logistics.lms.parts.dto.constants.
             *            ParticipantRoleType#SURFACE_ORIGIN Surface Origin}
             *            </code>
             *            </ul>
             *            </ul>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getPivotWeight()
             *            Pivot Weight} - (O)</code>
             *             <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getRateAdjustment()
             *            Rate Adjustment} - (O)</code>
             *             <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getRateAdjustmentType()
             *            Rate Adjustment Type} - (O)</code>
             *             <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getRateClass()
             *            Rate Class} - (O)</code>
             *             <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getRateSource()
             *            Rate Source} - (O)</code>
             *             <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getRateType()
             *            Rate Type} - (O)</code>
             *             <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getResponsibleParty()
             *            Responsible Party} - (O)</code>
             *             <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getRoundingFactor()
             *            Rounding Factor} - (O)</code>
             *              <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getShipper()
             *            Shipper} - (O)</code>
             *              <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getShipperBillTo()
             *            Shipper bill to} - (O)</code>
             *              <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            ContractRateAdminDto#getUldCharge()
             *            UldCharge Code} - (O)</code>
             *            <ul>
             *            <li><code> {@link com.unisys.trans.logistics.lms.
             *            rating.dto.constants.ULDChargeType
             *            Uld Charge Code</code>
             *            </ul><code> <li>{@link com.unisys.trans.logistics.
             *            lms.rating.dto.ContractRateAdminDto#getUldType()
             *            Uld Type} - (O)</code>
             *               <li><code>
             *            {@link com.unisys.trans.logistics.lms.framework.
             *            constants.WeightUOMType#getWeightUnit() Weight Unit</code>
             *             <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.ContractRateAdminDto#getOId()
             *            OID} - (O)</code>
             *            </ul>
             * <br>
             *            </ul>
             *            </ul>
             *            <p>
             * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractAdminResponse
             *         ContractAdminResponse}</code>
             *         <ul>
             *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
             *         Response fields}</code><br>
             *         holds the CodeMessage <code>
             *         {@link com.unisys.trans.logistics.lms.rating.constants.
             *         MessageConstants#GLOBAL_TARIFF_RATES_ADMIN_CREATED
             *         GLOBAL_TARIFF_RATES_ADMIN_CREATED} </code> <br>
             *         <code>for successful create.</code> <li><code>
             *         {@link com.unisys.trans.logistics.lms.rating.dto.ContractAdminResponse#getContractAdminDtos()
             *         ContractAdminDtos}</code>
             *         </ul>
             * @throws LMSException
             *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
             *             contains the status code, human readable message, and message type.
             */
            ContractAdminResponse updateContractTasks(
                        final ContractAdminPersistRequest pContractAdminPersistRequest)
                        throws LMSException;
            
            /**
             * Updates <code>tariff rate administration task </code> based on the given inputs,after
             * validating all the input data.
             * <p>
             * <b>Related methods include:</b>
             * <li>
             * {@link com.unisys.trans.logistics.lms.rating.contract.
             * GlobalRatesAdminService#createTariffRateTasks createTariffRateTasks}
             * <p>
             * <b>Run Time Parameters:</b><br>
             * 
             * <pre>
             * <li>{@link com.unisys.trans.logistics.lms.framework.constants.
             * ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
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
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#NO_GLOBAL_TARIFF_TASKS_UPDATION_NOT_ALLOWED}</td>
             *            <td>The Global Tariff Rates Administration tasks do not exist, 
             *            Update action is not allowed.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants
             *            .MessageConstants#GLOBAL_DUPLICATE_TARIFF_TASKS_NOT_ALLOWED}</td>
             *            <td>Duplicate Global Tariff Rates Administration tasks are not allowed. </td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#GLOBAL_RATE_ADJUSTMENT_SHOULD_NOT_MORE_THAN_100}</td>
             *            <td>The Rate Adjustment must not be more than 100, if the Type of 
             *            Rate Adjustment is Percent Decrease.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#GLOBAL_OVER_PIVOT_RATE_ADJUSTMENT_SHOULD_NOT_MORE_THAN_100}</td>
             *            <td>The Over Pivot Rate Adjustment must not be more than 100,
             *             if the Type of Over Pivot Rate Adjustment is Percent Decrease.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#CARRIER_CODE_DOES_NOT_EXIST}</td>
             *            <td>The Carrier Code does not exist in the system.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#CARRIER_CODE_MARKED_FOR_DELETION}</td>
             *            <td>The Carrier Code is marked for deletion.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#CURRENCY_CODE_DOES_NOT_EXIST}</td>
             *            <td>The Currency Code does not exist in the system.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#GLOBAL_CURRENCY_DOES_NOT_HAVE_ROUNDING_AND_DECIMAL}</td>
             *            <td>The Currency Code does not have Rounding Factor and/or Decimal Position.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#GLOBAL_CURRENCY_CODE_MARKED_FOR_DELETION}</td>
             *            <td>The Currency Code is marked for deletion.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#RATE_SOURCE_DOES_NOT_EXISTS}</td>
             *            <td>TThe Rate Source does not exist in the system.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#RATE_TYPE_DOES_NOT_EXIST}</td>
             *            <td>The Rate Type does not exist in the system.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#RATE_TYPE_MARKED_FOE_DELETION}</td>
             *            <td>The Rate Type is marked for deletion.</tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#RATE_TYPE_NOT_ALLOWED_FOR_RATE_SOURCE}</td>
             *            <td>The Rate Type is not compatible with the Rate Source.</td>
             *            </tr>
             *            <tr>
             *            
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#RATE_CLASS_DOES_NOT_EXIST}</td>
             *            <td>The Rate Class does not exist in the system.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_IATA_RATE_TYPE}</td>
             *            <td>The Rate Class is not compatible with the IATA Rate Source.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATE_TYPE}</td>
             *            <td>The Rate Class is not compatible with the ATPCO Rate Source.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#COMMODITY_TYPE_I_OR_D}</td>
             *            <td>The Commodity Type must be I or D.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#RATE_CLASS_NOT_ALLOWED_FOR_ATPCO_RATE_TYPE}</td>
             *            <td>The Rate Class is not allowed for ATPCO rate type.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#COMMODITY_NOT_COMPATIBLE_WITH_RATE_SORCE}</td>
             *            <td>The Commodity Number is not compatible with the Rate Source.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants
             *            .MessageConstants#COMMODITY_CODE_DOES_NOT_EXIST}</td>
             *            <td>The Commodity Number does not exist in the system.</tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#COMMODITY_MARKED_FOR_DELETION}</td>
             *            <td>The Commodity Number is marked for deletion.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants
             *            .MessageConstants#ULD_TYPE_DOES_NOT_EXIST}</td>
             *            <td>The ULD Type does not exist in the system.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants
             *            .MessageConstants#ULD_TYPE_MARKED_DELETION}</td>
             *            <td>The ULD Type is marked for deletion.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#ULD_CHARGE_CODE_DOES_NOT_EXIST}</td>
             *            <td>The ULD Charge Code does not exist in the system.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#ULD_CHARGE_CODE_NOT_ALLOWED_FOR_ATPCO}</td>
             *            <td>The ULD Charge Code is not allowed for ATPCO rate source.</td>
             *            </tr>
             *            <tr>
             *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
             *            MessageConstants#GLOBAL_MINIMUM_WEIGHT_DECIMAL_NOT_ALLOWED}</td>
             *            <td>Decimal position in the Minimum Weight is allowed only 
             *            if the Rate Class is N and the value is greater than 0 and less than 
             *             or equal to 1, or when the Rate Type value allows Bulk Over Pivot.</td></tr>
             *            </code>
             * </table>
             * <p>
             * 
             * @param pTariffRateAdminPersistRequest <code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminPersistRequest
             *            TariffRateAdminPersistRequest} </code><br>
             *            holds the request object that includes attributes to update a 
             *            tariff rate admin task.<br>
             *            <ul>
             *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.
             *            TariffRateAdminDto TariffRateAdminDto}
             *            </code>
             *            <ul>
             *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.
             *            TariffRateAdminDto#setAction
             *            action} - (M)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateDto#setAllCarrier
             *            allCarrier} - (C)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateDto#setCarrier
             *            carrier} - (C)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateDto#setCommodityNumber
             *            commodityNumber}-(C)</code></li>
             *            <li><code> {@link com.unisys.trans.logistics.lms.
             *            rating.dto.AddOnRateEntryDto#setCurrency
             *            currency} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setDestination
             *            destination} -(M)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setEffectiveDate
             *            effectiveDate} - (O)</code> <li> <code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setError
             *            error} - (M)</code> 
             *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setExpirationDate
             *            expirationDate}-(O)</code>
             *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.
             *            DirectionType#setMinimumWeight
             *            minimumWeight} - (O)</code> </li>
             *            <li> <code> {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setOId
             *            oId} - (M)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setOrigin
             *            origin} - (M)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setOverPivotRateAdjustment
             *            overPivotRateAdjustment} -(O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setOverPivotRateAdjustmentType
             *            overPivotRateAdjustmentType} - (O)</code> <li> <code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setRateAdjustment
             *            rateAdjustment} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setRateAdjustmentType
             *            rateAdjustmentType}- (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setRateClass
             *            rateClass} - (O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setRateSource
             *            rateSource} - (M)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setRateType
             *            rateType} -(O)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setRateTypePriority
             *            rateTypePriority} - (C)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setRetainEffectiveDate
             *            retainEffectiveDate} - (C)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setRetainExpirationDate
             *            retainExpirationDate}- (C)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setSelectFutureDate
             *            selectFutureDate} - (C)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setSelectionDate
             *            selectionDate} - (C)</code> <li><code>
             *            
             *            
             *            {@link com.unisys.trans.logistics.lms.rating.dto.
             *            AddOnRateEntryDto#setTariffActionType
             *            tariffActionType}-(M)</code>
             *            <li><code>
             *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setUldCharge
             *            uldCharge} - (C)</code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setUldType
             *            uldType} - (C) </code> <li><code>
             *            {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto#setWeightUnit
             *            weightUnit} - (O)</code> 
             *            </ul>
             *            </ul>
             *            <p>
             * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminResponse
             *  TariffRateAdminResponse}
             *         <ul> <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
             *          Response fields}
             *         <li> {@link com.unisys.trans.logistics.lms.rating.dto.
             *         TariffRateAdminResponse#getTariffRateAdminDtos
             *         tariffRateAdminDtos} </ul> </code>
             *         <p>
             * @throws LMSException If the tariff rate task update operation fails,
             * the above mentioned error codes are
             *             returned. Each Code Message contains the status code,human
             *              readable message and message
             *             type.
             */
            TariffRateAdminResponse updateTariffRateTasks(
                    final TariffRateAdminPersistRequest pTariffRateAdminPersistRequest)
                    throws LMSException;

}
