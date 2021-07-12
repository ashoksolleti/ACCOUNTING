package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class BrokerDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = -8636692168699379968L;

    private String accountNumber;

    private Boolean billBrokerIndicator;

    /**
     * Attribute to hold <code>freightParticipantOId</code> property.
     */
    private Long freightParticipantOId;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>station</code> property. Entered only if broker
     * account number is present. Else, prohibited. Must be validated against
     * the station and city table.
     */
    private String station;

    /**
     * <code>Default Constructor.</code>
     */
    public BrokerDto() {

    }

    @Override
    public Long getOId() {
        return null;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Boolean getBillBrokerIndicator() {
        return billBrokerIndicator;
    }

    public void setBillBrokerIndicator(Boolean billBrokerIndicator) {
        this.billBrokerIndicator = billBrokerIndicator;
    }

    public Long getFreightParticipantOId() {
        return freightParticipantOId;
    }

    public void setFreightParticipantOId(Long freightParticipantOId) {
        this.freightParticipantOId = freightParticipantOId;
    }

    public Long getoId() {
        return oId;
    }

    public void setoId(Long oId) {
        this.oId = oId;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

}
