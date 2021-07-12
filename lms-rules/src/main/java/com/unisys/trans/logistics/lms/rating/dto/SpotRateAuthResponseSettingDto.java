package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class SpotRateAuthResponseSettingDto implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 849332238967088938L;

    private String authCode;

    private String officeCode;

    private Long oId;

    private String reasonCode;

    private String stationCode;

    /**
     * @return the authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return the officeCode
     */
    public String getOfficeCode() {
        return this.officeCode;
    }

    public Long getoId() {
        return this.oId;
    }

    /**
     * @return the reasonCode
     */
    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * @return the stationCode
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * @param authCode the authCode to set
     */
    public void setAuthCode(String pAuthCode) {
        this.authCode = ContractUtility.convertToUpperCase(pAuthCode);
    }

    /**
     * @param officeCode the officeCode to set
     */
    public void setOfficeCode(String pOfficeCode) {
        this.officeCode = ContractUtility.convertToUpperCase(pOfficeCode);
    }

    public void setoId(Long pOId) {
        this.oId = pOId;
    }

    /**
     * @param reasonCode the reasonCode to set
     */
    public void setReasonCode(String pReasonCode) {
        this.reasonCode = pReasonCode;
    }

    /**
     * @param stationCode the stationCode to set
     */
    public void setStationCode(String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

}
