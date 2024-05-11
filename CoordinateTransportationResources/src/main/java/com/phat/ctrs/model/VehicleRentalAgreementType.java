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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity(name = "VEHICLE_RENTAL_AGREEMENT_TYPE")
public class VehicleRentalAgreementType implements Serializable {

    /** Primary key. */
    protected static final String PK = "vehicleRentalAgreementTypeId";

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
    private BigDecimal vehicleRentalAgreementTypeId;
    private String vehicleRentalAgreementTypeName;
    @Column(length = 1)
    private boolean isActive;
    @OneToMany(mappedBy = "vehicleRentalAgreementType")
    @JsonIgnore
    private Set<VehicleAgreement> vehicleAgreement;

    /** Default constructor. */
    public VehicleRentalAgreementType() {
        super();
    }

    /**
     * Access method for vehicleRentalAgreementTypeId.
     *
     * @return the current value of vehicleRentalAgreementTypeId
     */
    public BigDecimal getVehicleRentalAgreementTypeId() {
        return vehicleRentalAgreementTypeId;
    }

    /**
     * Setter method for vehicleRentalAgreementTypeId.
     *
     * @param aVehicleRentalAgreementTypeId the new value for
     *                                      vehicleRentalAgreementTypeId
     */
    public void setVehicleRentalAgreementTypeId(BigDecimal aVehicleRentalAgreementTypeId) {
        vehicleRentalAgreementTypeId = aVehicleRentalAgreementTypeId;
    }

    /**
     * Access method for vehicleRentalAgreementTypeName.
     *
     * @return the current value of vehicleRentalAgreementTypeName
     */
    public String getVehicleRentalAgreementTypeName() {
        return vehicleRentalAgreementTypeName;
    }

    /**
     * Setter method for vehicleRentalAgreementTypeName.
     *
     * @param aVehicleRentalAgreementTypeName the new value for
     *                                        vehicleRentalAgreementTypeName
     */
    public void setVehicleRentalAgreementTypeName(String aVehicleRentalAgreementTypeName) {
        vehicleRentalAgreementTypeName = aVehicleRentalAgreementTypeName;
    }

    /**
     * Access method for isActive.
     *
     * @return true if and only if isActive is currently true
     */
    public boolean getIsActive() {
        return isActive;
    }

    /**
     * Setter method for isActive.
     *
     * @param aIsActive the new value for isActive
     */
    public void setIsActive(boolean aIsActive) {
        isActive = aIsActive;
    }

    /**
     * Access method for vehicleAgreement.
     *
     * @return the current value of vehicleAgreement
     */
    public Set<VehicleAgreement> getVehicleAgreement() {
        return vehicleAgreement;
    }

    /**
     * Setter method for vehicleAgreement.
     *
     * @param aVehicleAgreement the new value for vehicleAgreement
     */
    public void setVehicleAgreement(Set<VehicleAgreement> aVehicleAgreement) {
        vehicleAgreement = aVehicleAgreement;
    }

    /**
     * Compares the key for this instance with another VehicleRentalAgreementType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VehicleRentalAgreementType
     *         and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleRentalAgreementType)) {
            return false;
        }
        VehicleRentalAgreementType that = (VehicleRentalAgreementType) other;
        Object myVehicleRentalAgreementTypeId = this.getVehicleRentalAgreementTypeId();
        Object yourVehicleRentalAgreementTypeId = that.getVehicleRentalAgreementTypeId();
        if (myVehicleRentalAgreementTypeId == null ? yourVehicleRentalAgreementTypeId != null
                : !myVehicleRentalAgreementTypeId.equals(yourVehicleRentalAgreementTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VehicleRentalAgreementType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VehicleRentalAgreementType))
            return false;
        return this.equalKeys(other) && ((VehicleRentalAgreementType) other).equalKeys(this);
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
        if (getVehicleRentalAgreementTypeId() == null) {
            i = 0;
        } else {
            i = getVehicleRentalAgreementTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[VehicleRentalAgreementType |");
        sb.append(" vehicleRentalAgreementTypeId=").append(getVehicleRentalAgreementTypeId());
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
        ret.put("vehicleRentalAgreementTypeId", getVehicleRentalAgreementTypeId());
        return ret;
    }

}
