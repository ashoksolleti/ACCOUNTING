/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * Indicates the various report types.
 * <p>
 * This contains the following attributes.
 * <li>CONTRACT_EXTRACT - Report type is Contract.</li>
 * <li>TARIFF_EXTRACT - Report type is Tariff.</li>
 * <li>SPOTRATE_EXTRACT - Report type is spot rate.</li>
 */
public enum ExtractType {
    /**
     * Represents the <code>CONTRACT_EXTRACT</code> report.
     */
    CONTRACT_EXTRACT,
    /**
     * Represents the <code>TARIFF_EXTRACT</code> report.
     */
    TARIFF_EXTRACT,
    /**
     * Represents the <code>SPOTRATE_EXTRACT</code> report.
     */
    SPOTRATE_EXTRACT;
}
