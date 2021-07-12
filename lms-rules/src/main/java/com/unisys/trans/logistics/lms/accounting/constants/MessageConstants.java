/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.accounting.constants;

import com.unisys.trans.logistics.lms.framework.exception.ValidationException;

/**
 * <code>MessageConstants</code> class maintains a list of message constants
 * pertaining to the LMS module.
 */
public final class MessageConstants {

    /* ====================================== */
    /* Accounting related constants. */
    /* ====================================== */

    /**
     * 
     * CRA Reason Type STARTS
     */
    /**
     * 
     * UC025 - MAINTAIN AWB REASON TYPE UPDATE INFORMATION.
     */

    /**
     * 
     * This Constant is used to specify The Reason Type is required.
     * <p>
     * Value = {@value}
     */
    public static final int REASON_TYPE_ENTER_MANDATORY = 1;

    /**
     * 
     * This Constant is used to specify The Reason Type is does not exist in the system.
     * <p>
     * Value = {@value}
     */
    public static final int REASON_TYPE_NOT_EXIST = 2;

    /**
     * 
     * This Constant is used to specify The Reason Type is required.
     * <p>
     * Value = {@value}
     */
    public static final int REASON_TYPE_DESCRIPTION_MANDATORY = 3;

    /**
     * 
     * This Constant is used to specify the Reason Type must be of alphabets, numbers
     * and The Reason Type length must be of 2-3 characters.
     * <p>
     * Value = {@value}
     */
    public static final int REASON_TYPE_REASON_SIZE = 4;

    /**
     * 
     * This Constant is used to specify the Reason Type Description must be of alphabets, numbers, hyphens,
     * spaces
     * and dots and The Reason Type Description length must be of 2-3 characters.
     * <p>
     * Value = {@value}
     */
    public static final int REASON_TYPE_DESCRIPTION_SIZE = 5;

    /**
     * 
     * This Constant is used to specify The selected reason is does not exist in the system.
     * <p>
     * Value = {@value}
     */
    public static final int REASON_NOT_EXIST = 6;

    /**
     * 
     * This Constant is used to specify The Reason Type is Processed successfully.
     * <p>
     * Value = {@value}
     */
    public static final int REASON_TYPE_UPDATED = 7;

    /**
     * 
     * This Constant is used to specify The Reason Type is already exists in the system.
     * <p>
     * Value = {@value}
     */
    public static final int REASON_TYPE_DUPLICATE = 8;

    /**
     * 
     * This Constant is used to specify The Reason Type/Description is added/Deleted.
     * <p>
     * Value = {@value}
     */
    public static final int REASON_TYPE_LIST_ISEMPTY = 9;
    
    /**
     * 
     * This Constant is used to specify The Reason Type/Description is
     * added/Deleted.
     * <p>
     * Value = {@value}
     */
    public static final int REASON_TYPE_NOT_DELETE = 10;

    /**
     * 
     * CRA PArticipant Type STARTS
     */

    public static final int PARTICIPANT_TYPE_NOT_EXISTS = 500;

    public static final int PARTICIPANT_TYPE_ENTER_MANDATORY = 501;

    public static final int PARTICIPANT_TYPE_DESCRIPTION_MANDATORY = 502;

    public static final int PARTICIPANT_TYPE_SIZE = 503;

    public static final int PARTICIPANT_DESCRIPTION_SIZE = 504;

    public static final int PARTICIPANT_TYPE_ALREADY_EXISTS = 505;

    public static final int PARTICIPANT_TYPE_PROCESSED = 506;

    public static final int PREDEFINED_PARTICIPANTS_EXISTS_DELETE = 507;

    public static final int PARTICIPANT_TYPE_LIST_ISEMPTY = 508;
    
    public static final int INVOICE_GENERATION_DATE_ISEMPTY = 90080;

    /**
     * 
     * UC030 - MAINTAIN ACCOUNTING PARTICIPANT INFORMATION MESSAGES
     */

    /**
     * 
     * This Constant is used to specify the Participant Name must be of alphabets, numbers, hyphens, spaces
     * and dots and The Participant Name length must be of 1-35 characters.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_NAME_INVALID = 71;

    /**
     * 
     * This Constant is used to specify The Participant Name is required, if account number is not input.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTCIPANT_NAME_REQUIRED = 72;

    /**
     * 
     * This Constant is used to specify The Station must be 3 alpha characters.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_STATION_INVALID = 73;

    /**
     * 
     * This Constant is used to specify The Station is required, if account number is not input.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_STATION_REQUIRED = 74;

    /**
     * 
     * This Constant is used to specify The Account Number must be of alphabets, numbers, hyphens, spaces and
     * dots and The Account Number must be 1-14 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_ACCOUNT_NUMBER_INVALID = 75;

    /**
     * 
     * This Constant is used to specify The Account Number is required, if the Participant Name is not input.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_ACCOUNT_NUMBER_REQUIRED = 76;

    /**
     * 
     * This Constant is used to specify Accounting Participant Information not found in the accounting system.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_NOT_EXIST = 77;

    /**
     * 
     * This Constant is used to specify Accounting Participant Information created.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_CREATED = 78;

    /**
     * 
     * This Constant is used to specify Accounting Participant Information updated.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_UPDATED = 79;

    /**
     * 
     * This Constant is used to specify Accounting Participant Information has been marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_MARK_FOR_DELETION = 80;

    /**
     * 
     * This Constant is used to specify Accounting Participant Information restored.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_RESTORED = 81;

    /**
     * 
     * This Constant is used to specify The IATA Account Number must be of the format 2n-1n 4n or 2n-1n 4n/4n.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_IATA_ACCOUNT_NUMBER_FORMAT = 82;

    /**
     * 
     * This Constant is used to specify The IATA Account Number is required, if the Participant Name is not
     * input.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_IATA_ACCOUNT_NUMBER_REQUIRED = 83;

    /**
     * 
     * This Constant is used to specify The Account Search must be \u2018B\u2019 or \u2018I\u2019.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_ACCOUNT_SEARCH = 84;

    /**
     * 
     * This Constant is used to specify The Account Settlement Party Name must be of alphabets, numbers,
     * hyphens, spaces and dots and The Account Settlement Party Name must be of 1-35 characters.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_SETTLEMENTPARTY_NAME_INVALID = 85;

    /**
     * 
     * This Constant is used to specify The Account Settlement Party Telephone must be of alphabets, numbers,
     * hyphens, spaces and dots and The Account Settlement Party Telephone must be of 1-18 characters.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_SETTLEMENTPARTY_TELEPHONE_INVALID = 86;

    /**
     * 
     * This Constant is used to specify The Account Settlement Party Telex must be of alphabets, numbers,
     * hyphens, spaces and dots and The Account Settlement Party Telex must be of 1-18 characters.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_SETTLEMENTPARTY_INVALID = 87;

    /**
     * 
     * This Constant is used to specify The Account Sub-Type must be of 1-2 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_ACCOUNT_SUBTYPE_INVALID = 88;

    /**
     * 
     * This Constant is used to specify The Account Group must be of 1-6 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_ACCOUNT_GROUP_INVALID = 89;

    /**
     * 
     * This Constant is used to specify The Account Language must be of 3 alpha characters.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_ACCOUNT_LANGUAGE = 90;

    /**
     * 
     * This Constant is used to specify The Invoice Language is required.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_INVOICE_LANGUAGE_REQUIRED = 91;

    /**
     * 
     * This Constant is used to specify The Invoice Language must be 3 characters.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_INVOICE_LANGUAGE_TYPE_SIZE = 92;

    /**
     * 
     * This Constant is used to specify The Invoice Site is required.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_INVOICE_SITE_REQUIRED = 93;

    /**
     * 
     * This Constant is used to specify The Invoice Site must be 3 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_INVOICE_SITE_TYPE_SIZE = 94;

    /**
     * 
     * This Constant is used to specify The Billing Currency is required.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_CURRENCY_REQUIRED = 95;

    /**
     * 
     * This Constant is used to specify The Billing Currency must be 3 alpha characters.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_CURRENCY_TYPE_SIZE = 96;

    /**
     * 
     * This Constant is used to specify The Billing-Payment Due Days must be 3 numeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_PAYMENT_DUE_DAYS_TYPE_SIZE = 97;

    /**
     * 
     * This Constant is used to specify The Service Fee Percentage must be from ".001" to "99.9\u201D.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_SERVICE_FEE_PERCENTAGE_TYPE_SIZE = 98;

    /**
     * 
     * This Constant is used to specify The Billing-Payment Discount Days must be 1-3 numeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING__BILLING_PAYMENT_DISCOUNT_DAYS_TYPE_SIZE = 99;

    /**
     * 
     * This Constant is used to specify The Discount Percentage must be from "0.10" to "99.9\u201D.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_DISCOUNT_PERCENTAGE_TYPE_SIZE = 100;

    /**
     * 
     * This Constant is used to specify The Commission Percentage must be from "0.10" to "99.9\u201D.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_COMMISION_PERCENTAGE_TYPE_SIZE = 101;

    /**
     * 
     * This Constant is used to specify The Incentive Percentage must be from "0.10" to "99.9\u201D.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_INCENTIVE_PERCENTAGE_TYPE_SIZE = 102;

    /**
     * 
     * This Constant is used to specify The Collector ID must be 1-10 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int CREDIT_COLLECTOR_ID_TYPE_SIZE = 103;

    /**
     * 
     * This Constant is used to specify The Collection Action must be 1-18 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int CREDIT_COLLECTION_ACTION_TYPE_SIZE = 104;

    /**
     * 
     * This Constant is used to specify The Collection Date is required if collection Action is input.
     * <p>
     * Value = {@value}
     */
    public static final int CREDIT_COLLECTION_DATE_REQUIRED = 105;

    /**
     * 
     * This Constant is used to specify The Collection Date must be of the format DDMMMYY.
     * <p>
     * Value = {@value}
     */
    public static final int CREDIT_COLLECTION_DATE_FORMAT = 106;

    /**
     * 
     * This Constant is used to specify The Collection Result is required if collection Action is input.
     * <p>
     * Value = {@value}
     */
    public static final int CREDIT_COLLECTION_RESULT_REQUIRED = 107;

    /**
     * 
     * This Constant is used to specify The Collection Result must be 1-35 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int CREDIT_RESULT_TYPE_SIZE = 108;

    /**
     * 
     * This Constant is used to specify The Area Representative must be 1-3 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_AREA_REP_TYPE_SIZE = 117;

    /**
     * 
     * This Constant is used to specify The Country Representative must be 1-3 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_COUNTRY_REP_TYPE_SIZE = 118;

    /**
     * 
     * This Constant is used to specify The Stations must be 3 alpha characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_STATION_CODE_TYPE_SIZE = 119;

    /**
     * 
     * This Constant is used to specify Sales Contact 1 must be of alphabets, numbers, hyphens, spaces and
     * dots and Sales Contact 1 must be of 1-35 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_SALESCONTACT1_INVALID = 120;

    /**
     * 
     * This Constant is used to specify Sales Contact 2 must be of alphabets, numbers, hyphens, spaces and
     * dots and Sales Contact 2 must be of 1-35 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_SALESCONTACT2_INVALID = 121;

    /**
     * 
     * This Constant is used to specify Sales Contact Telephone must be of alphabets, numbers, hyphens, spaces
     * and dots and Sales Contact Telephone must be of 1-18 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_PHONE_INVALID = 122;

    /**
     * 
     * This Constant is used to specify The Sales Contact Fax must be of alphabets, numbers, hyphens, spaces
     * and dots and The Sales Contact Fax must be of 1-18 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_FAX_INVALID = 123;

    /**
     * 
     * This Constant is used to specify Sales Contact Address must be of alphabets, numbers, hyphens, spaces
     * and dots and Sales Contact Address must be of 1-35 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_ADDRESS_INVALID = 124;

    /**
     * 
     * This Constant is used to specify Sales Contact City must be of alphabets, numbers, hyphens, spaces and
     * dots and Sales contact city must be of 1-17 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_CITY_INVALID = 125;

    /**
     * 
     * This Constant is used to specify Sales Contact State must be of alphabets, numbers, hyphens, spaces and
     * dots and The Sales Contact State must be of 1-9 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_STATE_INVALID = 126;

    /**
     * 
     * This Constant is used to specify The Sales Contact Country must be of 2 alpha characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_COUNTRY_INVALID = 127;

    /**
     * 
     * This Constant is used to specify Sales Contact Postal Code must be of alphabets, numbers, hyphens,
     * spaces and dots and The Sales Contact Postal Code must be of 1-9 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_POSTALCODE_INVALID = 128;

    /**
     * 
     * This Constant is used to specify The Sales Contact Date must be of the format DDMMMYY.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_CONTACT_DATE_FORMAT = 129;

    /**
     * 
     * This Constant is used to specify The Sales Contact Remarks is required, if the Sales Contact Date is
     * input.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_CONTACT_DATE_REQUIRED = 130;

    /**
     * 
     * This Constant is used to specify The Sales Contact Remarks must be of alphabets, numbers, hyphens,
     * spaces and dots and The Sales Contact Remarks must be of 1-40 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_REMARKS_INVALID = 131;

    /**
     * 
     * This Constant is used to specify The Contact Information must be of alphabets, numbers, hyphens, spaces
     * and dots and The Contact Information must be of 1-55 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_CONTACT_INFO_INVALID = 132;

    /**
     * 
     * This Constant is used to specify The Nature of Business must be of alphabets, numbers, hyphens, spaces
     * and dots and The Nature of Business must be of 1-55 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_NATURE_OF_BUSINESS_TYPE_SIZE = 133;

    /**
     * 
     * This Constant is used to specify The Primary Commodity must be of alphabets, numbers, hyphens, spaces
     * and dots and The Primary Commodity must be of 1-55 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_PRIMARY_COMMODITY_TYPE_SIZE = 134;

    /**
     * 
     * This Constant is used to specify The Seasonal Shipping must be of alphabets, numbers, hyphens, spaces
     * and dots and The Seasonal Shipping must be of 1-55 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_SEASONAL_SHIPPING_TYPE_SIZE = 135;

    /**
     * 
     * This Constant is used to specify The Special Handling must be of alphabets, numbers, hyphens, spaces
     * and dots and The Special Handling must be of 1-55 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_SPECIAL_CODE_TYPE_SIZE = 136;

    /**
     * 
     * This Constant is used to specify Account executive must be of alphabets, numbers, hyphens, spaces and
     * dots and Account executive must be of 1-55 characters.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_ACCOUNT_EXECITIVE_SIZE = 137;

    /**
     * 
     * This Constant is used to specify Accounting Participant information already exists in the system.
     * <p>
     * Value = {@value}
     */

    public static final int ACCOUNTING_PARTICIPANT_ALREADY_EXIST = 142;

    /**
     * 
     * This Constant is used to specify If the Participant Type is set as Government Account, then the Invoice
     * Media, must be Government Form.
     * <p>
     * Value = {@value}
     */
    public static final int ACOUNT_TYPE_INVOICE_MEDIA_TYPE = 143;

    /**
     * 
     * This Constant is used to specify If the Account Type is set as Interline Account, then the Invoice
     * Media must be CASS Tape.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNT_TYPEEE_INVOICE_MEDIA_TYPE = 144;

    /**
     * 
     * This Constant is used to specify The CASS number has to be alphanumeric only. It must not exceed 14
     * characters. It can include hyphen (-), Period (.) or spaces too.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNT_CASS_NUMBER_SIZE = 145;

    /**
     * 
     * This Constant is used to specify Invoice Language must be English(ENG).
     * <p>
     * Value = {@value}
     */
    public static final int INVOICE_LANGUAGE_ENGLISH = 146;

    /**
     * 
     * This Constant is used to specify Invalid Email Address.
     * <p>
     * Value = {@value}
     */
    public static final int SALES_EMAIL_INVALID = 147;

    /**
     * 
     * This Constant is used to specify Invalid station code.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_STATION_INVALID_CODE = 148;

    /**
     * 
     * This Constant is used to specify Invalid currency code.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_CURRENCY_INVALID_CODE = 149;

    /**
     * 
     * This Constant is used to specify the station is duplicated.
     * <p>
     * Value = {@value}
     */
    public static final int DUPLICATE_OF_STATIONS = 150;

    /**
     * 
     * This Constant is used to specify the Interline account cannot be updated.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_CANT_UPDATED = 151;

    /**
     * 
     * This Constant is used to specify the Government account cannot be updated.
     * <p>
     * Value = {@value}
     */
    public static final int GOVERNMENT_CANT_UPDATED = 152;

    /**
     * 
     * This Constant is used to specify the payable account cannot be updated.
     * <p>
     * Value = {@value}
     */
    public static final int PAYABLE_CANT_UPDATED = 153;

    /**
     * 
     * This Constant is used to specify the country is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int COUNTRY_INVALID = 154;

    public static final int PARTICIPANT_TYPE_REQUIRED = 155;

    public static final int INVOICE_MEDIA_REQUIRED = 156;

    public static final int INVOICE_FREQUENCY_REQUIRED = 157;

    public static final int INVOICE_SEQUENCE_REQUIRED = 158;

    /**
     * 
     * This Constant is used to specify The ISC Percentage must be from
     * "0.10" to "99.9\u201D.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_ISC_PERCENTAGE_TYPE_SIZE = 159;

    /**
     * 
     * This Constant is used to specify if the prorate exist or not.
     * <p>
     * Value = {@value}
     */
    public static final int PRORATE_DOES_NOT_EXISTS = 251;

    /**
     * 
     * This Constant is used to specify if the prorate agreement id must be valid.
     * <p>
     * Value = {@value}
     */
    public static final int AGREEMENT_ID_1_TO_12_NUMERIC = 252;

    /**
     * 
     * This Constant is used to specify if the carrier code must be valid.
     * <p>
     * Value = {@value}
     */

    public static final int CARRIER_CODE_MUST_BE_VALID = 253;

    /**
     * This Constant is used to specify origin code type size error.
     * <p>
     * Value = {@value}
     */
    public static final int ORIGIN_CODE_TYPE_SIZE = 254;

    /**
     * This Constant is used to specify the destination code type size.
     * <p>
     * Value = {@value}
     */

    public static final int DESTINATION_CODE_MUST_BE_1_TO_7_ALPAHANUMERIC = 255;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int CARRIER_CODE_DOES_NOT_EXIST = 256;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int TOCARRIER_MANDATORY = 257;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int ORIGIN_MANDATORY = 258;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int DESTINATION_MANDATORY = 259;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PRORATE_AGREEMENT_ENTRIES_REQUIRED = 260;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int CURRENCY_CODE_MANDATORY = 261;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int EFFECTIVE_DATE_MADANTORY = 262;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int WEIGHT_UNIT_MANDATORY = 263;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int WEIGHT_TYPE_MANDATORY = 264;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_ON_BASED_MANDATORY = 265;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PRODUCT_CODE_TYPE_SIZE = 266;

    //New
    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int ROUTING_TYPE_SIZE = 300;
    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_NUMBER_TYPE_SIZE = 267;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int SPECIAL_HANDLING_CODE_TYPE_SIZE = 268;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int CONNECTION_STATION_TYPE_SIZE = 269;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int MINIMUM_WEIGHT_TYPE_SIZE = 270;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int MAXMUM_WEIGHT_TYPE_SIZE = 271;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_TYPE_SIZE = 272;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int CURRENCY_CODE_TYPE_SIZE = 273;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_TYPE_SIZE = 274;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int VALID_FROM_TO_TIME = 275;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int OPERATION_FROMTIME_LESSER_THAN_OPERATION_TOTIME = 276;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int OPERATION_FROMTIME_FORMAT = 277;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int OPERATION_TOTIME_FORMAT = 278;

    public static final int PRORATE_AGREEMENT_ALREADY_EXIST_ORIGIN_DESTINATION = 279;

    public static final int PRORATE_AGREEMENT_ENTRIES_HAS_DUPLICATES = 280;

    public static final int PRORATE_AGREEMENT_CREATED_SUCCESSFULLY = 281;

    /**
     * This Constant is used to specify carrier number not exists.
     * <p>
     * Value = {@value}
     */
    public static final int CARRIER_NUMBER_DOES_NOT_EXIST = 282;
    
    
    /**
     * 
     * This Constant is used to specify if the carrier code must be valid.
     * <p>
     * Value = {@value}
     */

    public static final int BILLED_CARRIER_CODE_MUST_BE_VALID = 301;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int AIRWAYBILL_ORIGIN_CODE_TYPE_SIZE = 401;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int AIRWAYBILL_DESTINATION_CODE_TYPE_SIZE = 402;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int FLOWN_ORIGIN_CODE_TYPE_SIZE = 403;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int FLOWN_DESTINATION_CODE_TYPE_SIZE = 404;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_CODE_TYPE_SIZE = 405;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_CLASS_TYPE_SIZE = 406;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_MINIMUM_WEIGHT_TYPE_SIZE = 407;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_MAXMUM_WEIGHT_TYPE_SIZE = 408;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_WEIGHT_RATE_TYPE_SIZE = 409;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_MINIMUM_AMOUNT_TYPE_SIZE = 410;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_MAXIMUM_AMOUNT_TYPE_SIZE = 411;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_MINIMUM_PERCENT_TYPE_SIZE = 412;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_MAXIMUM_PERCENT_TYPE_SIZE = 413;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_PROVISO_DOES_NOT_EXISTS = 414;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int AIRWAYBILL_ORIGIN_CODE_MANDATORY = 415;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int AIRWAYBILL_DESTINATION_CODE_MANDATORY = 416;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int FLOWN_ORIGIN_CODE_MANDATORY = 417;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int FLOWN_DESTINATION_CODE_MANDATORY = 418;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int RATE_CLASS_MADANTORY = 419;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int CODE_DOES_NOT_EXIST = 420;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int CITY_CODE_DOES_NOT_EXIST = 421;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int AIRPORT_CODE_DOES_NOT_EXIST = 422;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int AGGREGATE_DOES_NOT_EXIST = 423;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int COUNTRY_CODE_DOES_NOT_EXIST = 424;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int ORIGIN_DESTINATION_SAME = 425;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int AGGREGATE_MARKED_FOR_DELETION = 426;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int AIRPORT_MARKED_FOR_DELETION = 427;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int CITY_CODE_MARKED_FOR_DELETION = 428;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */

