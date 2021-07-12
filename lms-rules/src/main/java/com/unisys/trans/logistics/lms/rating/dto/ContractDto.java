/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.TapeRateEntry;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.ContractPriorityType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ContractStatusType;
import com.unisys.trans.logistics.lms.rating.dto.constants.LogicalOperationType;
import com.unisys.trans.logistics.lms.rating.dto.constants.PayCodeType;

/**
 * <code>ContractDto</code> contain details of Contract.
 * <p>
 * This contains all information about Contract.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>agentCommissionInd
 * <li>allDestinationInd
 * <li>allOriginInd
 * <li>biDirectionalInd
 * <li>carriers
 * <li>contractFlightDto
 * <li>contractPriorityType
 * <li>contractRateEntryDtos
 * <li>currencyCode
 * <li>defaultWtUnit
 * <li>destination
 * <li>destOriginPaycode
 * <li>netOnNet
 * <li>useWithAddOns
 * <li>DateRangeDto
 * <li>origin
 * <li>rateConstructionInd
 * <li>routeCompressionInd
 * <li>specialNotes
 * <li>status
 * <li>originDestinationPayCode
 * <li>otherChargeContractId
 * <li>otherChargeContractId
 * <li>destOriginPayCode
 * <li>rateConstructionInd
 * <li>userAudit
 * <li>splcodes
 * <li>splCodeRule
 * <li>enforcedHurdleInd
 * <li>contractId
 * <li>oId
 * </ul>
 */
public class ContractDto extends TapeRateEntry {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8232713167126441378L;

    /**
     * Attribute to hold <code>agentCommissionInd</code> property.
     */

    private boolean agentCommissionInd;

    /**
     * Attribute to hold <code>allDestinationInd</code> property.
     */

    private boolean allDestinationInd;

    /**
     * Attribute to hold <code>allOriginInd</code> property.
     */

    private boolean allOriginInd;

    /**
     * Attribute to hold <code>biDirectionalInd</code> property.
     */

    private boolean biDirectionalInd;

    /**
     * Attribute to hold <code>campaignInd</code> property.
     */

    private boolean campaignInd;

    /**
     * Attribute to hold <code>carriers</code> property.
     */

    private List<String> carriers;

    /**
     * Attribute to hold <code>contractAllotmentDto</code> property.
     */

    private ContractAllotmentDto contractAllotmentDto;

    /**
     * Attribute to hold <code>contractFlightDto</code> property.
     */

    private ContractFlightDto contractFlightDto;

    /**
     * Attribute to hold <code>contractId</code> property.
     */
    private String contractId;

    /**
     * Attribute to hold <code>contractparticipantDtos</code> property.
     */

    private List<ContractParticipantDto> contractParticipantDtos;

    /**
     * Attribute to hold <code>contractPriorityType</code> property.
     */

    private ContractPriorityType contractPriorityType;

    /**
     * Attribute to hold <code>contractRateEntryDtos</code> property.
     */

    private List<ContractRateEntryDto> contractRateEntryDtos;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */

    private String currencyCode;

    /**
     * Attribute to hold <code>dateRangeDto</code> property.
     */

    private DateRangeDto dateRangeDto;

    /**
     * Attribute to hold <code>defaultWtUnit</code> property.
     */

    private WeightUOMType defaultWtUnit;

    /**
     * Attribute to hold <code>destination</code> property.
     */

    private GeographicDataDto destination;

    /**
     * Attribute to hold <code>destOriginPaycode</code> property.
     */

    private PayCodeType destOriginPayCode;

    /**
     * Attribute to hold <code>enforceHurdleInd</code> property.
     */

    private boolean enforceHurdleInd;

    /**
     * Attribute to hold <code>hardDeleteIndicator</code> property.
     */

    private boolean hardDeleteIndicator;

    /**
     * Attribute to hold <code>inputText</code> property.
     */
    private String inputText;

    /**
     * Attribute to hold <code>agentCommissionInd</code> property.
     */

    private List<MultiSegmentRouteDto> multiSegmentRouteDtos;

    /**
     * Attribute to hold <code>allDestinationInd</code> property.
     */
    private boolean netOnNet;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>origin</code> property.
     */

