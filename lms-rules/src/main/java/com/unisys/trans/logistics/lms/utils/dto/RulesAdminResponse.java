/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>AggregateLocationFindResponse</code> retrieves the <code>Aggregate information</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>sourceInTarget
 * </code>
 * </ul>
 */

public class RulesAdminResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;
    
    private List<RulesAdminHistoryDto> rulesAdminHistoryDtos;
    

    public List<RulesAdminHistoryDto> getRulesAdminHistoryDtos() {
        return rulesAdminHistoryDtos;
    }

    public void setRulesAdminHistoryDtos(final List<RulesAdminHistoryDto> pRulesAdminHistoryDtos) {
        this.rulesAdminHistoryDtos = pRulesAdminHistoryDtos;
    }
  
    //create a map key as status feild value as file name
    //need to ask siva whether the filename is unique,or which feild is unique .
    
    //If it is unique u can store the data in map
    
		//create geeter setter for it
		  /**
	     * Attribute to hold the <code>loadJarMap</code> object.
	     */
	    private Map<Boolean,String> isLoaded = new HashMap<Boolean,String>();


		public Map<Boolean,String> getIsLoaded() {
			return this.isLoaded;
		}

		public void setIsLoaded(final Map<Boolean,String> pIsLoaded) {
			this.isLoaded = pIsLoaded;
		}
		
		public Date lastModified;


        public Date getLastModified() {
            return lastModified;
        }

        public void setLastModified(Date lastModified) {
            this.lastModified = lastModified;
        }
   
}
