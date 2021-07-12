/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>ContactDto</code> class holds all the address information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>address
 * <li>city
 * <li>country
 * <li>email
 * <li>fax
 * <li>phone
 * <li>postalCode
 * <li>state
 * </code>
 * </ul>
 */
public class ContactDto implements Serializable {

    /**
     * Attribute to hold <code>EMPTY_STRING</code> property.
     */
    private static final String EMPTY_STRING = "";

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 768739721266856047L;

    /**
     * Attribute to hold <code>address</code> property.
     */
    private String address;

    /**
     * Attribute to hold <code>city</code> property.
     */
    private String city;

    /**
     * Attribute to hold <code>country</code> property.
     */
    private String country;

    /**
     * Attribute to hold <code>email</code> property.
     */
    private String email;

    /**
     * Attribute to hold <code>fax</code> property.
     */
    private String fax;

    /**
     * Attribute to hold <code>name</code> property.
     */
    private String name;

    /**
     * Attribute to hold <code>phone</code> property.
     */
    private String phone;

    /**
     * Attribute to hold <code>postalCode</code> property.
     */
    private String postalCode;

    /**
     * Attribute to hold <code>state</code> property.
     */
    private String state;

    /**
     * <code>Default constructor</code>.
     */
    public ContactDto() {
    }

    /**
     * Gets the <code>address</code> attribute.
     * <p>
     * Specifies the street address.
     * <p>
     * <b>Format:</b><br>
     * 36 Alphanumeric.
     * <p>
     * <b>Example:</b><br>
     * 3199 PILOT KNOB ROAD.
     * <p>
     * 
     * @return the current value of the <code>address</code> property.
     */
    public String getAddress() {

        return this.address;

    }

    /**
     * Gets the <code>city</code> property.
     * <p>
     * Specifies the name of the city.
     * <p>
     * <b>Format:</b><br>
     * 1-17 character of type alphabet.
     * <p>
     * <b>Example:</b><br>
     * Minneapolis.
     * <p>
     * 
     * @return the current value of the <code></code> property.
     */
    public String getCity() {

        return this.city;

    }

    /**
     * Gets the <code>country</code> property.
     * <p>
     * Specifies the name of the country.
     * <p>
     * <b>Format:</b><br>
     * 2 character of type alphabet.
     * <p>
     * <b>Example:</b><br>
     * US.
     * <p>
     * 
     * @return the current value of the <code>country</code> property.
     */
    public String getCountry() {

        return this.country;

    }

    /**
     * Gets the <code>email</code> property.
     * <p>
     * Specifies the contact email address.
     * <p>
     * <b>Format:</b><br>
     * 1-68 Alphanumeric.
     * <p>
     * <b>Example:</b><br>
     * Office@unisys.com
     * <p>
     * 
     * @return the current value of the <code>email</code> property.
     */
    public String getEmail() {

        return this.email;

    }