    public static final int AGGREGATE_MUST_BE_MEMBERSHIP_COUNTRY = 429;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int AGGREGATE_NOT_ALLOWED_FOR_PROVISO_RATE = 430;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_DOES_NOT_EXIST_ORIGIN_DESTINATION = 431;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_CREATED_SUCCESSFULLY = 432;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int CARRIER_CODE_MARKED_FOR_DELETION = 433;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_ALREADY_EXIST_ORIGIN_DESTINATION = 434;

    /**
     * This Constant is used to specify carrier code not exists.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_ENTRIES_HAS_DUPLICATES = 435;

    public static final int PROVISO_EFFECTIVE_DATE_CAN_NOT_BE_PAST = 436;

    public static final int PROVISO_RATE_EFFECTIVE_DATE_IS_LESS_THAN_EXPIRED_DATE = 437;

    public static final int NO_PROVISO_FOUND_FOR_ORIGIN_AND_DESTINATION = 438;

    public static final int PROVISO_CARRIER_MODIFIED = 439;

    public static final int PROVISO_AIRWAYORIGIN_MODIFIED = 440;

    public static final int PROVISO_AIRWAYDESTIANTION_MODIFIED = 441;

    public static final int PROVISO_FLOWNORIGIN_MODIFIED = 442;

    public static final int PROVISO_FLOWNDESTIANTION_MODIFIED = 443;

    /**********************************************************/
    /** START OF UC005 - Interline Agreement Maintenance **/
    /**********************************************************/
    /**
     * This Constant is used to specify that the interline agreement does not exist for given date range.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_ENTRIES_DOES_NOT_EXIST_FOR_THE_GIVEN_DATE_RANGE = 700;

    /**
     * This Constant is used to specify the interline agreements does not exist for the given fields
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_DOES_NOT_EXIST_FOR_THE_GIVEN_FIELDS = 701;

    /**
     * This Constant is used to specify carrier code is mandatory for given ACN number.
     * <p>
     * Value = {@value}
     */
    public static final int CARRIER_MANDATORY_FOR_ACN = 702;

    /**
     * This Constant is used to specify that the spa agreement does not exist for given identifier.
     * <p>
     * Value = {@value}
     */
    public static final int SPA_DOES_NOT_EXIST_FOR_PRORATE_IDENTIFIER = 703;

    /**
     * This Constant is used to specify that the proviso agreement does not exist for given identifier.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_AGREEMENT_DOES_NOT_EXIST_FOR_PROVISO_IDENTIFIER = 704;

    /**
     * This Constant is used to specify carrier number is marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int CARRIER_NUMBER_MARKED_FOR_DELETION = 705;

    /**
     * This Constant is used to specify that the agreement is already exist.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_ALREADY_EXIST_ORIGIN_DESTINATION = 706;

    /**
     * This Constant is used to specify that the end date is in between the effective and the end date of
     * agreement.
     * <p>
     * Value = {@value}
     */
    public static final int CURRENCY_END_DATE_IS_IN_BETWEEN_EFFECTIVE_AND_END_DATE_OF_THE_AGREEMENT = 707;

    /**
     * This Constant is used to specify that the expiration date cannot be less than the effective date.
     * <p>
     * Value = {@value}
     */
    public static final int EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE = 708;

    /**
     * This Constant is used to specify that the effective date cannot be past date.
     * <p>
     * Value = {@value}
     */
    public static final int EFFECTIVE_DATE_CANNOT_BE_PAST_DATE = 709;

    /**
     * This Constant is used to specify that the maximum amount should be greater than the minimum amount.
     * <p>
     * Value = {@value}
     */
    public static final int MAXIMUM_AMOUNT_GREATER_THAN_MINIMUM_AMOUNT = 710;

    /**
     * This Constant is used to specify that the maximum weight should be greater than the minimum weight.
     * <p>
     * Value = {@value}
     */
    public static final int MAXIMUM_WEIGHT_GREATER_THAN_MINIMUM_WEIGHT = 711;

    /**
     * This Constant is used to specify that maximum percent should be greater than minimu percent.
     * <p>
     * Value = {@value}
     */
    public static final int MAXIMUM_PERCENT_GREATER_THAN_MINIMUM_PERCENT = 712;

    /**
     * This Constant is used to specify that the agreement is created successfully.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_CREATED_SUCCESSFULLY = 713;

    /**
     * This Constant is used to specify that the spa entries has duplicates.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_SPA_ENTRIES_HAS_DUPLICATES = 715;

    /**
     * This Constant is used to specify the agreement is deleted successfully.
     * <p>
     * Value = {@value}
     */
    public static final int AGRREMENT_DELETED_SUCCESSFULLY = 716;

    /**
     * This Constant is used to specify that the active spa cannot be deleted.
     * <p>
     * Value = {@value}
     */
    public static final int SPA_ACTIVE_CANT_BE_DELETED = 717;

    /**
     * This Constant is used to specify that the active proviso cannot be deleted.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_ACTIVE_CANT_BE_DELETED = 718;

    /**
     * This Constant is used to specify that the proviso entries has duplicates.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_PROVISO_ENTRIES_HAS_DUPLICATES = 719;

    /**
     * This Constant is used to specify that the expired spa cannot be updated.
     * <p>
     * Value = {@value}
     */
    public static final int SPA_AGREEMENT_EXPIRED_CANNOT_UPDATE = 720;

    /**
     * This Constant is used to specify that the carrier ACN must be valid.
     * <p>
     * Value = {@value}
     */
    public static final int CARRIER_ACN_MUST_BE_VALID = 721;

    /**
     * This Constant is used to specify that the agreement id must be valid.
     * <p>
     * Value = {@value}
     */
    public static final int AGREEMENT_ID_MUST_BE_VALID = 722;

    public static final int PRORATE_AGREEMENT_ID_MUST_BE_VALID = 1109;

    public static final int PROVISO_AGREEMENT_ID_MUST_BE_VALID = 1110;

    /**
     * This Constant is used to specify that the agreement does not exists
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_DOES_NOT_EXISTS = 723;

    /**
     * This Constant is used to specify that the to carrier is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_TOCARRIER_MANDATORY = 724;

    /**
     * This Constant is used to specify hat the airway bill origin code is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_AIRWAYBILL_ORIGIN_CODE_MANDATORY = 725;

    /**
     * This Constant is used to specify that the airway bill destination code is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_AIRWAYBILL_DESTINATION_CODE_MANDATORY = 726;

    /**
     * This Constant is used to specify that the issuing ACN is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_ISSUING_ACN__MANDATORY = 727;

    /**
     * This Constant is used to specify that the to carrier is mandatory for ACN.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_TOCARRIER_MANDATORY_FOR_ACN = 728;

    /**
     * This Constant is used to specify that the weight type is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_WEIGHT_TYPE_MANDATORY = 729;

    /**
     * This Constant is used to specify that the rate based on is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_RATE_BASED_ON_MANDATORY = 730;

    /**
     * This Constant is used to specify that the currency is mandatory
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_CURRENCY_MANDATORY = 731;

    /**
     * This Constant is used to specify that the weight unit mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_WEIGHT_UNIT_MANDATORY = 732;

    /**
     * This Constant is used to specify that the agreement effective date is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_EFFECTIVE_DATE_MADANTORY = 733;

    /**
     * This Constant is used to specify the segment origin code is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_SEGMENT_ORIGIN_CODE_MANDATORY = 734;

    /**
     * This Constant is used to specify that the segment destination code is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_SEGMENT_DESTINATION_CODE_MANDATORY = 735;

    /**
     * This Constant is used to specify the agreement identifier is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_SPA_AGREEMENT_IDENTIFIER_MANDATORY = 736;

    /**
     * This Constant is used to specify the carrier code type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_CARRIER_CODE_MUST_BE_VALID = 737;

    /**
     * This Constant is used to specify the product code type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_PRODUCT_CODE_TYPE_SIZE = 738;

    /**
     * This Constant is used to specify the commodity code type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_COMMODITY_CODE_TYPE_SIZE_FOR_AGREEMENT = 739;

    /**
     * This Constant is used to specify the other charge code type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_OTHER_CHARGE_CODE_TYPE_SIZE = 740;

    /**
     * This Constant is used to specify the flight number type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTR_AGRR_FLIGHT_NUMBER_TYPE_SIZE = 741;

    /**
     * This Constant is used to specify the special handling code type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_SPL_CODE_TYPE_SIZE = 742;

    /**
     * This Constant is used to specify the agreement uld type's type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_ULD_TYPE_SIZE = 743;
    
    /**
     * This Constant is used to specify the agreement Routing size.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_ROUTING_SIZE = 699;

    /**
     * This Constant is used to specify the agreement segment origin type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_SEGMENT_SEGMENT_ORIGIN_CODE_TYPE_SIZE = 744;

    /**
     * This Constant is used to specify the agreement segment destination type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_SEGMENT_SEGMENT_DESTINATION_CODE_TYPE_SIZE = 745;

    /**
     * This Constant is used to specify the agreement minimum weight type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_MINIMUM_WEIGHT_TYPE_SIZE = 746;

    /**
     * This Constant is used to specify the agreement maximum weight type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_MAXMUM_WEIGHT_TYPE_SIZE = 747;

    /**
     * This Constant is used to specify that the currency code type size
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGRM_CURRENCY_CODE_TYPE_SIZE = 748;

    /**
     * This Constant is used to specify that the rate type size
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGRM_RATE_TYPE_SIZE = 749;

    /**
     * This Constant is used to specify the minimum amount type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTR_AGRM_MINIMUM_AMOUNT_TYPE_SIZE = 750;

    /**
     * This Constant is used to specify the maximum amount type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTR_AGRM_MAXIMUM_AMOUNT_TYPE_SIZE = 751;

    /**
     * This Constant is used to specify the minimum percent type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTR_AGRM_MINIMUM_PERCENT_TYPE_SIZE = 752;

    /**
     * This Constant is used to specify the maximum percent type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTR_AGRM_MAXIMUM_PERCENT_TYPE_SIZE = 753;

    /**
     * This Constant is used to specify that the effective date cannot be changed.
     * <p>
     * Value = {@value}
     */
    public static final int ACTIVE_AGREEMENT_EFFECTIVE_DATE_CANNOT_BE_CHANGED = 754;

    /**
     * This Constant is used to specify that the interline agreement is updated successfully.
     * <p>
     * Value = {@value}
     */
    public static final int INTELINE_AGREEMENT_UPDATED_SUCCESSFULLY = 755;

    /**
     * This Constant is used to specify that the product code is not effective for spa.
     * <p>
     * Value = {@value}
     */
    public static final int PRODUCT_CODE_NOT_EFFECTIVE_FOR_SPA = 756;

    /**
     * This Constant is used to specify that the product code is not effective for proviso.
     * <p>
     * Value = {@value}
     */
    public static final int PRODUCT_CODE_NOT_EFFECTIVE_FOR_PROVISO = 757;

    /**
     * This Constant is used to specify that the product code is not effective for proviso.
     * <p>
     * Value = {@value}
     */
    public static final int ROUTING_NOT_VALID = 698;
    /**
     * This Constant is used to specify that the product code does not exist
     * <p>
     * Value = {@value}
     */
    public static final int PRODUCT_CODE_DOES_NOT_EXIST = 758;

    /**
     * This Constant is used to specify that the uld type does not exist
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_CODE_DOES_NOT_EXIST = 759;

    /**
     * This Constant is used to specify that the ULD Type is marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_MARKED_FOR_DELETION = 760;

    /**
     * This Constant is used to specify that atleast on entry is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_ENTRIES_MANDATORY = 761;

    /**
     * This Constant is used to specify the commission percent type size
     * <p>
     * Value = {@value}
     */
    public static final int INTR_AGRM_COMMISSION_PERCENT_TYPE_SIZE = 762;

    /**
     * This Constant is used to specify that the carrier code is modified.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_CARRIER_CODE_MODIFIED = 763;

    /**
     * This Constant is used to specify that the issuing ACN is modified.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_ISSUING_CODE_MODIFIED = 764;

    /**
     * This Constant is used to specify that the airway bill origin is modified.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AIRWAYBILL_ORIGIN_MODIFIED = 765;

    /**
     * This Constant is used to specify that the airway bill destination is modified.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AIRWAYBILL_DESTINTION_MODIFIED = 766;

    /**
     * This Constant is used to specify that the spa identifier is modified.
     * <p>
     * Value = {@value}
     */
    public static final int SPA_IDENTIFIER_MODIFIED = 767;

    /**
     * This Constant is used to specify that the expired agreement cannot be updated or deleted
     * <p>
     * Value = {@value}
     */
    public static final int EXPIRED_AGREEMENT_CANNOT_BE_UPDATED_OR_DELETED = 768;

    /**
     * This Constant is used to specify that the interline agreement is already exist
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_ALREADY_EXIST_FOR_AGREEMENT_ID = 769;

    /**
     * This Constant is used to specify that the spa date range overlaps with another date range.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_SPA_ENTRIES_DATE_RANGE_OVERLAPS = 770;

    /**
     * This Constant is used to specify that the proviso date range overlaps with another date range.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_PROVISO_ENTRIES_DATE_RANGE_OVERLAPS = 771;

    /**
     * This Constant is used to specify that the spa weight range overlaps with another weight range.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_SPA_ENTRIES_WEIGHT_RANGE_OVERLAPS = 772;

    /**
     * This Constant is used to specify that the proviso entries weight ranges were overlapping with another
     * entry.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_PROVISO_ENTRIES_WEIGHT_RANGE_OVERLAPS = 773;

    /**
     * This Constant is used to specify that atleast one entry is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int ATLEAST_ONE_FIELD_MANDATORY = 774;

    /**
     * This Constant is used to specify that the other charge code has duplicates.
     * <p>
     * Value = {@value}
     */
    public static final int OTHER_CHARGE_CODE_HAS_DUPLICATES = 775;

    /**
     * This Constant is used to specify that the special handling code has duplicates.
     * <p>
     * Value = {@value}
     */
    public static final int SPECIAL_HANDLING_CODE_HAS_DUPLICATES = 776;

    /**
     * This Constant is used to specify that the commodity has duplicates.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_CODE_HAS_DUPLICATES = 777;

    /**
     * This Constant is used to specify that the flight number has duplicates .
     * <p>
     * Value = {@value}
     */
    public static final int FLIGHT_NUMBER_CODE_HAS_DUPLICATES = 778;

    /**
     * This Constant is used to specify that the uld type has duplicates.
     * <p>
     * Value = {@value}
     */
    public static final int ULD_TYPE_CODE_HAS_DUPLICATES = 779;

    /**
     * This Constant is used to specify that the product codes has duplicates.
     * <p>
     * Value = {@value}
     */
    public static final int PRODUCT_CODE_HAS_DUPLICATES = 780;

    /**
     * This Constant is used to specify that the product codes has duplicates.
     * <p>
     * Value = {@value}
     */
    public static final int ROUTING_HAS_DUPLICATES = 73012;
    /**
     * This Constant is used to specify that the minimum and maximum weight is mandatory when rate based on is
     * given as FLAT.
     * <p>
     * Value = {@value}
     */
    public static final int MIN_MAX_WEIGHT_MANDATORY_WHEN_RATE_BASED_ON_FLAT = 781;

    /**
     * This Constant is used to specify that the rate is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_RATE_MANDATORY = 782;

    /**
     * This Constant is used to specify that the proviso agreement identifier is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_PROVISO_AGREEMENT_IDENTIFIER_MANDATORY = 783;

    /**
     * This Constant is used to specify that agreement expiring today cannot be updated.
     * <p>
     * Value = {@value}
     */
    public static final int ACTIVE_AGREEMENT_EXPIRE_TODAY_CANNOT_BE_CHANGED = 784;

    /**
     * This Constant is used to specify that the proviso identifier is modified.
     * <p>
     * Value = {@value}
     */
    public static final int PROVISO_IDENTIFIER_MODIFIED = 785;

    /**
     * This Constant is used to specify pivot weight type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_PIVOT_WEIGHT_TYPE_SIZE = 786;

    /**
     * This Constant is used to specify over pivot rate is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_OVER_PIVOT_RATE_MANDATORY = 787;

    /**
     * This Constant is used to specify over pivot rate type size.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_OVER_PIVOT_RATE_TYPE_SIZE = 788;

    /**
     * This Constant is used to specify commodity code mandatory for proviso class S and I.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_COMMODITY_MANDATORY_PROVISO_CLASS_S_I = 789;

    /**
     * This Constant is used to specify that the expiration date cannot be past date.
     * <p>
     * Value = {@value}
     */
    public static final int EXPIRATION_DATE_CANNOT_BE_PAST_DATE = 790;

    /**
     * This Constant is used to specify that the commodity code does not exist.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_CODE_DOES_NOT_EXIST = 791;

    /**
     * This Constant is used to specify that the commodity marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int COMMODITY_MARKED_FOR_DELETION = 792;

    /**
     * This Constant is used to specify that the special handling code does not exist.
     * <p>
     * Value = {@value}
     */
    public static final int SPL_CODE_DOES_NOT_EXIST = 1100;

    /**
     * This Constant is used to specify that the other charge does not exist.
     * <p>
     * Value = {@value}
     */
    public static final int OTHER_CHARGE_CODE_DOES_NOT_EXIST = 1101;

    /**
     * This Constant is used to specify that the agreement identifier is of invalid format.
     * <p>
     * Value = {@value}
     */
    public static final int AGREEMENT_ID_FORMAT_NOT_VALID = 795;

    /**
     * This Constant is used to specify that the effective date is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_AGREEMENT_EFFECTIVE_DATE_MADANTORY_FOR_CREATION = 796;

    /**
     * This Constant is used to specify that the effective date is MODIFIED.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_EFFECTIVE_DATE_MODIFIED = 797;
    
    /**
     * This Constant is used to specify that the expiration date is MODIFIED.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_EXPIRATION_DATE_MODIFIED = 798;

    /**
     * This Constant is used to specify that the date range is invalid.
     * <p>
     * Value = {@value}
     */
    public static final int INTERLINE_CHILDS_DATERANGE_INVALID = 799;

    public static final int ATLEAST_ONE_IN_LIST_IS_MANDATORY = 1102;

    public static final int ATLEAST_ONE_IN_OTHER_CHARGE_LIST_IS_MANDATORY = 1103;
    
    public static final int PRORARION_MISSING_LATITUDE_LONGITUDE_FOR_ORIGIN = 1106;
    
    public static final int PRORARION_MISSING_LATITUDE_LONGITUDE_FOR_DESTINATION = 1111;

    public static final int INTERLINE_AGREEMENT_ULD_TYPE_MANDATORY = 62007;

    /**
     * This Constant is used to specify that the airway bill number is
     * mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int AIR_WAYBILL_NUMBER_MANDATORY = 1001;

    /**
     * This Constant is used to specify that the airline code number must be
     * valid.
     * <p>
     * Value = {@value}
     */
    public static final int AIRLINE_CODE_NUMBER_MUST_BE_VALID = 1002;

    /**
     * This Constant is used to specify that the shipment reference must be
     * valid.
     * <p>
     * Value = {@value}
     */
    public static final int SHIPMENT_REFERENCE_NUMBER_MUST_BE_VALID = 1003;

    /**
     * This Constant is used to specify that the airway bill number does not
     * exist in system.
     * <p>
     * Value = {@value}
     */
    public static final int AWB_NOT_IN_DB = 1004;

    /**
     * This Constant is used to specify that the airway bill number is
     * mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int AIR_WAYBILL_SHIPMENT_REF_NUMBER_MANDATORY = 1005;

    /**
     * This Constant is used to specify that the booking segment information is
     * incomplete.
     * <p>
     * Value = {@value}
     */

    public static final int BOOKING_SEGMENT_ROUTE_INVALID = 1201;

    /**
     * This Constants are used for Use Case 027 - Maintain Invoice Type
     * <p>
     * Value = {@value}
     */

    public static final int INVALID_INVOICE_TYPE_NAME = 801;

    public static final int INVALID_INVOICE_FORMAT_TYPE = 802;

    public static final int INVALID_INVOICE_IDENTIFIER = 803;

    public static final int INVALID_INVOICE_TEMPLATE = 804;

    public static final int MANDATORY_INVOICE_TYPE_NAME = 805;

    public static final int MANDATORY_INVOICE_FORMAT_TYPE = 806;

    public static final int MANDATORY_INVOICE_IDENTIFIER = 807;

    public static final int MANDATORY_INVOICE_TEMPLATE = 808;

    public static final int NO_RECORD_FOUND_INVOICE_TYPE = 809;

    public static final int INVOICE_TYPE_BR1 = 810;

    public static final int INVOICE_TYPE_BR2 = 811;

    public static final int INVOICE_TYPE_CREATED_SUCCESSFULLY = 812;

    public static final int INVOICE_TYPE_UPDATED_SUCCESSFULLY = 869;

    public static final int INVOICE_TYPE_DELETED_SUCCESSFULLY = 870;

    public static final int TOLERANCE_LIMIT = 988;

    public static final int INVOICE_TYPE_PROCESSED_SUCCESSFULLY = 976;

    public static final int PARTICIPANT_GROUP_IS_NOT_FOUND = 977;

    public static final int INVOICE_DOES_NOT_EXIST = 951;

    /**
     * End.
     */

    /**
     * This Constants are used for Use Case 08 and 09 - Maintain Prorate Factor
     * <p>
     * Value = {@value}
     */
    public static final int MANDATORY_ORIGIN_CITY = 793;

    public static final int ACTUAL_SEGMENT_ROUTE_INVALID = 1202;
    
    public static final int ACCOUNTING_AIRWAYBILL_DESTINATION_CARRIER_STATION=3101;
    
    public static final int RATING_DETATLS_NOT_ALLOWED=3102;

    /**
     * This Constants are used for Use Case 07 - Maintain GSA Agreement
     * <p>
     * Value = {@value}
     */
    public static final int MANDATORY_GSAAGREEMENT_NAME = 831;

    public static final int MANDATORY_PARTICIPANT_ACCOUNT_NUMBER = 832;

    public static final int MANDATORY_GSAAGREEMENT_AWB_ORIGIN = 833;

    public static final int MANDATORY_GSAAGREEMENT_AWB_DESTINATION = 834;

