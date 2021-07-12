/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.OfficePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.OfficeQueueFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemDto;
import com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.OfficeQueueResponse;
import com.unisys.trans.logistics.lms.utils.dto.OfficeQueueSendRequest;
import com.unisys.trans.logistics.lms.utils.dto.OfficeResponse;
import com.unisys.trans.logistics.lms.utils.dto.QueueRequest;
import com.unisys.trans.logistics.lms.utils.dto.QueueResponse;
import com.unisys.trans.logistics.lms.utils.dto.constants.QueueItemObjectType;

/**
 * <code>OfficeQueueService</code> interface exposes the APIs which identifies
 * various processing flows involved in finding office queue items.
 * <p>
 * This performs the following functions:<br>
 * <ul>
 * <li>Finds all office queues associated with the Office Identifier.
 * <li>Finds OfficeQueues items in a particular OfficeQueue with provided filter attributes.
 * <li>Adds the item to the office queue.
 * <li>Removes all the items from the input Queue.
 * <li>Removes the item from the office queue either by Queue Office and Queue Item Number or Queue Item
 * Unique Key in all Office Queues and Office Stations.
 * <li>Queues the input Queue Message Text to Resubmission Office Queue.
 * </ul>
 * <p>
 * Queues are used as a means of communication between the system and cargo offices when certain conditions
 * are encountered that the system cannot automatically process without notification or user action.<br>
 * There are two types of queues:
 * <ul>
 * <li>Restricted queues - Items on a restricted queue cannot be purged from the system until the specific
 * item has been worked.
 * <li>Non-restricted queues - A Non-restricted queue is an advisory queue that contains information for the
 * users. The items on a non-restricted queue can be purged without action on the specific queue item.
 * </ul>
 * <b>See also :</b>
 * <ul>
 * <li>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueFindRequest}</li>
 * <li>
 * {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsFindRequest}</li>
 * <li>
 * {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsDeleteRequest}</li>
 * <li>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueSendRequest}</li>
 * <li>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueResponse}</li>
 * </ul>
 */
public interface OfficeQueueService {

    /**
     * The <code>addOfficeQueueItem</code> adds the item to the office queue.
     * <p>
     * <b>Related Method :</b>
     * <ul>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#removeOfficeQueueItem
     * removeOfficeQueueItem}
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#deleteOfficeQueueItems
     * deleteOfficeQueueItems}
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#resubmitQueueItem
     * resubmitQueueItem}
     * </ul>
     * </p>
     * Adds the item to the office queue based on the inputs(Queue Office, Queue
     * Name, Queue Item Unique Key, Message type and text) given by user.
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
     * <table border="1" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUEUEOFFICE_MANDATORY_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">The Office does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUEUENAME_MANDATORY_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">The Office Queue does not exist in the system.</td>
     * </tr>
     * </table>
     * </p>
     * <p>
     * 
     * @param pOfficeQueueSendRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueSendRequest
     *            OfficeQueueSendRequest}</code><br>
     *            holds all the information required for adding the
     *            OfficeQueueItems to a particular Office Queue.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueSendRequest#setOfficeIdentifier
     *            officeIdentifier} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueSendRequest#setQueueName
     *            queueName} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueSendRequest#numberOfItems
     *            numberOfItems} - (C)</code></li>
     *            </ul>
     *            </p>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueResponse
     *         OfficeQueueResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </li></ul> </code>
     *         </p>
     *         <p>
     * @throws LMSException
     *             If the add Office Queue Items operation fails, the
     *             corresponding errors are returned which contains the status
     *             code, human readable message and message type.
     *             </p>
     */
    OfficeQueueResponse addOfficeQueueItem(
                OfficeQueueSendRequest pOfficeQueueSendRequest) throws LMSException;

