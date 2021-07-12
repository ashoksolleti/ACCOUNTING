package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AWBParticipantType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ParticipantRoleType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableStatusType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AccountingAirWaybill</code> domain contain details of
 * AccountingAirWaybill.
 * <p>
 * This contains all information about AccountingAirWaybill.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>actualFlowns
 * <li>airWaybillDetail
 * <li>airWaybillNumber
 * <li>airWaybillParticipants
 * <li>charge
 * <li>creationDate
 * <li>oId
 * <li>invoicePayments
 * <li>otherCharge
 * <li>paymentDetail
 * <li>bookingSegments
 * <li>totalCharges
 * </ul>
 */

public class AccountingCCADCMInfoDto extends PersistenceObjectDto {
    /**
     * Unique Serial Version Id UID
     */
    private static final long serialVersionUID = 1L;
    
    
    private AccountingAirWaybillDto accountingAirWaybill;


    /**
     * Attribute to hold <code>airWaybillDetail</code> property.
     */
    private AccountingCCADCMDetailDto ccaDcmlDetail;

    /**
     * Attribute to hold <code>airWaybillNumber</code> property.
     */
    private AirWaybillNumberDto airWaybillNumber;

    /**
     * Attribute to hold <code>airWaybillParticipants</code> property.
     */
    private List<CcaDcmParticipantDto> ccaDcamParticipants;


    /**
     * Attribute to hold <code>bookingSegments</code> property.
     */

    private List<CcaDCmBookingSegmentDto> bookingSegments;

    /**
     * Attribute to hold <code>creationDate</code> property.
     */
    private Date creationDate;

    private CcaDcmHostRevenueDto hostRevenue;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>airWaybillParticipantReceivable</code> property.
     */
    /*@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    @JoinColumn(name = "CCADCM_INFO_OID", referencedColumnName = "OID")
    private List<CcaDcmParticipantReceivable> ccaDcmParticipantReceivables;*/
    
    
    private List<CcaDcmParticipantPayableDto> ccaDcmParticipantPayables;


    /**
     * Attribute to hold <code>otherCharge</code> property.
     */

    private OtherChargeDto otherCharge;

    /**
     * Attribute to hold <code>otherChargeEntries</code> property.
     */
    private List<CcaDcmOtherChargeEntryDto> ccaDcmOtherChargeEntries;


    /**
     * Attribute to hold <code>ratingLineEntries</code> property.
     */
    private List<CcaDcmRatingLineEntryDto> ratingLineEntries;


    /**
     * Attribute to hold <code>totalCharges</code> property.
     */

    private CcaDcmTotalChargesDto ccaDcmtotalCharges;


    /**
     * Attribute to holds <code>contractSRAAppliesIndicator</code> property.
     */
    private boolean purgeIndicator;
    
    private String ccaDcmNumber;
    
    private Boolean ccaIndecator;	
    
    private Boolean internalDcmIndecator;
    
    
    private Date issueDate;
    
    private String remarks;
    
    private String placeofIssue;
    
    private Long ccaDcmVersion;
    
    private String ccaDcmStatus;
    
    private Date awbIssueDate;
    
    private Long previousCcaDcmOid;
    
    private String carrierCode;
    
	private String participantAccNo;
	
	private ReceivableStatusType receivableStatusType; 
	
	private String originStation;
	
	private String destinationStation;
    
	private Date fromDate;
	
	private Date toDate;
	
	private String airlineCodeNumber;
    
    private CcaDcmRatingLineEntryDto faceRatingLineEntryDto;
	
	private CcaDcmRatingLineEntryDto publRatingLineEntryDto;
	
	private CcaDcmRatingLineEntryDto actualRatingLineEntryDto;
	
	private TotalChargeEntryDto actualWeightCharge;
	
	private TotalChargeEntryDto collectActualWeightCharge;
	
	private TotalChargeEntryDto actualPrepaidCharge;
	
	private TotalChargeEntryDto actualCollectCharge;
	
	private TotalChargeEntryDto publishedWeightCharge;
	
	private TotalChargeEntryDto publishedPrepaidCharge;
	
	private TotalChargeEntryDto publishedCollectCharge;
	  
	private TotalChargeEntryDto faceWeightCharge;
	
