package com.unisys.trans.logistics.lms.framework.dto;

/**
 * This Class contains the getters and setters for LaunchRequestDto This Contain the
 * following attributes 
 * <li>jobName 
 * <li>jobParameters
 */
public class LaunchRequestDto {
    
    /**
     * Attribute to hold <code>jobName</code> property.
     */
    private String jobName;
    /**
     * Attribute to hold <code>jobParameters</code> property.
     */
    private String jobParameters;
    /**
     * Gets the <code>jobName</code> property.
     * <p>
     * @return the current value of the <code>jobName</code> property.
     */
    public String getJobName() {
        return this.jobName;
    }
    /**
     * Gets the <code>jobParameters</code> property.
     * <p>
     * @return the current value of the <code>jobParameters</code> property.
     */
    public String getJobParameters() {
        return this.jobParameters;
    }
    /**
     * Sets the <code>jobName</code> property.
     * <p>
     * @param pJobName
     *            the current value of the <code>jobName</code> property.
     */
    public void setJobName(final String pJobName) {
        this.jobName = pJobName;
    }
    /**
     * Sets the <code>jobParameters</code> property.
     * <p>
     * @param pJobParameters
     *            the current value of the <code>jobParameters</code> property.
     */
    public void setJobParameters(final String pJobParameters) {
        this.jobParameters = pJobParameters;
    }

}
