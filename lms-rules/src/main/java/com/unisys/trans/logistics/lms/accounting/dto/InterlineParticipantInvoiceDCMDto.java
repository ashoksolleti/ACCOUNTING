/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.RevenueIndicatorType;

/** 
 * 
 * @author SeramRaK
 * 
 */
public class InterlineParticipantInvoiceDCMDto extends ParticipantInvoiceDetailDto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static final long serialVersionUID = -8226753759417569170L;

	/**
	 * 
	 */


	private String vatIndicatorString;
	
	private Date dcmGenerationDate;
	
	private String originStation;
	
	private String destinationStation;
	
	
	private BigDecimal valuationCharge;
	
	
	private BigDecimal otherChargesDueCarrier;
	
	private BigDecimal otherChargesDueAgent;
	
	private BigDecimal commissionPercentage;
	
	private BigDecimal commissionAmount;
	
	private BigDecimal tdsPercentage;
	
	private BigDecimal tdsAmount;
	
	private BigDecimal netTdsAmount;
	
	private Character commissionIndicator;
	
	private BigDecimal discountAmount;
	
	private BigDecimal taxDueAirline;
	
	private BigDecimal taxDueAgent;
	
	private Character taxDueAirlineIndicator;
	
	private Character discountIndicator;
	
	private String debitNoteNumber;
	
	private String dcmNumber;
	
	private Float debitAmount;
	
	private String debitCurrency;
	
	private Date debitDate;
	
	private String creditNoteNumber;
	
	private Float creditAmount;
	
	private String creditCurrency;
	
	private Date creditDate;
	
	private RevenueIndicatorType revenueIndicatorType;
	
	private BigDecimal  netAmountBeforeTax;
	private BigDecimal  netAmountPayable;
	
	
	private BigDecimal netCommissionAmount;

	private BigDecimal netDiscountAmount;

	private BigDecimal netWeightCharge;

	private BigDecimal netValuationCharge;

	private BigDecimal netOtherChargeDueCarrier;

	private BigDecimal netOtherChargeDueAgent;
	
	 private BigDecimal netVatAmountBilled;
	    
	    
     private BigDecimal netTaxDueAgent;
	    
	   
     private BigDecimal netTaxDueAirline;

   //item 177
 	
 	private BigDecimal governmentTax;

 	private BigDecimal stateTax;
     
	
	private Set<AccountingInvoiceDCMOtherChargesSplitDto> accountingInvoiceDCMOtherChargesSplit;
	private String noteType;
	
	private String debitCreditNote;

	public String getDebitCreditNote() {
		if(debitNoteNumber!=null)
			debitCreditNote = debitNoteNumber;
		else
			debitCreditNote = creditNoteNumber;
		return debitCreditNote;
	}

	public void setDebitCreditNote(String debitCreditNote) {
		this.debitCreditNote = debitCreditNote;
	}

	/**
	 * @return the noteType
	 */
	public String getNoteType() {
		if(this.revenueIndicatorType!=null)
		{
		return this.revenueIndicatorType.name();
		}
		else
		{
			return "";
		}
	}
	/**
	 * @param noteType the noteType to set
	 */
	public void setNoteType(String noteType) {
		this.noteType = noteType;
	}
	private List<ReceivableSplitDto> otherchargesBreakDown;
	/**
	 * @return the otherchargesBreakDown
	 */
	public List<ReceivableSplitDto> getOtherchargesBreakDown() {
		return otherchargesBreakDown;
	}
	/**
	 * @param otherchargesBreakDown the otherchargesBreakDown to set
	 */
	public void setOtherchargesBreakDown(
			List<ReceivableSplitDto> otherchargesBreakDown) {
		this.otherchargesBreakDown = otherchargesBreakDown;
	}
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private InterlineParticipantInvoiceSummaryDto interlineParticipantInvoiceSummaryDto;
	
	
	public RevenueIndicatorType getRevenueIndicatorType() {
		return revenueIndicatorType;
	}
	public void setRevenueIndicatorType(RevenueIndicatorType revenueIndicatorType) {
		this.revenueIndicatorType = revenueIndicatorType;
	}
	public BigDecimal getCommissionPercentage() {
		if(commissionPercentage==null)
		{
			commissionPercentage=new BigDecimal(0);
		}
		return commissionPercentage;
	}
	public void setCommissionPercentage(BigDecimal commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}
	public BigDecimal getCommissionAmount() {
		if(commissionAmount==null)
		{
			commissionAmount=new BigDecimal(0);
		}
		return commissionAmount;
	}
	public void setCommissionAmount(BigDecimal commissionAmount) {
		
		this.commissionAmount = commissionAmount;
	}
	public BigDecimal getTdsPercentage() {
		if(tdsPercentage==null) {
			tdsPercentage= new BigDecimal(0);
		}
		return tdsPercentage;
	}

	public void setTdsPercentage(BigDecimal tdsPercentage) {
		this.tdsPercentage = tdsPercentage;
	}

	public BigDecimal getTdsAmount() {
		if(tdsAmount==null) {
			tdsAmount= new BigDecimal(0);
		}
		return tdsAmount;
	}

	public void setTdsAmount(BigDecimal tdsAmount) {
		this.tdsAmount = tdsAmount;
	}

	public BigDecimal getNetTdsAmount() {
		if(netTdsAmount==null) {
			netTdsAmount= new BigDecimal(0);
		}
		return netTdsAmount;
	}

	public void setNetTdsAmount(BigDecimal netTdsAmount) {
		this.netTdsAmount = netTdsAmount;
	}
	public String getVatIndicatorString() {
		return vatIndicatorString;
	}
	public void setVatIndicatorString(String vatIndicatorString) {
		this.vatIndicatorString = vatIndicatorString;
	}
	public Date getDcmGenerationDate() {
		return dcmGenerationDate;
	}
	public void setDcmGenerationDate(Date dcmGenerationDate) {
		this.dcmGenerationDate = dcmGenerationDate;
	}
	public String getOriginStation() {
		return originStation;
	}
	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}
	public String getDestinationStation() {
		return destinationStation;
	}
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	public BigDecimal getValuationCharge() {
		if(valuationCharge == null)
		{
			valuationCharge= new BigDecimal(0);
		}
		return valuationCharge;
	}
	public void setValuationCharge(BigDecimal valuationCharge) {
		this.valuationCharge = valuationCharge;
	}
	public BigDecimal getOtherChargesDueCarrier() {
		if(otherChargesDueCarrier==null)
		{
			otherChargesDueCarrier= new BigDecimal(0);
		}

		return otherChargesDueCarrier;
	}
	public void setOtherChargesDueCarrier(BigDecimal otherChargesDueCarrier) {
		this.otherChargesDueCarrier = otherChargesDueCarrier;
	}
	
	public BigDecimal getOtherChargesDueAgent() {
		if(otherChargesDueAgent==null)
		{
			otherChargesDueAgent=new BigDecimal(0);
		}
		return otherChargesDueAgent;
	}
	public void setOtherChargesDueAgent(BigDecimal otherChargesDueAgent) {
		this.otherChargesDueAgent = otherChargesDueAgent;
	}
	public Character getCommissionIndicator() {
		return commissionIndicator;
	}
	public void setCommissionIndicator(Character commissionIndicator) {
		this.commissionIndicator = commissionIndicator;
	}
	
	public BigDecimal getDiscountAmount() {
		if(discountAmount==null)
		{
			discountAmount=new BigDecimal(0);
		}
		return discountAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}
	public BigDecimal getTaxDueAirline() {
		if(taxDueAirline == null)
		{     
			taxDueAirline= new BigDecimal(0);
		}
		return taxDueAirline;
	}
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

	public BigDecimal getTaxDueAgent() {
		if(taxDueAgent == null)
		{   
			taxDueAgent= new BigDecimal(0);
		}
		return taxDueAgent;
	}
	public void setTaxDueAgent(BigDecimal taxDueAgent) {
		this.taxDueAgent = taxDueAgent;
	}
	/**
	 * @return the accountingInvoiceDCMOtherChargesSplit
	 */
	public Set<AccountingInvoiceDCMOtherChargesSplitDto> getAccountingInvoiceDCMOtherChargesSplit() {
		if(accountingInvoiceDCMOtherChargesSplit ==null)
		{
			accountingInvoiceDCMOtherChargesSplit= new LinkedHashSet<AccountingInvoiceDCMOtherChargesSplitDto>();
		}
		return accountingInvoiceDCMOtherChargesSplit;
	}
	/**
	 * @param accountingInvoiceDCMOtherChargesSplit the accountingInvoiceDCMOtherChargesSplit to set
	 */
	public void setAccountingInvoiceDCMOtherChargesSplit(
			Set<AccountingInvoiceDCMOtherChargesSplitDto> accountingInvoiceDCMOtherChargesSplit) {
		this.accountingInvoiceDCMOtherChargesSplit = accountingInvoiceDCMOtherChargesSplit;
	}
	public Character getTaxDueAirlineIndicator() {
		return taxDueAirlineIndicator;
	}
	public void setTaxDueAirlineIndicator(Character taxDueAirlineIndicator) {
		this.taxDueAirlineIndicator = taxDueAirlineIndicator;
	}
	public Character getDiscountIndicator() {
		return discountIndicator;
	}
	public void setDiscountIndicator(Character discountIndicator) {
		this.discountIndicator = discountIndicator;
	}
	
	public String getDcmNumber() {
		return dcmNumber;
	}
	public void setDcmNumber(String dcmNumber) {
		this.dcmNumber = dcmNumber;
	}
	/**
	 * @return the netCommissionAmount
	 */
	public BigDecimal getNetCommissionAmount() {
		if(netCommissionAmount == null){
			netCommissionAmount = new BigDecimal(0);
		}
		return netCommissionAmount;
	}
	/**
	 * @param netCommissionAmount the netCommissionAmount to set
	 */
	public void setNetCommissionAmount(BigDecimal netCommissionAmount) {
		this.netCommissionAmount = netCommissionAmount;
	}
	/**
	 * @return the netDiscountAmount
	 */
	public BigDecimal getNetDiscountAmount() {
		if(netDiscountAmount == null){
			netDiscountAmount=new BigDecimal(0);
		}
		return netDiscountAmount;
	}
	/**
	 * @param netDiscountAmount the netDiscountAmount to set
	 */
	public void setNetDiscountAmount(BigDecimal netDiscountAmount) {
		this.netDiscountAmount = netDiscountAmount;
	}
	/**
	 * @return the netWeightCharge
	 */
	public BigDecimal getNetWeightCharge() {
		if(netWeightCharge == null){
			netWeightCharge=new BigDecimal(0);
		}
		return netWeightCharge;
	}
	/**
	 * @param netWeightCharge the netWeightCharge to set
	 */
	public void setNetWeightCharge(BigDecimal netWeightCharge) {
		this.netWeightCharge = netWeightCharge;
	}
	/**
	 * @return the netValuationCharge
	 */
	public BigDecimal getNetValuationCharge() {
		if(netValuationCharge == null){
			netValuationCharge=new BigDecimal(0);
		}
		return netValuationCharge;
	}
	/**
	 * @param netValuationCharge the netValuationCharge to set
	 */
	public void setNetValuationCharge(BigDecimal netValuationCharge) {
		this.netValuationCharge = netValuationCharge;
	}
	/**
	 * @return the netOtherChargeDueCarrier
	 */
	public BigDecimal getNetOtherChargeDueCarrier() {
		if(netOtherChargeDueCarrier == null){
			netOtherChargeDueCarrier=new BigDecimal(0);
		}
		return netOtherChargeDueCarrier;
	}
	/**
	 * @param netOtherChargeDueCarrier the netOtherChargeDueCarrier to set
	 */
	public void setNetOtherChargeDueCarrier(BigDecimal netOtherChargeDueCarrier) {
		this.netOtherChargeDueCarrier = netOtherChargeDueCarrier;
	}
	/**
	 * @return the netOtherChargeDueAgent
	 */
	public BigDecimal getNetOtherChargeDueAgent() {
		if(netOtherChargeDueAgent == null){
			netOtherChargeDueAgent = new BigDecimal(0);
		}
		return netOtherChargeDueAgent;
	}
	/**
	 * @param netOtherChargeDueAgent the netOtherChargeDueAgent to set
	 */
	public void setNetOtherChargeDueAgent(BigDecimal netOtherChargeDueAgent) {
		this.netOtherChargeDueAgent = netOtherChargeDueAgent;
	}
	public Float getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(Float debitAmount) {
		this.debitAmount = debitAmount;
	}
	public String getDebitCurrency() {
		return debitCurrency;
	}
	public void setDebitCurrency(String debitCurrency) {
		this.debitCurrency = debitCurrency;
	}
	public Date getDebitDate() {
		return debitDate;
	}
	public void setDebitDate(Date debitDate) {
		this.debitDate = debitDate;
	}
	
	public String getDebitNoteNumber() {
		return debitNoteNumber;
	}
	public void setDebitNoteNumber(String debitNoteNumber) {
		this.debitNoteNumber = debitNoteNumber;
	}
	public String getCreditNoteNumber() {
		return creditNoteNumber;
	}
	public void setCreditNoteNumber(String creditNoteNumber) {
		this.creditNoteNumber = creditNoteNumber;
	}
	public Float getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(Float creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getCreditCurrency() {
		return creditCurrency;
	}
	public void setCreditCurrency(String creditCurrency) {
		this.creditCurrency = creditCurrency;
	}
	public Date getCreditDate() {
		return creditDate;
	}
	public void setCreditDate(Date creditDate) {
		this.creditDate = creditDate;
	}
	
	
	
	/**
	 * @return the interlineParticipantInvoiceSummaryDto
	 */
	public InterlineParticipantInvoiceSummaryDto getInterlineParticipantInvoiceSummaryDto() {
		return interlineParticipantInvoiceSummaryDto;
	}

	/**
	 * @param interlineParticipantInvoiceSummaryDto the interlineParticipantInvoiceSummaryDto to set
	 */
	public void setInterlineParticipantInvoiceSummaryDto(
			InterlineParticipantInvoiceSummaryDto interlineParticipantInvoiceSummaryDto) {
		this.interlineParticipantInvoiceSummaryDto = interlineParticipantInvoiceSummaryDto;
	}

	/**
	 * @return the netAmountBeforeTax
	 */
	public BigDecimal getNetAmountBeforeTax() {
		netAmountBeforeTax=new BigDecimal(0); 
		netAmountBeforeTax=netAmountBeforeTax.add(getWeightCharge());
		netAmountBeforeTax=netAmountBeforeTax.add(getValuationCharge());
		netAmountBeforeTax=netAmountBeforeTax.add(getOtherChargesDueCarrier());
	   
	   netAmountBeforeTax=netAmountBeforeTax.subtract(getCommissionAmount());
	   netAmountBeforeTax=netAmountBeforeTax.add(getTdsAmount());
	   netAmountBeforeTax=netAmountBeforeTax.subtract(getOtherChargesDueAgent());
		return netAmountBeforeTax;
	}
	/**
	 * @param netAmountBeforeTax the netAmountBeforeTax to set
	 */
	public void setNetAmountBeforeTax(BigDecimal netAmountBeforeTax) {
		this.netAmountBeforeTax = netAmountBeforeTax;
	}
	/**
	 * @return the netAmountPayable
	 */
	public BigDecimal getNetAmountPayable() {
		netAmountPayable=new BigDecimal(0);
		netAmountPayable=netAmountPayable.add(getNetAmountBeforeTax());
		netAmountPayable=netAmountPayable.add(getTaxDueAirline());
		netAmountPayable=netAmountPayable.subtract(getTaxDueAgent());
		return netAmountPayable;
	}
	/**
	 * @param netAmountPayable the netAmountPayable to set
	 */
	public void setNetAmountPayable(BigDecimal netAmountPayable) {
		this.netAmountPayable = netAmountPayable;
	}
	/**
	 * @return the netVatAmountBilled
	 */
	public BigDecimal getNetVatAmountBilled() {
		if(netVatAmountBilled == null){
			netVatAmountBilled = new BigDecimal(0);
		}
		return netVatAmountBilled;
	}
	/**
	 * @param netVatAmountBilled the netVatAmountBilled to set
	 */
	public void setNetVatAmountBilled(BigDecimal netVatAmountBilled) {
		this.netVatAmountBilled = netVatAmountBilled;
	}
	/**
	 * @return the netTaxDueAgent
	 */
	public BigDecimal getNetTaxDueAgent() {
		if(netTaxDueAgent == null){
			netTaxDueAgent = new BigDecimal(0);
		}
		return netTaxDueAgent;
	}
	/**
	 * @param netTaxDueAgent the netTaxDueAgent to set
	 */
	public void setNetTaxDueAgent(BigDecimal netTaxDueAgent) {
		this.netTaxDueAgent = netTaxDueAgent;
	}
	/**
	 * @return the netTaxDueAirline
	 */
	public BigDecimal getNetTaxDueAirline() {
		if(netTaxDueAirline == null){
			netTaxDueAirline = new BigDecimal(0);
		}
		return netTaxDueAirline;
	}
	/**
	 * @param netTaxDueAirline the netTaxDueAirline to set
	 */
	public void setNetTaxDueAirline(BigDecimal netTaxDueAirline) {
		this.netTaxDueAirline = netTaxDueAirline;
	}
}