    /**
     * Gets the <code>fax</code> property.
     * <p>
     * Specifies the facsimile telephone number.
     * <p>
     * <b>Format:</b><br>
     * 1-18 Alphanumeric.
     * <p>
     * <b>Example:</b><br>
     * 612-687-2272
     * <p>
     * 
     * @return the current value of the <code>fax</code> property.
     */
    public String getFax() {

        return this.fax;
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * <p>
     * 
     * @return the current value of the <code>name</code> property.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the <code>phone</code> property.
     * <p>
     * Indicates the telephone number.
     * <p>
     * <b>Format:</b><br>
     * 1-18 Alphanumeric.
     * <p>
     * <b>Example:</b><br>
     * 612-687-2272
     * <p>
     * 
     * @return the current value of the <code>phone</code> property.
     */
    public String getPhone() {

        return this.phone;

    }

    /**
     * Gets the <code>postalCode</code> property.
     * <p>
     * Specifies the postal code of the location.
     * <p>
     * <b>Format:</b><br>
     * 9 Alphanumeric.
     * <p>
     * <b>Example:</b><br>
     * 55121
     * <p>
     * 
     * @return the current value of the <code>postalCode</code> property.
     */
    public String getPostalCode() {

        return this.postalCode;

    }

    /**
     * Gets the <code>state</code> property.
     * <p>
     * Specifies the name of the state.
     * <p>
     * <b>Format:</b><br>
     * 5 character of type alphabet.
     * <p>
     * <b>Example:</b><br>
     * MN
     * <p>
     * 
     * @return the current value of the <code>state</code> property.
     */
    public String getState() {

        return this.state;

    }

    /**
     * Sets the <code>address</code> property.
     * <p>
     * Specifies the street address.
     * <p>
     * <b>Format:</b><br>
     * 36 Alphanumeric.
     * <p>
     * <b>Example:</b><br>
     * 3199 PILOT KNOB ROAD.
     * <p>
     * 
     * @param pAddress the new value of <code>address</code> property.
     */
    public void setAddress(final String pAddress) {
        this.address = pAddress;
    }

    /**
     * Sets the <code>city</code> property.
     * <p>
     * Specifies the name of the city.
     * <p>
     * <b>Format:</b><br>
     * 1-17 character of type alphabet.
     * <p>
     * <b>Example:</b><br>
     * Minneapolis.
     * <p>
     * 
     * @param pCity the new value of <code>city</code> property.
     */
    public void setCity(final String pCity) {
        this.city = ContractUtility.convertToUpperCase(pCity);
    }

    /**
     * Sets the <code>country</code> property.
     * <p>
     * Specifies the name of the country.
     * <p>
     * <b>Format:</b><br>
     * 2 character of type alphabet.
     * <p>
     * <b>Example:</b><br>
     * US.
     * <p>
     * 
     * @param pCountry the new value of <code>country</code> property.
     */
    public void setCountry(final String pCountry) {
        this.country = ContractUtility.convertToUpperCase(pCountry);
    }

    /**
     * Sets the <code>email</code> property.
     * <p>
     * Specifies the contact email address.
     * <p>
     * <b>Format:</b><br>
     * 1-68 Alphanumeric.
     * <p>
     * <b>Example:</b><br>
     * Office@unisys.com
     * <p>
     * 
     * @param pEmail the new value of <code>email</code> property.
     */
    public void setEmail(final String pEmail) {
        this.email = pEmail;
    }

    /**
     * Sets the <code>fax</code> property.
     * <p>
     * Specifies the facsimile telephone number.
     * <p>
     * <b>Format:</b><br>
     * 1-18 Alphanumeric.
     * <p>
     * <b>Example:</b><br>
     * 612-687-2272
     * <p>
     * 
     * @param pFax the new value of <code>fax</code> property.
     */
    public void setFax(final String pFax) {
        this.fax =ContractUtility.convertToUpperCase(pFax);
    }

    /**
     * Sets the <code>Name</code> property.
     * <p>
     * 
     * @param pName the new value of <code>Name</code> property.
     */
    public void setName(final String pName) {
        this.name =ContractUtility.convertToUpperCase(pName);
    }

    /**
     * Sets the <code>phone</code> property.
     * <p>
     * Indicates the telephone number.
     * <p>
     * <b>Format:</b><br>
     * 1-18 Alphanumeric.
     * <p>
     * <b>Example:</b><br>
     * 612-687-2272
     * <p>
     * 
     * @param pPhone the new value of <code>phone</code> property.
     */
    public void setPhone(final String pPhone) {
        this.phone = ContractUtility.convertToUpperCase(pPhone);
    }

    /**
     * Sets the <code>postalCode</code> property.
     * <p>
     * Specifies the postal code of the location.
     * <p>
     * <b>Format:</b><br>
     * 9 Alphanumeric.
     * <p>
     * <b>Example:</b><br>
     * 55121
     * <p>
     * 
     * @param pPostalCode the new value of <code>postalCode</code> property.
     */
    public void setPostalCode(final String pPostalCode) {
        this.postalCode =ContractUtility.convertToUpperCase(pPostalCode);
    }

    /**
     * Sets the <code>state</code> property.
     * <p>
     * Specifies the name of the state.
     * <p>
     * <b>Format:</b><br>
     * 5 character of type alphabet.
     * <p>
     * <b>Example:</b><br>
     * MN
     * <p>
     * 
     * @param pState the new value of <code>state</code> property.
     */
    public void setState(final String pState) {
        this.state =ContractUtility.convertToUpperCase(pState);
    }

    /**
     * Creates the String representation of <code>ContractListEntryDto</code>.
     * <p>
     * This will return the String representation based on Contract List.
     * <p>
     * 
     * @return the String representation of <code>ContractListEntryDto</code>.
     */
    public String toString() {
        // SuppressOn:MagicNumber
        final StringBuffer csvString = new StringBuffer();
        // SuppressOff:MagicNumber

        if (this.getName() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getName()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getAddress() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getAddress()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }
        if (this.getCity() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getCity()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getState() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getState()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getCountry() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getCountry()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
        }

        if (this.getPostalCode() != null) {
            csvString.append(this.prefixSuffixByQuotes(this.getPostalCode()));
        }
        else {

            csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));

        }

