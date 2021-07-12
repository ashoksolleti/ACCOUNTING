package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingRuleIndicators;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingTriggeringPoints;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AmountType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ClearingHouseType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardActionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardQueueType;
import com.unisys.trans.logistics.lms.framework.constants.SettlementMethodType;
import com.unisys.trans.logistics.lms.framework.logging.LMSLogger;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;
import com.unisys.trans.logistics.lms.jaxb.AccrualAirwaybillType;


public class AccountingDroolsRequest {

    private String triggerPoint;

    private AccountingRuleIndicators ruleIndicator;
    
    private InwardActionType inwardActionType;
    
    private InwardQueueType inwardQueueType;

    private AccountingEntryDto accountingEntryDto;

    private AccountingFlownRevenueDto accFlownRevenueDto;

    private CASSParticipantInvoiceAWBDto cassParticipantInvoiceAWBDto;

    private CASSParticipantInvoiceDCMDto cassParticipantInvoiceDCMDto;

    private CommercialParticipantInvoiceAWBDto commercialParticipantInvoiceAWBDto;

    private CommercialParticipantInvoiceDCMDto commercialParticipantInvoiceDCMDto;
    
    private InterlineParticipantInvoiceAWBDto interlineParticipantInvoiceAWBDto;

    private ParticipantPayableDto participantPayableDto;

    private BigDecimal otherCharge;
    
    private BigDecimal openProvisionAmount;

    private AccountingInvoiceAWBDto rejectionMemos;

    private PaymentBreakdownDto paymentAWBDto;

    private AccountingAirWaybillDto accountingAirWaybillDto; 
    
    private AccrualAirwaybillType lmsAirwaybillDto;
    
    private InterlineOutwardMemoDto interlineOutwardMemoDto;
    
    private BigDecimal includeInRevenueOCAmount; 
    
    public BigDecimal getIncludeInRevenueOCAmount() {
		return includeInRevenueOCAmount;
	}


	public void setIncludeInRevenueOCAmount(BigDecimal includeInRevenueOCAmount) {
		this.includeInRevenueOCAmount = includeInRevenueOCAmount;
	}


	public InterlineOutwardMemoDto getInterlineOutwardMemoDto() {
		return interlineOutwardMemoDto;
	}


	public void setInterlineOutwardMemoDto(InterlineOutwardMemoDto interlineOutwardMemoDto) {
		this.interlineOutwardMemoDto = interlineOutwardMemoDto;
	}

	private BigDecimal exchangeRateVariationThreshold;
    
    private List<AccountingPeriodDto> accountingPeriodDtos = new ArrayList<AccountingPeriodDto>();  
    
    private InterlineBillingQueueDto interlineBillingQueueDto;
    
    private String profitCenter;
    
    private String accountReceivable;
    
    private String accountPayable;
    
    private BigDecimal accrualAmount;
    
    private Map<String,String> otherCharges = new HashMap<String,String>();
    
    private BigDecimal otherChargeSuspense;
    
    private ParticipantReceivableDto participantReceivableDto;
    
    private ReceivableSplitDto fuelSurcharge;
    
    private List<AccountingAWBChargesDto> accAWBChargesDto= new ArrayList<AccountingAWBChargesDto>();
    
    private ClearingHouseType clearingHouseType;
    
    private BigDecimal commissionAmount;
    
    private BigDecimal iscAmount;
    
    private String iscIdentifier;
    
	private SettlementMethodType settlementMethodType;

    private List<String> stratAirProCodeList = new ArrayList<String>();
	
	public List<String> getStratAirProCodeList() {
		return stratAirProCodeList;
	}

	public void setStratAirProCodeList(List<String> stratAirProCodeList) {
		this.stratAirProCodeList = stratAirProCodeList;
	}
	
	//LMSC-17073
    private List<String> mailRevenueProdCodes = new ArrayList<String>();

	public List<String> getMailRevenueProdCodes() {
		return mailRevenueProdCodes;
	}

	public void setMailRevenueProdCodes(List<String> mailRevenueProdCodes) {
		this.mailRevenueProdCodes = mailRevenueProdCodes;
	}


	public String getIscIdentifier() {
		return iscIdentifier;
	}


	public void setIscIdentifier(String iscIdentifier) {
		this.iscIdentifier = iscIdentifier;
	}


	public BigDecimal getIscAmount() {
		return iscAmount;
	}


	public void setIscAmount(BigDecimal iscAmount) {
		this.iscAmount = iscAmount;
	}

	private String revenueIndicatorType;
    
    
	public String getRevenueIndicatorType() {
		return revenueIndicatorType;
	}


