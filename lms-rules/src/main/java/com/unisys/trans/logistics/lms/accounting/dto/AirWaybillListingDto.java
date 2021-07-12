package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ClearingHouseType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * DTOs for the AirWaybill Information
 * 
 * @author AhirwaUK
 *
 */
public class AirWaybillListingDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;

	private AccountingAirWaybillDetailDto airWaybillDetail = new AccountingAirWaybillDetailDto();
	private BillingSchedulesDto billingSchedulesDto = new BillingSchedulesDto();
	private AirWaybillNumberDto airWaybillNumberDto = new AirWaybillNumberDto();
	private AccountingInvoiceBillingScheduleDto accbillingSchedulesDto = new AccountingInvoiceBillingScheduleDto();
	private AccountingInvoiceDetailDto accountingInvoiceDetailDto = new AccountingInvoiceDetailDto();
    private ParticipantReceivableDto participantReceivableDto = new ParticipantReceivableDto();
    private AccountingInvoiceAWBDto accountingInvoiceAWBDto = new AccountingInvoiceAWBDto();
    private AccountingAirWaybillDto airWaybillDto = new AccountingAirWaybillDto(); 
    private CarrierReceivableDto carrierReceivableDto = new CarrierReceivableDto();
    private CarrierPayableDto carrierPayableDto = new CarrierPayableDto();
    private ParticipantPayableDto participantPayableDto = new ParticipantPayableDto();
    //private String awbStatus;
    private BigDecimal weightCharges;
    private BigDecimal valuationCharges;
    
    private String fromStation;
    private String toStation;
    
    private BigDecimal billedWeightCharges;
    private WeightUOMType billedWeightUnit;
    
    private Date invoiceStartDate;
	private Date invoiceToDate;
	private Date aWBExecutionStartDate;
	private Date aWBExecutionToDate;
	private BigDecimal tax;
	private String hostFlightNumber;
	private Date hostFlightDate;
	private BigDecimal hostFlownRevenue;
	private Date documentIssueDate;
	private String billingSchedule;
	private ClearingHouseType clearancePeriodType;
	private BigDecimal billedWeight;
	
	private Integer netAmountInBillingCurrency;
	private String aWBStatus;
	private String aWBInvoiceStatus;
	private InterlineReportDto interlineReportDto;
	
	private String carrierCode;
	private InvoiceStatusType invoiceStatus;

	private Date executionDate;
	private String executionDateString;
	private BigDecimal ocdc;
	private BigDecimal ocda;
	private BigDecimal commissionAmount;
	private BigDecimal tdsAmount;

	private BigDecimal netAmount;
	private BigDecimal iscAmount;
	private String invoiceDate;
	//private Date invoiceDate;
	private String billingCurrency;	
	
	//prorationType
	private ProrationType prorationType;
	
	//CC Fee
	private BigDecimal ccFee;
	private String memoNumber;
	
	private String airwaybillNumber;
	
	// Inward Rejection
	private BigDecimal inwardWeightChargesBilled;
	private BigDecimal inwardWeightChargesActual;
	private BigDecimal inwardWeightChargesAccepted;
	
	private BigDecimal inwardValuationChargesBilled;
	private BigDecimal inwardValuationChargesActual;
	private BigDecimal inwardValuationChargesAccepted;
	
	private BigDecimal inwardOtherChargesBilled;
	private BigDecimal inwardOtherChargesActual;
	private BigDecimal inwardOtherChargesAccepted;
	//nothing but vatamount have to to map with invoice awb table value.
	private BigDecimal inwardVATBilled;
	private BigDecimal inwardVATActual;
	private BigDecimal inwardVATAccepted;
	
	private BigDecimal inwardISCBilled;
	private BigDecimal inwardISCActual;
	private BigDecimal inwardISCAccepted;
	// as of now no values is there in the db
	private BigDecimal inwardAmountSubjectToBilled;
	private BigDecimal inwardAmountSubjectToAmountDiff;
	private BigDecimal inwardAmountSubjectToAmountAccepted;
	
	private BigDecimal inwardTotalNetAmount;
	//inward rejection - RM
	private String inwardRejectionMemoNumber;
	//rite now am getting from participant table
	private String inwardInvoiceNumber;
	private Date inwardInvoiceBillingDate;
	
	private byte[] outputFile;
	private String reportType;
	
	// Outward Rejection
	private BigDecimal outwardWeightChargesBilled;
	private BigDecimal outwardWeightChargesActual;
	private BigDecimal outwardWeightChargesAccepted;
	
	private BigDecimal outwardValuationChargesBilled;
	private BigDecimal outwardValuationChargesActual;
	private BigDecimal outwardValuationChargesAccepted;
	
	private BigDecimal outwardOtherChargesBilled;
	private BigDecimal outwardOtherChargesActual;
	private BigDecimal outwardOtherChargesAccepted;
	//nothing but vatamount have to to map with invoice awb table value.
	private BigDecimal outwardVATBilled;
	private BigDecimal outwardVATActual;
	private BigDecimal outwardVATAccepted;
	
	private BigDecimal outwardISCBilled;
	private BigDecimal outwardISCActual;
	private String participantCarrierType;
	private String inwardRejectionStage;
	private String outwardRejectionStage;
	private List<String> cgstCharges;
	private List<String> sgstCharges;
	private List<String> igstCharges;

	private boolean download;
	
	//LMSC-16223
	private BigDecimal keralaFloodCess;
	
	private List<String> commercialSurcharges;
	
	private BigDecimal commercialSurcharge;

	public BigDecimal getKeralaFloodCess() {
		return keralaFloodCess;
	}

	public void setKeralaFloodCess(BigDecimal keralaFloodCess) {
		this.keralaFloodCess = keralaFloodCess;
	}

	public boolean isDownload() {
		return download;
	}

	public void setDownload(boolean download) {
		this.download = download;
	}

	public String getParticipantCarrierType() {
		return participantCarrierType;
	}

	public void setParticipantCarrierType(String participantCarrierType) {
		this.participantCarrierType = participantCarrierType;
	}

	public BigDecimal getInwardValuationChargesActual() {
		return inwardValuationChargesActual;
	}

	public void setInwardValuationChargesActual(BigDecimal inwardValuationChargesActual) {
		this.inwardValuationChargesActual = inwardValuationChargesActual;
	}

	public BigDecimal getInwardOtherChargesActual() {
		return inwardOtherChargesActual;
	}

	public void setInwardOtherChargesActual(BigDecimal inwardOtherChargesActual) {
		this.inwardOtherChargesActual = inwardOtherChargesActual;
	}

	public BigDecimal getInwardVATBilled() {
		return inwardVATBilled;
	}

	public void setInwardVATBilled(BigDecimal inwardVATBilled) {
		this.inwardVATBilled = inwardVATBilled;
	}

	public BigDecimal getInwardVATActual() {
		return inwardVATActual;
	}

	public void setInwardVATActual(BigDecimal inwardVATActual) {
		this.inwardVATActual = inwardVATActual;
	}

	public BigDecimal getInwardVATAccepted() {
		return inwardVATAccepted;
	}

	public void setInwardVATAccepted(BigDecimal inwardVATAccepted) {
		this.inwardVATAccepted = inwardVATAccepted;
	}

	public BigDecimal getInwardISCActual() {
		return inwardISCActual;
	}

	public void setInwardISCActual(BigDecimal inwardISCActual) {
		this.inwardISCActual = inwardISCActual;
	}

	public BigDecimal getOutwardWeightChargesActual() {
		return outwardWeightChargesActual;
	}

	public void setOutwardWeightChargesActual(BigDecimal outwardWeightChargesActual) {
		this.outwardWeightChargesActual = outwardWeightChargesActual;
	}

	public BigDecimal getOutwardValuationChargesActual() {
		return outwardValuationChargesActual;
	}

	public void setOutwardValuationChargesActual(BigDecimal outwardValuationChargesActual) {
		this.outwardValuationChargesActual = outwardValuationChargesActual;
	}

	public BigDecimal getOutwardOtherChargesActual() {
		return outwardOtherChargesActual;
	}

	public void setOutwardOtherChargesActual(BigDecimal outwardOtherChargesActual) {
		this.outwardOtherChargesActual = outwardOtherChargesActual;
	}

	public BigDecimal getOutwardVATBilled() {
		return outwardVATBilled;
	}

	public void setOutwardVATBilled(BigDecimal outwardVATBilled) {
		this.outwardVATBilled = outwardVATBilled;
	}

	public BigDecimal getOutwardVATActual() {
		return outwardVATActual;
	}

	public void setOutwardVATActual(BigDecimal outwardVATActual) {
		this.outwardVATActual = outwardVATActual;
	}

	public BigDecimal getOutwardVATAccepted() {
		return outwardVATAccepted;
	}

	public void setOutwardVATAccepted(BigDecimal outwardVATAccepted) {
		this.outwardVATAccepted = outwardVATAccepted;
	}

	public BigDecimal getOutwardISCActual() {
		return outwardISCActual;
	}

	public void setOutwardISCActual(BigDecimal outwardISCActual) {
		this.outwardISCActual = outwardISCActual;
	}

	private BigDecimal outwardISCAccepted;
	// as of now no values is there in the db
	private BigDecimal outwardAmountSubjectToBilled;
	private BigDecimal outwardAmountSubjectToAmountDiff;
	private BigDecimal outwardAmountSubjectToAmountAccepted;
	
	private BigDecimal outwardTotalNetAmount;
	//outward rejection - RN
	private String outwardRejectionMemoNumber;
	//rite now am getting from participant table
	private String outwardInvoiceNumber;
	private Date outwardInvoiceBillingDate;
	private boolean onHold;
	private String weightIndicator;
	private String strProrationType;
	
	private List<ParticipantReceivableDto> participantReceivableDtoList;
	private List<CarrierReceivableDto> carrierReceivableDtoList;
	private int pageNumber;
	
	private String remarks;
	/**
	 * @return the strProrationType
	 */
	public String getStrProrationType() {
		return strProrationType;
	}

	/**
	 * @param strProrationType the strProrationType to set
	 */
	public void setStrProrationType(String strProrationType) {
		this.strProrationType = strProrationType;
	}

	public List<CarrierReceivableDto> getCarrierReceivableDtoList() {
		return carrierReceivableDtoList;
	}

	public void setCarrierReceivableDtoList(
			List<CarrierReceivableDto> carrierReceivableDtoList) {
		this.carrierReceivableDtoList = carrierReceivableDtoList;
	}

	public List<AccountingAirWaybillDto> getAccountingAirWaybillDtos() {
		return accountingAirWaybillDtos;
	}

	public void setAccountingAirWaybillDtos(
			List<AccountingAirWaybillDto> accountingAirWaybillDtos) {
		this.accountingAirWaybillDtos = accountingAirWaybillDtos;
	}

	private List<AccountingAirWaybillDto> accountingAirWaybillDtos;

	private String specificAirline;
	
	public List<ParticipantReceivableDto> getParticipantReceivableDtoList() {
		return participantReceivableDtoList;
	}

	public void setParticipantReceivableDtoList(
			List<ParticipantReceivableDto> participantReceivableDtoList) {
		this.participantReceivableDtoList = participantReceivableDtoList;
	}

	public String getWeightIndicator() {
		return weightIndicator;
	}

	public void setWeightIndicator(String weightIndicator) {
		this.weightIndicator = weightIndicator;
	}

	public boolean isOnHold() {
		return onHold;
	}

	public void setOnHold(boolean onHold) {
		this.onHold = onHold;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = ContractUtility.convertToUpperCase(fromStation);
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = ContractUtility.convertToUpperCase(toStation);
	}

	public InvoiceStatusType getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(InvoiceStatusType invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public BigDecimal getBilledWeight() {
		return billedWeight;
	}

	public void setBilledWeight(BigDecimal billedWeight) {
		this.billedWeight = billedWeight;
	}

	public String getBillingCurrency() {
		return billingCurrency;
	}

	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public BigDecimal getIscAmount() {
		return iscAmount;
	}

	public void setIscAmount(BigDecimal iscAmount) {
		this.iscAmount = iscAmount;
	}

	public BigDecimal getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}

	public BigDecimal getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public BigDecimal getTdsAmount() {
		if(tdsAmount==null) {
			tdsAmount = new BigDecimal(0);
		}
		return tdsAmount;
	}

	public void setTdsAmount(BigDecimal tdsAmount) {
		this.tdsAmount = tdsAmount;
	}
	
	public String getMemoNumber() {
		return memoNumber;
	}

	public void setMemoNumber(String memoNumber) {
		this.memoNumber = memoNumber;
	}

	public Date getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	public String getExecutionDateString() {
		return executionDateString;
	}

	public void setExecutionDateString(String executionDateString) {
		this.executionDateString = executionDateString;
	}

	public BigDecimal getOcdc() {
		return ocdc;
	}

	public void setOcdc(BigDecimal ocdc) {
		this.ocdc = ocdc;
	}

	public BigDecimal getOcda() {
		return ocda;
	}

	public void setOcda(BigDecimal ocda) {
		this.ocda = ocda;
	}

	public BigDecimal getBilledWeightCharges() {
		return billedWeightCharges;
	}

	public void setBilledWeightCharges(BigDecimal billedWeightCharges) {
		this.billedWeightCharges = billedWeightCharges;
	}

	public WeightUOMType getBilledWeightUnit() {
		return billedWeightUnit;
	}

	public void setBilledWeightUnit(WeightUOMType billedWeightUnit) {
		this.billedWeightUnit = billedWeightUnit;
	}

	public CarrierReceivableDto getCarrierReceivableDto() {
		return carrierReceivableDto;
	}

	public void setCarrierReceivableDto(CarrierReceivableDto carrierReceivableDto) {
		this.carrierReceivableDto = carrierReceivableDto;
	}

	public AccountingAirWaybillDetailDto getAirWaybillDetail() {
		return airWaybillDetail;
	}

	public void setAirWaybillDetail(AccountingAirWaybillDetailDto airWaybillDetail) {
		this.airWaybillDetail = airWaybillDetail;
	}

	public AccountingAirWaybillDto getAirWaybillDto() {
		return airWaybillDto;
	}

	public void setAirWaybillDto(AccountingAirWaybillDto airWaybillDto) {
		this.airWaybillDto = airWaybillDto;
	}

	
	
	public String getBillingSchedule() {
		return billingSchedule;
	}

	public void setBillingSchedule(String billingSchedule) {
		this.billingSchedule = billingSchedule;
	}

	public String getaWBInvoiceStatus() {
		return aWBInvoiceStatus;
	}

	public void setaWBInvoiceStatus(String aWBInvoiceStatus) {
		this.aWBInvoiceStatus = aWBInvoiceStatus;
	}

	public String getAWBInvoiceStatus() {
		return aWBInvoiceStatus;
	}

	public void setAWBInvoiceStatus(String aWBInvoiceStatus) {
		this.aWBInvoiceStatus = aWBInvoiceStatus;
	}

	public String getaWBStatus() {
		return aWBStatus;
	}

	public void setaWBStatus(String aWBStatus) {
		this.aWBStatus = aWBStatus;
	}

	public AccountingAirWaybillDetailDto getAccountingAirWaybillDetailDto() {
		return airWaybillDetail;
	}

	public void setAccountingAirWaybillDetailDto(
			AccountingAirWaybillDetailDto accountingAirWaybillDetailDto) {
		this.airWaybillDetail = accountingAirWaybillDetailDto;
	}

	public Date getInvoiceStartDate() {
		return invoiceStartDate;
	}

	public void setInvoiceStartDate(Date invoiceStartDate) {
		this.invoiceStartDate = invoiceStartDate;
	}

	public Date getInvoiceToDate() {
		return invoiceToDate;
	}

	public void setInvoiceToDate(Date invoiceToDate) {
		this.invoiceToDate = invoiceToDate;
	}

	public Date getaWBExecutionStartDate() {
		return aWBExecutionStartDate;
	}

	public void setaWBExecutionStartDate(Date aWBExecutionStartDate) {
		this.aWBExecutionStartDate = aWBExecutionStartDate;
	}

	public Date getaWBExecutionToDate() {
		return aWBExecutionToDate;
	}

	public void setaWBExecutionToDate(Date aWBExecutionToDate) {
		this.aWBExecutionToDate = aWBExecutionToDate;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public AccountingInvoiceDetailDto getAccountingInvoiceDetailDto() {
		return accountingInvoiceDetailDto;
	}

	public void setAccountingInvoiceDetailDto(
			AccountingInvoiceDetailDto accountingInvoiceDetailDto) {
		this.accountingInvoiceDetailDto = accountingInvoiceDetailDto;
	}

	public AirWaybillNumberDto getAirWaybillNumberDto() {
		return airWaybillNumberDto;
	}

	public void setAirWaybillNumberDto(AirWaybillNumberDto airWaybillNumberDto) {
		this.airWaybillNumberDto = airWaybillNumberDto;
	}
	
	public Date getDocumentIssueDate() {
		return documentIssueDate;
	}

	public void setDocumentIssueDate(Date documentIssueDate) {
		this.documentIssueDate = documentIssueDate;
	}

	public String getHostFlightNumber() {
		return hostFlightNumber;
	}

	public void setHostFlightNumber(String hostFlightNumber) {
		this.hostFlightNumber = hostFlightNumber;
	}

	public Date getHostFlightDate() {
		return hostFlightDate;
	}

	public void setHostFlightDate(Date hostFlightDate) {
		this.hostFlightDate = hostFlightDate;
	}
	
	public String getAirwaybillNumber() {
		return airwaybillNumber;
	}

	public void setAirwaybillNumber(String airwaybillNumber) {
		this.airwaybillNumber = airwaybillNumber;
	}

	public BigDecimal getHostFlownRevenue() {
		return hostFlownRevenue;
	}

	public void setHostFlownRevenue(BigDecimal hostFlownRevenue) {
		this.hostFlownRevenue = hostFlownRevenue;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	
	public InterlineReportDto getInterlineReportDto() {
		return interlineReportDto;
	}

	public void setInterlineReportDto(InterlineReportDto interlineReportDto) {
		this.interlineReportDto = interlineReportDto;
	}

	// INWARD BILLING

	public Integer getNetAmountInBillingCurrency() {
		return netAmountInBillingCurrency;
	}

	public void setNetAmountInBillingCurrency(Integer netAmountInBillingCurrency) {
		this.netAmountInBillingCurrency = netAmountInBillingCurrency;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public AccountingInvoiceAWBDto getAccountingInvoiceAWBDto() {
		return accountingInvoiceAWBDto;
	}

	public void setAccountingInvoiceAWBDto(
			AccountingInvoiceAWBDto accountingInvoiceAWBDto) {
		this.accountingInvoiceAWBDto = accountingInvoiceAWBDto;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
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
	public void setParticipantReceivableDto(ParticipantReceivableDto participantReceivableDto) {
		this.participantReceivableDto = participantReceivableDto;
	}

	public BillingSchedulesDto getBillingSchedulesDto() {
		return billingSchedulesDto;
	}

	public void setBillingSchedulesDto(BillingSchedulesDto billingSchedulesDto) {
		this.billingSchedulesDto = billingSchedulesDto;
	}

	public ClearingHouseType getClearancePeriodType() {
		return clearancePeriodType;
	}

	public void setClearancePeriodType(ClearingHouseType clearancePeriodType) {
		this.clearancePeriodType = clearancePeriodType;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = ContractUtility.convertToUpperCase(carrierCode);
	}

	public AccountingInvoiceBillingScheduleDto getAccbillingSchedulesDto() {
		return accbillingSchedulesDto;
	}

	public void setAccbillingSchedulesDto(
			AccountingInvoiceBillingScheduleDto accbillingSchedulesDto) {
		this.accbillingSchedulesDto = accbillingSchedulesDto;
	}

	public BigDecimal getWeightCharges() {
		return weightCharges;
	}

	public void setWeightCharges(BigDecimal weightCharges) {
		this.weightCharges = weightCharges;
	}

	public BigDecimal getValuationCharges() {
		return valuationCharges;
	}

	public void setValuationCharges(BigDecimal valuationCharges) {
		this.valuationCharges = valuationCharges;
	}

	public CarrierPayableDto getCarrierPayableDto() {
		return carrierPayableDto;
	}

	public void setCarrierPayableDto(CarrierPayableDto carrierPayableDto) {
		this.carrierPayableDto = carrierPayableDto;
	}

	public ParticipantPayableDto getParticipantPayableDto() {
		return participantPayableDto;
	}

	public void setParticipantPayableDto(ParticipantPayableDto participantPayableDto) {
		this.participantPayableDto = participantPayableDto;
	}

	public ProrationType getProrationType() {
		return prorationType;
	}

	public void setProrationType(ProrationType prorationType) {
		this.prorationType = prorationType;
	}

	public BigDecimal getCcFee() {
		return ccFee;
	}

	public void setCcFee(BigDecimal ccFee) {
		this.ccFee = ccFee;
	}

	public byte[] getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(byte[] outputFile) {
		this.outputFile = outputFile;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	//Preferences
	public BigDecimal getInwardWeightChargesBilled() {
		return inwardWeightChargesBilled;
	}

	public void setInwardWeightChargesBilled(BigDecimal inwardWeightChargesBilled) {
		this.inwardWeightChargesBilled = inwardWeightChargesBilled;
	}

	public BigDecimal getInwardWeightChargesActual() {
		return inwardWeightChargesActual;
	}

	public void setInwardWeightChargesActual(BigDecimal inwardWeightChargesActual) {
		this.inwardWeightChargesActual = inwardWeightChargesActual;
	}

	public BigDecimal getInwardWeightChargesAccepted() {
		return inwardWeightChargesAccepted;
	}

	public void setInwardWeightChargesAccepted(
			BigDecimal inwardWeightChargesAccepted) {
		this.inwardWeightChargesAccepted = inwardWeightChargesAccepted;
	}

	public BigDecimal getInwardValuationChargesBilled() {
		return inwardValuationChargesBilled;
	}

	public void setInwardValuationChargesBilled(
			BigDecimal inwardValuationChargesBilled) {
		this.inwardValuationChargesBilled = inwardValuationChargesBilled;
	}

	public BigDecimal getInwardValuationChargesAccepted() {
		return inwardValuationChargesAccepted;
	}

	public void setInwardValuationChargesAccepted(
			BigDecimal inwardValuationChargesAccepted) {
		this.inwardValuationChargesAccepted = inwardValuationChargesAccepted;
	}

	public BigDecimal getInwardOtherChargesBilled() {
		return inwardOtherChargesBilled;
	}

	public void setInwardOtherChargesBilled(BigDecimal inwardOtherChargesBilled) {
		this.inwardOtherChargesBilled = inwardOtherChargesBilled;
	}

	public BigDecimal getInwardOtherChargesAccepted() {
		return inwardOtherChargesAccepted;
	}

	public void setInwardOtherChargesAccepted(BigDecimal inwardOtherChargesAccepted) {
		this.inwardOtherChargesAccepted = inwardOtherChargesAccepted;
	}

	public BigDecimal getInwardISCBilled() {
		return inwardISCBilled;
	}

	public void setInwardISCBilled(BigDecimal inwardISCBilled) {
		this.inwardISCBilled = inwardISCBilled;
	}

	public BigDecimal getInwardISCAccepted() {
		return inwardISCAccepted;
	}

	public void setInwardISCAccepted(BigDecimal inwardISCAccepted) {
		this.inwardISCAccepted = inwardISCAccepted;
	}

	public BigDecimal getInwardAmountSubjectToBilled() {
		return inwardAmountSubjectToBilled;
	}

	public void setInwardAmountSubjectToBilled(
			BigDecimal inwardAmountSubjectToBilled) {
		this.inwardAmountSubjectToBilled = inwardAmountSubjectToBilled;
	}

	public BigDecimal getInwardAmountSubjectToAmountDiff() {
		return inwardAmountSubjectToAmountDiff;
	}

	public void setInwardAmountSubjectToAmountDiff(
			BigDecimal inwardAmountSubjectToAmountDiff) {
		this.inwardAmountSubjectToAmountDiff = inwardAmountSubjectToAmountDiff;
	}

	public BigDecimal getInwardAmountSubjectToAmountAccepted() {
		return inwardAmountSubjectToAmountAccepted;
	}

	public void setInwardAmountSubjectToAmountAccepted(
			BigDecimal inwardAmountSubjectToAmountAccepted) {
		this.inwardAmountSubjectToAmountAccepted = inwardAmountSubjectToAmountAccepted;
	}

	public BigDecimal getInwardTotalNetAmount() {
		return inwardTotalNetAmount;
	}

	public void setInwardTotalNetAmount(BigDecimal inwardTotalNetAmount) {
		this.inwardTotalNetAmount = inwardTotalNetAmount;
	}

	public String getInwardRejectionMemoNumber() {
		return inwardRejectionMemoNumber;
	}

	public void setInwardRejectionMemoNumber(String inwardRejectionMemoNumber) {
		this.inwardRejectionMemoNumber = inwardRejectionMemoNumber;
	}

	public String getInwardInvoiceNumber() {
		return inwardInvoiceNumber;
	}

	public void setInwardInvoiceNumber(String inwardInvoiceNumber) {
		this.inwardInvoiceNumber = inwardInvoiceNumber;
	}

	public Date getInwardInvoiceBillingDate() {
		return inwardInvoiceBillingDate;
	}

	public void setInwardInvoiceBillingDate(Date inwardInvoiceBillingDate) {
		this.inwardInvoiceBillingDate = inwardInvoiceBillingDate;
	}

	public BigDecimal getOutwardWeightChargesBilled() {
		return outwardWeightChargesBilled;
	}

	public void setOutwardWeightChargesBilled(BigDecimal outwardWeightChargesBilled) {
		this.outwardWeightChargesBilled = outwardWeightChargesBilled;
	}

	public BigDecimal getOutwardWeightChargesAccepted() {
		return outwardWeightChargesAccepted;
	}

	public void setOutwardWeightChargesAccepted(
			BigDecimal outwardWeightChargesAccepted) {
		this.outwardWeightChargesAccepted = outwardWeightChargesAccepted;
	}

	public BigDecimal getOutwardValuationChargesBilled() {
		return outwardValuationChargesBilled;
	}

	public void setOutwardValuationChargesBilled(
			BigDecimal outwardValuationChargesBilled) {
		this.outwardValuationChargesBilled = outwardValuationChargesBilled;
	}

	public BigDecimal getOutwardValuationChargesAccepted() {
		return outwardValuationChargesAccepted;
	}

	public void setOutwardValuationChargesAccepted(
			BigDecimal outwardValuationChargesAccepted) {
		this.outwardValuationChargesAccepted = outwardValuationChargesAccepted;
	}

	public BigDecimal getOutwardOtherChargesBilled() {
		return outwardOtherChargesBilled;
	}

	public void setOutwardOtherChargesBilled(BigDecimal outwardOtherChargesBilled) {
		this.outwardOtherChargesBilled = outwardOtherChargesBilled;
	}

	public BigDecimal getOutwardOtherChargesAccepted() {
		return outwardOtherChargesAccepted;
	}

	public void setOutwardOtherChargesAccepted(
			BigDecimal outwardOtherChargesAccepted) {
		this.outwardOtherChargesAccepted = outwardOtherChargesAccepted;
	}

	public BigDecimal getOutwardISCBilled() {
		return outwardISCBilled;
	}

	public void setOutwardISCBilled(BigDecimal outwardISCBilled) {
		this.outwardISCBilled = outwardISCBilled;
	}

	public BigDecimal getOutwardISCAccepted() {
		return outwardISCAccepted;
	}

	public void setOutwardISCAccepted(BigDecimal outwardISCAccepted) {
		this.outwardISCAccepted = outwardISCAccepted;
	}

	public BigDecimal getOutwardAmountSubjectToBilled() {
		return outwardAmountSubjectToBilled;
	}

	public void setOutwardAmountSubjectToBilled(
			BigDecimal outwardAmountSubjectToBilled) {
		this.outwardAmountSubjectToBilled = outwardAmountSubjectToBilled;
	}

	public BigDecimal getOutwardAmountSubjectToAmountDiff() {
		return outwardAmountSubjectToAmountDiff;
	}

	public void setOutwardAmountSubjectToAmountDiff(
			BigDecimal outwardAmountSubjectToAmountDiff) {
		this.outwardAmountSubjectToAmountDiff = outwardAmountSubjectToAmountDiff;
	}

	public BigDecimal getOutwardAmountSubjectToAmountAccepted() {
		return outwardAmountSubjectToAmountAccepted;
	}

	public void setOutwardAmountSubjectToAmountAccepted(
			BigDecimal outwardAmountSubjectToAmountAccepted) {
		this.outwardAmountSubjectToAmountAccepted = outwardAmountSubjectToAmountAccepted;
	}

	public BigDecimal getOutwardTotalNetAmount() {
		return outwardTotalNetAmount;
	}

	public void setOutwardTotalNetAmount(BigDecimal outwardTotalNetAmount) {
		this.outwardTotalNetAmount = outwardTotalNetAmount;
	}

	public String getOutwardRejectionMemoNumber() {
		return outwardRejectionMemoNumber;
	}

	public void setOutwardRejectionMemoNumber(String outwardRejectionMemoNumber) {
		this.outwardRejectionMemoNumber = outwardRejectionMemoNumber;
	}

	public String getOutwardInvoiceNumber() {
		return outwardInvoiceNumber;
	}

	public void setOutwardInvoiceNumber(String outwardInvoiceNumber) {
		this.outwardInvoiceNumber = outwardInvoiceNumber;
	}

	public Date getOutwardInvoiceBillingDate() {
		return outwardInvoiceBillingDate;
	}

	public void setOutwardInvoiceBillingDate(Date outwardInvoiceBillingDate) {
		this.outwardInvoiceBillingDate = outwardInvoiceBillingDate;
	}	
	

	public String getSpecificAirline() {
		return this.specificAirline;
	}

	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(final String specificAirline) {
		this.specificAirline = specificAirline;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	public String getInwardRejectionStage() {
		return inwardRejectionStage;
	}

	public void setInwardRejectionStage(String inwardRejectionStage) {
		this.inwardRejectionStage = inwardRejectionStage;
	}

	public String getOutwardRejectionStage() {
		return outwardRejectionStage;
	}

	public void setOutwardRejectionStage(String outwardRejectionStage) {
		this.outwardRejectionStage = outwardRejectionStage;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public List<String> getCgstCharges() {
		return cgstCharges;
	}

	public void setCgstCharges(List<String> cgstCharges) {
		this.cgstCharges = cgstCharges;
	}

	public List<String> getSgstCharges() {
		return sgstCharges;
	}

	public void setSgstCharges(List<String> sgstCharges) {
		this.sgstCharges = sgstCharges;
	}

	public List<String> getIgstCharges() {
		return igstCharges;
	}

	public void setIgstCharges(List<String> igstCharges) {
		this.igstCharges = igstCharges;
	}

	public BigDecimal getCommercialSurcharge() {
		return commercialSurcharge;
	}

	public void setCommercialSurcharge(BigDecimal commercialSurcharge) {
		this.commercialSurcharge = commercialSurcharge;
	}

	public List<String> getCommercialSurcharges() {
		return commercialSurcharges;
	}

	public void setCommercialSurcharges(List<String> commercialSurcharges) {
		this.commercialSurcharges = commercialSurcharges;
	}
		
	
}
