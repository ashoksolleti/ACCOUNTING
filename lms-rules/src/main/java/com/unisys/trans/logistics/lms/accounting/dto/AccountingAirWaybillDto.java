/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.persistence.Column;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ReRatingStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RequestType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AirWaybillDto</code> class contain information specific to an AirWaybill.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>actualForms
 * <li>airWaybillDetail
 * <li>airWaybillParticipants
 * <li>carrierPayables
 * <li>carrierReceivables
 * <li>carrierReceivables
 * <li>charge
 * <li>creationDate
 * <li>hostRevenue
 * <li>otherCharge
 * <li>participantPayables
 * <li>participantReceivables
 * <li>paymentDetail
 * <li>airWaybillNumber
 * <li>oId
 * </code>
 * </ul>
 */
public class AccountingAirWaybillDto extends PersistenceObjectDto {

    /**
     * Attribute to hold <code>EMPTY_STRING</code> property.
     */
    private static final String EMPTY_STRING = "";
    
    /* actualCharge : represents the total actual charge of the AWB
     * It will be sum of total prepaid actual charge and total actual collect charge.
    */
    private BigDecimal actualCharge;
    
   public BigDecimal getActualCharge() {
		return actualCharge;
	}

	public void setActualCharge(BigDecimal actualCharge) {
		this.actualCharge = actualCharge;
	} 									
										

    private boolean purgeIndicator;
    
			
    
    private boolean proIndicator;

	public boolean getProIndicator() {
		return proIndicator;
	}

	public void setProIndicator(boolean proIndicator) {
		this.proIndicator = proIndicator;
	}
	
	public void makeEnable()
	{
		proIndicator = true;
	}
	
	public void makeDisable()
	{
		proIndicator = false;
	}

    public boolean getPurgeIndicator() {
        return this.purgeIndicator;
    }

    public void setPurgeIndicator(final boolean pPurgeIndicator) {
        this.purgeIndicator = pPurgeIndicator;
    }

    private AccountingEntryDto accountingEntryDto;

    private List<AccountingEntryDto> accountingEntryDtos;

    public List<AccountingEntryDto> getAccountingEntryDtos() {
        if (accountingEntryDtos == null || accountingEntryDtos.isEmpty())
        {
            this.accountingEntryDtos = new ArrayList<AccountingEntryDto>();
        }
        return this.accountingEntryDtos;
    }

    public void setAccountingEntryDtos(final List<AccountingEntryDto> pAccountingEntryDtos) {
        this.accountingEntryDtos = pAccountingEntryDtos;
    }

    private String craAuditComplete;

    public String getCraAuditComplete() {
        return this.craAuditComplete;
    }

    public void setCraAuditComplete(final String pCraAuditComplete) {
        this.craAuditComplete = pCraAuditComplete;
    }

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -414047275667314555L;

    /**
	private RequestType requestType;
     * Attribute to hold <code>actualForms</code> property.
     */
    private List<ActualFlownDto> actualFlowns;

    /**
     * Attribute to hold <code>agentCommissionHierarchy</code> property.
     */
    private int agentCommissionHierarchy;

    /**
     * Attribute to hold <code>airWaybillDetail</code> property.
     */
    private AccountingAirWaybillDetailDto airWaybillDetail;

    private AccountingStatusDto accountingStatusDto;
    
    private String specificAirline;

    public boolean isAwbadjustmentsCompleted() {
        return this.awbadjustmentsCompleted;
    }

    public void setAwbadjustmentsCompleted(final boolean pAwbadjustmentsCompleted) {
        this.awbadjustmentsCompleted = pAwbadjustmentsCompleted;
    }

    public String getAdjustmentsId() {
        return this.adjustmentsId;
    }

    public void setAdjustmentsId(final String pAdjustmentsId) {
        this.adjustmentsId = pAdjustmentsId;
    }

    public ReRatingStatusType getReRatingStatusType() {
        return this.reRatingStatusType;
    }

