// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Entity(name = "VEHICLE")
public class Vehicle implements Serializable {

    /** Primary key. */
    protected static final String PK = "vehicleId";

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
    private BigDecimal vehicleId;
    private String vehicleName;
    private String licensePlates;
    @OneToMany(mappedBy = "vehicle")
    @JsonIgnore
    private Set<VehicleLoadInDay> vehicleLoadInDay;
    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;
    @ManyToOne(optional = false)
    @JoinColumn(name = "vehicleTypeId", nullable = false)
    private Vehicletype vehicletype;

    /** Default constructor. */
    public Vehicle() {
        super();
    }

    /**
     * Access method for vehicleId.
     *
     * @return the current value of vehicleId
     */
    public BigDecimal getVehicleId() {
        return vehicleId;
    }

    /**
     * Setter method for vehicleId.
     *
     * @param aVehicleId the new value for vehicleId
     */
    public void setVehicleId(BigDecimal aVehicleId) {
        vehicleId = aVehicleId;
    }

    /**
     * Access method for vehicleName.
     *
     * @return the current value of vehicleName
     */
    public String getVehicleName() {
        return vehicleName;
    }

    /**
     * Setter method for vehicleName.
     *
     * @param aVehicleName the new value for vehicleName
     */
    public void setVehicleName(String aVehicleName) {
        vehicleName = aVehicleName;
    }

    /**
     * Access method for licensePlates.
     *
     * @return the current value of licensePlates
     */
    public String getLicensePlates() {
        return licensePlates;
    }

    /**
     * Setter method for licensePlates.
     *
     * @param aLicensePlates the new value for licensePlates
     */
    public void setLicensePlates(String aLicensePlates) {
        licensePlates = aLicensePlates;
    }

    /**
     * Access method for vehicleLoadInDay.
     *
     * @return the current value of vehicleLoadInDay
     */
    public Set<VehicleLoadInDay> getVehicleLoadInDay() {
        return vehicleLoadInDay;
    }

    /**
     * Setter method for vehicleLoadInDay.
     *
     * @param aVehicleLoadInDay the new value for vehicleLoadInDay
     */
    public void setVehicleLoadInDay(Set<VehicleLoadInDay> aVehicleLoadInDay) {
        vehicleLoadInDay = aVehicleLoadInDay;
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
     * Compares the key for this instance with another Vehicle.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Vehicle and the key objects
     *         are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vehicle)) {
            return false;
        }
        Vehicle that = (Vehicle) other;
        Object myVehicleId = this.getVehicleId();
        Object yourVehicleId = that.getVehicleId();
        if (myVehicleId == null ? yourVehicleId != null : !myVehicleId.equals(yourVehicleId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Vehicle.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Vehicle))
            return false;
        return this.equalKeys(other) && ((Vehicle) other).equalKeys(this);
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
        if (getVehicleId() == null) {
            i = 0;
        } else {
            i = getVehicleId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Vehicle |");
        sb.append(" vehicleId=").append(getVehicleId());
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
        ret.put("vehicleId", getVehicleId());
        return ret;
    }

    public static String getPk() {
        return PK;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
