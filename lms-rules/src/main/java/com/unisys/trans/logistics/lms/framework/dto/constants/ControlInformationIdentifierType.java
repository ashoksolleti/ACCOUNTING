package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <p>
 * A Automated Broker Interface (ABI) Filer Code
 * </p>
 * <p>
 * F Facilities Information and Resource Management Systems (FIRMS)
 * </p>
 * <p>
 * M Movement Reference Number (Export, Transit or Import)
 * </p>
 * <p>
 * T Trader Identification Number
 * </p>
 * <p>
 * The Customs-Info-Id value of 'T' with 'AGT' in the Info-Id field is accepted for Country Code CA (Canadian
 * Trader).
 * </p>
 */
public enum ControlInformationIdentifierType {
    A,
    F,
    I,
    M,
    T
}