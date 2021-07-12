/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * @author EdigaPar
 *
 */
public enum InvoiceTemplate {

	CAET("CASS_EXPORT_TEMPLATE"),
	COET("COMMERCIAL_EXPORT_TEMPLATE"),
	CAIT("CASS_IMPORT_TEMPLATE"),
	COIT("COMMERCIAL IMPORT_TEMPLATE"),
	IT("INTERLINE_TEMPLATE");
    


	public String value() {
		return this.name();
	}


	private final String name;



	InvoiceTemplate(final String name) {
		this.name = name;
	}


	public String getName() {
		return this.name;
	}
}