    /**
     * The <code>deleteOfficeQueueItems</code> removes all the items from the
     * input Queue.
     * <p>
     * <b>Related Method :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#removeOfficeQueueItem removeOfficeQueueItem}
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#addOfficeQueueItem addOfficeQueueItem}
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#resubmitQueueItem resubmitQueueItem}
     * </ul>
     * </code> removes all the items from the input Queue based on the input(Office Identifier,Queue Name and
     * Deletion Type) given by user.
     * </p>
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
     * <table border="1" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUEUEOFFICE_MANDATORY_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">The Office does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUEUENAME_MANDATORY_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">The Office Queue does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OFFICEQUEUE_INVALID_QUEUE_TYPE}</code>
     * </td>
     * <td align="left">Deletion type must be 'A' or 'S'.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pOfficeQueueItemsDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsDeleteRequest
     *            OfficeQueueItemsDeleteRequest}</code><br>
     *            holds all the information required for deleting all the Office
     *            Queue Items for a particular Office Queue.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsDeleteRequest#setOfficeIdentifier
     *            officeIdentifier} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsDeleteRequest#setQueueName
     *            queueName} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsDeleteRequest#setDeletionType
     *            deletionType} - (M)</code></li>
     *            </ul>
     *            </p>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueResponse
     *         OfficeQueueResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </li></ul> </code>
     *         </p>
     *         <p>
     * @throws LMSException
     *             If the delete all Office Queue Items for a particular office
     *             queue operation fails, the corresponding errors are returned
     *             which contains the status code, human readable message and
     *             message type.
     *             </p>
     */
    OfficeQueueResponse deleteAllOfficeQueueItems(
                OfficeQueueItemsDeleteRequest pOfficeQueueItemsDeleteRequest)
                throws LMSException;

    /**
     * The <code>deleteOfficeQueueItems</code> removes all the items from the
     * input Queue.
     * <p>
     * <b>Related Method :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#removeOfficeQueueItem removeOfficeQueueItem}
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#addOfficeQueueItem addOfficeQueueItem}
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#resubmitQueueItem resubmitQueueItem}
     * </ul>
     * </code> removes all the items from the input Queue based on the input(Office Identifier,Queue Name and
     * Deletion Type) given by user.
     * </p>
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
     * <table border="1" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUEUEOFFICE_MANDATORY_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">The Office does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUEUENAME_MANDATORY_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">The Office Queue does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OFFICEQUEUE_INVALID_QUEUE_TYPE}</code>
     * </td>
     * <td align="left">Deletion type must be 'A' or 'S'.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pOfficeQueueItemsDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsDeleteRequest
     *            OfficeQueueItemsDeleteRequest}</code><br>
     *            holds all the information required for deleting all the Office
     *            Queue Items for a particular Office Queue.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsDeleteRequest#setOfficeIdentifier
     *            officeIdentifier} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsDeleteRequest#setQueueName
     *            queueName} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsDeleteRequest#setDeletionType
     *            deletionType} - (M)</code></li>
     *            </ul>
     *            </p>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueResponse
     *         OfficeQueueResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </li></ul> </code>
     *         </p>
     *         <p>
     * @throws LMSException
     *             If the delete all Office Queue Items for a particular office
     *             queue operation fails, the corresponding errors are returned
     *             which contains the status code, human readable message and
     *             message type.
     *             </p>
     */
    OfficeQueueResponse deleteOfficeQueueItems(
                OfficeQueueItemsDeleteRequest pOfficeQueueItemsDeleteRequest)
                throws LMSException;

