package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

public class RatePerKiloLine implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -5384099762817165153L;

    private String rateIndicator;

    private String rcpIndicator;

    private RateClassType rateClass;

    public RateClassType getRateClass() {
        return this.rateClass;
    }

    public void setRateClass(RateClassType pRateClass) {
        this.rateClass = pRateClass;
    }

    public String getRateIndicator() {
        return this.rateIndicator;
    }

    public void setRateIndicator(String pRateIndicator) {
        this.rateIndicator = pRateIndicator;
    }

    public String getRcpIndicator() {
        return rcpIndicator;
    }

    public void setRcpIndicator(String rcpIndicator) {
        this.rcpIndicator = rcpIndicator;
    }
}