    private GeographicDataDto origin;

    /**
     * Attribute to hold <code>originDestPayCode</code> property.
     */

    private PayCodeType originDestPayCode;

    /**
     * Attribute to hold <code>otherChargeContractId</code> property.
     */
    private String otherChargeContractId;

    /**
     * Attribute to hold <code>rateConstructionInd</code> property.
     */

    private boolean rateConstructionInd;

    /**
     * Attribute to hold <code>routeCompressionInd</code> property.
     */

    private boolean routeCompressionInd;

    /**
     * Attribute to hold <code>specialNotes</code> property.
     */

    private String specialNotes;

    /**
     * Attribute to hold <code>splCodeRule</code> property.
     */

    private LogicalOperationType splCodeRule;

    /**
     * Attribute to hold <code>splCodes</code> property.
     */

    private List<String> splCodes;

    /**
     * Attribute to hold <code>status</code> property.
     */

    private ContractStatusType status;

    /**
     * Attribute to hold <code>carrierCodes</code> property.
     */
    private String updatedJobName;

    /**
     * Attribute to hold <code>userAudit</code> property.
     */
    private UserAuditDto userAudit;

    /**
     * Gets the <code>AgentCommissionInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AgentCommissionInd</code> property.
     */
    public boolean getAgentCommissionInd() {
        return this.agentCommissionInd;
    }

    /**
     * Gets the <code>AllDestinationInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllDestinationInd</code> property.
     */
    public boolean getAllDestinationInd() {
        return this.allDestinationInd;
    }

    /**
     * Gets the <code>AllOriginInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllOriginInd</code> property.
     */

    public boolean getAllOriginInd() {
        return this.allOriginInd;
    }

    /**
     * Gets the <code>BiDirectionalInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>BiDirectionalInd</code> property.
     */
    public boolean getBiDirectionalInd() {
        return this.biDirectionalInd;
    }

    /**
     * Gets the <code>Carriers</code> property.
     * 
     * 
     * @return the current value of the <code>Carriers</code> property.
     */
    public List<String> getCarriers() {
        return this.carriers;
    }

    /**
     * Gets the <code>ContractAllotmentDto </code> data transfer object.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractAllotmentDto
     *         ContractAllotmentDto}</code><br>
     *         the current value of <code>ContractAllotmentDto</code> data
     *         transfer object.<br>
     */
    public ContractAllotmentDto getContractAllotmentDto() {
        return this.contractAllotmentDto;
    }

    /**
     * Gets the <code>ContractFlightDto </code> data transfer object.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.ContractFlightDto
     *         ContractFlightDto}</code><br>
     *         the current value of <code>ContractFlightDto</code> data transfer
     *         object.<br>
     */
    public ContractFlightDto getContractFlightDto() {
        return this.contractFlightDto;
    }

    /**
     * Gets the <code>ContractId</code> property.
     * <p>
     * <b>Format: </b><br>
     * size: 1-12 ,AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * MSPORD01
     * <p>
     * 
     * @return the current value of the <code>ContractId</code> property.
     */
    public String getContractId() {
        return this.contractId;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.rating.dto.ContractParticipantDto
     * ContractParticipantDto} containing <code>ContractparticipantDtos</code> details.
     * <p>
     * 
     * @return the current value of <code>ContractparticipantDtos</code> details.
     */
    public List<ContractParticipantDto> getContractParticipantDtos() {
        return this.contractParticipantDtos;
    }

    /**
     * Gets the <code>ContractPriorityType</code> property.
     * <p>
     * Indicator that denotes the ContractPriorityType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>ONE,
     * <li>TWO,
     * <li>THREE,
     * <li>FOUR,
     * <li>FIVE,
     * <li>SIX,
     * <li>SEVEN,
     * <li>EIGHT,
     * <li>NINE;
     * <p>
     * <b>Format: </b><br>
     * Alphabets<br>
     * <p>
     * <b>Example: </b><br>
     * EIGHT<br>
     * <p>
     * 
     * @return the current value of <code>ContractPriorityType</code> property.<br>
     */
    public ContractPriorityType getContractPriorityType() {
        return this.contractPriorityType;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.rating.dto.ContractRateEntryDto
     * ContractRateEntryDto} containing <code>ContractRateEntryDtos</code> details.
     * <p>
     * 
     * @return the current value of <code>ContractRateEntryDtos</code> details.
     */
    public List<ContractRateEntryDto> getContractRateEntryDtos() {
        return this.contractRateEntryDtos;
    }

