package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class ParticipantHistoryRemarkDto extends PersistenceObjectDto {
    /**
     * 
     */
    private static final long serialVersionUID = 1014215197059381389L;
    /**
     * Attribute to hold <code>oId</code> property. Unique key reference for participant entity.
     */
    private Long oId;
    /**
     * Attribute to hold <code>consigneeRemarks</code> to be associated with the Air Waybill if the
     * participant is associated with the Air Waybill as Consignee. These remarks are shown on the Handling
     * information of Hard copy of the Air Waybill when printed.
     */
    private String consigneeRemarks;
    /**
     * Attribute to hold <code>participantRemarks</code> property. It indicates the general remark about the
     * participant.
     */
    private String participantRemarks;
    /**
     * Attribute to hold <code>accountingRemarks</code> property. The remarks are sent as queue to agents with
     * special privileges. This attribute is used to communicate to the special agent on updating the
     * accounting fields by agents without special privileges.
     */
    private String accountingRemarks;
    /**
     * Gets the <code>participantRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 character set for all types<br>
     * <p>
     * <b>Example: </b><br>
     * This is a participant
     * <p>
     * 
     * @return the current value of <code>participantRemarks</code> property.<br>
     */
    public String getParticipantRemarks() {
        return this.participantRemarks;
    }
    /**
     * Sets the <code>participantRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 character set for all types. <br>
     * <p>
     * <b>Example: </b><br>
     * This is a participant
     * <p>
     * 
     * @param pParticipantRemarks the new value of <code>participantRemarks</code> property.
     */
    public void setParticipantRemarks(final String pParticipantRemarks) {
        this.participantRemarks = pParticipantRemarks;
    }
    /**
     * Gets the <code>consigneeRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 character set for all types<br>
     * <p>
     * <b>Example: </b><br>
     * Consignee handling remarks
     * <p>
     * 
     * @return the current value of <code>consigneeRemarks</code> property.<br>
     */
    public String getConsigneeRemarks() {
        return this.consigneeRemarks;
    }
    /**
     * Sets the <code>consigneeRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 character set for all types. <br>
     * <p>
     * <b>Example: </b><br>
     * Consignee handling remarks
     * <p>
     * 
     * @param pConsigneeRemarks the new value of <code>consigneeRemarks</code> property.<br>
     */
    public void setConsigneeRemarks(final String pConsigneeRemarks) {
        this.consigneeRemarks = pConsigneeRemarks;
    }
    
   
    /**
     * Gets the <code>accountingRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 character set for all types<br>
     * <p>
     * <b>Example: </b><br>
     * Change method of payment to demand billing
     * <p>
     * 
     * @return the current value of <code>accountingRemarks</code> property.<br>
     */
    public String getAccountingRemarks() {
        return this.accountingRemarks;
    }
    /**
     * Sets the <code>accountingRemarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-75 character set for all types. <br>
     * <p>
     * <b>Example: </b><br>
     * Change method of payment to demand billing
     * <p>
     * 
     * @param pAccountingRemarks the new value of <code>accountingRemarks</code> property.<br>
     */
    public void setAccountingRemarks(final String pAccountingRemarks) {
        this.accountingRemarks = pAccountingRemarks;
    }
    /**
     * @return the oId
     */
    public Long getoId() {
        return this.oId;
    }

    /**
     * @param pOId the oId to set
     */
    public void setoId(Long pOId) {
        this.oId = pOId;
    }
    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

}