    public static final int MANDATORY_GSAAGREEMENT_CURRENCY = 835;

    public static final int MANDATORY_GSAAGREEMENT_AWB_OWNER_CARRIER_CODE = 836;

    public static final int MANDATORY_GSAAGREEMENT_EFFECTIVE_DATE = 837;

    public static final int INVALID_GSAAGREEMENT_NAME = 838;

    public static final int INVALID_PARTICIPANT_ACCOUNT_NUMBER = 839;

    public static final int INVALID_GSAAGREEMENT_AWB_ORIGIN = 840;

    public static final int INVALID_GSAAGREEMENT_AWB_DESTINATION = 841;

    public static final int INVALID_GSAAGREEMENT_CURRENCY = 842;

    public static final int INVALID_GSAAGREEMENT_AWB_OWNER_CARRIER_CODE = 843;

    public static final int INVALID_GSAAGREEMENT_EFFECTIVE_DATE = 844;

    public static final int INVALID_PARTICIPANT_NAME = 845;

    public static final int GSA_AGREEMENT_DOES_NOT_EXISTS = 846;

    public static final int DUPLICATE_GSA_AGREEMENT = 847;

    public static final int GSA_AGREEMENT_RATE_CONTINUTY_BREAK = 848;

    public static final int GSA_AGREEMENT_EXPIRATION_DATE_IS_BEFORE_EFFECTIVE_DATE = 849;

    public static final int MANDATORY_RATE_PER_AWB = 850;

    public static final int MANDATORY_APPLICABLE_CHARGE = 851;

    public static final int MANDATORY_COMMISSION_TYPE = 852;

    public static final int MANDATORY_AMOUNT = 853;

    public static final int MANDATORY_AWB_VOLUME_RANGE_FROM = 854;

    public static final int MANDATORY_AWB_VOLUME_RANGE_TO = 855;

    public static final int MANDATORY_FLAT_CHARGE = 856;

    public static final int MANDATORY_PERCENTAGE = 857;

    public static final int INVALID_PERCENTAGE = 858;

    public static final int INVALID_GSA_RATE_PER_AWB = 859;

    public static final int INVALID_AMOUNT = 860;

    public static final int INVALID_AWB_VOLUME_RANGE_FROM = 861;

    public static final int INVALID_AWB_VOLUME_RANGE_TO = 862;

    public static final int INVALID_RATE_PER_AWB = 863;

    public static final int INVALID_FLAT_CHARGE = 864;

    public static final int INVALID_APPLICABLE_CHARGES = 865;

    public static final int GSA_AGREEMENT_CREATED_SUCCESSFULLY = 866;

    public static final int GSA_AGREEMENT_UPDATED_SUCCESSFULLY = 867;

    public static final int INVALID_EXPIRATION_DATE = 868;

    public static final int GSA_AGREEMENT_DELETED_SUCCESSFULLY = 871;

    public static final int INVALID_GSA_STATION = 872;

    public static final int PARTICICPANT_ACCOUNT_NUMBER_DOESNOT_EXISTS = 873;

    public static final int GSA_AGREEMENT_RATE_MIN_MAX_BREAK = 874;

    public static final int GSA_AGREEMENT_RATE_OVERLAP = 875;

    public static final int GSA_AGREEMENT_PROCESSED = 878;

    public static final int PARTICICPANT_ACCOUNT_NUMBER_MARKED_FOR_DELETION = 950;

    public static final int GSA_AGREEMENT_EFFECTIVE_DATE_PAST_DATE = 952;
    
    public static final int ENTER_EITHER_RATE_PER_AWB_OR_FLAT_CHARGE = 953;
    
    public static final int OVER_AMOUNT_MUST_BE_ROUNDED_OFF= 960;
    
    public static final int NUMBER_OF_DECIMAL_IN_OVER_AMOUNT_AND_CURRENCY_MUST_SAME= 961;
    
    public static final int AMOUNT_MUST_BE_ROUNDED_OFF= 962;
    
    public static final int NUMBER_OF_DECIMAL_IN_AMOUNT_AND_CURRENCY_MUST_SAME= 963;
    
    public static final int OVER_FLAT_CHARGE_MUST_BE_ROUNDED_OFF= 964;
    
    public static final int NUMBER_OF_DECIMAL_IN_OVER_FLAT_CHARGE_AND_CURRENCY_MUST_SAME= 965;
    
    public static final int FLAT_CHARGE_MUST_BE_ROUNDED_OFF= 966;
    
    public static final int NUMBER_OF_DECIMAL_IN_FLAT_CHARGE_AND_CURRENCY_MUST_SAME= 967;
    
    /**
     * LMSC-4499 related changes
     */
    public static final int ORIGIN_AND_DESTINATION_CODE_MUST_NOT_BE_SAME= 968;
    
    public static final int MANDATORY_SLIDING_SCALE_RANGE_REQUIRED= 969;
    
    public static final int CURRENCY_CODE_NOT_EFFECTIVE= 970;

    /**
     * LMSC-4498 related changes
     */

    public static final int GSA_INVALID_PRODUCT_CODE = 971;

    public static final int GSA_INVALID_SPECIAL_HANDLING_CODE = 972;

    public static final int GSA_INVALID_COMMODITY_NUMBER = 973;

    public static final int GSA_INVALID_SEGMENT_CARRIER = 979;

    public static final int GSA_INVALID_FLIGHT_NUMBER = 980;

    public static final int GSA_INVALID_ROUTING_SEGMENT_ORIGIN = 981;

    public static final int GSA_INVALID_ROUTING_SEGMENT_DESTINATION = 983;

    public static final int GSA_DUPLICATE_PRODUCT_CODE = 984;

    public static final int GSA_DUPLICATE_SPECIAL_HANDLING_CODE = 985;

    public static final int GSA_DUPLICATE_COMMODITY_NUMBER = 986;

    public static final int GSA_DUPLICATE_ROUTING_SEGMENT = 987;
    
    /**
     * LMSC-4500 related changes
     */
    public static final int PRODUCT_CODE_NOT_EFFECTIVE_FOR_GSA_DATE_RANGE= 988;
    public static final int CARRIER_CODE_THIS_MARKED_FOR_DELETION= 989;

    // LMSC-5130 : Validation Message for participant is not GSA type
    public static final int GSA_PARTICICPANT_ACCOUNT_NUMBER_DOESNOT_EXISTS= 990;
    
    //LMSC-5089 changes
    public static final int ENTERED_COUNTRY_CODE_DOES_NOT_EXIST= 993;
    public static final int ENTERED_ROUTING_SEGMENT_ORIGIN_CODE_DOES_NOT_EXIST= 994;
    public static final int ENTERED_ROUTING_SEGMENT_DESTINATION_CODE_DOES_NOT_EXIST= 995;
    public static final int ROUTING_SEGMENT_ORIGIN_AND_DESTINATION_CODE_MUST_NOT_BE_SAME= 996;
    
    //LMSC-6025
    public static final int GSA_INVALID_EXTENDED_TERRITORY = 997;
    public static final int GSA_DUPLICATE_EXTENDED_TERRITORY = 998;
    public static final int INVALID_GSA_MIN_GUARANTEED_REVENUE_YEARLY = 999;
    public static final int INVALID_GSA_MIN_GUARANTEED_REVENUE_MONTHLY = 1000;
    public static final int GSA_AGREEMENT_NAME_IS_DUPLICATE = 1112;
    public static final int GSA_AGREEMENT_CHECK_BOX = 1113;

    /**
     * UC013 - PARTICIPANT PAYABLES START
     */

    /**
     * This Constant is used to specify that the Pick-up Operator does not exist in the air waybill but
     * pick-up other charge exist
     * for participant
     * <p>
     * Value = {@value}
     */

    public static final int PICK_UP_OPERATOR_DOES_NOT_EXIST_IN_AIRWAYBILL = 1051;

    /**
     * This Constant is used to specify that the Accounting Participant Information of Pick-up Operator does
     * not exist in the system.
     * for participant.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_INFORMATION_PICKUP_OPERATOR_DOES_NOT_EXIST = 1052;

    /**
     * This Constant is used to specify that the Delivery Operator does not exist in the air waybill but
     * Delivery other charge exist.
     * for participant.
     * <p>
     * Value = {@value}
     */
    public static final int DELIVERY_OPERATOR_DOES_NOT_EXIST_BUT_DELIVERY_OTHERCHARGE_EXISTS = 1053;

    /**
     * This Constant is used to specify that the Accounting Participant Information of Delivery Operator does
     * not exist in the system
     * for participant.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_INFORMATION_DELIVERY_OPERATOR_DOES_NOT_EXIST = 1054;

    /**
     * This Constant is used to specify that the Accounting Participant Information of Global Sales Agent does
     * not exist in the system
     * for participant.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_INFORMATION_GSA_DOES_NOT_EXIST = 1055;

    /**
     * This Constant is used to specify that the IATA Agent does not exist in the system.
     * for participant.
     * <p>
     * Value = {@value}
     */
    public static final int IATA_AGENT_DOES_NOT_EXIST = 1056;

    /**
     * This Constant is used to specify that the Accounting Participant Information of IATA Agent does not
     * exist in the system
     * for participant.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_PARTICIPANT_INFORMATION_IATA_AGENT_DOES_NOT_EXIST = 1057;

    public static final int ACCOUNT_NUMBER_DOES_NOT_EXIST = 1058;

    public static final int ACCOUNTING_PARTICIPANT_INFORMATION_GHA_DOES_NOT_EXIST = 1059;

    /**
     * End
     */

    /**
     * UC014 - PARTICIPANT RECEVIABLES START... 1300- 1400 range.
     */

    /**
     * This Constant is used to specify that the Accounting Information Does not exist
     * for participant.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_INFORMATION_DOES_NOT_EXIST_FOR_PARTICIPANT = 1300;

    /**
     * This Constant is used to specify that technical error occurred while processing participant
     * receivable.
     * <p>
     * Value = {@value}
     */
    public static final int TECHNICAL_ERROR_WHILE_PROCESSING_PARTICIPANT_RECEIVABLE = 1301;

    /**
     * This Constant is used to specify that the technical error while loading AWB into
     * ACCOUNTING.
     * <p>
     * Value = {@value}
     */
    public static final int TECHNICAL_ERROR_WHILE_LOADING_AWB_INTO_ACCOUNTING = 1251;

    /**
     * This Constant is used to specify that the technical error while loading Participant Payable into
     * ACCOUNTING.
     * <p>
     * Value = {@value}
     */
    public static final int TECHNICAL_ERROR_WHILE_LOADING_PAYABLE_INTO_ACCOUNTING = 1252;

    /**
     * This Constant is used to specify that the technical error while loading Participant Payable into
     * ACCOUNTING.
     * <p>
     * Value = {@value}
     */
    public static final int TECHNICAL_ERROR_WHILE_LOADING_REVENUE_INTO_ACCOUNTING = 1253;

    public static final int AIRWAYBILL_DOES_NOT_EXIST = 1254;

    // commenetd due to 2 different values public static final int AIRWAYBILL_DOES_NOT_EXIST = 2500;
    /**
     * This Constant is used to specify that the technical error while processing Proration and
     * Revenue request from LMS.
     * <p>
     * Value = {@value}
     */
    public static final int TECHNICAL_ERROR_WHILE_CALCULATING_PRORATION = 1261;

    /**
     * Following constants 1900-2000 used for UC018 Interline Inward Billings
     * <p>
     * Value = {@value}
     */

    public static final int INTERLINE_INWARD_BILLING_CLEARING_HOUSE_MANDATORY = 1900;

    public static final int INTERLINE_INWARD_BILLING_BILLING_YEAR_MONTH_MANDATORY = 1901;

    public static final int INTERLINE_INWARD_BILLING_BILLING_PERIOD_MANDATORY = 1902;

    public static final int INTERLINE_INWARD_BILLING_INVOICE_NUMBER_MANDATORY = 1903;

    public static final int INTERLINE_INWARD_BILLING_BILLING_CARRIER_MANDATORY = 1904;

    public static final int INTERLINE_INWARD_BILLING_DOES_NOT_EXIST_FOR_THE_GIVEN_FIELDS = 1905;

    public static final int INTERLINE_INWARD_BILLING_INVOICE_DATE_MANDATORY = 1906;

    public static final int INTERLINE_INWARD_BILLING_INVOICE_CURRENCY_MANDATORY = 1907;

    public static final int INTERLINE_INWARD_BILLING_BILLING_NUM_MANDATORY = 1908;

    public static final int INTERLINE_INWARD_BILLING_YOUR_INVOICE_NUM_MANDATORY = 1909;

    public static final int INTERLINE_INWARD_BILLING_YOUR_INVOICE_DATE_MANDATORY = 1910;

    public static final int INTERLINE_INWARD_BILLING_BILLING_TYPE_MANDATORY = 1911;

    public static final int INTERLINE_INWARD_BILLING_YOUR_INVOICE_BILLING_YEAR_MONTH = 1912;

    public static final int INTERLINE_INWARD_BILLING_AWB_PAYMENT_TYPE_MANDATORY = 1913;

    public static final int INTERLINE_INWARD_BILLING_AWB_NUMBER_MANDATORY = 1914;

    public static final int INTERLINE_INWARD_BILLING_AWB_EXECUTION_DATE_MANDATORY = 1915;

    public static final int INTERLINE_INWARD_BILLING_AWB_ORIGIN_MANDATORY = 1916;

    public static final int INTERLINE_INWARD_BILLING_AWB_DESTINATION_MANDATORY = 1917;

    public static final int INTERLINE_INWARD_BILLING_AWB_TOTAL_MANDATORY = 1918;

    public static final int INTERLINE_INWARD_BILLING_WEIGHT_CHARGES_MANDATORY = 1919;

    public static final int INTERLINE_INWARD_BILLING_VALUATION_CHARGES_MANDATORY = 1920;

    public static final int INTERLINE_INWARD_BILLING_OTHER_CHARGES_MANDATORY = 1921;

    public static final int INTERLINE_INWARD_BILLING_ISC_PERCENTAGE_MANDATORY = 1922;

    public static final int INTERLINE_INWARD_BILLING_ISC_AMOUNT_MANDATORY = 1923;

    public static final int INTERLINE_INWARD_BILLING_VAT_AMOUNT_MANDATORY = 1924;

    public static final int INTERLINE_INWARD_BILLING_SECTOR_CARRIER_MANDATORY = 1925;

    public static final int INTERLINE_INWARD_BILLING_SECTOR_ORIG_MANDATORY = 1926;

    public static final int INTERLINE_INWARD_BILLING_SECTOR_DEST_MANDATORY = 1927;

    public static final int INTERLINE_INWARD_BILLING_PRORATE_TYPE_MANDATORY = 1928;

    public static final int INTERLINE_INWARD_BILLING_PRORATE_FACTOR_MANDATORY = 1929;

    public static final int INTERLINE_INWARD_BILLING_PRORATE_AMOUNT_MANDATORY = 1930;

    public static final int INTERLINE_INWARD_BILLING_REMARK_MANDATORY = 1931;

    public static final int INTERLINE_INWARD_BILLING_PROARTE_ENTRIES_MANDATORY = 1932;

    public static final int INTERLINE_INWARD_BILLING_INVOICE_ENTRIES_MANDATORY = 1933;

    public static final int INTERLINE_INWARD_BILLING_INVOICE_STATUS_MANDATORY = 1934;

    public static final int INTERLINE_INWARD_BILLING_CREATED_SUCCESSFULLY = 1935;

    public static final int INTERLINE_INWARD_BILLING_BR2_CHECK = 1936;

    public static final int INTERLINE_INWARD_BILLING_BILLING_CURRENCY = 1937;

    public static final int INTERLINE_INWARD_BILLING_AWB_ORIGN = 1938;

    public static final int INTERLINE_INWARD_BILLING_AWB_DEST = 1939;

    public static final int INTERLINE_INWARD_BILLING_SECTOR_ORIG = 1940;

    public static final int INTERLINE_INWARD_BILLING_SECTOR_DEST = 1941;

    public static final int INTERLINE_INWARD_BILLING_REASON_CODE_INVALIID = 1942;

    public static final int INTERLINE_INWARD_BILLING_ALREADY_EXISTS = 1943;

    public static final int INTERLINE_INWARD_BILLING_AWB_INFORMATION_REQUIRED = 1944;

    public static final int INTERLINE_INWARD_BILLING_UPDATED_SUCCESSFULLY = 1945;

    public static final int INTERLINE_INWARD_BILLING_DELETED_SUCCESSFULLY = 1946;

    public static final int INTERLINE_INWARD_BILLING_CARRIER_CODE_DOES_NOT_EXISTS = 1947;

    public static final int INTERLINE_INWARD_BILLING_CLEARING_HOUSE_TYPE = 1948;

    public static final int INTERLINE_INWARD_BILLING_YEAR_MONTH_TYPE_SIZE = 1949;

    public static final int INTERLINE_INWARD_BILLING_PERIOD_TYPE_SIZE = 1950;

    public static final int INTERLINE_INWARD_BILLING_INVOICE_NUMER_TYPE_SIZE = 1951;

    public static final int INTERLINE_INWARD_BILLING_NONICH_INVOICE_NUMER_TYPE_SIZE = 2136;
    
    public static final int INTERLINE_INWARD_BILLING_CURRENCY_TYPE_SIZE = 1952;

    public static final int INTERLINE_INWARD_BILLING_CARRIER_TYPE_SIZE = 1953;

    public static final int INTERLINE_INWARD_BILLING_MEMO_MUMBER_TYPE_SIZE = 1954;

    public static final int INTERLINE_INWARD_BILLING_YOUR_INVOICE_NUMER_TYPE_SIZE = 1955;

    public static final int INTERLINE_INWARD_BILLING_YOUR_INVOICE_BILLING_YEAR_MONTH_TYPE_SIZE = 1956;

    public static final int INTERLINE_INWARD_BILLING_AIRLINE_CODE_NUMBER_TYPE_SIZE = 1957;

    public static final int INTERLINE_INWARD_BILLING_SHIPMENT_REFERENCE_TYPE_SIZE = 1958;

    public static final int INTERLINE_INWARD_BILLING_AWB_PAYMENT_TYPE_SIZE = 1959;

    public static final int INTERLINE_INWARD_BILLING_ORIG_STAT_CODE_TYPE_SIZE = 1960;

    public static final int INTERLINE_INWARD_BILLING_DEST_STAT_CODE_TYPE_SIZE = 1961;

    public static final int INTERLINE_INWARD_BILLING_SECTOR_CARRIER_TYPE_SIZE = 1962;

    public static final int INTERLINE_INWARD_BILLING_SECTOR_ORIG_STAT_CODE_TYPE_SIZE = 1963;

    public static final int INTERLINE_INWARD_BILLING_SECTOR_DEST_STAT_CODE_TYPE_SIZE = 1964;

    public static final int INTERLINE_INWARD_BILLING_PRORATE_TYPE_TYPE_SIZE = 1965;

    public static final int INTERLINE_INWARD_BILLING_PRORATE_AMOUNT_TYPE_SIZE = 1966;

    public static final int INTERLINE_INWARD_BILLING_AWB_TOTAL_AMOUNT_TYPE_SIZE = 1967;

    public static final int INTERLINE_INWARD_BILLING_AWB_WEIGHT_CHARGES_TYPE_SIZE = 1968;

    public static final int INTERLINE_INWARD_BILLING_AWB_VALUATION_CHARGES_TYPE_SIZE = 1969;

    public static final int INTERLINE_INWARD_BILLING_AWB_OTHER_CHARGES_TYPE_SIZE = 1970;

    public static final int INTERLINE_INWARD_BILLING_AWB_ISC_PERCENTAGE_TYPE_SIZE = 1971;

    public static final int INTERLINE_INWARD_BILLING_AWB_ISC_AMOUNT_TYPE_SIZE = 1972;

    public static final int INTERLINE_INWARD_BILLING_AWB_VAT_AMOUNT_TYPE_SIZE = 1973;

    public static final int INTERLINE_INWARD_BILLING_AWB_OURREFERENCE_TYPE_SIZE = 1974;


    public static final int INTERLINE_INWARD_BILLING_OTHER_CHARGE_CODE_TYPE_SIZE = 1975;

    public static final int INTERLINE_INWARD_BILLING_OTHER_CHARGE_AMOUNT_TYPE_SIZE = 1976;

    public static final int INTERLINE_INWARD_BILLING_VAT_ID_TYPE_SIZE = 1977;

    public static final int INTERLINE_INWARD_BILLING_VAT_LABEL_TYPE_SIZE = 1978;

    public static final int INTERLINE_INWARD_BILLING_VAT_TEXT_TYPE_SIZE = 1979;

    public static final int INTERLINE_INWARD_BILLING_VAT_BASE_AMOUNT_TYPE_SIZE = 1980;

    public static final int INTERLINE_INWARD_BILLING_VAT_PERCENTAGE_TYPE_SIZE = 1981;

    public static final int INTERLINE_INWARD_BILLING_VAT_CAL_AMOUNT_TYPE_SIZE = 1982;

    public static final int INTERLINE_INWARD_BILLING_REASON_CODE_TYPE_SIZE = 1983;

    public static final int INTERLINE_INWARD_BILLING_AIRLINE_OWN_USE_TYPE_SIZE = 1984;

    public static final int INTERLINE_INWARD_BILLING_REFERENCES_TYPE_SIZE = 1985;

    public static final int INTERLINE_INWARD_BILLING_REMARKS_TYPE_SIZE = 1986;

    public static final int INTERLINE_INWARD_BILLING_BR5_CHECK = 1987;

    public static final int INTERLINE_INWARD_BILLING_BR3_CHECK = 1988;

    public static final int INTERLINE_INWARD_BILLING_REASONCODE_FOR_BMCM = 1989;

    public static final int INTERLINE_INWARD_BILLING_REFERENCE_FOR_BMCM = 1990;

    public static final int INTERLINE_INWARD_BILLING_PRORATE_FACTOR_TYPE_SIZE = 1991;

    public static final int INTERLINE_INWARD_BILLING_AWB_NUMBER_TYPE_SIZE = 1992;

    public static final int INTERLINE_INWARD_BILLING_REJECTION_MEMO_STAGE_MANDATORY = 1993;

