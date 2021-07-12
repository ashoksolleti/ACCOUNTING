/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.contract;

import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantAccNumValidatorRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantAccNumValidatorResponse;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantContactDeleteRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantContactEcspcsFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantContactFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantContactPersistRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantContactResponse;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantMultipleFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantPersistRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantReactivateRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantReportFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantReportResponse;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantSuggestiveSearchRequest;
import com.unisys.trans.logistics.lms.parts.dto.SuggestiveRequest;
import com.unisys.trans.logistics.lms.parts.dto.SuggestiveResponse;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantRoleType;
import com.unisys.trans.logistics.lms.utils.dto.TTYAddressProfileParticipantDto;

/**
 * Interface of the services that are implemented by the Business services.
 * <p>
 * <code>ParticipantService</code> provides create, update, find, and delete services for maintaining
 * participant information.<br>
 * This performs the following functions.<br>
 * <ul>
 * <li>Creates the participant.
 * <li>Deactivates the participant.
 * <li>Finds the participant.
 * <li>Finds the AWB participants.
 * <li>Updates the participant.
 * <li>Reactivates the participant.
 * <li>Validate the participants.
 * </ul>
 * Participants are classified into two basic types:
 * <ul>
 * <li><b>Recurring participants</b><br>
 * Recurring participants are permanent participants in the system. They comprise of regular customers of the
 * carrier.<br>
 * <br>
 * <li><b>One-time participants</b><br>
 * One-time participants are temporary participants in the system. They are usually related to a specific
 * shipment and not regular customers of the carrier.<br>
 * </ul>
 * <br>
 * Participant can be classified as follows based upon their usage:<br>
 * <ul>
 * <li><b>Master air way bill recurring participants</b><br>
 * Recurring participant that can be retrieved from master air way bills, allotments and as participant other
 * than a shipper and consignee on a house air way bill.
 * <li><b>Master air way bill one-time participant</b><br>
 * One-time participant that can be retrieved from master air way bills, allotments and as participant other
 * than a shipper and consignee on a house air way bill.
 * <li><b>House air way bill recurring participants</b><br>
 * Recurring participant that can be retrieved from house air way bills.
 * <li><b>House air way bill one-time participants</b><br>
 * One-time participant that can be retrieved from house air way bills.
 * <li><b>Master and House air way bill recurring participants</b><br>
 * Recurring participant that can be retrieved from master air way bill, house air waybill and allotments as
 * any participant type.<br>
 * <br>
 * </ul>
 * Participant having freight attributes only is referred as freight participant.<br>
 * Participant having ULD attributes is referred as ULD participant. ULD participants are customers with which
 * the customer exchanges ULD. This type of participant can only be a recurring participant and cannot exist
 * as one-time participant. Other parties like forwarders and cargo agents with whom the host/handled carrier
 * can exchange ULD.<br>
 * <br>
 * Customers can be set-up in either of two categories:<br>
 * <ul>
 * <li>Members of the IATA Multilateral ULD Agreement.<br>
 * <li>Non-members of the IATA Multilateral ULD Agreement.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest ParticipantDeleteRequest
 * @see com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest ParticipantFindRequest
 * @see com.unisys.trans.logistics.lms.parts.dto.ParticipantPersistRequest ParticipantPersistRequest
 * @see com.unisys.trans.logistics.lms.parts.dto.ParticipantReactivateRequest ParticipantReactivateRequest
 * @see com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse
 */

public interface ParticipantService {

