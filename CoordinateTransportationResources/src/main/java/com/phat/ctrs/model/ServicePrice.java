// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name = "SERVICE_PRICE")
public class ServicePrice implements Serializable {

    /** Primary key. */
    protected static final String PK = "servicePriceId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name = "LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(unique = true, nullable = false, precision = 10)
    private BigDecimal servicePriceId;
    @Column(precision = 10)
    private BigDecimal beginLocation;
    @Column(precision = 10)
    private BigDecimal endLocation;
    @Column(name = "MOQ", precision = 10)
    private BigDecimal moq;
    @Column(precision = 10, scale = 2)
    private BigDecimal costOfDay;
    @Column(precision = 10)
    private BigDecimal chargeType;
    @Column(precision = 10, scale = 2)
    private BigDecimal loadingFee;
    @Column(precision = 10, scale = 2)
    private BigDecimal holidayFee;
    @Column(precision = 10, scale = 2)
    private BigDecimal nightFee;
    @Column(precision = 10, scale = 2)
    private BigDecimal addingStopLocationFee;
    @Column(precision = 10, scale = 2)
    private BigDecimal waitingTimeFee;
    @Column(precision = 10, scale = 2)
    private BigDecimal tolls;
    @Column(precision = 10)
    private BigDecimal createdUser;
    private LocalDateTime createdDate;
    @Column(precision = 10)
    private BigDecimal updatedUser;
    private LocalDateTime updatedDate;
    @Column(precision = 10)
    private BigDecimal deletedUser;
    private LocalDateTime deletedDate;
    private String updateNote;
    @Column(length = 1)
    private boolean isLast;
    @OneToMany(mappedBy = "servicePrice")
    @JsonIgnore
    private Set<FeeByTransportForm> feeByTransportForm;
    @OneToMany(mappedBy = "servicePrice")
    @JsonIgnore
    private Set<Feeonkilometers> feeonkilometers;
    @ManyToOne(optional = false)
    @JoinColumn(name = "vehicleAgreementId", nullable = false)
    private VehicleAgreement vehicleAgreement;
    @ManyToOne(optional = false)
    @JoinColumn(name = "vehicleTypeId", nullable = false)
    private Vehicletype vehicletype;

    /** Default constructor. */
    public ServicePrice() {
        super();
    }

    /**
     * Access method for servicePriceId.
     *
     * @return the current value of servicePriceId
     */
    public BigDecimal getServicePriceId() {
        return servicePriceId;
    }

    /**
     * Setter method for servicePriceId.
     *
     * @param aServicePriceId the new value for servicePriceId
     */
    public void setServicePriceId(BigDecimal aServicePriceId) {
        servicePriceId = aServicePriceId;
    }

    /**
     * Access method for beginLocation.
     *
     * @return the current value of beginLocation
     */
    public BigDecimal getBeginLocation() {
        return beginLocation;
    }

    /**
     * Setter method for beginLocation.
     *
     * @param aBeginLocation the new value for beginLocation
     */
    public void setBeginLocation(BigDecimal aBeginLocation) {
        beginLocation = aBeginLocation;
    }

    /**
     * Access method for endLocation.
     *
     * @return the current value of endLocation
     */
    public BigDecimal getEndLocation() {
        return endLocation;
    }

    /**
     * Setter method for endLocation.
     *
     * @param aEndLocation the new value for endLocation
     */
    public void setEndLocation(BigDecimal aEndLocation) {
        endLocation = aEndLocation;
    }

    /**
     * Access method for moq.
     *
     * @return the current value of moq
     */
    public BigDecimal getMoq() {
        return moq;
    }

    /**
     * Setter method for moq.
     *
     * @param aMoq the new value for moq
     */
    public void setMoq(BigDecimal aMoq) {
        moq = aMoq;
    }

    /**
     * Access method for costOfDay.
     *
     * @return the current value of costOfDay
     */
    public BigDecimal getCostOfDay() {
        return costOfDay;
    }

    /**
     * Setter method for costOfDay.
     *
     * @param aCostOfDay the new value for costOfDay
     */
    public void setCostOfDay(BigDecimal aCostOfDay) {
        costOfDay = aCostOfDay;
    }

