package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class SpotRateAuthorizationSettingDto implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = -5523128564774821755L;

    /**
     * Destination
     */
    private String destination;

    /**
     * OId
     */
    private Long oId;

    /**
     * Origin
     */
    private String origin;

    /**
     * Participant Setting
     */
    private String participantSetting;

    /**
     * Queue Office
     */
    private String queueOffice;

    /**
     * Queue Station
     */
    private String queueStation;

    /**
     * Reason Code
     */
    private String reasonCode;

    /**
     * Routing
     */
    private String routing;

    /**
     * SignIn Station
     */
    private String signInStation;

    /**
     * Version
     */
    private Long version;

    public String getDestination() {
        return this.destination;
    }

    public Long getoId() {
        return this.oId;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getParticipantSetting() {
        return this.participantSetting;
    }

    public String getQueueOffice() {
        return this.queueOffice;
    }

    public String getQueueStation() {
        return this.queueStation;
    }

    public String getReasonCode() {
        return this.reasonCode;
    }

    public String getRouting() {
        return this.routing;
    }

    public String getSignInStation() {
        return this.signInStation;
    }

    public Long getVersion() {
        return this.version;
    }

    public void setDestination(String pDestination) {
        this.destination = ContractUtility.convertToUpperCase(pDestination);
    }

    public void setoId(Long pOId) {
        this.oId = pOId;
    }

    public void setOrigin(String pOrigin) {
        this.origin = ContractUtility.convertToUpperCase(pOrigin);
    }

    public void setParticipantSetting(String pParticipantSetting) {
        this.participantSetting = ContractUtility.convertToUpperCase(pParticipantSetting);
    }

    public void setQueueOffice(String pQueueOffice) {
        this.queueOffice = ContractUtility.convertToUpperCase(pQueueOffice);
    }

    public void setQueueStation(String pQueueStation) {
        this.queueStation = ContractUtility.convertToUpperCase(pQueueStation);
    }

    public void setReasonCode(String pReasonCode) {
        this.reasonCode = pReasonCode;
    }

    public void setRouting(String pRouting) {
        this.routing = ContractUtility.convertToUpperCase(pRouting);
    }

    public void setSignInStation(String pSignInStation) {
        this.signInStation = ContractUtility.convertToUpperCase(pSignInStation);
    }

    public void setVersion(Long pVersion) {
        this.version = pVersion;
    }

}
