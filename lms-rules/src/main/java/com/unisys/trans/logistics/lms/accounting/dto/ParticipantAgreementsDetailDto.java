package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ParticipantAgreementType;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

public class ParticipantAgreementsDetailDto extends PersistenceObjectDto{

	private static final long serialVersionUID = 1L;
    private Long OId;
	private String agreementId;
	private ParticipantAgreementType agreementType;
	private String country;
	private String currency;
	private String remarks;
	
	private String participantAccount;
	//To store effective date and expiration date
	private DateRangeDto dateRangeDto;
	
	private BigDecimal exemptionLimit;	
	private BigDecimal availableLimit;
	
	private BigDecimal tdsPercentage;
	
	private UserAuditDto userAudit;
	
	private boolean create = false;

    private boolean delete = false;

    private boolean update = false;

    private boolean inter = false;

    private boolean error;
    
    private int versionIdentifier = 0;
    
    private String specificAirline;
    
    private String inputText;   
    
    private String agreementTypeAsString;    
    
    private boolean checkEffDateOnUpdate = false;   
	
	/**
	 * @return the checkEffDateOnUpdate
	 */
	public boolean isCheckEffDateOnUpdate() {
		return checkEffDateOnUpdate;
	}
	/**
	 * @param checkEffDateOnUpdate the checkEffDateOnUpdate to set
	 */
	public void setCheckEffDateOnUpdate(boolean checkEffDateOnUpdate) {
		this.checkEffDateOnUpdate = checkEffDateOnUpdate;
	}
	/**
	 * @return the agreementTypeAsString
	 */
	public String getAgreementTypeAsString() {
		if(agreementType!=null) {
			if(agreementType.equals(ParticipantAgreementType.EXCEMPTED_TDS)){
				agreementTypeAsString = ParticipantAgreementType.EXCEMPTED_TDS.value();
			}else if(agreementType.equals(ParticipantAgreementType.TAX_DEDUCTED_AT_SOURCE_TDS)){
				agreementTypeAsString = ParticipantAgreementType.TAX_DEDUCTED_AT_SOURCE_TDS.value();
			}
		}
		return agreementTypeAsString;
	}
	/**
	 * @param agreementTypeAsString the agreementTypeAsString to set
	 */
	public void setAgreementTypeAsString(String agreementTypeAsString) {
		this.agreementTypeAsString = agreementTypeAsString;
	}
	/**
	 * @return the inputText
	 */
	public String getInputText() {
		return inputText;
	}
	/**
	 * @param inputText the inputText to set
	 */
	public void setInputText(String inputText) {
		this.inputText = inputText;
	}
	public String getSpecificAirline() {
		return specificAirline;
	}
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
	public Long getOId() {
	        return OId;
	    }
	 public void setOId(Long oId) {
	        OId = oId;
	    }
	public String getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public ParticipantAgreementType getAgreementType() {
		return agreementType;
	}

	public void setAgreementType(ParticipantAgreementType agreementType) {
		this.agreementType = agreementType;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public DateRangeDto getDateRangeDto() {
		if (this.dateRangeDto == null) {
            dateRangeDto = new DateRangeDto();
        }
		return dateRangeDto;
	}

	public void setDateRangeDto(DateRangeDto dateRangeDto) {
		this.dateRangeDto = dateRangeDto;
	}

	public BigDecimal getExemptionLimit() {
		return exemptionLimit;
	}

	public void setExemptionLimit(BigDecimal exemptionLimit) {
		this.exemptionLimit = exemptionLimit;
	}

	public BigDecimal getAvailableLimit() {
		return availableLimit;
	}

	public void setAvailableLimit(BigDecimal availableLimit) {
		this.availableLimit = availableLimit;
	}

	public BigDecimal getTdsPercentage() {
		return tdsPercentage;
	}

	public void setTdsPercentage(BigDecimal tdsPercentage) {
		this.tdsPercentage = tdsPercentage;
	}

	public UserAuditDto getUserAudit() {
		return userAudit;
	}

	public void setUserAudit(UserAuditDto userAudit) {
		this.userAudit = userAudit;
	}
	public boolean isCreate() {
		return create;
	}
	public void setCreate(boolean create) {
		this.create = create;
	}
	public boolean isDelete() {
		return delete;
	}
	public void setDelete(boolean delete) {
		this.delete = delete;
	}
	public boolean isUpdate() {
		return update;
	}
	public void setUpdate(boolean update) {
		this.update = update;
	}
	public boolean isInter() {
		return inter;
	}
	public void setInter(boolean inter) {
		this.inter = inter;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public int getVersionIdentifier() {
		return versionIdentifier;
	}
	public void setVersionIdentifier(int versionIdentifier) {
		this.versionIdentifier = versionIdentifier;
	}
	public String getParticipantAccount() {
		return participantAccount;
	}
	public void setParticipantAccount(String participantAccount) {
		this.participantAccount = participantAccount;
	}

	public String toString() {
		final StringBuilder csvString = new StringBuilder();
		final String EMPTY_STRING = "";

				if (this.getAgreementType() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getAgreementType().getParticipantAgreementName()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (this.getAgreementId() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getAgreementId()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
				if (this.getCountry() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getCountry()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (this.getDateRangeDto() != null) {
					if (this.getDateRangeDto().getEffectiveDate() != null) {
						csvString.append(this.prefixSuffixByQuotes(DateUtility.getDateAsString(this.getDateRangeDto().getEffectiveDate())));
					} else {
						csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
					}
					if (this.getDateRangeDto().getExpirationDate() != null) {
						csvString.append(this.prefixSuffixByQuotes(DateUtility.getDateAsString(this.getDateRangeDto().getExpirationDate())));
					} else {
						csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
					}
				}

				if (this.getExemptionLimit() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getExemptionLimit().toString()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (this.getCurrency() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getCurrency()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (this.getTdsPercentage() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getTdsPercentage().toString()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (this.getAvailableLimit() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getAvailableLimit().toString()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (this.getUserAudit() != null && this.getUserAudit().getUserIdentifier() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getUserAudit().getUserIdentifier()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (this.getUserAudit() != null && this.getUserAudit().getCreatedOn() != null) {
					DateFormat df = new SimpleDateFormat("ddMMMyy hh:mm:ss");
					Date lastUpdatedDateTime = this.getUserAudit().getCreatedOn();
					csvString.append(this.prefixSuffixByQuotes(df.format(lastUpdatedDateTime)));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (this.getRemarks() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getRemarks()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}


		return csvString.toString();
	}

	/**
	 * prefixes and suffixes a given string with open quotes.
	 *
	 * @param pString
	 *            the new value of the <code>value</code>.
	 *
	 * @return aModifiedString the new value of the <code>aModifiedString</code>.
	 *
	 *
	 */
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