    /**
     * Gets the <code>CurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of the <code>CurrencyCode</code> property.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Gets the <code>DateRangeDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>DateRangeDto</code> property.<br>
     */
    public DateRangeDto getDateRangeDto() {
        return this.dateRangeDto;
    }

    /**
     * Gets the <code>DefaultWtUnit</code> property.
     * <p>
     * <b>Format: </b><br>
     * KG or LB List
     * <p>
     * <b>Example: </b><br>
     * KG
     * <p>
     * 
     * @return the current value of the <code>DefaultWtUnit</code> property.
     */
    public WeightUOMType getDefaultWtUnit() {
        return this.defaultWtUnit;
    }

    /**
     * Gets the <code>GeographicDataDto </code> data transfer object.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     *         GeographicDataDto}</code><br>
     *         the current value of <code>Destination</code> data transfer
     *         object.<br>
     */
    public GeographicDataDto getDestination() {
        if (this.destination == null) {
            this.destination = new GeographicDataDto();
        }
        return this.destination;
    }

    /**
     * Gets the <code>PayCodeType</code> property.
     * <p>
     * Indicator that denotes the PayCodeType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>P-PREPAID,
     * <li>C-COLLECT,
     * <li>E-EITHER;
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * P<br>
     * <p>
     * 
     * @return the current value of <code>DestOriginPaycode</code> property.<br>
     */
    public PayCodeType getDestOriginPayCode() {
        return this.destOriginPayCode;
    }

    /**
     * Gets the <code>EnforceHurdleInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>EnforceHurdleInd</code> property.
     */
    public boolean getEnforceHurdleInd() {
        return this.enforceHurdleInd;
    }

    /**
     * Gets the <code>inputText</code> property.
     * <p>
     * 
     * @return the current value of the <code>inputText</code> property.
     */
    public String getInputText() {
        return this.inputText;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.rating.dto.MultiSegmentRouteDto
     * MultiSegmentRouteDto} containing <code>MultiSegmentRouteDtos</code> details.
     * <p>
     * 
     * @return the current value of <code>MultiSegmentRouteDtos</code> details.
     */
    public List<MultiSegmentRouteDto> getMultiSegmentRouteDtos() {
    	return this.multiSegmentRouteDtos;
    }

    /**
     * Gets the <code>netOnNet</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>netOnNet</code> property.
     */
    public boolean getNetOnNet() {
        return this.netOnNet;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>GeographicDataDto </code> data transfer object.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     *         GeographicDataDto}</code><br>
     *         the current value of <code>Origin</code> data transfer object.<br>
     */
    public GeographicDataDto getOrigin() {
        if (this.origin == null) {
            this.origin = new GeographicDataDto();
        }
        return this.origin;
    }

    /**
     * Gets the <code>OriginDestPayCode</code> property.
     * <p>
     * Indicator that denotes the PayCodeType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>P-PREPAID,
     * <li>C-COLLECT,
     * <li>E-EITHER;
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * P<br>
     * <p>
     * 
     * @return the current value of <code>OriginDestPayCode</code> property.<br>
     */

    public PayCodeType getOriginDestPayCode() {
        return this.originDestPayCode;
    }

    /**
     * Gets the <code>otherChargeContractId</code> property.
     * <p>
     * <b>Format: </b><br>
     * size: 1-12 ,AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * OCC1
     * <p>
     * 
     * @return the current value of the <code>otherChargeContractId</code> property.
     */
    public String getOtherChargeContractId() {
        return this.otherChargeContractId;
    }

    /**
     * Gets the <code>RateConstructionInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>RateConstructionInd</code> property.
     */

    public boolean getRateConstructionInd() {
        return this.rateConstructionInd;
    }

    /**
     * Gets the <code>RouteCompressionInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>RouteCompressionInds</code> property.
     */

    public boolean getRouteCompressionInd() {
        return this.routeCompressionInd;
    }

