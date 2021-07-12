package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class InterlineOutwardMemoPersistRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private InterlineOutwardMemoDto interlineOutwardMemoDto = new InterlineOutwardMemoDto();
	private List<InterlineOutwardMemoDto> interlineOutwardMemoDtoList = new ArrayList<InterlineOutwardMemoDto>();
	private List<InterlineOutwardMemoDto> delMemoDtoList = new ArrayList<InterlineOutwardMemoDto>();
	
	public List<InterlineOutwardMemoDto> getDelMemoDtoList() {
        return delMemoDtoList;
    }
    public void setDelMemoDtoList(List<InterlineOutwardMemoDto> delMemoDtoList) {
        this.delMemoDtoList = delMemoDtoList;
    }
    public InterlineOutwardMemoDto getInterlineOutwardMemoDto() {
		return interlineOutwardMemoDto;
	}
	public void setInterlineOutwardMemoDto(InterlineOutwardMemoDto interlineOutwardMemoDto) {
		this.interlineOutwardMemoDto = interlineOutwardMemoDto;
	}
	public List<InterlineOutwardMemoDto> getInterlineOutwardMemoDtoList() {
		return interlineOutwardMemoDtoList;
	}
	public void setInterlineOutwardMemoDtoList(List<InterlineOutwardMemoDto> interlineOutwardMemoDtoList) {
		this.interlineOutwardMemoDtoList = interlineOutwardMemoDtoList;
	}

}
