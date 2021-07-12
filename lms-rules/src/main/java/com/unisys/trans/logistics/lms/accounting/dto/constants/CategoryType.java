//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;



/**
 * <code>CategoryType</code> holds the constants to indicate Category type
 * applied.
 * <p>
 * Following are the possible AuditStatus type:<br>
 * <ul>
 * <li>AWBLOAD
 * <li>REVCALC
 * <li>PART_RECEIVABLE
 * <li>PART_PAYABLE
 * <li>MAN_AUDIT
 * </ul>
 */
public enum CategoryType {

    /**
     * Constant used for AirwaybillLoad.
     */
    AWBLOAD("AIRWAYBILLLOAD"),
    
    /**
     * Constant used for AirwaybillLoad.
     */
    ACCTAIRWAYBILLUPDATE("ACCOUNTIGAIRWAYBILLUPDATE"),

    /**
     * Constant used for RevenueCalculation.
     */
    REVCALC("REVENUECALCULATION"),

    /**
     * Constant used for ParticipantReceivable.
     */
    PART_RECEIVABLE("PARTICIPANTRECEIVABLE"),

    /**
     * Constant used for ParticipantPayable.
     */
    PART_PAYABLE("PARTICIPANTPAYABLE"),

    /**
     * Constant used for ManualAudit.
     */
    MAN_AUDIT("MANUALAUDIT"),
    
    CARRIER_PAYABLE("CARRIERPAYABLE"),
    
    CARRIER_RECEIVABLE("CARRIERRECEIVABLE"),
    
    AWBONHOLD("AIRWAYBILLHOLD"),
    
   RMONHOLD("REJECTIONMEMOONHOLD"),
    
    AUDITSTATUSCHANGE("AUDITSTATUSCHANGE");

    /**
     * Attribute to hold the <code>category</code> property.
     */
    private String category;

    /**
     * @return the category
     */
    public String getCategory() {
        return this.category;
    }



    /**
     * @param category the category to set
     */
    public void setCategory(final String pCategory) {
        this.category = pCategory;
    }



    /**
     * Parameterize constructor.
     * 
     * @param pPad
     *            the value.
     */
    CategoryType(final String pCategory) {
        this.category = pCategory;
    }



    /**
     * Gives the string format of enumerated <code>CategoryTypr</code>.
     * <p>
     * 
     * @return the current string value of the <code>CategoryTypr</code>.
     */
    public String value() {
        return this.name();
    }

    /**
     *Gets the <code>CategoryType</code>. <p>
     * 
     * @param pCategoryType holds the new value of <code>CategoryTypr</code>
     * <p>
     * 
     * @return the current value of <code>CategoryTypr</code>
     */
    public static CategoryType getCategoryType(final String pCategoryType) {

        CategoryType aCategoryType = null;

        for (final CategoryType aType : CategoryType.values()) {

            if (pCategoryType.equals(aType.getCategory())) {
                aCategoryType = aType;
                break;
            }
        }

        return aCategoryType;

    }
}
