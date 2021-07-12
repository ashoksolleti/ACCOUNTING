package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ContractAdminPersistRequest</code> is used for persisting <code>ContractAdmin</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>contractAdminDto
 * </ul>
 */

public class ContractAdminPersistRequest extends AbstractRequest {

    /**
     * Default Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>contractAdminDto</code> property.
     */
    private ContractAdminDto contractAdminDto;
    private List<ContractRateAdminDto> contractRateAdminDtosList;

  
    /**
     * Gets <code>contractAdminDto</code>the contact details.
     * <p>
     * 
     * @return contractAdminDto
     * 
     */
    public ContractAdminDto getContractAdminDto() {
        return this.contractAdminDto;
    }

    /**
     * Sets the <code>ContractAdminDto</code> property.
     * <p>
     * 
     * @param pContractAdminDto
     *            the new value of the <code>ContractAdminDto</code> property.
     */
    public void setContractAdminDto(final ContractAdminDto pContractAdminDto) {
        if (this.getContractAdminDto() == null) {
            this.contractAdminDto = new ContractAdminDto();
        }
        this.contractAdminDto = pContractAdminDto;
    }

    public List<ContractRateAdminDto> getContractRateAdminDtosList() {
        return contractRateAdminDtosList;
    }

    public void setContractRateAdminDtosList(List<ContractRateAdminDto> contractRateAdminDtosList) {
        this.contractRateAdminDtosList = contractRateAdminDtosList;
    }

}
