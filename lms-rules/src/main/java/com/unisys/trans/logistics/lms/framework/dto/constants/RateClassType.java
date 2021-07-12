/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * Rate Class makes the difference in the rules for rating. The following are some of the commonly defined
 * rate classes: M - Minimum N - Normal Q - Quantity U - Unit Load Device
 */

public enum RateClassType {
    /**
     * European Basic Charge.
     */
    B("European Basic Charge", 8, "Basic Charge", true, RateClassOptionType.PROHIBITED,
                RateClassOptionType.PROHIBITED, RateClassOptionType.PROHIBITED,
                RateClassOptionType.PROHIBITED),
    /**
     * Specific Commodity Rate.
     */
    C("Specific Commodity Rate", 7, "Commodity", true, RateClassOptionType.MANDATORY,
                RateClassOptionType.PROHIBITED, RateClassOptionType.PROHIBITED, RateClassOptionType.OPTIONAL),
    /**
     * Unit load device over pivot rate.
     */
    E("Unit load device over pivot rate", 5, "ULD Over Pivot", true, RateClassOptionType.OPTIONAL,
                RateClassOptionType.OPTIONAL, RateClassOptionType.OPTIONAL, RateClassOptionType.OPTIONAL),
    /**
     * European Per Kilo Rate.
     */
    K("European Per Kilo Rate", 9, "Rate Per Kilo", true, RateClassOptionType.PROHIBITED,
                RateClassOptionType.PROHIBITED, RateClassOptionType.PROHIBITED,
                RateClassOptionType.MANDATORY),
    /**
     * Minimum Charge.
     */
    M("Minimum Charge", 1, "Minimum", true, RateClassOptionType.PROHIBITED, RateClassOptionType.PROHIBITED,
                RateClassOptionType.PROHIBITED, RateClassOptionType.PROHIBITED),
    /**
     * Normal under 45 kgs (100 lbs).
     */
    N("Normal under 45 kgs (100 lbs)", 2, "Normal", true, RateClassOptionType.PROHIBITED,
                RateClassOptionType.PROHIBITED, RateClassOptionType.PROHIBITED,
                RateClassOptionType.MANDATORY),
    /**
     * Quantity over 45 kgs (100 lbs).
     */
    Q("Quantity over 45 kgs (100 lbs)", 3, "Quantity", true, RateClassOptionType.PROHIBITED,
                RateClassOptionType.PROHIBITED, RateClassOptionType.PROHIBITED,
                RateClassOptionType.MANDATORY),
    /**
     * Rate Reduction.
     */
    R("Rate Reduction", 10, "Reduction", false, RateClassOptionType.OPTIONAL, RateClassOptionType.OPTIONAL,
                RateClassOptionType.OPTIONAL, RateClassOptionType.OPTIONAL),
    /**
     * Rate Surcharge.
     */
    S("Rate Surcharge", 11, "Surcharge", false, RateClassOptionType.OPTIONAL, RateClassOptionType.OPTIONAL,
                RateClassOptionType.OPTIONAL, RateClassOptionType.OPTIONAL),
    /**
     * Charter Rate.
     */
    T("Charter Rate", 12, "Charter", false, RateClassOptionType.PROHIBITED, RateClassOptionType.PROHIBITED,
                RateClassOptionType.PROHIBITED, RateClassOptionType.PROHIBITED),
    /**
     * Unit load device basic charge.
     */
    U("Unit load device basic charge", 4, "ULD", true, RateClassOptionType.OPTIONAL,
                RateClassOptionType.OPTIONAL, RateClassOptionType.OPTIONAL, RateClassOptionType.OPTIONAL),
    /**
     * ULD tare weight.
     */
    X("ULD tare weight", 6, "ULD Tare Weight", false, RateClassOptionType.OPTIONAL,
                RateClassOptionType.OPTIONAL, RateClassOptionType.OPTIONAL, RateClassOptionType.PROHIBITED),
    /**
     * ULD Discount.
     */
    Y("ULD Discount", 13, "ULD Discount", false, RateClassOptionType.OPTIONAL,
                RateClassOptionType.PROHIBITED, RateClassOptionType.PROHIBITED,
                RateClassOptionType.PROHIBITED);
    /** Rate Class description. */
    private final String description;

    /** Priority with which rate class is displayed. */
    private final int displayPriority;