    /**
     * The <code>findAllOfficeQueues</code> finds all office queues associated
     * with the Office Identifier.
     * <p>
     * <b>Related Method :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#findOfficeQueueItems findOfficeQueueItems}
     * </ul>
     * </code> Office Identifier for a particular Office Queue will be unique and it will be the combination
     * of Station and Office fields. If the Office Identifier provided is appropriate and if it is present in
     * the system, it returns the OfficeQueues associated with it.
     * </p>
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
     * <table border="1" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUEUEOFFICE_MANDATORY_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">The Office does not exist in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pOfficeQueuesFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueFindRequest
     *            OfficeQueueFindRequest}</code><br>
     *            holds all the information required for finding the
     *            OfficeQueues for a particular Office.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueFindRequest#setOfficeIdentifier officeIdentifier} - (M)</code>
     *            </li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueResponse
     *         OfficeQueueResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </ul> </code>
     *         <p>
     * @throws LMSException
     *             If the find Office Queues operation fails, the corresponding
     *             errors are returned which contains the status code, human
     *             readable message and message type.
     */
    OfficeQueueResponse findAllOfficeQueues(
                OfficeQueueFindRequest pOfficeQueuesFindRequest)
                throws LMSException;

    /**
     * The <code>findOfficeQueueItem</code> finds OfficeQueues item in a
     * particular OfficeQueue with provided filter attributes.
     * <p>
     * <b>Related Method :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#findOfficeQueueItems findOfficeQueueItems}
     * </ul>
     * </code>
     * <p>
     * The filter attributes provided filters out the needed OfficeQueueItem. Filter attribute is SpotRateOId.
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
     * <table border="1" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUEUEOFFICE_MANDATORY_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">The Office does not exist in the system.</td>
     * *
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OFFICE_ITEM_OID_MANDATORY}</code>
     * </td>
     * <td align="left">The Office does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUEUENAME_MANDATORY_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">The Office Queue does not exist in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pOfficeQueueItemsFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsFindRequest
     *            OfficeQueueItemsFindRequest}</code><br>
     *            holds all the information required for finding the
     *            OfficeQueueItems for a particular OfficeQueue.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsFindRequest#setOfficeIdentifier officeIdentifier} - (M)</code>
     *            </li>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsFindRequest#setQueueName queueName} - (M)</code>
     *            </li>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsFindRequest#setOId OId} - (M)</code>
     *            </li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueResponse
     *         OfficeQueueItemsResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </li></ul> </code>
     *         <p>
     * @throws LMSException
     *             If the find Office Queue Items operation fails, the
     *             corresponding errors are returned which contains the status
     *             code, human readable message and message type.
     */
    OfficeQueueResponse findOfficeQueueItem(
                OfficeQueueItemsFindRequest pOfficeQueueItemsFindRequest)
                throws LMSException;

    /**
     * The <code>findOfficeQueueItems</code> finds OfficeQueues items in a
     * particular OfficeQueue with provided filter attributes.
     * <p>
     * <b>Related Method :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#findAllOfficeQueues findAllOfficeQueues}
     * </ul>
     * </code>
     * <p>
     * The filter attributes provided filters out the needed OfficeQueueItem. Filter attributes are
     * OfficeQueue Identifier, Queue Identifier and Items count.
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
     * <table border="1" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUEUEOFFICE_MANDATORY_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">The Office does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUEUENAME_MANDATORY_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">The Office Queue does not exist in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pOfficeQueueFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsFindRequest
     *            OfficeQueueItemsFindRequest}</code><br>
     *            holds all the information required for finding the
     *            OfficeQueueItems for a particular OfficeQueue.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsFindRequest#setOfficeIdentifier officeIdentifier} - (M)</code>
     *            </li>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsFindRequest#setQueueName queueName} - (M)</code>
     *            </li>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsFindRequest#setNumberOfItems numberOfItems} - (O)</code>
     *            </li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueResponse
     *         OfficeQueueItemsResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </li></ul> </code>
     *         <p>
     * @throws LMSException
     *             If the find Office Queue Items operation fails, the
     *             corresponding errors are returned which contains the status
     *             code, human readable message and message type.
     */
    OfficeQueueResponse findOfficeQueueItems(
                OfficeQueueItemsFindRequest pOfficeQueueFindRequest)
                throws LMSException;
                
    
                        
                        
                