    public void setReRatingStatusType(final ReRatingStatusType pReRatingStatusType) {
        this.reRatingStatusType = pReRatingStatusType;
    }

    public String getReRatingErrorMessage() {
        return this.reRatingErrorMessage;
    }

    public void setReRatingErrorMessage(final String pReRatingErrorMessage) {
        this.reRatingErrorMessage = pReRatingErrorMessage;
    }

    public Date getLastReRatingTimeStamp() {
        return this.lastReRatingTimeStamp;
    }

    public void setLastReRatingTimeStamp(final Date pLastReRatingTimeStamp) {
        this.lastReRatingTimeStamp = pLastReRatingTimeStamp;
    }

    private boolean awbadjustmentsCompleted;
    
 private boolean lastLegHostInd;
    
    private boolean isHostInd;
    
    public boolean isLastLegHostInd() {
		return lastLegHostInd;
	}

	public void setLastLegHostInd(boolean lastLegHostInd) {
		this.lastLegHostInd = lastLegHostInd;
	}

	public boolean isHostInd() {
		return isHostInd;
	}

	public void setHostInd(boolean isHostInd) {
		this.isHostInd = isHostInd;
	}


    private String adjustmentsId;

    private ReRatingStatusType reRatingStatusType;

    private String reRatingErrorMessage;

    private Date lastReRatingTimeStamp;

    /**
     * Attribute to hold <code>airWaybillNumber</code> property.
     */
    private AirWaybillNumberDto airWaybillNumber;

    /**
     * Attribute to hold <code>airWaybillParticipants</code> property.
     */
    private List<AccountingAirWaybillParticipantDto> airWaybillParticipants;

    /**
     * Attribute to hold <code>hostRevenue</code> property.
     */
    private AirWaybillRevenueDto airWaybillRevenue;

    /**
     * Attribute to hold <code>airwaybillRoutes</code> property.
     */
    private List<AirwaybillRouteDto> airwaybillRoutes;

    /**
     * Attribute to hold <code>bookingSegmentDtos</code> property.
     */
    private List<BookingSegmentDto> bookingSegmentDtos;

    /**
     * Attribute to hold <code>carrierPayables</code> property.
     */
    private List<CarrierPayableDto> carrierPayables;

    /**
     * Attribute to hold <code>carrierReceivables</code> property.
     */
    private List<CarrierReceivableDto> carrierReceivables;

    /**
     * Attribute to hold <code>creationDate</code> property.
     */
    private Date creationDate;

    /**
     * Attribute to hold <code>hostRevenue</code> property.
     */
    private HostRevenueDto hostRevenue;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>otherCharge</code> property.
     */
    private OtherChargeDto otherCharge;

    /**
     * Attribute to hold <code>otherChargeEntries</code> property.
     */
    private List<OtherChargeEntryDto> otherChargeEntries;

    /**
     * Attribute to hold <code>participantPayables</code> property.
     */
    private List<ParticipantPayableDto> participantPayables;

    /**
     * Attribute to hold <code>participantReceivables</code> property.
     */
    private List<ParticipantReceivableDto> participantReceivables;

    /**
     * Attribute to hold <code>paymentDetail</code> property.
     */
    private PaymentDetailDto paymentDetail;

    /**
     * Attribute to hold <code>ratingLineEntries</code> property.
     */
    private List<RatingLineEntryDto> ratingLineEntries;

    /**
     * Attribute to hold <code>specialHandlingCodes</code> property.
     */
    private List<String> specialHandlingCodes;
    
    private String manualAuditIndicator;
    
    private String errorQueueIndicator;
    
    private String lmsDBkey;
    
    private String lmsRevision;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    /*
     * private Long oId;
     */

    public String getManualAuditIndicator() {
		return this.manualAuditIndicator;
	}

	public void setManualAuditIndicator(final String pManualAuditIndicator) {
		this.manualAuditIndicator = pManualAuditIndicator;
	}

