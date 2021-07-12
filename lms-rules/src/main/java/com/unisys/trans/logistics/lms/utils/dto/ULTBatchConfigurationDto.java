package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto;

/**
 * <code>ULTBatchConfigurationDto</code> contain details of ULDConfiguration.
 * <p>
 * This contains all information about ULDConfiguration.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>
 * <li>
 * <li>
 * <li>
 * <li>uldConfigurationDtos
 * </ul>
 */

public class ULTBatchConfigurationDto {
	
	/**
     * Attribute to hold <code>uldConfigurationDtos</code> property.
     */
    private List<ULDConfigurationDto> uldConfigurationDtos;
    
    
    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto
     * } containing <code>ULDConfigurationDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>uldConfigurationDtos</code> property.
     */
    public List<ULDConfigurationDto> getUldConfigurationDtos() {
        if (this.uldConfigurationDtos == null) {
            this.uldConfigurationDtos = new ArrayList<ULDConfigurationDto>();
        }
        return this.uldConfigurationDtos;
    }
    
    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.ULDConfigurationDto
     * } containing <code>ULDConfigurationDto</code> details.
     * <p>
     * 
     * @param puldConfigurationDtos
     *            the current value of the <code>ULDPrefixDtos</code> property.
     */
    public void setUldConfigurationDtos(final List<ULDConfigurationDto> puldConfigurationDtos) {
        this.uldConfigurationDtos= puldConfigurationDtos;
    }

}
