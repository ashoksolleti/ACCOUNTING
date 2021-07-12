/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.framework.logging.LMSLogger;



/**
 * @author ChoukseA
 *
 */
public class ProrateFactorDto extends PersistenceObjectDto{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5827912466613110614L;
	private String originCity;
	private String destinationCity;
	private Date effectiveFromDate;
	private Date effectiveToDate;
	private String mileageSource;
	private Long oId;
	private Integer prorateFactor;
	private String fileLoadOverrideAllowed;
	private boolean create;
	private boolean update;
	private boolean delete;
	private boolean inter;
	private static final String EMPTY_STRING = "";
	private boolean error = false;;
	//OPFF
	
	/**
	 * @return the error
	 */
	public boolean isError() {
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(boolean error) {
		this.error = error;
	}
	/**
	 * @return the originCity
	 */
	public String getOriginCity() {
		return originCity;
	}

	/**
	 * @param originCity the originCity to set
	 */
	public void setOriginCity(String originCity) {
		if(originCity != null){
			this.originCity = originCity.toUpperCase();
		}else{
			this.originCity = originCity;
		}
		
	}

	/**
	 * @return the destinationCity
	 */
	public String getDestinationCity() {
		return destinationCity;
	}

	/**
	 * @param destinationCity the destinationCity to set
	 */
	public void setDestinationCity(String destinationCity) {
		if(destinationCity != null){
			this.destinationCity = destinationCity.toUpperCase();
		}else{
			this.destinationCity = destinationCity;
		}
		
	}

	/**
	 * @return the effectiveFromDate
	 */
	public Date getEffectiveFromDate() {
		return effectiveFromDate;
	}

	/**
	 * @param effectiveFromDate the effectiveFromDate to set
	 */
	public void setEffectiveFromDate(Date effectiveFromDate) {
		this.effectiveFromDate = effectiveFromDate;
	}

	/**
	 * @return the effectiveToDate
	 */
	public Date getEffectiveToDate() {
		return effectiveToDate;
	}

	/**
	 * @param effectiveToDate the effectiveToDate to set
	 */
	public void setEffectiveToDate(Date effectiveToDate) {
		if(effectiveToDate!=null){
			Calendar cal = Calendar.getInstance();
			cal.setTime(effectiveToDate);
			if(cal.get(cal.YEAR)==1999){
				cal.set(2033, cal.get(cal.MONTH), cal.get(cal.DATE), cal.get(cal.HOUR_OF_DAY),cal.get(cal.MINUTE),cal.get(cal.SECOND));
				effectiveToDate = cal.getTime();
			}
		}
		
		this.effectiveToDate = effectiveToDate;
	}

	/**
	 * @return the mileageSource
	 */
	public String getMileageSource() {
		return mileageSource;
	}

	/**
	 * @param mileageSource the mileageSource to set
	 */
	public void setMileageSource(String mileageSource) {
		this.mileageSource = mileageSource;
	}

	public Long getOId() {
		return this.oId;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return this.oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
	 * @return the prorateFactor
	 */
	public Integer getProrateFactor() {
		return prorateFactor;
	}

	/**
	 * @param prorateFactor the prorateFactor to set
	 */
	public void setProrateFactor(Integer prorateFactor) {
		this.prorateFactor = prorateFactor;
	}

	/**
	 * @return the fileLoadOverrideAllowed
	 */
	public String getFileLoadOverrideAllowed() {
		return fileLoadOverrideAllowed;
	}

	/**
	 * @param fileLoadOverrideAllowed the fileLoadOverrideAllowed to set
	 */
	public void setFileLoadOverrideAllowed(String fileLoadOverrideAllowed) {
		this.fileLoadOverrideAllowed = fileLoadOverrideAllowed;
	}

	/**
	 * @return the create
	 */
	public boolean isCreate() {
		return create;
	}

	/**
	 * @param create the create to set
	 */
	public void setCreate(boolean create) {
		this.create = create;
	}

	/**
	 * @return the update
	 */
	public boolean isUpdate() {
		return update;
	}

	/**
	 * @param update the update to set
	 */
	public void setUpdate(boolean update) {
		this.update = update;
	}

	/**
	 * @return the delete
	 */
	public boolean isDelete() {
		return delete;
	}

	/**
	 * @param delete the delete to set
	 */
	public void setDelete(boolean delete) {
		this.delete = delete;
	}
	
	/**
	 * @return the inter
	 */
	public boolean isInter() {
		return inter;
	}

	/**
	 * @param inter the inter to set
	 */
	public void setInter(boolean inter) {
		this.inter = inter;
	}

	public String toString() {
		
		 final StringBuffer csvString = new StringBuffer();
		 final SimpleDateFormat dbDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S",
	                Locale.US);
		 final SimpleDateFormat excelDateFormat = new SimpleDateFormat("ddMMMyy HH:mm:ss",
	                Locale.US);
		 Date effectiveDate = null;
		 if (this.getOriginCity() != null) {
             csvString.append(this.prefixSuffixByQuotes(this.getOriginCity()));
         }
         else {
             csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
         }
		 
		 if (this.getDestinationCity() != null) {
             csvString.append(this.prefixSuffixByQuotes(this.getDestinationCity()));
         }
         else {
             csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
         }
		 if (this.getProrateFactor() != null) {
             csvString.append(this.prefixSuffixByQuotes(this.getProrateFactor().toString()));
         }
         else {
             csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
         }
		 if (this.getEffectiveFromDate()!= null) {
			try {
				effectiveDate =	dbDateFormat.parse(this.getEffectiveFromDate().toString());
			} catch (ParseException e) {
				LMSLogger.error(0, "ProrateFactorDto toString error while parsing Date "+this.getEffectiveFromDate().toString()+" ; errorMessage : "+e.getMessage());
			}
            csvString.append(this.prefixSuffixByQuotes(excelDateFormat.format(effectiveDate)));
         }
         else {
             csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
         }
		 if (this.getEffectiveToDate()!= null) {
			 try {
					effectiveDate =	dbDateFormat.parse(this.getEffectiveToDate().toString());
				} catch (ParseException e) {
					LMSLogger.error(0, "ProrateFactorDto toString error while parsing Date "+this.getEffectiveFromDate().toString()+" ; errorMessage : "+e.getMessage());
				}
	            csvString.append(this.prefixSuffixByQuotes(excelDateFormat.format(effectiveDate)));
         }
         else {
             csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
         }
		 if (this.getMileageSource()!= null) {
             csvString.append(this.prefixSuffixByQuotes(this.getMileageSource()));
         }
         else {
             csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
         }
		 if (this.getFileLoadOverrideAllowed()!= null) {
             csvString.append(this.prefixSuffixByQuotes(this.getFileLoadOverrideAllowed()));
         }
         else {
             csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
         }
		 return csvString.toString();
	}
	
	private String prefixSuffixByQuotes(final String pString) {
	        final String aQUOTATION = "\"";
	        final String aCOMMA = ",";
	        final StringBuffer aModifiedString = new StringBuffer();
	        aModifiedString.append(aQUOTATION);
	        aModifiedString.append(pString);
	        aModifiedString.append(aQUOTATION);
	        aModifiedString.append(aCOMMA);
	        return aModifiedString.toString();
	    }
	
	
}
