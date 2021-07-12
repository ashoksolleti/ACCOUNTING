package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class FunctionAdministrationDto extends PersistenceObjectDto {

	/**
	*
	*/
	private static final long serialVersionUID = 1L;

	@Override
	public Long getOId() {
		return this.oId;
	}
	public void setOId(final Long pOId){
	    this.oId = pOId;
	}
	private Long oId;

	private String function;

	private String product;

	private String profileId;

	private String profileName;

	public String getProfileName() {
        return profileName;
    }
    public void setProfileName(final String pProfileName) {
        this.profileName = pProfileName;
    }
    private List<FunctionDetailsDto> functionDetailsDto;
	private String rowIndex;

	/**
	 * @return the function
	 */
	public String getFunction() {
		return this.function;
	}

	/**
	 * @param pFunction
	 *            the function to set
	 */
	public void setFunction(final String pFunction) {
		this.function = pFunction;
	}

	/**
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
	}
	/**
     * @return the function
     */
    public String getProfileId() {
        return this.profileId;
    }

    /**
     * @param pProfileId
     *            the profileId to set
     */
    public void setProfileId(final String pProfileId) {
        this.profileId = pProfileId;
    }
	/**
	 * @return the functionDetailsDto
	 */
	public List<FunctionDetailsDto> getFunctionDetailsDto() {
		return this.functionDetailsDto;
	}
	/**
	 * @param functionDetailsDto the functionDetailsDto to set
	 */
	public void setFunctionDetailsDto(final List<FunctionDetailsDto> functionDetailsDto) {
		this.functionDetailsDto = functionDetailsDto;
	}
	/**
	 * @return the rowIndex
	 */
	public String getRowIndex() {
		return rowIndex;
	}
	/**
	 * @param rowIndex the rowIndex to set
	 */
	public void setRowIndex(String rowIndex) {
		this.rowIndex = rowIndex;
	}


}
