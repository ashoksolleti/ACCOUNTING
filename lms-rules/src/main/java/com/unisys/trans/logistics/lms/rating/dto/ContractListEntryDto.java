/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.unisys.trans.logistics.lms.framework.constants.GeographicType;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.AllotmentCategoryType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ContractPriorityType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ContractStatusType;
import com.unisys.trans.logistics.lms.rating.dto.constants.PayCodeType;

/**
 * <code>ContractListEntryDto</code> contain details of ContractListEntries.
 * <p>
 * This contains all information about ContractListEntries.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>agentCommissionInd
 * <li>biDirectionalInd
 * <li>carriers
 * <li>contractParticipantDtos
 * <li>contractPriorityType
 * <li>contractVersion
 * <li>destination
 * <li>destOriginPayCode
 * <li>DateRangeDto
 * <li>multiSegmentRouteInd
 * <li>origin
 * <li>error
 * <li>originDestPayCode
 * <li>routeCompressionInd
 * <li>specialNotes
 * <li>status
 * <li>userAudit
 * <li>allotmentId
 * <li>allotmentType
 * <li>oId
 * </ul>
 */
public class ContractListEntryDto extends PersistenceObjectDto {

    /**
     * Attribute to hold <code>EMPTY_STRING</code> property.
     */
    private static final String EMPTY_STRING = "";

    /**
     * Attribute to hold <code>NO_LITERAL</code> property.
     */
    private static final String NO_LITERAL = "No";

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7560972443132833801L;

    /**
     * Attribute to hold <code>YES_LITERAL</code> property.
     */
    private static final String YES_LITERAL = "yes";

    /**
     * Attribute to hold <code>agentCommissionInd</code> property.
     */
    private boolean agentCommissionInd;

    /**
     * Attribute to hold <code>flight</code> property.
     */
    private String allFlight;

    /**
     * Attribute to hold <code>allotmentId</code> property.
     */
    private String allotmentId;

    /**
     * Attribute to hold <code>allotmentType</code> property.
     */
    private AllotmentCategoryType allotmentType;

    /**
     * Attribute to hold <code>biDirectionalInd</code> property.
     */
    private boolean biDirectionalInd;

    /**
     * Attribute to hold <code>campaignInd</code> property.
     */
    private boolean campaignInd;

    /**
     * Attribute to hold <code>carrier</code> property.
     */
    private String carrier;

    /**
     * Attribute to hold <code>contractId</code> property.
     */
    private String contractId;

    /**
     * Attribute to hold <code>contractParticipantDto</code> property.
     */
    private ContractParticipantDto contractParticipantDto;

    /**
     * Attribute to hold <code>contractPriorityType</code> property.
     */
    private String contractPriorityType;

    /**
     * Attribute to hold <code>contractVersion</code> property.
     */
    private String contractVersion;

    /**
     * Attribute to hold <code>dateRangeDto</code> property.
     */
    private DateRangeDto dateRangeDto;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private String destination;

    private GeographicType destinationType;

    /**
     * Attribute to hold <code>destOriginPayCode</code> property.
     */
    private PayCodeType destOriginPayCode;

    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Attribute to hold <code>expirationDateAsString</code> property.
     */
    private String expirationDateAsString;

    /**
     * Attribute to hold <code>flight</code> property.
     */
    private String flight;

    /**
     * Attribute to hold <code>flightAsCSVString</code> property.
     */
    private String flightAsCSVString;

    /**
     * Attribute to hold <code>multiSegmentRouteInd</code> property.
     */
    private boolean multiSegmentRouteInd;

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
    private String origin;

    /**
     * Attribute to hold <code>originDestPayCode</code> property.
     */
    private PayCodeType originDestPayCode;

    private GeographicType originType;

    /**
     * Attribute to hold <code>otherChargeContractId</code> property.
     */
    private String otherChargeContractId;

    /**
     * Attribute to hold <code>routeCompressionInd</code> property.
     */
    private boolean routeCompressionInd;

    /**
     * Attribute to hold <code>secondaryParticipantDto1</code> property.
     */
    private ContractParticipantDto secondaryParticipantDto1;

