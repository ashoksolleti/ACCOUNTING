//* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * @author 20536
 * 
 */
public enum ParticipantOutstandingCategory {

    /**
     * Constant used for CA1.
     */
    CA1("CategoryOne"),

    /**
     * Constant used for CA2.
     */
    CA2("CategoryTwo"),

    /**
     * Constant used for CA3.
     */
    CA3("CategoryThree"),

    /**
     * Constant used for CA4.
     */
    CA4("CategoryFour"),
    
    /**
     * Constant used for CA5.
     */
    CA5("CategoryFive");

    /**
     * Attribute to hold the <code>ParticipantOutstandingcategory</code> property.
     */
    private String category;

    /**
     * Constructor with <code>ParticipantOutstandingcategory</code> as an argument.
     * <p>
     * 
     * @param pcategory
     *            the new value of the <code>category</code>.<br>
     * @return
     */

    private ParticipantOutstandingCategory(final String pcategory) {
        this.category = pcategory;
    }

    /**
     * Gets the <code>ParticipantOutstandingCategory</code> based on the given string.
     * 
     * @param pValue
     *            the string representation of <code>ParticipantOutstandingCategory</code>
     * @return
     *         A enum of category <code>ParticipantOutstandingCategory</code>
     */

    public static ParticipantOutstandingCategory fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * This method <code>getParticipantOutstandingCategory</code> returns the ParticipantOutstandingCategory.
     * 
     * @param pgetParticipantOutstandingCategory <code>String</code><br>
     *            The value of due code.<br>
     *            <p>
     * @return
     *         Returns the ParticipantOutstandingCategory of Category <br>
     *         </p>
     */
    public static ParticipantOutstandingCategory getParticipantOutstandingCategory(
                final String pParticipantOutstandingCategory) {

        ParticipantOutstandingCategory anParticipantOutstandingCategory = null;

        for (final ParticipantOutstandingCategory aCategory : ParticipantOutstandingCategory.values()) {
            if (pParticipantOutstandingCategory.equals(aCategory.values())) {
                anParticipantOutstandingCategory = aCategory;
                break;
            }
        }
        return anParticipantOutstandingCategory;
    }

    /**
     * Gets the <code>category</code> property.
     * <p>
     * 
     * @return the current value of the <code>category</code> property.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Sets the <code>pCategory</code>.
     * <p>
     * 
     * @param pCategory
     *            holds the new value of <code>category</code>
     */
    public void setCategory(final String pCategory) {
        this.category = pCategory;
    }

    /**
     * The <code>value</code> method gives the string format of ParticipantOutstandingCategory.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the ParticipantOutstandingCategory.<br>
     */
    public String value() {
        return this.category;
    }

}
