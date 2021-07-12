package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class AirWaybillAuditResponse extends AbstractResponse{

    /**
     * 
     */
    private static final long serialVersionUID = 37016717390831012L;
    
 
    
    private List<AirWaybillAuditEntryDto> theAirWaybillAuditEntryDtos;

    public List<AirWaybillAuditEntryDto> getTheAirWaybillAuditEntryDtos() {
        return this.theAirWaybillAuditEntryDtos;
    }


    public void setTheAirWaybillAuditEntryDtos(final List<AirWaybillAuditEntryDto> pAirWaybillAuditEntryDtos) {
        this.theAirWaybillAuditEntryDtos = pAirWaybillAuditEntryDtos;
    }


    public AirWaybillAuditResponse()
    {
        
    }

}
