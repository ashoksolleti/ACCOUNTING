/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import java.util.Date;

/*import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;*/

import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>CityTimeService</code> interface exposes the APIs which identifies local time of station and city
 * information.
 * <p>
 * City information contains details like:
 * <li>Standard Variation to UTC (Time zone - Coordinated Universal Time).
 * <li>Daylight Savings Time information.
 * <p>
 * This interface performs the following functions :
 * <ul>
 * <li>Finds the city local time information.
 * <li>Finds the station local time information.
 * </ul>
 * 
 */
//@Path("CityTimeService")
public interface CityTimeService {

    /**
     * Finds the <code>City local time</code>.
     * <p>
     * For the given <code>cityCode</code>, city local time will be populated.
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
     * 
     * @param pCityCode
     *            holds the city code.
     * @param pGivenDate
     *            holds the given date to convert.
     *            <p>
     * @return <code>Date</code><br>
     *         the local city time.<br>
     * @throws LMSException If the city details do not exist.
     */
/*    @POST
    @Path("/findLocalTimeByCity")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)*/
    Date findLocalTimeByCity(final String pCityCode, final Date pGivenDate) throws LMSException;
    
    /**
     * Finds the <code>City local time</code>.
     * <p>
     * For the given <code>cityCode</code>, city local time will be populated.
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
     * 
     * @param pCityCode
     *            holds the city code.
     * @param pGivenDate
     *            holds the given date to convert.
     *            <p>
     * @return <code>Date</code><br>
     *         the local city time.<br>
     * @throws LMSException If the city details do not exist.
     */
/*    @POST
    @Path("/findLocalTimeByCityClaims")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)*/
    Date findLocalTimeByCityClaims(final String pCityCode, final Date pGivenDate) throws LMSException;

    /**
     * Finds the <code>City UTC time</code>.
     * <p>
     * For the given <code>cityCode</code>, city UTC time will be populated.
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
     * 
     * @param pCityCode
     *            holds the city code.
     * @param pGivenDate
     *            holds the given local date to convert.
     *            <p>
     * @return <code>Date</code><br>
     *         the local city time.<br>
     * @throws LMSException If the city details do not exist.
     */
/*    @POST
    @Path("/findUTCTimeByCity")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)*/
    Date findUTCTimeByCity(final String pCityCode, final Date pGivenDate) throws LMSException;
    
}
