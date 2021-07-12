package com.unisys.trans.logistics.lms.framework.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class GoodsTransitDetailsDto extends PersistenceObjectDto {

    
    private static final long serialVersionUID = 1L;
    
    private Long oId;
    
    private Date transitFlightDate;

    private String transitFlightNumber;
    /**
     * @return the transitFlightNumber
     */
    public String getTransitFlightNumber() {
        return this.transitFlightNumber;
    }

    /**
     * @param pTransitFlightNumber
     *            the transitFlightNumber to set
     */
    public void setTransitFlightNumber(final String pTransitFlightNumber) {
        this.transitFlightNumber = pTransitFlightNumber;
    }

    /**
     * @param pTransitFlightDate
     *            the transitFlightDate to set
     */
    public void setTransitFlightDate(final Date pTransitFlightDate) {
        if (pTransitFlightDate != null) {
            this.transitFlightDate = (Date) pTransitFlightDate.clone();
        }
        else {
            this.transitFlightDate = null;
        }

    }

    /**
     * @return the transitFlightDate
     */
    public Date getTransitFlightDate() {
        if (transitFlightDate != null) {
            return (Date) transitFlightDate.clone();
        }
        else {
            return null;
        }
    }


    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    @Override
    public Long getOId() {
        return this.oId;
    }


}