    /**
     * The <code>removeOfficeQueueItem</code> removes the item from the office
     * queue either by Queue Office and Queue Item Number or Queue Item Unique
     * Key in all Office Queues and Office Stations.
     * <p>
     * <b>Related Method :</b>
     * <ul>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#deleteOfficeQueueItems
     * deleteOfficeQueueItems}
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#addOfficeQueueItem
     * addOfficeQueueItem}
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#resubmitQueueItem
     * resubmitQueueItem}
     * </ul>
     * removes the item from the office queue either by Queue Office and Queue Item Number or Queue Item
     * Unique Key in all Office Queues and Office Stations based on the input(OfficeQueueItem or
     * OfficeQueueItems) given by user.
     * </p>
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
     * </p>
     * <p>
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OFFICE_QUEUE_ITEMS_NOT_EXIST}</code>
     * </td>
     * <td align="left">The Office Queue Item does not exist in the system.</td>
     * </tr>
     * </table>
     * </p>
     * <p>
     * 
     * @param pOfficeQueueItemsDeleteRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsDeleteRequest
     *            OfficeQueueItemsDeleteRequest}</code><br>
     *            holds all the information required for deleting one or more
     *            Office Queue Items for a particular Office Queue.
     *            <ul>
     *            <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsDeleteRequest#setOfficeQueueItem
     *            officeQueueItem} - (C)</code></li> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemsDeleteRequest#setOfficeQueueItems
     *            officeQueueItems} - (C)</code></li>
     *            </ul>
     *            </p>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueResponse
     *         OfficeQueueResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </li></ul> </code>
     *         </p>
     *         <p>
     * @throws LMSException
     *             If the delete one or more Office Queue Items for a particular
     *             office queue operation fails, the corresponding errors are
     *             returned which contains the status code, human readable
     *             message and message type.
     *             </p>
     */
    OfficeQueueResponse removeOfficeQueueItem(
                OfficeQueueItemsDeleteRequest pOfficeQueueItemsDeleteRequest)
                throws LMSException;

    /**
     * The <code>resubmitQueueItem</code> queues the input Queue Message Text to
     * Resubmission Office Queue.
     * <p>
     * <b>Related Method :</b>
     * <ul>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#addOfficeQueueItem
     * addOfficeQueueItem}
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#removeOfficeQueueItem
     * removeOfficeQueueItem}
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#deleteOfficeQueueItems
     * deleteOfficeQueueItems}
     * </ul>
     * queues the input Queue Message Text to Resubmission Office Queue based on the inputs(Resubmission Queue
     * Name and Message text) given by user.
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
     * <table border="1" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUEUENAME_MANDATORY_OBJECT_INSTANCE}</code>
     * </td>
     * <td align="left">The Office Queue does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OFFICE_QUEUE_ITEMS_NOT_EXIST}</code>
     * </td>
     * <td align="left">The Office Queue Item does not exist in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pOfficeQueueSendRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueSendRequest
     *            OfficeQueueSendRequest}</code><br>
     *            holds all the information required for resubmit the
     *            OfficeQueueItems to a particular Office Queue.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueSendRequest#setQueueName
     *            queueName} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueSendRequest#setOfficeQueueItemDto
     *            officeQueueItemDto} - (M)</code></li>
     *            </ul>
     *            </p>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueResponse
     *         OfficeQueueResponse} <ul><li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </li></ul> </code>
     *         </p>
     *         <p>
     * @throws LMSException
     *             If the resubmit Office Queue Items operation fails, the
     *             corresponding errors are returned which contains the status
     *             code, human readable message and message type.
     *             </p>
     */
    OfficeQueueResponse resubmitQueueItem(
                OfficeQueueSendRequest pOfficeQueueSendRequest) throws LMSException;

