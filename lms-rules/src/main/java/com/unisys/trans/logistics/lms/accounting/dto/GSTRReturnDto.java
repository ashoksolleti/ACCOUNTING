package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AirWaybillParticipantDto;
import com.unisys.trans.logistics.lms.framework.dto.ParticipantDto;

public class GSTRReturnDto implements Serializable {

	/**
	 * 
	 */ 
	private static final long serialVersionUID = -5269250181056005988L;
	
	private Long oId;

	private String sourceIdentifier;

	private String sourceFileName;

	private String glAccountCode;

	private String division;

	private String subDivision;

	private String profitCentre1;

	private String profitCentre2;

	private String plantCode;

	private int returnPeriod;

	private String supplierGSTIN;

	private String documentType;

	private String supplyType;

	private String documentNumber;

	private Date documentDate;

	private String originalDocumentNumber;

	private Date originalDocumentDate;

	private String crdrPreGST;

	private int lineNumber;

	private String customerGSTIN;

	private String uinOrComposition;

	private String originalCustomerGSTIN;

	private String customerName;

	private String customerCode;

	private String billToState;

	private String shipToState;

	private String pos;

	private String portCode;

	private String shippingBillNumber;

	private Date shippingBillDate;

	private String fob;

	private int exportDuty;

	private String hsnOrSAC;

	private String productCode;

	private String productDescription;

	private String categoryOfProduct;

	private String unitOfMeasurement;

	private long quantity;

	private BigDecimal taxableValue;

	private BigDecimal integratedTaxRate;

	private BigDecimal integratedTaxAmount;

	private BigDecimal centralTaxRate;

	private BigDecimal centralTaxAmount;

	private BigDecimal stateUTTaxRate;

	private BigDecimal stateUTTaxAmount;

	private BigDecimal cessRateAdvalorem;

	private BigDecimal cessAmountAdvalorem;

	private BigDecimal cessRateSpecific;

	private BigDecimal cessAmountSpecific;

	private BigDecimal invoiceValue;

	private String reverseChargeFlag;

	private String tcsFlag;

	private String eComGSTIN;

	private String itcFlag;

	private String reasonForCreditDebitNote;

	private String accountingVoucherNumber;

	private Date accountingVoucherDate;

	private String userdefinedfield1;

	private String userdefinedfield2;

	private String userdefinedfield3;

	private long b2bMonth;

	private String orgPOS;

	private String orgHSNorSAC;

	private String orgUnitOfMeasurement;

	private long orgQuantity;

	private BigDecimal orgRate;

	private BigDecimal orgTaxableValue;

	private String orgeComGSTIN;

	private BigDecimal orgeComSupplyValue;

	private String newPOS;

	private String newHSNorSAC;

	private String newUnitOfMeasurement;

	private long newQuantity;

	private BigDecimal newRate;

	private BigDecimal newTaxableValue;

	private String neweComGSTIN;

	private long neweComSupplyValue;

	private BigDecimal cessAmount;

	private BigDecimal totalValue;

	private long serialNo;

	private String natureOfDocument;

	private String invFrom;

	private String invTo;

	private long totalNumber;

	private long canceled;

	private long netNumber;

	private Date fromDate;

	private Date toDate;

	private String fileType;

	private String fileIndicator;

	private Date creationDate;

	private String creationuser;

	private Date lastUpdatedDate;

	private String lastUpdatedUser;
	
	private String crdrIndicator;
	private Date gstrInvoiceDate;
	private String returnType;
	private String differntialPercentage;
	private String section7OfIgst;
	private String autoPopulateToRefund;
	private BigDecimal rate;
	private BigDecimal ecomValueOfSupplyMade;
	private BigDecimal ecomValueOfSupplyReturned;
	private BigDecimal ecomNetValueOfSupplies;	
	private Long originalPROid;	
	
	private String awbOids;
	private String dcmOids;
	private String prOids;
    
	private ParticipantDto participantDto;

	private Date invoiceDate;

	private String invoiceNumber;
	
	
	
	public Long getoId() {
		return oId;
	}

	public void setoId(Long oId) {
		this.oId = oId;
	}

	public String getSourceIdentifier() {
		return sourceIdentifier;
	}

	public void setSourceIdentifier(String sourceIdentifier) {
		this.sourceIdentifier = sourceIdentifier;
	}

	public String getSourceFileName() {
		return sourceFileName;
	}

	public void setSourceFileName(String sourceFileName) {
		this.sourceFileName = sourceFileName;
	}

	public String getGlAccountCode() {
		return glAccountCode;
	}

