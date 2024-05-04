// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity(name="FEE_BY_BOOKING_DAY")
@IdClass(FeeByBookingDay.FeeByBookingDayId.class)
public class FeeByBookingDay implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class FeeByBookingDayId implements Serializable {
        VehicleAgreement vehicleAgreement;
        Vehicletype vehicletype;
    }

    /** Primary key. */
    protected static final String PK = "FeeByBookingDayFeeByBookingDayPkey";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
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

    @Column(precision=10, scale=2)
    private BigDecimal cost;
    @Column(precision=10)
    private BigDecimal createdUser;
    private LocalDateTime createdDate;
    @Column(precision=10)
    private BigDecimal updatedUser;
    private LocalDateTime updatedDate;
    @Column(precision=10)
    private BigDecimal deletedUser;
    private LocalDateTime deletedDate;
    private String updateNote;
    @Column(length=1)
    private boolean isLast;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="vehicleAgreementId", nullable=false)
    private VehicleAgreement vehicleAgreement;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="vehicleTypeId", nullable=false)
    private Vehicletype vehicletype;

    /** Default constructor. */
    public FeeByBookingDay() {
        super();
    }

    /**
     * Access method for cost.
     *
     * @return the current value of cost
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Setter method for cost.
     *
     * @param aCost the new value for cost
     */
    public void setCost(BigDecimal aCost) {
        cost = aCost;
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

    /** Temporary value holder for group key fragment vehicleAgreementVehicleAgreementId */
    private transient BigDecimal tempVehicleAgreementVehicleAgreementId;

    /**
     * Gets the key fragment vehicleAgreementId for member vehicleAgreement.
     * If this.vehicleAgreement is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setVehicleAgreementVehicleAgreementId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see VehicleAgreement
     */
    public BigDecimal getVehicleAgreementVehicleAgreementId() {
        return (getVehicleAgreement() == null ? tempVehicleAgreementVehicleAgreementId : getVehicleAgreement().getVehicleAgreementId());
    }

    /**
     * Sets the key fragment vehicleAgreementId from member vehicleAgreement.
     * If this.vehicleAgreement is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getVehicleAgreementVehicleAgreementId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aVehicleAgreementId New value for the key fragment
     * @see VehicleAgreement
     */
    public void setVehicleAgreementVehicleAgreementId(BigDecimal aVehicleAgreementId) {
        if (getVehicleAgreement() == null) {
            tempVehicleAgreementVehicleAgreementId = aVehicleAgreementId;
        } else {
            getVehicleAgreement().setVehicleAgreementId(aVehicleAgreementId);
        }
    }

    /** Temporary value holder for group key fragment vehicletypeVehicleTypeId */
    private transient BigDecimal tempVehicletypeVehicleTypeId;

    /**
     * Gets the key fragment vehicleTypeId for member vehicletype.
     * If this.vehicletype is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setVehicletypeVehicleTypeId.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Vehicletype
     */
    public BigDecimal getVehicletypeVehicleTypeId() {
        return (getVehicletype() == null ? tempVehicletypeVehicleTypeId : getVehicletype().getVehicleTypeId());
    }

    /**
     * Sets the key fragment vehicleTypeId from member vehicletype.
     * If this.vehicletype is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getVehicletypeVehicleTypeId.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aVehicleTypeId New value for the key fragment
     * @see Vehicletype
     */
    public void setVehicletypeVehicleTypeId(BigDecimal aVehicleTypeId) {
        if (getVehicletype() == null) {
            tempVehicletypeVehicleTypeId = aVehicleTypeId;
        } else {
            getVehicletype().setVehicleTypeId(aVehicleTypeId);
        }
    }

    /**
     * Compares the key for this instance with another FeeByBookingDay.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class FeeByBookingDay and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof FeeByBookingDay)) {
            return false;
        }
        FeeByBookingDay that = (FeeByBookingDay) other;
        Object myVehicleAgreementVehicleAgreementId = this.getVehicleAgreementVehicleAgreementId();
        Object yourVehicleAgreementVehicleAgreementId = that.getVehicleAgreementVehicleAgreementId();
        if (myVehicleAgreementVehicleAgreementId==null ? yourVehicleAgreementVehicleAgreementId!=null : !myVehicleAgreementVehicleAgreementId.equals(yourVehicleAgreementVehicleAgreementId)) {
            return false;
        }
        Object myVehicletypeVehicleTypeId = this.getVehicletypeVehicleTypeId();
        Object yourVehicletypeVehicleTypeId = that.getVehicletypeVehicleTypeId();
        if (myVehicletypeVehicleTypeId==null ? yourVehicletypeVehicleTypeId!=null : !myVehicletypeVehicleTypeId.equals(yourVehicletypeVehicleTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another FeeByBookingDay.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FeeByBookingDay)) return false;
        return this.equalKeys(other) && ((FeeByBookingDay)other).equalKeys(this);
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
        if (getVehicleAgreementVehicleAgreementId() == null) {
            i = 0;
        } else {
            i = getVehicleAgreementVehicleAgreementId().hashCode();
        }
        result = 37*result + i;
        if (getVehicletypeVehicleTypeId() == null) {
            i = 0;
        } else {
            i = getVehicletypeVehicleTypeId().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[FeeByBookingDay |");
        sb.append(" vehicleAgreementVehicleAgreementId=").append(getVehicleAgreementVehicleAgreementId());
        sb.append(" vehicletypeVehicleTypeId=").append(getVehicletypeVehicleTypeId());
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
        ret.put("vehicleAgreementVehicleAgreementId", getVehicleAgreementVehicleAgreementId());
        ret.put("vehicletypeVehicleTypeId", getVehicletypeVehicleTypeId());
        return ret;
    }

}