    public static final int INTERLINE_INWARD_BILLING_YOUR_INVOICE_BILLING_PERIOD_MANDATORY = 1994;

    public static final int INTERLINE_INWARD_BILLING_OTHER_CHARGE_CODE_MANDATORY = 1995;

    public static final int TECHNICAL_ERROR_OCCURED_DURING_PROCESSING_AWB = 1996;

    public static final int INTERLINE_INWARD_BILLING_CARRIER_DUPLICATE = 1997;

    public static final int INTERLINE_INWARD_BILLING_AIRLINE_CODE_NUMBER_MANDATORY = 1998;

    public static final int INTERLINE_INWARD_BILLING_AWB_SHIPMENT_REFERENCE_MANDATORY = 1999;
    
    public static final int INTERLINE_INWARD_BILLING_CREATED_DUPLICATES= 90018;
    
    public static final int INTERLINE_INWARD_BILLING_RETRIEVED_DUPLICATES= 90019;
    
    public static final int INTERLINE_INWARD_BILLING_UPDATED_DUPL_SUCCESSFULLY = 90020;

    // UC033 2000-2100

    public static final int ACCOUNTING_AIRWAYBILL_INFORMATION_DOES_NOT_EXIST_FOR_THE_GIVEN_FIELDS = 2000;

    public static final int ACCOUNTING_AIRWAYBILL_DECLARED_VALUE_TYPE_SIZE = 2001;

    public static final int ACCOUNTING_AIRWAYBILL_CUSTOMS_VALUE_TYPE_SIZE = 2002;

    public static final int ACCOUNTING_AIRWAYBILL_INSURANCE_VALUE_TYPE_SIZE = 2003;

    public static final int ACCOUNTING_AIRWAYBILL_INSURANCE_CODE_TYPE_SIZE = 2004;

    public static final int ACCOUNTING_AIRWAYBILL_CROSSREFERENCE_2_FIELD_TYPE_SIZE = 2005;

    public static final int ACCOUNTING_AIRWAYBILL_SURFACE_ORIGIN_SIZE = 2006;

    public static final int ACCOUNTING_AIRWAYBILL_SURFACE_DESTINATION_SIZE = 2007;

    public static final int ACCOUNTING_AIRWAYBILL_ACCOUNTING_REMARKS_SIZE = 2008;

    public static final int ACCOUNTING_AIRWAYBILL_SHIPPER_REMARKS_SIZE = 2009;

    public static final int ACCOUNTING_AIRWAYBILL_CONSIGNEE_REMARKS_1_SIZE = 2010;

    public static final int ACCOUNTING_AIRWAYBILL_PARTICIPANT_NAME_SIZE = 2011;

    public static final int ACCOUNTING_AIRWAYBILL_PARTICIPANT_FREQUENT_FLYER_NUMBER = 2012;

    public static final int ACCOUNTING_AIRWAYBILL_RATING_DIMENSIONAL_WEIGHT = 2013;

    public static final int ACCOUNTING_AIRWAYBILL_RATING_VOLUME = 2014;

    public static final int ACCOUNTING_AIRWAYBILL_INFORMATION_UPDATED_SUCCESSFULLY = 2015;

    public static final int ACCOUNTING_AIRWAYBILL_GENID_SIZE = 2016;

    public static final int ACCOUNTING_AIRWAYBILL_PIECES_SIZE = 2017;

    public static final int ACCOUNTING_AIRWAYBILL_GROSS_WEIGHT_SIZE = 2018;

    public static final int ACCOUNTING_AIRWAYBILL_RATE_SOURCE_SIZE = 2019;

    public static final int ACCOUNTING_AIRWAYBILL_RATE_TYPE_SIZE = 2020;

    public static final int ACCOUNTING_AIRWAYBILL_RATE_CLASS_SIZE = 2021;

    public static final int ACCOUNTING_AIRWAYBILL_ULD_TYPE_SIZE = 2022;

    public static final int ACCOUNTING_AIRWAYBILL_COMMODITY_NUMBER_SIZE = 2023;

    public static final int ACCOUNTING_AIRWAYBILL_CHARGEABLE_WEIGHT_SIZE = 2024;

    public static final int ACCOUNTING_AIRWAYBILL_RATE_SIZE = 2025;

    public static final int ACCOUNTING_AIRWAYBILL_RATE_PERCENTAGE_SIZE = 2026;

    public static final int ACCOUNTING_AIRWAYBILL_RATE_NOTE_SIZE = 2027;

    public static final int ACCOUNTING_AIRWAYBILL_RATE_DESCRIPTION_SIZE = 2028;

    public static final int ACCOUNTING_AIRWAYBILL_CHARGE_CODE_SIZE = 2029;

    public static final int ACCOUNTING_AIRWAYBILL_SUB_CODE_SIZE = 2030;

    public static final int ACCOUNTING_AIRWAYBILL_DUE_TYPE_SIZE = 2031;

    public static final int ACCOUNTING_AIRWAYBILL_AMOUNT_SIZE = 2032;

    public static final int ACCOUNTING_AIRWAYBILL_CREDIT_SIZE = 2033;

    public static final int ACCOUNTING_AIRWAYBILL_OTHERCHARGE_DESCRIPTION_SIZE = 2034;

    public static final int ACCOUNTING_AIRWAYBILL_TIME_INDICATOR_SIZE = 2035;

    public static final int ACCOUNTING_AIRWAYBILL_SERVICE_INDICATOR_SIZE = 2036;

    public static final int ACCOUNTING_AGREEMENT_IDENTIFIER_INVALID = 2037;

    public static final int ACCOUNTING_COMMISSION_PERCENTAGE_INVALID = 2038;

    public static final int CARRIER_CODE_TYPE_SIZE = 2039;

    public static final int ACCOUNTING_AIRWAYBILL_TOTAL_CHARGE_COD_CODE_SIZE = 2040;

    public static final int ACCOUNTING_AIRWAYBILL_TOTAL_CHARGE_VALUATION_CODE_SIZE = 2041;

    public static final int ACCOUNTING_AIRWAYBILL_TOTAL_CHARGE_COLLECT_CODE_SIZE = 2042;

    public static final int ACCOUNTING_AIRWAYBILL_TOTAL_CHARGE_PREPAID_CODE_SIZE = 2043;

    public static final int ACCOUNTING_AIRWAYBILL_TOTAL_CHARGE_WEIGHT_CODE_SIZE = 2044;

    public static final int ACCOUNTING_AIRWAYBILL_ROUTING_CARRIER_VALID = 2045;

    public static final int STATION_CODE_DOES_NOT_EXIST = 2046;

    public static final int ACCOUNTING_AIRWAYBILL_SURFACE_STATION_VALID = 2047;

    public static final int ACCOUNTING_AIRWAYBILL_SPLCODE_DUPLICATES = 2048;

    public static final int CURRENCY_CODE_DOES_NOT_EXIST = 2049;

    public static final int SPL_HANDLING_CODE_DOES_NOT_EXIST = 2050;

    public static final int ACCOUNTING_AIRWAYBILL_INTERMEDIATE_CARRIER_SIZE = 2051;

    public static final int ACCOUNTING_AIRWAYBILL_INTERMEDIATE_STATION_SIZE = 2052;

    public static final int ACCOUNTING_AIRWAYBILL_PRODUCT_CODE_TYPE_SIZE = 2053;

    public static final int ACCOUNTING_AIRWAYBILL_SPL_CODE_TYPE_SIZE = 2054;

    public static final int ACCOUNTING_AIRWAYBILL_CUSTOMS_STATION_VALID_AUTOMATED_PORT = 2055;

    public static final int ACCOUNTING_AIRWAYBILL_PAYMENT_CODE_NC_COMAT = 2056;

    public static final int ACCOUNTING_AIRWAYBILL_PAYMENT_CODE_PP_PX_SUPPLEMENTAL = 2057;

    public static final int ACCOUNTING_AIRWAYBILL_PAYMENT_CODE_PC_PD_CHARTER = 2058;

    public static final int ACCOUNTING_AIRWAYBILL_SPLCODE_DOESNOT_EXIST = 2059;

    public static final int ACCOUNTING_AIR_WAYBILL_PRODUCT_CODE_MANDATORY = 2060;

    public static final int ACCOUNTING_PARTICIPANT_NAME_MANDATORY_FOR_SHIPPER = 2061;

    public static final int ACCOUNTING_PARTICIPANT_NAME_MANDATORY_FOR_CONSIGNEE = 2062;

    public static final int ACCOUNTING_AIR_WAYBILL_RATE_PIECES_MANDATORY = 2063;

    public static final int ACCOUNTING_AIR_WAYBILL_GROSS_WEIGHT_MANDATORY = 2064;

    public static final int ACCOUNTING_AIR_WAYBILL_DESCRIPTION_MANDATORY = 2065;

    public static final int ACCOUNTING_AIR_WAYBILL_EXPORT_PAYCODE_MANDATORY = 2066;

    public static final int ACCOUNTING_AIR_WAYBILL_UNIT_OF_WEIGHT_MANDATORY = 2067;

    public static final int ACCOUNTING_AIRWAYBILL_CONSIGNEE_1_REMARKS_SIZE = 2068;

    public static final int ACCOUNTING_AIR_WAYBILL_ORIGIN_STATION_MANDATORY = 2069;

    public static final int ACCOUNTING_AIRWAYBILL_ORIGIN_STATION_SIZE = 2070;

    public static final int ACCOUNTING_AIRWAYBILL_DESTINATION_STATION_SIZE = 2071;

    public static final int ACCOUNTING_AIR_WAYBILL_UPDATE_REASON_CODE_MANDATORY = 2072;

    public static final int ACCOUNTING_AIR_WAYBILL_UPDATE_REASON_TEXT_MANDATORY = 2073;

    public static final int UPDATE_REASON_TEXT_TYPE_SIZE = 2074;

    public static final int ACCOUNTING_AIR_WAYBILL_TAX_MANDATORY = 2075;

    public static final int ACCOUNTING_AIRWAYBILL_CROSSREFERENCE_MUST_NOT_BE_BLANK = 2076;

    public static final int ACCOUNTING_AIRWAYBILL_CROSS_REFERENCE_LADING = 2077;

    public static final int ACCOUNTING_AIRWAYBILL_NOT_SUPPLEMENTAL = 2078;

    public static final int ACCOUNTING_AIRWAYBILL_STATION_HAS_DUPLICATES = 2079;

    public static final int ACCOUNTING_AIRWAYBILL_ORIGIN_CURRENCY_DETERMINATION = 2080;

    public static final int ACCOUNTING_AIRWAYBILL_ORIGIN_DESTINATION_MANDATORY = 2081;

    public static final int ACCOUNTING_AIRWAYBILL_SPL_HANDLING_CODES_HAS_DUPLICATES = 2082;

    public static final int ACCOUNTING_AIRWAYBILL_CROSSREFERENCE1_TYPE_SIZE = 2083;

    public static final int CUSTOMS_STATION_TYPE_SIZE = 2084;

    public static final int ACCOUNTING_AIR_WAYBILL_PARTICIPANT_ACCOUNT_NUMBER_MANDATORY = 2085;

    // public static final int ACCOUNTING_AIRWAYBILL_ORIGIN_STATION_MANDATORY =2086;

    public static final int ACCOUNTING_AIR_WAYBILL_DESTINATION_STATION_MANDATORY = 2086;

    public static final int ACCOUNTING_AIRWAYBILL_CONSIGNEE_REMARKS_2_SIZE = 2087;

    public static final int ACCOUNTING_AIRWAYBILL_CUSTOMS_STATION_SIZE = 2088;

    public static final int ACCOUNTING_AIRWAYBILL_COD_AMOUNT_SIZE = 2089;

    public static final int ACCOUNTING_AIRWAYBILL_COD_CURRENCY_SIZE = 2090;

    public static final int ACCOUNTING_AIR_WAYBILL_PAYCODE_MANDATORY = 2091;

    public static final int ACCOUNTING_AIR_WAYBILL_GENID_TYPE_MANDATORY = 2092;

    public static final int ACCOUNTING_AIR_WAYBILL_CHARGECODE_MANDATORY = 2093;

    public static final int ACCOUNTING_AIR_WAYBILL_AMOUNT_MANDATORY = 2094;

    public static final int ACCOUNTING_AIR_WAYBILL_EXECUTION_DATE_MANDATORY = 2095;

    public static final int ACCOUNTING_AIRWAYBILL_CROSSREFERENCE2_TYPE_SIZE = 2097;

    public static final int ACCOUNTING_AIRWAYBILL_CROSSREFERENCE_1_FIELD_TYPE_SIZE = 2098;

    public static final int ACCOUNTING_AIRWAYBILL_ERROR_WHEN_RE_RATE_AWB = 2096;

    public static final int ACCOUNTING_AIRWAYBILL_TOTAL_CHARGE_FLIGHT_NUM_SIZE = 2099;

    public static final int ACCOUNTING_PARTICIPANT_STATION_VALID = 2100;

    public static final int ACCOUNTING_AIRWAYBILL_OTHER_CHARGE_TIME_SIZE = 2101;

    public static final int ACCOUNTING_AIRWAYBILL_QUANTITY_SIZE = 2102;

    public static final int ACCOUNTING_AIRWAYBILL_COD_AMOUNT_BLANK = 2103;

    public static final int ACCOUNTING_AIRWAYBILL_CF_REQUIRED = 2104;

    public static final int ACCOUNTING_AIRWAYBILL_COD_CURRENCY_REQUIRED = 2105;

    public static final int ACCOUNTING_AIRWAYBILL_FLIGHT_DATE_REQUIRED = 2106;

    public static final int ACCOUNTING_AIRWAYBILL_CREDIT_REQUIRED = 2107;

    public static final int ACCOUNTING_AIRWAYBILL_DESCRIPTION_REQUIRED = 2108;

    public static final int ACCOUNTING_AIRWAYBILL_ULD_TYPE_REQUIRED = 2109;

    public static final int ORIGIN_CURRENCY_DOES_NOT_EXIST = 2110;

    public static final int DESTINATION_CURRENCY_DOES_NOT_EXIST = 2111;

    public static final int ACCOUNTING_AIRWAYBILL_DESTINATION_CURRENCY_EFFECTIVE_DESTINATION_STATION = 2112;

    public static final int AIRWAYBILL_ROUTING_COMAT_HOST_HANDLED = 2113;

    public static final int ACCOUNTING_AIRWAYBILL_CROSSREFERNCE_1_B_TYPE_SIZE = 2114;

    public static final int ACCOUNTING_AIRWAYBILL_CROSSREFERNCE_2_B_TYPE_SIZE = 2115;

    public static final int ACCOUNTING_AIRWAYBILL_SERVICE_CHARGE_CODE = 2116;

    public static final int ACCOUNTING_AIRWAYBILL_TIME_CHARGE_CODE = 2117;

    public static final int ACCOUNTING_AIRWAYBILL_DESTINATION_CARRIER_SIZE = 2118;

    public static final int ACCOUNTING_AIRWAYBILL_CHARGEABLE_WEIGHT_SIZE_KG = 2119;

    public static final int ACCOUNTING_AIRWAYBILL_CHARGEABLE_WEIGHT_SIZE_LB = 2120;

    public static final int ACCOUNTING_AIRWAYBILL_FLOWN_ORIGIN_STATION_SIZE = 2122;

    public static final int ACCOUNTING_AIRWAYBILL_FLOWN_DESTIN_CARRIER_SIZE = 2123;

    public static final int ACCOUNTING_AIRWAYBILL_FLOWN_DESTIN_STATION_SIZE = 2124;

    public static final int ACCOUNTING_AIRWAYBILL_FLOWN_FLIGHT_NUMBER_SIZE = 2125;

    public static final int ACCOUNTING_AIRWAYBILL_FLOWN_PIECES_SIZE = 2126;

    public static final int ACCOUNTING_AIRWAYBILL_FLOWN_SEGMENT_WEIGHT_SIZE = 2127;

    public static final int ACCOUNTING_ACTUAL_FLOWN_ORIGIN_STATION_MANDATORY = 2128;

    public static final int ACCOUNTING_ACTUAL_FLOWN_DESTINATION_STATION_MANDATORY = 2129;

    public static final int ACCOUNTING_ACTUAL_FLOWN_FLIGHT_NUMBER_MANDATORY = 2130;

    public static final int ACCOUNTING_AIRWAYBILL_ACTUAL_FLOWN_HAS_DUPLICATES = 2131;

    public static final int ACCOUNTING_ACTUAL_FLOWN_FLIGHT_DATE_MANDATORY = 2132;

    public static final int ACCOUNTING_ACTUAL_FLOWN_SEGMENT_WEIGHT_MANDATORY = 2133;

    public static final int ACCOUNTING_ACTUAL_FLOWN_PIECES_MANDATORY = 2134;
    
    public static final int ACCOUNTING_AIRWAYBILL_SENT_FOR_RE_RATING = 2135;
    
    public static final int ACCOUNTING_ACTUAL_FLOWN_CARRIER_MANDATORY = 610005;

    // UC033 validate the participant information 2401-2420

    public static final int PARTICIPANT_TYPE_MUST_BE_A_SHIPPER_FOR_SUPPLEMENTAL_PRODUCT = 2401;

    public static final int PARTICIPANT_COMMERICIAL_ACCOUNT_IS_RESTRICTED_FOR_SHIPPER_OR_CONSIGNEE = 2402;

    public static final int PARTICIPANT_CANNOT_BE_A_SHIPPER = 2403;

    public static final int PARTICIPANT_TYPE_MUST_BE_A_SHIPPER_AND_CONSIGNEE_FOR_NON_SUPPLEMENTAL_PRODUCT =
                2404;

    public static final int BILLING_ACCOUNT_NUMBER_DOESNOT_EXISTS = 2405;

    public static final int PARTICIPANT_TYPES_MUST_NOT_BE_DUPLICATED = 2406;

    public static final int PARTICIPANT_TYPE_SHIPPER_IS_MANDATORY_FOR_SUPPLEMENTAL_PRODUCT = 2410;

    /**
     * FORCE AUDIT & CLEAR AUDIT Starts
     */
    public static final int FORCE_AUDIT_NOT_POSSIBLE = 2407;

    public static final int CLEAR_ALL_AUDIT_SUCESSFULLY = 2408;

    public static final int CLEAR_ALL_AUDIT_NOT_SUCESSFULLY = 2409;

    public static final int FORCE_AUDIT_SUCESSFULLY = 2411;

    /**
     * BILLING_SCHEDULE Constants Starts
     */

    public static final int BILLING_SCHEDULE_CREATED_SUCCESSFULLY = 1565;

    public static final int BILLING_SCHEDULE_UPDATED_SUCCESSFULLY = 1566;

    public static final int BILLING_SCHEDULE_DELETE_SUCCESSFULLY = 1567;

    public static final int BILLING_SCHEDULE_RETRIEVED_SUCCESSFULLY = 1568;

    public static final int BILLING_SCHEDULE_INVALID_DATE_FORMAT = 1570;

    public static final int BILLING_SCHEDULE_RANGE_NOT_VALID_DATE_RANGE = 1571;

    public static final int BILLING_SCHEDULE_INVALID_DATE_INFORMATION = 1572;

    public static final int BILLING_SCHEDULE_INVALID_DATE_RANGE = 1573;

    /**
     * PARTICPANT_INVOICE Constants Ends
     */

    public static final int BILLING_SCHEDULE_INVALID_DATE_OVERLAP = 1574;

    public static final int BILLING_SCHEDULE_NO_RECORDS_FOUND = 1575;

    public static final int BILLING_SCHEDULE_CANNOT_DELETE_PAST_DATE = 1576;

    public static final int BILLING_SCHEDULE_INVALID_INVOICE_FREQUENCY = 1577;

    public static final int BILLING_SCHEDULE_DELETE_DATE = 1578;

    public static final int BILLING_SCHEDULE_DATE_MONTH = 1579;

    public static final int BILLING_SCHEDULE_DATE_FORMAT_MONTH = 1680;

    public static final int BILLING_SCHEDULE_DATE_FROM_MONTH = 1581;

    public static final int BILLING_SCHEDULE_DATE_TO_MONTH = 1582;

    public static final int BILLING_SCHEDULE_DATE_CLSFROM_MONTH = 1685;

    public static final int BILLING_SCHEDULE_DATE_CLSTO_MONTH = 1686;

    public static final int BILLING_SCHEDULE_DATE_INVOICEGEREATION_MONTH = 1583;

    public static final int BILLING_SCHEDULE_TYPE = 1585;

    /**
     * BILLING_SCHEDULE Constants Ends
     */

    /**
     * Accounting Period Constants Starts
     */

    public static final int ACCOUNT_PERIOD_NOT_EXIST = 10001;

    public static final int ACCOUNT_PERIOD_LIST_ISEMPTY = 10002;

    public static final int ACCOUNT_PERIOD_TYPE_MANDATORY = 10003;

    public static final int ACCOUNT_PERIOD_MONTH_MANDATORY = 10004;

    public static final int ACCOUNT_PERIOD_YEAR_MANDATORY = 10005;

    public static final int ACCOUNT_PERIOD_CLOSE_DATE_MANDATORY = 10006;

    public static final int ACCOUNT_PERIOD_START_DATE_MANDATORY = 10007;

    public static final int ACCOUNT_PERIOD_END_DATE_MANDATORY = 10008;

    public static final int ACCOUNT_PERIOD_CLOSE_DATE_BEFORE_END_DATE = 10009;

    public static final int ACCOUNT_PERIOD_END_DATE_BEFORE_START_DATE = 10010;

    public static final int ACCOUNT_PERIOD_START_DATE_BEFORE_CURRENT_DATE = 10011;

    public static final int ACCOUNT_PERIOD_YEAR_NUMERIC = 10012;

    public static final int ACCOUNT_PERIOD_YEAR_SIZE = 10013;

    public static final int ACCOUNT_PERIOD_MONTH_ALPHABET = 10014;

    public static final int ACCOUNT_PERIOD_MONTH_SIZE = 10015;

    public static final int ACCOUNT_PERIOD_TYPE_START_END_DUPLICATE = 10016;

    public static final int ACCOUNT_PERIOD_NO_RECORD = 10017;

    public static final int ACCOUNT_PERIOD_UPDATED = 10018;

