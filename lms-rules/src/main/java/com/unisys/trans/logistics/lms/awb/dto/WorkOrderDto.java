package com.unisys.trans.logistics.lms.awb.dto;

import java.io.Serializable;


public class WorkOrderDto implements Serializable {


    /**
     * 
     */
    private static final long serialVersionUID = -10045054299564346L;


    private String itemStatus;
    
 
    private String workOrderItemType;
    

    private String workOrderLocation;

    private String workOrderNumber;

    private String workOrderStatus;

    private String workOrderTarget;
    
    
    private String itemType;
    
    
    public String getItemType() {
        return itemType;
    }
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    public String getItemStatus() {
        return itemStatus;
    }
    public String getWorkOrderItemType() {
        return workOrderItemType;
    }
    public String getWorkOrderLocation() {
        return workOrderLocation;
    }
    public String getWorkOrderNumber() {
        return workOrderNumber;
    }
    public String getWorkOrderStatus() {
        return workOrderStatus;
    }
    public String getWorkOrderTarget() {
        return workOrderTarget;
    }
    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }
    public void setWorkOrderItemType(String workOrderItemType) {
        this.workOrderItemType = workOrderItemType;
    }
    public void setWorkOrderLocation(String workOrderLocation) {
        this.workOrderLocation = workOrderLocation;
    }
    public void setWorkOrderNumber(String workOrderNumber) {
        this.workOrderNumber = workOrderNumber;
    }
    
    
    public void setWorkOrderStatus(String workOrderStatus) {
        this.workOrderStatus = workOrderStatus;
    }
    public void setWorkOrderTarget(String workOrderTarget) {
        this.workOrderTarget = workOrderTarget;
    }


}