	public void setRevenueIndicatorType(String revenueIndicatorType) {
		this.revenueIndicatorType = revenueIndicatorType;
	}


	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}


	public ParticipantReceivableDto getParticipantReceivableDto() {
		return participantReceivableDto;
	}


	public void setParticipantReceivableDto(
			ParticipantReceivableDto participantReceivableDto) {
		this.participantReceivableDto = participantReceivableDto;
	}


	public AccrualAirwaybillType getLmsAirwaybillDto() {
		return lmsAirwaybillDto;
	}


	public void setLmsAirwaybillDto(AccrualAirwaybillType lmsAirwaybillDto) {
		this.lmsAirwaybillDto = lmsAirwaybillDto;
	}
 

	public AccountingAirWaybillDto getAccountingAirWaybillDto() {
		return accountingAirWaybillDto;
	}


	public void setAccountingAirWaybillDto(
			AccountingAirWaybillDto accountingAirWaybillDto) {
		this.accountingAirWaybillDto = accountingAirWaybillDto;
	}

    private AccountingBalanceReportDetailsDto reportDetailsDto;

    public InterlineParticipantInvoiceAWBDto getInterlineParticipantInvoiceAWBDto() {
		return interlineParticipantInvoiceAWBDto;
	}

	public void setInterlineParticipantInvoiceAWBDto(
			InterlineParticipantInvoiceAWBDto interlineParticipantInvoiceAWBDto) {
		this.interlineParticipantInvoiceAWBDto = interlineParticipantInvoiceAWBDto;
	}	
	

	public List<AccountingPeriodDto> getAccountingPeriodDtos() {
		return accountingPeriodDtos;
	}


	public void setAccountingPeriodDtos(
			List<AccountingPeriodDto> accountingPeriodDtos) {
		this.accountingPeriodDtos = accountingPeriodDtos;
	}


	public AccountingBalanceReportDetailsDto getReportDetailsDto() {
        return this.reportDetailsDto;
    }

    public void setReportDetailsDto(final AccountingBalanceReportDetailsDto pReportDetailsDto) {
        this.reportDetailsDto = pReportDetailsDto;
    }

    public PaymentBreakdownDto getPaymentAWBDto() {
        return this.paymentAWBDto;
    }

    public void setPaymentAWBDto(final PaymentBreakdownDto pPaymentAWBDto) {
        this.paymentAWBDto = pPaymentAWBDto;
    }

    public AccountingInvoiceAWBDto getRejectionMemos() {
        return this.rejectionMemos;
    }

    public void setRejectionMemos(final AccountingInvoiceAWBDto pRejectionMemos) {
        this.rejectionMemos = pRejectionMemos;
    }

    public ParticipantPayableDto getParticipantPayableDto() {
        return this.participantPayableDto;
    }

    public void setParticipantPayableDto(final ParticipantPayableDto pParticipantPayableDto) {
        this.participantPayableDto = pParticipantPayableDto;
    }

    public BigDecimal getOtherCharge() {
        return this.otherCharge;
    }

    public void setOtherCharge(final BigDecimal pOtherCharge) {
        this.otherCharge = pOtherCharge;
    }

    public BigDecimal getOtherChargeCode(final String pOtherChargeCode) {

    BigDecimal amountBilled = BigDecimal.ZERO;
    int length= pOtherChargeCode.length();
    String subCode=null;
    String pOtherCharge=null;
    if(length>2)
    {
    	 pOtherCharge=pOtherChargeCode.substring(0,2);
    	 subCode=pOtherChargeCode.substring(2, length);
    }
    else{
    	pOtherCharge=pOtherChargeCode;
    }
    	
        if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.CASS_BILLING.getType())) {
            if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {
                if (!this.getCassParticipantInvoiceAWBDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                    List<AccountingOtherChargesBreakdownDto> receivableDtos =
                                this.getCassParticipantInvoiceAWBDto().getAccountingOtherchargesBreakDown();
                    for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                        if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(pOtherCharge)) {
                            amountBilled= amountBilled.add(dto.getAmountBilled());
                        }
                    }
                    return amountBilled;
                }
            }
            else if (this.ruleIndicator.equals(AccountingRuleIndicators.DCM)) {
                if (!this.getCassParticipantInvoiceDCMDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                    List<AccountingOtherChargesBreakdownDto> receivableDtos =
                                this.getCassParticipantInvoiceDCMDto().getAccountingOtherchargesBreakDown();
                    for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                        if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(pOtherCharge)) {
                        	amountBilled= amountBilled.add(dto.getAmountBilled());
                        }
                    }
                    return amountBilled;
                }
            }
        }

        else if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.COMMERCIAL_IMPORT_BILLING
                    .getType())
                    ||
                    this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.COMMERCIAL_EXPORT_BILLING
                                .getType())) {

            if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {
                if (!this.getCommercialParticipantInvoiceAWBDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                	if(subCode!=null){
                    List<AccountingOtherChargesBreakdownDto> receivableDtos =
                                this.getCommercialParticipantInvoiceAWBDto()
                                            .getAccountingOtherchargesBreakDown();
                    for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                        if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(pOtherCharge)&& dto.getSubCode()!=null && dto.getSubCode().equalsIgnoreCase(subCode)) {
                            // this.setOtherCharge(dto.getAmountBilled());
                        	amountBilled= amountBilled.add(dto.getAmountBilled());
                        	break;
                        }
                    }
                    return amountBilled;
                }
                	else
                	{
                		List<AccountingOtherChargesBreakdownDto> receivableDtos =
                                this.getCommercialParticipantInvoiceAWBDto()
                                            .getAccountingOtherchargesBreakDown();
                    for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                        if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(pOtherCharge)&& dto.getSubCode()==null) {
                            // this.setOtherCharge(dto.getAmountBilled());
                        	amountBilled= amountBilled.add(dto.getAmountBilled());
                        	break;
                        }
                    }
                    return amountBilled;
                }
            
                	
            }
            }
            else if (this.ruleIndicator.equals(AccountingRuleIndicators.DCM)) {
                if (!this.getCommercialParticipantInvoiceDCMDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                    List<AccountingOtherChargesBreakdownDto> receivableDtos =
                                this.getCommercialParticipantInvoiceDCMDto()
                                            .getAccountingOtherchargesBreakDown();
                    if(subCode!=null){
                    for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                        if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(pOtherCharge)&& dto.getSubCode()!=null && dto.getSubCode().equalsIgnoreCase(subCode)) {
                            // this.setOtherCharge(dto.getAmountBilled());
                        	amountBilled= amountBilled.add(dto.getAmountBilled());
                        	break;
                        }
                    }
                    return amountBilled;
                }
                    else{
                    	 for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                             if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(pOtherCharge)&& dto.getSubCode()==null) {
                                 // this.setOtherCharge(dto.getAmountBilled());
                             	amountBilled= amountBilled.add(dto.getAmountBilled());
                             	break;
                             }
                         }
                    	 return amountBilled;
                    }
                }
            }
        }
        
        else if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.INTERLINE_INWARD_BILLING
                .getType())
                ||
                this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.INTERLINE_OUTWARD_BILLING
                            .getType())) {

        if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {
            if (!this.getInterlineParticipantInvoiceAWBDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                List<AccountingOtherChargesBreakdownDto> receivableDtos =
                            this.getInterlineParticipantInvoiceAWBDto()
                                        .getAccountingOtherchargesBreakDown();
                for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                    if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(pOtherCharge)) {
                        // this.setOtherCharge(dto.getAmountBilled());
                    	amountBilled= amountBilled.add(dto.getAmountBilled());
                    }
                }
                return amountBilled;
             }
          }
       }

        else if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.FLOWN_REVENUE.getType())) {
            if(subCode!=null)
            {
        	if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {
            	if(this.getAccFlownRevenueDto().getProvision()!=null && this.getAccFlownRevenueDto().getProvision().equals("OutwardProvision"))
            	{
            		List<CarrierReceivableDto> aCarrierReceivable = this.getAccFlownRevenueDto().getAirWaybillRevenueDto().getAccountingAirWaybillDto().getCarrierReceivables();
            		CarrierReceivableDto carrierReceivableDto = null;
            		
            		if(aCarrierReceivable!= null && !aCarrierReceivable.isEmpty())
            		{
            			for(CarrierReceivableDto aCarrierReceivableDto : aCarrierReceivable)
            			{
            				if(aCarrierReceivableDto.getCarrierCode().equals(this.getAccFlownRevenueDto().getOnlineProrationDetailDto().getCarrierCode()))
        					{
            					carrierReceivableDto = aCarrierReceivableDto;
        					}
            			}
            		}
            		
            		if(carrierReceivableDto!=null){
            		 List<OtherChargeSplitDto> carrierReceivableSplits =
            				 carrierReceivableDto
                                         .getCarrierReceivableOtherChargeSplitDtos();
	                 if (!carrierReceivableSplits.isEmpty())
	                 {
	                     for (OtherChargeSplitDto carrierReceivableSplit : carrierReceivableSplits) {
	
	                         if (carrierReceivableSplit != null)
	                         {
	                        	 if(carrierReceivableSplit.getAmountType().equals(AmountType.OTHER_CHARGE))
	                        	 {
		                             if (carrierReceivableSplit.getOtherChargeCode() != null
		                                         && carrierReceivableSplit.getOtherChargeCode().equalsIgnoreCase(
		                                        		 pOtherCharge) && carrierReceivableSplit.getOtherChargeSubCode()!=null && 
		                                        		 carrierReceivableSplit.getOtherChargeSubCode().equalsIgnoreCase(subCode)) {
		                                 amountBilled= amountBilled.add( carrierReceivableSplit.getOtherChargeHostAmount());
		                                 break;
		                            	 }
	                        	 }
	                        	 else
	                        	 {
	                        		 if(carrierReceivableSplit.getAmountType().getAmount().equalsIgnoreCase(pOtherCharge))
	                        		 {
	                        			 amountBilled= amountBilled.add(carrierReceivableSplit.getOtherChargeHostAmount());
	                        		 }
	                        	 }
	                         }
	                     }
	                     return amountBilled;
	                 }
            		}
            	}
            	else if(this.getAccFlownRevenueDto().getProvision()!=null && this.getAccFlownRevenueDto().getProvision().equals("InwardProvision"))
            	{

            		List<CarrierPayableDto> aCarrierPayable = this.getAccFlownRevenueDto().getAirWaybillRevenueDto().getAccountingAirWaybillDto().getCarrierPayables();
            		CarrierPayableDto carrierPayableDto = null;
            		
            		if(aCarrierPayable!= null && !aCarrierPayable.isEmpty())
            		{
            			for(CarrierPayableDto aCarrierPayableDto : aCarrierPayable)
            			{
            				if(aCarrierPayableDto.getCarrierCode().equals(this.getAccFlownRevenueDto().getOnlineProrationDetailDto().getCarrierCode()))
        					{
            					carrierPayableDto = aCarrierPayableDto;
        					}
            			}
            		}
            		
            		if(carrierPayableDto!=null){
            		 List<OtherChargeSplitDto> carrierPayableSplits =
            				 carrierPayableDto
                                         .getOtherChargeSplitDtos();
	                 if (!carrierPayableSplits.isEmpty())
	                 {
	                	 /** This oid Check is added because there are some duplicate entries creating for
	                	  * carrier payable with same OID in hibernate session. This shall be removed once that got fixed.
	                	  */
	                	 Set<Long> oidSet = new HashSet<Long>();
	                     for (OtherChargeSplitDto carrierPayableSplit : carrierPayableSplits) {
	
	                         if (carrierPayableSplit != null && oidSet.add(carrierPayableSplit.getoId())!=false)
	                         {
	                        	 if(carrierPayableSplit.getAmountType().equals(AmountType.OTHER_CHARGE))
	                        	 {
		                             if (carrierPayableSplit.getOtherChargeCode() != null
		                                         && carrierPayableSplit.getOtherChargeCode().equalsIgnoreCase(
		                                        		 pOtherCharge) && carrierPayableSplit.getOtherChargeSubCode()!=null &&
		                                        		 carrierPayableSplit.getOtherChargeSubCode().equalsIgnoreCase(subCode)) {
		                     
		                                amountBilled= amountBilled.add( carrierPayableSplit.getOtherChargeHostAmount());
		                                break;
		                            	 
		                             }
	                        	 }
	                        	 else
	                        	 {
	                        		 if(carrierPayableSplit.getAmountType().getAmount().equalsIgnoreCase(pOtherCharge))
	                        		 {
	                        			 amountBilled= amountBilled.add(carrierPayableSplit.getOtherChargeHostAmount());
	                        		 }
	                        	 }
	                         }
	                     }
	                     return amountBilled;
	                 }
            		}
            	}
            	else{
                if (this.getAccFlownRevenueDto().getAcnNumber()
                            .equalsIgnoreCase(this.getAccFlownRevenueDto().getHostACNNumber()))
                {
                    List<OnlineSegmentSplitDto> onlineChargeSplitDtos =
                                this.getAccFlownRevenueDto().getOnlineProrationDetailDto()
                                            .getOnlineSegmentSplits();

                    if (!(onlineChargeSplitDtos.isEmpty()))
                    {

                        for (OnlineSegmentSplitDto otherChargeSplitDto : onlineChargeSplitDtos) {

                            if (otherChargeSplitDto != null)
                            {
                                if (otherChargeSplitDto.getOtherChargeCode() != null
                                            && otherChargeSplitDto.getOtherChargeCode().equalsIgnoreCase(
                                            		pOtherCharge) && otherChargeSplitDto.getOtherChargeSubCode().equalsIgnoreCase(subCode)) {
                                    amountBilled = amountBilled.add(otherChargeSplitDto.getOtherChargeHostAmount());
                                }
                            }
                        }
                        
                        return amountBilled;
                    }

                }

                else if (!(this.getAccFlownRevenueDto().getAcnNumber().equalsIgnoreCase(this
                            .getAccFlownRevenueDto().getHostACNNumber())))
                {
                    List<OtherChargeSplitDto> carrierReceivableSplits =
                                this.getAccFlownRevenueDto().getCarrierReceivableDto()
                                            .getCarrierReceivableOtherChargeSplitDtos();
                    if (!carrierReceivableSplits.isEmpty())
                    {
                        for (OtherChargeSplitDto carrierReceivableSplit : carrierReceivableSplits) {

                            if (carrierReceivableSplit != null)
                            {
                                if (carrierReceivableSplit.getOtherChargeCode() != null
                                            && carrierReceivableSplit.getOtherChargeCode().equalsIgnoreCase(
                                            		pOtherCharge) && carrierReceivableSplit.getOtherChargeSubCode().equalsIgnoreCase(subCode)) {
                                    amountBilled= amountBilled.add( carrierReceivableSplit.getOtherChargeHostAmount());
                                }
                            }
                        }
                        return amountBilled;
                    }
                }

            }
            }
        }
        else
        {
        	if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {
            	if(this.getAccFlownRevenueDto().getProvision()!=null && this.getAccFlownRevenueDto().getProvision().equals("OutwardProvision"))
            	{
            		List<CarrierReceivableDto> aCarrierReceivable = this.getAccFlownRevenueDto().getAirWaybillRevenueDto().getAccountingAirWaybillDto().getCarrierReceivables();
            		CarrierReceivableDto carrierReceivableDto = null;
            		
            		if(aCarrierReceivable!= null && !aCarrierReceivable.isEmpty())
            		{
            			for(CarrierReceivableDto aCarrierReceivableDto : aCarrierReceivable)
            			{
            				if(aCarrierReceivableDto.getCarrierCode().equals(this.getAccFlownRevenueDto().getOnlineProrationDetailDto().getCarrierCode()))
        					{
            					carrierReceivableDto = aCarrierReceivableDto;
        					}
            			}
            		}
            		
            		if(carrierReceivableDto!=null){
            		 List<OtherChargeSplitDto> carrierReceivableSplits =
            				 carrierReceivableDto
                                         .getCarrierReceivableOtherChargeSplitDtos();
	                 if (!carrierReceivableSplits.isEmpty())
	                 {
	                     for (OtherChargeSplitDto carrierReceivableSplit : carrierReceivableSplits) {
	
	                         if (carrierReceivableSplit != null)
	                         {
	                        	 if(carrierReceivableSplit.getAmountType().equals(AmountType.OTHER_CHARGE))
	                        	 {
		                             if (carrierReceivableSplit.getOtherChargeCode() != null
		                                         && carrierReceivableSplit.getOtherChargeCode().equalsIgnoreCase(
		                                        		 pOtherCharge)&&carrierReceivableSplit.getOtherChargeSubCode() == null) {
		                            	 
		                            	 
		                                 amountBilled= amountBilled.add( carrierReceivableSplit.getOtherChargeHostAmount());
		                                 break;
		                            	 }
	                        	 }
	                        	 else
	                        	 {
	                        		 if(carrierReceivableSplit.getAmountType().getAmount().equalsIgnoreCase(pOtherCharge))
	                        		 {
	                        			 amountBilled= amountBilled.add(carrierReceivableSplit.getOtherChargeHostAmount());
	                        		 }
	                        	 }
	                         }
	                     }
	                     return amountBilled;
	                 }
            		}
            	}
            	else if(this.getAccFlownRevenueDto().getProvision()!=null && this.getAccFlownRevenueDto().getProvision().equals("InwardProvision"))
            	{

            		List<CarrierPayableDto> aCarrierPayable = this.getAccFlownRevenueDto().getAirWaybillRevenueDto().getAccountingAirWaybillDto().getCarrierPayables();
            		CarrierPayableDto carrierPayableDto = null;
            		
            		if(aCarrierPayable!= null && !aCarrierPayable.isEmpty())
            		{
            			for(CarrierPayableDto aCarrierPayableDto : aCarrierPayable)
            			{
            				if(aCarrierPayableDto.getCarrierCode().equals(this.getAccFlownRevenueDto().getOnlineProrationDetailDto().getCarrierCode()))
        					{
            					carrierPayableDto = aCarrierPayableDto;
        					}
            			}
            		}
            		
            		if(carrierPayableDto!=null){
            		 List<OtherChargeSplitDto> carrierPayableSplits =
            				 carrierPayableDto
                                         .getOtherChargeSplitDtos();
	                 if (!carrierPayableSplits.isEmpty())
	                 {
	                	 /** This oid Check is added because there are some duplicate entries creating for
	                	  * carrier payable with same OID in hibernate session. This shall be removed once that got fixed.
	                	  */
	                	 Set<Long> oidSet = new HashSet<Long>();
	                     for (OtherChargeSplitDto carrierPayableSplit : carrierPayableSplits) {
	
	                         if (carrierPayableSplit != null && oidSet.add(carrierPayableSplit.getoId())!=false)
	                         {
	                        	 if(carrierPayableSplit.getAmountType().equals(AmountType.OTHER_CHARGE))
	                        	 {
		                             if (carrierPayableSplit.getOtherChargeCode() != null
		                                         && carrierPayableSplit.getOtherChargeCode().equalsIgnoreCase(
		                                        		 pOtherCharge) /*&&carrierPayableSplit.getOtherChargeSubCode()==null*/) {
		                     
		                                amountBilled= amountBilled.add( carrierPayableSplit.getOtherChargeHostAmount());
		                                break;
		                            	 
		                             }
	                        	 }
	                        	 else
	                        	 {
	                        		 if(carrierPayableSplit.getAmountType().getAmount().equalsIgnoreCase(pOtherCharge))
	                        		 {
	                        			 amountBilled= amountBilled.add(carrierPayableSplit.getOtherChargeHostAmount());
	                        		 }
	                        	 }
	                         }
	                     }
	                     return amountBilled;
	                 }
            		}
            	}
            	else{
                if (this.getAccFlownRevenueDto().getAcnNumber()
                            .equalsIgnoreCase(this.getAccFlownRevenueDto().getHostACNNumber()))
                {
                    List<OnlineSegmentSplitDto> onlineChargeSplitDtos =
                                this.getAccFlownRevenueDto().getOnlineProrationDetailDto()
                                            .getOnlineSegmentSplits();

                    if (!(onlineChargeSplitDtos.isEmpty()))
                    {

                        for (OnlineSegmentSplitDto otherChargeSplitDto : onlineChargeSplitDtos) {

                            if (otherChargeSplitDto != null)
                            {
                                if (otherChargeSplitDto.getOtherChargeCode() != null
                                            && otherChargeSplitDto.getOtherChargeCode().equalsIgnoreCase(
                                            		pOtherCharge)&& otherChargeSplitDto.getOtherChargeSubCode()==null) {
                                    amountBilled = amountBilled.add(otherChargeSplitDto.getOtherChargeHostAmount());
                                }
                            }
                        }
                        
                        return amountBilled;
                    }

                }

                else if (!(this.getAccFlownRevenueDto().getAcnNumber().equalsIgnoreCase(this
                            .getAccFlownRevenueDto().getHostACNNumber())))
                {
                    List<OtherChargeSplitDto> carrierReceivableSplits =
                                this.getAccFlownRevenueDto().getCarrierReceivableDto()
                                            .getCarrierReceivableOtherChargeSplitDtos();
                    if (!carrierReceivableSplits.isEmpty())
                    {
                        for (OtherChargeSplitDto carrierReceivableSplit : carrierReceivableSplits) {

                            if (carrierReceivableSplit != null)
                            {
                                if (carrierReceivableSplit.getOtherChargeCode() != null
                                            && carrierReceivableSplit.getOtherChargeCode().equalsIgnoreCase(
                                            		pOtherCharge)&& carrierReceivableSplit.getOtherChargeSubCode()==null) {
                                    amountBilled= amountBilled.add( carrierReceivableSplit.getOtherChargeHostAmount());
                                }
                            }
                        }
                        return amountBilled;
                    }
                }

            }
            }
        }
        }
        
        
        else if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.STATION_CASHIERING.getType())) {
            /*if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {
                if (this.getAccFlownRevenueDto().getAcnNumber()
                            .equalsIgnoreCase(this.getAccFlownRevenueDto().getHostACNNumber()))
                {
                    List<OnlineSegmentSplitDto> onlineChargeSplitDtos =
                                this.getAccFlownRevenueDto().getOnlineProrationDetailDto()
                                            .getOnlineSegmentSplits();

                    if (!(onlineChargeSplitDtos.isEmpty()))
                    {

                        for (OnlineSegmentSplitDto otherChargeSplitDto : onlineChargeSplitDtos) {

                            if (otherChargeSplitDto != null)
                            {
                                if (otherChargeSplitDto.getOtherChargeCode() != null
                                            && otherChargeSplitDto.getOtherChargeCode().equalsIgnoreCase(
                                                pOtherChargeCode)) {
                                    amountBilled = amountBilled.add(otherChargeSplitDto.getOtherChargeHostAmount());
                                }
                            }
                        }
                        
                        return amountBilled;
                    }

                }

                else if (!(this.getAccFlownRevenueDto().getAcnNumber().equalsIgnoreCase(this
                            .getAccFlownRevenueDto().getHostACNNumber())))
                {
                    List<OtherChargeSplitDto> carrierReceivableSplits =
                                this.getAccFlownRevenueDto().getCarrierReceivableDto()
                                            .getCarrierReceivableOtherChargeSplitDtos();
                    if (!carrierReceivableSplits.isEmpty())
                    {
                        for (OtherChargeSplitDto carrierReceivableSplit : carrierReceivableSplits) {

                            if (carrierReceivableSplit != null)
                            {
                                if (carrierReceivableSplit.getOtherChargeCode() != null
                                            && carrierReceivableSplit.getOtherChargeCode().equalsIgnoreCase(
                                                pOtherChargeCode)) {
                                    amountBilled= amountBilled.add( carrierReceivableSplit.getOtherChargeHostAmount());
                                }
                            }
                        }
                        return amountBilled;
                    }
                }

            }*/
        	

                if (this.getParticipantReceivableDto() != null && this.getParticipantReceivableDto().getReceivableSplitDtos() != null 
                		&& !this.getParticipantReceivableDto().getReceivableSplitDtos().isEmpty()) {
                    List<ReceivableSplitDto> receivableDtos = this.getParticipantReceivableDto().getReceivableSplitDtos();
                    if(subCode!=null){
                    	
                    
                    for (ReceivableSplitDto dto : receivableDtos) {
                        if (dto.getChargeCode() != null && dto.getChargeCode().equalsIgnoreCase(pOtherCharge) && dto.getSubCode()!=null && dto.getSubCode().equalsIgnoreCase(subCode)) {
                        	amountBilled= amountBilled.add(dto.getAmount());
                        	break;
                        }
                    }
                    return amountBilled;
                }
                    else
                    {
                    	for (ReceivableSplitDto dto : receivableDtos) {
                    
                    	 if (dto.getChargeCode() != null && dto.getChargeCode().equalsIgnoreCase(pOtherCharge) && dto.getSubCode()== null)
                    	 {
                    		 amountBilled= amountBilled.add(dto.getAmount());
                         	break;
                    	 }
                    	}
                    	return amountBilled;
                }
        	
        }
        }

        return new BigDecimal(0);
    }

    public boolean otherChargeCodeExists(final String pOtherChargeCode) {

        // this.setOtherCharge(new BigDecimal(0));
        int anOtherCodeExists = 0;
        if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.CASS_BILLING.getType())) {
            if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {
                if (!this.getCassParticipantInvoiceAWBDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                    List<AccountingOtherChargesBreakdownDto> receivableDtos =
                                this.getCassParticipantInvoiceAWBDto().getAccountingOtherchargesBreakDown();
                    for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                        if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(pOtherChargeCode)) {
                            // this.setOtherCharge(dto.getAmountBilled());
                            anOtherCodeExists++;
                        }
                    }
                }
            }
            else if (this.ruleIndicator.equals(AccountingRuleIndicators.DCM)) {
                if (!this.getCassParticipantInvoiceDCMDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                    List<AccountingOtherChargesBreakdownDto> receivableDtos =
                                this.getCassParticipantInvoiceDCMDto().getAccountingOtherchargesBreakDown();
                    for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                        if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(pOtherChargeCode)) {
                            // this.setOtherCharge(dto.getAmountBilled());
                            anOtherCodeExists++;
                        }
                    }
                }
            }
        }

        else if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.COMMERCIAL_IMPORT_BILLING
                    .getType())
                    ||
                    this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.COMMERCIAL_EXPORT_BILLING
                                .getType())) {

            if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {
                if (!this.getCommercialParticipantInvoiceAWBDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                    List<AccountingOtherChargesBreakdownDto> receivableDtos =
                                this.getCommercialParticipantInvoiceAWBDto()
                                            .getAccountingOtherchargesBreakDown();
                    for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                        if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(pOtherChargeCode)) {
                            // this.setOtherCharge(dto.getAmountBilled());
                            anOtherCodeExists++;
                        }
                    }
                }
            }
            else if (this.ruleIndicator.equals(AccountingRuleIndicators.DCM)) {
                if (!this.getCommercialParticipantInvoiceDCMDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                    List<AccountingOtherChargesBreakdownDto> receivableDtos =
                                this.getCommercialParticipantInvoiceDCMDto()
                                            .getAccountingOtherchargesBreakDown();
                    for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                        if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(pOtherChargeCode)) {
                            // this.setOtherCharge(dto.getAmountBilled());
                            anOtherCodeExists++;
                        }
                    }
                }
            }
        }
        
        else if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.INTERLINE_INWARD_BILLING
                .getType())
                ||
                this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.INTERLINE_OUTWARD_BILLING
                            .getType())) {

        if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {
            if (!this.getInterlineParticipantInvoiceAWBDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                List<AccountingOtherChargesBreakdownDto> receivableDtos =
                            this.getInterlineParticipantInvoiceAWBDto()
                                        .getAccountingOtherchargesBreakDown();
                for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                    if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(pOtherChargeCode)) {
                        // this.setOtherCharge(dto.getAmountBilled());
                        anOtherCodeExists++;
                    }
                }
             }
          }
      }

        else if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.FLOWN_REVENUE.getType())) {
            if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {

                if (this.getAccFlownRevenueDto().getAcnNumber()
                            .equalsIgnoreCase(this.getAccFlownRevenueDto().getHostACNNumber()))
                {
                    List<OnlineSegmentSplitDto> onlineChargeSplitDtos =
                                this.getAccFlownRevenueDto().getOnlineProrationDetailDto()
                                            .getOnlineSegmentSplits();

                    if (!(onlineChargeSplitDtos.isEmpty()))
                    {

                        for (OnlineSegmentSplitDto otherChargeSplitDto : onlineChargeSplitDtos) {

                            if (otherChargeSplitDto != null)
                            {
                                if (otherChargeSplitDto.getOtherChargeCode() != null
                                            && otherChargeSplitDto.getOtherChargeCode().equalsIgnoreCase(
                                                pOtherChargeCode)) {
                                    anOtherCodeExists++;
                                }
                            }
                        }

                    }

                }

                else if (!(this.getAccFlownRevenueDto().getAcnNumber().equalsIgnoreCase(this
                            .getAccFlownRevenueDto().getHostACNNumber())))
                {
                	if(this.getAccFlownRevenueDto().getCarrierReceivableDto()!=null)
                	{
                    List<OtherChargeSplitDto> carrierReceivableSplits =
                                this.getAccFlownRevenueDto().getCarrierReceivableDto()
                                            .getCarrierReceivableOtherChargeSplitDtos();
                    if (!carrierReceivableSplits.isEmpty())
                    {
                        for (OtherChargeSplitDto carrierReceivableSplit : carrierReceivableSplits) {

                            if (carrierReceivableSplit != null)
                            {
                                if (carrierReceivableSplit.getOtherChargeCode() != null
                                            && carrierReceivableSplit.getOtherChargeCode().equalsIgnoreCase(
                                                pOtherChargeCode)) {
                                    anOtherCodeExists++;
                                }
                            }
                        }
                    }
                }
                }

            }
        }
        
        else if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.STATION_CASHIERING.getType())) {
            if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {

                if (this.getAccFlownRevenueDto().getAcnNumber()
                            .equalsIgnoreCase(this.getAccFlownRevenueDto().getHostACNNumber()))
                {
                    List<OnlineSegmentSplitDto> onlineChargeSplitDtos =
                                this.getAccFlownRevenueDto().getOnlineProrationDetailDto()
                                            .getOnlineSegmentSplits();

                    if (!(onlineChargeSplitDtos.isEmpty()))
                    {

                        for (OnlineSegmentSplitDto otherChargeSplitDto : onlineChargeSplitDtos) {

                            if (otherChargeSplitDto != null)
                            {
                                if (otherChargeSplitDto.getOtherChargeCode() != null
                                            && otherChargeSplitDto.getOtherChargeCode().equalsIgnoreCase(
                                                pOtherChargeCode)) {
                                    anOtherCodeExists++;
                                }
                            }
                        }

                    }

                }

                else if (!(this.getAccFlownRevenueDto().getAcnNumber().equalsIgnoreCase(this
                            .getAccFlownRevenueDto().getHostACNNumber())))
                {
                	if(this.getAccFlownRevenueDto().getCarrierReceivableDto()!=null)
                	{
                    List<OtherChargeSplitDto> carrierReceivableSplits =
                                this.getAccFlownRevenueDto().getCarrierReceivableDto()
                                            .getCarrierReceivableOtherChargeSplitDtos();
                    if (!carrierReceivableSplits.isEmpty())
                    {
                        for (OtherChargeSplitDto carrierReceivableSplit : carrierReceivableSplits) {

                            if (carrierReceivableSplit != null)
                            {
                                if (carrierReceivableSplit.getOtherChargeCode() != null
                                            && carrierReceivableSplit.getOtherChargeCode().equalsIgnoreCase(
                                                pOtherChargeCode)) {
                                    anOtherCodeExists++;
                                }
                            }
                        }
                    }
                }
                }

            }
        }

        if (anOtherCodeExists >= 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public BigDecimal getOtherChargeSuspenseCode(final String... pOtherChargeCodes) {

        BigDecimal anOtherChargeSuspense = new BigDecimal(0);

        if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.CASS_BILLING.getType())) {
            if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {
                anOtherChargeSuspense = this.getCassParticipantInvoiceAWBDto().getOtherChargesDueCarrier();

                for (String otherChargeCode : pOtherChargeCodes) {

                    if (!this.getCassParticipantInvoiceAWBDto().getAccountingOtherchargesBreakDown().isEmpty()) {

                        List<AccountingOtherChargesBreakdownDto> receivableDtos =
                                    this.getCassParticipantInvoiceAWBDto()
                                                .getAccountingOtherchargesBreakDown();
                        for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                            if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(otherChargeCode)) {

                                anOtherChargeSuspense = anOtherChargeSuspense.subtract(dto.getAmountBilled());

                            }

                        }
                    }
                }
            }
            else if (this.ruleIndicator.equals(AccountingRuleIndicators.DCM)) {
                anOtherChargeSuspense = this.getCassParticipantInvoiceDCMDto().getNetOtherChargeDueCarrier();
                for (String otherChargeCode : pOtherChargeCodes) {

                    if (!this.getCassParticipantInvoiceDCMDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                        List<AccountingOtherChargesBreakdownDto> receivableDtos =
                                    this.getCassParticipantInvoiceDCMDto()
                                                .getAccountingOtherchargesBreakDown();
                        for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                            if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(otherChargeCode)) {
                                anOtherChargeSuspense = anOtherChargeSuspense.subtract(dto.getAmountBilled());

                            }

                        }
                    }
                }
            }
        }

        else if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.COMMERCIAL_IMPORT_BILLING
                    .getType())
                    ||
                    this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.COMMERCIAL_EXPORT_BILLING
                                .getType())) {
            if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {
                anOtherChargeSuspense =
                            this.getCommercialParticipantInvoiceAWBDto().getOtherChargesDueCarrier();
                for (String otherChargeCode : pOtherChargeCodes) {
                    if (!this.getCommercialParticipantInvoiceAWBDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                        List<AccountingOtherChargesBreakdownDto> receivableDtos =
                                    this.getCommercialParticipantInvoiceAWBDto()
                                                .getAccountingOtherchargesBreakDown();
                        for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                            if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(otherChargeCode)) {
                                anOtherChargeSuspense = anOtherChargeSuspense.subtract(dto.getAmountBilled());

                            }

                        }
                    }
                }
            }
            else if (this.ruleIndicator.equals(AccountingRuleIndicators.DCM)) {
                anOtherChargeSuspense =
                            this.getCommercialParticipantInvoiceDCMDto().getNetOtherChargeDueCarrier();
                for (String otherChargeCode : pOtherChargeCodes) {
                    if (!this.getCommercialParticipantInvoiceDCMDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                        List<AccountingOtherChargesBreakdownDto> receivableDtos =
                                    this.getCommercialParticipantInvoiceDCMDto()
                                                .getAccountingOtherchargesBreakDown();
                        for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                            if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(otherChargeCode)) {
                                anOtherChargeSuspense = anOtherChargeSuspense.subtract(dto.getAmountBilled());
                            }

                        }
                    }
                }
            }
        }

        else if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.INTERLINE_INWARD_BILLING
                .getType())
                ||
                this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.INTERLINE_OUTWARD_BILLING
                            .getType())) {
        if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {
            anOtherChargeSuspense = this.getInterlineParticipantInvoiceAWBDto().getOtherChargesDueCarrier();
            for (String otherChargeCode : pOtherChargeCodes) {
                if (!this.getInterlineParticipantInvoiceAWBDto().getAccountingOtherchargesBreakDown().isEmpty()) {
                    List<AccountingOtherChargesBreakdownDto> receivableDtos = this.getInterlineParticipantInvoiceAWBDto()
                                            .getAccountingOtherchargesBreakDown();
                    for (AccountingOtherChargesBreakdownDto dto : receivableDtos) {
                        if (dto.getCode() != null && dto.getCode().equalsIgnoreCase(otherChargeCode)) {
                            anOtherChargeSuspense = anOtherChargeSuspense.subtract(dto.getAmountBilled());

                        }
                    }
                 }
              }
           }
       }

        
        else if (this.triggerPoint.equalsIgnoreCase(AccountingTriggeringPoints.FLOWN_REVENUE.getType())) {
            if (this.ruleIndicator.equals(AccountingRuleIndicators.AWB)) {
                for (String otherChargeCode : pOtherChargeCodes) {
                    anOtherChargeSuspense = this.getAccFlownRevenueDto().getOtherChargesDueCarrier();

                    if (this.getAccFlownRevenueDto().getAcnNumber()
                                .equalsIgnoreCase(this.getAccFlownRevenueDto().getHostACNNumber()))
                    {
                        List<OnlineSegmentSplitDto> onlineChargeSplitDtos =
                                    this.getAccFlownRevenueDto().getOnlineProrationDetailDto()
                                                .getOnlineSegmentSplits();

                        if (!(onlineChargeSplitDtos.isEmpty()))
                        {

                            for (OnlineSegmentSplitDto otherChargeSplitDto : onlineChargeSplitDtos) {

                                if (otherChargeSplitDto != null)
                                {
                                    if (otherChargeSplitDto.getOtherChargeCode() != null
                                                && otherChargeSplitDto.getOtherChargeCode().equalsIgnoreCase(
                                                    otherChargeCode)) {
                                        anOtherChargeSuspense =
                                                    anOtherChargeSuspense.subtract(otherChargeSplitDto
                                                                .getOtherChargeAmount());
                                    }
                                }
                            }

                        }

                    }

                    else if (!(this.getAccFlownRevenueDto().getAcnNumber().equalsIgnoreCase(this
                                .getAccFlownRevenueDto().getHostACNNumber())))
                    {
                        List<OtherChargeSplitDto> carrierReceivableSplits =
                                    this.getAccFlownRevenueDto().getCarrierReceivableDto()
                                                .getCarrierReceivableOtherChargeSplitDtos();
                        if (!carrierReceivableSplits.isEmpty())
                        {
                            for (OtherChargeSplitDto carrierReceivableSplit : carrierReceivableSplits) {

                                if (carrierReceivableSplit != null)
                                {
                                    if (carrierReceivableSplit.getOtherChargeCode() != null
                                                && carrierReceivableSplit.getOtherChargeCode()
                                                            .equalsIgnoreCase(otherChargeCode)) {
                                        anOtherChargeSuspense =
                                                    anOtherChargeSuspense.subtract(carrierReceivableSplit
                                                                .getOtherChargeAmount());
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }

        LMSLogger.info("otherChargeSuspense" + anOtherChargeSuspense);
        return anOtherChargeSuspense;
    }
    
    public String getAccountingMonth(final Date execDate,final Date currentDate)
    {
    	List<AccountingPeriodDto>  accountingPeriodDtos = new ArrayList<AccountingPeriodDto>();
    	accountingPeriodDtos = this.getAccountingPeriodDtos();
    	List<AccountingPeriodDto> openAccPeriodsBasedOnCurrentDate = new ArrayList<AccountingPeriodDto>();
    	AccountingPeriodDto accPeriodsBasedOnExecDate = new AccountingPeriodDto();
    	boolean flag = false;
    	for(AccountingPeriodDto periodDto: accountingPeriodDtos)
    	{
    	if(periodDto.getAccountingMonth().equalsIgnoreCase("JUL"))
    	{
    		LMSLogger.info("July");
    		LMSLogger.info("newly added");
    	}
    		if((DateUtility.compareDates(periodDto.getPeriodEndDate(), currentDate) == -1 && (DateUtility.compareDates(periodDto.getClosingDate(), currentDate)==1||DateUtility.compareDates(periodDto.getClosingDate(), currentDate)==0))
    				||((DateUtility.compareDates(periodDto.getPeriodStartDate(),currentDate)==-1 || DateUtility.compareDates(periodDto.getPeriodStartDate(),currentDate)==0) && 
    				(DateUtility.compareDates(periodDto.getPeriodEndDate(),currentDate))==1 || DateUtility.compareDates(periodDto.getPeriodEndDate(),currentDate)==0))
    		{
    			openAccPeriodsBasedOnCurrentDate.add(periodDto);	
    		}
    		
    		if((DateUtility.compareDates(periodDto.getPeriodStartDate(),execDate)==-1 || DateUtility.compareDates(periodDto.getPeriodStartDate(),execDate)==0) && 
    				(DateUtility.compareDates(periodDto.getPeriodEndDate(),execDate)==1 || DateUtility.compareDates(periodDto.getPeriodEndDate(),execDate)==0))
    		{
    			
    			accPeriodsBasedOnExecDate.setAccountingMonth(periodDto.getAccountingMonth());
    			accPeriodsBasedOnExecDate.setPeriodStartDate(periodDto.getPeriodStartDate());
    			accPeriodsBasedOnExecDate.setPeriodEndDate(periodDto.getPeriodEndDate());
    			accPeriodsBasedOnExecDate.setClosingDate(periodDto.getClosingDate());
    		}
    	}
    	
if(openAccPeriodsBasedOnCurrentDate!=null && !openAccPeriodsBasedOnCurrentDate.isEmpty() && accPeriodsBasedOnExecDate!=null)
{
    	if(openAccPeriodsBasedOnCurrentDate.size()>1)
    	{
    		for(AccountingPeriodDto accountingPeriodDto : openAccPeriodsBasedOnCurrentDate)
    		{
    			if((DateUtility.compareDates(accountingPeriodDto.getPeriodEndDate(), accPeriodsBasedOnExecDate.getPeriodEndDate())==0)
    					&& (DateUtility.compareDates(accountingPeriodDto.getPeriodStartDate(), accPeriodsBasedOnExecDate.getPeriodStartDate())==0)
    					&& (DateUtility.compareDates(accountingPeriodDto.getClosingDate(), accPeriodsBasedOnExecDate.getClosingDate())==0))
    			{
    				flag = true;
    			}
    		}
    		
    		if(flag)
    		{
    			flag = false;
    			return accPeriodsBasedOnExecDate.getAccountingMonth();
    		}
    		else
    		{
    			AccountingPeriodDto earliestPeriod = new AccountingPeriodDto();
    			AccountingPeriodDto dto = openAccPeriodsBasedOnCurrentDate.iterator().next();
    			earliestPeriod.setPeriodStartDate(dto.getPeriodStartDate());
    			earliestPeriod.setPeriodEndDate(dto.getPeriodEndDate());
    			earliestPeriod.setClosingDate(dto.getClosingDate());
    			earliestPeriod.setAccountingMonth(dto.getAccountingMonth());
    			for(AccountingPeriodDto periodDto : openAccPeriodsBasedOnCurrentDate)
    			{
    				if(DateUtility.compareDates(earliestPeriod.getPeriodStartDate(), periodDto.getPeriodStartDate())==1)
    				{
    					earliestPeriod.setPeriodStartDate(earliestPeriod.getPeriodStartDate());
    	    			earliestPeriod.setPeriodEndDate(earliestPeriod.getPeriodEndDate());
    	    			earliestPeriod.setClosingDate(earliestPeriod.getClosingDate());
    	    			earliestPeriod.setAccountingMonth(earliestPeriod.getAccountingMonth());
    				}
    			}
    			
    			return earliestPeriod.getAccountingMonth();
    					
    		}
    	}
		else
		{
			
			return openAccPeriodsBasedOnCurrentDate.iterator().next().getAccountingMonth();
		}
	}
else
	return null;
    }

    private String parAccNumber;

    public String getParAccNumber() {
        return this.parAccNumber;
    }

    public void setParAccNumber(final String pParAccNumber) {
        this.parAccNumber = pParAccNumber;
    }

    public String getArAccountNumber() {

        return this.getParAccNumber();
    }

    // net payable amount

    public BigDecimal getNetAmountPayable() {

        if (this.cassParticipantInvoiceDCMDto != null)
        {
            return this.cassParticipantInvoiceDCMDto.getNetAmountPayable();
        }
        else if (this.cassParticipantInvoiceAWBDto != null)
        {
            return this.cassParticipantInvoiceAWBDto.getNetAmountPayable();
        }
        else if (this.commercialParticipantInvoiceAWBDto != null)
        {
            return this.commercialParticipantInvoiceAWBDto.getNetAmountPayable();
        }
        else if (this.commercialParticipantInvoiceDCMDto != null)
        {
            return this.commercialParticipantInvoiceDCMDto.getNetAmountPayable();
        }
        return new BigDecimal(0);
    }

    // Commission Amount

    public BigDecimal getCommissionAmount()
    {
        if (this.cassParticipantInvoiceDCMDto != null)
        {
            return this.cassParticipantInvoiceDCMDto.getNetCommissionAmount();
        }
        else if (this.cassParticipantInvoiceAWBDto != null)
        {
            return this.cassParticipantInvoiceAWBDto.getCommissionAmount();
        }
        else if (this.commercialParticipantInvoiceAWBDto != null)
        {
            return this.commercialParticipantInvoiceAWBDto.getCommissionAmount();
        }
        else if (this.commercialParticipantInvoiceDCMDto != null)
        {
            return this.commercialParticipantInvoiceDCMDto.getNetCommissionAmount();
        }
        return commissionAmount;

    }

    // Valuation Charge

    public BigDecimal getValuationCharge() {
        if (this.cassParticipantInvoiceDCMDto != null)
        {
            return this.cassParticipantInvoiceDCMDto.getNetValuationCharge();
        }
        else if (this.cassParticipantInvoiceAWBDto != null)
        {
            return this.cassParticipantInvoiceAWBDto.getValuationCharge();
        }
        else if (this.commercialParticipantInvoiceAWBDto != null)
        {
            return this.commercialParticipantInvoiceAWBDto.getValuationCharge();
        }
        else if (this.commercialParticipantInvoiceDCMDto != null)
        {
            return this.commercialParticipantInvoiceDCMDto.getNetValuationCharge();
        }

        return new BigDecimal(0);
    }
    
 // TDS Amount

    public BigDecimal getTdsAmount() {
        if (this.cassParticipantInvoiceDCMDto != null)
        {
            return this.cassParticipantInvoiceDCMDto.getNetTdsAmount();
        }
        else if (this.cassParticipantInvoiceAWBDto != null)
        {
            return this.cassParticipantInvoiceAWBDto.getTdsAmount();
        }
        else if (this.commercialParticipantInvoiceAWBDto != null)
        {
            return this.commercialParticipantInvoiceAWBDto.getTdsAmount();
        }
        else if (this.commercialParticipantInvoiceDCMDto != null)
        {
            return this.commercialParticipantInvoiceDCMDto.getNetTdsAmount();
        }

        return new BigDecimal(0);
    }


    // Weight Charge

    public BigDecimal getWeightCharge()
    {
        if (this.cassParticipantInvoiceAWBDto != null)
        {
            return this.cassParticipantInvoiceAWBDto.getWeightCharge();
        }
        else if (this.cassParticipantInvoiceDCMDto != null)
        {
            return this.cassParticipantInvoiceDCMDto.getNetWeightCharge();
        }
        else if (this.commercialParticipantInvoiceAWBDto != null)
        {
            return this.commercialParticipantInvoiceAWBDto.getWeightCharge();
        }
        else if (this.commercialParticipantInvoiceDCMDto != null)
        {
            return this.commercialParticipantInvoiceDCMDto.getNetWeightCharge();
        }
        return new BigDecimal(0);
    }

    // Other Charge Due Carrier

    public BigDecimal getOtherChargesDueCarrier()
    {
        if (this.cassParticipantInvoiceAWBDto != null)
        {
            return this.cassParticipantInvoiceAWBDto.getOtherChargesDueCarrier();
        }
        else if (this.cassParticipantInvoiceDCMDto != null)
        {
            return this.cassParticipantInvoiceDCMDto.getNetOtherChargeDueCarrier();
        }
        else if (this.commercialParticipantInvoiceAWBDto != null)
        {
            return this.commercialParticipantInvoiceAWBDto.getOtherChargesDueCarrier();
        }
        else if (this.commercialParticipantInvoiceDCMDto != null)
        {
            return this.commercialParticipantInvoiceDCMDto.getNetOtherChargeDueCarrier();
        }
        return new BigDecimal(0);
    }

    
    /* * public BigDecimal getNetPayable()
     * {
     * BigDecimal value=new BigDecimal(0);
     * if(cassParticipantInvoiceDCMDto!=null)
     * {
     * value= cassParticipantInvoiceDCMDto.getNetAmountPayable();
     * }
     * return value;
     * }*/
     

    public CASSParticipantInvoiceAWBDto getCassParticipantInvoiceAWBDto() {
        return this.cassParticipantInvoiceAWBDto;
    }

    public void setCassParticipantInvoiceAWBDto(
                final CASSParticipantInvoiceAWBDto pCassParticipantInvoiceAWBDto) {
        this.cassParticipantInvoiceAWBDto = pCassParticipantInvoiceAWBDto;
    }

    public CASSParticipantInvoiceDCMDto getCassParticipantInvoiceDCMDto() {
        return this.cassParticipantInvoiceDCMDto;
    }

    public void setCassParticipantInvoiceDCMDto(
                final CASSParticipantInvoiceDCMDto pCassParticipantInvoiceDCMDto) {
        this.cassParticipantInvoiceDCMDto = pCassParticipantInvoiceDCMDto;
    }

    public CommercialParticipantInvoiceAWBDto getCommercialParticipantInvoiceAWBDto() {
        return this.commercialParticipantInvoiceAWBDto;
    }

    public void setCommercialParticipantInvoiceAWBDto(
                final CommercialParticipantInvoiceAWBDto pCommercialParticipantInvoiceAWBDto) {
        this.commercialParticipantInvoiceAWBDto = pCommercialParticipantInvoiceAWBDto;
    }

    public CommercialParticipantInvoiceDCMDto getCommercialParticipantInvoiceDCMDto() {
        return this.commercialParticipantInvoiceDCMDto;
    }

    public void setCommercialParticipantInvoiceDCMDto(
                final CommercialParticipantInvoiceDCMDto pCommercialParticipantInvoiceDCMDto) {
        this.commercialParticipantInvoiceDCMDto = pCommercialParticipantInvoiceDCMDto;
    }

    public AccountingFlownRevenueDto getAccFlownRevenueDto() {
        return this.accFlownRevenueDto;
    }

    public void setAccFlownRevenueDto(final AccountingFlownRevenueDto pAccFlownRevenueDto) {
        this.accFlownRevenueDto = pAccFlownRevenueDto;
    }

    public String getTriggerPoint() {
        return this.triggerPoint;
    }

    public void setTriggerPoint(final String pTriggerPoint) {
        this.triggerPoint = pTriggerPoint;
    }

    public AccountingRuleIndicators getRuleIndicator() {
        return this.ruleIndicator;
    }

    public void setRuleIndicator(final AccountingRuleIndicators pRuleIndicator) {
        this.ruleIndicator = pRuleIndicator;
    }

    public AccountingEntryDto getAccountingEntryDto() {
        return this.accountingEntryDto;
    }

    public void setAccountingEntryDto(final AccountingEntryDto pAccountingEntryDto) {
        this.accountingEntryDto = pAccountingEntryDto;
    }


	public BigDecimal getExchangeRateVariationThreshold() {
		return exchangeRateVariationThreshold;
	}


	public void setExchangeRateVariationThreshold(
			BigDecimal exchangeRateVariationThreshold) {
		this.exchangeRateVariationThreshold = exchangeRateVariationThreshold;
	}


	public InterlineBillingQueueDto getInterlineBillingQueueDto() {
		return interlineBillingQueueDto;
	}


	public void setInterlineBillingQueueDto(
			InterlineBillingQueueDto interlineBillingQueueDto) {
		this.interlineBillingQueueDto = interlineBillingQueueDto;
	}


	public String getProfitCenter() {
		return profitCenter;
	}


	public void setProfitCenter(String profitCenter) {
		this.profitCenter = profitCenter;
	}


	public String getAccountReceivable() {
		return accountReceivable;
	}


	public void setAccountReceivable(String accountReceivable) {
		this.accountReceivable = accountReceivable;
	}


	public String getAccountPayable() {
		return accountPayable;
	}


	public void setAccountPayable(String accountPayable) {
		this.accountPayable = accountPayable;
	}


	public BigDecimal getAccrualAmount() {
		return accrualAmount;
	}


	public void setAccrualAmount(BigDecimal accrualAmount) {
		this.accrualAmount = accrualAmount;
	}


	public Map<String, String> getOtherCharges() {
		return otherCharges;
	}


	public void setOtherCharges(Map<String, String> otherCharges) {
		this.otherCharges = otherCharges;
	}


	public BigDecimal getOtherChargeSuspense() {
		return otherChargeSuspense;
	}


	public void setOtherChargeSuspense(BigDecimal otherChargeSuspense) {
		this.otherChargeSuspense = otherChargeSuspense;
	}


	public ReceivableSplitDto getFuelSurcharge() {
		return fuelSurcharge;
	}


	public void setFuelSurcharge(ReceivableSplitDto fuelSurcharge) {
		this.fuelSurcharge = fuelSurcharge;
	}


	public List<AccountingAWBChargesDto> getAccAWBChargesDto() {
		return accAWBChargesDto;
	}


	public void setAccAWBChargesDto(List<AccountingAWBChargesDto> accAWBChargesDto) {
		this.accAWBChargesDto = accAWBChargesDto;
	}


	public InwardActionType getInwardActionType() {
		return inwardActionType;
	}


	public void setInwardActionType(InwardActionType inwardActionType) {
		this.inwardActionType = inwardActionType;
	}


	public InwardQueueType getInwardQueueType() {
		return inwardQueueType;
	}


	public void setInwardQueueType(InwardQueueType inwardQueueType) {
		this.inwardQueueType = inwardQueueType;
	}


	public BigDecimal getOpenProvisionAmount() {
		return openProvisionAmount;
	}


	public void setOpenProvisionAmount(BigDecimal openProvisionAmount) {
		this.openProvisionAmount = openProvisionAmount;
	}


	public ClearingHouseType getClearingHouseType() {
		return clearingHouseType;
	}


	public void setClearingHouseType(ClearingHouseType clearingHouseType) {
		this.clearingHouseType = clearingHouseType;
	}

	
	public SettlementMethodType getSettlementMethodType() {
		return settlementMethodType;
	}

	public void setSettlementMethodType(SettlementMethodType settlementMethodType) {
		this.settlementMethodType = settlementMethodType;
	}

	
    
    

    // ParticipantPayableDto participantPayableDto = new ParticipantPayableDto();

    // ParticipantInvoiceDetailDto participantInvoiceDetailDto= new ParticipantInvoiceDetailDto();

    // OtherChargeSplitDto otherChargeSplitDto = new OtherChargeSplitDto();

    // public BigDecimal getOtherChargedueCarrier() {
    //
    // while(otherChargeSplitDto.getOtherChargeCode()!=null){
    // count = count.add(otherChargeSplitDto.getOtherChargeAmount());
    // }
    // otherChargedueCarrier = count.subtract(fuelSurcharge);
    // otherChargedueCarrier = count.subtract(securitySurcharge);
    // return otherChargedueCarrier;
    // }
    //
    // public BigDecimal getCommissionAmount() {
    // commissionAmount = participantPayableDto.getCommissionAmount();
    //
    // return commissionAmount;
    // }
    //
    // public BigDecimal getSecuritySurcharge() {
    // if(otherChargeSplitDto.getOtherChargeCode().equals("MY")){
    // securitySurcharge = otherChargeSplitDto.getOtherChargeAmount();
    // }
    // return securitySurcharge;
    // }
    //
    // public BigDecimal getFuelSurcharge() {
    // if(otherChargeSplitDto.getOtherChargeCode().equals("")){
    // fuelSurcharge = otherChargeSplitDto.getOtherChargeAmount();
    // }
    // else{
    // fuelSurcharge = null;
    // }
    //
    // return fuelSurcharge;
    // }
    //
    //
    //
    //
    // public BigDecimal getWeightCharge(){
    // weightCharge = participantInvoiceDetailDto.getWeightCharge();
    // return weightCharge;
    //
    // }
    //
    // public AccountingTriggeringPoints getTriggerPoint() {
    // return triggerPoint;
    // }
    //
    // public void setTriggerPoint(AccountingTriggeringPoints triggerPoint) {
    // this.triggerPoint = triggerPoint;
    // }
    //
    // public AccountingRuleIndicators getRuleIndicator() {
    // return ruleIndicator;
    // }
    //
    // public void setRuleIndicator(AccountingRuleIndicators ruleIndicator) {
    // this.ruleIndicator = ruleIndicator;
    // }
    //
    // public Set getInvoiceAWBDto() {
    // return invoiceAWBDto;
    // }
    //
    // public void setInvoiceAWBDto(Set invoiceAWBDto) {
    // this.invoiceAWBDto = invoiceAWBDto;
    // }
    //
    // public Set getParticipantInvoiceDCMDto() {
    // return participantInvoiceDCMDto;
    // }
    //
    // public void setParticipantInvoiceDCMDto(Set participantInvoiceDCMDto) {
    // this.participantInvoiceDCMDto = participantInvoiceDCMDto;
    // }
    //
    // public AccountingEntryDto getAccountingEntryDto() {
    // return accountingEntryDto;
    // }
    //
    // public void setAccountingEntryDto(AccountingEntryDto accountingEntryDto) {
    // this.accountingEntryDto = accountingEntryDto;
    // }

}
