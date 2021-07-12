package com.unisys.trans.logistics.lms.framework.constants;


public enum CashDrawerTransactionType {

	  /**
	   * Constant used to denote export transaction.
	   */
	  E("Export"),

	  /**
	   * Constant used to denote import transaction.
	   */
	  I("Import"),

	  /**
	   * Constant used to denote COD transaction.
	   */
	  COD("COD"),
	  
	  /**
	   * Constant used to denote MCO transaction.
	   */
	  MCO("Miscellaneous");

	  /**
	   * Attribute to hold the <code>transactionMode</code> property.
	   */
	  private String transactionMode;

	  /**
		 * Parameterized constructor. Accepts the string representation of the enum
		 * as the parameter
		 * 
		 * @param pTransactionMode
		 *            String representation of the enum
		 */
	  CashDrawerTransactionType(final String pTransactionMode) {
	      this.transactionMode = pTransactionMode;
	  }

	  /**
	   * Gives the string format of enumerated <code>TransactionMode</code>.
	   * <p>
	   * 
	   * @return the current string value of the <code>TransactionMode</code> .
	   */
	  public String value() {
	      return this.transactionMode;
	  }

	  /**
       * Gets the <code>CashDrawerTransactionType</code>.
       * 
       * @param pCashDrawerTransactionTypeDescription
       *            the new value of <code>CashDrawerTransactionType</code>.
       *            <p>
       * @return the current value of <code>CashDrawerTransactionType</code>.
       */
      public static CashDrawerTransactionType getCashDrawerTransactionType(
              final String pCashDrawerTransactionTypeDescription) {

          CashDrawerTransactionType aCashDrawerTransactionType = null;

          for (final CashDrawerTransactionType aType : CashDrawerTransactionType.values()) {

              if (pCashDrawerTransactionTypeDescription.equals(aType.value())) {
                  aCashDrawerTransactionType = aType;
                  break;
              }
          }

          return aCashDrawerTransactionType;
      }
}
