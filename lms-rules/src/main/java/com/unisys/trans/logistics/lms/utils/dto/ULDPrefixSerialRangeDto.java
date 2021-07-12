package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;


import com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto;

/**
 * <code>ULDPrefixSerialRangeDto</code> contain details of ULDPrefixSerialRange.
 * <p>
 * This contains all information about ULDPrefixSerialRange.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>
 * <li>
 * <li>
 * <li>
 * <li>uldPrefixDtos
 * </ul>
 */


public class ULDPrefixSerialRangeDto {
	
	/**
     * Attribute to hold <code></code> property.
     */
    private String uldType;;
    
    
    /**
     * Attribute to hold <code></code> property.
     */
    private int revisionCounter;
    
    
    /**
     * Attribute to hold <code></code> property.
     */
    private int recordNumber;
    
	
	public String getUldType() {
		return uldType;
	}

	public void setUldType(String puldType) {
		this.uldType = puldType;
	}

	public int getRevisionCounter() {
		return revisionCounter;
	}

	public void setRevisionCounter(int previsionCounter) {
		this.revisionCounter = previsionCounter;
	}

	public int getRecordNumber() {
		return recordNumber;
	}

	public void setRecordNumber(int precordNumber) {
		this.recordNumber = precordNumber;
	}

	/**
     * Attribute to hold <code>uldPrefixDtos</code> property.
     */
    private List<ULDPrefixDto> uldPrefixDtos;
    
    
    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto
     * } containing <code>ULDPrefixDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>uldPrefixDtos</code> property.
     */
    public List<ULDPrefixDto> getUldPrefixDtos() {
        if (this.uldPrefixDtos == null) {
            this.uldPrefixDtos = new ArrayList<ULDPrefixDto>();
        }
        return this.uldPrefixDtos;
    }
    
    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.utils.dto.ULDPrefixDto
     * } containing <code>ULDPrefixDto</code> details.
     * <p>
     * 
     * @param pUldPrefixDtos
     *            the current value of the <code>ULDPrefixDtos</code> property.
     */
    public void setUldPrefixDtos(final List<ULDPrefixDto> pUldPrefixDtos) {
        this.uldPrefixDtos= pUldPrefixDtos;
    }

}
