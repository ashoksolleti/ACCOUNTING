package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.AccountRegionType;
import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceFrequencyType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceMediaType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceSequenceType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

public class ParticipantAccInformationReportDto extends PersistenceObjectDto {
	
	private static final long serialVersionUID = 1L;

	private static final String EMPTY_STRING = "";
	private Long oId;
	//Participant
	
	private String name;
	private String accountNumber;
	private String stationCode;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String phone;
	private String email;
	private String type;
	private String language;
	private String aliases;//Get the name
	
	private String billingAccountNumber1;
	private String billingAccountType1;
	private String billingAccountNumber2;
	private String billingAccountType2;
	
	private Boolean deleteIndicator;
	private String deleteRemarks;
	private String uldFreightCode;
	private String paymentMethod;
	private String creditLimit;
	private String creditRate;
	private BigDecimal availableCredit;
	private Boolean hardOrSoftCreditLimitIndicator;
	private String currencyCode;
	private Date agingAnalysisDate;
	private String agingAnalysisDateFormatted;
	private String iataAccountNumber;
	private BigDecimal toleranceLimit;
	private BigDecimal totalOutstanding;
	private BigDecimal amountsUnbilled;
	private BigDecimal amountsUnapplied;
	private String collectionEmail;
	private Boolean collectionMedia;
	private String collectorId;
	private Date initialShipmentDate;
	private String initialShipmentDateFormatted;
	private Date establishedDate;
	private String establishedDateFormatted;
	private Date lastShipmentDate;
	private String lastShipmentDateFormatted;
	private int totalHouseAWB;
	private int totalShipments;
	private String regionCode;
	private String messageProfileName;
	private String districtCode;
	private String customsCode;
	private String agentCustomsCode;
	private String awbPriority;
	private String subDistrictCode;
	//from Acc Participant
	private String accountTypeString;
	private CRAParticipantAccountType accountType;
	private Boolean govtTaxExemptIndicator;
	private Boolean stateTaxExemptIndicator;
	
	//AccParticipant->AccBilling
	private String accountingPeriod;
	private String billingPaymentDiscountDays;
	private String billingPaymentDueDays;
	private BigDecimal commissionPercentage;
	private String currency;
	private BigDecimal discountPercentage;
	private BigDecimal incentivePercentage;
	private InvoiceFrequencyType invoiceFrequency;
	private String invoiceFrequencyString;
	private String invoiceLanguage;
	private InvoiceMediaType invoiceMedia;
	private String invoiceMediaString;
	private InvoiceSequenceType invoiceSequence;
	private String invoiceSequenceString;
	private String invoiceSite;
	private String invoiceEmail;
	private String mtdSales;
	private String prevMTDSales;
	private String prevYTDSales;
	private BigDecimal serviceFeePercentage;
	private String ytdSales;
	
	private String accountRegionString;
	private AccountRegionType accountRegion;
	private String areaRepresentative;
	private String countryRepresentative;
	//AccParticipant->Sales
	private Date salesContactDate1;
	private String salesContactDate1Formatted; 
	private Date salesContactDate2;
	private String salesContactDate2Formatted;
	private Date salesContactDate3;
	private String salesContactDate3Formatted;
	//private String station;
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
	
	
	

