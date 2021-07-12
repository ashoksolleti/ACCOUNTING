/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.io.Serializable;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AirWaybillNumberDto;

/**
 * <code>ShipperLoadedULDDto</code> class represents the ShipperLoadedULD information.
 * 
 */
public class ULDBookingDetailsDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7249951667939624832L;

    /**
     * Attribute to hold <code>containerAssociatedAWBNumber</code> property.
     */
    private AirWaybillNumberDto containerAssociatedAWBNumber;

    /**
     * Attribute to hold <code>awbCreationTimeStamp</code> property.
     */
    private Date awbCreationTimeStamp;

    /**
     * Attribute to hold <code>aWBOid</code> property.
     */
    private Long aWBOid;

    /**
     * Gets the <code>ContainerAssociatedAWBNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>ContainerAssociatedAWBNumber</code> property.<br>
     */
    public AirWaybillNumberDto getContainerAssociatedAWBNumber() {
        if (this.containerAssociatedAWBNumber == null) {
            this.containerAssociatedAWBNumber = new AirWaybillNumberDto();
        }
        return this.containerAssociatedAWBNumber;
    }

    /**
     * Sets the <code>ContainerAssociatedAWBNumber</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>ContainerAssociatedAWBNumber</code> property.<br>
     */
    public void setContainerAssociatedAWBNumber(final AirWaybillNumberDto pContainerAssociatedAWBNumber) {
        this.containerAssociatedAWBNumber = pContainerAssociatedAWBNumber;
    }

    /**
     * Gets the <code>AwbCreationTimeStamp</code> property.
     * <p>
     * 
     * @return the current value of the <code>AwbCreationTimeStamp</code> property.<br>
     */
    public Date getAwbCreationTimeStamp() {
        if(this.awbCreationTimeStamp!=null){
            return (Date)this.awbCreationTimeStamp.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Sets the <code>AwbCreationTimeStamp</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>AwbCreationTimeStamp</code> property.<br>
     */
    public void setAwbCreationTimeStamp(final Date pAwbCreationTimeStamp) {
        if(pAwbCreationTimeStamp!=null){
        	this.awbCreationTimeStamp =(Date) pAwbCreationTimeStamp.clone();
          }  
        else
        {
        	this.awbCreationTimeStamp=null;
        }
    }

    /**
     * Gets the <code>aWBOid</code> property.
     * <p>
     * 
     * @return the current value of the <code>aWBOid</code> property.<br>
     */
    public Long getAWBOid() {
        return aWBOid;
    }

    /**
     * Sets the <code>aWBOid</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>aWBOid</code> property.<br>
     */
    public void setAWBOid(Long aWBOid) {
        this.aWBOid = aWBOid;
    }

}