	public void setGlAccountCode(String glAccountCode) {
		this.glAccountCode = glAccountCode;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getSubDivision() {
		return subDivision;
	}

	public void setSubDivision(String subDivision) {
		this.subDivision = subDivision;
	}

	public String getProfitCentre1() {
		return profitCentre1;
	}

	public void setProfitCentre1(String profitCentre1) {
		this.profitCentre1 = profitCentre1;
	}

	public String getProfitCentre2() {
		return profitCentre2;
	}

	public void setProfitCentre2(String profitCentre2) {
		this.profitCentre2 = profitCentre2;
	}

	public String getPlantCode() {
		return plantCode;
	}

	public void setPlantCode(String plantCode) {
		this.plantCode = plantCode;
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

	public String getCrdrPreGST() {
		return crdrPreGST;
	}

	public void setCrdrPreGST(String crdrPreGST) {
		this.crdrPreGST = crdrPreGST;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getCustomerGSTIN() {
		return customerGSTIN;
	}

	public void setCustomerGSTIN(String customerGSTIN) {
		this.customerGSTIN = customerGSTIN;
	}

	public String getUinOrComposition() {
		return uinOrComposition;
	}

	public void setUinOrComposition(String uinOrComposition) {
		this.uinOrComposition = uinOrComposition;
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

	public String getBillToState() {
		return billToState;
	}

	public void setBillToState(String billToState) {
		this.billToState = billToState;
	}

	public String getShipToState() {
		return shipToState;
	}

	public void setShipToState(String shipToState) {
		this.shipToState = shipToState;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getPortCode() {
		return portCode;
	}

	public void setPortCode(String portCode) {
		this.portCode = portCode;
	}

	public String getShippingBillNumber() {
		return shippingBillNumber;
	}

	public void setShippingBillNumber(String shippingBillNumber) {
		this.shippingBillNumber = shippingBillNumber;
	}

	public Date getShippingBillDate() {
		return shippingBillDate;
	}

	public void setShippingBillDate(Date shippingBillDate) {
		this.shippingBillDate = shippingBillDate;
	}

	public String getFob() {
		return fob;
	}

	public void setFob(String fob) {
		this.fob = fob;
	}

	public int getExportDuty() {
		return exportDuty;
	}

	public void setExportDuty(int exportDuty) {
		this.exportDuty = exportDuty;
	}

	public String getHsnOrSAC() {
		return hsnOrSAC;
	}

	public void setHsnOrSAC(String hsnOrSAC) {
		this.hsnOrSAC = hsnOrSAC;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getCategoryOfProduct() {
		return categoryOfProduct;
	}

	public void setCategoryOfProduct(String categoryOfProduct) {
		this.categoryOfProduct = categoryOfProduct;
	}

	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
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

	public BigDecimal getCessRateAdvalorem() {
		return cessRateAdvalorem;
	}

	public void setCessRateAdvalorem(BigDecimal cessRateAdvalorem) {
		this.cessRateAdvalorem = cessRateAdvalorem;
	}

	public BigDecimal getCessAmountAdvalorem() {
		return cessAmountAdvalorem;
	}

	public void setCessAmountAdvalorem(BigDecimal cessAmountAdvalorem) {
		this.cessAmountAdvalorem = cessAmountAdvalorem;
	}

	public BigDecimal getCessRateSpecific() {
		return cessRateSpecific;
	}

	public void setCessRateSpecific(BigDecimal cessRateSpecific) {
		this.cessRateSpecific = cessRateSpecific;
	}

	public BigDecimal getCessAmountSpecific() {
		return cessAmountSpecific;
	}

	public void setCessAmountSpecific(BigDecimal cessAmountSpecific) {
		this.cessAmountSpecific = cessAmountSpecific;
	}

	public BigDecimal getInvoiceValue() {
		return invoiceValue;
	}

	public void setInvoiceValue(BigDecimal invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	public String getReverseChargeFlag() {
		return reverseChargeFlag;
	}

	public void setReverseChargeFlag(String reverseChargeFlag) {
		this.reverseChargeFlag = reverseChargeFlag;
	}

	public String getTcsFlag() {
		return tcsFlag;
	}

	public void setTcsFlag(String tcsFlag) {
		this.tcsFlag = tcsFlag;
	}

	public String geteComGSTIN() {
		return eComGSTIN;
	}

	public void seteComGSTIN(String eComGSTIN) {
		this.eComGSTIN = eComGSTIN;
	}

	public String getItcFlag() {
		return itcFlag;
	}

	public void setItcFlag(String itcFlag) {
		this.itcFlag = itcFlag;
	}

	public String getReasonForCreditDebitNote() {
		return reasonForCreditDebitNote;
	}

	public void setReasonForCreditDebitNote(String reasonForCreditDebitNote) {
		this.reasonForCreditDebitNote = reasonForCreditDebitNote;
	}

	public String getAccountingVoucherNumber() {
		return accountingVoucherNumber;
	}

	public void setAccountingVoucherNumber(String accountingVoucherNumber) {
		this.accountingVoucherNumber = accountingVoucherNumber;
	}

	public Date getAccountingVoucherDate() {
		return accountingVoucherDate;
	}

	public void setAccountingVoucherDate(Date accountingVoucherDate) {
		this.accountingVoucherDate = accountingVoucherDate;
	}

	public String getUserdefinedfield1() {
		return userdefinedfield1;
	}

	public void setUserdefinedfield1(String userdefinedfield1) {
		this.userdefinedfield1 = userdefinedfield1;
	}

	public String getUserdefinedfield2() {
		return userdefinedfield2;
	}

	public void setUserdefinedfield2(String userdefinedfield2) {
		this.userdefinedfield2 = userdefinedfield2;
	}

	public String getUserdefinedfield3() {
		return userdefinedfield3;
	}

	public void setUserdefinedfield3(String userdefinedfield3) {
		this.userdefinedfield3 = userdefinedfield3;
	}

	public long getB2bMonth() {
		return b2bMonth;
	}

	public void setB2bMonth(long b2bMonth) {
		this.b2bMonth = b2bMonth;
	}

	public String getOrgPOS() {
		return orgPOS;
	}

	public void setOrgPOS(String orgPOS) {
		this.orgPOS = orgPOS;
	}

	public String getOrgHSNorSAC() {
		return orgHSNorSAC;
	}

	public void setOrgHSNorSAC(String orgHSNorSAC) {
		this.orgHSNorSAC = orgHSNorSAC;
	}

	public String getOrgUnitOfMeasurement() {
		return orgUnitOfMeasurement;
	}

	public void setOrgUnitOfMeasurement(String orgUnitOfMeasurement) {
		this.orgUnitOfMeasurement = orgUnitOfMeasurement;
	}

	public long getOrgQuantity() {
		return orgQuantity;
	}

	public void setOrgQuantity(long orgQuantity) {
		this.orgQuantity = orgQuantity;
	}

	public BigDecimal getOrgRate() {
		return orgRate;
	}

	public void setOrgRate(BigDecimal orgRate) {
		this.orgRate = orgRate;
	}

	public BigDecimal getOrgTaxableValue() {
		return orgTaxableValue;
	}

	public void setOrgTaxableValue(BigDecimal orgTaxableValue) {
		this.orgTaxableValue = orgTaxableValue;
	}

	public String getOrgeComGSTIN() {
		return orgeComGSTIN;
	}

	public void setOrgeComGSTIN(String orgeComGSTIN) {
		this.orgeComGSTIN = orgeComGSTIN;
	}

	public BigDecimal getOrgeComSupplyValue() {
		return orgeComSupplyValue;
	}

	public void setOrgeComSupplyValue(BigDecimal orgeComSupplyValue) {
		this.orgeComSupplyValue = orgeComSupplyValue;
	}

	public String getNewPOS() {
		return newPOS;
	}

	public void setNewPOS(String newPOS) {
		this.newPOS = newPOS;
	}

	public String getNewHSNorSAC() {
		return newHSNorSAC;
	}

	public void setNewHSNorSAC(String newHSNorSAC) {
		this.newHSNorSAC = newHSNorSAC;
	}

	public String getNewUnitOfMeasurement() {
		return newUnitOfMeasurement;
	}

	public void setNewUnitOfMeasurement(String newUnitOfMeasurement) {
		this.newUnitOfMeasurement = newUnitOfMeasurement;
	}

	public long getNewQuantity() {
		return newQuantity;
	}

	public void setNewQuantity(long newQuantity) {
		this.newQuantity = newQuantity;
	}

	public BigDecimal getNewRate() {
		return newRate;
	}

	public void setNewRate(BigDecimal newRate) {
		this.newRate = newRate;
	}

	public BigDecimal getNewTaxableValue() {
		return newTaxableValue;
	}

	public void setNewTaxableValue(BigDecimal newTaxableValue) {
		this.newTaxableValue = newTaxableValue;
	}

	public String getNeweComGSTIN() {
		return neweComGSTIN;
	}

	public void setNeweComGSTIN(String neweComGSTIN) {
		this.neweComGSTIN = neweComGSTIN;
	}

	public long getNeweComSupplyValue() {
		return neweComSupplyValue;
	}

	public void setNeweComSupplyValue(long neweComSupplyValue) {
		this.neweComSupplyValue = neweComSupplyValue;
	}

	public BigDecimal getCessAmount() {
		return cessAmount;
	}

	public void setCessAmount(BigDecimal cessAmount) {
		this.cessAmount = cessAmount;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	public long getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(long serialNo) {
		this.serialNo = serialNo;
	}

	public String getNatureOfDocument() {
		return natureOfDocument;
	}

	public void setNatureOfDocument(String natureOfDocument) {
		this.natureOfDocument = natureOfDocument;
	}

	public String getInvFrom() {
		return invFrom;
	}

	public void setInvFrom(String invFrom) {
		this.invFrom = invFrom;
	}

	public String getInvTo() {
		return invTo;
	}

	public void setInvTo(String invTo) {
		this.invTo = invTo;
	}

	public long getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(long totalNumber) {
		this.totalNumber = totalNumber;
	}

	public long getCanceled() {
		return canceled;
	}

	public void setCanceled(long canceled) {
		this.canceled = canceled;
	}

	public long getNetNumber() {
		return netNumber;
	}

	public void setNetNumber(long netNumber) {
		this.netNumber = netNumber;
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

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileIndicator() {
		return fileIndicator;
	}

	public void setFileIndicator(String fileIndicator) {
		this.fileIndicator = fileIndicator;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getCreationuser() {
		return creationuser;
	}

	public void setCreationuser(String creationuser) {
		this.creationuser = creationuser;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public String getLastUpdatedUser() {
		return lastUpdatedUser;
	}

	public void setLastUpdatedUser(String lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	public String getCrdrIndicator() {
		return crdrIndicator;
	}

	public Date getGstrInvoiceDate() {
		return gstrInvoiceDate;
	}

	public String getReturnType() {
		return returnType;
	}

	public String getDifferntialPercentage() {
		return differntialPercentage;
	}

	public String getSection7OfIgst() {
		return section7OfIgst;
	}

	public String getAutoPopulateToRefund() {
		return autoPopulateToRefund;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public BigDecimal getEcomValueOfSupplyMade() {
		return ecomValueOfSupplyMade;
	}

	public BigDecimal getEcomValueOfSupplyReturned() {
		return ecomValueOfSupplyReturned;
	}

	public BigDecimal getEcomNetValueOfSupplies() {
		return ecomNetValueOfSupplies;
	}

	public void setCrdrIndicator(String crdrIndicator) {
		this.crdrIndicator = crdrIndicator;
	}

	public void setGstrInvoiceDate(Date gstrInvoiceDate) {
		this.gstrInvoiceDate = gstrInvoiceDate;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	public void setDifferntialPercentage(String differntialPercentage) {
		this.differntialPercentage = differntialPercentage;
	}

	public void setSection7OfIgst(String section7OfIgst) {
		this.section7OfIgst = section7OfIgst;
	}

	public void setAutoPopulateToRefund(String autoPopulateToRefund) {
		this.autoPopulateToRefund = autoPopulateToRefund;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public void setEcomValueOfSupplyMade(BigDecimal ecomValueOfSupplyMade) {
		this.ecomValueOfSupplyMade = ecomValueOfSupplyMade;
	}

	public void setEcomValueOfSupplyReturned(BigDecimal ecomValueOfSupplyReturned) {
		this.ecomValueOfSupplyReturned = ecomValueOfSupplyReturned;
	}

	public void setEcomNetValueOfSupplies(BigDecimal ecomNetValueOfSupplies) {
		this.ecomNetValueOfSupplies = ecomNetValueOfSupplies;
	}

	public void setOriginalPROid(Long originalPROid) {
		this.originalPROid = originalPROid;
	}	

	public Long getOriginalPROid() {
		return originalPROid;
	}

	public String getAwbOids() {
		return awbOids;
	}

	public String getDcmOids() {
		return dcmOids;
	}

	public String getPrOids() {
		return prOids;
	}

	public void setAwbOids(String awbOids) {
		this.awbOids = awbOids;
	}

	public void setDcmOids(String dcmOids) {
		this.dcmOids = dcmOids;
	}

	public void setPrOids(String prOids) {
		this.prOids = prOids;
	}

	public ParticipantDto getParticipantDto() {
		return participantDto;
	}

	public void setParticipantDto(ParticipantDto participantDto) {
		this.participantDto = participantDto;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}	
	
}
