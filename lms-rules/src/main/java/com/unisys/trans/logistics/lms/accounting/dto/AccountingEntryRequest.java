package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingRuleIndicators;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ClearingHouseType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ExportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProvisionalFlownRevenue;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.jaxb.AccrualAirwaybillType;

public class AccountingEntryRequest extends AbstractRequest {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String triggerPoint;
	private AccountingRuleIndicators ruleIndicator;
	private List airWaybillRevenueDto;
	private ParticipantInvoiceSummaryDto invoiceSummaryDto;
	private Set invoiceAWBDto;
	private InterlineParticipantInvoiceAWBDto bmcmAwbDto;
	


	public InterlineParticipantInvoiceAWBDto getBmcmAwbDto() {
		return bmcmAwbDto;
	}

	public void setBmcmAwbDto(InterlineParticipantInvoiceAWBDto bmcmAwbDto) {
		this.bmcmAwbDto = bmcmAwbDto;
	}

	private Set participantInvoiceDCMDto;
	private AccountingEntryDto accountingEntryDto;
	private AccountingEntryErrorDto accountingResolveEntryErrorDto = new AccountingEntryErrorDto();
	private String airWaybillNumber;
	private String flightNumber;
	private String invoiceNumber;
	private Date invoiceDate;
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	private String dcmReferenceNumber;
	private String rejectionMemoNumber;
	private AirWaybillNumberDto airWaybillNumberDto = new AirWaybillNumberDto();
	private AirWaybillRevenueDto revenueDto;
	private AirWaybillRevenueWrapperDto airWaybillRevenueWrapperDto;
	private String flownRevenue;
	private AccountingPeriodDto periodDto;
	private List<AccountingPeriodDto> accountingPeriodDtos;
	private String acnNumber;
    private String hostACNNumber;
	private Set<AccountingInvoiceAWBDto> rejectionmMemos;
	private Set<AccountingInvoiceAWBDto> memoDtos;
	private ParticipantPayableDto participantPayableDto = new ParticipantPayableDto();
	private List<PaymentPeriodDto> paymentPeriodDtos;
	private String provisionalIndicator;
	private PaymentDetailsDto paymentDetailsDto;
	private List<AccountingBalanceReportDetailsDto> reportDetailsDtos;
	private List<AccountingEntryDto> accountingEntries;
	private boolean AirWaybillOnlyFlag = false;
	private List<AccountingAirWaybillDto> accountingAirWaybillDtos;
	private List<AccrualAirwaybillType> lmsAirwaybillDtos;
	private List accountingEntryDtos;
	private AccountingAirWaybillDto accAirWayBillDto;
	private String hostCarrierCode;
	private Long accAwbOid;
	private InterlineBillingQueueDto interlineBillingQueueDto;
	private ParticipantReceivableDto participantReceivableDto = new ParticipantReceivableDto();
	private List<AccountingAWBChargesDto> accAWBChargesDto= new ArrayList<AccountingAWBChargesDto>();
	private String status;
	private int pageNumber;
	private String flagToIdentifyStationCash;
	private Long partRecOid;
	
	private ClearingHouseType clearingHouseType;
	
	private boolean checkMsg = false;
	
	private String awbCurrency;
	
	private Boolean commissionCalcuatedOn;
	
	private BigDecimal creditHostExchangeDifference;
	
	private BigDecimal debitHostExchangeDifference;
	
	private BigDecimal creditSourceExchangeDifference;
	
	private BigDecimal debitSourceExchangeDifference;
	
	private boolean isPaycodeChangeFromCCToPP = false;
	
	public boolean isPaycodeChangeFromCCToPP() {
		return isPaycodeChangeFromCCToPP;
	}

	public void setPaycodeChangeFromCCToPP(boolean isPaycodeChangeFromCCToPP) {
		this.isPaycodeChangeFromCCToPP = isPaycodeChangeFromCCToPP;
	}

	public boolean isPaycodeChangeFromPPToCC() {
		return isPaycodeChangeFromPPToCC;
	}

	public void setPaycodeChangeFromPPToCC(boolean isPaycodeChangeFromPPToCC) {
		this.isPaycodeChangeFromPPToCC = isPaycodeChangeFromPPToCC;
	}

