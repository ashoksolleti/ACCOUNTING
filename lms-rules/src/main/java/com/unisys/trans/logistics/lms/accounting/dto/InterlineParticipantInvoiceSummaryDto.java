/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
 
/** 
 *
 * @author KV5
 * 
 */
public class InterlineParticipantInvoiceSummaryDto extends
		ParticipantInvoiceSummaryDto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	private List clearancePeriodType;
	
	
	
	
	private List payCodeIndicator;
	
	private String billingCarrier;
	
	

private BigDecimal totalInvoicePrepaidCharges;
	
	private BigDecimal totalInvoiceCollectCharges;
	
	private BigDecimal totalInvoiceCommission;
	
	private BigDecimal totalInvoiceTds;

	private BigDecimal totalInvoiceIncentive;
	
	private BigDecimal totalInvoiceNetAmountBeforeTax;
	
	private BigDecimal totalInvoiceTax;
	
	private BigDecimal totalInvoiceNetAmountPayable;
	
	/** The tax due airline. */
	private BigDecimal totalTaxDueAirline;
	
	/** The tax due agent. */
	private BigDecimal totalTaxDueAgent;
	
	private BigDecimal totalOtherChargesDueAgent;
	
	private BigDecimal totalWeightCharges;
    
	private BigDecimal totalValuationCharges;
    
    private BigDecimal totalOtherChargesDueCarrier;

	
    private BigDecimal netTotalInvoiceDueAirline;
	
    /** The total invoice weight. */
	private BigDecimal totalInvoiceWeight;
	
	
	
	//item 177
	
	private BigDecimal totalGovernmentTax;

	private BigDecimal totalStateTax;
	
	/*private Set<ParticipantInvoiceCCADto> participantInvoiceCCADto;*/
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<InterlineParticipantInvoiceAWBDto> interlineParticipantInvoiceAWBDto;
	
	private Set<InterlineParticipantInvoiceDCMDto> interlineParticipantInvoiceDCMDto;
	
	private Set<AccountingInvoiceAWBDto> rejectionMemos;
	
	private Set<InterlineParticipantInvoiceAWBDto> rejectionMemo;
	
	public Set<InterlineParticipantInvoiceAWBDto> getRejectionMemo() {
		if(rejectionMemo==null)
		{
			rejectionMemo = new LinkedHashSet<InterlineParticipantInvoiceAWBDto>();
		}
		return rejectionMemo;
	}
	public void setRejectionMemo(Set<InterlineParticipantInvoiceAWBDto> rejectionMemo) {
		this.rejectionMemo = rejectionMemo;
	}

	private Set<InterlineParticipantInvoiceAWBDto> billingAndCreditMemo;
	
	public Set<InterlineParticipantInvoiceAWBDto> getBillingAndCreditMemo() {
		if(billingAndCreditMemo==null)
		{
			billingAndCreditMemo = new LinkedHashSet<InterlineParticipantInvoiceAWBDto>();
		}
		return billingAndCreditMemo;
	}
	public void setBillingAndCreditMemo(Set<InterlineParticipantInvoiceAWBDto> billingAndCreditMemo) {
		this.billingAndCreditMemo = billingAndCreditMemo;
	}

	private Set<AccountingInvoiceAWBDto> billingCreditMemo;

	public Set<AccountingInvoiceAWBDto> getBillingCreditMemo() {
		if(billingCreditMemo==null)
		{
			billingCreditMemo = new LinkedHashSet<AccountingInvoiceAWBDto>();
		}
		return billingCreditMemo;
	}
	public void setbillingCreditMemo(Set<AccountingInvoiceAWBDto> billingCreditMemo) {
		this.billingCreditMemo = billingCreditMemo;
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	/*private Set<ParticipantInvoiceDCMDto> participantInvoiceDCMDto;
	*//** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 *//*
	private Set<ParticipantInvoiceRejectionMemoDto> participantInvoiceRejectionMemoDto;
	*//** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 *//*
	private Set<ParticipantInvoiceRejectionMemoDto> participantInvoiceRejectionMemoDto;*/
	
	
	
	
	public List getClearancePeriodType() {
		return clearancePeriodType;
	}
	public BigDecimal getTotalValuationCharges() {
		if(totalValuationCharges == null)
		{
			totalValuationCharges= new BigDecimal(0);
		}
		return totalValuationCharges;
	}
	public void setTotalValuationCharges(BigDecimal totalValuationCharges) {
		
		this.totalValuationCharges = totalValuationCharges;
	}
	public BigDecimal getTotalInvoiceWeight() {
		if(totalInvoiceWeight == null)
		{
			totalInvoiceWeight= new BigDecimal(0);
		}
		return totalInvoiceWeight;
	}
	public void setTotalInvoiceWeight(BigDecimal totalInvoiceWeight) {
		
		this.totalInvoiceWeight = totalInvoiceWeight;
	}
	public BigDecimal getNetTotalInvoiceDueAirline() {
		if(netTotalInvoiceDueAirline == null)
			netTotalInvoiceDueAirline = new BigDecimal(0);
		return netTotalInvoiceDueAirline;
	}
	public void setNetTotalInvoiceDueAirline(BigDecimal netTotalInvoiceDueAirline) {
		if(netTotalInvoiceDueAirline==null)
		{
			netTotalInvoiceDueAirline= new BigDecimal(0);
		}
		this.netTotalInvoiceDueAirline = netTotalInvoiceDueAirline;
	}
	public BigDecimal getTotalInvoicePrepaidCharges() {
		if(totalInvoicePrepaidCharges == null)
			totalInvoicePrepaidCharges = new BigDecimal(0);
		return totalInvoicePrepaidCharges;
	}
	public void setTotalInvoicePrepaidCharges(BigDecimal totalInvoicePrepaidCharges) {
		if(totalInvoicePrepaidCharges==null)
		{
			totalInvoicePrepaidCharges= new BigDecimal(0);
		}
		this.totalInvoicePrepaidCharges = totalInvoicePrepaidCharges;
	}
	public BigDecimal getTotalInvoiceCollectCharges() {
		if(totalInvoiceCollectCharges == null)
			totalInvoiceCollectCharges = new BigDecimal(0);
		return totalInvoiceCollectCharges;
	}
	public void setTotalInvoiceCollectCharges(BigDecimal totalInvoiceCollectCharges) {
		if(totalInvoiceCollectCharges==null)
		{
			totalInvoiceCollectCharges= new BigDecimal(0);
		}
		this.totalInvoiceCollectCharges = totalInvoiceCollectCharges;
	}
	public BigDecimal getTotalInvoiceCommission() {
		if(totalInvoiceCommission == null)
			totalInvoiceCommission = new BigDecimal(0);
		return totalInvoiceCommission;
	}
	public void setTotalInvoiceCommission(BigDecimal totalInvoiceCommission) {
		if(totalInvoiceCommission==null)
		{
			totalInvoiceCommission= new BigDecimal(0);
		}
		this.totalInvoiceCommission = totalInvoiceCommission;
	}
	
	public BigDecimal getTotalInvoiceTds() {
		if(totalInvoiceTds == null)
			totalInvoiceTds = new BigDecimal(0);
		return totalInvoiceTds;
	}
	public void setTotalInvoiceTds(BigDecimal totalInvoiceTds) {
		if(totalInvoiceTds == null) {
			totalInvoiceTds = new BigDecimal(0);
		}
		this.totalInvoiceTds = totalInvoiceTds;
	}
	public BigDecimal getTotalInvoiceIncentive() {
		if(totalInvoiceIncentive == null)
			totalInvoiceIncentive = new BigDecimal(0);
		return totalInvoiceIncentive;
	}
	public void setTotalInvoiceIncentive(BigDecimal totalInvoiceIncentive) {
		
		this.totalInvoiceIncentive = totalInvoiceIncentive;
	}
	public BigDecimal getTotalInvoiceNetAmountBeforeTax() {
		if(totalInvoiceNetAmountBeforeTax == null)
		{
			totalInvoiceNetAmountBeforeTax= new BigDecimal(0);
		}
		return totalInvoiceNetAmountBeforeTax;
	}
	public void setTotalInvoiceNetAmountBeforeTax(
			BigDecimal totalInvoiceNetAmountBeforeTax) {
		this.totalInvoiceNetAmountBeforeTax = totalInvoiceNetAmountBeforeTax;
	}
	public BigDecimal getTotalInvoiceTax() {
		if(totalInvoiceTax == null)
		{
			totalInvoiceTax= new BigDecimal(0);
		}
		return totalInvoiceTax;
	}
	public void setTotalInvoiceTax(BigDecimal totalInvoiceTax) {
		this.totalInvoiceTax = totalInvoiceTax;
	}
	public BigDecimal getTotalInvoiceNetAmountPayable() {
		if(totalInvoiceNetAmountPayable == null)
		{
			totalInvoiceNetAmountPayable= new BigDecimal(0);
		}
		return totalInvoiceNetAmountPayable;
	}
	public void setTotalInvoiceNetAmountPayable(
			BigDecimal totalInvoiceNetAmountPayable) {
		this.totalInvoiceNetAmountPayable = totalInvoiceNetAmountPayable;
	}
	public BigDecimal getTotalTaxDueAirline() {
		if(totalTaxDueAirline == null)
		{
			totalTaxDueAirline= new BigDecimal(0);
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
			totalTaxDueAgent= new BigDecimal(0);
		}
		return totalTaxDueAgent;
	}
	public void setTotalTaxDueAgent(BigDecimal totalTaxDueAgent) {
		this.totalTaxDueAgent = totalTaxDueAgent;
	}
	public BigDecimal getTotalOtherChargesDueAgent() {
		if(totalOtherChargesDueAgent == null)
		{
			totalOtherChargesDueAgent= new BigDecimal(0);
		}
		return totalOtherChargesDueAgent;
	}
	public void setTotalOtherChargesDueAgent(BigDecimal totalOtherChargesDueAgent) {
		this.totalOtherChargesDueAgent = totalOtherChargesDueAgent;
	}
	public BigDecimal getTotalWeightCharges() {
		if(totalWeightCharges == null)
		{
			totalWeightCharges= new BigDecimal(0);
		}
		return totalWeightCharges;
	}
	public void setTotalWeightCharges(BigDecimal totalWeightCharges) {
		this.totalWeightCharges = totalWeightCharges;
	}
	/**
	 * @return the rejectionMemos
	 */
	public Set<AccountingInvoiceAWBDto> getRejectionMemos() {
		if(rejectionMemos==null)
		{
			rejectionMemos = new LinkedHashSet<AccountingInvoiceAWBDto>();
		}
		return rejectionMemos;
	}
	/**
	 * @param rejectionMemos the rejectionMemos to set
	 */
	public void setRejectionMemos(Set<AccountingInvoiceAWBDto> rejectionMemos) {
		this.rejectionMemos = rejectionMemos;
	}
	public BigDecimal getTotalOtherChargesDueCarrier() {
		if(totalOtherChargesDueCarrier==null)
		{
			totalOtherChargesDueCarrier= new BigDecimal(0);
		}
		return totalOtherChargesDueCarrier;
	}
	public void setTotalOtherChargesDueCarrier(
			BigDecimal totalOtherChargesDueCarrier) {
		this.totalOtherChargesDueCarrier = totalOtherChargesDueCarrier;
	}
	public void setClearancePeriodType(List clearancePeriodType) {
		this.clearancePeriodType = clearancePeriodType;
	}
	
	
	public List getPayCodeIndicator() {
		return payCodeIndicator;
	}
	public void setPayCodeIndicator(List payCodeIndicator) {
		this.payCodeIndicator = payCodeIndicator;
	}
	public Set<InterlineParticipantInvoiceAWBDto> getInterlineParticipantInvoiceAWBDto() {
		if (interlineParticipantInvoiceAWBDto == null) {
			interlineParticipantInvoiceAWBDto = new LinkedHashSet<InterlineParticipantInvoiceAWBDto>();
		}
		return interlineParticipantInvoiceAWBDto;
	}
	public void setInterlineParticipantInvoiceAWBDto(
			Set<InterlineParticipantInvoiceAWBDto> interlineParticipantInvoiceAWBDto) {
		this.interlineParticipantInvoiceAWBDto = interlineParticipantInvoiceAWBDto;
	}
	
	/**
	 * @return the billingCarrier
	 */
	public String getBillingCarrier() {
		return billingCarrier;
	}
	/**
	 * @param billingCarrier the billingCarrier to set
	 */
	public void setBillingCarrier(String billingCarrier) {
		this.billingCarrier = billingCarrier;
	}
	/**
	 * @return the interlineParticipantInvoiceDCMDto
	 */
	public Set<InterlineParticipantInvoiceDCMDto> getInterlineParticipantInvoiceDCMDto() {
		
		if(interlineParticipantInvoiceDCMDto==null)
		{
			interlineParticipantInvoiceDCMDto = new LinkedHashSet<InterlineParticipantInvoiceDCMDto>();
		}
		return interlineParticipantInvoiceDCMDto;
	}
	/**
	 * @param interlineParticipantInvoiceDCMDto the interlineParticipantInvoiceDCMDto to set
	 */
	public void setInterlineParticipantInvoiceDCMDto(
			Set<InterlineParticipantInvoiceDCMDto> interlineParticipantInvoiceDCMDto) {
		this.interlineParticipantInvoiceDCMDto = interlineParticipantInvoiceDCMDto;
	}
	


	
	
}