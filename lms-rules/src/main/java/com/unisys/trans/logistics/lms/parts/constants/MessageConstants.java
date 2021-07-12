/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.parts.constants;

import java.util.List;
import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;
/**
 * <code>MessageConstants</code> class maintains a list of message constants.<br>
 */
public final class MessageConstants {

    /* ====================================== */
    /* UC007 Maintain Participant Information */
    /* And */
    /* UC009 Retrieve Participant Information */
    /* ====================================== */

    /**
     * This constant is used to verify the country code.<br>
     * <p>
     * value = {@value}
     */
    public static final int COUNTRY_INVALID_CODENOTEXIST_OBJECT_INSTANCE = 121;

    /**
     * This constant is used to specify when the credit card identifier is
     * prohibited.
     * <p>
     * value = {@value}
     */
    public static final int CREDIT_CARD_ID_PROHIBITED = 134;

    /**
     * This constant is used to specify whether credit card identifier is
     * required.
     * <p>
     * value = {@value}
     */
    public static final int CREDIT_CARD_ID_REQUIRED = 133;

    /**
     * This constant is used to specify that the create operation is successful.
     * <p>
     * {0}- Created Exchange Rate.<br>
     * <p>
     * value = {@value}
     */
    public static final int EXCHANGERATE_CREATE_SUCCESSFUL = 119;

    /**
     * End date is only required for delete action.
     * <p>
     * Value = {@value}
     */
    public static final int INVALID_ENDDATE = 186;

    /**
     * This constant is used to verify the account is unique.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_ACCOUNT_NOTUNIQUE = 91;

    /**
     * The participant account number that is added to a participant group must
     * be present in the system.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_ACCOUNT_NUMBER_MUST_BE_EXIST = 165;

    /**
     * This constant is used to verify the teletype.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_ACTIVE_TELETYPE = 95;

    /**
     * This constant is used to verify whether the alias is present.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_ALIAS_EXIST = 90;

    /**
     * This constant is used to verify whether the participant already exists.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_ALREADY_EXIST = 94;

    /**
     * This constant is used to verify the billing account is valid.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_BILLACCOUNT_NOTVALID = 93;

    /**
     * This constant is used to verify whether the billing account number is
     * present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_BILLING_ACCOUNT_NUMBER_NOT_EXIST = 1;

    /**
     * This constant is used to verify the broker account.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_BROKERACCOUNT_INVALID = 105;

    /**
     * This constant is used to specify that the create operation is successful.
     * <p>
     * {0}- Created Participant.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_CREATE_SUCCESSFULLY = 112;

    /**
     * This constant is used to specify that the create operation is successful.
     * <p>
     * {0}- Created Participant with Bill Bill To.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_CREATE_SUCCESSFULLY_WITHBILLTO = 116;

    /**
     * This constant is used to specify that the delete operation is successful.
     * <p>
     * {0}- Deleted Participant.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_DELETED_SUCCESSFULLY = 118;

    /**
     * This constant is used to verify the delete date.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_DELETEDATE_INVALID = 108;

    /**
     * This constant is used to specify that the delete operation is successful.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_DELETEIND_MARKED = 111;

    /**
     * The participant remark entry must not be duplicate.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_DUPLICATE_REMARKS_ENTRY = 196;

    /**
     * Participant must have an account number for row {0} in order to be part
     * of the group.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_ACCOUNT_NUMBER_MANDATORY = 171;

    /**
     * Participant account type is mandatory for row {0}.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_ACCOUNT_TYPE_MANDATORY = 177;

    /**
     * Duplicate group numbers cannot be created..
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_ALREADY_EXIST = 151;
    
    /**
     * Duplicate group numbers cannot be created..
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_PARTICIPANT_DUPLICATE_REMARKS_ENTRY = 601;

    /**
     * Participant Group information that has been marked for deletion must not
     * be updated.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_CANNOT_BE_UPDATED = 156;

    /**
     * This constant is used to specify that the create operation is successful.
     * <p>
     * {0}- Created participant group.<br>
     */
    public static final int PARTICIPANT_GROUP_CREATE_SUCCESSFUL = 172;

    /**
     * This constant is used to specify that the delete operation is successful.
     * <p>
     * {0}- Deleted participant group.<br>
     */
    public static final int PARTICIPANT_GROUP_DELETE_SUCCESSFUL = 173;

