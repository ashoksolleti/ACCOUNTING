package com.unisys.trans.logistics.lms.accounting.dto;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InvoiceStatusType;
import com.unisys.trans.logistics.lms.framework.constants.CRABillingScheduleType;
import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceFrequencyType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class BillingSchedulesDto extends PersistenceObjectDto {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private ActionType actionType;

	private static final String EMPTY_STRING = "";
	private Long oId=0l;

	private String participantType;

	private String participantTypeForCountry;
	
	private InvoiceFrequencyType invoiceFrequency;

	private Date scheduleFromDate;

	private Date scheduleToDate;

	private String billingScheduleType;

	private String billingScheduleName;

	private String billingScheduleTypeAsSting;
	
	private String specificAirline;
	
	private InvoiceStatusType invoiceStatus;

	private Long accountingBillingScheduleOid;

	public Long getAccountingBillingScheduleOid() {
		return accountingBillingScheduleOid;
	}

	public void setAccountingBillingScheduleOid(Long accountingBillingScheduleOid) {
		this.accountingBillingScheduleOid = accountingBillingScheduleOid;
	}

	public String getBillingScheduleTypeAsSting() {
		if(billingScheduleType!=null){
			if(billingScheduleType.equalsIgnoreCase(CRABillingScheduleType.PARTICIPANT_TYPE.toString())){
				billingScheduleTypeAsSting = CRABillingScheduleType.PARTICIPANT_TYPE.getStringValue();
			}else if(billingScheduleType.equalsIgnoreCase(CRABillingScheduleType.AGGREGATE.toString())){
				billingScheduleTypeAsSting = CRABillingScheduleType.AGGREGATE.getStringValue();
			}else if(billingScheduleType.equalsIgnoreCase(CRABillingScheduleType.BILLING_GROUP.toString())){
				billingScheduleTypeAsSting = CRABillingScheduleType.BILLING_GROUP.getStringValue();
			}else if(billingScheduleType.equalsIgnoreCase(CRABillingScheduleType.COUNTRY.toString())){
				billingScheduleTypeAsSting = CRABillingScheduleType.COUNTRY.getStringValue();			
			}else if(billingScheduleType.equalsIgnoreCase(CRABillingScheduleType.PARTICIPANT_ACCOUNT.toString())){
				billingScheduleTypeAsSting = CRABillingScheduleType.PARTICIPANT_ACCOUNT.getStringValue();
			}else if(billingScheduleType.equalsIgnoreCase(CRABillingScheduleType.STATION.toString())){
				billingScheduleTypeAsSting = CRABillingScheduleType.STATION.getStringValue();
			}else if(billingScheduleType.equalsIgnoreCase(CRABillingScheduleType.SYSTEM.toString())){
				billingScheduleTypeAsSting = CRABillingScheduleType.SYSTEM.getStringValue();
			}	
		}		
		return billingScheduleTypeAsSting;
	}

	public void setBillingScheduleTypeAsSting(String billingScheduleTypeAsSting) {
		this.billingScheduleTypeAsSting = billingScheduleTypeAsSting;
	}

	private String participantTypeAsString;
	
	public String getParticipantTypeAsString() {
		if(participantType != null){
			if(participantType.equalsIgnoreCase(InvoiceParticipantAccountType.COMMERCIAL_EXPORT.toString())){
				participantTypeAsString = InvoiceParticipantAccountType.COMMERCIAL_EXPORT.getStringValue();
			}else if(participantType.equalsIgnoreCase(InvoiceParticipantAccountType.COMMERCIAL_IMPORT.toString())){
				participantTypeAsString = InvoiceParticipantAccountType.COMMERCIAL_IMPORT.getStringValue();
			}else if(participantType.equalsIgnoreCase(CRAParticipantAccountType.COMMERCIAL.toString())){
					participantTypeAsString = CRAParticipantAccountType.COMMERCIAL.getStringValue();
			}else if(participantType.equalsIgnoreCase(InvoiceParticipantAccountType.CASS_AGENT.toString())){
				participantTypeAsString = InvoiceParticipantAccountType.CASS_AGENT.getStringValue();
			}else if(participantType.equalsIgnoreCase(InvoiceParticipantAccountType.GENERAL_SALES_AGENTS.toString())){
				participantTypeAsString = InvoiceParticipantAccountType.GENERAL_SALES_AGENTS.getStringValue();
			}else if(participantType.equalsIgnoreCase(InvoiceParticipantAccountType.GOVERNMENT_ACCOUNT.toString())){
				participantTypeAsString = InvoiceParticipantAccountType.GOVERNMENT_ACCOUNT.getStringValue();
			}else if(participantType.equalsIgnoreCase(InvoiceParticipantAccountType.GROUND_HANDLING_AGENTS.toString())){
				participantTypeAsString = InvoiceParticipantAccountType.GROUND_HANDLING_AGENTS.getStringValue();
			}else if(participantType.equalsIgnoreCase(InvoiceParticipantAccountType.INTERLINE_ACCOUNT.toString())){
				participantTypeAsString = InvoiceParticipantAccountType.INTERLINE_ACCOUNT.getStringValue();
			}else if(participantType.equalsIgnoreCase(InvoiceParticipantAccountType.NON_CASS_AGENT.toString())){
				participantTypeAsString = InvoiceParticipantAccountType.NON_CASS_AGENT.getStringValue();
			}else if(participantType.equalsIgnoreCase(InvoiceParticipantAccountType.REGIONAL_ACCOUNT.toString())){
				participantTypeAsString = InvoiceParticipantAccountType.REGIONAL_ACCOUNT.getStringValue();
			}else if(participantType.equalsIgnoreCase(InvoiceParticipantAccountType.SERVICE_FREIGHT.toString())){
				participantTypeAsString = InvoiceParticipantAccountType.SERVICE_FREIGHT.getStringValue();
			}else if(participantType.equalsIgnoreCase(InvoiceParticipantAccountType.STATION_ACCOUNT.toString())){
				participantTypeAsString = InvoiceParticipantAccountType.STATION_ACCOUNT.getStringValue();
			}
			else if(participantType.equalsIgnoreCase(InvoiceParticipantAccountType.GSA_RECEIVABLE.toString())){
				participantTypeAsString = InvoiceParticipantAccountType.GSA_RECEIVABLE.getStringValue();
			}
			else{
				this.setParticipantTypeAsString(participantType);
			}
		}
		return participantTypeAsString;
	}

	public void setParticipantTypeAsString(String participantTypeAsString) {
		this.participantTypeAsString = participantTypeAsString;
	}

	private String participantTypeForCountryAsString;
	
	public String getParticipantTypeForCountryAsString() {
		if(billingScheduleTypeAsSting!= null){
		if(participantTypeForCountry != null ){
		if(billingScheduleTypeAsSting.equalsIgnoreCase(CRABillingScheduleType.COUNTRY.getStringValue())){
			if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.COMMERCIAL_EXPORT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.COMMERCIAL_EXPORT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.COMMERCIAL_IMPORT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.COMMERCIAL_IMPORT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(CRAParticipantAccountType.COMMERCIAL.toString())){
				participantTypeForCountryAsString = CRAParticipantAccountType.COMMERCIAL.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.CASS_AGENT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.CASS_AGENT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.GENERAL_SALES_AGENTS.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.GENERAL_SALES_AGENTS.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.GOVERNMENT_ACCOUNT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.GOVERNMENT_ACCOUNT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.GROUND_HANDLING_AGENTS.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.GROUND_HANDLING_AGENTS.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.INTERLINE_ACCOUNT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.INTERLINE_ACCOUNT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.NON_CASS_AGENT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.NON_CASS_AGENT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.REGIONAL_ACCOUNT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.REGIONAL_ACCOUNT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.SERVICE_FREIGHT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.SERVICE_FREIGHT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.STATION_ACCOUNT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.STATION_ACCOUNT.getStringValue();
			}
			else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.GSA_RECEIVABLE.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.GSA_RECEIVABLE.getStringValue();
			}
			}
		else if(billingScheduleTypeAsSting.equalsIgnoreCase(CRABillingScheduleType.PARTICIPANT_ACCOUNT.getStringValue())){
				if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.COMMERCIAL_EXPORT.toString())){
					participantTypeForCountryAsString = InvoiceParticipantAccountType.COMMERCIAL_EXPORT.getStringValue();
				}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.COMMERCIAL_IMPORT.toString())){
					participantTypeForCountryAsString = InvoiceParticipantAccountType.COMMERCIAL_IMPORT.getStringValue();
				}else if(participantTypeForCountry.equalsIgnoreCase(CRAParticipantAccountType.COMMERCIAL.toString())){
					participantTypeForCountryAsString = CRAParticipantAccountType.COMMERCIAL.getStringValue();
				}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.CASS_AGENT.toString())){
					participantTypeForCountryAsString = InvoiceParticipantAccountType.CASS_AGENT.getStringValue();
				}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.GENERAL_SALES_AGENTS.toString())){
					participantTypeForCountryAsString = InvoiceParticipantAccountType.GENERAL_SALES_AGENTS.getStringValue();
				}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.GOVERNMENT_ACCOUNT.toString())){
					participantTypeForCountryAsString = InvoiceParticipantAccountType.GOVERNMENT_ACCOUNT.getStringValue();
				}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.GROUND_HANDLING_AGENTS.toString())){
					participantTypeForCountryAsString = InvoiceParticipantAccountType.GROUND_HANDLING_AGENTS.getStringValue();
				}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.INTERLINE_ACCOUNT.toString())){
					participantTypeForCountryAsString = InvoiceParticipantAccountType.INTERLINE_ACCOUNT.getStringValue();
				}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.NON_CASS_AGENT.toString())){
					participantTypeForCountryAsString = InvoiceParticipantAccountType.NON_CASS_AGENT.getStringValue();
				}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.REGIONAL_ACCOUNT.toString())){
					participantTypeForCountryAsString = InvoiceParticipantAccountType.REGIONAL_ACCOUNT.getStringValue();
				}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.SERVICE_FREIGHT.toString())){
					participantTypeForCountryAsString = InvoiceParticipantAccountType.SERVICE_FREIGHT.getStringValue();
				}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.STATION_ACCOUNT.toString())){
					participantTypeForCountryAsString = InvoiceParticipantAccountType.STATION_ACCOUNT.getStringValue();
				}
				else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.GSA_RECEIVABLE.toString())){
					participantTypeForCountryAsString = InvoiceParticipantAccountType.GSA_RECEIVABLE.getStringValue();
				}
			}
		else if(billingScheduleTypeAsSting.equalsIgnoreCase(CRABillingScheduleType.BILLING_GROUP.getStringValue())){
			if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.COMMERCIAL_EXPORT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.COMMERCIAL_EXPORT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.COMMERCIAL_IMPORT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.COMMERCIAL_IMPORT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(CRAParticipantAccountType.COMMERCIAL.toString())){
				participantTypeForCountryAsString = CRAParticipantAccountType.COMMERCIAL.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.CASS_AGENT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.CASS_AGENT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.GENERAL_SALES_AGENTS.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.GENERAL_SALES_AGENTS.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.GOVERNMENT_ACCOUNT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.GOVERNMENT_ACCOUNT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.GROUND_HANDLING_AGENTS.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.GROUND_HANDLING_AGENTS.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.INTERLINE_ACCOUNT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.INTERLINE_ACCOUNT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.NON_CASS_AGENT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.NON_CASS_AGENT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.REGIONAL_ACCOUNT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.REGIONAL_ACCOUNT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.SERVICE_FREIGHT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.SERVICE_FREIGHT.getStringValue();
			}else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.STATION_ACCOUNT.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.STATION_ACCOUNT.getStringValue();
			}
			else if(participantTypeForCountry.equalsIgnoreCase(InvoiceParticipantAccountType.GSA_RECEIVABLE.toString())){
				participantTypeForCountryAsString = InvoiceParticipantAccountType.GSA_RECEIVABLE.getStringValue();
			}
		}
		}
		}
		return participantTypeForCountryAsString;
	}

	public void setParticipantTypeForCountryAsString(
			String participantTypeForCountryAsString) {
		this.participantTypeForCountryAsString = participantTypeForCountryAsString;
	}

	private String cassBillingPeriodName;

	private long cassBillingPeriodNumber;

	private String clearanceMonth;

	private Date clearancePeriodFromDate;

	private Date clearanceToDate;

	private String clearancePeriodType;

	private Date invoiceGenerationDate;

	private boolean error;

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public InvoiceFrequencyType getInvoiceFrequency() {
		return invoiceFrequency;
	}

	public void setInvoiceFrequency(InvoiceFrequencyType invoiceFrequency) {
		this.invoiceFrequency = invoiceFrequency;
	}

	public Date getScheduleFromDate() {
		return scheduleFromDate;
	}

	public void setScheduleFromDate(Date scheduleFromDate) {
		this.scheduleFromDate = scheduleFromDate;
	}

	public String getBillingScheduleType() {
		return billingScheduleType;
	}

	public void setBillingScheduleType(String billingScheduleType) {
		this.billingScheduleType = billingScheduleType;
	}

	public String getBillingScheduleName() {
		return billingScheduleName;
	}

	public void setBillingScheduleName(String billingScheduleName) {
		this.billingScheduleName = billingScheduleName;
	}

	public String getCassBillingPeriodName() {
		return cassBillingPeriodName;
	}

	public void setCassBillingPeriodName(String cassBillingPeriodName) {
		this.cassBillingPeriodName = cassBillingPeriodName;
	}

	public long getCassBillingPeriodNumber() {
		return cassBillingPeriodNumber;
	}

	public void setCassBillingPeriodNumber(long cassBillingPeriodNumber) {
		this.cassBillingPeriodNumber = cassBillingPeriodNumber;
	}

	public String getClearanceMonth() {
		return clearanceMonth;
	}

	public void setClearanceMonth(String clearanceMonth) {
		this.clearanceMonth = ContractUtility.convertToUpperCase(clearanceMonth);
	}

	public Date getClearancePeriodFromDate() {
		return ContractUtility.getClonedDate(clearancePeriodFromDate); 
	}

	public void setClearancePeriodFromDate(Date clearancePeriodFromDate) {
		this.clearancePeriodFromDate = ContractUtility.getClonedDate(clearancePeriodFromDate);
	}

	public Date getClearanceToDate() {
		return ContractUtility.getClonedDate(clearanceToDate); 
	}

	public void setClearanceToDate(Date clearanceToDate) {
		this.clearanceToDate = ContractUtility.getClonedDate(clearanceToDate); 
	}

	public String getClearancePeriodType() {
		return clearancePeriodType;
	}

	public void setClearancePeriodType(String clearancePeriodType) {
		this.clearancePeriodType = clearancePeriodType;
	}

	public Date getInvoiceGenerationDate() {
		return ContractUtility.getClonedDate(invoiceGenerationDate); 
	}

	public void setInvoiceGenerationDate(Date invoiceGenerationDate) {
		this.invoiceGenerationDate =ContractUtility.getClonedDate(invoiceGenerationDate); 
	}

	public Date getScheduleToDate() {
		return ContractUtility.getClonedDate(scheduleToDate); 
	}

	public void setScheduleToDate(Date scheduleToDate) {
		this.scheduleToDate = ContractUtility.getClonedDate(scheduleToDate); 
	}

	public ActionType getActionType() {
		return actionType;
	}

	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}

	public String getParticipantType() {
		if(this.participantType!=null && (this.billingScheduleType!=null) && 
				(this.billingScheduleType.equals(CRABillingScheduleType.COUNTRY.toString())||this.billingScheduleType.equals(CRABillingScheduleType.AGGREGATE.toString())
						||this.billingScheduleType.equals(CRABillingScheduleType.PARTICIPANT_ACCOUNT.toString())||this.billingScheduleType.equals(CRABillingScheduleType.SYSTEM.toString())||this.billingScheduleType.equals(CRABillingScheduleType.STATION.toString())
						||this.billingScheduleType.equals(CRABillingScheduleType.BILLING_GROUP.toString())))
		{
		participantType = this.participantType.toUpperCase();
		}
		return participantType;
	}

	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}
	
	


	/**
	 * @return the participantTypeForCountry
	 */
	public String getParticipantTypeForCountry() {
		return participantTypeForCountry;
	}

	/**
	 * @param participantTypeForCountry the participantTypeForCountry to set
	 */
	public void setParticipantTypeForCountry(String participantTypeForCountry) {
		this.participantTypeForCountry = participantTypeForCountry;
	}

	public BillingSchedulesDto(String participantType,
			InvoiceFrequencyType invoiceFrequency) {
		super();
		this.participantType = participantType;
		this.invoiceFrequency = invoiceFrequency;
	}

	public BillingSchedulesDto() {
		super();
	}

	@Override
	public boolean equals(Object comparedTo) {
		BillingSchedulesDto bsComparedTo = (BillingSchedulesDto) comparedTo;
		if (this.billingScheduleType.toString().equals(
				bsComparedTo.billingScheduleType.toString())) {
			if (this.invoiceFrequency.toString().equals(
					bsComparedTo.invoiceFrequency.toString())
					&& !this.invoiceFrequency.toString().equals(
							InvoiceFrequencyType.DAILY.toString())) {
				if (this.participantType != null
						&& this.participantType
								.equals(bsComparedTo.participantType)
						&& !this.participantType.toString().equals(
								CRAParticipantAccountType.INTERLINE_ACCOUNT
										.toString())) {
					if (this.scheduleFromDate != null
							&& this.scheduleToDate != null
							&& this.scheduleFromDate
									.compareTo(bsComparedTo.scheduleFromDate) == 0
							&& this.scheduleToDate
									.compareTo(bsComparedTo.scheduleToDate) == 0) {
						return true;
					}

				} else if (this.participantType == null
						&& this.billingScheduleType.toString().equals(
								CRABillingScheduleType.SYSTEM.toString())) {
					if (this.scheduleFromDate != null
							&& this.scheduleToDate != null
							&& this.scheduleFromDate
									.compareTo(bsComparedTo.scheduleFromDate) == 0
							&& this.scheduleToDate
									.compareTo(bsComparedTo.scheduleToDate) == 0) {
						return true;
					}
				} else if (this.clearanceMonth != null
						&& this.clearancePeriodFromDate != null
						&& this.clearanceToDate != null
						&& this.clearanceMonth
								.equals(bsComparedTo.clearanceMonth)
						&& this.clearancePeriodFromDate
								.compareTo(bsComparedTo.clearancePeriodFromDate) == 0
						&& this.clearanceToDate
								.compareTo(bsComparedTo.clearanceToDate) == 0) {
					return true;
				}
			} else if (this.invoiceFrequency.toString().equals(
					bsComparedTo.invoiceFrequency.toString())
					&& this.invoiceFrequency.toString().equals(
							InvoiceFrequencyType.DAILY.toString())
					&& this.participantType != null
					&& this.participantType
							.equals(bsComparedTo.participantType)) {

				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {

		final StringBuffer csvString = new StringBuffer();
		if (this.actionType != null && this.actionType.equals(ActionType.FIND)) {
			if (this.participantType != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.getParticipantType()));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			if (this.invoiceFrequency != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.getInvoiceFrequency().getName()));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		} else {

			if (this.billingScheduleType != null) {
				csvString.append(this
						.prefixSuffixByQuotes(this.billingScheduleType));

			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}

			if (this.participantType != null) {

				csvString.append(this.prefixSuffixByQuotes(ContractUtility.
				                convertToUpperCase(this.getParticipantType())));
						
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			if (this.getInvoiceFrequency() != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.getInvoiceFrequency().getName()));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}

			if (this.scheduleFromDate != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.dateToString(this.getScheduleFromDate())));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			if (this.scheduleToDate != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.dateToString(this.getScheduleToDate())));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			if (this.clearancePeriodType != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.getClearancePeriodType()));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			if (this.clearanceMonth != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.getClearanceMonth().toUpperCase()));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			if (this.clearancePeriodFromDate != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.dateToString(this.clearancePeriodFromDate)));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			if (this.clearanceToDate != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.dateToString(this.clearanceToDate)));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
			if (this.invoiceGenerationDate != null) {
				csvString.append(this.prefixSuffixByQuotes(this
						.dateToString(invoiceGenerationDate)));
			} else {
				csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			}
		}
		return csvString.toString();
	}

	private String dateToString(final Date pDate) {
		final Format aSimpleDateFormat = new SimpleDateFormat(
				FrameworkConstants.DATEFORMAT, Locale.UK);
		return ContractUtility.convertToUpperCase(aSimpleDateFormat
				.format(pDate));
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

	@Override
	public Long getOId() {
		return oId;
	}

	public void setOId(Long oId) {
		this.oId = oId;
	}

	/**
	 * @return the specificAirline
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}

	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
	
	public InvoiceStatusType getInvoiceStatus() {
        return this.invoiceStatus;
    }
	
	public void setInvoiceStatus(final InvoiceStatusType pInvoiceStatus) {
        this.invoiceStatus = pInvoiceStatus;
    }
	
	
}
