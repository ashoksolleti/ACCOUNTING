package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.TariffRateATPReportResponse;

public interface TariffRateATPWriter {

    /**
     * Builds the <code>TariffRate ATP report in IATA Tact format</code>.
     * 
     * <br>
     * <b>To Build the TariffRate ATP report in IATA Tact format the following is needed:</b><br>
     * <li>Work unit.<br>
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
     * 
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     *            includes the attributes to build <code>Tariff CMR report</code>.
     *            <p>
     * @return TariffRateATPReportResponse
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.TariffRateATPReportResponse
     *         TariffRateATPReportResponse}</code>
     *         <ul>
     *         The Tariff Rate(ATP) IATA tact format report String
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    TariffRateATPReportResponse buildTariffRateATPreport(BatchRequest pBatchRequest) throws LMSException;

  
}