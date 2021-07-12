package com.unisys.trans.logistics.lms.parts.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.TapeRateEntry;

public class CreditInfoRecordDto extends TapeRateEntry{

	 /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4254993716602316212L;
    /**
     * Attribute to hold <code>cmpcode</code> property.
     */
	private String cmpcode;
	 /**
     * Attribute to hold <code>creditsamount</code> property.
     */
     private BigDecimal creditsamount;
	 /**
	     * Attribute to hold <code>currencycode</code> property.
	     */
	 private String currencycode;
	 /**
	     * Attribute to hold <code>nbrofsegments</code> property.
	     */
	 private Integer nbrofsegments;
	 /**
	     * Attribute to hold <code>partner</code> property.
	     */
	 private String partner;
	 /**
	     * Attribute to hold <code>country</code> property.
	     */
	 private String country;
	 /**
	     * Attribute to hold <code>delieveryfrom</code> property.
	     */
	 private String delieveryfrom;
	 /**
	     * Attribute to hold <code>delieverydate</code> property.
	     */
	 private Date  delieverydate;
	 /**
	     * Attribute to hold <code>updatedby</code> property.
	     */
	 private String updatedby;
	 /**
	     * Attribute to hold <code>updateddate</code> property.
	     */
	 private Date  updateddate;
	 /**
	     * Attribute to hold <code>oId</code> property.
	     */
	  private Long oId;
	  /**
	     * Attribute to hold <code>operation</code> property.
	     */
	  private String operation;
	  /**
	     * Attribute to hold <code>incrementer</code> property.
	     */
	  private int incrementer = 0;
	  /**
	     * Attribute to hold <code>membername</code> property.
	     */
	  private String membername;
	  /**
	     * Attribute to hold <code>vatnumber</code> property.
	     */
	  private String vatnumber;
	  
	  /**
	     * Attribute to hold <code>recordtype</code> property.
	     */
	  private String recordtype;
	  
	  /**
	     * Gets the <code>recordtype</code> property.
	     * 
	     * @return the current value of <code>recordtype</code> property.<br>
	 */ 
	  public String getRecordtype() {
		return recordtype;
	}
	  
	  /**
	     * Sets the <code>recordtype</code> property.
	     * 
	     * @param pRecordtype
	     *            the current value of <code>recordtype</code> property.<br>
	     */
  
	public void setRecordtype(final String pRecordtype) {
		this.recordtype = pRecordtype;
	}
	/**
	     * Gets the <code>membername</code> property.
	     * 
	     * @return the current value of <code>membername</code> property.<br>
	 */ 
	  
	  
	 public String getMembername() {
		return membername;
	}
	 /**
	     * Sets the <code>membername</code> property.
	     * 
	     * @param pMembername
	     *            the current value of <code>membername</code> property.<br>
	     */

	public void setMembername(final String pMembername) {
		this.membername = pMembername;
	}

	  /**
     * Gets the <code>vatnumber</code> property.
     * 
     * @return the current value of <code>vatnumber</code> property.<br>
 */ 
	public String getVatnumber() {
		return vatnumber;
	}

	 /**
     * Sets the <code>vatnumber</code> property.
     * 
     * @param pVatnumber
     *            the current value of <code>vatnumber</code> property.<br>
     */
	public void setVatnumber(final String pVatnumber) {
		this.vatnumber = pVatnumber;
	}


	/**
	     * Gets the <code>operation</code> property.
	     * 
	     * @return the current value of <code>operation</code> property.<br>
	 */
	  
	 public String getOperation() {
		return operation;
	}


	 /**
	     * Sets the <code>operation</code> property.
	     * 
	     * @param pOperation
	     *            the current value of <code>operation</code> property.<br>
	     */

	public void setOperation(final String pOperation) {
		this.operation = pOperation;
	}


	 /**
     * Gets the <code>cmpcode</code> property.
     * 
     * @return the current value of <code>cmpcode</code> property.<br>
     */

	public String getCmpcode() {
		return cmpcode;
	}


	 /**
     * Sets the <code>cmpcode</code> property.
     * 
     * @param pCmpcode
     *            the current value of <code>cmpcode</code> property.<br>
     */

	public void setCmpcode(final String pCmpcode) {
		this.cmpcode = pCmpcode;
	}


	 /**
     * Gets the <code>creditsamount</code> property.
     * 
     * @return the current value of <code>creditsamount</code> property.<br>
     */

	public BigDecimal getCreditsamount() {
		return creditsamount;
	}


	 /**
     * Sets the <code>creditsamount</code> property.
     * 
     * @param pCreditsamount
     *            the current value of <code>creditsamount</code> property.<br>
     */

