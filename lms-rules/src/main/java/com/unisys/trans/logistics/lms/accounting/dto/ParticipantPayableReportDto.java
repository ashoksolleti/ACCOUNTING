package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.*;
import com.unisys.trans.logistics.lms.framework.constants.AccountRegionType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceFrequencyType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceMediaType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceSequenceType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.ExchangeRateType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

public class ParticipantPayableReportDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private static final String EMPTY_STRING = "";
    private ParticipantRoleType participantPayableType;
    private ParticipantReportTypes participantReportTypes;
    private String participantType;
    private String participantName;
    private Date flownStartDate;
    private Date flownEndDate;
    private BigDecimal monthlyMGRTarget;
    private BigDecimal yearlyMGRTarget;
    private String optionSelected;
    private Date aWBStartdate;
    private Date aWBEndDate;
    private String station;
    private String dateType;
    private Date aWBExecutionDate;
    private String aWBExecutionFormattedDate;
    private Boolean activeIndicator;
    private PaymentStatusType status;
    private String statusString;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String phone;
    private String email;
    private String accountType;
    private String origin;
    private String destination;
    private BigDecimal paymentAmount;
    private Date paymentDueDate;
    private String gHAAgreementName;
    private String gSAAgreementName;
    private String aWBOrigin;
    private String aWBDestination;
    private String flightLegOrigin;
    private String flightLegDestination;
    private String aircraftType;
    private String gHAAgreementID;
    private String gSAAgreementID;
    private String airlineCodeNbr;
    private String shipmentRefNbr;
    private String accountingStatus;
    private BigDecimal tds;
    private BigDecimal commission;

    // AirwayBill Participant
    private String agentName;
    private String agentAddress;
    private String agentPhone;
    private String agentEmail;
    private String agentFax;
    private String agentStation;
    private String agentRemarks;
    private String agentCity;
    private String agentCountry;
    private String agentPostCode;
    private String agentState;
    private String bankName;
    private String bankAddress;
    private String bankPhone;
    private String bankEmail;
    private String bankFax;
    private String bankStation;
    private String bankRemarks;
    private String billToConsigneeName;
    private String billToConsigneeAddress;
    private String billToConsigneePhone;
    private String billToConsigneeEmail;
    private String billToConsigneeFax;
    private String billToConsigneeRemarks;
    private String billToConsigneeStation;
    private String billToShipperName;
    private String billToShipperAddress;
    private String billToShipperPhone;
    private String billToShipperEmail;
    private String billToShipperFax;
    private String billToShipperStation;
    private String billToShipperRemarks;
    private String brokerName;
    private String brokerAddress;
    private String brokerPhone;
    private String brokerEmail;
    private String brokerFax;
    private String brokerRemarks;
    private String consigneeName;
    private String consigneeAddress;
    private String consigneePhone;
    private String consigneeEmail;
    private String consigneeFax;
    private String consigneeStation;
    private String consigneeRemarks;
    private String consigneeAccountNumber;
    private String customsLocationName;
    private String customsLocationAddress;
    private String customsLocationPhone;
    private String customsLocationEmail;
    private String customsLocationFax;
    private String customsLocationRemarks;
    private String deliveryOperatorName;
    private String deliveryOperatorAddress;
    private String deliveryOperatorPhone;
    private String deliveryOperatorEmail;
    private String deliveryOperatorFax;
    private String deliveryOperatorRemarks;
    private String deliveryOperatorStation;

    private String forwarderName;
    private String forwarderAddress;
    private String forwarderPhone;
    private String forwarderEmail;
    private String forwarderFax;
    private String forwarderStation;
    private String forwarderRemarks;

    // IATA Account Number -- Mapping Needed
    private String manufacturerName;
    private String manufacturerAddress;
    private String manufacturerPhone;
    private String manufacturerEmail;
    private String manufacturerFax;
    private String manufacturerStation;
    private String manufacturerRemarks;

    private String notifyName;
    private String notifyAddress;
    private String notifyPhone;
    private String notifyEmail;
    private String notifyFax;
    private String notifyStation;
    private String notifyRemarks;

    private String pickupLocationName;
    private String pickupLocationAddress;
    private String pickupLocationPhone;
    private String pickupLocationEmail;
    private String pickupLocationFax;
    private String pickupLocationStation;
    private String pickupLocationRemarks;

    private String pickupOperatorName;
    private String pickupOperatorAddress;
    private String pickupOperatorPhone;
    private String pickupOperatorEmail;
    private String pickupOperatorFax;
    private String pickupOperatorStation;
    private String pickupOperatorRemarks;

    private String shipperAccountNumber;
    private String shipperName;
    private String shipperAddress;
    private String shipperPhone;
    private String shipperEmail;
    private String shipperFax;
    private String shipperStation;
    private String shipperState;
    private String shipperPostalcode;
    private String shipperCountry;
    private String shipperCity;

    private String surfaceDestinationName;
    private String surfaceDestinationAddress;
    private String surfaceDestinationPhone;
    private String surfaceDestinationEmail;
    private String surfaceDestinationFax;
    private String surfaceDestinationStation;
    private String surfaceDestinationRemarks;

    private String surfaceOriginName;
    private String surfaceOriginAddress;
    private String surfaceOriginPhone;
    private String surfaceOriginEmail;
    private String surfaceOriginFax;
    private String surfaceOriginStation;
    private String surfaceOriginRemarks;

    // Accounting Participant
    private String billToAccountNumber;
    private String billingAccountNumber1;// All to be included from Parts Participants
    private String billingAccountNumber2;
    private String billingAccountType1;
    private String billingAccountType2;
    private String iataAccountnumber; // To be obtained from Accounting Participant
    private AccountRegionType accountRegion;
    private String accountRegionString;
    private String areaRepresentative;
    private Date salesContactDate1;
    private String salesContactDate1Formatted;
    private Date salesContactDate2;
    private String salesContactDate2Formatted;
    private Date salesContactDate3;
    private String salesContactDate3Formatted;
    private String salesContact1;
    private String salesContact2;
    private String salesContactRemarks1;
    private String salesContactRemarks2;
    private String salesContactRemarks3;
    private String contactInformation;
    private String primaryCommodity;
    private String seasonalShipping;
    private String specialHandling;
    private String accountExecutive;
    private String cassNumber;
    // AccParticipant->AccBilling
    private String accountingPeriod;
    private String billingPaymentDiscountDays;
    private String billingPaymentDueDays;
    private BigDecimal participantCommissionPercentage;
    private String participantCurrency;
    private BigDecimal discountPercentage;
    private BigDecimal incentivePercentage;
    private InvoiceFrequencyType invoiceFrequency;
    private String invoiceFrequencyFormatted;
    private String invoiceLanguage;
    private InvoiceMediaType invoiceMedia;
    private String invoiceMediaFormatted;
    private InvoiceSequenceType invoiceSequence;
    private String invoiceSequenceFormatted;
    private String invoiceSite;
    private String invoiceEmail;
    private String mtdSales;
    private String prevMTDSales;
    private String prevYTDSales;
    private BigDecimal serviceFeePercentage;
    private String ytdSales;
    private Date agingAnalysisDate;
    private String agingAnalysisDateFormatted;
    private BigDecimal amountsUnapplied;
    private BigDecimal amountsUnbilled;
    private String collectorId;
    private BigDecimal totalOutstanding;
    private String collectionEmail;
    private Boolean collectionMedia;
    private String paymentMethod;// from Freight detail
    private String creditRate;
    private Long creditLimit;
    private BigDecimal availableCredit;
    private String creditCurrencyCode;// assemble it from credit Currency
    private int totalShipments; // Freight detail-> freight Statistics
    private int totalHouseAWB;
    private Boolean govtTaxExemptIndicator;
    private Boolean stateTaxExemptIndicator;

    // AWB starts here
    private String awbNumber;
    private String accountingRemarks;
    private String consigneeRemarks1;
    private String consigneeRemarks2;
    private boolean contractSRAAppliesIndicator;
    private String crossReference1;
    private String crossReference2;
    private String customsValue;
    private String customsStation;
    private FWBType fWBType;
    private String fWBTypeString;
    private String declaredValue;
    private String destinationCarrier;
    private String destinationCurrency;
    private String destinationStation;
    private String discrepancies;
    private Boolean eAWBIndicator;
    private BigDecimal exchangeRate;
    private Date executionDate;
    private String executionDateFormatted;
    private AuditStatusType exportAuditType;
    private String exportAuditTypeString;
    private ExportPaymentType exportPaycode;
    private String exportPaycodeString;
    private String exportReportingStation;
    private Date exportReportingDate;
    private String exportReportingDateFormatted;
    private Date importReportingDate;
    private String importReportingDateFormatted;
    private AuditStatusType importAudit;
    private String importAuditString;
    private ImportPaymentType importPaycode;
    private String importPaycodeString;
    private String importReportingStation;
    private String insuranceValue;
    private String insuranceCode;
    private InternationalAWBType internationalAWB;
    private String internationalAWBString;
    private boolean northAmericanIndicator;
    private Date notifyDate;
    private String notifyDateFormatted;
    private String originCurrency;
    private String originStation;
    private String padType;
    private String padTypeString;
    private boolean paperAWBOverrideInd;
    private Integer priority;
    private String productCode;
    private String shipperRemarks;
    private SpecialPurgeType specialPurge;
    private String specialPurgeString;
    private ShipmentStatusType shipmentStatus;
    private String shipmentStatusString;
    private Boolean taxIndicator;
    private WeightUOMType unitOfWeight;
    private String unitOfWeightString;
    private Date pricingDate;
    private String pricingDateFormatted;
    private Date creationDate;
    private String creationDateFormatted;

    // AWB->Hostrevenue
    private BigDecimal bookingEventGrossRevenue;
    private BigDecimal bookingEventHostRevenue;
    private BigDecimal bookingEventHurdleAmount;
    private BigDecimal bookingEventHurdleRate;
    private BigDecimal bookingEventTotalRate;
    private BigDecimal bookingEventCostAmount;
    private BigDecimal bookingEventCostRate;
    private BigDecimal bookingEventRevenueRate;
    private String bookingEventProduct;
    private String bookingEventHurdleRateStatus;
    private String bookingEventHurdleRateReasonCodeString;
    private HurdleRateReasonType bookingEventHurdleRateReasonCode;

    // Rating Line Entries
    private String classRatingId;
    private String commodityNumber;
    private String contractNumber;
    private boolean deleteIndicator;
    private BigDecimal grossWeight;
    private Boolean netNetIndicator;
    private BigDecimal rateCharge;
    private RateClassType rateClassType;
    private String rateClassTypeString;
    private RateGenerationType rateGenerationType;
    private String rateGenerationTypeString;
    private String rateNote;
    private String uldType;
    // Rating Ends here
    // AWB -> Total Charges
    private BigDecimal actWeightCharge;
    private BigDecimal valuationCharges;
    private BigDecimal otherCharges;
    private BigDecimal actPrepaidCharge;
    private BigDecimal actCollectCharge;
    private GenIdType codChargeGenIdType;
    private String codChargeGenIdTypeString;
    private BigDecimal codCharges;
    private String codCurrency;
    private BigDecimal codExchangeRate;
    private BigDecimal dimensionalWeight;
    private BigDecimal faceCollectCharge;
    private BigDecimal facePrepaidCharge;
    private BigDecimal faceWeightCharge;
    private BigDecimal pubCollectCharge;
    private BigDecimal pubPrepaidCharge;
    private BigDecimal pubWeightCharge;
    private BigDecimal totalCashOnDeliveryCOD;
    private BigDecimal totalChargeableWeight;
    private BigDecimal totalWeightCharges;
    private UnitType unitType;
    private String unitTypeString;
    private GenIdType valuationChargeGenIdType;
    private String valuationChargeGenIdTypeString;
    private Integer volume;
    private VolumeEvaluationMethodType volumeEvaluationMethod;
    private String volumeEvaluationMethodString;
    private WeightUOMType weightUnit;
    private String weightUnitString;
    // Total charges end here

    // AWB->Accounting status
    private boolean invoiceIndicator;
    private boolean postingIndicator;
    private String queueName;
    private String queueOffice;
    private String queueStation;
    private boolean queueStatus;
    private boolean reportIndicator;

    // AWB <- AWB Revenue
    private BigDecimal airWaybillEventGrossRevenue;
    private BigDecimal airWaybillEventHostRevenue;
    private BigDecimal airwaybillNetAmount;
    private BigDecimal airwaybillOutstandingAmount;
    private BigDecimal hostNetYield;
    private BigDecimal hostNetRevenue;
    private BigDecimal totalGrossWeight;

    // Participant Payables
    private BigDecimal billingCommissionAmount;
    private String billingCurrencyCode;
    private ExchangeRateType billingExchangeRateType;
    private String billingExchangeRateTypeString;
    private BigDecimal commissionAmount;
    private String currencyCode;
    private BigDecimal commissionPercentage;
    private CommissionType commissionType;
    private String commissionTypeString;
    private GenIdType genIDType;
    private String genIDTypeString;
    private BigDecimal hostCommissionAmount;
    private String hostCurrencyCode;
    private ExchangeRateType hostExchangeRateType;
    private String hostExchangeRateTypeString;
    private String participantAccountNumber;
    private ParticipantAgreementType participantAgreementType;
    private String participantAgreementTypeString;
    private ParticipantRoleType participantRoleType;
    private String participantRoleTypeString;

    private String ghaHandlingStation;
    private PaymentStatusType paymentStatus;
    private String paymentStatusString;
    private String agreementIdentifier;

    private String reasonText;
    private String adjustmentNoteNumber;
    private String adjustmentComment;
    private AdjustmentSourceType adjustmentSourceType;
    private String adjustmentSourceTypeString;
    private RevenueIndicatorType revenueIndicatorType;
    private String revenueIndicatorTypeString;
    private String associatedOffice;
    private String associatedStation;
    private Date createdOn;
    private String createdOnFormatted;
    private String userIdentifier;

    // GHA Agreement
    private String ghaAgreementId;
    private String ghaAgreementName;
    private String handlingStation;
    private String awbOwnerCarrierCode;
    private String ghaCurrencyCode;
    private String handlingType;
    private String airCraftType;
    private Date effectiveFromDate;
    private String effectiveFromDateFormatted;
    private Date effectiveToDate;
    private String effectiveToDateFormatted;
    private String commissionParameters;

    private String ghaProductCodeList;
    private String ghaSpecialHandlingCodeList;
    private String ghaUldTypeList;
    private String ghaCommodityNumberList;
    private boolean applyProduct;
    private boolean applyCommodity;
    private boolean applySpecialHandling;
    private boolean applyUldType;

    // GSA Agreement
    private String gsaAgreementIdentifier;
    private String gsaAgreementName;
    private String awbOrigin;
    private String awbDestination;
    private String gsaAwbOwnerCarrierCode;
    private String currency;
    private Date effectiveDate;
    private String effectiveDateFormatted;
    private Date expirationDate;
    private String expirationDateFormatted;
    private String gsaCommissionType;
    private BigDecimal totalSales;
    private BigDecimal sumOfTotalSales;
    private String extendedTerritory;
    private Date firstHostFlownDate;
    private String firstHostFlownDateFormatted;

    // NAS004
    private String specificAirline;

	//pagination
	private int pageNumber;
	private int rowSizePerPage;
	private int totalCount;
	private boolean downloadAll;

    // Getters and Setters for new fields

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentAddress() {
        return agentAddress;
    }

    public void setAgentAddress(String agentAddress) {
        this.agentAddress = agentAddress;
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
    }

    public String getAgentEmail() {
        return agentEmail;
    }

    public void setAgentEmail(String agentEmail) {
        this.agentEmail = agentEmail;
    }

    public String getAgentFax() {
        return agentFax;
    }

    public void setAgentFax(String agentFax) {
        this.agentFax = agentFax;
    }

    public String getAgentStation() {
        return agentStation;
    }

    public void setAgentStation(String agentStation) {
        this.agentStation = agentStation;
    }

    public String getAgentRemarks() {
        return agentRemarks;
    }

    public void setAgentRemarks(String agentRemarks) {
        this.agentRemarks = agentRemarks;
    }

    public String getAgentCity() {
        return agentCity;
    }

    public void setAgentCity(String agentCity) {
        this.agentCity = agentCity;
    }

    public String getAgentCountry() {
        return agentCountry;
    }

    public void setAgentCountry(String agentCountry) {
        this.agentCountry = agentCountry;
    }

    public String getAgentPostCode() {
        return agentPostCode;
    }

    public void setAgentPostCode(String agentPostCode) {
        this.agentPostCode = agentPostCode;
    }

    public String getAgentState() {
        return agentState;
    }

    public void setAgentState(String agentState) {
        this.agentState = agentState;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getBankEmail() {
        return bankEmail;
    }

    public void setBankEmail(String bankEmail) {
        this.bankEmail = bankEmail;
    }

    public String getBankFax() {
        return bankFax;
    }

    public void setBankFax(String bankFax) {
        this.bankFax = bankFax;
    }

    public String getBankStation() {
        return bankStation;
    }

    public void setBankStation(String bankStation) {
        this.bankStation = bankStation;
    }

    public String getBankRemarks() {
        return bankRemarks;
    }

    public void setBankRemarks(String bankRemarks) {
        this.bankRemarks = bankRemarks;
    }

    public String getBillToConsigneeName() {
        return billToConsigneeName;
    }

    public void setBillToConsigneeName(String billToConsigneeName) {
        this.billToConsigneeName = billToConsigneeName;
    }

    public String getBillToConsigneeAddress() {
        return billToConsigneeAddress;
    }

    public void setBillToConsigneeAddress(String billToConsigneeAddress) {
        this.billToConsigneeAddress = billToConsigneeAddress;
    }

    public String getBillToConsigneePhone() {
        return billToConsigneePhone;
    }

    public void setBillToConsigneePhone(String billToConsigneePhone) {
        this.billToConsigneePhone = billToConsigneePhone;
    }

    public String getBillToConsigneeEmail() {
        return billToConsigneeEmail;
    }

    public void setBillToConsigneeEmail(String billToConsigneeEmail) {
        this.billToConsigneeEmail = billToConsigneeEmail;
    }

    public String getBillToConsigneeFax() {
        return billToConsigneeFax;
    }

    public void setBillToConsigneeFax(String billToConsigneeFax) {
        this.billToConsigneeFax = billToConsigneeFax;
    }

    public String getBillToConsigneeRemarks() {
        return billToConsigneeRemarks;
    }

    public void setBillToConsigneeRemarks(String billToConsigneeRemarks) {
        this.billToConsigneeRemarks = billToConsigneeRemarks;
    }

    public String getBillToConsigneeStation() {
        return billToConsigneeStation;
    }

    public void setBillToConsigneeStation(String billToConsigneeStation) {
        this.billToConsigneeStation = billToConsigneeStation;
    }

    public String getBillToShipperName() {
        return billToShipperName;
    }

    public void setBillToShipperName(String billToShipperName) {
        this.billToShipperName = billToShipperName;
    }

    public String getBillToShipperAddress() {
        return billToShipperAddress;
    }

    public void setBillToShipperAddress(String billToShipperAddress) {
        this.billToShipperAddress = billToShipperAddress;
    }

    public String getBillToShipperPhone() {
        return billToShipperPhone;
    }

    public void setBillToShipperPhone(String billToShipperPhone) {
        this.billToShipperPhone = billToShipperPhone;
    }

    public String getBillToShipperEmail() {
        return billToShipperEmail;
    }

    public void setBillToShipperEmail(String billToShipperEmail) {
        this.billToShipperEmail = billToShipperEmail;
    }

    public String getBillToShipperFax() {
        return billToShipperFax;
    }

    public void setBillToShipperFax(String billToShipperFax) {
        this.billToShipperFax = billToShipperFax;
    }

    public String getBillToShipperStation() {
        return billToShipperStation;
    }

    public void setBillToShipperStation(String billToShipperStation) {
        this.billToShipperStation = billToShipperStation;
    }

    public String getBillToShipperRemarks() {
        return billToShipperRemarks;
    }

    public void setBillToShipperRemarks(String billToShipperRemarks) {
        this.billToShipperRemarks = billToShipperRemarks;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public String getBrokerAddress() {
        return brokerAddress;
    }

    public void setBrokerAddress(String brokerAddress) {
        this.brokerAddress = brokerAddress;
    }

    public String getBrokerPhone() {
        return brokerPhone;
    }

    public void setBrokerPhone(String brokerPhone) {
        this.brokerPhone = brokerPhone;
    }

    public String getBrokerEmail() {
        return brokerEmail;
    }

    public void setBrokerEmail(String brokerEmail) {
        this.brokerEmail = brokerEmail;
    }

    public String getBrokerFax() {
        return brokerFax;
    }

    public void setBrokerFax(String brokerFax) {
        this.brokerFax = brokerFax;
    }

    public String getBrokerRemarks() {
        return brokerRemarks;
    }

    public void setBrokerRemarks(String brokerRemarks) {
        this.brokerRemarks = brokerRemarks;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public String getConsigneeEmail() {
        return consigneeEmail;
    }

    public void setConsigneeEmail(String consigneeEmail) {
        this.consigneeEmail = consigneeEmail;
    }

    public String getConsigneeFax() {
        return consigneeFax;
    }

    public void setConsigneeFax(String consigneeFax) {
        this.consigneeFax = consigneeFax;
    }

    public String getConsigneeStation() {
        return consigneeStation;
    }

    public void setConsigneeStation(String consigneeStation) {
        this.consigneeStation = consigneeStation;
    }

    public String getConsigneeRemarks() {
        return consigneeRemarks;
    }

    public void setConsigneeRemarks(String consigneeRemarks) {
        this.consigneeRemarks = consigneeRemarks;
    }

    public String getConsigneeAccountNumber() {
        return consigneeAccountNumber;
    }

    public void setConsigneeAccountNumber(String consigneeAccountNumber) {
        this.consigneeAccountNumber = consigneeAccountNumber;
    }

    public String getCustomsLocationName() {
        return customsLocationName;
    }

    public void setCustomsLocationName(String customsLocationName) {
        this.customsLocationName = customsLocationName;
    }

    public String getCustomsLocationAddress() {
        return customsLocationAddress;
    }

    public void setCustomsLocationAddress(String customsLocationAddress) {
        this.customsLocationAddress = customsLocationAddress;
    }

    public String getCustomsLocationPhone() {
        return customsLocationPhone;
    }

    public void setCustomsLocationPhone(String customsLocationPhone) {
        this.customsLocationPhone = customsLocationPhone;
    }

    public String getCustomsLocationEmail() {
        return customsLocationEmail;
    }

    public void setCustomsLocationEmail(String customsLocationEmail) {
        this.customsLocationEmail = customsLocationEmail;
    }

    public String getCustomsLocationFax() {
        return customsLocationFax;
    }

    public void setCustomsLocationFax(String customsLocationFax) {
        this.customsLocationFax = customsLocationFax;
    }

    public String getCustomsLocationRemarks() {
        return customsLocationRemarks;
    }

    public void setCustomsLocationRemarks(String customsLocationRemarks) {
        this.customsLocationRemarks = customsLocationRemarks;
    }

    public String getDeliveryOperatorName() {
        return deliveryOperatorName;
    }

    public void setDeliveryOperatorName(String deliveryOperatorName) {
        this.deliveryOperatorName = deliveryOperatorName;
    }

    public String getDeliveryOperatorAddress() {
        return deliveryOperatorAddress;
    }

    public void setDeliveryOperatorAddress(String deliveryOperatorAddress) {
        this.deliveryOperatorAddress = deliveryOperatorAddress;
    }

    public String getDeliveryOperatorPhone() {
        return deliveryOperatorPhone;
    }

    public void setDeliveryOperatorPhone(String deliveryOperatorPhone) {
        this.deliveryOperatorPhone = deliveryOperatorPhone;
    }

    public String getDeliveryOperatorEmail() {
        return deliveryOperatorEmail;
    }

    public void setDeliveryOperatorEmail(String deliveryOperatorEmail) {
        this.deliveryOperatorEmail = deliveryOperatorEmail;
    }

    public String getDeliveryOperatorFax() {
        return deliveryOperatorFax;
    }

    public void setDeliveryOperatorFax(String deliveryOperatorFax) {
        this.deliveryOperatorFax = deliveryOperatorFax;
    }

    public String getDeliveryOperatorRemarks() {
        return deliveryOperatorRemarks;
    }

    public void setDeliveryOperatorRemarks(String deliveryOperatorRemarks) {
        this.deliveryOperatorRemarks = deliveryOperatorRemarks;
    }

    public String getDeliveryOperatorStation() {
        return deliveryOperatorStation;
    }

    public void setDeliveryOperatorStation(String deliveryOperatorStation) {
        this.deliveryOperatorStation = deliveryOperatorStation;
    }

    public String getForwarderName() {
        return forwarderName;
    }

    public void setForwarderName(String forwarderName) {
        this.forwarderName = forwarderName;
    }

    public String getForwarderAddress() {
        return forwarderAddress;
    }

    public void setForwarderAddress(String forwarderAddress) {
        this.forwarderAddress = forwarderAddress;
    }

    public String getForwarderPhone() {
        return forwarderPhone;
    }

    public void setForwarderPhone(String forwarderPhone) {
        this.forwarderPhone = forwarderPhone;
    }

    public String getForwarderEmail() {
        return forwarderEmail;
    }

    public void setForwarderEmail(String forwarderEmail) {
        this.forwarderEmail = forwarderEmail;
    }

    public String getForwarderFax() {
        return forwarderFax;
    }

    public void setForwarderFax(String forwarderFax) {
        this.forwarderFax = forwarderFax;
    }

    public String getForwarderStation() {
        return forwarderStation;
    }

    public void setForwarderStation(String forwarderStation) {
        this.forwarderStation = forwarderStation;
    }

    public String getForwarderRemarks() {
        return forwarderRemarks;
    }

    public void setForwarderRemarks(String forwarderRemarks) {
        this.forwarderRemarks = forwarderRemarks;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerAddress() {
        return manufacturerAddress;
    }

    public void setManufacturerAddress(String manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }

    public String getManufacturerPhone() {
        return manufacturerPhone;
    }

    public void setManufacturerPhone(String manufacturerPhone) {
        this.manufacturerPhone = manufacturerPhone;
    }

    public String getManufacturerEmail() {
        return manufacturerEmail;
    }

    public void setManufacturerEmail(String manufacturerEmail) {
        this.manufacturerEmail = manufacturerEmail;
    }

    public String getManufacturerFax() {
        return manufacturerFax;
    }

    public void setManufacturerFax(String manufacturerFax) {
        this.manufacturerFax = manufacturerFax;
    }

    public String getManufacturerStation() {
        return manufacturerStation;
    }

    public void setManufacturerStation(String manufacturerStation) {
        this.manufacturerStation = manufacturerStation;
    }

    public String getManufacturerRemarks() {
        return manufacturerRemarks;
    }

    public void setManufacturerRemarks(String manufacturerRemarks) {
        this.manufacturerRemarks = manufacturerRemarks;
    }

    public String getNotifyName() {
        return notifyName;
    }

    public void setNotifyName(String notifyName) {
        this.notifyName = notifyName;
    }

    public String getNotifyAddress() {
        return notifyAddress;
    }

    public void setNotifyAddress(String notifyAddress) {
        this.notifyAddress = notifyAddress;
    }

    public String getNotifyPhone() {
        return notifyPhone;
    }

    public void setNotifyPhone(String notifyPhone) {
        this.notifyPhone = notifyPhone;
    }

    public String getNotifyEmail() {
        return notifyEmail;
    }

    public void setNotifyEmail(String notifyEmail) {
        this.notifyEmail = notifyEmail;
    }

    public String getNotifyFax() {
        return notifyFax;
    }

    public void setNotifyFax(String notifyFax) {
        this.notifyFax = notifyFax;
    }

    public String getNotifyStation() {
        return notifyStation;
    }

    public void setNotifyStation(String notifyStation) {
        this.notifyStation = notifyStation;
    }

    public String getNotifyRemarks() {
        return notifyRemarks;
    }

    public void setNotifyRemarks(String notifyRemarks) {
        this.notifyRemarks = notifyRemarks;
    }

    public String getPickupLocationName() {
        return pickupLocationName;
    }

    public void setPickupLocationName(String pickupLocationName) {
        this.pickupLocationName = pickupLocationName;
    }

    public String getPickupLocationAddress() {
        return pickupLocationAddress;
    }

    public void setPickupLocationAddress(String pickupLocationAddress) {
        this.pickupLocationAddress = pickupLocationAddress;
    }

    public String getPickupLocationPhone() {
        return pickupLocationPhone;
    }

    public void setPickupLocationPhone(String pickupLocationPhone) {
        this.pickupLocationPhone = pickupLocationPhone;
    }

    public String getPickupLocationEmail() {
        return pickupLocationEmail;
    }

    public void setPickupLocationEmail(String pickupLocationEmail) {
        this.pickupLocationEmail = pickupLocationEmail;
    }

    public String getPickupLocationFax() {
        return pickupLocationFax;
    }

    public void setPickupLocationFax(String pickupLocationFax) {
        this.pickupLocationFax = pickupLocationFax;
    }

    public String getPickupLocationStation() {
        return pickupLocationStation;
    }

    public void setPickupLocationStation(String pickupLocationStation) {
        this.pickupLocationStation = pickupLocationStation;
    }

    public String getPickupLocationRemarks() {
        return pickupLocationRemarks;
    }

    public void setPickupLocationRemarks(String pickupLocationRemarks) {
        this.pickupLocationRemarks = pickupLocationRemarks;
    }

    public String getPickupOperatorName() {
        return pickupOperatorName;
    }

    public void setPickupOperatorName(String pickupOperatorName) {
        this.pickupOperatorName = pickupOperatorName;
    }

    public String getPickupOperatorAddress() {
        return pickupOperatorAddress;
    }

    public void setPickupOperatorAddress(String pickupOperatorAddress) {
        this.pickupOperatorAddress = pickupOperatorAddress;
    }

    public String getPickupOperatorPhone() {
        return pickupOperatorPhone;
    }

    public void setPickupOperatorPhone(String pickupOperatorPhone) {
        this.pickupOperatorPhone = pickupOperatorPhone;
    }

    public String getPickupOperatorEmail() {
        return pickupOperatorEmail;
    }

    public void setPickupOperatorEmail(String pickupOperatorEmail) {
        this.pickupOperatorEmail = pickupOperatorEmail;
    }

    public String getPickupOperatorFax() {
        return pickupOperatorFax;
    }

    public void setPickupOperatorFax(String pickupOperatorFax) {
        this.pickupOperatorFax = pickupOperatorFax;
    }

    public String getPickupOperatorStation() {
        return pickupOperatorStation;
    }

    public void setPickupOperatorStation(String pickupOperatorStation) {
        this.pickupOperatorStation = pickupOperatorStation;
    }

    public String getPickupOperatorRemarks() {
        return pickupOperatorRemarks;
    }

    public void setPickupOperatorRemarks(String pickupOperatorRemarks) {
        this.pickupOperatorRemarks = pickupOperatorRemarks;
    }

    public String getShipperAccountNumber() {
        return shipperAccountNumber;
    }

    public void setShipperAccountNumber(String shipperAccountNumber) {
        this.shipperAccountNumber = shipperAccountNumber;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public String getShipperAddress() {
        return shipperAddress;
    }

    public void setShipperAddress(String shipperAddress) {
        this.shipperAddress = shipperAddress;
    }

    public String getShipperPhone() {
        return shipperPhone;
    }

    public void setShipperPhone(String shipperPhone) {
        this.shipperPhone = shipperPhone;
    }

    public String getShipperEmail() {
        return shipperEmail;
    }

    public void setShipperEmail(String shipperEmail) {
        this.shipperEmail = shipperEmail;
    }

    public String getShipperFax() {
        return shipperFax;
    }

    public void setShipperFax(String shipperFax) {
        this.shipperFax = shipperFax;
    }

    public String getShipperStation() {
        return shipperStation;
    }

    public void setShipperStation(String shipperStation) {
        this.shipperStation = shipperStation;
    }

    public String getShipperState() {
        return shipperState;
    }

    public void setShipperState(String shipperState) {
        this.shipperState = shipperState;
    }

    public String getShipperPostalcode() {
        return shipperPostalcode;
    }

    public void setShipperPostalcode(String shipperPostalcode) {
        this.shipperPostalcode = shipperPostalcode;
    }

    public String getShipperCountry() {
        return shipperCountry;
    }

    public void setShipperCountry(String shipperCountry) {
        this.shipperCountry = shipperCountry;
    }

    public String getShipperCity() {
        return shipperCity;
    }

    public void setShipperCity(String shipperCity) {
        this.shipperCity = shipperCity;
    }

    public String getSurfaceDestinationName() {
        return surfaceDestinationName;
    }

    public void setSurfaceDestinationName(String surfaceDestinationName) {
        this.surfaceDestinationName = surfaceDestinationName;
    }

    public String getSurfaceDestinationAddress() {
        return surfaceDestinationAddress;
    }

    public void setSurfaceDestinationAddress(String surfaceDestinationAddress) {
        this.surfaceDestinationAddress = surfaceDestinationAddress;
    }

    public String getSurfaceDestinationPhone() {
        return surfaceDestinationPhone;
    }

    public void setSurfaceDestinationPhone(String surfaceDestinationPhone) {
        this.surfaceDestinationPhone = surfaceDestinationPhone;
    }

    public String getSurfaceDestinationEmail() {
        return surfaceDestinationEmail;
    }

    public void setSurfaceDestinationEmail(String surfaceDestinationEmail) {
        this.surfaceDestinationEmail = surfaceDestinationEmail;
    }

    public String getSurfaceDestinationFax() {
        return surfaceDestinationFax;
    }

    public void setSurfaceDestinationFax(String surfaceDestinationFax) {
        this.surfaceDestinationFax = surfaceDestinationFax;
    }

    public String getSurfaceDestinationStation() {
        return surfaceDestinationStation;
    }

    public void setSurfaceDestinationStation(String surfaceDestinationStation) {
        this.surfaceDestinationStation = surfaceDestinationStation;
    }

    public String getSurfaceDestinationRemarks() {
        return surfaceDestinationRemarks;
    }

    public void setSurfaceDestinationRemarks(String surfaceDestinationRemarks) {
        this.surfaceDestinationRemarks = surfaceDestinationRemarks;
    }

    public String getSurfaceOriginName() {
        return surfaceOriginName;
    }

    public void setSurfaceOriginName(String surfaceOriginName) {
        this.surfaceOriginName = surfaceOriginName;
    }

    public String getSurfaceOriginAddress() {
        return surfaceOriginAddress;
    }

    public void setSurfaceOriginAddress(String surfaceOriginAddress) {
        this.surfaceOriginAddress = surfaceOriginAddress;
    }

    public String getSurfaceOriginPhone() {
        return surfaceOriginPhone;
    }

    public void setSurfaceOriginPhone(String surfaceOriginPhone) {
        this.surfaceOriginPhone = surfaceOriginPhone;
    }

    public String getSurfaceOriginEmail() {
        return surfaceOriginEmail;
    }

    public void setSurfaceOriginEmail(String surfaceOriginEmail) {
        this.surfaceOriginEmail = surfaceOriginEmail;
    }

    public String getSurfaceOriginFax() {
        return surfaceOriginFax;
    }

    public void setSurfaceOriginFax(String surfaceOriginFax) {
        this.surfaceOriginFax = surfaceOriginFax;
    }

    public String getSurfaceOriginStation() {
        return surfaceOriginStation;
    }

    public void setSurfaceOriginStation(String surfaceOriginStation) {
        this.surfaceOriginStation = surfaceOriginStation;
    }

    public String getSurfaceOriginRemarks() {
        return surfaceOriginRemarks;
    }

    public void setSurfaceOriginRemarks(String surfaceOriginRemarks) {
        this.surfaceOriginRemarks = surfaceOriginRemarks;
    }

    public String getBillToAccountNumber() {
        return billToAccountNumber;
    }

    public void setBillToAccountNumber(String billToAccountNumber) {
        this.billToAccountNumber = billToAccountNumber;
    }

    public String getBillingAccountNumber1() {
        return billingAccountNumber1;
    }

    public void setBillingAccountNumber1(String billingAccountNumber1) {
        this.billingAccountNumber1 = billingAccountNumber1;
    }

    public String getBillingAccountNumber2() {
        return billingAccountNumber2;
    }

    public void setBillingAccountNumber2(String billingAccountNumber2) {
        this.billingAccountNumber2 = billingAccountNumber2;
    }

    public String getBillingAccountType1() {
        return billingAccountType1;
    }

    public void setBillingAccountType1(String billingAccountType1) {
        this.billingAccountType1 = billingAccountType1;
    }

    public String getBillingAccountType2() {
        return billingAccountType2;
    }

    public void setBillingAccountType2(String billingAccountType2) {
        this.billingAccountType2 = billingAccountType2;
    }

    public String getIataAccountnumber() {
        return iataAccountnumber;
    }

    public void setIataAccountnumber(String iataAccountnumber) {
        this.iataAccountnumber = iataAccountnumber;
    }

    public AccountRegionType getAccountRegion() {
        return accountRegion;
    }

    public void setAccountRegion(AccountRegionType accountRegion) {
        this.accountRegion = accountRegion;
    }

    public String getAccountRegionString() {
        if (this.getAccountRegion() != null) {
            accountRegionString = this.getAccountRegion().getVal();
        }
        return accountRegionString;
    }

    public void setAccountRegionString(String accountRegionString) {
        this.accountRegionString = accountRegionString;
    }

    public String getAreaRepresentative() {
        return areaRepresentative;
    }

    public void setAreaRepresentative(String areaRepresentative) {
        this.areaRepresentative = areaRepresentative;
    }

    public Date getSalesContactDate1() {
        return salesContactDate1;
    }

    public void setSalesContactDate1(Date salesContactDate1) {
        this.salesContactDate1 = salesContactDate1;
    }

    public String getSalesContactDate1Formatted() {
        String value = "";
        if (this.getSalesContactDate1() != null) {
            value = DateUtility.convertToGMTDate(this.getSalesContactDate1(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            salesContactDate1Formatted = value.toUpperCase();
        }
        return salesContactDate1Formatted;
    }

    public void setSalesContactDate1Formatted(String salesContactDate1Formatted) {
        this.salesContactDate1Formatted = salesContactDate1Formatted;
    }

    public Date getSalesContactDate2() {
        return salesContactDate2;
    }

    public void setSalesContactDate2(Date salesContactDate2) {
        this.salesContactDate2 = salesContactDate2;
    }

    public String getSalesContactDate2Formatted() {
        String value = "";
        if (this.getSalesContactDate2() != null) {
            value = DateUtility.convertToGMTDate(this.getSalesContactDate2(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            salesContactDate2Formatted = value.toUpperCase();
        }
        return salesContactDate2Formatted;
    }

    public void setSalesContactDate2Formatted(String salesContactDate2Formatted) {
        this.salesContactDate2Formatted = salesContactDate2Formatted;
    }

    public Date getSalesContactDate3() {
        return salesContactDate3;
    }

    public void setSalesContactDate3(Date salesContactDate3) {
        this.salesContactDate3 = salesContactDate3;
    }

    public String getSalesContactDate3Formatted() {
        String value = "";
        if (this.getSalesContactDate3() != null) {
            value = DateUtility.convertToGMTDate(this.getSalesContactDate3(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            salesContactDate3Formatted = value.toUpperCase();
        }
        return salesContactDate3Formatted;
    }

    public void setSalesContactDate3Formatted(String salesContactDate3Formatted) {
        this.salesContactDate3Formatted = salesContactDate3Formatted;
    }

    public String getSalesContact1() {
        return salesContact1;
    }

    public void setSalesContact1(String salesContact1) {
        this.salesContact1 = salesContact1;
    }

    public String getSalesContact2() {
        return salesContact2;
    }

    public void setSalesContact2(String salesContact2) {
        this.salesContact2 = salesContact2;
    }

    public String getSalesContactRemarks1() {
        return salesContactRemarks1;
    }

    public void setSalesContactRemarks1(String salesContactRemarks1) {
        this.salesContactRemarks1 = salesContactRemarks1;
    }

    public String getSalesContactRemarks2() {
        return salesContactRemarks2;
    }

    public void setSalesContactRemarks2(String salesContactRemarks2) {
        this.salesContactRemarks2 = salesContactRemarks2;
    }

    public String getSalesContactRemarks3() {
        return salesContactRemarks3;
    }

    public void setSalesContactRemarks3(String salesContactRemarks3) {
        this.salesContactRemarks3 = salesContactRemarks3;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getPrimaryCommodity() {
        return primaryCommodity;
    }

    public void setPrimaryCommodity(String primaryCommodity) {
        this.primaryCommodity = primaryCommodity;
    }

    public String getSeasonalShipping() {
        return seasonalShipping;
    }

    public void setSeasonalShipping(String seasonalShipping) {
        this.seasonalShipping = seasonalShipping;
    }

    public String getSpecialHandling() {
        return specialHandling;
    }

    public void setSpecialHandling(String specialHandling) {
        this.specialHandling = specialHandling;
    }

    public String getAccountExecutive() {
        return accountExecutive;
    }

    public void setAccountExecutive(String accountExecutive) {
        this.accountExecutive = accountExecutive;
    }

    public String getCassNumber() {
        return cassNumber;
    }

    public void setCassNumber(String cassNumber) {
        this.cassNumber = cassNumber;
    }

    public String getAccountingPeriod() {
        return accountingPeriod;
    }

    public void setAccountingPeriod(String accountingPeriod) {
        this.accountingPeriod = accountingPeriod;
    }

    public String getBillingPaymentDiscountDays() {
        return billingPaymentDiscountDays;
    }

    public void setBillingPaymentDiscountDays(String billingPaymentDiscountDays) {
        this.billingPaymentDiscountDays = billingPaymentDiscountDays;
    }

    public String getBillingPaymentDueDays() {
        return billingPaymentDueDays;
    }

    public void setBillingPaymentDueDays(String billingPaymentDueDays) {
        this.billingPaymentDueDays = billingPaymentDueDays;
    }

    public BigDecimal getParticipantCommissionPercentage() {
        return participantCommissionPercentage;
    }

    public void setParticipantCommissionPercentage(
            BigDecimal participantCommissionPercentage) {
        this.participantCommissionPercentage = participantCommissionPercentage;
    }

    public String getParticipantCurrency() {
        return participantCurrency;
    }

    public void setParticipantCurrency(String participantCurrency) {
        this.participantCurrency = participantCurrency;
    }

    public BigDecimal getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(BigDecimal discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public BigDecimal getIncentivePercentage() {
        return incentivePercentage;
    }

    public void setIncentivePercentage(BigDecimal incentivePercentage) {
        this.incentivePercentage = incentivePercentage;
    }

    public InvoiceFrequencyType getInvoiceFrequency() {
        return invoiceFrequency;
    }

    public void setInvoiceFrequency(InvoiceFrequencyType invoiceFrequency) {
        this.invoiceFrequency = invoiceFrequency;
    }

    public String getInvoiceFrequencyFormatted() {
        if (this.getInvoiceFrequency() != null) {
            invoiceFrequencyFormatted = this.getInvoiceFrequency().getName();
        }
        return invoiceFrequencyFormatted;
    }

    public void setInvoiceFrequencyFormatted(String invoiceFrequencyFormatted) {
        this.invoiceFrequencyFormatted = invoiceFrequencyFormatted;
    }

    public String getInvoiceLanguage() {
        return invoiceLanguage;
    }

    public void setInvoiceLanguage(String invoiceLanguage) {
        this.invoiceLanguage = invoiceLanguage;
    }

    public InvoiceMediaType getInvoiceMedia() {
        return invoiceMedia;
    }

    public void setInvoiceMedia(InvoiceMediaType invoiceMedia) {
        this.invoiceMedia = invoiceMedia;
    }

    public String getInvoiceMediaFormatted() {
        if (this.getInvoiceMedia() != null) {
            invoiceMediaFormatted = this.getInvoiceMedia().getLabel();
        }
        return invoiceMediaFormatted;
    }

    public void setInvoiceMediaFormatted(String invoiceMediaFormatted) {
        this.invoiceMediaFormatted = invoiceMediaFormatted;
    }

    public InvoiceSequenceType getInvoiceSequence() {
        return invoiceSequence;
    }

    public void setInvoiceSequence(InvoiceSequenceType invoiceSequence) {
        this.invoiceSequence = invoiceSequence;
    }

    public String getInvoiceSequenceFormatted() {
        if (this.getInvoiceSequence() != null) {
            invoiceSequenceFormatted = this.getInvoiceSequence().getStringValue();
        }
        return invoiceSequenceFormatted;
    }

    public void setInvoiceSequenceFormatted(String invoiceSequenceFormatted) {
        this.invoiceSequenceFormatted = invoiceSequenceFormatted;
    }

    public String getInvoiceSite() {
        return invoiceSite;
    }

    public void setInvoiceSite(String invoiceSite) {
        this.invoiceSite = invoiceSite;
    }

    public String getInvoiceEmail() {
        return invoiceEmail;
    }

    public void setInvoiceEmail(String invoiceEmail) {
        this.invoiceEmail = invoiceEmail;
    }

    public String getMtdSales() {
        return mtdSales;
    }

    public void setMtdSales(String mtdSales) {
        this.mtdSales = mtdSales;
    }

    public String getPrevMTDSales() {
        return prevMTDSales;
    }

    public void setPrevMTDSales(String prevMTDSales) {
        this.prevMTDSales = prevMTDSales;
    }

    public String getPrevYTDSales() {
        return prevYTDSales;
    }

    public void setPrevYTDSales(String prevYTDSales) {
        this.prevYTDSales = prevYTDSales;
    }

    public BigDecimal getServiceFeePercentage() {
        return serviceFeePercentage;
    }

    public void setServiceFeePercentage(BigDecimal serviceFeePercentage) {
        this.serviceFeePercentage = serviceFeePercentage;
    }

    public String getYtdSales() {
        return ytdSales;
    }

    public void setYtdSales(String ytdSales) {
        this.ytdSales = ytdSales;
    }

    public Date getAgingAnalysisDate() {
        return agingAnalysisDate;
    }

    public void setAgingAnalysisDate(Date agingAnalysisDate) {
        this.agingAnalysisDate = agingAnalysisDate;
    }

    public String getAgingAnalysisDateFormatted() {
        String value = "";
        if (this.getAgingAnalysisDate() != null) {
            value = DateUtility.convertToGMTDate(this.getAgingAnalysisDate(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            agingAnalysisDateFormatted = value.toUpperCase();
        }
        return agingAnalysisDateFormatted;
    }

    public void setAgingAnalysisDateFormatted(String agingAnalysisDateFormatted) {
        this.agingAnalysisDateFormatted = agingAnalysisDateFormatted;
    }

    public BigDecimal getAmountsUnapplied() {
        return amountsUnapplied;
    }

    public void setAmountsUnapplied(BigDecimal amountsUnapplied) {
        this.amountsUnapplied = amountsUnapplied;
    }

    public BigDecimal getAmountsUnbilled() {
        return amountsUnbilled;
    }

    public void setAmountsUnbilled(BigDecimal amountsUnbilled) {
        this.amountsUnbilled = amountsUnbilled;
    }

    public String getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(String collectorId) {
        this.collectorId = collectorId;
    }

    public BigDecimal getTotalOutstanding() {
        return totalOutstanding;
    }

    public void setTotalOutstanding(BigDecimal totalOutstanding) {
        this.totalOutstanding = totalOutstanding;
    }

    public String getCollectionEmail() {
        return collectionEmail;
    }

    public void setCollectionEmail(String collectionEmail) {
        this.collectionEmail = collectionEmail;
    }

    public Boolean getCollectionMedia() {
        return collectionMedia;
    }

    public void setCollectionMedia(Boolean collectionMedia) {
        this.collectionMedia = collectionMedia;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCreditRate() {
        return creditRate;
    }

    public void setCreditRate(String creditRate) {
        this.creditRate = creditRate;
    }

    public Long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Long creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getAvailableCredit() {
        return availableCredit;
    }

    public void setAvailableCredit(BigDecimal availableCredit) {
        this.availableCredit = availableCredit;
    }

    public String getCreditCurrencyCode() {
        return creditCurrencyCode;
    }

    public void setCreditCurrencyCode(String creditCurrencyCode) {
        this.creditCurrencyCode = creditCurrencyCode;
    }

    public int getTotalShipments() {
        return totalShipments;
    }

    public void setTotalShipments(int totalShipments) {
        this.totalShipments = totalShipments;
    }

    public int getTotalHouseAWB() {
        return totalHouseAWB;
    }

    public void setTotalHouseAWB(int totalHouseAWB) {
        this.totalHouseAWB = totalHouseAWB;
    }

    public Boolean getGovtTaxExemptIndicator() {
        return govtTaxExemptIndicator;
    }

    public void setGovtTaxExemptIndicator(Boolean govtTaxExemptIndicator) {
        this.govtTaxExemptIndicator = govtTaxExemptIndicator;
    }

    public Boolean getStateTaxExemptIndicator() {
        return stateTaxExemptIndicator;
    }

    public void setStateTaxExemptIndicator(Boolean stateTaxExemptIndicator) {
        this.stateTaxExemptIndicator = stateTaxExemptIndicator;
    }

    public BigDecimal getBillingCommissionAmount() {
        return billingCommissionAmount;
    }

    public void setBillingCommissionAmount(BigDecimal billingCommissionAmount) {
        this.billingCommissionAmount = billingCommissionAmount;
    }

    public String getBillingCurrencyCode() {
        return billingCurrencyCode;
    }

    public void setBillingCurrencyCode(String billingCurrencyCode) {
        this.billingCurrencyCode = billingCurrencyCode;
    }

    public ExchangeRateType getBillingExchangeRateType() {
        return billingExchangeRateType;
    }

    public void setBillingExchangeRateType(ExchangeRateType billingExchangeRateType) {
        this.billingExchangeRateType = billingExchangeRateType;
    }

    public String getBillingExchangeRateTypeString() {
        if (this.getBillingExchangeRateType() != null) {
            billingExchangeRateTypeString = String.valueOf((this.getBillingExchangeRateType().getValue()));
        }
        return billingExchangeRateTypeString;
    }

    public void setBillingExchangeRateTypeString(
            String billingExchangeRateTypeString) {
        this.billingExchangeRateTypeString = billingExchangeRateTypeString;
    }

    public String getCommissionTypeString() {
        if (this.getCommissionType() != null) {
            commissionTypeString = this.getCommissionType().getCommissionType();
        }
        return commissionTypeString;
    }

    public void setCommissionTypeString(String commissionTypeString) {
        this.commissionTypeString = commissionTypeString;
    }

    public GenIdType getGenIDType() {
        return genIDType;
    }

    public void setGenIDType(GenIdType genIDType) {
        this.genIDType = genIDType;
    }

    public String getGenIDTypeString() {
        if (this.getGenIDType() != null) {
            genIDTypeString = this.getGenIDType().getStatus();
        }
        return genIDTypeString;
    }

    public void setGenIDTypeString(String genIDTypeString) {
        this.genIDTypeString = genIDTypeString;
    }

    public BigDecimal getHostCommissionAmount() {
        return hostCommissionAmount;
    }

    public void setHostCommissionAmount(BigDecimal hostCommissionAmount) {
        this.hostCommissionAmount = hostCommissionAmount;
    }

    public String getHostCurrencyCode() {
        return hostCurrencyCode;
    }

    public void setHostCurrencyCode(String hostCurrencyCode) {
        this.hostCurrencyCode = hostCurrencyCode;
    }

    public ExchangeRateType getHostExchangeRateType() {
        return hostExchangeRateType;
    }

    public void setHostExchangeRateType(ExchangeRateType hostExchangeRateType) {
        this.hostExchangeRateType = hostExchangeRateType;
    }

    public String getHostExchangeRateTypeString() {
        if (this.getHostExchangeRateType() != null) {
            hostExchangeRateTypeString = String.valueOf(this.getHostExchangeRateType().getValue());
        }
        return hostExchangeRateTypeString;
    }

    public void setHostExchangeRateTypeString(String hostExchangeRateTypeString) {
        this.hostExchangeRateTypeString = hostExchangeRateTypeString;
    }

    public ParticipantAgreementType getParticipantAgreementType() {
        return participantAgreementType;
    }

    public void setParticipantAgreementType(
            ParticipantAgreementType participantAgreementType) {
        this.participantAgreementType = participantAgreementType;
    }

    public String getParticipantAgreementTypeString() {
        if (this.getParticipantAgreementType() != null) {
            participantAgreementTypeString = this.getParticipantAgreementType().agreementName();
        }
        return participantAgreementTypeString;
    }

    public void setParticipantAgreementTypeString(
            String participantAgreementTypeString) {
        this.participantAgreementTypeString = participantAgreementTypeString;
    }

    public ParticipantRoleType getParticipantRoleType() {
        return participantRoleType;
    }

    public void setParticipantRoleType(ParticipantRoleType participantRoleType) {
        this.participantRoleType = participantRoleType;
    }

    public String getParticipantRoleTypeString() {
        if (this.getParticipantRoleType() != null) {
            participantRoleTypeString = this.getParticipantRoleType().getParticipantRoleName();
        }
        return participantRoleTypeString;
    }

    public void setParticipantRoleTypeString(String participantRoleTypeString) {
        this.participantRoleTypeString = participantRoleTypeString;
    }

    public String getGhaHandlingStation() {
        return ghaHandlingStation;
    }

    public void setGhaHandlingStation(String ghaHandlingStation) {
        this.ghaHandlingStation = ghaHandlingStation;
    }

    public PaymentStatusType getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatusType paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentStatusString() {
        if (this.getPaymentStatus() != null) {
            paymentStatusString = this.getPaymentStatus().getVal();
        }
        return paymentStatusString;
    }

    public void setPaymentStatusString(String paymentStatusString) {
        this.paymentStatusString = paymentStatusString;
    }

    public String getGhaAgreementId() {
        return ghaAgreementId;
    }

    public void setGhaAgreementId(String ghaAgreementId) {
        this.ghaAgreementId = ghaAgreementId;
    }

    public String getGhaAgreementName() {
        return ghaAgreementName;
    }

    public void setGhaAgreementName(String ghaAgreementName) {
        this.ghaAgreementName = ghaAgreementName;
    }

    public String getAwbOwnerCarrierCode() {
        return awbOwnerCarrierCode;
    }

    public void setAwbOwnerCarrierCode(String awbOwnerCarrierCode) {
        this.awbOwnerCarrierCode = awbOwnerCarrierCode;
    }

    public String getGhaCurrencyCode() {
        return ghaCurrencyCode;
    }

    public void setGhaCurrencyCode(String ghaCurrencyCode) {
        this.ghaCurrencyCode = ghaCurrencyCode;
    }

    public String getHandlingType() {
        return handlingType;
    }

    public void setHandlingType(String handlingType) {
        this.handlingType = handlingType;
    }

    public String getAirCraftType() {
        return airCraftType;
    }

    public void setAirCraftType(String airCraftType) {
        this.airCraftType = airCraftType;
    }

    public Date getEffectiveFromDate() {
        return effectiveFromDate;
    }

    public void setEffectiveFromDate(Date effectiveFromDate) {
        this.effectiveFromDate = effectiveFromDate;
    }

    public String getEffectiveFromDateFormatted() {
        String value = "";
        if (this.getEffectiveFromDate() != null) {
            value = DateUtility.convertToGMTDate(this.getEffectiveFromDate(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            effectiveFromDateFormatted = value.toUpperCase();
        }
        return effectiveFromDateFormatted;
    }

    public void setEffectiveFromDateFormatted(String effectiveFromDateFormatted) {
        this.effectiveFromDateFormatted = effectiveFromDateFormatted;
    }

    public Date getEffectiveToDate() {
        return effectiveToDate;
    }

    public void setEffectiveToDate(Date effectiveToDate) {
        this.effectiveToDate = effectiveToDate;
    }

    public String getEffectiveToDateFormatted() {
        String value = "";
        if (this.getEffectiveToDate() != null) {
            value = DateUtility.convertToGMTDate(this.getEffectiveToDate(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            effectiveToDateFormatted = value.toUpperCase();
        }
        return effectiveToDateFormatted;
    }

    public void setEffectiveToDateFormatted(String effectiveToDateFormatted) {
        this.effectiveToDateFormatted = effectiveToDateFormatted;
    }

    public String getCommissionParameters() {
        return commissionParameters;
    }

    public void setCommissionParameters(String commissionParameters) {
        this.commissionParameters = commissionParameters;
    }

    public String getGhaProductCodeList() {
        return ghaProductCodeList;
    }

    public void setGhaProductCodeList(String ghaProductCodeList) {
        this.ghaProductCodeList = ghaProductCodeList;
    }

    public String getGhaSpecialHandlingCodeList() {
        return ghaSpecialHandlingCodeList;
    }

    public void setGhaSpecialHandlingCodeList(
            String ghaSpecialHandlingCodeList) {
        this.ghaSpecialHandlingCodeList = ghaSpecialHandlingCodeList;
    }

    public String getGhaUldTypeList() {
        return ghaUldTypeList;
    }

    public void setGhaUldTypeList(String ghaUldTypeList) {
        this.ghaUldTypeList = ghaUldTypeList;
    }

    public String getGhaCommodityNumberList() {
        return ghaCommodityNumberList;
    }

    public void setGhaCommodityNumberList(String ghaCommodityNumberList) {
        this.ghaCommodityNumberList = ghaCommodityNumberList;
    }

    public boolean isApplyProduct() {
        return applyProduct;
    }

    public void setApplyProduct(boolean applyProduct) {
        this.applyProduct = applyProduct;
    }

    public boolean isApplyCommodity() {
        return applyCommodity;
    }

    public void setApplyCommodity(boolean applyCommodity) {
        this.applyCommodity = applyCommodity;
    }

    public boolean isApplySpecialHandling() {
        return applySpecialHandling;
    }

    public void setApplySpecialHandling(boolean applySpecialHandling) {
        this.applySpecialHandling = applySpecialHandling;
    }

    public boolean isApplyUldType() {
        return applyUldType;
    }

    public void setApplyUldType(boolean applyUldType) {
        this.applyUldType = applyUldType;
    }

    public String getGsaAgreementIdentifier() {
        return gsaAgreementIdentifier;
    }

    public void setGsaAgreementIdentifier(String gsaAgreementIdentifier) {
        this.gsaAgreementIdentifier = gsaAgreementIdentifier;
    }

    public String getGsaAgreementName() {
        return gsaAgreementName;
    }

    public void setGsaAgreementName(String gsaAgreementName) {
        this.gsaAgreementName = gsaAgreementName;
    }

    public String getAwbOrigin() {
        return awbOrigin;
    }

    public void setAwbOrigin(String awbOrigin) {
        this.awbOrigin = awbOrigin;
    }

    public String getAwbDestination() {
        return awbDestination;
    }

    public void setAwbDestination(String awbDestination) {
        this.awbDestination = awbDestination;
    }

    public String getGsaAwbOwnerCarrierCode() {
        return gsaAwbOwnerCarrierCode;
    }

    public void setGsaAwbOwnerCarrierCode(String gsaAwbOwnerCarrierCode) {
        this.gsaAwbOwnerCarrierCode = gsaAwbOwnerCarrierCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getGsaCommissionType() {
        return gsaCommissionType;
    }

    public void setGsaCommissionType(String gsaCommissionType) {
        this.gsaCommissionType = gsaCommissionType;
    }

    public String getReasonText() {
        return reasonText;
    }

    public void setReasonText(String reasonText) {
        this.reasonText = reasonText;
    }

    public String getAdjustmentNoteNumber() {
        return adjustmentNoteNumber;
    }

    public void setAdjustmentNoteNumber(String adjustmentNoteNumber) {
        this.adjustmentNoteNumber = adjustmentNoteNumber;
    }

    public String getAdjustmentComment() {
        return adjustmentComment;
    }

    public void setAdjustmentComment(String adjustmentComment) {
        this.adjustmentComment = adjustmentComment;
    }

    public AdjustmentSourceType getAdjustmentSourceType() {
        return adjustmentSourceType;
    }

    public void setAdjustmentSourceType(AdjustmentSourceType adjustmentSourceType) {
        this.adjustmentSourceType = adjustmentSourceType;
    }

    public String getAdjustmentSourceTypeString() {
        if (this.getAdjustmentSourceType() != null) {
            adjustmentSourceTypeString = this.getAdjustmentSourceType().getAdjustmentSource();
        }
        return adjustmentSourceTypeString;
    }

    public void setAdjustmentSourceTypeString(String adjustmentSourceTypeString) {
        this.adjustmentSourceTypeString = adjustmentSourceTypeString;
    }

    public RevenueIndicatorType getRevenueIndicatorType() {
        return revenueIndicatorType;
    }

    public void setRevenueIndicatorType(RevenueIndicatorType revenueIndicatorType) {
        this.revenueIndicatorType = revenueIndicatorType;
    }

    public String getRevenueIndicatorTypeString() {
        if (this.getRevenueIndicatorType() != null) {
            revenueIndicatorTypeString = this.getRevenueIndicatorType().getRevenueIndicatorTypeName();
        }
        return revenueIndicatorTypeString;
    }

    public void setRevenueIndicatorTypeString(String revenueIndicatorTypeString) {
        this.revenueIndicatorTypeString = revenueIndicatorTypeString;
    }

    public String getAssociatedOffice() {
        return associatedOffice;
    }

    public void setAssociatedOffice(String associatedOffice) {
        this.associatedOffice = associatedOffice;
    }

    public String getAssociatedStation() {
        return associatedStation;
    }

    public void setAssociatedStation(String associatedStation) {
        this.associatedStation = associatedStation;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedOnFormatted() {
        String value = "";
        if (this.getCreatedOn() != null) {
            value = DateUtility.convertToGMTDate(this.getCreatedOn(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            createdOnFormatted = value.toUpperCase();
        }
        return createdOnFormatted;
    }

    public void setCreatedOnFormatted(String createdOnFormatted) {
        this.createdOnFormatted = createdOnFormatted;
    }

    public String getUserIdentifier() {
        return userIdentifier;
    }

    public void setUserIdentifier(String userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    // Getters and Setters for AWB object
    public String getParticipantType() {
        if (participantPayableType != null) {
            participantType = participantPayableType.getParticipantRoleName();
        }
        return participantType;
    }

    public String getAccountingRemarks() {
        return accountingRemarks;
    }

    public void setAccountingRemarks(String accountingRemarks) {
        this.accountingRemarks = accountingRemarks;
    }

    public String getConsigneeRemarks1() {
        return consigneeRemarks1;
    }

    public void setConsigneeRemarks1(String consigneeRemarks1) {
        this.consigneeRemarks1 = consigneeRemarks1;
    }

    public String getConsigneeRemarks2() {
        return consigneeRemarks2;
    }

    public void setConsigneeRemarks2(String consigneeRemarks2) {
        this.consigneeRemarks2 = consigneeRemarks2;
    }

    public boolean isContractSRAAppliesIndicator() {
        return contractSRAAppliesIndicator;
    }

    public void setContractSRAAppliesIndicator(boolean contractSRAAppliesIndicator) {
        this.contractSRAAppliesIndicator = contractSRAAppliesIndicator;
    }

    public String getCrossReference1() {
        return crossReference1;
    }

    public void setCrossReference1(String crossReference1) {
        this.crossReference1 = crossReference1;
    }

    public String getCrossReference2() {
        return crossReference2;
    }

    public void setCrossReference2(String crossReference2) {
        this.crossReference2 = crossReference2;
    }

    public FWBType getfWBType() {
        return fWBType;
    }

    public void setfWBType(FWBType fWBType) {
        this.fWBType = fWBType;
    }

    public String getfWBTypeString() {
        if (this.getfWBType() != null) {
            fWBTypeString = this.getfWBType().getValueFWB();
        }
        return fWBTypeString;
    }

    public void setfWBTypeString(String fWBTypeString) {
        this.fWBTypeString = fWBTypeString;
    }

    public String getDestinationCarrier() {
        return destinationCarrier;
    }

    public void setDestinationCarrier(String destinationCarrier) {
        this.destinationCarrier = destinationCarrier;
    }

    public String getDiscrepancies() {
        return discrepancies;
    }

    public void setDiscrepancies(String discrepancies) {
        this.discrepancies = discrepancies;
    }

    public Boolean geteAWBIndicator() {
        return eAWBIndicator;
    }

    public void seteAWBIndicator(Boolean eAWBIndicator) {
        this.eAWBIndicator = eAWBIndicator;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }

    public String getExecutionDateFormatted() {
        String value = "";
        if (this.getExecutionDate() != null) {
            value = DateUtility.convertToGMTDate(this.getExecutionDate(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            executionDateFormatted = value.toUpperCase();
        }
        return executionDateFormatted;
    }

    public void setExecutionDateFormatted(String executionDateFormatted) {
        this.executionDateFormatted = executionDateFormatted;
    }

    public AuditStatusType getExportAuditType() {
        return exportAuditType;
    }

    public void setExportAuditType(AuditStatusType exportAuditType) {
        this.exportAuditType = exportAuditType;
    }

    public String getExportAuditTypeString() {
        if (this.getExportAuditType() != null) {
            exportAuditTypeString = this.getExportAuditType().getAuditStatus();
        }
        return exportAuditTypeString;
    }

    public void setExportAuditTypeString(String exportAuditTypeString) {
        this.exportAuditTypeString = exportAuditTypeString;
    }

    public String getExportPaycodeString() {
        if (this.getExportPaycode() != null) {
            exportPaycodeString = this.getExportPaycode().getPayCode();
        }
        return exportPaycodeString;
    }

    public void setExportPaycodeString(String exportPaycodeString) {
        this.exportPaycodeString = exportPaycodeString;
    }

    public String getExportReportingStation() {
        return exportReportingStation;
    }

    public void setExportReportingStation(String exportReportingStation) {
        this.exportReportingStation = exportReportingStation;
    }

    public Date getExportReportingDate() {
        return exportReportingDate;
    }

    public void setExportReportingDate(Date exportReportingDate) {
        this.exportReportingDate = exportReportingDate;
    }

    public String getExportReportingDateFormatted() {
        String value = "";
        if (this.getExportReportingDate() != null) {
            value = DateUtility.convertToGMTDate(this.getExportReportingDate(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            exportReportingDateFormatted = value.toUpperCase();
        }
        return exportReportingDateFormatted;
    }

    public void setExportReportingDateFormatted(String exportReportingDateFormatted) {
        this.exportReportingDateFormatted = exportReportingDateFormatted;
    }

    public Date getImportReportingDate() {
        return importReportingDate;
    }

    public void setImportReportingDate(Date importReportingDate) {
        this.importReportingDate = importReportingDate;
    }

    public String getImportReportingDateFormatted() {
        String value = "";
        if (this.getImportReportingDate() != null) {
            value = DateUtility.convertToGMTDate(this.getImportReportingDate(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            importReportingDateFormatted = value.toUpperCase();
        }
        return importReportingDateFormatted;
    }

    public void setImportReportingDateFormatted(String importReportingDateFormatted) {
        this.importReportingDateFormatted = importReportingDateFormatted;
    }

    public AuditStatusType getImportAudit() {
        return importAudit;
    }

    public void setImportAudit(AuditStatusType importAudit) {
        this.importAudit = importAudit;
    }

    public String getImportAuditString() {
        if (this.getImportAudit() != null) {
            importAuditString = this.getImportAudit().getAuditStatus();
        }
        return importAuditString;
    }

    public void setImportAuditString(String importAuditString) {
        this.importAuditString = importAuditString;
    }

    public ImportPaymentType getImportPaycode() {
        return importPaycode;
    }

    public void setImportPaycode(ImportPaymentType importPaycode) {
        this.importPaycode = importPaycode;
    }

    public String getImportPaycodeString() {
        if (this.getImportPaycode() != null) {
            importPaycodeString = this.getImportPaycode().getPayCode();
        }
        return importPaycodeString;
    }

    public void setImportPaycodeString(String importPaycodeString) {
        this.importPaycodeString = importPaycodeString;
    }

    public String getImportReportingStation() {
        return importReportingStation;
    }

    public void setImportReportingStation(String importReportingStation) {
        this.importReportingStation = importReportingStation;
    }

    public InternationalAWBType getInternationalAWB() {
        return internationalAWB;
    }

    public void setInternationalAWB(InternationalAWBType internationalAWB) {
        this.internationalAWB = internationalAWB;
    }

    public String getInternationalAWBString() {
        if (this.getInternationalAWB() != null) {
            internationalAWBString = this.getInternationalAWB().getShipment();
        }
        return internationalAWBString;
    }

    public void setInternationalAWBString(String internationalAWBString) {
        this.internationalAWBString = internationalAWBString;
    }

    public boolean isNorthAmericanIndicator() {
        return northAmericanIndicator;
    }

    public void setNorthAmericanIndicator(boolean northAmericanIndicator) {
        this.northAmericanIndicator = northAmericanIndicator;
    }

    public Date getNotifyDate() {
        return notifyDate;
    }

    public void setNotifyDate(Date notifyDate) {
        this.notifyDate = notifyDate;
    }

    public String getNotifyDateFormatted() {
        String value = "";
        if (this.getNotifyDate() != null) {
            value = DateUtility.convertToGMTDate(this.getNotifyDate(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            notifyDateFormatted = value.toUpperCase();
        }
        return notifyDateFormatted;
    }

    public void setNotifyDateFormatted(String notifyDateFormatted) {
        this.notifyDateFormatted = notifyDateFormatted;
    }

    public String getPadType() {
        return padType;
    }

    public void setPadType(String padType) {
        this.padType = padType;
    }

    public String getPadTypeString() {
        return padType;
    }

    public void setPadTypeString(String padTypeString) {
        this.padTypeString = padTypeString;
    }

    public boolean isPaperAWBOverrideInd() {
        return paperAWBOverrideInd;
    }

    public void setPaperAWBOverrideInd(boolean paperAWBOverrideInd) {
        this.paperAWBOverrideInd = paperAWBOverrideInd;
    }

    public String getShipperRemarks() {
        return shipperRemarks;
    }

    public void setShipperRemarks(String shipperRemarks) {
        this.shipperRemarks = shipperRemarks;
    }

    public SpecialPurgeType getSpecialPurge() {
        return specialPurge;
    }

    public void setSpecialPurge(SpecialPurgeType specialPurge) {
        this.specialPurge = specialPurge;
    }

    public String getSpecialPurgeString() {
        if (this.getSpecialPurge() != null) {
            specialPurgeString = this.getSpecialPurge().getPurge();
        }
        return specialPurgeString;
    }

    public void setSpecialPurgeString(String specialPurgeString) {
        this.specialPurgeString = specialPurgeString;
    }

    public ShipmentStatusType getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(ShipmentStatusType shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public String getShipmentStatusString() {
        if (this.getShipmentStatus() != null) {
            shipmentStatusString = this.getShipmentStatus().getStatus();
        }
        return shipmentStatusString;
    }

    public void setShipmentStatusString(String shipmentStatusString) {
        this.shipmentStatusString = shipmentStatusString;
    }

    public Boolean getTaxIndicator() {
        return taxIndicator;
    }

    public void setTaxIndicator(Boolean taxIndicator) {
        this.taxIndicator = taxIndicator;
    }

    public String getUnitOfWeightString() {
        if (this.getUnitOfWeight() != null) {
            unitOfWeightString = this.getUnitOfWeight().getWeightUnit();
        }
        return unitOfWeightString;
    }

    public void setUnitOfWeightString(String unitOfWeightString) {
        this.unitOfWeightString = unitOfWeightString;
    }

    public String getClassRatingId() {
        return classRatingId;
    }

    public void setClassRatingId(String classRatingId) {
        this.classRatingId = classRatingId;
    }

    public String getCommodityNumber() {
        return commodityNumber;
    }

    public void setCommodityNumber(String commodityNumber) {
        this.commodityNumber = commodityNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public boolean isDeleteIndicator() {
        return deleteIndicator;
    }

    public void setDeleteIndicator(boolean deleteIndicator) {
        this.deleteIndicator = deleteIndicator;
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public Boolean getNetNetIndicator() {
        return netNetIndicator;
    }

    public void setNetNetIndicator(Boolean netNetIndicator) {
        this.netNetIndicator = netNetIndicator;
    }

    public BigDecimal getRateCharge() {
        return rateCharge;
    }

    public void setRateCharge(BigDecimal rateCharge) {
        this.rateCharge = rateCharge;
    }

    public RateClassType getRateClassType() {
        return rateClassType;
    }

    public void setRateClassType(RateClassType rateClassType) {
        this.rateClassType = rateClassType;
    }

    public String getRateClassTypeString() {
        if (this.getRateClassType() != null) {
            rateClassTypeString = this.getRateClassType().getRateClassName();
        }
        return rateClassTypeString;
    }

    public void setRateClassTypeString(String rateClassTypeString) {
        this.rateClassTypeString = rateClassTypeString;
    }

    public RateGenerationType getRateGenerationType() {
        return rateGenerationType;
    }

    public void setRateGenerationType(RateGenerationType rateGenerationType) {
        this.rateGenerationType = rateGenerationType;
    }

    public String getRateGenerationTypeString() {
        if (this.getRateGenerationType() != null) {
            rateGenerationTypeString = this.getRateGenerationType().getRateGenType();
        }
        return rateGenerationTypeString;
    }

    public void setRateGenerationTypeString(String rateGenerationTypeString) {
        this.rateGenerationTypeString = rateGenerationTypeString;
    }

    public String getRateNote() {
        return rateNote;
    }

    public void setRateNote(String rateNote) {
        this.rateNote = rateNote;
    }

    public String getUldType() {
        return uldType;
    }

    public void setUldType(String uldType) {
        this.uldType = uldType;
    }

    public GenIdType getCodChargeGenIdType() {
        return codChargeGenIdType;
    }

    public void setCodChargeGenIdType(GenIdType codChargeGenIdType) {
        this.codChargeGenIdType = codChargeGenIdType;
    }

    public String getCodChargeGenIdTypeString() {
        if (this.getCodChargeGenIdType() != null) {
            codChargeGenIdTypeString = this.getCodChargeGenIdType().getStatus();
        }
        return codChargeGenIdTypeString;
    }

    public void setCodChargeGenIdTypeString(String codChargeGenIdTypeString) {
        this.codChargeGenIdTypeString = codChargeGenIdTypeString;
    }

    public String getCodCurrency() {
        return codCurrency;
    }

    public void setCodCurrency(String codCurrency) {
        this.codCurrency = codCurrency;
    }

    public BigDecimal getCodExchangeRate() {
        return codExchangeRate;
    }

    public void setCodExchangeRate(BigDecimal codExchangeRate) {
        this.codExchangeRate = codExchangeRate;
    }

    public BigDecimal getFaceCollectCharge() {
        return faceCollectCharge;
    }

    public void setFaceCollectCharge(BigDecimal faceCollectCharge) {
        this.faceCollectCharge = faceCollectCharge;
    }

    public BigDecimal getFacePrepaidCharge() {
        return facePrepaidCharge;
    }

    public void setFacePrepaidCharge(BigDecimal facePrepaidCharge) {
        this.facePrepaidCharge = facePrepaidCharge;
    }

    public BigDecimal getFaceWeightCharge() {
        return faceWeightCharge;
    }

    public void setFaceWeightCharge(BigDecimal faceWeightCharge) {
        this.faceWeightCharge = faceWeightCharge;
    }

    public BigDecimal getPubCollectCharge() {
        return pubCollectCharge;
    }

    public void setPubCollectCharge(BigDecimal pubCollectCharge) {
        this.pubCollectCharge = pubCollectCharge;
    }

    public BigDecimal getPubPrepaidCharge() {
        return pubPrepaidCharge;
    }

    public void setPubPrepaidCharge(BigDecimal pubPrepaidCharge) {
        this.pubPrepaidCharge = pubPrepaidCharge;
    }

    public BigDecimal getPubWeightCharge() {
        return pubWeightCharge;
    }

    public void setPubWeightCharge(BigDecimal pubWeightCharge) {
        this.pubWeightCharge = pubWeightCharge;
    }

    public BigDecimal getTotalCashOnDeliveryCOD() {
        return totalCashOnDeliveryCOD;
    }

    public void setTotalCashOnDeliveryCOD(BigDecimal totalCashOnDeliveryCOD) {
        this.totalCashOnDeliveryCOD = totalCashOnDeliveryCOD;
    }

    public BigDecimal getTotalChargeableWeight() {
        return totalChargeableWeight;
    }

    public void setTotalChargeableWeight(BigDecimal totalChargeableWeight) {
        this.totalChargeableWeight = totalChargeableWeight;
    }

    public BigDecimal getTotalWeightCharges() {
        return totalWeightCharges;
    }

    public void setTotalWeightCharges(BigDecimal totalWeightCharges) {
        this.totalWeightCharges = totalWeightCharges;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public String getUnitTypeString() {
        if (this.getUnitType() != null) {
            unitTypeString = this.getUnitType().getUnit();
        }
        return unitTypeString;
    }

    public void setUnitTypeString(String unitTypeString) {
        this.unitTypeString = unitTypeString;
    }

    public GenIdType getValuationChargeGenIdType() {
        return valuationChargeGenIdType;
    }

    public void setValuationChargeGenIdType(GenIdType valuationChargeGenIdType) {
        this.valuationChargeGenIdType = valuationChargeGenIdType;
    }

    public String getValuationChargeGenIdTypeString() {
        if (this.getValuationChargeGenIdType() != null) {
            valuationChargeGenIdTypeString = this.getValuationChargeGenIdType().getStatus();
        }
        return valuationChargeGenIdTypeString;
    }

    public void setValuationChargeGenIdTypeString(
            String valuationChargeGenIdTypeString) {
        this.valuationChargeGenIdTypeString = valuationChargeGenIdTypeString;
    }

    public WeightUOMType getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(WeightUOMType weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getWeightUnitString() {
        if (this.getWeightUnit() != null) {
            weightUnitString = this.getWeightUnit().getWeightUnit();
        }
        return weightUnitString;
    }

    public void setWeightUnitString(String weightUnitString) {
        this.weightUnitString = weightUnitString;
    }

    public boolean isInvoiceIndicator() {
        return invoiceIndicator;
    }

    public void setInvoiceIndicator(boolean invoiceIndicator) {
        this.invoiceIndicator = invoiceIndicator;
    }

    public boolean isPostingIndicator() {
        return postingIndicator;
    }

    public void setPostingIndicator(boolean postingIndicator) {
        this.postingIndicator = postingIndicator;
    }

    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public String getQueueOffice() {
        return queueOffice;
    }

    public void setQueueOffice(String queueOffice) {
        this.queueOffice = queueOffice;
    }

    public String getQueueStation() {
        return queueStation;
    }

    public void setQueueStation(String queueStation) {
        this.queueStation = queueStation;
    }

    public boolean isQueueStatus() {
        return queueStatus;
    }

    public void setQueueStatus(boolean queueStatus) {
        this.queueStatus = queueStatus;
    }

    public boolean isReportIndicator() {
        return reportIndicator;
    }

    public void setReportIndicator(boolean reportIndicator) {
        this.reportIndicator = reportIndicator;
    }

    public BigDecimal getAirWaybillEventGrossRevenue() {
        return airWaybillEventGrossRevenue;
    }

    public void setAirWaybillEventGrossRevenue(
            BigDecimal airWaybillEventGrossRevenue) {
        this.airWaybillEventGrossRevenue = airWaybillEventGrossRevenue;
    }

    public BigDecimal getAirWaybillEventHostRevenue() {
        return airWaybillEventHostRevenue;
    }

    public void setAirWaybillEventHostRevenue(BigDecimal airWaybillEventHostRevenue) {
        this.airWaybillEventHostRevenue = airWaybillEventHostRevenue;
    }

    public BigDecimal getAirwaybillNetAmount() {
        return airwaybillNetAmount;
    }

    public void setAirwaybillNetAmount(BigDecimal airwaybillNetAmount) {
        this.airwaybillNetAmount = airwaybillNetAmount;
    }

    public BigDecimal getAirwaybillOutstandingAmount() {
        return airwaybillOutstandingAmount;
    }

    public void setAirwaybillOutstandingAmount(
            BigDecimal airwaybillOutstandingAmount) {
        this.airwaybillOutstandingAmount = airwaybillOutstandingAmount;
    }

    public BigDecimal getHostNetYield() {
        return hostNetYield;
    }

    public void setHostNetYield(BigDecimal hostNetYield) {
        this.hostNetYield = hostNetYield;
    }

    public BigDecimal getHostNetRevenue() {
        return hostNetRevenue;
    }

    public void setHostNetRevenue(BigDecimal hostNetRevenue) {
        this.hostNetRevenue = hostNetRevenue;
    }

    public BigDecimal getTotalGrossWeight() {
        return totalGrossWeight;
    }

    public void setTotalGrossWeight(BigDecimal totalGrossWeight) {
        this.totalGrossWeight = totalGrossWeight;
    }

    public void setEffectiveDateFormatted(String effectiveDateFormatted) {
        this.effectiveDateFormatted = effectiveDateFormatted;
    }

    public void setExpirationDateFormatted(String expirationDateFormatted) {
        this.expirationDateFormatted = expirationDateFormatted;
    }

    public void setPricingDateFormatted(String pricingDateFormatted) {
        this.pricingDateFormatted = pricingDateFormatted;
    }

    public void setCreationDateFormatted(String creationDateFormatted) {
        this.creationDateFormatted = creationDateFormatted;
    }

    public void setParticipantType(String participantType) {
        this.participantType = participantType;
    }

    public BigDecimal getCommissionAmount() {
        if (commissionAmount != null)
            commissionAmount = commissionAmount.setScale(2, BigDecimal.ROUND_HALF_UP);
        return commissionAmount;
    }

    public void setCommissionAmount(BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public BigDecimal getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(BigDecimal commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public CommissionType getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(CommissionType commissionType) {
        this.commissionType = commissionType;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public ParticipantRoleType getParticipantPayableType() {
        return participantPayableType;
    }

    public void setParticipantPayableType(
            ParticipantRoleType participantPayableType) {
        this.participantPayableType = participantPayableType;
    }

    public ParticipantReportTypes getParticipantReportTypes() {
        return participantReportTypes;
    }

    public void setParticipantReportTypes(ParticipantReportTypes participantReportTypes) {
        this.participantReportTypes = participantReportTypes;
    }

    public String getAirlineCodeNbr() {
        if (awbNumber != null) {
            airlineCodeNbr = awbNumber.substring(0, 3);
        }
        return airlineCodeNbr;
    }

    public void setAirlineCodeNbr(String airlineCodeNbr) {
        this.airlineCodeNbr = airlineCodeNbr;
    }

    public String getShipmentRefNbr() {
        if (awbNumber != null) {
            shipmentRefNbr = awbNumber.substring(3, 11);
        }
        return shipmentRefNbr;
    }

    public void setShipmentRefNbr(String shipmentRefNbr) {
        this.shipmentRefNbr = shipmentRefNbr;
    }

    public PaymentStatusType getStatus() {
        return status;
    }

    public void setStatus(PaymentStatusType status) {
        this.status = status;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the participantName
     */
    public String getParticipantName() {
        return participantName;
    }

    /**
     * @param participantName
     *            the participantName to set
     */
    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    /**
     * @return the awbNumber
     */
    public String getAwbNumber() {
        return awbNumber;
    }

    /**
     * @param awbNumber
     *            the awbNumber to set
     */
    public void setAwbNumber(String awbNumber) {
        this.awbNumber = awbNumber;
    }

    /**
     * @return the participantAccountNumber
     */
    public String getParticipantAccountNumber() {
        return participantAccountNumber;
    }

    /**
     * @param participantAccountNumber
     *            the participantAccountNumber to set
     */
    public void setParticipantAccountNumber(String participantAccountNumber) {
        this.participantAccountNumber = participantAccountNumber;
    }

    /**
     * @return the agreementIdentifier
     */
    public String getAgreementIdentifier() {
        return agreementIdentifier;
    }

    /**
     * @param agreementIdentifier
     *            the agreementIdentifier to set
     */
    public void setAgreementIdentifier(String agreementIdentifier) {
        this.agreementIdentifier = agreementIdentifier;
    }

    /**
     * @return the aWBStartdate
     */
    public Date getaWBStartdate() {
        return aWBStartdate;
    }

    /**
     * @param aWBStartdate
     *            the aWBStartdate to set
     */
    public void setaWBStartdate(Date aWBStartdate) {
        this.aWBStartdate = aWBStartdate;
    }

    /**
     * @return the aWBEndDate
     */
    public Date getaWBEndDate() {
        return aWBEndDate;
    }

    /**
     * @param aWBEndDate
     *            the aWBEndDate to set
     */
    public void setaWBEndDate(Date aWBEndDate) {
        this.aWBEndDate = aWBEndDate;
    }

    /**
     * @return the originStation
     */
    public String getOriginStation() {
        return originStation;
    }

    /**
     * @param originStation
     *            the originStation to set
     */
    public void setOriginStation(String originStation) {
        this.originStation = originStation;
    }

    /**
     * @return the destinationStation
     */
    public String getDestinationStation() {
        return destinationStation;
    }

    /**
     * @param destinationStation
     *            the destinationStation to set
     */
    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    /**
     * @return the aWBExecutionDate
     */
    public Date getaWBExecutionDate() {

        return aWBExecutionDate;
    }

    /**
     * @param aWBExecutionDate
     *            the aWBExecutionDate to set
     */
    public void setaWBExecutionDate(Date aWBExecutionDate) {
        this.aWBExecutionDate = aWBExecutionDate;
    }

    /**
     * @return the currencyCode
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * @param currencyCode
     *            the currencyCode to set
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * @return the activeIndicator
     */
    public Boolean getActiveIndicator() {
        return activeIndicator;
    }

    /**
     * @param activeIndicator
     *            the activeIndicator to set
     */
    public void setActiveIndicator(Boolean activeIndicator) {
        this.activeIndicator = activeIndicator;
    }

    /**
     * @return the email
     */

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin
     *            the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination
     *            the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the invoiceNumber
     */

    /**
     * @return the paymentAmount
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * @param paymentAmount
     *            the paymentAmount to set
     */
    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * @return the paymentDateandTime
     */

    /**
     * @return the paymentDueDate
     */
    public Date getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * @param paymentDueDate
     *            the paymentDueDate to set
     */
    public void setPaymentDueDate(Date paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

    /**
     * @return the paymentID
     */

    /**
     * @param paymentID
     *            the paymentID to set
     */

    /**
     * @return the gHAAgreementName
     */
    public String getgHAAgreementName() {
        return gHAAgreementName;
    }

    /**
     * @param gHAAgreementName
     *            the gHAAgreementName to set
     */
    public void setgHAAgreementName(String gHAAgreementName) {
        this.gHAAgreementName = gHAAgreementName;
    }

    /**
     * @return the gSAAgreementName
     */
    public String getgSAAgreementName() {
        return gSAAgreementName;
    }

    /**
     * @param gSAAgreementName
     *            the gSAAgreementName to set
     */
    public void setgSAAgreementName(String gSAAgreementName) {
        this.gSAAgreementName = gSAAgreementName;
    }

    /**
     * @return the effectiveDate
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * @param effectiveDate
     *            the effectiveDate to set
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * @return the expirationDate
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * @param expirationDate
     *            the expirationDate to set
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * @return the aWBOrigin
     */
    public String getaWBOrigin() {
        return aWBOrigin;
    }

    /**
     * @param aWBOrigin
     *            the aWBOrigin to set
     */
    public void setaWBOrigin(String aWBOrigin) {
        this.aWBOrigin = aWBOrigin;
    }

    /**
     * @return the aWBDestination
     */
    public String getaWBDestination() {
        return aWBDestination;
    }

    /**
     * @param aWBDestination
     *            the aWBDestination to set
     */
    public void setaWBDestination(String aWBDestination) {
        this.aWBDestination = aWBDestination;
    }

    /**
     * @return the flightLegOrigin
     */
    public String getFlightLegOrigin() {
        return flightLegOrigin;
    }

    /**
     * @param flightLegOrigin
     *            the flightLegOrigin to set
     */
    public void setFlightLegOrigin(String flightLegOrigin) {
        this.flightLegOrigin = flightLegOrigin;
    }

    /**
     * @return the flightLegDestination
     */
    public String getFlightLegDestination() {
        return flightLegDestination;
    }

    /**
     * @param flightLegDestination
     *            the flightLegDestination to set
     */
    public void setFlightLegDestination(String flightLegDestination) {
        this.flightLegDestination = flightLegDestination;
    }

    /**
     * @return the aircraftType
     */
    public String getAircraftType() {
        return aircraftType;
    }

    /**
     * @param aircraftType
     *            the aircraftType to set
     */
    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    /**
     * @return the handlingStation
     */
    public String getHandlingStation() {
        return handlingStation;
    }

    /**
     * @param handlingStation
     *            the handlingStation to set
     */
    public void setHandlingStation(String handlingStation) {
        this.handlingStation = handlingStation;
    }

    /**
     * @return the gHAAgreementID
     */
    public String getgHAAgreementID() {
        return gHAAgreementID;
    }

    /**
     * @param gHAAgreementID
     *            the gHAAgreementID to set
     */
    public void setgHAAgreementID(String gHAAgreementID) {
        this.gHAAgreementID = gHAAgreementID;
    }

    /**
     * @return the gSAAgreementID
     */
    public String getgSAAgreementID() {
        return gSAAgreementID;
    }

    /**
     * @param gSAAgreementID
     *            the gSAAgreementID to set
     */
    public void setgSAAgreementID(String gSAAgreementID) {
        this.gSAAgreementID = gSAAgreementID;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     *            the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     *            the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country
     *            the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ExportPaymentType getExportPaycode() {
        return exportPaycode;
    }

    public void setExportPaycode(ExportPaymentType exportPaycode) {
        this.exportPaycode = exportPaycode;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCustomsStation() {
        return customsStation;
    }

    public void setCustomsStation(String customsStation) {
        this.customsStation = customsStation;
    }

    public String getDeclaredValue() {
        return declaredValue;
    }

    public void setDeclaredValue(String declaredValue) {
        this.declaredValue = declaredValue;
    }

    public String getCustomsValue() {
        return customsValue;
    }

    public void setCustomsValue(String customsValue) {
        this.customsValue = customsValue;
    }

    public String getInsuranceValue() {
        return insuranceValue;
    }

    public void setInsuranceValue(String insuranceValue) {
        this.insuranceValue = insuranceValue;
    }

    public String getInsuranceCode() {
        return insuranceCode;
    }

    public void setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
    }

    public String getOriginCurrency() {
        return originCurrency;
    }

    public void setOriginCurrency(String originCurrency) {
        this.originCurrency = originCurrency;
    }

    public String getDestinationCurrency() {
        return destinationCurrency;
    }

    public void setDestinationCurrency(String destinationCurrency) {
        this.destinationCurrency = destinationCurrency;
    }

    public WeightUOMType getUnitOfWeight() {
        return unitOfWeight;
    }

    public void setUnitOfWeight(WeightUOMType unitOfWeight) {
        this.unitOfWeight = unitOfWeight;
    }

    public Date getPricingDate() {
        return pricingDate;
    }

    public void setPricingDate(Date pricingDate) {
        this.pricingDate = pricingDate;
    }

    public BigDecimal getDimensionalWeight() {
        return dimensionalWeight;
    }

    public void setDimensionalWeight(BigDecimal dimensionalWeight) {
        this.dimensionalWeight = dimensionalWeight;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public VolumeEvaluationMethodType getVolumeEvaluationMethod() {
        return volumeEvaluationMethod;
    }

    public void setVolumeEvaluationMethod(
            VolumeEvaluationMethodType volumeEvaluationMethod) {
        this.volumeEvaluationMethod = volumeEvaluationMethod;
    }

    public BigDecimal getBookingEventGrossRevenue() {
        return bookingEventGrossRevenue;
    }

    public void setBookingEventGrossRevenue(BigDecimal bookingEventGrossRevenue) {
        this.bookingEventGrossRevenue = bookingEventGrossRevenue;
    }

    public BigDecimal getBookingEventHostRevenue() {
        return bookingEventHostRevenue;
    }

    public void setBookingEventHostRevenue(BigDecimal bookingEventHostRevenue) {
        this.bookingEventHostRevenue = bookingEventHostRevenue;
    }

    public BigDecimal getBookingEventHurdleAmount() {
        return bookingEventHurdleAmount;
    }

    public void setBookingEventHurdleAmount(BigDecimal bookingEventHurdleAmount) {
        this.bookingEventHurdleAmount = bookingEventHurdleAmount;
    }

    public BigDecimal getBookingEventHurdleRate() {
        return bookingEventHurdleRate;
    }

    public void setBookingEventHurdleRate(BigDecimal bookingEventHurdleRate) {
        this.bookingEventHurdleRate = bookingEventHurdleRate;
    }

    public BigDecimal getBookingEventTotalRate() {
        return bookingEventTotalRate;
    }

    public void setBookingEventTotalRate(BigDecimal bookingEventTotalRate) {
        this.bookingEventTotalRate = bookingEventTotalRate;
    }

    public BigDecimal getBookingEventCostAmount() {
        return bookingEventCostAmount;
    }

    public void setBookingEventCostAmount(BigDecimal bookingEventCostAmount) {
        this.bookingEventCostAmount = bookingEventCostAmount;
    }

    public BigDecimal getBookingEventCostRate() {
        return bookingEventCostRate;
    }

    public void setBookingEventCostRate(BigDecimal bookingEventCostRate) {
        this.bookingEventCostRate = bookingEventCostRate;
    }

    public BigDecimal getBookingEventRevenueRate() {
        return bookingEventRevenueRate;
    }

    public void setBookingEventRevenueRate(BigDecimal bookingEventRevenueRate) {
        this.bookingEventRevenueRate = bookingEventRevenueRate;
    }

    public String getBookingEventProduct() {
        return bookingEventProduct;
    }

    public void setBookingEventProduct(String bookingEventProduct) {
        this.bookingEventProduct = bookingEventProduct;
    }

    public String getBookingEventHurdleRateStatus() {
        return bookingEventHurdleRateStatus;
    }

    public void setBookingEventHurdleRateStatus(String bookingEventHurdleRateStatus) {
        this.bookingEventHurdleRateStatus = bookingEventHurdleRateStatus;
    }

    public HurdleRateReasonType getBookingEventHurdleRateReasonCode() {
        return bookingEventHurdleRateReasonCode;
    }

    public void setBookingEventHurdleRateReasonCode(
            HurdleRateReasonType bookingEventHurdleRateReasonCode) {
        this.bookingEventHurdleRateReasonCode = bookingEventHurdleRateReasonCode;
    }

    public BigDecimal getValuationCharges() {
        return valuationCharges;
    }

    public void setValuationCharges(BigDecimal valuationCharges) {
        this.valuationCharges = valuationCharges;
    }

    public BigDecimal getOtherCharges() {
        return otherCharges;
    }

    public void setOtherCharges(BigDecimal otherCharges) {
        this.otherCharges = otherCharges;
    }

    public BigDecimal getActPrepaidCharge() {
        return actPrepaidCharge;
    }

    public void setActPrepaidCharge(BigDecimal actPrepaidCharge) {
        this.actPrepaidCharge = actPrepaidCharge;
    }

    public BigDecimal getActCollectCharge() {
        return actCollectCharge;
    }

    public void setActCollectCharge(BigDecimal actCollectCharge) {
        this.actCollectCharge = actCollectCharge;
    }

    public BigDecimal getCodCharges() {
        return codCharges;
    }

    public void setCodCharges(BigDecimal codCharges) {
        this.codCharges = codCharges;
    }

    public String getaWBExecutionFormattedDate() {

        String value = "";
        if (this.getaWBExecutionDate() != null) {
            value = DateUtility.convertToGMTDate(this.getaWBExecutionDate(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            aWBExecutionFormattedDate = value.toUpperCase();
        }
        return aWBExecutionFormattedDate;
    }

    public void setaWBExecutionFormattedDate(String aWBExecutionFormattedDate) {
        this.aWBExecutionFormattedDate = aWBExecutionFormattedDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getActWeightCharge() {
        return actWeightCharge;
    }

    public void setActWeightCharge(BigDecimal actWeightCharge) {
        this.actWeightCharge = actWeightCharge;
    }

    public void setAirwaybill(String airlineCode, String shipmentRef) {
        if (airlineCode != null && shipmentRef != null) {
            String airwaybill = airlineCode + shipmentRef;
            this.setAwbNumber(airwaybill);
        }
    }

    public String getEffectiveDateFormatted() {
        String value = "";
        if (this.getEffectiveDate() != null) {
            value = DateUtility.convertToGMTDate(this.getEffectiveDate(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            effectiveDateFormatted = value.toUpperCase();
        }
        return effectiveDateFormatted;
    }

    public String getExpirationDateFormatted() {
        String value = "";
        if (this.getExpirationDate() != null) {
            value = DateUtility.convertToGMTDate(this.getExpirationDate(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            expirationDateFormatted = value.toUpperCase();
        }
        return expirationDateFormatted;
    }

    public String getCreationDateFormatted() {
        String value = "";
        if (this.getCreationDate() != null) {
            value = DateUtility.convertToGMTDate(this.getCreationDate(), FrameworkConstants.DATETIMEFORMAT_DDMMMYYHHMM);
        }
        if (value != null) {
            creationDateFormatted = value.toUpperCase();
        }
        return creationDateFormatted;
    }

    public String getPricingDateFormatted() {
        String value = "";
        if (this.getPricingDate() != null) {
            value = DateUtility.convertToGMTDate(this.getPricingDate(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            pricingDateFormatted = value.toUpperCase();
        }
        return pricingDateFormatted;
    }

    public String getAccountingStatus() {
        return accountingStatus;
    }

    public void setAccountingStatus(String accountingStatus) {
        this.accountingStatus = accountingStatus;
    }

    public String getStatusString() {
        if (this.getStatus() != null)
            statusString = this.getStatus().getVal();
        return statusString;
    }

    public void setStatusString(String statusString) {
        this.statusString = statusString;
    }

    public String getVolumeEvaluationMethodString() {
        if (this.getVolumeEvaluationMethod() != null) {
            volumeEvaluationMethodString = this.getVolumeEvaluationMethod().getUnit();
        }
        return volumeEvaluationMethodString;
    }

    public void setVolumeEvaluationMethodString(String volumeEvaluationMethodString) {
        this.volumeEvaluationMethodString = volumeEvaluationMethodString;
    }

    public String getBookingEventHurdleRateReasonCodeString() {
        if (this.getBookingEventHurdleRateReasonCode() != null)
            bookingEventHurdleRateReasonCodeString = this.getBookingEventHurdleRateReasonCode().getVal();
        return bookingEventHurdleRateReasonCodeString;
    }

    public void setBookingEventHurdleRateReasonCodeString(
            String bookingEventHurdleRateReasonCodeString) {
        this.bookingEventHurdleRateReasonCodeString = bookingEventHurdleRateReasonCodeString;
    }

    public BigDecimal getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }

    public BigDecimal getSumOfTotalSales() {
        return sumOfTotalSales;
    }

    public void setSumOfTotalSales(BigDecimal sumOfTotalSales) {
        this.sumOfTotalSales = sumOfTotalSales;
    }

    /**
     * @return the specificAirline
     */
    public String getSpecificAirline() {
        return specificAirline;
    }

    /**
     * @param specificAirline
     *            the specificAirline to set
     */
    public void setSpecificAirline(String specificAirline) {
        this.specificAirline = specificAirline;
    }

    /**
     * @return the flownStartDate
     */
    public Date getFlownStartDate() {
        return flownStartDate;
    }

    /**
     * @param flownStartDate
     *            the flownStartDate to set
     */
    public void setFlownStartDate(Date flownStartDate) {
        this.flownStartDate = flownStartDate;
    }

    /**
     * @return the flownEndDate
     */
    public Date getFlownEndDate() {
        return flownEndDate;
    }

    /**
     * @param flownEndDate
     *            the flownEndDate to set
     */
    public void setFlownEndDate(Date flownEndDate) {
        this.flownEndDate = flownEndDate;
    }

    /**
     * @return the monthlyMGRTarget
     */
    public BigDecimal getMonthlyMGRTarget() {
        return monthlyMGRTarget;
    }

    /**
     * @param monthlyMGRTarget
     *            the monthlyMGRTarget to set
     */
    public void setMonthlyMGRTarget(BigDecimal monthlyMGRTarget) {
        this.monthlyMGRTarget = monthlyMGRTarget;
    }

    /**
     * @return the yearlyMGRTarget
     */
    public BigDecimal getYearlyMGRTarget() {
        return yearlyMGRTarget;
    }

    /**
     * @param yearlyMGRTarget
     *            the yearlyMGRTarget to set
     */
    public void setYearlyMGRTarget(BigDecimal yearlyMGRTarget) {
        this.yearlyMGRTarget = yearlyMGRTarget;
    }

    /**
     * @return the optionSelected
     */
    public String getOptionSelected() {
        return optionSelected;
    }

    /**
     * @param optionSelected
     *            the optionSelected to set
     */
    public void setOptionSelected(String optionSelected) {
        this.optionSelected = optionSelected;
    }

    /**
     * @return the extendedTerritory
     */
    public String getExtendedTerritory() {
        return extendedTerritory;
    }

    /**
     * @param extendedTerritory
     *            the extendedTerritory to set
     */
    public void setExtendedTerritory(String extendedTerritory) {
        this.extendedTerritory = extendedTerritory;
    }

    /**
     * @return the firstHostFlownDate
     */
    public Date getFirstHostFlownDate() {
        return firstHostFlownDate;
    }

    /**
     * @param firstHostFlownDate
     *            the firstHostFlownDate to set
     */
    public void setFirstHostFlownDate(Date firstHostFlownDate) {
        this.firstHostFlownDate = firstHostFlownDate;
    }

    public String getFirstHostFlownDateFormatted() {
        String value = "";
        if (this.getFirstHostFlownDate() != null) {
            value = DateUtility.convertToGMTDate(this.getFirstHostFlownDate(), FrameworkConstants.DATEFORMAT);
        }
        if (value != null) {
            firstHostFlownDateFormatted = value.toUpperCase();
        }
        return firstHostFlownDateFormatted;
    }

    public void setFirstHostFlownDateFormatted(String firstHostFlownDateFormatted) {
        this.firstHostFlownDateFormatted = firstHostFlownDateFormatted;
    }

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getRowSizePerPage() {
		return rowSizePerPage;
	}

	public void setRowSizePerPage(int rowSizePerPage) {
		this.rowSizePerPage = rowSizePerPage;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

    public boolean isDownloadAll() {
        return downloadAll;
    }

    public void setDownloadAll(boolean downloadAll) {
        this.downloadAll = downloadAll;
    }

    public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();

        if (this.getaWBStartdate() != null) {
            csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getaWBStartdate())));
        }
        else
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        if (this.getaWBEndDate() != null) {
            csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getaWBEndDate())));
        }
        else
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        if (this.getParticipantPayableType() != null
                && !ParticipantReportTypes.MINIMUM_GURANTEED_REVENUE.equals(this.getParticipantReportTypes())) {
            csvString.append(this.prefixSuffixByQuotes(this.getParticipantPayableType().getParticipantRoleName()));
        }
        else
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        if (this.getParticipantName() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getParticipantName()));
        }
        else
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        if (this.getStation() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStation()));
        }
        else
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        if (this.getParticipantAccountNumber() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getParticipantAccountNumber()));
        }
        else
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        

        if (ParticipantReportTypes.MINIMUM_GURANTEED_REVENUE.equals(this.getParticipantReportTypes()) && this.getGsaAgreementName() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getGsaAgreementName()));
        }
        else
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        if (ParticipantReportTypes.MINIMUM_GURANTEED_REVENUE.equals(this.getParticipantReportTypes()) && this.getFlownStartDate() != null) {
            csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getFlownStartDate())));
        }
        else
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        if (ParticipantReportTypes.MINIMUM_GURANTEED_REVENUE.equals(this.getParticipantReportTypes()) && this.getFlownEndDate() != null) {
            csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getFlownEndDate())));
        }
        else
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        if (ParticipantReportTypes.MINIMUM_GURANTEED_REVENUE.equals(this.getParticipantReportTypes()) && this.getCurrency() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getCurrency()));
        }
        else
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        if (ParticipantReportTypes.MINIMUM_GURANTEED_REVENUE.equals(this.getParticipantReportTypes()) && this.getMonthlyMGRTarget() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getMonthlyMGRTarget().toString()));
        }
        else
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        if (ParticipantReportTypes.MINIMUM_GURANTEED_REVENUE.equals(this.getParticipantReportTypes()) && this.getYearlyMGRTarget() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getYearlyMGRTarget().toString()));
        }
        else
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        if (ParticipantReportTypes.MINIMUM_GURANTEED_REVENUE.equals(this.getParticipantReportTypes()) && this.getSumOfTotalSales() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getSumOfTotalSales().toString()));
        }
        else
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        return csvString.toString();

    }

    private String prefixSuffixByQuotes(final String pString) {
        final String aQUOTATION = "\"";
        final String aCOMMA = ",";

        final StringBuffer aModifiedString = new StringBuffer();
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(pString);
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(aCOMMA);

        return aModifiedString.toString();
    }

    /**
     * @return the station
     */
    public String getStation() {
        return station;
    }

    /**
     * @param station
     *            the station to set
     */
    public void setStation(String station) {
        this.station = station;
    }

    /**
     * @return the dateType
     */
    public String getDateType() {
        return dateType;
    }

    /**
     * @param dateType
     *            the dateType to set
     */
    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public BigDecimal getTds() {
        if(tds==null) {
            tds= new BigDecimal(0);
        }
        return tds;
    }

    public void setTds(BigDecimal tds) {
        this.tds = tds;
    }

}
