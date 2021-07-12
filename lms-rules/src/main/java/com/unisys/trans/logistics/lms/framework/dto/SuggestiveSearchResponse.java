/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import java.util.List;



/**
 * <code>SuggestiveSearchResponse</code> contains the response that contains the retrieved objects.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>resultSet</code>
 * </ul>
 */
public class SuggestiveSearchResponse extends AbstractResponse{


    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7591753595352845667L;

    /**
     * Attribute to hold <code>resultSet</code> property.
     */
    private List<?> resultSet;
    
    
    /**
     * Attribute to hold <code>rowNum</code> property.
     */
    private int rowNum;
    
    /**
     * Attribute to hold <code>EOR</code> property.
     */
    private int EOR;
    
    
    /**Attribute to hold <code>includePartsAccountId</code> property.
     * 
     */
    private String includePartsAccountId;
    
    

    /**
     * Gets the <code>resultSet</code> property which contains list of possible values.
     * <p>
     * 
     * @return the current value of set of <code>resultSet</code> property.
     */
    public List<?> getResultSet() {
        return resultSet;
    }

    /**
     * Sets the <code>resultSet</code> property which contains list of possible values.
     * <p>
     * 
     * @param pResultSet the new value of set of <code>resultSet</code> property.
     */
    public void setResultSet(final List<?> pResultSet) {
        this.resultSet = pResultSet;
    }

    /**
     * Gets the <code>rowNum</code> property which contains the starts with row number value.
     * <p>
     * 
     * @return the current value of set of <code>rowNum</code> property.
     */
    public int getRowNum() {
        return rowNum;
    }

    /**
     * Sets the <code>rowNum</code> property which contains the starts with row number value..
     * <p>
     * 
     * @param pRowNum the new value of set of <code>rowNum</code> property.
     */
    public void setPageNumber(final int pRowNum) {
        this.rowNum = pRowNum;
    }
    
    
    /**
     * Gets the <code>EOR</code> property which contains the end of record indicator.
     * <p>
     * 
     * @return the current value of set of <code>EOR</code> property.
     */
    public int getEOR() {
        return EOR;
    }

    /**
     * Sets the <code>EOR</code> property which  contains the end of record indicator.
     * <p>
     * 
     * @param pEOR the new value of set of <code>EOR</code> property.
     */
    public void setEOR(int pEOR) {
        EOR = pEOR;
    }

    /**
     * Gets the <code>includePartsAccountId</code> property.
     * Indicates whether to blank out the participant account identifier in the result.
     * <p>
     * 
     * @return the current value of set of <code>includePartsAccountId</code> property.
     */
    public String getIncludePartsAccountId() {
        return includePartsAccountId;
    }

    
    /**
     * Sets the <code>includePartsAccountId</code> property. 
     * Indicates whether to blank out the participant account identifier in the result.
     * <p>
     * 
     * @param pIncludePartsAccountId the new value of set of <code>includePartsAccountId</code> property.
     */
    public void setIncludePartsAccountId(final String pIncludePartsAccountId) {
        this.includePartsAccountId = pIncludePartsAccountId;
    }

}
