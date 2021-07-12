/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ParameterDto</code> holds all the information related to the parameters.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>module
 * <li>subModule
 * <li>name
 * <li>runtimeIndicator
 * <li>value
 * <li>type
 * <li>description
 * <li>validationExpression
 * </code>
 * </ul>
 */
public class ParameterDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2161398694234558127L;

    /**
     * Attribute to hold <code>documentation</code> property.
     */

    private String description;

    /**
     * Attribute to hold <code>group</code> property.
     */

    private String group;

    /**
     * Attribute to hold <code>lastUpdatedDate</code> property.
     */

    private Date lastUpdatedDate;

    /**
     * Attribute to hold <code>module</code> property.
     */

    private String module;

    /**
     * Attribute to hold <code>name</code> property.
     */

    private String name;
    
    private String lmsParameterName;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>runtimeIndicator</code> property.
     */
    private boolean retainIndicator;

    /**
     * Attribute to hold <code>technicalIndicator</code> property.
     */

    private boolean technicalIndicator;

    /**
     * Attribute to hold <code>type</code> property.
     */

    private String type;

    /**
     * Attribute to hold <code>validationExpression</code> property.
     */

    private String validationExpression;

    /**
     * Attribute to hold <code>value</code> property.
     */

    private String value;

    private String clientAllowableValues;
    
    /**
     * Attribute to hold <code>functionName</code> property.
     */
    private String functionName;
    
    /**
     * Attribute to hold <code>functionCode</code> property.
     */
    private String functionCode;

    /**
     * <code>Default constructor.</code>
     */
    public ParameterDto() {

    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * Central Teletype address of the Host airline for the external system.
     * <p>
     * 
     * @return the current value of the <code>description</code> property.
     */
    @JsonIgnore
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>group</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * AWB
     * <p>
     * 
     * @return the current value of the <code>group</code> property.
     */
    @JsonIgnore
    public String getGroup() {
        return this.group;
    }

    /**
     * Gets the <code>lastUpdatedDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * Date
     * <p>
     * <b>Example: </b><br>
     * 18-APR-12 02.47.19.900000000 PM
     * <p>
     * 
     * @return the current value of the <code>lastUpdatedDate</code> property.
     */
    @JsonIgnore
    public Date getLastUpdatedDate() {
        return ContractUtility.getClonedDate(this.lastUpdatedDate);
    }

    /**
     * Gets the <code>module</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * AWB
     * <p>
     * 
     * @return the current value of the <code>module</code> property.
     */
    @JsonIgnore
    public String getModule() {
        return this.module;
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * DEFAULT_MESSAGE_OPTIONS_FOR_FOA
     * <p>
     * 
     * @return the current value of the <code>name</code> property.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Gets the <code>oId</code> property.<br>
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */

    @Override
    @JsonIgnore
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>retainIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * 0
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * Indicates Static Parameter.<br>
     * <li><code>false:</code> <br>
     * Indicates non Static Parameter.
     * <p>
     * 
     * @return the current value of the <code>retainIndicator</code> property.
     */
    @JsonIgnore
    public boolean getRetainIndicator() {
        return this.retainIndicator;
    }

    /**
     * Gets the <code>technicalIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of the <code>technicalIndicator</code> property.
     */
    @JsonIgnore
    public boolean getTechnicalIndicator() {
        return this.technicalIndicator;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * String
     * <p>
     * 
     * @return the current value of the <code>type</code> property.
     */
    @JsonIgnore
    public String getType() {
        return this.type;
    }

    /**
     * Gets the <code>validationExpression</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * String
     * <p>
     * 
     * @return the current value of the <code>validationExpression</code> property.
     */
    @JsonIgnore
    public String getValidationExpression() {
        return this.validationExpression;
    }

    /**
     * Gets the <code>value</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * YY
     * <p>
     * 
     * @return the current value of the <code>value</code> property.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * Gets the <code>retainIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * 0
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * Indicates Static Parameter.<br>
     * <li><code>false:</code> <br>
     * Indicates non Static Parameter.
     * <p>
     * 
     * @return the current value of the <code>retainIndicator</code> property.
     */
    @JsonIgnore
    public boolean isRetainIndicator() {
        return this.retainIndicator;
    }

    /**
     * Gets the <code>technicalIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of the <code>technicalIndicator</code> property.
     */
    @JsonIgnore
    public boolean isTechnicalIndicator() {
        return this.technicalIndicator;
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * Central Teletype address of the Host airline for the external system.
     * <p>
     * 
     * @param pDescription the new value of the <code>description</code>.<br>
     */

    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>group</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * AWB
     * <p>
     * 
     * @param pGroup the new value of the <code>group</code>.
     */
    public void setGroup(final String pGroup) {
        this.group = pGroup;
    }

    /**
     * Sets the <code>lastUpdatedDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * Date
     * <p>
     * <b>Example: </b><br>
     * 18-APR-12 02.47.19.900000000 PM
     * <p>
     * 
     * @param pLastUpdatedDate the new value of the <code>lastUpdatedDate</code>.
     */
    public void setLastUpdatedDate(final Date pLastUpdatedDate) {
        this.lastUpdatedDate = ContractUtility.getClonedDate(pLastUpdatedDate);
    }

    /**
     * Sets the <code>module</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * AWB
     * <p>
     * 
     * @param pModule the new value of the <code>module</code>.<br>
     */

    public void setModule(final String pModule) {
        this.module = pModule;
    }

    /**
     * Sets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * DEFAULT_MESSAGE_OPTIONS_FOR_FOA
     * <p>
     * 
     * @param pName the new value of the <code>name</code>.<br>
     */
    public void setName(final String pName) {
        this.name = pName;
    }

    /**
     * Sets the <code>oId</code> property.<br>
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code>.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>retainIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * 0
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true:</code><br>
     * Indicates Static Parameter.<br>
     * <li><code>false:</code> <br>
     * Indicates non Static Parameter.
     * <p>
     * 
     * @param pRetainIndicator the new value of the <code>retainIndicator</code>.
     */

    public void setRetainIndicator(final boolean pRetainIndicator) {
        this.retainIndicator = pRetainIndicator;
    }

    /**
     * Sets the <code>technicalIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pTechnicalIndicator the new value of the <code>technicalIndicator</code>.
     */
    public void setTechnicalIndicator(final boolean pTechnicalIndicator) {
        this.technicalIndicator = pTechnicalIndicator;
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * String
     * <p>
     * 
     * @param pType the new value of the <code>type</code>.
     */
    public void setType(final String pType) {
        this.type = pType;
    }

    /**
     * Sets the <code>validationExpression</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * String
     * <p>
     * 
     * @param pValidationExpression the new value of the <code>validationExpression</code>.
     */

    public void setValidationExpression(final String pValidationExpression) {
        this.validationExpression = pValidationExpression;
    }

    /**
     * Sets the <code>value</code> property.
     * <p>
     * <b>Format: </b><br>
     * Alphabet
     * <p>
     * <b>Example: </b><br>
     * YY
     * <p>
     * 
     * @param pValue the new value of the <code>value</code>.
     */

    public void setValue(final String pValue) {
        this.value = pValue;
    }

    /**
     * Creates the string representation of the <code>ParameterDto</code> object.
     * 
     * @return the <code>ParameterDto</code> in string format.
     */
    public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer(3000);
        // SuppressOff:MagicNumber
        final String yes = "yes";
        final String noLiteral = "No";
        csvString.append(this.prefixSuffixByQuotes(this.getGroup()));
        csvString.append(this.prefixSuffixByQuotes(this.getName()));
        csvString.append(this.prefixSuffixByQuotes(this.getDescription()));
        csvString.append(this.prefixSuffixByQuotes(this.getValue()));
        if (this.isTechnicalIndicator()) {
            csvString.append(this.prefixSuffixByQuotes(yes));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(noLiteral));
        }

        if (this.isRetainIndicator()) {
            csvString.append(this.prefixSuffixByQuotes(yes));
        }
        else {
            csvString.append(this.prefixSuffixByQuotes(noLiteral));
        }
        csvString.append(this.prefixSuffixByQuotes(this.getModule()));
        csvString.append(this.prefixSuffixByQuotes(this
                    .getValidationExpression()));
        return csvString.toString();
    }

    /**
     * prefixes and suffixes a given string with open quotes.
     * 
     * @param pString the new value of the <code>value</code>.
     * 
     * @return aModifiedString the new value of the <code>aModifiedString</code>.
     * 
     * 
     */
    private String prefixSuffixByQuotes(final String pString) {
        final String aQUOTATION = "\"";
        final String aCOMMA = ",";

        final StringBuffer aModifiedString = new StringBuffer();
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(pString);
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(aCOMMA);

        return aModifiedString.toString();
    }

    @JsonIgnore
    public String getLmsParameterName() {
        return lmsParameterName;
    }

    public void setLmsParameterName(String lmsParameterName) {
        this.lmsParameterName = lmsParameterName;
    }

    @JsonIgnore
    public String getClientAllowableValues() {
        return clientAllowableValues;
    }

    public void setClientAllowableValues(String clientAllowableValues) {
        this.clientAllowableValues = clientAllowableValues;
    }
    
    /**
   	 * @return the functionName
   	 */
   	public String getFunctionName() {
   		return functionName;
   	}

   	/**
   	 * @param functionName the functionName to set
   	 */
   	public void setFunctionName(String functionName) {
   		this.functionName = functionName;
   	}

   	/**
   	 * @return the functionCode
   	 */
   	public String getFunctionCode() {
   		return functionCode;
   	}

   	/**
   	 * @param functionCode the functionCode to set
   	 */
   	public void setFunctionCode(String functionCode) {
   		this.functionCode = functionCode;
   	}
}