	private TotalChargeEntryDto facePrepaidCharge;
	
	private TotalChargeEntryDto faceCollectCharge;
	
	private BigDecimal gsaCommission;
	private String gsaCurrency;
	private BigDecimal ghaCommission;
	private String ghaCurrency;
	private BigDecimal agenCommission;
	private String agentCurrency;
	
	private BigDecimal otherCharges;
	
	private String action;
	
	//Contact#11830846 - Added a new variable to hold the Host name
	private String issuingCarrier; 
	private String participantName;
	private String participantCity;
	
	
	public String getParticipantCity() {
		return participantCity;
	}

	public void setParticipantCity(String participantCity) {
		this.participantCity = participantCity;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}	

    public String getIssuingCarrier() {
		return issuingCarrier;
	}

	public void setIssuingCarrier(String issuingCarrier) {
		this.issuingCarrier = issuingCarrier;
	}
	
	
	
	// @ManyToOne
    // @JoinColumn(name = "ACC_AWB_OID", columnDefinition = "NUMBER(38)",
    // nullable = true)
    // private SlidingScaleEntry slidingScaleEntry;


    public boolean getPurgeIndicator() {
        return this.purgeIndicator;
    }

    public void setPurgeIndicator(final boolean pPurgeIndicator) {
        this.purgeIndicator = pPurgeIndicator;
    }


    