	private String specificAirline;
	
	

	
	//participant->FreightDetail
	
	
	//end
	
	
	
	
	
	
	
	
	
	
	public String getSpecificAirline() {
		return specificAirline;
	}



	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}



	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}



	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}



	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}



	/**
	 * @return the accountType
	 */


	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the account
	 */


	



	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
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
	 * @param city the city to set
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
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}



	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}



	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}



	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}



	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}



	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}



	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}



	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}



	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}



	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}



	public CRAParticipantAccountType getAccountType() {
		return accountType;
	}



	public void setAccountType(CRAParticipantAccountType accountType) {
		this.accountType = accountType;
	}



	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getAliases() {
		return aliases;
	}



	public void setAliases(String aliases) {
		this.aliases = aliases;
	}



	public Boolean getDeleteIndicator() {
		return deleteIndicator;
	}



	public void setDeleteIndicator(Boolean deleteIndicator) {
		this.deleteIndicator = deleteIndicator;
	}



	public String getDeleteRemarks() {
		return deleteRemarks;
	}



	public void setDeleteRemarks(String deleteRemarks) {
		this.deleteRemarks = deleteRemarks;
	}



	public String getUldFreightCode() {
		return uldFreightCode;
	}



	public void setUldFreightCode(String uldFreightCode) {
		this.uldFreightCode = uldFreightCode;
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



	public BigDecimal getAvailableCredit() {
		return availableCredit;
	}



	public void setAvailableCredit(BigDecimal availableCredit) {
		this.availableCredit = availableCredit;
	}



	public Boolean getHardOrSoftCreditLimitIndicator() {
		return hardOrSoftCreditLimitIndicator;
	}



	public void setHardOrSoftCreditLimitIndicator(
			Boolean hardOrSoftCreditLimitIndicator) {
		this.hardOrSoftCreditLimitIndicator = hardOrSoftCreditLimitIndicator;
	}



	public String getCurrencyCode() {
		return currencyCode;
	}



	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}



	public Date getAgingAnalysisDate() {
		return agingAnalysisDate;
	}



	public void setAgingAnalysisDate(Date agingAnalysisDate) {
		this.agingAnalysisDate = agingAnalysisDate;
	}



	public String getIataAccountNumber() {
		return iataAccountNumber;
	}



	public void setIataAccountNumber(String iataAccountNumber) {
		this.iataAccountNumber = iataAccountNumber;
	}



	public BigDecimal getToleranceLimit() {
		return toleranceLimit;
	}



	public void setToleranceLimit(BigDecimal toleranceLimit) {
		this.toleranceLimit = toleranceLimit;
	}



	public BigDecimal getTotalOutstanding() {
		return totalOutstanding;
	}



	public void setTotalOutstanding(BigDecimal totalOutstanding) {
		this.totalOutstanding = totalOutstanding;
	}



	public BigDecimal getAmountsUnbilled() {
		return amountsUnbilled;
	}



	public void setAmountsUnbilled(BigDecimal amountsUnbilled) {
		this.amountsUnbilled = amountsUnbilled;
	}



	public BigDecimal getAmountsUnapplied() {
		return amountsUnapplied;
	}



	public void setAmountsUnapplied(BigDecimal amountsUnapplied) {
		this.amountsUnapplied = amountsUnapplied;
	}



	public String getCollectionEmail() {
		return collectionEmail;
	}



	public void setCollectionEmail(String collectionEmail) {
		this.collectionEmail = collectionEmail;
	}



	public String getCollectorId() {
		return collectorId;
	}



	public void setCollectorId(String collectorId) {
		this.collectorId = collectorId;
	}



	public Date getInitialShipmentDate() {
		return initialShipmentDate;
	}



	public void setInitialShipmentDate(Date initialShipmentDate) {
		this.initialShipmentDate = initialShipmentDate;
	}



	public Date getEstablishedDate() {
		return establishedDate;
	}



	public void setEstablishedDate(Date establishedDate) {
		this.establishedDate = establishedDate;
	}



	public Date getLastShipmentDate() {
		return lastShipmentDate;
	}



	public void setLastShipmentDate(Date lastShipmentDate) {
		this.lastShipmentDate = lastShipmentDate;
	}



	public int getTotalHouseAWB() {
		return totalHouseAWB;
	}



	public void setTotalHouseAWB(int totalHouseAWB) {
		this.totalHouseAWB = totalHouseAWB;
	}



	public int getTotalShipments() {
		return totalShipments;
	}



	public void setTotalShipments(int totalShipments) {
		this.totalShipments = totalShipments;
	}



	public String getRegionCode() {
		return regionCode;
	}



	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}



	public String getMessageProfileName() {
		return messageProfileName;
	}



	public void setMessageProfileName(String messageProfileName) {
		this.messageProfileName = messageProfileName;
	}



	public String getDistrictCode() {
		return districtCode;
	}



	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}



	public String getCustomsCode() {
		return customsCode;
	}



	public void setCustomsCode(String customsCode) {
		this.customsCode = customsCode;
	}



	public String getAgentCustomsCode() {
		return agentCustomsCode;
	}



	public void setAgentCustomsCode(String agentCustomsCode) {
		this.agentCustomsCode = agentCustomsCode;
	}



	public String getAwbPriority() {
		return awbPriority;
	}



	public void setAwbPriority(String awbPriority) {
		this.awbPriority = awbPriority;
	}



	public String getSubDistrictCode() {
		return subDistrictCode;
	}



	public void setSubDistrictCode(String subDistrictCode) {
		this.subDistrictCode = subDistrictCode;
	}



	public InvoiceFrequencyType getInvoiceFrequency() {
		return invoiceFrequency;
	}



	public void setInvoiceFrequency(InvoiceFrequencyType invoiceFrequency) {
		this.invoiceFrequency = invoiceFrequency;
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



	public InvoiceSequenceType getInvoiceSequence() {
		return invoiceSequence;
	}



	public void setInvoiceSequence(InvoiceSequenceType invoiceSequence) {
		this.invoiceSequence = invoiceSequence;
	}



	public String getInvoiceSite() {
		return invoiceSite;
	}



	public void setInvoiceSite(String invoiceSite) {
		this.invoiceSite = invoiceSite;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public AccountRegionType getAccountRegion() {
		return accountRegion;
	}



	public void setAccountRegion(AccountRegionType accountRegion) {
		this.accountRegion = accountRegion;
	}



	public String getAreaRepresentative() {
		return areaRepresentative;
	}



	public void setAreaRepresentative(String areaRepresentative) {
		this.areaRepresentative = areaRepresentative;
	}



	public String getCountryRepresentative() {
		return countryRepresentative;
	}



	public void setCountryRepresentative(String countryRepresentative) {
		this.countryRepresentative = countryRepresentative;
	}



	public String getBillingAccountNumber1() {
		return billingAccountNumber1;
	}



	public void setBillingAccountNumber1(String billingAccountNumber1) {
		this.billingAccountNumber1 = billingAccountNumber1;
	}



	public String getBillingAccountType1() {
		return billingAccountType1;
	}



	public void setBillingAccountType1(String billingAccountType1) {
		this.billingAccountType1 = billingAccountType1;
	}



	public String getBillingAccountNumber2() {
		return billingAccountNumber2;
	}



	public void setBillingAccountNumber2(String billingAccountNumber2) {
		this.billingAccountNumber2 = billingAccountNumber2;
	}



	public String getBillingAccountType2() {
		return billingAccountType2;
	}



	public void setBillingAccountType2(String billingAccountType2) {
		this.billingAccountType2 = billingAccountType2;
	}


	public String getStationCode() {
		return stationCode;
	}



	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}



	public String getCreditLimit() {
		return creditLimit;
	}



	public void setCreditLimit(String creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getAgingAnalysisDateFormatted() {
		String value="";
    	if(this.getAgingAnalysisDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getAgingAnalysisDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		agingAnalysisDateFormatted=value.toUpperCase();
    	}
		return agingAnalysisDateFormatted;
	}



	public void setAgingAnalysisDateFormatted(String agingAnalysisDateFormatted) {
		this.agingAnalysisDateFormatted = agingAnalysisDateFormatted;
	}



	public String getInitialShipmentDateFormatted() {
		
		String value="";
    	if(this.getInitialShipmentDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getInitialShipmentDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		initialShipmentDateFormatted=value.toUpperCase();
    	}
		return initialShipmentDateFormatted;
	}



	public void setInitialShipmentDateFormatted(String initialShipmentDateFormatted) {
		this.initialShipmentDateFormatted = initialShipmentDateFormatted;
	}



	public String getEstablishedDateFormatted() {

		String value="";
    	if(this.getEstablishedDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getEstablishedDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		establishedDateFormatted=value.toUpperCase();
    	}
		return establishedDateFormatted;
	}



	public void setEstablishedDateFormatted(String establishedDateFormatted) {
		this.establishedDateFormatted = establishedDateFormatted;
	}



	public String getLastShipmentDateFormatted() {
		
		String value="";
    	if(this.getLastShipmentDate()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getLastShipmentDate(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		lastShipmentDateFormatted=value.toUpperCase();
    	}
		return lastShipmentDateFormatted;
	}



	public void setLastShipmentDateFormatted(String lastShipmentDateFormatted) {
		this.lastShipmentDateFormatted = lastShipmentDateFormatted;
	}



	public String getAccountTypeString() {
		if(this.getAccountType() != null)
		{
			accountTypeString = this.getAccountType().getStringValue();
		}
		return accountTypeString;
	}



	public void setAccountTypeString(String accountTypeString) {
		this.accountTypeString = accountTypeString;
	}



	public String getInvoiceFrequencyString() {
		if(this.getInvoiceFrequency()!=null)
		{
			invoiceFrequencyString = this.getInvoiceFrequency().getName();
		}
		return invoiceFrequencyString;
	}



	public void setInvoiceFrequencyString(String invoiceFrequencyString) {
		this.invoiceFrequencyString = invoiceFrequencyString;
	}



	public String getInvoiceMediaString() {
		if(this.getInvoiceMedia() != null)
		{
			invoiceMediaString = this.getInvoiceMedia().getLabel();
		}
		return invoiceMediaString;
	}



	public void setInvoiceMediaString(String invoiceMediaString) {
		this.invoiceMediaString = invoiceMediaString;
	}



	public String getInvoiceSequenceString() {
		if(this.getInvoiceSequence() != null)
		{
			invoiceSequenceString = this.getInvoiceSequence().getStringValue();
		}
		return invoiceSequenceString;
	}



	public void setInvoiceSequenceString(String invoiceSequenceString) {
		this.invoiceSequenceString = invoiceSequenceString;
	}



	public String getAccountRegionString() {
		if(this.getAccountRegion() != null )
		{
			accountRegionString = this.getAccountRegion().getVal();
		}
		return accountRegionString;
	}



	public void setAccountRegionString(String accountRegionString) {
		this.accountRegionString = accountRegionString;
	}
	

	public String getSalesContactDate1Formatted() {
		String value="";
    	if(this.getSalesContactDate1()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getSalesContactDate1(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		salesContactDate1Formatted=value.toUpperCase();
    	}
		return salesContactDate1Formatted;
	}



	public void setSalesContactDate1Formatted(String salesContactDate1Formatted) {
		this.salesContactDate1Formatted = salesContactDate1Formatted;
	}



	public String getSalesContactDate2Formatted() {
		String value="";
    	if(this.getSalesContactDate2()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getSalesContactDate2(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		salesContactDate2Formatted=value.toUpperCase();
    	}
		return salesContactDate2Formatted;
	}



	public void setSalesContactDate2Formatted(String salesContactDate2Formatted) {
		this.salesContactDate2Formatted = salesContactDate2Formatted;
	}



	public String getSalesContactDate3Formatted() {
		String value="";
    	if(this.getSalesContactDate3()!=null)
    	{
    		value=DateUtility.convertToGMTDate(this.getSalesContactDate3(),FrameworkConstants.DATEFORMAT);
    	}	
    	if(value!=null)
    	{
    		salesContactDate3Formatted=value.toUpperCase();
    	}
		return salesContactDate3Formatted;
	}



	public void setSalesContactDate3Formatted(String salesContactDate3Formatted) {
		this.salesContactDate3Formatted = salesContactDate3Formatted;
	}
	
	



	
	
	

	public Date getSalesContactDate1() {
		return salesContactDate1;
	}



	public void setSalesContactDate1(Date salesContactDate1) {
		this.salesContactDate1 = salesContactDate1;
	}



	public Date getSalesContactDate2() {
		return salesContactDate2;
	}



	public void setSalesContactDate2(Date salesContactDate2) {
		this.salesContactDate2 = salesContactDate2;
	}



	public Date getSalesContactDate3() {
		return salesContactDate3;
	}



	public void setSalesContactDate3(Date salesContactDate3) {
		this.salesContactDate3 = salesContactDate3;
	}

	
	


	public Boolean getCollectionMedia() {
		return collectionMedia;
	}



	public void setCollectionMedia(Boolean collectionMedia) {
		this.collectionMedia = collectionMedia;
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



	public BigDecimal getCommissionPercentage() {
		return commissionPercentage;
	}



	public void setCommissionPercentage(BigDecimal commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
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



	public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();
        
       
        if(this.getAccountType() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(this.getAccountType().getStringValue()));
        }
        else
        	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
      
        
        if(this.getCreditLimit()!= null)
        {
        	csvString.append(this.prefixSuffixByQuotes(this.getCreditLimit()));
        }
        else
        	csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        
        if(this.getName()!= null)
		{
			csvString.append(this.prefixSuffixByQuotes(this.getName()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
		
		if(this.getAccountNumber()!= null)
		{
			csvString.append(this.prefixSuffixByQuotes(this.getAccountNumber()));
		}
		else
			csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        
        
        if(this.getStationCode() != null)
        {
        	csvString.append(this.prefixSuffixByQuotes(this.getStationCode()));
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
	
}
