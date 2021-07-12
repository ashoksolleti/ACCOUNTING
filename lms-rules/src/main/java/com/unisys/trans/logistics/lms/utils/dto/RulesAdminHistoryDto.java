package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class RulesAdminHistoryDto extends PersistenceObjectDto  {

    /**
     * 
     */
    private static final long serialVersionUID = 6427008982961733068L;

    /**
     * Attribute to hold <code>agentID</code> property.
     * <p>
     * Unique key identify the <code>agentID</code>. It is of type string.<br>
     */

    private String agentID;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     * <p>
     * Unique key identify the <code>carrierCode</code>. It is of type string.<br>
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>History</code>. It is of type Long.<br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>rulesArcheive</code> property.
     * <p>
     * Unique key identify the <code>rulesArcheive</code>. It is of type string.<br>
     */
    private String rulesArcheive;

    private boolean status;

    /**
     * Attribute to hold <code>timeStamp</code> property.
     * <p>
     * Unique key identify the <code>timeStamp</code>. It is of type string.<br>
     */

    private Date timeStamp;
    
    
    private String filePath;

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of <code>agentID</code> property.
     */
    public String getAgentID() {
        return agentID;
    }

    /**
     * @return the carrierCode
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * @return the oId
     */
    public Long getoId() {
        return oId;
    }

    @Override
    public Long getOId() {

        return null;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of <code>rulesArcheive</code> property.
     */
    public String getRulesArcheive() {
        return rulesArcheive;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of <code>timeStamp</code> property.
     */
    public Date getTimeStamp() {
        return timeStamp;
    }

    public boolean isStatus() {
        return status;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pAgentID the new value of <code>oId</code> property.
     */
    public void setAgentID(final String pAgentID) {
        this.agentID = pAgentID;
    }

    /**
     * @param pCarrierCode the carrierCode to set
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = pCarrierCode;
    }

    /**
     * @param oId the oId to set
     */
    public void setoId(Long oId) {
        this.oId = oId;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>PRulesArcheive</code> property.
     */
    public void setRulesArcheive(final String pRulesArcheive) {
        this.rulesArcheive = pRulesArcheive;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pTimeStamp the new value of <code>oId</code> property.
     */
    public void setTimeStamp(final Date pTimeStamp) {
        this.timeStamp = pTimeStamp;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}
