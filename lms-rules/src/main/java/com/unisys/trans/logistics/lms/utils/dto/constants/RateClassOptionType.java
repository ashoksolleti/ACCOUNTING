/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * Indicates whether or not specific type is allowed for rates with this rate class. Possible values are:
 * Optional Mandatory Prohibited
 */
public enum RateClassOptionType {
    /**
     * The specified Type is mandatory for rates with corresponding Rate Class.
     */
    MANDATORY,
    /**
     * The specified Type is optional for rates with corresponding Rate Class.
     */
    OPTIONAL,
    /**
     * The specified Type is Prohibited for rates with corresponding Rate Class.
     */
    PROHIBITED
}