    /**
     * Gets the <code>SpecialNotes</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-240 Free-form text
     * <p>
     * <b>Example: </b><br>
     * A contract is only applicable to one participant or to a group of participants. Additionally, the
     * automation of contracts provides the base from which a contractual rate is calculated during shipment
     * pricing.
     * <p>
     * 
     * @return the current value of the <code>SpecialNotes</code> property.
     */
    public String getSpecialNotes() {
        return this.specialNotes;
    }

    /**
     * Gets the <code>LogicalOperationType</code> property.
     * <p>
     * Indicator that denotes the LogicalOperationType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>O- OR,
     * <li>A-AND,
     * <li>N-NOT;
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * O<br>
     * <p>
     * 
     * @return the current value of <code>LogicalOperationType</code> property.<br>
     */

    public LogicalOperationType getSplCodeRule() {
        return this.splCodeRule;
    }

    /**
     * Gets the List of <code>SplCodes</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * ABC
     * <p>
     * 
     * @return the current value of the <code>SplCodes</code> property.
     */
    public List<String> getSplCodes() {
        return this.splCodes;
    }

    /**
     * Gets the <code>ContractStatusType</code> property.
     * <p>
     * Indicator that denotes the ContractStatusType.
     * <p>
     * <li>ACTIVE - A
     * <li>DELETED - D
     * <li>HISTORY - H
     * <li>PENDING - P
     * <li>EXPIRED - E
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * A<br>
     * <p>
     * 
     * @return the current value of <code>Status</code> property.<br>
     */

    public ContractStatusType getStatus() {
        return this.status;
    }

    /**
     * Gets the <code>updatedJobName</code> property.
     * 
     * 
     * @return the updatedJobName.
     */
    public String getUpdatedJobName() {
        return this.updatedJobName;
    }

    /**
     * Gets the <code>UserAuditDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>userAudit</code> property.
     */

    public UserAuditDto getUserAudit() {
        if (this.userAudit == null) {
            this.userAudit = new UserAuditDto();
        }
        return this.userAudit;
    }

    /**
     * Gets the <code>CampaignInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>CampaignInd</code> property.
     */
    public boolean getCampaignInd() {
        return this.campaignInd;
    }

    public boolean isHardDeleteIndicator() {
        return hardDeleteIndicator;
    }

    /**
     * Sets the <code>AgentCommissionInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAgentCommissionInd
     *            the current value of the <code>AgentCommissionInd</code> property.
     */
    public void setAgentCommissionInd(final boolean pAgentCommissionInd) {
        this.agentCommissionInd = pAgentCommissionInd;
    }

    /**
     * Sets the <code>AllDestinationInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllDestinationInd
     *            the current value of the <code>AllDestinationInd</code> property.
     */
    public void setAllDestinationInd(final boolean pAllDestinationInd) {
        this.allDestinationInd = pAllDestinationInd;
    }

    /**
     * Sets the <code>AllOriginInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllOriginInd
     *            the current value of the <code>AllOriginInd</code> property.
     */

    public void setAllOriginInd(final boolean pAllOriginInd) {
        this.allOriginInd = pAllOriginInd;
    }

    /**
     * Sets the <code>BiDirectionalInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pBiDirectionalInd
     *            the current value of the <code>BiDirectionalInd</code> property.
     */
    public void setBiDirectionalInd(final boolean pBiDirectionalInd) {
        this.biDirectionalInd = pBiDirectionalInd;
    }

    /**
     * Sets the <code>CampaignInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pCampaignInd
     *            the current value of the <code>CampaignInd</code> property.
     */
    public void setCampaignInd(boolean pCampaignInd) {
        this.campaignInd = pCampaignInd;
    }

    /**
     * Sets the <code>Carriers</code> property.
     * 
     * @param pCarriers
     *            the new value of the <code>Carriers</code> property.
     */

    public void setCarriers(final List<String> pCarriers) {
        this.carriers = pCarriers;
    }

    /**
     * Sets the <code>ContractAllotmentDto</code> data transfer object.
     * <p>
     * 
     * @param pContractAllotmentDto
     *            holds the new value of <code>ContractAllotmentDto</code> data
     *            transfer object.<br>
     */