    /**
     * Creates the participant information.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#updateParticipant
     * updateParticipant}<br>
     * <br>
     * To create the participant user must provide following input:<br>
     * <li>General participant information.<br>
     * example- Name,Station,Address,City,State,Postal Code,Country,Phone,Aliases,Account, ULD or Freight
     * attribute indicator etc<br>
     * <br>
     * <li>Freight participant information.<br>
     * example- Notify,Method,IATA Account Number,Frequent Flyer Number,Broker Account Number,Broker Station,
     * Payment Method,Credit Rate,Available,Consignee Remarks,Participant Remarks etc.<br>
     * <br>
     * <li>ULD participant information.<br>
     * example- Telex,SITA Telex,ULD Participant Type,Blacklisted etc.<br>
     * <br>
     * User must provide general participant information and at least one of freight or ULD participant
     * information input. User has the choice to provide all the three type of attributes too.<br>
     * If accounting remarks is present, then participant information is queued to participant Central
     * Authority Station for authorization. Participant information is then sent to external interfaces like
     * Customer Management Reporting.<br>
     * <p>
     * <b>Run time Parameters :</b><br>
     * <br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#MANUAL_AUDIT_INDICATOR}<br>
     * <br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#GOVT_BILL_OF_LADING_INDICATOR}
     * <br>
     * <br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#COUNTRY_REQUIRED_INDICATOR}
     * <br>
     * <br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SECURITY_INFORMATION}<br>
     * <br>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     *        <b>Errors: </b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#COUNTRY_INVALID_CODENOTEXIST_OBJECT_INSTANCE}
     *        </code></td> <td align="left">country code does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTS_STATION_INVALID_CODE}
     *        </code></td> <td align="left"> station code of participant does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTS_BROKERSTATION_INVALID_CODE}
     *        </code></td> <td>station code for the broker in the request does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTS_BONDEDSTATION_INVALID_CODE}
     *        </code></td> <td>The bonded station code does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTS_CURRENCY_INVALID_CODE}
     *        </code></td> <td>currency code of the participant does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_ALIAS_EXIST}
     *        </code></td> <td>Alias name of the participant already exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_ACCOUNT_NOTUNIQUE}
     *        </code></td> <td>Account number of the participant is already exist in system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_IATAACCOUNT_NOTUNIQUE}
     *        </code></td> <td>IATA account number of the participant is already exist in system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_BROKERACCOUNT_INVALID}
     *        </code></td> <td>Account number of the broker is already available in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_BILLACCOUNT_NOTVALID}
     *        </code></td> <td>Billing account number of the participant is not a valid account number
     *        corresponding to the participant. </td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_ALREADY_EXIST}
     *        </code></td> <td>participant is already available in system.</td> <br>
     *        </tr>
     *        </table>
     * @param pParticipantPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantPersistRequest
     *            ParticipantPersistRequest}</code><br>
     *            Holds the attributes to create a participant.
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto} -
     *            (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setAddress address}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setBillingAccountNumber1
     *            billingAccountNumber1} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setBillingAccountNumber2
     *            billingAccountNumber2} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setBillingAccountType1
     *            billingAccountType1} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setBillingAccountType2
     *            billingAccountType2} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setCity city} - (M)</code>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setDeletedDate
     *            deletedDate} - (C)</code><br>
     *            Prohibit for the create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setDeletedStation
     *            deletedStation} - (C)</code><br>
     *            Prohibit for the create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setDeletedUser deletedUser} -
     *            (C)</code><br>
     *            Prohibit for the create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setDeleteRemarks
     *            deleteRemarks} - (C)</code><br>
     *            Mandatory in case participant is deleted. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setFax fax} - (O)</code> <li>
     *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setName name} - (M)
     *            </code> <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setCountry
     *            country} - (C)</code><br>
     *            This field is mandatory, based on the parameter
     *            {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#COUNTRY_REQUIRED_INDICATOR
     *            COUNTRY_REQUIRED_INDICATOR}.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setOId oId} - (C)
     *            </code><br>
     *            Object id is prohibited for the create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setDeleteIndicator
     *            deleteIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setEmail email} - (C)</code><br>
     *            Prohibited for one time participant. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setLanguage language} - (O)
     *            </code> <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setPhone
     *            phone} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setPostalCode postalCode} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setState state} - (O)</code>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setStationCode
     *            stationCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setType type} - (M)</code>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setUldFreightCode
     *            uldFreightCode} - (M)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setUldDetail
     *            uldDetail} - (C)(0:1)</code><br>
     *            ULD Details are mandatory if freight details are not provided.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setBlacklistedIndicator
     *            blacklistedIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setRemarks remarks} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setSitaTelexAddress
     *            sitaTelexAddress} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setTelex telex} - (O)</code>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setUldParticipantType
     *            uldParticipantType} - (M)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setParticipantAliasDtos
     *            participantAliasDtos} - (O)(0:*)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto
     *            ParticipantAliasDto}</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto#setAliasName
     *            aliasName} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto#setOId oId} - (M)</code><br>
     *            prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto#setParticipantOId
     *            participantOId} - (M)</code><br>
     *            prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setFreightDetail
     *            freightDetail} - (C)(0:1)</code><br>
     *            Freight details are mandatory if ULD details are not provided.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setAccountingRemarks
     *            accountingRemarks} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setAvailableCredit
     *            availableCredit} - (C)</code><br>
     *            Mandatory for Carrier Billing or Demand Billing Method of payments. Protected for other
     *            types of payment method. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setBillToAccount
     *            billToAccount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setCreditLimit creditLimit}
     *            - (C)</code><br>
     *            Mandatory if Payment method is Carrier Billing or Demand Billing. Protected for other
     *            Payment methods. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setCashCreditStatus
     *            cashCreditStatus} - (C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setCreditRate creditRate} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setCurrencyCode
     *            currencyCode} - (C)</code><br>
     *            Mandatory if Credit Limit field provided, else protected. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setFrequentFlyerNumber
     *            frequentFlyerNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setHardOrSoftCreditLimitIndicator
     *            hardOrSoftCreditLimitIndicator} - (C)</code><br>
     *            Optional for Carrier Billing or Demand Billing payment method, else protected. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setIataAccountNumber
     *            iataAccountNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setNotificationStatusCode
     *            notificationStatusCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setNotifyMethod
     *            notifyMethod} - (C)</code><br>
     *            Prohibited if Notify field is blank; mandatory if Notify field is non blank. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setParticipantRemarks
     *            participantRemarks} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setPaymentMethod
     *            paymentMethod} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setFreightAttributes
     *            freightAttributes } - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setContractAllowedIndicator
     *            contractAllowedIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setCrossReferenceInformationRequired
     *            crossReferenceInformationRequired} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setCommercialAccountRestrictionIndicator
     *            commercialAccountRestrictionIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setCustomsNominatedAgentStatus
     *            customsNominatedAgentStatus} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setEdiHouseAWBFeeEntryRestrictionIndicator
     *            ediHouseAWBFeeEntryRestrictionIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setFirstSecurityStatusInformation
     *            firstSecurityStatusInformation} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setGovtTaxExemptIndicator
     *            govtTaxExemptIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setIataAgentPrepaidChargesIndicator
     *            iataAgentPrepaidChargesIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setManualHouseAWBFeeRestrictionIndicator
     *            manualHouseAWBFeeRestrictionIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setNoShipmentIndicator
     *            noShipmentIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setRestrictedArticlesExemptIndicator
     *            restrictedArticlesExemptIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setStateTaxExemptIndicator
     *            stateTaxExemptIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setSecondSecurityStatusInformation
     *            secondSecurityStatusInformation} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setValuableCargoExemptIndicator
     *            valuableCargoExemptIndicator} - (O)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setFreightAdditional
     *            freightAdditional} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setAgentCustomsCode
     *            agentCustomsCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setAwbPriority
     *            awbPriority} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setCustomsCode
     *            customsCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setDistrictCode
     *            districtCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setEstablishedDate
     *            establishedDate} - (C)</code><br>
     *            Prohibited for the create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setGovtBillLadingIndicator
     *            govtBillLadingIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setInitialShipmentDate
     *            initialShipmentDate} - (C)</code><br>
     *            Prohibited for the create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setManualAuditIndicator
     *            manualAuditIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setMessageProfileName
     *            messageProfileName} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setRegionCode
     *            regionCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setSubDistrictCode
     *            subDistrictCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setVatNumber vatNumber}
     *            - (O)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setFreightStatistics
     *            freightStatistics} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightStatisticsDto#setLastShipmentDate
     *            lastShipmentDate} - (C)</code><br>
     *            Prohibited for the create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightStatisticsDto#setTotalShipments
     *            totalShipments} - (C)</code><br>
     *            Prohibited for the create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightStatisticsDto#setTotalHouseAWB
     *            totalHouseAWB} - (C)</code><br>
     *            Prohibited for the create operation.
     *            </ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setBrokers
     *            broker} - (O)(0:*)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.BrokerDto BrokerDto}</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.BrokerDto#setAccountNumber
     *            accountNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BrokerDto#setBillBrokerIndicator
     *            billBrokerIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BrokerDto#setStation station} - (C)</code><br>
     *            Mandatory only if Broker Account number provided.
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setBondedPremises
     *            bondedPremises} - (O)(0:*)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.BondedPremiseDto BondedPremiseDto}
     *            </code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.BondedPremiseDto#setBondedId
     *            bondedId} - (C)</code><br>
     *            Mandatory if Bonded station provided. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BondedPremiseDto#setBondedStation
     *            bondedStation} - (C)</code><br>
     *            Mandatory if Bonded ID provided.
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setCreditInformations
     *            creditInformations} - (O)(0:*)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.CreditInformationDto
     *            CreditInformationDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.CreditInformationDto#setCreditCardId
     *            creditCardId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.CreditInformationDto#setCreditReferenceId
     *            creditReferenceId} - (O)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}
     *         </code><br>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse ResponseFields}
     *         <li>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto participant} <li>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse#getParticipantSearch
     *         participantSearch} (0:*)</code>
     *         <ul>
     *         <li>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto ParticipantSearchDto}
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    ParticipantResponse createParticipant(ParticipantPersistRequest pParticipantPersistRequest)
                throws LMSException;

    /**
     * Deletes the participant information.<br>
     * <p>
     * <b> Related methods include:</b><br>
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#reactivateParticipant
     * reactivateParticipant}<br>
     * <br>
     * Marks the participant as deleted by setting the <code>deleteIndicator</code> attribute in participant
     * entity to true. The updated participant information is then sent to external interfaces like Customer
     * Management Reporting.<br>
     * If the participant has contracts ,the system sends interface message to rating module to indicate the
     * end date (participant marked for deletion date) for contracts, spot rates and other charge contracts
     * associated with the participant. The system sends the participant data to external interfaces like data
     * warehouse modules. The Participant must not be deleted if any of the Host or Non-Host ULD is associated
     * with the Participant.<br>
     * In order to delete the participant, a participant must be available in the system.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     *        <b>Errors: </b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_ACTIVE_TELETYPE}
     *        </code></td> <td align="left">The participant has active teletype link and cannot be deleted.
     *        </td>
     *        </tr>
     *        </table>
     * @param pParticipantDeleteRequest <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest
     *            ParticipantDeleteRequest}</code><br>
     *            Holds attributes to deactivate/delete a participant.<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setDeleteRemarks
     *            deleteRemarks} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setVersion version}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setDeletedStation
     *            deletedStation} - (C)</code><br>
     *            Prohibited for the user. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setDeletedUser
     *            deletedUser} - (C)</code><br>
     *            Prohibited for the user. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setDeleteDate
     *            deleteDate} - (C)</code><br>
     *            Prohibited for the user. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setDeleteIndicator
     *            deleteIndicator} - (C)</code><br>
     *            Prohibited for the user.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}
     *         </code><br>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse ResponseFields}
     *         </code><br>
     *         holds the <code>CodeMessage</code>.
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    ParticipantResponse deleteParticipant(ParticipantDeleteRequest pParticipantDeleteRequest)
                throws LMSException;

    /**
     * Finds the AWB <code>Participant</code><br>
     * <p>
     * <b> Related methods include:</b><br>
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findParticipant
     * findParticipant}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findParticipantsByMessageProfileNames
     * findParticipantsByMessageProfileNames}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#retrieveParticipantByAccountNumber
     * retrieveParticipantByAccountNumber}<br>
     * <p>
     * Retrieves the participant information based on the following search criteria:
     * <p>
     * <li><b> Account Number Search</b><br>
     * <p>
     * <ul>
     * <li>By Billing Account Number<br>
     * System Searches the participant details using billing account number.if any match found the details are
     * displayed.
     * <li>By IATA Account Number<br>
     * System Searches the participant details using IATA account number.if any match found the details are
     * displayed.
     * </ul>
     * <p>
     * <li><b> Name Search</b>
     * <ul>
     * <p>
     * <li><b>Full Name</b><br>
     * System Searches the participant details using participant full name.if any match found the details are
     * displayed.otherwise a list of participant details are displayed. See match types to know the details.
     * <p>
     * <li><b>Alias Name</b><br>
     * System Searches the participant details using participant alias.if any match found the details are
     * displayed.otherwise a list of participant details are displayed. See match types to know the details.
     * <p>
     * <li><b>One Time Participant</b><br>
     * System Searches the participant details using one time participant.if any match found the details are
     * displayed.otherwise a list of participant details are displayed. See match types to know the details.
     * <p>
     * <li><b>Full Name,Alias Name,One Time Participant</b><br>
     * System Searches the participant details using combination of Full Name,Alias Name and One Time
     * Participant.if any match found the details are displayed.otherwise a list of participant details are
     * displayed.See match types to know the details.
     * </ul>
     * <p>
     * <li><b>Comma Separated Search</b><br>
     * System searches the participant details using special character comma ,based on the following search
     * criteria .<br>
     * <br>
     * <ul>
     * <li>If input name Unisys, and station JFK, is given ,system returns all participants starting with
     * Unisys in JFK station (e.g. Unisys, Unisys Corp, Unisys Airline Operations etc) whereas the same
     * input without comma do not return selection display list.<br>
     * <li>If the input name U,A,O and station MSP is given , the system returns the participant Unisys
     * Airline Operations, if there is only one participant.If more than one participant exists in the
     * system, it returns the selection display say United Airline Operation, Union Airways Office, Unix And
     * Oracle, etc.<br>
     * <li>If system is not able to find matching participant names starting with U,A and O in MSP station it
     * returns a selection list starting with participant say Union Air Transport in MSP station followed by
     * all participant in MSP station in alphabetical order.
     * </ul>
     * <p>
     * <b> Match Type</b>
     * <ul>
     * <li><b>Exact Match</b><br>
     * If the input details matches exactly with the available participants in the system. the specific
     * participants details returns.
     * <p>
     * <li><b>Duplicate Match</b><br>
     * If the input details matches with the more than one available participants in the system. the list of
     * participants detail returns.
     * <p>
     * <li><b>Decrement Retrieval if no values present in the System</b><br>
     * If the input details does not matches with any available participants in the system. then this match is
     * carried out by taking the input string alone and the search is carried out recursively by reducing the
     * character present at the end till the length becomes zero.
     * </ul>
     * <p>
     * <li><b>The system performs the following filter processing:</b>
     * <ul>
     * The system filters the participant depending upon the type search criteria.
     * <li>The system returns one-time participants depending upon the parameter
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ONE_TIME_PARTICIPANT_INDICATOR}</code>
     * <li>If the participant role provided by the user is Shipper or Consignee and the participant has the No
     * Shipment attribute of Cannot be a shipper or consignee , the participant is not returned on selection
     * list. This rule is enabled/disabled by the parameter
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SECURITY_INFORMATION}</code>.
     * <li>If the participant attribute has security status information, the system returns the participant
     * type of C on the participant selection list to denote that participants security status information
     * need to be analyzed before capturing the participant.This rule is enabled/disabled by the parameter.
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SECURITY_INFORMATION}</code>.
     * <li>The system returns the deleted participant depending upon the parameter
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DISPLAY_DELETED_PARTICIPANT_INDICATOR}</code>.
     * <li>If the participant is an Alias, the system returns the participant type as A in the selection
     * list indicating that this participant is an alias.
     * <li>The system returns unique key for each participant, which enables the system to retrieve the
     * participant information using the unique key , when a participant is selected from the selection list
     * by the user. For an alias participant the unique key returned is the unique key of the participant that
     * this is an alias for. The full name of the participant that this is an alias for is returned in the
     * address field.
     * </ul>
     * <p>
     * Performs the search in the following sequence. <br>
     * <p>
     * <li>If <code>accountNumber</code> is given, then the system finds the <code>Participant</code> details
     * by <code>accountNumber.</code><br>
     * <li>If <code>name</code> is given, then it finds the <code>Participant</code> details by
     * <code>name and station.</code><br>
     * <li>If both <code>name</code> and <code>accountNumber</code> is given, then the system finds the
     * <code>Participant</code> details by <code>accountNumber</code>.<br>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     *        <b>Errors: </b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_BILLING_ACCOUNT_NUMBER_NOT_EXIST}
     *        </code></td> <td align="left">The billing account number does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_IATA_ACCOUNT_NUMBER_NOT_EXIST}
     *        </code></td> <td align="left"> The IATA account number does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTS_STATION_INVALID_CODE}
     *        </code></td> <td align="left"> The station code of participant in the request does not exist in
     *        the system.</td>
     *        </tr>
     *        </table>
     * @param pParticipantFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
     *            ParticipantFindRequest}</code><br>
     *            Holds the attributes to find the <code>Participant</code>.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAccountNumber
     *            accountNumber} - (C)</code><br>
     *            Account number is mandatory if participant name is not given.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setName
     *            name} - (C)</code><br>
     *            Participant name is mandatory if account number is not given.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantAccountType
     *            participantAccountType} - (C)</code><br>
     *            Account number type is mandatory when user wants to search the participant using participant
     *            account number.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNameTypeCode
     *            nameTypeCode} - (C)</code><br>
     *            Participant type is mandatory when user wants to search the participant using participant
     *            name. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStation station }
     *            - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAddress
     *            address} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCity
     *            city } - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountry
     *            country} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDisplayCount
     *            displayCount} - (C)</code><br>
     *            System sets display count as zero during the first retrieval of participant. In the
     *            subsequent retrieval, the value of display count will be set from the last response. <li>
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFetchedCount
     *            fetchedCount} - (C)</code><br>
     *            System sets the fetched count as zero during the first retrieval of the participant. In the
     *            subsequent retrieval, the value of the fetched count will be set from the last response. 
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNextIndicator
     *            nextIndicator} - (C)</code><br>
     *            Next indicator determine whether to move to next page or previous page. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNoShipmentsIndicator
     *            noShipmentsIndicator} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setOId oId}
     *            - (C)</code><br>
     *            System uses object id attribute to retrieve the participant details. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPageSize pageSize}
     *            - (C)</code><br>
     *            Page size specifies the number of participants to be displayed in the page. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPostalCode
     *            postalCode} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString
     *            searchString} - (C)</code><br>
     *            System uses the search string to search the participant. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setTotalCount
     *            totalCount} - (C)</code><br>
     *            System sets the total count as zero during the first retrieval. In the subsequent retrieval,
     *            the value of the total count will be set from the last response. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSelectionListDisplayIndicator
     *            selectionListDisplayIndicator} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStartIndex
     *            startIndex} - (C)</code><br>
     *            System sets the start index as zero during the first retrieval. In the subsequent retrieval,
     *            the value of the start index will be set from the last response. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setState state} - (O)
     *            </code><br>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}
     *         </code><br>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse ResponseFields}
     *         <li>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto participant} <li>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse#getParticipantSearch
     *         participantSearch} (0:*)</code>
     *         <ul>
     *         <li>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto ParticipantSearchDto}
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    ParticipantResponse findAWBParticipant(ParticipantFindRequest pParticipantFindRequest)
                throws LMSException;

    /**
     * Finds the <code>Participant</code>.<br>
     * <p>
     * <b> Related methods include:</b><br>
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findAWBParticipant
     * findAWBParticipant}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findParticipantsByMessageProfileNames
     * findParticipantsByMessageProfileNames}
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#reactivateParticipant
     * reactivateParticipant}
     * <p>
     * Retrieves the participant information based on the following search criteria:
     * <p>
     * <li><b> Account Number Search</b><br>
     * <p>
     * <ul>
     * <li>By Billing Account Number<br>
     * System Searches the participant details using billing account number.if any match found the details are
     * displayed.
     * <li>By IATA Account Number<br>
     * System Searches the participant details using IATA account number.if any match found the details are
     * displayed.
     * </ul>
     * <p>
     * <li><b> Name Search</b>
     * <ul>
     * <p>
     * <li><b>Full Name</b><br>
     * System Searches the participant details using participant full name.if any match found the details are
     * displayed.otherwise a list of participant details are displayed. See match types to know the details.
     * <p>
     * <li><b>Alias Name</b><br>
     * System Searches the participant details using participant alias.if any match found the details are
     * displayed.otherwise a list of participant details are displayed. See match types to know the details.
     * <p>
     * <li><b>One Time Participant</b><br>
     * System Searches the participant details using one time participant.if any match found the details are
     * displayed.otherwise a list of participant details are displayed. See match types to know the details.
     * <p>
     * <li><b>Full Name,Alias Name,One Time Participant</b><br>
     * System Searches the participant details using combination of Full Name,Alias Name and One Time
     * Participant.if any match found the details are displayed.otherwise a list of participant details are
     * displayed.See match types to know the details.
     * </ul>
     * <p>
     * <li><b>Comma Separated Search</b><br>
     * System searches the participant details using special character comma ,based on the following search
     * criteria .<br>
     * <br>
     * <ul>
     * <li>If input name Unisys, and station JFK, is given ,system returns all participants starting with
     * Unisys in JFK station (e.g. Unisys, Unisys Corp, Unisys Airline Operations etc) whereas the same
     * input without comma do not return selection display list.<br>
     * <li>If the input name U,A,O and station MSP is given , the system returns the participant Unisys
     * Airline Operations, if there is only one participant.If more than one participant exists in the
     * system, it returns the selection display say United Airline Operation, Union Airways Office, Unix And
     * Oracle, etc.<br>
     * <li>If system is not able to find matching participant names starting with U,A and O in MSP station it
     * returns a selection list starting with participant say Union Air Transport in MSP station followed by
     * all participant in MSP station in alphabetical order.
     * </ul>
     * <p>
     * <b> Match Type</b>
     * <ul>
     * <li><b>Exact Match</b><br>
     * If the input details matches exactly with the available participants in the system. the specific
     * participants details returns.
     * <p>
     * <li><b>Duplicate Match</b><br>
     * If the input details matches with the more than one available participants in the system. the list of
     * participants detail returns.
     * <p>
     * <li><b>Decrement Retrieval if no values present in the System</b><br>
     * If the input details does not matches with any available participants in the system. then this match is
     * carried out by taking the input string alone and the search is carried out recursively by reducing the
     * character present at the end till the length becomes zero.
     * </ul>
     * <p>
     * <li><b>The system performs the following filter processing:</b>
     * <ul>
     * The system filters the participant depending upon the type search criteria.
     * <li>The system returns one-time participants depending upon the parameter
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ONE_TIME_PARTICIPANT_INDICATOR}</code>
     * <li>If the participant role provided by the user is Shipper or Consignee and the participant has
     * the No Shipment attribute of Cannot be a shipper or consignee, the participant is not returned on
     * selection list. This rule is enabled/disabled by the parameter
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SECURITY_INFORMATION}</code>.
     * <li>If the participant attribute has security status information, the system returns the participant
     * type of C on the participant selection list to denote that participants security status information
     * need to be analyzed before capturing the participant.This rule is enabled/disabled by the parameter.
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SECURITY_INFORMATION}</code>.
     * <li>The system returns the deleted participant depending upon the parameter
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#DISPLAY_DELETED_PARTICIPANT_INDICATOR}</code>.
     * <li>If the participant is an Alias, the system returns the participant type as A in the selection
     * list indicating that this participant is an alias.
     * <li>The system returns unique key for each participant, which enables the system to retrieve the
     * participant information using the unique key , when a participant is selected from the selection list
     * by the user. For an alias participant the unique key returned is the unique key of the participant that
     * this is an alias for. The full name of the participant that this is an alias for is returned in the
     * address field.
     * </ul>
     * <p>
     * Performs the search in the following sequence. <br>
     * <p>
     * <li>If <code>accountNumber</code> is given, then the system finds the <code>Participant</code> details
     * by <code>accountNumber.</code><br>
     * <li>If <code>name</code> is given, then it finds the <code>Participant</code> details by
     * <code>name and station.</code><br>
     * <li>If both <code>name</code> and <code>accountNumber</code> is given, then the system finds the
     * <code>Participant</code> details by <code>accountNumber</code>.<br>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     *        <b>Errors: </b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_BILLING_ACCOUNT_NUMBER_NOT_EXIST}
     *        </code></td> <td align="left">The billing account number does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_IATA_ACCOUNT_NUMBER_NOT_EXIST}
     *        </code></td> <td align="left"> The IATA account number does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTS_STATION_INVALID_CODE}
     *        </code></td> <td align="left"> The station code of participant in the request does not exist in
     *        the system.</td>
     *        </tr>
     *        </table>
     * @param pParticipantFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest
     *            ParticipantFindRequest}</code><br>
     *            Holds the attributes to find the <code>Participant</code>.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAccountNumber
     *            accountNumber} - (C)</code><br>
     *            Account number is mandatory if participant name is not given.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setName
     *            name} - (C)</code><br>
     *            Participant name is mandatory if account number is not given.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setParticipantAccountType
     *            participantAccountType} - (C)</code><br>
     *            Account number type is mandatory when user wants to search the participant using participant
     *            account number.<br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNameTypeCode
     *            nameTypeCode} - (C)</code><br>
     *            Participant type is mandatory when user wants to search the participant using participant
     *            name. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStation station }
     *            - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setAddress
     *            address} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCity
     *            city } - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setCountry
     *            country} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setDisplayCount
     *            displayCount} - (C)</code><br>
     *            System sets display count as zero during the first retrieval of participant. In the
     *            subsequent retrieval, the value of display count will be set from the last response. <li>
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setFetchedCount
     *            fetchedCount} - (C)</code><br>
     *            System sets the fetched count as zero during the first retrieval of the participant. In the
     *            subsequent retrieval, the value of the fetched count will be set from the last response. 
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNextIndicator
     *            nextIndicator} - (C)</code><br>
     *            Next indicator determine whether to move to next page or previous page. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setNoShipmentsIndicator
     *            noShipmentsIndicator} - (O)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setOId oId}
     *            - (C)</code><br>
     *            System uses object id attribute to retrieve the participant details. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPageSize pageSize}
     *            - (C)</code><br>
     *            Page size specifies the number of participants to be displayed in the page. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setPostalCode
     *            postalCode} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSearchString
     *            searchString} - (C)</code><br>
     *            System uses the search string to search the participant. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setTotalCount
     *            totalCount} - (C)</code><br>
     *            System sets the total count as zero during the first retrieval. In the subsequent retrieval,
     *            the value of the total count will be set from the last response. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setSelectionListDisplayIndicator
     *            selectionListDisplayIndicator} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setStartIndex
     *            startIndex} - (C)</code><br>
     *            System sets the start index as zero during the first retrieval. In the subsequent retrieval,
     *            the value of the start index will be set from the last response. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantFindRequest#setState state} - (O)
     *            </code><br>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}
     *         </code><br>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse ResponseFields}
     *         </code><br>
     *         <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto
     *         ParticipantSearchDto} - (0:*)</code><br>
     *         <ul>
     *         <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto
     *         ParticipantSearchDto}</code>
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    ParticipantResponse findParticipant(ParticipantFindRequest pParticipantFindRequest) throws LMSException;

    /**
     * Finds participants by doing all possible searches for specified participant role.
     * <p>
     * 
     * @param pParticipantMultipleFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantMultipleFindRequest
     *            ParticipantMultipleFindRequest}</code><br>
     *            Holds the attributes to find the <code>Participant</code>.<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantMultipleFindRequest
     *            ParticipantMultipleFindRequest}</code></li>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantMultipleFindRequest#setParticipantSearchDtos
     *            pParticipantSearchDtos} - (M)</code></li>
     *            </ul>
     *            </ul>
     *            </p>
     * @return <code>Map</code><br>
     *         <p>
     *         Returns the map of participant details in which the <code>ParticipantRoleType</code> is the key
     *         and the <code>ParticipantResponse</code> is the value.<br>
     * @throws LMSException If the participant details do not exist.
     */
    Map<ParticipantRoleType, ParticipantResponse> findParticipantByRole(
                final ParticipantMultipleFindRequest pParticipantMultipleFindRequest) throws LMSException;

