/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ParameterFindRequest</code> class represents the request to find parameter information.
 * <p>
 * <code>ParameterFindRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>name</li>
 * <li>group</li>
 * <li>module</li>
 * <li>searchText</li>
 * <li>queryType</li>
 * <li>startDate</li>
 * <li>endDate</li>
 * <li>retainIndicator</li>
 * </code>
 * </ul>
 */
public class ParameterFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2581826032030081159L;

    /**
     * Attribute to hold <code>name</code> property.
     */
    private String name;
    

    /**
     * Attribute to hold <code>value</code> property.
     */
    private String value;
    /**
     * Attribute to hold <code>value</code> property.
     */
    private List<String> inputValues;
    
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

    public ParameterFindRequest() {

    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * 
     * @return the current value of <code>name</code> property.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Sets the <code>name</code> property.
     * <p>
     * Indicates the name of the parameter.
     * 
     * @param pName the new value of <code>pName</code> property.<br>
     */

    public void setName(final String pName) {
        this.name = pName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getInputValues() {
        return this.inputValues;
    }

    public void setInputValues(final List<String> pInputValues) {
        this.inputValues = pInputValues;
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