    /**
     * Duplicate participant account numbers cannot be added to a group.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_DUPLICATES_NOT_ALLOWED = 152;
    
    /**
     * Duplicate participant account numbers cannot be added to a group.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_BILLINGGROUP_DUPLICATES_NOT_ALLOWED = 253;

    /**
     * The End Date must be today or later.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_GROUP_ENDDATE_SHOULD_BE_TODAY_OR_LATER = 169;

    /**
     * Participant account number does not exist in the system.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_INVALID_ACCOUNT_NUMBER = 179;

    /**
     * The participant account number must be alphanumeric with a maximum of 14
     * characters.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_INVALID_ACCOUNTNUMBER = 159;

    /**
     * End date is mandatory when a participant group number needs to be
     * deleted.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_INVALID_ENDDATE_INSTANCE = 184;

    /**
     * The participant group description must be of 32 characters.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_INVALID_GROUPDESCRIPTION = 162;

    /**
     * The Group description is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_INVALID_GROUPDESCRIPTION_INSTANCE = 166;

    /**
     * Only 1 to 14 alphanumeric characters are accepted.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_INVALID_GROUPNUMBER = 161;

    /**
     * The group number is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_INVALID_GROUPNUMBER_INSTANCE = 160;

    /**
     * Invalid participant group object instance.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_INVALID_OBJECT_INSTANCE = 163;

    /**
     * Invalid participant group object ID.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_INVALID_OID_INSTANCE = 164;

    /**
     * Participant group is already marked for deletion.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_GROUP_IS_ALREADY_MARKED_FOR_DELETION = 181;

    /**
     * Only expiration date can be updated for Active Participant with account number {0}. 
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_GROUP_ACTIVE_ONLY_EXPIRYDATE_UPDATED = 185;
    
    /**
     * An Active or Expired Participant exists with account number {0} and cannot be deleted.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_GROUP_ACTIVE_EXPIRED_CAN_NOT_DELETE = 187;
    /**
     * Participant group is marked for deletion.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_GROUP_EFFECTIVE_ONLY_FUTURE = 188;
    

    /**
     * Participant group is marked for deletion.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_GROUP_EXPIRY_LESS_THAN_EFFECTIVE = 189;
    
    /**
     * Participant group is marked for deletion.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_GROUP_EXPIRY_LESS_THAN_CURRENT = 190;    

    /**
     * Participant group is marked for deletion.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_GROUP_EFFECTIVE_DATE_MANDATORY = 211;

    /**
     * Participant group is marked for deletion.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_GROUP_IS_MARKED_FOR_DELETION = 182;

    /**
     * Participant group does not exist in the system.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_IS_NOT_FOUND = 154;

    /**
     * Only participant groups that are marked for deletion can be restored.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_MARKED_FOR_DELETION = 153;

    /**
     * Participant group number cannot be updated.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_GROUP_NUMBER_CANNOT_BE_UPDATED = 155;

    /**
     * This constant is used to specify that the restore operation is
     * successful.
     * <p>
     * {0}- Restored participant group.<br>
     */
    public static final int PARTICIPANT_GROUP_RESTORE_SUCCESSFUL = 174;

    /**
     * This constant is used to specify that the update operation is successful.
     * <p>
     * {0}- Updated participant group.<br>
     */
    public static final int PARTICIPANT_GROUP_STATUS_IS_IN_USE = 176;

    /**
     * This constant is used to specify that the update operation is successful.
     * <p>
     * {0}- Updated participant group.<br>
     */
    public static final int PARTICIPANT_GROUP_UPDATE_SUCCESSFUL = 175;

