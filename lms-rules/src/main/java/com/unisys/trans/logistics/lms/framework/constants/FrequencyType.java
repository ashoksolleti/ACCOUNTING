package com.unisys.trans.logistics.lms.framework.constants;

public enum FrequencyType {
  DAILY("Daily"),
  WEEKLY("Weekly"),
  MONTHLY("Monthly");
  private String frequency;
  FrequencyType(final String pFrequency){
	this.setFrequency(pFrequency);  
  }
public String getFrequency() {
	return frequency;
}
public void setFrequency(String frequency) {
	this.frequency = frequency;
}
  
}
