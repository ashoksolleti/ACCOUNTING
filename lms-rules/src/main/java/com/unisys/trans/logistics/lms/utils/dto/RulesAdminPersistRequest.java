/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>SpecialHandlingCodePersistRequest</code> is used to create and update
 * special handling code.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>specialHandlingCodeDto
 * <li>sortCode
 * <li>searchCode</code>
 * </ul>
 */
public class RulesAdminPersistRequest extends AbstractRequest {
	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 6978663082811296389L;

	private List<RulesAdminDto> rulesAdminDtos ;

	/**
	 * <code>Default Constructor.</code>
	 */
	public RulesAdminPersistRequest() {

	}

	public List<RulesAdminDto> getRulesAdminDtos() {
		if (rulesAdminDtos == null) {
			rulesAdminDtos = new ArrayList<RulesAdminDto>();
		}
		return rulesAdminDtos;
	}

	public void setRulesAdminDtos(final List<RulesAdminDto> PRulesAdminDtos) {
		this.rulesAdminDtos = PRulesAdminDtos;
	}

}
