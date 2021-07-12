package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ParticipantAccNumValidatorRequest extends AbstractRequest {
    /**
     * 
     */
    private static final long serialVersionUID = -8860831716995827446L;
    
    
    private String lmsDataBaseKey;
   
    
    /**
     * Attribute to hold the <code>Participant</code> <code>accountNumber</code> property. This field is
     * mandatory when participant name is not input. Billing or IATA account number is input.
     */
    private String accountNumber;
    
    
    private String accountNumber2;
    
    private String iataAccountNumber;
    

    public String getLmsDataBaseKey() {
        return this.lmsDataBaseKey;
    }


    public void setLmsDataBaseKey(final String pLmsDataBaseKey) {
        this.lmsDataBaseKey = pLmsDataBaseKey;
    }


    public String getAccountNumber() {
        return this.accountNumber;
    }


    public void setAccountNumber(final String pAccountNumber) {
        this.accountNumber = pAccountNumber;
    }


    public String getAccountNumber2() {
        return this.accountNumber2;
    }


    public void setAccountNumber2(final String pAccountNumber2) {
        this.accountNumber2 = pAccountNumber2;
    }


    public String getIataAccountNumber() {
        return this.iataAccountNumber;
    }


    public void setIataAccountNumber(final String pIataAccountNumber) {
        this.iataAccountNumber = pIataAccountNumber;
    }

   
}