    public static final int ACCOUNT_PERIOD_START_DATE_BEFORE_CURRENT_DATE_DELETE = 10019;

    public static final int ACCOUNT_PERIOD_CREATE = 10020;

    public static final int ACCOUNT_PERIOD_UPDATE = 10021;

    public static final int ACCOUNT_PERIOD_DELETED = 10022;

    /**
     * Accounting Period Constants Ends
     */
    /**
     * 
     * 
     * /** PARTICPANT_INVOICE Constants Starts
     */

    public static final int BILLING_FROM_DATE_MANDATORY = 1585;

    public static final int BILLING_TO_DATE_MANDATORY = 1586;

    public static final int BILLING_PERIOD_TO_DATE_BEFORE_FROM_DATE = 1587;

    public static final int CARRIER_CODE_MANDATORY = 1588;

    public static final int CARRIER_CODE_INVALID = 15889;

    public static final int BILLING_NAME_NOT_PARTICIPANT = 1589;

    public static final int PARTICIPANT_TYPE_NOT_COMMERCIAL = 1590;

    public static final int NO_RECORD_FOUND_INVOICE_SUMMARY = 1600;

    public static final int INVOICE_GENERATED_SUCCESSFULLY = 16000;

    public static final int NO_PART_FOUND_INVOICE_SUMMARY = 1601;

    public static final int NO_BILLING_FOUND_PARTICIPANT = 1602;

    public static final int BILLING_CURRENCY_MANDATORY = 1603;

    public static final int PARTICIPANT_GROUP_IS_MARKED_FOR_DELETION = 182;

    /**
     * PARTICPANT_INVOICE Constants Ends
     */

    /**
     * This Constant is used to specify that the Invoice Summary does not exist
     * in the system for participant.
     * <p>
     * Value = {@value}
     */
    public static final int INVOICE_SUMMARY_DOES_NOT_EXIST = 1750;

    /**
     * This Constant is used to specify that the certain fields are Mandatory
     * <p>
     * Value = {@value}
     */
    public static final int ONE_OF_THE_FIELDS_MANDATORY = 1751;
    
    public static final int ONE_OF_THE_FIELDS_MANDATORY_ARC = 1760;

    /**
     * This Constant is used to specify that the Cass Area Code is Mandatory
     * <p>
     * Value = {@value}
     */
    public static final int CASS_AREA_CODE_MANDATORY = 1752;

    /**
     * This Constant is used to specify that the participant Account is
     * Mandatory
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_ACCOUNT_MANDATORY = 1753;

    /**
     * This Constant is used to specify that the participant namet is Mandatory
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_NAME_MANDATORY = 1754;

    /**
     * This Constant is used to specify that the participant namet is Mandatory
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_STATION_MANDATORY = 1755;

    public static final int INVOICE_NUMBER_INVALID = 1756;

    public static final int PARTICIPANT_NAME_INVALID = 1757;

    public static final int PARTICIPANT_ACC_NUMBER_INVALID = 1758;

    public static final int PARTICIPANT_STATION_INVALID = 1759;
    
    public static final int INVOICE_DATE_MANDATORY = 1761;

    /**
     * <code>Private constructor.</code>
     */

    // PARTICIPANT_INVOICE_PRINT Constants Starts

    public static final int NO_INVOICE_TEMPLATE_FOUND = 12001;

    public static final int NO_INVOICE_SUMMARY_FOUND = 12002;

    public static final int NO_INVOICE_PRINT_FOUND = 12003;

    // PARTICIPANT_INVOICE_PRINT Constants ends

    // CASS File Generation Constants Starts

    public static final int NO_INVOICE_ENTRY_FOUND = 12004;

    public static final int INVALID_COUNTRY_CODE = 12005;

    public static final int MANDATORY_COUNTRY_CODE = 12006;

    // PARTICIPANT_INVOICE_PRINT Constants

    // * <code>Private constructor.</code>

    /**
     * End.
     */
    /**
     * Accounting Period Constants Ends
     */

    public static final int CASS_FINAL_DUPLICATE = 11001;

    public static final int CASS_DRAFT_DUPLICATE = 11002;

    public static final int CASS_DUPLICATE_NOTFOUND = 11003;

    public static final int CASS_ACCOUNT_NOTFOUND = 11004;

    public static final int DUPLICATE_SCHEDULE_FOUND = 11005;

    public static final int DUPLICATE_PARTICIPANT_INVOICE_FOUND = 11006;

    public static final int DUPLICATE_PARTICIPANT_INVOICE_NOT_FOUND = 11008;

    /**
     * End.
     */
    /**
     * This Constants are used for Use Case 06 - Maintain GHA Agreement
     * <p>
     * Value = {@value}
     */

    public static final int INVALID_GHAAGREEMENT_RATE_ROUNDING_FACTOR_MISMATCH = 879;

    public static final int INVALID_GHAAGREEMENT_CURRENCY_START_END_DATE = 880;

    public static final int MANDATORY_GHAAGREEMENT_NAME = 881;

    public static final int MANDATORY_GHAAGREEMENT_AWB_ORIGIN = 882;

    public static final int MANDATORY_GHAAGREEMENT_AWB_DESTINATION = 883;

    public static final int MANDATORY_GHAAGREEMENT_CURRENCY = 884;

    public static final int MANDATORY_GHAAGREEMENT_AWB_OWNER_CARRIER_CODE = 885;

    public static final int MANDATORY_GHAAGREEMENT_EFFECTIVE_DATE = 886;

    public static final int INVALID_GHAAGREEMENT_NAME = 887;

    public static final int INVALID_GHAAGREEMENT_AWB_ORIGIN = 888;

    public static final int INVALID_GHAAGREEMENT_AWB_DESTINATION = 889;

    public static final int INVALID_GHAAGREEMENT_CURRENCY = 890;

    public static final int INVALID_GHAAGREEMENT_AWB_OWNER_CARRIER_CODE = 891;

    public static final int INVALID_GHAAGREEMENT_EFFECTIVE_DATE = 892;

    public static final int GHA_AGREEMENT_DOES_NOT_EXISTS = 893;

    public static final int DUPLICATE_GHA_AGREEMENT = 894;

    public static final int GHA_AGREEMENT_RATE_CONTINUTY_BREAK = 895;

    public static final int GHA_AGREEMENT_EXPIRATION_DATE_IS_BEFORE_EFFECTIVE_DATE = 896;

    public static final int INVALID_GHA_RATE_PER_AWB = 897;

    public static final int GHA_AGREEMENT_CREATED_SUCCESSFULLY = 898;

    public static final int GHA_AGREEMENT_UPDATED_SUCCESSFULLY = 899;

    public static final int GHA_AGREEMENT_DELETED_SUCCESSFULLY = 900;

    public static final int INVALID_GHA_STATION = 901;

    public static final int GHA_AGREEMENT_RATE_MIN_MAX_BREAK = 902;

    public static final int GHA_AGREEMENT_RATE_OVERLAP = 903;

    public static final int INVALID_GHAAGREEMENT_RATE_DECIMAL_POSITION_MISMATCH = 904;

    public static final int GHA_AGREEMENT_PROCESSED = 905;

    public static final int INVALID_GHAAGREEMENT_COMMODITY_FIRST_CHAR = 906;

    public static final int INVALID_GHAAGREEMENT_CITY_MARKED_FOR_DELETION = 907;

    public static final int INVALID_GHAAGREEMENT_ROUNDING_DECIMAL_ABSENT = 908;

    public static final int INVALID_GHAAGREEMENT_EFFECTIVE_DATE_CANNOT_BE_PAST_DATE = 909;

    public static final int INVALID_GHAAGREEMENT_FLIGHT_LEG_ORIGIN = 911;

    public static final int INVALID_GHAAGREEMENT_FLIGHT_LEG_DESTINATION = 912;

    public static final int MANDATORY_AWB_VOLUME_RANGE = 10913;

    public static final int INVALID_GHAAGREEMENT_COMMODITY_NUMBER = 10914;

    public static final int INVALID_GHAAGREEMENT_PRODUCT_CODE = 10915;

    public static final int INVALID_GHAAGREEMENT_SPECIAL_HANDLING_CODE = 10916;

    public static final int INVALID_GHAAGREEMENT_ULD_TYPE_CODE = 10917;

    public static final int INVALID_GHAAGREEMENT_EFFECTIVE_DATE_MUSTBE_FUTURE = 10918;

    public static final int INVALID_GHAAGREEMENT_AIRCRAFT_TYPE = 10921;

    public static final int MANDATORY_GHAAGREEMENT_AIRCRAFT_TYPE = 10922;

    public static final int INVALID_ORIGIN_CITY = 794;

    public static final int MANDATORY_DESTINATION_CITY = 795;

    public static final int INVALID_DESTINATION_CITY = 796;

    public static final int MANDATORY_EFFECTIVE_FROM_DATE = 797;

    public static final int INVALID_EFFECTIVE_FROM_DATE = 798;

    public static final int MANDATORY_EFFECTIVE_TO_DATE = 799;

    public static final int INVALID_EFFECTIVE_TO_DATE = 800;

    public static final int EFFECTIVE_FROM_DATE_CANNOT_BE_PAST_DATE = 813;

    public static final int EFFECTIVE_FROM_DATE_GREATER_THAN_TO_DATE = 814;

    public static final int ACKNOWLEDGMENT_MESSAGE_PRORATE_FACTOR_CREATED = 815;

    public static final int ACKNOWLEDGMENT_MESSAGE_PRORATE_FACTOR_UPDATED = 816;

    public static final int DUPLICATE_PRORATE_FACTOR_CONFIRMATION_MESSAGE_MANUAL_SOURCE = 817;

    public static final int NO_RECORD_FOUND = 818;

    public static final int DUPLICATE_PRORATE_FACTOR_CONFIRMATION_MESSAGE_IATA_SOURCE = 819;

    public static final int DELETE_MILEAGE_DATA_FOR_IATA_MESSAGE = 820;

    public static final int CANNOT_DELETE_IATA_ENTRY_INVALID_DATE = 821;

    public static final int DELETE_IATA_ENTRY_ACK = 822;

    public static final int MANDATORY_PRORATE_FACTOR = 823;

    public static final int INVALID_PRORATE_FACTOR = 824;

    public static final int DESTINATION_CITY_NOT_PRESENT = 825;

    public static final int ORIGIN_CITY_NOT_PRESENT = 826;

    public static final int CANNOT_CREATE_UPDATE_RECORD = 827;

    public static final int ORIGIN_DESTINATION_SHOULD_BE_DIFFERENT = 828;

    public static final int PRORATE_FACTOR_CREATED_SUCCESSFULLY = 829;

    public static final int PRORATE_FACTOR_CREATION_FAILED = 830;

    public static final int INVALID_HANDLING_STATION = 10919;

    public static final int MANDATORY_HANDLING_STATION = 10920;

    /**
     * End.
     */
    // UC 46B Constants Starts
    public static final int CANNOT_FINALIZE_CASS_INVOICE = 12010;

    public static final int BILLING_SCHEDULE_INDENTIFIER_EMPTY = 12011;

    public static final int OFFICE_IDENTIFIER_DOES_NOT_EXIST = 1332;

    public static final int INVOICE_ALREADY_FINALIZED = 12012;

    public static final int FINALIZE_DRAFT_INVOICE_OID_NULL = 12013;

    public static final int INVOICE_HAS_BEEN_FINALIZED = 12014;
    
    public static final int CANNOT_FINALIZE_INTERLINE_INVOICE = 12028;

    // UC 52 Constants Starts

    /**
     * This Constants are used for Use Case 055 - INTERLINE OUTWARD BILLING
     * <p>
     * Value = {@value}
     */

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_ACCOUNTING_MONTH = 30001;

    public static final int MANDATORY_CLEARING_HOUSE = 30002;

    public static final int NO_INVOICE_RECORDS = 30003;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_RATE_ROUNDING_FACTOR_MISMATCH = 30879;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_CURRENCY_START_END_DATE = 30880;

    public static final int MANDATORY_INTERLINE_OUTWARD_BILLING_NAME = 30881;

    public static final int MANDATORY_INTERLINE_OUTWARD_BILLING_AWB_ORIGIN = 30882;

    public static final int MANDATORY_INTERLINE_OUTWARD_BILLING_AWB_DESTINATION = 30883;

    public static final int MANDATORY_INTERLINE_OUTWARD_BILLING_CURRENCY = 30884;

    public static final int MANDATORY_INTERLINE_OUTWARD_BILLING_AWB_OWNER_CARRIER_CODE = 30885;

    public static final int MANDATORY_INTERLINE_OUTWARD_BILLING_EFFECTIVE_DATE = 30886;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_NAME = 30887;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_AWB_ORIGIN = 30888;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_AWB_DESTINATION = 30889;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_CURRENCY = 30890;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_AWB_OWNER_CARRIER_CODE = 30891;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_EFFECTIVE_DATE = 30892;

    public static final int INTERLINE_OUTWARD_BILLING_DOES_NOT_EXISTS = 30893;

    public static final int DUPLICATE_INTERLINE_OUTWARD_BILLING = 30894;

    public static final int INTERLINE_OUTWARD_BILLING_RATE_CONTINUTY_BREAK = 30895;

    public static final int INTERLINE_OUTWARD_BILLING_EXPIRATION_DATE_IS_BEFORE_EFFECTIVE_DATE = 30896;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_RATE_PER_AWB = 30897;

    public static final int INTERLINE_OUTWARD_BILLING_CREATED_SUCCESSFULLY = 30898;

    public static final int INTERLINE_OUTWARD_BILLING_UPDATED_SUCCESSFULLY = 30899;

    public static final int INTERLINE_OUTWARD_BILLING_DELETED_SUCCESSFULLY = 30900;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_STATION = 30901;

    public static final int INTERLINE_OUTWARD_BILLING_RATE_MIN_MAX_BREAK = 30902;

    public static final int INTERLINE_OUTWARD_BILLING_RATE_OVERLAP = 30903;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_RATE_DECIMAL_POSITION_MISMATCH = 30904;

    public static final int INTERLINE_OUTWARD_BILLING_PROCESSED = 30905;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_COMMODITY_FIRST_CHAR = 30906;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_CITY_MARKED_FOR_DELETION = 30907;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_ROUNDING_DECIMAL_ABSENT = 30908;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_EFFECTIVE_DATE_CANNOT_BE_PAST_DATE = 30909;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_FLIGHT_LEG_ORIGIN = 30911;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_FLIGHT_LEG_DESTINATION = 30912;

    public static final int INVALID_INTERLINE_OUTWARD_MANDATORY_AWB_VOLUME_RANGE = 30913;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_COMMODITY_NUMBER = 30914;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_PRODUCT_CODE = 30915;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_SPECIAL_HANDLING_CODE = 30916;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_ULD_TYPE_CODE = 30917;

    public static final int INVALID_INTERLINE_OUTWARD_BILLING_EFFECTIVE_DATE_MUSTBE_FUTURE = 30918;

    /**
     * This Constant is used to specify that the AWB Export Reporting Station Code is Mandatory
     * <p>
     * Value = {@value}
     */
    public static final int AWB_EXPORT_REPORT_STATION_MUST_NOT_BLANK = 2381;

    /**
     * This Constant is used to specify that the AWB Import Reporting Station Code is Mandatory
     * <p>
     * Value = {@value}
     */
    public static final int AWB_IMPORT_REPORT_STATION_MUST_NOT_BLANK = 2382;

    public static final int ORIGIN_CURRENCY_MUST_BE_EFFECTIVE_ON_EXECUTION_DATE = 2383;

    public static final int DESTINATION_CURRENCY_MUST_BE_EFFECTIVE_ON_EXECUTION_DATE = 2384;

    public static final int OFFICE_INDETIFIER_MANADATORY = 1333;

    public static final int OFFICE_INDETIFIER_ALPHANUMRIC = 1334;

    public static final int NUMBER_VALIDATION = 1335;

    public static final int AIRWAYBILL_NOT_SELECTED = 1336;

    public static final int UNABLE_TO_PRORATE_THE_AIRWAYBLE = 1337;
    
    public static final int TECHNICAL_ERROR_WHILE_LOADING_PRORATING = 1338;
    
    public static final int PRORATE_FACTOR_NOT_FOUND = 90069;

    // // UC067 Constants Starts

    public static final int REJECTION_MEMO_DOES_NOT_EXIST_FOR_THE_GIVEN_FIELDS = 3000;

    public static final int REJECTION_MEMO_DELETED_SUCCESSFULLY = 3001;

    public static final int REJECTION_MEMO_REASONCODE_CHECK_BR4 = 3002;

    public static final int REJECTION_MEMO_AWB_ENTRY_CHECK = 3003;

    public static final int REJECTION_MEMO__ALREADY_EXISTS = 3004;

    public static final int REJECTION_MEMO_CREATED_SUCCESSFULLY = 3005;

    public static final int REJECTION_MEMO_UPDATED_SUCCESSFULLY = 3006;

    public static final int REJECTION_MEMO_NET_REJECTION_AMOUNT_MANDATORY = 3007;

    public static final int INTERLINE_INWARD_BILLING_NET_REJECTION_AMOUNT_TYPE_SIZE = 3008;

    public static final int INTERLINE_INWARD_BILLING_MEMO_NUM_MANDATORY = 3009;

    public static final int INTERLINE_INWARD_BILLING_OTHER_CHARGE_BREAK_CODE_MANDATORY = 3010;

    public static final int INTERLINE_INWARD_BILLING_SECTOR_CARRIER_CODE_DOES_NOT_EXISTS = 3011;

    public static final int INTERLINE_INWARD_BILLING_OTHER_CHARGE_BREAK_AMOUNT_MANDATORY = 3012;

    public static final int INTERLINE_INWARD_BILLING_YOUR_INVOICE_BILLING_PERIOD_TYPE_SIZE = 3013;

    public static final int INTERLINE_INWARD_BILLING_VAT_BREAK_VAT_ID_MANDATORY = 3014;

    public static final int INTERLINE_INWARD_BILLING_VAT_BREAK_VAT_LABEL_MANDATORY = 3015;

    public static final int INTERLINE_INWARD_BILLING_VAT_BREAK_VAT_TEXT_MANDATORY = 3016;

    public static final int INTERLINE_INWARD_BILLING_VAT_BREAK_VAT_AMOUNT_MANDATORY = 3017;

    public static final int INTERLINE_INWARD_BILLING_VAT_BREAK_VAT_PERCNT_MANDATORY = 3018;

    public static final int INTERLINE_INWARD_BILLING_VAT_BREAK_VAT_CAL_AMOUNT_MANDATORY = 3019;

    public static final int REJECTION_MEMO_ONE_INVALID_YOUR_INVOICE_DATE = 3020;

    public static final int REJECTION_MEMO_TWO_INVALID_YOUR_INVOICE_DATE = 3021;

    public static final int REJECTION_MEMO_THREE_INVALID_YOUR_INVOICE_DATE = 3022;

    public static final int YOUR_REJECTION_MEMO_NUMBER_MANDATORY = 3023;

    public static final int YOUR_MEMO_NUMBER_MANDATORY = 3024;

    public static final int YOUR_MEMO_TYPE_INDICATOR_MANDATORY = 3025;

    public static final int YOUR_REJECTION_MEMO_NUMBER_TYPE_SIZE = 3026;

    public static final int YOUR_MEMO_NUMBER_TYPE_SIZE = 3027;

    // UC067 Ends
    // For UC066 starts

    public static final int INTERLINE_INWARD_QUEUE_INFO_DOES_NOT_EXIST = 3028;

    public static final int INTERLINE_INWARD_QUEUE_ACTION_MANDATORY = 3029;

    public static final int INTERLINE_INWARD_QUEUE_REASON_CODE_MANDATORY = 3030;

    public static final int INTERLINE_INWARD_QUEUE_AWB_TOTAL_ACCEPTED_MANDATORY = 3031;

    public static final int INTERLINE_INWARD_QUEUE_AWB_WEIGHT_CHARGES_ACCEPTED_MANDATORY = 3032;

    public static final int INTERLINE_INWARD_QUEUE_AWB_VALUATION_CHARGES_ACCEPTED_MANDATORY = 3033;

    public static final int INTERLINE_INWARD_QUEUE_AWB_OTHER_CHARGES_ACCEPTED_MANDATORY = 3034;

    public static final int INTERLINE_INWARD_QUEUE_AWB_VAT_CHARGES_ACCEPTED_MANDATORY = 3035;

    public static final int INTERLINE_INWARD_QUEUE_AWB_ISC_PERCENTAGE_ACCEPTED_MANDATORY = 3036;

    public static final int INTERLINE_INWARD_QUEUE_AWB_ISC_AMOUNT_ACCEPTED_MANDATORY = 3037;

    public static final int INTERLINE_INWARD_QUEUE_PROCESS_SUCCESS = 3038;

    public static final int INTERLINE_INWARD_QUEUE_ACCEPTED_AMOUNT_CHECK = 3039;

    public static final int FROMSTATION_IS_MANDATORY = 3040;

    public static final int TOSTATION_IS_MANDATORY = 3041;

    public static final int FROMSTATION_IS_NOT_EXIST = 3042;

    public static final int TOSTATION_IS_NOT_EXIST = 3043;

    public static final int FROMSTATION_IS_INVALID = 3044;

    public static final int TOSTATION_IS_INVALID = 3045;

    public static final int AIRWAYBILL_MUST_BE_UPDATED = 3047;

    public static final int BILLING_CARRIER_CANNOT_BE_CHANGED = 3046;

    public static final int REJECTION_MEMO_MUMBER_TYPE_SIZE = 3048;

    public static final int REJECT_REASON_TYPE_SIZE = 3049;

    public static final int REJECT_REMARKS_TYPE_SIZE = 3050;

    public static final int REJECT_AMOUNT_TYPE_SIZE = 3051;

    public static final int INWARD_REJECT_REASON_CODE_INVALIID = 3052;

    // UC066 ENDS

    // UC065 Constants Starts

    public static final String UN_MATCHED_QUEUE = "Un Matched Queue";

    public static final String OVER_BILLED_QUEUE = "Over Billed Queue";

    public static final String UNDER_BILLED_QUEUE = "Under Billed Queue";

    public static final String DUPLICATE_QUEUE = "Duplicate Queue";

    public static final String INWARD_BILLING_ERROR_QUEUE = "Inward Billing Error Queue";

