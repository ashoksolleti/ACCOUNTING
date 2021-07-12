package com.unisys.trans.logistics.lms.rating.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class SkyTeamRequest extends AbstractRequest {

    private static final long serialVersionUID = -1836758585882700375L;
    private Date departureDate;
    private String destination;
    private String origin;
    private boolean sevenDaysSchedule;
    /**
     * @return the departureDate
     */
    public Date getDepartureDate() {
        return departureDate;
    }
    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }
    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }
    /**
     * @return the sevenDaysSchedule
     */
    public boolean isSevenDaysSchedule() {
        return sevenDaysSchedule;
    }
    /**
     * @param final departureDate the departureDate to set
     */
    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }
    /**
     * @param final destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }
    /**
     * @param final origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    /**
     * @param final sevenDaysSchedule the sevenDaysSchedule to set
     */
    public void setSevenDaysSchedule(boolean sevenDaysSchedule) {
        this.sevenDaysSchedule = sevenDaysSchedule;
    }

}