    /**
     * Gets the <code>creationDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>creationDate</code> property.<br>
     */
    public Date getCreationDate() {
        return ContractUtility.getClonedDate(this.creationDate);
    }


    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }


    /**
     * Sets the <code>creationDate</code> property.
     * <p>
     * 
     * @param pCreationDate
     *            the new value of the <code>creationDate</code> property.
     */
    public void setCreationDate(final Date pCreationDate) {
        this.creationDate = ContractUtility.getClonedDate(pCreationDate);
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
	 * @return the ccaDcmlDetail
	 */
	public AccountingCCADCMDetailDto getCcaDcmlDetail() {
		return ccaDcmlDetail;
	}

	/**
	 * @param ccaDcmlDetail the ccaDcmlDetail to set
	 */
	public void setCcaDcmlDetail(AccountingCCADCMDetailDto ccaDcmlDetail) {
		this.ccaDcmlDetail = ccaDcmlDetail;
	}

	/**
	 * @return the ccaDcamParticipants
	 */
	public List<CcaDcmParticipantDto> getCcaDcamParticipants() {
		

        if (this.ccaDcamParticipants == null) {
            this.ccaDcamParticipants = new ArrayList<CcaDcmParticipantDto>();

        }
        if (this.ccaDcamParticipants.isEmpty()) {
        	CcaDcmParticipantDto ccaDcamParticipan =
                        new CcaDcmParticipantDto();
        	ccaDcamParticipan.setParticipantType(AWBParticipantType.S);
            this.ccaDcamParticipants.add(ccaDcamParticipan);
            ccaDcamParticipan = new CcaDcmParticipantDto();
            ccaDcamParticipan.setParticipantType(AWBParticipantType.C);
            this.ccaDcamParticipants.add(ccaDcamParticipan);
            ccaDcamParticipan = new CcaDcmParticipantDto();
            ccaDcamParticipan.setParticipantType(AWBParticipantType.A);
            this.ccaDcamParticipants.add(ccaDcamParticipan);

        }
    
		
		return ccaDcamParticipants;
	}

	/**
	 * @param ccaDcamParticipants the ccaDcamParticipants to set
	 */
	public void setCcaDcamParticipants(List<CcaDcmParticipantDto> ccaDcamParticipants) {
		this.ccaDcamParticipants = ccaDcamParticipants;
	}

	/**
	 * @return the bookingSegments
	 */
	public List<CcaDCmBookingSegmentDto> getBookingSegments() {
		
		if(this.bookingSegments==null){
			this.bookingSegments = new ArrayList<CcaDCmBookingSegmentDto>();
		}
		if(this.bookingSegments.isEmpty()){
			CcaDCmBookingSegmentDto bookingSegmentDto = new CcaDCmBookingSegmentDto();
			this.bookingSegments.add(bookingSegmentDto);
			bookingSegmentDto = new CcaDCmBookingSegmentDto();
			this.bookingSegments.add(bookingSegmentDto);
			bookingSegmentDto = new CcaDCmBookingSegmentDto();
			this.bookingSegments.add(bookingSegmentDto);
		}else{
			for(int i=this.bookingSegments.size() ; i<3 ; i++){
				CcaDCmBookingSegmentDto bookingSegmentDto = new CcaDCmBookingSegmentDto();
				this.bookingSegments.add(bookingSegmentDto);
			}
		}
		return bookingSegments;
	}

	/**
	 * @param bookingSegments the bookingSegments to set
	 */
	public void setBookingSegments(List<CcaDCmBookingSegmentDto> bookingSegments) {
		this.bookingSegments = bookingSegments;
	}

	/**
	 * @return the hostRevenue
	 */
	public CcaDcmHostRevenueDto getHostRevenue() {
		return hostRevenue;
	}

	/**
	 * @param hostRevenue the hostRevenue to set
	 */
	public void setHostRevenue(CcaDcmHostRevenueDto hostRevenue) {
		this.hostRevenue = hostRevenue;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
	 * @return the ccaDcmOtherChargeEntries
	 */
	public List<CcaDcmOtherChargeEntryDto> getCcaDcmOtherChargeEntries() {
		
		if(this.ccaDcmOtherChargeEntries == null){
			this.ccaDcmOtherChargeEntries = new ArrayList<CcaDcmOtherChargeEntryDto>();
		}
		
		if(this.ccaDcmOtherChargeEntries.isEmpty()){
			CcaDcmOtherChargeEntryDto ccaDcmOtherChargeEntryDto = new CcaDcmOtherChargeEntryDto();
			this.ccaDcmOtherChargeEntries.add(ccaDcmOtherChargeEntryDto);
			ccaDcmOtherChargeEntryDto = new CcaDcmOtherChargeEntryDto();
			this.ccaDcmOtherChargeEntries.add(ccaDcmOtherChargeEntryDto);
		}
		
		return ccaDcmOtherChargeEntries;
	}

	/**
	 * @param ccaDcmOtherChargeEntries the ccaDcmOtherChargeEntries to set
	 */
	public void setCcaDcmOtherChargeEntries(
			List<CcaDcmOtherChargeEntryDto> ccaDcmOtherChargeEntries) {
		this.ccaDcmOtherChargeEntries = ccaDcmOtherChargeEntries;
	}

	/**
	 * @return the ratingLineEntries
	 */
	public List<CcaDcmRatingLineEntryDto> getRatingLineEntries() {
		return ratingLineEntries;
	}

	/**
	 * @param ratingLineEntries the ratingLineEntries to set
	 */
	public void setRatingLineEntries(List<CcaDcmRatingLineEntryDto> ratingLineEntries) {
		this.ratingLineEntries = ratingLineEntries;
	}

	/**
	 * @return the ccaDcmtotalCharges
	 */
	public CcaDcmTotalChargesDto getCcaDcmtotalCharges() {
		return ccaDcmtotalCharges;
	}

	/**
	 * @param ccaDcmtotalCharges the ccaDcmtotalCharges to set
	 */
	public void setCcaDcmtotalCharges(CcaDcmTotalChargesDto ccaDcmtotalCharges) {
		this.ccaDcmtotalCharges = ccaDcmtotalCharges;
	}

	/**
	 * @return the ccaDcmNumber
	 */
	public String getCcaDcmNumber() {
		return ccaDcmNumber;
	}

	/**
	 * @param ccaDcmNumber the ccaDcmNumber to set
	 */
	public void setCcaDcmNumber(String ccaDcmNumber) {
		this.ccaDcmNumber = ccaDcmNumber;
	}

	/**
	 * @return the ccaIndecator
	 */
	public Boolean getCcaIndecator() {
		return ccaIndecator;
	}

	/**
	 * @param ccaIndecator the ccaIndecator to set
	 */
	public void setCcaIndecator(Boolean ccaIndecator) {
		this.ccaIndecator = ccaIndecator;
	}

	/**
	 * @return the internalDcmIndecator
	 */
	public Boolean getInternalDcmIndecator() {
		return internalDcmIndecator;
	}

	/**
	 * @param internalDcmIndecator the internalDcmIndecator to set
	 */
	public void setInternalDcmIndecator(Boolean internalDcmIndecator) {
		this.internalDcmIndecator = internalDcmIndecator;
	}

	/**
	 * @return the issueDate
	 */
	public Date getIssueDate() {
		return issueDate;
	}

	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the placeofIssue
	 */
	public String getPlaceofIssue() {
		return placeofIssue;
	}

	/**
	 * @param placeofIssue the placeofIssue to set
	 */
	public void setPlaceofIssue(String placeofIssue) {
		this.placeofIssue = placeofIssue;
	}


	/**
	 * @return the ccaDcmParticipantPayables
	 */
	public List<CcaDcmParticipantPayableDto> getCcaDcmParticipantPayables() {
		return ccaDcmParticipantPayables;
	}

	/**
	 * @param ccaDcmParticipantPayables the ccaDcmParticipantPayables to set
	 */
	public void setCcaDcmParticipantPayables(
			List<CcaDcmParticipantPayableDto> ccaDcmParticipantPayables) {
		this.ccaDcmParticipantPayables = ccaDcmParticipantPayables;
	}

	/**
	 * @return the accountingAirWaybill
	 */
	public AccountingAirWaybillDto getAccountingAirWaybill() {
		return accountingAirWaybill;
	}

	/**
	 * @param accountingAirWaybill the accountingAirWaybill to set
	 */
	public void setAccountingAirWaybill(AccountingAirWaybillDto accountingAirWaybill) {
		this.accountingAirWaybill = accountingAirWaybill;
	}

	/**
	 * @return the airWaybillNumber
	 */
	public AirWaybillNumberDto getAirWaybillNumber() {
		
		if(airWaybillNumber==null){
			airWaybillNumber = new AirWaybillNumberDto();
		}
		
		return airWaybillNumber;
	}

	/**
	 * @param airWaybillNumber the airWaybillNumber to set
	 */
	public void setAirWaybillNumber(AirWaybillNumberDto airWaybillNumber) {
		this.airWaybillNumber = airWaybillNumber;
	}

	/**
	 * @return the otherCharge
	 */
	public OtherChargeDto getOtherCharge() {
		return otherCharge;
	}

	/**
	 * @param otherCharge the otherCharge to set
	 */
	public void setOtherCharge(OtherChargeDto otherCharge) {
		this.otherCharge = otherCharge;
	}

	/**
	 * @return the ccaDcmVersion
	 */
	public Long getCcaDcmVersion() {
		return ccaDcmVersion;
	}

	/**
	 * @param ccaDcmVersion the ccaDcmVersion to set
	 */
	public void setCcaDcmVersion(Long ccaDcmVersion) {
		this.ccaDcmVersion = ccaDcmVersion;
	}

	/**
	 * @return the ccaDcmStatus
	 */
	public String getCcaDcmStatus() {
		return ccaDcmStatus;
	}

	/**
	 * @param ccaDcmStatus the ccaDcmStatus to set
	 */
	public void setCcaDcmStatus(String ccaDcmStatus) {
		this.ccaDcmStatus = ccaDcmStatus;
	}

	/**
	 * @return the awbIssueDate
	 */
	public Date getAwbIssueDate() {
		return awbIssueDate;
	}

	/**
	 * @param awbIssueDate the awbIssueDate to set
	 */
	public void setAwbIssueDate(Date awbIssueDate) {
		this.awbIssueDate = awbIssueDate;
	}

	/**
	 * @return the previousCcaDcmOid
	 */
	public Long getPreviousCcaDcmOid() {
		return previousCcaDcmOid;
	}

	/**
	 * @param previousCcaDcmOid the previousCcaDcmOid to set
	 */
	public void setPreviousCcaDcmOid(Long previousCcaDcmOid) {
		this.previousCcaDcmOid = previousCcaDcmOid;
	}

	/**
	 * @return the carrierCode
	 */
	public String getCarrierCode() {
		return carrierCode;
	}

	/**
	 * @param carrierCode the carrierCode to set
	 */
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	/**
	 * @return the faceRatingLineEntryDto
	 */
	public CcaDcmRatingLineEntryDto getFaceRatingLineEntryDto() {
		return faceRatingLineEntryDto;
	}

	/**
	 * @param faceRatingLineEntryDto the faceRatingLineEntryDto to set
	 */
	public void setFaceRatingLineEntryDto(
			CcaDcmRatingLineEntryDto faceRatingLineEntryDto) {
		this.faceRatingLineEntryDto = faceRatingLineEntryDto;
	}

	/**
	 * @return the publRatingLineEntryDto
	 */
	public CcaDcmRatingLineEntryDto getPublRatingLineEntryDto() {
		return publRatingLineEntryDto;
	}

	/**
	 * @param publRatingLineEntryDto the publRatingLineEntryDto to set
	 */
	public void setPublRatingLineEntryDto(
			CcaDcmRatingLineEntryDto publRatingLineEntryDto) {
		this.publRatingLineEntryDto = publRatingLineEntryDto;
	}

	/**
	 * @return the actualRatingLineEntryDto
	 */
	public CcaDcmRatingLineEntryDto getActualRatingLineEntryDto() {
		if (this.getRatingLineEntries() != null) {
            for (CcaDcmRatingLineEntryDto aRatingLineEntryDto : this.getRatingLineEntries()) {
                if (aRatingLineEntryDto.isActualIndicator()) {
                   this.setActualRatingLineEntryDto(aRatingLineEntryDto);
                }
                else if (aRatingLineEntryDto.isFaceIndicator()) {
                   this.setFaceRatingLineEntryDto(aRatingLineEntryDto);
                }
                else if (aRatingLineEntryDto.isPublishedIndicator())
                {
                   this.setPublRatingLineEntryDto(aRatingLineEntryDto);
                }
            }
        }
		return actualRatingLineEntryDto;
	}

	/**
	 * @param actualRatingLineEntryDto the actualRatingLineEntryDto to set
	 */
	public void setActualRatingLineEntryDto(
			CcaDcmRatingLineEntryDto actualRatingLineEntryDto) {
		this.actualRatingLineEntryDto = actualRatingLineEntryDto;
	}

	/**
	 * @return the actualWeightCharge
	 */
	public TotalChargeEntryDto getActualWeightCharge() {
		
		if (this.getCcaDcmtotalCharges()!= null) {

	        if (this.getCcaDcmtotalCharges().getWeightCharges() != null) {
	            for (TotalChargeEntryDto weightCharge :this.getCcaDcmtotalCharges()
	                        .getWeightCharges()) {
	                if (weightCharge.getActualIndicator() && this.getCcaDcmlDetail()!=null 
	                		&& this.getCcaDcmlDetail().getExportPaycode()!=null && this.getCcaDcmlDetail().getExportPaycode().toString().startsWith("P")) {
	                    this.setActualWeightCharge(weightCharge);
	                }
	            }
	        }
		}
		return actualWeightCharge;
	}

	/**
	 * @param actualWeightCharge the actualWeightCharge to set
	 */
	public void setActualWeightCharge(TotalChargeEntryDto actualWeightCharge) {
		this.actualWeightCharge = actualWeightCharge;
	}

	/**
	 * @return the actualPrepaidCharge
	 */
	public TotalChargeEntryDto getActualPrepaidCharge() {
		
		
		if (this.getCcaDcmtotalCharges()!= null) {

	        if (this.getCcaDcmtotalCharges().getPrepaidCharges() != null) {
	            for (TotalChargeEntryDto prepaidCharge : this.getCcaDcmtotalCharges()
	                        .getPrepaidCharges()) {
	                if (prepaidCharge.getActualIndicator()) {
	                    this.setActualPrepaidCharge(prepaidCharge);
	                }
	            }
	        }
	    }
		
		return actualPrepaidCharge;
	}

	/**
	 * @param actualPrepaidCharge the actualPrepaidCharge to set
	 */
	public void setActualPrepaidCharge(TotalChargeEntryDto actualPrepaidCharge) {
		this.actualPrepaidCharge = actualPrepaidCharge;
	}

	/**
	 * @return the actualCollectCharge
	 */
	public TotalChargeEntryDto getActualCollectCharge() {
		
		if (this.getCcaDcmtotalCharges()!= null) {
	        if (this.getCcaDcmtotalCharges().getCollectCharges() != null) {
	            for (TotalChargeEntryDto collectCharge : this.getCcaDcmtotalCharges()
	                        .getCollectCharges()) {
	                if (collectCharge.getActualIndicator()) {
	                    this.setActualCollectCharge(collectCharge);
	                }
	            }
	        }
		}
		return actualCollectCharge;
	}

	/**
	 * @param actualCollectCharge the actualCollectCharge to set
	 */
	public void setActualCollectCharge(TotalChargeEntryDto actualCollectCharge) {
		this.actualCollectCharge = actualCollectCharge;
	}

	/**
	 * @return the publishedWeightCharge
	 */
	public TotalChargeEntryDto getPublishedWeightCharge() {
		if (this.getCcaDcmtotalCharges()!= null) {

	        if (this.getCcaDcmtotalCharges().getWeightCharges() != null) {
	            for (TotalChargeEntryDto weightCharge :this.getCcaDcmtotalCharges()
	                        .getWeightCharges()) {
	                 if (weightCharge.getPublishedIndicator()) {
	                    this.setPublishedWeightCharge(weightCharge);
	                }
	            }
	        }
		}
		
		return publishedWeightCharge;
	}

	/**
	 * @param publishedWeightCharge the publishedWeightCharge to set
	 */
	public void setPublishedWeightCharge(TotalChargeEntryDto publishedWeightCharge) {
		this.publishedWeightCharge = publishedWeightCharge;
	}

	/**
	 * @return the publishedPrepaidCharge
	 */
	public TotalChargeEntryDto getPublishedPrepaidCharge() {
		if (this.getCcaDcmtotalCharges()!= null) {

	        if (this.getCcaDcmtotalCharges().getPrepaidCharges() != null) {
	            for (TotalChargeEntryDto prepaidCharge : this.getCcaDcmtotalCharges()
	                        .getPrepaidCharges()) {
	                if (prepaidCharge.getPublishedIndicator()) {
	                    this.setPublishedPrepaidCharge(prepaidCharge);
	                }
	            }
	        }
	    }
		
		return publishedPrepaidCharge;
	}

	/**
	 * @param publishedPrepaidCharge the publishedPrepaidCharge to set
	 */
	public void setPublishedPrepaidCharge(TotalChargeEntryDto publishedPrepaidCharge) {
		this.publishedPrepaidCharge = publishedPrepaidCharge;
	}

	/**
	 * @return the publishedCollectCharge
	 */
	public TotalChargeEntryDto getPublishedCollectCharge() {
		
		if (this.getCcaDcmtotalCharges()!= null) {
	        if (this.getCcaDcmtotalCharges().getCollectCharges() != null) {
	            for (TotalChargeEntryDto collectCharge : this.getCcaDcmtotalCharges()
	                        .getCollectCharges()) {
	                if (collectCharge.getPublishedIndicator()) {
	                    this.setPublishedCollectCharge(collectCharge);
	                }
	            }
	        }
		}
		return publishedCollectCharge;
	}

	/**
	 * @param publishedCollectCharge the publishedCollectCharge to set
	 */
	public void setPublishedCollectCharge(TotalChargeEntryDto publishedCollectCharge) {
		this.publishedCollectCharge = publishedCollectCharge;
	}

	/**
	 * @return the faceWeightCharge
	 */
	public TotalChargeEntryDto getFaceWeightCharge() {
		
		if (this.getCcaDcmtotalCharges()!= null) {

	        if (this.getCcaDcmtotalCharges().getWeightCharges() != null) {
	            for (TotalChargeEntryDto weightCharge :this.getCcaDcmtotalCharges()
	                        .getWeightCharges()) {
	                if (weightCharge.getFaceIndicator()) {
	                    this.setFaceWeightCharge(weightCharge);
	                }
	            }
	        }
		}
		
		return faceWeightCharge;
	}

	/**
	 * @param faceWeightCharge the faceWeightCharge to set
	 */
	public void setFaceWeightCharge(TotalChargeEntryDto faceWeightCharge) {
		this.faceWeightCharge = faceWeightCharge;
	}

	/**
	 * @return the facePrepaidCharge
	 */
	public TotalChargeEntryDto getFacePrepaidCharge() {
		
		if (this.getCcaDcmtotalCharges()!= null) {

	        if (this.getCcaDcmtotalCharges().getPrepaidCharges() != null) {
	            for (TotalChargeEntryDto prepaidCharge : this.getCcaDcmtotalCharges()
	                        .getPrepaidCharges()) {
	                if (prepaidCharge.getFaceIndicator()) {
	                    this.setFacePrepaidCharge(prepaidCharge);
	                }
	            }
	        }
	    }
		
		return facePrepaidCharge;
	}

	/**
	 * @param facePrepaidCharge the facePrepaidCharge to set
	 */
	public void setFacePrepaidCharge(TotalChargeEntryDto facePrepaidCharge) {
		this.facePrepaidCharge = facePrepaidCharge;
	}

	/**
	 * @return the faceCollectCharge
	 */
	public TotalChargeEntryDto getFaceCollectCharge() {
		
		if (this.getCcaDcmtotalCharges()!= null) {
	        if (this.getCcaDcmtotalCharges().getCollectCharges() != null) {
	            for (TotalChargeEntryDto collectCharge : this.getCcaDcmtotalCharges()
	                        .getCollectCharges()) {
	               if (collectCharge.getFaceIndicator()) {
	                    this.setFaceCollectCharge(collectCharge);
	                }
	            }
	        }
		}
		return faceCollectCharge;
	}

	/**
	 * @param faceCollectCharge the faceCollectCharge to set
	 */
	public void setFaceCollectCharge(TotalChargeEntryDto faceCollectCharge) {
		this.faceCollectCharge = faceCollectCharge;
	}

	/**
	 * @return the gsaCommission
	 */
	public BigDecimal getGsaCommission() {
		
		if(this.getCcaDcmParticipantPayables()!=null){
			for(CcaDcmParticipantPayableDto ccaDcmParticipantPayableDto :  this.getCcaDcmParticipantPayables()){
				if(ccaDcmParticipantPayableDto.getParticipantRoleType()!=null && 
						ccaDcmParticipantPayableDto.getParticipantRoleType().equals(ParticipantRoleType.GLOBAL_SALES_AGENT)){
					this.setGsaCommission(ccaDcmParticipantPayableDto.getCommissionAmount());
					this.setGsaCurrency(ccaDcmParticipantPayableDto.getCurrencyCode());
				}
			}
		}
		
		return gsaCommission;
	}

	/**
	 * @param gsaCommission the gsaCommission to set
	 */
	public void setGsaCommission(BigDecimal gsaCommission) {
		this.gsaCommission = gsaCommission;
	}

	/**
	 * @return the gsaCurrency
	 */
	public String getGsaCurrency() {
		return gsaCurrency;
	}

	/**
	 * @param gsaCurrency the gsaCurrency to set
	 */
	public void setGsaCurrency(String gsaCurrency) {
		this.gsaCurrency = gsaCurrency;
	}

	/**
	 * @return the ghaCommission
	 */
	public BigDecimal getGhaCommission() {
		
		if(this.getCcaDcmParticipantPayables()!=null){
			for(CcaDcmParticipantPayableDto ccaDcmParticipantPayableDto :  this.getCcaDcmParticipantPayables()){
				 if(ccaDcmParticipantPayableDto.getParticipantRoleType()!=null && 
						ccaDcmParticipantPayableDto.getParticipantRoleType().equals(ParticipantRoleType.GROUND_HANDLING_AGENT)){
					this.setGhaCommission(ccaDcmParticipantPayableDto.getCommissionAmount());
					this.setGhaCurrency(ccaDcmParticipantPayableDto.getCurrencyCode());
				}
			}
		}
		
		return ghaCommission;
	}

	/**
	 * @param ghaCommission the ghaCommission to set
	 */
	public void setGhaCommission(BigDecimal ghaCommission) {
		this.ghaCommission = ghaCommission;
	}

	/**
	 * @return the ghaCurrency
	 */
	public String getGhaCurrency() {
		return ghaCurrency;
	}

	/**
	 * @param ghaCurrency the ghaCurrency to set
	 */
	public void setGhaCurrency(String ghaCurrency) {
		this.ghaCurrency = ghaCurrency;
	}

	/**
	 * @return the agenCommission
	 */
	public BigDecimal getAgenCommission() {
		
		if(this.getCcaDcmParticipantPayables()!=null){
			for(CcaDcmParticipantPayableDto ccaDcmParticipantPayableDto :  this.getCcaDcmParticipantPayables()){
				if(ccaDcmParticipantPayableDto.getParticipantRoleType()!=null && 
						ccaDcmParticipantPayableDto.getParticipantRoleType().equals(ParticipantRoleType.AGENT)){
					this.setAgenCommission(ccaDcmParticipantPayableDto.getCommissionAmount());
					this.setAgentCurrency(ccaDcmParticipantPayableDto.getCurrencyCode());
				}
			}
		}
		
		return agenCommission;
	}

	/**
	 * @param agenCommission the agenCommission to set
	 */
	public void setAgenCommission(BigDecimal agenCommission) {
		this.agenCommission = agenCommission;
	}

	/**
	 * @return the agentCurrency
	 */
	public String getAgentCurrency() {
		return agentCurrency;
	}

	/**
	 * @param agentCurrency the agentCurrency to set
	 */
	public void setAgentCurrency(String agentCurrency) {
		this.agentCurrency = agentCurrency;
	}

	/**
	 * @return the otherCharges
	 */
	public BigDecimal getOtherCharges() {
		BigDecimal bigDecimal = BigDecimal.ZERO;
		if(this.getCcaDcmOtherChargeEntries() !=null){
			List<CcaDcmOtherChargeEntryDto> temp = new ArrayList<CcaDcmOtherChargeEntryDto>();
			temp.addAll(this.getCcaDcmOtherChargeEntries());
	    	for(CcaDcmOtherChargeEntryDto ccaDcmOtherChargeEntryDto : temp){
	    		bigDecimal = bigDecimal.add(ccaDcmOtherChargeEntryDto.getAmount());
	    	}
	    }
		return bigDecimal;
	}

	/**
	 * @param otherCharges the otherCharges to set
	 */
	public void setOtherCharges(BigDecimal otherCharges) {
		this.otherCharges = otherCharges;
	}

	/**
	 * @return the participantAccNo
	 */
	public String getParticipantAccNo() {
		return participantAccNo;
	}

	/**
	 * @param participantAccNo the participantAccNo to set
	 */
	public void setParticipantAccNo(String participantAccNo) {
		this.participantAccNo = participantAccNo;
	}

	/**
	 * @return the receivableStatusType
	 */
	public ReceivableStatusType getReceivableStatusType() {
		return receivableStatusType;
	}

	/**
	 * @param receivableStatusType the receivableStatusType to set
	 */
	public void setReceivableStatusType(ReceivableStatusType receivableStatusType) {
		this.receivableStatusType = receivableStatusType;
	}

	/**
	 * @return the originStation
	 */
	public String getOriginStation() {
		return originStation;
	}

	/**
	 * @param originStation the originStation to set
	 */
	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}

	/**
	 * @return the destinationStation
	 */
	public String getDestinationStation() {
		return destinationStation;
	}

	/**
	 * @param destinationStation the destinationStation to set
	 */
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	/**
	 * @return the fromDate
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	/**
	 * @return the toDate
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the airlineCodeNumber
	 */
	public String getAirlineCodeNumber() {
		return airlineCodeNumber;
	}

	/**
	 * @param airlineCodeNumber the airlineCodeNumber to set
	 */
	public void setAirlineCodeNumber(String airlineCodeNumber) {
		this.airlineCodeNumber = airlineCodeNumber;
	}

	public TotalChargeEntryDto getCollectActualWeightCharge() {
		
		if (this.getCcaDcmtotalCharges()!= null) {

	        if (this.getCcaDcmtotalCharges().getWeightCharges() != null) {
	            for (TotalChargeEntryDto weightCharge :this.getCcaDcmtotalCharges()
	                        .getWeightCharges()) {
	                if (weightCharge.getActualIndicator() && this.getCcaDcmlDetail()!=null 
	                		&& this.getCcaDcmlDetail().getExportPaycode()!=null && this.getCcaDcmlDetail().getExportPaycode().toString().startsWith("C")) {
	                    this.setCollectActualWeightCharge(weightCharge);
	                }
	            }
	        }
		}
		
		return collectActualWeightCharge;
	}

	public void setCollectActualWeightCharge(
			TotalChargeEntryDto collectActualWeightCharge) {
		this.collectActualWeightCharge = collectActualWeightCharge;
	}

}