    public static final String REJECTION_QUEUE = "Rejection Queue";

    // UC030 Constants starts
    public static final int TOLERANCE_LIMIT_REQUIRED = 3066;

    public static final int COLLECTION_MEDIA = 3067;

    public static final int COLLECTION_EMAIL = 3068;

    public static final int COLLECTION_EMAIL_MANDATORY = 3069;

    // UC064
    public static final int CURRENT_RECORD_SHOULD_START_WITH_CBD = 4000;

    public static final int BILLING_AIRLINE_SHOULD_BE_EQUAL_TO_BILLED_AIRLINE = 4001;

    public static final int SECOND_RECORD_SHOULD_ALWAYS_BE_INVOICE = 4002;

    public static final int FILE_HEADER_SFI_SHOULD_BE_ALWAYS_00 = 4003;

    public static final int BILLING_RECORD_MANDATORY = 4004;

    public static final int BILLED_RECORD_MANDATORY = 4005;

    /**
     * This Constants are used for Use Case 10A - GL Account Code Information
     * <p>
     * Value = {@value}
     */

    public static final int GLACCOUNTCODE_DOES_NOT_EXISTS = 24000;

    public static final int GLACCOUNTCODE_CREATED_SUCCESSFULLY = 24001;

    public static final int GLACCOUNTCODE_PROCESSED = 24002;

    public static final int GLACCOUNTCODE_UPDATED_SUCCESSFULLY = 24003;

    public static final int GLACCOUNTCODE_DELETED_SUCCESSFULLY = 24004;

    public static final int GLACCOUNTCODE_INFO_MANDATORY = 24005;

    public static final int MANDATORY_GL_ACCOUNT_NUMBER = 24006;
    
    public static final int MANDATORY_GL_ACCOUNT_CODE = 34021;

    public static final int MANDATORY_GL_ACCOUNT_NAME = 24007;

    public static final int MANDATORY_GL_ACCOUNT_CODE_TYPE = 24008;

    public static final int MANDATORY_GL_DEBIT_CREDIT_TYPE = 24009;

    public static final int MANDATORY_GL_TRIGGERING_POINT_TYPE = 24010;

    public static final int INVALID_GL_ACCOUNT_NUMBER = 24011;
    
    public static final int INVALID_GL_ACCOUNT_CODE = 34020;

    public static final int INVALID_GL_ACCOUNT_NAME = 24012;

    public static final int INVALID_NATURE_OF_POSTING = 24013;

    public static final int INVALID_COST_CENTER_FORMAT = 24014;

    public static final int DUPLICATE_GL_ACCOUNTCODE = 24015;

    public static final int GL_ACCOUNT_NUMBER_DOES_NOT_EXISTS_INTHE_SYSTEM = 24023;

    /**
     * This Constants are used for Use Case 40a - Generate Billing Accounting Entries.
     * <p>
     * Value = {@value}
     */

    public static final int ACCOUNTING_ENTRY_GENERATION_FAILED = 24016;

    public static final int ACCOUNTING_MONTH_NOT_AVAILABLE_FOR_START_DATE_AND_END_DATE = 24017;

    public static final int ACCOUNTING_ENTRY_MORE_AWB_FOUND = 24018;

    public static final int ACCOUNTING_ENTRY_RULE_RESULT_ZERO = 24019;

    public static final int NO_REPORT_FOUND_FOR_THE_SPECIFIED_CRITERIA =24032;
    
    public static final int AWB_CHARGES_NOT_PRESENT_FOR_THE_AWB = 610004;
   
   
   /* ================================================================================ */
   /* Start of UC35 Accounting AWB History Information 2602 - 2700 */
   /* ================================================================================ */    
   public static final int MANUAL_ADJUSTMENT_DOES_NOT_EXIST = 2602;
   public static final int MANUAL_ADJUSTMENT_CREATED_SUCCESSFULLY= 2604;
   public static final int  INVOICED_ADJUSTMENT_CANNOT_BE_MODIFIED = 2605;
   public static final int PARTICIPANT_DOES_NOT_EXIST=2603;
   public static final int MANUAL_ADJUSTMENT_DELETED_SUCCESSFULLY = 2607;   
   public static final int ADJUSTMENT_TYPE_REQUIRED=2608;
   public static final int ADJUSTMENT_AMOUNT_REQUIRED=2609;
   public static final int ADJUSTMENT_CURRENCY_REQUIRED=2610;
   public static final int ADJUSTMENT_REASONCODE_REQUIRED=2611;
   public static final int ADJUSTMENT_AMOUNT_TYPE_SIZE=2612;
   public static final int MANUAL_ADJUSTMENT_PROCESSED_SUCCESSFULLY= 2613;
   public static final int ADJUSTMENTS_CANNOT_BE_CREATED_FOR_INTERLINE = 2614;
   public static final int MANUAL_ADJUSTMENTS_AMOUNT_MUST_GREATER_THAN_ZERO = 2615;
   public static final int MANUAL_ADJUSTMENTS_ACCOUNT_NUMBER_INVALID = 2616;
   public static final int MANUAL_ADJUSTMENTS_ACCOUNT_NAME_INVALID = 2617;
   public static final int MANUAL_ADJUSTMENTS_ACCOUNT_NUMBER_REQUIRED = 2618;
   public static final int MANUAL_ADJUSTMENTS_ACCOUNT_NAME_REQUIRED = 2619;
   
   
   

    public static final int ACCOUNTING_ENTRY_RULE_ENGINE_ERROR = 24020;

    public static final int ACCOUNTING_ENTRY_BOTH_CREDIT_DEBIT_AVAIL = 24021;

    public static final int ACCOUNTING_ENTRY_BALANCE_NON_ZERO = 24022;

    public static final int DEBIT_CURRENCY_NOT_AVAIL = 24024;

    public static final int DEBIT_CURRENCY_FAIL = 24025;

    public static final int CREDIT_CURRENCY_FAIL = 24026;

    public static final int CREDIT_CURRENCY_NOT_AVAIL = 24027;

    public static final int BILLING_CURRENCY_NOT_AVAIL = 24028;

    public static final int HOST_CURRENCY_NOT_AVAIL = 24029;

    public static final int ACCOUNT_HEAD_NOT_EXIST = 24030;
    
    public static final int INCLUSION_ACCOUNTING_ENTRIES_FAILED = 24032;

    /* ================================================================================ */
    /* Start of UC20a Maintain Collection Agent Information */
    /* ================================================================================ */
    /**
     * This constant is used to specify whether the agent Name is valid.
     * <p>
     * value = {@value}
     */
    public static final int INVALID_COLLECTION_AGENT_NAME = 2500;

    /**
     * This constant is used to specify whether the agent station code is valid.
     * <p>
     * value = {@value}
     */
    public static final int INVALID_COLLECTION_AGENT_STATION = 2501;

    /**
     * This constant is used to specify whether the agent address is valid.
     * <p>
     * value = {@value}
     */
    public static final int INVALID_COLLECTION_ADDRESS = 2502;

    public static final int INVALID_COLLECTION_CITY = 2503;

    /* ================================================================================ */
    /* Start of UC35 Accounting AWB History Information 2601-2700 */
    /* ================================================================================ */
    public static final int NO_HISTORY_MATCH = 2601;

    /* ================================================================================ */
    /* Start of UC019 2800-2850 */
    /* ================================================================================ */
    public static final int PRORARION_MESSAGING_EXCEPTION = 1104;

    public static final int PRORARION_SYSTEM_EXCEPTION = 1105;

    public static final int INVALID_COLLECTION_STATE = 2504;

    public static final int INVALID_COLLECTION_COUNTRY = 2505;

    public static final int INVALID_COLLECTION_POSTALCODE = 2506;

    public static final int INVALID_COLLECTION_EMAILID1 = 2507;

    public static final int INVALID_COLLECTION_EMAILID2 = 2508;

    public static final int INVALID_COLLECTION_PHONE1 = 2509;

    public static final int INVALID_COLLECTION_PHONE2 = 2510;

    public static final int INVALID_COLLECTION_PHONE3 = 2511;

    public static final int INVALID_COLLECTION_FAX = 2512;

    public static final int INVALID_COLLECTION_REMARKS = 2513;

    public static final int INVALID_COLLECTION_EMPID = 2514;

    public static final int INVALID_COLLECTION_ID = 2515;

    public static final int COLLECTION_AGENT_ALREADY_EXIST = 2516;

    public static final int COLLECTION_AGENT_INFO_DOESNOT_EXIST = 2517;

    public static final int COLLECTION_AGENT_ID_REQUIRED = 2518;

    public static final int COLLECTION_AGENT_EMAIL_REQUIRED = 2519;

    public static final int COLLECTION_AGENT_PHONE_REQUIRED = 2520;

    public static final int COLLECTION_AGENT_COUNTRY_REQUIRED = 2521;

    public static final int COLLECTION_AGENT_CITY_REQUIRED = 2522;

    public static final int COLLECTION_AGENT_STATION_REQUIRED = 2523;

    public static final int COLLECTION_AGENT_ADDRESS_REQUIRED = 2524;

    public static final int COLLECTION_AGENT_NAME_REQUIRED = 2525;

    public static final int COLLECTION_AGENT_CONTRACTORID_REQUIRED = 2526;

    public static final int COLLECTION_AGENT_INFORMATION_CREATED = 2527;

    public static final int COLLECTION_AGENT_INFORMATION_DOESNOT_EXIXT = 2528;

    public static final int COLLECTION_AGENT_INFORMATION_UPDATED = 2529;

    public static final int COLLECTION_AGENT_INFORMATION_DEFAULTEMAIL2 = 2530;

    public static final int COLLECTION_AGENT_IN_PARTICIPANT = 2531;

    public static final int COLLECTION_AGENT_INFORMATION_DELETED = 2532;

    public static final int COLLECTION_AGENT_STATION_DOESNOT_EXIST = 2533;

    public static final int DUNNING_LETTER_SENT_PAYMENT_OUTSTANDING = 2534;

    public static final int DUNNING_LETTER_SENT_CREDIT_EXCEED = 2536;

    public static final int DUNNING_LETTER_SENT_CREDIT_WARNING = 2537;

    public static final int JASPER_EXCEPTION = 2535;

    public static final int DUNNING_LETTER_SENT_PAYMENT_OUTSTANDING_EMAIL = 2538;

    public static final int DUNNING_LETTER_SENT_PAYMENT_OUTSTANDING_HARDCOPY = 2539;

    public static final int DUNNING_LETTER_SENT_PAYMENT_OUTSTANDING_BOTH = 2540;

    public static final int DUNNING_LETTER_SENT_CREDIT_EXCEED_EMAIL = 2541;

    public static final int DUNNING_LETTER_SENT_CREDIT_EXCEED_HARDCOPY = 2542;

    public static final int DUNNING_LETTER_SENT_CREDIT_EXCEED_BOTH = 2543;

    public static final int DUNNING_LETTER_SENT_CREDIT_WARNING_EMAIL = 2544;

    public static final int DUNNING_LETTER_SENT_CREDIT_WARNING_HARDCOPY = 2545;

    public static final int DUNNING_LETTER_SENT_CREDIT_WARNING_BOTH = 2546;

    /**
     * <code>Private constructor.</code>
     */
    private MessageConstants() {

    }

    /**
     * This Constants are used for Use Case 40 - Process Accounting Entries
     * <p>
     * Value = {@value}
     */

    public static final int INVALID_ACCOUNTING_ENTRY_FLIGHT_NUMBER = 25000;

    public static final int INVALID_ACCOUNTING_ENTRY_INVOICE_NUMBER = 25001;

    public static final int INVALID_ACCOUNTING_ENTRY_AWB_NUMBER = 25002;

    public static final int INVALID_ACCOUNTING_ENTRY_ACCOUNTING_MONTH = 25003;
    
    public static final int INVALID_ACCOUNTING_ENTRY_FINANCIAL_YEAR = 25011;

    public static final int RECORDS_DOESNOT_EXISTS_FOR_THE_SPECIFIED_CRITERIA = 25004;

    public static final int ENTER_FLIGHT_DATE_AS_FLIGHT_NUMBER_HAS_VALUE = 25005;

    public static final int MINIMUM_ONE_SEARCH_CRITERIA_IS_REQUIRED = 25006;

    public static final int ENTER_FLIGHT_NMBER_AS_FLIGHT_DATE_HAS_VALUE = 25007;

    public static final int ENTER_AIRWAY_BILL_NUMBER_AS_TRIGGERINGPOINT_HAS_VALUE = 25008;
    
    /**
     * This Constants are used for Use Case 60/60a - Batch Control Report
     * <p>
     * Value = {@value}
     */
    
    public static final int VALIDATOR_ACCOUNTING_MONTH = 25013; 
    
    public static final int VALIDATOR_ACCOUNTING_YEAR = 25014;
    
    public static final int VALIDATOR_REPORT_NAME = 25015;
    
    public static final int MANDATORY_REPORT_TYPE = 25016;
    

    /**
     * This Constants are used for Use Case 04 - Process Monthly Closure Entries
     * <p>
     * Value = {@value}
     */
    public static final int PAYABLES_NOT_FOUND = 25009;
    
    public static final int INCLUSION_OF_PROCESS_ACC_ENTRIES_FAILED = 25010;

    /**
     * This Constants are used for Use Case 36 - Create Manual Accounting Entries
     * <p>
     * Value = {@value}
     */

    public static final int MANDATORY_ACCOUNTING_ENTRY_DEBIT_CREDIT_AMOUNT = 36000;

    public static final int MANUAL_ACOUNTING_CREATED_SUCCESSFULLY = 36001;

    public static final int MANDATORY_ACCOUNTING_ENTRY_AWB_NUMBER = 36002;

    public static final int MANDATORY_ACCOUNTING_ENTRY_ACC_REMARKS = 36003;

    public static final int MANDATORY_ACCOUNTING_ENTRY_FLIGHT_NUMBER = 36004;

    public static final int MANDATORY_ACCOUNTING_ENTRY_ACCOUNTING_DATE = 36005;

    public static final int MANDATORY_ACCOUNTING_ENTRY_FLIGHT_DATE = 36006;

    public static final int ACCOUNTING_ERRORS_RESOLVED_SUCCESSFULLY = 36007;

    public static final int MINIMUM_ONE_SEARCH_CRITERIA_REQUIRED = 36008;

    public static final int INVALID_AR_ACCOUNT_NUMBER = 36009;

    public static final int ACCOUNTING_ERRORS_RESOLVED_NOT_SUCCESS = 36010;

    public static final int MANUAL_ACOUNTING_REVERSED_SUCCESSFULLY = 36011;

    public static final int MANUAL_ACOUNTING_SUM_OF_DR_CR_DOEST_NOT_MATCH = 36012;

    public static final int MANDATORY_ACCOUNTING_ENTRY_INVOICE_NUMBER = 36013;

    public static final int MANDATORY_ACCOUNTING_ENTRY_RM_NUMBER = 36014;

    public static final int INVALID_ACCOUNTING_RM_NUMBER = 36015;

    public static final int INVALID_ACCOUNTING_DCM_NUMBER = 36016;

    public static final int INVALID_ACCOUNTING_ENTRY_REVERSAL = 36017;

    public static final int MANDATORY_ACCOUNTING_ENTRY_GL_ACCOUNT_NUMBER = 36050;

    public static final int INVALID_ACCOUNTING_ENTRY_GL_ACCOUNT_NUMBER = 36051;

    public static final int ACCOUNTING_ENTRY_GL_ACCOUNT_NUMBER_NOT_EXIST = 36052;

    public static final int INVALID_ACCOUNTING_ENTRY_INTER_REVERSAL = 36053;

    public static final int MANUAL_ACOUNTING_PROCESSED_SUCCESSFULLY = 36054;

    public static final int MANDATORY_ACCOUNTING_ENTRY_AR_ACCOUNT_NUMBER = 36055;

    public static final int INVALID_ACCOUNTING_ENTRY_COST_CENTER = 36056;

    public static final int INVALID_CREDIT_AMOUNT = 36057;

    public static final int INVALID_DEBIT_AMOUNT = 36058;

    public static final int MANDATORY_ACCOUNTING_ENTRY_DCM_NUMBER = 36059;

    public static final int INVALID_ACCOUNTING_ENTRY_DEBIT_CREDIT_AMOUNT = 36060;
    
    public static final int INVALID_MANUAL_FLIGHT_SEGMENT_ORIGIN = 36061;
    
    public static final int INVALID_MANUAL_FLIGHT_SEGMENT_DESTINATION = 36062;
    
    public static final int MANDATORY_MANUAL_FLIGHT_SEGMENT_ORIGIN = 36063;
    
    public static final int MANDATORY_MANUAL_FLIGHT_SEGMENT_DESTINATION = 36064;
    
    public static final int INVALID_FLIGHT_SEGMENT_ORIGIN_DATA = 36065;
    
    public static final int INVALID_FLIGHT_SEGMENT_DESTINATION_DATA = 36066;
    
    public static final int MANUAL_ACOUNTING_DELETED_SUCCESSFULLY = 36067;
    

    /**
     * This Constants are used for Use Case 49 - Interface With ERP.
     * <p>
     * Value = {@value}
     */
    public static final int ACCOUNTING_POSTING_FILE_NAME_NOT_FOUND = 36018;

    public static final int ACCOUNTING_POSTING_FILE_GENERATION_FAILED = 36019;

    public static final int ACCOUNTING_POSTING_DATA_DOES_NOT_EXIST = 36020;

    public static final int MANDATORY_FILE_TYPE = 36021;

    public static final int MANDATORY_FROM_DATE = 36022;

    public static final int MANDATORY_TO_DATE = 36023;

    public static final int MANDATORY_ACCOUNTING_MONTH = 36024;

    public static final int MANDATORY_ACCOUNTING_YEAR = 36025;

    public static final int INVALID_ACCOUNTING_POSTING_MONTH = 36026;

    public static final int INVALID_ACCOUNTING_POSTING_YEAR = 36027;

    public static final int MANDATORY_COMBINATION = 36028;

    public static final int ACCOUNTING_POSTING_FILE_POSTING_FAILED = 49001;

    public static final int ACCOUNTING_POSTING_FILE_GENERATION_INITIATED = 49002;

    public static final int ACCOUNTING_POSTING_FILE_POSTING_INITIATED = 49003;

    public static final int NO_ACCOUNTING_ENTRIES_FOUND = 49004;

    // UC 52 Constants Starts
    public static final int INVOICE_ALREADY_SENT = 12015;

    public static final int INVOICE_FILE_SENT_SUCCESS = 12016;

    public static final int INVOICE_FILE_SENT_FAILURE = 12017;

    public static final int INVOICE_FILE_UPLOAD_SUCCESS = 12018;

    public static final int INVOICE_FILE_UPLOAD_FAILURE = 12019;

    public static final int INVOICE_FILE_NOT_FOUND = 12020;

    public static final int NO_EMAIL_TO_SEND = 12021;

    public static final int ERR_FTP_AUTHENTICATION = 12022;

    public static final int ERR_FTP_FILESTORE = 12023;

    public static final int ERR_FTP_CLOSE_CONNECTION = 12024;

    public static final int WRONG_INVOICEMEDIA = 12025;

    // UC 59 Reporting (Participant Billing Report)

    public static final int INVALID_PARTICIPANT_BILLING_REPORT_PARTICIPANT_NAME = 15002;

    public static final int INVALID_PARTICIPANT_BILLING_REPORT_ACCOUNT_NUMBER = 15005;

    public static final int INVALID_PARTICIPANT_BILLING_REPORT_AWB_ORIGIN = 15003;

    public static final int INVALID_PARTICIPANT_BILLING_REPORT_AWB_DESTINATION = 15004;

    public static final int INVALID_PARTICIPANT_BILLING_REPORT_STATION = 15006;

    public static final int INVALID_PARTICIPANT_BILLING_REPORT_PARTICIPANT_TYPE = 15001;

    public static final int INVALID_PARTICIPANT_BILLING_REPORT_BILLING_START_DATE = 15007;

    public static final int INVALID_PARTICIPANT_BILLING_REPORT_BILLING_END_DATE = 15008;

    public static final int PARTICIPANT_ACCOUNT_NUMBER_REQUIRED = 15009;

    public static final int PARTICIPANT_ACCOUNT_NAME_AND_NUMBER_REQUIRED = 15010;

    public static final int GSA_AGREEMENT_NAME_REQUIRED = 15011;

    public static final int FLOWN_START_DATE_REQUIRED = 15012;

    public static final int FLOWN_END_DATE_REQUIRED = 15013;

    public static final int INVALID_DATE_FORMAT = 15014;

    public static final int ENTERED_GSA_AGREEMENT_NOT_BELONGS_TO_PARTICIPANT_ACC_NUM = 15015;

    public static final int GSA_AGREEMENT_INVALID = 15016;

    public static final int PARTICIPANT_ACCOUNT_NUMBER_INVALID = 15017;

    public static final int FLOWN_DATE_NOT_IN_GSA_DATE_RANGE = 15018;

    public static final int INVALID_STATION = 15019;
    
    public static final int STATION_REQUIRED = 15020;
    /*public static final int PARTICIPANT_BILLING_REPORT_DOES_NOT_EXIST = 15008;*/

    public static final int ERROR_OCCURED_WHEN_FETCHING_OPERATIONAL_AWB = 10000;

    // UC 59 Reporting (Interline Billing Report)

    public static final int INVALID_INTERLINE_BILLING_REPORT_CARRIERCODE = 16001;

    public static final int INVALID_INTERLINE_BILLING_REPORT_INVOICENUMBER = 16002;
    
    public static final int INTERLINE_RECORDS_DOESNOT_EXISTS_FOR_THE_SPECIFIED_CRITERIA=16003;

    // UC 59 Reporting (Flown Segment Revenue Report)

    public static final int INVALID_REVENUE_REPORT_SEGMENT_ORIGIN = 17011;

    public static final int INVALID_REVENUE_REPORT_SEGMENT_DESTINATION = 17012;

    public static final int INVALID_REVENUE_REPORT_FLIGHT_NUMBER = 17013;

    public static final int INVALID_REVENUE_REPORT_FLIGHT_DATE = 17014;

    public static final int INVALID_REVENUE_REPORT_START_DATE = 17015;

