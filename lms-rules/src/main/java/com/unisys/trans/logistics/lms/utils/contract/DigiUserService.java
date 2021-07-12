/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.DigiUserRequest;
import com.unisys.trans.logistics.lms.utils.dto.DigiUserResponse;

/**
 * <code>DigiUserService</code> handles the confirmation of Digi Mobile Users
 * <p>
 * Digi Mobile User is created for a Mobile App. <br>
 * Admin will be provide an UI to Confirm and Reject Users.
 */
public interface DigiUserService {

    /**
     * Creates the Digi Mobile User.
     * 
     */
    DigiUserResponse createUser(DigiUserRequest pDigiUserRequest) throws LMSException;

    /**
     * Confirms the Digi Mobile User.
     * 
     */
    DigiUserResponse confirmUser(DigiUserRequest pDigiUserRequest) throws LMSException;

    /**
     * Finds all the Digi Mobile Users.
     * 
     */
    DigiUserResponse findUsers(DigiUserRequest pDigiUserRequest) throws LMSException;

    /**
     * Delete the Digi Mobile User.
     * 
     */
    DigiUserResponse deleteUser(DigiUserRequest pDigiUserRequest) throws LMSException;
}
