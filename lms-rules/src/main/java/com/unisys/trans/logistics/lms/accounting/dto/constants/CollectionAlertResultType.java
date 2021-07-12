/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
* <code>CollectionAlertResultType</code> holds the constants to indicate CollectionAlertResultType
* applied.
*/
public enum CollectionAlertResultType {

  /**
   * Constant used for PAYMENTOUTSTANDING.
   */
    PAYMENT_OUTSTANDING ("Pending Payments alert"),

  /**
   * Constant used for CREDIT_LIMIT_EXCEEDED.
   */
    CREDIT_LIMIT_EXCEEDED("No Available Credit Limit alert"),

  /**
   * Constant used for CreditLimitThreshold.
   */
    CREDIT_LIMIT_REACHED_THRESHOLD("Credit Limit Warning alert");

  
   /**
    * Attribute to hold the <code>CollectionAlertResult</code> property.
    */
   private String type;
   

   /**
    * Constructor with <code>Collection</code> as an argument.
    * <p>
    * 
    * @param pType
    *            the new value of the <code>type</code>.<br>
 * @return 
    */

   private  CollectionAlertResultType(final String pType) {
       this.type = pType;
   }
   
   /**
    * Gets the <code>CollectionAlertResult</code> based on the given string.
    * 
    * @param pValue
    *            the string representation of <code>CollectionAlertResult</code>
    * @return
    *         A enum of type <code>CollectionAlertResult</code>
    */

   public static CollectionAlertResultType fromValue(final String pValue) {
       return valueOf(pValue);
   }
   
   /**
    * This method <code>getCollectionAlertResult</code> returns the ContractStatusType.
    * 
    * @param pgetCollectionAlertResult <code>String</code><br>
    *            The value of due code.<br>
    *            <p>
    * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.CollectionAlertResult
    *         pCollectionAlertResult}</code><br>
    *         Returns the type of Contract <br>
    *         </p>
    */
   public static CollectionAlertResultType getCollectionAlertResult(final String pCollectionAlertResult) {

       CollectionAlertResultType aCollectionAlertResult = null;

       for (final CollectionAlertResultType aType : CollectionAlertResultType.values()) {
           if (pCollectionAlertResult.equals(aType.value())) {
               aCollectionAlertResult = aType;
               break;
           }
       }
       return aCollectionAlertResult;
   }
   
   
   /**
    * Gets the <code>type</code> property.
    * <p>
    * Holds the CollectionAlertResult code applicable for a contract .
    * <p>
    * 
    * @return the current value of the <code>type</code> property.<br>
    */
   public String getType() {
       return this.type;
   }

   /**
    * Sets the <code>type</code> property.
    * <p>
    * Holds the CollectionAlertResult code applicable for a contract .
    * <p>
    * 
    * @param pType
    *            the new value of the <code>type</code> property.<br>
    */
   public void setType(final String pType) {
       this.type = pType;
   }

   /**
    * The <code>value</code> method gives the string format of CollectionAlertResult.
    * <p>
    * 
    * @return <code>String</code><br>
    *         Returns the enumerated value of the CollectionAlertResult.<br>
    */
   public String value() {
       return this.type;
   }

}

