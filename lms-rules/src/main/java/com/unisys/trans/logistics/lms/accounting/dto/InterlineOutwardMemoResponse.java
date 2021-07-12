package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.utils.dto.CarrierDto;

public class InterlineOutwardMemoResponse extends AbstractResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private InterlineOutwardMemoDto interlineOutwardMemoDto = new InterlineOutwardMemoDto();
	private List<InterlineOutwardMemoDto> interlineOutwardMemoDtoList = new ArrayList<InterlineOutwardMemoDto>();
	private boolean error;
	private List<CarrierDto> carrierDtos = new ArrayList<CarrierDto>();
	private List<SelectionInvoiceDetailDto> selectionInvoiceDetailDtos = new ArrayList<SelectionInvoiceDetailDto>();
	public List<SelectionInvoiceDetailDto> getSelectionInvoiceDetailDtos() {
		return selectionInvoiceDetailDtos;
	}
	public void setSelectionInvoiceDetailDtos(List<SelectionInvoiceDetailDto> selectionInvoiceDetailDtos) {
		this.selectionInvoiceDetailDtos = selectionInvoiceDetailDtos;
	}
	//private List<SelectionInvoiceDetailDto> selectionInvoiceDetailDtos();
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
	public boolean isError() {
        return error;
    }
    public void setError(boolean error) {
        this.error = error;
    }
    /**
     * @return the carrierDtos
     */
    public List<CarrierDto> getCarrierDtos() {
        return carrierDtos;
    }
    /**
     * @param carrierDtos the carrierDtos to set
     */
    public void setCarrierDtos(List<CarrierDto> carrierDtos) {
        this.carrierDtos = carrierDtos;
    }
	
}
