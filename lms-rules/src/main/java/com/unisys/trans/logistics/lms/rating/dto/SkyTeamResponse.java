package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class SkyTeamResponse extends AbstractResponse{

    /**
     * 
     */
    private static final long serialVersionUID = 5827925554545756066L;
    
    private List<RoutingResponseDto> routingResponseDtos;
    
    private int responseCode;
    
    private String skyTeamResponseString;
    
    private String errorString;

    /**
     * @return the routingResponseDtos
     */
    public List<RoutingResponseDto> getRoutingResponseDtos() {
        return routingResponseDtos;
    }

    /**
     * @param final routingResponseDtos the routingResponseDtos to set
     */
    public void setRoutingResponseDtos(List<RoutingResponseDto> routingResponseDtos) {
        this.routingResponseDtos = routingResponseDtos;
    }

    /**
     * @return the responseCode
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * @param final responseCode the responseCode to set
     */
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * @return the skyTeamResponseString
     */
    public String getSkyTeamResponseString() {
        return skyTeamResponseString;
    }

    /**
     * @param final skyTeamResponseString the skyTeamResponseString to set
     */
    public void setSkyTeamResponseString(String skyTeamResponseString) {
        this.skyTeamResponseString = skyTeamResponseString;
    }

    /**
     * @return the errorString
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * @param final errorString the errorString to set
     */
    public void setErrorString(String errorString) {
        this.errorString = errorString;
    }

}
