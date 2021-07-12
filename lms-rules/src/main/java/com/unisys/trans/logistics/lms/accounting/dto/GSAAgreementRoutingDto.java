package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.StringUtility;

public class GSAAgreementRoutingDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Long oId;

    private String gsaSegOrigin;

    private String gsaSegDestination;

    private String gsaSegCarrier;

    private String gsaFlightNum;

    private boolean create = false;

    private boolean delete = false;

    private boolean update = false;

    @Override
    public Long getOId() {
        return this.oId;
    }

    public Long getoId() {
        return oId;
    }

    public void setoId(Long oId) {
        this.oId = oId;
    }

    public String getGsaSegOrigin() {
        if(!StringUtility.isEmpty(gsaSegOrigin))
            gsaSegOrigin = gsaSegOrigin.toUpperCase();
        return gsaSegOrigin;
    }

    public void setGsaSegOrigin(String gsaSegOrigin) {
        this.gsaSegOrigin = gsaSegOrigin;
    }

    public String getGsaSegDestination() {
        if(!StringUtility.isEmpty(gsaSegDestination))
            gsaSegDestination = gsaSegDestination.toUpperCase();
        return gsaSegDestination;
    }

    public void setGsaSegDestination(String gsaSegDestination) {
        this.gsaSegDestination = gsaSegDestination;
    }

    public String getGsaSegCarrier() {
        if(!StringUtility.isEmpty(gsaSegCarrier))
            gsaSegCarrier = gsaSegCarrier.toUpperCase();
        return gsaSegCarrier;
    }

    public void setGsaSegCarrier(String gsaSegCarrier) {
        this.gsaSegCarrier = gsaSegCarrier;
    }

    public String getGsaFlightNum() {
        if(!StringUtility.isEmpty(gsaFlightNum))
            gsaFlightNum = gsaFlightNum.toUpperCase();
        return gsaFlightNum;
    }

    public void setGsaFlightNum(String gsaFlightNum) {
        this.gsaFlightNum = gsaFlightNum;
    }

    public boolean isCreate() {
        return create;
    }

    public void setCreate(boolean create) {
        this.create = create;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }
}
