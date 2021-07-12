package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class InterlineInwardReasonCodeResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = -9024751959336972622L;

    private List<AccountingInwardReasonCodeDto> inwardReasonCodeDtos=new ArrayList<AccountingInwardReasonCodeDto>();

    public InterlineInwardReasonCodeResponse(){

    }

    public List<AccountingInwardReasonCodeDto> getInwardReasonCodeDtos() {
        return inwardReasonCodeDtos;
    }

    public void setInwardReasonCodeDtos(List<AccountingInwardReasonCodeDto> pInwardReasonCodeDtos) {
        inwardReasonCodeDtos = pInwardReasonCodeDtos;
    }

}
