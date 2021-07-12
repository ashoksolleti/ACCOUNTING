/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.preferences;

import java.io.Serializable;
import java.util.List;

/**
 * @author RamannaV
 *
 */
public class SimplifiedRestrictionDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7049747680384888461L;
	
	
	private Long oid;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private String restrictionCode;
	
	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
	 */
	private String tenant;

	/**
	 * Attribute to hold <code>carrierCode</code> property.
	 * <p>
	 * Carrier code for which the restriction information is to be displayed. If
	 * not entered, it defaults to the host carrier.
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
	
	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}
}
