/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.preferences;

import java.io.Serializable;

/**
 * @author RamannaV
 *
 */
public class SimplifiedRestrictionCodeDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3146514091367021666L;
	
	private long oid;

	

	/**
	 * Attribute to hold <code>aircraftRegisterNumber</code> property.
	 * <p>
	 * Aircraft Registration Number that the restriction affects. If the
	 * restriction is not for a specific Aircraft Registration number, this
	 * field is blank.
	 */
	private String restrictionCode;

	/**
	 * Attribute to hold <code>aircraftRegisterNumber</code> property.
	 * <p>
	 * Aircraft Registration Number that the restriction affects. If the
	 * restriction is not for a specific Aircraft Registration number, this
	 * field is blank.
	 */
	private String tenant;

	/**
	 * Attribute to hold <code>aircraftRegisterNumber</code> property.
	 * <p>
	 * Aircraft Registration Number that the restriction affects. If the
	 * restriction is not for a specific Aircraft Registration number, this
	 * field is blank.
	 */
	private String typecode;
	
	private boolean except;

	/**
	 * @return the restrictionCode
	 */
	public String getRestrictionCode() {
		return restrictionCode;
	}

	/**
	 * @param restrictionCode
	 *            the restrictionCode to set
	 */
	public void setRestrictionCode(String restrictionCode) {
		this.restrictionCode = restrictionCode;
	}

	/**
	 * @return the tenant
	 */
	public String getTenant() {
		return tenant;
	}

	/**
	 * @param tenant
	 *            the tenant to set
	 */
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	/**
	 * @return the typecode
	 */
	public String getTypecode() {
		return typecode;
	}

	/**
	 * @param typecode
	 *            the typecode to set
	 */
	public void setTypecode(String typecode) {
		this.typecode = typecode;
	}


	public boolean isExcept() {
		return except;
	}

	public void setExcept(boolean except) {
		this.except = except;
	}
	
	public long getOid() {
		return oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

}
