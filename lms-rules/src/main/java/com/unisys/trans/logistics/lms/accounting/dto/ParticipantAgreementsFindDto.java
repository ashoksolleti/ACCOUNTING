package com.unisys.trans.logistics.lms.accounting.dto;


import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ParticipantAgreementType;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.RequestHeader;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

public class ParticipantAgreementsFindDto extends PersistenceObjectDto{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long oId;
    private ParticipantAgreementType agreementType;
    private String participantName;
    private String stationCode;
    private String accountNumber;
    
    private String accountSearch;
    
    private List<SelectItem> accountSearchList=new ArrayList<SelectItem>();
    
    private String state;
    private String country;
    
    private DateRangeDto dateRangeDto;
    
    private boolean downloadAll;
    
	private ActionType actionType;
	private RequestHeader requestHeader;
	
	

    @Override
	public Long getOId() {
		return oId;
	}
    public void setOId(Long oId) {
		this.oId = oId;
	}

	public ParticipantAgreementType getAgreementType() {
		return agreementType;
	}

	public void setAgreementType(ParticipantAgreementType agreementType) {
		this.agreementType = agreementType;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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

	public DateRangeDto getDateRangeDto() {
		return dateRangeDto;
	}

	public void setDateRangeDto(DateRangeDto dateRangeDto) {
		this.dateRangeDto = dateRangeDto;
	}

	public boolean isDownloadAll() {
		return downloadAll;
	}

	public void setDownloadAll(boolean downloadAll) {
		this.downloadAll = downloadAll;
	}
    
	/**
     * Constant to hold string "A".<br>
     */
    private static final String STRING_A_LITERAL = "A";

    /**
     * Constant to hold string "I".<br>
     */
    private static final String STRING_I_LITERAL = "I";
	/**
	 * @return the accountSearchList
	 */
	public List<SelectItem> getAccountSearchList() {
		
		if(this.accountSearchList.isEmpty())
        {         
            this.accountSearchList.add(new SelectItem("", ""));
                    this.accountSearchList.add(new SelectItem(STRING_A_LITERAL, "Account Number"));
                    this.accountSearchList.add(new SelectItem(STRING_I_LITERAL, "IATA Number"));
        }
        return accountSearchList;
	}
	/**
	 * @param accountSearchList the accountSearchList to set
	 */
	public void setAccountSearchList(List<SelectItem> accountSearchList) {
		this.accountSearchList = accountSearchList;
	}
	public ActionType getActionType() {
		return actionType;
	}

	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}
    
	
	public RequestHeader getRequestHeader() {
		return requestHeader;
	}
	public void setRequestHeader(RequestHeader requestHeader) {
		this.requestHeader = requestHeader;
	}
	public String getAccountSearch() {
		return accountSearch;
	}
	public void setAccountSearch(String accountSearch) {
		this.accountSearch = accountSearch;
	}

	@Override
    public String toString() {
        final StringBuilder csvString = new StringBuilder();
        final String EMPTY_STRING = "";

        if (this.getAgreementType() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAgreementType().getParticipantAgreementName()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getParticipantName() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getParticipantName()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getStationCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getStationCode()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getAccountNumber() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAccountNumber()));
        } else {
            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }


        if (this.getAccountSearch() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAccountSearch()));
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
