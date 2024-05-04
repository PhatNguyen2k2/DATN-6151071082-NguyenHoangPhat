// Generated with g9.

package com.phat.ctrs.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="WARD")
public class Ward implements Serializable {

    /** Primary key. */
    protected static final String PK = "wardId";

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
    private BigDecimal wardId;
    private String wardName;
    @OneToMany(mappedBy="ward")
    @JsonIgnore
    private Set<Address> address;
    @ManyToOne(optional=false)
    @JoinColumn(name="districtId", nullable=false)
    private District district;

    /** Default constructor. */
    public Ward() {
        super();
    }

    /**
     * Access method for wardId.
     *
     * @return the current value of wardId
     */
    public BigDecimal getWardId() {
        return wardId;
    }

    /**
     * Setter method for wardId.
     *
     * @param aWardId the new value for wardId
     */
    public void setWardId(BigDecimal aWardId) {
        wardId = aWardId;
    }

    /**
     * Access method for wardName.
     *
     * @return the current value of wardName
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * Setter method for wardName.
     *
     * @param aWardName the new value for wardName
     */
    public void setWardName(String aWardName) {
        wardName = aWardName;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public Set<Address> getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(Set<Address> aAddress) {
        address = aAddress;
    }

    /**
     * Access method for district.
     *
     * @return the current value of district
     */
    public District getDistrict() {
        return district;
    }

    /**
     * Setter method for district.
     *
     * @param aDistrict the new value for district
     */
    public void setDistrict(District aDistrict) {
        district = aDistrict;
    }

    /**
     * Compares the key for this instance with another Ward.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Ward and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Ward)) {
            return false;
        }
        Ward that = (Ward) other;
        Object myWardId = this.getWardId();
        Object yourWardId = that.getWardId();
        if (myWardId==null ? yourWardId!=null : !myWardId.equals(yourWardId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Ward.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Ward)) return false;
        return this.equalKeys(other) && ((Ward)other).equalKeys(this);
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
        if (getWardId() == null) {
            i = 0;
        } else {
            i = getWardId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Ward |");
        sb.append(" wardId=").append(getWardId());
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
    //     ret.put("wardId", getWardId());
    //     return ret;
    // }

}
