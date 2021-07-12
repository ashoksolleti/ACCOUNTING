/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
* <code>CollectionAgentType</code> holds the constants to indicate CollectionAgentType
* applied.
* <p>
* Following are the possible AuditStatus type:<br>
* <ul>
* <li>EMPLOYEE - E
* <li>CONTRACTOR - C
* <li>AGENCY - A
* </ul>
*/
public enum CollectionAgentType {

  /**
   * Constant used for Employee.
   */
    EMPLOYEE("Employee"),

  /**
   * Constant used for Contractor.
   */
    CONTRACTOR("Contractor"),

  /**
   * Constant used for Agency.
   */
    AGENCY("Agency");

  
   /**
    * Attribute to hold the <code>CollectionAgentType</code> property.
    */
   private String type;
   

   /**
    * Constructor with <code>CollectionAgentType</code> as an argument.
    * <p>
    * 
    * @param pType
    *            the new value of the <code>type</code>.<br>
 * @return 
    */

   private  CollectionAgentType(final String pType) {
       this.type = pType;
   }
   
   /**
    * Gets the <code>CollectionAgentType</code> based on the given string.
    * 
    * @param pValue
    *            the string representation of <code>CollectionAgentType</code>
    * @return
    *         A enum of type <code>CollectionAgentType</code>
    */

   public static CollectionAgentType fromValue(final String pValue) {
       return valueOf(pValue);
   }
   
   /**
    * This method <code>getCollectionAgentType</code> returns the ContractStatusType.
    * 
    * @param pgetCollectionAgentType <code>String</code><br>
    *            The value of due code.<br>
    *            <p>
    * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.constants.CollectionAgentType
    *         pCollectionAgentType}</code><br>
    *         Returns the type of Contract <br>
    *         </p>
    */
   public static CollectionAgentType getCollectionAgentType(final String pCollectionAgentType) {

       CollectionAgentType aCollectionAgentType = null;

       for (final CollectionAgentType aType : CollectionAgentType.values()) {
           if (pCollectionAgentType.equals(aType.value())) {
               aCollectionAgentType = aType;
               break;
           }
       }
       return aCollectionAgentType;
   }
   
   
   /**
    * Gets the <code>type</code> property.
    * <p>
    * Holds the CollectionAgentType code applicable for a contract .
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
    * Holds the CollectionAgentType code applicable for a contract .
    * <p>
    * 
    * @param pType
    *            the new value of the <code>type</code> property.<br>
    */
   public void setType(final String pType) {
       this.type = pType;
   }

   /**
    * The <code>value</code> method gives the string format of CollectionAgentType.
    * <p>
    * 
    * @return <code>String</code><br>
    *         Returns the enumerated value of the CollectionAgentType.<br>
    */
   public String value() {
       return this.type;
   }

}

