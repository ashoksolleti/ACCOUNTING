package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum CarrierRequestType {

    ACN("A"),
    CARRIER("C");

    private String carrierRequestType;

    CarrierRequestType(final String pCarrierRequestType) {
        this.carrierRequestType = pCarrierRequestType;
    }

    public String getCarrierRequestType() {
        return this.carrierRequestType;
    }

    public void setCarrierRequestType(final String pCarrierRequestType) {
        this.carrierRequestType = pCarrierRequestType;
    }

    /**
     * The <code>value</code> method returns the string value of <code>CarrierRequestType</code>.
     * <p>
     * 
     * @return the current enumerated value of the <code>CarrierRequestType</code>.<br>
     */
    public String value() {
        return this.getCarrierRequestType();
    }
}
