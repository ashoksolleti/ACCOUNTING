/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.HolidayFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.HolidayPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.HolidayResponse;

/**
 * <code>HolidayService</code> is used to maintain the holiday information.
 * <p>
 * This performs the following functions:
 * <ul>
 * <li>Creates a Holiday.
 * <li>Updates a Holiday.
 * <li>Retrieves the Holidays.
 * </ul>
 * <p>
 * A holiday information defines a holiday in the system which contains standard holiday and specific holiday
 * information applicable to the station.
 * <p>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.HolidayFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.HolidayPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.HolidayResponse
 */
public interface HolidayService {

    /**
     * Creates a new holiday.
     * <p>
     * In order to create a holiday, the standard holiday or holiday for the input station must not exist in
     * the system. <br>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
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
     * <table border="0" cellspacing="0",cellpadding="5">
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_HOLIDAY_ALREADY_EXISTS}</code>
     * </td>
     * <td>Holiday information for the station already exists.</td>
     * </tr>
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STANDARD_HOLIDAY_ALREADY_EXISTS}</code>
     * </td>
     * <td>Standard holiday information already exists.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pHolidayPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.HolidayPersistRequest HolidayPersistRequest}
     *            </code><br>
     *            includes the attributes to create a holiday.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto Holiday} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto#setHolidayDates
     *            holidayDates} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto#setHolidayType holidayType} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto#setMonthHolidays monthHolidays} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto#setStandardHolidayApplyInd
     *            standardHolidayApplyInd} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto#setStationCode stationCode} - (C)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto#setOId oId} -
     *            (M)</code> <br>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayResponse HolidayResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#HOLIDAY_CREATE_SUCCESSFUL}
     *         </code> for successful create. <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.HolidayResponse#getHolidayDtos() HolidayDtos} -
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto HolidayDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validation fails, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    HolidayResponse createHolidayInformation(HolidayPersistRequest pHolidayPersistRequest)
                throws LMSException;

    /**
     * Finds the HolidayInformation.
     * <p>
     * <li>The system returns the HolidayInformation.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
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
     * <table border="0" cellspacing="0",cellpadding="5">
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_HOLIDAY_DOES_NOT_EXIST}</code>
     * </td>
     * <td>No holiday information for this station exists.</td>
     * </tr>
     * <tr>
     * <td>
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STANDARD_HOLIDAY_DOES_NOT_EXIST}</code>
     * </td>
     * <td>No standard holiday information exists.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pHolidayFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayFindRequest
     *            HolidayFindRequest}</code><br>
     *            includes the attributes to find Holiday.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayFindRequest} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayResponse HolidayResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.HolidayResponse#getHoliday() Holiday -
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto HolidayDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validations fail, the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
    HolidayResponse findHolidayInformation(HolidayFindRequest pHolidayFindRequest) throws LMSException;

    /**
     * Updates the Holiday information.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
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
     * <table border="0" cellspacing="0",cellpadding="5">
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#HOLIDAY_DATE_ALREADY_EXISTS}</td>
     * <td>The entered date already exists in the holiday list.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pHolidayPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.HolidayPersistRequest HolidayPersistRequest}
     *            </code><br>
     *            includes the attributes to create a Holiday.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto Holiday} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto#setHolidayDates
     *            holidayDates} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto#setHolidayType holidayType} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto#setMonthHolidays monthHolidays} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto#setStandardHolidayApplyInd
     *            standardHolidayApplyInd} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto#setStationCode stationCode} - (C)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto#setOId oId} -
     *            (M)</code> <br>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayResponse HolidayResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#HOLIDAY_UPDATE_SUCCESSFUL}
     *         </code> for successful update. <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.HolidayResponse#getHoliday() Holiday} - </code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.HolidayDto HolidayDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the validations fail, the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message and message type.
     */
    HolidayResponse updateHolidayInformation(HolidayPersistRequest pHolidayPersistRequest)
                throws LMSException;

}
