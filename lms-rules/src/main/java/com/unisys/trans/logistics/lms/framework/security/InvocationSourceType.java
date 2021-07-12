package com.unisys.trans.logistics.lms.framework.security;

/* 
 * Identifies the invocation source of the NG operation.  This class must not be 
 * exposed to external clients.  
 * The behavior of the application can vary when dealing with request 
 * 
 *  UI - LMS NG User Interface invoked the function
 *  BATCH - LMS NG Batch Framework invoked the function
 *  MESSAGE - A message from the LMS NG async queues invoked the function
 *  WEBSERVICE - Web Service Delegate invoked the operation
 * 
 */
public enum InvocationSourceType {

    BATCH, MESSAGE, UI, WEBSERVICE;

}
