/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.CommercialInvoiceTypes;

import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;



/**
 * The Class CASSParticipantInvoiceAWBDto.
 */
public class CommercialParticipantInvoiceAWBDto extends ParticipantInvoiceDetailDto {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4786601253961156710L;

	/** The valuation charge. */
	private BigDecimal valuationCharge;
	
	/** The other charges due carrier. */
	private BigDecimal otherChargesDueCarrier;
	
	/** The other charges due agent. */
	private BigDecimal otherChargesDueAgent;
	
	/** The commission percentage. */
	private BigDecimal commissionPercentage;
	
	/** The commission amount. */
	private BigDecimal commissionAmount;
	
	/** The commission indicator. */
	private boolean commissionIndicator;
	
	/** The tds percentage. */
	private BigDecimal tdsPercentage;
	
	/** The tds amount. */
	private BigDecimal tdsAmount;
	
	private boolean reversalIndicator;
	
	/** The awbInvoiceType. */
	private CommercialInvoiceTypes awbInvoiceType;
	
	/** ISC Amount */
	private BigDecimal iscAmountBilled;
	
	public BigDecimal getIscAmountBilled() {
		if(iscAmountBilled==null)
		{
			iscAmountBilled=new BigDecimal(0);
		}
		return iscAmountBilled;
	}
	
	public void setIscAmountBilled(BigDecimal bigDecimal) {
		this.iscAmountBilled = bigDecimal;
	}	
	
	public BigDecimal getTdsPercentage() {
		if(tdsPercentage==null) {
			tdsPercentage =new BigDecimal(0);
		}
		return tdsPercentage;
	}

	public void setTdsPercentage(BigDecimal tdsPercentage) {
		this.tdsPercentage = tdsPercentage;
	}

	public BigDecimal getTdsAmount() {
		if(tdsAmount==null) {
			tdsAmount =new BigDecimal(0);
		}
		return tdsAmount;
	}

	public void setTdsAmount(BigDecimal tdsAmount) {
		this.tdsAmount = tdsAmount;
	}
	
	public boolean isReversalIndicator() {
		return reversalIndicator;
	}

	public void setReversalIndicator(boolean reversalIndicator) {
		this.reversalIndicator = reversalIndicator;
	}

	/** The discount amount. */
	private BigDecimal discountAmount;
	
    private BigDecimal fuelSurcharge;
	
	private BigDecimal securitySurcharge;
	
	/** The tax due airline. */
	private BigDecimal taxDueAirline;
	
	/** The tax due agent. */
	private BigDecimal taxDueAgent;
	
	/** The tax due airline indicator. */
	private boolean taxDueAirlineIndicator;
	
	/** The discount indicator. */
	private boolean discountIndicator;
	
	/** The number of pieces */       //Deepti
	private String pieces;

	public String getCommodityType() {
		return commodityType;
	}

	public void setCommodityType(String commodityType) {
		this.commodityType = commodityType;
	}

	/** The commodity type */
	private String commodityType;
	
	

	/** The c ass participant invoice summary dto. */
	private CommercialParticipantInvoiceSummaryDto commercialParticipantInvoiceSummaryDto;
	
	/** The participant receivable dto. */
	private List<ParticipantReceivableDto> participantReceivableDtos;
	
	private CarrierReceivableDto carrierReceivableDto;
	
	private List<ReceivableSplitDto> otherchargesBreakDown;
	
	private ParticipantReceivableDto participantReceivableDto;
	
	private List<ParticipantPayableDto> participantPayableDtos;
	
	private ParticipantPayableDto participantPayableDto;
	

	private BigDecimal  netAmountBeforeTax;
	private BigDecimal  netAmountPayable;
	
	private BigDecimal  freightCharges;
	
	private String payCodeIndicator;
	
	private String remarks;
	
	//item 177
	
	private BigDecimal keralaFloodCess;
	
	private BigDecimal commercialSurcharge;

	private BigDecimal governmentTax;
	
	private BigDecimal stateTax;

	/** CGST */
	private BigDecimal cgst;
	
	/** SGST */
	private BigDecimal sgst;
	
	/** IGST */
	private BigDecimal igst;
	
	private BigDecimal gstAmount;
	
	/** documentNumber */
	private String documentNumber;
	

	/** User Audit Information */
	private UserAuditDto userAudit;
	
	public BigDecimal getCommercialSurcharge() {
		if(commercialSurcharge==null)
		{
			commercialSurcharge=new BigDecimal(0);
		}
		return commercialSurcharge;
	}

