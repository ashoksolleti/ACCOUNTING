package com.unisys.trans.logistics.lms.utils.dto;

public class StationCustomsDto {

    private String address;

    private String firmsCode;

    private String handlerEORI;

    private String handlerName;

    private Float percentInspected;

    private String phone;

    private String portNumber;

    private String ssdPrinterId;

    private String ssdScreeningMethod;

    private String teleType;

    private Boolean teleTypeUsed;

    public String getAddress() {
        return this.address;
    }

    public String getFirmsCode() {
        return this.firmsCode;
    }

    public String getHandlerEORI() {
        return this.handlerEORI;
    }

    public String getHandlerName() {
        return this.handlerName;
    }

    public Float getPercentInspected() {
        return this.percentInspected;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getPortNumber() {
        return this.portNumber;
    }

    public String getSsdPrinterId() {
        return this.ssdPrinterId;
    }

    public String getSsdScreeningMethod() {
        return this.ssdScreeningMethod;
    }

    public String getTeleType() {
        return this.teleType;
    }

    public Boolean getTeleTypeUsed() {
        return this.teleTypeUsed;
    }

    public void setAddress(final String pAddress) {
        this.address = pAddress;
    }

    public void setFirmsCode(final String pFirmsCode) {
        this.firmsCode = pFirmsCode;
    }

    public void setHandlerEORI(final String pHandlerEORI) {
        this.handlerEORI = pHandlerEORI;
    }

    public void setHandlerName(final String pHandlerName) {
        this.handlerName = pHandlerName;
    }

    public void setPercentInspected(final Float pPercentInspected) {
        this.percentInspected = pPercentInspected;
    }

    public void setPhone(final String pPhone) {
        this.phone = pPhone;
    }

    public void setPortNumber(final String pPortNumber) {
        this.portNumber = pPortNumber;
    }

    public void setSsdPrinterId(final String pSsdPrinterId) {
        this.ssdPrinterId = pSsdPrinterId;
    }

    public void setSsdScreeningMethod(final String pSsdScreeningMethod) {
        this.ssdScreeningMethod = pSsdScreeningMethod;
    }

    public void setTeleType(final String pTeleType) {
        this.teleType = pTeleType;
    }

    public void setTeleTypeUsed(final Boolean pTeleTypeUsed) {
        this.teleTypeUsed = pTeleTypeUsed;
    }

}
