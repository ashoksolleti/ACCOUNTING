/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;



public class CommercialParticipantInvoiceSummaryDto extends
		ParticipantInvoiceSummaryDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5707441791677442002L;

	/** The total invoice weight. */
	private BigDecimal totalInvoiceWeight;
	private BigDecimal netTotalInvoiceDueAirline;

	private BigDecimal totalInvoicePrepaidCharges;

	private BigDecimal totalInvoiceCollectCharges;

	private BigDecimal totalInvoiceCommission;
	
	private BigDecimal totalInvoiceTds;

	private BigDecimal totalInvoiceIncentive;

	private BigDecimal totalInvoiceNetAmountBeforeTax;

	private BigDecimal totalInvoiceTax;

	private BigDecimal totalInvoiceNetAmountPayable;

	private BigDecimal totalFreightCharges;
	
	/** The tax due airline. */
	private BigDecimal totalTaxDueAirline;
	
	//item 177
	
	private BigDecimal totalGovernmentTax;
	
	private BigDecimal totalStateTax;
	
	
	/** The tax due agent. */
	private BigDecimal totalTaxDueAgent;

	private BigDecimal totalOtherChargesDueAgent;

	private BigDecimal totalWeightCharges;

	private BigDecimal totalOtherChargesDueCarrier;
	
	private BigDecimal totalGSTAmount;
	
	private BigDecimal cgst;
	
	private BigDecimal sgst;
	
	private BigDecimal igst;
	
	private BigDecimal gstAmount;
	
	private BigDecimal totalValuationCharges;
	
	private String billingCarrier;
	
	//Rehan Changes start
	private BigDecimal keralaFloodCess;
	//Rehan Changes end
	
	private BigDecimal commercialSurcharge;

	/** The c ass participant invoice dcm dto. */
	private Set<CommercialParticipantInvoiceDCMDto> commercialParticipantInvoiceDCMDto;

	/** The c ass participant invoice cca dto. */
	private Set<CommercialParticipantInvoiceCCADto> commercialParticipantInvoiceCCADto;

	/** The c ass participant invoice awb dto. */
	private Set<CommercialParticipantInvoiceAWBDto> commercialParticipantInvoiceAWBDto;
	

	public BigDecimal getCommercialSurcharge() {
		if (commercialSurcharge == null)
		{
			commercialSurcharge = new BigDecimal(0);
		}
		return commercialSurcharge;
	}

	public void setCommercialSurcharge(BigDecimal commercialSurcharge) {
		this.commercialSurcharge = commercialSurcharge;
	}
	
	public BigDecimal getTotalFreightCharges() {
		
		totalFreightCharges=new BigDecimal(0);
		
		totalFreightCharges=totalFreightCharges.add(getTotalInvoicePrepaidCharges());
		totalFreightCharges=totalFreightCharges.add(getTotalInvoiceCollectCharges());
		return totalFreightCharges;
	}

	public void setTotalFreightCharges(BigDecimal totalFreightCharges) {
		this.totalFreightCharges = totalFreightCharges;
	}

	public BigDecimal getTotalTaxDueAirline() {
		
		if(totalTaxDueAirline == null){
			totalTaxDueAirline = new BigDecimal(0);
		}
		return totalTaxDueAirline;
	}

	public void setTotalTaxDueAirline(BigDecimal totalTaxDueAirline) {
		this.totalTaxDueAirline = totalTaxDueAirline;
	}
	
	//item 177
	public BigDecimal getTotalGovernmentTax() {
		
		if(totalGovernmentTax == null){
			totalGovernmentTax = new BigDecimal(0);
		}
		return totalGovernmentTax;
	}

	public void setTotalGovernmentTax(BigDecimal pTotalGovernmentTax) {
		this.totalGovernmentTax = pTotalGovernmentTax;
	}
	
	public BigDecimal getTotalStateTax() {
		
		if(totalStateTax == null){
			totalStateTax = new BigDecimal(0);
		}
		return totalStateTax;
	}

	public void setTotalStateTax(BigDecimal pTotalStateTax) {
		this.totalStateTax = pTotalStateTax;
	}




	public BigDecimal getTotalTaxDueAgent() {
		
		if(totalTaxDueAgent == null){
			totalTaxDueAgent = new BigDecimal(0);
		}
		return totalTaxDueAgent;
	}

	public void setTotalTaxDueAgent(BigDecimal totalTaxDueAgent) {
		this.totalTaxDueAgent = totalTaxDueAgent;
	}

	public BigDecimal getTotalOtherChargesDueAgent() {
		
		if(totalOtherChargesDueAgent == null){
			totalOtherChargesDueAgent = new BigDecimal(0);
		}
		return totalOtherChargesDueAgent;
	}

	public void setTotalOtherChargesDueAgent(
			BigDecimal totalOtherChargesDueAgent) {
		this.totalOtherChargesDueAgent = totalOtherChargesDueAgent;
	}
	
	//Rehan Changes Start
	
	public BigDecimal getKeralaFloodCess() {
		if(keralaFloodCess == null){
			keralaFloodCess = new BigDecimal(0);
		}
		return keralaFloodCess;
	}

	public void setKeralaFloodCess(BigDecimal keralaFloodCess) {
		this.keralaFloodCess = keralaFloodCess;
	}
	
	//Rehan Changes End

	public BigDecimal getTotalWeightCharges() {
		
		if(totalWeightCharges == null)
		{
			totalWeightCharges=new BigDecimal(0);
		}
		return totalWeightCharges;
	}

	public void setTotalWeightCharges(BigDecimal totalWeightCharges) {
		this.totalWeightCharges = totalWeightCharges;
	}

	public BigDecimal getTotalOtherChargesDueCarrier() {
		
		if(totalOtherChargesDueCarrier == null)
		{
			totalOtherChargesDueCarrier=new BigDecimal(0);
		}
		return totalOtherChargesDueCarrier;
	}

	public void setTotalOtherChargesDueCarrier(
			BigDecimal totalOtherChargesDueCarrier) {
		this.totalOtherChargesDueCarrier = totalOtherChargesDueCarrier;
	}

	

	public Set<CommercialParticipantInvoiceDCMDto> getCommercialParticipantInvoiceDCMDto() {
		if(commercialParticipantInvoiceDCMDto==null)
		{
			commercialParticipantInvoiceDCMDto = new LinkedHashSet<CommercialParticipantInvoiceDCMDto>();
		}
		return commercialParticipantInvoiceDCMDto;
	}

	public void setCommercialParticipantInvoiceDCMDto(
			Set<CommercialParticipantInvoiceDCMDto> commercialParticipantInvoiceDCMDto) {
		this.commercialParticipantInvoiceDCMDto = commercialParticipantInvoiceDCMDto;
	}

	public Set<CommercialParticipantInvoiceCCADto> getCommercialParticipantInvoiceCCADto() {
		if (commercialParticipantInvoiceCCADto == null) {
			commercialParticipantInvoiceCCADto = new LinkedHashSet<CommercialParticipantInvoiceCCADto>();
		}
		return commercialParticipantInvoiceCCADto;
	}

	public void setCommercialParticipantInvoiceCCADto(
			Set<CommercialParticipantInvoiceCCADto> commercialParticipantInvoiceCCADto) {
		this.commercialParticipantInvoiceCCADto = commercialParticipantInvoiceCCADto;
	}

	public Set<CommercialParticipantInvoiceAWBDto> getCommercialParticipantInvoiceAWBDto() {
		if (commercialParticipantInvoiceAWBDto == null) {
			commercialParticipantInvoiceAWBDto = new LinkedHashSet<CommercialParticipantInvoiceAWBDto>();
		}
		return commercialParticipantInvoiceAWBDto;
	}

	public void setCommercialParticipantInvoiceAWBDto(
			Set<CommercialParticipantInvoiceAWBDto> commercialParticipantInvoiceAWBDto) {
		this.commercialParticipantInvoiceAWBDto = commercialParticipantInvoiceAWBDto;
	}

	public BigDecimal getTotalInvoicePrepaidCharges() {
		
		  if(totalInvoicePrepaidCharges == null){
			  totalInvoicePrepaidCharges = new BigDecimal(0);
		  }
		
		return totalInvoicePrepaidCharges;
	}

	public void setTotalInvoicePrepaidCharges(
			BigDecimal totalInvoicePrepaidCharges) {
		this.totalInvoicePrepaidCharges = totalInvoicePrepaidCharges;
	}

	public BigDecimal getTotalInvoiceCollectCharges() {
		
		if(totalInvoiceCollectCharges == null){
			totalInvoiceCollectCharges = new BigDecimal(0);
		}
		return totalInvoiceCollectCharges;
	}

	public void setTotalInvoiceCollectCharges(
			BigDecimal totalInvoiceCollectCharges) {
		this.totalInvoiceCollectCharges = totalInvoiceCollectCharges;
	}

	public BigDecimal getTotalInvoiceCommission() {
		
		if(totalInvoiceCommission == null){
			totalInvoiceCommission = new BigDecimal(0);
		}
		return totalInvoiceCommission;
	}

	public void setTotalInvoiceCommission(BigDecimal totalInvoiceCommission) {
		this.totalInvoiceCommission = totalInvoiceCommission;
	}
	
	public BigDecimal getTotalInvoiceTds() {
		if(totalInvoiceTds == null){
			totalInvoiceTds = new BigDecimal(0);
		}
		return totalInvoiceTds;
	}

	public void setTotalInvoiceTds(BigDecimal totalInvoiceTds) {
		this.totalInvoiceTds = totalInvoiceTds;
	}

	/**
	 * @return the totalValuationCharges
	 */
	public BigDecimal getTotalValuationCharges() {
		
		if(totalValuationCharges == null){
			totalValuationCharges = new BigDecimal(0);
		}
		return totalValuationCharges;
	}

	/**
	 * @param totalValuationCharges the totalValuationCharges to set
	 */
	public void setTotalValuationCharges(BigDecimal totalValuationCharges) {
		this.totalValuationCharges = totalValuationCharges;
	}

	public BigDecimal getTotalInvoiceIncentive() {
		
		if(totalInvoiceIncentive == null){
			totalInvoiceIncentive = new BigDecimal(0);
		}
		return totalInvoiceIncentive;
	}

	public void setTotalInvoiceIncentive(BigDecimal totalInvoiceIncentive) {
		this.totalInvoiceIncentive = totalInvoiceIncentive;
	}

	public BigDecimal getTotalInvoiceNetAmountBeforeTax() {
		
		if(totalInvoiceNetAmountBeforeTax == null){
			totalInvoiceNetAmountBeforeTax = new BigDecimal(0);
		}
		return totalInvoiceNetAmountBeforeTax;
	}

	public void setTotalInvoiceNetAmountBeforeTax(
			BigDecimal totalInvoiceNetAmountBeforeTax) {
		if (totalInvoiceNetAmountBeforeTax == null) {
			totalInvoiceNetAmountBeforeTax = new BigDecimal(0);
		}
		this.totalInvoiceNetAmountBeforeTax = totalInvoiceNetAmountBeforeTax;
	}

	public BigDecimal getTotalInvoiceTax() {
		
		if(totalInvoiceTax == null){
			totalInvoiceTax = new BigDecimal(0);
		}
		return totalInvoiceTax;
	}

	public void setTotalInvoiceTax(BigDecimal totalInvoiceTax) {
		this.totalInvoiceTax = totalInvoiceTax;
	}

	public BigDecimal getTotalInvoiceNetAmountPayable() {
		
		if (totalInvoiceNetAmountPayable==null){
			totalInvoiceNetAmountPayable = new BigDecimal(0);
		}
		return totalInvoiceNetAmountPayable;
	}

	public void setTotalInvoiceNetAmountPayable(
			BigDecimal totalInvoiceNetAmountPayable) {
		this.totalInvoiceNetAmountPayable = totalInvoiceNetAmountPayable;
	}

	public BigDecimal getNetTotalInvoiceDueAirline() {
		
		if(netTotalInvoiceDueAirline == null){
			netTotalInvoiceDueAirline = new BigDecimal(0);
		}
		return netTotalInvoiceDueAirline;
	}

	public void setNetTotalInvoiceDueAirline(
			BigDecimal netTotalInvoiceDueAirline) {
		this.netTotalInvoiceDueAirline = netTotalInvoiceDueAirline;
	}

	public BigDecimal getTotalInvoiceWeight() {
		
		if(totalInvoiceWeight == null){
			totalInvoiceWeight = new BigDecimal(0);
		}
		return totalInvoiceWeight;
	}

	public void setTotalInvoiceWeight(BigDecimal totalInvoiceWeight) {
		this.totalInvoiceWeight = totalInvoiceWeight;
	}

	public String getBillingCarrier() {
		return billingCarrier;
	}

	public void setBillingCarrier(String billingCarrier) {
		this.billingCarrier = billingCarrier;
	}

	public BigDecimal getTotalGSTAmount() {
		return totalGSTAmount;
	}

	public void setTotalGSTAmount(BigDecimal totalGSTAmount) {
		this.totalGSTAmount = totalGSTAmount;
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

	public BigDecimal getGstAmount() {
		return gstAmount;
	}

	public void setGstAmount(BigDecimal gstAmount) {
		this.gstAmount = gstAmount;
	}
}