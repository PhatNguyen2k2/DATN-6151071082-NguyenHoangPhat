// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name = "SHIFT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shift implements Serializable {

    /** Primary key. */
    protected static final String PK = "shiftId";

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
    private BigDecimal shiftId;
    private String shiftName;
    @Column(precision = 1)
    private BigDecimal shiftNumber;
    private LocalTime timeStart;
    private LocalTime timeEnd;
    @OneToMany(mappedBy = "shift")
    @JsonIgnore
    private Set<EmployeeLoad> employeeLoad;
    @OneToMany(mappedBy = "shift")
    @JsonIgnore
    private Set<EmployeeShift> employeeShift;
    @ManyToOne
    @JoinColumn(name = "storeId")
    private Store store;
    @OneToMany(mappedBy = "shift")
    @JsonIgnore
    private Set<VehicleLoadType> vehicleLoadType;

    /** Default constructor. */
    public Shift() {
        super();
    }

    /**
     * Access method for shiftId.
     *
     * @return the current value of shiftId
     */
    public BigDecimal getShiftId() {
        return shiftId;
    }

    /**
     * Setter method for shiftId.
     *
     * @param aShiftId the new value for shiftId
     */
    public void setShiftId(BigDecimal aShiftId) {
        shiftId = aShiftId;
    }

    /**
     * Access method for shiftName.
     *
     * @return the current value of shiftName
     */
    public String getShiftName() {
        return shiftName;
    }

    /**
     * Setter method for shiftName.
     *
     * @param aShiftName the new value for shiftName
     */
    public void setShiftName(String aShiftName) {
        shiftName = aShiftName;
    }

    /**
     * Access method for shiftNumber.
     *
     * @return the current value of shiftNumber
     */
    public BigDecimal getShiftNumber() {
        return shiftNumber;
    }

    /**
     * Setter method for shiftNumber.
     *
     * @param aShiftNumber the new value for shiftNumber
     */
    public void setShiftNumber(BigDecimal aShiftNumber) {
        shiftNumber = aShiftNumber;
    }

    /**
     * Access method for timeStart.
     *
     * @return the current value of timeStart
     */
    public LocalTime getTimeStart() {
        return timeStart;
    }

    /**
     * Setter method for timeStart.
     *
     * @param aTimeStart the new value for timeStart
     */
    public void setTimeStart(LocalTime aTimeStart) {
        timeStart = aTimeStart;
    }

    /**
     * Access method for timeEnd.
     *
     * @return the current value of timeEnd
     */
    public LocalTime getTimeEnd() {
        return timeEnd;
    }

    /**
     * Setter method for timeEnd.
     *
     * @param aTimeEnd the new value for timeEnd
     */
    public void setTimeEnd(LocalTime aTimeEnd) {
        timeEnd = aTimeEnd;
    }

    public Set<VehicleLoadType> getVehicleLoadType() {
        return vehicleLoadType;
    }

    public void setVehicleLoadType(Set<VehicleLoadType> vehicleLoadType) {
        this.vehicleLoadType = vehicleLoadType;
    }

    /**
     * Access method for employeeLoad.
     *
     * @return the current value of employeeLoad
     */
    public Set<EmployeeLoad> getEmployeeLoad() {
        return employeeLoad;
    }

    /**
     * Setter method for employeeLoad.
     *
     * @param aEmployeeLoad the new value for employeeLoad
     */
    public void setEmployeeLoad(Set<EmployeeLoad> aEmployeeLoad) {
        employeeLoad = aEmployeeLoad;
    }

    /**
     * Access method for employeeShift.
     *
     * @return the current value of employeeShift
     */
    public Set<EmployeeShift> getEmployeeShift() {
        return employeeShift;
    }

    /**
     * Setter method for employeeShift.
     *
     * @param aEmployeeShift the new value for employeeShift
     */
    public void setEmployeeShift(Set<EmployeeShift> aEmployeeShift) {
        employeeShift = aEmployeeShift;
    }

    /**
     * Access method for store.
     *
     * @return the current value of store
     */
    public Store getStore() {
        return store;
    }

    /**
     * Setter method for store.
     *
     * @param aStore the new value for store
     */
    public void setStore(Store aStore) {
        store = aStore;
    }

    /**
     * Compares the key for this instance with another Shift.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Shift and the key objects
     *         are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shift)) {
            return false;
        }
        Shift that = (Shift) other;
        Object myShiftId = this.getShiftId();
        Object yourShiftId = that.getShiftId();
        if (myShiftId == null ? yourShiftId != null : !myShiftId.equals(yourShiftId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Shift.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Shift))
            return false;
        return this.equalKeys(other) && ((Shift) other).equalKeys(this);
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
        if (getShiftId() == null) {
            i = 0;
        } else {
            i = getShiftId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Shift |");
        sb.append(" shiftId=").append(getShiftId());
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
        ret.put("shiftId", getShiftId());
        return ret;
    }

}
