/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * @author EdigaPar
 *
 */
public enum InvoiceTemplateType {
	
	CASS_EXPORT_TEMPLATE("CASS Export" ),
	COMMERCIAL_EXPORT_TEMPLATE("Commercial Export"),
	CASS_IMPORT_TEMPLATE("CASS Import"),
	COMMERCIAL_IMPORT_TEMPLATE("Commercial Import"),
	INTERLINE_TEMPLATE("Interline");
    
	
	private String stringValue;
	
	private String label;

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(final String label) {
		this.label = label;
	}
	/**
	 * @return the stringValue
	 */
	public String getStringValue() {
		return stringValue;
	}
	/**
	 * @param stringValue the stringValue to set
	 */
	public void setStringValue(final String stringValue) {
		this.stringValue = stringValue;
	}
	
	InvoiceTemplateType(final String pInvoiceTemplateType) {
        this.setStringValue(pInvoiceTemplateType);
    }

	
}

