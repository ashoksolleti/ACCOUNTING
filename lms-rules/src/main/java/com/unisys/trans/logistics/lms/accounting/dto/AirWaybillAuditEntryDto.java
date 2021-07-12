package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.OverrideIndicator;
import com.unisys.trans.logistics.lms.utils.dto.constants.QueueSource;

/**
 * <code>AirWaybillAuditEntryDto</code> domain contains the details of ManulAuditQueue.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>queueSource
 * <li>ruleName
 * <li>ruleDescription
 * <li>queueName
 * <li>queueStation
 * <li>queueOffice
 * <li>oriverrideIndicator
 * <li>creationDate
 * <li>station
 * <li>queueSourceCleared
 * <li>oId
 * <li>activeIndicator
 * <li>errorMessageCode
 * <li>clearAuditIndicator
 * <li>auditclear
 * <li>office
 * </ul>
 */
public class AirWaybillAuditEntryDto extends AccountingAirWaybillDto {
    /**
     * Attribute to hold the <code>serialVersionUID</code> object.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>queueSource</code> object.
     */
    private QueueSource queueSource;

    /**
     * Attribute to hold <code>ruleName</code> property.
     */
    private String ruleName;

    /**
     * Attribute to hold <code>ruleDescription</code> property.
     */
    private String ruleDescription;

    /**
     * Attribute to hold <code>queueName</code> property.
     */
    private String queueName;

    /**
     * Attribute to hold <code>queueStation</code> property.
     */
    private String queueStation;

    /**
     * Attribute to hold <code>queueOffice</code> property.
     */
    private String queueOffice;

    /**
     * Attribute to hold <code>overrideIndicator</code> property.
     */
    private OverrideIndicator overrideIndicator;

    /**
     * Attribute to hold <code>creationDate</code> property.
     */
    private Date creationDate;

    /**
     * Attribute to hold <code>station</code> property.
     */
    private String station;

    /**
     * Attribute to hold <code>userIndentifier</code> property.
     */
    private String userIndentifier;

    /**
     * Attribute to hold <code>queueSourceCleared</code> property.
     */
    private QueueSource queueSourceCleared;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>activeIndicator</code> property.
     */
    private boolean activeIndicator;

    /**
     * Attribute to hold <code>errorMessageCode</code> property.
     */
    private String errorMessageCode;

    /**
     * Attribute to hold <code>clearAuditIndicator</code> property.
     */
    private boolean clearAuditIndicator;

    /**
     * Attribute to hold <code>auditclear</code> property.
     */
    private boolean auditclear;

    /**
     * Attribute to hold <code>office</code> property.
     */
    private String office;

    /**
     * Attribute to hold <code>office</code> property.
     */
    private Long airWaybill;

    /**
     * Gets the <code>auditclear</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>auditclear</code> property.
     */
    public boolean isAuditclear() {
        return this.auditclear;
    }
    /**
     * Sets the <code>auditclear</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pAuditclear
     *            the new value of the <code>auditclear</code> property.
     */
    public void setAuditclear(final boolean pAuditclear) {
        this.auditclear = pAuditclear;
    }

    /**
     * Gets the <code>clearAuditIndicator</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>clearAuditIndicator</code> property.
     */
    public boolean getClearAuditIndicator() {

        return this.clearAuditIndicator;
    }
    /**
     * Sets the <code>clearAuditIndicator</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pClearAuditIndicator
     *            the new value of the <code>clearAuditIndicator</code> property.
     */
    public void setClearAuditIndicator(final boolean pClearAuditIndicator) {
        this.clearAuditIndicator = pClearAuditIndicator;
    }

    /**
     * Gets the <code>creationDate</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>creationDate</code> property.
     */
    public Date getCreationDate() {
        return ContractUtility.getClonedDate(this.creationDate);

    }
    /**
     * Sets the <code>creationDate</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pCreationDate
     *            the new value of the <code>creationDate</code> property.
     */
    public void setCreationDate(final Date pCreationDate) {
        this.creationDate = ContractUtility.getClonedDate(pCreationDate);
    }

