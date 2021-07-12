/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>AggregateType</code> class holds the Aggregate Type that hold various type of aggregates as follows:
 * A - Area C - Country R - Region S - Sub area T - City W - World.
 * <p>
 */
public enum AggregateType {

    /**
     * Holds the area aggregate code.
     */
    AGGREGATE_AREA("A", 2, "AREA"),

    /**
     * Holds the city aggregate code.
     */
    AGGREGATE_CITY("T", 6, "CITY"),

    /**
     * Holds the country aggregate code.
     */
    AGGREGATE_COUNTRY("C", 5, "COUNTRY"),

    /**
     * Holds the region aggregate code.
     */
    AGGREGATE_REGION("R", 4, "REGION"),

    /**
     * Holds the sub area aggregate code.
     */
    AGGREGATE_SUBAREA("S", 3, "SUBAREA"),

    /**
     * Holds the world aggregate code.
     */
    AGGREGATE_WORLD("W", 1, "WORLD");

    /**
     * Attribute to hold <code>code</code>.
     */
    private final String code;

    /**
     * Attribute to hold the <code>value</code> property.
     */
    private final int hierarchy;

    /**
     * Attribute to hold <code>name</code>.
     */
    private final String name;

    /**
     * Constructor with type code as an argument.
     * <p>
     * 
     * @param pCode The request object holds the type code.
     * @param pHierarchy The request object holds the type Hierarchy.
     * @param pName The request object holds the type name.
     */
    AggregateType(final String pCode, final int pHierarchy, final String pName) {
        this.hierarchy = pHierarchy;
        this.code = pCode;
        this.name = pName;
    }

    /**
     * Gives the Enumerated type for <code>pAggregateTypeCode</code> of an aggregate.
     * <p>
     * 
     * @param pAggregateTypeCode The code of AggregateType.
     * 
     * @return the enumerated value of the <code>pAggregateTypeCode</code>.<br>
     */
    public static AggregateType getAggregateType(final String pAggregateTypeCode) {
        AggregateType anAggregateType = null;

        for (final AggregateType aType : AggregateType.values()) {
            if (aType.getCode().equals(pAggregateTypeCode)) {
                anAggregateType = aType;
                break;
            }
        }
        return anAggregateType;
    }

    /**
     * Gives the Enumerated type for <code>AggregateType</code> of an aggregate.
     * <p>
     * 
     * @param pAggregateHierarchy The hierarchy of AggregateType.
     * 
     * @return the enumerated value of the <code>AggregateType</code>.<br>
     */
    public static AggregateType getAggregateTypeByHierarchy(final int pAggregateHierarchy) {
        AggregateType anAggregateType = null;

        for (final AggregateType aType : AggregateType.values()) {
            if (aType.getHierarchy() == pAggregateHierarchy) {
                anAggregateType = aType;
                break;
            }
        }
        return anAggregateType;
    }

    /**
     * Gets the <code>code</code> of a aggregate.
     * <p>
     * There can be different types of aggregates.
     * <p>
     * 
     * @return the current value of the <code>code</code>.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the <code>hierarchy</code> property.
     * <p>
     * 
     * @return the current value of the <code>hierarchy</code> property.
     */
    public int getHierarchy() {
        return this.hierarchy;
    }

    /**
     * Gets the <code>name</code> of a aggregate.
     * <p>
     * Name denotes which type of Aggregate it is.
     * <p>
     * 
     * @return the current value of the <code>name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gives the string format of enumerated <code>code</code> for an aggregate.
     * <p>
     * 
     * @return the enumerated value of the <code>code</code>.<br>
     */
    public String value() {
        return this.name();
    }
    public static AggregateType getAggregateByName(final String pAggregateName) {
        AggregateType anAggregateType = null;

        for (final AggregateType aType : AggregateType.values()) {
            if (aType.getName().equals(pAggregateName)) {
                anAggregateType = aType;
                break;
            }
        }
        return anAggregateType;
    }
}