	public String getErrorQueueIndicator() {
		return this.errorQueueIndicator;
	}

	public void setErrorQueueIndicator(final String pErrorQueueIndicator) {
		this.errorQueueIndicator = pErrorQueueIndicator;
	}

	/**
     * Attribute to hold <code>totalCharges</code> property.
     */
    private AccountingTotalChargesDto totalCharges;

    private List<AirWaybillAuditEntryDto> airWaybillAuditEntryDtos;
    
    private PreferenceAirWayBillParticipants preferenceAirWayBillParticipants;

    private List<AccountingAWBChargesDto> awbChargesDtos;
    
    private boolean actualFlownUpdateInd;

    public List<AirWaybillAuditEntryDto> getAirWaybillAuditEntryDtos() {
        return this.airWaybillAuditEntryDtos;
    }

    public void setAirWaybillAuditEntryDtos(final List<AirWaybillAuditEntryDto> pAirWaybillAuditEntryDtos) {
        this.airWaybillAuditEntryDtos = pAirWaybillAuditEntryDtos;
    }

    /**
     * /**
     * Gets the <code>actualFlowns</code> property.
     * <p>
     * 
     * @return the current value of the <code>actualFlowns</code> property.
     */

    public List<ActualFlownDto> getActualFlowns() {
        return this.actualFlowns;
    }

    /**
     * Gets the <code>agentCommissionHierarchy</code> property.
     * <p>
     * 
     * @return the current value of the <code>agentCommissionHierarchy</code> property.
     */

    public int getAgentCommissionHierarchy() {
        return this.agentCommissionHierarchy;
    }

    /**
     * Gets the <code>airWaybillDetail</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybillDetail</code> property.
     */
    public AccountingAirWaybillDetailDto getAirWaybillDetail() {
        return this.airWaybillDetail;
    }

    /**
     * Gets the <code>airWaybillNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybillNumber</code> property.
     */
    public AirWaybillNumberDto getAirWaybillNumber() {
        return this.airWaybillNumber;
    }

    /**
     * Gets the <code>airWaybillParticipants</code> property.
     * <p>
     * 
     * @return the current value of the <code>airWaybillParticipants</code> property.
     */
    public List<AccountingAirWaybillParticipantDto> getAirWaybillParticipants() {
        return this.airWaybillParticipants;
    }

    /**
     * @return the airWaybillRevenue
     */
    public AirWaybillRevenueDto getAirWaybillRevenue() {
    	if(this.airWaybillRevenue == null)
    	{
    		this.airWaybillRevenue = new AirWaybillRevenueDto();
    	}
        return this.airWaybillRevenue;
    }

    /**
     * Gets the <code>airwaybillRoutes</code> property.
     * <p>
     * 
     * @return the current value of the <code>airwaybillRoutes</code> property.
     */
    public List<AirwaybillRouteDto> getAirwaybillRoutes() {
        return this.airwaybillRoutes;
    }

    /**
     * Gets the <code>bookingSegmentDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>bookingSegmentDtos</code> property.
     */
    public List<BookingSegmentDto> getBookingSegmentDtos() {
        return this.bookingSegmentDtos;
    }

    /**
     * Gets the <code>carrierPayables</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrierPayables</code> property.
     */
    public List<CarrierPayableDto> getCarrierPayables() {
        return this.carrierPayables;
    }

    /**
     * Gets the <code>carrierReceivables</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrierReceivables</code> property.
     */
    public List<CarrierReceivableDto> getCarrierReceivables() {
        return this.carrierReceivables;
    }

    /**
     * Gets the <code>creationDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>creationDate</code> property.
     */
    public Date getCreationDate() {
        return ContractUtility.getClonedDate(this.creationDate);
    }