    public static final int INVALID_REVENUE_REPORT_END_DATE = 17016;

    public static final int ENTER_EITHER_OF_THE_CRITERIA = 17017;

    public static final int INVALID_REVENUE_REPORT_START_DATE_MANDATORY = 17018;

    public static final int INVALID_REVENUE_REPORT_END_DATE_MANDATORY = 17019;

    // UC53 Constants Starts

    public static final int INVOICE_NUMBER_DOESNOT_EXISTS = 53001;

    public static final int PAYMENT_IDENTIFIER_ALREADY_EXISTS = 53002;
    
    public static final int FILE_REJECTED = 53003;

    /* UC038 */
    public static final int PAYMENT_INFORMATION_CREATED_SUCCESSFULLY = 38001;

    public static final int PAYMENT_INFORMATION_DOES_NOT_EXIST = 38002;

    public static final int PAYMENT_INFORMATION_UPDATED_SUCCESSFULLY = 38003;

 //error messages- Validations
    
    public static final int MANDATORY_PAYMENT_IDENTIFIER = 38004;
    
    public static final int MANDATORY_PAYMENT_CURRENCY = 38005;
    
    public static final int MANDATORY_TOTAL_WEIGHT_AMOUNT = 38006;
     
    public static final int MANDATORY_TOTAL_VALUATION_AMOUNT = 38007;
    
    public static final int MANDATORY_TOTAL_COMMISSION_AMOUNT = 38008;
    
    public static final int MANDATORY_TOTAL_VAT_AMOUNT = 38009;
    
    public static final int MANDATORY_TOTAL_NET_AMOUNT = 38010;
    
    public static final int MANDATORY_INVOICE_NUMBER = 38011;
    
    public static final int MANDATORY_AIRWAYBILL_NUMBER = 38012;
    
    public static final int MANDATORY_AIRWAYBILL_ORIGIN = 38013;
    
    public static final int MANDATORY_AIRWAYBILL_DESINATION = 38014;
    
    public static final int MANDATORY_GROSS_WEIGHT = 38015;
    
    public static final int MANDATORY_NET_AMOUNT = 38016;
    
    public static final int INVALID_PAYMENT_IDENTIFIER = 38017;
     
    public static final int INVALID_PAYMENT_CURRENCY = 38018;
    
    public static final int INVALID_TOTAL_WEIGHT_AMOUNT = 38019;
    
    public static final int INVALID_TOTAL_VALUATION_AMOUNT = 38020;
    
    public static final int INVALID_TOTAL_COMMISSION_AMOUNT = 38021;
    
    public static final int INVALID_TOTAL_VAT_AMOUNT = 38022;
    	    
    public static final int INVALID_TOTAL_NET_AMOUNT = 38023;
    
    public static final int INVALID_INVOICE_NUMBER = 38024;
    
    public static final int INVALID_AIRWAYBILL_NUMBER = 38025;
    
    public static final int INVALID_DCM_REFERENCE_NUMBER = 38026;
    
    public static final int INVALID_AIRWAYBILL_ORIGIN = 38027;
    
    public static final int INVALID_AIRWAYBILL_DESINATION = 38028;
    
    public static final int INVALID_GROSS_WEIGHT = 38029;
    
    public static final int INVALID_PIECES = 38030;
    
    public static final int INVALID_OTHER_CHARGE_DUE_CARRIER = 38031; 
    
    public static final int INVALID_OTHER_CHARGE_DUE_AGENT = 38032;
    
    public static final int INVALID_WEIGHT_CHARGE = 38033;
    
    public static final int INVALID_VALUATION_CHARGE = 38034;
    
    public static final int INVALID_COMMISSION_AMOUNT = 38035;
    
    public static final int INVALID_COMMISSION_PERCENTAGE = 38036;
    
    public static final int INVALID_VAT_AMOUNT = 38037;
    
    public static final int INVALID_NET_AMOUNT = 38038;

    public static final int BILLING_START_DATE_GREATER_THAN_END_DATE = 38039;
    
    public static final int MINIMUM_ONE_SEARCH_CRITERIA = 38040;
    
    public static final int MANDATORY_BILLING_START_DATE = 38041;
    
    public static final int MANDATORY_BILLING_END_DATE = 38042;
    
    public static final int MANDATORY_AWB_DATE = 38043;
    
    public static final int MANDATORY_PAYMENT_LEVEL = 38044;
    
    //UC-38
    public static final int PAYMENT_END_DATE_MANDATORY_AS_START_DATE_HAS_VALUE = 38045;
    
    public static final int PAYMENT_START_DATE_MANDATORY_AS_END_DATE_HAS_VALUE = 38046;
    
    public static final int BILLING_END_DATE_MANDATORY_AS_START_DATE_HAS_VALUE = 38047;
    
    public static final int BILLING_START_DATE_MANDATORY_AS_START_END_HAS_VALUE = 38048;
    
    public static final int MINIMUM_ONE_CRITERIA_REQUIRED_FOR_PAYMENT_SEARCH = 38049;
    
    public static final int NO_PAYMENTS_EXISTS_IN_THE_FILE = 38050;
    
    public static final int FILE_UPLOADED_SUCCESSFULLY = 38051;
    
    public static final int MANDATORY_BREAKDOWN  = 38052;
    
    public static final int NO_PAYMENTS_FOUN_FOR_SPECIFIED_CRITERIA  = 38053;
    
    public static final int MANDATORY_PAYMENT_UNIT = 38054;
    
    public static final int MANDATORY_PAYMENT_STATUS = 38055;
    
    public static final int MANDATORY_PAYMENT_SOURCE = 38056;
    
    public static final int MANDATORY_PAYMENT_DATE = 38057;
    
    public static final int MANDATORY_PAYMENT_DUE_DATE = 38058;
    
    public static final int MANDATORY_PAYMENT_BILLING_START_DATE = 38059;
    
    public static final int MANDATORY_PAYMENT_BILLING_END_DATE = 38060;
    
    public static final int WRONG_FILE_DATA = 38061;

    /**
     * This Constants are used for Use Case 45 - Account Balance Report.
     * <p>
     * Value = {@value}
     */
    public static final int ATLEAST_ONE_CRITERIA_REQUIRED = 13000;    
    public static final int ENTER_START_DATE_AS_END_DATE_HAS_VALUE = 13001;    
    public static final int ENTER_END_DATE_AS_START_DATE_HAS_VALUE = 13002;    
    public static final int ENTER_MONTH_AS_FINANCIAL_YEAR_HAS_VALUE = 13003;    
    public static final int ENTER_FINANCIAL_YEAR_AS_MONTH_HAS_VALUE = 13004;    
    public static final int ENTER_EITHER_OF_ONE_CRITERIA = 13005;    
    public static final int NO_ACCOUNT_BALANCE_REPORTS_FOR_SPECIFIED_CRITERIA = 13006;
    public static final int INVALID_FLIGHT_SEGMENT_ORIGIN = 86089;    
    public static final int INVALID_FLIGHT_SEGMENT_DESTINATION = 86090;




   

    // UC085 AirWaybill Adjustments
    public static final int START_DATE_MUST_BE_LESS_END_DATE = 5000;

    public static final int AIRWAYBILL_INFORMATION_DOES_NOT_EXIST_FOR_THE_GIVEN_FIELDS = 5001;

    public static final int AIRWAYBILL_ADJUSTMENTS_CONTRACT_NUMBER_TYPE_SIZE = 5002;

    public static final int AIRWAYBILL_ADJUSTMENTS_DESTINATION_STATION_TYPE_SIZE = 5003;

    public static final int AIRWAYBILL_ADJUSTMENTS_ORIGIN_STATION_TYPE_SIZE = 5004;

    public static final int AIRWAYBILL_ADJUSTMENTS_PARTICIPANT_ACCOUNT_NUMBER_TYPE_SIZE = 5005;

    public static final int AIRWAYBILL_ADJUSTMENTS_PARTICIPANT_NAME_TYPE_SIZE = 5006;

    public static final int AIRWAYBILL_ADJUSTMENTS_PRODUCT_CODE_TYPE_SIZE = 5007;

    public static final int AIRWAYBILL_ADJUSTMENTS_ACCOUNT_TYPE_REQUIRED = 5008;

    public static final int AIRWAYBILL_ADJUSTMENTS_FLIGHT_NUMBER_TYPE_SIZE = 5009;

    public static final int AIRWAYBILL_ADJUSTMENTS_PARTICIPANTNAME_ACCOUNTNUMBER_REQUIRED = 5010;

    public static final int AIRWAYBILL_ADJUSTMENTS_PARTICIPANT_NAME_MANDATORY = 5011;
    
    public static final int AIRWAYBILL_SUBMITTED_FOR_RERATING_SUCCESSFULLY = 5012;
    
    public static final int AIRWAYBILL_ADJUSTMENTS_UPDATE_REASON_TEXT_TYPE_SIZE = 5013;
    
    public static final int AIRWAYBILL_ADJUSTMENTS_MAX_AWB_REACHED = 5014;
    
    public static final int AIRWAYBILL_ADJUSTMENTS_NO_AWB_SELECTED = 5015;
    
    public static final int AIRWAYBILL_ADJUSTMENTS_AWB_IN_PROCESSING_STATE = 5016;
    
	// Dunning Letter

	public static final int DUNNING_LETTER_OBJECT_MANDATORY = 3500;
	public static final int ACCOUNTING_DUNNING_LETTER_TYPE_MANDATORY = 3501;
	public static final int ACCOUNTING_DUNNING_LETTER_FORMAT_MANDATORY = 3502;
	public static final int DUNNING_LETTER_ACCOUNT_NO_INVALID = 3503;
	public static final int DUNNING_LETTER_TEXT_COUNT = 3504;
	public static final int ACCOUNTING_DUNNING_LETTER_TEXT_MANDATORY = 3505;
	public static final int DUNNING_LETTER_CREATED = 3506;
	public static final int ACCOUNTING_PARTICIPANT_NAME = 3507;
	public static final int DUNNING_LETTER_PARTICIAPNT_ACC_NO = 3508;
	public static final int DUNNING_PARTICIPANT_GROUP_MANDATORY = 3509;
	public static final int DUNNING_PARTICIPANT_NAME_INVALID = 3510;
	public static final int PARTICIPANT_GROUP_DOESNOT_EXIST = 3511;
	public static final int PARTICIPANT_DOESNOT_EXIST = 3512;
	public static final int DUNNING_DOESNOT_EXIST = 3513;

	public static final int DUNNING_UPDATED = 3514;

	public static final int DUNNING_DELETED = 3515;
	
	public static final int DUNNING_STATIONERROR=3516;
	
	public static final int DUNNING_LETTER_GROUP_NO =3517;
	
	public static final int DUNNING_LETTER_ACCNO_OR_ITATA_EXIST =3518;
	
	public static final int INVALID_PARTICIPANT_PAYABLE_REPORT_PARTICIPANT_NAME = 15002;
	
	public static final int INVALID_PARTICIPANT_PAYABLE_REPORT_PARTICIPANT_ACCOUNT_NUMBER = 15017;
	
	public static final int INVALID_PARTICIPANT_PAYABLE_REPORT_STATION = 15006;
	
	public static final int INVALID_PROVISION_STATEMENT_ACCOUNTING_MONTH = 590001;
	

	// UC 039 Start
	
		public static final int PAYMENT_DETAILS_NOT_FOUND = 39001;
		
		public static final int PAYMENT_ALREADY_APPLIED = 39002;
		public static final int PAYMENT_PARTICIPANT_ACCOUNT_NUMBER_NOT_MATHCED_TO_INVOICE_INFORMATION = 39003;
		public static final int PAYMENT_INVOICE_NUMBER_NOT_MATHCED_TO_INVOICE_INFORMATION = 39004;
		public static final int AMOUNT_FIELDS_MUST_BE_GREATER_THAN_ZERO =39005;
		public static final int AWB_NOT_SETTLED = 39006;
		public static final int INVOICE_PARTIALLY_PAID = 39007;
		public static final int TOTAL_AMOUNT_PAID_SUM_NET_AMOUNT_PAID_NOT_EQUAL = 39008;
		public static final int PAYMENT_BREAKDOWNS_NOT_AVAILABLE = 39009;
		public static final int INVOICE_OVER_PAID = 39010;
		public static final int AWB_OR_DCM_NOT_FOUND_IN_CRA_SYSTEM = 39011;
		public static final int AWB_PARTIALLY_PAID = 39012;
		public static final int AWB_OVER_PAID = 39013;
		public static final int AWB_NOT_FOUND_IN_CRA_SYSTEM = 39014;
		public static final int DCM_NOT_FOUND_IN_CRA_SYSTEM = 39015;
		public static final int PAYMENT_BREAKDOWNS_SETTLEMENT_STATUS_NOT_APPLIED = 39016;
		public static final int APPLICATION_OF_PAYMENTS_SUCCESS = 39017;
		public static final int AWB_NOT_INVOICE=39018;
		public static final int PAYMENT_INVOICE_STATUS_NOT_FINAL=39019;
		
		
		public static final int ACCOUNTING_ENTRIES_WRITTENOFF_SUCCESSFULLY = 610001;
		
		public static final int ACCOUNTING_ENTRIES_WRITTENOFF_FAILED = 610002;
		
		public static final int ACCOUNTING_ENTRIES_SUBMITTED_FOR_WRITEOFF = 610003;
		
	
		//UC-62
		
		public static final int NO_PARTICIPANTS_FOR_SPECIFIED_CRITERIA = 62000;
		public static final int NO_INVOICES_FOR_SPECIFIED_CRITERIA = 62001;
		public static final int ENTER_MANDATORY_INFORMATION_DETAIL_TYPE_IDENTIFIER =62002;
		public static final int ENTER_MINIMUM_ONE_CRITERIA = 62003;
		public static final int ENTER_MINIMUM_ONE_CRITERIA_INVOICE = 62004;
		public static final int ENTER_MINIMUM_ONE_CRITERIA_AWB = 62005;

		
		//UC058
		public static final int NO_AWB_FOR_ACCRUAL_FROM_LMS = 580001;
		public static final int NO_AWB_FOR_ACCRUAL_FROM_CRA = 580002;
		public static final int ACCOUNTING_PERIOD_NOT_FOUND = 580003;
		public static final int RUNTIME_PARAMETER_VALUE_NOT_FOUND = 580004;
				
		//UC055
		public static final int NO_SIS_RUNDATE_FOR_INTL_OUTWD_BILLING = 62006;	
		
		//Manual Audit Queue Deeps
		public static final int REMOVAL_OF_AWBINVOICE_ONHOLD = 62009;
		
		public static final int REMOVAL_OF_BILLING_CREDIT_MEMO_ONHOLD = 62099;
		
		//AirwayBill List Information Use case
		public static final int AWB_NUMBER_NOT_FOUND = 62010;
		public static final int INVALID_AIRPORTCODE_ORIGIN = 62011;
		public static final int INVALID_AIRPORTCODE_DESTINATION = 62012;
		public static final int REMOVAL_OF_REJECTIONMEMO_ONHOLD = 62013;
		public static final int EITHER_AWB_CCADCM_NUMBER_MANDATORY = 62014;
		public static final int AWB_DETAILS_DOESNOT_EXISTS = 62015;
		public static final int CCA_DCM_DETAILS_DOESNOT_EXISTS = 62016;
		public static final int BOTH_EXECUTION_STARTDATE_AND_EXECUTION_ENDDATE_ARE_MANDATORY = 62017;
		public static final int BOTH_INVOICE_FROMDATE_AND_INVOICE_TODATE_ARE_MANDATORY = 62018;
		public static final int BOTH_AWB_ORIGIN_AND_AWB_DESTINATION_ARE_MANDATORY = 62019;
		
				
		
		
		
		public static final int AWB_ONHOLD_SUCCESS = 72006;
		public static final int STATION_CASH_PAYMENT_COMPLETED = 73006;
		public static final int REMARKS_FIELD_EMPTY = 73007;
		public static final int ON_HOLD_AWB_SELECTION = 73008;
		
		public static final int INVALID_FLIGHT_NUMBER_AWB_LIST = 73009;
		public static final int CLEARANCE_MONTH_NOT_VALID = 73010;
		public static final int BOTH_FROM_STATION_AND_TO_STATION_ARE_MANDATORY = 73011;
		public static final int AWB_LISTING_SCREEN_WITH_NO_FILTER_CRITERIA_GIVEN = 73015;
		
		// Accounting Batch Job Execution from UI
		public static final int JOB_LAUNCHED_SUCCESSFULLY = 73012;
		
		public static final int JOB_LAUNCH_FAILED = 73013;
		
		public static final int INVOICE_GENERATION_JOB_LAUNCHED_SUCCESSFULLY = 73014;
		
		// Billing and Credit Memos		
		public static final int OUTWARD_BILLING_MEMO_CREATED_SUCCESSFULLY = 82010;
		
		public static final int OUTWARD_BILLING_MEMO_CHECK = 82011;
		
		public static final int OUTWARD_BILLING_CARRIER_CODE_DOES_NOT_EXISTS = 82012;
		
		public static final int OUTWARD_BILLING_MEMO_CURRENCY = 82013;
		
		public static final int OUTWARD_BILLING_MEMO_CLEARING_HOUSE_TYPE = 82014;
		
		public static final int OUTWARD_BILLING_MEMO_YEAR_MONTH_TYPE_SIZE = 82015;
		
		public static final int OUTWARD_BILLING_MEMO_PERIOD_TYPE_SIZE = 82016;
		
		public static final int OUTWARD_BILLING_MEMO_CARRIER_TYPE_SIZE = 82017;
		
		public static final int OUTWARD_BILLING_MEMO_INVOICE_NUMER_TYPE_SIZE = 82018;
		
		public static final int OUTWARD_BILLING_MEMO_CURRENCY_TYPE_SIZE = 82019;
		
		public static final int OUTWARD_BILLING_MEMO_SECTOR_CARRIER_CODE_DOES_NOT_EXISTS = 82020;
		
		public static final int OUTWARD_BILLING_MEMO_AWB_ORIGN = 82021;
		
		public static final int OUTWARD_BILLING_MEMO_AWB_DEST = 82022;
		
		public static final int OUTWARD_BILLING_MEMO_SECTOR_ORIG = 82021;

	    public static final int OUTWARD_BILLING_MEMO_SECTOR_DEST = 82022;
	    
	    public static final int OUTWARD_MEMO_APPROVED = 82023;
	    
	    public static final int OUTWARD_MEMO_NOT_UPDATABLE = 82024;
	    
	    public static final int OUTWARD_MEMO_UPDATED_SUCCESSFULLY = 82025;
	    
	    public static final int OUTWARD_MEMO_ALREADY_EXISTS = 82026;
	    
	    public static final int OUTWARD_MEMO_DOES_NOT_EXIST_FOR_THE_GIVEN_FIELDS = 82027;
	    
	    public static final int OUTWARD_MEMO_DELETED_SUCCESSFULLY = 82028;
	    
	    public static final int OUTWARD_MEMO_ALREADY_APPROVED = 82029;
	    
	    public static final int OUTWARD_MEMO_CANNOT_BE_DELETED= 82030;
	    
	    public static final int OUTWARD_BILLING_CLEARING_HOUSE_MANDATORY = 82031;

	    public static final int OUTWARD_BILLING_BILLING_YEAR_MONTH_MANDATORY = 82032;

	    public static final int OUTWARD_BILLING_BILLING_PERIOD_MANDATORY = 82033;

	    public static final int OUTWARD_BILLING_INVOICE_NUMBER_MANDATORY = 82034;

	    public static final int OUTWARD_BILLING_BILLING_CARRIER_MANDATORY = 82035;

	    public static final int OUTWARD_BILLING_DOES_NOT_EXIST_FOR_THE_GIVEN_FIELDS = 82036;

	    public static final int OUTWARD_BILLING_INVOICE_DATE_MANDATORY = 82037;

	    public static final int OUTWARD_BILLING_INVOICE_CURRENCY_MANDATORY = 82038;

	    public static final int OUTWARD_BILLING_BILLING_NUM_MANDATORY = 82039;

	    public static final int OUTWARD_BILLING_YOUR_INVOICE_NUM_MANDATORY = 82040;

	    public static final int OUTWARD_BILLING_YOUR_INVOICE_DATE_MANDATORY = 82041;

	    public static final int OUTWARD_BILLING_BILLING_TYPE_MANDATORY = 82042;

	    public static final int OUTWARD_BILLING_YOUR_INVOICE_BILLING_YEAR_MONTH = 82043;

	    public static final int OUTWARD_BILLING_AWB_PAYMENT_TYPE_MANDATORY = 82044;

	    public static final int OUTWARD_BILLING_AWB_NUMBER_MANDATORY = 82045;

	    public static final int OUTWARD_BILLING_AWB_EXECUTION_DATE_MANDATORY = 82046;

	    public static final int OUTWARD_BILLING_AWB_ORIGIN_MANDATORY = 82047;

	    public static final int OUTWARD_BILLING_AWB_DESTINATION_MANDATORY = 82048;

	    public static final int OUTWARD_BILLING_AWB_TOTAL_MANDATORY = 82049;

	    public static final int OUTWARD_BILLING_WEIGHT_CHARGES_MANDATORY = 82050;

	    public static final int OUTWARD_BILLING_VALUATION_CHARGES_MANDATORY = 82051;

	    public static final int OUTWARD_BILLING_OTHER_CHARGES_MANDATORY = 82052;

	    public static final int OUTWARD_BILLING_ISC_PERCENTAGE_MANDATORY = 82053;

	    public static final int OUTWARD_BILLING_ISC_AMOUNT_MANDATORY = 82054;

	    public static final int OUTWARD_BILLING_VAT_AMOUNT_MANDATORY = 82055;

	    public static final int OUTWARD_BILLING_SECTOR_CARRIER_MANDATORY = 82056;

	    public static final int OUTWARD_BILLING_SECTOR_ORIG_MANDATORY = 82057;

	    public static final int OUTWARD_BILLING_SECTOR_DEST_MANDATORY = 82058;

	    public static final int OUTWARD_BILLING_PRORATE_TYPE_MANDATORY = 82059;

	    public static final int OUTWARD_BILLING_PRORATE_FACTOR_MANDATORY = 82060;

