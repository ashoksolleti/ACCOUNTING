package com.unisys.trans.logistics.lms.framework.constants;

public enum GSATargetBasedOn {
	
	SALES("Sales"), VOLUME("Volume");
	
	private final String targetBasedOn;
	
	public String getType() {
        return this.targetBasedOn;
    }
	
	public String value() {
        return this.name();
    }
	
	GSATargetBasedOn(final String pFrequencyType)
	{
		this.targetBasedOn = pFrequencyType;
	}
	
	public static GSATargetBasedOn getTargetBasedOn(
            final String pFrequencyType) {

		GSATargetBasedOn aGSATargetBasedOn = null;

    for (final GSATargetBasedOn aTargetType : GSATargetBasedOn.values()) {

        if (pFrequencyType.equalsIgnoreCase(aTargetType.getType())) {
        	aGSATargetBasedOn = aTargetType;
            break;
        }
    }

    return aGSATargetBasedOn;

	}


}
