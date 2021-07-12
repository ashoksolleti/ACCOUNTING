/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.StickyNotesDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.StickyNotesFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.StickyNotesPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.StickyNotesResponse;

/**
 * <code>StickyService</code> interface exposes the APIs which identifies various processing flows involved in
 * displaying and maintaining sticky notes information.
 
 * This interface performs the following functions :
 * <ul>
 * <li>Creates the sticky notes information.
 * <li>Updates the sticky notes information.
 * <li>Retrieves the sticky notes information.
 * <li>Deletes the sticky notes information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.StickyNotesDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.StickyNotesFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.StickyNotesPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.StickyNotesResponse
 */
public interface StickyNotesService {

    /**
     * Creates a new sticky note.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * <p>
     * Creates a new sticky note associated with that user agent.
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
     * @param pStickyPersistRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyPersistRequest
     *            StickyPersistRequest}</code><br>
     *            holds the information of a newly created user note along with its user information.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto stickyNotes} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto#setStickyTitle stickyTitle} -(
     *            M)</code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto#setStickyContent
     *            stickyContent} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto#setLastUpdateTimeStamp lastUpdateTimeStamp} - (M)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto#setUser
     *            user} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesResponse StickyNotesResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto stickyNotes} - (1:*) </ul> </code>
     *         <p>
     * @throws LMSException If the user note cannot be created.
     */
    StickyNotesResponse createStickynote(final StickyNotesPersistRequest pStickyPersistRequest) throws LMSException;

    /**
     * Marks the sticky note for deletion.
     * <p>
     * In case of the marking the sticky note for deletion
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
     * 
     * @param pStickyDeleteRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyDeleteRequest
     *            StickyDeleteRequest} </code><br>
     *            holds the required information to mark the sticky note for delete operation.
     *             <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto stickyNotes} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto#setStickyTitle stickyTitle} -(
     *            M)</code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto#setStickyContent
     *            stickyContent} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto#setLastUpdateTimeStamp lastUpdateTimeStamp} - (M)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto#setUser
     *            user} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesResponse StickyNotesResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto stickyNotesDto} - (0:*) </ul> </code>
     *         <p>
     * @throws LMSException If the sticky note cannot be deleted.
     */
    StickyNotesResponse deleteStickynote(final StickyNotesDeleteRequest pStickyDeleteRequest) throws LMSException;

   

    /**
     * Finds the list of <code>StickyNotes</code>.
     * <p>
     * For the given <code>User</code>, user notes details will be populated.
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
     * @param pStickyFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.pStickyFindRequest
     *            pStickyFindRequest} </code><br>
     *            holds the request object for retrieving user notes.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyFindRequest StickyFindRequest}
     *            - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyFindRequest#setUserId userId}
     *            - (M)</code> 
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesResponse StickyNotesResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto stickyNotesDtos} -
     *         (0:*)</code>
     *         </ul>
     * @throws LMSException If the sticky notes details do not exist.
     */
    StickyNotesResponse findAllStickynotes(final StickyNotesFindRequest pStickyFindRequest) throws LMSException;

    

    /**
     * Updates the sticky note information.
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
     * 
     * @param pStickyPersistRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyPersistRequest
     *            StickyPersistRequest}</code><br>
     *            holds the information to update a sticky note information.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto stickyNotesDto} - (M)</code>
     *           <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto#setStickyTitle stickyTitle} -(
     *            M)</code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto#setStickyContent
     *            stickyContent} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto#setLastUpdateTimeStamp lastUpdateTimeStamp} - (M)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto#setUser
     *            user} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesResponse StickyNotesResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.StickyNotesDto stickyNotesDtos} - (0:*) </ul> </code>
     *         <p>
     * @throws LMSException If the sticky note update operation fails.
     */
    StickyNotesResponse updateStickynote(final StickyNotesPersistRequest pStickyPersistRequest) throws LMSException;


    StickyNotesResponse deleteByUserId(
            final StickyNotesDeleteRequest pStickyNotesDeleteRequest)
            throws LMSException;
    
}
