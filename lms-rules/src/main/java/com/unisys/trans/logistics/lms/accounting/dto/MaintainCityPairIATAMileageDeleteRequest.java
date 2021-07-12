package com.unisys.trans.logistics.lms.accounting.dto;

/**
 * 
 */

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * @author ChoukseA
 * 
 */
public class MaintainCityPairIATAMileageDeleteRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean confirmDeleteMileageDataForIATA;

	private ProrateFactorDto prorateFactorDto;
	private List<ProrateFactorDto> prorateFactorDtoList = new ArrayList<ProrateFactorDto>();
	private ProrateFactorErrorsDto prorateFactorErrorsDto = new ProrateFactorErrorsDto();

	/**
	 * @return the prorateFactorDto
	 */
	public ProrateFactorDto getProrateFactorDto() {
		return prorateFactorDto;
	}

	/**
	 * @param prorateFactorDto
	 *            the prorateFactorDto to set
	 */
	public void setProrateFactorDto(ProrateFactorDto prorateFactorDto) {
		this.prorateFactorDto = prorateFactorDto;
	}

	/**
	 * @return the confirmDeleteMileageDataForIATA
	 */
	public boolean isConfirmDeleteMileageDataForIATA() {
		return confirmDeleteMileageDataForIATA;
	}

	/**
	 * @param confirmDeleteMileageDataForIATA
	 *            the confirmDeleteMileageDataForIATA to set
	 */
	public void setConfirmDeleteMileageDataForIATA(
			boolean confirmDeleteMileageDataForIATA) {
		this.confirmDeleteMileageDataForIATA = confirmDeleteMileageDataForIATA;
	}

	/**
	 * @return the prorateFactorDtoList
	 */
	public List<ProrateFactorDto> getProrateFactorDtoList() {
		return prorateFactorDtoList;
	}

	/**
	 * @param prorateFactorDtoList
	 *            the prorateFactorDtoList to set
	 */
	public void setProrateFactorDtoList(
			List<ProrateFactorDto> prorateFactorDtoList) {
		this.prorateFactorDtoList = prorateFactorDtoList;
	}

	/**
	 * @return the prorateFactorErrorsDto
	 */
	public ProrateFactorErrorsDto getProrateFactorErrorsDto() {
		return prorateFactorErrorsDto;
	}

	/**
	 * @param prorateFactorErrorsDto
	 *            the prorateFactorErrorsDto to set
	 */
	public void setProrateFactorErrorsDto(
			ProrateFactorErrorsDto prorateFactorErrorsDto) {
		this.prorateFactorErrorsDto = prorateFactorErrorsDto;
	}

}
