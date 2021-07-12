package com.unisys.trans.logistics.lms.framework.security;

import java.util.HashMap;

import com.unisys.trans.logistics.lms.framework.dto.RequestHeader;

/**
 * Execution Context provides a contextual view of information applicable when processing a LMS NG Request.
 * The usage of ExecutionContext is applicable during the lifetime of processing a single request. This
 * information is typically cached in a session or stored in ThreadLocal.
 * 
 * This class provides methods to gather various aspects of the business service invocation like: <br/>
 * 1. Security Roles of the User <br/>
 * 2. {@link com.unisys.trans.logistics.lms.framework.dto.RequestHeader RequestHeader} <br/>
 * 3. Tracing Set up <br/>
 * 4. Identification of the {@link com.unisys.trans.logistics.lms.framework.security.InvocationSourceType
 * InvocationSource}
 * 
 */
public class ExecutionContext {
    private HashMap<String, Object> authorityMap;

    private InvocationSourceType invocationSource;

    private boolean migrationProcess;

    private RequestHeader requestHeader;

    private boolean superUser;

    private boolean synchronizationProcess;

    private boolean traceOnForRequest;

    public void addAuthority(String pAuthorityName, Object pValue) {
        if (this.authorityMap == null) {
            this.authorityMap = new HashMap<String, Object>();
        }
        this.authorityMap.put(pAuthorityName, pValue);
    }

    public HashMap<String, Object> getAuthorityMap() {
        return authorityMap;
    }

    public InvocationSourceType getInvocationSource() {
        return invocationSource;
    }

    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Returns true if Migration process started the LMS NG operation
     */
    public boolean isMigrationProcess() {
        return migrationProcess;
    }

    public boolean isSuperUser() {
        return superUser;
    }

    public boolean isSynchronizationProcess() {
        return synchronizationProcess;
    }

    public boolean isTraceOnForRequest() {
        return traceOnForRequest;
    }

    public boolean isUserAuthorized(String pAuthorityName) {
        if (this.authorityMap.get(pAuthorityName) != null) {
            return (Boolean) this.authorityMap.get(pAuthorityName);
        }
        else {
            return false;
        }
    }

    public void setAuthorityMap(HashMap<String, Object> authorityMap) {
        this.authorityMap = authorityMap;
    }

    public void setInvocationSource(InvocationSourceType pInvocationSource) {
        invocationSource = pInvocationSource;
    }

    /**
     * Set to true of migration process started the LMS NG operation
     * 
     * @param migrationProcess - true for migration processes
     */
    public void setMigrationProcess(boolean migrationProcess) {
        this.migrationProcess = migrationProcess;
    }

    public void setRequestHeader(RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }

    public void setSuperUser(boolean superUser) {
        this.superUser = superUser;
    }

    /**
     * Set to true of synchronization process started the LMS NG operation
     * 
     * @param synchronizationProcess - true for synchronization processes
     */
    public void setSynchronizationProcess(boolean synchronizationProcess) {
        this.synchronizationProcess = synchronizationProcess;
    }

    public void setTraceOnForRequest(boolean traceOnForRequest) {
        this.traceOnForRequest = traceOnForRequest;
    }

    public String getHost() {
        return this.requestHeader.getHost().value();
    }
}