    /**
     * Finds the <code>Participant</code> information based on the list of Message Profile Names given.<br>
     * <p>
     * <b> Related methods include:</b><br>
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findAWBParticipant
     * findAWBParticipant}<br>
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findParticipant
     * findParticipant}
     * <li>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#retrieveParticipantByAccountNumber
     * retrieveParticipantByAccountNumber}
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     * @param pMessageProfileNames Contains the list of Message Profile Name.
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.TTYAddressProfileParticipantDto
     *         TTYAddressProfileParticipantDto} - (1:*)</code>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TTYAddressProfileParticipantDto#getBillingAccountNumber1
     *         billingAccountNumber1} - (O)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TTYAddressProfileParticipantDto#getName name} -
     *         (M)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TTYAddressProfileParticipantDto#getMessageProfileName
     *         messageProfileName} - (O)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TTYAddressProfileParticipantDto#getStationCode
     *         stationCode} - (M)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.TTYAddressProfileParticipantDto#getOId oId} -
     *         (M)</code><br>
     *         </ul>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    List<TTYAddressProfileParticipantDto> findParticipantsByMessageProfileNames(
                final List<String> pMessageProfileNames) throws LMSException;

    /**
     * Reactivates the participant information.
     * <p>
     * Reactivates the participant who was already marked as deleted. Reactivation is done by setting the
     * <code>deleteIndicator</code> attribute in participant entity to false. The updated participant
     * information is then sent to external interfaces like Customer Management Reporting.<br>
     * System will allow only authorized user to reactivate the participant.<br>
     * In order to reactivate the participant, a deleted participant must be exist in the system.<br>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     * <br>
     *        <b>Errors: </b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_NOT_EXIST}
     *        </code></td> <td align="left"> participant does not exist in the system.</td>
     *        </tr>
     *        </table>
     * @param pParticipantReactivateRequest <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantReactivateRequest
     *            ParticipantReactivateRequest}</code><br>
     *            Holds attributes to reactivate a participant.<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDeleteRequest#setVersion version}
     *            - (M)</code>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}
     *         </code>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse ResponseFields}
     *         </code> <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto
     *         ParticipantDto}</code>
     *         </ul>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    ParticipantResponse reactivateParticipant(ParticipantReactivateRequest pParticipantReactivateRequest)
                throws LMSException;

    /**
     * Validate the given Participant information.<br>
     * <p>
     * <p>
     * <b> Related methods include:</b><br>
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findAWBParticipant
     * findAWBParticipant}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findParticipantsByMessageProfileNames
     * findParticipantsByMessageProfileNames}
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findParticipant
     * findParticipant}
     * <p>
     * This method retrieves list of participant information for the participant account numbers present in
     * the list <code>ParticipantDetailDto</code>.<br>
     * Only the general information like name, station, account numbers (both billing account number 1 and
     * IATA agent number), address, city, state, country, postal code and deleted are retrieved.<br>
     * This method is used to find the participant details by account number.<br>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     *        <b>Errors: </b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_BILLING_ACCOUNT_NUMBER_NOT_EXIST}
     *        </code></td> <td align="left">The billing account number does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_IATA_ACCOUNT_NUMBER_NOT_EXIST}
     *        </code></td> <td align="left"> The IATA account number does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        </table>
     * @param pParticipantDetailDto <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto ParticipantDetailDto}
     *            </code><br>
     *            Holds the list <code>ParticipantDetailDto</code>.<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     *            ParticipantDetailDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setAccountNumber
     *            accountNumber}</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setParticipantAccountType
     *            participantAccountType}</code>
     *            </ul>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     *         ParticipantDetailDto} - (1:*)</code><br>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getAccountNumber
     *         accountNumber}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getAddress() address}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getCity() city}</code> 
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getCountryCode()
     *         countryCode}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getDeleteIndicator()
     *         deleteIndicator}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getName() name}</code> 
     *         <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getOId() oId}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getParticipantAccountType()
     *         participantAccountType}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getPostalCode()
     *         postalCode}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getState() state}</code>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getStationCode()
     *         stationCode}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#getVersion() version}
     *         </code>
     *         </ul>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    List<ParticipantDetailDto> retrieveParticipantByAccountNumber(
                List<ParticipantDetailDto> pParticipantDetailDto) throws LMSException;
    
    
    
    /**
     * Validate the given Participant information.<br>
     * <p>
     * <p>
     * <b> Related methods include:</b><br>
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findAWBParticipant
     * findAWBParticipant}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findParticipantsByMessageProfileNames
     * findParticipantsByMessageProfileNames}
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findParticipant
     * findParticipant}
     * <p>
     * This method retrieves list of participant information for the participant account numbers present in
     * the list <code>ParticipantDetailDto</code>.<br>
     * Only the general information like name, station, account numbers (both billing account number 1 and
     * IATA agent number), address, city, state, country, postal code and deleted are retrieved.<br>
     * This method is used to find the participant details by account number.<br>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     *        <b>Errors: </b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_BILLING_ACCOUNT_NUMBER_NOT_EXIST}
     *        </code></td> <td align="left">The billing account number does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_IATA_ACCOUNT_NUMBER_NOT_EXIST}
     *        </code></td> <td align="left"> The IATA account number does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        </table>
     * @param pParticipantDetailDto <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto ParticipantDetailDto}
     *            </code><br>
     *            Holds the list <code>ParticipantDetailDto</code>.<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     *            ParticipantDetailDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setAccountNumber
     *            accountNumber}</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setParticipantAccountType
     *            participantAccountType}</code>
     *            </ul>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     *         ParticipantDetailDto} - (1:*)</code><br>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getAccountNumber
     *         accountNumber}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getAddress() address}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getCity() city}</code> 
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getCountryCode()
     *         countryCode}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getDeleteIndicator()
     *         deleteIndicator}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getName() name}</code> 
     *         <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getOId() oId}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getParticipantAccountType()
     *         participantAccountType}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getPostalCode()
     *         postalCode}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getState() state}</code>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getStationCode()
     *         stationCode}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#getVersion() version}
     *         </code>
     *         </ul>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    List<ParticipantDetailDto> retrieveParticipantByAccountNumberForAccounting(
                List<ParticipantDetailDto> pParticipantDetailDto,String specificAirline) throws LMSException;


    /**
     * Validate the given WildCard Participant information.<br>
     * <p>
     * <p>
     * <b> Related methods include:</b><br>
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findAWBParticipant
     * findAWBParticipant}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#retrieveParticipantByAccountNumber
     * retrieveParticipantByAccountNumber}<br>
     * <li>
     * {@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findParticipantsByMessageProfileNames
     * findParticipantsByMessageProfileNames}
     * <li>{@link com.unisys.trans.logistics.lms.parts.contract.ParticipantService#findParticipant
     * findParticipant}
     * <p>
     * This method retrieves list of participant information for the wild card participant account numbers
     * present in the list <code>ParticipantDetailDto</code>.<br>
     * Only the general information like name, station, account numbers (both billing account number 1 and
     * IATA agent number), address, city, state, country, postal code and deleted are retrieved.<br>
     * This method is used to find the participant details by account number.<br>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     *        <b>Errors: </b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_ACCOUNT_NUMBER_DOES_NOT_EXIST}
     *        </code></td> <td align="left">The participant account number does not exist in the system.</td>
     *        </tr>
     *        </table>
     * @param pParticipantDetailDto <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto ParticipantDetailDto}
     *            </code><br>
     *            Holds the list <code>ParticipantDetailDto</code>.<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     *            ParticipantDetailDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#setAccountNumber
     *            accountNumber}</code> <li><code>
     *            </ul>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto
     *         ParticipantDetailDto} - (1:*)</code><br>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getAccountNumber
     *         accountNumber}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getAddress() address}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getCity() city}</code> 
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getCountryCode()
     *         countryCode}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getDeleteIndicator()
     *         deleteIndicator}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getName() name}</code> 
     *         <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getOId() oId}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getParticipantAccountType()
     *         participantAccountType}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getPostalCode()
     *         postalCode}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getState() state}</code>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDetailDto#getStationCode()
     *         stationCode}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#getVersion() version}
     *         </code>
     *         </ul>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    Map<String, List<ParticipantDetailDto>> retrieveParticipantByWildCardAccountNumber(
                List<ParticipantDetailDto> pParticipantDetailDto) throws LMSException;

    /**
     * Updates participant information.
     * <p>
     * The user provides the participant data and selects the option to update the participant. The actor must
     * provide the following input:<br>
     * <br>
     * <li>General participant information.<br>
     * example- Name,Station,Address,City,State,Postal Code,Country,Phone,Aliases,Account, ULD or Freight
     * attribute indicator etc<br>
     * <br>
     * <li>Freight participant information.<br>
     * example- Notify,Method,IATA Account Number,Frequent Flyer Number,Broker Account Number,Broker Station,
     * Payment Method,Credit Rate,Available,Consignee Remarks,Participant Remarks etc.<br>
     * <br>
     * <li>ULD participant information.<br>
     * example- Telex,SITA Telex,ULD Participant Type,Blacklisted etc.<br>
     * <br>
     * Actor must provide general participant information and at least one of freight or ULD participant
     * information input. Actor has the choice to provide all the three type of attributes too.<br>
     * In order to update the participant,a participant must be exist in the system.<br>
     * <br>
     * <p>
     * <b>Run time Parameters :</b><br>
     * <br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#MANUAL_AUDIT_INDICATOR}<br>
     * <br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#GOVT_BILL_OF_LADING_INDICATOR}
     * <br>
     * <br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#COUNTRY_REQUIRED_INDICATOR}
     * <br>
     * <br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#SECURITY_INFORMATION}<br>
     * <br>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <b>Errors: </b><br>
     *        The following response code may be returned.
     *        <table border="0" cellspacing="0" cellpadding="5">
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#COUNTRY_INVALID_CODENOTEXIST_OBJECT_INSTANCE}
     *        </code></td> <td align="left">country code does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTS_STATION_INVALID_CODE}
     *        </code></td> <td align="left"> station code of participant does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTS_BROKERSTATION_INVALID_CODE}
     *        </code></td> <td>station code for the broker in the request does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTS_BONDEDSTATION_INVALID_CODE}
     *        </code></td> <td>The bonded station code does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTS_CURRENCY_INVALID_CODE}
     *        </code></td> <td>currency code of the participant does not exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_ALIAS_EXIST}
     *        </code></td> <td>Alias name of the participant already exist in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_ACCOUNT_NOTUNIQUE}
     *        </code></td> <td>Account number of the participant is already exist in system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_IATAACCOUNT_NOTUNIQUE}
     *        </code></td> <td>IATA account number of the participant is already exist in system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_BROKERACCOUNT_INVALID}
     *        </code></td> <td>Account number of the broker is already available in the system.</td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_BILLACCOUNT_NOTVALID}
     *        </code></td> <td>Billing account number of the participant is not a valid account number
     *        corresponding to the participant. </td>
     *        </tr>
     *        <tr>
     *        <td align="left"><code>
     *        {@link com.unisys.trans.logistics.lms.parts.constants.MessageConstants#PARTICIPANT_NOT_EXIST}
     *        </code></td> <td>participant does not exist in system.</td>
     *        </tr>
     *        </table>
     * @param pParticipantPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantPersistRequest
     *            ParticipantPersistRequest}</code><br>
     *            Holds the attributes to create a participant.
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto} -
     *            (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setAddress address}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setBillingAccountNumber1
     *            billingAccountNumber1} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setBillingAccountNumber2
     *            billingAccountNumber2} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setBillingAccountType1
     *            billingAccountType1} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setBillingAccountType2
     *            billingAccountType2} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setCity city} - (M)</code>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setDeletedDate
     *            deletedDate} - (C)</code><br>
     *            Prohibit for the update operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setDeletedStation
     *            deletedStation} - (C)</code><br>
     *            Prohibit for the update operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setDeletedUser deletedUser} -
     *            (C)</code><br>
     *            Prohibit for the update operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setDeleteRemarks
     *            deleteRemarks} - (C)</code><br>
     *            Mandatory in case participant is deleted. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setFax fax} - (O)</code> <li>
     *            <code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setName name} - (M)
     *            </code> <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setCountry
     *            country} - (C)</code><br>
     *            This field is mandatory, based on the parameter
     *            {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#COUNTRY_REQUIRED_INDICATOR
     *            COUNTRY_REQUIRED_INDICATOR}.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setOId oId} - (C)
     *            </code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setDeleteIndicator
     *            deleteIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setEmail email} - (C)</code><br>
     *            Prohibited for one time participant. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setLanguage language} - (O)
     *            </code> <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setPhone
     *            phone} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setPostalCode postalCode} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setState state} - (O)</code>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setStationCode
     *            stationCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setType type} - (M)</code>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setUldFreightCode
     *            uldFreightCode} - (M)</code><br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setUldDetail
     *            uldDetail} - (C)(0:1)</code><br>
     *            ULD Details are mandatory if freight details are not provided.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setBlacklistedIndicator
     *            blacklistedIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setRemarks remarks} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setSitaTelexAddress
     *            sitaTelexAddress} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setTelex telex} - (O)</code>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setUldParticipantType
     *            uldParticipantType} - (M)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setParticipantAliasDtos
     *            participantAliasDtos} - (O)(0:*)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto
     *            ParticipantAliasDto}</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto#setAliasName
     *            aliasName} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto#setOId oId} - (M)</code><br>
     *            prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto#setParticipantOId
     *            participantOId} - (M)</code><br>
     *            prohibited for create operation.
     *            </ul>
     *            </ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setUldDetail
     *            uldDetail} - (C)(0:1)</code><br>
     *            ULD Details are mandatory if freight details are not provided.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setBlacklistedIndicator
     *            blacklistedIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setRemarks remarks} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setSitaTelexAddress
     *            sitaTelexAddress} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setTelex telex} - (O)</code>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.UldDetailDto#setUldParticipantType
     *            uldParticipantType} - (M)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setParticipantAliasDtos
     *            participantAliasDtos} - (O)(0:*)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto
     *            ParticipantAliasDto}</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto#setAliasName
     *            aliasName} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto#setOId oId} - (M)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantAliasDto#setParticipantOId
     *            participantOId} - (M)</code><br>
     *            </ul>
     *            </ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto#setFreightDetail
     *            freightDetail} - (C)(0:1)</code><br>
     *            Freight details are mandatory if ULD details are not provided.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setAccountingRemarks
     *            accountingRemarks} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setAvailableCredit
     *            availableCredit} - (C)</code><br>
     *            Mandatory for Carrier Billing or Demand Billing Method of payments. Protected for other
     *            types of payment method. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setBillToAccount
     *            billToAccount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setCreditLimit creditLimit}
     *            - (C)</code><br>
     *            Mandatory if Payment method is Carrier Billing or Demand Billing. Protected for other
     *            Payment methods. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setCashCreditStatus
     *            cashCreditStatus} - (C)</code><br>
     *            Prohibited for update operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setCreditRate creditRate} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setCurrencyCode
     *            currencyCode} - (C)</code><br>
     *            Mandatory if Credit Limit field provided. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setFrequentFlyerNumber
     *            frequentFlyerNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setHardOrSoftCreditLimitIndicator
     *            hardOrSoftCreditLimitIndicator} - (C)</code><br>
     *            Optional for Carrier Billing or Demand Billing payment method. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setIataAccountNumber
     *            iataAccountNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setNotificationStatusCode
     *            notificationStatusCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setNotifyMethod
     *            notifyMethod} - (C)</code><br>
     *            Prohibited if Notify field is blank; mandatory if Notify field is non blank. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setParticipantRemarks
     *            participantRemarks} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setPaymentMethod
     *            paymentMethod} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setFreightAttributes
     *            freightAttributes } - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setContractAllowedIndicator
     *            contractAllowedIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setCrossReferenceInformationRequired
     *            crossReferenceInformationRequired} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setCommercialAccountRestrictionIndicator
     *            commercialAccountRestrictionIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setCustomsNominatedAgentStatus
     *            customsNominatedAgentStatus} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setEdiHouseAWBFeeEntryRestrictionIndicator
     *            ediHouseAWBFeeEntryRestrictionIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setFirstSecurityStatusInformation
     *            firstSecurityStatusInformation} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setGovtTaxExemptIndicator
     *            govtTaxExemptIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setIataAgentPrepaidChargesIndicator
     *            iataAgentPrepaidChargesIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setManualHouseAWBFeeRestrictionIndicator
     *            manualHouseAWBFeeRestrictionIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setNoShipmentIndicator
     *            noShipmentIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setRestrictedArticlesExemptIndicator
     *            restrictedArticlesExemptIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setStateTaxExemptIndicator
     *            stateTaxExemptIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setSecondSecurityStatusInformation
     *            secondSecurityStatusInformation} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAttributesDto#setValuableCargoExemptIndicator
     *            valuableCargoExemptIndicator} - (O)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setFreightAdditional
     *            freightAdditional} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setAgentCustomsCode
     *            agentCustomsCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setAwbPriority
     *            awbPriority} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setCustomsCode
     *            customsCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setDistrictCode
     *            districtCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setEstablishedDate
     *            establishedDate} - (C)</code><br>
     *            Prohibited for the update operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setGovtBillLadingIndicator
     *            govtBillLadingIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setInitialShipmentDate
     *            initialShipmentDate} - (C)</code><br>
     *            Prohibited for the update operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setManualAuditIndicator
     *            manualAuditIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setMessageProfileName
     *            messageProfileName} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setRegionCode
     *            regionCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setSubDistrictCode
     *            subDistrictCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightAdditionalDto#setVatNumber vatNumber}
     *            - (O)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setFreightStatistics
     *            freightStatistics} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightStatisticsDto#setLastShipmentDate
     *            lastShipmentDate} - (C)</code><br>
     *            Prohibited for the update operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightStatisticsDto#setTotalShipments
     *            totalShipments} - (C)</code><br>
     *            Prohibited for the update operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightStatisticsDto#setTotalHouseAWB
     *            totalHouseAWB} - (C)</code><br>
     *            Prohibited for the update operation.
     *            </ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setBrokers
     *            broker} - (O)(0:*)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.BrokerDto BrokerDto}</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.BrokerDto#setAccountNumber
     *            accountNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BrokerDto#setBillBrokerIndicator
     *            billBrokerIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BrokerDto#setStation station} - (C)</code><br>
     *            Mandatory only if Broker Account number provided.
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setBondedPremises
     *            bondedPremises} - (O)(0:*)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.BondedPremiseDto BondedPremiseDto}
     *            </code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.BondedPremiseDto#setBondedId
     *            bondedId} - (C)</code><br>
     *            Mandatory if Bonded station provided. <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.BondedPremiseDto#setBondedStation
     *            bondedStation} - (C)</code><br>
     *            Mandatory if Bonded ID provided.
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.FreightDetailDto#setCreditInformations
     *            creditInformations} - (O)(0:*)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.CreditInformationDto
     *            CreditInformationDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.CreditInformationDto#setCreditCardId
     *            creditCardId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.parts.dto.CreditInformationDto#setCreditReferenceId
     *            creditReferenceId} - (O)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}
     *         </code><br>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse ResponseFields}
     *         </code><br>
     *         <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto}</code>
     *         <li> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse#getParticipantSearch
     *         participantSearch}</code>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto
     *         ParticipantSearchDto}</code>
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    ParticipantResponse updateParticipant(ParticipantPersistRequest pParticipantPersistRequest)
                throws LMSException;

    /**
     * Updates the <code>Participant</code> Message Profile Name.
     * <p>
     * <p>
     * It searches for the Participants having the given Message Profile Name from the input list and updates
     * the Message Profile Name to NULL.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     * @param pMessageProfileNames Contains the list of Message Profile Name.
     * @throws LMSException If the update operation fails.
     */
    void updateParticipantsMessageProfileNameToNull(final List<String> pMessageProfileNames)
                throws LMSException;