    /** Rate Class name. */
    private final String rateClassName;

    /** Rate entry allowed indicator. */
    private final boolean rateEntryIndicator;

    /**
     * Indicates whether or not specific commodity numbers are allowed for this rate class.
     */
    private final RateClassOptionType specificCommodityNumbersIndicator;

    /**
     * Indicates whether or not ULD charge codes are allowed for rates with this rate class.
     */
    private final RateClassOptionType uldChargeCodesIndicator;

    /**
     * Indicates whether or not ULD types are allowed for rates with this rate class.
     */
    private final RateClassOptionType uldTypesIndicator;

    private final RateClassOptionType weightRangeIndicator;

    /**
     * Constuctor.
     * 
     * @param pDescription - Rate Class Description
     * @param pDisplayPriority - Rate Class display priority
     * @param pRateClassName - Rate Class Name
     * @param pRateEntryIndicator - Rate Entry allowed indicator
     * @param pSpecificCommodityNumbersIndicator - Indicates whether or not specific commodity numbers are
     *            allowed for this rate class.
     * @param pULDChargeCodesIndicator - Indicates whether or not ULD charge codes are allowed for rates with
     *            this rate class.
     * @param pULDTypesIndicator - Indicates whether or not ULD types are allowed for rates with this rate
     *            class.
     * @param pWeightRangeIndicator - Indicates whether or not a value in the weight break field is allowed
     *            for rates with this rate class.
     */

    RateClassType(final String pDescription, final int pDisplayPriority, final String pRateClassName,
                final boolean pRateEntryIndicator,
                final RateClassOptionType pSpecificCommodityNumbersIndicator,
                final RateClassOptionType pULDChargeCodesIndicator,
                final RateClassOptionType pULDTypesIndicator,
                final RateClassOptionType pWeightRangeIndicator) {
        this.description = pDescription;
        this.displayPriority = pDisplayPriority;
        this.rateClassName = pRateClassName;
        this.rateEntryIndicator = pRateEntryIndicator;
        this.specificCommodityNumbersIndicator = pSpecificCommodityNumbersIndicator;
        this.uldChargeCodesIndicator = pULDChargeCodesIndicator;
        this.uldTypesIndicator = pULDTypesIndicator;
        this.weightRangeIndicator = pWeightRangeIndicator;
    }

    /**
     * Gets the value of description.
     * 
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the value of displayPriority.
     * 
     * @return the displayPriority
     */
    public int getDisplayPriority() {
        return this.displayPriority;
    }

    /**
     * Gets the value of rateClassName.
     * 
     * @return the rateClassName
     */
    public String getRateClassName() {
        return this.rateClassName;
    }

    /**
     * Gets the value of specificCommodityNumbersIndicator.
     * 
     * @return the specificCommodityNumbersIndicator
     */
    public RateClassOptionType getSpecificCommodityNumbersIndicator() {
        return this.specificCommodityNumbersIndicator;
    }

    /**
     * Gets the value of uldChargeCodesIndicator.
     * 
     * @return the uldChargeCodesIndicator
     */
    public RateClassOptionType getUldChargeCodesIndicator() {
        return this.uldChargeCodesIndicator;
    }

    /**
     * Gets the value of uldTypesIndicator.
     * 
     * @return the uldTypesIndicator
     */
    public RateClassOptionType getUldTypesIndicator() {
        return this.uldTypesIndicator;
    }

    /**
     * Gets the value of weightRangeIndicator.
     * 
     * @return the weightRangeIndicator
     */
    public RateClassOptionType getWeightRangeIndicator() {
        return this.weightRangeIndicator;
    }

    /**
     * Gets the value of rateEntryIndicator.
     * 
     * @return the rateEntryIndicator
     */
    public boolean isRateEntryIndicator() {
        return this.rateEntryIndicator;
    }

    /**
     * Gives the string format of enumerated <code>RateClassType</code>.
     * <p>
     * 
     * @return the current string value of the <code>RateClassType</code>.
     */
    public String value() {
        return this.name();
    }
    
    public static RateClassType getRateClassFromName(final String pName){
        RateClassType aRateClassType = null;
        for(RateClassType anEachRateClassType: RateClassType.values()){
            if(anEachRateClassType.name().equalsIgnoreCase(pName)){
                aRateClassType = anEachRateClassType;
            }
        }
        return aRateClassType;
    }
}