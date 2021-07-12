package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class RoutingResponseDto  extends PersistenceObjectDto{
    /**
     * 
     */
    private static final long serialVersionUID = 6912934414047092493L;

    private String ElapsedTime;

    private String errorResponse;

    private int greatCircleMileage;

    private int numberOfSegments;

    private int RouteNo;

    private List<SegmentFormatDto> segmentFormats;
    private String serviceLevel1;
    private String serviceLevel2;
    
    private String serviceLevel3;

    /**
     * @return the elapsedTime
     */
    public String getElapsedTime() {
        return ElapsedTime;
    }

    public String getErrorResponse() {
        return errorResponse;
    }

    /**
     * @return the greatCircleMileage
     */
    public int getGreatCircleMileage() {
        return greatCircleMileage;
    }

    /**
     * @return the numberOfSegments
     */
    public int getNumberOfSegments() {
        return numberOfSegments;
    }

    /**
     * @return the routeNo
     */
    public int getRouteNo() {
        return RouteNo;
    }

    /**
     * @return the segmentFormats
     */
    public List<SegmentFormatDto> getSegmentFormats() {
        return segmentFormats;
    } 
    /**
     * @return the serviceLevel1
     */
    public String getServiceLevel1() {
        return serviceLevel1;
    } 
    /**
     * @return the serviceLevel2
     */
    public String getServiceLevel2() {
        return serviceLevel2;
    } 
    /**
     * @return the serviceLevel3
     */
    public String getServiceLevel3() {
        return serviceLevel3;
    } 
    /**
     * @param elapsedTime the elapsedTime to set
     */
    public void setElapsedTime(String elapsedTime) {
        ElapsedTime = elapsedTime;
    }

    public void setErrorResponse(String errorResponse) {
        this.errorResponse = errorResponse;
    }

    /**
     * @param greatCircleMileage the greatCircleMileage to set
     */
    public void setGreatCircleMileage(int greatCircleMileage) {
        this.greatCircleMileage = greatCircleMileage;
    }

    /**
     * @param numberOfSegments the numberOfSegments to set
     */
    public void setNumberOfSegments(int numberOfSegments) {
        this.numberOfSegments = numberOfSegments;
    }

    /**
     * @param routeNo the routeNo to set
     */
    public void setRouteNo(int routeNo) {
        RouteNo = routeNo;
    }

    /**
     * @param segmentFormats the segmentFormats to set
     */
    public void setSegmentFormats(List<SegmentFormatDto> segmentFormats) {
        this.segmentFormats = segmentFormats;
    }

    /**
     * @param final serviceLevel1 the serviceLevel1 to set
     */
    public void setServiceLevel1(String serviceLevel1) {
        this.serviceLevel1 = serviceLevel1;
    }

    /**
     * @param final serviceLevel2 the serviceLevel2 to set
     */
    public void setServiceLevel2(String serviceLevel2) {
        this.serviceLevel2 = serviceLevel2;
    }

    /**
     * @param final serviceLevel3 the serviceLevel3 to set
     */
    public void setServiceLevel3(String serviceLevel3) {
        this.serviceLevel3 = serviceLevel3;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
