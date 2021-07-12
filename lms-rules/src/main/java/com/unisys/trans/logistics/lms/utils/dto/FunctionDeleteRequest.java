package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class FunctionDeleteRequest extends AbstractRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long oid;
	private FunctionAdministrationDto functionAdministrationDto;
	/**
	 * @return the functionAdministrationDto
	 */
	public FunctionAdministrationDto getFunctionAdministrationDto() {
		return functionAdministrationDto;
	}
	/**
	 * @param functionAdministrationDto the functionAdministrationDto to set
	 */
	public void setFunctionAdministrationDto(FunctionAdministrationDto functionAdministrationDto) {
		this.functionAdministrationDto = functionAdministrationDto;
	}
	/**
	 * @return the oid
	 */
	public Long getOid() {
		return oid;
	}
	/**
	 * @param oid the oid to set
	 */
	public void setOid(Long oid) {
		this.oid = oid;
	}

}
