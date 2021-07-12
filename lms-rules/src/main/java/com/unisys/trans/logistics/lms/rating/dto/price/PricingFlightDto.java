/**
 * 
 */
package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.CargoClassType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * @author MuthusaB1
 * 
 */
public class PricingFlightDto implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 7373115320183424601L;

    /**
     * Actual Rating Flight
     */
    private String actualRatingFlight;

    /**
     * Actual Rating Flight date
     * 
     */
    private Date actualRatingFlightDate;

    /**
     * <p>
     * Booked Cargo Class.<br />
     * Cargo classification's value has got the value by accessing of input flight details<br />
     * Determined by CNCGCL<br />
     * AC(All cargo) = 'F'<br />
     * BC(Belly cargo) = 'P'<br />
     * PC(Partial Cargo (Combi)) = 'C'<br />
     * </p>
     */
    private CargoClassType firstFlownCargoClass;

    /**
     * First Flown Flight departure time
     * 
     */
    private Integer firstFlownDepartureTime;

    /**
     * First Flown Flight
     */
    private String firstFlownFlight;

    /**
     * First Flown Flight date
     * 
     */
    private Date firstFlownFlightDate;

    /**
     * @return the actualRatingFlight
     */
    public String getActualRatingFlight() {
        return this.actualRatingFlight;
    }

    /**
     * @return the actualRatingFlightDate
     */
    public Date getActualRatingFlightDate() {
        return ContractUtility.getClonedDate(this.actualRatingFlightDate);
    }

    /**
     * @return the firstFlownCargoClass
     */
    public CargoClassType getFirstFlownCargoClass() {
        return this.firstFlownCargoClass;
    }

    /**
     * @return the firstFlownDepartureTime
     */
    public Integer getFirstFlownDepartureTime() {
        return this.firstFlownDepartureTime;
    }

    /**
     * @return the firstFlownFlight
     */
    public String getFirstFlownFlight() {
        return this.firstFlownFlight;
    }

    /**
     * @return the firstFlownFlightDate
     */
    public Date getFirstFlownFlightDate() {
        return ContractUtility.getClonedDate(this.firstFlownFlightDate);
    }

    /**
     * @param actualRatingFlight
     *            the actualRatingFlight to set
     */
    public void setActualRatingFlight(final String pActualRatingFlight) {
        this.actualRatingFlight = pActualRatingFlight;
    }

    /**
     * @param actualRatingFlightDate
     *            the actualRatingFlightDate to set
     */
    public void setActualRatingFlightDate(final Date pActualRatingFlightDate) {
        this.actualRatingFlightDate = ContractUtility.getClonedDate(pActualRatingFlightDate);
    }

    /**
     * @param firstFlownCargoClass
     *            the firstFlownCargoClass to set
     */
    public void setFirstFlownCargoClass(final CargoClassType pFirstFlownCargoClass) {
        this.firstFlownCargoClass = pFirstFlownCargoClass;
    }

    /**
     * @param firstFlownDepartureTime
     *            the firstFlownDepartureTime to set
     */
    public void setFirstFlownDepartureTime(final Integer pFirstFlownDepartureTime) {
        this.firstFlownDepartureTime = pFirstFlownDepartureTime;
    }

    /**
     * @param firstFlownFlight
     *            the firstFlownFlight to set
     */
    public void setFirstFlownFlight(final String pFirstFlownFlight) {
        this.firstFlownFlight = pFirstFlownFlight;
    }

    /**
     * @param firstFlownFlightDate
     *            the firstFlownFlightDate to set
     */
    public void setFirstFlownFlightDate(final Date pFirstFlownFlightDate) {
        this.firstFlownFlightDate = ContractUtility.getClonedDate(pFirstFlownFlightDate);
    }
}