	private boolean isPaycodeChangeFromPPToCC = false;
	

	public Boolean getCommissionCalcuatedOn() {
		return commissionCalcuatedOn;
	}

	public void setCommissionCalcuatedOn(Boolean commissionCalcuatedOn) {
		this.commissionCalcuatedOn = commissionCalcuatedOn;
	}

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

	public String getAwbCurrency() {
        return awbCurrency;
    }
	public BigDecimal getCommissionAmount() {
		return commissionAmount;
	}

    public void setAwbCurrency(String awbCurrency) {
        this.awbCurrency = awbCurrency;
    }
	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public String getRevenueIndicatorType() {
		return revenueIndicatorType;
	}

	public void setRevenueIndicatorType(String revenueIndicatorType) {
		this.revenueIndicatorType = revenueIndicatorType;
	}

	private BigDecimal iscAmount;
	
	private String provision;
	
	
	public String getProvision() {
		return provision;
	}

	public void setProvision(String provision) {
		this.provision = provision;
	}

	public BigDecimal getIscAmount() {
		return iscAmount;
	}

	public void setIscAmount(BigDecimal iscAmount) {
		this.iscAmount = iscAmount;
	}

	private BigDecimal commissionAmount;
	
	private String revenueIndicatorType;
	
    public boolean isCheckMsg() {
		return checkMsg;
	}

	public void setCheckMsg(boolean checkMsg) {
		this.checkMsg = checkMsg;
	}

	public Long getPartRecOid() {
		return partRecOid;
	}

	public void setPartRecOid(Long partRecOid) {
		this.partRecOid = partRecOid;
	}

	public String getFlagToIdentifyStationCash() {
		return flagToIdentifyStationCash;
	}

	public void setFlagToIdentifyStationCash(String flagToIdentifyStationCash) {
		this.flagToIdentifyStationCash = flagToIdentifyStationCash;
	}

	public String getHostCarrierCode() {
		return hostCarrierCode;
	}

	public void setHostCarrierCode(String hostCarrierCode) {
		this.hostCarrierCode = hostCarrierCode;
	}

	public List<AccrualAirwaybillType> getLmsAirwaybillDtos() {
		return lmsAirwaybillDtos;
	}

	public void setLmsAirwaybillDtos(List<AccrualAirwaybillType> lmsAirwaybillDtos) {
		this.lmsAirwaybillDtos = lmsAirwaybillDtos;
	}

	public AccountingAirWaybillDto getAccAirWayBillDto() {
		return accAirWayBillDto;
	}

	public void setAccAirWayBillDto(AccountingAirWaybillDto accAirWayBillDto) {
		this.accAirWayBillDto = accAirWayBillDto;
	}
	
	public List<AccountingAirWaybillDto> getAccountingAirWaybillDtos() {
		return accountingAirWaybillDtos;
	}


	public void setAccountingAirWaybillDtos(
			List<AccountingAirWaybillDto> accountingAirWaybillDtos) {
		this.accountingAirWaybillDtos = accountingAirWaybillDtos;
	}


	public PaymentDetailsDto getPaymentDetailsDto() {
		return paymentDetailsDto;
	}


	public void setPaymentDetailsDto(PaymentDetailsDto paymentDetailsDto) {
		this.paymentDetailsDto = paymentDetailsDto;
	}

	public List<AccountingBalanceReportDetailsDto> getReportDetailsDtos() {
		return reportDetailsDtos;
	}


	public void setReportDetailsDtos(List<AccountingBalanceReportDetailsDto> reportDetailsDtos) {
		this.reportDetailsDtos = reportDetailsDtos;
	}


	public List getAccountingEntryDtos() {
		return accountingEntryDtos;
	}


	public void setAccountingEntryDtos(List accountingEntryDtos) {
		this.accountingEntryDtos = accountingEntryDtos;
	}
	public List<AccountingEntryDto> getAccountingEntries() {
		return accountingEntries;
	}


	public void setAccountingEntries(List<AccountingEntryDto> accountingEntries) {
		this.accountingEntries = accountingEntries;
	}

	private Date accountingDate;
	
	private ExportPaymentType exportCode;
	private String specificAirline;
	
