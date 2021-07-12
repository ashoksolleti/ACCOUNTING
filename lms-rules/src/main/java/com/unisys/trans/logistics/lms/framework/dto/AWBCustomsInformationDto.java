package com.unisys.trans.logistics.lms.framework.dto;

public class AWBCustomsInformationDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>customCountry</code> property.
     */
    private String customCountry;

    /**
     * Attribute to hold <code>customStation</code> property.
     */
    private String customStation;

    /**
     * Attribute to hold <code>ecaCompletedFlag</code> property.
     */
    private boolean ecaCompletedFlag;

    /**
     * Unique objectID for persistence.
     */
    private Long oId;

    /**
     * @return the customCountry
     */
    public String getCustomCountry() {
        return this.customCountry;
    }

    /**
     * @return the customStation
     */
    public String getCustomStation() {
        return this.customStation;
    }

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * @return the ecaCompletedFlag
     */
    public boolean isEcaCompletedFlag() {
        return this.ecaCompletedFlag;
    }

    /**
     * @param pCustomCountry the customCountry to set
     */
    public void setCustomCountry(final String pCustomCountry) {
        this.customCountry = pCustomCountry;
    }

    /**
     * @param pCustomStation
     *            the customStation to set
     */
    public void setCustomStation(final String pCustomStation) {
        this.customStation = pCustomStation;
    }

    /**
     * @param pEcaCompletedFlag
     *            the ecaCompletedFlag to set
     */
    public void setEcaCompletedFlag(final boolean pEcaCompletedFlag) {
        this.ecaCompletedFlag = pEcaCompletedFlag;
    }
    
    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>oId</code>.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}
}