    /**
     * Access method for chargeType.
     *
     * @return the current value of chargeType
     */
    public BigDecimal getChargeType() {
        return chargeType;
    }

    /**
     * Setter method for chargeType.
     *
     * @param aChargeType the new value for chargeType
     */
    public void setChargeType(BigDecimal aChargeType) {
        chargeType = aChargeType;
    }

    /**
     * Access method for loadingFee.
     *
     * @return the current value of loadingFee
     */
    public BigDecimal getLoadingFee() {
        return loadingFee;
    }

    /**
     * Setter method for loadingFee.
     *
     * @param aLoadingFee the new value for loadingFee
     */
    public void setLoadingFee(BigDecimal aLoadingFee) {
        loadingFee = aLoadingFee;
    }

    /**
     * Access method for holidayFee.
     *
     * @return the current value of holidayFee
     */
    public BigDecimal getHolidayFee() {
        return holidayFee;
    }

    /**
     * Setter method for holidayFee.
     *
     * @param aHolidayFee the new value for holidayFee
     */
    public void setHolidayFee(BigDecimal aHolidayFee) {
        holidayFee = aHolidayFee;
    }

    /**
     * Access method for nightFee.
     *
     * @return the current value of nightFee
     */
    public BigDecimal getNightFee() {
        return nightFee;
    }

    /**
     * Setter method for nightFee.
     *
     * @param aNightFee the new value for nightFee
     */
    public void setNightFee(BigDecimal aNightFee) {
        nightFee = aNightFee;
    }

    /**
     * Access method for addingStopLocationFee.
     *
     * @return the current value of addingStopLocationFee
     */
    public BigDecimal getAddingStopLocationFee() {
        return addingStopLocationFee;
    }

    /**
     * Setter method for addingStopLocationFee.
     *
     * @param aAddingStopLocationFee the new value for addingStopLocationFee
     */
    public void setAddingStopLocationFee(BigDecimal aAddingStopLocationFee) {
        addingStopLocationFee = aAddingStopLocationFee;
    }

    /**
     * Access method for waitingTimeFee.
     *
     * @return the current value of waitingTimeFee
     */
    public BigDecimal getWaitingTimeFee() {
        return waitingTimeFee;
    }

    /**
     * Setter method for waitingTimeFee.
     *
     * @param aWaitingTimeFee the new value for waitingTimeFee
     */
    public void setWaitingTimeFee(BigDecimal aWaitingTimeFee) {
        waitingTimeFee = aWaitingTimeFee;
    }

    /**
     * Access method for tolls.
     *
     * @return the current value of tolls
     */
    public BigDecimal getTolls() {
        return tolls;
    }

    /**
     * Setter method for tolls.
     *
     * @param aTolls the new value for tolls
     */
    public void setTolls(BigDecimal aTolls) {
        tolls = aTolls;
    }

    /**
     * Access method for createdUser.
     *
     * @return the current value of createdUser
     */
    public BigDecimal getCreatedUser() {
        return createdUser;
    }

    /**
     * Setter method for createdUser.
     *
     * @param aCreatedUser the new value for createdUser
     */
    public void setCreatedUser(BigDecimal aCreatedUser) {
        createdUser = aCreatedUser;
    }

    /**
     * Access method for createdDate.
     *
     * @return the current value of createdDate
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter method for createdDate.
     *
     * @param aCreatedDate the new value for createdDate
     */
    public void setCreatedDate(LocalDateTime aCreatedDate) {
        createdDate = aCreatedDate;
    }

    /**
     * Access method for updatedUser.
     *
     * @return the current value of updatedUser
     */
    public BigDecimal getUpdatedUser() {
        return updatedUser;
    }

    /**
     * Setter method for updatedUser.
     *
     * @param aUpdatedUser the new value for updatedUser
     */
    public void setUpdatedUser(BigDecimal aUpdatedUser) {
        updatedUser = aUpdatedUser;
    }

    /**
     * Access method for updatedDate.
     *
     * @return the current value of updatedDate
     */
    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Setter method for updatedDate.
     *
     * @param aUpdatedDate the new value for updatedDate
     */
    public void setUpdatedDate(LocalDateTime aUpdatedDate) {
        updatedDate = aUpdatedDate;
    }

