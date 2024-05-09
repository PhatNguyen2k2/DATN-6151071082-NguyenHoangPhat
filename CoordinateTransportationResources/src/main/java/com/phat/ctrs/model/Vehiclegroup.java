// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name = "VEHICLEGROUP")
public class Vehiclegroup implements Serializable {

    /** Primary key. */
    protected static final String PK = "vehicleGroupId";

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
    private BigDecimal vehicleGroupId;
    private String vehicleGroupName;
    @OneToMany(mappedBy = "vehiclegroup")
    @JsonIgnore
    private Set<Vehicletype> vehicletype;

    /** Default constructor. */
    public Vehiclegroup() {
        super();
    }

    /**
     * Access method for vehicleGroupId.
     *
     * @return the current value of vehicleGroupId
     */
    public BigDecimal getVehicleGroupId() {
        return vehicleGroupId;
    }

    /**
     * Setter method for vehicleGroupId.
     *
     * @param aVehicleGroupId the new value for vehicleGroupId
     */
    public void setVehicleGroupId(BigDecimal aVehicleGroupId) {
        vehicleGroupId = aVehicleGroupId;
    }

    /**
     * Access method for vehicleGroupName.
     *
     * @return the current value of vehicleGroupName
     */
    public String getVehicleGroupName() {
        return vehicleGroupName;
    }

    /**
     * Setter method for vehicleGroupName.
     *
     * @param aVehicleGroupName the new value for vehicleGroupName
     */
    public void setVehicleGroupName(String aVehicleGroupName) {
        vehicleGroupName = aVehicleGroupName;
    }

    /**
     * Access method for vehicletype.
     *
     * @return the current value of vehicletype
     */
    public Set<Vehicletype> getVehicletype() {
        return vehicletype;
    }

    /**
     * Setter method for vehicletype.
     *
     * @param aVehicletype the new value for vehicletype
     */
    public void setVehicletype(Set<Vehicletype> aVehicletype) {
        vehicletype = aVehicletype;
    }

    /**
     * Compares the key for this instance with another Vehiclegroup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Vehiclegroup and the key
     *         objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vehiclegroup)) {
            return false;
        }
        Vehiclegroup that = (Vehiclegroup) other;
        Object myVehicleGroupId = this.getVehicleGroupId();
        Object yourVehicleGroupId = that.getVehicleGroupId();
        if (myVehicleGroupId == null ? yourVehicleGroupId != null : !myVehicleGroupId.equals(yourVehicleGroupId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Vehiclegroup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Vehiclegroup))
            return false;
        return this.equalKeys(other) && ((Vehiclegroup) other).equalKeys(this);
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
        if (getVehicleGroupId() == null) {
            i = 0;
        } else {
            i = getVehicleGroupId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Vehiclegroup |");
        sb.append(" vehicleGroupId=").append(getVehicleGroupId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    // public Map<String, Object> getPrimaryKey() {
    //     Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
    //     ret.put("vehicleGroupId", getVehicleGroupId());
    //     return ret;
    // }

}
