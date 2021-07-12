package com.unisys.trans.logistics.lms.awb.dto;

import java.io.Serializable;

public class InterlineCarrierDto implements Serializable{
 
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    
    private String interlineCarrierCode;

    public String getInterlineCarrierCode() {
        return this.interlineCarrierCode;
    }

    public void setInterlineCarrierCode(String pInterlineCarrierCode) {
        this.interlineCarrierCode = pInterlineCarrierCode;
    }

}