    /**
     * Verifies that the <code>Participant</code>can be deleted or not.
     * <p>
     * <p>
     * checks contract and spot rate existence for account number of the deleted participant and if it is
     * there it will set its expiration date.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     * @param pParticipantDeleteRequest Contains the sbilling account numbers.
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}
     *         </code><br>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse ResponseFields}
     *         </code><br>
     *         <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto}</code>
     *         <li> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse#getParticipantSearch
     *         participantSearch}</code>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto
     *         ParticipantSearchDto}</code>
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException If the verification operation fails.
     */
    ParticipantResponse verifyParticipantForDelete(final ParticipantDeleteRequest pParticipantDeleteRequest)
                throws LMSException;

    /**
     * Verifies that the <code>Participant</code>can be updated or not.
     * <p>
     * <p>
     * It checks either the input billing account1 or billing account2 is changed from a not null value to
     * null or not null value to some other not null value.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     * @param pParticipantPersistRequest Contains the billing account numbers.
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse ParticipantResponse}
     *         </code><br>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse ResponseFields}
     *         </code><br>
     *         <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto}</code>
     *         <li> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse#getParticipantSearch
     *         participantSearch}</code>
     *         <ul>
     *         <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto
     *         ParticipantSearchDto}</code>
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException If the verification operation fails.
     */
    ParticipantResponse
                verifyParticipantForUpdate(final ParticipantPersistRequest pParticipantPersistRequest)
                            throws LMSException;