	    public static final int OUTWARD_BILLING_PRORATE_AMOUNT_MANDATORY = 82061;

	    public static final int OUTWARD_BILLING_REMARK_MANDATORY = 82062;

	    public static final int OUTWARD_BILLING_PROARTE_ENTRIES_MANDATORY = 82063;

	    public static final int OUTWARD_BILLING_INVOICE_ENTRIES_MANDATORY = 82064;

	    public static final int OUTWARD_BILLING_INVOICE_STATUS_MANDATORY = 82065;
	    
	    public static final int INTERLINE_INWARD_BILLING_MEMO_DATE_MANDATORY = 82066;
	    
	    public static final int INTERLINE_INWARD_YOUR_INVOICE_DATE_MANDATORY = 82067;
	    
	    public static final int INTERLINE_INWARD_AWB_EXECUTION_DATE_MANDATORY = 82068;
	    
	    public static final int INTERLINE_INWARD_DATE_OF_CARRIAGE_IS_MANDATORY = 82069;
	    
	    public static final int INTERLINE_INWARD_REASON_CODE_IS_MANDATORY = 82070;
	    
	    public static final int INTERLINE_INWARD_REMARKS_IS_MANDATORY = 82071;
	    
	    public static final int INTERLINE_INWARD_CURRENCY_ADJUSTMENT_IS_MANDATORY = 82072;
	    
	    public static final int INTERLINE_INWARD_BILLED_WEIGHT_IS_MANDATORY = 82073;
	    
	    public static final int  FTP_SERVER_CONNECTION_FAILED = 90000;
	    
	    public static final int FILE_SENT_FAILURE_BY_EMAIL_BATCH = 90001;
	    
	    public static final int EFFECTIVE_FROM_DATE_IS_MANDATORY = 90002;
	    
	    public static final int SPLIT_SHIPMENT_PRESENT = 90003;
	    
	    public static final int FLOWN_SEGMENT_INCOMPLETE = 90004;
	    
	    public static final int FLIGHT_NUMBER_IS_MANDATORY_IN_ONLINE_PRORATION = 90005;
	    
	    public static final int SEGMENT_DESTINATION_IS_MANDATORY_IN_ONLINE_PRORATION = 90006;
	    
	    public static final int SEGMENT_ORIGIN_IS_MANDATORY_IN_ONLINE_PRORATION = 90007;
	    
	    public static final int FLIGHT_DATE_IS_MANDATORY_IN_ONLINE_PRORATION = 90008;
	    
	    public static final int CARRIER_REVENUE_IS_MANDATORY_IN_ONLINE_PRORATION = 90009;
	    
	    public static final int CANNOT_UPDATE_AWB_WITH_INTERLINE_CARRIER_INVOICED = 90010;
	    
	    public static final int BILLING_INFO_REQUIRED = 90011;
	    
	    
	    
	    public static final int ACCOUNTS_PAYABLE_INFORMATION_PICKUP_OPERATOR_DOES_NOT_EXIST=90012;
	    
	    public static final int ACCOUNTS_PAYABLE_INFORMATION_DELIVERY_OPERATOR_DOES_NOT_EXIST=90013;
	    
	    public static final int PICKUP_OPERATOR_DOES_NOT_EXIST_ORIGIN_ADVANCE_CHARGE=90014;
	    
	    public static final int DELIVERY_OPERATOR_DOES_NOT_EXIST_DESTINATION_ADVANCE_CHARGE=90015;
	    
	    public static final int PROPER_PRO_IDENTIFIER_FOR_SPA=90016;
	    
	    public static final int PRO_IDENTIFIER_MANDATORY_FOR_SPA=90017;
	    
	    public static final int MANDATORY_ACCOUNTING_ENTRY_INVOICE_DATE=90021;
	    
	    public static final int INVALID_ACCOUNTING_ENTRY_PROFIT_CENTER=90022;
	    
	    public static final int MANDATORY_ACCOUNTING_ENTRY_AP_ACCOUNT_NUMBER=90023;
	    
	    public static final int INVALID_AP_ACCOUNT_NUMBER=90024;
	    
	    public static final int PRORATE_ID_TYPE_SIZE = 90025;
	    public static final int NUMBER_OF_SPA_RECORDS_LIMIT = 90026;
	    
	    public static final int RECEIVABLE_SPLIT_DO_NOT_MATCH = 90027;
	    
	    public static final int CARR_RECEIVABLE_SPLIT_DO_NOT_MATCH = 90028;
	    
	    public static final int CARR_PAYABLE_SPLIT_DO_NOT_MATCH = 90029;
	    
	    public static final int CARR_PAYABLE_OR_RECV_MANDATORY = 90030;
	    
	    //changes start
	    public static final int TOTAL_GROSS_WEIGHT_IS_NOT_EQUAL_TO_THE_TOTAL_WEIGHT_IN_ACTUAL_FLOWN = 90031;
	    
	    public static final int HOST_REVENUE_AMOUNT_NOT_EQUAL_TO_SUM_OF_CARRIER_REVENUE_AMOUNT_IN_ONLINE_PRORATION = 90032;
	    
	    public static final int CARRIER_REVENUE_AMOUNT_IN_ONLINE_PRORATION_SECTION_IS_GREATER_THAN_THE_TOTAL_AWB_WEIGHT_CHARGE_AMOUNT = 90033;
	    
	    public static final int PARTICIPANT_PREPAID_RECEIVABLE_AMOUNT_IS_NOT_EQUAL_TO_THE_TOTAL_PREPAID_CHARGES = 90034;
	    
	    public static final int PARTICIPANT_CHARGES_COLLECT_RECEIVABLE_AMOUNT_IS_NOT_EQUAL_TO_THE_TOTAL_COLLECT_CHARGES = 90035;
	    
	    public static final int COLLECT_RECEIVABLES_INVOICE_STATUS_IS_BLANK = 90036;
	    
	    public static final int PREPAID_RECEIVABLES_INVOICE_STATUS_IS_BLANK = 90037;
	    
	    public static final int CARRIER_RECEIVABLE_INVOICE_STATUS_IS_BLANK = 90038;
	    
	    public static final int INTERLINE_AWB_WITHOUT_INTERLINE_PRORATION = 90039;
	    
	    public static final int NO_ACTIVE_ACCOUNTING_ENTRIES_TRIGGERED = 90040;
	    
	    public static final int PART_PP_AND_PART_CC_PAY_CODE_AWBS = 90041;
	    
	    public static final int NO_HOST_CARRIER_PRESENT_IN_THE_ROUTING = 90042;
	    
	    public static final int SUM_OF_SPLIT_AMOUNT_IS_NOT_EQUAL_TO_THE_TOTAL_INVOICE_AMOUNT = 90043;
	    
	    public static final int BOTH_RECEIVABLE_AND_PAYABLE_SECTION_IS_BLANK = 90044;
	    
	    public static final int ACCOUNTING_ENTRIES_ARE_ALREADY_TRIGGERED = 90046;
	    
	    public static final int AWB_STATUS_IS_MANDATORY_ALONG_WITH_PARTICIPANT_CARRIER = 90045;
	    
	    public static final int INVALID_COUNTRY_CODE_BILLING_SCHEDULE_TYPE_COUNTRY = 90047;
	    public static final int INVALID_IDENTIFIRE_BILLING_SCHEDULE_TYPE_BILLING_GROUP = 90048;
	    public static final int INVALID_IDENTIFIRE_BILLING_SCHEDULE_TYPE_PARTICIPANT_ACCOUNT = 90049;
	    public static final int INVALID_IDENTIFIRE_BILLING_SCHEDULE_TYPE_AGGREGATE = 90050;
	    public static final int INVALID_IDENTIFIRE_BILLING_SCHEDULE_TYPE_STATION = 90051;
	    public static final int ON_HOLD_STATUS_CHANGE_NOT_ALLOWED_USING_MANUAL_PRORATION = 90052;
	    public static final int PUTTING_AIR_WAYBILL_ON_HOLD_NOT_ALLOWED_USING_MANUAL_PRORATION = 90053;
	    public static final int ACCOUNTING_ENTRY_GL_ACCOUNT_CODE_NOT_EXIST = 90054;
	    public static final int INVALID_ACCOUNTING_ENTRY_GL_ACCOUNT_CODE = 90055;
	    public static final int MANDATORY_ACCOUNTING_ENTRY_GL_ACCOUNT_CODE = 90056;
	    public static final int AR_ACCOUNT_NUMBER_NOT_EXIST = 90057;
	    public static final int AP_ACCOUNT_NUMBER_NOT_EXIST = 90058;
	    public static final int INVOICE_NUMBER_NOT_EXIST = 90059;
	    public static final int OD_DO_FLOWN_PRESENT = 90060;
	    public static final int BILLING_SCHEDULE_CANNOT_UPDATE_PAST_DATE = 90061; 
	    public static final int DCM_REFERENCE_NUMBER_NOT_EXIST = 90062;
	    public static final int DCM_EXIST_BUT_YET_INVOICED=90063;
	    public static final int INVALID_DCM_NUMBER_FOR_MANUAL_ACCOUNTING_ENTRY = 90064;
	    public static final int INVALID_MANUAL_ACCOUNTING_ENTRY_INVOICE_NUMBER = 90065;
		public static final int SUM_AWB_CHARGES_NOT_MATCH_TOTAL_PREPAID_OR_COLLECT_CHARGE=90066;
		public static final int INFINITE_LOOP=90067;
	    
	    public static final int MULTIPLE_COMMODITY_SPA_SPLIT_SHIPMENT_PRESENT = 90068;
	    
	    public static final int PAYABLE_RECEIVABLE_INDICATOR_CANNOT_BE_NULL = 90070;
	    
	    public static final int INCORRECT_RECEIVABLE_PAYMENT_STATUS = 90071;
	    
	    public static final int INCORRECT_DCM_CREATION = 90072;
	    
	    public static final int ORIGINAL_ENTRY_PRESENT = 90073;
	    
	    public static final int ACCOUNTING_POSTING_FILETYPE = 90075;
	    
	    public static final int ACCOUNTING_POSTING_FROMDATE = 90076;
	    
	    public static final int ACCOUNTING_POSTING_TODATE = 90077;
	    
	    public static final int FLOWN_SEGMENT_DUPLICATE = 90078;
	    
	    public static final int GSTR_RETURN_FROM_AND_TO_DATES_ISEMPTY = 90081;

        public static final int PAYABLE_SPLIT_DO_NOT_MATCH = 90083;
	    
	    /*
	     * ========================================================================================================
	     *
	     * Interline Outward Memo (BM/CM) related message constants.
	     *
	     * ========================================================================================================
	     */
	    public static final int INTERLINE_MEMO_CREATED = 6000;
	    public static final int MEMO_DOES_NOT_EXIST = 6001;
	    public static final int INTERLINE_MEMO_UPDATED = 6002;
	    public static final int INTERLINE_MEMO_DELETED = 6003;
	    public static final int INTERLINE_MEMO_PROCESSED = 6004;
        public static final int BILLING_MEMOS_ARE_APPROVED_SUCCESSFULLY = 6005;
        public static final int BILLING_MEMOS_ARE_RELEASED_SUCCESSFULLY = 6006;
        public static final int INVALID_MEMO_NUMBER = 6007;
        public static final int INVALID_MEMO_DATE_FROM = 6008;
        public static final int INVALID_MEMO_DATE_TO = 6009;
        public static final int INVALID_BILLED_CARRIER = 6010;
        public static final int MEMO_NO_RECORDS = 6011;
        public static final int MANDATORY_BILLED_CARRIER = 6012;
        public static final int INVALID_MEMO_INVOICE_NUMBER = 6013;
        public static final int INVALID_INVOICE_BILLING_DATE = 6014;
        public static final int MANDATORY_MEMO_TOTAL_NET_AMOUNT = 6015;
        public static final int INVALID_MEMO_TOTAL_NET_AMOUNT = 6016;
        public static final int MANDATORY_MEMO_WEIGHT_CHARGES = 6017;
        public static final int MANDATORY_MEMO_VAL_CHARGES = 6018;
        public static final int MANDATORY_MEMO_OTH_CHARGES =  6019;
        public static final int MANDATORY_MEMO_ISC_SUBJECTED_AMOUNT =  6020;
        public static final int MANDATORY_MEMO_ISC_PERCENTAGE =  6021;
        public static final int MANDATORY_MEMO_ISC_AMOUNT =  6022;
        public static final int MANDATORY_MEMO_VAT_AMOUNT =  6023;
        public static final int MANDATORY_MEMO_REASON_CODE =  6024;
        public static final int INVALID_MEMO_WEIGHT_CHARGES =  6025;
        public static final int INVALID_MEMO_VAL_CHARGES =  6026;
        public static final int INVALID_MEMO_OTH_CHARGES =  6027;
        public static final int INVALID_MEMO_ISC_SUBJECTED_AMOUNT=  6028;
        public static final int INVALID_MEMO_ISC_PERCENTAGE =  6029;
        public static final int INVALID_MEMO_ISC_AMOUNT =  6030;
        public static final int INVALID_MEMO_VAT_AMOUNT =  6031;
        public static final int INVALID_MEMO_CORRESPONDANCE_NUMBER =  6032;
        public static final int INVALID_MEMO_REFERENCE_NUMBER=  6033;
        public static final int INVALID_MEMO_REASON_DESCRIPTION=  6034;
        public static final int MANDATORY_MEMO_SIS_REFERENCE_NUMBER = 6035;
        public static final int MANDATORY_MEMO_AIRLINE_REFERENCE_NUMBER = 6036;
        public static final int MANDATORY_MEMO_AWB_NUMBER = 6037;
        public static final int MANDATORY_MEMO_AWB_EXECUTION_DATE = 6038;
        public static final int MANDATORY_MEMO_AWB_FROM_AIRPORT = 6039;
        public static final int MANDATORY_MEMO_AWB_TO_AIRPORT = 6040;
        public static final int MANDATORY_MEMO_AWB_DATE_OF_CARRIAGE = 6041;
        public static final int MANDATORY_MEMO_AWB_PRORATE_PERCENTAGE = 6042;
        public static final int INVALID_MEMO_AWB_NUMBER = 6043;
        public static final int INVALID_MEMO_AWB_SEGMENT_ORIGIN = 6044;
        public static final int INVALID_MEMO_AWB_SEGMENT_DESTINATION = 6045;
        public static final int INVALID_MEMO_AWB_AIRPORT_FROM = 6046;
        public static final int INVALID_MEMO_AWB_AIRPORT_TO= 6047;
        public static final int INVALID_MEMO_CURRENCY_INDICATOR = 6048;
        public static final int INVALID_MEMO_AWB_PRORATE_PERCENTAGE = 6049;
        public static final int INVALID_MEMO_AWB_AIRLINE_USE = 6050;
        public static final int INVALID_MEMO_AWB_BILLED_WEIGHT = 6051;
        public static final int INVALID_MEMO_PRORATE_CURRENCY = 6052;
        public static final int INVALID_MEMO_PRORATE_TOTAL_AMOUNT =6053;
        public static final int INVALID_MEMO_PRORATE_CARRIER =6054;
        public static final int INVALID_MEMO_PRORATE_ORIGIN =6055;
        public static final int INVALID_MEMO_PRORATE_DESTINATION =6056;
        public static final int INVALID_MEMO_PRORATE_FACTOR =6057;
        public static final int INVALID_MEMO_PRORATE_SHARE =6058;
        public static final int INVALID_MEMO_PRORATE_AMOUNT =6059;
        public static final int INVALID_MEMO_VAT_LABEL = 6060;
        public static final int INVALID_MEMO_VAT_ID = 6061;
        public static final int INVALID_MEMO_VAT_CODE = 6062;
        public static final int INVALID_MEMO_VAT_TEXT = 6063;
        public static final int INVALID_MEMO_VAT_TAXAMOUNT =6064;
        public static final int INVALID_MEMO_VAT_PERCENTAGE =6065;
        public static final int INVALID_MEMO_OC_CODE = 6066;
        public static final int INVALID_MEMO_OC_AMOUNT = 6067;
        public static final int INVALID_MEMO_AWB_REF_ONE = 6068;
        public static final int INVALID_MEMO_AWB_REF_TWO = 6069;
        public static final int INVALID_MEMO_AWB_REF_THREE = 6070;
        public static final int INVALID_MEMO_AWB_REF_FOUR= 6071;
        public static final int INVALID_MEMO_AWB_REF_FIVE= 6072;
        public static final int NOTEXIST_FROM_AIRPORT= 6073;
        public static final int NOTEXIST_TO_AIRPORT = 6074;
        public static final int NOTEXIST_AWB_ORIGIN = 6075;
        public static final int NOTEXIST_AWB_DESTINATION = 6076;
        public static final int NOTEXIST_SECTOR_ORIGIN = 6077;
        public static final int NOTEXIST_SECTOR_DESTINATION = 6078;
        public static final int NOTEXIST_SECTOR_CARRIER = 6079;
        public static final int NOTEXIST_BILLED_CARRIER = 6080;
        public static final int NOTEXIST_REASON_CODE = 6081;
        public static final int NOTEXIST_AWB_NUMBER = 6082;
		public static final int FILE_NOT_FOUND_IN_FTP = 6083;
        public static final int FTP_CONNECTION_ISSUE = 6084;
        public static final int SIS_ZERO_ATTACHMENT = 6085;
        public static final int MANDATORY_MEMO_CURRENCY_INDICATOR = 6086;
        public static final int INVALID_MEMO_PRORATE_FACTOR_ZERO = 6087;
        public static final int BM_SHOULD_NOT_BE_NEGATIVE = 6088;
        public static final int CM_SHOULD_NOT_BE_POSITIVE = 6089;
        public static final int NOTEXIST_BMCM_NUMBER = 6090;
        public static final int FILE_REPROCESS_SUCCESS = 6091;
        public static final int FILE_REPROCESS_FAIL = 6092;
        public static final int FILE_ATTCH_SUCCESS = 6093;
        public static final int CASS_FILE_GENERATED = 6095;
        
        /*
         * TDS Participant Agreement Related
         */
       public static final int EXPIRATION_DATE_CANNOT_EXCEED_FINANCIAL_YEAR = 6096;
       public static final int GENERAL_TDS_CREATED = 6097;
       public static final int EXEMPTED_TDS_CREATED = 6098;
	   public static final int TDS_AGREEMENT_UPDATED = 6099;
	   public static final int EXPIRATION_DATE_MANDATORY = 6100;
	   public static final int INVALID_EXEMPTION_LIMIT = 6101;
	   public static final int EXEMPTION_LIMIT_MANDATORY = 6102;
	   public static final int INVALID_TDS_PERCENTAGE = 6103;
	   public static final int INVALID_TDS_REMARKS = 6104;
	   public static final int AGREEMENT_DOES_NOT_EXIST = 6105;
	   public static final int EXEMPTED_AGREEMENT_UPDATED = 6106;
	   public static final int TDS_AGREEMENTS_NOT_FOUND = 6107;
	   public static final int TDS_AGREEMENTS_NOT_FOUND_FOR_ACCOUNT = 6108;
	   public static final int TDS_AGREEMENTS_NOT_FOUND_FOR_ACCNAME = 6109;
	   public static final int TDS_AGREEMENTS_NOT_FOUND_FOR_STATION = 6110;
	   public static final int TDS_AGREEMENTS_NOT_FOUND_FOR_STATE = 6111;	   
	   public static final int TDS_AGREEMENTS_NOT_FOUND_FOR_COUNTRY = 6112;
	   public static final int TDS_AGREEMENTS_NOT_FOUND_FOR_EFFECTIVE_DATE = 6113;	  
	   public static final int TDS_AGREEMENTS_NOT_FOUND_FOR_EXP_DATE = 6114;	   
	   public static final int TDS_AGREEMENTS_NOT_FOUND_FILTER = 6115;
	   public static final int ENTER_ATLEAST_ONE_FILTER = 6116;
	   public static final int TDS_AGREEMENT_RETREIVED_SUCCESSFULLY = 6117;
	   public static final int TDS_AGREEMENT_DELETED_SUCCESSFULLY = 6118;
	   public static final int EXEMPTED_AGREEMENT_DELETED_SUCCESSFULLY = 6119;
	   public static final int INVALID_AGREEMENT_STATE_CODE = 6120;
	   public static final int INVALID_AGREEMENT_COUNTRY_CODE = 6121;
	   public static final int INVALID_AGREEMENT_PART_NAME =6122;

	   //AI026 LMSC-20437
    public static final int INVALID_PARTICIPANT_CREDIT_INFO_AMOUNT = 6126;
    public static final int INVALID_PARTICIPANT_CREDIT_INFO_REMARK = 6127;
    public static final int PARTICIPANT_SECURITY_DEPOSIT_UPDATED_SUCCESSFULLY = 6128;
    public static final int PARTICIPANT_CREDIT_INFO_ACCOUNT_NUMBER_INVALID = 6129;
    public static final int PARTICIPANT_NOT_EXIST = 6130;
    public static final int PARTICIPANT_HARD_CREDIT_LIMIT_NOT_SET = 6131;
    public static final int PARTICIPANT_CREDIT_INFO_ACCOUNT_NAME_INVALID = 6132;
    public static final int PARTICIPANT_NAME_MANDATORY_FOR_STATION_INPUT = 6133;
    public static final int PARTICIPANT_CREDIT_INFO_STATION_INVALID = 6134;
    public static final int PARTICIPANT_CREDIT_INFO_STATION_NOT_EXIST = 6135;
    public static final int PARTICIPANT_NAME_OR_ACCOUNT_NUMBER_MANDATORY = 6136;
    public static final int ADVANCE_PAYMENT_AND_SECURITY_DEPOSIT_NOT_EXIST = 6137;
	public static final int PARTICIPANT_ADVANCE_PAYMENT_UPDATED_SUCCESSFULLY = 6138;
    public static final int PARTICIPANT_AVAILABLE_CREDIT_LIMIT_CANNOT_BE_UPDATED = 6139;
    public static final int FAILED_TO_UPDATE_PARTICIPANT_ADVANCE_LIMIT = 6140;
    public static final int ADVANCE_PAYMENT_RECORD_IN_QUEUE = 6141;
    public static final int FAILED_TO_UPDATE_ADVANCE_PAYMENT_RECORD= 6142;
	  
	   
	   

}