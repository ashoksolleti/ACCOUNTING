/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CreditPartsInfoDto</code> class contain information specific to a CreditInfo.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>agingAnalysisDate
 * <li>amountsUnapplied
 * <li>amountsUnbilled
 * <li>totalOutstanding
 * <li>outstandingForRange1
 * <li>outstandingForRange2
 * <li>outstandingForRange3
 * <li>outstandingForRange4
 * <li>collectorId
 * <li>collectionAction1
 * <li>collectionAction2
 * <li>collectionAction3
 * <li>collectionAction4
 * <li>collectionResult1
 * <li>collectionResult2
 * <li>collectionResult3
 * <li>collectionResult4 
 * <li>date1
 * <li>date2
 * <li>date3
 * <li>oId
 * <li>date4
 * </code>
 * </ul>
 */
public class CreditPartsInfoDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 447110167079583152L;

    /**
     * Attribute to hold <code>agingAnalysisDate</code> property.
     */
    private Date agingAnalysisDate;

    /**
     * Attribute to hold <code>amountsUnapplied</code> property.
     */
    private BigDecimal amountsUnapplied;

    /**
     * Attribute to hold <code>amountsUnbilled</code> property.
     */
    private BigDecimal amountsUnbilled;

    /**
     * Attribute to hold <code>collectionAction1</code> property.
     */
    private String collectionAction1;

    /**
     * Attribute to hold <code>collectionAction2</code> property.
     */
    private String collectionAction2;

    /**
     * Attribute to hold <code>collectionAction3</code> property.
     */
    private String collectionAction3;

    /**
     * Attribute to hold <code>collectionAction4</code> property.
     */
    private String collectionAction4;
    
    /**
     * Attribute to hold <code>collectionAction5</code> property.
     */
    private String collectionAction5;

    /**
     * Attribute to hold <code>collectionResult1</code> property.
     */
    private String collectionResult1;

    /**
     * Attribute to hold <code>collectionResult2</code> property.
     */
    private String collectionResult2;

    /**
     * Attribute to hold <code>collectionResult3</code> property.
     */
    private String collectionResult3;

    /**
     * Attribute to hold <code>collectionResult4</code> property.
     */
    private String collectionResult4;
    
    /**
     * Attribute to hold <code>collectionResult5</code> property.
     */
    private String collectionResult5;

    /**
     * Attribute to hold <code>collectorId</code> property.
     */
    private String collectorId;

    /**
     * Attribute to hold <code>date1</code> property.
     */
    private Date date1;

    /**
     * Attribute to hold <code>date2</code> property.
     */
    private Date date2;

    /**
     * Attribute to hold <code>date3</code> property.
     */
    private Date date3;

    /**
     * Attribute to hold <code>date4</code> property.
     */
    private Date date4;
    
    /**
     * Attribute to hold <code>date5</code> property.
     */
    private Date date5;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;
    
    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId2;
    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId5;
    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId3;
    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId4;
    

    /**
     * Attribute to hold <code>outstandingForRange1</code> property.
     */
    private BigDecimal outstandingForRange1;

    /**
     * Attribute to hold <code>outstandingForRange2</code> property.
     */
    private BigDecimal outstandingForRange2;

    /**
     * Attribute to hold <code>outstandingForRange3</code> property.
     */
    private BigDecimal outstandingForRange3;

    /**
     * Attribute to hold <code>outstandingForRange4</code> property.
     */
    private BigDecimal outstandingForRange4;
    
    /**
     * Attribute to hold <code>outstandingForRange5</code> property.
     */
    private BigDecimal outstandingForRange5;

    /**
     * Attribute to hold <code>totalOutstanding</code> property.
     */
    private BigDecimal totalOutstanding;
    
    private BigDecimal toleranceLimit;
   
    /**
     * Attribute to hold <code>collectionEmail</code> property.
     */
    private String collectionEmail;
    
    /**
     * Attribute to hold <code>collectionMedia</code> property.
     */
    private Boolean collectionMedia;
    
    /**
     * Gets the <code>toleranceLimit</code> property.
     * <p>
     * 
     * @return the current value of the <code>toleranceLimit</code> property.
     */
	public BigDecimal getToleranceLimit() {
		return this.toleranceLimit;
	}

    /**
     * Gets the <code>agingAnalysisDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>agingAnalysisDate</code> property.
     */
    public Date getAgingAnalysisDate() {
        return ContractUtility.getClonedDate(this.agingAnalysisDate);
    }

    /**
     * Gets the <code>amountsUnapplied</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountsUnapplied</code> property.
     */
    public BigDecimal getAmountsUnapplied() {
        return this.amountsUnapplied;
    }

    /**
     * Gets the <code>amountsUnbilled</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountsUnbilled</code> property.
     */
    public BigDecimal getAmountsUnbilled() {
        return this.amountsUnbilled;
    }

    /**
     * Gets the <code>collectionAction1</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionAction1</code> property.
     */
    public String getCollectionAction1() {
        return this.collectionAction1;
    }

    /**
     * Gets the <code>collectionAction2</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionAction2</code> property.
     */
    public String getCollectionAction2() {
        return this.collectionAction2;
    }

    /**
     * Gets the <code>collectionAction3</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionAction3</code> property.
     */
    public String getCollectionAction3() {
        return this.collectionAction3;
    }

    /**
     * Gets the <code>collectionAction4</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionAction4</code> property.
     */
    public String getCollectionAction4() {
        return this.collectionAction4;
    }

    /**
     * Gets the <code>collectionResult1</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionResult1</code> property.
     */
    public String getCollectionResult1() {
        return this.collectionResult1;
    }

    /**
     * Gets the <code>collectionResult2</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionResult2</code> property.
     */
    public String getCollectionResult2() {
        return this.collectionResult2;
    }

    /**
     * Gets the <code>collectionResult3</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionResult3</code> property.
     */
    public String getCollectionResult3() {
        return this.collectionResult3;
    }

    /**
     * Gets the <code>collectionResult4</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionResult4</code> property.
     */
    public String getCollectionResult4() {
        return this.collectionResult4;
    }

    /**
     * Gets the <code>collectorId</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectorId</code> property.
     */
    public String getCollectorId() {
        return ContractUtility.convertToUpperCase(collectorId);
    }

    /**
     * Gets the <code>date1</code> property.
     * <p>
     * 
     * @return the current value of the <code>date1</code> property.
     */
    public Date getDate1() {
        return ContractUtility.getClonedDate(this.date1);
    }

    /**
     * Gets the <code>date2</code> property.
     * <p>
     * 
     * @return the current value of the <code>date2</code> property.
     */
    public Date getDate2() {
        return ContractUtility.getClonedDate(this.date2);
    }

    /**
     * Gets the <code>date3</code> property.
     * <p>
     * 
     * @return the current value of the <code>date3</code> property.
     */
    public Date getDate3() {
        return ContractUtility.getClonedDate(this.date3);
    }

    /**
     * Gets the <code>date4</code> property.
     * <p>
     * 
     * @return the current value of the <code>date4</code> property.
     */
    public Date getDate4() {
        return ContractUtility.getClonedDate(this.date4);
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return this.the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>outstandingForRange1</code> property.
     * <p>
     * 
     * @return the current value of the <code>outstandingForRange1</code> property.
     */
    public BigDecimal getOutstandingForRange1() {
        return this.outstandingForRange1;
    }

    /**
     * Gets the <code>outstandingForRange2</code> property.
     * <p>
     * 
     * @return the current value of the <code>outstandingForRange2</code> property.
     */
    public BigDecimal getOutstandingForRange2() {
        return this.outstandingForRange2;
    }

    /**
     * Gets the <code>outstandingForRange3</code> property.
     * <p>
     * 
     * @return the current value of the <code>outstandingForRange3</code> property.
     */
    public BigDecimal getOutstandingForRange3() {
        return this.outstandingForRange3;
    }

    /**
     * Gets the <code>outstandingForRange4</code> property.
     * <p>
     * 
     * @return the current value of the <code>outstandingForRange4</code> property.
     */
    public BigDecimal getOutstandingForRange4() {
        return this.outstandingForRange4;
    }

    /**
     * Gets the <code>totalOutstanding</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalOutstanding</code> property.
     */
    public BigDecimal getTotalOutstanding() {
        return this.totalOutstanding;
    }

    /**
     * Sets the <code>agingAnalysisDate</code> property.
     * <p>
     * 
     * @param pAgingAnalysisDate the new value of the <code>agingAnalysisDate</code> property.
     */
    public void setAgingAnalysisDate(final Date pAgingAnalysisDate) {
        this.agingAnalysisDate = ContractUtility.getClonedDate(pAgingAnalysisDate);
    }

    /**
     * Sets the <code>amountsUnapplied</code> property.
     * <p>
     * 
     * @param pAmountsUnapplied the new value of the <code>amountsUnapplied</code> property.
     */
    public void setAmountsUnapplied(final BigDecimal pAmountsUnapplied) {
        this.amountsUnapplied = pAmountsUnapplied;
    }

    /**
     * Sets the <code>amountsUnbilled</code> property.
     * <p>
     * 
     * @param pAmountsUnbilled the new value of the <code>amountsUnbilled</code> property.
     */
    public void setAmountsUnbilled(final BigDecimal pAmountsUnbilled) {
        this.amountsUnbilled = pAmountsUnbilled;
    }

    /**
     * Sets the <code>collectionAction1</code> property.
     * <p>
     * 
     * @param pCollectionAction1 the new value of the <code>collectionAction1</code> property.
     */
    public void setCollectionAction1(final String pCollectionAction1) {
        this.collectionAction1 = pCollectionAction1;
    }

    /**
     * Sets the <code>collectionAction2</code> property.
     * <p>
     * 
     * @param pCollectionAction2 the new value of the <code>collectionAction2</code> property.
     */
    public void setCollectionAction2(final String pCollectionAction2) {
        this.collectionAction2 = pCollectionAction2;
    }

    /**
     * Sets the <code>collectionAction3</code> property.
     * <p>
     * 
     * @param pCollectionAction3 the new value of the <code>collectionAction3</code> property.
     */
    public void setCollectionAction3(final String pCollectionAction3) {
        this.collectionAction3 = pCollectionAction3;
    }

    /**
     * Sets the <code>collectionAction4</code> property.
     * <p>
     * 
     * @param pCollectionAction4 the new value of the <code>collectionAction4</code> property.
     */
    public void setCollectionAction4(final String pCollectionAction4) {
        this.collectionAction4 = pCollectionAction4;
    }

    /**
     * Sets the <code>collectionResult1</code> property.
     * <p>
     * 
     * @param pCollectionResult1 the new value of the <code>collectionResult1</code> property.
     */
    public void setCollectionResult1(final String pCollectionResult1) {
        this.collectionResult1 = pCollectionResult1;
    }

    /**
     * Sets the <code>collectionResult2</code> property.
     * <p>
     * 
     * @param pCollectionResult2 the new value of the <code>collectionResult2</code> property.
     */
    public void setCollectionResult2(final String pCollectionResult2) {
        this.collectionResult2 = pCollectionResult2;
    }

    /**
     * Sets the <code>collectionResult3</code> property.
     * <p>
     * 
     * @param pCollectionResult3 the new value of the <code>collectionResult3</code> property.
     */
    public void setCollectionResult3(final String pCollectionResult3) {
        this.collectionResult3 = pCollectionResult3;
    }
    
    /**
     * Sets the <code>toleranceLimit</code> property.
     * <p>
     * 
     * @param pToleranceLimit the new value of the <code>toleranceLimit</code> property.
     */
	public void setToleranceLimit(final BigDecimal pToleranceLimit) {
		this.toleranceLimit = pToleranceLimit;
	}

    /**
     * Sets the <code>collectionResult4</code> property.
     * <p>
     * 
     * @param pCollectionResult4 the new value of the <code>collectionResult4</code> property.
     */
    public void setCollectionResult4(final String pCollectionResult4) {
        this.collectionResult4 = pCollectionResult4;
    }

    /**
     * Sets the <code>collectorId</code> property.
     * <p>
     * 
     * @param pCollectorId the new value of the <code>collectorId</code> property.
     */
    public void setCollectorId(final String pCollectorId) {
        this.collectorId = pCollectorId;
    }

    /**
     * Sets the <code>date1</code> property.
     * <p>
     * 
     * @param pDate1 the new value of the <code>date1</code> property.
     */
    public void setDate1(final Date pDate1) {
        this.date1 = ContractUtility.getClonedDate(pDate1);
    }

    /**
     * Sets the <code>date2</code> property.
     * <p>
     * 
     * @param pDate2 the new value of the <code>date2</code> property.
     */
    public void setDate2(final Date pDate2) {
        this.date2 = ContractUtility.getClonedDate(pDate2);
    }

    /**
     * Sets the <code>date3</code> property.
     * <p>
     * 
     * @param pDate3 the new value of the <code>date3</code> property.
     */
    public void setDate3(final Date pDate3) {
        this.date3 = ContractUtility.getClonedDate(pDate3);
    }

    /**
     * Sets the <code>date4</code> property.
     * <p>
     * 
     * @param pDate4 the new value of the <code>date4</code> property.
     */
    public void setDate4(final Date pDate4) {
        this.date4 = ContractUtility.getClonedDate(pDate4);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>outstandingForRange1</code> property.
     * <p>
     * 
     * @param pOutstandingForRange1 the new value of the <code>outstandingForRange1</code> property.
     */
    public void setOutstandingForRange1(final BigDecimal pOutstandingForRange1) {
        this.outstandingForRange1 = pOutstandingForRange1;
    }

    /**
     * Sets the <code>outstandingForRange2</code> property.
     * <p>
     * 
     * @param pOutstandingForRange2 the new value of the <code>outstandingForRange2</code> property.
     */
    public void setOutstandingForRange2(final BigDecimal pOutstandingForRange2) {
        this.outstandingForRange2 = pOutstandingForRange2;
    }

    /**
     * Sets the <code>outstandingForRange3</code> property.
     * <p>
     * 
     * @param pOutstandingForRange3 the new value of the <code>outstandingForRange3</code> property.
     */
    public void setOutstandingForRange3(final BigDecimal pOutstandingForRange3) {
        this.outstandingForRange3 = pOutstandingForRange3;
    }

    /**
     * Sets the <code>outstandingForRange4</code> property.
     * <p>
     * 
     * @param pOutstandingForRange4 the new value of the <code>outstandingForRange4</code> property.
     */
    public void setOutstandingForRange4(final BigDecimal pOutstandingForRange4) {
        this.outstandingForRange4 = pOutstandingForRange4;
    }

    /**
     * Sets the <code>totalOutstanding</code> property.
     * <p>
     * 
     * @param pTotalOutstanding the new value of the <code>totalOutstanding</code> property.
     */
    public void setTotalOutstanding(final BigDecimal pTotalOutstanding) {
        this.totalOutstanding = pTotalOutstanding;
    }

    /**
     * Gets the <code>collectionEmail</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionEmail</code> property.
     */
    public String getCollectionEmail() {
        return this.collectionEmail;
    }

    /**
     * Sets the <code>pCollectionEmail</code>.
     * <p>
     * 
     * @param pCollectionEmail
     *            holds the new value of <code>collectionEmail</code>
     */
    public void setCollectionEmail(final String pCollectionEmail) {
        this.collectionEmail = pCollectionEmail;
    }

    /**
     * Gets the <code>collectionMedia</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionMedia</code> property.
     */
    public Boolean getCollectionMedia() {
        return this.collectionMedia;
    }

    /**
     * Sets the <code>pCollectionMedia</code>.
     * <p>
     * 
     * @param pCollectionMedia
     *            holds the new value of <code>collectionMedia</code>
     */
    public void setCollectionMedia(final Boolean pCollectionMedia) {
        this.collectionMedia = pCollectionMedia;
    }

    /**
     * Gets the <code>collectionAction5</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionAction5</code> property.
     */
    public String getCollectionAction5() {
        return this.collectionAction5;
    }

    /**
     * Sets the <code>pCollectionAction5</code>.
     * <p>
     * 
     * @param pCollectionAction5
     *            holds the new value of <code>collectionAction5</code>
     */
    public void setCollectionAction5(final String pCollectionAction5) {
        this.collectionAction5 = pCollectionAction5;
    }

    /**
     * Gets the <code>collectionResult5</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionResult5</code> property.
     */
    public String getCollectionResult5() {
        return this.collectionResult5;
    }

    /**
     * Sets the <code>pCollectionResult5</code>.
     * <p>
     * 
     * @param pCollectionResult5
     *            holds the new value of <code>collectionResult5</code>
     */
    public void setCollectionResult5(final String pCollectionResult5) {
        this.collectionResult5 = pCollectionResult5;
    }

    /**
     * Gets the <code>date5</code> property.
     * <p>
     * 
     * @return the current value of the <code>date5</code> property.
     */
    public Date getDate5() {
        return this.date5;
    }

    /**
     * Sets the <code>pDate5</code>.
     * <p>
     * 
     * @param pDate5
     *            holds the new value of <code>date5</code>
     */
    public void setDate5(final Date pDate5) {
        this.date5 = pDate5;
    }

    /**
     * Gets the <code>outstandingForRange5</code> property.
     * <p>
     * 
     * @return the current value of the <code>outstandingForRange5</code> property.
     */
    public BigDecimal getOutstandingForRange5() {
        return this.outstandingForRange5;
    }

    /**
     * Sets the <code>pOutstandingForRange5</code>.
     * <p>
     * 
     * @param pOutstandingForRange5
     *            holds the new value of <code>outstandingForRange5</code>
     */
    public void setOutstandingForRange5(final BigDecimal pOutstandingForRange5) {
        this.outstandingForRange5 = pOutstandingForRange5;
    }

    /**
     * Gets the <code>oId2</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId2</code> property.
     */
    public Long getoId2() {
        return this.oId2;
    }

    /**
     * Sets the <code>pOId2</code>.
     * <p>
     * 
     * @param pOId2
     *            holds the new value of <code>oId2</code>
     */
    public void setoId2(final Long pOId2) {
        this.oId2 = pOId2;
    }

    /**
     * Gets the <code>oId5</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId5</code> property.
     */
    public Long getoId5() {
        return this.oId5;
    }

    /**
     * Sets the <code>pOId5</code>.
     * <p>
     * 
     * @param pOId5
     *            holds the new value of <code>oId5</code>
     */
    public void setoId5(final Long pOId5) {
        this.oId5 = pOId5;
    }

    /**
     * Gets the <code>oId3</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId3</code> property.
     */
    public Long getoId3() {
        return this.oId3;
    }

    /**
     * Sets the <code>pOId3</code>.
     * <p>
     * 
     * @param pOId3
     *            holds the new value of <code>oId3</code>
     */
    public void setoId3(final Long pOId3) {
        this.oId3 = pOId3;
    }

    /**
     * Gets the <code>oId4</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId4</code> property.
     */
    public Long getoId4() {
        return this.oId4;
    }

    /**
     * Sets the <code>pOId4</code>.
     * <p>
     * 
     * @param pOId4
     *            holds the new value of <code>oId4</code>
     */
    public void setoId4(final Long pOId4) {
        this.oId4 = pOId4;
    }

    

}
