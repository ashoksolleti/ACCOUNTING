package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class FunctionAdministrationResponse extends AbstractResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ProfileDto> profileDtos = new ArrayList<ProfileDto>();
	private List<FunctionAdministrationDto> functionAdminDtos;


	/**
	 * @return the functionAdminDtos
	 */
	public List<FunctionAdministrationDto> getFunctionAdminDtos() {
		return functionAdminDtos;
	}

	/**
	 * @param functionAdminDtos the functionAdminDtos to set
	 */
	public void setFunctionAdminDtos(List<FunctionAdministrationDto> functionAdminDtos) {
		this.functionAdminDtos = functionAdminDtos;
	}

	public List<ProfileDto> getProfileDtos() {
		return profileDtos;
	}

	public void setProfileDtos(List<ProfileDto> profileDtos) {
		this.profileDtos = profileDtos;
	}

	

}