    /**
     * This constant is used to verify whether the iata account number is
     * present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_IATA_ACCOUNT_NUMBER_NOT_EXIST = 2;

    /**
     * This constant is used to verify the iata account is unique.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_IATAACCOUNT_NOTUNIQUE = 92;

    /**
     * This constant is used to verify the account.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ACCOUNT_OBJECT_INSTANCE = 25;

    /**
     * This constant is used to verify the account remarks.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ACCOUNTINGREMARKS_OBJECT_INSTANCE = 60;

    /**
     * This constant is used to verify whether valid account number is present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ACCOUNTNUMBER_OBJECT_INSTANCE = 25;

    /**
     * This constant is used to verify whether the account number value is
     * entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ACCOUNTNUMBER_REQUIRED_OBJECT_INSTANCE = 107;

    /**
     * This constant is used to verify the station.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ADDRESS_OBJECT_INSTANCE = 16;

    /**
     * This constant is used to verify whether the address value is entered.
     * <p>
     * Failed because address is empty.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ADDRESSREQUIRED_OBJECT_INSTANCE = 8;

    /**
     * This constant is used to verify the agent customs code.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_AGENTCUSTOMSCODE_OBJECT_INSTANCE = 45;

    /**
     * This constant is used to verify the alias.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ALIAS_OBJECT_INSTANCE = 78;

    /**
     * This constant is used to verify the alias name.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ALIASNAME_OBJECT_INSTANCE = 39;

    /**
     * This constant is used to verify the alias names.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ALIASNUNIQUE_OBJECT_INSTANCE = 128;

    /**
     * This constant is used to verify the available credit limit.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_AVAILABLECREDIT_OBJECT_INSTANCE = 70;

    /**
     * This constant is used to verify the available credit limit is not
     * present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_AVAILABLECREDITPROHIBITED_OBJECT_INSTANCE = 86;

    /**
     * This constant is used to verify whether the available credit limit value
     * is entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_AVAILABLEREQUIRED_OBJECT_INSTANCE = 69;

    /**
     * This constant is used to verify the awb priority.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_AWBPRIORITY_OBJECT_INSTANCE = 46;

    /**
     * This constant is used to verify the bill.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BILL_OBJECT_INSTANCE = 80;

    /**
     * This constant is used to verify the billing account type 1.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BILLINGACCTYPE1_OBJECT_INSTANCE = 64;

    /**
     * This constant is used to verify the billing account type 2.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BILLINGACCTYPE2_OBJECT_INSTANCE = 65;

    /**
     * This constant is used to verify the bill is not present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BILLPROHIBITED_OBJECT_INSTANCE = 83;

    /**
     * This constant is used to verify the bill to account.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BILLTO_OBJECT_INSTANCE = 32;

    /**
     * This constant is used to verify the bonded ID.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BONDEDID_OBJECT_INSTANCE = 42;

    /**
     * This constant is used to verify if the bonded ID is not present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BONDEDIDPROHIBITED_OBJECT_INSTANCE = 100;

    /**
     * This constant is used to verify whether the bonded ID value is entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BONDEDIDREQUIRED_OBJECT_INSTANCE = 75;

    /**
     * This constant is used to verify the bonded station.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BONDEDSTATION_OBJECT_INSTANCE = 43;

    /**
     * This constant is used to verify the bonded station is not present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BONDEDSTATIONPROHIBITED_OBJECT_INSTANCE = 101;

    /**
     * This constant is used to verify whether the bonded station value is
     * entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BONDEDSTATIONREQUIRED_OBJECT_INSTANCE = 74;

    /**
     * This constant is used to verify the broker account number.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BROKERACCOUNTNUMBER_OBJECT_INSTANCE = 40;

    /**
     * This constant is used to verify the broker station.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BROKERSTATION_OBJECT_INSTANCE = 41;

    /**
     * This constant is used to verify whether the broker station value is
     * entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BROKERSTATIONREQUIRED_OBJECT_INSTANCE = 68;

    /**
     * This constant is used to verify the broker station is unique.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_BROKERSTATIONUNIQUE_OBJECT_INSTANCE = 79;

    /**
     * This constant is used to verify the city.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CITY_OBJECT_INSTANCE = 17;

    /**
     * This constant is used to verify whether the city value is entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CITYREQUIRED_OBJECT_INSTANCE = 9;

    /**
     * This constant is used to verify the consignee remarks.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CONSIGNEEREMARKS_OBJECT_INSTANCE = 61;

    /**
     * This constant is used to verify the contract.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CONTRACT_OBJECT_INSTANCE = 81;

    /**
     * This constant is used to verify the country.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_COUNTRY_OBJECT_INSTANCE = 20;

    /**
     * This constant is used to verify the instance of country object.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_COUNTRYREQUIRED_OBJECT_INSTANCE = 127;

    /**
     * This constant is used to verify the credit limit.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CREDIT_OBJECT_INSTANCE = 71;

    /**
     * This constant is used to verify the credit card.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CREDITCARD_OBJECT_INSTANCE = 96;

    /**
     * This constant is used to verify the credit limit is not present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CREDITLIMITPROHIBITED_OBJECT_INSTANCE = 87;

    /**
     * This constant is used to verify whether the credit limit value is
     * entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CREDITLIMITREQUIRED_OBJECT_INSTANCE = 72;

    /**
     * This constant is used to verify the credit rate.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CREDITRATE_OBJECT_INSTANCE = 33;

    /**
     * This constant is used to verify the credit reference ID.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CREDITREFERENCEID_OBJECT_INSTANCE = 44;

    /**
     * This constant is used to verify the cross reference info.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CROSSREFERENCEINFOREQUIRED_OBJECT_INSTANCE = 47;

    /**
     * This constant is used to verify the currency code.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CURRENCYCODE_OBJECT_INSTANCE = 34;

    /**
     * This constant is used to verify the currency is not present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CURRENCYCODEPROHIBITED_OBJECT_INSTANCE = 88;

    /**
     * This constant is used to verify whether the currency code value is
     * entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CURRENCYCODEREQUIRED_OBJECT_INSTANCE = 73;

    /**
     * This constant is used to verify the customs code.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CUSTOMSCODE_OBJECT_INSTANCE = 48;
    /**
     * This constant is used to verify the customer segmentation.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_CUSTOMERSEGMENTATION_OBJECT_INSTANCE = 274;

    /**
     * This constant is used to verify the delete remarks.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_DELETEREMARKS_OBJECT_INSTANCE = 27;

    /**
     * This constant is used to verify whether the delete remarks value is
     * entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_DELETEREMARKSREQUIRED_OBJECT_INSTANCE = 66;

    /**
     * This constant is used to verify the district code.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_DISTRICTCODE_OBJECT_INSTANCE = 49;

    /**
     * This constant is used to verify the email.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_EMAIL_OBJECT_INSTANCE = 26;

    /**
     * This constant is used to verify the email.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_EMAILPROHIBITED_OBJECT_INSTANCE = 77;

    /**
     * This constant is used to verify the established date.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ESTABLISHEDDATE = 98;

    /**
     * This constant is used to verify the established date.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ESTABLISHEDDATE_OBJECT_INSTANCE = 50;

    /**
     * This constant is used to verify the fax.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_FAX_OBJECT_INSTANCE = 22;

    /**
     * This constant is used to verify the first security status info.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_FIRSTSECURITYSTATUSINFO_OBJECT_INSTANCE = 59;

    /**
     * This constant is used to verify whether the freight attribute is entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_FREIGHTATTRIBUTEREQUIRED_OBJECT_INSTANCE = 11;

    /**
     * This constant is used to verify the freight indicator.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_FREIGHTINDICATOR_OBJECT_INSTANCE = 28;

    /**
     * This constant is used to verify the frequent flyer number.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_FREQUENTFLYERNUMBER_OBJECT_INSTANCE = 35;

    /**
     * This constant is used to verify the hard/soft credit limit is not
     * present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_HSCREDITLIMITPROHIBITED_OBJECT_INSTANCE = 84;

    /**
     * This constant is used to verify whether valid IATA account number is
     * present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_IATAACCOUNTNUMBER = 125;

    /**
     * This constant is used to verify the iata account number.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_IATAACCOUNTNUMBER_OBJECT_INSTANCE = 76;

    /**
     * This constant is used to verify the initial shipment date.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_INITIALSHIPMENTDATE = 99;

    /**
     * This constant is used to verify the initial date.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_INITIALSHIPMENTDATE_OBJECT_INSTANCE = 51;

    /**
     * This constant is used to verify the language.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_LANGUAGE_OBJECT_INSTANCE = 24;

    /**
     * This constant is used to verify the last shipment date.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_LASTSHIPMENTDATE = 97;

    /**
     * This constant is used to verify the last shipment date.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_LASTSHIPMENTDATE_OBJECT_INSTANCE = 52;

    /**
     * This constant is used to verify the instance of manual audit object.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_MANUALAUDITREQUIRED_OBJECT_INSTANCE = 450;

    /**
     * This constant is used to verify the message profile name.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_MESSAGEPROFILENAME_OBJECT_INSTANCE = 53;

    /**
     * This constant is used to verify the notify method.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_METHOD_OBJECT_INSTANCE = 37;

    /**
     * This constant is used to verify the method is not present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_METHODPROHIBITED_OBJECT_INSTANCE = 82;

    /**
     * This constant is used to verify whether the method value is entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_METHODREQUIRED_OBJECT_INSTANCE = 67;

    /**
     * This constant is used to verify the participant name.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_NAME_OBJECT_INSTANCE = 13;

    /**
     * This constant is used to verify whether the name value is entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_NAMEEREQUIRED_OBJECT_INSTANCE = 6;

    /**
     * This constant is used to verify whether the name value is entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_NAMEREQUIRED_OBJECT_INSTANCE = 106;

    /**
     * This constant is used to verify the notify.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_NOTIFY_OBJECT_INSTANCE = 36;

    /**
     * This constant is used to verify the instance of object.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_OBJECT_INSTANCE = 5;

    /**
     * This constant is used to verify the instance of OID object.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_OID_OBJECT_INSTANCE = 85;

    /**
     * This constant is used to verify one time participant.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ONETIMEPART_CREATE = 109;

    /**
     * This constant is used to verify the participant remarks.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_PARTICIPANTREMARKS_OBJECT_INSTANCE = 62;

    /**
     * Type of Participant must be either 'I' or'B'.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_INVALID_PARTICIPANTTYPE = 183;

    /**
     * This constant is used to verify the payment method.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_PAYMENTMETHOD_OBJECT_INSTANCE = 38;

    /**
     * This constant is used to verify the phone.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_PHONE_OBJECT_INSTANCE = 21;

    /**
     * This constant is used to verify the postal code.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_POSTALCODE_OBJECT_INSTANCE = 19;

    /**
     * This constant is used to verify the region code.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_REGIONCODE_OBJECT_INSTANCE = 54;

    /**
     * This constant is used to verify the participant name.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_RETRIEVENAME_OBJECT_INSTANCE = 14;

    /**
     * This constant is used to verify the secound security status info.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_SECOUNDSECURITYSTATUSINFO_OBJECT_INSTANCE = 89;

    /**
     * This constant is used to verify the sita telex.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_SITATELEX_OBJECT_INSTANCE = 30;

    /**
     * This constant is used to verify the state.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_STATE_OBJECT_INSTANCE = 18;

    /**
     * This constant is used to verify the station.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_STATION_OBJECT_INSTANCE = 15;
    public static final int PARTICIPANT_INVALID_LOYALTY_ID_OBJECT_INSTANCE= 138;

    /* ************** uc007 uc009 ends ****************************** */

