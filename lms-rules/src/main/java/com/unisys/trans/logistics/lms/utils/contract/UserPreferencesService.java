/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.PreferencesDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.PreferencesPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.PreferencesResponse;

/**
 * <code>UserPreferencesService</code> handles the UserPreferences
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>createUserPreference.
 * <li>deleteAndRecreateUserPreference.
 * <li>deleteUserPreference.
 * <li>findPreferencesByFunction.
 * <li>findPreferencesByUserAndFunction.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.PreferencesPersistRequest
 *      PreferencesPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.PreferencesDeleteRequest
 *      PreferencesDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest
 *      PreferencesFindRequest
 */
public interface UserPreferencesService {

    /**
     * Creates the <code>UserPreference</code>.
     * <p>
     * 
     * 
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.UserPreferenceService#findPreferencesByFunction
     * findPreferencesByFunction}<br>
     * <p>
     * To create the UserPreference user must provide following input:<br>
     * <li>functionName
     * <li>authorizationCode
     * <li>preferencesUserInfoDto
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PREFERNCES_CREATED_SUCESSFULLY 
     * PREFERNCES_CREATED_SUCESSFULLY}</code></td>
     * <td align="left">Preferences created successfully.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesPersistRequest
     *            PreferencesPersistRequest}</code><br>
     *            includes the attributes to create a <code>Preference</code>.
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFunctionDto
     *            PreferencesFunctionDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesPersistRequest#setFunctionName
     *            FunctionName} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesPersistRequest#setPreferencesUserInfoDto
     *            PreferencesUserInfoDto} - (C)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)<br> Prohibited for create operation.</code></li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.PreferencesResponse
     *         PreferencesResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PREFERNCES_CREATED_SUCESSFULLY
     *         PREFERNCES_CREATED_SUCESSFULLY} </code> <br>
     *         <code>for successful create.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesResponse#getPreferencesUserInfoDto()
     *         PreferencesUserInfoDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFunctionDto
     *         PreferencesFunctionDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    PreferencesResponse createUserPreference(
                final PreferencesPersistRequest pPersistRequest) throws LMSException;

    /**
     * Deletes And Recreates UserPreference.
     * <p>
     * This functions deletes and recreates the UserPreference.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.UserPreferencesService#findPreferencesByFunction
     * findPreferencesByFunction}<br>
     * <p>
     * To delete the UserPreference user must provide following input:<br>
     * <li>functionName.<br>
     * <li>preferencesUserInfoDto.<br>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <p>
     * 
     * @param pPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesPersistRequest
     *            PreferencesPersistRequest}</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesPersistRequest#setFunctionName
     *            FunctionName} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesPersistRequest#setPreferencesUserInfoDto
     *            PreferencesUserInfoDto} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesResponse
     *         PreferencesResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code></li><br>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesResponse#getPreferencesUserInfoDto()
     *         PreferencesUserInfoDto} - (1:*)</code></li> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFunctionColumnDto
     *         PreferencesFunctionColumnDto}</code></li>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    PreferencesResponse deleteAndRecreateUserPreference(
                PreferencesPersistRequest pPersistRequest) throws LMSException;

    /**
     * Deletes the UserPreference.
     * <p>
     * This functions deletes the UserPreference.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.UserPreferencesService#findPreferencesByFunction
     * findPreferencesByFunction}<br>
     * <p>
     * To delete the UserPreference user must provide following input:<br>
     * <li>functionName.<br>
     * <li>userIdentifier.<br>
     * <li>userType.<br>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <p>
     * 
     * @param pDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesDeleteRequest
     *            PreferencesDeleteRequest}</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesDeleteRequest#setFunctionName
     *            FunctionName} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesDeleteRequest#setUserIdentifier
     *            UserIdentifier} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesDeleteRequest#setUserType
     *            UserType} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesResponse
     *         PreferencesResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code></li><br>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesResponse#getPreferencesUserInfoDto()
     *         PreferencesUserInfoDto} - (1:*)</code></li> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFunctionColumnDto
     *         PreferencesFunctionColumnDto}</code></li>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    PreferencesResponse deleteUserPreference(
                PreferencesDeleteRequest pDeleteRequest) throws LMSException;

    /**
     * Finds the PreferencesByFunction..
     * <p>
     * This functions Finds the PreferencesByFunction.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.UserPreferencesService#findPreferencesByUserAndFunction
     * findPreferencesByUserAndFunction}<br>
     * <p>
     * To find the UserPreference user must provide following input:<br>
     * <li>findByGroup.<br>
     * <li>functionName.<br>
     * <li>groupName.<br>
     * <li>userType
     * <li>userIdentifier
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <p>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PREFERENCES_FUNCTION_NOT_FOUND 
     * PREFERENCES_FUNCTION_NOT_FOUND}</code></td>
     * <td align="left">Preferences not found.</td>
     * </tr>
     * </table>
     * 
     * @param pRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest
     *            PreferencesFindRequest}</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest#setFindByGroup
     *            FindByGroup} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest#setFunctionName
     *            FunctionName} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest#setGroupName
     *            GroupName} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest#setUserIdentifier
     *            UserIdentifier} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest#setUserType
     *            UserType} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesResponse
     *         PreferencesResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code></li><br>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesResponse#getPreferencesUserInfoDto()
     *         PreferencesUserInfoDto} - (1:*)</code></li> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFunctionColumnDto
     *         PreferencesFunctionColumnDto}</code></li>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    PreferencesResponse findPreferencesByFunction(
                PreferencesFindRequest pRequest) throws LMSException;

    /**
     * Finds the PreferencesByUserAndFunction.
     * <p>
     * This functions Finds the PreferencesByUserAndFunction.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.UserPreferencesService#findPreferencesByFunction
     * findPreferencesByFunction}<br>
     * <p>
     * To find the UserPreference user must provide following input:<br>
     * <li>findByGroup.<br>
     * <li>functionName.<br>
     * <li>groupName.<br>
     * <li>userType
     * <li>userIdentifier
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <p>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PREFERENCES_DETAILS_NOT_FOUND_FOR_USR 
     * PREFERENCES_DETAILS_NOT_FOUND_FOR_USR}</code></td>
     * <td align="left">Preference details not found for User.</td>
     * </tr>
     * *
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PREFERENCES_DETAILS_OF_GROUP_SELECTED 
     * PREFERENCES_DETAILS_OF_GROUP_SELECTED}</code></td>
     * <td align="left">Preferences details of group selected.</td>
     * </tr>
     * </table>
     * 
     * @param pRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest
     *            PreferencesFindRequest}</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest#setFindByGroup
     *            FindByGroup} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest#setFunctionName
     *            FunctionName} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest#setGroupName
     *            GroupName} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest#setUserIdentifier
     *            UserIdentifier} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFindRequest#setUserType
     *            UserType} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C)</code><br>
     *            Prohibited for create operation.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesResponse
     *         PreferencesResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code></li><br>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesResponse#getPreferencesUserInfoDto()
     *         PreferencesUserInfoDto} - (1:*)</code><li> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.PreferencesFunctionColumnDto
     *         PreferencesFunctionColumnDto}</code><li>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    PreferencesResponse findPreferencesByUserAndFunction(
                PreferencesFindRequest pRequest) throws LMSException;

	PreferencesResponse findEntitiesByFunction(PreferencesFindRequest pRequest) throws LMSException;

	PreferencesResponse findPreferencesByEntityAndFunction(PreferencesFindRequest pRequest) throws LMSException;

}