    /**
     * Gets the <code>station</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>station</code> property.
     */
    public String getStation() {
        return this.station;
    }
    /**
     * Sets the <code>station</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pStation
     *            the new value of the <code>station</code> property.
     */
    public void setStation(final String pStation) {
        this.station = ContractUtility.convertToUpperCase(pStation);
    }

    /**
     * Gets the <code>userIndentifier</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>userIndentifier</code> property.
     */
    public String getUserIndentifier() {
        return this.userIndentifier;
    }
    /**
     * Sets the <code>userIndentifier</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pUserIndentifier
     *            the new value of the <code>userIndentifier</code> property.
     */
    public void setUserIndentifier(final String pUserIndentifier) {
        this.userIndentifier = ContractUtility.convertToUpperCase(pUserIndentifier);
    }

    /**
     * Gets the <code>queueSourceCleared</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>queueSourceCleared</code> property.
     */
    public QueueSource getQueueSourceCleared() {
        return this.queueSourceCleared;
    }
    /**
     * Sets the <code>queueSourceCleared</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pQueueSourceCleared
     *            the new value of the <code>queueSourceCleared</code> property.
     */
    public void setQueueSourceCleared(final QueueSource pQueueSourceCleared) {
        this.queueSourceCleared = pQueueSourceCleared;
    }
    /**
     * Sets the <code>oId</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Gets the <code>queueSource</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>queueSource</code> property.
     */
    public QueueSource getQueueSource() {
        return this.queueSource;
    }
    /**
     * Sets the <code>queueSource</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pQueueSource
     *            the new value of the <code>queueSource</code> property.
     */
    public void setQueueSource(final QueueSource pQueueSource) {
        this.queueSource = pQueueSource;
    }

    /**
     * Gets the <code>ruleName</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>ruleName</code> property.
     */
    public String getRuleName() {
        return this.ruleName;
    }
    /**
     * Sets the <code>ruleName</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pRuleName
     *            the new value of the <code>ruleName</code> property.
     */
    public void setRuleName(final String pRuleName) {
        this.ruleName = ContractUtility.convertToUpperCase(pRuleName);
    }

    /**
     * Gets the <code>ruleDescription</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>ruleDescription</code> property.
     */
    public String getRuleDescription() {
        return this.ruleDescription;
    }
    /**
     * Sets the <code>ruleDescription</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pRuleDescription
     *            the new value of the <code>ruleDescription</code> property.
     */
    public void setRuleDescription(final String pRuleDescription) {
        this.ruleDescription = ContractUtility.convertToUpperCase(pRuleDescription);
    }

    /**
     * Gets the <code>queueName</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>queueName</code> property.
     */
    public String getQueueName() {
        return this.queueName;
    }
    /**
     * Sets the <code>ruleDescription</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pRuleDescription
     *            the new value of the <code>ruleDescription</code> property.
     */
    public void setQueueName(final String pQueueName) {
        this.queueName = ContractUtility.convertToUpperCase(pQueueName);
    }

    /**
     * Gets the <code>queueStation</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>queueStation</code> property.
     */
    public String getQueueStation() {
        return this.queueStation;
    }
    /**
     * Sets the <code>queueStation</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pQueueStation
     *            the new value of the <code>queueStation</code> property.
     */
    public void setQueueStation(final String pQueueStation) {
        this.queueStation = ContractUtility.convertToUpperCase(pQueueStation);
    }

    /**
     * Gets the <code>queueOffice</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>queueOffice</code> property.
     */
    public String getQueueOffice() {
        return this.queueOffice;
    }
    /**
     * Sets the <code>queueOffice</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pQueueOffice
     *            the new value of the <code>queueOffice</code> property.
     */
    public void setQueueOffice(final String pQueueOffice) {
        this.queueOffice = ContractUtility.convertToUpperCase(pQueueOffice);
    }

