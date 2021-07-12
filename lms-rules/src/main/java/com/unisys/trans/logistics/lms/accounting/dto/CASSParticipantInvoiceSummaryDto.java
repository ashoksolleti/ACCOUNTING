/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * The Class CASSParticipantInvoiceSummaryDto.
 *
 * @author SeramRaK
 */
public class CASSParticipantInvoiceSummaryDto extends
		ParticipantInvoiceSummaryDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3948817331094628479L;

	/** The total invoice weight. */
	private BigDecimal totalInvoiceWeight;

	/** The total invoice prepaid charges. */
	private BigDecimal totalInvoicePrepaidCharges;

	/** The total invoice collect charges. */
	private BigDecimal totalInvoiceCollectCharges;

	/** The total invoice commission. */
	private BigDecimal totalInvoiceCommission;
	
	/** The total invoice TDS. */
	private BigDecimal totalInvoiceTds;

	/** The total invoice incentive. */
	private BigDecimal totalInvoiceIncentive;

	/** The total invoice net amount before tax. */
	private BigDecimal totalInvoiceNetAmountBeforeTax;

	/** The total invoice tax. */
	private BigDecimal totalInvoiceTax;

	/** The total invoice net amount payable. */
	private BigDecimal totalInvoiceNetAmountPayable;

	/** The net total invoice due airline. */
	private BigDecimal netTotalInvoiceDueAirline;
	
	/** The tax due airline. */
	private BigDecimal totalTaxDueAirline;
	
	/** The tax due agent. */
	private BigDecimal totalTaxDueAgent;
	
	private BigDecimal totalOtherChargesDueAgent;
	
	private BigDecimal totalWeightCharges;
    
    
    private BigDecimal totalOtherChargesDueCarrier;
    
    private BigDecimal totalValuationCharges;
    
    private String billingCarrier;
    
    //item 177
    
    private BigDecimal totalGovernmentTax;

	private BigDecimal totalStateTax;
	
	//Rehan Changes Start
	private BigDecimal keralaFloodCess;
	
	private BigDecimal gstAmount;
	
	//Rehan Changes End
	
	private BigDecimal commercialSurcharge;

	/** The c ass participant invoice cca dto. */
	private Set<CASSParticipantInvoiceCCADto> cASSParticipantInvoiceCCADto;

	/** The c ass participant invoice awb dto. */
	private Set<CASSParticipantInvoiceAWBDto> cASSParticipantInvoiceAWBDto;
	
	/** The c ass participant invoice dcm dto. */
	private Set<CASSParticipantInvoiceDCMDto> cASSParticipantInvoiceDCMDto;
	
	
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

	/**
	 * Gets the total invoice prepaid charges.
	 *
	 * @return the total invoice prepaid charges
	 */
	public BigDecimal getTotalInvoicePrepaidCharges() {
		if (totalInvoicePrepaidCharges == null)
		{
			totalInvoicePrepaidCharges = new BigDecimal(0);
		}
		return totalInvoicePrepaidCharges;
	}

	/**
	 * Sets the total invoice prepaid charges.
	 *
	 * @param totalInvoicePrepaidCharges the new total invoice prepaid charges
	 */
	public void setTotalInvoicePrepaidCharges(
			BigDecimal totalInvoicePrepaidCharges) {
		this.totalInvoicePrepaidCharges = totalInvoicePrepaidCharges;
	}

	/**
	 * Gets the total invoice collect charges.
	 *
	 * @return the total invoice collect charges
	 */
	public BigDecimal getTotalInvoiceCollectCharges() {

		if(totalInvoiceCollectCharges == null)
		{
			totalInvoiceCollectCharges = new BigDecimal(0);
		}
		return totalInvoiceCollectCharges;
	}

	/**
	 * Sets the total invoice collect charges.
	 *
	 * @param totalInvoiceCollectCharges the new total invoice collect charges
	 */
	public void setTotalInvoiceCollectCharges(
			BigDecimal totalInvoiceCollectCharges) {
		this.totalInvoiceCollectCharges = totalInvoiceCollectCharges;
	}

	/**
	 * Gets the total invoice commission.
	 *
	 * @return the total invoice commission
	 */
	public BigDecimal getTotalInvoiceCommission() {
		if(totalInvoiceCommission == null)
		{
			totalInvoiceCommission = new BigDecimal(0);
		}
		return totalInvoiceCommission;
	}
	
	/**
	 * Sets the total invoice commission.
	 *
	 * @param totalInvoiceCommission the new total invoice commission
	 */
	public void setTotalInvoiceCommission(BigDecimal totalInvoiceCommission) {
		this.totalInvoiceCommission = totalInvoiceCommission;
	}

	public BigDecimal getTotalInvoiceTds() {
		if(totalInvoiceTds == null)
		{
			totalInvoiceTds = new BigDecimal(0);
		}
		return totalInvoiceTds;
	}
	
	public void setTotalInvoiceTds(BigDecimal totalInvoiceTds) {
		this.totalInvoiceTds = totalInvoiceTds;
	}
	
	
	//Rehan Changes Start
	
	public BigDecimal getKeralaFloodCess() {
		if(keralaFloodCess == null)
		{
			keralaFloodCess = new BigDecimal(0);
		}
		return keralaFloodCess;
	}

	public void setKeralaFloodCess(BigDecimal keralaFloodCess) {
		this.keralaFloodCess = keralaFloodCess;
	}
	
	//Rehan Changes End
	
	/**
	 * Gets the total invoice incentive.
	 *
	 * @return the total invoice incentive
	 */
	public BigDecimal getTotalInvoiceIncentive() {
		if(totalInvoiceIncentive == null)
		{
			totalInvoiceIncentive = new BigDecimal(0);
		}
		return totalInvoiceIncentive;
	}

	/**
	 * Sets the total invoice incentive.
	 *
	 * @param totalInvoiceIncentive the new total invoice incentive
	 */
	public void setTotalInvoiceIncentive(BigDecimal totalInvoiceIncentive) {
		this.totalInvoiceIncentive = totalInvoiceIncentive;
	}

	/**
	 * Gets the total invoice net amount before tax.
	 *
	 * @return the total invoice net amount before tax
	 */
	public BigDecimal getTotalInvoiceNetAmountBeforeTax() {
		if(totalInvoiceNetAmountBeforeTax == null)
		{
			totalInvoiceNetAmountBeforeTax = new BigDecimal(0);
		}
		return totalInvoiceNetAmountBeforeTax;
	}

	/**
	 * Sets the total invoice net amount before tax.
	 *
	 * @param totalInvoiceNetAmountBeforeTax the new total invoice net amount before tax
	 */
	public void setTotalInvoiceNetAmountBeforeTax(
			BigDecimal totalInvoiceNetAmountBeforeTax) {

		if (totalInvoiceNetAmountBeforeTax == null) {
			totalInvoiceNetAmountBeforeTax = new BigDecimal(0);
		}
		this.totalInvoiceNetAmountBeforeTax = totalInvoiceNetAmountBeforeTax;
	}

	/**
	 * Gets the total invoice tax.
	 *
	 * @return the total invoice tax
	 */
	public BigDecimal getTotalInvoiceTax() {

		if(totalInvoiceTax == null)
		{
			totalInvoiceTax = new BigDecimal(0);
		}
		return totalInvoiceTax;
	}

	/**
	 * Gets the total invoice weight.
	 *
	 * @return the total invoice weight
	 */
	public BigDecimal getTotalInvoiceWeight() {
		if(totalInvoiceWeight == null)
		{
			totalInvoiceWeight = new BigDecimal(0);
		}
		return totalInvoiceWeight;
	}

	/**
	 * Sets the total invoice weight.
	 *
	 * @param totalInvoiceWeight the new total invoice weight
	 */
	public void setTotalInvoiceWeight(BigDecimal totalInvoiceWeight) {
		this.totalInvoiceWeight = totalInvoiceWeight;
	}

	/**
	 * Sets the total invoice tax.
	 *
	 * @param totalInvoiceTax the new total invoice tax
	 */
	public void setTotalInvoiceTax(BigDecimal totalInvoiceTax) {
		this.totalInvoiceTax = totalInvoiceTax;
	}

	/**
	 * Gets the total invoice net amount payable.
	 *
	 * @return the total invoice net amount payable
	 */
	public BigDecimal getTotalInvoiceNetAmountPayable() {
		if(totalInvoiceNetAmountPayable == null)
		{
			totalInvoiceNetAmountPayable = new BigDecimal(0);
		}
		return totalInvoiceNetAmountPayable;
	}

	/**
	 * Sets the total invoice net amount payable.
	 *
	 * @param totalInvoiceNetAmountPayable the new total invoice net amount payable
	 */
	public void setTotalInvoiceNetAmountPayable(
			BigDecimal totalInvoiceNetAmountPayable) {
		this.totalInvoiceNetAmountPayable = totalInvoiceNetAmountPayable;
	}

	/**
	 * Gets the net total invoice due airline.
	 *
	 * @return the net total invoice due airline
	 */
	public BigDecimal getNetTotalInvoiceDueAirline() {
		if(netTotalInvoiceDueAirline == null)
		{
			netTotalInvoiceDueAirline = new BigDecimal(0);
		}
		return netTotalInvoiceDueAirline;
	}

	/**
	 * Sets the net total invoice due airline.
	 *
	 * @param netTotalInvoiceDueAirline the new net total invoice due airline
	 */
	public void setNetTotalInvoiceDueAirline(
			BigDecimal netTotalInvoiceDueAirline) {
		this.netTotalInvoiceDueAirline = netTotalInvoiceDueAirline;
	}

	

	/**
	 * Gets the c ass participant invoice cca dto.
	 *
	 * @return the c ass participant invoice cca dto
	 */
	public Set<CASSParticipantInvoiceCCADto> getcASSParticipantInvoiceCCADto() {
		return cASSParticipantInvoiceCCADto;
	}

	/**
	 * Sets the c ass participant invoice cca dto.
	 *
	 * @param cASSParticipantInvoiceCCADto the new c ass participant invoice cca dto
	 */
	public void setcASSParticipantInvoiceCCADto(
			Set<CASSParticipantInvoiceCCADto> cASSParticipantInvoiceCCADto) {
		this.cASSParticipantInvoiceCCADto = cASSParticipantInvoiceCCADto;
	}

	/**
	 * Gets the c ass participant invoice awb dto.
	 *
	 * @return the c ass participant invoice awb dto
	 */
	public Set<CASSParticipantInvoiceAWBDto> getcASSParticipantInvoiceAWBDto() {

		if (cASSParticipantInvoiceAWBDto == null) {
			cASSParticipantInvoiceAWBDto = new LinkedHashSet<CASSParticipantInvoiceAWBDto>();
		}
		return cASSParticipantInvoiceAWBDto;
	}

	/**
	 * Sets the c ass participant invoice awb dto.
	 *
	 * @param cASSParticipantInvoiceAWBDto the new c ass participant invoice awb dto
	 */
	public void setcASSParticipantInvoiceAWBDto(
			Set<CASSParticipantInvoiceAWBDto> cASSParticipantInvoiceAWBDto) {
		this.cASSParticipantInvoiceAWBDto = cASSParticipantInvoiceAWBDto;
	}

	public BigDecimal getTotalTaxDueAirline() {
		if(totalTaxDueAirline == null)
		{
			totalTaxDueAirline = new BigDecimal(0);
		}
		return totalTaxDueAirline;
	}

	public void setTotalTaxDueAirline(BigDecimal totalTaxDueAirline) {
		this.totalTaxDueAirline = totalTaxDueAirline;
	}

	//item 177

	public BigDecimal getTotalGovernmentTax() {

		if(totalGovernmentTax == null)
		{
			totalGovernmentTax= new BigDecimal(0);
		}
		return totalGovernmentTax;
	}
	public void setTotalGovernmentTax(BigDecimal totalGovernmentTax) {
		this.totalGovernmentTax = totalGovernmentTax;
	}



	public BigDecimal getTotalStateTax() {

		if(totalStateTax == null)
		{
			totalStateTax= new BigDecimal(0);
		}
		return totalStateTax;
	}
	public void setTotalStateTax(BigDecimal totalStateTax) {
		this.totalStateTax = totalStateTax;
	}

	//lavanya end 
	public BigDecimal getTotalTaxDueAgent() {
		if(totalTaxDueAgent == null)
		{
			totalTaxDueAgent = new BigDecimal(0);
		}
		return totalTaxDueAgent;
	}

	public void setTotalTaxDueAgent(BigDecimal totalTaxDueAgent) {
		
		this.totalTaxDueAgent = totalTaxDueAgent;
	}

	/**
	 * @return the totalValuationCharges
	 */
	public BigDecimal getTotalValuationCharges() {
		if(totalValuationCharges == null)
		{
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

	public BigDecimal getTotalOtherChargesDueAgent() {
		if(totalOtherChargesDueAgent == null)
		{
			totalOtherChargesDueAgent = new BigDecimal(0);
		}
		return totalOtherChargesDueAgent;
	}

	public void setTotalOtherChargesDueAgent(BigDecimal totalOtherChargesDueAgent) {
		this.totalOtherChargesDueAgent = totalOtherChargesDueAgent;
	}

	public BigDecimal getTotalWeightCharges() {
		if(totalWeightCharges == null)
		{
			totalWeightCharges=new BigDecimal(0);
		}
		return totalWeightCharges;
	}

	/**
	 * @return the cASSParticipantInvoiceDCMDto
	 */
	public Set<CASSParticipantInvoiceDCMDto> getcASSParticipantInvoiceDCMDto() {
		
			if(cASSParticipantInvoiceDCMDto==null)
			{
				cASSParticipantInvoiceDCMDto = new LinkedHashSet<CASSParticipantInvoiceDCMDto>();
			}
			return cASSParticipantInvoiceDCMDto;
		}

	

	/**
	 * @param cASSParticipantInvoiceDCMDto the cASSParticipantInvoiceDCMDto to set
	 */
	public void setcASSParticipantInvoiceDCMDto(
			Set<CASSParticipantInvoiceDCMDto> cASSParticipantInvoiceDCMDto) {
		this.cASSParticipantInvoiceDCMDto = cASSParticipantInvoiceDCMDto;
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

	public String getBillingCarrier() {
		return billingCarrier;
	}

	public void setBillingCarrier(String billingCarrier) {
		this.billingCarrier = billingCarrier;
	}

	public BigDecimal getGstAmount() {
		return gstAmount;
	}

	public void setGstAmount(BigDecimal gstAmount) {
		this.gstAmount = gstAmount;
	}


}