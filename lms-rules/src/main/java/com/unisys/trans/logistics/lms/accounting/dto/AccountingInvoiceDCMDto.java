package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AWBPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InternationalAWBType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RevenueIndicatorType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * The persistent class for the ACC_INVOICE_DCM database table.
 * 
 */

public class AccountingInvoiceDCMDto extends PersistenceObjectDto {
	private static final long serialVersionUID = 1L;

	private long oid;

	private BigDecimal agentCode;

	private String agentsReferenceData;

	private String awbModularNumberCheck;

	private AirWaybillNumberDto awbNumber;

	private boolean branchOfficeIndicator;

	private BigDecimal commissionAmount;

	private Character commissionIndicator;

	private BigDecimal commissionpercentage;

	private double creditAmount;

	private String creditCurrency;

	private Date creditDate;

	private String creditNoteNumber;

	private String currencyCode;

	private Date dateOfAcceptance;

	private Date dcmGenerationDate;

	private String dcmNumber;

	private double debitAmount;

	private String debitCurrency;

	private Date debitDate;

	private String debitNoteNumber;

	private String destinationStation;

	private BigDecimal discountAmount;

	private Character discountIndicator;

	private BigDecimal grossWeight;

	private String originStation;

	private BigDecimal otherChargesDueAgent;

	/**
	 * @param branchOfficeIndicator
	 *            the branchOfficeIndicator to set
	 */
	public void setBranchOfficeIndicator(boolean branchOfficeIndicator) {
		this.branchOfficeIndicator = branchOfficeIndicator;
	}

	private BigDecimal otherChargesDueCarrier;

	private BigDecimal rateOfExchange;

	private BigDecimal taxDueAgent;

	private BigDecimal taxDueAirline;

	private Character taxDueAirlineIndicator;

	private BigDecimal valuationCharge;

	private boolean vatIndicator;

	private BigDecimal weightCharge;

	private BigDecimal netAmountPayable;

	private BigDecimal netAmountBeforeTax;

	private Boolean weightIndicator;

	private RevenueIndicatorType revenueIndicatorType;

	private AWBPaymentType paymentType;

	private InternationalAWBType internationalAWBType;

	private Date flightDate;

	/**
	 * Attribute to holds <code>flightNumber</code> property.
	 */
	private String flightNumber;

	private BigDecimal netCommissionAmount;

	private BigDecimal netDiscountAmount;

	private BigDecimal netWeightCharge;

	private BigDecimal netValuationCharge;

	private BigDecimal netOtherChargeDueCarrier;

	private BigDecimal netOtherChargeDueAgent;

	private BigDecimal vatAmountBilled;

	private BigDecimal netVatAmountBilled;

	private BigDecimal netTaxDueAgent;

	private BigDecimal netTaxDueAirline;
	
	private BigDecimal dcmPaidAmount;
    
    private PaymentStatusType dcmPaymentStatus;

	private Set<AccountingInvoiceDCMOtherChargesSplitDto> accountingInvoiceDCMOtherChargesSplits;
	
	private AccountingAirWaybillDto accAirWayBillDto;
	
	private String documentNumber;
	
	private Long gstr1ReturnOid;

	/**
	 * Attribute to hold <code>TDS</code> property.
	 */
	private BigDecimal tdsAmount;

	public BigDecimal getTdsAmount() {
		return tdsAmount;
	}

	public void setTdsAmount(BigDecimal tdsAmount) {
		this.tdsAmount = tdsAmount;
	}

	public BigDecimal getDcmPaidAmount() {
		return dcmPaidAmount;
	}

	public void setDcmPaidAmount(BigDecimal dcmPaidAmount) {
		this.dcmPaidAmount = dcmPaidAmount;
	}

	public PaymentStatusType getDcmPaymentStatus() {
		return dcmPaymentStatus;
	}

	public void setDcmPaymentStatus(PaymentStatusType dcmPaymentStatus) {
		this.dcmPaymentStatus = dcmPaymentStatus;
	}

	/**
	 * @return the flightDate
	 */
	public Date getFlightDate() {
		return flightDate;
	}

	/**
	 * @param flightDate
	 *            the flightDate to set
	 */
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber
	 *            the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	private AccountingInvoiceDetailDto accountingInvoiceDetail;

	private BigDecimal igst;

	private BigDecimal sgst;

	private BigDecimal cgst;

	public AccountingInvoiceDCMDto() {
	}