    /**
     * Attribute to hold <code>secondaryParticipantDto2</code> property.
     */
    private ContractParticipantDto secondaryParticipantDto2;

    /**
     * Attribute to hold <code>specialHandlingCodeRule</code> property.
     */
    private String specialHandlingCodeRule;

    /**
     * Attribute to hold <code>specialHandlingCodes</code> property.
     */
    private String specialHandlingCodes;

    /**
     * Attribute to hold <code>specialNotes</code> property.
     */
    private boolean specialNotes;

    /**
     * Attribute to hold <code>status</code> property.
     */
    private ContractStatusType status;

    /**
     * Attribute to hold <code>userAudit</code> property.
     */
    private UserAuditDto userAudit;

    /**
     * Attribute to hold <code>allDestinationInd</code> property.
     */
    private boolean useWithAddOns;
    /**
     * Attribute to hold <code>enforceHurdleRateInd</code> property.
     */
    private boolean enforceHurdleRateInd;

    /**
     * Attribute to hold <code>sunday</code> property.
     */
    private String sunday;

    /**
     * Attribute to hold <code>monday</code> property.
     */
    private String monday;

    /**
     * Attribute to hold <code>tuesday</code> property.
     */
    private String tuesday;

    /**
     * Attribute to hold <code>wednesday</code> property.
     */
    private String wednesday;

    /**
     * Attribute to hold <code>thursday</code> property.
     */
    private String thursday;

    /**
     * Attribute to hold <code>friday</code> property.
     */
    private String friday;

    /**
     * Attribute to hold <code>saturday</code> property.
     */
    private String saturday;
    
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
     * Gets the <code>allFlight</code> property.
     * 
     * 
     * @return the current value of the <code>allFlight</code> property.
     */
    public String getAllFlight() {
        return this.allFlight;
    }

    /**
     * Gets the <code>allotmentId</code> property.
     * <p>
     * 
     * @return the current value of the <code>allotmentId</code> property.<br>
     */
    public String getAllotmentId() {
        return this.allotmentId;
    }