	public String getProvisionalIndicator() {
		return provisionalIndicator;
	}


	public void setProvisionalIndicator(String provisionalIndicator) {
		this.provisionalIndicator = provisionalIndicator;
	}
	
	public Date getAccountingDate() {
		return accountingDate;
	}


	public void setAccountingDate(Date accountingDate) {
		this.accountingDate = accountingDate;
	}


	public List<PaymentPeriodDto> getPaymentPeriodDtos() {
		return paymentPeriodDtos;
	}


	public void setPaymentPeriodDtos(List<PaymentPeriodDto> paymentPeriodDtos) {
		this.paymentPeriodDtos = paymentPeriodDtos;
	}


	public String getHostACNNumber() {
		return hostACNNumber;
	}


	public void setHostACNNumber(String hostACNNumber) {
		this.hostACNNumber = hostACNNumber;
	}


	public String getAcnNumber() {
		return acnNumber;
	}


	public void setAcnNumber(String acnNumber) {
		this.acnNumber = acnNumber;
	}


	public AccountingPeriodDto getPeriodDto() {
		return periodDto;
	}

	
	public void setPeriodDto(AccountingPeriodDto periodDto) {
		this.periodDto = periodDto;
	}
	
	

	public List<AccountingPeriodDto> getAccountingPeriodDtos() {
		return accountingPeriodDtos;
	}

	public void setAccountingPeriodDtos(
			List<AccountingPeriodDto> accountingPeriodDtos) {
		this.accountingPeriodDtos = accountingPeriodDtos;
	}

	public Set<AccountingInvoiceAWBDto> getRejectionmMemos() {
		return rejectionmMemos;
	}

	public void setRejectionmMemos(Set<AccountingInvoiceAWBDto> rejectionmMemos) {
		this.rejectionmMemos = rejectionmMemos;
	}

	public String getFlownRevenue() {
		return flownRevenue;
	}

	public void setFlownRevenue(String flownRevenue) {
		this.flownRevenue = flownRevenue;
	}

	public ExportPaymentType getExportCode() {
		return exportCode;
	}

	public void setExportCode(ExportPaymentType exportCode) {
		this.exportCode = exportCode;
	}

	public AirWaybillRevenueWrapperDto getAirWaybillRevenueWrapperDto() {
		return airWaybillRevenueWrapperDto;
	}

	public void setAirWaybillRevenueWrapperDto(
			AirWaybillRevenueWrapperDto airWaybillRevenueWrapperDto) {
		this.airWaybillRevenueWrapperDto = airWaybillRevenueWrapperDto;
	}

	/**
	 * @return the airWaybillNumberDto
	 */
	public AirWaybillNumberDto getAirWaybillNumberDto() {
		return airWaybillNumberDto;
	}

	/**
	 * @param airWaybillNumberDto the airWaybillNumberDto to set
	 */
	public void setAirWaybillNumberDto(AirWaybillNumberDto airWaybillNumberDto) {
		this.airWaybillNumberDto = airWaybillNumberDto;
	}

	/**
	 * @return the revenueDto
	 */
	public AirWaybillRevenueDto getRevenueDto() {
		return revenueDto;
	}

	/**
	 * @param revenueDto the revenueDto to set
	 */
	public void setRevenueDto(AirWaybillRevenueDto revenueDto) {
		this.revenueDto = revenueDto;
	}

	/**
	 * @return the accountingEntryDto
	 */
	public AccountingEntryDto getAccountingEntryDto() {
		return accountingEntryDto;
	}

	/**
	 * @param accountingEntryDto
	 *            the accountingEntryDto to set
	 */
	public void setAccountingEntryDto(AccountingEntryDto accountingEntryDto) {
		this.accountingEntryDto = accountingEntryDto;
	}


	/**
	 * @return the triggerPoint
	 */
	public String getTriggerPoint() {
		return triggerPoint;
	}

	/**
	 * @param triggerPoint the triggerPoint to set
	 */
	public void setTriggerPoint(String triggerPoint) {
		this.triggerPoint = triggerPoint;
	}

	/**
	 * @return the ruleIndicator
	 */
	public AccountingRuleIndicators getRuleIndicator() {
		return ruleIndicator;
	}

