package com.unisys.trans.logistics.lms.framework.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.constants.SecurityDeclarationType;
import com.unisys.trans.logistics.lms.framework.dto.constants.SecurityStatusType;
import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class SecurityDeclarationDto extends PersistenceObjectDto {

    /**
     * Attribute to hold <code>awbIdentifier</code> property.
     */
    private AirWaybillNumberDto awbIdentifier;

    /**
     * Attribute to hold validation warnings provided by various worker classes.
     */
    private List<CodeMessage> codeMessages;

    /**
     * Attribute to hold <code>dBkey</code> property.
     */
    private String dBkey;

    /**
     * Attribute to hold <code>iACNumber</code> property.
     */
    private Date iACExpiryDate;

    /**
     * Attribute to hold <code>iACNumber</code> property.
     */
    private String iACNumber;

    /**
     * Attribute to hold <code>adminName</code> property.
     */
    private String nameOfApprover;

    /**
     * Attribute to hold <code>userName</code> property.
     */
    private String nameOfCapturer;

    /**
     * Attribute to hold <code>oId</code>AirWaybill Unique Key property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>oId</code>phoneNoOfCapturer property.
     */
    private String phoneNoOfCapturer;

    /**
     * Attribute to hold <code></code> property.
     */
    private SecurityDeclarationType securityDeclarationType;

    /**
     * Attribute to hold <code>securityStatus</code> property.
     */
    private String securityStatus;

    /**
     * Attribute to hold <code>securityStatusType</code> property.
     */
    private SecurityStatusType securityStatusType;

    /**
     * Attribute to hold <code>securityTimeStamp</code> property.
     */
    private Date securityTimeStamp;

    /**
     * Attribute to hold <code>adminId</code> property.
     */
    private String userIdOfApprover;

    /**
     * Attribute to hold <code>userIdOfCapturer</code> property.
     */
    private String userIdOfCapturer;

    /**
     * Attribute to hold <code>wayBillString</code> property.
     */
    private String wayBillString;

    /**
     * Gets the <code>awbIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbIdentifier</code> property.<br>
     */
    public AirWaybillNumberDto getAwbIdentifier() {
        return this.awbIdentifier;
    }

    /**
     * Gets the <code>codeMessages</code> property.
     * <p>
     * 
     * @return the current value of the <code>codeMessages</code> property.
     */
    public List<CodeMessage> getCodeMessages() {

        if (this.codeMessages == null) {

            this.codeMessages = new ArrayList<CodeMessage>();
        }

        return this.codeMessages;
    }

    /**
     * Gets the <code>dBkey</code> property.
     * <p>
     * 
     * @return the current value of the <code>dBkey</code> property.<br>
     */
    public String getDBkey() {
        return this.dBkey;
    }

    /**
     * Gets the <code>iACExpiryDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>iACExpiryDate</code> property.<br>
     */
    public Date getiACExpiryDate() {
        return ContractUtility.getClonedDate(this.iACExpiryDate);
    }

    /**
     * Gets the <code>iACNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>iACNumber</code> property.<br>
     */
    public String getIACNumber() {
        return this.iACNumber;
    }

    /**
     * Gets the <code>nameOfApprover</code> property.
     * <p>
     * 
     * @return the current value of the <code>nameOfApprover</code> property.<br>
     */
    public String getNameOfApprover() {
        return this.nameOfApprover;
    }

    /**
     * Gets the <code>nameOfCapturer</code> property.
     * <p>
     * 
     * @return the current value of the <code>nameOfCapturer</code> property.<br>
     */
    public String getNameOfCapturer() {
        return this.nameOfCapturer;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getoId() {
        return this.oId;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Gets the <code>phoneNoOfCapturer</code> property.
     * <p>
     * 
     * @return the current value of the <code>phoneNoOfCapturer</code> property.<br>
     */
    public String getPhoneNoOfCapturer() {
        return this.phoneNoOfCapturer;
    }

    /**
     * Gets the <code>securityDeclarationType</code> property.
     * <p>
     * 
     * @return the current value of the <code>securityDeclarationType</code> property.<br>
     */
    public SecurityDeclarationType getSecurityDeclarationType() {
        return this.securityDeclarationType;
    }

    /**
     * Gets the <code>securityStatus</code> property.
     * <p>
     * 
     * @return the current value of the <code>securityStatus</code> property.<br>
     */
    public String getSecurityStatus() {
        return this.securityStatus;
    }

    /**
     * Gets the <code>securityStatusType</code> property.
     * <p>
     * 
     * @return the current value of the <code>securityStatusType</code> property.<br>
     */
    public SecurityStatusType getSecurityStatusType() {
        return this.securityStatusType;
    }

    /**
     * Gets the <code>securityTimeStamp</code> property.
     * <p>
     * 
     * @return the current value of the <code>securityTimeStamp</code> property.<br>
     */
    public Date getSecurityTimeStamp() {
        return ContractUtility.getClonedDate(this.securityTimeStamp);
    }

    /**
     * Gets the <code>userIdOfApprover</code> property.
     * <p>
     * 
     * @return the current value of the <code>userIdOfApprover</code> property.<br>
     */
    public String getUserIdOfApprover() {
        return this.userIdOfApprover;
    }

    /**
     * Gets the <code>userIdOfCapturer</code> property.
     * <p>
     * 
     * @return the current value of the <code>userIdOfCapturer</code> property.<br>
     */
    public String getUserIdOfCapturer() {
        return this.userIdOfCapturer;
    }

    /**
     * Gets the <code>wayBillString</code> property.
     * <p>
     * 
     * @return the current value of the <code>wayBillString</code> property.<br>
     */
    public String getWayBillString() {
        return this.wayBillString;
    }

    /**
     * Sets the <code>awbIdentifier</code> property.
     * <p>
     * 
     * @param pAwbIdentifier
     *            the current value of the <code>awbIdentifier</code> property.<br>
     */
    public void setAwbIdentifier(final AirWaybillNumberDto pAwbIdentifier) {
        this.awbIdentifier = pAwbIdentifier;
    }

    /**
     * Sets the <code>codeMessages</code> property.
     * <p>
     * 
     * @param pCodeMessages
     *            holds the new value of <code>codeMessages</code>.<br>
     */
    public void setCodeMessages(final List<CodeMessage> pCodeMessages) {

        this.codeMessages = pCodeMessages;
    }

    /**
     * Sets the <code>dBkey</code> property.
     * <p>
     * 
     * @param pDBkey
     *            holds the new value of <code>dBkey</code>.<br>
     */
    public void setDBkey(final String pDBkey) {
        this.dBkey = pDBkey;
    }

    /**
     * Sets the <code>iACExpiryDate</code> property.
     * <p>
     * 
     * @param pIACExpiryDate
     *            holds the new value of <code>iACExpiryDate</code>.<br>
     */
    public void setiACExpiryDate(final Date pIACExpiryDate) {
        this.iACExpiryDate = ContractUtility.getClonedDate(pIACExpiryDate);
    }

    /**
     * Sets the <code>iACNumber</code> property.
     * <p>
     * 
     * @param pIACNumber
     *            the current value of the <code>iACNumber</code> property.<br>
     */
    public void setIACNumber(final String pIACNumber) {
        this.iACNumber = pIACNumber;
    }

    /**
     * Sets the <code>nameOfApprover</code> property.
     * <p>
     * 
     * @param pNameOfApprover
     *            the current value of the <code>nameOfApprover</code> property.<br>
     */
    public void setNameOfApprover(final String pNameOfApprover) {
        this.nameOfApprover = pNameOfApprover;
    }

    /**
     * Sets the <code>nameOfCapturer</code> property.
     * <p>
     * 
     * @param pAmonameOfCapturerunt
     *            the current value of the <code>nameOfCapturer</code> property.<br>
     */
    public void setNameOfCapturer(final String pNameOfCapturer) {
        this.nameOfCapturer = pNameOfCapturer;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param oId
     *            the current value of the <code>oId</code> property.<br>
     */
    public void setoId(Long oId) {
        this.oId = oId;
    }

    /**
     * Sets the <code>phoneNoOfCapturer</code> property.
     * <p>
     * 
     * @param pPhoneNoOfCapturer
     *            the current value of the <code>phoneNoOfCapturer</code> property.<br>
     */
    public void setPhoneNoOfCapturer(final String pPhoneNoOfCapturer) {
        this.phoneNoOfCapturer = pPhoneNoOfCapturer;
    }

    /**
     * Sets the <code>securityDeclarationType</code> property.
     * <p>
     * 
     * @param pSecurityDeclarationType
     *            holds the new value of <code>securityDeclarationType</code>.<br>
     */
    public void setSecurityDeclarationType(final SecurityDeclarationType pSecurityDeclarationType) {
        this.securityDeclarationType = pSecurityDeclarationType;
    }

    /**
     * Sets the <code>securityStatus</code> property.
     * <p>
     * 
     * @param pSecurityStatus
     *            holds the new value of <code>securityStatus</code>.<br>
     */
    public void setSecurityStatus(final String pSecurityStatus) {
        this.securityStatus = pSecurityStatus;
    }

    /**
     * Sets the <code>securityStatusType</code> property.
     * <p>
     * 
     * @param securityStatusType
     *            the current value of the <code>securityStatusType</code> property.<br>
     */
    public void setSecurityStatusType(final SecurityStatusType pSecurityStatusType) {
        this.securityStatusType = pSecurityStatusType;
    }

    /**
     * Sets the <code>securityTimeStamp</code> property.
     * <p>
     * 
     * @param pSecurityTimeStamp
     *            the current value of the <code>securityTimeStamp</code> property.<br>
     */
    public void setSecurityTimeStamp(final Date pSecurityTimeStamp) {
        this.securityTimeStamp = ContractUtility.getClonedDate(pSecurityTimeStamp);
    }

    /**
     * Sets the <code>userIdOfApprover</code> property.
     * <p>
     * 
     * @param pUserIdOfApprover
     *            the current value of the <code>userIdOfApprover</code> property.<br>
     */
    public void setUserIdOfApprover(final String pUserIdOfApprover) {
        this.userIdOfApprover = pUserIdOfApprover;
    }

    /**
     * Sets the <code>userIdOfCapturer</code> property.
     * <p>
     * 
     * @param pUserIdOfCapturer
     *            the current value of the <code>userIdOfCapturer</code> property.<br>
     */
    public void setUserIdOfCapturer(final String pUserIdOfCapturer) {
        this.userIdOfCapturer = pUserIdOfCapturer;
    }

    /**
     * Sets the <code>wayBillString</code> property.
     * <p>
     * 
     * @param pWayBillString
     *            the current value of the <code>wayBillString</code> property.<br>
     */
    public void setWayBillString(final String pWayBillString) {
        this.wayBillString = pWayBillString;
    }

}