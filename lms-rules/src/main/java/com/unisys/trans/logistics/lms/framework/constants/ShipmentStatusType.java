//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>ShipmentStatusType</code> holds the constants to indicate ShipmentStatus type applied.
 * <p>
 */
public enum ShipmentStatusType {

    
    RCT("Accepted From Interline",4),
    RCF("Checked In",9),
    BKD("Booked",1),
    MAN("Manifested",5),
    DEP("Flight Departed",6),
    PRE("Prepared For Loading",0),
    TRM("Transfer Manifested",0),
    TFD("Transferred Interline",16),
    NFD("Notified",13),
    AWD("Documents Delivered",14),
    CCD("Cleared Customs",11),
    DLV("Delivered",15),
    DIS("Discrepancy",10),	
    CRC("Reported To Customs",0),
    DDL("Door Delivered",17),
    TGC("Transferred To Customs",0),
    ARR("Flight Arrived",7),
    AWR("Documents Received From Aircraft",8),
    FOH("Freight On Hand",2),
    RCC("Conditional Acceptance",0),
    RCD("Document Received",12),
    FPS("Goods Stored",0),
    RCS("Accepted",3),
    INC("Inactive",0),
    
    PAC("Pre Pack Cancel",0);
    

    /**
     * Attribute to hold the <code>status</code> property.
     */
    private String status;
    
    /**
     * Attribute to hold the <code>status</code> property.
     */
    private int statusOrder;
    
    /**
     * Parameterize constructor.
     * 
     * @param pStatus
     *            the value.
     */
    ShipmentStatusType(final String pStatus) {
       this.status=pStatus;
    }
    /**
     * Parameterize constructor.
     * 
     * @param pStatus
     *            the value.
     */
    ShipmentStatusType(final String pStatus, final int pOrder) {
       this.status=pStatus;
       this.statusOrder = pOrder;
    }
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Gives the string format of enumerated <code>ShipmentStatusType</code>.
     * <p>
     * 
     * @return the current string value of the <code>ShipmentStatusType</code>.
     */
    public String value() {
        return this.name();
    }
    
    public static ShipmentStatusType getStatusType(final String pStatus) {
        ShipmentStatusType statusType = null;
        
        if(pStatus == null) {
        
            return null;
        }
        
        for(ShipmentStatusType status : ShipmentStatusType.values()) {
        
            if(pStatus.equals(status.name())) {
                statusType = status;
                break;
            }
        }
        
        return statusType;
    }
    
    public static List<String> names() {

        List<String> statusCodes = new ArrayList<String>();

        for (ShipmentStatusType statusType : values()) {
            
            statusCodes.add(statusType.name());
        }

        return statusCodes;
    }


	public int getStatusOrder() {
		return statusOrder;
	}

	public void setStatusOrder(int statusOrder) {
		this.statusOrder = statusOrder;
	}
	
    public static int getStatusOrder(final String pStatus) {
        int statusOrder = 0;
        
        if(pStatus == null) {
        
            return 0;
        }
        
        for(ShipmentStatusType status : ShipmentStatusType.values()) {
            if(pStatus.equals(status.name())) {
            	statusOrder = status.statusOrder;
                break;
            }
        }
        
        return statusOrder;
    }
    
}
