package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AirwaybillDto</code> is used for find Airwaybill information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>airwaybillHistoryXmls
 * <li>awbHouseGoodsHistoryDtos
 * <li>createdDate
 * <li>houseAirwaybillHistories
 * <li>houseAirwaybillIdentifier
 * <li>modifiedDate
 * <li>oId
 * <li>userIdentifier
 * </ul>
 */
public class AwbHouseAirwaybillDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7503124675016640218L;

    /**
     * Attribute to hold the <code>airwaybillHistoryXmls</code> property.
     */
    private List<AwbHouseAirwaybillHistoryXmlDto> airwaybillHistoryXmls;

    /**
     * Attribute to hold the <code>awbHouseGoodsHistoryDtos</code> property.
     */
    private List<AWBHouseGoodsHistoryDto> awbHouseGoodsHistoryDtos;

    /**
     * Attribute to hold the <code>createdDate</code> property.
     */
    private Date createdDate;

    /**
     * Attribute to hold the <code>houseAirwaybillHistories</code> property.
     */
    private List<AwbHouseAirwaybillHistoryDto> houseAirwaybillHistories;

    /**
     * Attribute to hold the <code>houseAirwaybillIdentifier</code> property.
     */
    private String houseAirwaybillIdentifier;

    /**
     * Attribute to hold the <code>modifiedDate</code> property.
     */
    private Date modifiedDate;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>userIdentifier</code> property.
     */
    private String userIdentifier;

    /**
     * Gets the <code>serialVersionUID</code> property.
     * <p>
     * 
     * @return the current value of the <code>serialVersionUID</code> property.
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Gets the <code>airwaybillHistoryXmls</code> property.
     * <p>
     * 
     * @return the current value of the <code>airwaybillHistoryXmls</code> property.
     */
    public List<AwbHouseAirwaybillHistoryXmlDto> getAirwaybillHistoryXmls() {
        return this.airwaybillHistoryXmls;
    }

    /**
     * Gets the <code>awbHouseGoodsHistoryDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>awbHouseGoodsHistoryDtos</code> property.
     */
    public List<AWBHouseGoodsHistoryDto> getAwbHouseGoodsHistoryDtos() {
        return this.awbHouseGoodsHistoryDtos;
    }

    /**
     * Gets the <code>createdDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>createdDate</code> property.
     */
    public Date getCreatedDate() {
        return ContractUtility.getClonedDate(this.createdDate);
    }

    /**
     * Gets the <code>houseAirwaybillHistories</code> property.
     * <p>
     * 
     * @return the current value of the <code>houseAirwaybillHistories</code> property.
     */
    public List<AwbHouseAirwaybillHistoryDto> getHouseAirwaybillHistories() {
        return this.houseAirwaybillHistories;
    }

    /**
     * Gets the <code>houseAirwaybillIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>houseAirwaybillIdentifier</code> property.
     */
    public String getHouseAirwaybillIdentifier() {
        return this.houseAirwaybillIdentifier;
    }

    /**
     * Gets the <code>modifiedDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>modifiedDate</code> property.
     */
    public Date getModifiedDate() {
        return ContractUtility.getClonedDate(this.modifiedDate);
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>userIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>userIdentifier</code> property.
     */
    public String getUserIdentifier() {
        return this.userIdentifier;
    }

    /**
     * Sets the <code>airwaybillHistoryXmls</code> property.
     * <p>
     * 
     * @param pAirwaybillHistoryXmls
     *            holds the new value of <code>airwaybillHistoryXmls</code>.<br>
     */
    public void setAirwaybillHistoryXmls(
                final List<AwbHouseAirwaybillHistoryXmlDto> pAirwaybillHistoryXmls) {
        this.airwaybillHistoryXmls = pAirwaybillHistoryXmls;
    }

    /**
     * Sets the <code>awbHouseGoodsHistoryDtos</code> property.
     * <p>
     * 
     * @param pAwbHouseGoodsHistoryDtos
     *            holds the new value of <code>awbHouseGoodsHistoryDtos</code>.<br>
     */
    public void setAwbHouseGoodsHistoryDtos(final List<AWBHouseGoodsHistoryDto> pAwbHouseGoodsHistoryDtos) {
        this.awbHouseGoodsHistoryDtos = pAwbHouseGoodsHistoryDtos;
    }

    /**
     * Sets the <code>createdDate</code> property.
     * <p>
     * 
     * @param pCreatedDate
     *            holds the new value of <code>createdDate</code>.<br>
     */
    public void setCreatedDate(final Date pCreatedDate) {
        this.createdDate = ContractUtility.getClonedDate(pCreatedDate);
    }

    /**
     * Sets the <code>houseAirwaybillHistories</code> property.
     * <p>
     * 
     * @param pHouseAirwaybillHistories
     *            holds the new value of <code>houseAirwaybillHistories</code>.<br>
     */
    public void setHouseAirwaybillHistories(
                final List<AwbHouseAirwaybillHistoryDto> pHouseAirwaybillHistories) {
        this.houseAirwaybillHistories = pHouseAirwaybillHistories;
    }

    /**
     * Sets the <code>houseAirwaybillIdentifier</code> property.
     * <p>
     * 
     * @param pHouseAirwaybillIdentifier
     *            holds the new value of <code>houseAirwaybillIdentifier</code>.<br>
     */
    public void setHouseAirwaybillIdentifier(final String pHouseAirwaybillIdentifier) {
        this.houseAirwaybillIdentifier = pHouseAirwaybillIdentifier;
    }

    /**
     * Sets the <code>modifiedDate</code> property.
     * <p>
     * 
     * @param pModifiedDate
     *            holds the new value of <code>modifiedDate</code>.<br>
     */
    public void setModifiedDate(final Date pModifiedDate) {
        this.modifiedDate = ContractUtility.getClonedDate(pModifiedDate);
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
     * Sets the <code>userIdentifier</code> property.
     * <p>
     * 
     * @param pUserIdentifier
     *            holds the new value of <code>userIdentifier</code>.<br>
     */
    public void setUserIdentifier(final String pUserIdentifier) {
        this.userIdentifier = pUserIdentifier;
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