    /**
     * Access method for deletedUser.
     *
     * @return the current value of deletedUser
     */
    public BigDecimal getDeletedUser() {
        return deletedUser;
    }

    /**
     * Setter method for deletedUser.
     *
     * @param aDeletedUser the new value for deletedUser
     */
    public void setDeletedUser(BigDecimal aDeletedUser) {
        deletedUser = aDeletedUser;
    }

    /**
     * Access method for deletedDate.
     *
     * @return the current value of deletedDate
     */
    public LocalDateTime getDeletedDate() {
        return deletedDate;
    }

    /**
     * Setter method for deletedDate.
     *
     * @param aDeletedDate the new value for deletedDate
     */
    public void setDeletedDate(LocalDateTime aDeletedDate) {
        deletedDate = aDeletedDate;
    }

    /**
     * Access method for updateNote.
     *
     * @return the current value of updateNote
     */
    public String getUpdateNote() {
        return updateNote;
    }

    /**
     * Setter method for updateNote.
     *
     * @param aUpdateNote the new value for updateNote
     */
    public void setUpdateNote(String aUpdateNote) {
        updateNote = aUpdateNote;
    }

    /**
     * Access method for isLast.
     *
     * @return true if and only if isLast is currently true
     */
    public boolean getIsLast() {
        return isLast;
    }

    /**
     * Setter method for isLast.
     *
     * @param aIsLast the new value for isLast
     */
    public void setIsLast(boolean aIsLast) {
        isLast = aIsLast;
    }

    /**
     * Access method for feeByTransportForm.
     *
     * @return the current value of feeByTransportForm
     */
    public Set<FeeByTransportForm> getFeeByTransportForm() {
        return feeByTransportForm;
    }

    /**
     * Setter method for feeByTransportForm.
     *
     * @param aFeeByTransportForm the new value for feeByTransportForm
     */
    public void setFeeByTransportForm(Set<FeeByTransportForm> aFeeByTransportForm) {
        feeByTransportForm = aFeeByTransportForm;
    }

    /**
     * Access method for feeonkilometers.
     *
     * @return the current value of feeonkilometers
     */
    public Set<Feeonkilometers> getFeeonkilometers() {
        return feeonkilometers;
    }

    /**
     * Setter method for feeonkilometers.
     *
     * @param aFeeonkilometers the new value for feeonkilometers
     */
    public void setFeeonkilometers(Set<Feeonkilometers> aFeeonkilometers) {
        feeonkilometers = aFeeonkilometers;
    }

    /**
     * Access method for vehicleAgreement.
     *
     * @return the current value of vehicleAgreement
     */
    public VehicleAgreement getVehicleAgreement() {
        return vehicleAgreement;
    }

    /**
     * Setter method for vehicleAgreement.
     *
     * @param aVehicleAgreement the new value for vehicleAgreement
     */
    public void setVehicleAgreement(VehicleAgreement aVehicleAgreement) {
        vehicleAgreement = aVehicleAgreement;
    }

    /**
     * Access method for vehicletype.
     *
     * @return the current value of vehicletype
     */
    public Vehicletype getVehicletype() {
        return vehicletype;
    }

    /**
     * Setter method for vehicletype.
     *
     * @param aVehicletype the new value for vehicletype
     */
    public void setVehicletype(Vehicletype aVehicletype) {
        vehicletype = aVehicletype;
    }

    /**
     * Compares the key for this instance with another ServicePrice.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ServicePrice and the key
     *         objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicePrice)) {
            return false;
        }
        ServicePrice that = (ServicePrice) other;
        Object myServicePriceId = this.getServicePriceId();
        Object yourServicePriceId = that.getServicePriceId();
        if (myServicePriceId == null ? yourServicePriceId != null : !myServicePriceId.equals(yourServicePriceId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ServicePrice.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ServicePrice))
            return false;
        return this.equalKeys(other) && ((ServicePrice) other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getServicePriceId() == null) {
            i = 0;
        } else {
            i = getServicePriceId().hashCode();
        }
        result = 37 * result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[ServicePrice |");
        sb.append(" servicePriceId=").append(getServicePriceId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("servicePriceId", getServicePriceId());
        return ret;
    }

}
