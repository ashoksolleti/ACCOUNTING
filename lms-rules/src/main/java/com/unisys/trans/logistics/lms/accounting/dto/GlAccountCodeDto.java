/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.accounting.dto;


import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.constants.GlAccountType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>GlAccountCodeDto</code> class represents the GlAccountCode information.
 * 
 */
public class GlAccountCodeDto extends PersistenceObjectDto {

	/**
	 * 
	 */
	private static final String EMPTY_STRING = "";
	
	private static final long serialVersionUID = 1L;

	private boolean create = false;

	private boolean delete = false;

	private boolean update = false;
	
	private boolean inter = false; 
	
	private ActionType actionType;

	private boolean error;
	
	private String specificAirline;
	
	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public ActionType getActionType() {
	return actionType;
}

public void setActionType(ActionType actionType) {
	this.actionType = actionType;
}
	/**
* Attribute to hold <code>oId</code> property.
*/
private Long oId;
/**
* Attribute to hold <code>accountCode</code> property.
*/
private String accountCode;
/**
* Attribute to hold <code>accountNumber</code> property.
*/
private String accountNumber;
/**
* Attribute to hold <code>accountName</code> property.
*/
private String accountName;
/**
* Attribute to hold <code>accountCodeType</code> property.
*/
private GlAccountType accountCodeType;
/**
* Attribute to hold <code>natureOfPosting</code> property.
*/
private String natureOfPosting;
/**
* Attribute to hold <code>costCenterFormat</code> property.
*/
private String costCenterFormat;


private String accountNumberAsString; 
/**
 * @return the oId
 */
public Long getoId() {
	return this.oId;
}
	
	/**
* @return the oId
 */
@Override
public Long getOId() {
	return this.oId;
}

/**
 * @param oId
 *            the oId to set
 */
public void setoId(Long oId) {
	this.oId = oId;
}
/**
* @return the accountNumber
 */
public String getAccountNumber() {
	return accountNumber;
}

/**
 * @param accountNumber
 *            the accountNumber to set
 */
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
/**
* @return the accountName
 */
public String getAccountName() {
	return accountName;
}

/**
 * @param accountName
 *            the accountName to set
 */
public void setAccountName(String accountName) {
	this.accountName = accountName;
}

/**
* @return the natureOfPosting
 */
public String getNatureOfPosting() {
	return natureOfPosting;
}

/**
 * @param natureOfPosting
 *            the natureOfPosting to set
 */
public void setNatureOfPosting(String natureOfPosting) {
	this.natureOfPosting = natureOfPosting;
}
/**
* @return the costCenterFormat
 */
public String getCostCenterFormat() {
	return costCenterFormat;
}

/**
 * @param costCenterFormat
 *            the costCenterFormat to set
 */
public void setCostCenterFormat(String costCenterFormat) {
	this.costCenterFormat = costCenterFormat;
}
   
	
	public boolean isCreate() {
		return create;
	}

	public void setCreate(boolean create) {
		this.create = create;
	}

	public boolean isDelete() {
		return delete;
	}

	public void setDelete(boolean delete) {
		this.delete = delete;
	}

	public boolean isUpdate() {
		return update;
	}

	public void setUpdate(boolean update) {
		this.update = update;
	}
	
	/**
	 * @return the inter
	 */
	public boolean isInter() {
		return inter;
	}

	/**
	 * @param inter the inter to set
	 */
	public void setInter(boolean inter) {
		this.inter = inter;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		final StringBuffer csvString = new StringBuffer();
        // SuppressOff:MagicNumber
	        if (this.actionType!=null && this.actionType.equals(ActionType.FIND)) {
	        	
	        	if (this.getAccountCodeType() != null) {
	                csvString.append(this.prefixSuffixByQuotes(this.getAccountCodeType().getStringValue()));
	            }
	            else {
	
	                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	            }
	        	if (this.getAccountCode() != null) {
	                csvString.append(this.prefixSuffixByQuotes(this.getAccountCode()));
	            }
	            else {
	
	                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	            }
	        	
	        	if (this.getAccountNumber() != null) {
	                csvString.append(this.prefixSuffixByQuotes(this.getAccountNumber()));
	            }
	            else {
	
	                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	            }
	        	if (this.getAccountName() != null) {
	                csvString.append(this.prefixSuffixByQuotes(this.getAccountName()));
	            }
	            else {
	
	                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	            }
	        	
		   } 
	        else{
	        	if (this.getAccountCode() != null) {
	                csvString.append(this.prefixSuffixByQuotes(this.getAccountCode()));
	            }
	            else {
	
	                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	            }
	        	
	        	if (this.getAccountNumber() != null) {
	                csvString.append(this.prefixSuffixByQuotes(this.getAccountNumber()));
	            }
	            else {
	
	                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	            }
	        	if (this.getAccountName() != null) {
	                csvString.append(this.prefixSuffixByQuotes(this.getAccountName()));
	            }
	            else {
	
	                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	            }
	        	if (this.getAccountCodeType() != null) {
	                csvString.append(this.prefixSuffixByQuotes(this.getAccountCodeType().getStringValue()));
	            }
	            else {
	
	                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	            }
	        	if (this.getNatureOfPosting() != null) {
	                csvString.append(this.prefixSuffixByQuotes(this.getNatureOfPosting()));
	            }
	            else {
	
	                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	            }
	        	if (this.getCostCenterFormat() != null) {
	                csvString.append(this.prefixSuffixByQuotes(this.getCostCenterFormat()));
	            }
	            else {
	
	                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
	            }     	
	        	
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
		 * @return the accountNumberAsString
		 */
		public String getAccountNumberAsString() {
			if(accountNumber!=null && accountNumber.length()== 8){
					String a,b;
					a=accountNumber.substring(0,4);
					b=accountNumber.substring(4);
					accountNumberAsString = a+" "+b;
			}
			else{
				accountNumberAsString = accountNumber;
			}
			return accountNumberAsString;
		}

		public GlAccountType getAccountCodeType() {
			return accountCodeType;
		}

		public void setAccountCodeType(GlAccountType accountCodeType) {
			this.accountCodeType = accountCodeType;
		}

		public String getAccountCode() {
			return accountCode;
		}

		public void setAccountCode(String accountCode) {
			this.accountCode = accountCode;
		}

		/**
		 * @return the specificAirline
		 */
		public String getSpecificAirline() {
			return specificAirline;
		}

		/**
		 * @param specificAirline the specificAirline to set
		 */
		public void setSpecificAirline(String specificAirline) {
			this.specificAirline = specificAirline;
		}
		
		
		
}
