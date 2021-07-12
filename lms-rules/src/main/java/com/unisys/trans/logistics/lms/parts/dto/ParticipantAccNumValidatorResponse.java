package com.unisys.trans.logistics.lms.parts.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class ParticipantAccNumValidatorResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = -2686419852505916156L;
    
    /**
     * Attribute to hold <code>newParticipantAccount</code> property.
     */
    private List<String> newParticipantAccount;
    /**
     * Attribute to hold <code>contractAllowedIndicator</code> property. Flag to
     * indicate that contract exist for this participant.
     */
    private Boolean contractAllowedIndicator;
    
    private long contractCount;
    
    private long spotRateCount;
    
    private boolean isParticipantExists;


    public boolean isParticipantExists() {
        return isParticipantExists;
    }


    public void setParticipantExists(final boolean isParticipantExists) {
        this.isParticipantExists = isParticipantExists;
    }
    /**
     * Gets the list of String containing <code>ParticipantAccount</code> details.
     * <p>
     * 
     * @return the current value of <code>newParticipantAccount</code> details.<br>
     */
    public List<String> getNewParticipantAccount() {
        return this.newParticipantAccount;
    }

    /**
     * Sets the list of String containing <code>newParticipantAccount</code> details.
     * <p>
     * 
     * @param pNewParticipantAccount the new value of <code>newParticipantAccount</code> type details.
     */
    public void setNewParticipantAccount(final List<String> pNewParticipantAccount) {
        this.newParticipantAccount = pNewParticipantAccount;
    }
    /**
     * Gets the value of <code>contractAllowedIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Contract exists for this participant.<br>
     * <code>false</code> - Contract does not exist for this participant.
     * <p>
     * 
     * @return the current value of <code>contractAllowedIndicator</code>
     *         property.<br>
     */
    public Boolean getContractAllowedIndicator() {
        return this.contractAllowedIndicator;
    }
    /**
     * Sets the value of the <code>contractAllowedIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - Contract exist for this participant.<br>
     * <code>false</code> - Contract does not exist for this participant.<br>
     * <p>
     * 
     * @param pContractAllowedIndicator
     *            <code>Boolean</code><br>
     *            the new value of the <code>contractAllowedIndicator</code>
     *            property.<br>
     */
    public void setContractAllowedIndicator(
            final Boolean pContractAllowedIndicator) {
        this.contractAllowedIndicator = pContractAllowedIndicator;
    }


    public long getContractCount() {
        return contractCount;
    }


    public void setContractCount(long contractCount) {
        this.contractCount = contractCount;
    }


    public long getSpotRateCount() {
        return spotRateCount;
    }


    public void setSpotRateCount(long spotRateCount) {
        this.spotRateCount = spotRateCount;
    }


}
