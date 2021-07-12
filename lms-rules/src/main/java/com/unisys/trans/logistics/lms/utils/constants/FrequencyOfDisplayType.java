package com.unisys.trans.logistics.lms.utils.constants;

public enum FrequencyOfDisplayType {

	

		 
			O("One Time"),
			R("Repetitive");

		    private String label;
		    
			public String getLabel() {
		        return label;
		    }

		    FrequencyOfDisplayType(String pLabel){
			    this.label = pLabel;
			}
			
			
		}
		


