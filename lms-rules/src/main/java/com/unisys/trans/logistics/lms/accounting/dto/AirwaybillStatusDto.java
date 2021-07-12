package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class AirwaybillStatusDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    public String userIdentifier;

    public List<AirWaybillAuditEntryDto> auditEntryDtos;

    private String station;

    private Date creationDate;

    private String queueOffice;

    private boolean errorqueueDetailsFlags;

    public boolean isErrorqueueDetailsFlags() {
        return errorqueueDetailsFlags;
    }

    public void setErrorqueueDetailsFlags(final boolean pErrorqueueDetailsFlags) {
        this.errorqueueDetailsFlags = pErrorqueueDetailsFlags;
    }

    public String getStation() {
        return this.station;
    }

    public void setStation(final String pStation) {
        this.station = pStation;
    }

    public Date getCreationDate() {
        return ContractUtility.getClonedDate(this.creationDate);
    }

    public void setCreationDate(final Date pCreationDate) {
        this.creationDate = ContractUtility.getClonedDate(pCreationDate);
    }

    public String getQueueOffice() {
        return this.queueOffice;
    }

    public void setQueueOffice(final String pQueueOffice) {
        this.queueOffice = pQueueOffice;
    }

    private boolean manualAuditQueueDetailsFlag;

    public AirwaybillStatusDto() {
    }

    public String getUserIdentifier() {
        return this.userIdentifier;
    }

    public void setUserIdentifier(final String pUserIdentifier) {
        this.userIdentifier = pUserIdentifier;
    }

    public List<AirWaybillAuditEntryDto> getAuditEntryDtos() {
        return this.auditEntryDtos;
    }

    public void setAuditEntryDtos(final List<AirWaybillAuditEntryDto> pAuditEntryDtos) {
        this.auditEntryDtos = pAuditEntryDtos;
    }

    public boolean isManualAuditQueueDetailsFlag() {
        /*
         * if (this.auditEntryDtos.size()>0) {
         * this.manualAuditQueueDetailsFlag = true;
         * }
         */
        return this.manualAuditQueueDetailsFlag;
    }

    public void setManualAuditQueueDetailsFlag(final boolean pManualAuditQueueDetailsFlag) {
        this.manualAuditQueueDetailsFlag = pManualAuditQueueDetailsFlag;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

}