	public void setCommercialSurcharge(BigDecimal commercialSurcharge) {
		this.commercialSurcharge = commercialSurcharge;
	}
	
    public BigDecimal getCgst() {
		return cgst;
	}

	public void setCgst(BigDecimal cgst) {
		this.cgst = cgst;
	}

	public BigDecimal getSgst() {
		return sgst;
	}

	public void setSgst(BigDecimal sgst) {
		this.sgst = sgst;
	}

	public BigDecimal getIgst() {
		return igst;
	}

	public void setIgst(BigDecimal igst) {
		this.igst = igst;
	}
	
    
    public UserAuditDto getUserAudit() {
        return userAudit;
    }

    public void setUserAudit(UserAuditDto userAudit) {
        this.userAudit = userAudit;
    }


	/**
	 * @return the fuelSurcharge
	 */
	public BigDecimal getFuelSurcharge() {
		if(fuelSurcharge==null)
		{
			fuelSurcharge=new BigDecimal(0);
		}
		return fuelSurcharge;
	}

	/**
	 * @param fuelSurcharge the fuelSurcharge to set
	 */
	public void setFuelSurcharge(BigDecimal fuelSurcharge) {
		this.fuelSurcharge = fuelSurcharge;
	}

	/**
	 * @return the securitySurcharge
	 */
	public BigDecimal getSecuritySurcharge() {
		if(securitySurcharge==null)
		{
			securitySurcharge=new BigDecimal(0);
		}
		return securitySurcharge;
	}

