package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class ManualAdjustmentFindRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public String getName() {
        return this.name;
    }

    public void setName(final String pName) {
        this.name = ContractUtility.convertToUpperCase(pName);
    }

    public String getStation() {
        return this.station;
    }

    private String name;

    private String station;

    private ParticipantAccountType accountType;

    public ParticipantAccountType getAccountType() {
        return this.accountType;
    }

    public void setAccountType(final ParticipantAccountType pAccountType) {
        this.accountType = pAccountType;
    }

    public void setStation(final String pStation) {
        this.station = ContractUtility.convertToUpperCase(pStation);
    }

    private String participantNumber;

	private String specificAirline;

    public String getParticipantNumber() {
        return this.participantNumber;
    }

    public void setParticipantNumber(final String pParticipantNumber) {
        this.participantNumber = ContractUtility.convertToUpperCase(pParticipantNumber);
    }
    
	public String getSpecificAirline() {
		
		return specificAirline;
	}

	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
    

}
