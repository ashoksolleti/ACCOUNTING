package com.unisys.trans.logistics.lms.utils.contract;

/*import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;*/

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.FieldTranslationFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.FieldTranslationResponse;

/**
 * <code>FieldTranslationService</code> is used to maintain field information.
 * <p>
 * This <code>FieldTranslationService</code> offers the following functions:
 * <ul>
 * <li>Create - Creates fields.
 * <li>Update - Updates fields.
 * <li>Delete - Deletes the field.
 * <li>Find fields - Retrieves the field based on the criteria provided.
 * </ul>
 * <p>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.FieldTranslationPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.FieldTranslationDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.FieldTranslationFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.FieldTranslationResponse
 * 
 */
//@Path("FieldTranslationService")
public interface FieldTranslationService {

    /**
     * Find the <code>field </code>.
     * <p>
     * This method find he field for given page.<br>
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.utils.contract.FieldTranslationService#findField
     * findField}<br>
     * <p>
     * To find the field user must provide following input:<br>
     * <li>Page.<br>
     * <li>Language.<br>
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
     * <br>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td>
     * {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#PAGE_MANDATORY}</td>
     * <td>The page is mandatory.</td>
     * </tr>
     * </table>
     * 
     * @param pFieldTranslationFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.FieldTranslationFindRequest
     *            FieldTranslationFindRequest}</code><br>
     *            includes the attributes to find a <code>field translation </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.FieldTranslationDto
     *            FieldTranslationDto} - (M)</code>
     *            </ul>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.FieldTranslationFindRequest#setLanguage
     *            Language} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.FieldTranslationFindRequest#setPage
     *            Page} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.FieldTranslationFindRequest#setFieldId
     *            FieldId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.FieldTranslationFindRequest#setFieldIdType
     *            FieldIdType} - (O)</code>
     * 
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.FieldTranslationResponse
     *         FieldTranslationResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         <code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.FieldTranslationResponse#getFieldTranslationDto()
     *         FieldTranslationDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.FieldTranslationDto
     *         FieldTranslationDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the field find operation fails,, above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message, and message type.
     */
/*    @POST
    @Path("/findField")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)*/
    FieldTranslationResponse findField(
                FieldTranslationFindRequest pFieldTranslationFindRequest)
                throws LMSException;


}