    public void setContractAllotmentDto(
                final ContractAllotmentDto pContractAllotmentDto) {
        this.contractAllotmentDto = pContractAllotmentDto;
    }

    /**
     * Sets the <code>ContractFlightDto</code> data transfer object.
     * <p>
     * 
     * @param pContractFlightDto
     *            holds the new value of <code>ContractFlightDto</code> data
     *            transfer object.<br>
     */

    public void setContractFlightDto(final ContractFlightDto pContractFlightDto) {
        this.contractFlightDto = pContractFlightDto;
    }

    /**
     * Sets the <code>contractId</code> property.
     * <p>
     * <b>Format: </b><br>
     * size: 1-12 ,AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * MSPORD01
     * <p>
     * 
     * @param pContractId
     *            the new list of <code>ContractId</code> associated
     *            with Contract.<br>
     */

    public void setContractId(final String pContractId) {
        this.contractId = pContractId.toUpperCase(Locale.US);
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.ContractParticipantDto
     * ContractParticipantDto} containing <code>participantRemarks</code> details.
     * <p>
     * 
     * @param pContractParticipantDtos
     *            holds the new value of <code>contractparticipantDtos</code> type
     *            details.<br>
     */

    public void setContractParticipantDtos(
                final List<ContractParticipantDto> pContractParticipantDtos) {
        this.contractParticipantDtos = pContractParticipantDtos;
    }

    /**
     * Sets the <code>ContractPriorityType</code> property.
     * <p>
     * Indicator that denotes the ContractPriorityType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>ONE,
     * <li>TWO,
     * <li>THREE,
     * <li>FOUR,
     * <li>FIVE,
     * <li>SIX,
     * <li>SEVEN,
     * <li>EIGHT,
     * <li>NINE;
     * <p>
     * <b>Format: </b><br>
     * Alphabets<br>
     * <p>
     * <b>Example: </b><br>
     * EIGHT<br>
     * <p>
     * * @param pContractPriorityType <code>{@link ContractPriorityType}</code> holds the new value of
     * <code>ContractPriorityType</code> type details. <br>
     */

    public void setContractPriorityType(
                final ContractPriorityType pContractPriorityType) {
        this.contractPriorityType = pContractPriorityType;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.ContractRateEntryDto
     * ContractRateEntryDto} containing <code>ContractRateEntryDto</code> details.
     * <p>
     * 
     * @param pContractRateEntryDtos
     *            holds the new value of <code>ContractRateEntryDtos</code> type
     *            details.<br>
     */
    public void setContractRateEntryDtos(
                final List<ContractRateEntryDto> pContractRateEntryDtos) {
        this.contractRateEntryDtos = pContractRateEntryDtos;
    }

    /**
     * Sets the <code>CurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @param pCurrencyCode
     *            the current value of the <code>CurrencyCode</code> property.
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = ContractUtility.convertToUpperCase(pCurrencyCode);
    }

    /**
     * Sets the <code>DateRangeDto</code> property.
     * <p>
     * 
     * @param pDateRangeDto
     *            the current value of the <code>DateRangeDto</code> property.<br>
     */

    public void setDateRangeDto(final DateRangeDto pDateRangeDto) {
        this.dateRangeDto = pDateRangeDto;
    }

    /**
     * Sets the <code>DefaultWtUnit</code> property.
     * <p>
     * <b>Format: </b><br>
     * KG or LB List
     * <p>
     * <b>Example: </b><br>
     * KG
     * <p>
     * 
     * @param pDefaultWtUnit
     *            <code>{@link WeightUOMType}</code> the current value of the <code>DefaultWtUnit</code>
     *            property.
     */
    public void setDefaultWtUnit(final WeightUOMType pDefaultWtUnit) {
        this.defaultWtUnit = pDefaultWtUnit;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     * GeographicDataDto} containing <code>Destination</code> details.
     * <p>
     * 
     * @param pDestination
     *            holds the new value of <code>GeographicDataDto</code> type
     *            details.<br>
     */
    public void setDestination(final GeographicDataDto pDestination) {
        this.destination = pDestination;
    }