	/**
	 * @param securitySurcharge the securitySurcharge to set
	 */
	public void setSecuritySurcharge(BigDecimal securitySurcharge) {
		this.securitySurcharge = securitySurcharge;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
	/**
	 * @return the participantReceivableDto
	 */
	public ParticipantReceivableDto getParticipantReceivableDto() {
		return participantReceivableDto;
	}

	/**
	 * @param participantReceivableDto the participantReceivableDto to set
	 */
	public void setParticipantReceivableDto(
			ParticipantReceivableDto participantReceivableDto) {
		this.participantReceivableDto = participantReceivableDto;
	}

	/**
	 * Gets the valuation charge.
	 *
	 * @return the valuation charge
	 */
	public BigDecimal getValuationCharge() {
		if(valuationCharge==null)
		{
			valuationCharge=new BigDecimal(0);
		}
		return valuationCharge;
	}

	/**
	 * Sets the valuation charge.
	 *
	 * @param valuationCharge the new valuation charge
	 */
	public void setValuationCharge(BigDecimal valuationCharge) {
		this.valuationCharge = valuationCharge;
	}

	/**
	 * Gets the other charges due carrier.
	 *
	 * @return the other charges due carrier
	 */
	public BigDecimal getOtherChargesDueCarrier() {
		if(otherChargesDueCarrier==null)
		{
			otherChargesDueCarrier=new BigDecimal(0);
		}
		return otherChargesDueCarrier;
	}

	/**
	 * Sets the other charges due carrier.
	 *
	 * @param otherChargesDueCarrier the new other charges due carrier
	 */
	public void setOtherChargesDueCarrier(BigDecimal otherChargesDueCarrier) {
		this.otherChargesDueCarrier = otherChargesDueCarrier;
	}

	/**
	 * Gets the other charges due agent.
	 *
	 * @return the other charges due agent
	 */
	public BigDecimal getOtherChargesDueAgent() {
		
		if(otherChargesDueAgent==null)
		{
			otherChargesDueAgent=new BigDecimal(0);
		}
		return otherChargesDueAgent;
	}

	/**
	 * Sets the other charges due agent.
	 *
	 * @param otherChargesDueAgent the new other charges due agent
	 */
	public void setOtherChargesDueAgent(BigDecimal otherChargesDueAgent) {
		this.otherChargesDueAgent = otherChargesDueAgent;
	}

	/**
	 * Gets the commission percentage.
	 *
	 * @return the commission percentage
	 */
	public BigDecimal getCommissionPercentage() {
		if(commissionPercentage==null)
		{
			commissionPercentage=new BigDecimal(0);
		}
		return commissionPercentage;
	}

	/**
	 * Sets the commission percentage.
	 *
	 * @param commissionPercentage the new commission percentage
	 */
	public void setCommissionPercentage(BigDecimal commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}

	/**
	 * Gets the commission amount.
	 *
	 * @return the commission amount
	 */
	public BigDecimal getCommissionAmount() {
		if(commissionAmount==null)
		{
			commissionAmount=new BigDecimal(0);
		}
		return commissionAmount;
	}

	/**
	 * Sets the commission amount.
	 *
	 * @param commissionAmount the new commission amount
	 */
	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	/**
	 * Gets the commission indicator.
	 *
	 * @return the commission indicator
	 */
	public boolean getCommissionIndicator() {
		return commissionIndicator;
	}

	/**
	 * Sets the commission indicator.
	 *
	 * @param commissionIndicator the new commission indicator
	 */
	public void setCommissionIndicator(boolean commissionIndicator) {
		this.commissionIndicator = commissionIndicator;
	}

	/**
	 * Gets the discount amount.
	 *
	 * @return the discount amount
	 */
	public BigDecimal getDiscountAmount() {
		if(discountAmount==null)
		{
			discountAmount=new BigDecimal(0);
		}
		return discountAmount;
	}

	/**
	 * Sets the discount amount.
	 *
	 * @param discountAmount the new discount amount
	 */
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	/**
	 * Gets the tax due airline.
	 *
	 * @return the tax due airline
	 */
	public BigDecimal getTaxDueAirline() {
		if(taxDueAirline==null)
		{
			taxDueAirline=new BigDecimal(0);
		}
		return taxDueAirline;
	}

	/**
	 * Sets the tax due airline.
	 *
	 * @param taxDueAirline the new tax due airline
	 */
	public void setTaxDueAirline(BigDecimal taxDueAirline) {
		this.taxDueAirline = taxDueAirline;
	}

	
	//item 177
	
	public BigDecimal getGovernmentTax(){
		
		if(governmentTax==null)
		{
			governmentTax=new BigDecimal(0);
		}
		return governmentTax;
	}

	public void setGovernmentTax(BigDecimal governmentTax) {
	this.governmentTax = governmentTax;
	}

	public BigDecimal getStateTax(){
	
	if(stateTax==null)
	{
		stateTax=new BigDecimal(0);
	}
	return stateTax;
	}

	public void setStateTax(BigDecimal stateTax) {
		this.stateTax = stateTax;
	}

	//Rehan Changes Start
	public BigDecimal getKeralaFloodCess() {
	if(keralaFloodCess==null)
	{
		keralaFloodCess=new BigDecimal(0);
	}
	return keralaFloodCess;
	}

	public void setKeralaFloodCess(BigDecimal keralaFloodCess) {
		this.keralaFloodCess = keralaFloodCess;
	}

	//Rehan Changes End


	/**
	 * Gets the tax due agent.
	 *
	 * @return the tax due agent
	 */
	public BigDecimal getTaxDueAgent() {
		if(taxDueAgent==null)
		{
			taxDueAgent=new BigDecimal(0);
		}
		return taxDueAgent;
	}

	/**
	 * Sets the tax due agent.
	 *
	 * @param taxDueAgent the new tax due agent
	 */
	public void setTaxDueAgent(BigDecimal taxDueAgent) {
		this.taxDueAgent = taxDueAgent;
	}

	/**
	 * Gets the tax due airline indicator.
	 *
	 * @return the tax due airline indicator
	 */
	public boolean getTaxDueAirlineIndicator() {
		return taxDueAirlineIndicator;
	}

	/**
	 * Sets the tax due airline indicator.
	 *
	 * @param taxDueAirlineIndicator the new tax due airline indicator
	 */
	public void setTaxDueAirlineIndicator(boolean taxDueAirlineIndicator) {
		this.taxDueAirlineIndicator = taxDueAirlineIndicator;
	}

	/**
	 * Gets the discount indicator.
	 *
	 * @return the discount indicator
	 */
	public boolean getDiscountIndicator() {
		return discountIndicator;
	}

	/**
	 * Sets the discount indicator.
	 *
	 * @param discountIndicator the new discount indicator
	 */
	public void setDiscountIndicator(boolean discountIndicator) {
		this.discountIndicator = discountIndicator;
	}

	

	public CommercialParticipantInvoiceSummaryDto getCommercialParticipantInvoiceSummaryDto() {
		return commercialParticipantInvoiceSummaryDto;
	}

	public void setCommercialParticipantInvoiceSummaryDto(
			CommercialParticipantInvoiceSummaryDto commercialParticipantInvoiceSummaryDto) {
		this.commercialParticipantInvoiceSummaryDto = commercialParticipantInvoiceSummaryDto;
	}

	public List<ReceivableSplitDto> getOtherchargesBreakDown() {
		if(otherchargesBreakDown ==null)
		{
			otherchargesBreakDown = new ArrayList<ReceivableSplitDto>();
		}
		return otherchargesBreakDown;
	}

	public void setOtherchargesBreakDown(
			List<ReceivableSplitDto> otherchargesBreakDown) {
		this.otherchargesBreakDown = otherchargesBreakDown;
	}

	/**
	 * @return the participantReceivableDtos
	 */
	public List<ParticipantReceivableDto> getParticipantReceivableDtos() {
		if(participantReceivableDtos==null)
		{
			participantReceivableDtos = new ArrayList<ParticipantReceivableDto>();
		}
		return participantReceivableDtos;
	}

	/**
	 * @param participantReceivableDtos the participantReceivableDtos to set
	 */
	public void setParticipantReceivableDtos(
			List<ParticipantReceivableDto> participantReceivableDtos) {
		this.participantReceivableDtos = participantReceivableDtos;
	}
	


	public BigDecimal getNetAmountBeforeTax() {
		if(netAmountBeforeTax == null)
			netAmountBeforeTax=new BigDecimal(0); 
		/*//System.out.println("in net tax");
		netAmountBeforeTax=netAmountBeforeTax.add(getWeightCharge());
		//netAmountBeforeTax=netAmountBeforeTax.add(getValuationCharge());
		netAmountBeforeTax=netAmountBeforeTax.add(getOtherChargesDueCarrier());
		netAmountBeforeTax=netAmountBeforeTax.add(getFuelSurcharge());
	   
	   netAmountBeforeTax=netAmountBeforeTax.subtract(getCommissionAmount());
	   netAmountBeforeTax=netAmountBeforeTax.subtract(getOtherChargesDueAgent());
	   //System.out.println("in net tax1"); */  
		return netAmountBeforeTax;
	} 

	public void setNetAmountBeforeTax(BigDecimal netAmountBeforeTax) {
		
		
		this.netAmountBeforeTax = netAmountBeforeTax;
	}

	public BigDecimal getNetAmountPayable() {
		
		if(netAmountPayable==null)
			netAmountPayable=new BigDecimal(0);
			/*netAmountPayable=netAmountPayable.add(getNetAmountBeforeTax());
			netAmountPayable=netAmountPayable.add(getTaxDueAirline());
			netAmountPayable=netAmountPayable.subtract(getTaxDueAgent());*/
		return netAmountPayable;
		
	}

	public void setNetAmountPayable(BigDecimal netAmountPayable) {
		this.netAmountPayable = netAmountPayable;
	}

	public BigDecimal getFreightCharges() {
		freightCharges=new BigDecimal(0); 
		
		freightCharges=freightCharges.add(getWeightCharge());
		freightCharges=freightCharges.add(getValuationCharge());
		//freightCharges=freightCharges.add(getOtherChargesDueCarrier());
	  
		return freightCharges;
	}

	public String getPieces() {
		return pieces;
	}

	public void setPieces(String pieces) {
		this.pieces = pieces;
	}
	public void setFreightCharges(BigDecimal freightCharges) {
		this.freightCharges = freightCharges;
	}

	public CarrierReceivableDto getCarrierReceivableDto() {
		return carrierReceivableDto;
	}

	public void setCarrierReceivableDto(CarrierReceivableDto carrierReceivableDto) {
		this.carrierReceivableDto = carrierReceivableDto;
	}

	public List<ParticipantPayableDto> getParticipantPayableDtos() {
		if(participantPayableDtos==null)
		{
			participantPayableDtos = new ArrayList<ParticipantPayableDto>();
		}
		return participantPayableDtos;
	}

	public void setParticipantPayableDtos(List<ParticipantPayableDto> participantPayableDtos) {
		this.participantPayableDtos = participantPayableDtos;
	}

	public ParticipantPayableDto getParticipantPayableDto() {
		return participantPayableDto;
	}

	public void setParticipantPayableDto(ParticipantPayableDto participantPayableDto) {
		this.participantPayableDto = participantPayableDto;
	}

	public CommercialInvoiceTypes getAwbInvoiceType() {
		return awbInvoiceType;
	}

	public void setAwbInvoiceType(CommercialInvoiceTypes awbInvoiceType) {
		this.awbInvoiceType = awbInvoiceType;
	}

	public BigDecimal getGstAmount() {
		return gstAmount;
	}

	public void setGstAmount(BigDecimal gstAmount) {
		this.gstAmount = gstAmount;
	}

	
}