    /**
     * Purges the <code>Participant</code>.
     * <p>
     * <p>
     * Permanently deletes the participant
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @Since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     * @param pBatchRequest Contains the billing account numbers.
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse BatchResponse} </code><br>
     *         <li><code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse ResponseFields}
     *         </code><br>
     *         <li><code>{@link com.unisys.trans.logistics.lms.parts.dto.ParticipantDto ParticipantDto}</code>
     *         <li> <li><code>
     *         {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantResponse#getParticipantSearch
     *         participantSearch}</code>
     *         <ul>
     *         </ul>
     *         <p>
     * @throws LMSException If the verification operation fails.
     */
    BatchResponse purgeParticipant(final BatchRequest pBatchRequest)
                throws LMSException;
    
    /**
     * This method deletes all the participants exists in the system.
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
     * 
     * @param pAbstractRequest - <code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractRequest
     *            AbstractRequest}</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code> </ul>
     * @throws LMSException If the operation fails.
     */
    BatchResponse deleteAllParticipants(AbstractRequest pAbstractRequest) throws LMSException;
    
    
    
    ParticipantAccNumValidatorResponse findParticipantByLmsDatabaseKey(
                final ParticipantAccNumValidatorRequest pParticipantAccNumValidatorRequest);

    /**
     * This method find all the participants that matches the prefix in the system.
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
     * 
     * @param pAbstractRequest - <code> {@link com.unisys.trans.logistics.lms.framework.dto.SuggestiveRequest
     *            SuggestiveRequest}</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.SuggestiveResponse
     *         BatchResponse}</code> </ul>
     * @throws LMSException If the operation fails.
     */
    SuggestiveResponse findParticipantsWithPrefix(SuggestiveRequest pRequest) throws LMSException;