    /**
     * Sets the <code>DestOriginPaycode</code> property.
     * <p>
     * Indicator that denotes the PayCodeType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>P-PREPAID,
     * <li>C-COLLECT,
     * <li>E-EITHER;
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * P<br>
     * <p>
     * 
     * @param pDestOriginPayCode
     *            <code>{@link PayCodeType}</code> holds the new value of <code> DestOriginPaycode</code>
     *            property.<br>
     */

    public void setDestOriginPayCode(final PayCodeType pDestOriginPayCode) {
        this.destOriginPayCode = pDestOriginPayCode;
    }

    /**
     * Sets the <code>EnforceHurdleInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pEnforceHurdleInd
     *            the current value of the <code>EnforceHurdleInd</code> property.
     */
    public void setEnforceHurdleInd(final boolean pEnforceHurdleInd) {
        this.enforceHurdleInd = pEnforceHurdleInd;
    }

    public void setHardDeleteIndicator(boolean hardDeleteIndicator) {
        this.hardDeleteIndicator = hardDeleteIndicator;
    }

    /**
     * Sets the <code>inputText</code> property.
     * <p>
     * 
     * @param pInputText
     *            holds the new value of <code>inputText</code> property.<br>
     */
    public void setInputText(final String pInputText) {
        this.inputText = pInputText;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.MultiSegmentRouteDto
     * MultiSegmentRouteDto} containing <code>MultiSegmentRouteDtos</code> details.
     * <p>
     * 
     * @param pMultiSegmentRouteDtos
     *            holds the new value of <code>MultiSegmentRouteDtos</code> type
     *            details.<br>
     */
    public void setMultiSegmentRouteDtos(
                final List<MultiSegmentRouteDto> pMultiSegmentRouteDtos) {
        this.multiSegmentRouteDtos = pMultiSegmentRouteDtos;
    }

    /**
     * Sets the <code>netOnNet</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pNetOnNet
     *            the current value of the <code>netOnNet</code> property.
     */
    public void setNetOnNet(final boolean pNetOnNet) {
        this.netOnNet = pNetOnNet;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     * GeographicDataDto} containing <code>Destination</code> details.
     * <p>
     * 
     * @param pOrigin
     *            holds the new value of <code>GeographicDataDto</code> type
     *            details.<br>
     */

    public void setOrigin(final GeographicDataDto pOrigin) {
        this.origin = pOrigin;
    }

    /**
     * Sets the <code>OriginDestPayCode</code> property.
     * <p>
     * Indicator that denotes the PayCodeType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>P-PREPAID,
     * <li>C-COLLECT,
     * <li>E-EITHER;
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * P<br>
     * <p>
     * 
     * @param pOriginDestPayCode
     *            <code>{@link PayCodeType}</code> holds the new value of <code> OriginDestPayCode</code>
     *            property.<br>
     */

    public void setOriginDestPayCode(final PayCodeType pOriginDestPayCode) {
        this.originDestPayCode = pOriginDestPayCode;
    }

    /**
     * Sets the <code>otherChargeContractId</code> property.
     * <p>
     * <b>Format: </b><br>
     * size: 1-12 ,AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * OCC1
     * <p>
     * 
     * @param pOtherChargeContractId
     *            the new list of <code>otherChargeContractId</code> associated
     *            with Contract.<br>
     */

    public void setOtherChargeContractId(final String pOtherChargeContractId) {
        this.otherChargeContractId = ContractUtility.convertToUpperCase(pOtherChargeContractId);
    }

    /**
     * Sets the <code>RateConstructionInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pRateConstructionInd
     *            the current value of the <code>RateConstructionInd</code> property.
     */

    public void setRateConstructionInd(final boolean pRateConstructionInd) {
        this.rateConstructionInd = pRateConstructionInd;
    }

    /**
     * Sets the <code>RouteCompressionInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pRouteCompressionInd
     *            the current value of the <code>RouteCompressionInd</code> property.
     */

    public void setRouteCompressionInd(final boolean pRouteCompressionInd) {
        this.routeCompressionInd = pRouteCompressionInd;
    }