    /* ================================================================= */
    /* Start of UC017 Maintain Maintain Participant groups Information */
    /* ================================================================= */

    /**
     * This constant is used to verify whether the station value is entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_STATIONCODEREQUIRED_OBJECT_INSTANCE = 7;

    /**
     * This constant is used to verify the sub district code.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_SUBDISTRICTCODE_OBJECT_INSTANCE = 55;

    /**
     * This constant is used to verify the telex.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_TELEX_OBJECT_INSTANCE = 29;

    /**
     * This constant is used to verify the total house awb.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_TOTALHOUSEAWB_OBJECT_INSTANCE = 56;

    /**
     * This constant is used to verify the total shipments.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_TOTALSHIPMENTS_OBJECT_INSTANCE = 57;

    /**
     * This constant is used to verify the type.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_TYPE_OBJECT_INSTANCE = 23;

    /**
     * This constant is used to verify whether the type value is entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_TYPEREQUIRED_OBJECT_INSTANCE = 10;

    /**
     * This constant is used to verify the ULD participant remarks.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ULDPARTICIPANTREMARKS_OBJECT_INSTANCE = 63;

    /**
     * This constant is used to verify the ULD participant type.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ULDPARTICIPANTTYPE_OBJECT_INSTANCE = 31;

    /**
     * This constant is used to verify whether the ULD participant type is
     * entered.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_ULDPARTICIPANTTYPEREQUIRED_OBJECT_INSTANCE = 12;

    /**
     * This constant is used to verify the vat number.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_INVALID_VATNUMBER_OBJECT_INSTANCE = 58;

    /**
     * The participant is not associated with any participant group.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_IS_NOT_ASSOCIATED_IN_THE_GROUP = 168;

    /**
     * The participant account number that is added to a participant group must
     * not be marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_MUST_NOT_BE_MARKED_FOR_DELETION = 157;

    /**
     * This constant is used to verify whether the name is present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_NAME_NOT_EXIST = 3;

    /**
     * Either participant name or account number is required.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_NAME_OR_ACCOUNT_REQD = 135;

    /**
     * This constant is used to verify whether the account number is present.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_ACCOUNT_NUMBER_DOES_NOT_EXIST = 136;

    /**
     * This constant is used to verify that there is no participant exist.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_NOT_EXIST = 110;

    /**
     * This constant is used to verify the updation of one time participant.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_ONETIME_UPDATE_INVALID = 103;

    /**
     * This constant is used to specify that the update operation is successful.
     * <p>
     * {0}- Updated one-time Participant.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_ONETIME_UPDATE_SUCCESSFULLY = 115;

    /**
     * This constant is used to verify whether the primary key is present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_PRIMARYKEY_DOES_NOT_EXIST = 4;

    /**
     * This constant is used to specify that the update operation is successful.
     * <p>
     * {0}- Reactivated Participant Type.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_REACTIVATED_SUCCESSFULLY = 114;

    /**
     * The product code must be 3 alphanumeric characters.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_REMARKS_ALPHANUMERIC_PRODUCT_ENTRY = 195;

    /**
     * The participant remarks entry is created.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_REMARKS_CREATE_SUCCESSFUL = 199;

    /**
     * The participant remarks entry is deleted.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_REMARKS_DELETE_SUCCESSFUL = 201;

    /**
     * Product code {0} is duplicate.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_REMARKS_DUPLICATE_PRODUCT_KEY = 203;

    /**
     * Invalid Participant Remarks.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_REMARKS_INVALID = 202;

    /**
     * The station code must be 3 or 5 characters.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_REMARKS_INVALID_CHARACTERS_INSTANCE = 193;

    /**
     * The product code is mandatory if All product code indicator is set to No.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_REMARKS_INVALID_PRODUCT_CODE_INSTANCE = 194;

    /**
     * The Remarks text is mandatory.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_REMARKS_INVALID_REMARKS_TEXT_INSTANCE = 191;

    /**
     * The station code is mandatory if All Station indicator is set to No.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_REMARKS_INVALID_STATION_CODE_INSTANCE = 192;

    /**
     * The product must be valid or set All product code indicator to Yes for
     * selection of all product codes.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_REMARKS_PRODUCT_CODE_INDICATOR = 198;

    /**
     * The station must be valid or set All Station indicator to Yes for
     * selection of all stations.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_REMARKS_STATION_INDICATOR = 197;

    /**
     * Product code {0} is duplicate.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_REMARKS_TEXT_INVALID_SIZE = 204;
    
    /**
     * Duplicate Group for participant.
     * <p>
     * Value = {@value}
     */
    public static final int DUPLICATE_PARTICIPANT_GROUP =  137;

