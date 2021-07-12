package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class FADMessageDetailsDto extends PersistenceObjectDto {

    /**
     * Attribute to hold the <code>serialVersionUID</code> property.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long OId;

    /**
     * Attribute to hold <code>discrepancyGoods</code> property.
     */
    private DiscrepancyGoodsDto discrepancyGoods;

    /**
     * Attribute to hold <code>fadCount</code> property.
     */
    private int fadCount;

    /**
     * Attribute to hold <code>fadDateTime</code> property.
     */
    private Date fadDateTime;

    /**
     * Attribute to hold <code>ttyAddress</code> property.
     */
    private String ttyAddress;

    /**
     * Gets the value of the <code>OId</code> property.
     * <p>
     *
     * @return Returns the current value of <code>OId</code> property.
     */
    @Override
    public Long getOId() {
        return OId;
    }

    /**
     * Sets the value of the <code>OId</code> property.
     * <p>
     *
     * @param <code>oId</code> Holds the new value of the <code>OId</code> property.
     */
    public void setOId(Long oId) {
        OId = oId;
    }

    /**
     * Gets the value of the <code>discrepancyGoods</code> property.
     * <p>
     *
     * @return Returns the current value of <code>discrepancyGoods</code> property.
     */
    public DiscrepancyGoodsDto getDiscrepancyGoods() {
        return discrepancyGoods;
    }

    /**
     * Sets the value of the <code>discrepancyGoods</code> property.
     * <p>
     *
     * @param <code>discrepancyGoods</code> Holds the new value of the <code>discrepancyGoods</code> property.
     */
    public void setDiscrepancyGoods(DiscrepancyGoodsDto discrepancyGoods) {
        this.discrepancyGoods = discrepancyGoods;
    }

    /**
     * Gets the value of the <code>fadCount</code> property.
     * <p>
     *
     * @return Returns the current value of <code>fadCount</code> property.
     */
    public int getFadCount() {
        return fadCount;
    }

    /**
     * Sets the value of the <code>fadCount</code> property.
     * <p>
     *
     * @param <code>fadCount</code> Holds the new value of the <code>fadCount</code> property.
     */
    public void setFadCount(int fadCount) {
        this.fadCount = fadCount;
    }

    /**
     * Gets the value of the <code>fadDateTime</code> property.
     * <p>
     *
     * @return Returns the current value of <code>fadDateTime</code> property.
     */
    public Date getFadDateTime() {
        if(fadDateTime!=null){
            return (Date)fadDateTime.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Sets the value of the <code>fadDateTime</code> property.
     * <p>
     *
     * @param <code>fadDateTime</code> Holds the new value of the <code>fadDateTime</code> property.
     */
    public void setFadDateTime(Date fadDateTime) {
        if(fadDateTime!=null){
        	this.fadDateTime =(Date) fadDateTime.clone();
          }
        else
        {
        	this.fadDateTime=null;
        }
    }

    /**
     * Gets the value of the <code>ttyAddress</code> property.
     * <p>
     *
     * @return Returns the current value of <code>ttyAddress</code> property.
     */
    public String getTtyAddress() {
        return ttyAddress;
    }

    /**
     * Sets the value of the <code>ttyAddress</code> property.
     * <p>
     *
     * @param <code>ttyAddress</code> Holds the new value of the <code>ttyAddress</code> property.
     */
    public void setTtyAddress(String ttyAddress) {
        this.ttyAddress = ttyAddress;
    }
}