    /**
     * Sets the <code>SpecialNotes</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-240 Free-form text
     * <p>
     * <b>Example: </b><br>
     * A contract is only applicable to one participant or to a group of participants. Additionally, the
     * automation of contracts provides the base from which a contractual rate is calculated during shipment
     * pricing.
     * <p>
     * 
     * @param pSpecialNotes
     *            the current value of the <code>SpecialNotes</code> property.
     */

    public void setSpecialNotes(final String pSpecialNotes) {
        this.specialNotes = pSpecialNotes;
    }

    /**
     * Sets the <code>LogicalOperationType</code> property.
     * <p>
     * Indicator that denotes the LogicalOperationType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>O- OR,
     * <li>A-AND,
     * <li>N-NOT;
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * O<br>
     * <p>
     * 
     * @param pSplCodeRule
     *            <code>{@link LogicalOperationType}</code> the current value of the <code>SplCodeRule</code>
     *            property.
     */

    public void setSplCodeRule(final LogicalOperationType pSplCodeRule) {
        this.splCodeRule = pSplCodeRule;
    }

    /**
     * Sets the List of <code>SplCodes</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * ABC
     * <p>
     * *
     * 
     * @param pSplCodes
     *            the current value of the <code>SplCodes</code> property.
     */

    public void setSplCodes(final List<String> pSplCodes) {
        this.splCodes = pSplCodes;
    }

    /**
     * Sets the <code>ContractStatusType</code> property.
     * <p>
     * Indicator that denotes the ContractStatusType.
     * <p>
     * <li>ACTIVE - A
     * <li>DELETED - D
     * <li>HISTORY - H
     * <li>PENDING - P
     * <li>EXPIRED - E
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * A<br>
     * <p>
     * 
     * @param pStatus
     *            <code>{@link ContractStatusType}</code> the current value of the <code>Status</code>
     *            property.
     */

    public void setStatus(final ContractStatusType pStatus) {
        this.status = pStatus;
    }

    /**
     * Sets the <code>updatedJobName</code> property.
     * 
     * @param pUpdatedJobName
     *            the updatedJobName.
     */

    public void setUpdatedJobName(final String pUpdatedJobName) {
        this.updatedJobName = pUpdatedJobName;
    }

    /**
     * Sets the <code>UserAuditDto</code> property.
     * <p>
     * 
     * @param pUserAudit
     *            the current value of the <code>UserAuditDto</code> property.<br>
     * 
     */

    public void setUserAudit(final UserAuditDto pUserAudit) {
        this.userAudit = pUserAudit;
    }

    /**
     * This method overrides toString property.
     * <p>
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the string value.<br>
     *         </p>
     */
    @Override
    public String toString() {
        return "ContractDto [agentCommissionInd=" + agentCommissionInd + ", allDestinationInd="
                    + allDestinationInd + ", allOriginInd=" + allOriginInd + ", biDirectionalInd="
                    + biDirectionalInd + ", carriers=" + carriers + ", contractAllotmentDto="
                    + contractAllotmentDto + ", contractFlightDto=" + contractFlightDto + ", contractId="
                    + contractId + ", contractParticipantDtos=" + contractParticipantDtos
                    + ", contractPriorityType=" + contractPriorityType + ", contractRateEntryDtos="
                    + contractRateEntryDtos + ", currencyCode=" + currencyCode + ", dateRangeDto="
                    + dateRangeDto + ", defaultWtUnit=" + defaultWtUnit + ", destination=" + destination
                    + ", destOriginPayCode=" + destOriginPayCode + ", enforceHurdleInd=" + enforceHurdleInd
                    + ", multiSegmentRouteDtos=" + multiSegmentRouteDtos + ", oId=" + oId + ", origin="
                    + origin + ", originDestPayCode=" + originDestPayCode + ", rateConstructionInd="
                    + rateConstructionInd + ", routeCompressionInd=" + routeCompressionInd
                    + ", specialNotes=" + specialNotes + ", splCodeRule=" + splCodeRule + ", splCodes="
                    + splCodes + ", status=" + status + ", userAudit=" + userAudit + "]";
    }
    
    //FIS150a
    
    private  List<String> contractLines;

	public List<String> getContractLines() {
		return contractLines;
	}

	public void setContractLines(List<String> contractLines) {
		this.contractLines = contractLines;
	}
    
    

}