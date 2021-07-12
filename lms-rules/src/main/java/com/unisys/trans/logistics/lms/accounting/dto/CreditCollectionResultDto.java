/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>CreditCollectionResultDto</code> class contain information specific to a CreditInfo.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>collectionAction1
 * <li>oId
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
 * <li>date4
 * <li>outstandingForRange1
 * <li>outstandingForRange2
 * <li>outstandingForRange3
 * <li>outstandingForRange4
 * <li>totalOutstanding
 * </code>
 * </ul>
 */
public class CreditCollectionResultDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 447110167079583152L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId1;
    
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
     * Gets the <code>oId1</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId1</code> property.
     */
    public Long getoId1() {
        return this.oId1;
    }

    /**
     * Sets the <code>pOId1</code>.
     * <p>
     * 
     * @param pOId1
     *            holds the new value of <code>oId1</code>
     */
    public void setoId1(final Long pOId1) {
        this.oId1 = pOId1;
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
     * Sets the <code>pCollectionAction1</code>.
     * <p>
     * 
     * @param pCollectionAction1
     *            holds the new value of <code>collectionAction1</code>
     */
    public void setCollectionAction1(final String pCollectionAction1) {
        this.collectionAction1 = pCollectionAction1;
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
     * Sets the <code>pCollectionAction2</code>.
     * <p>
     * 
     * @param pCollectionAction2
     *            holds the new value of <code>collectionAction2</code>
     */
    public void setCollectionAction2(final String pCollectionAction2) {
        this.collectionAction2 = pCollectionAction2;
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
     * Sets the <code>pCollectionAction3</code>.
     * <p>
     * 
     * @param pCollectionAction3
     *            holds the new value of <code>collectionAction3</code>
     */
    public void setCollectionAction3(final String pCollectionAction3) {
        this.collectionAction3 = pCollectionAction3;
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
     * Sets the <code>pCollectionAction4</code>.
     * <p>
     * 
     * @param pCollectionAction4
     *            holds the new value of <code>collectionAction4</code>
     */
    public void setCollectionAction4(final String pCollectionAction4) {
        this.collectionAction4 = pCollectionAction4;
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
     * Sets the <code>pCollectionResult1</code>.
     * <p>
     * 
     * @param pCollectionResult1
     *            holds the new value of <code>collectionResult1</code>
     */
    public void setCollectionResult1(final String pCollectionResult1) {
        this.collectionResult1 = pCollectionResult1;
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
     * Sets the <code>pCollectionResult2</code>.
     * <p>
     * 
     * @param pCollectionResult2
     *            holds the new value of <code>collectionResult2</code>
     */
    public void setCollectionResult2(final String pCollectionResult2) {
        this.collectionResult2 = pCollectionResult2;
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
     * Sets the <code>pCollectionResult3</code>.
     * <p>
     * 
     * @param pCollectionResult3
     *            holds the new value of <code>collectionResult3</code>
     */
    public void setCollectionResult3(final String pCollectionResult3) {
        this.collectionResult3 = pCollectionResult3;
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
     * Sets the <code>pCollectionResult4</code>.
     * <p>
     * 
     * @param pCollectionResult4
     *            holds the new value of <code>collectionResult4</code>
     */
    public void setCollectionResult4(final String pCollectionResult4) {
        this.collectionResult4 = pCollectionResult4;
    }

    /**
     * Gets the <code>date1</code> property.
     * <p>
     * 
     * @return the current value of the <code>date1</code> property.
     */
    public Date getDate1() {
        return this.date1;
    }

    /**
     * Sets the <code>pDate1</code>.
     * <p>
     * 
     * @param pDate1
     *            holds the new value of <code>date1</code>
     */
    public void setDate1(final Date pDate1) {
        this.date1 = pDate1;
    }

    /**
     * Gets the <code>date2</code> property.
     * <p>
     * 
     * @return the current value of the <code>date2</code> property.
     */
    public Date getDate2() {
        return this.date2;
    }

    /**
     * Sets the <code>pDate2</code>.
     * <p>
     * 
     * @param pDate2
     *            holds the new value of <code>date2</code>
     */
    public void setDate2(final Date pDate2) {
        this.date2 = pDate2;
    }

    /**
     * Gets the <code>date3</code> property.
     * <p>
     * 
     * @return the current value of the <code>date3</code> property.
     */
    public Date getDate3() {
        return this.date3;
    }

    /**
     * Sets the <code>pDate3</code>.
     * <p>
     * 
     * @param pDate3
     *            holds the new value of <code>date3</code>
     */
    public void setDate3(final Date pDate3) {
        this.date3 = pDate3;
    }

    /**
     * Gets the <code>date4</code> property.
     * <p>
     * 
     * @return the current value of the <code>date4</code> property.
     */
    public Date getDate4() {
        return this.date4;
    }

    /**
     * Sets the <code>pDate4</code>.
     * <p>
     * 
     * @param pDate4
     *            holds the new value of <code>date4</code>
     */
    public void setDate4(final Date pDate4) {
        this.date4 = pDate4;
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
     * Sets the <code>pOutstandingForRange1</code>.
     * <p>
     * 
     * @param pOutstandingForRange1
     *            holds the new value of <code>outstandingForRange1</code>
     */
    public void setOutstandingForRange1(final BigDecimal pOutstandingForRange1) {
        this.outstandingForRange1 = pOutstandingForRange1;
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
     * Sets the <code>pOutstandingForRange2</code>.
     * <p>
     * 
     * @param pOutstandingForRange2
     *            holds the new value of <code>outstandingForRange2</code>
     */
    public void setOutstandingForRange2(final BigDecimal pOutstandingForRange2) {
        this.outstandingForRange2 = pOutstandingForRange2;
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
     * Sets the <code>pOutstandingForRange3</code>.
     * <p>
     * 
     * @param pOutstandingForRange3
     *            holds the new value of <code>outstandingForRange3</code>
     */
    public void setOutstandingForRange3(final BigDecimal pOutstandingForRange3) {
        this.outstandingForRange3 = pOutstandingForRange3;
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
     * Sets the <code>pOutstandingForRange4</code>.
     * <p>
     * 
     * @param pOutstandingForRange4
     *            holds the new value of <code>outstandingForRange4</code>
     */
    public void setOutstandingForRange4(final BigDecimal pOutstandingForRange4) {
        this.outstandingForRange4 = pOutstandingForRange4;
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

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }
    
    

}