	public void setCreditsamount(final BigDecimal pCreditsamount) {
		this.creditsamount = pCreditsamount;
	}


	 /**
     * Gets the <code>currencycode</code> property.
     * 
     * @return the current value of <code>currencycode</code> property.<br>
     */

	public String getCurrencycode() {
		return currencycode;
	}

	 /**
     * Sets the <code>currencycode</code> property.
     * 
     * @param pCurrencycode
     *            the current value of <code>currencycode</code> property.<br>
     */


	public void setCurrencycode(final String pCurrencycode) {
		this.currencycode = pCurrencycode;
	}


	 /**
     * Gets the <code>nbrofsegments</code> property.
     * 
     * @return the current value of <code>nbrofsegments</code> property.<br>
     */

	public Integer getNbrofsegments() {
		return nbrofsegments;
	}

	 /**
     * Sets the <code>nbrofsegments</code> property.
     * 
     * @param pNbrofsegments
     *            the current value of <code>nbrofsegments</code> property.<br>
     */


	public void setNbrofsegments(final Integer pNbrofsegments) {
		this.nbrofsegments = pNbrofsegments;
	}

	 /**
     * Gets the <code>partner</code> property.
     * 
     * @return the current value of <code>partner</code> property.<br>
     */


	public String getPartner() {
		return partner;
	}


	 /**
     * Sets the <code>partner</code> property.
     * 
     * @param pPartner
     *            the current value of <code>partner</code> property.<br>
     */

	public void setPartner(final String pPartner) {
		this.partner = pPartner;
	}


	 /**
     * Gets the <code>country</code> property.
     * 
     * @return the current value of <code>country</code> property.<br>
     */

	public String getCountry() {
		return country;
	}


	 /**
     * Sets the <code>country</code> property.
     * 
     * @param pCountry
     *            the current value of <code>country</code> property.<br>
     */

	public void setCountry(final String pCountry) {
		this.country = pCountry;
	}


	 /**
     * Gets the <code>delieveryfrom</code> property.
     * 
     * @return the current value of <code>delieveryfrom</code> property.<br>
     */

	public String getDelieveryfrom() {
		return delieveryfrom;
	}


	 /**
     * Sets the <code>delieveryfrom</code> property.
     * 
     * @param pDelieveryfrom
     *            the current value of <code>delieveryfrom</code> property.<br>
     */

	public void setDelieveryfrom(final String pDelieveryfrom) {
		this.delieveryfrom = pDelieveryfrom;
	}


	 /**
     * Gets the <code>delieverydate</code> property.
     * 
     * @return the current value of <code>delieverydate</code> property.<br>
     */

	public Date getDelieverydate() {
		return delieverydate;
	}

	 /**
     * Sets the <code>delieverydate</code> property.
     * 
     * @param pDelieverydate
     *            the current value of <code>delieverydate</code> property.<br>
     */


	public void setDelieverydate(final Date pDelieverydate) {
		this.delieverydate = pDelieverydate;
	}

	 /**
     * Gets the <code>updatedby</code> property.
     * 
     * @return the current value of <code>updatedby</code> property.<br>
     */


	public String getUpdatedby() {
		return updatedby;
	}


	 /**
     * Sets the <code>updatedby</code> property.
     * 
     * @param pUpdatedby
     *            the current value of <code>updatedby</code> property.<br>
     */

	public void setUpdatedby(final String pUpdatedby) {
		this.updatedby = pUpdatedby;
	}


	 /**
     * Gets the <code>updateddate</code> property.
     * 
     * @return the current value of <code>updateddate</code> property.<br>
     */

	public Date getUpdateddate() {
		return updateddate;
	}


	 /**
     * Sets the <code>updateddate</code> property.
     * 
     * @param pUpdateddate
     *            the current value of <code>updateddate</code> property.<br>
     */

	public void setUpdateddate(final Date pUpdateddate) {
		this.updateddate = pUpdateddate;
	}



	 /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
	public Long getoId() {
		return oId;
	}


	 /**
     * Sets the <code>oId</code> property.
     * 
     * @param pOId
     *            the current value of <code>oId</code> property.<br>
     */

	public void setoId(final Long pOId) {
		this.oId = pOId;
	}


	 /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of <code>oId</code> property.<br>
     */

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}


	 /**
     * Gets the <code>incrementer</code> property.
     * 
     * @return the current value of <code>incrementer</code> property.<br>
     */

	public int getIncrementer() {
		return incrementer;
	}


	 /**
     * Sets the <code>incrementer</code> property.
     * 
     * @param pIncrementer
     *            the current value of <code>incrementer</code> property.<br>
     */

	public void setIncrementer(final int pIncrementer) {
		this.incrementer = pIncrementer;
	}

}
