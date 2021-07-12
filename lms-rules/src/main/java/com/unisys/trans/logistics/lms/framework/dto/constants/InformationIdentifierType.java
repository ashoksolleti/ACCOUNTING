package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <p>
 * EXP - Export Movement Reference Number
 * </p>
 * <p>
 * TRA - Transit Movement Reference Number
 * </p>
 * <p>
 * IMP - Import Movement Reference Number
 * </p>
 * <p>
 * AGT - US Agent number or Canadian Trader Number
 * </p>
 * <p>
 * TID - Facilities Information and Resource Management Systems Code (FIRMS)
 * </p>
 * <p>
 * DCL - Declarant EORI number for EU Customs.
 * </p>
 * 
 */
public enum InformationIdentifierType {
    AGT,
    DCL,
    EXP,
    HWB,
    IMP,
    TID,
    TRA
}