    /* ============================================================== */
    /* End of UC017 Maintain Maintain Participant groups Information */
    /* ============================================================== */

    /* ====================================== */
    /* UC254 Maintain Participant Remarks */
    /* ====================================== */

    /**
     * he participant remarks entry is updated.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_REMARKS_UPDATE_SUCCESSFUL = 200;

    /**
     * This constant is used to specify whether security status exists.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_SECURITY_STATUS_EXISTS_WARNING = 131;

    /**
     * This constant is used to specify whether shipper is allowed.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_SHIPPER_NOT_ALLOWED_WARNING = 130;

    /**
     * Participant account type can not be empty.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_TYPE_CODE_INVALID = 178;

    /**
     * This constant is used to verify the type.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_TYPE_INVALID = 102;

    /**
     * This constant is used to specify that the update operation is successful.
     * <p>
     * {0}- Updated Participant.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_UPDATE_SUCCESSFULLY = 113;

    /**
     * This constant is used to specify that the create operation is successful.
     * <p>
     * {0}- Updated Participant with Bill To.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_UPDATE_SUCCESSFULLY_WITHBILLTO = 117;

    /**
     * Participant group already exists.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANTGROUPSERVICE_ENTITY_ALREADY_EXIST = 180;

    /**
     * This constant is used to verify whether the unique key is present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANTSERVICE_OBJECT_DOES_NOT_EXIST = 126;

    /**
     * This constant is used to check whether the bonded station exist in the
     * database.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTS_BONDEDSTATION_INVALID_CODE = 124;

    /**
     * This constant is used to check whether the broker station exist in the
     * database.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTS_BROKERSTATION_INVALID_CODE = 123;

    /**
     * This constant is used to check whether the currency exist in the
     * database.<br>
     * <p>
     * value = {@value}
     */
    public static final int PARTS_CURRENCY_INVALID_CODE = 122;

