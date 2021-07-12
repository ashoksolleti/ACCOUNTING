/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ParticipantReactivateRequest</code> is used to reactivate the participant. ie, unmark a participant
 * who was deleted by setting the deleteIndicator value to false.<br>
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>oId
 * <li>version
 * <li>participant
 * </ul>
 * </code>
 */
public class BillingGroupReactivateRequest extends ParticipantGroupRestoreRequest {
}