	/**
	 * @param ruleIndicator
	 *            the ruleIndicator to set
	 */
	public void setRuleIndicator(AccountingRuleIndicators ruleIndicator) {
		this.ruleIndicator = ruleIndicator;
	}

	/**
	 * @return the airWaybillRevenueDto
	 */
	public List getAirWaybillRevenueDto() {
		return airWaybillRevenueDto;
	}

	/**
	 * @param airWaybillRevenueDto
	 *            the airWaybillRevenueDto to set
	 */
	public void setAirWaybillRevenueDto(List airWaybillRevenueDto) {
		this.airWaybillRevenueDto = airWaybillRevenueDto;
	}

	/**
	 * @return the invoiceSummaryDto
	 */
	public ParticipantInvoiceSummaryDto getInvoiceSummaryDto() {
		if(invoiceSummaryDto == null){
			invoiceSummaryDto= new ParticipantInvoiceSummaryDto();
		}
		return invoiceSummaryDto;
	}

	/**
	 * @param invoiceSummaryDto
	 *            the invoiceSummaryDto to set
	 */
	public void setInvoiceSummaryDto(
			ParticipantInvoiceSummaryDto invoiceSummaryDto) {
		this.invoiceSummaryDto = invoiceSummaryDto;
	}

	/**
	 * @return the invoiceAWBDto
	 */
	public Set getInvoiceAWBDto() {
		return invoiceAWBDto;
	}

	/**
	 * @param invoiceAWBDto
	 *            the invoiceAWBDto to set
	 */
	public void setInvoiceAWBDto(Set invoiceAWBDto) {
		this.invoiceAWBDto = invoiceAWBDto;
	}

	/**
	 * @return the participantInvoiceDCMDto
	 */
	public Set getParticipantInvoiceDCMDto() {
		return participantInvoiceDCMDto;
	}

	/**
	 * @param participantInvoiceDCMDto
	 *            the participantInvoiceDCMDto to set
	 */
	public void setParticipantInvoiceDCMDto(Set participantInvoiceDCMDto) {
		this.participantInvoiceDCMDto = participantInvoiceDCMDto;
	}

	/**
	 * @return the airWaybillNumber
	 */
	public String getAirWaybillNumber() {
		if(airWaybillNumberDto != null){
			if(airWaybillNumberDto.getAirlineCodeNbr()!=null && airWaybillNumberDto.getShipmentReference()!=null){
				airWaybillNumber = airWaybillNumberDto.getAirlineCodeNbr()+"-"+airWaybillNumberDto.getShipmentReference();
			}
			//LMSC-8253
			if(airWaybillNumberDto.getModOverrideIndicator()!=null) {
				airWaybillNumber = airWaybillNumber+airWaybillNumberDto.getModOverrideIndicator();
			}
		}
		return airWaybillNumber;
	}

