package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Date;

/**
 * <code>BatchRequest</code> is used for batch process.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>parameter
 * <li>workUnit
 * </ul>
 */

public class BatchRequest extends AbstractRequest {

    /**
     * Attribute to hold <code>serialVersionUID</code> property.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>jobID</code> property.
     */
    private String jobID;

    /**
     * Attribute to hold <code>jobName</code> property.
     */
    private String jobName;
    
    /**
     * Attribute to hold <code>jobStartTime</code> property.
     */
    private Date jobStartTime;

    /**
     * Attribute to hold <code>parameter</code> property.
     */
    private Object parameter;

    /**
     * Attribute to hold <code>workUnit</code> property.
     */
    private Object workUnit;
    
    private String currentRecord;
    
    private String previousRecord;
    
    private Long count;
    
    private String entityName;
    private Long failedCount;

    /**
     * Gets the <code>jobID</code> property.
     * <p>
     * 
     * @return the current value of the <code>jobID</code> property.
     */
    public String getJobID() {
        return this.jobID;
    }

    /**
     * Gets the <code>jobStartTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>jobStartTime</code> property.
     */
    public Date getJobStartTime() {
        return this.jobStartTime;
    }
    
    /**
     * Gets the <code>jobName</code> property.
     * <p>
     * 
     * @return the current value of the <code>jobName</code> property.
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * Gets the <code>parameter</code> property.
     * <p>
     * 
     * @return the current value of the <code>parameter</code> property.
     */
    public Object getParameter() {
        return this.parameter;
    }

    /**
     * Gets the <code>workUnit</code> property.
     * <p>
     * 
     * @return the current value of the <code>workUnit</code> property.
     */
    public Object getWorkUnit() {
        return this.workUnit;
    }

    /**
     * Sets the <code>jobID</code> property.
     * <p>
     * 
     * @param pJobID
     *            the new value of the <code>jobID</code> property.
     */
    public void setJobID(final String pJobID) {
        this.jobID = pJobID;
    }

    /**
     * Sets the <code>jobName</code> property.
     * <p>
     * 
     * @param pJobName
     *            the new value of the <code>jobName</code> property.
     */
    public void setJobName(final String pJobName) {
        this.jobName = pJobName;
    }
    
    /**
     * Sets the <code>jobStartTime</code> property.
     * <p>
     * 
     * @param pJobStartTime
     *            the new value of the <code>jobStartTime</code> property.
     */
    public void setJobStartTime(final Date pJobStartTime) {
        this.jobStartTime = pJobStartTime;
    }

    /**
     * Sets the <code>parameter</code> property.
     * <p>
     * 
     * @param pParameter
     *            the new value of the <code>parameter</code> property.
     */
    public void setParameter(final Object pParameter) {
        this.parameter = pParameter;
    }

    /**
     * Sets the <code>workUnit</code> property.
     * <p>
     * 
     * @param pWorkUnit
     *            the new value of the <code>workUnit</code> property.
     */
    public void setWorkUnit(final Object pWorkUnit) {
        if (pWorkUnit == null) {
            throw new AssertionError("Null parameter input");
        }
        this.workUnit = pWorkUnit;
    }

    public String getCurrentRecord() {
        return currentRecord;
    }

    public void setCurrentRecord(String currentRecord) {
        this.currentRecord = currentRecord;
    }

    public String getPreviousRecord() {
        return previousRecord;
    }

    public void setPreviousRecord(String previousRecord) {
        this.previousRecord = previousRecord;
    }

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public Long getFailedCount() {
		return failedCount;
	}

	public void setFailedCount(Long failedCount) {
		this.failedCount = failedCount;
	}
}
