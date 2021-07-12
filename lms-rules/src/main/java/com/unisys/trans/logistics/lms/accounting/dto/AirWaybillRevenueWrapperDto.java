package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AirWaybillRevenueWrapperDto extends PersistenceObjectDto  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AirWaybillRevenueDto airWaybillRevenueDto;
	
	private OnlineProrationDetailDto onlineProrationDetailDto;
	
	private CarrierReceivableDto carrierReceivableDto;
	
	
	 
	public AirWaybillRevenueDto getAirWaybillRevenueDto() {
		return airWaybillRevenueDto;
	}



	public void setAirWaybillRevenueDto(AirWaybillRevenueDto airWaybillRevenueDto) {
		this.airWaybillRevenueDto = airWaybillRevenueDto;
	}



	public OnlineProrationDetailDto getOnlineProrationDetailDto() {
		return onlineProrationDetailDto;
	}



	public void setOnlineProrationDetailDto(
			OnlineProrationDetailDto onlineProrationDetailDto) {
		this.onlineProrationDetailDto = onlineProrationDetailDto;
	}



	public CarrierReceivableDto getCarrierReceivableDto() {
		return carrierReceivableDto;
	}



	public void setCarrierReceivableDto(CarrierReceivableDto carrierReceivableDto) {
		this.carrierReceivableDto = carrierReceivableDto;
	}

  private Long oid;
  
  

	public Long getOid() {
	return oid;
}



public void setOid(Long oid) {
	this.oid = oid;
}



	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return this.oid;
	}

}