    /**
     * Gets the <code>allotmentType</code> property.
     * <p>
     * 
     * @return the current value of the <code>allotmentType</code> property.<br>
     */
    public AllotmentCategoryType getAllotmentType() {
        return this.allotmentType;
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

    /**
     * Gets the <code>Carrier</code> property.
     * 
     * 
     * @return the current value of the <code>Carrier</code> property.
     */

    public String getCarrier() {
        return this.carrier;
    }

    /**
     * Gets the <code>contractId</code> property.
     * 
     * 
     * @return the current value of the <code>contractId</code> property.
     */
    public String getContractId() {
        return this.contractId;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.rating.dto.ContractParticipantDto
     * ContractParticipantDto} containing <code>ContractparticipantDto</code> details.
     * <p>
     * 
     * @return the current value of <code>ContractparticipantDto</code> details.
     */
    public ContractParticipantDto getContractParticipantDto() {

        if (this.contractParticipantDto == null) {
            this.contractParticipantDto = new ContractParticipantDto();
        }
        return this.contractParticipantDto;
    }

    /**
     * Gets the <code>ContractPriorityType</code> property.
     * <p>
     * Indicator that denotes the ContractPriorityType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>I- International
     * <li>D- Domestic
     * <li>B- Both
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * I<br>
     * <p>
     * 
     * @return the current value of <code>ContractPriorityType</code> property.<br>
     */

    public String getContractPriorityType() {
        return this.contractPriorityType;
    }

    /**
     * Gets the <code>contractVersion</code> property.
     * <p>
     * 
     * @return the current value of <code>contractVersion</code> property.<br>
     */
    public String getContractVersion() {
        return this.contractVersion;
    }

    /**
     * Gets the <code>DateRangeDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>DateRangeDto</code> property.<br>
     */
    public DateRangeDto getDateRangeDto() {
        if (this.dateRangeDto == null) {
            this.dateRangeDto = new DateRangeDto();
        }
        return this.dateRangeDto;
    }

    /**
     * Gets the <code>Destination</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 23FGS
     * <p>
     * 
     * @return the current value of the <code>Destination</code> property.
     */

    public String getDestination() {
        return this.destination;
    }

    public GeographicType getDestinationType() {
        return this.destinationType;
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
     * @return the current value of <code>destOriginPayCode</code> property.<br>
     */

    public PayCodeType getDestOriginPayCode() {
        return this.destOriginPayCode;
    }

    /**
     * Gets the <code>expirationDateAsString</code> property.
     * 
     * 
     * @return the current value of the <code>expirationDateAsString</code> property.
     */
    public String getExpirationDateAsString() {
        return this.expirationDateAsString;
    }

    /**
     * Gets the <code>flight</code> property.
     * 
     * 
     * @return the current value of the <code>flight</code> property.
     */
    public String getFlight() {
        return this.flight;
    }

    /**
     * Gets the <code>flightAsCSVString</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightAsCSVString</code> property.
     */
    public String getFlightAsCSVString() {
        return this.flightAsCSVString;
    }

    /**
     * Gets the <code>MultiSegmentRouteInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>MultiSegmentRouteInd</code> property.
     */
    public boolean getMultiSegmentRouteInd() {
        return this.multiSegmentRouteInd;
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
     * Gets the <code>Origin</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 23FG
     * <p>
     * 
     * @return the current value of the <code>Origin</code> property.
     */

    public String getOrigin() {
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

    public GeographicType getOriginType() {
        return this.originType;
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
     * Gets the <code>secondaryParticipantDto1</code> property.
     * <p>
     * 
     * @return the current value of the <code>secondaryParticipantDto1</code> property.<br>
     */
    public ContractParticipantDto getSecondaryParticipantDto1() {
        return this.secondaryParticipantDto1;
    }

    /**
     * Gets the <code>ContractParticipantDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>ContractParticipantDto</code> property.<br>
     */
    public ContractParticipantDto getSecondaryParticipantDto2() {
        return this.secondaryParticipantDto2;
    }

    /**
     * Gets the <code>specialHandlingCodeRule</code> property.
     * 
     * 
     * @return the current value of the <code>specialHandlingCodeRule</code> property.
     */
    public String getSpecialHandlingCodeRule() {
        return this.specialHandlingCodeRule;
    }

    /**
     * Gets the <code>specialHandlingCodes</code> property.
     * 
     * 
     * @return the current value of the <code>specialHandlingCodes</code> property.
     */
    public String getSpecialHandlingCodes() {
        return this.specialHandlingCodes;
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
    public boolean getSpecialNotes() {
        return this.specialNotes;
    }

    /**
     * Gets the <code>Status</code> property.
     * <p>
     * <b>Format: </b><br>
     * 6-7 Alphabets <b>Example: </b><br>
     * ACTIVE
     * <p>
     * 
     * @return the current value of the <code>Status</code> property.
     */
    public ContractStatusType getStatus() {
        return this.status;
    }

    /**
     * Gets the <code>UserAuditDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>userAudit</code> property.
     */

    public UserAuditDto getUserAudit() {
        return this.userAudit;
    }

    /**
     * Gets the <code>useWithAddOns</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>useWithAddOns</code> property.
     */
    public boolean getUseWithAddOns() {
        return this.useWithAddOns;
    }

    /**
     * Gets the <code>error</code> property.
     * <p>
     * 
     * @return the current value of the <code>error</code> property.
     */
    public boolean isError() {
        return this.error;
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
     * Sets the <code>allFlight</code> property.
     * 
     * @param pAllFlight
     *            the new value of the <code>allFlight</code> property.
     */
    public void setAllFlight(final String pAllFlight) {
        this.allFlight = pAllFlight;
    }

    /**
     * Sets the <code>allotmentId</code> property.
     * <p>
     * 
     * @param pAllotmentId
     *            the current value of the <code>allotmentId</code> property.<br>
     */
    public void setAllotmentId(final String pAllotmentId) {
        this.allotmentId = pAllotmentId;
    }

    /**
     * Sets the <code>allotmentType</code> property.
     * <p>
     * 
     * @param pAllotmentType
     *            the current value of the <code>allotmentType</code> property.<br>
     */
    public void setAllotmentType(final AllotmentCategoryType pAllotmentType) {
        this.allotmentType = pAllotmentType;
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
     * Sets the <code>carrier</code> property.
     * 
     * @param pCarrier
     *            the new value of the <code>carrier</code> property.
     */
    public void setCarrier(final String pCarrier) {
        this.carrier = ContractUtility.convertToUpperCase(pCarrier);
    }

    /**
     * Sets the <code>contractId</code> property.
     * 
     * @param pContractId
     *            the new value of the <code>contractId</code> property.
     */
    public void setContractId(final String pContractId) {
        this.contractId = ContractUtility.convertToUpperCase(pContractId);
    }

    /**
     * Sets the <code>contractParticipantDto</code> property.
     * 
     * @param pContractParticipantDto
     *            the new value of the <code>contractParticipantDto</code> property.
     */
    public void setContractParticipantDto(
                final ContractParticipantDto pContractParticipantDto) {
        this.contractParticipantDto = pContractParticipantDto;
    }

    /**
     * Sets the <code>ContractPriorityType</code> property.
     * <p>
     * Indicator that denotes the ContractPriorityType.
     * <p>
     * <b> Possible values :</b><br>
     * <li>I- International
     * <li>D- Domestic
     * <li>B- Both
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * I<br>
     * <p>
     * * @param pContractPriorityType <code>{@link ContractPriorityType}</code> holds the new value of
     * <code>ContractPriorityType</code> type details. <br>
     */
    public void setContractPriorityType(final String pContractPriorityType) {
        this.contractPriorityType = pContractPriorityType;
    }

    /**
     * Sets the <code>contractVersion</code> property.
     * 
     * @param pContractVersion
     *            the new value of the <code>contractVersion</code> property.
     */
    public void setContractVersion(final String pContractVersion) {
        this.contractVersion = pContractVersion;
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
     * Sets the <code>Destination</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 23FGS
     * <p>
     * 
     * @param pDestination
     *            the current value of the <code>Destination</code> property.
     */

    public void setDestination(final String pDestination) {
        this.destination = ContractUtility.convertToUpperCase(pDestination);
    }

    public void setDestinationType(final GeographicType pDestinationType) {
        this.destinationType = pDestinationType;
    }

    /**
     * Sets the <code>destOriginPayCode</code> property.
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
     *            holds the new value of <code>destOriginPayCode</code> property.<br>
     */

    public void setDestOriginPayCode(final PayCodeType pDestOriginPayCode) {
        this.destOriginPayCode = pDestOriginPayCode;
    }

    /**
     * Sets the <code>error</code> details.
     * <p>
     * 
     * @param pError
     *            holds the new value of <code>error</code> type details.<br>
     */
    public void setError(final boolean pError) {
        this.error = pError;
    }

    /**
     * Sets the <code>expirationDateAsString</code> property.
     * <p>
     * 
     * @param pExpirationDateAsString
     *            the current value of the <code>expirationDateAsString</code> property.<br>
     */
    public void setExpirationDateAsString(final String pExpirationDateAsString) {
        this.expirationDateAsString = pExpirationDateAsString;
    }

    /**
     * Sets the <code>flight</code> property.
     * 
     * @param pFlight
     *            the new value of the <code>flight</code> property.
     */
    public void setFlight(final String pFlight) {
        this.flight = pFlight;
    }

    /**
     * Sets the <code>flightAsCSVString</code> property.
     * <p>
     * 
     * @param pFlightAsCSVString
     *            the current value of the <code>flightAsCSVString</code> property.<br>
     */
    public void setFlightAsCSVString(final String pFlightAsCSVString) {
        this.flightAsCSVString = pFlightAsCSVString;
    }

    /**
     * Sets the <code>MultiSegmentRouteInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pMultiSegmentRouteInd
     *            the current value of the <code>MultiSegmentRouteInd</code> property.
     */

    public void setMultiSegmentRouteInd(final boolean pMultiSegmentRouteInd) {
        this.multiSegmentRouteInd = pMultiSegmentRouteInd;
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
     * Sets the <code>Origin</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 23FG
     * <p>
     * 
     * @param pOrigin
     *            the current value of the <code>Origin</code> property.
     */

    public void setOrigin(final String pOrigin) {
        this.origin = ContractUtility.convertToUpperCase(pOrigin);
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

    public void setOriginType(final GeographicType pOriginType) {
        this.originType = pOriginType;
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
     * Sets the <code>secondaryParticipantDto1</code> property.
     * <p>
     * 
     * @param pSecondaryParticipantDto1
     *            the current value of the <code>secondaryParticipantDto1</code> property.<br>
     */
    public void setSecondaryParticipantDto1(
                final ContractParticipantDto pSecondaryParticipantDto1) {
        this.secondaryParticipantDto1 = pSecondaryParticipantDto1;
    }

    /**
     * Sets the <code>secondaryParticipantDto2</code> property.
     * <p>
     * 
     * @param pSecondaryParticipantDto2
     *            the current value of the <code>secondaryParticipantDto2</code> property.<br>
     */
    public void setSecondaryParticipantDto2(
                final ContractParticipantDto pSecondaryParticipantDto2) {
        this.secondaryParticipantDto2 = pSecondaryParticipantDto2;
    }

    /**
     * Sets the <code>specialHandlingCodeRule</code> property.
     * <p>
     * 
     * @param pSpecialHandlingCodeRule
     *            the current value of the <code>specialHandlingCodeRule</code> property.<br>
     */
    public void setSpecialHandlingCodeRule(final String pSpecialHandlingCodeRule) {
        this.specialHandlingCodeRule = pSpecialHandlingCodeRule;
    }

    /**
     * Sets the <code>specialHandlingCodes</code> property.
     * <p>
     * 
     * @param pSpecialHandlingCodes
     *            the current value of the <code>specialHandlingCodes</code> property.<br>
     */
    public void setSpecialHandlingCodes(final String pSpecialHandlingCodes) {
        this.specialHandlingCodes = pSpecialHandlingCodes;
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

    public void setSpecialNotes(final boolean pSpecialNotes) {
        this.specialNotes = pSpecialNotes;
    }

    /**
     * Sets the <code>Status</code> property.
     * <p>
     * <b>Format: </b><br>
     * 6-7 Alphabets <b>Example: </b><br>
     * ACTIVE
     * <p>
     * 
     * @param pStatus
     *            the current value of the <code>Status</code> property.
     */
    public void setStatus(final ContractStatusType pStatus) {
        this.status = pStatus;
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
     * Sets the <code>useWithAddOns</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pUseWithAddOns
     *            the current value of the <code>useWithAddOns</code> property.
     */
    public void setUseWithAddOns(final boolean pUseWithAddOns) {
        this.useWithAddOns = pUseWithAddOns;
    }

    /**
     * Creates the String representation of <code>ContractListEntryDto</code>.
     * <p>
     * This will return the String representation based on Contract List.
     * <p>
     * 
     * @return the String representation of <code>ContractListEntryDto</code>.
     */

    public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();
        // SuppressOff:MagicNumber

        csvString.append(this.prefixSuffixByQuotes(this.getContractId()));
        csvString.append(this.prefixSuffixByQuotes(this.getOrigin()));
        csvString.append(this.prefixSuffixByQuotes(this.getDestination()));
        csvString.append(this.prefixSuffixByQuotes(this.dateToString(this
                    .getUserAudit().getCreatedOn())));
        csvString.append(this.prefixSuffixByQuotes(this.dateToString(this
                    .getDateRangeDto().getEffectiveDate())));
        if (this.getDateRangeDto().getExpirationDate() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.dateToString(this
                        .getDateRangeDto().getExpirationDate())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this.getStatus().getType()));
        if (this.getContractParticipantDto() != null
                    && this.getContractParticipantDto()
                                .getContractParticipantType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .htmlToTextTransform(this.getContractParticipantDto()
                                    .getContractParticipantType())));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        csvString.append(this.prefixSuffixByQuotes(this
                    .getContractParticipantDto().getAccountNumber()));
        if (this.getCarrier() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .htmlToTextTransform(this.getCarrier())));
        }
        if (this.getBiDirectionalInd()) {
            csvString.append(this.prefixSuffixByQuotes(YES_LITERAL));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(NO_LITERAL));
        }
        if (this.getOriginDestPayCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .getOriginDestPayCode().toString()));
        }
        if (this.getDestOriginPayCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this
                        .getDestOriginPayCode().toString()));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getNetOnNet()) {
            csvString.append(this.prefixSuffixByQuotes(YES_LITERAL));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(NO_LITERAL));
        }
        if (this.getRouteCompressionInd()) {
            csvString.append(this.prefixSuffixByQuotes(YES_LITERAL));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(NO_LITERAL));
        }
        csvString.append(this.prefixSuffixByQuotes(this
                    .getContractPriorityType()));
        csvString.append(this.prefixSuffixByQuotes(this.getUserAudit()
                    .getUserIdentifier()));
        if (this.getSpecialNotes()) {
            csvString.append(this.prefixSuffixByQuotes(YES_LITERAL));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(NO_LITERAL));
        }
        if (this.getMultiSegmentRouteInd()) {
            csvString.append(this.prefixSuffixByQuotes(YES_LITERAL));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(NO_LITERAL));
        }
        return csvString.toString();
    }

