package com.unisys.trans.logistics.lms.framework.constants;



//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
/**
 * Enumerated values for the Rate Discriminator Type.
 * Possible values are,
 * <ul>
 * <li>P = Published
 * <li>A = Actual
 * <li>F = Face
 * </ul>
 * 
 * @author Unisys
 *
 */
public enum RateDiscriminatorType {

    P("Published"),A("Actual"),F("Face");
    
    private String definition;
    
     RateDiscriminatorType(final String pDef) {
        this.definition = pDef;
        
    }
     
     public String getDefinition() {
         return this.definition;
     }
}