	/**
	 * @param airWaybillNumber
	 *            the airWaybillNumber to set
	 */
	public void setAirWaybillNumber(String airWaybillNumber) {
		this.airWaybillNumber = airWaybillNumber;
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

	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * @param invoiceNumber
	 *            the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	/**
	 * @return the dcmReferenceNumber
	 */
	public String getDcmReferenceNumber() {
		return dcmReferenceNumber;
	}

	/**
	 * @param dcmReferenceNumber
	 *            the dcmReferenceNumber to set
	 */
	public void setDcmReferenceNumber(String dcmReferenceNumber) {
		this.dcmReferenceNumber = dcmReferenceNumber;
	}

	/**
	 * @return the rejectionMemoNumber
	 */
	public String getRejectionMemoNumber() {
		return rejectionMemoNumber;
	}

	/**
	 * @param rejectionMemoNumber
	 *            the rejectionMemoNumber to set
	 */
	public void setRejectionMemoNumber(String rejectionMemoNumber) {
		this.rejectionMemoNumber = rejectionMemoNumber;
	}

	/**
	 * @return the accountingResolveEntryErrorDto
	 */
	public AccountingEntryErrorDto getAccountingResolveEntryErrorDto() {
		return accountingResolveEntryErrorDto;
	}

	/**
	 * @param accountingResolveEntryErrorDto
	 *            the accountingResolveEntryErrorDto to set
	 */
	public void setAccountingResolveEntryErrorDto(
			AccountingEntryErrorDto accountingResolveEntryErrorDto) {
		this.accountingResolveEntryErrorDto = accountingResolveEntryErrorDto;
	}


	/**
	 * @return the participantPayableDto
	 */
	public ParticipantPayableDto getParticipantPayableDto() {
		return participantPayableDto;
	}


	/**
	 * @param participantPayableDto the participantPayableDto to set
	 */
	public void setParticipantPayableDto(ParticipantPayableDto participantPayableDto) {
		this.participantPayableDto = participantPayableDto;
	}
	
	/**
	 * @return the participantPayableDto
	 */
	public ParticipantReceivableDto getParticipantReceivableDto() {
		return participantReceivableDto;
	}


	/**
	 * @param participantPayableDto the participantPayableDto to set
	 */
	public void setParticipantReceivableDto(ParticipantReceivableDto participantReceivableDto) {
		this.participantReceivableDto = participantReceivableDto;
	}

	public boolean isAirWaybillOnlyFlag() {
		return AirWaybillOnlyFlag;
	}

	public void setAirWaybillOnlyFlag(boolean airWaybillOnlyFlag) {
		AirWaybillOnlyFlag = airWaybillOnlyFlag;
	}

	public Long getAccAwbOid() {
		return accAwbOid;
	}

	public void setAccAwbOid(Long accAwbOid) {
		this.accAwbOid = accAwbOid;
	}

	public InterlineBillingQueueDto getInterlineBillingQueueDto() {
		return interlineBillingQueueDto;
	}

	public void setInterlineBillingQueueDto(
			InterlineBillingQueueDto interlineBillingQueueDto) {
		this.interlineBillingQueueDto = interlineBillingQueueDto;
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

	public List<AccountingAWBChargesDto> getAccAWBChargesDto() {
		return accAWBChargesDto;
	}

	public void setAccAWBChargesDto(List<AccountingAWBChargesDto> accAWBChargesDto) {
		this.accAWBChargesDto = accAWBChargesDto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Set<AccountingInvoiceAWBDto> getMemoDtos() {
		return memoDtos;
	}

	public void setMemoDtos(Set<AccountingInvoiceAWBDto> memoDtos) {
		this.memoDtos = memoDtos;
	}

	public ClearingHouseType getClearingHouseType() {
		return clearingHouseType;
	}

	public void setClearingHouseType(ClearingHouseType clearingHouseType) {
		this.clearingHouseType = clearingHouseType;
	}

	public BigDecimal getCreditHostExchangeDifference() {
		if(creditHostExchangeDifference==null) {
			creditHostExchangeDifference = BigDecimal.ZERO;
		}
		return creditHostExchangeDifference;
	}

	public void setCreditHostExchangeDifference(BigDecimal creditHostExchangeDifference) {
		this.creditHostExchangeDifference = creditHostExchangeDifference;
	}

	public BigDecimal getDebitHostExchangeDifference() {
		if(debitHostExchangeDifference==null) {
			debitHostExchangeDifference = BigDecimal.ZERO;
		}
		return debitHostExchangeDifference;
	}

	public void setDebitHostExchangeDifference(BigDecimal debitHostExchangeDifference) {
		this.debitHostExchangeDifference = debitHostExchangeDifference;
	}

	public BigDecimal getCreditSourceExchangeDifference() {
		if(creditSourceExchangeDifference==null) {
			creditSourceExchangeDifference = BigDecimal.ZERO;
		}
		return creditSourceExchangeDifference;
	}

	public void setCreditSourceExchangeDifference(BigDecimal creditSourceExchangeDifference) {
		this.creditSourceExchangeDifference = creditSourceExchangeDifference;
	}

	public BigDecimal getDebitSourceExchangeDifference() {
		if(debitSourceExchangeDifference==null) {
			debitSourceExchangeDifference = BigDecimal.ZERO;
		}
		return debitSourceExchangeDifference;
	}

	public void setDebitSourceExchangeDifference(BigDecimal debitSourceExchangeDifference) {
	
		this.debitSourceExchangeDifference = debitSourceExchangeDifference;
	}
	
}