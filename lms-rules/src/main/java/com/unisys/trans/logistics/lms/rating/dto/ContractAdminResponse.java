package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>ContractAdminResponse</code> contains the response of the maintenance
 * request received by <code>ContractAdminService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>contractAdminDto
 * <li>contractAdminDtos
 * <li>spotRateListEntryDtos
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.ContractAdminDto
 */
public class ContractAdminResponse extends AbstractResponse {

    /**
     * Default Serial version.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>contractAdminDto</code> property.
     */
    private ContractAdminDto contractAdminDto;

    /**
     * Attribute to hold <code>contractAdminDtos</code> property.
     */
    private List<ContractAdminDto> contractAdminDtos;

    /**
     * Gets the <code>contractAdminDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>contractAdminDto</code> property.
     */
    public ContractAdminDto getContractAdminDto() {
        return contractAdminDto;
    }

    /**
     * Gets the <code>contractAdminDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>contractAdminDtos</code> property.
     */
    public List<ContractAdminDto> getContractAdminDtos() {
        return this.contractAdminDtos;
    }

    /**
     * Sets the <code>ContractAdminDto</code> property.
     * <p>
     * 
     * @param pContractAdminDto
     *            the new value of the <code>ContractAdminDto</code> property.
     */
    public void setContractAdminDto(final ContractAdminDto pContractAdminDto) {
        this.contractAdminDto = pContractAdminDto;
    }

    /**
     * Sets the <code>ContractAdminDtos</code> property.
     * <p>
     * 
     * @param pContractAdminDtos
     *            the new value of the <code>ContractAdminDtos</code> property.
     */
    public void setContractAdminDtos(
                final List<ContractAdminDto> pContractAdminDtos) {
        this.contractAdminDtos = pContractAdminDtos;
    }

}
