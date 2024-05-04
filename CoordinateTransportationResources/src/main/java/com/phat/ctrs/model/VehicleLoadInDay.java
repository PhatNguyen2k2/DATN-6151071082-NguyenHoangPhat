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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;

@Entity(name="VEHICLE_LOAD_IN_DAY")
public class VehicleLoadInDay implements Serializable {

    /** Primary key. */
    protected static final String PK = "vehicleLoadInDayId";

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

    @Id
    @Column(unique=true, nullable=false, precision=10)
    private BigDecimal vehicleLoadInDayId;
    private String workingShift;
    @Column(length=1)
    private boolean vehicleLoad;
    private LocalDateTime day;
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
    @JoinColumn(name="vehicleId", nullable=false)
    private Vehicle vehicle;

    /** Default constructor. */
    public VehicleLoadInDay() {
        super();
    }

    /**
     * Access method for vehicleLoadInDayId.
     *
     * @return the current value of vehicleLoadInDayId
     */
    public BigDecimal getVehicleLoadInDayId() {
        return vehicleLoadInDayId;
    }

    /**
     * Setter method for vehicleLoadInDayId.
     *
     * @param aVehicleLoadInDayId the new value for vehicleLoadInDayId
     */
    public void setVehicleLoadInDayId(BigDecimal aVehicleLoadInDayId) {
        vehicleLoadInDayId = aVehicleLoadInDayId;
    }

    /**
     * Access method for workingShift.
     *
     * @return the current value of workingShift
     */
    public String getWorkingShift() {
        return workingShift;
    }

    /**
     * Setter method for workingShift.
     *
     * @param aWorkingShift the new value for workingShift
     */
    public void setWorkingShift(String aWorkingShift) {
        workingShift = aWorkingShift;
    }

    /**
     * Access method for vehicleLoad.
     *
     * @return true if and only if vehicleLoad is currently true
     */
    public boolean getVehicleLoad() {
        return vehicleLoad;
    }

    /**
     * Setter method for vehicleLoad.
     *
     * @param aVehicleLoad the new value for vehicleLoad
     */
    public void setVehicleLoad(boolean aVehicleLoad) {
        vehicleLoad = aVehicleLoad;
    }

    /**
     * Access method for day.
     *
     * @return the current value of day
     */
    public LocalDateTime getDay() {
        return day;
    }

    /**
     * Setter method for day.
     *
     * @param aDay the new value for day
     */
    public void setDay(LocalDateTime aDay) {
        day = aDay;
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
     * Access method for vehicle.
     *
     * @return the current value of vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Setter method for vehicle.
     *
     * @param aVehicle the new value for vehicle
     */
    public void setVehicle(Vehicle aVehicle) {
        vehicle = aVehicle;
    }

    /**
     * Compares the key for this instance with another VehicleLoadInDay.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VehicleLoadInDay and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VehicleLoadInDay)) {
            return false;
        }
        VehicleLoadInDay that = (VehicleLoadInDay) other;
        Object myVehicleLoadInDayId = this.getVehicleLoadInDayId();
        Object yourVehicleLoadInDayId = that.getVehicleLoadInDayId();
        if (myVehicleLoadInDayId==null ? yourVehicleLoadInDayId!=null : !myVehicleLoadInDayId.equals(yourVehicleLoadInDayId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VehicleLoadInDay.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VehicleLoadInDay)) return false;
        return this.equalKeys(other) && ((VehicleLoadInDay)other).equalKeys(this);
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
        if (getVehicleLoadInDayId() == null) {
            i = 0;
        } else {
            i = getVehicleLoadInDayId().hashCode();
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
        StringBuffer sb = new StringBuffer("[VehicleLoadInDay |");
        sb.append(" vehicleLoadInDayId=").append(getVehicleLoadInDayId());
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
        ret.put("vehicleLoadInDayId", getVehicleLoadInDayId());
        return ret;
    }

}