    /**
     * This constant is used to check whether the station exist in the database.<br>
     * <p>
     * When the given station code of participant in the request does not available in the system.
     * <p>
     * value = {@value}
     */
    public static final int PARTS_STATION_INVALID_CODE = 120;

    /**
     * This constant is used to specify whether postal code exists.
     * <p>
     * value = {@value}
     */
    public static final int POSTAL_CODE_DOES_NOT_EXIST = 132;

    /**
     * This constant is used to specify whether spot rate exist for the given
     * participant.
     * <p>
     * value = {@value}
     */
    public static final int CONTRACT_SPOTRATE_NOT_EXIST_FOR_PARTICIPANT = 250;

    /**
     * This constant is used to specify whether contract exist for the
     * participant.
     * <p>
     * value = {@value}
     */
    public static final int CONTRACT_NOT_EXIST_FOR_PARTICIPANT = 251;

    /**
     * This constant is used to specify whether contract spot rate group exist
     * for the participant.
     * <p>
     * value = {@value}
     */
    public static final int CONTRACT_SPOTRATE_GROUP_EXIST_FOR_PARTICIPANT = 260;

    /**
     * This constant is used to specify whether the participant information
     * exist for the lms database key.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_NOT_EXIST_FOR_LMSDATABASEKEY = 261;

    /**
     * This constant is used to specify whether the local participant information
     * exist or not.
     * <p>
     * value = {@value}
     */
    public static final int LOCAL_PARTICIPANT_NOT_EXIST = 262;

    /**
     * This constant is used to specify whether the local participant information
     * exist or not.
     * <p>
     * value = {@value}
     */
    public static final int LOCAL_PARTICIPANT_ALREADY_EXIST = 263;