    /**
     * Converts given date object into equivalent String object.
     * 
     * @param pDate
     *            the date object.
     * 
     * @return String value of the <code>pDate</code>.
     * 
     */
    private String dateToString(final Date pDate) {
        final Format aSimpleDateFormat = new SimpleDateFormat("ddMMMyyyy",
                    Locale.UK);
        return ContractUtility.convertToUpperCase(aSimpleDateFormat
                    .format(pDate));
    }

    /**
     * Transforms plain html content to text.
     * <p>
     * 
     * @param pContractParticipantType
     *            holds the html content to be formatted.
     *            <p>
     * @return the transformed text string.
     */
    private String htmlToTextTransform(String pContractParticipantType) {
        final String whiteSpaceCharacters[] = { "<br/>",
            "&nbsp;&nbsp;&nbsp;&nbsp;", "&nbsp;" };
        final String replacement[] = { "\n", "\t", " " };
        for (int i = 0; i < whiteSpaceCharacters.length; i++) {
            pContractParticipantType = pContractParticipantType.replace(
                whiteSpaceCharacters[i], replacement[i]);
        }
        return pContractParticipantType;
    }

    /**
     * prefixes and suffixes a given string with open quotes.
     * 
     * @param pString
     *            the new value of the <code>value</code>.
     * 
     * @return aModifiedString the new value of the <code>aModifiedString</code> .
     * 
     * 
     */
    private String prefixSuffixByQuotes(final String pString) {
        final String aQUOTATION = "\"";
        final String aCOMMA = ",";

        final StringBuffer aModifiedString = new StringBuffer();
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(pString);
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(aCOMMA);

        return aModifiedString.toString();
    }
    public String getSunday() {
        return this.sunday;
    }

    public void setSunday(final String pSunday) {
        this.sunday = pSunday;
    }

    public String getMonday() {
        return this.monday;
    }

    public void setMonday(final String pMonday) {
        this.monday = pMonday;
    }

    public String getTuesday() {
        return this.tuesday;
    }

    public void setTuesday(final String pTuesday) {
        this.tuesday = pTuesday;
    }

    public String getWednesday() {
        return this.wednesday;
    }

    public void setWednesday(final String pWednesday) {
        this.wednesday = pWednesday;
    }

    public String getThursday() {
        return this.thursday;
    }

    public void setThursday(final String pThursday) {
        this.thursday = pThursday;
    }

    public String getFriday() {
        return this.friday;
    }

    public void setFriday(final String pFriday) {
        this.friday = pFriday;
    }

    public String getSaturday() {
        return this.saturday;
    }

    public void setSaturday(final String pSaturday) {
        this.saturday = pSaturday;
    }
    public boolean getEnforceHurdleRateInd() {
        return this.enforceHurdleRateInd;
    }

    public void setEnforceHurdleRateInd(final boolean pEnforceHurdleRateInd) {
        this.enforceHurdleRateInd = pEnforceHurdleRateInd;
    }
}