    /**
     * Gets the <code>overideIndicator</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>overideIndicator</code> property.
     */
    public OverrideIndicator getOverrideIndicator() {
        return this.overrideIndicator;
    }
    /**
     * Sets the <code>overideIndicator</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pOverrideIndicator
     *            the new value of the <code>overideIndicator</code> property.
     */
    public void setOverrideIndicator(final OverrideIndicator pOverrideIndicator) {
        this.overrideIndicator = pOverrideIndicator;
    }

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>activeIndicator</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>activeIndicator</code> property.
     */
    public boolean getActiveIndicator() {
        return this.activeIndicator;
    }
    /**
     * Sets the <code>activeIndicator</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pActiveIndicator
     *            the new value of the <code>activeIndicator</code> property.
     */
    public void setActiveIndicator(final boolean pActiveIndicator) {
        this.activeIndicator = pActiveIndicator;
    }

    /**
     * Gets the <code>errorMessageCode</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>errorMessageCode</code> property.
     */
    public String getErrorMessageCode() {
        return this.errorMessageCode;
    }
    /**
     * Sets the <code>errorMessageCode</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pErrorMessageCode
     *            the new value of the <code>errorMessageCode</code> property.
     */
    public void setErrorMessageCode(final String pErrorMessageCode) {
        this.errorMessageCode = ContractUtility.convertToUpperCase(pErrorMessageCode);
    }

    /**
     * Gets the <code>office</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>office</code> property.
     */
    public String getOffice() {
        return this.office;
    }
    /**
     * Sets the <code>office</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pOffice
     *            the new value of the <code>office</code> property.
     */
    public void setOffice(final String pOffice) {
        this.office = ContractUtility.convertToUpperCase(pOffice);
    }

    public Long getAirWaybill() {
		return this.airWaybill;
	}
	public void setAirWaybill(final Long pAirWaybill) {
		this.airWaybill = pAirWaybill;
	}

	@Override
    public String toString() {
        final StringBuilder aStrBuilder = new StringBuilder();

        if (this.getClearAuditIndicator()) {
            aStrBuilder.append("Yes");
            aStrBuilder.append(" ");
        }
        if (!this.getClearAuditIndicator()) {
            aStrBuilder.append("No");
            aStrBuilder.append(" ");
        }
        if (this.getQueueSource() != null && this.getQueueSource().getQueueSource()!=null) {
            aStrBuilder.append(this.getQueueSource().getQueueSource());
            aStrBuilder.append(" ");
        }
        if (this.getRuleName() != null) {
            aStrBuilder.append(this.getRuleName());
            aStrBuilder.append(" ");
        }
        if (this.getRuleDescription() != null) {
            aStrBuilder.append(this.getRuleDescription());
            aStrBuilder.append(" ");
        }
        if (this.getQueueName() != null) {
            aStrBuilder.append(this.getQueueName());
            aStrBuilder.append(" ");
        }
        if (this.getQueueStation() != null) {
            aStrBuilder.append(this.getQueueStation());
            aStrBuilder.append(" ");
        }
        if (this.getQueueOffice() != null) {
            aStrBuilder.append(this.getQueueOffice());
            aStrBuilder.append(" ");
        }
        if (this.getQueueSourceCleared() != null && this.getQueueSourceCleared().getQueueSource()!=null) {
            aStrBuilder.append(this.getQueueSourceCleared().getQueueSource());
            aStrBuilder.append(" ");
        }
        if (this.getUserIndentifier() != null) {
            aStrBuilder.append(this.getUserIndentifier());
            aStrBuilder.append(" ");
        }
        if (this.getStation() != null) {
            aStrBuilder.append(this.getStation());
            aStrBuilder.append(" ");
        }
        if (this.getOffice() != null) {
            aStrBuilder.append(this.getOffice());
            aStrBuilder.append(" ");
        }
        if (this.getCreationDate() != null) {
            aStrBuilder.append(this.getCreationDate());
            aStrBuilder.append(" ");
        }
        if (this.getActiveIndicator()) {
            aStrBuilder.append("Yes");
            aStrBuilder.append(" ");
        }
        if (!this.getActiveIndicator()) {
            aStrBuilder.append("No");
            aStrBuilder.append(" ");
        }

        return aStrBuilder.toString();
    }
}
