package com.unisys.trans.logistics.lms.framework.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class HAWBCustomsInformationDto extends PersistenceObjectDto {

    /**
     * Unique objectID for persistence.
     */
    private Long oId;

    /**
     * Attribute to hold <code>ecaCompletedFlag</code> property.
     */
    private boolean ecaCompletedFlag;

    /**
     * Attribute to hold <code>customStation</code> property.
     */
    private String customStation;

    /**
     * @return the ecaCompletedFlag
     */
    public boolean isEcaCompletedFlag() {
        return this.ecaCompletedFlag;
    }

    /**
     * @param pEcaCompletedFlag
     *            the ecaCompletedFlag to set
     */
    public void setEcaCompletedFlag(final boolean pEcaCompletedFlag) {
        this.ecaCompletedFlag = pEcaCompletedFlag;
    }

    /**
     * @return the customStation
     */
    public String getCustomStation() {
        return this.customStation;
    }

    /**
     * @param pCustomStation
     *            the customStation to set
     */
    public void setCustomStation(final String pCustomStation) {
        this.customStation = ContractUtility.convertToUpperCase(pCustomStation);
    }

    /**
     * @return the oId
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * @param pOId the oId to set
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
