package com.unisys.trans.logistics.lms.utils.dto;

import java.io.File;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class RulesAdminFindRequest extends AbstractRequest{

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -5428656453350441067L;

	private File[] listfiles;

	public File[] getListfiles() {
		return listfiles;
	}

	public void setListfiles(File[] listfiles) {
		this.listfiles = listfiles;
	}

}
