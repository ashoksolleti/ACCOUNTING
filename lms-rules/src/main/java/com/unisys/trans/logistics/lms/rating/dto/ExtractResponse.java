package com.unisys.trans.logistics.lms.rating.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.ExtractType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ExtractResponse</code> is the response object which will be sent to the web client, swing client
 * or any other client via webservice.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>emailAddress
 * <li>extractCreatedDate
 * <li>extractDto
 * <li>extractedDtos
 * <li>extractType
 * </ul>
 * </code>
 */
public class ExtractResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4899625574113497646L;

    /**
     * Attribute to hold <code>emailAddress</code> property.
     */
    private String emailAddress;

    /**
     * Attribute to hold <code>extractCreatedDate</code> property.
     */
    private Date extractCreatedDate;

    /**
     * Attribute to hold <code>extractDto</code> property.
     */
    private PersistenceObjectDto extractDto;

    /**
     * Attribute to hold <code>extractedDtos</code> property.
     */
    private List<? extends Object> extractedDtos;

    /**
     * Attribute to hold <code>extractType</code> property.
     */
    private ExtractType extractType;

    /**
     * Gets the <code>emailAddress</code> property.
     * <p>
     * 
     * @return the current value of the <code>emailAddress</code> property.
     */
    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * Gets the <code>extractCreatedDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>extractCreatedDate</code> property.
     */
    public Date getExtractCreatedDate() {
        return ContractUtility.getClonedDate(this.extractCreatedDate);
    }

    /**
     * Gets the <code>extractDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>extractDto</code> property.
     */
    public PersistenceObjectDto getExtractDto() {
        return this.extractDto;
    }

    /**
     * Gets the <code>extractedDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>extractedDtos</code> property.
     */
    public List<? extends Object> getExtractedDtos() {
        return this.extractedDtos;
    }

    /**
     * Gets the <code>extractType</code> property.
     * <p>
     * 
     * @return the current value of the <code>extractType</code> property.
     */
    public ExtractType getExtractType() {
        return this.extractType;
    }

    /**
     * Sets the <code>emailAddress</code> data transfer object.
     * <p>
     * 
     * @param pEmailAddress
     *            holds the new value of <code>emailAddress</code> data
     *            transfer object.<br>
     */
    public void setEmailAddress(final String pEmailAddress) {
        this.emailAddress = pEmailAddress;
    }

    /**
     * Sets the <code>extractCreatedDate</code> data transfer object.
     * <p>
     * 
     * @param pExtractCreatedDate
     *            holds the new value of <code>extractCreatedDate</code> data
     *            transfer object.<br>
     */
    public void setExtractCreatedDate(final Date pExtractCreatedDate) {
        this.extractCreatedDate = ContractUtility
                    .getClonedDate(pExtractCreatedDate);
    }

    /**
     * Sets the <code>extractDto</code> data transfer object.
     * <p>
     * 
     * @param pExtractDto
     *            holds the new value of <code>extractDto</code> data
     *            transfer object.<br>
     */
    public void setExtractDto(final PersistenceObjectDto pExtractDto) {
        this.extractDto = pExtractDto;
    }

    /**
     * Sets the <code>extractedDtos</code> data transfer object.
     * <p>
     * 
     * @param pExtractedDtos
     *            holds the new value of <code>extractedDtos</code> data
     *            transfer object.<br>
     */
    public void setExtractedDtos(final List<? extends Object> pExtractedDtos) {
        this.extractedDtos = pExtractedDtos;
    }

    /**
     * Sets the <code>extractType</code> data transfer object.
     * <p>
     * 
     * @param pExtractType
     *            holds the new value of <code>extractType</code> data
     *            transfer object.<br>
     */
    public void setExtractType(final ExtractType pExtractType) {
        this.extractType = pExtractType;
    }
}