    /**
     * The <code>updateOfficeQueueItem</code> updates OfficeQueues item in a
     * particular OfficeQueue with provided filter attributes.
     * <p>
     * <b>Related Method :</b> <code>
     * <ul>
     * <li>{@link com.unisys.trans.logistics.lms.utils.contract.OfficeQueueService#updateOfficeQueueItem updateOfficeQueueItem}
     * </ul>
     * </code>
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
     * <table border="1" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OFFICEQUEUE_NOT_EXIST}</code>
     * </td>
     * <td align="left">The Office queue does not exist in the system.</td>
     * *
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#REACHED_MAX_LIMIT}</code></td>
     * <td align="left">The Office queue reached its maximum limit.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#OFFICE_QUEUE_ITEMS_EMPTY}</code>
     * </td>
     * <td align="left">The Office Queue items are empty in the system.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pOfficeQueueSendRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueSendRequest
     *            OfficeQueueItemsFindRequest}</code><br>
     *            holds all the information required for finding the
     *            OfficeQueueItems for a particular OfficeQueue.
     *            <p>
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueSendRequest#setNumberOfItems numberOfItems} - (M)</code>
     *            </li>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueSendRequest#setOfficeIdentifier officeIdentifier} - (M)</code>
     *            </li>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueSendRequest#setOfficeQueueItem officeQueueItem} - (M)</code>
     *            </li>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeQueueResponse
     *         OfficeQueueItemsResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} </li></ul> </code>
     *         <p>
     * @throws LMSException
     *             If the find Office Queue Items operation fails, the
     *             corresponding errors are returned which contains the status
     *             code, human readable message and message type.
     */
    OfficeQueueResponse updateOfficeQueueItem(
                OfficeQueueSendRequest pOfficeQueueSendRequest) throws LMSException;

    /**
     * 
     * @param pOfficeQueuesFindRequest
     * @return
     * @throws LMSException
     */
    QueueResponse findAllQueues(QueueRequest pQueueRequest) throws LMSException;
    
    
    
    OfficeResponse createOfficeQueue(
                OfficePersistRequest pOfficePersistRequest) throws LMSException;
    
    
    
    /**
     * 
     * @param pOfficeQueuesFindRequest
     * @return
     * @throws LMSException
     */
    void processOfficeQueueItem (OfficeQueueSendRequest pOfficeQueueSendRequest) throws LMSException; 
	
	
    OfficeQueueResponse findQueuesAndQueueItems(OfficeQueueSendRequest request) throws LMSException;

    OfficeQueueResponse findQueueItem(Long oId) throws LMSException;

    int deleteOfficeQueueItemItem(Long pObjectId) throws LMSException;
    
    int deleteOfficeQueueItemItem(Long pObjectId,Long pOfficeQueueOid) throws LMSException;
    
    int deleteOfficeQueueItemItemByOId(Long pObjectId) throws LMSException;
    
    public List<OfficeQueueItemDto> findOfficeQueueItem(final Long pObjectId,
                final QueueItemObjectType pObjectType) throws LMSException;

    List<OfficeQueueItemDto> findAuditErrorqueue(final long pOId) throws LMSException;
    // Inv Gen bulk call start
    List<OfficeQueueItemDto> findAuditErrorqueuebyOidList(final List<Long> pAWBOids) throws LMSException;
    // Inv Gen bulk call end
    void  deleteOfficequeue(final long poid) throws LMSException;

    List<Long> findAirWaybillFromOfficeQueue() throws LMSException;
    
    /*Logging and Nagios Monitoring Changes*/
    
    int findOfficeQueueItemsCount(
  		  OfficeQueueItemsFindRequest pOfficeQueueFindRequest)
  			 throws LMSException;
    //UIS110
    public void deleteOfficeQueueItemByOId(Long pObjectId) throws LMSException;

    OfficeQueueItemDto findOfficeQueueItembyPartAccNo
            (QueueItemObjectType partcreditlimitupderror, String participantAccountNo) throws LMSException;
}
