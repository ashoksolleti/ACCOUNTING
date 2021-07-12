package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AirWaybillParticipantDto;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantDto;

public class GstrReturnInvoiceDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long oId;

	private int returnPeriod;

	private String supplierGSTIN;

	private String documentType;

	private String supplyType;

	private String documentNumber;

	private Date documentDate;

	private String originalDocumentNumber;

	private Date originalDocumentDate;

	private String customerGSTIN;

	private String originalCustomerGSTIN;

	private String customerName;

	private String customerCode;

	private String pos;

	private String hsnOrSAC;

	private String productDescription;

	private BigDecimal taxableValue;

	private BigDecimal integratedTaxRate;

	private BigDecimal integratedTaxAmount;

	private BigDecimal centralTaxRate;

	private BigDecimal centralTaxAmount;

	private BigDecimal stateUTTaxRate;

	private BigDecimal stateUTTaxAmount;

	private BigDecimal invoiceValue;

	private BigDecimal totalValue;

	private Date fromDate;
	private Date creationDate;

	private Date toDate;

	private String crdrIndicator;
	private Date gstrInvoiceDate;
	private String returnType;

	private BigDecimal rate;
	
	private ParticipantDto participantDto;
	
	private String billingAccountNumber1;	
	private String name;
	private String address;
	private String country;
	private String invoicenumber;
	private String invoiceAmountInWords;
	private BigDecimal weightCharge;
	private BigDecimal otherChargesDueCarrier;
	
	public String getBillingAccountNumber1() {
		return billingAccountNumber1;
	}

	public void setBillingAccountNumber1(String billingAccountNumber1) {
		this.billingAccountNumber1 = billingAccountNumber1;
	}
	
	/* totalAmountOCDC = valutionCharge + Other Charge Due Carrier + FuelSurcharge	*/
	private BigDecimal totalAmountOCDC;
	
	public BigDecimal getTotalAmountOCDC() {
		return totalAmountOCDC;
	}

	public void setTotalAmountOCDC(BigDecimal totalAmountOCDC) {
		this.totalAmountOCDC = totalAmountOCDC;
	}

	public String getInvoiceAmountInWords() {
		return invoiceAmountInWords;
	}

	public void setInvoiceAmountInWords(String invoiceAmountInWords) {
		this.invoiceAmountInWords = invoiceAmountInWords;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	private String state;
	private String stationCode;


	public Long getoId() {
		return oId;
	}

	public void setoId(Long oId) {
		this.oId = oId;
	}

	public int getReturnPeriod() {
		return returnPeriod;
	}

	public void setReturnPeriod(int returnPeriod) {
		this.returnPeriod = returnPeriod;
	}

	public String getSupplierGSTIN() {
		return supplierGSTIN;
	}

	public void setSupplierGSTIN(String supplierGSTIN) {
		this.supplierGSTIN = supplierGSTIN;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getSupplyType() {
		return supplyType;
	}

	public void setSupplyType(String supplyType) {
		this.supplyType = supplyType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public Date getDocumentDate() {
		return documentDate;
	}

	public void setDocumentDate(Date documentDate) {
		this.documentDate = documentDate;
	}

	public String getOriginalDocumentNumber() {
		return originalDocumentNumber;
	}

	public void setOriginalDocumentNumber(String originalDocumentNumber) {
		this.originalDocumentNumber = originalDocumentNumber;
	}

	public Date getOriginalDocumentDate() {
		return originalDocumentDate;
	}

	public void setOriginalDocumentDate(Date originalDocumentDate) {
		this.originalDocumentDate = originalDocumentDate;
	}

	public String getCustomerGSTIN() {
		return customerGSTIN;
	}

	public void setCustomerGSTIN(String customerGSTIN) {
		this.customerGSTIN = customerGSTIN;
	}

	public String getOriginalCustomerGSTIN() {
		return originalCustomerGSTIN;
	}

	public void setOriginalCustomerGSTIN(String originalCustomerGSTIN) {
		this.originalCustomerGSTIN = originalCustomerGSTIN;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getHsnOrSAC() {
		return hsnOrSAC;
	}

	public void setHsnOrSAC(String hsnOrSAC) {
		this.hsnOrSAC = hsnOrSAC;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public BigDecimal getTaxableValue() {
		return taxableValue;
	}

	public void setTaxableValue(BigDecimal taxableValue) {
		this.taxableValue = taxableValue;
	}

	public BigDecimal getIntegratedTaxRate() {
		return integratedTaxRate;
	}

	public void setIntegratedTaxRate(BigDecimal integratedTaxRate) {
		this.integratedTaxRate = integratedTaxRate;
	}

	public BigDecimal getIntegratedTaxAmount() {
		return integratedTaxAmount;
	}

	public void setIntegratedTaxAmount(BigDecimal integratedTaxAmount) {
		this.integratedTaxAmount = integratedTaxAmount;
	}

	public BigDecimal getCentralTaxRate() {
		return centralTaxRate;
	}

	public void setCentralTaxRate(BigDecimal centralTaxRate) {
		this.centralTaxRate = centralTaxRate;
	}

	public BigDecimal getCentralTaxAmount() {
		return centralTaxAmount;
	}

	public void setCentralTaxAmount(BigDecimal centralTaxAmount) {
		this.centralTaxAmount = centralTaxAmount;
	}

	public BigDecimal getStateUTTaxRate() {
		return stateUTTaxRate;
	}

	public void setStateUTTaxRate(BigDecimal stateUTTaxRate) {
		this.stateUTTaxRate = stateUTTaxRate;
	}

	public BigDecimal getStateUTTaxAmount() {
		return stateUTTaxAmount;
	}

	public void setStateUTTaxAmount(BigDecimal stateUTTaxAmount) {
		this.stateUTTaxAmount = stateUTTaxAmount;
	}

	public BigDecimal getInvoiceValue() {
		return invoiceValue;
	}

	public void setInvoiceValue(BigDecimal invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getCrdrIndicator() {
		return crdrIndicator;
	}

	public void setCrdrIndicator(String crdrIndicator) {
		this.crdrIndicator = crdrIndicator;
	}

	public Date getGstrInvoiceDate() {
		return gstrInvoiceDate;
	}

	public void setGstrInvoiceDate(Date gstrInvoiceDate) {
		this.gstrInvoiceDate = gstrInvoiceDate;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public ParticipantDto getParticipantDto() {
		return participantDto;
	}

	public void setParticipantDto(ParticipantDto participantDto) {
		this.participantDto = participantDto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getInvoicenumber() {
		return invoicenumber;
	}

	public void setInvoicenumber(String invoicenumber) {
		this.invoicenumber = invoicenumber;
	}

	public BigDecimal getWeightCharge() {
		return weightCharge;
	}

	public void setWeightCharge(BigDecimal weightCharge) {
		this.weightCharge = weightCharge;
	}

	public BigDecimal getOtherChargesDueCarrier() {
		return otherChargesDueCarrier;
	}

	public void setOtherChargesDueCarrier(BigDecimal otherChargesDueCarrier) {
		this.otherChargesDueCarrier = otherChargesDueCarrier;
	}

	
}
