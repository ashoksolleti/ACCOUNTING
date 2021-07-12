package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;

public class OtherChargeDto implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -3971374708848055899L;

    private String origin;

    private String destination;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