	@Override
	public Long getOId() {

		return this.oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public BigDecimal getAgentCode() {
		return this.agentCode;
	}

	public void setAgentCode(BigDecimal agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgentsReferenceData() {
		return this.agentsReferenceData;
	}

	public void setAgentsReferenceData(String agentsReferenceData) {
		this.agentsReferenceData = agentsReferenceData;
	}

	public String getAwbModularNumberCheck() {
		return this.awbModularNumberCheck;
	}

	public void setAwbModularNumberCheck(String awbModularNumberCheck) {
		this.awbModularNumberCheck = awbModularNumberCheck;
	}

	public Boolean getBranchOfficeIndicator() {
		return this.branchOfficeIndicator;
	}

	public void setBranchOfficeIndicator(Boolean boolean1) {
		this.branchOfficeIndicator = boolean1;
	}

	public BigDecimal getCommissionAmount() {
		return this.commissionAmount;
	}

	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public Character getCommissionIndicator() {
		return this.commissionIndicator;
	}

	public void setCommissionIndicator(Character character) {
		this.commissionIndicator = character;
	}

	public BigDecimal getCommissionpercentage() {
		return this.commissionpercentage;
	}

	public void setCommissionpercentage(BigDecimal commissionpercentage) {
		this.commissionpercentage = commissionpercentage;
	}

	public double getCreditAmount() {
		return this.creditAmount;
	}

	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}

	/**
	 * @return the netAmountPayable
	 */
	public BigDecimal getNetAmountPayable() {
		return netAmountPayable;
	}

	/**
	 * @param netAmountPayable
	 *            the netAmountPayable to set
	 */
	public void setNetAmountPayable(BigDecimal netAmountPayable) {
		this.netAmountPayable = netAmountPayable;
	}

	/**
	 * @return the paymentType
	 */
	public AWBPaymentType getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType
	 *            the paymentType to set
	 */
	public void setPaymentType(AWBPaymentType paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * @return the netCommissionAmount
	 */
	public BigDecimal getNetCommissionAmount() {
		return netCommissionAmount;
	}

	/**
	 * @param netCommissionAmount
	 *            the netCommissionAmount to set
	 */
	public void setNetCommissionAmount(BigDecimal netCommissionAmount) {
		this.netCommissionAmount = netCommissionAmount;
	}

	/**
	 * @return the netDiscountAmount
	 */
	public BigDecimal getNetDiscountAmount() {
		return netDiscountAmount;
	}

	/**
	 * @param netDiscountAmount
	 *            the netDiscountAmount to set
	 */
	public void setNetDiscountAmount(BigDecimal netDiscountAmount) {
		this.netDiscountAmount = netDiscountAmount;
	}

	/**
	 * @return the netWeightCharge
	 */
	public BigDecimal getNetWeightCharge() {
		return netWeightCharge;
	}

	/**
	 * @param netWeightCharge
	 *            the netWeightCharge to set
	 */
	public void setNetWeightCharge(BigDecimal netWeightCharge) {
		this.netWeightCharge = netWeightCharge;
	}

	/**
	 * @return the netValuationCharge
	 */
	public BigDecimal getNetValuationCharge() {
		return netValuationCharge;
	}

	/**
	 * @param netValuationCharge
	 *            the netValuationCharge to set
	 */
	public void setNetValuationCharge(BigDecimal netValuationCharge) {
		this.netValuationCharge = netValuationCharge;
	}

	/**
	 * @return the vatAmountBilled
	 */
	public BigDecimal getVatAmountBilled() {
		return vatAmountBilled;
	}

	/**
	 * @param vatAmountBilled
	 *            the vatAmountBilled to set
	 */
	public void setVatAmountBilled(BigDecimal vatAmountBilled) {
		this.vatAmountBilled = vatAmountBilled;
	}

	/**
	 * @return the netOtherChargeDueCarrier
	 */
	public BigDecimal getNetOtherChargeDueCarrier() {
		return netOtherChargeDueCarrier;
	}

	/**
	 * @param netOtherChargeDueCarrier
	 *            the netOtherChargeDueCarrier to set
	 */
	public void setNetOtherChargeDueCarrier(BigDecimal netOtherChargeDueCarrier) {
		this.netOtherChargeDueCarrier = netOtherChargeDueCarrier;
	}

	/**
	 * @return the netOtherChargeDueAgent
	 */
	public BigDecimal getNetOtherChargeDueAgent() {
		return netOtherChargeDueAgent;
	}

	/**
	 * @param netOtherChargeDueAgent
	 *            the netOtherChargeDueAgent to set
	 */
	public void setNetOtherChargeDueAgent(BigDecimal netOtherChargeDueAgent) {
		this.netOtherChargeDueAgent = netOtherChargeDueAgent;
	}

	/**
	 * @return the accountingInvoiceDCMOtherChargesSplits
	 */
	public Set<AccountingInvoiceDCMOtherChargesSplitDto> getAccountingInvoiceDCMOtherChargesSplits() {
		return accountingInvoiceDCMOtherChargesSplits;
	}

	/**
	 * @param accountingInvoiceDCMOtherChargesSplits
	 *            the accountingInvoiceDCMOtherChargesSplits to set
	 */
	public void setAccountingInvoiceDCMOtherChargesSplits(
			Set<AccountingInvoiceDCMOtherChargesSplitDto> accountingInvoiceDCMOtherChargesSplits) {
		this.accountingInvoiceDCMOtherChargesSplits = accountingInvoiceDCMOtherChargesSplits;
	}

	/**
	 * @return the netAmountBeforeTax
	 */
	public BigDecimal getNetAmountBeforeTax() {
		return netAmountBeforeTax;
	}

	/**
	 * @param netAmountBeforeTax
	 *            the netAmountBeforeTax to set
	 */
	public void setNetAmountBeforeTax(BigDecimal netAmountBeforeTax) {
		this.netAmountBeforeTax = netAmountBeforeTax;
	}

	public String getCreditCurrency() {
		return this.creditCurrency;
	}

	public void setCreditCurrency(String creditCurrency) {
		this.creditCurrency = creditCurrency;
	}

	public Date getCreditDate() {
		return this.creditDate;
	}

	/**
	 * @return the revenueIndicatorType
	 */
	public RevenueIndicatorType getRevenueIndicatorType() {
		return revenueIndicatorType;
	}

	/**
	 * @param revenueIndicatorType
	 *            the revenueIndicatorType to set
	 */
	public void setRevenueIndicatorType(
			RevenueIndicatorType revenueIndicatorType) {
		this.revenueIndicatorType = revenueIndicatorType;
	}

	public void setCreditDate(Date creditDate) {
		this.creditDate = creditDate;
	}

	public String getCreditNoteNumber() {
		return this.creditNoteNumber;
	}

	public void setCreditNoteNumber(String creditNoteNumber) {
		this.creditNoteNumber = creditNoteNumber;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Date getDateOfAcceptance() {
		return this.dateOfAcceptance;
	}

	public void setDateOfAcceptance(Date dateOfAcceptance) {
		this.dateOfAcceptance = dateOfAcceptance;
	}

	public Date getDcmGenerationDate() {
		return this.dcmGenerationDate;
	}

	public void setDcmGenerationDate(Date dcmGenerationDate) {
		this.dcmGenerationDate = dcmGenerationDate;
	}

	public String getDcmNumber() {
		return this.dcmNumber;
	}

	public void setDcmNumber(String dcmNumber) {
		this.dcmNumber = dcmNumber;
	}

	public double getDebitAmount() {
		return this.debitAmount;
	}

	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}

	/**
	 * @return the internationalAWBType
	 */
	public InternationalAWBType getInternationalAWBType() {
		return internationalAWBType;
	}

	/**
	 * @param internationalAWBType
	 *            the internationalAWBType to set
	 */
	public void setInternationalAWBType(
			InternationalAWBType internationalAWBType) {
		this.internationalAWBType = internationalAWBType;
	}

	public String getDebitCurrency() {
		return this.debitCurrency;
	}

	/**
	 * @return the awbNumber
	 */
	public AirWaybillNumberDto getAwbNumber() {
		return awbNumber;
	}

	/**
	 * @param awbNumber
	 *            the awbNumber to set
	 */
	public void setAwbNumber(AirWaybillNumberDto awbNumber) {
		this.awbNumber = awbNumber;
	}

	public void setDebitCurrency(String debitCurrency) {
		this.debitCurrency = debitCurrency;
	}

	public Date getDebitDate() {
		return this.debitDate;
	}

	public void setDebitDate(Date debitDate) {
		this.debitDate = debitDate;
	}

	public String getDebitNoteNumber() {
		return this.debitNoteNumber;
	}

	public void setDebitNoteNumber(String debitNoteNumber) {
		this.debitNoteNumber = debitNoteNumber;
	}

	public String getDestinationStation() {
		return this.destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public BigDecimal getDiscountAmount() {
		return this.discountAmount;
	}

	public void setDiscountAmount(BigDecimal bigDecimal) {
		this.discountAmount = bigDecimal;
	}

	public Character getDiscountIndicator() {
		return this.discountIndicator;
	}

	public void setDiscountIndicator(Character character) {
		this.discountIndicator = character;
	}

	public BigDecimal getGrossWeight() {
		return this.grossWeight;
	}

	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}

	public String getOriginStation() {
		return this.originStation;
	}

	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}

	public BigDecimal getOtherChargesDueAgent() {
		return this.otherChargesDueAgent;
	}

	public void setOtherChargesDueAgent(BigDecimal integer) {
		this.otherChargesDueAgent = integer;
	}

	public BigDecimal getOtherChargesDueCarrier() {
		return this.otherChargesDueCarrier;
	}

	public void setOtherChargesDueCarrier(BigDecimal otherChargesDueCarrier) {
		this.otherChargesDueCarrier = otherChargesDueCarrier;
	}

	public BigDecimal getRateOfExchange() {
		return this.rateOfExchange;
	}

	public void setRateOfExchange(BigDecimal rateOfExchange) {
		this.rateOfExchange = rateOfExchange;
	}

	public BigDecimal getTaxDueAgent() {
		return this.taxDueAgent;
	}

	public void setTaxDueAgent(BigDecimal integer) {
		this.taxDueAgent = integer;
	}

	public BigDecimal getTaxDueAirline() {
		return this.taxDueAirline;
	}

	public void setTaxDueAirline(BigDecimal integer) {
		this.taxDueAirline = integer;
	}

	public Character getTaxDueAirlineIndicator() {
		return this.taxDueAirlineIndicator;
	}

	public void setTaxDueAirlineIndicator(Character character) {
		this.taxDueAirlineIndicator = character;
	}

	public BigDecimal getValuationCharge() {
		return this.valuationCharge;
	}

	public void setValuationCharge(BigDecimal valuationCharge) {
		this.valuationCharge = valuationCharge;
	}

	public boolean getVatIndicator() {
		return this.vatIndicator;
	}

	public void setVatIndicator(boolean b) {
		this.vatIndicator = b;
	}

	public BigDecimal getWeightCharge() {
		return this.weightCharge;
	}

	public void setWeightCharge(BigDecimal weightCharge) {
		this.weightCharge = weightCharge;
	}

	public Boolean getWeightIndicator() {
		return this.weightIndicator;
	}

	public void setWeightIndicator(Boolean boolean1) {
		this.weightIndicator = boolean1;
	}

	/**
	 * @return the accountingInvoiceDetail
	 */
	public AccountingInvoiceDetailDto getAccountingInvoiceDetail() {
		return accountingInvoiceDetail;
	}

	/**
	 * @param accountingInvoiceDetail
	 *            the accountingInvoiceDetail to set
	 */
	public void setAccountingInvoiceDetail(
			AccountingInvoiceDetailDto accountingInvoiceDetail) {
		this.accountingInvoiceDetail = accountingInvoiceDetail;
	}

	/**
	 * @return the netVatAmountBilled
	 */
	public BigDecimal getNetVatAmountBilled() {
		return netVatAmountBilled;
	}

	/**
	 * @param netVatAmountBilled
	 *            the netVatAmountBilled to set
	 */
	public void setNetVatAmountBilled(BigDecimal netVatAmountBilled) {
		this.netVatAmountBilled = netVatAmountBilled;
	}

	/**
	 * @return the netTaxDueAgent
	 */
	public BigDecimal getNetTaxDueAgent() {
		return netTaxDueAgent;
	}

	/**
	 * @param netTaxDueAgent
	 *            the netTaxDueAgent to set
	 */
	public void setNetTaxDueAgent(BigDecimal netTaxDueAgent) {
		this.netTaxDueAgent = netTaxDueAgent;
	}

	/**
	 * @return the netTaxDueAirline
	 */
	public BigDecimal getNetTaxDueAirline() {
		return netTaxDueAirline;
	}

	/**
	 * @param netTaxDueAirline
	 *            the netTaxDueAirline to set
	 */
	public void setNetTaxDueAirline(BigDecimal netTaxDueAirline) {
		this.netTaxDueAirline = netTaxDueAirline;
	}

	public AccountingAirWaybillDto getAccAirWayBillDto() {
		return accAirWayBillDto;
	}

	public void setAccAirWayBillDto(AccountingAirWaybillDto accAirWayBillDto) {
		this.accAirWayBillDto = accAirWayBillDto;
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

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Long getGstr1ReturnOid() {
		return gstr1ReturnOid;
	}

	public void setGstr1ReturnOid(Long gstr1ReturnOid) {
		this.gstr1ReturnOid = gstr1ReturnOid;
	}

	

}