        return csvString.toString();
    }

    /**
     * prefixes and suffixes a given string with open quotes.
     * 
     * @param pString the new value of the <code>value</code>.
     * 
     * @return aModifiedString the new value of the <code>aModifiedString</code>.
     * 
     * 
     */
    private String prefixSuffixByQuotes(final String pString) {
        final String aQUOTATION = "\"";
        final String aCOMMA = ",";

        final StringBuffer aModifiedString = new StringBuffer();
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(pString);
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(aCOMMA);

        return aModifiedString.toString();
    }
    

    /**
     * Attribute to hold <code>contactType</code> property.
     */
    private String contactType;

    /**
     * @return the contactType
     */
    public String getContactType() {
        return this.contactType;
    }

    /**
     * @param pContactType the contactType to set
     */
    public void setContactType(final String pContactType) {
        this.contactType = pContactType;
    }


    /**
     * Attribute to holds <code>aeoNumber</code> property.
     */
    private String aeoNumber;    


    /**
     * @return the aeoNumber
     */
    public String getAeoNumber() {
        return aeoNumber;
    }
    
    /**
     * @param pAeoNumber the aeoNumber to set
     */
    public void setAeoNumber(final String pAeoNumber) {
        this.aeoNumber = pAeoNumber;
    }

    /**
     * Attribute to holds <code>contactPersonName</code> property.
     */
    private String contactPersonName;

    /**
     * Attribute to holds <code>contactPersonPhone</code> property.
     */
    private String contactPersonPhone;

    /**
     * Attribute to holds <code>identificationCode</code> property.
     */
    private String identificationCode;

    /**
     * @return the contactPersonName
     */
    public String getContactPersonName() {
        return contactPersonName;
    }

    /**
     * @return the contactPersonPhone
     */
    public String getContactPersonPhone() {
        return contactPersonPhone;
    }

    /**
     * @param pContactPersonName the contactPersonName to set
     */
    public void setContactPersonName(final String pContactPersonName) {
        this.contactPersonName = pContactPersonName;
    }

    /**
     * @param pContactPersonPhone the contactPersonPhone to set
     */
    public void setContactPersonPhone(final String pContactPersonPhone) {
        this.contactPersonPhone = pContactPersonPhone;
    }

    /**
     * @return the identificationCode
     */
    public String getIdentificationCode() {
        return identificationCode;
    }

    /**
     * @param pIdentificationCode the identificationCode to set
     */
    public void setIdentificationCode(final String pIdentificationCode) {
        this.identificationCode = pIdentificationCode;
    }
}