    /**
     * This method find all the participant name that matches the prefix in the system.
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
     * 
     * @param pAbstractRequest - <code> {@link com.unisys.trans.logistics.lms.framework.dto.SuggestiveRequest
     *            SuggestiveRequest}</code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.SuggestiveResponse
     *         BatchResponse}</code> </ul>
     * @throws LMSException If the operation fails.
     */
	SuggestiveResponse findParticipantNameWithPrefix(SuggestiveRequest pRequest) throws LMSException;
	public ParticipantResponse findDuplicateParticipant(
            final ParticipantFindRequest pParticipantFindRequest)
            throws LMSException ;
	
	ParticipantReportResponse findParticipantReportDetails(
            final ParticipantReportFindRequest pParticipantReportFindRequest)
            throws LMSException;
	ParticipantContactResponse findParticipantContactDtls(
					final ParticipantContactFindRequest aParticipantContactFindRequest) throws LMSException;
	ParticipantContactResponse findParticipantContactByLmsDatabaseKey(
							final ParticipantContactPersistRequest pParticipantContactPersistRequest) throws LMSException;

	ParticipantContactResponse createParticipantContact(
				final ParticipantContactPersistRequest pParticipantContactPersistRequest)throws LMSException;

	ParticipantContactResponse updateParticipantContact(
				final ParticipantContactPersistRequest pParticipantContactPersistRequest)throws LMSException;

	ParticipantContactResponse deleteParticipantContact(
					final ParticipantContactDeleteRequest pParticipantContactDeleteRequest)throws LMSException;

	ParticipantContactResponse findParticipantContactForEcspcs(
			ParticipantContactEcspcsFindRequest participantContactEcspcsFindRequest)throws LMSException;

    public void  updateParticipantNotification(ParticipantPersistRequest pParticipantPersistRequest) throws LMSException;

    public void deleteParticipantNotification(ParticipantPersistRequest pParticipantPersistRequest) throws LMSException;

    public ParticipantResponse findParticipantforContact(ParticipantFindRequest pParticipantFindRequest) throws LMSException;
	// LMSC-11111 UIS158 Start
    ParticipantResponse findParticipantDetails(
            final ParticipantFindRequest pParticipantFindRequest)
            throws LMSException;
	// LMSC-11111 UIS158 End
}
