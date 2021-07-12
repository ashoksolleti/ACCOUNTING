package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingAttachmentDto;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineOutwardMemoFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineOutwardMemoPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineOutwardMemoResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface InterlineOutwardMemoService {

    /**
     * 
     * @param pInterlineOutwardMemoFindRequest
     * @return
     * @throws LMSException
     */
    public InterlineOutwardMemoResponse retrieveInterlineOutwardMemo(
            InterlineOutwardMemoFindRequest pInterlineOutwardMemoFindRequest) throws LMSException;

    /**
     * 
     * @param pInterlineOutwardMemoPersistRequest
     * @return
     * @throws LMSException
     */
    public InterlineOutwardMemoResponse saveInterlineOutwardMemo(
            InterlineOutwardMemoPersistRequest pInterlineOutwardMemoPersistRequest) throws LMSException;

    /**
     * 
     * @param pInterlineOutwardMemoPersistRequest
     * @return
     * @throws LMSException
     */
    public InterlineOutwardMemoResponse processInterlineOutwardMemo(
            InterlineOutwardMemoPersistRequest pInterlineOutwardMemoPersistRequest)
            throws LMSException;

    /**
     *
     * @param pInterlineOutwardMemoPersistRequest
     * @return
     * @throws LMSException
     */
    public InterlineOutwardMemoResponse approveMemo(
            InterlineOutwardMemoPersistRequest pInterlineOutwardMemoPersistRequest) throws LMSException;

    /**
     *
     * @param pInterlineOutwardMemoPersistRequest
     * @return
     * @throws LMSException
     */
    public InterlineOutwardMemoResponse releaseMemo(
            InterlineOutwardMemoPersistRequest pInterlineOutwardMemoPersistRequest) throws LMSException;

    /**
     * 
     * @param InterlineOutwardMemoFindRequest
     * @return List of Billed Carrier Codes those are stored in outward memo table
     * @throws LMSException
     */
    InterlineOutwardMemoResponse findCarrierCodes(InterlineOutwardMemoFindRequest request) throws LMSException;
    /**
     *
     * @param pInterlineOutwardMemoPersistRequest
     * @return
     * @throws LMSException
     */
    public InterlineOutwardMemoResponse processInterlineOutwardRejectionMemo(
            InterlineOutwardMemoPersistRequest pInterlineOutwardMemoPersistRequest)
            throws LMSException;
}
