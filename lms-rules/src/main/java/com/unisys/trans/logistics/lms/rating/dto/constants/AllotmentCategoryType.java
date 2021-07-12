/**
 * 
 */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * 
 *
 */
public enum AllotmentCategoryType {

    AIRLINE_REQUIRED("A", "Airline","AIRLINE"),
    ANY_CATEGORY("C", "Any Category", "ANYCATEGORY"),
    HARD_BLOCK("H", "Hard Block","HARDBLOCK"),
    ALLOTMENT_OPTIONAL("N", "Allotment is optional","ALLOTMENTOPTIONAL"),
    SOFT_BLOCK("S", "Soft Block","SOFTBLOCK");

    private final String allotmentCategory;

    private final String allotmentName;
    private final String allotmentCategoryName;

    AllotmentCategoryType(final String pAllotmentCategory, final String pAllotmentName, final String pAllotmentCategoryName) {
        this.allotmentCategory = pAllotmentCategory;
        this.allotmentName = pAllotmentName;
        this.allotmentCategoryName = pAllotmentCategoryName;
    }

    public static AllotmentCategoryType getAllotmentCategory(String pAllotmentCategory) {
        AllotmentCategoryType returnedAllotmentCategory = null;
        for (AllotmentCategoryType anAllotmentCategory : AllotmentCategoryType.values()) {
            if (anAllotmentCategory.getAllotmentCategory().equalsIgnoreCase(pAllotmentCategory)) {
                returnedAllotmentCategory = anAllotmentCategory;
            }
        }
        return returnedAllotmentCategory;
    }

    public String getAllotmentCategory() {
        return this.allotmentCategory;
    }

    public String getAllotmentName() {
        return this.allotmentName;
    }

    public String getStringValue() {
        return this.allotmentName;
    }
    public String getAllotmentCategoryName() {
        return this.allotmentCategoryName;
    }
}
