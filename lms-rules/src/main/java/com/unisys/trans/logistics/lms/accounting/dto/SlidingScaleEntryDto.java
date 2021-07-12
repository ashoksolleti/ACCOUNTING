package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;

public class SlidingScaleEntryDto {

    /**
     * Attribute to hold <code>accountNumber</code> property.
     */
    private String accountNumber;

    private Long gsaOid;

    private Long count;

    private Long ghaOid;
    
    private Date firstFlownDate;
   
    private BigDecimal totalSales;
    
    private Long oId;

    private boolean extTerritoryMatchInd;

    public Long getoId() {
		return oId;
	}

	public void setoId(Long oId) {
		this.oId = oId;
	}

	public BigDecimal getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(BigDecimal totalSales) {
		this.totalSales = totalSales;
	}

	public BigDecimal getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(BigDecimal totalWeight) {
		this.totalWeight = totalWeight;
	}

	private BigDecimal totalWeight;
    
    

	public Date getFirstFlownDate() {
		return firstFlownDate;
	}

	public void setFirstFlownDate(Date firstFlownDate) {
		this.firstFlownDate = firstFlownDate;
	}

    public String getAccountNumber() {
        return accountNumber;
    }

    public Long getGsaOid() {
        return gsaOid;
    }

    public void setGsaOid(Long gsaOid) {
        this.gsaOid = gsaOid;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the count
     */
    public Long getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * @return the ghaOid
     */
    public Long getGhaOid() {
        return ghaOid;
    }

    /**
     * @param ghaOid the ghaOid to set
     */
    public void setGhaOid(Long ghaOid) {
        this.ghaOid = ghaOid;
    }

    public boolean isExtTerritoryMatchInd() {
        return extTerritoryMatchInd;
    }

    public void setExtTerritoryMatchInd(boolean extTerritoryMatchInd) {
        this.extTerritoryMatchInd = extTerritoryMatchInd;
    }

}
