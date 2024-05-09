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

@Entity(name = "CARRIERTYPE")
public class Carriertype implements Serializable {

    /** Primary key. */
    protected static final String PK = "carrierTypeId";

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
    private BigDecimal carrierTypeId;
    private String carrierName;
    @OneToMany(mappedBy = "carriertype")
    @JsonIgnore
    private Set<CurrentDebt> currentDebt;
    @OneToMany(mappedBy = "carriertype")
    @JsonIgnore
    private Set<DebtDetail> debtDetail;
    @OneToMany(mappedBy = "carriertype")
    @JsonIgnore
    private Set<LimitDebt> limitDebt;
    @OneToMany(mappedBy = "carriertype")
    @JsonIgnore
    private Set<Vehicletype> vehicletype;

    /** Default constructor. */
    public Carriertype() {
        super();
    }

    /**
     * Access method for carrierTypeId.
     *
     * @return the current value of carrierTypeId
     */
    public BigDecimal getCarrierTypeId() {
        return carrierTypeId;
    }

    /**
     * Setter method for carrierTypeId.
     *
     * @param aCarrierTypeId the new value for carrierTypeId
     */
    public void setCarrierTypeId(BigDecimal aCarrierTypeId) {
        carrierTypeId = aCarrierTypeId;
    }

    /**
     * Access method for carrierName.
     *
     * @return the current value of carrierName
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Setter method for carrierName.
     *
     * @param aCarrierName the new value for carrierName
     */
    public void setCarrierName(String aCarrierName) {
        carrierName = aCarrierName;
    }

    /**
     * Access method for currentDebt.
     *
     * @return the current value of currentDebt
     */
    public Set<CurrentDebt> getCurrentDebt() {
        return currentDebt;
    }

    /**
     * Setter method for currentDebt.
     *
     * @param aCurrentDebt the new value for currentDebt
     */
    public void setCurrentDebt(Set<CurrentDebt> aCurrentDebt) {
        currentDebt = aCurrentDebt;
    }

    /**
     * Access method for debtDetail.
     *
     * @return the current value of debtDetail
     */
    public Set<DebtDetail> getDebtDetail() {
        return debtDetail;
    }

    /**
     * Setter method for debtDetail.
     *
     * @param aDebtDetail the new value for debtDetail
     */
    public void setDebtDetail(Set<DebtDetail> aDebtDetail) {
        debtDetail = aDebtDetail;
    }

    /**
     * Access method for limitDebt.
     *
     * @return the current value of limitDebt
     */
    public Set<LimitDebt> getLimitDebt() {
        return limitDebt;
    }

    /**
     * Setter method for limitDebt.
     *
     * @param aLimitDebt the new value for limitDebt
     */
    public void setLimitDebt(Set<LimitDebt> aLimitDebt) {
        limitDebt = aLimitDebt;
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
     * Compares the key for this instance with another Carriertype.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Carriertype and the key
     *         objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Carriertype)) {
            return false;
        }
        Carriertype that = (Carriertype) other;
        Object myCarrierTypeId = this.getCarrierTypeId();
        Object yourCarrierTypeId = that.getCarrierTypeId();
        if (myCarrierTypeId == null ? yourCarrierTypeId != null : !myCarrierTypeId.equals(yourCarrierTypeId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Carriertype.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Carriertype))
            return false;
        return this.equalKeys(other) && ((Carriertype) other).equalKeys(this);
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
        if (getCarrierTypeId() == null) {
            i = 0;
        } else {
            i = getCarrierTypeId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Carriertype |");
        sb.append(" carrierTypeId=").append(getCarrierTypeId());
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
    //     ret.put("carrierTypeId", getCarrierTypeId());
    //     return ret;
    // }

}
