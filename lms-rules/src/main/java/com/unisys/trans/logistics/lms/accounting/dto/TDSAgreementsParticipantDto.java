package com.unisys.trans.logistics.lms.accounting.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;
import com.unisys.trans.logistics.lms.framework.utility.StringUtility;
import org.apache.commons.collections.CollectionUtils;

public class TDSAgreementsParticipantDto extends PersistenceObjectDto{
	
	private static final long serialVersionUID = 1L;
	private Long oId;
	private String participantName;
	private String participantAccount;
	private String stationCode;
	private String state;
	private String country;
	
	private List<ParticipantAgreementsDetailDto> participantAgreementsDetailDto;
	
	
	public Long getOId() {
		return this.oId;
	}
    public void setOId(Long oId) {
		this.oId = oId;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public String getParticipantAccount() {
		return participantAccount;
	}
	public void setParticipantAccount(String participantAccount) {
		this.participantAccount = participantAccount;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public List<ParticipantAgreementsDetailDto> getParticipantAgreementsDetailDto() {
		return participantAgreementsDetailDto;
	}
	public void setParticipantAgreementsDetailDto(List<ParticipantAgreementsDetailDto> participantAgreementsDetailDto) {
		this.participantAgreementsDetailDto = participantAgreementsDetailDto;
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

	public String toString() {
		final StringBuilder csvString = new StringBuilder();
		final String EMPTY_STRING = "";
		final String NEW_LINE = "\n";
		boolean isFirstRecord = true;
		if (this.getParticipantAgreementsDetailDto() != null && CollectionUtils.isNotEmpty(this.getParticipantAgreementsDetailDto())) {
			for (ParticipantAgreementsDetailDto agreementDetails : this.getParticipantAgreementsDetailDto()) {
				if(! isFirstRecord)
					csvString.append(NEW_LINE);

				if (agreementDetails.getAgreementType() != null) {
					csvString.append(this.prefixSuffixByQuotes(agreementDetails.getAgreementType().getParticipantAgreementName()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (agreementDetails.getAgreementId() != null) {
					csvString.append(this.prefixSuffixByQuotes(agreementDetails.getAgreementId()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (this.getParticipantName() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getParticipantName()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (this.getParticipantAccount() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getParticipantAccount()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (this.getStationCode() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getStationCode()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (this.getState() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getState()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (this.getCountry() != null) {
					csvString.append(this.prefixSuffixByQuotes(this.getCountry()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (agreementDetails.getDateRangeDto() != null) {
					if (agreementDetails.getDateRangeDto().getEffectiveDate() != null) {
						csvString.append(this.prefixSuffixByQuotes(DateUtility.getDateAsString(agreementDetails.getDateRangeDto().getEffectiveDate())));
					} else {
						csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
					}
					if (agreementDetails.getDateRangeDto().getExpirationDate() != null) {
						csvString.append(this.prefixSuffixByQuotes(DateUtility.getDateAsString(agreementDetails.getDateRangeDto().getExpirationDate())));
					} else {
						csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
					}
				}

				if (agreementDetails.getExemptionLimit() != null) {
					csvString.append(this.prefixSuffixByQuotes(agreementDetails.getExemptionLimit().toString()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (agreementDetails.getCurrency() != null) {
					csvString.append(this.prefixSuffixByQuotes(agreementDetails.getCurrency()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (agreementDetails.getTdsPercentage() != null) {
					csvString.append(this.prefixSuffixByQuotes(agreementDetails.getTdsPercentage().toString()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (agreementDetails.getAvailableLimit() != null) {
					csvString.append(this.prefixSuffixByQuotes(agreementDetails.getAvailableLimit().toString()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (agreementDetails.getUserAudit() != null && agreementDetails.getUserAudit().getUserIdentifier() != null) {
					csvString.append(this.prefixSuffixByQuotes(agreementDetails.getUserAudit().getUserIdentifier()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (agreementDetails.getUserAudit() != null && agreementDetails.getUserAudit().getCreatedOn() != null) {
					DateFormat df = new SimpleDateFormat("ddMMMyy hh:mm:ss");
					Date lastUpdatedDateTime = agreementDetails.getUserAudit().getCreatedOn();
					csvString.append(this.prefixSuffixByQuotes(df.format(lastUpdatedDateTime)));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}

				if (agreementDetails.getRemarks() != null) {
					csvString.append(this.prefixSuffixByQuotes(agreementDetails.getRemarks()));
				} else {
					csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
				}
				isFirstRecord = false;
			}
		}
		return csvString.toString();
	}
	

}
