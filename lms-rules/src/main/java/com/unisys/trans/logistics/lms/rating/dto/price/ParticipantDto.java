package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantAccountType;

public class ParticipantDto implements Serializable {
	@Override
	public String toString() {
		String participantDto = new String();
		participantDto = "participantDto ::: " + "role : " + role + "accountNumber : " + accountNumber
				+ "groupsForParticipant :" + groupsForParticipant + "accountNumberType :" + accountNumberType
				+ "groupIndicator :" + groupIndicator + "participantIndex :" + participantIndex + "accountNumber2 :"
				+ accountNumber2 + "accountNumber3 :" + accountNumber3 + "caccNumbers :" + caccNumbers
				+ "skipContractSRASearch :" + skipContractSRASearch + " responsibleIndcator :" + responsibleIndcator
				+ "priorityIndicator :" + priorityIndicator + "participantCode :" + participantCode
				+ "responsibleParty :" + responsibleParty + "contractAllowed :" + contractAllowed;
		return participantDto;
	}

    /**
     * 
     */
    private static final long serialVersionUID = 6968168422411487941L;

    /**
     * Role of the Participant (S - Shipper, A - Agent, C - Consignee etc)
     */
    private String role;

    /**
     * Participant Account Number
     */
    private String accountNumber;

    /**
     * Participant Groups for the Participant
     */
    private Set<String> groupsForParticipant;

    public Set<String> getGroupsForParticipant() {
        return groupsForParticipant;
    }

    public void setGroupsForParticipant(final Set<String> pGroupsForParticipant) {
        this.groupsForParticipant = pGroupsForParticipant;
    }

    private int participantIndex;

    public int getParticipantIndex() {
        return this.participantIndex;
    }

    public void setParticipantIndex(final int pParticipantIndex) {
        this.participantIndex = pParticipantIndex;
    }

    private ParticipantAccountType accountNumberType;

    private boolean groupIndicator;

    public boolean getGroupIndicator() {
        return this.groupIndicator;
    }

    public void setGroupIndicator(final boolean pGroupIndicator) {
        this.groupIndicator = pGroupIndicator;
    }

    public ParticipantAccountType getAccountNumberType() {
        return this.accountNumberType;
    }

    public void setAccountNumberType(
            final ParticipantAccountType pAccountNumberType) {
        this.accountNumberType = pAccountNumberType;
    }

    private String accountNumber2;

    private String accountNumber3;
    
    private List<String> caccNumbers;

    public boolean add(String pCacc) {
        
        if(caccNumbers == null) {
            
            caccNumbers = new ArrayList<String>();
        }
        return caccNumbers.add(pCacc);
    }

    public List<String> getCaccNumbers() {
        return caccNumbers;
    }

    public void setCaccNumbers(List<String> caccNumbers) {
        this.caccNumbers = caccNumbers;
    }

    public String getAccountNumber2() {
        return this.accountNumber2;
    }

    public void setAccountNumber2(final String pAccountNumber2) {
        this.accountNumber2 = pAccountNumber2;
    }

    public String getAccountNumber3() {
        return this.accountNumber3;
    }

    public void setAccountNumber3(final String pAccountNumber3) {
        this.accountNumber3 = pAccountNumber3;
    }

    /**
     * Indicator set if the contracts / SRAs are to be skipped during search
     */
    private boolean skipContractSRASearch;

    private boolean responsibleIndcator;

    private boolean priorityIndicator;

    private String participantCode;

    private String responsibleParty;
    
    private boolean contractAllowed;

    public boolean isContractAllowed() {
        return contractAllowed;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getParticipantCode() {
        return this.participantCode;
    }

    public String getResponsibleParty() {
        return this.responsibleParty;
    }

    public String getRole() {
        return this.role;
    }

    public boolean isPriorityIndicator() {
        return this.priorityIndicator;
    }

    public boolean isResponsibleIndcator() {
        return this.responsibleIndcator;
    }

    public boolean isSkipContractSRASearch() {
        return this.skipContractSRASearch;
    }

    public void setAccountNumber(final String pAccountNumber) {
        this.accountNumber = pAccountNumber;
    }

    public void setParticipantCode(final String pParticipantCode) {
        this.participantCode = pParticipantCode;
    }

    public void setPriorityIndicator(final boolean pPriorityIndicator) {
        this.priorityIndicator = pPriorityIndicator;
    }

    public void setResponsibleIndcator(final boolean pResponsibleIndcator) {
        this.responsibleIndcator = pResponsibleIndcator;
    }

    public void setResponsibleParty(final String pResponsibleParty) {
        this.responsibleParty = pResponsibleParty;
    }

    public void setRole(final String pRole) {
        this.role = pRole;
    }

    public void setSkipContractSRASearch(final boolean pSkipContractSRASearch) {
        this.skipContractSRASearch = pSkipContractSRASearch;
    }

    public String getParticipantAccountNumber() {
        String participantAccountNumber = null;
        if (!this.isEmpty(this.getAccountNumber())) {
            participantAccountNumber = this.getAccountNumber();
        } else if (!this.isEmpty(this.getAccountNumber2())) {
            participantAccountNumber = this.getAccountNumber2();
        } else if (!this.isEmpty(this.getAccountNumber3())) {
            participantAccountNumber = this.getAccountNumber3();
        }
        return participantAccountNumber;
    }

    private boolean isEmpty(final String pAccountNumber) {
        return pAccountNumber == null || pAccountNumber.trim().isEmpty();
    }

    public void setContractAllowed(boolean contractAllowed) {
       this.contractAllowed = contractAllowed;
        
    }
    
    
    private String skipIndicators;

    public String getSkipIndicators() {
        return skipIndicators;
    }

    public void setSkipIndicators(final String pSkipIndicators) {
        this.skipIndicators = pSkipIndicators;
    }
}
