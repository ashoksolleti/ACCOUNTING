package com.unisys.trans.logistics.lms.framework.dto;

import com.unisys.trans.logistics.lms.framework.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.constants.CreditCardType;

public class CreditCardDetailsDto extends PersistenceObjectDto {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 857770083493877238L;
    
    /**
	 * Attribute to hold <code>action</code> property.
	 */
	private ActionType action;

    /**
     * Attribute to hold the <code>creditCardNumber</code> property.
     */
    private String creditCardNumber;

    /**
     * Attribute to hold the <code>expirationDate</code> property.
     */
    private String expirationDate;

    /**
     * Attribute to hold the <code>cardHolderName</code> property.
     */

    private String cardHolderName;

    /**
     * Attribute to hold the <code>phone</code> property.
     */

    private String phone;

    /**
     * Attribute to hold the <code>postalCode</code> property.
     */

    private String postalCode;

    /**
     * Attribute to hold the <code>state</code> property.
     */

    private String state;

    /**
     * Attribute to hold the <code>city</code> property.
     */

    private String city;

    /**
     * Attribute to hold the <code>country</code> property.
     */

    private String country;

    /**
     * Attribute to hold the <code>billingAddress</code> property.
     */

    private String billingAddress;

    /**
     * Attribute to hold the <code>deleteFlag</code> property.
     */

    private boolean deleteFlag;

    /**
     * Attribute to hold the <code>creditCardType</code> property.
     */

    private CreditCardType creditCardType;

    /**
     * Attribute to hold the <code>oId</code> property.
     */

    private Long oId;

	/**
	 * Gets the <code>ActionType</code> property.
	 * <p>
	 * <b>Example: </b><br>
	 * CREATE,UPDATE,DELETE
	 * <p>
	 * 
	 * @return the current value of the <code>action</code> property.
	 */
	public ActionType getAction() {
		return this.action;
	}
	
	
	/**
	 * Sets the <code>ActionType</code> property.
	 * <p>
	 * <b>Example: </b><br>
	 * CREATE,UPDATE,DELETE
	 * <p>
	 * 
	 * @param pAction
	 *            the current value of the <code>action</code> property.
	 */
	public void setAction(final ActionType pAction) {
		this.action = pAction;

	}

    /**
     * Gets the <code>creditCardNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>creditCardNumber</code> property.
     */

    public String getCreditCardNumber() {
        return this.creditCardNumber;
    }

    /**
     * Sets the <code>creditCardNumber</code> property.
     * <p>
     * 
     * @param pCreditCardNumber
     *            holds the new value of <code>creditCardNumber</code>.<br>
     */

    public void setCreditCardNumber(final String pCreditCardNumber) {
        this.creditCardNumber = pCreditCardNumber;
    }

    /**
     * Gets the <code>expirationDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>expirationDate</code> property.
     */
    public String getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * Sets the <code>expirationDate</code> property.
     * <p>
     * 
     * @param pExpirationDate
     *            holds the new value of <code>expirationDate</code>.<br>
     */
    public void setExpirationDate(final String pExpirationDate) {
        this.expirationDate = pExpirationDate;
    }

    /**
     * Gets the <code>cardHolderName</code> property.
     * <p>
     * 
     * @return the current value of the <code>cardHolderName</code> property.
     */
    public String getCardHolderName() {
        return this.cardHolderName;
    }

    /**
     * Sets the <code>cardHolderName</code> property.
     * <p>
     * 
     * @param pCardHolderName
     *            holds the new value of <code>cardHolderName</code>.<br>
     */
    public void setCardHolderName(final String pCardHolderName) {
        this.cardHolderName = pCardHolderName;
    }

    /**
     * Gets the <code>phone</code> property.
     * <p>
     * 
     * @return the current value of the <code>phone</code> property.
     */

    public String getPhone() {
        return this.phone;
    }

    /**
     * Sets the <code>phone</code> property.
     * <p>
     * 
     * @param pPhone
     *            holds the new value of <code>phone</code>.<br>
     */
    public void setPhone(final String pPhone) {
        this.phone = pPhone;
    }

    /**
     * Gets the <code>postalCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>postalCode</code> property.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Sets the <code>postalCode</code> property.
     * <p>
     * 
     * @param pPostalCode
     *            holds the new value of <code>postalCode</code>.<br>
     */
    public void setPostalCode(final String pPostalCode) {
        this.postalCode = pPostalCode;
    }

    /**
     * Gets the <code>state</code> property.
     * <p>
     * 
     * @return the current value of the <code>state</code> property.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Sets the <code>state</code> property.
     * <p>
     * 
     * @param pState
     *            holds the new value of <code>state</code>.<br>
     */
    public void setState(final String pState) {
        this.state = pState;
    }

    /**
     * Gets the <code>city</code> property.
     * <p>
     * 
     * @return the current value of the <code>city</code> property.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Sets the <code>city</code> property.
     * <p>
     * 
     * @param pCity
     *            holds the new value of <code>city</code>.<br>
     */
    public void setCity(final String pCity) {
        this.city = pCity;
    }

    /**
     * Gets the <code>country</code> property.
     * <p>
     * 
     * @return the current value of the <code>country</code> property.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Sets the <code>country</code> property.
     * <p>
     * 
     * @param pCountry
     *            holds the new value of <code>country</code>.<br>
     */
    public void setCountry(final String pCountry) {
        this.country = pCountry;
    }

    /**
     * Gets the <code>billingAddress</code> property.
     * <p>
     * 
     * @return the current value of the <code>billingAddress</code> property.
     */
    public String getBillingAddress() {
        return this.billingAddress;
    }

    /**
     * Sets the <code>billingAddress</code> property.
     * <p>
     * 
     * @param pBillingAddress
     *            holds the new value of <code>billingAddress</code>.<br>
     */
    public void setBillingAddress(final String pBillingAddress) {
        this.billingAddress = pBillingAddress;
    }

    /**
     * Gets the <code>creditCardType</code> property.
     * <p>
     * 
     * @return the current value of the <code>creditCardType</code> property.
     */
    public CreditCardType getCreditCardType() {
        return this.creditCardType;
    }

    /**
     * Sets the <code>creditCardType</code> property.
     * <p>
     * 
     * @param pCreditCardType
     *            holds the new value of <code>creditCardType</code>.<br>
     */
    public void setCreditCardType(final CreditCardType pCreditCardType) {
        this.creditCardType = pCreditCardType;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOid
     *            holds the new value of <code>oId</code>.<br>
     */
    public void setOId(final Long pOid) {
        this.oId = pOid;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>deleteFlag</code> property.
     * <p>
     * 
     * @return the current value of the <code>deleteFlag</code> property.
     */
    public boolean isDeleteFlag() {
        return this.deleteFlag;
    }

    /**
     * Sets the <code>deleteFlag</code> property.
     * <p>
     * 
     * @param pDeleteFlag
     *            holds the new value of <code>deleteFlag</code>.<br>
     */
    public void setDeleteFlag(final boolean pDeleteFlag) {
        this.deleteFlag = pDeleteFlag;
    }


	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}


	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

}