    /**
     * This constant is used to specify whether the local participant information
     * acknowledgment.
     * <p>
     * value = {@value}
     */
    public static final int LOCAL_PARTICIPANT_ACK = 264;
    /**
     * This constant is used to specify whether Expiration date is equal or greater than the effective date
     * acknowledgment.
     * <p>
     * value = {@value}
     */
    public static final int EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE = 265;

    public static final int EXPIRATION_DATE_NOT_PRECEDE_SYSDATE = 266;

    public static final int EFFECTIVE_DATE_REQUIRED = 267;

    public static final int EXPIRATION_DATE_REQUIRED = 268;

    public static final int PARTICIPANT_INVALID_FIRST_SECURITYSTATUS_IND_OBJECT_INSTANCE = 269;

    public static final int PARTICIPANT_ATTRIBUTE_DETAILS_MANDATORY = 270;
    /**
     * This constant is used to specify whether the participant freight attribute country
     * acknowledgment.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_FREIGHT_ATTRIBUTE_COUNTRY_DOES_NOT_EXIST = 271;

    public static final int PARTICIPANT_FREIGHT_ATTRIBUTE_COUNTRY_MANDATORY = 272;

    /* ============================================================== */
    /* End of UC254 Maintain Participant Remarks */
    /* ============================================================== */

    /**
     * This constant is used to verify that there is no participant exist.<br>
     * <p>
     * value = {@value}
     */
    public static final int MAINTAIN_BILLING_NOT_EXIST = 451;
    /**
     * <code>Private constructor.</code>
     */
    private MessageConstants() {

    }
    
    public static final int LOCAL_PARTICIPANT_DBKEY_IS_MANDATORY = 273;
    
    /**
     * This constant is used to verify whether the iata account number is
     * present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_CGC_ACCOUNT_NUMBER_NOT_EXIST = 275;
    /**
     * This constant is used to verify whether the iata account number is
     * present.
     * <p>
     * value = {@value}
     */
    public static final int PARTICIPANT_CPF_ACCOUNT_NUMBER_NOT_EXIST = 276;

    /* ============================================================== */
    /* End of UC254 Maintain Participant Remarks */
    /* ============================================================== */
    
    /* ================================================================================ */
    /* Start of GOL099 PArticipant History Information 2601-2700 */
    /* ================================================================================ */
    public static final int NO_HISTORY_MATCH = 2601;
    
    public static final int PARTICIPANT_DOES_NOT_EXIST = 277;


    /**
     * Billing group is marked for deletion.
     * <p>
     * value = {@value}
     */
    public static final int BILLING_GROUP_IS_MARKED_FOR_DELETION = 501;

    /**
     * Billing group does not exist in the system.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_GROUP_IS_NOT_FOUND = 502;
    /**
     * Duplicate group numbers cannot be created..
     * <p>
     * Value = {@value}
     */
    
    public static final int BILLING_GROUP_ALREADY_EXIST = 503;
    
    /**
     * This constant is used to specify that the create operation is successful.
     * <p>
     * {0}- Created billing group.<br>
     */
    public static final int BILLING_GROUP_CREATE_SUCCESSFUL = 504;
    
    /**
     * This constant is used to specify that the delete operation is successful.
     * <p>
     * {0}- Deleted billing group.<br>
     */
    public static final int BILLING_GROUP_DELETE_SUCCESSFUL = 505;
    
    /**
     * This constant is used to specify that the update operation is successful.
     * <p>
     * {0}- Updated billing group.<br>
     */
    public static final int BILLING_GROUP_UPDATE_SUCCESSFUL = 506;
    
    /**
     * This constant is used to specify that the restore operation is
     * successful.
     * <p>
     * {0}- Restored billing group.<br>
     */
    public static final int BILLING_GROUP_RESTORE_SUCCESSFUL = 507;
    
    /**
     * Only billing groups that are marked for deletion can be restored.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_GROUP_MARKED_FOR_DELETION = 508;
    
    /**
     * The participant account number that is added to a billing group must
     * not be marked for deletion.
     * <p>
     * Value = {@value}
     */
    public static final int PARTICIPANT_BILLING_MUST_NOT_BE_MARKED_FOR_DELETION = 509;
    // Commenetd due to duplicate entries public static final int PARTICIPANT_BILLING_MUST_NOT_BE_MARKED_FOR_DELETION = 157;
    
    /**
     * Billing group number cannot be updated.
     * <p>
     * Value = {@value}
     */
    public static final int BILLING_GROUP_NUMBER_CANNOT_BE_UPDATED = 510;

	public static final int CARRIER_CODE_MANDATORY = 650;

	public static final int CARRIER_CODE_DOES_NOT_EXIST = 653;