    /**
     * Gets the <code>hostRevenue</code> property.
     * <p>
     * 
     * @return the current value of the <code>hostRevenue</code> property.
     */
    public HostRevenueDto getHostRevenue() {
        return this.hostRevenue;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>SpotRateId</code>.It is of type Long.
     * <p>
     * 
     * @return this.the current value of the <code>oId</code> property.<br>
     */

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>otherCharge</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherCharge</code> property.
     */
    public OtherChargeDto getOtherCharge() {
        return this.otherCharge;
    }

    /**
     * Gets the <code>otherChargeEntries</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeEntries</code> property.
     */
    public List<OtherChargeEntryDto> getOtherChargeEntries() {
        return this.otherChargeEntries;
    }

    /**
     * Gets the <code>participantPayables</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantPayables</code> property.
     */
    public List<ParticipantPayableDto> getParticipantPayables() {
        return this.participantPayables;
    }

    /**
     * Gets the <code>participantReceivables</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantReceivables</code> property.
     */
    public List<ParticipantReceivableDto> getParticipantReceivables() {
        return this.participantReceivables;
    }

    /**
     * Gets the <code>paymentDetail</code> property.
     * <p>
     * 
     * @return the current value of the <code>paymentDetail</code> property.
     */
    public PaymentDetailDto getPaymentDetail() {
        return this.paymentDetail;
    }

    /**
     * Gets the <code>ratingLineEntries</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingLineEntries</code> property.
     */
    public List<RatingLineEntryDto> getRatingLineEntries() {
        return this.ratingLineEntries;
    }

    /**
     * Gets the <code>specialHandlingCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialHandlingCodes</code> property.
     */
    public List<String> getSpecialHandlingCodes() {
        return this.specialHandlingCodes;
    }

    /**
     * Gets the <code>totalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalCharges</code> property.
     */
    public AccountingTotalChargesDto getTotalCharges() {
        return this.totalCharges;
    }

    /**
     * Sets the <code>actualFlowns</code>.
     * <p>
     * 
     * @param pActualFlowns
     *            holds the new value of <code>actualFlowns</code>
     */

    public void setActualFlowns(final List<ActualFlownDto> pActualFlowns) {
        this.actualFlowns = pActualFlowns;
    }

    /**
     * Sets the <code>agentCommissionHierarchy</code>.
     * <p>
     * 
     * @param agentCommissionHierarchy
     *            holds the new value of <code>agentCommissionHierarchy</code>
     */
    public void setAgentCommissionHierarchy(final int pagentCommissionHierarchy) {
        this.agentCommissionHierarchy = pagentCommissionHierarchy;
    }

    /**
     * Sets the <code>airWaybillDetail</code>.
     * <p>
     * 
     * @param pAirWaybillDetail
     *            holds the new value of <code>airWaybillDetail</code>
     */
    public void setAirWaybillDetail(final AccountingAirWaybillDetailDto pAirWaybillDetail) {
        this.airWaybillDetail = pAirWaybillDetail;
    }

    /**
     * Sets the <code>airWaybillNumber</code>.
     * <p>
     * 
     * @param pAirWaybillNumber
     *            holds the new value of <code>airWaybillNumber</code>
     */
    public void setAirWaybillNumber(final AirWaybillNumberDto pAirWaybillNumber) {
        this.airWaybillNumber = pAirWaybillNumber;
    }

    /**
     * Sets the <code>airWaybillParticipants</code>.
     * <p>
     * 
     * @param pAirWaybillParticipants
     *            holds the new value of <code>airWaybillParticipants</code>
     */
    public void setAirWaybillParticipants(
                final List<AccountingAirWaybillParticipantDto> pAirWaybillParticipants) {
        this.airWaybillParticipants = pAirWaybillParticipants;
    }

    /**
     * @param airWaybillRevenue the airWaybillRevenue to set
     */
    public void setAirWaybillRevenue(final AirWaybillRevenueDto pAirWaybillRevenue) {
        this.airWaybillRevenue = pAirWaybillRevenue;
    }

    /**
     * Sets the <code>airwaybillRoutingSegments</code>.
     * <p>
     * 
     * @param pAirwaybillRoutingSegments
     *            holds the new value of <code>airwaybillRoutingSegments</code>
     */

    public void
                setAirwaybillRoutes(
                            final List<AirwaybillRouteDto> pAirwaybillRoutes) {
        this.airwaybillRoutes = pAirwaybillRoutes;
    }

    /**
     * Sets the <code>bookingSegmentDtos</code>.
     * <p>
     * 
     * @param pBookingSegmentDtos
     *            holds the new value of <code>bookingSegmentDtos</code>
     */
    public void setBookingSegmentDtos(final List<BookingSegmentDto> pBookingSegmentDtos) {
        this.bookingSegmentDtos = pBookingSegmentDtos;
    }

    /**
     * Sets the <code>carrierPayables</code>.
     * <p>
     * 
     * @param pCarrierPayables
     *            holds the new value of <code>carrierPayables</code>
     */
    public void setCarrierPayables(final List<CarrierPayableDto> pCarrierPayables) {
        this.carrierPayables = pCarrierPayables;
    }

    /**
     * Sets the <code>carrierReceivables</code>.
     * <p>
     * 
     * @param pCarrierReceivables
     *            holds the new value of <code>carrierReceivables</code>
     */
    public void setCarrierReceivables(final List<CarrierReceivableDto> pCarrierReceivables) {
        this.carrierReceivables = pCarrierReceivables;
    }

    /**
     * Sets the <code>creationDate</code>.
     * <p>
     * 
     * @param pCreationDate
     *            holds the new value of <code>creationDate</code>
     */
    public void setCreationDate(final Date pCreationDate) {
        this.creationDate = ContractUtility.getClonedDate(pCreationDate);
    }

    /**
     * Sets the <code>hostRevenue</code>.
     * <p>
     * 
     * @param pHostRevenue
     *            holds the new value of <code>hostRevenue</code>
     */
    public void setHostRevenue(final HostRevenueDto pHostRevenue) {
        this.hostRevenue = pHostRevenue;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>ClassRatingId</code>.It is of type Long.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>otherCharge</code>.
     * <p>
     * 
     * @param pOtherCharge
     *            holds the new value of <code>otherCharge</code>
     */
    public void setOtherCharge(final OtherChargeDto pOtherCharge) {
        this.otherCharge = pOtherCharge;
    }

    /**
     * Sets the <code>otherChargeEntries</code>.
     * <p>
     * 
     * @param pOtherChargeEntries
     *            holds the new value of <code>otherChargeEntries</code>
     */
    public void setOtherChargeEntries(final List<OtherChargeEntryDto> pOtherChargeEntries) {
        this.otherChargeEntries = pOtherChargeEntries;
    }

    /**
     * Sets the <code>participantPayables</code>.
     * <p>
     * 
     * @param pParticipantPayables
     *            holds the new value of <code>participantPayables</code>
     */
    public void setParticipantPayables(final List<ParticipantPayableDto> pParticipantPayables) {
        this.participantPayables = pParticipantPayables;
    }

    /**
     * Sets the <code>participantReceivables</code>.
     * <p>
     * 
     * @param pParticipantReceivables
     *            holds the new value of <code>participantReceivables</code>
     */
    public void setParticipantReceivables(final List<ParticipantReceivableDto> pParticipantReceivables) {
        this.participantReceivables = pParticipantReceivables;
    }

    /**
     * Sets the <code>paymentDetail</code>.
     * <p>
     * 
     * @param pPaymentDetail
     *            holds the new value of <code>paymentDetail</code>
     */
    public void setPaymentDetail(final PaymentDetailDto pPaymentDetail) {
        this.paymentDetail = pPaymentDetail;
    }

    /**
     * Sets the <code>ratingLineEntries</code>.
     * <p>
     * 
     * @param pRatingLineEntries
     *            holds the new value of <code>ratingLineEntries</code>
     */
    public void setRatingLineEntries(final List<RatingLineEntryDto> pRatingLineEntries) {
        this.ratingLineEntries = pRatingLineEntries;
    }
    
    public List<RatingLineEntryDto> getFaceandPublishedRatingLineEntries(){
    	return this.ratingLineEntries;
    }

    public void setFaceandPublishedRatingLineEntries(final List<RatingLineEntryDto> pRatingLineEntries) {
    	
    	List<RatingLineEntryDto> requestLineEntryDtos=new ArrayList<RatingLineEntryDto>();
    	for(RatingLineEntryDto requestDto:this.ratingLineEntries)
    	{
    		if(requestDto.getActualIndicator())
    		{
    			requestDto.setOId(null);
    			requestLineEntryDtos.add(requestDto);
    			
    		}
    	}
   
        for(RatingLineEntryDto dto:pRatingLineEntries)
        {
        	if(!dto.getActualIndicator())
        	{
        		requestLineEntryDtos.add(dto);
        	}
        		
        }
        this.ratingLineEntries.clear();
        this.ratingLineEntries=requestLineEntryDtos;
    }
    
    /**
     * Sets the <code>specialHandlingCodes</code>.
     * <p>
     * 
     * @param pSpecialHandlingCodes
     *            holds the new value of <code>specialHandlingCodes</code>
     */
    public void setSpecialHandlingCodes(final List<String> pSpecialHandlingCodes) {
        this.specialHandlingCodes = pSpecialHandlingCodes;
    }

    /**
     * Sets the <code>totalCharges</code>.
     * <p>
     * 
     * @param totalCharges
     *            holds the new value of <code>totalCharges</code>
     */

    public void setTotalCharges(final AccountingTotalChargesDto ptotalCharges) {
        this.totalCharges = ptotalCharges;
    }

    public AccountingStatusDto getAccountingStatusDto() {
        return accountingStatusDto;
    }

    public void setAccountingStatusDto(final AccountingStatusDto pAccountingStatusDto) {
        this.accountingStatusDto = pAccountingStatusDto;
    }


    public AccountingEntryDto getAccountingEntryDto() {
        return accountingEntryDto;
    }

    public void setAccountingEntryDto(AccountingEntryDto accountingEntryDto) {
        this.accountingEntryDto = accountingEntryDto;
    }

    private RequestType requestType;
    
    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

	public PreferenceAirWayBillParticipants getPreferenceAirWayBillParticipants() {
		return preferenceAirWayBillParticipants;
	}

	public void setPreferenceAirWayBillParticipants(
			PreferenceAirWayBillParticipants preferenceAirWayBillParticipants) {
		this.preferenceAirWayBillParticipants = preferenceAirWayBillParticipants;
	}

	public List<AccountingAWBChargesDto> getAwbChargesDtos() {
		return awbChargesDtos;
	}

	public void setAwbChargesDtos(List<AccountingAWBChargesDto> awbChargesDtos) {
		this.awbChargesDtos = awbChargesDtos;
	}
	
	public boolean isActualFlownUpdateInd() {
		return actualFlownUpdateInd;
	}

	public void setActualFlownUpdateInd(boolean actualFlownUpdateInd) {
		this.actualFlownUpdateInd = actualFlownUpdateInd;
	}

	/**
	 * @return the specificAirline
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}

	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
	
	public Date getMessageTimeStamp() {
		return messageTimeStamp;
	}

	public void setMessageTimeStamp(Date messageTimeStamp) {
		this.messageTimeStamp = messageTimeStamp;
	}

	private Date messageTimeStamp;

	public String getLmsDBkey() {
		return lmsDBkey;
	}

	public void setLmsDBkey(String lmsDBkey) {
		this.lmsDBkey = lmsDBkey;
	}

	public String getLmsRevision() {
		return lmsRevision;
	}

	public void setLmsRevision(String lmsRevision) {
		this.lmsRevision = lmsRevision;
	}



}
