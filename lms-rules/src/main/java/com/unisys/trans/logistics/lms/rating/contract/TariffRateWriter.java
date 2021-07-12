package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface TariffRateWriter {

    /**
     * Builds the <code>TariffRate CMR Report String</code>.
     * 
     * <br>
     * <b>To Build the TariffRate CMR report the following is needed:</b><br>
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
     * @return <code> String</code>
     *         <ul>
     *         The CMR report String
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    String writeCMRForTariffRateToFile(BatchRequest pBatchRequest) throws LMSException;

    /**
     * Builds the <code>TariffRate IATA FixedWidth Report String</code>.
     * 
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.TariffRateWriter#writeFixedWidthForATPCOTariffRate
     * writeFixedWidthForATPCOTariffRate}<br>
     * <br>
     * <b>To Build the TariffRate IATA FixedWidth report the following is needed:</b><br>
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
     * @return <code> String</code>
     *         <ul>
     *         The CMR report String
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    String writeFixedWidthForIATATariffRate(BatchRequest pBatchRequest) throws LMSException;

    /**
     * Builds the <code>TariffRate ATPCO FixedWidth Report String</code>.
     * 
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.TariffRateWriter#writeFixedWidthForIATATariffRate
     * writeFixedWidthForIATATariffRate}<br>
     * <br>
     * <b>To Build the TariffRate ATPCO FixedWidth report the following is needed:</b><br>
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
     * @return <code> String</code>
     *         <ul>
     *         The CMR report String
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    String writeFixedWidthForATPCOTariffRate(BatchRequest pBatchRequest) throws LMSException;

    /**
     * Builds the <code>TariffRate IATA CSV Report String</code>.
     * 
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.TariffRateWriter#writeCSVForATPCOTariffRate
     * writeCSVForATPCOTariffRate}<br>
     * <br>
     * <b>To Build the TariffRate IATA CSV report the following is needed:</b><br>
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
     * @return <code> String</code>
     *         <ul>
     *         The CMR report String
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    String writeCSVForIATATariffRate(BatchRequest pBatchRequest) throws LMSException;

    /**
     * Builds the <code>TariffRate ATPCO CSV Report String</code>.
     * 
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.rating.contract.TariffRateWriter#writeCSVForIATATariffRate
     * writeCSVForIATATariffRate}<br>
     * <br>
     * <b>To Build the TariffRate ATPCO CSV report the following is needed:</b><br>
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
     *            includes the attributes to build <code>Tariff ATPCO CSV report</code>.
     *            <p>
     * @return <code> String</code>
     *         <ul>
     *         The CMR report String
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    String writeCSVForATPCOTariffRate(BatchRequest pBatchRequest) throws LMSException;

}