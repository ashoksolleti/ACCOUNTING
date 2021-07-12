package com.unisys.trans.logistics.lms.accounting.dto;

/**
 * 
 */


import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;



/**
 * @author ChoukseA
 *
 */
public class MaintainCityPairIATAMileageProcessRequest extends AbstractRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ProrateFactorDto> prorateFactorDtoList;
	
	private List<ProrateFactorDto> deleteprorateFactorDtoList;

	/**
	 * @return the prorateFactorDtoList
	 */
	public List<ProrateFactorDto> getProrateFactorDtoList() {
		return prorateFactorDtoList;
	}

	/**
	 * @param prorateFactorDtoList the prorateFactorDtoList to set
	 */
	public void setProrateFactorDtoList(List<ProrateFactorDto> prorateFactorDtoList) {
		this.prorateFactorDtoList = prorateFactorDtoList;
	}

	/**
	 * @return the deleteprorateFactorDtoList
	 */
	public List<ProrateFactorDto> getDeleteprorateFactorDtoList() {
		return deleteprorateFactorDtoList;
	}

	/**
	 * @param deleteprorateFactorDtoList the deleteprorateFactorDtoList to set
	 */
	public void setDeleteprorateFactorDtoList(
			List<ProrateFactorDto> deleteprorateFactorDtoList) {
		this.deleteprorateFactorDtoList = deleteprorateFactorDtoList;
	}
}