	public static final int CARRIER_CODE_MARKED_FOR_DELETION = 651;

	public static final int NO_HOST_CARRIER_AUTHORITY = 652;
	public static final int INVALID_PARTICIPANT_FOR_USER = 654;
	public static final int INVALID_LOYALTY_ID = 655;
	public static final int INVALID_PARTS_CMP_CODE = 5001;
	public static final int INVALID_PARTS_CURRENCY_CODE = 5002;
	public static final int INVALID_PARTS_COUNTRY_CODE = 5003;
	public static final int INVALID_PARTS_DELIEVERY_FROM = 5004;
	public static final int INVALID_PARTS_UPDATED_BY = 5005;
	public static final int INVALID_PARTS_DATE = 5006;
	public static final int LOYALTY_CREATED_SUCCESSFULLY = 5007;
	public static final int LOYALTY_UPDATED_SUCCESSFULLY = 5008;
	public static final int LOYALTY_DELETED_SUCCESSFULLY = 5009;
	public static final int INVALID_PARTS_MEMBER_NAME = 5010;
	public static final int INVALID_PARTS_VAT_NUMBER = 5011;
	
	// MH021
	public static final int APS_DAILY_LIMIT_CURRENCY_MANDATORY = 5112;
    public static final int INVALID_APS_DAILY_CURRENCY_CODE = 5113;
    public static final int INVALID_APS_DAILY_LIMIT_AMT = 5114;
    public static final int LMS_USER_NO_CENTRAL_AUTHORITY = 5115;
    
    //NAS004
    public static final int MULTIPLE_BILLING_CARRIER_NOT_ALLOWED=5116;
    public static final int AIRLINE_CODE_MANDATORY=5117;
    public static final int INVALID_PARTICIPANT_FOR_PARTICIPANT_GROUP = 5118;
    
    // LMSC-11111 UIS158 Start
    public static final int PARTICIPANT_GOVERNMENT_ACCOUNT_NUMBER_NOT_EXIST = 1107;    
    // LMSC-11111 UIS158 End

    //UIS171
    public static final int CONTACT_OR_PHONE_OR_EMAIL_MANDATORY = 7000;
    public static final int EMAIL_AND_TELETYPE_ADDRESS_BOTH_CANNOT_BE_ENTERED = 7001;
    public static final int CONTACT_NAME_INVALID = 7002;
    public static final int PHONE_MUST_BE_18_CHARACTER = 7003;
    public static final int FAX_MUST_BE_17_CHARACTER = 7004;
    public static final int TELETYPE_ADDRESS_MUST_BE_7_CHARACTER = 7005;
    public static final int NOTIFICATION_IS_MANDATORY__WHEN_TELETYPE_ADDRESSS_IS_ENTERED = 7006;
    public static final int INVALID_TELETYPE_ADDRESS = 7007;
    public static final int TPR_MUST_BE_48_CHARACTER = 7008;
    public static final int MESSAGE_VERSION_MUST_BE_1_TO_2_DIGITS = 7009;
    public static final int EMAIL_MUST_BE_68_CHARACTER = 7010;
    public static final int CURRENCY_CODE_REQUIRED = 218;
    public static final int MIN_MAX_AMOUNT_INVALID = 215;
    public static final int PREFERENCES_DETAILS_NOT_FOUND_FOR_USR = 219;
    public static final int PARTICIPANT_REPORT_NOT_EXIST = 216;
    public static final int PARTICIPANT_CONTACT_NOT_EXIST = 7011;
    public static final int PARTICIPANT_CONTACT_ACK = 7012;
    public static final int PHONE_MUST_BE_25_CHARACTER = 7013;
    public static final int FAX_MUST_BE_25_CHARACTER = 7014;
    public static final int EMAIL_MUST_BE_500_CHARACTER = 7015;
    public static final int DUPLICATE_CONTACT = 7016;
    public static final int PARTICIPANT_LIST_IS_MORE_THAN_ONE = 7017;
    public static final int CONTACT_NAME_REQUIRED = 7018;
    public static final int EITHER_EMAIL_OR_TELETYPE_ADDRESS_REQUIRED = 7019;
    public static final int EMAIL_ADDRESS_REQUIRED = 7020;
    public static final int CANNOT_UPDATE_PARTICIPANT_CONTACT = 7021;
    public static final int ROLE_TYPE_IS_MANDATORY = 7022;
    public static final int CANNOT_DELETE_PARTICIPANT_CONTACT = 7023;
    public static final int CANNOT_CREATE_OR_UPDATE_PARTICIPANT_CONTACT = 7024;
    public static final int CANNOT_DELETE_PARTICIPANT_CONTACT_ROLE_MISMATCH = 7025;

    //UIS171
}
