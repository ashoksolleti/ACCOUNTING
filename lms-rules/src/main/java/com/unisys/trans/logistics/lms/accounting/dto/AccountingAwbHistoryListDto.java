package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class AccountingAwbHistoryListDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>creationDate</code> property.
     */
    private String creationTime;

    /**
     * @return the creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @param creationTime the creationTime to set
     */
    public void setCreationTime(final String pCreationTime) {
        this.creationTime = pCreationTime;
    }

    /**
     * Attribute to hold <code>airWaybillNumber</code> property.
     */
    private AirWaybillNumberDto airWaybillNumber;

    /**
     * Attribute to hold <code>creationDate</code> property.
     */
    private Date creationDate;

    /**
     * Attribute to hold <code>originStation</code> property.
     */
    private String originStation;

    /**
     * Attribute to hold <code>destinationStation</code> property.
     */
    private String destinationStation;

    /**
     * Attribute to hold <code></code> property.
     */
    private Date executionDate;

    /**
     * Attribute to hold <code></code> property.
     */
    private List<String> airWaybillRouting;

    public Long getOId() {
        return this.oId;
    }

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    public AirWaybillNumberDto getAirWaybillNumber() {
        return this.airWaybillNumber;
    }

    public void setAirWaybillNumber(final AirWaybillNumberDto pAirWaybillNumber) {
        this.airWaybillNumber = pAirWaybillNumber;
    }

    public Date getCreationDate() {
        return ContractUtility.getClonedDate(this.creationDate);
    }

    public void setCreationDate(final Date pCreationDate) {
        this.creationDate = ContractUtility.getClonedDate(pCreationDate);
    }

    public String getOriginStation() {
        return this.originStation;
    }

    public void setOriginStation(final String pOriginStation) {
        this.originStation = pOriginStation;
    }

    public String getDestinationStation() {
        return this.destinationStation;
    }

    public void setDestinationStation(final String pDestinationStation) {
        this.destinationStation = pDestinationStation;
    }

    public Date getExecutionDate() {
        return ContractUtility.getClonedDate(this.executionDate);
    }

    public void setExecutionDate(final Date pExecutionDate) {
        this.executionDate = ContractUtility.getClonedDate(pExecutionDate);
    }

    public List<String> getAirWaybillRouting() {

        if (this.airWaybillRouting == null) {
            this.airWaybillRouting = new ArrayList<String>();
        }
        while (this.airWaybillRouting.size() < 6) {
            this.airWaybillRouting.add(FrameworkConstants.EMPTY_STRING);
        }

        return this.airWaybillRouting;
    }

    public void setAirWaybillRouting(final List<String> pAirWaybillRouting) {
        this.airWaybillRouting = pAirWaybillRouting;
    }

}
